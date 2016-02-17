package id.tech.latihan_butterknife;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by RebelCreative-A1 on 17/02/2016.
 */
public class Login_Activity extends AppCompatActivity {
    @Bind(R.id.ed_username) EditText ed_Username;
    @Bind(R.id.ed_password) EditText ed_Password;
    @OnClick(R.id.btn) void submit(){
        String usernmame = ed_Username.getText().toString();
        String pass = ed_Password.getText().toString();

        Toast.makeText(getApplicationContext(),"Inputed. Username =" + usernmame + " & Password = " + pass,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        ActionBar ac = getSupportActionBar();
        ac.hide();

        ButterKnife.bind(this);
    }
}
