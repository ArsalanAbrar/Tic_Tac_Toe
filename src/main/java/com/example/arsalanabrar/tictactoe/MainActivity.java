package com.example.arsalanabrar.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int turn;
    int no_of_match,pl1,pl2=0;


    public void checkGame() {

        checkWinner(b1, b2, b3);

        checkWinner(b4, b5, b6);

        checkWinner(b7, b8, b9);

        checkWinner(b1, b4, b7);

        checkWinner(b2, b5, b8);

        checkWinner(b3, b6, b9);

        checkWinner(b1, b5, b9);

        checkWinner(b3, b5, b7);
    }


    public void checkWinner(Button b1, Button b2, Button b3) {

        if (b1.getText() == b2.getText().toString() && b2.getText().toString() == b3.getText().toString() && b3.getText().toString() == "X") {
            no_of_match++;
            pl1++;
            if (no_of_match==5){
                no_of_match=0;
                alert_dialog_box_match_stats();
            }
            Toast.makeText(MainActivity.this, "player 1 is winner ", Toast.LENGTH_LONG).show();
            final Timer timer = new Timer(); // This will create a new Thread
            timer .schedule(new TimerTask() { // task to be scheduled
                @Override
                public void run() {
                    timer.purge();
                    timer.cancel();
                    reset();
                }
            }, 500, 2000);
            }
            if (b1.getText() == b2.getText().toString() && b2.getText().toString() == b3.getText().toString() && b3.getText().toString() == "O") {
             no_of_match++;
             pl2++;
                if (no_of_match==5){
                    no_of_match=0;
                    alert_dialog_box_match_stats();
                }
                Toast.makeText(MainActivity.this, "player 2 is winner ", Toast.LENGTH_LONG).show();
            final Timer timer=new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    timer.purge();
                    timer.cancel();
                    reset();
                }
            },500,2000);

        }
    }

    public void reset() {

        turn = 1;

        b1.setText("");

        b2.setText("");

        b3.setText("");

        b4.setText("");

        b5.setText("");

        b6.setText("");

        b7.setText("");

        b8.setText("");

        b9.setText("");

    }

    @Override
    public void onBackPressed() {
       alert_dialog_box();
    }

    public void alert_dialog_box_match_stats(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);


        alertDialogBuilder.setMessage("              MATCH STATS : "+'\n'+ " Player 1 : "+pl1+'\n'+" Player 2 : "+pl2);
        alertDialogBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }



    public void alert_dialog_box(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure, You wanted to quit");
        alertDialogBuilder.setPositiveButton("yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        finish();
                    }
                });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.start);
    }

    public void start(View view){

        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button);

        b2=(Button) findViewById(R.id.button2);

        b3=(Button) findViewById(R.id.button3);

        b4=(Button) findViewById(R.id.button4);

        b5=(Button) findViewById(R.id.button5);

        b6=(Button) findViewById(R.id.button6);

        b7=(Button) findViewById(R.id.button7);

        b8=(Button) findViewById(R.id.button8);

        b9=(Button) findViewById(R.id.button9);

        turn=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")){
                    if (turn==1) {
                        b1.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b1.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")){
                    if (turn==1) {
                        b2.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b2.setText("O");
                        turn = 1;
                    }
                }
                checkGame();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")){
                    if (turn==1) {
                        b3.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b3.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
            }

        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")){
                    if (turn==1) {
                        b4.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b4.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")){
                    if (turn==1) {
                        b5.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b5.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        b6.setText("X");
                        turn = 2;
                    } else if (turn == 2) {
                        b6.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")){
                    if (turn==1) {
                        b7.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b7.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")){
                    if (turn==1) {
                        b8.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b8.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")){
                    if (turn==1) {
                        b9.setText("X");
                        turn = 2;
                    }

                    else if (turn==2) {
                        b9.setText("O");
                        turn = 1;
                    }
                }
                checkGame();
            }
        });
    }
}

