package com.android.dx.cf.iface;

/* JADX INFO: loaded from: classes.dex */
public interface AttributeList {
    int byteLength();

    com.android.dx.cf.iface.Attribute findFirst(java.lang.String r1);

    com.android.dx.cf.iface.Attribute findNext(com.android.dx.cf.iface.Attribute r1);

    com.android.dx.cf.iface.Attribute get(int r1);

    boolean isMutable();

    int size();
}
