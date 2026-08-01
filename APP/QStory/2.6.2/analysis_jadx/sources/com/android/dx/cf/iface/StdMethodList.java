package com.android.dx.cf.iface;

import com.android.dx.util.FixedSizeList;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
