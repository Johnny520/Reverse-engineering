package com.android.dx.cf.iface;

import com.android.dx.util.FixedSizeList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class StdMethodList extends FixedSizeList implements MethodList {
    public StdMethodList(int i) {
        super(i);
    }

    @Override // com.android.dx.cf.iface.MethodList
    public Method get(int i) {
        return (Method) get0(i);
    }

    public void set(int i, Method method) {
        set0(i, method);
    }
}
