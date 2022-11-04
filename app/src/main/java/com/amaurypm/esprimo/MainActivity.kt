package com.amaurypm.esprimo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import com.amaurypm.esprimo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    private var formula = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val spinner: Spinner = binding.formulasSpinner
        spinner.onItemSelectedListener = this
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.formulas,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_toolbar, menu)

        return super.onCreateOptionsMenu(menu)

    }

    fun clickBoton(view: View) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, pos: Int, id: Long) {
        if (parent != null) {
            formula = parent.getItemAtPosition(pos).toString()
            when(parent.getItemAtPosition(pos).toString()){
                parent.getItemAtPosition(0).toString() -> {
                    binding.imagenFormula.setImageResource(R.drawable.area_triangulo)
                    binding.segundo.visibility = View.VISIBLE
                    binding.inputSegundo.visibility = View.VISIBLE
                    binding.primero.setText(R.string.b)
                    binding.segundo.setText(R.string.h)
                }
                parent.getItemAtPosition(1).toString() ->{
                    binding.imagenFormula.setImageResource(R.drawable.area_circulo)
                    binding.segundo.visibility = View.GONE
                    binding.inputSegundo.visibility = View.GONE
                    binding.primero.setText(R.string.r)
                }
                parent.getItemAtPosition(2).toString() -> {
                    binding.imagenFormula.setImageResource(R.drawable.volumen_cilindro)
                    binding.segundo.visibility = View.VISIBLE
                    binding.inputSegundo.visibility = View.VISIBLE
                    binding.primero.setText(R.string.r)
                    binding.segundo.setText(R.string.h)
                }
                else ->{
                    binding.primero.visibility = View.GONE
                    binding.inputPrimero.visibility = View.GONE

                    binding.segundo.visibility = View.GONE
                    binding.inputSegundo.visibility = View.GONE
                }
            }
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }

    fun area_triangulo(a_sin_validar: EditText, b_sin_validar:EditText) {

        val array = arrayOf(a_sin_validar, b_sin_validar)
        val inputs = arrayOf(binding.inputPrimero, binding.inputSegundo)

        for (i in 0..array.size - 1) {
            if (array[i].text.isEmpty()) {
                inputs[i].error = getString(R.string.vacio)
                return
            }
        }

        val a = a_sin_validar.text.toString().toDouble()
        val b = b_sin_validar.text.toString().toDouble()

        val resultado =(a*b)/2

        val parametros = Bundle()

        parametros.apply{
            putString("formula",formula)
            putDouble("resultado",resultado)
        }

        val intent = Intent(this, Result::class.java)
        intent.putExtras(parametros)
        startActivity(intent)
    }

    fun areaCirculo(a_sin_validar: EditText) {

        if(a_sin_validar.text.isEmpty()) {
            a_sin_validar.error = getString(R.string.vacio)
            return
        }

        val a = a_sin_validar.text.toString().toDouble()

        val resultado =(a*a*3.1416)
        val parametros = Bundle()

        parametros.apply{
            putString("formula",formula)
            putDouble("resultado",resultado)
        }

        val intent = Intent(this, Result::class.java)
        intent.putExtras(parametros)
        startActivity(intent)
    }

    fun volumen_Cilindro(a_sin_validar: EditText, b_sin_validar:EditText) {

        val array = arrayOf(a_sin_validar, b_sin_validar)
        val inputs = arrayOf(binding.inputPrimero, binding.inputSegundo)

        for (i in 0..array.size - 1) {
            if (array[i].text.isEmpty()) {
                inputs[i].error = getString(R.string.vacio)
                return
            }
        }

        val a = a_sin_validar.text.toString().toDouble()
        val b = b_sin_validar.text.toString().toDouble()

        val resultado =(a*a*3.1416) * b

        val parametros = Bundle()

        parametros.apply{
            putString("formula",formula)
            putDouble("resultado",resultado)
        }

        val intent = Intent(this, Result::class.java)
        intent.putExtras(parametros)
        startActivity(intent)

    }

    fun calcular(view: View): Double {
        var salida = 0.0

        val a=binding.inputPrimero
        val b=binding.inputSegundo

        when(formula){
            binding.formulasSpinner.getItemAtPosition(0).toString() -> {
                area_triangulo(a,b)
                return salida
            }
            binding.formulasSpinner.getItemAtPosition(1).toString() ->{
                areaCirculo(a)
                return salida
            }
            binding.formulasSpinner.getItemAtPosition(2).toString() -> {
                volumen_Cilindro(a,b)
                return salida
            }
            else ->{
                return salida
            }
        }
    }
}