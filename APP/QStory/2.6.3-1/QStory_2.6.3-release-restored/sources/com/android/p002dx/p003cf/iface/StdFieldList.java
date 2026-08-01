package com.android.p002dx.p003cf.iface;

import com.android.p002dx.util.FixedSizeList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class StdFieldList extends FixedSizeList implements FieldList {
    public StdFieldList(int i) {
        super(i);
    }

    @Override // com.android.p002dx.p003cf.iface.FieldList
    public Field get(int i) {
        return (Field) get0(i);
    }

    public void set(int i, Field field) {
        set0(i, field);
    }
}
