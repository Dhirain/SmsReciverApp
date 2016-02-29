package dhirain.com.smsreciverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sms);

        IncomingSms incomingSms=new IncomingSms();

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.activity_list_sms,IncomingSms.smsLog);

        ListView listView=(ListView) findViewById(R.id.sms_list);
        listView.setAdapter(adapter);
    }
}
