package thaisavecost.pravate.butraffic;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ExerciseActivity extends AppCompatActivity {

    //Explicit
    private TextView questionTextView;
    private ImageView trafficImageView;
    private RadioGroup choiceRadioGroup;
    private RadioButton choice1RadioButton, choice2RadioButton,
            choice3RadioButton, choice4RadioButton;
    private int timesAnInt = 0, scoreAnInt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        bindWidget();

        setUpchoice();

    }  // Main Method

    private void setUpchoice() {
        String[] strMyChoice = getResources().getStringArray(R.array.times1);
        choice1RadioButton.setText(strMyChoice[0]);
        choice1RadioButton.setText(strMyChoice[1]);
        choice1RadioButton.setText(strMyChoice[2]);
        choice1RadioButton.setText(strMyChoice[3]);

    }

    public void clickAnswer(View view) {
        String[] strQuestion = new String[5];
        strQuestion[0] = "1. What is this ?";
        strQuestion[1] = "2. What is this ?";
        strQuestion[2] = "3. What is this ?";
        strQuestion[3] = "4. What is this ?";
        strQuestion[4] = "5. What is this ?";

        int[] intImage = new int[5];
        intImage[0] = R.drawable.traffic_01;
        intImage[1] = R.drawable.traffic_02;
        intImage[2] = R.drawable.traffic_03;
        intImage[3] = R.drawable.traffic_04;
        intImage[4] = R.drawable.traffic_05;

        int[] intChoice = new int[5];
        intChoice[0] = R.array.times1;
        intChoice[0] = R.array.times2;
        intChoice[0] = R.array.times3;
        intChoice[0] = R.array.times4;
        intChoice[0] = R.array.times5;

        checkScore();

        timesAnInt += 1;

        if (timesAnInt < 5) {

            questionTextView.setText(strQuestion[timesAnInt]);
            trafficImageView.setImageResource(intImage[timesAnInt]);
            String[] strMyChoice = getResources().getStringArray(intChoice[timesAnInt]);
            choice1RadioButton.setText(strMyChoice[0]);
            choice1RadioButton.setText(strMyChoice[1]);
            choice1RadioButton.setText(strMyChoice[2]);
            choice1RadioButton.setText(strMyChoice[3]);
        } else {
            Intent objIntent = new Intent(ExerciseActivity.this, ScoreActivity.class);
            objIntent.putExtra("Score", scoreAnInt);
            startActivity(objIntent);
        }
    }  // clickAnswer

    private void checkScore() {

        final int[] intUserChoose = {1,2,3,4,4};
        choiceRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                int intRadio;
                switch (checkedId) {
                    case R.id.radioButton:
                        intRadio = 1;
                        break;
                    case R.id.radioButton2:
                        intRadio = 2;
                        break;
                    case R.id.radioButton3:
                        intRadio = 3;
                        break;
                    case R.id.radioButton4:
                        intRadio = 4;
                        break;
                    default:
                        intRadio = 0;
                        break;
                }
                if (intUserChoose[timesAnInt] == checkedId) {
                    scoreAnInt += 1;
                }
            }  // event
        });

    }  // checkScore


    private void bindWidget() {
        questionTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.textView3);
        choiceRadioGroup = (RadioGroup) findViewById(R.id.radChoice);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
    }

}  // Main Class
