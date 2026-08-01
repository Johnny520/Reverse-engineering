package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class o50 implements p000.InterfaceC0411iy {

    /* JADX INFO: renamed from: α */
    public final android.content.Context f7952;

    /* JADX INFO: renamed from: β */
    public final p000.n50 f7953;

    /* JADX INFO: renamed from: γ */
    public final p000.C0381i2 f7954;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f7955;

    /* JADX INFO: renamed from: ε */
    public android.os.Handler f7956;

    /* JADX INFO: renamed from: ζ */
    public java.util.concurrent.ThreadPoolExecutor f7957;

    /* JADX INFO: renamed from: η */
    public java.util.concurrent.ThreadPoolExecutor f7958;

    /* JADX INFO: renamed from: θ */
    public p000.pd2 f7959;

    public o50(android.content.Context r2, p000.n50 r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f7955 = r0
            java.lang.String r0 = "Context cannot be null"
            p000.p91.m4418(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            r1.f7952 = r2
            r1.f7953 = r3
            i2 r2 = p000.p50.f8423
            r1.f7954 = r2
            return
    }

    @Override // p000.InterfaceC0411iy
    /* JADX INFO: renamed from: α */
    public final void mo2828(p000.pd2 r10) {
            r9 = this;
            java.lang.Object r1 = r9.f7955
            monitor-enter(r1)
            r9.f7959 = r10     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r10 = r9.f7955
            monitor-enter(r10)
            pd2 r0 = r9.f7959     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L12
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            r9 = r0
            goto L44
        L12:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f7957     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L36
            java.lang.String r0 = "emojiCompat"
            ho r8 = new ho     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            r8.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.LinkedBlockingDeque r7 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> Lf
            r7.<init>()     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r3 = 1
            r4 = 15
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            r1.allowCoreThreadTimeOut(r0)     // Catch: java.lang.Throwable -> Lf
            r9.f7958 = r1     // Catch: java.lang.Throwable -> Lf
            r9.f7957 = r1     // Catch: java.lang.Throwable -> Lf
        L36:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f7957     // Catch: java.lang.Throwable -> Lf
            ν r1 = new ν     // Catch: java.lang.Throwable -> Lf
            r2 = 15
            r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> Lf
            r0.execute(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        L44:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            throw r9
        L46:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            throw r9
    }

    /* JADX INFO: renamed from: β */
    public final void m4210() {
            r4 = this;
            java.lang.Object r0 = r4.f7955
            monitor-enter(r0)
            r1 = 0
            r4.f7959 = r1     // Catch: java.lang.Throwable -> Lf
            android.os.Handler r2 = r4.f7956     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r3 = 0
            r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r4 = move-exception
            goto L20
        L11:
            r4.f7956 = r1     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.ThreadPoolExecutor r2 = r4.f7958     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L1a
            r2.shutdown()     // Catch: java.lang.Throwable -> Lf
        L1a:
            r4.f7957 = r1     // Catch: java.lang.Throwable -> Lf
            r4.f7958 = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    /* JADX INFO: renamed from: γ */
    public final p000.f60 m4211() {
            r3 = this;
            i2 r0 = r3.f7954     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            android.content.Context r1 = r3.f7952     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            n50 r3 = r3.f7953     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            r0.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            java.util.List r3 = java.util.List.of(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            v r3 = p000.m50.m3728(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            int r0 = r3.f11044
            if (r0 != 0) goto L30
            java.lang.Object r3 = r3.f11045
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            f60[] r3 = (p000.f60[]) r3
            if (r3 == 0) goto L28
            int r1 = r3.length
            if (r1 == 0) goto L28
            r3 = r3[r0]
            return r3
        L28:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "fetchFonts failed (empty result)"
            r3.<init>(r0)
            throw r3
        L30:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r1 = "fetchFonts failed ("
            java.lang.String r2 = ")"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r2)
            r3.<init>(r0)
            throw r3
        L3e:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "provider not found"
            r0.<init>(r1, r3)
            throw r0
    }
}
