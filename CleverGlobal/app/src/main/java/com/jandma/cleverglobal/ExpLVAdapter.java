package com.jandma.cleverglobal;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Jorge Amores on 11/01/2018.
 */

public class ExpLVAdapter extends BaseExpandableListAdapter {

    private ArrayList<HijosSeleccionadosItem> seleccionados;
    private ArrayList<CategoriaItem> listCategory;
    private Map<CategoriaItem, ArrayList<SubcategoriaItem>> mapSubcategory;
    private Context context;

    public ExpLVAdapter(ArrayList<CategoriaItem> listCategory, Map<CategoriaItem, ArrayList<SubcategoriaItem>> mapSubcategory, Context context) {
        this.listCategory = listCategory;
        this.mapSubcategory = mapSubcategory;
        this.context = context;
        this.seleccionados = new ArrayList<>();
    }

    @Override
    public int getGroupCount() {
        return listCategory.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mapSubcategory.get(listCategory.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listCategory.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mapSubcategory.get(listCategory.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        Log.i("METODO", "entra en getChildId: "+groupPosition+","+childPosition);
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        CategoriaItem item = (CategoriaItem) getGroup(groupPosition);
        String nombreCategoria = item.getNombre();
        int iconoCategoria = item.getIcono();
        convertView = LayoutInflater.from(context).inflate(R.layout.elv_category, null);
        TextView tvCategory = convertView.findViewById(R.id.tvGroup);
        tvCategory.setText(nombreCategoria);

        ImageView imageViewCategoria = convertView.findViewById(R.id.ivIcono);
        imageViewCategoria.setImageResource(iconoCategoria);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        Log.i("METODO","Entra en getChildView");
        final int childPos = childPosition;
        final int groupPos = groupPosition;
        SubcategoriaItem item = (SubcategoriaItem) getChild(groupPosition, childPosition);
        convertView = LayoutInflater.from(context).inflate(R.layout.elv_subcategory, null);
        CheckBox tvSubcategory = convertView.findViewById(R.id.tvChild);
        tvSubcategory.setText(item.getNombre());

        tvSubcategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("METODO2",groupPos+","+childPos);
            }
        });

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        Log.i("METODO", "entra en getChildId: "+groupPosition+","+childPosition);
        return true;
    }
}
