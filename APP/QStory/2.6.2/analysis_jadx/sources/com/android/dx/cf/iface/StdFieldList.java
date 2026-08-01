package com.android.dx.cf.iface;

import com.android.dx.util.FixedSizeList;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class StdFieldList extends FixedSizeList implements FieldList {
    public StdFieldList(int i) {
        super(i);
    }

    @Override // com.android.dx.cf.iface.FieldList
    public Field get(int i) {
        return (Field) get0(i);
    }

    public void set(int i, Field field) {
        set0(i, field);
    }
}
