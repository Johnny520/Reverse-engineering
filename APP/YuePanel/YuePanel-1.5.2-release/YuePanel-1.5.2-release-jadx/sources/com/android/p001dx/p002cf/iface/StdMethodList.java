package com.android.p001dx.p002cf.iface;

import com.android.p001dx.util.FixedSizeList;

/* JADX INFO: loaded from: classes.dex */
public final class StdMethodList extends FixedSizeList implements MethodList {
    public StdMethodList(int i) {
        super(i);
    }

    @Override // com.android.p001dx.p002cf.iface.MethodList
    public Method get(int i) {
        return (Method) get0(i);
    }

    public void set(int i, Method method) {
        set0(i, method);
    }
}
