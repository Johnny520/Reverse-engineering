package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class AddressMap {
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> map;

    public AddressMap() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            return
    }

    public int get(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.map
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L10
            r2 = -1
            goto L14
        L10:
            int r2 = r2.intValue()
        L14:
            return r2
    }

    public void put(int r2, int r3) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.map
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
    }
}
