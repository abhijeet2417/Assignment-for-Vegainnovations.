package com.globaltechpei.pc.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout parantlayout, layoutheader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtamount = findViewById(R.id.txtamount);
        Button btnsubmit = findViewById(R.id.btnsubmit);
        parantlayout = (LinearLayout) findViewById(R.id.parantlayout);
        layoutheader = (LinearLayout) findViewById(R.id.layoutheader);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strAmt = txtamount.getText().toString();
                if(!strAmt.trim().equals("")) {

                    parantlayout.removeAllViews();
                    if (strAmt.contains(".")) {
                        double number = Double.parseDouble(strAmt);
                        //  int numberTwo=Integer.parseInt(amtArray[1]);
                        int total = 0;
                        int r2000 = 0, r1000 = 0, r500 = 0, r200 = 0, r100 = 0, r50 = 0, r20 = 0, r10 = 0, r5 = 0, r1 = 0;
                        int p50 = 0, p25 = 0;
                        //int number=Integer.parseInt(amtOne);

                        while (number >= 2000) {
                            r2000 = (int) (number / 2000);
                            number = number % 2000;

                            if (r2000 > 0) {
                                total = total + r2000;
                                addRow("2000", r2000 + "");
                            }
                            break;

                        }

                        while (number >= 1000) {
                            r1000 = (int) (number / 1000);
                            number = number % 1000;

                            if (r1000 > 0) {
                                total = total + r1000;
                                addRow("1000", r1000 + "");
                            }

                            break;
                        }
                        while (number >= 500) {
                            r500 = (int) (number / 500);
                            number = number % 500;
                            if (r500 > 0) {
                                total = total + r500;
                                addRow("500", r500 + "");
                            }
                            break;
                        }
                        while (number >= 200) {
                            r200 = (int) (number / 200);
                            number = number % 200;
                            if (r200 > 0) {
                                total = total + r200;
                                addRow("200", r200 + "");
                            }
                            break;
                        }
                        while (number >= 100) {
                            r100 = (int) (number / 100);
                            number = number % 100;

                            if (r100 > 0) {
                                total = total + r100;
                                addRow("100", r100 + "");
                            }

                            break;
                        }
                        while (number >= 50) {
                            r50 = (int) (number / 50);
                            number = number % 50;
                            if (r50 > 0) {
                                total = total + r50;
                                addRow("50", r50 + "");
                            }

                            break;
                        }

                        while (number >= 20) {
                            r20 = (int) (number / 20);
                            number = number % 20;
                            if (r20 > 0) {
                                total = total + r2000;
                                addRow("20", r20 + "");
                            }

                            break;
                        }

                        while (number >= 10) {
                            r10 = (int) (number / 10);
                            number = number % 10;

                            if (r10 > 0) {
                                total = total + r10;
                                addRow("10", r10 + "");
                            }

                            break;
                        }
                        while (number >= 5) {
                            r5 = (int) (number / 5);
                            number = number % 5;

                            if (r5 > 0) {
                                total = total + r5;
                                addRow("5", r5 + "");
                            }

                            break;
                        }
                        while (number >= 1) {
                            r1 = (int) (number / 1);
                            number = number % 1;

                            if (r1 > 0) {
                                total = total + r1;
                                addRow("1", r1 + "");
                            }
                            break;
                        }


                        Log.i("number", "2000=" + r2000 + "\n1000=" + r1000 + "\n500=" + r500 + "\n200=" + r200 + "\n100=" + r100 + "\n50=" + r50 + "\n20=" + r20 + "\n10=" + r10 + "\n5=" + r5 + "\n1=" + r1);


                        while (number >= 0.50) {
                            p50 = (int) (number / 0.50);
                            number = number % 0.50;
                            if (p50 > 0) {
                                total = total + p50;
                                //addRow(0.500+"", p50+"");
                                addRow("0.50", p50 + "");
                            }

                            break;
                        }

                        while (number >= 0.25) {
                            p25 = (int) (number / 0.25);
                            number = number % 0.25;
                            if (p25 > 0) {
                                total = total + p25;
                                addRow("0.25", p25 + "");
                            }
                            break;
                        }
                        Log.i("number", "50=" + p50 + "\n25=" + p25);

                        addFooter(total, txtamount.getText().toString());
                        layoutheader.setVisibility(View.VISIBLE);

                    } else {


                        int total = 0;
                        int r2000 = 0, r1000 = 0, r500 = 0, r200 = 0, r100 = 0, r50 = 0, r20 = 0, r10 = 0, r5 = 0, r1 = 0;
                        int number = Integer.parseInt(strAmt);

                        while (number >= 2000) {
                            r2000 = number / 2000;
                            number = number % 2000;
                            if (r2000 > 0) {
                                total = total + r2000;
                                addRow("2000", r2000 + "");
                            }
                            break;
                        }

                        while (number >= 1000) {
                            r1000 = number / 1000;
                            number = number % 1000;
                            if (r1000 > 0) {
                                total = total + r1000;
                                addRow("1000", r1000 + "");
                            }
                            break;
                        }
                        while (number >= 500) {
                            r500 = number / 500;
                            number = number % 500;

                            if (r500 > 0) {
                                total = total + r500;
                                addRow("500", r500 + "");
                            }
                            break;
                        }
                        while (number >= 200) {
                            r200 = number / 200;
                            number = number % 200;

                            if (r200 > 0) {
                                total = total + r200;
                                addRow("200", r200 + "");
                            }

                            break;
                        }
                        while (number >= 100) {
                            r100 = number / 100;
                            number = number % 100;
                            if (r100 > 0) {
                                total = total + r100;
                                addRow("100", r100 + "");
                            }

                            break;
                        }
                        while (number >= 50) {
                            r50 = number / 50;
                            number = number % 50;

                            if (r50 > 0) {
                                total = total + r50;
                                addRow("50", r50 + "");
                            }

                            break;
                        }

                        while (number >= 20) {
                            r20 = number / 20;
                            number = number % 20;

                            if (r20 > 0) {
                                total = total + r20;
                                addRow("20", r20 + "");
                            }
                            break;
                        }

                        while (number >= 10) {
                            r10 = number / 10;
                            number = number % 10;
                            if (r10 > 0) {
                                total = total + r10;
                                addRow("10", r10 + "");
                            }
                            break;
                        }
                        while (number >= 5) {
                            r5 = number / 5;
                            number = number % 5;

                            if (r5 > 0) {
                                total = total + r5;
                                addRow("5", r5 + "");
                            }

                            break;
                        }
                        while (number >= 1) {
                            r1 = number / 1;
                            number = number % 1;

                            if (r1 > 0) {
                                total = total + r1;
                                addRow("1", r1 + "");
                            }

                            break;
                        }

                        addFooter(total, txtamount.getText().toString());
                        Log.i("number", "2000=" + r2000 + "\n1000=" + r1000 + "\n500=" + r500 + "\n200=" + r200 + "\n100=" + r100 + "\n50=" + r50 + "\n20=" + r20 + "\n10=" + r10 + "\n5=" + r5 + "\n1=" + r1);
                        layoutheader.setVisibility(View.VISIBLE);

                    }
                }else{
                    Toast.makeText(MainActivity.this,"Please enter amount",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    void addFooter(int total, String amount) {
        LinearLayout layout = new LinearLayout(MainActivity.this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout.setLayoutParams(params);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setWeightSum(7);
        layout.setPadding(5, 5, 5, 5);

        TextView txtrs = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtrsparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 3);
        txtrs.setLayoutParams(txtrsparams);
        txtrs.setGravity(Gravity.RIGHT);
        txtrs.setText("Total   ");


        TextView txtcount = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtcountparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 2);
        txtcount.setLayoutParams(txtcountparams);
        txtcount.setText(total + "");


        TextView txtCalculation = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtCalculationparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 2);
        txtCalculation.setLayoutParams(txtCalculationparams);
        txtCalculation.setText(amount);

        ImageView img = new ImageView(MainActivity.this);
        LinearLayout.LayoutParams imgparams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, 1);
        img.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        img.setLayoutParams(imgparams);

        layout.addView(txtrs);
        layout.addView(txtcount);
        layout.addView(txtCalculation);
        parantlayout.addView(layout);
        parantlayout.addView(img);
    }

    void addRow(String rs, String count) {
        LinearLayout layout = new LinearLayout(MainActivity.this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout.setLayoutParams(params);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setWeightSum(7);
        layout.setPadding(5, 5, 5, 5);

        TextView txtrs = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtrsparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 3);
        txtrs.setLayoutParams(txtrsparams);
        txtrs.setText("Rs." + rs);
        TextView txtcount = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtcountparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 2);
        txtcount.setLayoutParams(txtcountparams);
        txtcount.setText(count + "");

        TextView txtCalculation = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtCalculationparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 2);
        txtCalculation.setLayoutParams(txtCalculationparams);
        txtCalculation.setText(rs + " * " + count);

        ImageView img = new ImageView(MainActivity.this);
        LinearLayout.LayoutParams imgparams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, 1);
        img.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        img.setLayoutParams(imgparams);

        layout.addView(txtrs);
        layout.addView(txtcount);
        layout.addView(txtCalculation);
        parantlayout.addView(layout);
        parantlayout.addView(img);
    }

}
