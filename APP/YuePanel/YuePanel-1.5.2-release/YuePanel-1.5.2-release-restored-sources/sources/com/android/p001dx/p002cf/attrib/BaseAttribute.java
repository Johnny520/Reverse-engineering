package com.android.p001dx.p002cf.attrib;

import com.android.p001dx.p002cf.iface.Attribute;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAttribute implements Attribute {
    private final String name;

    public BaseAttribute(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.name = str;
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
    public String getName() {
        return this.name;
    }
}
