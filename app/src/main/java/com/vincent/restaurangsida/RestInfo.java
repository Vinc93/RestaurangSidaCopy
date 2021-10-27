package com.vincent.restaurangsida;

import android.widget.TextView;

public class RestInfo {

    public void setRTxt(TextView text){
        text.setText("Öppetider\nMån - Tors. 10.00 - 21.00\n" +
                "Fredag 10.00 - 22.00 (Drive thru 21:30)\n" +
                "Lördag 10.00 - 22.00 (Drive thru 21:30)\n" +
                "Söndag 10.00 - 21.00");


    }
    public void setRTxt2(TextView text){

        text.setText("Opening hours\n" +
                "Mon - Sun 10:15 - 23:00");



    }

}
