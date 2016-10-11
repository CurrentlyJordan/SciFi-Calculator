package nyc.c4q.jordansmith.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calcScreen;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonMultiply;
    Button buttonSubtract;
    Button buttonDivide;
    Button buttonAddition;
    Button buttonOpenParantheses;
    Button buttonCloseParantheses;
    Button buttonAC;
    Button buttonPeriod;
    Button buttonEquals;
    String screenInput = "0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        numberButtonActions();
        onButtonACPress();


    }

//-------------------------- Button Stuff ------------------------------------

    public void initializeViews() {
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiplication);
        buttonDivide = (Button) findViewById(R.id.buttonDivision);
        buttonSubtract = (Button) findViewById(R.id.buttonSubtraction);
        buttonAddition = (Button) findViewById(R.id.buttonAddition);
        buttonOpenParantheses = (Button) findViewById(R.id.buttonOpenParentheses);
        buttonCloseParantheses = (Button) findViewById(R.id.buttonCloseParentheses);
        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonPeriod = (Button) findViewById(R.id.buttonPeriod);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);
        calcScreen = (TextView) findViewById(R.id.display_view);

    }


    public void onNumberButtonPress(final String character, Button b) {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screenInput.equals("0")) {
                    screenInput = "";
                    screenInput += character;
                    calcScreen.setText(screenInput);
                } else {
                    screenInput += character;
                    calcScreen.setText(screenInput);
                }
            }
        });

    }

    public void numberButtonActions() {
        onNumberButtonPress("0", button0);
        onNumberButtonPress("1", button1);
        onNumberButtonPress("2", button2);
        onNumberButtonPress("3", button3);
        onNumberButtonPress("4", button4);
        onNumberButtonPress("5", button5);
        onNumberButtonPress("6", button6);
        onNumberButtonPress("7", button7);
        onNumberButtonPress("8", button8);
        onNumberButtonPress("9", button9);
        onNumberButtonPress("(", buttonOpenParantheses);
        onNumberButtonPress(")", buttonCloseParantheses);
        onNumberButtonPress("x", buttonMultiply);
        onNumberButtonPress("-", buttonSubtract);
        onNumberButtonPress("+", buttonAddition);
        onNumberButtonPress("/", buttonDivide);

    }

    public void onButtonACPress() {
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenInput = "0";
                calcScreen.setText(screenInput);
            }
        });
    }
    


}

