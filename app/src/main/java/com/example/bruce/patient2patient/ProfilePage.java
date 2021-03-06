package com.example.bruce.patient2patient;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProfilePage extends AppCompatActivity {

    private TextView mTextMessage, usernameTextView, treatmentTextView, clinicalTrialTextView,
            diagnosisTextView, locationTextView, ageTextView, genderTextView, hospitalTextView,
            descriptionTextView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        usernameTextView = (EditText) findViewById(R.id.profileUsername);
        treatmentTextView = (EditText) findViewById(R.id.profileTreatment);
        clinicalTrialTextView = (EditText) findViewById(R.id.profileClinicalTrial);
        locationTextView = (EditText) findViewById(R.id.profileLocation);
        ageTextView = (EditText) findViewById(R.id.profileAge);
        genderTextView = (EditText) findViewById(R.id.profileGender);
        //hospitalTextView = (EditText) findViewById(R.id.profileHospital);
        descriptionTextView = (EditText) findViewById(R.id.profileDescription);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Button prof = (Button) findViewById(R.id.home);
        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HomeActivity.class);
                startActivity(i);

            }
        });

        Button m = (Button) findViewById(R.id.match);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), ChatActivity.class);
                startActivity(i);
            }
        });
    }

    public void createAccount() {
        Person newPerson = new Person(usernameTextView.toString(), locationTextView.toString());

        if (treatmentTextView != null || !treatmentTextView.getText().equals("")) {
            newPerson.setTreatment(treatmentTextView.toString());
        }

        if (clinicalTrialTextView != null || !clinicalTrialTextView.getText().equals("")) {
            newPerson.setClinicalTrial(clinicalTrialTextView.toString());
        }

        if (ageTextView != null || !ageTextView.getText().equals("")) {
            newPerson.setAge(Integer.parseInt(ageTextView.toString()));
        }

        if (genderTextView != null || !genderTextView.getText().equals("")) {
            newPerson.setGender(genderTextView.toString());
        }

        if (hospitalTextView != null || !hospitalTextView.getText().equals("")) {
            newPerson.setHospital(hospitalTextView.toString());
        }

        if (descriptionTextView != null || !descriptionTextView.getText().equals("")) {
            newPerson.setDescription(descriptionTextView.toString());
        }
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("users/" + newPerson.getUsername());

        myRef.setValue(newPerson);

    }

}
