package com.example.ajaygupta.ibhert;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static com.example.ajaygupta.ibhert.LoginActivity.welcome;

public class MainActivity extends Fragment {

    View view;
    private EditText username;
    private EditText password;
    private Button submit;
    public static final int CONNECTION_TIMEOUT=10000;
    public static final int READ_TIMEOUT=15000;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main,container,false);

        username = (EditText) view.findViewById(R.id.login_emailid);
        password = (EditText) view.findViewById(R.id.login_password);
        submit = (Button) view.findViewById(R.id.loginBtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = username.getText().toString();
                final String pwd = password.getText().toString();
                new AsyncLogin().execute(email,pwd);
            }
        });


        return view;
    }

    private class AsyncLogin extends AsyncTask<String,String,String>
    {
        ProgressDialog pdLoading = new ProgressDialog(getActivity());
        HttpURLConnection conn;
        URL url = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //this method will be running on UI thread
            pdLoading.setMessage("\tLoading...");
            pdLoading.setCancelable(false);
            pdLoading.show();

        }


        @Override
        protected String doInBackground(String... strings) {
            try {

                // Enter URL address where your php file resides
                url = new URL("http://qav2.cs.odu.edu/swaroop/ibhert_android/login.php");

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "exception";
            }


            try {
                // Setup HttpURLConnection class to send and receive data from php and mysql
                conn = (HttpURLConnection)url.openConnection();
                conn.setReadTimeout(READ_TIMEOUT);
                conn.setConnectTimeout(CONNECTION_TIMEOUT);
                conn.setRequestMethod("POST");

                // setDoInput and setDoOutput method depict handling of both send and receive
                conn.setDoInput(true);
                conn.setDoOutput(true);

                // Append parameters to URL
                Uri.Builder builder = new Uri.Builder()
                        .appendQueryParameter("username", strings[0])
                        .appendQueryParameter("password", strings[1]);
                String query = builder.build().getEncodedQuery();

                // Open connection for sending data
                OutputStream os = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(query);
                writer.flush();
                writer.close();
                os.close();
                conn.connect();

            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
                return "exception";
            }
            try {

                int response_code = conn.getResponseCode();

                // Check if successful connection made
                if (response_code == HttpURLConnection.HTTP_OK) {

                    // Read data sent from server
                    InputStream input = conn.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                    StringBuilder result = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }

                    // Pass data to onPostExecute method
                    return(result.toString());

                }else{

                    return("unsuccessful");
                }

            } catch (IOException e) {
                e.printStackTrace();
                return "exception";
            } finally {
                conn.disconnect();
            }
        }




        @Override
        protected void onPostExecute(String result) {

            //this method will be running on UI thread

            pdLoading.dismiss();
            Log.i("result",result);
            try {

                    JSONObject reader = new JSONObject(result);
                    if(reader.getString("data") == "No") {
                        Log.i("error", "No");
//                JSONObject data = reader.getJSONObject("0");

                    }else{
                        String fname = String.valueOf(reader.getString("firstname"));
                        String lname = String.valueOf(reader.getString("lastname"));
                        Log.i("name", String.valueOf(reader.getString("firstname")));
                        welcome.setText("Welcome "+fname+" "+lname);
                        Log.i("hello","hello");
// create a FragmentManager
                FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
                fragmentTransaction.replace(R.id.fragment, new Home());
                fragmentTransaction.commit(); // save the changes

                Log.i("success", "data transfer");


                    }


            } catch (JSONException e) {
                Toast.makeText(getActivity(), "Invalid email or password", Toast.LENGTH_LONG).show();
                Log.i("error", "No");
                e.printStackTrace();
            }

//
//            if(result.equalsIgnoreCase("true"))
//            {
//                /* Here launching another activity when login successful. If you persist login state
//                use sharedPreferences of Android. and logout button to clear sharedPreferences.
//                 */
//
//               Log.i("hello","hello");
//// create a FragmentManager
//                FragmentManager fm = getFragmentManager();
//// create a FragmentTransaction to begin the transaction and replace the Fragment
//                FragmentTransaction fragmentTransaction = fm.beginTransaction();
//// replace the FrameLayout with new Fragment
//                fragmentTransaction.replace(R.id.fragment, new Home());
//                fragmentTransaction.commit(); // save the changes
//
//                Log.i("success", "data transfer");
//
//            }else if (result.isEmpty()){
//
//                // If username and password does not match display a error message
//                Toast.makeText(getActivity(), "Invalid email or password", Toast.LENGTH_LONG).show();
//
//            } else if (result.equalsIgnoreCase("exception") || result.equalsIgnoreCase("unsuccessful")) {
//
//                Toast.makeText(getActivity(), "OOPs! Something went wrong. Connection Problem.", Toast.LENGTH_LONG).show();
//                Log.i("error", "no transfer");
//
//            }else{
//               Log.i ("No response","haha");
//            }
        }

    }
}
