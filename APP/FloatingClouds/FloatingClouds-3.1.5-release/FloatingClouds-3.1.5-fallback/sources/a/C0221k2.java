package a;

/* JADX INFO: renamed from: a.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0221k2 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f540a;
    public final /* synthetic */ a.C0293o2 b;

    public /* synthetic */ C0221k2(a.C0293o2 r1, int r2) {
            r0 = this;
            r0.f540a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f540a
            switch(r0) {
                case 0: goto L79;
                case 1: goto L44;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            a.o2 r0 = r4.b
            io.github.libxposed.api.XposedInterface$Chain r5 = (io.github.libxposed.api.XposedInterface.Chain) r5
            java.lang.String r1 = "chain"
            a.C0193i9.e(r5, r1)
            java.lang.Object r5 = r5.proceed()
            boolean r1 = a.C0293o2.e()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L23
            android.os.Handler r1 = r0.e     // Catch: java.lang.Throwable -> L23
            a.l2 r2 = new a.l2     // Catch: java.lang.Throwable -> L23
            r3 = 1
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L23
            r1.post(r2)     // Catch: java.lang.Throwable -> L23
        L23:
            return r5
        L24:
            a.o2 r0 = r4.b
            io.github.libxposed.api.XposedInterface$Chain r5 = (io.github.libxposed.api.XposedInterface.Chain) r5
            java.lang.String r1 = "chain"
            a.C0193i9.e(r5, r1)
            java.lang.Object r1 = r5.proceed()
            java.lang.Object r5 = r5.getThisObject()     // Catch: java.lang.Throwable -> L43
            boolean r2 = r5 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L3c
            android.app.Activity r5 = (android.app.Activity) r5     // Catch: java.lang.Throwable -> L43
            goto L3d
        L3c:
            r5 = 0
        L3d:
            if (r5 != 0) goto L40
            goto L43
        L40:
            r0.getClass()     // Catch: java.lang.Throwable -> L43
        L43:
            return r1
        L44:
            a.o2 r0 = r4.b
            io.github.libxposed.api.XposedInterface$Chain r5 = (io.github.libxposed.api.XposedInterface.Chain) r5
            java.lang.String r1 = "chain"
            a.C0193i9.e(r5, r1)
            java.lang.Object r1 = r5.proceed()
            boolean r2 = a.C0293o2.e()     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L58
            goto L78
        L58:
            java.lang.Object r5 = r5.getThisObject()     // Catch: java.lang.Throwable -> L78
            boolean r2 = r5 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L63
            android.app.Activity r5 = (android.app.Activity) r5     // Catch: java.lang.Throwable -> L78
            goto L64
        L63:
            r5 = 0
        L64:
            if (r5 != 0) goto L67
            goto L78
        L67:
            android.view.Window r5 = r5.getWindow()     // Catch: java.lang.Throwable -> L78
            android.view.View r5 = r5.getDecorView()     // Catch: java.lang.Throwable -> L78
            a.l2 r2 = new a.l2     // Catch: java.lang.Throwable -> L78
            r3 = 2
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L78
            r5.post(r2)     // Catch: java.lang.Throwable -> L78
        L78:
            return r1
        L79:
            a.o2 r0 = r4.b
            io.github.libxposed.api.XposedInterface$Chain r5 = (io.github.libxposed.api.XposedInterface.Chain) r5
            java.lang.String r1 = "chain"
            a.C0193i9.e(r5, r1)
            java.lang.Object r5 = r5.proceed()
            boolean r1 = a.C0293o2.e()     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L97
            android.os.Handler r1 = r0.e     // Catch: java.lang.Throwable -> L97
            a.l2 r2 = new a.l2     // Catch: java.lang.Throwable -> L97
            r3 = 0
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L97
            r1.post(r2)     // Catch: java.lang.Throwable -> L97
        L97:
            return r5
    }
}
