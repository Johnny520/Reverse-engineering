package com.android.p001dx.p002cf.iface;

import com.android.p001dx.util.FixedSizeList;

/* JADX INFO: loaded from: classes.dex */
public final class StdFieldList extends FixedSizeList implements FieldList {
    public StdFieldList(int i) {
        super(i);
    }

    @Override // com.android.p001dx.p002cf.iface.FieldList
    public Field get(int i) {
        return (Field) get0(i);
    }

    public void set(int i, Field field) {
        set0(i, field);
    }
}
