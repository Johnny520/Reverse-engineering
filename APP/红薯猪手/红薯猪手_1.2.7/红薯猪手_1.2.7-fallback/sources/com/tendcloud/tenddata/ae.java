package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class ae {
    private final java.lang.Object a;
    private final java.lang.reflect.Method b;
    private final int c;
    private boolean d;

    public ae(java.lang.Object r2, java.lang.reflect.Method r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.d = r0
            if (r2 == 0) goto L29
            if (r3 == 0) goto L21
            r1.a = r2
            r1.b = r3
            r3.setAccessible(r0)
            int r3 = r3.hashCode()
            int r3 = r3 + 31
            int r3 = r3 * 31
            int r2 = r2.hashCode()
            int r2 = r2 + r3
            r1.c = r2
            return
        L21:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "EventHandler method cannot be null."
            r2.<init>(r3)
            throw r2
        L29:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "EventHandler target cannot be null."
            r2.<init>(r3)
            throw r2
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.d = r0
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class<com.tendcloud.tenddata.ae> r2 = com.tendcloud.tenddata.ae.class
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.Throwable -> L26
            if (r2 == r3) goto L11
            return r1
        L11:
            com.tendcloud.tenddata.ae r5 = (com.tendcloud.tenddata.ae) r5     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r2 = r4.b     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r3 = r5.b     // Catch: java.lang.Throwable -> L26
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r5.a     // Catch: java.lang.Throwable -> L26
            if (r2 != r5) goto L24
            goto L25
        L24:
            r0 = r1
        L25:
            return r0
        L26:
            return r1
    }

    public void handleEvent(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r5.d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L22
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.toString()
            r3.append(r4)
            java.lang.String r4 = " has been invalidated and can no longer handle events."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0[r1] = r3
            com.tendcloud.tenddata.h.eForInternal(r0)
        L22:
            java.lang.reflect.Method r0 = r5.b     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r5.a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2d
            r2[r1] = r6     // Catch: java.lang.Throwable -> L2d
            r0.invoke(r3, r2)     // Catch: java.lang.Throwable -> L2d
        L2d:
            return
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "[EventHandler "
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.lang.reflect.Method r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
