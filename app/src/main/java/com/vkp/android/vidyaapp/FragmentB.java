package com.vkp.android.vidyaapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by HP on 11/15/2015.
 *
 */
public class FragmentB extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private EditText editText,editText3, editText4,editText6,editText7,editText8,editText9;

    private Button register;
    Spinner spinner;
    ArrayAdapter<String> yourAdapter;
    Context ctx;
 private String  name,phNum,emailId,address,tenP,twelveP,course;
  //  String subject="New registration";
    //String text="Name "+name+"Phone no.- "+phNum+"Email id- "+emailId+"Address- "+address+"10th%- "+tenP
      //      +"12%- "+twelveP+"Course- "+course;
    public FragmentB(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.fragment_b, container, false);
        ctx = container.getContext();

     //   Button btn = (Button)view.findViewById(R.id.register);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        editText= (EditText) getView().findViewById(R.id.editText);
        editText3= (EditText) getView().findViewById(R.id.editText3);
        editText4= (EditText) getView().findViewById(R.id.editText4);

        editText6= (EditText) getView().findViewById(R.id.editText6);
        editText7= (EditText) getView().findViewById(R.id.editText7);
        editText7.setFilters(new InputFilter[]{new InputFilterMinMax("1", "100")});
        editText8= (EditText) getView().findViewById(R.id.editText8);
        editText8.setFilters(new InputFilter[]{new InputFilterMinMax("1", "100")});
        spinner= (Spinner) getView().findViewById(R.id.spinner);
       // spinner.setAdapter(yourAdapter);
        //yourAdapter= new ArrayAdapter<String>(ctx,R.layout.spinner_item);

        ArrayAdapter adapter=ArrayAdapter.createFromResource(ctx, R.array.course, com.vkp.android.vidyaapp.R.layout.myspinner);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        register= (Button) getView().findViewById(R.id.register);
     //   EditText[] message={editText,editText3,editText4,editText6,editText7,editText8,editText9};


        register.setOnClickListener(this);
    }
    public void sendEmail() {

        // EditText[] subject={editText,editText3,editText4,editText6,editText7,editText8,editText9};


        String email = "appvidyait@gmail.com";
        String subject = "New registration";
        //String message="Name "+name+"Phone no.- "+phNum+"Email id- "+emailId+"Address- "+address+"10th%- "+tenP
        //      +"12%- "+twelveP+"Course- "+course;
        String nam = editText.getText().toString();
        if (nam.matches("")) {
            Toast.makeText(ctx, "Please enter your name", Toast.LENGTH_LONG).show();
            return;

        }
        String phNo = editText3.getText().toString();
        if (phNo.matches("")) {
            Toast.makeText(ctx, "Please enter your contact no.", Toast.LENGTH_LONG).show();
            return;
        }
         if(phNo.length()!=10){
            Toast.makeText(ctx,"Please enter a valid contact no.",Toast.LENGTH_LONG).show();
             return;

        }
    //    boolean digitsOnly = TextUtils.isDigitsOnly(editText3.getText());


        String mail = editText4.getText().toString().trim();
        String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if(mail.matches("")) {
            Toast.makeText(ctx, "Please enter your email-id", Toast.LENGTH_LONG).show();
            return;//
        }
        if(mail.matches(emailPattern)){

            }
        else{
            Toast.makeText(ctx, "Please enter a valid email-id", Toast.LENGTH_LONG).show();
            return;
        }

            String add = editText6.getText().toString();
            if(add.matches("")) {
                Toast.makeText(ctx, "Please enter your permanent address", Toast.LENGTH_LONG).show();
                return;
            }
                String tenPer = editText7.getText().toString();
        if(tenPer.matches("")) {
            Toast.makeText(ctx, "Please enter your percentage of class tenth", Toast.LENGTH_LONG).show();
            return;
        }
            String twelvePer = editText8.getText().toString();
        if(twelvePer.matches("")) {
            Toast.makeText(ctx, "Please enter your percentage of class twelvth", Toast.LENGTH_LONG).show();
            return;
        }
            String text=spinner.getSelectedItem().toString();
        if(text.matches("Courses-")){
            Toast.makeText(ctx, "Please enter the course in which you want to register yourself", Toast.LENGTH_LONG).show();
            return;
        }
        //ArrayAdapter<String> adapter= new ArrayAdapter(ctx,R.layout.spinner_item, Integer.parseInt(course));
        //adapter.setDropDownViewResource(R.layout.spinner_item);
        //spinner.setAdapter(adapter);


            String message = "Name " + nam + " Phone no.- " + phNo + " Email id- " + mail + " Address- " + add + " 10th%- " + tenPer
                    + " 12%- " + twelvePer + " Course- " + text;


            SendMail sm = new SendMail(ctx, email, subject, message);
            sm.execute();
        }


        @Override
        public void onClick (View v){
            sendEmail();
        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       // Toast.makeText(parent.getContext(),"On Item Select : \n"+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
       // String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
       // Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

        //  TextView myText= (TextView) view;
        //Toast.makeText(ctx,"You selected "+myText.getText(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}





