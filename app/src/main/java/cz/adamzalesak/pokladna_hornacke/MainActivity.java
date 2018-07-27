package cz.adamzalesak.pokladna_hornacke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int full_status = 0;
    int half_status = 0;
    int program_status = 0;

    int total_price = 0;

    public void increase_full(View v) {
        full_status++;
        total_price = total_price + 150;
        TextView textviewFullStatus = (TextView) findViewById(R.id.textview_full_status);
        String full_status_string = Integer.toString(full_status);
        textviewFullStatus.setText(full_status_string);

        TextView textviewTotalPrice = (TextView) findViewById(R.id.textview_total_price);
        String total_price_string = Integer.toString(total_price) + " Kč";
        textviewTotalPrice.setText(total_price_string);
    }

    public void decrease_full(View v) {
        if (full_status > 0) {
            full_status--;
            total_price = total_price - 150;
        }

        TextView textviewFullStatus = (TextView) findViewById(R.id.textview_full_status);
        String full_status_string = Integer.toString(full_status);
        textviewFullStatus.setText(full_status_string);

        TextView textviewTotalPrice = (TextView) findViewById(R.id.textview_total_price);
        String total_price_string = Integer.toString(total_price) + " Kč";
        textviewTotalPrice.setText(total_price_string);
    }


    public void increase_half(View v) {
        half_status++;
        total_price = total_price + 70;
        TextView textviewHalfStatus = (TextView) findViewById(R.id.textview_half_status);
        String half_status_string = Integer.toString(half_status);
        textviewHalfStatus.setText(half_status_string);

        TextView textviewTotalPrice = (TextView) findViewById(R.id.textview_total_price);
        String total_price_string = Integer.toString(total_price) + " Kč";
        textviewTotalPrice.setText(total_price_string);
    }

    public void decrease_half(View v) {

        if (half_status > 0) {
            half_status--;
            total_price = total_price - 70;
        }

        TextView textviewHalfStatus = (TextView) findViewById(R.id.textview_half_status);
        String half_status_string = Integer.toString(half_status);
        textviewHalfStatus.setText(half_status_string);

        TextView textviewTotalPrice = (TextView) findViewById(R.id.textview_total_price);
        String total_price_string = Integer.toString(total_price) + " Kč";
        textviewTotalPrice.setText(total_price_string);
    }

    public void increase_program(View v) {
        program_status++;
        total_price = total_price + 40;
        TextView textviewProgramStatus = (TextView) findViewById(R.id.textview_program_status);
        String program_status_string = Integer.toString(program_status);
        textviewProgramStatus.setText(program_status_string);

        TextView textviewTotalPrice = (TextView) findViewById(R.id.textview_total_price);
        String total_price_string = Integer.toString(total_price) + " Kč";
        textviewTotalPrice.setText(total_price_string);
    }

    public void decrease_program(View v) {
        if (program_status > 0) {
            program_status--;
            total_price = total_price - 40;
        }

        TextView textviewProgramStatus = (TextView) findViewById(R.id.textview_program_status);
        String program_status_string = Integer.toString(program_status);
        textviewProgramStatus.setText(program_status_string);

        TextView textviewTotalPrice = (TextView) findViewById(R.id.textview_total_price);
        String total_price_string = Integer.toString(total_price) + " Kč";
        textviewTotalPrice.setText(total_price_string);
    }

    public void to_null(View v) {
        full_status = 0;
        half_status = 0;
        program_status = 0;

        total_price = 0;

        TextView textviewFullStatus = (TextView) findViewById(R.id.textview_full_status);
        String full_status_string = Integer.toString(full_status);
        textviewFullStatus.setText(full_status_string);

        TextView textviewHalfStatus = (TextView) findViewById(R.id.textview_half_status);
        String half_status_string = Integer.toString(half_status);
        textviewHalfStatus.setText(half_status_string);

        TextView textviewProgramStatus = (TextView) findViewById(R.id.textview_program_status);
        String program_status_string = Integer.toString(program_status);
        textviewProgramStatus.setText(program_status_string);

        TextView textviewTotalPrice = (TextView) findViewById(R.id.textview_total_price);
        String total_price_string = Integer.toString(total_price) + " Kč";
        textviewTotalPrice.setText(total_price_string);
    }

 }
