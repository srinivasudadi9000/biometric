package sales.biomed;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Profile extends Activity implements View.OnClickListener {
ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        back = (ImageView)findViewById(R.id.back);

        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.back:
                finish();
                break;

        }
    }
}
