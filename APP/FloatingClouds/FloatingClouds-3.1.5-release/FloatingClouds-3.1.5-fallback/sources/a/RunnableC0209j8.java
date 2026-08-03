package a;

/* JADX INFO: renamed from: a.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0209j8 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f530a;
    public final /* synthetic */ a.C0263m8 b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.util.Set d;

    public /* synthetic */ RunnableC0209j8(a.C0263m8 r1, java.lang.Object r2, java.util.Set r3, int r4) {
            r0 = this;
            r0.f530a = r4
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            java.util.Set r0 = r8.d
            java.lang.Object r1 = r8.c
            a.m8 r2 = r8.b
            int r3 = r8.f530a
            switch(r3) {
                case 0: goto L49;
                default: goto Lb;
            }
        Lb:
            java.lang.String r3 = "d"
            r2.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = a.C0263m8.i(r1, r3)     // Catch: java.lang.Throwable -> L1e
            boolean r4 = a.Kf.b(r3)     // Catch: java.lang.Throwable -> L1e
            r5 = 0
            if (r4 == 0) goto L20
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r0 = move-exception
            goto L45
        L20:
            r3 = r5
        L21:
            if (r3 != 0) goto L24
            goto L42
        L24:
            int r4 = a.C0263m8.e(r3)     // Catch: java.lang.Throwable -> L1e
            r2.f(r3, r0)     // Catch: java.lang.Throwable -> L1e
            int r0 = a.C0263m8.e(r3)     // Catch: java.lang.Throwable -> L1e
            if (r4 == r0) goto L42
            if (r1 != 0) goto L34
            goto L42
        L34:
            java.lang.reflect.Method r0 = a.C0263m8.g(r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L3b
            goto L42
        L3b:
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L42
            r0.invoke(r1, r5)     // Catch: java.lang.Throwable -> L42
        L42:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1e
            goto L48
        L45:
            a.C0465xd.a(r0)
        L48:
            return
        L49:
            r2.getClass()     // Catch: java.lang.Throwable -> L70
            java.util.List r3 = a.C0263m8.h(r1)     // Catch: java.lang.Throwable -> L70
            if (r3 != 0) goto L53
            goto L82
        L53:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L70
            r4.<init>()     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L70
        L5c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L72
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L70
            boolean r7 = r2.v(r6, r0)     // Catch: java.lang.Throwable -> L70
            if (r7 != 0) goto L5c
            r4.add(r6)     // Catch: java.lang.Throwable -> L70
            goto L5c
        L70:
            r0 = move-exception
            goto L85
        L72:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L70
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L70
            if (r0 == r2) goto L82
            a.C0263m8.t(r1, r4)     // Catch: java.lang.Throwable -> L70
            a.C0263m8.p(r1)     // Catch: java.lang.Throwable -> L70
        L82:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L70
            goto L88
        L85:
            a.C0465xd.a(r0)
        L88:
            return
    }
}
