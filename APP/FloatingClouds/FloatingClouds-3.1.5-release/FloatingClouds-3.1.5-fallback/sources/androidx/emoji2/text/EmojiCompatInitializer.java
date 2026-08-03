package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements a.V8<java.lang.Boolean> {


    public static class a extends androidx.emoji2.text.c.AbstractC0014c {
    }

    public static class b implements androidx.emoji2.text.c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.content.Context f890a;

        public b(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.f890a = r1
                return
        }

        @Override // androidx.emoji2.text.c.g
        public final void a(androidx.emoji2.text.c.h r9) {
                r8 = this;
                a.H3 r7 = new a.H3
                java.lang.String r0 = "EmojiCompatInitializer"
                r7.<init>(r0)
                java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
                r6.<init>()
                r3 = 15
                r1 = 0
                r2 = 1
                r0.<init>(r1, r2, r3, r5, r6, r7)
                r1 = 1
                r0.allowCoreThreadTimeOut(r1)
                a.h0 r1 = new a.h0
                r2 = 2
                r1.<init>(r8, r9, r0, r2)
                r0.execute(r1)
                return
        }
    }

    public static class c implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
                int r1 = a.Af.f16a     // Catch: java.lang.Throwable -> L18
                android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L18
                androidx.emoji2.text.c r0 = androidx.emoji2.text.c.k     // Catch: java.lang.Throwable -> L18
                if (r0 == 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L1a
                androidx.emoji2.text.c r0 = androidx.emoji2.text.c.a()     // Catch: java.lang.Throwable -> L18
                r0.c()     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r0 = move-exception
                goto L1e
            L1a:
                android.os.Trace.endSection()
                return
            L1e:
                int r1 = a.Af.f16a
                android.os.Trace.endSection()
                throw r0
        }
    }

    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // a.V8
    public final java.util.List<java.lang.Class<? extends a.V8<?>>> a() {
            r1 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Override // a.V8
    public final java.lang.Boolean b(android.content.Context r4) {
            r3 = this;
            androidx.emoji2.text.EmojiCompatInitializer$a r0 = new androidx.emoji2.text.EmojiCompatInitializer$a
            androidx.emoji2.text.EmojiCompatInitializer$b r1 = new androidx.emoji2.text.EmojiCompatInitializer$b
            r1.<init>(r4)
            r0.<init>(r1)
            r1 = 1
            r0.b = r1
            androidx.emoji2.text.c r1 = androidx.emoji2.text.c.k
            if (r1 != 0) goto L26
            java.lang.Object r1 = androidx.emoji2.text.c.j
            monitor-enter(r1)
            androidx.emoji2.text.c r2 = androidx.emoji2.text.c.k     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            androidx.emoji2.text.c r2 = new androidx.emoji2.text.c     // Catch: java.lang.Throwable -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20
            androidx.emoji2.text.c.k = r2     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r4 = move-exception
            goto L24
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            goto L26
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r4
        L26:
            androidx.startup.a r4 = androidx.startup.a.c(r4)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            r4.getClass()
            java.lang.Object r1 = androidx.startup.a.e
            monitor-enter(r1)
            java.util.HashMap r2 = r4.f1020a     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L46
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L44
            r2.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r4.b(r0, r2)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r4 = move-exception
            goto L58
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            a.y9 r2 = (a.InterfaceC0479y9) r2
            androidx.lifecycle.e r4 = r2.getLifecycle()
            androidx.emoji2.text.EmojiCompatInitializer$1 r0 = new androidx.emoji2.text.EmojiCompatInitializer$1
            r0.<init>(r3, r4)
            r4.a(r0)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L58:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r4
    }
}
