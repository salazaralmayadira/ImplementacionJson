package mx.edu.tesoem.isc.aysp.implementacionjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre, txtedad, txtsexo, txtjson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre= findViewById(R.id.txtNombre);
        txtedad= findViewById(R.id.txtEdad);
        txtsexo= findViewById(R.id.txtSexo);
        txtjson= findViewById(R.id.txtJson);
    }
    public void CJSON(View v){
        Datos dato= new Datos();
        Gson gson= new Gson();
        dato.setNombre(txtnombre.getText().toString());
        dato.setEdad(txtedad.getText().toString());
        dato.setSexo(txtsexo.getText().toString());
        txtjson.setText(gson.toJson(dato));

    }
    public  void CClase(View v){
     Gson gson = new Gson();
     Datos dato = gson.fromJson(txtjson.getText().toString(),Datos.class);
     txtnombre.setText(dato.getNombre());
     txtedad.setText(dato.getEdad());
     txtsexo.setText(dato.getSexo());

    }
}
