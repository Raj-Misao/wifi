package misao.wifiproject;

import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_wifi;
    WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_wifi = (Button)findViewById(R.id.btn_wifi);

        btn_wifi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);

        if(wifiManager.isWifiEnabled())
        {
            btn_wifi.setText("Wifi on");

            wifiManager.setWifiEnabled(false);
        }
        else
        {
            btn_wifi.setText("Wifi off");
            wifiManager.setWifiEnabled(true);
        }
    }
}
