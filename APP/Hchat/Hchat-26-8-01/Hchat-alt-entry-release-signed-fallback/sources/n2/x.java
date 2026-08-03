package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements android.view.Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9002h;

    public /* synthetic */ x(androidx.profileinstaller.ProfileInstallerInitializer r1, android.content.Context r2) {
            r0 = this;
            r1 = 2
            r0.f9001g = r1
            r0.<init>()
            r0.f9002h = r2
            return
    }

    public /* synthetic */ x(java.lang.Runnable r1, int r2) {
            r0 = this;
            r0.f9001g = r2
            r0.f9002h = r1
            r0.<init>()
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r4) {
            r3 = this;
            int r0 = r3.f9001g
            java.lang.Object r1 = r3.f9002h
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L3e;
                default: goto L7;
            }
        L7:
            android.content.Context r1 = (android.content.Context) r1
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 < r5) goto L18
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            android.os.Handler r4 = h3.c.b(r4)
            goto L21
        L18:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
        L21:
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            r0 = 1000(0x3e8, float:1.401E-42)
            r2 = 1
            int r0 = java.lang.Math.max(r0, r2)
            int r5 = r5.nextInt(r0)
            c9.p1 r0 = new c9.p1
            r2 = 3
            r0.<init>(r1, r2)
            int r5 = r5 + 5000
            long r1 = (long) r5
            r4.postDelayed(r0, r1)
            return
        L3e:
            qg.g r1 = (qg.g) r1
            xg.e r0 = qg.c0.f11038a
            rg.e r0 = vg.m.f14353a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.B(r0, r4)
            return
        L4c:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            return
    }
}
