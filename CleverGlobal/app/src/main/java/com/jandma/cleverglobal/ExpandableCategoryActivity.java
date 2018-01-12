package com.jandma.cleverglobal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExpandableCategoryActivity extends AppCompatActivity {

    private ExpandableListView expLV;
    private ExpLVAdapter adapter;
    private ArrayList<CategoriaItem> listCategory;
    private Map<CategoriaItem, ArrayList<SubcategoriaItem>> mapSubcategory;

    Button boton2Continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_category);

        expLV = findViewById(R.id.expLV);
        listCategory = new ArrayList<>();
        mapSubcategory = new HashMap<>();

        cargarDatos();

        boton2Continuar = findViewById(R.id.button2Continue);

        boton2Continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( ExpandableCategoryActivity.this, UserDateActivity.class);
                startActivity(i);
            }
        });



    }

    private void cargarDatos() {

        ArrayList<SubcategoriaItem> edifiYObraCivil = new ArrayList<>();
        ArrayList<SubcategoriaItem> electriYElectro = new ArrayList<>();
        ArrayList<SubcategoriaItem> energiaYAgua = new ArrayList<>();
        ArrayList<SubcategoriaItem> fabricacion = new ArrayList<>();
        ArrayList<SubcategoriaItem> alimentaria = new ArrayList<>();
        ArrayList<SubcategoriaItem> instalYMante = new ArrayList<>();
        ArrayList<SubcategoriaItem> sectorMadera = new ArrayList<>();
        ArrayList<SubcategoriaItem> quimica = new ArrayList<>();
        ArrayList<SubcategoriaItem> sanitaria = new ArrayList<>();
        ArrayList<SubcategoriaItem> transporte = new ArrayList<>();
        ArrayList<SubcategoriaItem> mineria = new ArrayList<>();

        listCategory.add(new CategoriaItem("Edificación y Obra Civil", R.drawable.ic_skyscrapper));
        listCategory.add(new CategoriaItem("Electricidad y Electrónica", R.drawable.ic_light_bulb));
        listCategory.add(new CategoriaItem("Energía y Agua", R.drawable.ic_green_energy));
        listCategory.add(new CategoriaItem("Fabricación", R.drawable.ic_factory));
        listCategory.add(new CategoriaItem("Alimentaria", R.drawable.ic_dinner));
        listCategory.add(new CategoriaItem("Instalación y Mantenimiento", R.drawable.ic_icon));
        listCategory.add(new CategoriaItem("Sector de la madera", R.drawable.ic_trees));
        listCategory.add(new CategoriaItem("Química", R.drawable.ic_flasks));
        listCategory.add(new CategoriaItem("Sanitaria", R.drawable.ic_first_aid_kit));
        listCategory.add(new CategoriaItem("Transporte", R.drawable.ic_delivery_truck));
        listCategory.add(new CategoriaItem("Minería", R.drawable.ic_mine_cart));

        edifiYObraCivil.add(new SubcategoriaItem(1,"Técnico de seguridad"));
        edifiYObraCivil.add(new SubcategoriaItem(2,"Montador de estructuras"));
        edifiYObraCivil.add(new SubcategoriaItem(3,"Escayolista"));
        edifiYObraCivil.add(new SubcategoriaItem(4,"Soldador"));
        edifiYObraCivil.add(new SubcategoriaItem(5,"Ferralista"));
        edifiYObraCivil.add(new SubcategoriaItem(6,"Operario de máquinaria"));

        electriYElectro.add(new SubcategoriaItem(7,"Técnico de seguridad"));
        electriYElectro.add(new SubcategoriaItem(8,"Fabr. de elementos metalicos"));
        electriYElectro.add(new SubcategoriaItem(9,"Instalaciones eléctricas y automáticas"));
        electriYElectro.add(new SubcategoriaItem(10,"Mantenimiento electrónico"));
        electriYElectro.add(new SubcategoriaItem(11,"Electromedicina clínica"));


        energiaYAgua.add(new SubcategoriaItem(12,"Técnico de seguridad"));
        energiaYAgua.add(new SubcategoriaItem(13,"Energía renovable"));
        energiaYAgua.add(new SubcategoriaItem(14,"Gestión del agua"));
        energiaYAgua.add(new SubcategoriaItem(15,"Centrales eléctricas"));
        energiaYAgua.add(new SubcategoriaItem(16,"Tratamiento de aguas"));

        fabricacion.add(new SubcategoriaItem(17,"Técnico de seguridad"));
        fabricacion.add(new SubcategoriaItem(18,"Construcciones metálicas"));
        fabricacion.add(new SubcategoriaItem(19,"Diseño en fabricación metálica"));
        fabricacion.add(new SubcategoriaItem(20,"Soldadura y calderería"));
        fabricacion.add(new SubcategoriaItem(21,"Mecanizado"));

        alimentaria.add(new SubcategoriaItem(22,"Técnico de seguridad"));
        alimentaria.add(new SubcategoriaItem(23,"Productos alimenticios"));
        alimentaria.add(new SubcategoriaItem(24,"Panadería, Repostería y Confitería"));
        alimentaria.add(new SubcategoriaItem(25,"Vitivinicultura"));
        alimentaria.add(new SubcategoriaItem(26,"Industrias alimentarias"));

        instalYMante.add(new SubcategoriaItem(27,"Técnico de seguridad"));
        instalYMante.add(new SubcategoriaItem(28,"Electromecánico"));
        instalYMante.add(new SubcategoriaItem(29,"Mecatrónica industrial"));
        instalYMante.add(new SubcategoriaItem(30,"Mantenimiento de viviendas"));
        instalYMante.add(new SubcategoriaItem(31,"Produccion de calor"));

        sectorMadera.add(new SubcategoriaItem(32,"Técnico de seguridad"));
        sectorMadera.add(new SubcategoriaItem(33,"Carpientaría y mueble"));
        sectorMadera.add(new SubcategoriaItem(34,"Instalación y amueblamiento"));
        sectorMadera.add(new SubcategoriaItem(35,"Diseño y amueblamiento"));

        quimica.add(new SubcategoriaItem(36,"Técnico de seguridad"));
        quimica.add(new SubcategoriaItem(37,"Planta química"));
        quimica.add(new SubcategoriaItem(38,"Lab. Analisis"));
        quimica.add(new SubcategoriaItem(39,"Control de calidad"));
        quimica.add(new SubcategoriaItem(40,"Química industrial"));

        sanitaria.add(new SubcategoriaItem(41,"Técnico de seguridad"));
        sanitaria.add(new SubcategoriaItem(42,"Prótesis dentales"));
        sanitaria.add(new SubcategoriaItem(43,"Radioterapia y Dosimetría"));
        sanitaria.add(new SubcategoriaItem(44,"Lab. Clínico y Biomédico"));
        sanitaria.add(new SubcategoriaItem(45,"Audiología Protésica"));
        sanitaria.add(new SubcategoriaItem(46,"Farmacia y Parafarmacia"));

        transporte.add(new SubcategoriaItem(47,"Técnico de seguridad"));
        transporte.add(new SubcategoriaItem(48,"Carrocería"));
        transporte.add(new SubcategoriaItem(49,"Electromecanica de maquinaria"));
        transporte.add(new SubcategoriaItem(50,"Automoción"));
        transporte.add(new SubcategoriaItem(51,"Mantenimiento de vehículos"));

        mineria.add(new SubcategoriaItem(52,"Técnico de seguridad"));
        mineria.add(new SubcategoriaItem(53,"Excavaciones"));
        mineria.add(new SubcategoriaItem(54,"Sondeos"));
        mineria.add(new SubcategoriaItem(55,"Piedra natural"));

        mapSubcategory.put(listCategory.get(0), edifiYObraCivil);
        mapSubcategory.put(listCategory.get(1), electriYElectro);
        mapSubcategory.put(listCategory.get(2), energiaYAgua);
        mapSubcategory.put(listCategory.get(3), fabricacion);
        mapSubcategory.put(listCategory.get(4), alimentaria);
        mapSubcategory.put(listCategory.get(5), instalYMante);
        mapSubcategory.put(listCategory.get(6), sectorMadera);
        mapSubcategory.put(listCategory.get(7), quimica);
        mapSubcategory.put(listCategory.get(8), sanitaria);
        mapSubcategory.put(listCategory.get(9), transporte);
        mapSubcategory.put(listCategory.get(10), mineria);

        adapter = new ExpLVAdapter(listCategory, mapSubcategory, this);
        expLV.setAdapter(adapter);
    }

}
