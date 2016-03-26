package com.humannature.www.gift;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;


public class MyDonation extends AppCompatActivity {
    int num= 0;
    int A=0, B=0, C=0, D=0, E=0, F=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_donation);

    }
    public void onClickDonate(View v){
        Intent i = new Intent(this, DonatingPage.class);
        this.startActivity(i);
    }

    public void choiceA(View view){
        Button CharityButton1 = (Button)findViewById(R.id.CharityButton1);
        if (A<=0){
            num++;
            A++;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
            CharityButton1.setBackgroundColor(getColor(R.color.Blue));
        }
        else{
            CharityButton1.setBackgroundResource(android.R.drawable.btn_default);
            num--;
            A--;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
        }
    }
    public void choiceB(View view){
        Button CharityButton1 = (Button)findViewById(R.id.CharityButton2);
        if (B<=0){
            num++;
            B++;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
            CharityButton1.setBackgroundColor(getColor(R.color.Blue));
        }
        else{
            CharityButton1.setBackgroundResource(android.R.drawable.btn_default);
            num--;
            B--;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
        }
    }
    public void choiceC(View view){
        Button CharityButton1 = (Button)findViewById(R.id.CharityButton3);
        if (C<=0){
            num++;
            C++;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
            CharityButton1.setBackgroundColor(getColor(R.color.Blue));
        }
        else{
            CharityButton1.setBackgroundResource(android.R.drawable.btn_default);
            num--;
            C--;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
        }
    }
    public void choiceD(View view){
        Button CharityButton1 = (Button)findViewById(R.id.CharityButton4);
        if (D<=0){
            num++;
            D++;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
            CharityButton1.setBackgroundColor(getColor(R.color.Blue));
        }
        else{
            CharityButton1.setBackgroundResource(android.R.drawable.btn_default);
            num--;
            D--;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
        }
    }
    public void choiceE(View view){
        Button CharityButton1 = (Button)findViewById(R.id.CharityButton5);
        if (E<=0){
            num++;
            E++;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
            CharityButton1.setBackgroundColor(getColor(R.color.Blue));
        }
        else{
            CharityButton1.setBackgroundResource(android.R.drawable.btn_default);
            num--;
            E--;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
        }
    }
    public void choiceF(View view){
        Button CharityButton1 = (Button)findViewById(R.id.CharityButton6);
        if (F<=0){
            num++;
            F++;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
            CharityButton1.setBackgroundColor(getColor(R.color.Blue));
        }
        else{
            CharityButton1.setBackgroundResource(android.R.drawable.btn_default);
            num--;
            F--;
            TextView selected = (TextView)findViewById(R.id.SelectedText);
            selected.setText("Selected "+num);
        }
    }
}
