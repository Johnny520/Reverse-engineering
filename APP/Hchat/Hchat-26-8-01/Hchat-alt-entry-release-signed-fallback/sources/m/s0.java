package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m.r0 f8356a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m.r0 f8357b = null;

    static {
            m.r0 r0 = new m.r0
            r1 = 0
            r2 = 3
            r3 = 0
            r0.<init>(r2, r3, r1)
            m.s0.f8356a = r0
            m.r0 r0 = new m.r0
            r1 = 1
            r0.<init>(r2, r3, r1)
            m.s0.f8357b = r0
            return
    }

    public static y0.o a(y0.o r1, m.n r2, fg.q r3, fg.q r4) {
            m.q0 r0 = new m.q0
            r0.<init>(r2, r3, r4)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final m.n b(fg.l r2, i0.h0 r3) {
            i0.a1 r2 = i0.r.y(r2, r3)
            java.lang.Object r0 = r3.P()
            i0.e r1 = i0.l.f5952a
            if (r0 != r1) goto L1c
            b0.l r0 = new b0.l
            r1 = 8
            r0.<init>(r2, r1)
            m.n r2 = new m.n
            r2.<init>(r0)
            r3.k0(r2)
            r0 = r2
        L1c:
            m.n r0 = (m.n) r0
            return r0
    }

    public static final long c(long r3) {
            float r0 = u2.q.b(r3)
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            r0 = r1
            goto L11
        Ld:
            float r0 = u2.q.b(r3)
        L11:
            float r2 = u2.q.c(r3)
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L1c
            goto L20
        L1c:
            float r1 = u2.q.c(r3)
        L20:
            long r3 = a.a.d(r0, r1)
            return r3
    }
}
