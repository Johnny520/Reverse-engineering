package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class p extends nd.r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final pd.k f13713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qd.r f13714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.List f13715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13716n;

    public p(pd.k r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L5
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            goto Lb
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r3 = r0
        Lb:
            r1.<init>(r2, r3)
            return
    }

    public p(pd.k r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f13713k = r1
            r0.f13715m = r2
            r1 = -1
            r0.f13716n = r1
            java.util.Iterator r1 = r2.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            qd.l r2 = (qd.l) r2
            r0.L(r2)
            goto Le
        L1e:
            return
    }

    public void I(qd.l r2) {
            r1 = this;
            java.util.List r0 = r1.f13715m
            r0.add(r2)
            r1.L(r2)
            return
    }

    public final boolean J(java.lang.StringBuilder r6) {
            r5 = this;
            java.util.List r0 = r5.f13715m
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = ", "
            java.lang.String r1 = xe.s.j(r0, r1)
            int r3 = r1.length()
            r4 = 120(0x78, float:1.68E-43)
            if (r3 >= r4) goto L1c
            r6.append(r1)
            return r2
        L1c:
            java.lang.String r1 = "\n  "
            r6.append(r1)
            java.lang.String r0 = xe.s.j(r0, r1)
            r6.append(r0)
            r0 = 10
            r6.append(r0)
            r6 = 1
            return r6
    }

    public final void K(java.lang.StringBuilder r2) {
            r1 = this;
            md.f r0 = r1.f8877g
            boolean r0 = r0.f()
            if (r0 != 0) goto L16
            r0 = 32
            r2.append(r0)
            md.f r0 = r1.f8877g
            java.lang.String r0 = r0.toString()
            r2.append(r0)
        L16:
            int r0 = r1.f9389i
            if (r0 == 0) goto L29
            java.lang.String r0 = " (LINE:"
            r2.append(r0)
            int r0 = r1.f9389i
            r2.append(r0)
            r0 = 41
            r2.append(r0)
        L29:
            return
    }

    public final void L(qd.l r2) {
            r1 = this;
            r2.V(r1)
            boolean r0 = r2 instanceof qd.r
            if (r0 == 0) goto L10
            qd.r r2 = (qd.r) r2
            qd.s r0 = r2.f10923m
            if (r0 == 0) goto L10
            r0.q(r2)
        L10:
            return
    }

    public final java.lang.String M() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.K(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final boolean N() {
            r5 = this;
            md.a r0 = md.a.f8838s
            md.f r1 = r5.f8877g
            boolean r0 = r1.a(r0)
            pd.k r1 = r5.f13713k
            r2 = 1
            if (r0 == 0) goto L12
            pd.k r0 = pd.k.f10517z
            if (r1 != r0) goto L70
            goto L6e
        L12:
            java.util.List r0 = r5.f13715m
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r0.next()
            qd.l r3 = (qd.l) r3
            r3.getClass()
            boolean r4 = r3 instanceof qd.m
            if (r4 == 0) goto L18
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            boolean r3 = r3.N()
            if (r3 != 0) goto L18
            goto L6e
        L36:
            int r0 = r1.ordinal()
            if (r0 == 0) goto L70
            if (r0 == r2) goto L70
            r1 = 2
            if (r0 == r1) goto L70
            r1 = 3
            if (r0 == r1) goto L70
            r1 = 4
            if (r0 == r1) goto L70
            r1 = 6
            if (r0 == r1) goto L70
            r1 = 8
            if (r0 == r1) goto L70
            r1 = 23
            if (r0 == r1) goto L70
            r1 = 25
            if (r0 == r1) goto L70
            r1 = 28
            if (r0 == r1) goto L70
            r1 = 41
            if (r0 == r1) goto L70
            r1 = 13
            if (r0 == r1) goto L70
            r1 = 14
            if (r0 == r1) goto L70
            r1 = 20
            if (r0 == r1) goto L70
            r1 = 21
            if (r0 == r1) goto L70
        L6e:
            r0 = 0
            return r0
        L70:
            return r2
    }

    public ud.p O() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<ud.p> r1 = ud.p.class
            if (r0 != r1) goto L19
            ud.p r0 = new ud.p
            java.util.List r1 = r3.f13715m
            int r1 = r1.size()
            pd.k r2 = r3.f13713k
            r0.<init>(r2, r1)
            r3.P(r0)
            return r0
        L19:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "Copy method not implemented in insn class "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            r0 = 0
            return r0
    }

    public final void P(ud.p r3) {
            r2 = this;
            java.util.List r0 = r3.f13715m
            int r0 = r0.size()
            if (r0 != 0) goto L22
            java.util.List r0 = r2.f13715m
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            qd.l r1 = r1.H()
            r3.I(r1)
            goto Le
        L22:
            r3.B(r2)
            r3.H(r2)
            int r0 = r2.f9389i
            r3.f9389i = r0
            int r0 = r2.f9390j
            r3.f9390j = r0
            int r0 = r2.f13716n
            r3.f13716n = r0
            return
    }

    public final ud.p Q(ud.r r5) {
            r4 = this;
            qd.r r0 = r4.f13714l
            if (r0 == 0) goto L18
            int r1 = r0.f10922l
            r2 = 0
            qd.j r3 = r0.f10902i
            qd.r r0 = r0.d0(r1, r3, r2)
            r5.b0(r0)
            ud.p r5 = r4.O()
            r5.d0(r0)
            return r5
        L18:
            java.lang.String r5 = "Result in null"
            ah.a.k(r5)
            r5 = 0
            return r5
    }

    public final ud.p R() {
            r3 = this;
            ud.p r0 = r3.O()
            qd.r r1 = r3.f13714l
            if (r1 == 0) goto L1a
            qd.s r2 = r1.f10923m
            if (r2 != 0) goto L14
            qd.r r1 = r1.c0()
            r0.d0(r1)
            return r0
        L14:
            java.lang.String r0 = "Can't copy if SSA var is set"
            ah.a.k(r0)
            r0 = 0
        L1a:
            return r0
    }

    public qd.l S(int r2) {
            r1 = this;
            java.util.List r0 = r1.f13715m
            java.lang.Object r2 = r0.get(r2)
            qd.l r2 = (qd.l) r2
            return r2
    }

    public final int T(qd.l r5) {
            r4 = this;
            java.util.List r0 = r4.f13715m
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L13
            java.lang.Object r3 = r0.get(r2)
            if (r5 != r3) goto L10
            return r2
        L10:
            int r2 = r2 + 1
            goto L7
        L13:
            r5 = -1
            return r5
    }

    public void U(java.util.Collection r4) {
            r3 = this;
            java.util.List r0 = r3.f13715m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            r1.getClass()
            boolean r2 = r1 instanceof qd.r
            if (r2 == 0) goto L1f
            qd.r r1 = (qd.r) r1
            r4.add(r1)
            goto L6
        L1f:
            boolean r2 = r1 instanceof qd.m
            if (r2 == 0) goto L6
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            r1.U(r4)
            goto L6
        L2b:
            return
    }

    public final void V(ud.p r4) {
            r3 = this;
            pd.k r0 = r3.f13713k
            pd.k r1 = pd.k.f10507p
            md.b r2 = md.b.f8846a
            if (r0 != r1) goto L29
            int r0 = r4.f9389i
            r3.f9389i = r0
            int r0 = r4.f9390j
            r3.f9390j = r0
            md.a r0 = md.a.f8831m
            md.f r1 = r3.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L25
            int r0 = r4.f13716n
            r3.f13716n = r0
            r3.E(r2)
            r3.A(r4, r2)
            return
        L25:
            r3.A(r4, r2)
            return
        L29:
            r3.A(r4, r2)
            r3.H(r4)
            return
    }

    public final boolean W() {
            r3 = this;
            pd.k r0 = r3.f13713k
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L10
            if (r0 == r1) goto L10
            r2 = 2
            if (r0 == r2) goto L10
            r0 = 0
            return r0
        L10:
            return r1
    }

    public final boolean X(ud.p r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r2.Y(r3)
            if (r0 == 0) goto L1f
            qd.r r0 = r2.f13714l
            qd.r r1 = r3.f13714l
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L1f
            java.util.List r0 = r2.f13715m
            java.util.List r3 = r3.f13715m
            boolean r3 = java.util.Objects.equals(r0, r3)
            if (r3 == 0) goto L1f
        L1d:
            r3 = 1
            return r3
        L1f:
            r3 = 0
            return r3
    }

    public boolean Y(ud.p r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            pd.k r1 = r9.f13713k
            java.util.List r9 = r9.f13715m
            r2 = 0
            pd.k r3 = r8.f13713k
            if (r3 == r1) goto Le
            return r2
        Le:
            java.util.List r1 = r8.f13715m
            int r3 = r1.size()
            int r4 = r9.size()
            if (r3 == r4) goto L1b
            return r2
        L1b:
            r4 = r2
        L1c:
            if (r4 >= r3) goto L4b
            java.lang.Object r5 = r1.get(r4)
            qd.l r5 = (qd.l) r5
            java.lang.Object r6 = r9.get(r4)
            qd.l r6 = (qd.l) r6
            r5.getClass()
            boolean r7 = r5 instanceof qd.m
            if (r7 == 0) goto L48
            r6.getClass()
            boolean r7 = r6 instanceof qd.m
            if (r7 != 0) goto L39
            return r2
        L39:
            qd.m r5 = (qd.m) r5
            ud.p r5 = r5.f10904l
            qd.m r6 = (qd.m) r6
            ud.p r6 = r6.f10904l
            boolean r5 = r5.Y(r6)
            if (r5 != 0) goto L48
            return r2
        L48:
            int r4 = r4 + 1
            goto L1c
        L4b:
            return r0
    }

    public void Z() {
            r4 = this;
            qd.r r0 = r4.f13714l
            if (r0 == 0) goto L2d
            qd.s r1 = r0.f10923m
            if (r1 == 0) goto L17
            qd.r r2 = r1.f10927i
            if (r2 != 0) goto Lf
            r1.f10927i = r0
            goto L2d
        Lf:
            if (r2 == r0) goto L2d
            r3 = 0
            r2.f10923m = r3
            r1.f10927i = r0
            goto L2d
        L17:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            ud.p r0 = r0.f10903j
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "No SSA var for result arg: "
            java.lang.String r3 = " from "
            java.lang.String r0 = bc.e.j(r2, r1, r3, r0)
            ah.a.k(r0)
            return
        L2d:
            java.util.List r0 = r4.f13715m
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            boolean r2 = r1 instanceof qd.r
            if (r2 == 0) goto L4e
            qd.r r1 = (qd.r) r1
            qd.s r2 = r1.f10923m
            r2.q(r1)
            r2.p()
            goto L33
        L4e:
            boolean r2 = r1 instanceof qd.m
            if (r2 == 0) goto L33
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            r1.Z()
            goto L33
        L5a:
            return
    }

    public qd.l a0(int r3) {
            r2 = this;
            java.util.List r0 = r2.f13715m
            java.lang.Object r1 = r0.get(r3)
            qd.l r1 = (qd.l) r1
            r0.remove(r3)
            r3 = 0
            xe.l.i(r3, r1)
            return r1
    }

    public boolean b0(qd.l r8, qd.l r9) {
            r7 = this;
            java.util.List r0 = r7.f13715m
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L30
            java.lang.Object r4 = r0.get(r3)
            qd.l r4 = (qd.l) r4
            r5 = 1
            if (r4 != r8) goto L1b
            r8 = 0
            xe.l.i(r8, r4)
            r7.c0(r3, r9)
            return r5
        L1b:
            r4.getClass()
            boolean r6 = r4 instanceof qd.m
            if (r6 == 0) goto L2d
            qd.m r4 = (qd.m) r4
            ud.p r4 = r4.f10904l
            boolean r4 = r4.b0(r8, r9)
            if (r4 == 0) goto L2d
            return r5
        L2d:
            int r3 = r3 + 1
            goto L8
        L30:
            return r2
    }

    public void c0(int r2, qd.l r3) {
            r1 = this;
            java.util.List r0 = r1.f13715m
            r0.set(r2, r3)
            r1.L(r3)
            return
    }

    public final void d0(qd.r r4) {
            r3 = this;
            r3.f13714l = r4
            if (r4 == 0) goto L18
            r4.f10903j = r3
            qd.s r0 = r4.f10923m
            if (r0 == 0) goto L18
            qd.r r1 = r0.f10927i
            if (r1 != 0) goto L11
            r0.f10927i = r4
            return
        L11:
            if (r1 == r4) goto L18
            r2 = 0
            r1.f10923m = r2
            r0.f10927i = r4
        L18:
            return
    }

    public final java.lang.Object e0(nd.n r4) {
            r3 = this;
            java.util.List r0 = r3.f13715m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            r1.getClass()
            boolean r2 = r1 instanceof qd.m
            if (r2 == 0) goto L22
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            java.lang.Object r1 = r1.e0(r4)
            goto L26
        L22:
            java.lang.Object r1 = r4.apply(r1)
        L26:
            if (r1 == 0) goto L6
            return r1
        L29:
            r4 = 0
            return r4
    }

    public final void f0(ae.e r4) {
            r3 = this;
            java.util.List r0 = r3.f13715m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            r1.getClass()
            boolean r2 = r1 instanceof qd.m
            if (r2 == 0) goto L21
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            r1.f0(r4)
            goto L6
        L21:
            r4.accept(r1)
            goto L6
        L25:
            return
    }

    public final java.lang.Object g0(be.m r4) {
            r3 = this;
            java.lang.Object r0 = r4.apply(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.util.List r0 = r3.f13715m
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            r1.getClass()
            boolean r2 = r1 instanceof qd.m
            if (r2 == 0) goto Ld
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            java.lang.Object r1 = r1.g0(r4)
            if (r1 == 0) goto Ld
            return r1
        L2b:
            r4 = 0
            return r4
    }

    public void h0(java.util.function.Consumer r4) {
            r3 = this;
            r4.accept(r3)
            java.util.List r0 = r3.f13715m
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            r1.getClass()
            boolean r2 = r1 instanceof qd.m
            if (r2 == 0) goto L9
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            r1.h0(r4)
            goto L9
        L24:
            return
    }

    public final java.lang.String k() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.f13716n
            r2 = -1
            if (r1 == r2) goto L16
            java.lang.String r1 = xe.m.d(r1)
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
        L16:
            pd.k r1 = r3.f13713k
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            qd.r r1 = r3.f13714l
            if (r1 == 0) goto L2c
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
        L2c:
            r3.J(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.k()
            java.lang.String r1 = r2.M()
            java.lang.String r0 = r0.concat(r1)
            return r0
    }
}
