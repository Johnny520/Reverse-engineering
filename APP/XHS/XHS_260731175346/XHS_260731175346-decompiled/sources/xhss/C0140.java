package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛳᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0140 implements xhss.InterfaceC0285 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.content.Context f605;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0622 f606;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public android.os.Handler f607;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public xhss.AbstractC0007 f608;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public java.util.concurrent.ThreadPoolExecutor f609;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object f610;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public java.util.concurrent.ThreadPoolExecutor f611;

    public C0140(android.content.Context r2, xhss.C0622 r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f610 = r0
            java.lang.String r0 = "Context cannot be null"
            xhss.AbstractC0060.m191(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            r1.f605 = r2
            r1.f606 = r3
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0486 m370() {
            r3 = this;
            android.content.Context r0 = r3.f605     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            xhss.ᛷᛱᛲᲇ r3 = r3.f606     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            java.util.List r3 = java.util.List.of(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            xhss.ᛱᲇᛴᲇ r3 = xhss.AbstractC0791.m1359(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            int r0 = r3.f485
            if (r0 != 0) goto L2b
            java.lang.Object r3 = r3.f486
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            xhss.ᛵᛶᲈᛳ[] r3 = (xhss.C0486[]) r3
            if (r3 == 0) goto L23
            int r1 = r3.length
            if (r1 == 0) goto L23
            r3 = r3[r0]
            return r3
        L23:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "fetchFonts failed (empty result)"
            r3.<init>(r0)
            throw r3
        L2b:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fetchFonts failed ("
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
        L44:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "provider not found"
            r0.<init>(r1, r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m371() {
            r3 = this;
            java.lang.Object r0 = r3.f610
            monitor-enter(r0)
            r1 = 0
            r3.f608 = r1     // Catch: java.lang.Throwable -> Le
            android.os.Handler r2 = r3.f607     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L10
            r2.removeCallbacks(r1)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L1f
        L10:
            r3.f607 = r1     // Catch: java.lang.Throwable -> Le
            java.util.concurrent.ThreadPoolExecutor r2 = r3.f609     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L19
            r2.shutdown()     // Catch: java.lang.Throwable -> Le
        L19:
            r3.f611 = r1     // Catch: java.lang.Throwable -> Le
            r3.f609 = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    @Override // xhss.InterfaceC0285
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final void mo372(xhss.AbstractC0007 r10) {
            r9 = this;
            java.lang.Object r1 = r9.f610
            monitor-enter(r1)
            r9.f608 = r10     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r10 = r9.f610
            monitor-enter(r10)
            xhss.ᛱᛱᛷᛸ r0 = r9.f608     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L12
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            r9 = r0
            goto L41
        L12:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f611     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L36
            java.lang.String r0 = "emojiCompat"
            xhss.ᛱᛴᲁᲇ r8 = new xhss.ᛱᛴᲁᲇ     // Catch: java.lang.Throwable -> Lf
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lf
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
            r9.f609 = r1     // Catch: java.lang.Throwable -> Lf
            r9.f611 = r1     // Catch: java.lang.Throwable -> Lf
            r0 = r1
        L36:
            xhss.ᛳᛶᲈᛲ r1 = new xhss.ᛳᛶᲈᛲ     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> Lf
            r0.execute(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        L41:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            throw r9
        L43:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            throw r9
    }
}
