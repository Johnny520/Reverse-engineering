package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bj {
    private static volatile com.tendcloud.tenddata.bj a;

    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.bj r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private bj() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.bj a() {
            com.tendcloud.tenddata.bj r0 = com.tendcloud.tenddata.bj.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bj> r0 = com.tendcloud.tenddata.bj.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bj r1 = com.tendcloud.tenddata.bj.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bj r1 = new com.tendcloud.tenddata.bj     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bj.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bj r0 = com.tendcloud.tenddata.bj.a
            return r0
    }

    public final void onTDEBEventIAP(com.tendcloud.tenddata.zz.a r6) {
            r5 = this;
            if (r6 == 0) goto L6f
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r6.paraMap     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L6f
            java.lang.String r1 = "apiType"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L6f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L6f
            r1 = 8
            if (r0 == r1) goto L19
            goto L6f
        L19:
            com.tendcloud.tenddata.bv r0 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r6.paraMap     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "data"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L6f
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r6.paraMap     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "service"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L6f
            com.tendcloud.tenddata.a r2 = (com.tendcloud.tenddata.a) r2     // Catch: java.lang.Throwable -> L6f
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r6.paraMap     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "domain"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L6f
            r0.b = r3     // Catch: java.lang.Throwable -> L6f
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r6.paraMap     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "action"
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L6f
            r0.c = r6     // Catch: java.lang.Throwable -> L6f
            boolean r6 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L6f
            if (r6 == 0) goto L54
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L6f
            r0.d = r1     // Catch: java.lang.Throwable -> L6f
        L54:
            r0.a = r2     // Catch: java.lang.Throwable -> L6f
            com.tendcloud.tenddata.z r6 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L6f
            r6.post(r0)     // Catch: java.lang.Throwable -> L6f
            com.tendcloud.tenddata.bu r6 = new com.tendcloud.tenddata.bu     // Catch: java.lang.Throwable -> L6f
            r6.<init>()     // Catch: java.lang.Throwable -> L6f
            r6.a = r2     // Catch: java.lang.Throwable -> L6f
            com.tendcloud.tenddata.bu$a r0 = com.tendcloud.tenddata.bu.a.IMMEDIATELY     // Catch: java.lang.Throwable -> L6f
            r6.b = r0     // Catch: java.lang.Throwable -> L6f
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L6f
            r0.post(r6)     // Catch: java.lang.Throwable -> L6f
        L6f:
            return
    }
}
