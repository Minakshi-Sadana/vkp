package com.vkp.android.vidyaapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//import android.os.Message;

/**
 * Created by HP on 3/19/2016.
 *///private EditText editText,editText3, editText4,editText6,editText7,editText8,editText9;
public class SendMail extends AsyncTask<Void,Void,Void>

    {
        private EditText editText,editText3, editText4,editText6,editText7,editText8,editText9;



        String email= "appvidyait@gmail.com";

        private Context context;
        private Session session;

        private String  name,phNum,emailId,address,tenP,twelveP,course;
        String subject="New registration";
       String text="Name "+name+"Phone no.- "+phNum+"Email id- "+emailId+"Address- "+address+"10th%- "+tenP
                +"12%- "+twelveP+"Course- "+course;

        private ProgressDialog progressDialog;

        public SendMail(Context context, String email, String subject, String message){
        this.context= context;
        this.email=email;
            this.subject=subject;
            this.text=message;
        }
        protected void onPreExecute(){
        super.onPreExecute();
        progressDialog=ProgressDialog.show(context,"Processing request","Please wait...",false,false);
    }

    protected void onPostExecute(Void aVoid){
        super.onPostExecute(aVoid);
        progressDialog.dismiss();
        Toast.makeText(context, "Registered successfully", Toast.LENGTH_LONG).show();
    }

    @Override
    protected Void doInBackground(Void... params) {
        Properties props=new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port","465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","465");

        session= Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {

                        return new javax.mail.PasswordAuthentication(Config.EMAIL, Config.PASSWORD);
                    }
                });

        try {
            MimeMessage mm=new MimeMessage(session);
            mm.setFrom(new InternetAddress(Config.EMAIL));
            mm.setRecipient(Message.RecipientType.TO, new InternetAddress("appvidyait@gmail.com"));
            mm.setSubject(subject);
            mm.setText(text);

            Transport.send(mm);

        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
