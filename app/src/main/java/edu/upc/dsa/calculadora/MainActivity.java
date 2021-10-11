package edu.upc.dsa.calculadora;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    public ArrayList<String> realizarOperacion = new ArrayList<String>();
    public String operacionActual;
    public String operacionAnterior;
    public EditText screen;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (EditText)findViewById(R.id.pantalla);
    }
    public void boton0(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "0";
        screen.setText(operacionActual);
        realizarOperacion.add("0");
    }
    public void boton1(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "1";
        screen.setText(operacionActual);
        realizarOperacion.add("1");
    }
    public void boton2(View v){
        String dos = "2";
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "2";
        screen.setText(operacionActual);
        realizarOperacion.add(dos);
    }
    public void boton3(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "3";
        screen.setText(operacionActual);
        realizarOperacion.add("3");
    }
    public void boton4(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "4";
        screen.setText(operacionActual);
        realizarOperacion.add("4");
    }
    public void boton5(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "5";
        screen.setText(operacionActual);
        realizarOperacion.add("5");
    }
    public void boton6(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "6";
        screen.setText(operacionActual);
        realizarOperacion.add("6");
    }
    public void boton7(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "7";
        screen.setText(operacionActual);
        realizarOperacion.add("7");
    }
    public void boton8(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "8";
        screen.setText(operacionActual);
        realizarOperacion.add("8");
    }
    public void boton9(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "9";
        screen.setText(operacionActual);
        realizarOperacion.add("9");
    }
    public void botonSuma(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "+";
        screen.setText(operacionActual);
        realizarOperacion.add("+");
    }
    public void botonResta(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "-";
        screen.setText(operacionActual);
        realizarOperacion.add("-");
    }
    public void botonMult(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "*";
        screen.setText(operacionActual);
        realizarOperacion.add("*");
    }
    public void botonDiv(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "/";
        screen.setText(operacionActual);
        realizarOperacion.add("/");
    }
    public void botonCos(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "cos";
        screen.setText(operacionActual);
        realizarOperacion.add("cos");
    }
    public void botonSin(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "sin";
        screen.setText(operacionActual);
        realizarOperacion.add("sin");
    }
    public void botonTan(View v){
        operacionAnterior = screen.getText().toString();
        operacionActual = screen.getText().toString() + "tan";
        screen.setText(operacionActual);
        realizarOperacion.add("tan");
    }
    public void botonClear(View v){
        realizarOperacion.set(realizarOperacion.size() - 1, null);
        operacionActual = operacionAnterior;
        screen.setText(operacionActual);
    }
    public void botonCleanAll(View v){
        realizarOperacion.clear();
        operacionActual = "";
        screen.setText(operacionActual);
    }

    public void botonIgual(View v){
        int res;
        int temporal = 0;
        int decidir = 0;
        String op1 = null;
        String op2 = null;
        String signe = null;
        int i = 0;
        int primerOp1 = 0;
        int primerOp2 = 0;
        while ( i < realizarOperacion.size() + 1){

            if (i < realizarOperacion.size()) {

                if (!realizarOperacion.get(i).equals("+") && !realizarOperacion.get(i).equals("-") && !realizarOperacion.get(i).equals("*") && !realizarOperacion.get(i).equals("/") && !realizarOperacion.get(i).equals("cos") && !realizarOperacion.get(i).equals("sin") && !realizarOperacion.get(i).equals("tan")) {
                    if (decidir == 0) {
                        if (primerOp1 == 0) {
                            op1 = realizarOperacion.get(i);
                            primerOp1 = 1;
                        } else {
                            op1 = op1 + realizarOperacion.get(i);
                        }
                    } else {
                        if (primerOp2 == 0) {
                            op2 = realizarOperacion.get(i);
                            primerOp2 = 1;
                        } else {
                            op2 = op2 + realizarOperacion.get(i);
                        }
                    }
                } else {
                    if (realizarOperacion.get(i) == "cos") {
                        res = (int) Math.cos(Integer.parseInt(op1));
                    }
                    if (realizarOperacion.get(i) == "sin") {
                        res = (int) Math.sin(Integer.parseInt(op1));
                    }
                    if (realizarOperacion.get(i) == "tan") {
                        res = (int) Math.tan(Integer.parseInt(op1));
                    } else {
                        if (decidir == 0) {
                            decidir = 1;
                            signe = realizarOperacion.get(i);
                        } else {
                            if (signe == "+") {
                                temporal = Integer.parseInt(op1) + Integer.parseInt(op2);
                                op1 = String.valueOf(temporal);
                                op2 = null;
                            }
                            if (signe == "-") {
                                temporal = Integer.parseInt(op1) - Integer.parseInt(op2);
                                op1 = String.valueOf(temporal);
                                op2 = null;
                            }
                            if (signe == "*") {
                                temporal = Integer.parseInt(op1) * Integer.parseInt(op2);
                                op1 = String.valueOf(temporal);
                                op2 = null;
                            }
                            if (signe == "/") {
                                temporal = Integer.parseInt(op1) / Integer.parseInt(op2);
                                op1 = String.valueOf(temporal);
                                op2 = null;
                            }
                            signe = realizarOperacion.get(i);
                        }
                    }
                }
            }
            else{
                if (signe == "+") {
                    temporal = Integer.parseInt(op1) + Integer.parseInt(op2);
                    op1 = String.valueOf(temporal);
                    op2 = null;
                }
                if (signe == "-") {
                    temporal = Integer.parseInt(op1) - Integer.parseInt(op2);
                    op1 = String.valueOf(temporal);
                    op2 = null;
                }
                if (signe == "*") {
                    temporal = Integer.parseInt(op1) * Integer.parseInt(op2);
                    op1 = String.valueOf(temporal);
                    op2 = null;
                }
                if (signe == "/") {
                    temporal = Integer.parseInt(op1) / Integer.parseInt(op2);
                    op1 = String.valueOf(temporal);
                    op2 = null;
                }
            }
            i++;
        }
        res =Integer.parseInt(op1);
        String resString = String.valueOf(res);
        screen.setText(resString);
    }
}