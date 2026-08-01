package com.android.p002dx.p003cf.attrib;

import bsh.C3466;
import com.android.p002dx.p003cf.iface.Attribute;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAttribute implements Attribute {
    private final String name;

    public BaseAttribute(String str) {
        if (str != null) {
            this.name = str;
        } else {
            C3466.m5903("name == null");
            throw null;
        }
    }

    @Override // com.android.p002dx.p003cf.iface.Attribute
    public String getName() {
        return this.name;
    }
}
