package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bd {
    private static volatile com.tendcloud.tenddata.bd a;


    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.bd r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    public bd() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.bd a() {
            com.tendcloud.tenddata.bd r0 = com.tendcloud.tenddata.bd.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bd> r0 = com.tendcloud.tenddata.bd.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bd r1 = com.tendcloud.tenddata.bd.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bd r1 = new com.tendcloud.tenddata.bd     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bd.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bd r0 = com.tendcloud.tenddata.bd.a
            return r0
    }

    public void b() {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = com.tendcloud.tenddata.w.a     // Catch: java.lang.Throwable -> La
            com.tendcloud.tenddata.bd$1 r1 = new com.tendcloud.tenddata.bd$1     // Catch: java.lang.Throwable -> La
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La
            r0.execute(r1)     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public final void onTDEBEventCommonEnvironment(com.tendcloud.tenddata.bt r2) {
            r1 = this;
            int r2 = r2.a     // Catch: java.lang.Throwable -> L9
            r0 = 3
            if (r2 == r0) goto L6
            return
        L6:
            r1.b()     // Catch: java.lang.Throwable -> L9
        L9:
            return
    }
}
