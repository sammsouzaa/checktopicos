package com.example.appscheckk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.github.chrisbanes.photoview.PhotoView;


public class MainActivity extends AppCompatActivity {

    public RadioButton radioSC;
    public RadioButton radioPR;
    public RadioButton radioRS;
    public RadioGroup estados;

    public CheckBox checkCapital;
    public CheckBox checkIdh;
    public CheckBox checkPopulacao;
    public CheckBox checkArea;
    public CheckBox checkMunicipios;

    public Boolean capital = false;
    public Boolean idh =  false;
    public Boolean populacao =  false;
    public Boolean area =  false;
    public Boolean municipios =  false;

    public TextView IDresultado;

    public PhotoView IDmapa;

    public String estado = "";
    public String resultado = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkCapital = findViewById(R.id.idcheckcapital);
        checkArea = findViewById(R.id.idcheckarea);
        checkIdh = findViewById(R.id.idcheckidh);
        checkPopulacao = findViewById(R.id.idcheckpopulacao);
        checkMunicipios = findViewById(R.id.idcheckmunicipios);

        estados = findViewById(R.id.estados);

        radioPR = findViewById(R.id.radioButtonPR);
        radioRS = findViewById(R.id.radioButtonRS);
        radioSC = findViewById(R.id.radioButtonSC);

        IDresultado = findViewById(R.id.IDresultado);
        IDmapa = findViewById(R.id.IDmapa);

        radioButtonListener();


        checkCapital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (estado.equals("pr")) {

                    if(resultado.contains("Capital --------> Curitiba\n")){
                        resultado = resultado.replaceAll("Capital --------> Curitiba\n","");
                    }
                    else{resultado += "Capital --------> Curitiba\n";}

                }
                else if (estado.equals("rs")) {

                    if(resultado.contains("Capital --------> Porto Alegre\n")){
                        resultado = resultado.replaceAll("Capital --------> Porto Alegre\n","");
                    }
                    else{resultado += "Capital --------> Porto Alegre\n";}

                }
                else if (estado.equals("sc")) {

                    if(resultado.contains("Capital --------> Florianópolis\n")){
                        resultado = resultado.replaceAll("Capital --------> Florianópolis\n","");
                    }
                    else{resultado += "Capital --------> Florianópolis\n";}

                }

                IDresultado.setText(resultado);
                IDresultado.setVisibility(View.VISIBLE);

            }
        });
        checkArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (estado.equals("pr")) {

                        if(resultado.contains("Área ------------> 199.315 km²\n")){
                            resultado = resultado.replaceAll("Área ------------> 199.315 km²\n","");
                        }
                        else{resultado += "Área ------------> 199.315 km²\n";}
                    }
                    else if (estado.equals("rs")) {

                        if(resultado.contains("Área ------------> 281.748 km²\n")){
                            resultado = resultado.replaceAll("Área ------------> 281.748 km²\n","");
                        }
                        else{resultado += "Área ------------> 281.748 km²\n";}
                    }
                    else if (estado.equals("sc")) {
                        if(resultado.contains("Área ------------> 95.346 km²\n")){
                            resultado = resultado.replaceAll("Área ------------> 95.346 km²\n","");
                        }
                        else{resultado += "Área ------------> 95.346 km²\n";}

                    }

                IDresultado.setText(resultado);
                IDresultado.setVisibility(View.VISIBLE);
            }
        });
        checkIdh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (estado.equals("pr")) {

                        if(resultado.contains("IDH --------------> 0,749\n")){
                            resultado = resultado.replaceAll("IDH --------------> 0,749\n","");
                        }
                        else{resultado += "IDH --------------> 0,749\n";}

                    }
                    else if (estado.equals("rs")) {

                        if(resultado.contains("IDH --------------> 0,652\n")){
                            resultado = resultado.replaceAll("IDH --------------> 0,652\n","");
                        }
                        else{resultado += "IDH --------------> 0,652\n";}

                    }
                    else if (estado.equals("sc")) {

                        if(resultado.contains("IDH --------------> 0,840\n")){
                            resultado = resultado.replaceAll("IDH --------------> 0,840\n","");
                        }
                        else{resultado += "IDH --------------> 0,840\n";}

                    }

                IDresultado.setText(resultado);
                IDresultado.setVisibility(View.VISIBLE);
            }
        });
        checkMunicipios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (estado.equals("pr")) {

                        if(resultado.contains("Municipios --> 399\n")){
                            resultado = resultado.replaceAll("Municipios --> 399\n","");
                        }
                        else{ resultado += "Municipios --> 399\n";}

                    }
                    else if (estado.equals("rs")) {

                        if(resultado.contains("Municipios --> 497\n")){
                            resultado = resultado.replaceAll("Municipios --> 497\n","");
                        }
                        else{resultado += "Municipios --> 497\n";}

                    }
                    else if (estado.equals("sc")) {

                        if(resultado.contains("Municipios --> 295\n")){
                            resultado = resultado.replaceAll("Municipios --> 295\n","");
                        }
                        else{resultado += "Municipios --> 295\n";}

                    }

                IDresultado.setText(resultado);

                IDresultado.setVisibility(View.VISIBLE);

            }
        });
        checkPopulacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (estado.equals("pr")) {

                        if(resultado.contains("População --> 11,8 Milhões\n")){
                            resultado = resultado.replaceAll("População --> 11,8 Milhões\n","");
                        }
                        else{resultado += "População --> 11,8 Milhões\n";}

                    }
                    else if (estado.equals("rs")) {

                        if(resultado.contains("População --> 11.08 milhões\n")){
                            resultado = resultado.replaceAll("População --> 11.08 milhões\n","");
                        }
                        else{resultado += "População --> 11.08 milhões\n";}

                    }
                    else if (estado.equals("sc")) {

                        if(resultado.contains("População --> 7,2 milhões\n")){
                            resultado = resultado.replaceAll("População --> 7,2 milhões\n","");
                        }
                        else{resultado += "População --> 7,2 milhões\n";}

                    }

                IDresultado.setText(resultado);
                IDresultado.setVisibility(View.VISIBLE);
            }
        });

    }

    public void radioButtonListener(){
        estados.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButtonPR){
                    IDmapa.setImageResource(R.drawable.mapapr);
                    estado = "pr";
                    resultado = "";
                    IDresultado.setText("");

                    checkCapital.setChecked(false);
                    checkArea.setChecked(false);
                    checkIdh.setChecked(false);
                    checkMunicipios.setChecked(false);
                    checkPopulacao.setChecked(false);

                }
                else if (checkedId == R.id.radioButtonRS){
                    IDmapa.setImageResource(R.drawable.mapars);
                    estado = "rs";
                    IDresultado.setText("");
                    resultado = "";

                    checkCapital.setChecked(false);
                    checkArea.setChecked(false);
                    checkIdh.setChecked(false);
                    checkMunicipios.setChecked(false);
                    checkPopulacao.setChecked(false);
                }
                else if (checkedId == R.id.radioButtonSC){
                    IDmapa.setImageResource(R.drawable.mapasc);
                    estado = "sc";
                    IDresultado.setText("");
                    resultado = "";

                    checkCapital.setChecked(false);
                    checkArea.setChecked(false);
                    checkIdh.setChecked(false);
                    checkMunicipios.setChecked(false);
                    checkPopulacao.setChecked(false);
                }
            }
        });
    }

    public boolean validateestado(){

        if(radioPR.isChecked() || radioSC.isChecked() || radioRS.isChecked() ){
            return true;
        }
        else {
            return false;
        }
    }
}
