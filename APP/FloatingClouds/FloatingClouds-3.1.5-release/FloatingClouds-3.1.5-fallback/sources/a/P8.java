package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P8 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208a;
    public final /* synthetic */ a.R8 b;
    public final /* synthetic */ java.lang.String c;

    public /* synthetic */ P8(a.R8 r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f208a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r10) {
            r9 = this;
            r0 = 0
            java.lang.String r1 = "chain"
            int r2 = r9.f208a
            switch(r2) {
                case 0: goto L54;
                case 1: goto L38;
                case 2: goto L28;
                case 3: goto L18;
                default: goto L8;
            }
        L8:
            io.github.libxposed.api.XposedInterface$Chain r10 = (io.github.libxposed.api.XposedInterface.Chain) r10
            a.C0193i9.e(r10, r1)
            java.lang.String r0 = "onNewIntent"
            a.R8 r1 = r9.b
            java.lang.String r2 = r9.c
            java.lang.Object r10 = r1.i(r10, r2, r0)
            return r10
        L18:
            io.github.libxposed.api.XposedInterface$Chain r10 = (io.github.libxposed.api.XposedInterface.Chain) r10
            a.C0193i9.e(r10, r1)
            java.lang.String r0 = "onResume"
            a.R8 r1 = r9.b
            java.lang.String r2 = r9.c
            java.lang.Object r10 = r1.i(r10, r2, r0)
            return r10
        L28:
            io.github.libxposed.api.XposedInterface$Chain r10 = (io.github.libxposed.api.XposedInterface.Chain) r10
            a.C0193i9.e(r10, r1)
            java.lang.String r0 = "onCreate"
            a.R8 r1 = r9.b
            java.lang.String r2 = r9.c
            java.lang.Object r10 = r1.i(r10, r2, r0)
            return r10
        L38:
            a.R8 r2 = r9.b
            java.lang.String r3 = r9.c
            io.github.libxposed.api.XposedInterface$Chain r10 = (io.github.libxposed.api.XposedInterface.Chain) r10
            a.C0193i9.e(r10, r1)
            r2.b = r0
            a.C0074bh.e()
            java.lang.String r0 = "VoIP service onDestroy "
            java.lang.String r0 = r0.concat(r3)
            a.R8.r(r0)
            java.lang.Object r10 = r10.proceed()
            return r10
        L54:
            a.R8 r2 = r9.b
            java.lang.String r3 = r9.c
            io.github.libxposed.api.XposedInterface$Chain r10 = (io.github.libxposed.api.XposedInterface.Chain) r10
            a.C0193i9.e(r10, r1)
            java.util.List r1 = r10.getArgs()
            java.lang.String r4 = "getArgs(...)"
            a.C0193i9.d(r1, r4)
            java.lang.Object r1 = a.C0383t3.o0(r1, r0)
            boolean r4 = r1 instanceof android.content.Intent
            r5 = 0
            if (r4 == 0) goto L72
            android.content.Intent r1 = (android.content.Intent) r1
            goto L73
        L72:
            r1 = r5
        L73:
            if (r1 == 0) goto L7c
            java.lang.String r4 = "Voip_User"
            java.lang.String r1 = r1.getStringExtra(r4)
            goto L7d
        L7c:
            r1 = r5
        L7d:
            boolean r4 = a.C0074bh.b()
            java.lang.String r6 = "VoIP service onStartCommand "
            java.lang.String r7 = " user="
            java.lang.String r8 = " active="
            java.lang.StringBuilder r6 = a.C0487z.i(r6, r3, r7, r1, r8)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            a.R8.r(r4)
            r2.b = r0
            if (r1 == 0) goto Lde
            java.util.concurrent.ExecutorService r0 = a.fh.G
            boolean r0 = a.fh.a.a(r1)
            if (r0 == 0) goto Lde
            r0 = 1
            r2.b = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "intercept user="
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r4 = " at "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " onStartCommand"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            a.R8.r(r2)
            a.C0074bh.g(r1)
            java.lang.Object r1 = r10.getThisObject()     // Catch: java.lang.Throwable -> Ld1
            boolean r2 = r1 instanceof android.app.Service     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto Ld3
            r5 = r1
            android.app.Service r5 = (android.app.Service) r5     // Catch: java.lang.Throwable -> Ld1
            goto Ld3
        Ld1:
            r0 = move-exception
            goto Ldb
        Ld3:
            if (r5 == 0) goto Lde
            r5.stopForeground(r0)     // Catch: java.lang.Throwable -> Ld1
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> Ld1
            goto Lde
        Ldb:
            a.C0465xd.a(r0)
        Lde:
            java.lang.Object r10 = r10.proceed()
            return r10
    }
}
