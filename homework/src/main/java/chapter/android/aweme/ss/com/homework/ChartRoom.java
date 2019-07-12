package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class ChartRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);
        int position = getIntent().getIntExtra("position", -1);

        TextView textView = findViewById(R.id.tv_content_info);
        textView.setText("点击了"+position+"的标签");
    }

}
