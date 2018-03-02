package victor.com.br.meuprimeiroappudemy;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Passar parametros entre Views
    public void sendParameterIntent(View view) {
        Intent objectIntent;
        objectIntent = new Intent(MainActivity.this, SeguntaTela.class);
        objectIntent.putExtra("newText", "Test, enviar parametro entre view");
        startActivity(objectIntent);
    }

    //Intent
    public void testIntent(View view) {
        final Button testCastingButton;
        testCastingButton = (Button) findViewById(R.id.btnSendParameter);

        testCastingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callOtherActivity;
                callOtherActivity = new Intent(MainActivity.this, SeguntaTela.class);
                startActivity(callOtherActivity);
            }
        });
    }

    //Casting
    public void testCasting(View view) {
        final Button testCastingButton;
        testCastingButton = (Button) findViewById(R.id.btnSendParameter);

        testCastingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testCastingButton.setText("change name button");
            }
        });
    }

    //Toast
    public void testToast(View  view){
        Toast testToast;
        testToast = Toast.makeText(MainActivity.this, "Lorem ipsum", Toast.LENGTH_SHORT);
        testToast.show();
    }

    //SnackBar
    public void testSnackBar(View view) {
        Snackbar testSnackbar = Snackbar.make(view, "Lorem ipsum", Snackbar.LENGTH_LONG);
        testSnackbar.show();
        testSnackbar.setAction("Nome da minha ação", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int logX = Log.i("LogX", "Clicou na tela");
                Toast meuToast = Toast.makeText(MainActivity.this, "sou foda", Toast.LENGTH_LONG);
                meuToast.show();
            }
         });
    }

    //AlertDialog
    public void testAlert(View view) {
        AlertDialog.Builder builderAlert;
        builderAlert = new AlertDialog.Builder(this);
        builderAlert.setIcon(R.drawable.layers);
        builderAlert.setTitle("Permissions");
        builderAlert.setMessage("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt " +
                "ut labore et dolore magna wirl aliqua. Up exlaborum incididunt quis nostrud exercitatn.\n");

        builderAlert.setPositiveButton("BUTTON", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Teste AlertDialog", Toast.LENGTH_SHORT).show();
            }
        });

        builderAlert.setNegativeButton("BUTTON", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Teste AlertDialog", Toast.LENGTH_SHORT).show();
            }
        });

        builderAlert.setNeutralButton("BUTTON", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Teste AlertDialog", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog testeAlerta = builderAlert.create();
        testeAlerta.show();
    }
}
