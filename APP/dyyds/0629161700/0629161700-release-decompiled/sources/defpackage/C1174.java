package defpackage;

/* JADX INFO: renamed from: ᛶᲇᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1174 implements defpackage.InterfaceC1991 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.util.concurrent.ThreadPoolExecutor f5295;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.AbstractC1533 f5296;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f5297;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1982 f5298;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f5299;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.os.Handler f5300;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.util.concurrent.ThreadPoolExecutor f5301;

    public C1174(android.content.Context r2, defpackage.C1982 r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f5297 = r0
            java.lang.String r0 = "Context cannot be null"
            defpackage.C1825.m3220(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            r1.f5299 = r2
            r1.f5298 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0275 m2283() {
            r3 = this;
            android.content.Context r0 = r3.f5299     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            ᲇᛱᛸᛱ r3 = r3.f5298     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            java.util.List r3 = java.util.List.of(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            ᲇᛶᲀᛸ r3 = defpackage.AbstractC2323.m3796(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L44
            int r0 = r3.f8901
            if (r0 != 0) goto L2b
            java.lang.Object r3 = r3.f8900
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            ᛲᛳᲈᲁ[] r3 = (defpackage.C0275[]) r3
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
            java.lang.String r0 = "provider not found"
            defpackage.C0086.m548(r0, r3)
            r3 = 0
            return r3
    }

    @Override // defpackage.InterfaceC1991
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo2284(defpackage.AbstractC1533 r10) {
            r9 = this;
            java.lang.Object r1 = r9.f5297
            monitor-enter(r1)
            r9.f5296 = r10     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r10 = r9.f5297
            monitor-enter(r10)
            ᛸᛷᲀᲈ r0 = r9.f5296     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L12
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            r9 = r0
            goto L41
        L12:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f5301     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L36
            java.lang.String r0 = "emojiCompat"
            ᛵᲇᛲᛴ r8 = new ᛵᲇᛲᛴ     // Catch: java.lang.Throwable -> Lf
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
            r9.f5295 = r1     // Catch: java.lang.Throwable -> Lf
            r9.f5301 = r1     // Catch: java.lang.Throwable -> Lf
            r0 = r1
        L36:
            ᲁᲈᛳ r1 = new ᲁᲈᛳ     // Catch: java.lang.Throwable -> Lf
            r2 = 3
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

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m2285() {
            r3 = this;
            java.lang.Object r0 = r3.f5297
            monitor-enter(r0)
            r1 = 0
            r3.f5296 = r1     // Catch: java.lang.Throwable -> Le
            android.os.Handler r2 = r3.f5300     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L10
            r2.removeCallbacks(r1)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L1f
        L10:
            r3.f5300 = r1     // Catch: java.lang.Throwable -> Le
            java.util.concurrent.ThreadPoolExecutor r2 = r3.f5295     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L19
            r2.shutdown()     // Catch: java.lang.Throwable -> Le
        L19:
            r3.f5301 = r1     // Catch: java.lang.Throwable -> Le
            r3.f5295 = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
