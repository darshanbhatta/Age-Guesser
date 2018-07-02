package com.darshan.ageguesser;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.d, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // case R.id.action_settings:
            // User chose the "Settings" item, show the app settings UI...
            //    return true;

            case R.id.action_favorite:
                dialog();
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;
            case R.id.restart:
                Intent restart = new Intent(MainActivity.this, MainActivity.class);
                startActivity(restart);
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            case R.id.dev:
                Intent restart1 = new Intent(MainActivity.this, devInfo.class);
                startActivity(restart1);

                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        final int[] gameCounter = {0};

        SharedPreferences settings = getSharedPreferences("ez", MODE_PRIVATE);

        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = settings.edit();
        String value = settings.getString("key", "");
        if (value.equals("")) {
            dialog();
        } else {
            int number = (int) (Math.random() * 100);

            if (number <= 3) {

                dialog();
            }


        }
        editor.putString("key", "x");
        editor.commit();

        // Reading from SharedPreferences

        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-5667045213981762/4885228547");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        final ImageView turnCounter = (ImageView) findViewById(R.id.turncount);
        final Button yes = (Button) findViewById(R.id.yes);
        final Button no = (Button) findViewById(R.id.no);
        final Button yes1 = (Button) findViewById(R.id.yes1);
        final Button no1 = (Button) findViewById(R.id.no1);
        final Button yes2 = (Button) findViewById(R.id.yes2);
        final Button no2 = (Button) findViewById(R.id.no2);

        final Button yes4 = (Button) findViewById(R.id.yes4);
        final Button no4 = (Button) findViewById(R.id.no4);
        final Button yes5 = (Button) findViewById(R.id.yes5);
        final Button no5 = (Button) findViewById(R.id.no5);
        final Button yes6 = (Button) findViewById(R.id.yes6);
        final Button no6 = (Button) findViewById(R.id.no6);
        final Button yes7 = (Button) findViewById(R.id.yes7);
        final Button no7 = (Button) findViewById(R.id.no7);
        final Button yes8 = (Button) findViewById(R.id.yes8);
        final Button no8 = (Button) findViewById(R.id.no8);
        final Button yes9 = (Button) findViewById(R.id.yes9);
        final Button no9 = (Button) findViewById(R.id.no9);
        final Button yes10 = (Button) findViewById(R.id.yes10);
        final Button no10 = (Button) findViewById(R.id.no10);
        final Button yes11 = (Button) findViewById(R.id.yes11);
        final Button no11 = (Button) findViewById(R.id.no11);
        final Button yes12 = (Button) findViewById(R.id.yes12);
        final Button no12 = (Button) findViewById(R.id.no12);
        final Button yes13 = (Button) findViewById(R.id.yes13);
        final Button no13 = (Button) findViewById(R.id.no13);
        final TextView yourNum = (TextView) findViewById(R.id.yourNum);
        final boolean[] m = {false};

        final ArrayList<Integer> age = new ArrayList<Integer>();
        final ArrayList<Integer> ageOdd = new ArrayList<Integer>();
        final ArrayList<Integer> ageEven = new ArrayList<Integer>();
        final ArrayList<Integer> ageNull = new ArrayList<Integer>();
        final int[] ageTable = new int[50];


        final List<ImageView> allButtons = new ArrayList() {{
            add((ImageView) findViewById(R.id.imageView1));
            add((ImageView) findViewById(R.id.imageView2));
            add((ImageView) findViewById(R.id.imageView3));
            add((ImageView) findViewById(R.id.imageView4));
            add((ImageView) findViewById(R.id.imageView5));
            add((ImageView) findViewById(R.id.imageView6));
            add((ImageView) findViewById(R.id.imageView7));
            add((ImageView) findViewById(R.id.imageView8));
            add((ImageView) findViewById(R.id.imageView9));
            add((ImageView) findViewById(R.id.imageView10));
            add((ImageView) findViewById(R.id.imageView11));
            add((ImageView) findViewById(R.id.imageView12));
            add((ImageView) findViewById(R.id.imageView13));
            add((ImageView) findViewById(R.id.imageView14));
            add((ImageView) findViewById(R.id.imageView15));
            add((ImageView) findViewById(R.id.imageView16));
            add((ImageView) findViewById(R.id.imageView17));
            add((ImageView) findViewById(R.id.imageView18));
            add((ImageView) findViewById(R.id.imageView19));
            add((ImageView) findViewById(R.id.imageView20));
            add((ImageView) findViewById(R.id.imageView21));
            add((ImageView) findViewById(R.id.imageView22));
            add((ImageView) findViewById(R.id.imageView23));
            add((ImageView) findViewById(R.id.imageView24));
            add((ImageView) findViewById(R.id.imageView25));
            add((ImageView) findViewById(R.id.imageView26));
            add((ImageView) findViewById(R.id.imageView27));
            add((ImageView) findViewById(R.id.imageView28));
            add((ImageView) findViewById(R.id.imageView29));
            add((ImageView) findViewById(R.id.imageView30));
            add((ImageView) findViewById(R.id.imageView31));
            add((ImageView) findViewById(R.id.imageView32));
            add((ImageView) findViewById(R.id.imageView33));
            add((ImageView) findViewById(R.id.imageView34));
            add((ImageView) findViewById(R.id.imageView35));
            add((ImageView) findViewById(R.id.imageView36));
            add((ImageView) findViewById(R.id.imageView37));
            add((ImageView) findViewById(R.id.imageView38));
            add((ImageView) findViewById(R.id.imageView39));
            add((ImageView) findViewById(R.id.imageView40));
            add((ImageView) findViewById(R.id.imageView41));
            add((ImageView) findViewById(R.id.imageView42));
            add((ImageView) findViewById(R.id.imageView43));
            add((ImageView) findViewById(R.id.imageView44));
            add((ImageView) findViewById(R.id.imageView45));
            add((ImageView) findViewById(R.id.imageView46));
            add((ImageView) findViewById(R.id.imageView47));
            add((ImageView) findViewById(R.id.imageView48));
            add((ImageView) findViewById(R.id.imageView49));
            add((ImageView) findViewById(R.id.imageView50));
            add((ImageView) findViewById(R.id.imageView51));
            add((ImageView) findViewById(R.id.imageView52));
            add((ImageView) findViewById(R.id.imageView53));
            add((ImageView) findViewById(R.id.imageView54));
            add((ImageView) findViewById(R.id.imageView54));

        }};


        final int[] itemCountTotal = {0};
        for (int i = 1; i <= 100; i++) {
            age.add(i);
        }

        for (int s = 0; s <= 99; s++) {
            if (age.get(s) % 2 == 1) {
                ageOdd.add(age.get(s));
            }
        }

        for (int s = 0; s <= 99; s++) {
            if (age.get(s) % 2 == 0) {
                ageEven.add(age.get(s));
            }
        }
        //use set text

        gameCounter[0]++;


        int c = 0;
        int count = 0;
        for (int column = 0; column <= 49; column++, count++) {

            ageTable[column] = ageOdd.get(c);
            c++;
            System.out.print(ageTable[column] + " ");
            if (count <= 50) {
                if (ageTable[column] == 1) {
                    allButtons.get(count).setImageResource(R.drawable.green1);
                } else if (ageTable[column] == 2) {
                    allButtons.get(count).setImageResource(R.drawable.green2);
                } else if (ageTable[column] == 3) {
                    allButtons.get(count).setImageResource(R.drawable.green3);
                } else if (ageTable[column] == 4) {
                    allButtons.get(count).setImageResource(R.drawable.green4);
                } else if (ageTable[column] == 5) {
                    allButtons.get(count).setImageResource(R.drawable.green5);
                } else if (ageTable[column] == 6) {
                    allButtons.get(count).setImageResource(R.drawable.green6);
                } else if (ageTable[column] == 7) {
                    allButtons.get(count).setImageResource(R.drawable.green7);
                } else if (ageTable[column] == 8) {
                    allButtons.get(count).setImageResource(R.drawable.green8);
                } else if (ageTable[column] == 9) {
                    allButtons.get(count).setImageResource(R.drawable.green9);
                } else if (ageTable[column] == 10) {
                    allButtons.get(count).setImageResource(R.drawable.green10);
                } else if (ageTable[column] == 11) {
                    allButtons.get(count).setImageResource(R.drawable.green11);
                } else if (ageTable[column] == 12) {
                    allButtons.get(count).setImageResource(R.drawable.green12);
                } else if (ageTable[column] == 13) {
                    allButtons.get(count).setImageResource(R.drawable.green13);
                } else if (ageTable[column] == 14) {
                    allButtons.get(count).setImageResource(R.drawable.green14);
                } else if (ageTable[column] == 15) {
                    allButtons.get(count).setImageResource(R.drawable.green15);
                } else if (ageTable[column] == 16) {
                    allButtons.get(count).setImageResource(R.drawable.green16);
                } else if (ageTable[column] == 17) {
                    allButtons.get(count).setImageResource(R.drawable.green17);
                } else if (ageTable[column] == 18) {
                    allButtons.get(count).setImageResource(R.drawable.green18);
                } else if (ageTable[column] == 19) {
                    allButtons.get(count).setImageResource(R.drawable.green19);
                } else if (ageTable[column] == 20) {
                    allButtons.get(count).setImageResource(R.drawable.green20);
                } else if (ageTable[column] == 21) {
                    allButtons.get(count).setImageResource(R.drawable.green21);
                } else if (ageTable[column] == 22) {
                    allButtons.get(count).setImageResource(R.drawable.green22);
                } else if (ageTable[column] == 23) {
                    allButtons.get(count).setImageResource(R.drawable.green23);
                } else if (ageTable[column] == 24) {
                    allButtons.get(count).setImageResource(R.drawable.green24);
                } else if (ageTable[column] == 25) {
                    allButtons.get(count).setImageResource(R.drawable.green25);
                } else if (ageTable[column] == 26) {
                    allButtons.get(count).setImageResource(R.drawable.green26);
                } else if (ageTable[column] == 27) {
                    allButtons.get(count).setImageResource(R.drawable.green27);
                } else if (ageTable[column] == 28) {
                    allButtons.get(count).setImageResource(R.drawable.green28x);
                } else if (ageTable[column] == 29) {
                    allButtons.get(count).setImageResource(R.drawable.green29);
                } else if (ageTable[column] == 30) {
                    allButtons.get(count).setImageResource(R.drawable.green30);
                } else if (ageTable[column] == 31) {
                    allButtons.get(count).setImageResource(R.drawable.green31);
                } else if (ageTable[column] == 32) {
                    allButtons.get(count).setImageResource(R.drawable.green32);
                } else if (ageTable[column] == 33) {
                    allButtons.get(count).setImageResource(R.drawable.green33);
                } else if (ageTable[column] == 34) {
                    allButtons.get(count).setImageResource(R.drawable.green34);
                } else if (ageTable[column] == 35) {
                    allButtons.get(count).setImageResource(R.drawable.green35);
                } else if (ageTable[column] == 36) {
                    allButtons.get(count).setImageResource(R.drawable.green36);
                } else if (ageTable[column] == 37) {
                    allButtons.get(count).setImageResource(R.drawable.green37);
                } else if (ageTable[column] == 38) {
                    allButtons.get(count).setImageResource(R.drawable.green38);
                } else if (ageTable[column] == 39) {
                    allButtons.get(count).setImageResource(R.drawable.green39);
                } else if (ageTable[column] == 40) {
                    allButtons.get(count).setImageResource(R.drawable.green40);
                } else if (ageTable[column] == 41) {
                    allButtons.get(count).setImageResource(R.drawable.green41);
                } else if (ageTable[column] == 42) {
                    allButtons.get(count).setImageResource(R.drawable.green42);
                } else if (ageTable[column] == 43) {
                    allButtons.get(count).setImageResource(R.drawable.green43);
                } else if (ageTable[column] == 44) {
                    allButtons.get(count).setImageResource(R.drawable.green44);
                } else if (ageTable[column] == 45) {
                    allButtons.get(count).setImageResource(R.drawable.green45);
                } else if (ageTable[column] == 46) {
                    allButtons.get(count).setImageResource(R.drawable.green46);
                } else if (ageTable[column] == 47) {
                    allButtons.get(count).setImageResource(R.drawable.green47);
                } else if (ageTable[column] == 48) {
                    allButtons.get(count).setImageResource(R.drawable.green48);
                } else if (ageTable[column] == 49) {
                    allButtons.get(count).setImageResource(R.drawable.green49);
                } else if (ageTable[column] == 50) {
                    allButtons.get(count).setImageResource(R.drawable.green50);
                } else if (ageTable[column] == 51) {
                    allButtons.get(count).setImageResource(R.drawable.green51);
                } else if (ageTable[column] == 52) {
                    allButtons.get(count).setImageResource(R.drawable.green52);
                } else if (ageTable[column] == 53) {
                    allButtons.get(count).setImageResource(R.drawable.green53);
                } else if (ageTable[column] == 54) {
                    allButtons.get(count).setImageResource(R.drawable.green54);
                } else if (ageTable[column] == 55) {
                    allButtons.get(count).setImageResource(R.drawable.green55);
                } else if (ageTable[column] == 56) {
                    allButtons.get(count).setImageResource(R.drawable.green56);
                } else if (ageTable[column] == 57) {
                    allButtons.get(count).setImageResource(R.drawable.green57);
                } else if (ageTable[column] == 58) {
                    allButtons.get(count).setImageResource(R.drawable.green58);
                } else if (ageTable[column] == 59) {
                    allButtons.get(count).setImageResource(R.drawable.green59);
                } else if (ageTable[column] == 60) {
                    allButtons.get(count).setImageResource(R.drawable.green60);
                } else if (ageTable[column] == 61) {
                    allButtons.get(count).setImageResource(R.drawable.green61);
                } else if (ageTable[column] == 62) {
                    allButtons.get(count).setImageResource(R.drawable.green62);
                } else if (ageTable[column] == 63) {
                    allButtons.get(count).setImageResource(R.drawable.green63);
                } else if (ageTable[column] == 64) {
                    allButtons.get(count).setImageResource(R.drawable.green64);
                } else if (ageTable[column] == 65) {
                    allButtons.get(count).setImageResource(R.drawable.green65);
                } else if (ageTable[column] == 66) {
                    allButtons.get(count).setImageResource(R.drawable.green66);
                } else if (ageTable[column] == 67) {
                    allButtons.get(count).setImageResource(R.drawable.green68);
                } else if (ageTable[column] == 68) {
                    allButtons.get(count).setImageResource(R.drawable.green67);
                } else if (ageTable[column] == 69) {
                    allButtons.get(count).setImageResource(R.drawable.green69);
                } else if (ageTable[column] == 70) {
                    allButtons.get(count).setImageResource(R.drawable.green70);
                } else if (ageTable[column] == 71) {
                    allButtons.get(count).setImageResource(R.drawable.green71);
                } else if (ageTable[column] == 72) {
                    allButtons.get(count).setImageResource(R.drawable.green72);
                } else if (ageTable[column] == 73) {
                    allButtons.get(count).setImageResource(R.drawable.green73);
                } else if (ageTable[column] == 74) {
                    allButtons.get(count).setImageResource(R.drawable.green74);
                } else if (ageTable[column] == 75) {
                    allButtons.get(count).setImageResource(R.drawable.green75);
                } else if (ageTable[column] == 76) {
                    allButtons.get(count).setImageResource(R.drawable.green76);
                } else if (ageTable[column] == 77) {
                    allButtons.get(count).setImageResource(R.drawable.green77);
                } else if (ageTable[column] == 78) {
                    allButtons.get(count).setImageResource(R.drawable.green78);
                } else if (ageTable[column] == 79) {
                    allButtons.get(count).setImageResource(R.drawable.green79);
                } else if (ageTable[column] == 80) {
                    allButtons.get(count).setImageResource(R.drawable.green80);
                } else if (ageTable[column] == 81) {
                    allButtons.get(count).setImageResource(R.drawable.green81);
                } else if (ageTable[column] == 82) {
                    allButtons.get(count).setImageResource(R.drawable.green82);
                } else if (ageTable[column] == 83) {
                    allButtons.get(count).setImageResource(R.drawable.green83);
                } else if (ageTable[column] == 84) {
                    allButtons.get(count).setImageResource(R.drawable.green84);
                } else if (ageTable[column] == 85) {
                    allButtons.get(count).setImageResource(R.drawable.green85);
                } else if (ageTable[column] == 86) {
                    allButtons.get(count).setImageResource(R.drawable.green86);
                } else if (ageTable[column] == 87) {
                    allButtons.get(count).setImageResource(R.drawable.green87);
                } else if (ageTable[column] == 88) {
                    allButtons.get(count).setImageResource(R.drawable.green88);
                } else if (ageTable[column] == 89) {
                    allButtons.get(count).setImageResource(R.drawable.green89);
                } else if (ageTable[column] == 90) {
                    allButtons.get(count).setImageResource(R.drawable.green90);
                } else if (ageTable[column] == 91) {
                    allButtons.get(count).setImageResource(R.drawable.green91);
                } else if (ageTable[column] == 92) {
                    allButtons.get(count).setImageResource(R.drawable.green92);
                } else if (ageTable[column] == 93) {
                    allButtons.get(count).setImageResource(R.drawable.green93);
                } else if (ageTable[column] == 94) {
                    allButtons.get(count).setImageResource(R.drawable.green94);
                } else if (ageTable[column] == 95) {
                    allButtons.get(count).setImageResource(R.drawable.green95);
                } else if (ageTable[column] == 96) {
                    allButtons.get(count).setImageResource(R.drawable.green96);
                } else if (ageTable[column] == 97) {
                    allButtons.get(count).setImageResource(R.drawable.green97);
                } else if (ageTable[column] == 98) {
                    allButtons.get(count).setImageResource(R.drawable.green98);
                } else if (ageTable[column] == 99) {
                    allButtons.get(count).setImageResource(R.drawable.green99);
                }
            }


        }
        //use button
        final int[] random = {0};
        final int[] cnt = {0};


//run this if they click yes

        final ArrayList<Integer> ageCondition = new ArrayList<Integer>();
        //after that sucess... run all the code till this end
        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int pls = 0;

                System.out.println();


                if (v.equals(yes) || v.equals(no)) {


                    for (int w = 0; w < allButtons.size(); w++) {
                        allButtons.get(w).setImageResource(android.R.color.transparent);

                    }
                    if (v.equals(yes)) {

                        for (int i = 0; i <= 49; i++) {
                            ageNull.add(ageEven.get(i));

                            System.out.print(ageNull.get(i) + " ");
                        }
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i < 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);
                                    yourNum.setText(totalFrequency);

                                    no.setVisibility(View.GONE);
                                    yes.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }

                                }
                            }

                        }

                    } else {
                        for (int i = 0; i <= 49; i++) {
                            ageNull.add(ageOdd.get(i));
                            System.out.print(ageNull.get(i) + " ");
                        }
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i < 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);
                                    yourNum.setText(totalFrequency);

                                    yourNum.setText("Your number is " + totalFrequency + ".");
                                    no.setVisibility(View.GONE);
                                    yes.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }


                        }

                    }


                    int[] ageTableTwo = new int[55];

                    for (int i = 0; i <= 99; i++) {
                        random[0] = (int) (Math.random() * 2) + 1;
                        if (random[0] == 1) {
                            ageCondition.add(age.get(i));
                            cnt[0]++;
                        }
                    }
                    int columnSize = 0;
                    final int itemCount = ageCondition.size();
                    if (itemCount > 50) {
                        columnSize = 54;
                    } else {
                        columnSize = 54;
                    }
                    int d = 0;
                    int count = 0;
                    System.out.println("\n");
                    turnCounter.setImageResource(R.drawable.secondturn);
                    gameCounter[0]++;


                    mainLoopTwo:
                    //prints out then new list of numbers... do this
                    ;
                    for (int column = 0; column <= columnSize; column++, d++, count++) {

                        ageTableTwo[column] = ageCondition.get(d);
                        System.out.print(ageTableTwo[column] + " ");
                        if (ageTableTwo[column] == 1) {
                            allButtons.get(count).setImageResource(R.drawable.blue1);
                        } else if (ageTableTwo[column] == 2) {
                            allButtons.get(count).setImageResource(R.drawable.blue2);
                        } else if (ageTableTwo[column] == 3) {
                            allButtons.get(count).setImageResource(R.drawable.blue3);
                        } else if (ageTableTwo[column] == 4) {
                            allButtons.get(count).setImageResource(R.drawable.blue4);
                        } else if (ageTableTwo[column] == 5) {
                            allButtons.get(count).setImageResource(R.drawable.blue5);
                        } else if (ageTableTwo[column] == 6) {
                            allButtons.get(count).setImageResource(R.drawable.blue6);
                        } else if (ageTableTwo[column] == 7) {
                            allButtons.get(count).setImageResource(R.drawable.blue7);
                        } else if (ageTableTwo[column] == 8) {
                            allButtons.get(count).setImageResource(R.drawable.blue8);
                        } else if (ageTableTwo[column] == 9) {
                            allButtons.get(count).setImageResource(R.drawable.blue9);
                        } else if (ageTableTwo[column] == 10) {
                            allButtons.get(count).setImageResource(R.drawable.blue10);
                        } else if (ageTableTwo[column] == 11) {
                            allButtons.get(count).setImageResource(R.drawable.blue11);
                        } else if (ageTableTwo[column] == 12) {
                            allButtons.get(count).setImageResource(R.drawable.blue12);
                        } else if (ageTableTwo[column] == 13) {
                            allButtons.get(count).setImageResource(R.drawable.blue13);
                        } else if (ageTableTwo[column] == 14) {
                            allButtons.get(count).setImageResource(R.drawable.blue14);
                        } else if (ageTableTwo[column] == 15) {
                            allButtons.get(count).setImageResource(R.drawable.blue15);
                        } else if (ageTableTwo[column] == 16) {
                            allButtons.get(count).setImageResource(R.drawable.blue16);
                        } else if (ageTableTwo[column] == 17) {
                            allButtons.get(count).setImageResource(R.drawable.blue17);
                        } else if (ageTableTwo[column] == 18) {
                            allButtons.get(count).setImageResource(R.drawable.blue18);
                        } else if (ageTableTwo[column] == 19) {
                            allButtons.get(count).setImageResource(R.drawable.blue19);
                        } else if (ageTableTwo[column] == 20) {
                            allButtons.get(count).setImageResource(R.drawable.blue20);
                        } else if (ageTableTwo[column] == 21) {
                            allButtons.get(count).setImageResource(R.drawable.blue21);
                        } else if (ageTableTwo[column] == 22) {
                            allButtons.get(count).setImageResource(R.drawable.blue22);
                        } else if (ageTableTwo[column] == 23) {
                            allButtons.get(count).setImageResource(R.drawable.blue23);
                        } else if (ageTableTwo[column] == 24) {
                            allButtons.get(count).setImageResource(R.drawable.blue24);
                        } else if (ageTableTwo[column] == 25) {
                            allButtons.get(count).setImageResource(R.drawable.blue25);
                        } else if (ageTableTwo[column] == 26) {
                            allButtons.get(count).setImageResource(R.drawable.blue26);
                        } else if (ageTableTwo[column] == 27) {
                            allButtons.get(count).setImageResource(R.drawable.blue27);
                        } else if (ageTableTwo[column] == 28) {
                            allButtons.get(count).setImageResource(R.drawable.blue28);
                        } else if (ageTableTwo[column] == 29) {
                            allButtons.get(count).setImageResource(R.drawable.blue29);
                        } else if (ageTableTwo[column] == 30) {
                            allButtons.get(count).setImageResource(R.drawable.blue30);
                        } else if (ageTableTwo[column] == 31) {
                            allButtons.get(count).setImageResource(R.drawable.blue31);
                        } else if (ageTableTwo[column] == 32) {
                            allButtons.get(count).setImageResource(R.drawable.blue32);
                        } else if (ageTableTwo[column] == 33) {
                            allButtons.get(count).setImageResource(R.drawable.blue33);
                        } else if (ageTableTwo[column] == 34) {
                            allButtons.get(count).setImageResource(R.drawable.blue34);
                        } else if (ageTableTwo[column] == 35) {
                            allButtons.get(count).setImageResource(R.drawable.blue35);
                        } else if (ageTableTwo[column] == 36) {
                            allButtons.get(count).setImageResource(R.drawable.blue36);
                        } else if (ageTableTwo[column] == 37) {
                            allButtons.get(count).setImageResource(R.drawable.blue37);
                        } else if (ageTableTwo[column] == 38) {
                            allButtons.get(count).setImageResource(R.drawable.blue38);
                        } else if (ageTableTwo[column] == 39) {
                            allButtons.get(count).setImageResource(R.drawable.blue39);
                        } else if (ageTableTwo[column] == 40) {
                            allButtons.get(count).setImageResource(R.drawable.blue40);
                        } else if (ageTableTwo[column] == 41) {
                            allButtons.get(count).setImageResource(R.drawable.blue41);
                        } else if (ageTableTwo[column] == 42) {
                            allButtons.get(count).setImageResource(R.drawable.blue42);
                        } else if (ageTableTwo[column] == 43) {
                            allButtons.get(count).setImageResource(R.drawable.blue43);
                        } else if (ageTableTwo[column] == 44) {
                            allButtons.get(count).setImageResource(R.drawable.blue44);
                        } else if (ageTableTwo[column] == 45) {
                            allButtons.get(count).setImageResource(R.drawable.blue45);
                        } else if (ageTableTwo[column] == 46) {
                            allButtons.get(count).setImageResource(R.drawable.blue46);
                        } else if (ageTableTwo[column] == 47) {
                            allButtons.get(count).setImageResource(R.drawable.blue47);
                        } else if (ageTableTwo[column] == 48) {
                            allButtons.get(count).setImageResource(R.drawable.blue48);
                        } else if (ageTableTwo[column] == 49) {
                            allButtons.get(count).setImageResource(R.drawable.blue49);
                        } else if (ageTableTwo[column] == 50) {
                            allButtons.get(count).setImageResource(R.drawable.blue50);
                        } else if (ageTableTwo[column] == 51) {
                            allButtons.get(count).setImageResource(R.drawable.blue51);
                        } else if (ageTableTwo[column] == 52) {
                            allButtons.get(count).setImageResource(R.drawable.blue52);
                        } else if (ageTableTwo[column] == 53) {
                            allButtons.get(count).setImageResource(R.drawable.blue53);
                        } else if (ageTableTwo[column] == 54) {
                            allButtons.get(count).setImageResource(R.drawable.blue54);
                        } else if (ageTableTwo[column] == 55) {
                            allButtons.get(count).setImageResource(R.drawable.blue55);
                        } else if (ageTableTwo[column] == 56) {
                            allButtons.get(count).setImageResource(R.drawable.blue56);
                        } else if (ageTableTwo[column] == 57) {
                            allButtons.get(count).setImageResource(R.drawable.blue57);
                        } else if (ageTableTwo[column] == 58) {
                            allButtons.get(count).setImageResource(R.drawable.blue58);
                        } else if (ageTableTwo[column] == 59) {
                            allButtons.get(count).setImageResource(R.drawable.blue59);
                        } else if (ageTableTwo[column] == 60) {
                            allButtons.get(count).setImageResource(R.drawable.blue60);
                        } else if (ageTableTwo[column] == 61) {
                            allButtons.get(count).setImageResource(R.drawable.blue61);
                        } else if (ageTableTwo[column] == 62) {
                            allButtons.get(count).setImageResource(R.drawable.blue62);
                        } else if (ageTableTwo[column] == 63) {
                            allButtons.get(count).setImageResource(R.drawable.blue63);
                        } else if (ageTableTwo[column] == 64) {
                            allButtons.get(count).setImageResource(R.drawable.blue64);
                        } else if (ageTableTwo[column] == 65) {
                            allButtons.get(count).setImageResource(R.drawable.blue65);
                        } else if (ageTableTwo[column] == 66) {
                            allButtons.get(count).setImageResource(R.drawable.blue66);
                        } else if (ageTableTwo[column] == 67) {
                            allButtons.get(count).setImageResource(R.drawable.blue67);
                        } else if (ageTableTwo[column] == 68) {
                            allButtons.get(count).setImageResource(R.drawable.blue68);
                        } else if (ageTableTwo[column] == 69) {
                            allButtons.get(count).setImageResource(R.drawable.blue69);
                        } else if (ageTableTwo[column] == 70) {
                            allButtons.get(count).setImageResource(R.drawable.blue70);
                        } else if (ageTableTwo[column] == 71) {
                            allButtons.get(count).setImageResource(R.drawable.blue71);
                        } else if (ageTableTwo[column] == 72) {
                            allButtons.get(count).setImageResource(R.drawable.blue72);
                        } else if (ageTableTwo[column] == 73) {
                            allButtons.get(count).setImageResource(R.drawable.blue73);
                        } else if (ageTableTwo[column] == 74) {
                            allButtons.get(count).setImageResource(R.drawable.blue74);
                        } else if (ageTableTwo[column] == 75) {
                            allButtons.get(count).setImageResource(R.drawable.blue75);
                        } else if (ageTableTwo[column] == 76) {
                            allButtons.get(count).setImageResource(R.drawable.blue76);
                        } else if (ageTableTwo[column] == 77) {
                            allButtons.get(count).setImageResource(R.drawable.blue77);
                        } else if (ageTableTwo[column] == 78) {
                            allButtons.get(count).setImageResource(R.drawable.blue78);
                        } else if (ageTableTwo[column] == 79) {
                            allButtons.get(count).setImageResource(R.drawable.blue79);
                        } else if (ageTableTwo[column] == 80) {
                            allButtons.get(count).setImageResource(R.drawable.blue80);
                        } else if (ageTableTwo[column] == 81) {
                            allButtons.get(count).setImageResource(R.drawable.blue81);
                        } else if (ageTableTwo[column] == 82) {
                            allButtons.get(count).setImageResource(R.drawable.blue82);
                        } else if (ageTableTwo[column] == 83) {
                            allButtons.get(count).setImageResource(R.drawable.blue83);
                        } else if (ageTableTwo[column] == 84) {
                            allButtons.get(count).setImageResource(R.drawable.blue84);
                        } else if (ageTableTwo[column] == 85) {
                            allButtons.get(count).setImageResource(R.drawable.blue85);
                        } else if (ageTableTwo[column] == 86) {
                            allButtons.get(count).setImageResource(R.drawable.blue86);
                        } else if (ageTableTwo[column] == 87) {
                            allButtons.get(count).setImageResource(R.drawable.blue87);
                        } else if (ageTableTwo[column] == 88) {
                            allButtons.get(count).setImageResource(R.drawable.blue88);
                        } else if (ageTableTwo[column] == 89) {
                            allButtons.get(count).setImageResource(R.drawable.blue89);
                        } else if (ageTableTwo[column] == 90) {
                            allButtons.get(count).setImageResource(R.drawable.blue90);
                        } else if (ageTableTwo[column] == 91) {
                            allButtons.get(count).setImageResource(R.drawable.blue91);
                        } else if (ageTableTwo[column] == 92) {
                            allButtons.get(count).setImageResource(R.drawable.blue92);
                        } else if (ageTableTwo[column] == 93) {
                            allButtons.get(count).setImageResource(R.drawable.blue93);
                        } else if (ageTableTwo[column] == 94) {
                            allButtons.get(count).setImageResource(R.drawable.blue94);
                        } else if (ageTableTwo[column] == 95) {
                            allButtons.get(count).setImageResource(R.drawable.blue95);
                        } else if (ageTableTwo[column] == 96) {
                            allButtons.get(count).setImageResource(R.drawable.blue96);
                        } else if (ageTableTwo[column] == 97) {
                            allButtons.get(count).setImageResource(R.drawable.blue97);
                        } else if (ageTableTwo[column] == 98) {
                            allButtons.get(count).setImageResource(R.drawable.blue98);
                        } else if (ageTableTwo[column] == 99) {
                            allButtons.get(count).setImageResource(R.drawable.blue99);
                        }
                        if (ageCondition.get(d) == ageCondition.get(itemCount - 1)) {
                            break;
                        }
                    }
                    System.out.println("");

                    System.out.println("");
                    if (pls == 0) {
                        yes.setVisibility(View.GONE);
                        no.setVisibility(View.GONE);
                        yes1.setVisibility(View.VISIBLE);
                        no1.setVisibility(View.VISIBLE);
                    }

                    ///create listener for the button again same way

                    //this code goes in after they click first button


                    //this code is after they click the first


                    // do something else

                }
            }
        };

        no.setOnClickListener(listener);
        yes.setOnClickListener(listener);
        itemCountTotal[0] = ageNull.size();


        final ArrayList<Integer> ageConditionTwo = new ArrayList<Integer>();
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pls = 0;
                if (v.equals(yes1) || v.equals(no1)) {
                    for (int w = 0; w < allButtons.size(); w++) {
                        allButtons.get(w).setImageResource(android.R.color.transparent);

                    }
                    if (v.equals(yes1)) {
                        int occurence, occurenceTwo;
                        int frequency = 0;
                        for (int i = 0; i < 99; i++) {
                            frequency = age.get(i);
                            occurence = Collections.frequency(ageCondition, frequency);
                            occurenceTwo = Collections.frequency(ageNull, frequency);
                            if (occurence == 0 && occurenceTwo == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i < 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no1.setVisibility(View.GONE);
                                    yes1.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }


                    } else if (v.equals(no1)) {
                        int occurence;
                        int frequency = 0;
                        for (int i = 0; i < ageCondition.size(); i++) {
                            frequency = ageCondition.get(i);
                            occurence = Collections.frequency(ageNull, frequency);
                            if (occurence == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i < 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no1.setVisibility(View.GONE);
                                    yes1.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }
                    }

                    int[] ageTableThree = new int[55];
                    random[0] = 0;
                    cnt[0] = 0;
                    for (int i = 0; i <= 99; i++) {
                        random[0] = (int) (Math.random() * 2) + 1;
                        if (random[0] == 1) {
                            ageConditionTwo.add(age.get(i));
                            cnt[0]++;
                        }
                    }
                    int columnSize = 0;
                    final int itemCount = ageConditionTwo.size();
                    if (itemCount > 50) {
                        columnSize = 54;
                    } else {
                        columnSize = 54;
                    }
                    int d = 0;
                    System.out.println("\n");
                    turnCounter.setImageResource(R.drawable.thirdturn);
                    gameCounter[0]++;

                    int count = 0;

                    mainLoopThree:
                    for (int column = 0; column <= columnSize; column++, d++, count++) {

                        ageTableThree[column] = ageConditionTwo.get(d);
                        System.out.print(ageTableThree[column] + " ");
                        if (ageTableThree[column] == 1) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple1);
                        } else if (ageTableThree[column] == 2) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple2);
                        } else if (ageTableThree[column] == 3) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple3);
                        } else if (ageTableThree[column] == 4) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple4);
                        } else if (ageTableThree[column] == 5) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple5);
                        } else if (ageTableThree[column] == 6) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple6);
                        } else if (ageTableThree[column] == 7) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple7);
                        } else if (ageTableThree[column] == 8) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple8);
                        } else if (ageTableThree[column] == 9) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple9);
                        } else if (ageTableThree[column] == 10) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple10);
                        } else if (ageTableThree[column] == 11) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple11);
                        } else if (ageTableThree[column] == 12) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple12);
                        } else if (ageTableThree[column] == 13) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple13);
                        } else if (ageTableThree[column] == 14) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple14);
                        } else if (ageTableThree[column] == 15) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple15);
                        } else if (ageTableThree[column] == 16) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple16);
                        } else if (ageTableThree[column] == 17) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple17);
                        } else if (ageTableThree[column] == 18) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple18);
                        } else if (ageTableThree[column] == 19) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple19);
                        } else if (ageTableThree[column] == 20) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple20);
                        } else if (ageTableThree[column] == 21) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple21);
                        } else if (ageTableThree[column] == 22) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple22);
                        } else if (ageTableThree[column] == 23) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple23);
                        } else if (ageTableThree[column] == 24) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple24);
                        } else if (ageTableThree[column] == 25) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple25);
                        } else if (ageTableThree[column] == 26) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple26);
                        } else if (ageTableThree[column] == 27) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple27);
                        } else if (ageTableThree[column] == 28) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple28);
                        } else if (ageTableThree[column] == 29) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple29);
                        } else if (ageTableThree[column] == 30) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple30);
                        } else if (ageTableThree[column] == 31) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple31);
                        } else if (ageTableThree[column] == 32) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple32);
                        } else if (ageTableThree[column] == 33) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple33);
                        } else if (ageTableThree[column] == 34) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple34);
                        } else if (ageTableThree[column] == 35) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple35);
                        } else if (ageTableThree[column] == 36) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple36);
                        } else if (ageTableThree[column] == 37) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple37);
                        } else if (ageTableThree[column] == 38) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple38);
                        } else if (ageTableThree[column] == 39) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple39);
                        } else if (ageTableThree[column] == 40) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple40);
                        } else if (ageTableThree[column] == 41) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple41);
                        } else if (ageTableThree[column] == 42) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple42);
                        } else if (ageTableThree[column] == 43) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple43);
                        } else if (ageTableThree[column] == 44) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple44);
                        } else if (ageTableThree[column] == 45) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple45);
                        } else if (ageTableThree[column] == 46) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple46);
                        } else if (ageTableThree[column] == 47) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple47);
                        } else if (ageTableThree[column] == 48) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple48);
                        } else if (ageTableThree[column] == 49) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple49);
                        } else if (ageTableThree[column] == 50) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple50);
                        } else if (ageTableThree[column] == 51) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple51);
                        } else if (ageTableThree[column] == 52) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple52);
                        } else if (ageTableThree[column] == 53) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple53);
                        } else if (ageTableThree[column] == 54) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple54);
                        } else if (ageTableThree[column] == 55) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple55);
                        } else if (ageTableThree[column] == 56) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple56);
                        } else if (ageTableThree[column] == 57) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple57);
                        } else if (ageTableThree[column] == 58) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple58);
                        } else if (ageTableThree[column] == 59) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple59);
                        } else if (ageTableThree[column] == 60) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple60);
                        } else if (ageTableThree[column] == 61) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple61);
                        } else if (ageTableThree[column] == 62) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple62);
                        } else if (ageTableThree[column] == 63) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple63);
                        } else if (ageTableThree[column] == 64) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple64);
                        } else if (ageTableThree[column] == 65) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple65);
                        } else if (ageTableThree[column] == 66) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple66);
                        } else if (ageTableThree[column] == 67) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple67);
                        } else if (ageTableThree[column] == 68) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple68);
                        } else if (ageTableThree[column] == 69) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple69);
                        } else if (ageTableThree[column] == 70) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple70);
                        } else if (ageTableThree[column] == 71) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple71);
                        } else if (ageTableThree[column] == 72) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple72);
                        } else if (ageTableThree[column] == 73) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple73);
                        } else if (ageTableThree[column] == 74) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple74);
                        } else if (ageTableThree[column] == 75) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple75);
                        } else if (ageTableThree[column] == 76) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple76);
                        } else if (ageTableThree[column] == 77) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple77);
                        } else if (ageTableThree[column] == 78) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple78);
                        } else if (ageTableThree[column] == 79) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple79);
                        } else if (ageTableThree[column] == 80) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple80);
                        } else if (ageTableThree[column] == 81) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple81);
                        } else if (ageTableThree[column] == 82) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple82);
                        } else if (ageTableThree[column] == 83) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple83);
                        } else if (ageTableThree[column] == 84) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple84);
                        } else if (ageTableThree[column] == 85) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple85);
                        } else if (ageTableThree[column] == 86) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple86);
                        } else if (ageTableThree[column] == 87) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple87);
                        } else if (ageTableThree[column] == 88) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple88);
                        } else if (ageTableThree[column] == 89) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple89);
                        } else if (ageTableThree[column] == 90) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple90);
                        } else if (ageTableThree[column] == 91) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple91);
                        } else if (ageTableThree[column] == 92) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple92);
                        } else if (ageTableThree[column] == 93) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple93);
                        } else if (ageTableThree[column] == 94) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple94);
                        } else if (ageTableThree[column] == 95) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple95);
                        } else if (ageTableThree[column] == 96) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple96);
                        } else if (ageTableThree[column] == 97) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple97);
                        } else if (ageTableThree[column] == 98) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple98);
                        } else if (ageTableThree[column] == 99) {
                            allButtons.get(count).setImageResource(R.drawable.lpurple99);
                        }
                        if (ageConditionTwo.get(d) == ageConditionTwo.get(itemCount - 1)) {
                            break mainLoopThree;
                        }


                    }

                    if (pls == 0) {
                        yes1.setVisibility(View.GONE);
                        no1.setVisibility(View.GONE);
                        yes2.setVisibility(View.VISIBLE);
                        no2.setVisibility(View.VISIBLE);
                    }


                }
            }
        };
        no1.setOnClickListener(listener2);
        yes1.setOnClickListener(listener2);

        final ArrayList<Integer> ageConditionThree = new ArrayList<Integer>();
        //end it here
        final View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pls = 0;
                if (v.equals(yes2) || v.equals(no2)) {
                    for (int w = 0; w < allButtons.size(); w++) {
                        allButtons.get(w).setImageResource(android.R.color.transparent);

                    }
                    if (v.equals(yes2)) {
                        int occurence, occurenceTwo;
                        int frequency = 0;
                        for (int i = 0; i < 99; i++) {
                            frequency = age.get(i);
                            occurence = Collections.frequency(ageConditionTwo, frequency);
                            occurenceTwo = Collections.frequency(ageNull, frequency);
                            if (occurence == 0 && occurenceTwo == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i < 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no2.setVisibility(View.GONE);
                                    yes2.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }
                        }

                    } else if (v.equals(no2)) {
                        int occurence;
                        int frequency = 0;
                        for (int i = 0; i < ageConditionTwo.size(); i++) {
                            frequency = ageConditionTwo.get(i);
                            occurence = Collections.frequency(ageNull, frequency);
                            if (occurence == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i < 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no2.setVisibility(View.GONE);
                                    yes2.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }

                    }


                    int[] ageTableFour = new int[55];
                    random[0] = 0;
                    cnt[0] = 0;
                    for (int i = 0; i <= 99; i++) {
                        random[0] = (int) (Math.random() * 2) + 1;
                        if (random[0] == 1) {
                            ageConditionThree.add(age.get(i));
                            cnt[0]++;
                        }
                    }
                    int columnSize = 0;
                    int itemCount = ageConditionThree.size();
                    if (itemCount > 50) {
                        columnSize = 54;
                    } else {
                        columnSize = 54;
                    }
                    int d = 0;
                    System.out.println("\n");
                    turnCounter.setImageResource(R.drawable.fourthturn);
                    gameCounter[0]++;

                    int count = 0;

                    mainLoopFour:
                    for (int column = 0; column <= 54; column++, d++, count++) {

                        ageTableFour[column] = ageConditionThree.get(d);
                        System.out.print(ageTableFour[column] + " ");
                        if (ageTableFour[column] == 1) {
                            allButtons.get(count).setImageResource(R.drawable.gold1);
                        } else if (ageTableFour[column] == 2) {
                            allButtons.get(count).setImageResource(R.drawable.gold2);
                        } else if (ageTableFour[column] == 3) {
                            allButtons.get(count).setImageResource(R.drawable.gold3);
                        } else if (ageTableFour[column] == 4) {
                            allButtons.get(count).setImageResource(R.drawable.gold4);
                        } else if (ageTableFour[column] == 5) {
                            allButtons.get(count).setImageResource(R.drawable.gold5);
                        } else if (ageTableFour[column] == 6) {
                            allButtons.get(count).setImageResource(R.drawable.gold6);
                        } else if (ageTableFour[column] == 7) {
                            allButtons.get(count).setImageResource(R.drawable.gold7);
                        } else if (ageTableFour[column] == 8) {
                            allButtons.get(count).setImageResource(R.drawable.gold8);
                        } else if (ageTableFour[column] == 9) {
                            allButtons.get(count).setImageResource(R.drawable.gold9);
                        } else if (ageTableFour[column] == 10) {
                            allButtons.get(count).setImageResource(R.drawable.gold10);
                        } else if (ageTableFour[column] == 11) {
                            allButtons.get(count).setImageResource(R.drawable.gold11);
                        } else if (ageTableFour[column] == 12) {
                            allButtons.get(count).setImageResource(R.drawable.gold12);
                        } else if (ageTableFour[column] == 13) {
                            allButtons.get(count).setImageResource(R.drawable.gold13);
                        } else if (ageTableFour[column] == 14) {
                            allButtons.get(count).setImageResource(R.drawable.gold14);
                        } else if (ageTableFour[column] == 15) {
                            allButtons.get(count).setImageResource(R.drawable.gold15);
                        } else if (ageTableFour[column] == 16) {
                            allButtons.get(count).setImageResource(R.drawable.gold16);
                        } else if (ageTableFour[column] == 17) {
                            allButtons.get(count).setImageResource(R.drawable.gold17);
                        } else if (ageTableFour[column] == 18) {
                            allButtons.get(count).setImageResource(R.drawable.gold18);
                        } else if (ageTableFour[column] == 19) {
                            allButtons.get(count).setImageResource(R.drawable.gold19);
                        } else if (ageTableFour[column] == 20) {
                            allButtons.get(count).setImageResource(R.drawable.gold20);
                        } else if (ageTableFour[column] == 21) {
                            allButtons.get(count).setImageResource(R.drawable.gold21);
                        } else if (ageTableFour[column] == 22) {
                            allButtons.get(count).setImageResource(R.drawable.gold22);
                        } else if (ageTableFour[column] == 23) {
                            allButtons.get(count).setImageResource(R.drawable.gold23);
                        } else if (ageTableFour[column] == 24) {
                            allButtons.get(count).setImageResource(R.drawable.gold24);
                        } else if (ageTableFour[column] == 25) {
                            allButtons.get(count).setImageResource(R.drawable.gold25);
                        } else if (ageTableFour[column] == 26) {
                            allButtons.get(count).setImageResource(R.drawable.gold26);
                        } else if (ageTableFour[column] == 27) {
                            allButtons.get(count).setImageResource(R.drawable.gold27);
                        } else if (ageTableFour[column] == 28) {
                            allButtons.get(count).setImageResource(R.drawable.gold28);
                        } else if (ageTableFour[column] == 29) {
                            allButtons.get(count).setImageResource(R.drawable.gold29);
                        } else if (ageTableFour[column] == 30) {
                            allButtons.get(count).setImageResource(R.drawable.gold30);
                        } else if (ageTableFour[column] == 31) {
                            allButtons.get(count).setImageResource(R.drawable.gold31);
                        } else if (ageTableFour[column] == 32) {
                            allButtons.get(count).setImageResource(R.drawable.gold32);
                        } else if (ageTableFour[column] == 33) {
                            allButtons.get(count).setImageResource(R.drawable.gold33);
                        } else if (ageTableFour[column] == 34) {
                            allButtons.get(count).setImageResource(R.drawable.gold34);
                        } else if (ageTableFour[column] == 35) {
                            allButtons.get(count).setImageResource(R.drawable.gold35);
                        } else if (ageTableFour[column] == 36) {
                            allButtons.get(count).setImageResource(R.drawable.gold36);
                        } else if (ageTableFour[column] == 37) {
                            allButtons.get(count).setImageResource(R.drawable.gold37);
                        } else if (ageTableFour[column] == 38) {
                            allButtons.get(count).setImageResource(R.drawable.gold38);
                        } else if (ageTableFour[column] == 39) {
                            allButtons.get(count).setImageResource(R.drawable.gold39);
                        } else if (ageTableFour[column] == 40) {
                            allButtons.get(count).setImageResource(R.drawable.gold40);
                        } else if (ageTableFour[column] == 41) {
                            allButtons.get(count).setImageResource(R.drawable.gold41);
                        } else if (ageTableFour[column] == 42) {
                            allButtons.get(count).setImageResource(R.drawable.gold42);
                        } else if (ageTableFour[column] == 43) {
                            allButtons.get(count).setImageResource(R.drawable.gold43);
                        } else if (ageTableFour[column] == 44) {
                            allButtons.get(count).setImageResource(R.drawable.gold44);
                        } else if (ageTableFour[column] == 45) {
                            allButtons.get(count).setImageResource(R.drawable.gold45);
                        } else if (ageTableFour[column] == 46) {
                            allButtons.get(count).setImageResource(R.drawable.gold46);
                        } else if (ageTableFour[column] == 47) {
                            allButtons.get(count).setImageResource(R.drawable.gold47);
                        } else if (ageTableFour[column] == 48) {
                            allButtons.get(count).setImageResource(R.drawable.gold48);
                        } else if (ageTableFour[column] == 49) {
                            allButtons.get(count).setImageResource(R.drawable.gold49);
                        } else if (ageTableFour[column] == 50) {
                            allButtons.get(count).setImageResource(R.drawable.gold50);
                        } else if (ageTableFour[column] == 51) {
                            allButtons.get(count).setImageResource(R.drawable.gold51);
                        } else if (ageTableFour[column] == 52) {
                            allButtons.get(count).setImageResource(R.drawable.gold52);
                        } else if (ageTableFour[column] == 53) {
                            allButtons.get(count).setImageResource(R.drawable.gold53);
                        } else if (ageTableFour[column] == 54) {
                            allButtons.get(count).setImageResource(R.drawable.gold54);
                        } else if (ageTableFour[column] == 55) {
                            allButtons.get(count).setImageResource(R.drawable.gold55);
                        } else if (ageTableFour[column] == 56) {
                            allButtons.get(count).setImageResource(R.drawable.gold56);
                        } else if (ageTableFour[column] == 57) {
                            allButtons.get(count).setImageResource(R.drawable.gold57);
                        } else if (ageTableFour[column] == 58) {
                            allButtons.get(count).setImageResource(R.drawable.gold58);
                        } else if (ageTableFour[column] == 59) {
                            allButtons.get(count).setImageResource(R.drawable.gold59);
                        } else if (ageTableFour[column] == 60) {
                            allButtons.get(count).setImageResource(R.drawable.gold60);
                        } else if (ageTableFour[column] == 61) {
                            allButtons.get(count).setImageResource(R.drawable.gold61);
                        } else if (ageTableFour[column] == 62) {
                            allButtons.get(count).setImageResource(R.drawable.gold62);
                        } else if (ageTableFour[column] == 63) {
                            allButtons.get(count).setImageResource(R.drawable.gold63);
                        } else if (ageTableFour[column] == 64) {
                            allButtons.get(count).setImageResource(R.drawable.gold64);
                        } else if (ageTableFour[column] == 65) {
                            allButtons.get(count).setImageResource(R.drawable.gold65);
                        } else if (ageTableFour[column] == 66) {
                            allButtons.get(count).setImageResource(R.drawable.gold66);
                        } else if (ageTableFour[column] == 67) {
                            allButtons.get(count).setImageResource(R.drawable.gold67);
                        } else if (ageTableFour[column] == 68) {
                            allButtons.get(count).setImageResource(R.drawable.gold68);
                        } else if (ageTableFour[column] == 69) {
                            allButtons.get(count).setImageResource(R.drawable.gold69);
                        } else if (ageTableFour[column] == 70) {
                            allButtons.get(count).setImageResource(R.drawable.gold70);
                        } else if (ageTableFour[column] == 71) {
                            allButtons.get(count).setImageResource(R.drawable.gold71);
                        } else if (ageTableFour[column] == 72) {
                            allButtons.get(count).setImageResource(R.drawable.gold72);
                        } else if (ageTableFour[column] == 73) {
                            allButtons.get(count).setImageResource(R.drawable.gold73);
                        } else if (ageTableFour[column] == 74) {
                            allButtons.get(count).setImageResource(R.drawable.gold74);
                        } else if (ageTableFour[column] == 75) {
                            allButtons.get(count).setImageResource(R.drawable.gold75);
                        } else if (ageTableFour[column] == 76) {
                            allButtons.get(count).setImageResource(R.drawable.gold76);
                        } else if (ageTableFour[column] == 77) {
                            allButtons.get(count).setImageResource(R.drawable.gold77);
                        } else if (ageTableFour[column] == 78) {
                            allButtons.get(count).setImageResource(R.drawable.gold78);
                        } else if (ageTableFour[column] == 79) {
                            allButtons.get(count).setImageResource(R.drawable.gold79);
                        } else if (ageTableFour[column] == 80) {
                            allButtons.get(count).setImageResource(R.drawable.gold80);
                        } else if (ageTableFour[column] == 81) {
                            allButtons.get(count).setImageResource(R.drawable.gold81);
                        } else if (ageTableFour[column] == 82) {
                            allButtons.get(count).setImageResource(R.drawable.gold82);
                        } else if (ageTableFour[column] == 83) {
                            allButtons.get(count).setImageResource(R.drawable.gold83);
                        } else if (ageTableFour[column] == 84) {
                            allButtons.get(count).setImageResource(R.drawable.gold84);
                        } else if (ageTableFour[column] == 85) {
                            allButtons.get(count).setImageResource(R.drawable.gold85);
                        } else if (ageTableFour[column] == 86) {
                            allButtons.get(count).setImageResource(R.drawable.gold86);
                        } else if (ageTableFour[column] == 87) {
                            allButtons.get(count).setImageResource(R.drawable.gold87);
                        } else if (ageTableFour[column] == 88) {
                            allButtons.get(count).setImageResource(R.drawable.gold88);
                        } else if (ageTableFour[column] == 89) {
                            allButtons.get(count).setImageResource(R.drawable.gold89);
                        } else if (ageTableFour[column] == 90) {
                            allButtons.get(count).setImageResource(R.drawable.gold90);
                        } else if (ageTableFour[column] == 91) {
                            allButtons.get(count).setImageResource(R.drawable.gold91);
                        } else if (ageTableFour[column] == 92) {
                            allButtons.get(count).setImageResource(R.drawable.gold92);
                        } else if (ageTableFour[column] == 93) {
                            allButtons.get(count).setImageResource(R.drawable.gold93);
                        } else if (ageTableFour[column] == 94) {
                            allButtons.get(count).setImageResource(R.drawable.gold94);
                        } else if (ageTableFour[column] == 95) {
                            allButtons.get(count).setImageResource(R.drawable.gold95);
                        } else if (ageTableFour[column] == 96) {
                            allButtons.get(count).setImageResource(R.drawable.gold96);
                        } else if (ageTableFour[column] == 97) {
                            allButtons.get(count).setImageResource(R.drawable.gold97);
                        } else if (ageTableFour[column] == 98) {
                            allButtons.get(count).setImageResource(R.drawable.gold98);
                        } else if (ageTableFour[column] == 99) {
                            allButtons.get(count).setImageResource(R.drawable.gold99);
                        }
                        if (ageConditionThree.get(d) == ageConditionThree.get(itemCount - 1)) {
                            break mainLoopFour;
                        }


                    }
                    System.out.println("");
                    if (pls == 0) {
                        yes2.setVisibility(View.GONE);
                        no2.setVisibility(View.GONE);
                        yes4.setVisibility(View.VISIBLE);
                        no4.setVisibility(View.VISIBLE);
                    }

                }
            }
        };
        no2.setOnClickListener(listener3);
        yes2.setOnClickListener(listener3);


        final ArrayList<Integer> ageConditionFour = new ArrayList<Integer>();
        View.OnClickListener listener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pls = 0;
                if (v.equals(yes4) || v.equals(no4)) {
                    for (int w = 0; w < allButtons.size(); w++) {
                        allButtons.get(w).setImageResource(android.R.color.transparent);

                    }
                    if (v.equals(yes4)) {
                        int occurence, occurenceTwo;
                        int frequency = 0;
                        for (int i = 0; i < 99; i++) {
                            frequency = age.get(i);
                            occurence = Collections.frequency(ageConditionThree, frequency);
                            occurenceTwo = Collections.frequency(ageNull, frequency);
                            if (occurence == 0 && occurenceTwo == 0) {
                                ageNull.add(frequency);
                            }

                        }
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int ii = 0; ii < 99; ii++) {
                                totalFrequency = age.get(ii);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no4.setVisibility(View.GONE);
                                    yes4.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }


                    } else if (v.equals(no4)) {
                        int occurence;
                        int frequency = 0;
                        for (int i = 0; i < ageConditionThree.size(); i++) {
                            frequency = ageConditionThree.get(i);
                            occurence = Collections.frequency(ageNull, frequency);
                            if (occurence == 0) {
                                ageNull.add(frequency);
                            }
                            itemCountTotal[0] = ageNull.size();

                        }
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int ii = 0; ii < 99; ii++) {
                                totalFrequency = age.get(ii);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {

                                    System.out.println("Your number is " + totalFrequency + ".");
                                    yourNum.setText("Your number is " + totalFrequency + ".");
                                    no4.setVisibility(View.GONE);
                                    yes4.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }

                    }
                    int[] ageTableFive = new int[55];
                    random[0] = 0;
                    cnt[0] = 0;
                    for (int i = 0; i <= 99; i++) {
                        random[0] = (int) (Math.random() * 2) + 1;
                        if (random[0] == 1) {
                            ageConditionFour.add(age.get(i));
                            cnt[0]++;
                        }
                    }
                    int columnSize = 0;
                    int itemCount = ageConditionFour.size();
                    if (itemCount > 50) {
                        columnSize = 54;
                    } else {
                        columnSize = 54;
                    }
                    int d = 0;
                    System.out.println("\n");
                    turnCounter.setImageResource(R.drawable.fifthturn);
                    gameCounter[0]++;


                    int count = 0;
                    mainLoopFive:
                    for (int column = 0; column <= columnSize; column++, d++, count++) {

                        ageTableFive[column] = ageConditionFour.get(d);
                        System.out.print(ageTableFive[column] + " ");
                        if (ageTableFive[column] == 1) {
                            allButtons.get(count).setImageResource(R.drawable.pink1);
                        } else if (ageTableFive[column] == 2) {
                            allButtons.get(count).setImageResource(R.drawable.pink2);
                        } else if (ageTableFive[column] == 3) {
                            allButtons.get(count).setImageResource(R.drawable.pink3);
                        } else if (ageTableFive[column] == 4) {
                            allButtons.get(count).setImageResource(R.drawable.pink4);
                        } else if (ageTableFive[column] == 5) {
                            allButtons.get(count).setImageResource(R.drawable.pink5);
                        } else if (ageTableFive[column] == 6) {
                            allButtons.get(count).setImageResource(R.drawable.pink6);
                        } else if (ageTableFive[column] == 7) {
                            allButtons.get(count).setImageResource(R.drawable.pink7);
                        } else if (ageTableFive[column] == 8) {
                            allButtons.get(count).setImageResource(R.drawable.pink8);
                        } else if (ageTableFive[column] == 9) {
                            allButtons.get(count).setImageResource(R.drawable.pink9);
                        } else if (ageTableFive[column] == 10) {
                            allButtons.get(count).setImageResource(R.drawable.pink10);
                        } else if (ageTableFive[column] == 11) {
                            allButtons.get(count).setImageResource(R.drawable.pink11);
                        } else if (ageTableFive[column] == 12) {
                            allButtons.get(count).setImageResource(R.drawable.pink12);
                        } else if (ageTableFive[column] == 13) {
                            allButtons.get(count).setImageResource(R.drawable.pink13);
                        } else if (ageTableFive[column] == 14) {
                            allButtons.get(count).setImageResource(R.drawable.pink14);
                        } else if (ageTableFive[column] == 15) {
                            allButtons.get(count).setImageResource(R.drawable.pink15);
                        } else if (ageTableFive[column] == 16) {
                            allButtons.get(count).setImageResource(R.drawable.pink16);
                        } else if (ageTableFive[column] == 17) {
                            allButtons.get(count).setImageResource(R.drawable.pink17);
                        } else if (ageTableFive[column] == 18) {
                            allButtons.get(count).setImageResource(R.drawable.pink18);
                        } else if (ageTableFive[column] == 19) {
                            allButtons.get(count).setImageResource(R.drawable.pink19);
                        } else if (ageTableFive[column] == 20) {
                            allButtons.get(count).setImageResource(R.drawable.pink20);
                        } else if (ageTableFive[column] == 21) {
                            allButtons.get(count).setImageResource(R.drawable.pink21);
                        } else if (ageTableFive[column] == 22) {
                            allButtons.get(count).setImageResource(R.drawable.pink22);
                        } else if (ageTableFive[column] == 23) {
                            allButtons.get(count).setImageResource(R.drawable.pink23);
                        } else if (ageTableFive[column] == 24) {
                            allButtons.get(count).setImageResource(R.drawable.pink24);
                        } else if (ageTableFive[column] == 25) {
                            allButtons.get(count).setImageResource(R.drawable.pink25);
                        } else if (ageTableFive[column] == 26) {
                            allButtons.get(count).setImageResource(R.drawable.pink26);
                        } else if (ageTableFive[column] == 27) {
                            allButtons.get(count).setImageResource(R.drawable.pink27);
                        } else if (ageTableFive[column] == 28) {
                            allButtons.get(count).setImageResource(R.drawable.pink28);
                        } else if (ageTableFive[column] == 29) {
                            allButtons.get(count).setImageResource(R.drawable.pink29);
                        } else if (ageTableFive[column] == 30) {
                            allButtons.get(count).setImageResource(R.drawable.pink30);
                        } else if (ageTableFive[column] == 31) {
                            allButtons.get(count).setImageResource(R.drawable.pink31);
                        } else if (ageTableFive[column] == 32) {
                            allButtons.get(count).setImageResource(R.drawable.pink32);
                        } else if (ageTableFive[column] == 33) {
                            allButtons.get(count).setImageResource(R.drawable.pink33);
                        } else if (ageTableFive[column] == 34) {
                            allButtons.get(count).setImageResource(R.drawable.pink34);
                        } else if (ageTableFive[column] == 35) {
                            allButtons.get(count).setImageResource(R.drawable.pink35);
                        } else if (ageTableFive[column] == 36) {
                            allButtons.get(count).setImageResource(R.drawable.pink36);
                        } else if (ageTableFive[column] == 37) {
                            allButtons.get(count).setImageResource(R.drawable.pink37);
                        } else if (ageTableFive[column] == 38) {
                            allButtons.get(count).setImageResource(R.drawable.pink38);
                        } else if (ageTableFive[column] == 39) {
                            allButtons.get(count).setImageResource(R.drawable.pink39);
                        } else if (ageTableFive[column] == 40) {
                            allButtons.get(count).setImageResource(R.drawable.pink40);
                        } else if (ageTableFive[column] == 41) {
                            allButtons.get(count).setImageResource(R.drawable.pink41);
                        } else if (ageTableFive[column] == 42) {
                            allButtons.get(count).setImageResource(R.drawable.pink42);
                        } else if (ageTableFive[column] == 43) {
                            allButtons.get(count).setImageResource(R.drawable.pink43);
                        } else if (ageTableFive[column] == 44) {
                            allButtons.get(count).setImageResource(R.drawable.pink44);
                        } else if (ageTableFive[column] == 45) {
                            allButtons.get(count).setImageResource(R.drawable.pink45);
                        } else if (ageTableFive[column] == 46) {
                            allButtons.get(count).setImageResource(R.drawable.pink46);
                        } else if (ageTableFive[column] == 47) {
                            allButtons.get(count).setImageResource(R.drawable.pink47);
                        } else if (ageTableFive[column] == 48) {
                            allButtons.get(count).setImageResource(R.drawable.pink48);
                        } else if (ageTableFive[column] == 49) {
                            allButtons.get(count).setImageResource(R.drawable.pink49);
                        } else if (ageTableFive[column] == 50) {
                            allButtons.get(count).setImageResource(R.drawable.pink50);
                        } else if (ageTableFive[column] == 51) {
                            allButtons.get(count).setImageResource(R.drawable.pink51);
                        } else if (ageTableFive[column] == 52) {
                            allButtons.get(count).setImageResource(R.drawable.pink52);
                        } else if (ageTableFive[column] == 53) {
                            allButtons.get(count).setImageResource(R.drawable.pink53);
                        } else if (ageTableFive[column] == 54) {
                            allButtons.get(count).setImageResource(R.drawable.pink54);
                        } else if (ageTableFive[column] == 55) {
                            allButtons.get(count).setImageResource(R.drawable.pink55);
                        } else if (ageTableFive[column] == 56) {
                            allButtons.get(count).setImageResource(R.drawable.pink56);
                        } else if (ageTableFive[column] == 57) {
                            allButtons.get(count).setImageResource(R.drawable.pink57);
                        } else if (ageTableFive[column] == 58) {
                            allButtons.get(count).setImageResource(R.drawable.pink58);
                        } else if (ageTableFive[column] == 59) {
                            allButtons.get(count).setImageResource(R.drawable.pink59);
                        } else if (ageTableFive[column] == 60) {
                            allButtons.get(count).setImageResource(R.drawable.pink60);
                        } else if (ageTableFive[column] == 61) {
                            allButtons.get(count).setImageResource(R.drawable.pink61);
                        } else if (ageTableFive[column] == 62) {
                            allButtons.get(count).setImageResource(R.drawable.pink62);
                        } else if (ageTableFive[column] == 63) {
                            allButtons.get(count).setImageResource(R.drawable.pink63);
                        } else if (ageTableFive[column] == 64) {
                            allButtons.get(count).setImageResource(R.drawable.pink64);
                        } else if (ageTableFive[column] == 65) {
                            allButtons.get(count).setImageResource(R.drawable.pink65);
                        } else if (ageTableFive[column] == 66) {
                            allButtons.get(count).setImageResource(R.drawable.pink66);
                        } else if (ageTableFive[column] == 67) {
                            allButtons.get(count).setImageResource(R.drawable.pink67);
                        } else if (ageTableFive[column] == 68) {
                            allButtons.get(count).setImageResource(R.drawable.pink68);
                        } else if (ageTableFive[column] == 69) {
                            allButtons.get(count).setImageResource(R.drawable.pink69);
                        } else if (ageTableFive[column] == 70) {
                            allButtons.get(count).setImageResource(R.drawable.pink70);
                        } else if (ageTableFive[column] == 71) {
                            allButtons.get(count).setImageResource(R.drawable.pink71);
                        } else if (ageTableFive[column] == 72) {
                            allButtons.get(count).setImageResource(R.drawable.pink72);
                        } else if (ageTableFive[column] == 73) {
                            allButtons.get(count).setImageResource(R.drawable.pink73);
                        } else if (ageTableFive[column] == 74) {
                            allButtons.get(count).setImageResource(R.drawable.pink74);
                        } else if (ageTableFive[column] == 75) {
                            allButtons.get(count).setImageResource(R.drawable.pink75);
                        } else if (ageTableFive[column] == 76) {
                            allButtons.get(count).setImageResource(R.drawable.pink76);
                        } else if (ageTableFive[column] == 77) {
                            allButtons.get(count).setImageResource(R.drawable.pink77);
                        } else if (ageTableFive[column] == 78) {
                            allButtons.get(count).setImageResource(R.drawable.pink78);
                        } else if (ageTableFive[column] == 79) {
                            allButtons.get(count).setImageResource(R.drawable.pink79);
                        } else if (ageTableFive[column] == 80) {
                            allButtons.get(count).setImageResource(R.drawable.pink80);
                        } else if (ageTableFive[column] == 81) {
                            allButtons.get(count).setImageResource(R.drawable.pink81);
                        } else if (ageTableFive[column] == 82) {
                            allButtons.get(count).setImageResource(R.drawable.pink82);
                        } else if (ageTableFive[column] == 83) {
                            allButtons.get(count).setImageResource(R.drawable.pink83);
                        } else if (ageTableFive[column] == 84) {
                            allButtons.get(count).setImageResource(R.drawable.pink84);
                        } else if (ageTableFive[column] == 85) {
                            allButtons.get(count).setImageResource(R.drawable.pink85);
                        } else if (ageTableFive[column] == 86) {
                            allButtons.get(count).setImageResource(R.drawable.pink86);
                        } else if (ageTableFive[column] == 87) {
                            allButtons.get(count).setImageResource(R.drawable.pink87);
                        } else if (ageTableFive[column] == 88) {
                            allButtons.get(count).setImageResource(R.drawable.pink88);
                        } else if (ageTableFive[column] == 89) {
                            allButtons.get(count).setImageResource(R.drawable.pink89);
                        } else if (ageTableFive[column] == 90) {
                            allButtons.get(count).setImageResource(R.drawable.pink90);
                        } else if (ageTableFive[column] == 91) {
                            allButtons.get(count).setImageResource(R.drawable.pink91);
                        } else if (ageTableFive[column] == 92) {
                            allButtons.get(count).setImageResource(R.drawable.pink92);
                        } else if (ageTableFive[column] == 93) {
                            allButtons.get(count).setImageResource(R.drawable.pink93);
                        } else if (ageTableFive[column] == 94) {
                            allButtons.get(count).setImageResource(R.drawable.pink94);
                        } else if (ageTableFive[column] == 95) {
                            allButtons.get(count).setImageResource(R.drawable.pink95);
                        } else if (ageTableFive[column] == 96) {
                            allButtons.get(count).setImageResource(R.drawable.pink96);
                        } else if (ageTableFive[column] == 97) {
                            allButtons.get(count).setImageResource(R.drawable.pink97);
                        } else if (ageTableFive[column] == 98) {
                            allButtons.get(count).setImageResource(R.drawable.pink98);
                        } else if (ageTableFive[column] == 99) {
                            allButtons.get(count).setImageResource(R.drawable.pink99);
                        }
                        if (ageConditionFour.get(d) == ageConditionFour.get(itemCount - 1)) {
                            break mainLoopFive;
                        }


                    }
                    System.out.println("");


                }
                if (pls == 0) {
                    yes4.setVisibility(View.GONE);
                    no4.setVisibility(View.GONE);
                    yes5.setVisibility(View.VISIBLE);
                    no5.setVisibility(View.VISIBLE);
                }
            }


        };
        no4.setOnClickListener(listener4);
        yes4.setOnClickListener(listener4);


        final ArrayList<Integer> ageConditionFive = new ArrayList<Integer>();
        View.OnClickListener listener5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pls = 0;
                if (view.equals(yes5) || view.equals(no5)) {
                    for (int w = 0; w < allButtons.size(); w++) {
                        allButtons.get(w).setImageResource(android.R.color.transparent);

                    }
                    if (view.equals(yes5)) {
                        int occurence, occurenceTwo;
                        int frequency = 0;
                        for (int i = 0; i < 99; i++) {
                            frequency = age.get(i);
                            occurence = Collections.frequency(ageConditionFour, frequency);
                            occurenceTwo = Collections.frequency(ageNull, frequency);
                            if (occurence == 0 && occurenceTwo == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no5.setVisibility(View.GONE);
                                    yes5.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }

                                }
                            }

                        }

                    } else if (view.equals(no5)) {
                        int occurence;
                        int frequency = 0;
                        for (int i = 0; i < ageConditionFour.size(); i++) {
                            frequency = ageConditionFour.get(i);
                            occurence = Collections.frequency(ageNull, frequency);
                            if (occurence == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no5.setVisibility(View.GONE);
                                    yes5.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }

                                }
                            }

                        }

                    }

                    int[] ageTableSix = new int[55];
                    random[0] = 0;
                    cnt[0] = 0;
                    for (int i = 0; i <= 99; i++) {
                        random[0] = (int) (Math.random() * 2) + 1;
                        if (random[0] == 1) {
                            ageConditionFive.add(age.get(i));
                            cnt[0]++;
                        }
                    }
                    int columnSize = 0;
                    int itemCount = ageConditionFive.size();
                    if (itemCount > 50) {
                        columnSize = 54;
                    } else {
                        columnSize = 54;
                    }
                    int d = 0;
                    System.out.println("\n");
                    turnCounter.setImageResource(R.drawable.sixthturn);

                    gameCounter[0]++;
                    int count = 0;
                    mainLoopSix:
                    for (int column = 0; column <= columnSize; column++, d++, count++) {

                        ageTableSix[column] = ageConditionFive.get(d);
                        System.out.print(ageTableSix[column] + " ");
                        if (ageTableSix[column] == 1) {
                            allButtons.get(count).setImageResource(R.drawable.purple1);
                        } else if (ageTableSix[column] == 2) {
                            allButtons.get(count).setImageResource(R.drawable.purple2);
                        } else if (ageTableSix[column] == 3) {
                            allButtons.get(count).setImageResource(R.drawable.purple3);
                        } else if (ageTableSix[column] == 4) {
                            allButtons.get(count).setImageResource(R.drawable.purple4);
                        } else if (ageTableSix[column] == 5) {
                            allButtons.get(count).setImageResource(R.drawable.purple5);
                        } else if (ageTableSix[column] == 6) {
                            allButtons.get(count).setImageResource(R.drawable.purple6);
                        } else if (ageTableSix[column] == 7) {
                            allButtons.get(count).setImageResource(R.drawable.purple7);
                        } else if (ageTableSix[column] == 8) {
                            allButtons.get(count).setImageResource(R.drawable.purple8);
                        } else if (ageTableSix[column] == 9) {
                            allButtons.get(count).setImageResource(R.drawable.purple9);
                        } else if (ageTableSix[column] == 10) {
                            allButtons.get(count).setImageResource(R.drawable.purple10);
                        } else if (ageTableSix[column] == 11) {
                            allButtons.get(count).setImageResource(R.drawable.purple11);
                        } else if (ageTableSix[column] == 12) {
                            allButtons.get(count).setImageResource(R.drawable.purple12);
                        } else if (ageTableSix[column] == 13) {
                            allButtons.get(count).setImageResource(R.drawable.purple13);
                        } else if (ageTableSix[column] == 14) {
                            allButtons.get(count).setImageResource(R.drawable.purple14);
                        } else if (ageTableSix[column] == 15) {
                            allButtons.get(count).setImageResource(R.drawable.purple15);
                        } else if (ageTableSix[column] == 16) {
                            allButtons.get(count).setImageResource(R.drawable.purple16);
                        } else if (ageTableSix[column] == 17) {
                            allButtons.get(count).setImageResource(R.drawable.purple17);
                        } else if (ageTableSix[column] == 18) {
                            allButtons.get(count).setImageResource(R.drawable.purple18);
                        } else if (ageTableSix[column] == 19) {
                            allButtons.get(count).setImageResource(R.drawable.purple19);
                        } else if (ageTableSix[column] == 20) {
                            allButtons.get(count).setImageResource(R.drawable.purple20);
                        } else if (ageTableSix[column] == 21) {
                            allButtons.get(count).setImageResource(R.drawable.purple21);
                        } else if (ageTableSix[column] == 22) {
                            allButtons.get(count).setImageResource(R.drawable.purple22);
                        } else if (ageTableSix[column] == 23) {
                            allButtons.get(count).setImageResource(R.drawable.purple23);
                        } else if (ageTableSix[column] == 24) {
                            allButtons.get(count).setImageResource(R.drawable.purple24);
                        } else if (ageTableSix[column] == 25) {
                            allButtons.get(count).setImageResource(R.drawable.purple25);
                        } else if (ageTableSix[column] == 26) {
                            allButtons.get(count).setImageResource(R.drawable.purple26);
                        } else if (ageTableSix[column] == 27) {
                            allButtons.get(count).setImageResource(R.drawable.purple27);
                        } else if (ageTableSix[column] == 28) {
                            allButtons.get(count).setImageResource(R.drawable.purple28);
                        } else if (ageTableSix[column] == 29) {
                            allButtons.get(count).setImageResource(R.drawable.purple29);
                        } else if (ageTableSix[column] == 30) {
                            allButtons.get(count).setImageResource(R.drawable.purple30);
                        } else if (ageTableSix[column] == 31) {
                            allButtons.get(count).setImageResource(R.drawable.purple31);
                        } else if (ageTableSix[column] == 32) {
                            allButtons.get(count).setImageResource(R.drawable.purple32);
                        } else if (ageTableSix[column] == 33) {
                            allButtons.get(count).setImageResource(R.drawable.purple33);
                        } else if (ageTableSix[column] == 34) {
                            allButtons.get(count).setImageResource(R.drawable.purple34);
                        } else if (ageTableSix[column] == 35) {
                            allButtons.get(count).setImageResource(R.drawable.purple35);
                        } else if (ageTableSix[column] == 36) {
                            allButtons.get(count).setImageResource(R.drawable.purple36);
                        } else if (ageTableSix[column] == 37) {
                            allButtons.get(count).setImageResource(R.drawable.purple37);
                        } else if (ageTableSix[column] == 38) {
                            allButtons.get(count).setImageResource(R.drawable.purple38);
                        } else if (ageTableSix[column] == 39) {
                            allButtons.get(count).setImageResource(R.drawable.purple39);
                        } else if (ageTableSix[column] == 40) {
                            allButtons.get(count).setImageResource(R.drawable.purple40);
                        } else if (ageTableSix[column] == 41) {
                            allButtons.get(count).setImageResource(R.drawable.purple41);
                        } else if (ageTableSix[column] == 42) {
                            allButtons.get(count).setImageResource(R.drawable.purple42);
                        } else if (ageTableSix[column] == 43) {
                            allButtons.get(count).setImageResource(R.drawable.purple43);
                        } else if (ageTableSix[column] == 44) {
                            allButtons.get(count).setImageResource(R.drawable.purple44);
                        } else if (ageTableSix[column] == 45) {
                            allButtons.get(count).setImageResource(R.drawable.purple45);
                        } else if (ageTableSix[column] == 46) {
                            allButtons.get(count).setImageResource(R.drawable.purple46);
                        } else if (ageTableSix[column] == 47) {
                            allButtons.get(count).setImageResource(R.drawable.purple47);
                        } else if (ageTableSix[column] == 48) {
                            allButtons.get(count).setImageResource(R.drawable.purple48);
                        } else if (ageTableSix[column] == 49) {
                            allButtons.get(count).setImageResource(R.drawable.purple49);
                        } else if (ageTableSix[column] == 50) {
                            allButtons.get(count).setImageResource(R.drawable.purple50);
                        } else if (ageTableSix[column] == 51) {
                            allButtons.get(count).setImageResource(R.drawable.purple51);
                        } else if (ageTableSix[column] == 52) {
                            allButtons.get(count).setImageResource(R.drawable.purple52);
                        } else if (ageTableSix[column] == 53) {
                            allButtons.get(count).setImageResource(R.drawable.purple53);
                        } else if (ageTableSix[column] == 54) {
                            allButtons.get(count).setImageResource(R.drawable.purple54);
                        } else if (ageTableSix[column] == 55) {
                            allButtons.get(count).setImageResource(R.drawable.purple55);
                        } else if (ageTableSix[column] == 56) {
                            allButtons.get(count).setImageResource(R.drawable.purple56);
                        } else if (ageTableSix[column] == 57) {
                            allButtons.get(count).setImageResource(R.drawable.purple57);
                        } else if (ageTableSix[column] == 58) {
                            allButtons.get(count).setImageResource(R.drawable.purple58);
                        } else if (ageTableSix[column] == 59) {
                            allButtons.get(count).setImageResource(R.drawable.purple59);
                        } else if (ageTableSix[column] == 60) {
                            allButtons.get(count).setImageResource(R.drawable.purple60);
                        } else if (ageTableSix[column] == 61) {
                            allButtons.get(count).setImageResource(R.drawable.purple61);
                        } else if (ageTableSix[column] == 62) {
                            allButtons.get(count).setImageResource(R.drawable.purple62);
                        } else if (ageTableSix[column] == 63) {
                            allButtons.get(count).setImageResource(R.drawable.purple63);
                        } else if (ageTableSix[column] == 64) {
                            allButtons.get(count).setImageResource(R.drawable.purple64);
                        } else if (ageTableSix[column] == 65) {
                            allButtons.get(count).setImageResource(R.drawable.purple65);
                        } else if (ageTableSix[column] == 66) {
                            allButtons.get(count).setImageResource(R.drawable.purple66);
                        } else if (ageTableSix[column] == 67) {
                            allButtons.get(count).setImageResource(R.drawable.purple67);
                        } else if (ageTableSix[column] == 68) {
                            allButtons.get(count).setImageResource(R.drawable.purple68);
                        } else if (ageTableSix[column] == 69) {
                            allButtons.get(count).setImageResource(R.drawable.purple69);
                        } else if (ageTableSix[column] == 70) {
                            allButtons.get(count).setImageResource(R.drawable.purple70);
                        } else if (ageTableSix[column] == 71) {
                            allButtons.get(count).setImageResource(R.drawable.purple71);
                        } else if (ageTableSix[column] == 72) {
                            allButtons.get(count).setImageResource(R.drawable.purple72);
                        } else if (ageTableSix[column] == 73) {
                            allButtons.get(count).setImageResource(R.drawable.purple73);
                        } else if (ageTableSix[column] == 74) {
                            allButtons.get(count).setImageResource(R.drawable.purple74);
                        } else if (ageTableSix[column] == 75) {
                            allButtons.get(count).setImageResource(R.drawable.purple75);
                        } else if (ageTableSix[column] == 76) {
                            allButtons.get(count).setImageResource(R.drawable.purple76);
                        } else if (ageTableSix[column] == 77) {
                            allButtons.get(count).setImageResource(R.drawable.purple77);
                        } else if (ageTableSix[column] == 78) {
                            allButtons.get(count).setImageResource(R.drawable.purple78);
                        } else if (ageTableSix[column] == 79) {
                            allButtons.get(count).setImageResource(R.drawable.purple79);
                        } else if (ageTableSix[column] == 80) {
                            allButtons.get(count).setImageResource(R.drawable.purple80);
                        } else if (ageTableSix[column] == 81) {
                            allButtons.get(count).setImageResource(R.drawable.purple81);
                        } else if (ageTableSix[column] == 82) {
                            allButtons.get(count).setImageResource(R.drawable.purple82);
                        } else if (ageTableSix[column] == 83) {
                            allButtons.get(count).setImageResource(R.drawable.purple83);
                        } else if (ageTableSix[column] == 84) {
                            allButtons.get(count).setImageResource(R.drawable.purple84);
                        } else if (ageTableSix[column] == 85) {
                            allButtons.get(count).setImageResource(R.drawable.purple85);
                        } else if (ageTableSix[column] == 86) {
                            allButtons.get(count).setImageResource(R.drawable.purple86);
                        } else if (ageTableSix[column] == 87) {
                            allButtons.get(count).setImageResource(R.drawable.purple87);
                        } else if (ageTableSix[column] == 88) {
                            allButtons.get(count).setImageResource(R.drawable.purple88);
                        } else if (ageTableSix[column] == 89) {
                            allButtons.get(count).setImageResource(R.drawable.purple89);
                        } else if (ageTableSix[column] == 90) {
                            allButtons.get(count).setImageResource(R.drawable.purple90);
                        } else if (ageTableSix[column] == 91) {
                            allButtons.get(count).setImageResource(R.drawable.purple91);
                        } else if (ageTableSix[column] == 92) {
                            allButtons.get(count).setImageResource(R.drawable.purple92);
                        } else if (ageTableSix[column] == 93) {
                            allButtons.get(count).setImageResource(R.drawable.purple93);
                        } else if (ageTableSix[column] == 94) {
                            allButtons.get(count).setImageResource(R.drawable.purple94);
                        } else if (ageTableSix[column] == 95) {
                            allButtons.get(count).setImageResource(R.drawable.purple95);
                        } else if (ageTableSix[column] == 96) {
                            allButtons.get(count).setImageResource(R.drawable.purple96);
                        } else if (ageTableSix[column] == 97) {
                            allButtons.get(count).setImageResource(R.drawable.purple97);
                        } else if (ageTableSix[column] == 98) {
                            allButtons.get(count).setImageResource(R.drawable.purple98);
                        } else if (ageTableSix[column] == 99) {
                            allButtons.get(count).setImageResource(R.drawable.purple99);
                        }
                        if (ageConditionFive.get(d) == ageConditionFive.get(itemCount - 1)) {
                            break mainLoopSix;
                        }


                    }


                    if (pls == 0) {
                        no5.setVisibility(View.GONE);
                        yes5.setVisibility(View.GONE);
                        no6.setVisibility(View.VISIBLE);
                        yes6.setVisibility(View.VISIBLE);

                    }
                }

            }


        };
        no5.setOnClickListener(listener5);
        yes5.setOnClickListener(listener5);


        final ArrayList<Integer> ageConditionSix = new ArrayList<Integer>();
        View.OnClickListener listener6 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pls = 0;
                if (view.equals(yes6) || view.equals(no6)) {
                    for (int w = 0; w < allButtons.size(); w++) {
                        allButtons.get(w).setImageResource(android.R.color.transparent);

                    }
                    if (view.equals(yes6)) {
                        int occurence, occurenceTwo;
                        int frequency = 0;
                        for (int i = 0; i < 99; i++) {
                            frequency = age.get(i);
                            occurence = Collections.frequency(ageConditionFive, frequency);
                            occurenceTwo = Collections.frequency(ageNull, frequency);
                            if (occurence == 0 && occurenceTwo == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no6.setVisibility(View.GONE);
                                    yes6.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }

                    } else if (view.equals(no6)) {
                        int occurence;
                        int frequency = 0;
                        for (int i = 0; i < ageConditionFive.size(); i++) {
                            frequency = ageConditionFive.get(i);
                            occurence = Collections.frequency(ageNull, frequency);
                            if (occurence == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no6.setVisibility(View.GONE);
                                    yes6.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }

                    }


                    int[] ageTableSeven = new int[55];
                    random[0] = 0;
                    cnt[0] = 0;
                    for (int i = 0; i <= 99; i++) {
                        random[0] = (int) (Math.random() * 2) + 1;
                        if (random[0] == 1) {
                            ageConditionSix.add(age.get(i));
                            cnt[0]++;
                        }
                    }
                    int columnSize = 0;
                    int itemCount = ageConditionSix.size();
                    if (itemCount > 50) {
                        columnSize = 54;
                    } else {
                        columnSize = 54;
                    }
                    int d = 0;
                    System.out.println("\n");
                    turnCounter.setImageResource(R.drawable.seventhturn);

                    gameCounter[0]++;

                    int count = 0;
                    mainLoopSeven:
                    for (int column = 0; column <= columnSize; column++, d++, count++) {

                        ageTableSeven[column] = ageConditionSix.get(d);
                        System.out.print(ageTableSeven[column] + " ");
                        if (ageTableSeven[column] == 1) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen1);
                        } else if (ageTableSeven[column] == 2) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen2);
                        } else if (ageTableSeven[column] == 3) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen3);
                        } else if (ageTableSeven[column] == 4) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen4);
                        } else if (ageTableSeven[column] == 5) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen5);
                        } else if (ageTableSeven[column] == 6) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen6);
                        } else if (ageTableSeven[column] == 7) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen7);
                        } else if (ageTableSeven[column] == 8) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen8);
                        } else if (ageTableSeven[column] == 9) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen9);
                        } else if (ageTableSeven[column] == 10) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen10);
                        } else if (ageTableSeven[column] == 11) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen11);
                        } else if (ageTableSeven[column] == 12) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen12);
                        } else if (ageTableSeven[column] == 13) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen13);
                        } else if (ageTableSeven[column] == 14) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen14);
                        } else if (ageTableSeven[column] == 15) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen15);
                        } else if (ageTableSeven[column] == 16) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen16);
                        } else if (ageTableSeven[column] == 17) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen17);
                        } else if (ageTableSeven[column] == 18) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen18);
                        } else if (ageTableSeven[column] == 19) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen19);
                        } else if (ageTableSeven[column] == 20) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen20);
                        } else if (ageTableSeven[column] == 21) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen21);
                        } else if (ageTableSeven[column] == 22) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen22);
                        } else if (ageTableSeven[column] == 23) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen23);
                        } else if (ageTableSeven[column] == 24) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen24);
                        } else if (ageTableSeven[column] == 25) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen25);
                        } else if (ageTableSeven[column] == 26) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen26);
                        } else if (ageTableSeven[column] == 27) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen27);
                        } else if (ageTableSeven[column] == 28) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen28);
                        } else if (ageTableSeven[column] == 29) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen29);
                        } else if (ageTableSeven[column] == 30) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen30);
                        } else if (ageTableSeven[column] == 31) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen31);
                        } else if (ageTableSeven[column] == 32) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen32);
                        } else if (ageTableSeven[column] == 33) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen33);
                        } else if (ageTableSeven[column] == 34) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen34);
                        } else if (ageTableSeven[column] == 35) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen35);
                        } else if (ageTableSeven[column] == 36) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen36);
                        } else if (ageTableSeven[column] == 37) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen37);
                        } else if (ageTableSeven[column] == 38) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen38);
                        } else if (ageTableSeven[column] == 39) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen39);
                        } else if (ageTableSeven[column] == 40) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen40);
                        } else if (ageTableSeven[column] == 41) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen41);
                        } else if (ageTableSeven[column] == 42) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen42);
                        } else if (ageTableSeven[column] == 43) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen43);
                        } else if (ageTableSeven[column] == 44) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen44);
                        } else if (ageTableSeven[column] == 45) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen45);
                        } else if (ageTableSeven[column] == 46) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen46);
                        } else if (ageTableSeven[column] == 47) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen47);
                        } else if (ageTableSeven[column] == 48) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen48);
                        } else if (ageTableSeven[column] == 49) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen49);
                        } else if (ageTableSeven[column] == 50) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen50);
                        } else if (ageTableSeven[column] == 51) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen51);
                        } else if (ageTableSeven[column] == 52) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen52);
                        } else if (ageTableSeven[column] == 53) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen53);
                        } else if (ageTableSeven[column] == 54) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen54);
                        } else if (ageTableSeven[column] == 55) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen55);
                        } else if (ageTableSeven[column] == 56) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen56);
                        } else if (ageTableSeven[column] == 57) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen57);
                        } else if (ageTableSeven[column] == 58) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen58);
                        } else if (ageTableSeven[column] == 59) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen59);
                        } else if (ageTableSeven[column] == 60) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen60);
                        } else if (ageTableSeven[column] == 61) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen61);
                        } else if (ageTableSeven[column] == 62) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen62);
                        } else if (ageTableSeven[column] == 63) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen63);
                        } else if (ageTableSeven[column] == 64) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen64);
                        } else if (ageTableSeven[column] == 65) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen65);
                        } else if (ageTableSeven[column] == 66) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen66);
                        } else if (ageTableSeven[column] == 67) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen67);
                        } else if (ageTableSeven[column] == 68) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen68);
                        } else if (ageTableSeven[column] == 69) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen69);
                        } else if (ageTableSeven[column] == 70) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen70);
                        } else if (ageTableSeven[column] == 71) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen71);
                        } else if (ageTableSeven[column] == 72) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen72);
                        } else if (ageTableSeven[column] == 73) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen73);
                        } else if (ageTableSeven[column] == 74) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen74);
                        } else if (ageTableSeven[column] == 75) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen75);
                        } else if (ageTableSeven[column] == 76) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen76);
                        } else if (ageTableSeven[column] == 77) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen77);
                        } else if (ageTableSeven[column] == 78) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen78);
                        } else if (ageTableSeven[column] == 79) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen79);
                        } else if (ageTableSeven[column] == 80) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen80);
                        } else if (ageTableSeven[column] == 81) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen81);
                        } else if (ageTableSeven[column] == 82) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen82);
                        } else if (ageTableSeven[column] == 83) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen83);
                        } else if (ageTableSeven[column] == 84) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen84);
                        } else if (ageTableSeven[column] == 85) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen85);
                        } else if (ageTableSeven[column] == 86) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen86);
                        } else if (ageTableSeven[column] == 87) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen87);
                        } else if (ageTableSeven[column] == 88) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen88);
                        } else if (ageTableSeven[column] == 89) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen89);
                        } else if (ageTableSeven[column] == 90) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen90);
                        } else if (ageTableSeven[column] == 91) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen91);
                        } else if (ageTableSeven[column] == 92) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen92);
                        } else if (ageTableSeven[column] == 93) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen93);
                        } else if (ageTableSeven[column] == 94) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen94);
                        } else if (ageTableSeven[column] == 95) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen95);
                        } else if (ageTableSeven[column] == 96) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen96);
                        } else if (ageTableSeven[column] == 97) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen97);
                        } else if (ageTableSeven[column] == 98) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen98);
                        } else if (ageTableSeven[column] == 99) {
                            allButtons.get(count).setImageResource(R.drawable.darkergreen99);
                        }
                        if (ageConditionSix.get(d) == ageConditionSix.get(itemCount - 1)) {
                            break mainLoopSeven;
                        }


                    }
                    System.out.println("");
                    if (pls == 0) {
                        yes6.setVisibility(View.GONE);
                        no6.setVisibility(View.GONE);
                        yes7.setVisibility(View.VISIBLE);
                        no7.setVisibility(View.VISIBLE);
                    }


                }

            }


        };
        no6.setOnClickListener(listener6);
        yes6.setOnClickListener(listener6);

        final ArrayList<Integer> ageConditionSeven = new ArrayList<Integer>();
        View.OnClickListener listener7 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pls = 0;
                if (view.equals(yes7) || view.equals(no7)) {
                    for (int w = 0; w < allButtons.size(); w++) {
                        allButtons.get(w).setImageResource(android.R.color.transparent);

                    }
                    if (view.equals(yes7)) {
                        int occurence, occurenceTwo;
                        int frequency = 0;
                        for (int i = 0; i < 99; i++) {
                            frequency = age.get(i);
                            occurence = Collections.frequency(ageConditionSix, frequency);
                            occurenceTwo = Collections.frequency(ageNull, frequency);
                            if (occurence == 0 && occurenceTwo == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no7.setVisibility(View.GONE);
                                    yes7.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }

                    } else if (view.equals(no7)) {
                        int occurence;
                        int frequency = 0;
                        for (int i = 0; i < ageConditionSix.size(); i++) {
                            frequency = ageConditionSix.get(i);
                            occurence = Collections.frequency(ageNull, frequency);
                            if (occurence == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    no7.setVisibility(View.GONE);
                                    yes7.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }

                    }
                    itemCountTotal[0] = ageNull.size();
                    if (itemCountTotal[0] == 99) {
                        int totalFrequency = 0;

                        for (int i = 0; i <= 99; i++) {
                            totalFrequency = age.get(i);
                            int finalTotal = Collections.frequency(ageNull, totalFrequency);
                            if (finalTotal == 0) {
                                Intent myIntent = new Intent(MainActivity.this, win.class);
                                myIntent.putExtra("intVariableName", totalFrequency);
                                myIntent.putExtra("intScore", gameCounter[0]);
                                startActivity(myIntent);

                                pls++;
                                for (int w = 0; w < allButtons.size(); w++) {
                                    allButtons.get(w).setImageResource(android.R.color.transparent);

                                }

                            }
                        }

                    }

                    int[] ageTableEight = new int[55];
                    random[0] = 0;
                    cnt[0] = 0;
                    for (int i = 0; i <= 99; i++) {
                        random[0] = (int) (Math.random() * 2) + 1;
                        if (random[0] == 1) {
                            ageConditionSeven.add(age.get(i));
                            cnt[0]++;
                        }
                    }
                    int columnSize = 0;
                    int itemCount = ageConditionSeven.size();
                    if (itemCount > 50) {
                        columnSize = 54;
                    } else {
                        columnSize = 54;
                    }
                    int d = 0;
                    int count = 0;

                    System.out.println("\n");
                    turnCounter.setImageResource(R.drawable.eighthturn);

                    gameCounter[0]++;

                    mainLoopEight:
                    for (int column = 0; column <= columnSize; column++, d++, count++) {

                        ageTableEight[column] = ageConditionSeven.get(d);
                        System.out.print(ageTableEight[column] + " ");
                        if (ageTableEight[column] == 1) {
                            allButtons.get(count).setImageResource(R.drawable.lavender1);
                        } else if (ageTableEight[column] == 2) {
                            allButtons.get(count).setImageResource(R.drawable.lavender2);
                        } else if (ageTableEight[column] == 3) {
                            allButtons.get(count).setImageResource(R.drawable.lavender3);
                        } else if (ageTableEight[column] == 4) {
                            allButtons.get(count).setImageResource(R.drawable.lavender4);
                        } else if (ageTableEight[column] == 5) {
                            allButtons.get(count).setImageResource(R.drawable.lavender5);
                        } else if (ageTableEight[column] == 6) {
                            allButtons.get(count).setImageResource(R.drawable.lavender6);
                        } else if (ageTableEight[column] == 7) {
                            allButtons.get(count).setImageResource(R.drawable.lavender7);
                        } else if (ageTableEight[column] == 8) {
                            allButtons.get(count).setImageResource(R.drawable.lavender8);
                        } else if (ageTableEight[column] == 9) {
                            allButtons.get(count).setImageResource(R.drawable.lavender9);
                        } else if (ageTableEight[column] == 10) {
                            allButtons.get(count).setImageResource(R.drawable.lavender10);
                        } else if (ageTableEight[column] == 11) {
                            allButtons.get(count).setImageResource(R.drawable.lavender11);
                        } else if (ageTableEight[column] == 12) {
                            allButtons.get(count).setImageResource(R.drawable.lavender12);
                        } else if (ageTableEight[column] == 13) {
                            allButtons.get(count).setImageResource(R.drawable.lavender13);
                        } else if (ageTableEight[column] == 14) {
                            allButtons.get(count).setImageResource(R.drawable.lavender14);
                        } else if (ageTableEight[column] == 15) {
                            allButtons.get(count).setImageResource(R.drawable.lavender15);
                        } else if (ageTableEight[column] == 16) {
                            allButtons.get(count).setImageResource(R.drawable.lavender16);
                        } else if (ageTableEight[column] == 17) {
                            allButtons.get(count).setImageResource(R.drawable.lavender17);
                        } else if (ageTableEight[column] == 18) {
                            allButtons.get(count).setImageResource(R.drawable.lavender18);
                        } else if (ageTableEight[column] == 19) {
                            allButtons.get(count).setImageResource(R.drawable.lavender19);
                        } else if (ageTableEight[column] == 20) {
                            allButtons.get(count).setImageResource(R.drawable.lavender20);
                        } else if (ageTableEight[column] == 21) {
                            allButtons.get(count).setImageResource(R.drawable.lavender21);
                        } else if (ageTableEight[column] == 22) {
                            allButtons.get(count).setImageResource(R.drawable.lavender22);
                        } else if (ageTableEight[column] == 23) {
                            allButtons.get(count).setImageResource(R.drawable.lavender23);
                        } else if (ageTableEight[column] == 24) {
                            allButtons.get(count).setImageResource(R.drawable.lavender24);
                        } else if (ageTableEight[column] == 25) {
                            allButtons.get(count).setImageResource(R.drawable.lavender25);
                        } else if (ageTableEight[column] == 26) {
                            allButtons.get(count).setImageResource(R.drawable.lavender26);
                        } else if (ageTableEight[column] == 27) {
                            allButtons.get(count).setImageResource(R.drawable.lavender27);
                        } else if (ageTableEight[column] == 28) {
                            allButtons.get(count).setImageResource(R.drawable.lavender28);
                        } else if (ageTableEight[column] == 29) {
                            allButtons.get(count).setImageResource(R.drawable.lavender29);
                        } else if (ageTableEight[column] == 30) {
                            allButtons.get(count).setImageResource(R.drawable.lavender30);
                        } else if (ageTableEight[column] == 31) {
                            allButtons.get(count).setImageResource(R.drawable.lavender31);
                        } else if (ageTableEight[column] == 32) {
                            allButtons.get(count).setImageResource(R.drawable.lavender32);
                        } else if (ageTableEight[column] == 33) {
                            allButtons.get(count).setImageResource(R.drawable.lavender33);
                        } else if (ageTableEight[column] == 34) {
                            allButtons.get(count).setImageResource(R.drawable.lavender34);
                        } else if (ageTableEight[column] == 35) {
                            allButtons.get(count).setImageResource(R.drawable.lavender35);
                        } else if (ageTableEight[column] == 36) {
                            allButtons.get(count).setImageResource(R.drawable.lavender36);
                        } else if (ageTableEight[column] == 37) {
                            allButtons.get(count).setImageResource(R.drawable.lavender37);
                        } else if (ageTableEight[column] == 38) {
                            allButtons.get(count).setImageResource(R.drawable.lavender38);
                        } else if (ageTableEight[column] == 39) {
                            allButtons.get(count).setImageResource(R.drawable.lavender39);
                        } else if (ageTableEight[column] == 40) {
                            allButtons.get(count).setImageResource(R.drawable.lavender40);
                        } else if (ageTableEight[column] == 41) {
                            allButtons.get(count).setImageResource(R.drawable.lavender41);
                        } else if (ageTableEight[column] == 42) {
                            allButtons.get(count).setImageResource(R.drawable.lavender42);
                        } else if (ageTableEight[column] == 43) {
                            allButtons.get(count).setImageResource(R.drawable.lavender43);
                        } else if (ageTableEight[column] == 44) {
                            allButtons.get(count).setImageResource(R.drawable.lavender44);
                        } else if (ageTableEight[column] == 45) {
                            allButtons.get(count).setImageResource(R.drawable.lavender45);
                        } else if (ageTableEight[column] == 46) {
                            allButtons.get(count).setImageResource(R.drawable.lavender46);
                        } else if (ageTableEight[column] == 47) {
                            allButtons.get(count).setImageResource(R.drawable.lavender47);
                        } else if (ageTableEight[column] == 48) {
                            allButtons.get(count).setImageResource(R.drawable.lavender48);
                        } else if (ageTableEight[column] == 49) {
                            allButtons.get(count).setImageResource(R.drawable.lavender49);
                        } else if (ageTableEight[column] == 50) {
                            allButtons.get(count).setImageResource(R.drawable.lavender50);
                        } else if (ageTableEight[column] == 51) {
                            allButtons.get(count).setImageResource(R.drawable.lavender51);
                        } else if (ageTableEight[column] == 52) {
                            allButtons.get(count).setImageResource(R.drawable.lavender52);
                        } else if (ageTableEight[column] == 53) {
                            allButtons.get(count).setImageResource(R.drawable.lavender53);
                        } else if (ageTableEight[column] == 54) {
                            allButtons.get(count).setImageResource(R.drawable.lavender54);
                        } else if (ageTableEight[column] == 55) {
                            allButtons.get(count).setImageResource(R.drawable.lavender55);
                        } else if (ageTableEight[column] == 56) {
                            allButtons.get(count).setImageResource(R.drawable.lavender56);
                        } else if (ageTableEight[column] == 57) {
                            allButtons.get(count).setImageResource(R.drawable.lavender57);
                        } else if (ageTableEight[column] == 58) {
                            allButtons.get(count).setImageResource(R.drawable.lavender58);
                        } else if (ageTableEight[column] == 59) {
                            allButtons.get(count).setImageResource(R.drawable.lavender59);
                        } else if (ageTableEight[column] == 60) {
                            allButtons.get(count).setImageResource(R.drawable.lavender60);
                        } else if (ageTableEight[column] == 61) {
                            allButtons.get(count).setImageResource(R.drawable.lavender61);
                        } else if (ageTableEight[column] == 62) {
                            allButtons.get(count).setImageResource(R.drawable.lavender62);
                        } else if (ageTableEight[column] == 63) {
                            allButtons.get(count).setImageResource(R.drawable.lavender63);
                        } else if (ageTableEight[column] == 64) {
                            allButtons.get(count).setImageResource(R.drawable.lavender64);
                        } else if (ageTableEight[column] == 65) {
                            allButtons.get(count).setImageResource(R.drawable.lavender65);
                        } else if (ageTableEight[column] == 66) {
                            allButtons.get(count).setImageResource(R.drawable.lavender66);
                        } else if (ageTableEight[column] == 67) {
                            allButtons.get(count).setImageResource(R.drawable.lavender67);
                        } else if (ageTableEight[column] == 68) {
                            allButtons.get(count).setImageResource(R.drawable.lavender68);
                        } else if (ageTableEight[column] == 69) {
                            allButtons.get(count).setImageResource(R.drawable.lavender69);
                        } else if (ageTableEight[column] == 70) {
                            allButtons.get(count).setImageResource(R.drawable.lavender70);
                        } else if (ageTableEight[column] == 71) {
                            allButtons.get(count).setImageResource(R.drawable.lavender71);
                        } else if (ageTableEight[column] == 72) {
                            allButtons.get(count).setImageResource(R.drawable.lavender72);
                        } else if (ageTableEight[column] == 73) {
                            allButtons.get(count).setImageResource(R.drawable.lavender73);
                        } else if (ageTableEight[column] == 74) {
                            allButtons.get(count).setImageResource(R.drawable.lavender74);
                        } else if (ageTableEight[column] == 75) {
                            allButtons.get(count).setImageResource(R.drawable.lavender75);
                        } else if (ageTableEight[column] == 76) {
                            allButtons.get(count).setImageResource(R.drawable.lavender76);
                        } else if (ageTableEight[column] == 77) {
                            allButtons.get(count).setImageResource(R.drawable.lavender77);
                        } else if (ageTableEight[column] == 78) {
                            allButtons.get(count).setImageResource(R.drawable.lavender78);
                        } else if (ageTableEight[column] == 79) {
                            allButtons.get(count).setImageResource(R.drawable.lavender79);
                        } else if (ageTableEight[column] == 80) {
                            allButtons.get(count).setImageResource(R.drawable.lavender80);
                        } else if (ageTableEight[column] == 81) {
                            allButtons.get(count).setImageResource(R.drawable.lavender81);
                        } else if (ageTableEight[column] == 82) {
                            allButtons.get(count).setImageResource(R.drawable.lavender82);
                        } else if (ageTableEight[column] == 83) {
                            allButtons.get(count).setImageResource(R.drawable.lavender83);
                        } else if (ageTableEight[column] == 84) {
                            allButtons.get(count).setImageResource(R.drawable.lavender84);
                        } else if (ageTableEight[column] == 85) {
                            allButtons.get(count).setImageResource(R.drawable.lavender85);
                        } else if (ageTableEight[column] == 86) {
                            allButtons.get(count).setImageResource(R.drawable.lavender86);
                        } else if (ageTableEight[column] == 87) {
                            allButtons.get(count).setImageResource(R.drawable.lavender87);
                        } else if (ageTableEight[column] == 88) {
                            allButtons.get(count).setImageResource(R.drawable.lavender88);
                        } else if (ageTableEight[column] == 89) {
                            allButtons.get(count).setImageResource(R.drawable.lavender89);
                        } else if (ageTableEight[column] == 90) {
                            allButtons.get(count).setImageResource(R.drawable.lavender90);
                        } else if (ageTableEight[column] == 91) {
                            allButtons.get(count).setImageResource(R.drawable.lavender91);
                        } else if (ageTableEight[column] == 92) {
                            allButtons.get(count).setImageResource(R.drawable.lavender92);
                        } else if (ageTableEight[column] == 93) {
                            allButtons.get(count).setImageResource(R.drawable.lavender93);
                        } else if (ageTableEight[column] == 94) {
                            allButtons.get(count).setImageResource(R.drawable.lavender94);
                        } else if (ageTableEight[column] == 95) {
                            allButtons.get(count).setImageResource(R.drawable.lavender95);
                        } else if (ageTableEight[column] == 96) {
                            allButtons.get(count).setImageResource(R.drawable.lavender96);
                        } else if (ageTableEight[column] == 97) {
                            allButtons.get(count).setImageResource(R.drawable.lavender97);
                        } else if (ageTableEight[column] == 98) {
                            allButtons.get(count).setImageResource(R.drawable.lavender98);
                        } else if (ageTableEight[column] == 99) {
                            allButtons.get(count).setImageResource(R.drawable.lavender99);
                        }
                        if (ageConditionSeven.get(d) == ageConditionSeven.get(itemCount - 1)) {
                            break mainLoopEight;
                        }


                    }
                    if (pls == 0) {
                        System.out.println("");
                        yes7.setVisibility(View.GONE);
                        no7.setVisibility(View.GONE);
                        yes8.setVisibility(View.VISIBLE);
                        no8.setVisibility(View.VISIBLE);
                    }


                }

            }


        };
        no7.setOnClickListener(listener7);
        yes7.setOnClickListener(listener7);


        final ArrayList<Integer> ageConditionEight = new ArrayList<Integer>();
        View.OnClickListener listener8 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pls = 0;
                if (view.equals(yes8) || view.equals(no8)) {
                    for (int w = 0; w < allButtons.size(); w++) {
                        allButtons.get(w).setImageResource(android.R.color.transparent);

                    }
                    if (view.equals(yes8)) {
                        int occurence, occurenceTwo;
                        int frequency = 0;
                        for (int i = 0; i < 99; i++) {
                            frequency = age.get(i);
                            occurence = Collections.frequency(ageConditionSeven, frequency);
                            occurenceTwo = Collections.frequency(ageNull, frequency);
                            if (occurence == 0 && occurenceTwo == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);
                                    System.out.println("Your number is " + totalFrequency + ".");
                                    yourNum.setText("Your number is " + totalFrequency + ".");

                                    yes8.setVisibility(View.GONE);
                                    no8.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }

                    } else if (view.equals(no8)) {
                        int occurence;
                        int frequency = 0;
                        for (int i = 0; i < ageConditionSeven.size(); i++) {
                            frequency = ageConditionSeven.get(i);
                            occurence = Collections.frequency(ageNull, frequency);
                            if (occurence == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);
                                    System.out.println("Your number is " + totalFrequency + ".");
                                    yourNum.setText("Your number is " + totalFrequency + ".");

                                    yes8.setVisibility(View.GONE);
                                    no8.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }

                    }

                    int[] ageTableNine = new int[55];
                    random[0] = 0;
                    cnt[0] = 0;
                    for (int i = 0; i <= 99; i++) {
                        random[0] = (int) (Math.random() * 2) + 1;
                        if (random[0] == 1) {
                            ageConditionEight.add(age.get(i));
                            cnt[0]++;
                        }
                    }
                    int columnSize = 0;
                    int itemCount = ageConditionEight.size();
                    if (itemCount > 50) {
                        columnSize = 54;
                    } else {
                        columnSize = 54;
                    }
                    int d = 0;
                    int count = 0;
                    System.out.println("\n");
                    turnCounter.setImageResource(R.drawable.ninthturn);

                    gameCounter[0]++;

                    mainLoopNine:
                    for (int column = 0; column <= columnSize; column++, d++, count++) {

                        ageTableNine[column] = ageConditionEight.get(d);
                        System.out.print(ageTableNine[column] + " ");
                        if (ageTableNine[column] == 1) {
                            allButtons.get(count).setImageResource(R.drawable.r1);
                        } else if (ageTableNine[column] == 2) {
                            allButtons.get(count).setImageResource(R.drawable.r2);
                        } else if (ageTableNine[column] == 3) {
                            allButtons.get(count).setImageResource(R.drawable.r3);
                        } else if (ageTableNine[column] == 4) {
                            allButtons.get(count).setImageResource(R.drawable.r4);
                        } else if (ageTableNine[column] == 5) {
                            allButtons.get(count).setImageResource(R.drawable.r5);
                        } else if (ageTableNine[column] == 6) {
                            allButtons.get(count).setImageResource(R.drawable.r6);
                        } else if (ageTableNine[column] == 7) {
                            allButtons.get(count).setImageResource(R.drawable.r7);
                        } else if (ageTableNine[column] == 8) {
                            allButtons.get(count).setImageResource(R.drawable.r8);
                        } else if (ageTableNine[column] == 9) {
                            allButtons.get(count).setImageResource(R.drawable.r9);
                        } else if (ageTableNine[column] == 10) {
                            allButtons.get(count).setImageResource(R.drawable.r10);
                        } else if (ageTableNine[column] == 11) {
                            allButtons.get(count).setImageResource(R.drawable.r11);
                        } else if (ageTableNine[column] == 12) {
                            allButtons.get(count).setImageResource(R.drawable.r12);
                        } else if (ageTableNine[column] == 13) {
                            allButtons.get(count).setImageResource(R.drawable.r13);
                        } else if (ageTableNine[column] == 14) {
                            allButtons.get(count).setImageResource(R.drawable.r14);
                        } else if (ageTableNine[column] == 15) {
                            allButtons.get(count).setImageResource(R.drawable.r15);
                        } else if (ageTableNine[column] == 16) {
                            allButtons.get(count).setImageResource(R.drawable.r16);
                        } else if (ageTableNine[column] == 17) {
                            allButtons.get(count).setImageResource(R.drawable.r17);
                        } else if (ageTableNine[column] == 18) {
                            allButtons.get(count).setImageResource(R.drawable.r18);
                        } else if (ageTableNine[column] == 19) {
                            allButtons.get(count).setImageResource(R.drawable.r19);
                        } else if (ageTableNine[column] == 20) {
                            allButtons.get(count).setImageResource(R.drawable.r20);
                        } else if (ageTableNine[column] == 21) {
                            allButtons.get(count).setImageResource(R.drawable.r21);
                        } else if (ageTableNine[column] == 22) {
                            allButtons.get(count).setImageResource(R.drawable.r22);
                        } else if (ageTableNine[column] == 23) {
                            allButtons.get(count).setImageResource(R.drawable.r23);
                        } else if (ageTableNine[column] == 24) {
                            allButtons.get(count).setImageResource(R.drawable.r24);
                        } else if (ageTableNine[column] == 25) {
                            allButtons.get(count).setImageResource(R.drawable.r25);
                        } else if (ageTableNine[column] == 26) {
                            allButtons.get(count).setImageResource(R.drawable.r26);
                        } else if (ageTableNine[column] == 27) {
                            allButtons.get(count).setImageResource(R.drawable.r27);
                        } else if (ageTableNine[column] == 28) {
                            allButtons.get(count).setImageResource(R.drawable.r28);
                        } else if (ageTableNine[column] == 29) {
                            allButtons.get(count).setImageResource(R.drawable.r29);
                        } else if (ageTableNine[column] == 30) {
                            allButtons.get(count).setImageResource(R.drawable.r30);
                        } else if (ageTableNine[column] == 31) {
                            allButtons.get(count).setImageResource(R.drawable.r31);
                        } else if (ageTableNine[column] == 32) {
                            allButtons.get(count).setImageResource(R.drawable.r32);
                        } else if (ageTableNine[column] == 33) {
                            allButtons.get(count).setImageResource(R.drawable.r33);
                        } else if (ageTableNine[column] == 34) {
                            allButtons.get(count).setImageResource(R.drawable.r34);
                        } else if (ageTableNine[column] == 35) {
                            allButtons.get(count).setImageResource(R.drawable.r35);
                        } else if (ageTableNine[column] == 36) {
                            allButtons.get(count).setImageResource(R.drawable.r36);
                        } else if (ageTableNine[column] == 37) {
                            allButtons.get(count).setImageResource(R.drawable.r37);
                        } else if (ageTableNine[column] == 38) {
                            allButtons.get(count).setImageResource(R.drawable.r38);
                        } else if (ageTableNine[column] == 39) {
                            allButtons.get(count).setImageResource(R.drawable.r39);
                        } else if (ageTableNine[column] == 40) {
                            allButtons.get(count).setImageResource(R.drawable.r40);
                        } else if (ageTableNine[column] == 41) {
                            allButtons.get(count).setImageResource(R.drawable.r41);
                        } else if (ageTableNine[column] == 42) {
                            allButtons.get(count).setImageResource(R.drawable.r42);
                        } else if (ageTableNine[column] == 43) {
                            allButtons.get(count).setImageResource(R.drawable.r43);
                        } else if (ageTableNine[column] == 44) {
                            allButtons.get(count).setImageResource(R.drawable.r44);
                        } else if (ageTableNine[column] == 45) {
                            allButtons.get(count).setImageResource(R.drawable.r45);
                        } else if (ageTableNine[column] == 46) {
                            allButtons.get(count).setImageResource(R.drawable.r46);
                        } else if (ageTableNine[column] == 47) {
                            allButtons.get(count).setImageResource(R.drawable.r47);
                        } else if (ageTableNine[column] == 48) {
                            allButtons.get(count).setImageResource(R.drawable.r48);
                        } else if (ageTableNine[column] == 49) {
                            allButtons.get(count).setImageResource(R.drawable.r49);
                        } else if (ageTableNine[column] == 50) {
                            allButtons.get(count).setImageResource(R.drawable.r50);
                        } else if (ageTableNine[column] == 51) {
                            allButtons.get(count).setImageResource(R.drawable.r51);
                        } else if (ageTableNine[column] == 52) {
                            allButtons.get(count).setImageResource(R.drawable.r52);
                        } else if (ageTableNine[column] == 53) {
                            allButtons.get(count).setImageResource(R.drawable.r53);
                        } else if (ageTableNine[column] == 54) {
                            allButtons.get(count).setImageResource(R.drawable.r54);
                        } else if (ageTableNine[column] == 55) {
                            allButtons.get(count).setImageResource(R.drawable.r55);
                        } else if (ageTableNine[column] == 56) {
                            allButtons.get(count).setImageResource(R.drawable.r56);
                        } else if (ageTableNine[column] == 57) {
                            allButtons.get(count).setImageResource(R.drawable.r57);
                        } else if (ageTableNine[column] == 58) {
                            allButtons.get(count).setImageResource(R.drawable.r58);
                        } else if (ageTableNine[column] == 59) {
                            allButtons.get(count).setImageResource(R.drawable.r59);
                        } else if (ageTableNine[column] == 60) {
                            allButtons.get(count).setImageResource(R.drawable.r60);
                        } else if (ageTableNine[column] == 61) {
                            allButtons.get(count).setImageResource(R.drawable.r61);
                        } else if (ageTableNine[column] == 62) {
                            allButtons.get(count).setImageResource(R.drawable.r62);
                        } else if (ageTableNine[column] == 63) {
                            allButtons.get(count).setImageResource(R.drawable.r63);
                        } else if (ageTableNine[column] == 64) {
                            allButtons.get(count).setImageResource(R.drawable.r64);
                        } else if (ageTableNine[column] == 65) {
                            allButtons.get(count).setImageResource(R.drawable.r65);
                        } else if (ageTableNine[column] == 66) {
                            allButtons.get(count).setImageResource(R.drawable.r66);
                        } else if (ageTableNine[column] == 67) {
                            allButtons.get(count).setImageResource(R.drawable.r67);
                        } else if (ageTableNine[column] == 68) {
                            allButtons.get(count).setImageResource(R.drawable.r68);
                        } else if (ageTableNine[column] == 69) {
                            allButtons.get(count).setImageResource(R.drawable.r69);
                        } else if (ageTableNine[column] == 70) {
                            allButtons.get(count).setImageResource(R.drawable.r70);
                        } else if (ageTableNine[column] == 71) {
                            allButtons.get(count).setImageResource(R.drawable.r71);
                        } else if (ageTableNine[column] == 72) {
                            allButtons.get(count).setImageResource(R.drawable.r72);
                        } else if (ageTableNine[column] == 73) {
                            allButtons.get(count).setImageResource(R.drawable.r73);
                        } else if (ageTableNine[column] == 74) {
                            allButtons.get(count).setImageResource(R.drawable.r74);
                        } else if (ageTableNine[column] == 75) {
                            allButtons.get(count).setImageResource(R.drawable.r75);
                        } else if (ageTableNine[column] == 76) {
                            allButtons.get(count).setImageResource(R.drawable.r76);
                        } else if (ageTableNine[column] == 77) {
                            allButtons.get(count).setImageResource(R.drawable.r77);
                        } else if (ageTableNine[column] == 78) {
                            allButtons.get(count).setImageResource(R.drawable.r78);
                        } else if (ageTableNine[column] == 79) {
                            allButtons.get(count).setImageResource(R.drawable.r79);
                        } else if (ageTableNine[column] == 80) {
                            allButtons.get(count).setImageResource(R.drawable.r80);
                        } else if (ageTableNine[column] == 81) {
                            allButtons.get(count).setImageResource(R.drawable.r81);
                        } else if (ageTableNine[column] == 82) {
                            allButtons.get(count).setImageResource(R.drawable.r82);
                        } else if (ageTableNine[column] == 83) {
                            allButtons.get(count).setImageResource(R.drawable.r83);
                        } else if (ageTableNine[column] == 84) {
                            allButtons.get(count).setImageResource(R.drawable.r84);
                        } else if (ageTableNine[column] == 85) {
                            allButtons.get(count).setImageResource(R.drawable.r85);
                        } else if (ageTableNine[column] == 86) {
                            allButtons.get(count).setImageResource(R.drawable.r86);
                        } else if (ageTableNine[column] == 87) {
                            allButtons.get(count).setImageResource(R.drawable.r87);
                        } else if (ageTableNine[column] == 88) {
                            allButtons.get(count).setImageResource(R.drawable.r88);
                        } else if (ageTableNine[column] == 89) {
                            allButtons.get(count).setImageResource(R.drawable.r89);
                        } else if (ageTableNine[column] == 90) {
                            allButtons.get(count).setImageResource(R.drawable.r90);
                        } else if (ageTableNine[column] == 91) {
                            allButtons.get(count).setImageResource(R.drawable.r91);
                        } else if (ageTableNine[column] == 92) {
                            allButtons.get(count).setImageResource(R.drawable.r92);
                        } else if (ageTableNine[column] == 93) {
                            allButtons.get(count).setImageResource(R.drawable.r93);
                        } else if (ageTableNine[column] == 94) {
                            allButtons.get(count).setImageResource(R.drawable.r94);
                        } else if (ageTableNine[column] == 95) {
                            allButtons.get(count).setImageResource(R.drawable.r95);
                        } else if (ageTableNine[column] == 96) {
                            allButtons.get(count).setImageResource(R.drawable.r96);
                        } else if (ageTableNine[column] == 97) {
                            allButtons.get(count).setImageResource(R.drawable.r97);
                        } else if (ageTableNine[column] == 98) {
                            allButtons.get(count).setImageResource(R.drawable.r98);
                        } else if (ageTableNine[column] == 99) {
                            allButtons.get(count).setImageResource(R.drawable.r99);
                        }
                        if (ageConditionEight.get(d) == ageConditionEight.get(itemCount - 1)) {
                            break mainLoopNine;
                        }


                    }
                    System.out.println("");
                    if (pls == 0) {
                        yes8.setVisibility(View.GONE);
                        no8.setVisibility(View.GONE);
                        yes9.setVisibility(View.VISIBLE);
                        no9.setVisibility(View.VISIBLE);

                    }


                }

            }


        };
        no8.setOnClickListener(listener8);
        yes8.setOnClickListener(listener8);


        final ArrayList<Integer> ageConditionNine = new ArrayList<Integer>();
        View.OnClickListener listener9 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pls = 0;
                if (view.equals(yes9) || view.equals(no9)) {
                    for (int w = 0; w < allButtons.size(); w++) {
                        allButtons.get(w).setImageResource(android.R.color.transparent);

                    }
                    if (view.equals(yes9)) {
                        int occurence, occurenceTwo;
                        int frequency = 0;
                        for (int i = 0; i < 99; i++) {
                            frequency = age.get(i);
                            occurence = Collections.frequency(ageConditionEight, frequency);
                            occurenceTwo = Collections.frequency(ageNull, frequency);
                            if (occurence == 0 && occurenceTwo == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {

                                    yes9.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }

                                }
                            }

                        }

                    } else if (view.equals(no9)) {
                        int occurence;
                        int frequency = 0;
                        for (int i = 0; i < ageConditionEight.size(); i++) {
                            frequency = ageConditionEight.get(i);
                            occurence = Collections.frequency(ageNull, frequency);
                            if (occurence == 0) {
                                ageNull.add(frequency);
                            }
                        }
                        Collections.sort(ageNull);
                        itemCountTotal[0] = ageNull.size();
                        if (itemCountTotal[0] == 99) {
                            int totalFrequency = 0;

                            for (int i = 0; i <= 99; i++) {
                                totalFrequency = age.get(i);
                                int finalTotal = Collections.frequency(ageNull, totalFrequency);
                                if (finalTotal == 0) {
                                    Intent myIntent = new Intent(MainActivity.this, win.class);
                                    myIntent.putExtra("intVariableName", totalFrequency);
                                    myIntent.putExtra("intScore", gameCounter[0]);
                                    startActivity(myIntent);

                                    yes9.setVisibility(View.GONE);
                                    no9.setVisibility(View.GONE);
                                    pls++;
                                    for (int w = 0; w < allButtons.size(); w++) {
                                        allButtons.get(w).setImageResource(android.R.color.transparent);

                                    }
                                }
                            }

                        }

                    }

                    int[] ageTableTen = new int[55];
                    random[0] = 0;
                    cnt[0] = 0;
                    for (int i = 0; i <= 99; i++) {
                        random[0] = (int) (Math.random() * 2) + 1;
                        if (random[0] == 1) {
                            ageConditionNine.add(age.get(i));
                            cnt[0]++;
                        }
                    }
                    int columnSize = 0;
                    int itemCount = ageConditionNine.size();
                    if (itemCount > 50) {
                        columnSize = 54;
                    } else {
                        columnSize = 54;
                    }
                    int d = 0;
                    int count = 0;
                    System.out.println("\n");
                    turnCounter.setImageResource(R.drawable.tenthturn);

                    gameCounter[0]++;
                    Scanner scTen = new Scanner(System.in);
                    mainLoopTen:
                    for (int column = 0; column <= columnSize; column++, d++, count++) {

                        ageTableTen[column] = ageConditionNine.get(d);
                        System.out.print(ageTableTen[column] + " ");
                        if (ageTableTen[column] == 1) {
                            allButtons.get(count).setImageResource(R.drawable.maroon1);
                        } else if (ageTableTen[column] == 2) {
                            allButtons.get(count).setImageResource(R.drawable.maroon2);
                        } else if (ageTableTen[column] == 3) {
                            allButtons.get(count).setImageResource(R.drawable.maroon3);
                        } else if (ageTableTen[column] == 4) {
                            allButtons.get(count).setImageResource(R.drawable.maroon4);
                        } else if (ageTableTen[column] == 5) {
                            allButtons.get(count).setImageResource(R.drawable.maroon5);
                        } else if (ageTableTen[column] == 6) {
                            allButtons.get(count).setImageResource(R.drawable.maroon6);
                        } else if (ageTableTen[column] == 7) {
                            allButtons.get(count).setImageResource(R.drawable.maroon7);
                        } else if (ageTableTen[column] == 8) {
                            allButtons.get(count).setImageResource(R.drawable.maroon8);
                        } else if (ageTableTen[column] == 9) {
                            allButtons.get(count).setImageResource(R.drawable.maroon9);
                        } else if (ageTableTen[column] == 10) {
                            allButtons.get(count).setImageResource(R.drawable.maroon10);
                        } else if (ageTableTen[column] == 11) {
                            allButtons.get(count).setImageResource(R.drawable.maroon11);
                        } else if (ageTableTen[column] == 12) {
                            allButtons.get(count).setImageResource(R.drawable.maroon12);
                        } else if (ageTableTen[column] == 13) {
                            allButtons.get(count).setImageResource(R.drawable.maroon13);
                        } else if (ageTableTen[column] == 14) {
                            allButtons.get(count).setImageResource(R.drawable.maroon14);
                        } else if (ageTableTen[column] == 15) {
                            allButtons.get(count).setImageResource(R.drawable.maroon15);
                        } else if (ageTableTen[column] == 16) {
                            allButtons.get(count).setImageResource(R.drawable.maroon16);
                        } else if (ageTableTen[column] == 17) {
                            allButtons.get(count).setImageResource(R.drawable.maroon17);
                        } else if (ageTableTen[column] == 18) {
                            allButtons.get(count).setImageResource(R.drawable.maroon18);
                        } else if (ageTableTen[column] == 19) {
                            allButtons.get(count).setImageResource(R.drawable.maroon19);
                        } else if (ageTableTen[column] == 20) {
                            allButtons.get(count).setImageResource(R.drawable.maroon20);
                        } else if (ageTableTen[column] == 21) {
                            allButtons.get(count).setImageResource(R.drawable.maroon21);
                        } else if (ageTableTen[column] == 22) {
                            allButtons.get(count).setImageResource(R.drawable.maroon22);
                        } else if (ageTableTen[column] == 23) {
                            allButtons.get(count).setImageResource(R.drawable.maroon23);
                        } else if (ageTableTen[column] == 24) {
                            allButtons.get(count).setImageResource(R.drawable.maroon24);
                        } else if (ageTableTen[column] == 25) {
                            allButtons.get(count).setImageResource(R.drawable.maroon25);
                        } else if (ageTableTen[column] == 26) {
                            allButtons.get(count).setImageResource(R.drawable.maroon26);
                        } else if (ageTableTen[column] == 27) {
                            allButtons.get(count).setImageResource(R.drawable.maroon27);
                        } else if (ageTableTen[column] == 28) {
                            allButtons.get(count).setImageResource(R.drawable.maroon28);
                        } else if (ageTableTen[column] == 29) {
                            allButtons.get(count).setImageResource(R.drawable.maroon29);
                        } else if (ageTableTen[column] == 30) {
                            allButtons.get(count).setImageResource(R.drawable.maroon30);
                        } else if (ageTableTen[column] == 31) {
                            allButtons.get(count).setImageResource(R.drawable.maroon31);
                        } else if (ageTableTen[column] == 32) {
                            allButtons.get(count).setImageResource(R.drawable.maroon32);
                        } else if (ageTableTen[column] == 33) {
                            allButtons.get(count).setImageResource(R.drawable.maroon33);
                        } else if (ageTableTen[column] == 34) {
                            allButtons.get(count).setImageResource(R.drawable.maroon34);
                        } else if (ageTableTen[column] == 35) {
                            allButtons.get(count).setImageResource(R.drawable.maroon35);
                        } else if (ageTableTen[column] == 36) {
                            allButtons.get(count).setImageResource(R.drawable.maroon36);
                        } else if (ageTableTen[column] == 37) {
                            allButtons.get(count).setImageResource(R.drawable.maroon37);
                        } else if (ageTableTen[column] == 38) {
                            allButtons.get(count).setImageResource(R.drawable.maroon38);
                        } else if (ageTableTen[column] == 39) {
                            allButtons.get(count).setImageResource(R.drawable.maroon39);
                        } else if (ageTableTen[column] == 40) {
                            allButtons.get(count).setImageResource(R.drawable.maroon40);
                        } else if (ageTableTen[column] == 41) {
                            allButtons.get(count).setImageResource(R.drawable.maroon41);
                        } else if (ageTableTen[column] == 42) {
                            allButtons.get(count).setImageResource(R.drawable.maroon42);
                        } else if (ageTableTen[column] == 43) {
                            allButtons.get(count).setImageResource(R.drawable.maroon43);
                        } else if (ageTableTen[column] == 44) {
                            allButtons.get(count).setImageResource(R.drawable.maroon44);
                        } else if (ageTableTen[column] == 45) {
                            allButtons.get(count).setImageResource(R.drawable.maroon45);
                        } else if (ageTableTen[column] == 46) {
                            allButtons.get(count).setImageResource(R.drawable.maroon46);
                        } else if (ageTableTen[column] == 47) {
                            allButtons.get(count).setImageResource(R.drawable.maroon47);
                        } else if (ageTableTen[column] == 48) {
                            allButtons.get(count).setImageResource(R.drawable.maroon48);
                        } else if (ageTableTen[column] == 49) {
                            allButtons.get(count).setImageResource(R.drawable.maroon49);
                        } else if (ageTableTen[column] == 50) {
                            allButtons.get(count).setImageResource(R.drawable.maroon50);
                        } else if (ageTableTen[column] == 51) {
                            allButtons.get(count).setImageResource(R.drawable.maroon51);
                        } else if (ageTableTen[column] == 52) {
                            allButtons.get(count).setImageResource(R.drawable.maroon52);
                        } else if (ageTableTen[column] == 53) {
                            allButtons.get(count).setImageResource(R.drawable.maroon53);
                        } else if (ageTableTen[column] == 54) {
                            allButtons.get(count).setImageResource(R.drawable.maroon54);
                        } else if (ageTableTen[column] == 55) {
                            allButtons.get(count).setImageResource(R.drawable.maroon55);
                        } else if (ageTableTen[column] == 56) {
                            allButtons.get(count).setImageResource(R.drawable.maroon56);
                        } else if (ageTableTen[column] == 57) {
                            allButtons.get(count).setImageResource(R.drawable.maroon57);
                        } else if (ageTableTen[column] == 58) {
                            allButtons.get(count).setImageResource(R.drawable.maroon58);
                        } else if (ageTableTen[column] == 59) {
                            allButtons.get(count).setImageResource(R.drawable.maroon59);
                        } else if (ageTableTen[column] == 60) {
                            allButtons.get(count).setImageResource(R.drawable.maroon60);
                        } else if (ageTableTen[column] == 61) {
                            allButtons.get(count).setImageResource(R.drawable.maroon61);
                        } else if (ageTableTen[column] == 62) {
                            allButtons.get(count).setImageResource(R.drawable.maroon62);
                        } else if (ageTableTen[column] == 63) {
                            allButtons.get(count).setImageResource(R.drawable.maroon63);
                        } else if (ageTableTen[column] == 64) {
                            allButtons.get(count).setImageResource(R.drawable.maroon64);
                        } else if (ageTableTen[column] == 65) {
                            allButtons.get(count).setImageResource(R.drawable.maroon65);
                        } else if (ageTableTen[column] == 66) {
                            allButtons.get(count).setImageResource(R.drawable.maroon66);
                        } else if (ageTableTen[column] == 67) {
                            allButtons.get(count).setImageResource(R.drawable.maroon67);
                        } else if (ageTableTen[column] == 68) {
                            allButtons.get(count).setImageResource(R.drawable.maroon68);
                        } else if (ageTableTen[column] == 69) {
                            allButtons.get(count).setImageResource(R.drawable.maroon69);
                        } else if (ageTableTen[column] == 70) {
                            allButtons.get(count).setImageResource(R.drawable.maroon70);
                        } else if (ageTableTen[column] == 71) {
                            allButtons.get(count).setImageResource(R.drawable.maroon71);
                        } else if (ageTableTen[column] == 72) {
                            allButtons.get(count).setImageResource(R.drawable.maroon72);
                        } else if (ageTableTen[column] == 73) {
                            allButtons.get(count).setImageResource(R.drawable.maroon73);
                        } else if (ageTableTen[column] == 74) {
                            allButtons.get(count).setImageResource(R.drawable.maroon74);
                        } else if (ageTableTen[column] == 75) {
                            allButtons.get(count).setImageResource(R.drawable.maroon75);
                        } else if (ageTableTen[column] == 76) {
                            allButtons.get(count).setImageResource(R.drawable.maroon76);
                        } else if (ageTableTen[column] == 77) {
                            allButtons.get(count).setImageResource(R.drawable.maroon77);
                        } else if (ageTableTen[column] == 78) {
                            allButtons.get(count).setImageResource(R.drawable.maroon78);
                        } else if (ageTableTen[column] == 79) {
                            allButtons.get(count).setImageResource(R.drawable.maroon79);
                        } else if (ageTableTen[column] == 80) {
                            allButtons.get(count).setImageResource(R.drawable.maroon80);
                        } else if (ageTableTen[column] == 81) {
                            allButtons.get(count).setImageResource(R.drawable.maroon81);
                        } else if (ageTableTen[column] == 82) {
                            allButtons.get(count).setImageResource(R.drawable.maroon82);
                        } else if (ageTableTen[column] == 83) {
                            allButtons.get(count).setImageResource(R.drawable.maroon83);
                        } else if (ageTableTen[column] == 84) {
                            allButtons.get(count).setImageResource(R.drawable.maroon84);
                        } else if (ageTableTen[column] == 85) {
                            allButtons.get(count).setImageResource(R.drawable.maroon85);
                        } else if (ageTableTen[column] == 86) {
                            allButtons.get(count).setImageResource(R.drawable.maroon86);
                        } else if (ageTableTen[column] == 87) {
                            allButtons.get(count).setImageResource(R.drawable.maroon87);
                        } else if (ageTableTen[column] == 88) {
                            allButtons.get(count).setImageResource(R.drawable.maroon88);
                        } else if (ageTableTen[column] == 89) {
                            allButtons.get(count).setImageResource(R.drawable.maroon89);
                        } else if (ageTableTen[column] == 90) {
                            allButtons.get(count).setImageResource(R.drawable.maroon90);
                        } else if (ageTableTen[column] == 91) {
                            allButtons.get(count).setImageResource(R.drawable.maroon91);
                        } else if (ageTableTen[column] == 92) {
                            allButtons.get(count).setImageResource(R.drawable.maroon92);
                        } else if (ageTableTen[column] == 93) {
                            allButtons.get(count).setImageResource(R.drawable.maroon93);
                        } else if (ageTableTen[column] == 94) {
                            allButtons.get(count).setImageResource(R.drawable.maroon94);
                        } else if (ageTableTen[column] == 95) {
                            allButtons.get(count).setImageResource(R.drawable.maroon95);
                        } else if (ageTableTen[column] == 96) {
                            allButtons.get(count).setImageResource(R.drawable.maroon96);
                        } else if (ageTableTen[column] == 97) {
                            allButtons.get(count).setImageResource(R.drawable.maroon97);
                        } else if (ageTableTen[column] == 98) {
                            allButtons.get(count).setImageResource(R.drawable.maroon98);
                        } else if (ageTableTen[column] == 99) {
                            allButtons.get(count).setImageResource(R.drawable.maroon99);
                        }
                        if (ageConditionNine.get(d) == ageConditionNine.get(itemCount - 1)) {
                            break mainLoopTen;
                        }


                    }
                    System.out.println("");

                    if (pls == 0) {
                        yes9.setVisibility(View.GONE);
                        no9.setVisibility(View.GONE);
                        yes10.setVisibility(View.VISIBLE);
                        no10.setVisibility(View.VISIBLE);
                    }


                }

            }


        };
        no9.setOnClickListener(listener9);
        yes9.setOnClickListener(listener9);

        yes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int w = 0; w < allButtons.size(); w++) {
                    allButtons.get(w).setImageResource(android.R.color.transparent);

                }
                int occurence, occurenceTwo;
                int frequency = 0;
                for (int i = 0; i < 99; i++) {
                    frequency = age.get(i);
                    occurence = Collections.frequency(ageConditionNine, frequency);
                    occurenceTwo = Collections.frequency(ageNull, frequency);
                    if (occurence == 0 && occurenceTwo == 0) {
                        ageNull.add(frequency);
                    }
                }
                Collections.sort(ageNull);

                itemCountTotal[0] = ageNull.size();
                if (itemCountTotal[0] == 99) {
                    int totalFrequency = 0;

                    for (int i = 0; i <= 99; i++) {
                        totalFrequency = age.get(i);
                        int finalTotal = Collections.frequency(ageNull, totalFrequency);
                        if (finalTotal == 0) {
                            Intent myIntent = new Intent(MainActivity.this, win.class);
                            myIntent.putExtra("intVariableName", totalFrequency);
                            myIntent.putExtra("intScore", gameCounter[0]);
                            startActivity(myIntent);

                            for (int w = 0; w < allButtons.size(); w++) {
                                allButtons.get(w).setImageResource(android.R.color.transparent);

                            }

                        }
                    }

                } else {
                    Intent myIntent = new Intent(MainActivity.this, win.class);
                    myIntent.putExtra("intVariableName", -1);
                    myIntent.putExtra("intScore", gameCounter[0]);
                    startActivity(myIntent);

                }


            }

        });

        no10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int w = 0; w < allButtons.size(); w++) {
                    allButtons.get(w).setImageResource(android.R.color.transparent);

                }
                int occurence;
                int frequency = 0;
                for (int i = 0; i < ageConditionNine.size(); i++) {
                    frequency = ageConditionNine.get(i);
                    occurence = Collections.frequency(ageNull, frequency);
                    if (occurence == 0) {
                        ageNull.add(frequency);
                    }
                }
                Collections.sort(ageNull);

                itemCountTotal[0] = ageNull.size();
                if (itemCountTotal[0] == 99) {
                    int totalFrequency = 0;

                    for (int i = 0; i <= 99; i++) {
                        totalFrequency = age.get(i);
                        int finalTotal = Collections.frequency(ageNull, totalFrequency);
                        if (finalTotal == 0) {
                            Intent myIntent = new Intent(MainActivity.this, win.class);
                            myIntent.putExtra("intVariableName", totalFrequency);
                            myIntent.putExtra("intScore", gameCounter[0]);
                            startActivity(myIntent);
                            yes10.setVisibility(View.INVISIBLE);
                            no10.setVisibility(View.INVISIBLE);
                            for (int w = 0; w < allButtons.size(); w++) {
                                allButtons.get(w).setImageResource(android.R.color.transparent);

                            }
                        }
                    }

                } else {
                    Intent myIntent = new Intent(MainActivity.this, win.class);
                    myIntent.putExtra("intVariableName", -1);
                    myIntent.putExtra("intScore", gameCounter[0]);
                    startActivity(myIntent);
                    yes10.setVisibility(View.INVISIBLE);
                    no10.setVisibility(View.INVISIBLE);
                }


            }

        });


    }

    public void dialog() {


        new AlertDialog.Builder(this)

                .setTitle("Welcome to Age Guesser!")

                .setMessage("We can guess your age from 1 - 99 years old. \n\nNumbers will be shown to you on a page. \n\nAnswer Yes or No to whether you see your number or not. \n\nHowever, there is a 0.025% chance to incorrectly guess your age. \n\nEnjoy!")
                .setNegativeButton("Let's Begin!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //start
                    }

                }).create().show();
    }


}





























