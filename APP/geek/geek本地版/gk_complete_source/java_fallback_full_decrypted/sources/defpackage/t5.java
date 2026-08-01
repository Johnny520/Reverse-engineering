package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t5 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ t5(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.a
            java.lang.Object r1 = r5.c
            java.lang.Object r2 = r5.b
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L87;
                case 2: goto L7b;
                case 3: goto L73;
                case 4: goto L6b;
                case 5: goto L5f;
                case 6: goto L4d;
                case 7: goto L42;
                case 8: goto L3a;
                case 9: goto L32;
                default: goto L9;
            }
        L9:
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L31
            boolean r0 = r2.isDestroyed()
            if (r0 == 0) goto L1a
            goto L31
        L1a:
            defpackage.vh.d(r2, r1)     // Catch: java.lang.Throwable -> L1e
            goto L31
        L1e:
            java.lang.String r0 = "+VffZ09eERHCWM55\n"
            java.lang.String r1 = "rT6rCyoNYX4=\n"
            java.lang.String r0 = "TitleSpoofer"
            java.lang.String r1 = "Fg==\n"
            java.lang.String r2 = "c8HJlSTQVfc=\n"
            java.lang.String r3 = "Nwje\n"
            java.lang.String r4 = "Q2m5jaPP2Zc=\n"
            defpackage.z30.o(r3, r4, r0, r1, r2)
        L31:
            return
        L32:
            zt r2 = (defpackage.zt) r2
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r2.J(r1)
            return
        L3a:
            sm r2 = (defpackage.sm) r2
            java.lang.String r1 = (java.lang.String) r1
            r2.f(r1)
            return
        L42:
            hv r2 = (defpackage.hv) r2
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1
            r2.a()
            r1.countDown()
            return
        L4d:
            java.lang.String r2 = (java.lang.String) r2
            i00 r1 = (defpackage.i00) r1
            java.lang.ClassLoader r0 = defpackage.d9.a
            if (r0 == 0) goto L5e
            android.os.Handler r3 = defpackage.uv.a
            java.lang.Object r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            defpackage.uv.f(r0, r2, r1)
        L5e:
            return
        L5f:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.ClassLoader r0 = defpackage.d9.a
            if (r0 == 0) goto L6a
            defpackage.uv.c(r0, r2, r1)
        L6a:
            return
        L6b:
            io.fastkv.MPFastKV r2 = (io.fastkv.MPFastKV) r2
            java.lang.String r1 = (java.lang.String) r1
            io.fastkv.MPFastKV.c(r2, r1)
            return
        L73:
            io.fastkv.LimitExecutor r2 = (io.fastkv.LimitExecutor) r2
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            io.fastkv.LimitExecutor.a(r2, r1)
            return
        L7b:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            i00 r1 = (defpackage.i00) r1
            java.lang.Object r0 = r1.b
            android.view.View r0 = (android.view.View) r0
            r2.removeView(r0)
            return
        L87:
            o9 r2 = (defpackage.o9) r2
            java.lang.String r1 = (java.lang.String) r1
            r2.f(r1)
            return
        L8f:
            u5 r2 = (defpackage.u5) r2
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.getClass()
            r1.run()     // Catch: java.lang.Throwable -> L9d
            r2.a()
            return
        L9d:
            r0 = move-exception
            r2.a()
            throw r0
    }
}
