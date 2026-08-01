package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ fi(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.a = r4
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 0: goto L98;
                case 1: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.b
            io.fastkv.TagExecutor r0 = (io.fastkv.TagExecutor) r0
            java.lang.Object r1 = r10.c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r2 = r10.d
            java.lang.String r2 = (java.lang.String) r2
            io.fastkv.TagExecutor.a(r0, r1, r2)
            return
        L15:
            java.lang.Object r0 = r10.b
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.Object r1 = r10.c
            java.lang.Object r2 = r10.d
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            hs r2 = defpackage.hs.a
            defpackage.ip.l(r1)
            java.lang.String r2 = ""
            java.lang.String r3 = defpackage.pb0.z     // Catch: java.lang.Throwable -> L97
            java.lang.Object r3 = de.robv.android.xposed.XposedHelpers.getObjectField(r1, r3)     // Catch: java.lang.Throwable -> L97
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L97
            r5 = 0
            if (r4 == 0) goto L36
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L97
            r4 = r3
            goto L37
        L36:
            r4 = r5
        L37:
            if (r4 != 0) goto L3a
            goto L97
        L3a:
            java.lang.String r3 = defpackage.pb0.B     // Catch: java.lang.Throwable -> L97
            java.lang.Object r3 = de.robv.android.xposed.XposedHelpers.getObjectField(r1, r3)     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L97
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L97
            if (r6 != 0) goto L49
            goto L97
        L49:
            java.lang.String r3 = defpackage.pb0.C     // Catch: java.lang.Throwable -> L97
            int r3 = de.robv.android.xposed.XposedHelpers.getIntField(r1, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = defpackage.pb0.A     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.getObjectField(r1, r7)     // Catch: java.lang.Throwable -> L97
            boolean r7 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L5c
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L97
        L5c:
            if (r5 != 0) goto L60
            r7 = r2
            goto L61
        L60:
            r7 = r5
        L61:
            java.util.concurrent.ConcurrentHashMap r1 = defpackage.hs.c     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L6d
            r8 = r2
            goto L6e
        L6d:
            r8 = r1
        L6e:
            java.lang.String r1 = defpackage.pb0.n     // Catch: java.lang.Throwable -> L97
            java.lang.Class r1 = de.robv.android.xposed.XposedHelpers.findClassIfExists(r1, r0)     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L77
            goto L97
        L77:
            r2 = r3
            jb r3 = defpackage.pb0.X0     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r3.c(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L97
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch: java.lang.Throwable -> L97
            int r3 = r2.length     // Catch: java.lang.Throwable -> L97
            if (r3 != 0) goto L88
            goto L97
        L88:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L97
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L97
            defpackage.ip.l(r1)     // Catch: java.lang.Throwable -> L97
            defpackage.hs.e(r0, r1)     // Catch: java.lang.Throwable -> L97
        L97:
            return
        L98:
            java.lang.Object r0 = r10.b
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r1 = r10.c
            ip r1 = (defpackage.ip) r1
            java.lang.Object r2 = r10.d
            java.util.concurrent.ThreadPoolExecutor r2 = (java.util.concurrent.ThreadPoolExecutor) r2
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> Lc7
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> Lc7
            wk r0 = defpackage.a80.g(r0)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Lcc
            java.lang.Object r3 = r0.b     // Catch: java.lang.Throwable -> Lc7
            di r3 = (defpackage.di) r3     // Catch: java.lang.Throwable -> Lc7
            vk r3 = (defpackage.vk) r3     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r4 = r3.d     // Catch: java.lang.Throwable -> Lc7
            monitor-enter(r4)     // Catch: java.lang.Throwable -> Lc7
            r3.f = r2     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> Lc7
            di r0 = (defpackage.di) r0     // Catch: java.lang.Throwable -> Lc7
            gi r3 = new gi     // Catch: java.lang.Throwable -> Lc7
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lc7
            r0.e(r3)     // Catch: java.lang.Throwable -> Lc7
            goto Lda
        Lc7:
            r0 = move-exception
            goto Ld4
        Lc9:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc7
        Lcc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r3 = "EmojiCompat font provider not available on this device."
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lc7
            throw r0     // Catch: java.lang.Throwable -> Lc7
        Ld4:
            r1.F(r0)
            r2.shutdown()
        Lda:
            return
    }
}
