package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e82 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3441;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Long f3442;

    public /* synthetic */ e82(java.lang.Long r1, int r2) {
            r0 = this;
            r0.f3441 = r2
            r0.f3442 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f3441
            java.lang.Long r3 = r3.f3442
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            p000.f82.m2068(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lf
        Lb:
            r3 = move-exception
            r3.getMessage()
        Lf:
            return
        L10:
            e82 r0 = p000.f82.f3825     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L19
            android.os.Handler r1 = p000.f82.f3821     // Catch: java.lang.Throwable -> L29
            r1.removeCallbacks(r0)     // Catch: java.lang.Throwable -> L29
        L19:
            e82 r0 = new e82     // Catch: java.lang.Throwable -> L29
            r1 = 1
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L29
            p000.f82.f3825 = r0     // Catch: java.lang.Throwable -> L29
            android.os.Handler r3 = p000.f82.f3821     // Catch: java.lang.Throwable -> L29
            r1 = 80
            r3.postDelayed(r0, r1)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r3 = move-exception
            r3.getMessage()
        L2d:
            return
    }
}
