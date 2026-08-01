package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vk implements defpackage.di {
    public final android.content.Context a;
    public final defpackage.y1 b;
    public final defpackage.vh c;
    public final java.lang.Object d;
    public android.os.Handler e;
    public java.util.concurrent.ThreadPoolExecutor f;
    public java.util.concurrent.ThreadPoolExecutor g;
    public defpackage.ip h;

    public vk(android.content.Context r2, defpackage.y1 r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.d = r0
            java.lang.String r0 = "Context cannot be null"
            defpackage.zt.f(r0, r2)
            android.content.Context r2 = r2.getApplicationContext()
            r1.a = r2
            r1.b = r3
            vh r2 = defpackage.wk.d
            r1.c = r2
            return
    }

    public final void a() {
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            r1 = 0
            r4.h = r1     // Catch: java.lang.Throwable -> Lf
            android.os.Handler r2 = r4.e     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r3 = 0
            r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L20
        L11:
            r4.e = r1     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.ThreadPoolExecutor r2 = r4.g     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L1a
            r2.shutdown()     // Catch: java.lang.Throwable -> Lf
        L1a:
            r4.f = r1     // Catch: java.lang.Throwable -> Lf
            r4.g = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public final defpackage.gl b() {
            r4 = this;
            vh r0 = r4.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            android.content.Context r1 = r4.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            y1 r2 = r4.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            r0.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            f2 r0 = defpackage.a80.m(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            int r1 = r0.a
            if (r1 != 0) goto L26
            java.lang.Object r0 = r0.b
            gl[] r0 = (defpackage.gl[]) r0
            if (r0 == 0) goto L1e
            int r1 = r0.length
            if (r1 == 0) goto L1e
            r1 = 0
            r0 = r0[r1]
            return r0
        L1e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "fetchFonts failed (empty result)"
            r0.<init>(r1)
            throw r0
        L26:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "fetchFonts failed ("
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L3f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "provider not found"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // defpackage.di
    public final void e(defpackage.ip r10) {
            r9 = this;
            java.lang.Object r1 = r9.d
            monitor-enter(r1)
            r9.h = r10     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r10 = r9.d
            monitor-enter(r10)
            ip r0 = r9.h     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            goto L41
        L11:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L34
            java.lang.String r0 = "emojiCompat"
            yb r8 = new yb     // Catch: java.lang.Throwable -> Lf
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
            r9.g = r1     // Catch: java.lang.Throwable -> Lf
            r9.f = r1     // Catch: java.lang.Throwable -> Lf
        L34:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f     // Catch: java.lang.Throwable -> Lf
            p1 r1 = new p1     // Catch: java.lang.Throwable -> Lf
            r2 = 7
            r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> Lf
            r0.execute(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        L41:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            throw r0
        L43:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            throw r10
    }
}
