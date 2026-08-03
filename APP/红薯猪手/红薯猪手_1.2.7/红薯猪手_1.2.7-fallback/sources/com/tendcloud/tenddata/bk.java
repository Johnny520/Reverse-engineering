package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bk {
    private static volatile com.tendcloud.tenddata.bk a;

    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.bk r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private bk() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.bk a() {
            com.tendcloud.tenddata.bk r0 = com.tendcloud.tenddata.bk.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bk> r0 = com.tendcloud.tenddata.bk.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bk r1 = com.tendcloud.tenddata.bk.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bk r1 = new com.tendcloud.tenddata.bk     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bk.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bk r0 = com.tendcloud.tenddata.bk.a
            return r0
    }

    public final void onTDEBEventIndustry(com.tendcloud.tenddata.zz.a r6) {
            r5 = this;
            if (r6 == 0) goto L5d
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r6.paraMap     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5d
            java.lang.String r1 = "apiType"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5d
            r1 = 17
            if (r0 == r1) goto L19
            goto L5d
        L19:
            com.tendcloud.tenddata.bv r0 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> L5d
            r0.<init>()     // Catch: java.lang.Throwable -> L5d
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r6.paraMap     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "data"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L5d
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r6.paraMap     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "service"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L5d
            com.tendcloud.tenddata.a r2 = (com.tendcloud.tenddata.a) r2     // Catch: java.lang.Throwable -> L5d
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r6.paraMap     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "domain"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L5d
            r0.b = r3     // Catch: java.lang.Throwable -> L5d
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r6.paraMap     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "action"
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L5d
            r0.c = r6     // Catch: java.lang.Throwable -> L5d
            boolean r6 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L54
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L5d
            r0.d = r1     // Catch: java.lang.Throwable -> L5d
        L54:
            r0.a = r2     // Catch: java.lang.Throwable -> L5d
            com.tendcloud.tenddata.z r6 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L5d
            r6.post(r0)     // Catch: java.lang.Throwable -> L5d
        L5d:
            return
    }
}
