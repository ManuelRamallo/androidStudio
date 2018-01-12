package com.jandma.cleverglobal;

/**
 * Created by mrdiaz on 12/01/2018.
 */

public class HijosSeleccionadosItem {
    private int groupPosition;
    private int childPosition;

    public HijosSeleccionadosItem(int groupPosition, int childPosition) {
        this.groupPosition = groupPosition;
        this.childPosition = childPosition;
    }

    public int getGroupPosition() {
        return groupPosition;
    }

    public void setGroupPosition(int groupPosition) {
        this.groupPosition = groupPosition;
    }

    public int getChildPosition() {
        return childPosition;
    }

    public void setChildPosition(int childPosition) {
        this.childPosition = childPosition;
    }
}
