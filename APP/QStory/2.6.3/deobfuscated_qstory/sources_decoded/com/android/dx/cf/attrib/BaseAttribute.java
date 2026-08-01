package com.android.dx.cf.attrib;

import bsh.C2633;
import com.android.dx.cf.iface.Attribute;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAttribute implements Attribute {
    private final String name;

    public BaseAttribute(String str) {
        if (str != null) {
            this.name = str;
        } else {
            C2633.m5343("name == null");
            throw null;
        }
    }

    @Override // com.android.dx.cf.iface.Attribute
    public String getName() {
        return this.name;
    }
}
