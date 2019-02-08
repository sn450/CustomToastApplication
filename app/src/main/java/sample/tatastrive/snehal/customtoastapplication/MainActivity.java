package sample.tatastrive.snehal.customtoastapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showCustomToast(View view) {

        LayoutInflater inflater = getLayoutInflater();
        View appearance = inflater.inflate(R.layout.custom_layout, (ViewGroup)findViewById(R.id.root_layout));

        Toast toast = new Toast(MainActivity.this);
        toast.setView(appearance);
        toast.show();
        //Toast.makeText(this, "You Missed me?", Toast.LENGTH_SHORT).show();
    }
    public void iamDead(View view){
        Toast.makeText(this, "Awesommmm!!!", Toast.LENGTH_SHORT).show();

    }
}
