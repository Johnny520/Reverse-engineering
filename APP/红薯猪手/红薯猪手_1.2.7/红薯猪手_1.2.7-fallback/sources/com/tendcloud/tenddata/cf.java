package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class cf {
    public cf() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a() {
            java.lang.String r0 = "com.bun.miitmdid.core.MdidSdkHelper"
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static void reflectMSA(android.content.Context r9) {
            java.lang.String r0 = "com.bun.miitmdid.core.MdidSdkHelper"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "com.bun.miitmdid.interfaces.IIdentifierListener"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Ld
            goto L13
        Ld:
            java.lang.String r1 = "com.bun.supplier.IIdentifierListener"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L49
        L13:
            java.lang.ClassLoader r2 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L49
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L49
            r5 = 0
            r4[r5] = r1     // Catch: java.lang.Throwable -> L49
            com.tendcloud.tenddata.bw r6 = new com.tendcloud.tenddata.bw     // Catch: java.lang.Throwable -> L49
            r6.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = java.lang.reflect.Proxy.newProxyInstance(r2, r4, r6)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "InitSdk"
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L49
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L49
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L49
            r7[r3] = r8     // Catch: java.lang.Throwable -> L49
            r8 = 2
            r7[r8] = r1     // Catch: java.lang.Throwable -> L49
            java.lang.reflect.Method r0 = r0.getMethod(r4, r7)     // Catch: java.lang.Throwable -> L49
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L49
            r4[r5] = r9     // Catch: java.lang.Throwable -> L49
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L49
            r4[r3] = r9     // Catch: java.lang.Throwable -> L49
            r4[r8] = r2     // Catch: java.lang.Throwable -> L49
            r0.invoke(r1, r4)     // Catch: java.lang.Throwable -> L49
            goto L4e
        L49:
            java.util.concurrent.CountDownLatch r9 = com.tendcloud.tenddata.bi.a
            r9.countDown()
        L4e:
            return
    }
}
