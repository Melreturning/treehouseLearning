package tutorial.treehouse.funfacttutorial;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactActivity extends AppCompatActivity {

    // Declare view variables
    private TextView mFactTextView;
    private Button mNextFactBn;
    private RelativeLayout mBackgroudLayout;
    private int currNum;
    private FactBook mFactBook = new FactBook();

    //TODO: move color to another file -> can I use xml??
    private static int[] COLORS = {
    0xff39add1, // light blue
    0xff3079ab, // dark blue
    0xffc25975, // mauve
    0xffe15258, // red
    0xfff9845b, // orange
    0xff838cc7, // lavender
    0xff7d669e, // purple
    0xff53bbb4, // aqua
    0xff51b46d, // green
    0xffe0ab18, // mustard
    0xff637a91, // dark gray
    0xfff092b0, // pink
    0xffb7c0c7, // light gray

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fun_fact);
        // Assign the views from the layout file to variables => after setContentView!
        mFactTextView = (TextView) findViewById(R.id.fact_textView);
        mNextFactBn = (Button)findViewById(R.id.button);
        mBackgroudLayout = (RelativeLayout)findViewById(R.id.activity_fun_fact);

        // initialize currNum
        currNum = mFactBook.checkCurrentFactNum((String)mFactTextView.getText());

        View.OnClickListener buttonListener = new View.OnClickListener(){
            @Override
            // onClick code will run everything the button is clicked
            public void onClick (View v){
             //1. update fun fact TextView when button clicked
                String fact =mFactBook.getRandomFact(currNum);
                currNum= mFactBook.checkCurrentFactNum(fact);
                mFactTextView.setText(fact);
            //2. change color of background
                //currNum= mFactBook.checkCurrentFactNum(fact);
                mBackgroudLayout.setBackgroundColor(COLORS[currNum]);            }
        };
        mNextFactBn.setOnClickListener(buttonListener);

    }
}
