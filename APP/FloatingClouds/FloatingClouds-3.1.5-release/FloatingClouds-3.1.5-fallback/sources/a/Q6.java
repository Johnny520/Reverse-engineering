package a;

/* JADX INFO: loaded from: classes.dex */
public final class Q6 implements a.Q3<a.R6.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227a;

    public Q6(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f227a = r1
            return
    }

    @Override // a.Q3
    public final void a(a.R6.a r5) {
            r4 = this;
            a.R6$a r5 = (a.R6.a) r5
            java.lang.Object r0 = a.R6.c
            monitor-enter(r0)
            a.ge<java.lang.String, java.util.ArrayList<a.Q3<a.R6$a>>> r1 = a.R6.d     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r4.f227a     // Catch: java.lang.Throwable -> L14
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch: java.lang.Throwable -> L14
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r5 = move-exception
            goto L30
        L16:
            java.lang.String r3 = r4.f227a     // Catch: java.lang.Throwable -> L14
            r1.remove(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            r0 = 0
        L1d:
            int r1 = r2.size()
            if (r0 >= r1) goto L2f
            java.lang.Object r1 = r2.get(r0)
            a.Q3 r1 = (a.Q3) r1
            r1.a(r5)
            int r0 = r0 + 1
            goto L1d
        L2f:
            return
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r5
    }
}
