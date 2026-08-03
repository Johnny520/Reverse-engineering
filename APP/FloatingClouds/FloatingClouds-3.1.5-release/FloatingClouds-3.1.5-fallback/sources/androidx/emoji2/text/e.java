package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.emoji2.text.c.AbstractC0014c {
    public static final androidx.emoji2.text.e.a d = null;

    public static class a {
    }

    public static class b implements androidx.emoji2.text.c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.content.Context f897a;
        public final a.M6 b;
        public final androidx.emoji2.text.e.a c;
        public final java.lang.Object d;
        public android.os.Handler e;
        public java.util.concurrent.ThreadPoolExecutor f;
        public java.util.concurrent.ThreadPoolExecutor g;
        public androidx.emoji2.text.c.h h;

        public b(android.content.Context r3, a.M6 r4) {
                r2 = this;
                androidx.emoji2.text.e$a r0 = androidx.emoji2.text.e.d
                r2.<init>()
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r2.d = r1
                java.lang.String r1 = "Context cannot be null"
                a.C0282n9.h(r3, r1)
                android.content.Context r3 = r3.getApplicationContext()
                r2.f897a = r3
                r2.b = r4
                r2.c = r0
                return
        }

        @Override // androidx.emoji2.text.c.g
        public final void a(androidx.emoji2.text.c.h r10) {
                r9 = this;
                java.lang.Object r1 = r9.d
                monitor-enter(r1)
                r9.h = r10     // Catch: java.lang.Throwable -> L44
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
                java.lang.Object r10 = r9.d
                monitor-enter(r10)
                androidx.emoji2.text.c$h r0 = r9.h     // Catch: java.lang.Throwable -> Lf
                if (r0 != 0) goto L11
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r0 = move-exception
                goto L42
            L11:
                java.util.concurrent.ThreadPoolExecutor r0 = r9.f     // Catch: java.lang.Throwable -> Lf
                if (r0 != 0) goto L34
                java.lang.String r0 = "emojiCompat"
                a.H3 r8 = new a.H3     // Catch: java.lang.Throwable -> Lf
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
                a.M2 r1 = new a.M2     // Catch: java.lang.Throwable -> Lf
                r2 = 8
                r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> Lf
                r0.execute(r1)     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
                return
            L42:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
                throw r0
            L44:
                r0 = move-exception
                r10 = r0
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
                throw r10
        }

        public final void b() {
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

        public final a.T6 c() {
                r4 = this;
                androidx.emoji2.text.e$a r0 = r4.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
                android.content.Context r1 = r4.f897a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
                a.M6 r2 = r4.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
                r0.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
                a.Cc r0 = a.L6.a(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
                int r1 = r0.c
                if (r1 != 0) goto L26
                java.lang.Object[] r0 = r0.b
                a.T6[] r0 = (a.T6[]) r0
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
                java.lang.String r2 = "fetchFonts failed ("
                java.lang.String r3 = ")"
                java.lang.String r1 = a.C0487z.c(r1, r2, r3)
                r0.<init>(r1)
                throw r0
            L34:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "provider not found"
                r1.<init>(r2, r0)
                throw r1
        }
    }

    static {
            androidx.emoji2.text.e$a r0 = new androidx.emoji2.text.e$a
            r0.<init>()
            androidx.emoji2.text.e.d = r0
            return
    }
}
