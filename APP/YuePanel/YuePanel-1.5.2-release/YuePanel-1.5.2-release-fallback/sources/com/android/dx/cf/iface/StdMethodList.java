package com.android.dx.cf.iface;

/* JADX INFO: loaded from: classes.dex */
public final class StdMethodList extends com.android.dx.util.FixedSizeList implements com.android.dx.cf.iface.MethodList {
    public StdMethodList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.android.dx.cf.iface.MethodList
    public com.android.dx.cf.iface.Method get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.cf.iface.Method r1 = (com.android.dx.cf.iface.Method) r1
            return r1
    }

    public void set(int r1, com.android.dx.cf.iface.Method r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }
}
