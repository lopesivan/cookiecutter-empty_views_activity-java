package {{ cookiecutter.package_name }};

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class {{ cookiecutter.main_activity }} extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}