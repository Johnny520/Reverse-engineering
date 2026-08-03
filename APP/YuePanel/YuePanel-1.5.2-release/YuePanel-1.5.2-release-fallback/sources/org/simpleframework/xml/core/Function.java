package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class Function {
    private final boolean contextual;
    private final java.lang.reflect.Method method;

    public Function(java.lang.reflect.Method r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Function(java.lang.reflect.Method r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.contextual = r2
            r0.method = r1
            return
    }

    public java.lang.Object call(org.simpleframework.xml.core.Context r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            r0 = 0
            if (r4 == 0) goto L21
            org.simpleframework.xml.core.Session r3 = r3.getSession()
            java.util.Map r3 = r3.getMap()
            boolean r1 = r2.contextual
            if (r1 == 0) goto L1a
            java.lang.reflect.Method r0 = r2.method
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object r3 = r0.invoke(r4, r3)
            return r3
        L1a:
            java.lang.reflect.Method r3 = r2.method
            java.lang.Object r3 = r3.invoke(r4, r0)
            return r3
        L21:
            return r0
    }
}
