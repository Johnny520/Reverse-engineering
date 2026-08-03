package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class bi {
    public static java.util.concurrent.CountDownLatch a;


    public static class a {
        private static com.tendcloud.tenddata.bi instance;

        static {
                com.tendcloud.tenddata.bi r0 = new com.tendcloud.tenddata.bi
                r1 = 0
                r0.<init>(r1)
                com.tendcloud.tenddata.bi.a.instance = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ com.tendcloud.tenddata.bi access$000() {
                com.tendcloud.tenddata.bi r0 = com.tendcloud.tenddata.bi.a.instance
                return r0
        }
    }

    static {
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            com.tendcloud.tenddata.bi.a = r0
            return
    }

    private bi() {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1.a(r0)
            return
    }

    public /* synthetic */ bi(com.tendcloud.tenddata.bi.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.bi a() {
            com.tendcloud.tenddata.bi r0 = com.tendcloud.tenddata.bi.a.access$000()
            return r0
    }

    private void a(android.content.Context r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.util.concurrent.ThreadPoolExecutor r0 = com.tendcloud.tenddata.w.a     // Catch: java.lang.Throwable -> Ld
            com.tendcloud.tenddata.bi$1 r1 = new com.tendcloud.tenddata.bi$1     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.execute(r1)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }
}
