package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1308;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f1309;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f1310;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ boolean f1311;

    public /* synthetic */ au1(android.app.Activity r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.f1308 = r0
            r1.<init>()
            r1.f1309 = r2
            r1.f1310 = r3
            r1.f1311 = r4
            return
    }

    public /* synthetic */ au1(boolean r2, android.app.Activity r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.f1308 = r0
            r1.<init>()
            r1.f1311 = r2
            r1.f1309 = r3
            r1.f1310 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f1308
            r1 = 1
            boolean r2 = r4.f1311
            java.lang.String r3 = r4.f1310
            android.app.Activity r4 = r4.f1309
            switch(r0) {
                case 0: goto L20;
                default: goto Lc;
            }
        Lc:
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r3, r1)     // Catch: java.lang.Throwable -> L1b
            r0.show()     // Catch: java.lang.Throwable -> L1b
            android.os.Handler r0 = p000.f82.f3821     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1f
            p000.f82.m2069(r4)     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r4 = move-exception
            r4.getMessage()
        L1f:
            return
        L20:
            if (r2 == 0) goto L34
            p000.AbstractC0976x9.m6537(r4)     // Catch: java.lang.Throwable -> L25
        L25:
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r3, r1)
            r4.show()
            android.app.AlertDialog r4 = p000.bv1.f1854
            if (r4 == 0) goto L3b
            r4.dismiss()
            goto L3b
        L34:
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r3, r1)
            r4.show()
        L3b:
            return
    }
}
