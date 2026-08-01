package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n22 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ long f7364;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f7365;

    public n22(long r1, android.app.Activity r3) {
            r0 = this;
            r0.<init>()
            r0.f7364 = r1
            r0.f7365 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            o22 r0 = p000.o22.f7889
            java.util.Set r1 = p000.o22.m4173()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L14
            android.os.Handler r4 = p000.o22.f7911
            java.lang.Object r0 = p000.o22.f7909
            r4.removeCallbacksAndMessages(r0)
            return
        L14:
            android.app.Activity r2 = r4.f7365
            android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L23
            goto L29
        L23:
            r0.m4190(r2, r1)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L2c
        L29:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L27
            goto L32
        L2c:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L32:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "rb7f5fa32cd8e8a76"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5985(r0)
        L49:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.f7364
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5d
            android.os.Handler r0 = p000.o22.f7911
            java.lang.Object r1 = p000.o22.f7909
            r2 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r4, r1, r2)
            goto L6e
        L5d:
            android.os.Handler r4 = p000.o22.f7911
            java.lang.Object r0 = p000.o22.f7909
            r4.removeCallbacksAndMessages(r0)
            o22 r4 = p000.o22.f7889
            p000.o22.m4160()
            java.lang.String r4 = "r516e1415d637b702"
            p000.C0888ux.m5985(r4)
        L6e:
            return
    }
}
