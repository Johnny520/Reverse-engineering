package p000;

/* JADX INFO: renamed from: q6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0713q6 extends p000.i91 {

    /* JADX INFO: renamed from: β */
    public static volatile p000.C0713q6 f8883;

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f8884;

    public C0713q6(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto Lf;
                default: goto L3;
            }
        L3:
            r1.<init>()
            q6 r2 = new q6
            r0 = 1
            r2.<init>(r0)
            r1.f8884 = r2
            return
        Lf:
            r1.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f8884 = r2
            qr r1 = new qr
            r1.<init>()
            r2 = 4
            java.util.concurrent.Executors.newFixedThreadPool(r2, r1)
            return
    }

    /* JADX INFO: renamed from: π */
    public static p000.C0713q6 m4766() {
            q6 r0 = p000.C0713q6.f8883
            if (r0 == 0) goto L7
            q6 r0 = p000.C0713q6.f8883
            return r0
        L7:
            java.lang.Class<q6> r0 = p000.C0713q6.class
            monitor-enter(r0)
            q6 r1 = p000.C0713q6.f8883     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            q6 r1 = new q6     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            p000.C0713q6.f8883 = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1d
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            q6 r0 = p000.C0713q6.f8883
            return r0
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }
}
