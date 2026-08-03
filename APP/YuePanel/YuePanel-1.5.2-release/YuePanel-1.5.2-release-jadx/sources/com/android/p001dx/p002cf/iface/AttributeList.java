package com.android.p001dx.p002cf.iface;

/* JADX INFO: loaded from: classes.dex */
public interface AttributeList {
    int byteLength();

    Attribute findFirst(String str);

    Attribute findNext(Attribute attribute);

    Attribute get(int i);

    boolean isMutable();

    int size();
}
