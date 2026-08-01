package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public h1(defpackage.cg r1, java.util.ArrayList r2, defpackage.g40 r3) {
            r0 = this;
            r1 = 5
            r0.a = r1
            r0.<init>()
            r0.b = r2
            r0.c = r3
            return
    }

    public h1(com.google.android.material.behavior.SwipeDismissBehavior r1, android.view.View r2, boolean r3) {
            r0 = this;
            r3 = 9
            r0.a = r3
            r0.<init>()
            r0.c = r1
            r0.b = r2
            return
    }

    public /* synthetic */ h1(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.a = r2
            r0.c = r1
            r0.b = r3
            r0.<init>()
            return
    }

    public /* synthetic */ h1(java.lang.Object r1, java.lang.Object r2, int r3, boolean r4) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.a
            r1 = 0
            java.lang.Object r2 = r5.c
            switch(r0) {
                case 0: goto Ldd;
                case 1: goto Ld6;
                case 2: goto Lcc;
                case 3: goto L85;
                case 4: goto L75;
                case 5: goto L5c;
                case 6: goto L52;
                case 7: goto L26;
                case 8: goto L1e;
                default: goto L8;
            }
        L8:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = (com.google.android.material.behavior.SwipeDismissBehavior) r2
            ma0 r0 = r2.a
            if (r0 == 0) goto L1d
            boolean r0 = r0.f()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r5.b
            android.view.View r0 = (android.view.View) r0
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.m(r0, r5)
        L1d:
            return
        L1e:
            java.lang.Object r0 = r5.b
            yk r0 = (defpackage.yk) r0
            r0.a(r2)
            return
        L26:
            r0 = r2
            rq r0 = (defpackage.rq) r0
            ke r3 = r0.c
        L2b:
            java.lang.Object r2 = r5.b     // Catch: java.lang.Throwable -> L33
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L33
            r2.run()     // Catch: java.lang.Throwable -> L33
            goto L39
        L33:
            r2 = move-exception
            wi r4 = defpackage.wi.a
            defpackage.ff.u(r4, r2)
        L39:
            java.lang.Runnable r2 = r0.f()
            if (r2 != 0) goto L40
            goto L51
        L40:
            r5.b = r2
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2b
            boolean r2 = r3.e()
            if (r2 == 0) goto L2b
            r3.d(r0, r5)
        L51:
            return
        L52:
            java.lang.Object r0 = r5.b
            i8 r0 = (defpackage.i8) r0
            jo r2 = (defpackage.jo) r2
            r0.s(r2)
            return
        L5c:
            java.lang.Object r0 = r5.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            g40 r2 = (defpackage.g40) r2
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L74
            r0.remove(r2)
            ml r0 = r2.c
            android.view.View r0 = r0.E
            int r1 = r2.a
            defpackage.z30.a(r0, r1)
        L74:
            return
        L75:
            java.lang.Object r0 = r5.b
            l0 r0 = (defpackage.l0) r0
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            java.lang.Object r0 = r0.b
            zt r0 = (defpackage.zt) r0
            if (r0 == 0) goto L84
            r0.J(r2)
        L84:
            return
        L85:
            java.lang.Object r0 = r5.b
            java.lang.reflect.Method r1 = defpackage.s1.d     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L99
            if (r1 == 0) goto L9b
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L99
            java.lang.String r4 = "AppCompat recreation"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L99
            r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L99
            goto Lcb
        L97:
            r0 = move-exception
            goto La7
        L99:
            r0 = move-exception
            goto Laf
        L9b:
            java.lang.reflect.Method r1 = defpackage.s1.e     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L99
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L99
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L99
            r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L99
            goto Lcb
        La7:
            java.lang.String r1 = "ActivityRecreator"
            java.lang.String r2 = "Exception while invoking performStopActivity"
            android.util.Log.e(r1, r2, r0)
            goto Lcb
        Laf:
            java.lang.Class r1 = r0.getClass()
            java.lang.Class<java.lang.RuntimeException> r2 = java.lang.RuntimeException.class
            if (r1 != r2) goto Lcb
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto Lcb
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "Unable to stop"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto Lca
            goto Lcb
        Lca:
            throw r0
        Lcb:
            return
        Lcc:
            java.lang.Object r0 = r5.b
            android.app.Application r0 = (android.app.Application) r0
            r1 r2 = (defpackage.r1) r2
            r0.unregisterActivityLifecycleCallbacks(r2)
            return
        Ld6:
            java.lang.Object r0 = r5.b
            r1 r0 = (defpackage.r1) r0
            r0.a = r2
            return
        Ldd:
            java.lang.Object r0 = r5.b
            f1 r0 = (defpackage.f1) r0
            j1 r2 = (defpackage.j1) r2
            ku r3 = r2.c
            if (r3 == 0) goto Lee
            iu r4 = r3.e
            if (r4 == 0) goto Lee
            r4.k(r3)
        Lee:
            fv r3 = r2.h
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L10b
            android.os.IBinder r3 = r3.getWindowToken()
            if (r3 == 0) goto L10b
            boolean r3 = r0.b()
            if (r3 == 0) goto L101
            goto L109
        L101:
            android.view.View r3 = r0.e
            if (r3 != 0) goto L106
            goto L10b
        L106:
            r0.d(r1, r1, r1, r1)
        L109:
            r2.s = r0
        L10b:
            r0 = 0
            r2.u = r0
            return
    }
}
