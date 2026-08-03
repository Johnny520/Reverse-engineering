package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class cm {
    public cm() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a() {
            r0 = 0
            boolean r1 = com.tendcloud.tenddata.bx.a()     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "com.android.id.impl.IdProviderImpl"
            java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Le
            r0 = 1
        Le:
            return r0
    }

    public static void reflectMiUi(android.content.Context r7) {
            java.lang.String r0 = "com.android.id.impl.IdProviderImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.Object r1 = r0.newInstance()     // Catch: java.lang.Throwable -> L80
            r2 = 0
            r3 = 1
            java.lang.String r4 = "getUDID"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L29
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L29
            r5[r2] = r7     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r4.invoke(r1, r5)     // Catch: java.lang.Throwable -> L29
            com.tendcloud.tenddata.df r5 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L29
            r5.setUDID(r4)     // Catch: java.lang.Throwable -> L29
        L29:
            java.lang.String r4 = "getOAID"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L46
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L46
            r5[r2] = r7     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r4.invoke(r1, r5)     // Catch: java.lang.Throwable -> L46
            com.tendcloud.tenddata.df r5 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L46
            r5.setOAID(r4)     // Catch: java.lang.Throwable -> L46
        L46:
            java.lang.String r4 = "getVAID"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L63
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L63
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L63
            r5[r2] = r7     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r4.invoke(r1, r5)     // Catch: java.lang.Throwable -> L63
            com.tendcloud.tenddata.df r5 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L63
            r5.setVAID(r4)     // Catch: java.lang.Throwable -> L63
        L63:
            java.lang.String r4 = "getAAID"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L80
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L80
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L80
            r3[r2] = r7     // Catch: java.lang.Throwable -> L80
            java.lang.Object r7 = r0.invoke(r1, r3)     // Catch: java.lang.Throwable -> L80
            com.tendcloud.tenddata.df r0 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L80
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L80
            r0.setAAID(r7)     // Catch: java.lang.Throwable -> L80
        L80:
            return
    }
}
