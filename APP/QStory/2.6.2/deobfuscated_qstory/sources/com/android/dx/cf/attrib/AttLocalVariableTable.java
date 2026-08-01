package com.android.dx.cf.attrib;

import com.android.dx.cf.code.LocalVariableList;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class AttLocalVariableTable extends BaseLocalVariables {
    public static final String ATTRIBUTE_NAME = "LocalVariableTable";

    public AttLocalVariableTable(LocalVariableList localVariableList) {
        super(ATTRIBUTE_NAME, localVariableList);
    }
}
