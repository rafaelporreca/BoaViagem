package com.rafaelporreca.boaviagem;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;

/**
 * Created by Rafael Porreca on 14/08/2017.
 */
public class ConfiguracoesActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencia);

    }

    public void selecionarOpcao(View view){
        switch (view.getId()){

            case R.id.configuracoes:
                startActivity(new Intent(this,ConfiguracoesActivity.class));
                break;
        }
    }
}
