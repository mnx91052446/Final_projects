package com.example.final_projects;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
*/
public class rate_exchangeRateFragment extends Fragment {
    private View mainView;
    private EditText etNum1,etNum2,etNum3,etNum4,etNum5,etNum6;
    private TextView txv14,txv16,txv18,txv20,txv22;
    private RadioGroup rg;
    private RadioButton spot, cash;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mainView =  inflater.inflate(R.layout.rate_exchange_rate, container, false);
        Button exchange = mainView.findViewById(R.id.exchange);
        etNum1 = mainView.findViewById(R.id.editNum1);
        etNum2 = mainView.findViewById(R.id.editNum2);
        etNum3 = mainView.findViewById(R.id.editNum3);
        etNum4 = mainView.findViewById(R.id.editNum4);
        etNum5 = mainView.findViewById(R.id.editNum5);
        etNum6 = mainView.findViewById(R.id.editNum6);
        txv14 = mainView.findViewById(R.id.textView14);
        txv16 = mainView.findViewById(R.id.textView16);
        txv18 = mainView.findViewById(R.id.textView18);
        txv20 = mainView.findViewById(R.id.textView20);
        txv22 = mainView.findViewById(R.id.textView22);
        spot = mainView.findViewById(R.id.spot);
        cash = mainView.findViewById(R.id.cash);
        spot.setOnCheckedChangeListener(mOnCheckedChangeListener);
        cash.setOnCheckedChangeListener(mOnCheckedChangeListener);
        rg = mainView.findViewById(R.id.radioGroup1);

        exchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rg.getCheckedRadioButtonId()) {
                    case R.id.spot:
                        exchange(); //顯示結果
                        break;
                    case R.id.cash:
                        exchange2(); //顯示結果
                        break;
                }
            }
        });
        return mainView;
    }
    private CompoundButton.OnCheckedChangeListener mOnCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            switch (buttonView.getId()) {
                case R.id.spot:
                    txv14.setText("30.35");
                    txv16.setText("0.2819");
                    txv18.setText("34.11");
                    txv20.setText("4.381");
                    txv22.setText("21.28");
                    etNum2.setHint("30.35");
                    etNum3.setHint("0.2819");
                    etNum4.setHint("34.11");
                    etNum5.setHint("4.381");
                    etNum6.setHint("21.28");
                    break;
                case R.id.cash:
                    txv14.setText("30.13");
                    txv16.setText("0.2804");
                    txv18.setText("33.79");
                    txv20.setText("4.341");
                    txv22.setText("21");
                    etNum2.setHint("30.13");
                    etNum3.setHint("0.2804");
                    etNum4.setHint("33.79");
                    etNum5.setHint("4.341");
                    etNum6.setHint("21");
                    break;
            }
        }
    };
    ;


    public void exchange() {
        DecimalFormat mDecimalFormat = new DecimalFormat("#,###.##");
        double TWD = Double.parseDouble(etNum1.getText().toString());
        double USD = 30.13;
        double JPY = 0.2804;
        double EUR = 33.79;
        double CNY = 4.341;
        double AUD = 21;
        double USDtotal = TWD*USD;
        double JPYtotal = TWD*JPY;
        double EURtotal = TWD*EUR;
        double CNYtotal = TWD*CNY;
        double AUDtotal = TWD*AUD;
        etNum2.setText(mDecimalFormat.format(USDtotal));
        etNum3.setText(mDecimalFormat.format(JPYtotal));
        etNum4.setText(mDecimalFormat.format(EURtotal));
        etNum5.setText(mDecimalFormat.format(CNYtotal));
        etNum6.setText(mDecimalFormat.format(AUDtotal));
    }
    public void exchange2() {
        DecimalFormat mDecimalFormat = new DecimalFormat("#,###.##");
        double TWD = Double.parseDouble(etNum1.getText().toString());
        double USD = 30.35;
        double JPY = 0.2819;
        double EUR = 34.11;
        double CNY = 4.381;
        double AUD = 21.28;
        double USDtotal = TWD*USD;
        double JPYtotal = TWD*JPY;
        double EURtotal = TWD*EUR;
        double CNYtotal = TWD*CNY;
        double AUDtotal = TWD*AUD;
        etNum2.setText(mDecimalFormat.format(USDtotal));
        etNum3.setText(mDecimalFormat.format(JPYtotal));
        etNum4.setText(mDecimalFormat.format(EURtotal));
        etNum5.setText(mDecimalFormat.format(CNYtotal));
        etNum6.setText(mDecimalFormat.format(AUDtotal));
    }

}
