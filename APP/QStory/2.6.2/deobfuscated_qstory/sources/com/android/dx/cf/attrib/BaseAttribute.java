package com.android.dx.cf.attrib;

import bsh.C2632;
import com.android.dx.cf.iface.Attribute;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAttribute implements Attribute {
    private final String name;

    public BaseAttribute(String str) {
        if (str != null) {
            this.name = str;
        } else {
            C2632.m5298("name == null");
            throw null;
        }
    }

    @Override // com.android.dx.cf.iface.Attribute
    public String getName() {
        return this.name;
    }
}
