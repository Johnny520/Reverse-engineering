package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bw implements java.lang.reflect.InvocationHandler {
    public bw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
            r6 = this;
            java.lang.String r7 = "getAAID"
            java.lang.String r8 = "getVAID"
            java.lang.String r0 = "getOAID"
            r1 = 1
            r2 = 0
            r3 = r9[r1]     // Catch: java.lang.Throwable -> L26
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L26
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r3 = r3.getMethod(r0, r4)     // Catch: java.lang.Throwable -> L26
            r4 = r9[r1]     // Catch: java.lang.Throwable -> L26
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L26
            com.tendcloud.tenddata.df r4 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L26
            r4.setOAID(r3)     // Catch: java.lang.Throwable -> L26
            goto L43
        L26:
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L43
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L43
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r0 = r3.getMethod(r0, r4)     // Catch: java.lang.Throwable -> L43
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.invoke(r3, r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L43
            com.tendcloud.tenddata.df r3 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L43
            r3.setOAID(r0)     // Catch: java.lang.Throwable -> L43
        L43:
            r0 = 0
            r3 = r9[r1]     // Catch: java.lang.Throwable -> L6a
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L6a
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Method r3 = r3.getMethod(r8, r4)     // Catch: java.lang.Throwable -> L6a
            r4 = r9[r1]     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6a
            com.tendcloud.tenddata.df r4 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L6a
            boolean r5 = com.tendcloud.tenddata.y.b(r3)     // Catch: java.lang.Throwable -> L6a
            if (r5 != 0) goto L65
            goto L66
        L65:
            r3 = r0
        L66:
            r4.setVAID(r3)     // Catch: java.lang.Throwable -> L6a
            goto L8f
        L6a:
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L8f
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L8f
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L8f
            java.lang.reflect.Method r8 = r3.getMethod(r8, r4)     // Catch: java.lang.Throwable -> L8f
            r3 = r9[r2]     // Catch: java.lang.Throwable -> L8f
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r8 = r8.invoke(r3, r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L8f
            com.tendcloud.tenddata.df r3 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> L8f
            boolean r4 = com.tendcloud.tenddata.y.b(r8)     // Catch: java.lang.Throwable -> L8f
            if (r4 != 0) goto L8b
            goto L8c
        L8b:
            r8 = r0
        L8c:
            r3.setVAID(r8)     // Catch: java.lang.Throwable -> L8f
        L8f:
            r8 = r9[r1]     // Catch: java.lang.Throwable -> Lb5
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lb5
            java.lang.reflect.Method r8 = r8.getMethod(r7, r3)     // Catch: java.lang.Throwable -> Lb5
            r1 = r9[r1]     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r8 = r8.invoke(r1, r3)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Lb5
            com.tendcloud.tenddata.df r1 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = com.tendcloud.tenddata.y.b(r8)     // Catch: java.lang.Throwable -> Lb5
            if (r3 != 0) goto Lb0
            goto Lb1
        Lb0:
            r8 = r0
        Lb1:
            r1.setAAID(r8)     // Catch: java.lang.Throwable -> Lb5
            goto Lda
        Lb5:
            r8 = r9[r2]     // Catch: java.lang.Throwable -> Lda
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> Lda
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lda
            java.lang.reflect.Method r7 = r8.getMethod(r7, r1)     // Catch: java.lang.Throwable -> Lda
            r8 = r9[r2]     // Catch: java.lang.Throwable -> Lda
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r7 = r7.invoke(r8, r9)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lda
            com.tendcloud.tenddata.df r8 = com.tendcloud.tenddata.df.a()     // Catch: java.lang.Throwable -> Lda
            boolean r9 = com.tendcloud.tenddata.y.b(r7)     // Catch: java.lang.Throwable -> Lda
            if (r9 != 0) goto Ld6
            goto Ld7
        Ld6:
            r7 = r0
        Ld7:
            r8.setAAID(r7)     // Catch: java.lang.Throwable -> Lda
        Lda:
            java.util.concurrent.CountDownLatch r7 = com.tendcloud.tenddata.bi.a
            r7.countDown()
            return r0
    }
}
