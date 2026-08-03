package s0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.StackTraceElement[] f12196a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0.j f12197b = null;

    static {
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            s0.i.f12196a = r0
            s0.j r0 = new s0.j
            r1 = 0
            long[] r2 = new long[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3)
            s0.i.f12197b = r0
            return
    }

    public static final int a(int r0, int r1) {
            int r1 = r1 % 10
            int r1 = r1 * 3
            int r1 = r1 + 1
            int r0 = r0 << r1
            return r0
    }

    public static final s0.d b(int r2, sf.b r3) {
            s0.d r0 = new s0.d
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static final long c() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            return r0
    }

    public static final void d(i0.h0 r1, fg.p r2) {
            r2.getClass()
            r0 = 2
            gg.x.c(r0, r2)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r0)
            return
    }

    public static final s0.d e(int r4, sf.b r5, i0.h0 r6) {
            java.lang.Object r0 = r6.P()
            i0.e r1 = i0.l.f5952a
            if (r0 != r1) goto L11
            s0.d r0 = new s0.d
            r1 = 1
            r0.<init>(r4, r5, r1)
            r6.k0(r0)
        L11:
            s0.d r0 = (s0.d) r0
            sf.b r4 = r0.f12183i
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L4d
            r0.f12183i = r5
            boolean r4 = r0.f12182h
            if (r4 == 0) goto L4d
            i0.r1 r4 = r0.f12184j
            r5 = 0
            if (r4 == 0) goto L2f
            i0.q r6 = r4.f6032a
            if (r6 == 0) goto L2d
            r6.s(r4, r5)
        L2d:
            r0.f12184j = r5
        L2f:
            java.util.ArrayList r4 = r0.f12185k
            if (r4 == 0) goto L4d
            int r6 = r4.size()
            r1 = 0
        L38:
            if (r1 >= r6) goto L4a
            java.lang.Object r2 = r4.get(r1)
            i0.r1 r2 = (i0.r1) r2
            i0.q r3 = r2.f6032a
            if (r3 == 0) goto L47
            r3.s(r2, r5)
        L47:
            int r1 = r1 + 1
            goto L38
        L4a:
            r4.clear()
        L4d:
            return r0
    }

    public static final boolean f(i0.r1 r1, i0.r1 r2) {
            if (r1 == 0) goto L1b
            boolean r0 = r1.a()
            if (r0 == 0) goto L1b
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L1b
            l0.b r1 = r1.f6034c
            l0.b r2 = r2.f6034c
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            return r1
        L1b:
            r1 = 1
            return r1
    }
}
