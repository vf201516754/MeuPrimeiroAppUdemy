package victor.com.br.meuprimeiroappudemy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SeguntaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunta_tela);
        receberParametroIntent();
    }

    public void receberParametroIntent() {
        TextView meuTexto = (TextView) findViewById(R.id.textoParametro);
        Intent objetoIntentSegundaTela = getIntent();
        String text = objetoIntentSegundaTela.getStringExtra("newText");
        meuTexto.setText(text);
    }



}
