package sales.biomed;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Subhome extends Activity {
  Button button_login;
    EditText input_password,input_usename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subhome);
        button_login = (Button)findViewById(R.id.button_login);
        input_password = (EditText)findViewById(R.id.input_password);
        input_usename  = (EditText)findViewById(R.id.input_usename);

        final AlertDialog.Builder aler = new AlertDialog.Builder(Subhome.this);
        aler.setTitle("NGFCPL");
        //aler.setIcon(getResources().getDrawable(R.drawable.appicon));

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* if (input_usename.getText().toString().length()==0){
                    aler.setMessage("Enter username ");
                    aler.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    aler.show();
                }else if(input_password.getText().toString().length()==0 || input_password.getText().toString().length()<6){
                    aler.setMessage("Enter Password ");
                    aler.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    aler.show();
                }else {
                    Intent i = new Intent(Subhome.this,home.class);
                    startActivity(i);
                }*/
                Intent i = new Intent(Subhome.this,home.class);
                startActivity(i);
            }
        });
    }
}
