package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f14796a = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            w0.q.f14796a = r0
            return
    }

    public static final void a(int r3, int r4) {
            if (r3 < 0) goto L5
            if (r3 >= r4) goto L5
            return
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "index ("
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ") is out of bound of [0, "
            r1.append(r3)
            r1.append(r4)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final boolean b(w0.t r2, int r3, o0.c r4, boolean r5) {
            java.lang.Object r0 = w0.q.f14796a
            monitor-enter(r0)
            int r1 = r2.f14821d     // Catch: java.lang.Throwable -> L12
            if (r1 != r3) goto L18
            r2.f14820c = r4     // Catch: java.lang.Throwable -> L12
            r3 = 1
            if (r5 == 0) goto L14
            int r4 = r2.f14822e     // Catch: java.lang.Throwable -> L12
            int r4 = r4 + r3
            r2.f14822e = r4     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L1b
        L14:
            int r1 = r1 + r3
            r2.f14821d = r1     // Catch: java.lang.Throwable -> L12
            goto L19
        L18:
            r3 = 0
        L19:
            monitor-exit(r0)
            return r3
        L1b:
            monitor-exit(r0)
            throw r2
    }

    public static final int c(long r5, long[] r7) {
            int r0 = r7.length
            int r0 = r0 + (-1)
            r1 = 0
        L4:
            if (r1 > r0) goto L19
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            r3 = r7[r2]
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L13
            int r1 = r2 + 1
            goto L4
        L13:
            if (r3 >= 0) goto L18
            int r0 = r2 + (-1)
            goto L4
        L18:
            return r2
        L19:
            int r1 = r1 + 1
            int r5 = -r1
            return r5
    }

    public static w0.f e() {
            b5.c r0 = w0.m.f14785b
            java.lang.Object r0 = r0.o()
            w0.f r0 = (w0.f) r0
            return r0
    }

    public static final w0.t f(w0.p r1) {
            w0.t r0 = r1.f14795g
            r0.getClass()
            w0.w r1 = w0.m.t(r0, r1)
            w0.t r1 = (w0.t) r1
            return r1
    }

    public static final int g(w0.p r0) {
            w0.t r0 = r0.f14795g
            r0.getClass()
            w0.w r0 = w0.m.h(r0)
            w0.t r0 = (w0.t) r0
            int r0 = r0.f14822e
            return r0
    }

    public static w0.f h(w0.f r6) {
            boolean r0 = r6 instanceof w0.y
            r1 = 0
            if (r0 == 0) goto L15
            r0 = r6
            w0.y r0 = (w0.y) r0
            long r2 = r0.f14835t
            long r4 = s0.i.c()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L15
            r0.f14833r = r1
            return r6
        L15:
            boolean r0 = r6 instanceof w0.z
            if (r0 == 0) goto L29
            r0 = r6
            w0.z r0 = (w0.z) r0
            long r2 = r0.f14840i
            long r4 = s0.i.c()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L29
            r0.f14839h = r1
            return r6
        L29:
            r0 = 0
            w0.f r6 = w0.m.g(r6, r1, r0)
            r6.j()
            return r6
    }

    public static final boolean i(w0.p r7, fg.l r8) {
        L0:
            java.lang.Object r0 = w0.q.f14796a
            monitor-enter(r0)
            w0.t r1 = r7.f14795g     // Catch: java.lang.Throwable -> L50
            r1.getClass()     // Catch: java.lang.Throwable -> L50
            w0.w r1 = w0.m.h(r1)     // Catch: java.lang.Throwable -> L50
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L50
            int r2 = r1.f14821d     // Catch: java.lang.Throwable -> L50
            o0.c r1 = r1.f14820c     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            r1.getClass()
            o0.f r0 = r1.e()
            java.lang.Object r3 = r8.invoke(r0)
            o0.c r0 = r0.d()
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L49
            w0.t r1 = r7.f14795g
            r1.getClass()
            java.lang.Object r4 = w0.m.f14786c
            monitor-enter(r4)
            w0.f r5 = w0.m.j()     // Catch: java.lang.Throwable -> L46
            w0.w r1 = w0.m.w(r1, r7, r5)     // Catch: java.lang.Throwable -> L46
            w0.t r1 = (w0.t) r1     // Catch: java.lang.Throwable -> L46
            r6 = 1
            boolean r0 = b(r1, r2, r0, r6)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r4)
            w0.m.n(r5, r7)
            if (r0 == 0) goto L0
            goto L49
        L46:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L49:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r7 = r3.booleanValue()
            return r7
        L50:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    public static java.lang.Object j(ca.k r6, fg.a r7) {
            b5.c r0 = w0.m.f14785b
            java.lang.Object r0 = r0.o()
            w0.f r0 = (w0.f) r0
            boolean r1 = r0 instanceof w0.y
            if (r1 == 0) goto L3b
            r1 = r0
            w0.y r1 = (w0.y) r1
            long r2 = r1.f14835t
            long r4 = s0.i.c()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L3b
            fg.l r2 = r1.f14833r
            fg.l r3 = r1.f14834s
            r4 = r0
            w0.y r4 = (w0.y) r4     // Catch: java.lang.Throwable -> L34
            r5 = 1
            fg.l r6 = w0.m.k(r6, r2, r5)     // Catch: java.lang.Throwable -> L34
            r4.f14833r = r6     // Catch: java.lang.Throwable -> L34
            w0.y r0 = (w0.y) r0     // Catch: java.lang.Throwable -> L34
            r0.f14834s = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r6 = r7.invoke()     // Catch: java.lang.Throwable -> L34
            r1.f14833r = r2
            r1.f14834s = r3
            return r6
        L34:
            r0 = move-exception
            r6 = r0
            r1.f14833r = r2
            r1.f14834s = r3
            throw r6
        L3b:
            if (r0 == 0) goto L41
            boolean r1 = r0 instanceof w0.b
            if (r1 == 0) goto L43
        L41:
            r1 = r0
            goto L48
        L43:
            w0.f r6 = r0.u(r6)
            goto L5a
        L48:
            w0.y r0 = new w0.y
            boolean r2 = r1 instanceof w0.b
            if (r2 == 0) goto L51
            w0.b r1 = (w0.b) r1
            goto L52
        L51:
            r1 = 0
        L52:
            r4 = 1
            r5 = 0
            r3 = 0
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6 = r0
        L5a:
            w0.f r1 = r6.j()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r7.invoke()     // Catch: java.lang.Throwable -> L6c
            w0.f.q(r1)     // Catch: java.lang.Throwable -> L69
            r6.c()
            return r7
        L69:
            r0 = move-exception
            r7 = r0
            goto L72
        L6c:
            r0 = move-exception
            r7 = r0
            w0.f.q(r1)     // Catch: java.lang.Throwable -> L69
            throw r7     // Catch: java.lang.Throwable -> L69
        L72:
            r6.c()
            throw r7
    }

    public static void k(w0.f r0, w0.f r1, fg.l r2) {
            if (r0 != r1) goto L1a
            boolean r1 = r0 instanceof w0.y
            if (r1 == 0) goto Lb
            w0.y r0 = (w0.y) r0
            r0.f14833r = r2
            return
        Lb:
            boolean r1 = r0 instanceof w0.z
            if (r1 == 0) goto L14
            w0.z r0 = (w0.z) r0
            r0.f14839h = r2
            return
        L14:
            java.lang.String r1 = "Non-transparent snapshot was reused: "
            okio.a.p(r0, r1)
            return
        L1a:
            r1.getClass()
            w0.f.q(r0)
            r1.c()
            return
    }

    public static final void l() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract void d();
}
