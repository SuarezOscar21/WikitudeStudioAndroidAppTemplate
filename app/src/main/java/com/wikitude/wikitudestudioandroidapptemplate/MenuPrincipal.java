package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.menu_principal);
        Button btmenu =(Button) findViewById(R.id.Camara);

    }
    public void inicio(View v){
    Intent intent = new Intent(v.getContext(),RuntimePermissionRequestActivity.class);
    startActivityForResult(intent,0);
    }
    public void ayuda (View vi){
        Intent ayuda = new Intent(this, MenuAyuda.class);
        startActivityForResult(ayuda,0);
    }
}
