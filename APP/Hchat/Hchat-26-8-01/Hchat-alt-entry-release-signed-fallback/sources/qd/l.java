package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends md.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final mh.b f10901k = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qd.j f10902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ud.p f10903j;

    static {
            java.lang.Class<qd.l> r0 = qd.l.class
            mh.b r0 = mh.d.b(r0)
            qd.l.f10901k = r0
            return
    }

    public static qd.n S(long r4, qd.j r6) {
            qd.n r0 = new qd.n
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L2f
            boolean r2 = r6.w()
            if (r2 != 0) goto L2f
            qd.q r2 = qd.q.f10913p
            boolean r2 = r6.a(r2)
            if (r2 != 0) goto L2f
            qd.q r2 = qd.q.f10914q
            boolean r2 = r6.a(r2)
            if (r2 == 0) goto L1f
            goto L2f
        L1f:
            r2 = 1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L28
            qd.h r6 = qd.j.f10892z
            goto L2f
        L28:
            if (r1 >= 0) goto L2d
            qd.h r6 = qd.j.C
            goto L2f
        L2d:
            qd.h r6 = qd.j.B
        L2f:
            r0.<init>(r4, r6)
            return r0
    }

    public static qd.r T(int r1, qd.j r2, boolean r3) {
            qd.r r0 = new qd.r
            r0.<init>(r1, r2)
            if (r3 == 0) goto Lc
            md.a r1 = md.a.N
            r0.w(r1)
        Lc:
            return r0
    }

    public static qd.r U(gf.a r0, int r1, qd.j r2) {
            int[] r0 = r0.f4499i
            r0 = r0[r1]
            qd.r r1 = new qd.r
            r1.<init>(r0, r2)
            return r1
    }

    public static qd.r Y(gf.a r1, int r2, qd.j r3) {
            boolean r0 = r3.w()
            if (r0 == 0) goto L10
            int[] r1 = r1.f4499i
            r1 = r1[r2]
            r2 = 1
            qd.r r1 = T(r1, r3, r2)
            return r1
        L10:
            int[] r1 = r1.f4499i
            r1 = r1[r2]
            qd.r r2 = new qd.r
            r2.<init>(r1, r3)
            return r2
    }

    public static qd.m Z(ud.p r4) {
            qd.r r0 = r4.f13714l
            md.a r1 = md.a.S
            r4.w(r1)
            qd.m r1 = new qd.m
            r1.<init>(r4)
            pd.k r2 = r4.f13713k
            int r2 = r2.ordinal()
            if (r2 == 0) goto L3a
            r3 = 1
            if (r2 == r3) goto L30
            r3 = 2
            if (r2 == r3) goto L26
            r3 = 6
            if (r2 == r3) goto L3a
            if (r0 == 0) goto L39
            qd.j r4 = r0.I()
            r1.f10902i = r4
            return r1
        L26:
            qd.e r4 = qd.j.f10878l
            r1.f10902i = r4
            if (r0 == 0) goto L39
            r0.W(r4)
            return r1
        L30:
            qd.e r4 = qd.j.f10879m
            r1.f10902i = r4
            if (r0 == 0) goto L39
            r0.W(r4)
        L39:
            return r1
        L3a:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Don't wrap MOVE or CONST insns: "
            java.lang.String r4 = r0.concat(r4)
            ah.a.k(r4)
            r4 = 0
            return r4
    }

    public static qd.l a0(ud.p r2) {
            pd.k r0 = r2.f13713k
            pd.k r1 = pd.k.f10498g
            if (r0 == r1) goto L10
            pd.k r1 = pd.k.f10504m
            if (r0 != r1) goto Lb
            goto L10
        Lb:
            qd.m r2 = Z(r2)
            return r2
        L10:
            md.a r0 = md.a.O
            md.f r1 = r2.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L2f
            qd.r r0 = r2.f13714l
            md.a r1 = md.a.S
            r2.w(r1)
            qd.m r1 = new qd.m
            r1.<init>(r2)
            if (r0 == 0) goto L2e
            qd.j r2 = r0.I()
            r1.f10902i = r2
        L2e:
            return r1
        L2f:
            r0 = 0
            qd.l r0 = r2.S(r0)
            md.a r1 = md.a.f8838s
            r2.w(r1)
            return r0
    }

    public abstract qd.l H();

    public qd.j I() {
            r1 = this;
            qd.j r0 = r1.f10902i
            return r0
    }

    public final boolean J() {
            r4 = this;
            md.a r0 = md.a.J
            md.f r1 = r4.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            boolean r0 = r4 instanceof qd.m
            if (r0 == 0) goto L16
            r0 = r4
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            goto L17
        L16:
            r0 = 0
        L17:
            r1 = 0
            if (r0 == 0) goto L29
            pd.k r2 = r0.f13713k
            pd.k r3 = pd.k.K
            if (r2 != r3) goto L29
            qd.l r0 = r0.S(r1)
            boolean r0 = r0.J()
            return r0
        L29:
            return r1
    }

    public final boolean K() {
            r1 = this;
            boolean r0 = r1 instanceof qd.n
            if (r0 != 0) goto L16
            boolean r0 = r1 instanceof qd.m
            if (r0 == 0) goto L14
            r0 = r1
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            boolean r0 = r0.W()
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }

    public final boolean L() {
            r5 = this;
            boolean r0 = r5 instanceof qd.n
            if (r0 == 0) goto L1b
            r0 = r5
            qd.n r0 = (qd.n) r0
            long r1 = r0.f10905l
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1b
            qd.j r0 = r0.f10902i
            qd.g r1 = qd.j.f10869c
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public final boolean M(qd.r r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto Lf
        L3:
            boolean r0 = r1 instanceof qd.r
            if (r0 == 0) goto Lf
            r0 = r1
            qd.r r0 = (qd.r) r0
            boolean r2 = r0.h0(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final boolean N() {
            r2 = this;
            md.a r0 = md.a.J
            md.f r1 = r2.f8877g
            boolean r0 = r1.a(r0)
            return r0
    }

    public final boolean O() {
            r5 = this;
            boolean r0 = r5 instanceof qd.n
            if (r0 == 0) goto L1b
            r0 = r5
            qd.n r0 = (qd.n) r0
            long r1 = r0.f10905l
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1b
            qd.j r0 = r0.f10902i
            qd.g r1 = qd.j.f10869c
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public boolean P() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean Q() {
            r4 = this;
            boolean r0 = r4.R()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            boolean r0 = r4 instanceof qd.m
            r1 = 0
            if (r0 == 0) goto L21
            r0 = r4
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            pd.k r2 = r0.f13713k
            pd.k r3 = pd.k.f10498g
            if (r2 != r3) goto L21
            qd.l r0 = r0.S(r1)
            boolean r0 = r0.R()
            return r0
        L21:
            return r1
    }

    public boolean R() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void V(ud.p r1) {
            r0 = this;
            r0.f10903j = r1
            return
    }

    public void W(qd.j r1) {
            r0 = this;
            r0.f10902i = r1
            return
    }

    public abstract java.lang.String X();

    public final qd.l b0(ud.r r8, ud.p r9, boolean r10) {
            r7 = this;
            ud.p r0 = r7.f10903j
            r1 = 0
            if (r0 != 0) goto L6
            goto L28
        L6:
            if (r0 != r9) goto L10
            mh.b r8 = qd.l.f10901k
            java.lang.String r10 = "Can't wrap instruction info itself: {}"
            r8.x(r9, r10)
            return r1
        L10:
            java.util.List r2 = r0.f13715m
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        L18:
            r5 = -1
            if (r4 >= r2) goto L25
            qd.l r6 = r0.S(r4)
            if (r6 != r7) goto L22
            goto L26
        L22:
            int r4 = r4 + 1
            goto L18
        L25:
            r4 = r5
        L26:
            if (r4 != r5) goto L29
        L28:
            return r1
        L29:
            pd.k r2 = r9.f13713k
            pd.k r5 = pd.k.f10504m
            if (r2 != r5) goto L68
            boolean r2 = r7 instanceof qd.r
            if (r2 == 0) goto L68
            r2 = r7
            qd.r r2 = (qd.r) r2
            java.lang.String r2 = r2.getName()
            if (r2 == 0) goto L68
            qd.l r3 = r9.S(r3)
            r3.getClass()
            boolean r5 = r3 instanceof qd.r
            if (r5 == 0) goto L53
            qd.r r3 = (qd.r) r3
            java.lang.String r5 = r3.getName()
            if (r5 != 0) goto L68
            r3.p(r2)
            goto L68
        L53:
            boolean r5 = r3 instanceof qd.m
            if (r5 == 0) goto L68
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            qd.r r3 = r3.f13714l
            if (r3 == 0) goto L68
            java.lang.String r5 = r3.getName()
            if (r5 != 0) goto L68
            r3.p(r2)
        L68:
            qd.l r2 = a0(r9)
            qd.l r3 = r0.S(r4)
            qd.j r5 = r2.I()
            qd.h r6 = qd.j.f10887u
            if (r5 != r6) goto L7f
            qd.j r5 = r3.I()
            r2.W(r5)
        L7f:
            r0.c0(r4, r2)
            xe.l.i(r8, r3)
            if (r10 == 0) goto L8f
            xe.l.i(r8, r7)
            xe.l.l(r8, r9)
            r9.f13714l = r1
        L8f:
            return r2
    }
}
