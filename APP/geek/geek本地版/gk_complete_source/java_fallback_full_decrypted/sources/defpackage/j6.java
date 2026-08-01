package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends defpackage.ct {
    public static volatile defpackage.j6 e;
    public final java.lang.Object d;

    public j6(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto Lf;
                default: goto L3;
            }
        L3:
            r1.<init>()
            j6 r2 = new j6
            r0 = 1
            r2.<init>(r0)
            r1.d = r2
            return
        Lf:
            r1.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.d = r2
            dg r2 = new dg
            r2.<init>()
            r0 = 4
            java.util.concurrent.Executors.newFixedThreadPool(r0, r2)
            return
    }

    public static defpackage.j6 z() {
            j6 r0 = defpackage.j6.e
            if (r0 == 0) goto L7
            j6 r0 = defpackage.j6.e
            return r0
        L7:
            java.lang.Class<j6> r0 = defpackage.j6.class
            monitor-enter(r0)
            j6 r1 = defpackage.j6.e     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            j6 r1 = new j6     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            defpackage.j6.e = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1d
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            j6 r0 = defpackage.j6.e
            return r0
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }
}
