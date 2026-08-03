package a;

/* JADX INFO: renamed from: a.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0332q5 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f651a;
    public final /* synthetic */ a.C0421v5 b;

    public /* synthetic */ C0332q5(a.C0421v5 r1, int r2) {
            r0 = this;
            r0.f651a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f651a
            switch(r0) {
                case 0: goto L87;
                case 1: goto L52;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            a.v5 r0 = r5.b
            io.github.libxposed.api.XposedInterface$Chain r6 = (io.github.libxposed.api.XposedInterface.Chain) r6
            java.lang.String r1 = "chain"
            a.C0193i9.e(r6, r1)
            java.lang.Object r6 = r6.proceed()
            boolean r1 = a.C0421v5.f()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L23
            android.os.Handler r1 = r0.d     // Catch: java.lang.Throwable -> L23
            a.r5 r2 = new a.r5     // Catch: java.lang.Throwable -> L23
            r3 = 1
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L23
            r1.post(r2)     // Catch: java.lang.Throwable -> L23
        L23:
            return r6
        L24:
            a.v5 r0 = r5.b
            io.github.libxposed.api.XposedInterface$Chain r6 = (io.github.libxposed.api.XposedInterface.Chain) r6
            java.lang.String r1 = "chain"
            a.C0193i9.e(r6, r1)
            java.lang.Object r1 = r6.proceed()
            java.lang.Object r6 = r6.getThisObject()     // Catch: java.lang.Throwable -> L51
            boolean r2 = r6 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L3c
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Throwable -> L51
            goto L3d
        L3c:
            r6 = 0
        L3d:
            if (r6 != 0) goto L40
            goto L51
        L40:
            android.view.Window r2 = r6.getWindow()     // Catch: java.lang.Throwable -> L51
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L51
            a.s5 r3 = new a.s5     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r3.<init>(r0, r6, r4)     // Catch: java.lang.Throwable -> L51
            r2.post(r3)     // Catch: java.lang.Throwable -> L51
        L51:
            return r1
        L52:
            a.v5 r0 = r5.b
            io.github.libxposed.api.XposedInterface$Chain r6 = (io.github.libxposed.api.XposedInterface.Chain) r6
            java.lang.String r1 = "chain"
            a.C0193i9.e(r6, r1)
            java.lang.Object r1 = r6.proceed()
            boolean r2 = a.C0421v5.f()     // Catch: java.lang.Throwable -> L86
            if (r2 != 0) goto L66
            goto L86
        L66:
            java.lang.Object r6 = r6.getThisObject()     // Catch: java.lang.Throwable -> L86
            boolean r2 = r6 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L71
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Throwable -> L86
            goto L72
        L71:
            r6 = 0
        L72:
            if (r6 != 0) goto L75
            goto L86
        L75:
            android.view.Window r2 = r6.getWindow()     // Catch: java.lang.Throwable -> L86
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L86
            a.s5 r3 = new a.s5     // Catch: java.lang.Throwable -> L86
            r4 = 1
            r3.<init>(r0, r6, r4)     // Catch: java.lang.Throwable -> L86
            r2.post(r3)     // Catch: java.lang.Throwable -> L86
        L86:
            return r1
        L87:
            a.v5 r0 = r5.b
            io.github.libxposed.api.XposedInterface$Chain r6 = (io.github.libxposed.api.XposedInterface.Chain) r6
            java.lang.String r1 = "chain"
            a.C0193i9.e(r6, r1)
            java.lang.Object r6 = r6.proceed()
            boolean r1 = a.C0421v5.f()     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto La5
            android.os.Handler r1 = r0.d     // Catch: java.lang.Throwable -> La5
            a.r5 r2 = new a.r5     // Catch: java.lang.Throwable -> La5
            r3 = 0
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> La5
            r1.post(r2)     // Catch: java.lang.Throwable -> La5
        La5:
            return r6
    }
}
