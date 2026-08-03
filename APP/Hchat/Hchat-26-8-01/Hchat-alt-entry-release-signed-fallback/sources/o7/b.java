package o7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class b extends k7.a implements k7.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z7.c f9563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k7.f f9564l;

    static {
            o7.a r0 = new o7.a
            r1 = 0
            r0.<init>(r1)
            return
    }

    public b(k7.f r2) {
            r1 = this;
            r1.<init>()
            z7.b r0 = z7.c.f22583o
            r1.f9563k = r0
            r1.f9564l = r2
            return
    }

    @Override // k7.a
    public final int C(java.io.ByteArrayOutputStream r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L18
            k7.a r3 = r4.Q(r1)
            if (r3 != 0) goto Lf
            goto L15
        Lf:
            int r3 = r3.K(r5)
            int r3 = r3 + r2
            r2 = r3
        L15:
            int r1 = r1 + 1
            goto L6
        L18:
            return r2
    }

    public void L(int r2, k7.a r3) {
            r1 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r1.g0()
            r3.H(r2)
            r3.J(r1)
            z7.c r0 = r1.f9563k
            r0.add(r2, r3)
            r1.h0(r2)
            r1.U()
            return
    }

    public boolean M(k7.a r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r1.g0()
            int r0 = r1.size()
            r2.H(r0)
            r2.J(r1)
            z7.c r0 = r1.f9563k
            boolean r2 = r0.add(r2)
            r1.U()
            return r2
    }

    public final void N() {
            r4 = this;
            z7.c r0 = r4.f9563k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            int r0 = r4.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L2f
            int r2 = r4.size()
            int r2 = r2 + (-1)
            z7.c r3 = r4.f9563k
            java.lang.Object r2 = r3.remove(r2)
            k7.a r2 = (k7.a) r2
            if (r2 != 0) goto L21
            goto L2c
        L21:
            r3 = 0
            r2.J(r3)
            r3 = -1
            r2.H(r3)
            r4.U()
        L2c:
            int r1 = r1 + 1
            goto Le
        L2f:
            r4.S()
            r4.U()
            return
    }

    public final void O(int r3) {
            r2 = this;
            k7.f r0 = r2.f9564l
            int r1 = r2.size()
            if (r3 <= r1) goto Lb
            r2.c0(r3)
        Lb:
            k7.a r0 = r0.n()
            r2.L(r3, r0)
            return
    }

    public final k7.a P() {
            r1 = this;
            k7.f r0 = r1.f9564l
            r1.size()
            k7.a r0 = r0.n()
            r1.M(r0)
            return r0
    }

    public final k7.a Q(int r2) {
            r1 = this;
            z7.c r0 = r1.f9563k
            int r0 = r0.size()
            if (r2 >= r0) goto L14
            if (r2 >= 0) goto Lb
            goto L14
        Lb:
            z7.c r0 = r1.f9563k
            java.lang.Object[] r0 = r0.f22584g
            r2 = r0[r2]
            k7.a r2 = (k7.a) r2
            return r2
        L14:
            r2 = 0
            return r2
    }

    public boolean R() {
            r1 = this;
            boolean r0 = r1 instanceof s7.f
            return r0
    }

    public final void S() {
            r1 = this;
            z7.c r0 = r1.f9563k
            r0.getClass()
            boolean r0 = r0 instanceof z7.b
            if (r0 == 0) goto La
            return
        La:
            z7.b r0 = z7.c.f22583o
            r1.f9563k = r0
            return
    }

    public final void T(int r9, k7.a r10) {
            r8 = this;
            r0 = 0
            if (r9 >= 0) goto L4
            r9 = r0
        L4:
            z7.c r1 = r8.f9563k
            int r2 = r10.f7388g
            r3 = 1
            int r1 = r1.f(r10, r3, r2)
            z7.c r2 = r8.f9563k
            int r10 = r2.f(r10, r0, r0)
            if (r10 < 0) goto L4c
            if (r10 == r9) goto L4c
            if (r9 >= 0) goto L1a
            goto L4c
        L1a:
            int r4 = r9 + 1
            int r5 = r2.size()
            if (r4 <= r5) goto L25
            r2.h(r4, r0)
        L25:
            boolean r4 = r2.f22589l
            r2.f22589l = r3
            java.lang.Object[] r3 = r2.f22584g
            r5 = r3[r10]
            if (r10 <= r9) goto L3a
        L2f:
            if (r10 <= r9) goto L44
            int r6 = r10 + (-1)
            r6 = r3[r6]
            r3[r10] = r6
            int r10 = r10 + (-1)
            goto L2f
        L3a:
            if (r10 >= r9) goto L44
            int r6 = r10 + 1
            r7 = r3[r6]
            r3[r10] = r7
            r10 = r6
            goto L3a
        L44:
            r3[r9] = r5
            r2.f22584g = r3
            r2.f22589l = r4
            r2.f22588k = r0
        L4c:
            r8.i0(r1, r9)
            return
    }

    public void U() {
            r2 = this;
            z7.c r0 = r2.f9563k
            r1 = 0
            r0.f22588k = r1
            return
    }

    public void V() {
            r0 = this;
            return
    }

    public void W(k7.a r1) {
            r0 = this;
            return
    }

    public void X() {
            r0 = this;
            r0.U()
            return
    }

    public void Y(q7.b r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            k7.a r2 = r3.Q(r1)
            r2.G(r4)
            int r1 = r1 + 1
            goto L5
        L11:
            r3.U()
            return
    }

    public void Z() {
            r3 = this;
            z7.c r0 = r3.f9563k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof k7.e
            if (r2 == 0) goto L6
            k7.e r1 = (k7.e) r1
            r1.c()
            goto L6
        L1a:
            return
    }

    public final void a0(k7.a r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L17
        L3:
            z7.c r0 = r3.f9563k
            int r1 = r4.f7388g
            r2 = 1
            int r0 = r0.f(r4, r2, r1)
            if (r0 >= 0) goto L15
            z7.c r0 = r3.f9563k
            r1 = 0
            int r0 = r0.f(r4, r2, r1)
        L15:
            if (r0 >= 0) goto L18
        L17:
            return
        L18:
            z7.c r1 = r3.f9563k
            java.lang.Object r1 = r1.remove(r0)
            if (r1 == 0) goto L2b
            r3.h0(r0)
            r0 = -1
            r4.H(r0)
            r0 = 0
            r4.J(r0)
        L2b:
            r3.U()
            return
    }

    public final void b0(k7.f r3) {
            r2 = this;
            r2.f9564l = r3
            z7.c r3 = r2.f9563k
            r3.getClass()
            boolean r3 = r3 instanceof z7.b
            if (r3 == 0) goto Lc
            return
        Lc:
            k7.f r3 = r2.f9564l
            if (r3 != 0) goto L16
            z7.c r3 = r2.f9563k
            r0 = 0
            r3.f22585h = r0
            return
        L16:
            e9.a r0 = new e9.a
            r1 = 3
            r0.<init>(r2, r1, r3)
            z7.c r3 = r2.f9563k
            r3.f22585h = r0
            return
    }

    @Override // k7.e
    public final void c() {
            r1 = this;
            boolean r0 = r1.f7390i
            if (r0 == 0) goto L5
            return
        L5:
            z7.c r0 = r1.f9563k
            r0.m()
            z7.c r0 = r1.f9563k
            int r0 = r0.size()
            if (r0 != 0) goto L15
            r1.S()
        L15:
            r1.V()
            r1.Z()
            r1.X()
            r1.U()
            return
    }

    public void c0(int r2) {
            r1 = this;
            r0 = 0
            r1.d0(r2, r0)
            return
    }

    public void d0(int r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto L8
            if (r3 != 0) goto L8
            r1.S()
            return
        L8:
            k7.f r0 = r1.f9564l
            if (r0 != 0) goto L12
            int r0 = r1.size()
            if (r2 >= r0) goto L1f
        L12:
            r1.g0()
            z7.c r0 = r1.f9563k
            r0.h(r2, r3)
            if (r2 != 0) goto L1f
            r1.S()
        L1f:
            return
    }

    public boolean e0() {
            r4 = this;
            int r0 = r4.size()
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L9
            return r2
        L9:
            z7.c r0 = r4.f9563k
            ke.h r1 = new ke.h
            r3 = 27
            r1.<init>(r4, r3)
            boolean r0 = r0.k(r1)
            if (r0 == 0) goto L1b
            r4.h0(r2)
        L1b:
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            o7.b r3 = (o7.b) r3
            z7.c r0 = r2.f9563k
            z7.c r3 = r3.f9563k
            boolean r3 = r0.equals(r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public final void f0(java.util.function.Predicate r6) {
            r5 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
            z7.c r1 = r5.f9563k
            r1.getClass()
            int r2 = r1.size()
            int r2 = r2 + (-1)
            r3 = 0
        L12:
            if (r2 < 0) goto L23
            java.lang.Object[] r4 = r1.f22584g
            r4 = r4[r2]
            boolean r4 = r6.test(r4)
            if (r4 == 0) goto L23
            int r3 = r3 + 1
            int r2 = r2 + (-1)
            goto L12
        L23:
            int r6 = r0 - r3
        L25:
            if (r0 <= r6) goto L43
            z7.c r1 = r5.f9563k
            java.lang.Object r1 = r1.remove(r0)
            k7.a r1 = (k7.a) r1
            if (r1 != 0) goto L32
            goto L40
        L32:
            r2 = 0
            r1.J(r2)
            r2 = -1
            r1.H(r2)
            r5.h0(r0)
            r5.U()
        L40:
            int r0 = r0 + (-1)
            goto L25
        L43:
            return
    }

    public final void g0() {
            r4 = this;
            z7.c r0 = r4.f9563k
            r0.getClass()
            boolean r0 = r0 instanceof z7.b
            if (r0 != 0) goto La
            return
        La:
            z7.c r0 = new z7.c
            r1 = 0
            r0.<init>(r1)
            r4.f9563k = r0
            k7.f r1 = r4.f9564l
            if (r1 != 0) goto L1a
            r1 = 0
            r0.f22585h = r1
            goto L22
        L1a:
            e9.a r2 = new e9.a
            r3 = 3
            r2.<init>(r4, r3, r1)
            r0.f22585h = r2
        L22:
            m.a r1 = new m.a
            r2 = 9
            r1.<init>(r4, r2)
            r0.f22590m = r1
            return
    }

    public final boolean h0(int r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.i0(r2, r0)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            z7.c r0 = r1.f9563k
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean i0(int r7, int r8) {
            r6 = this;
            r0 = 0
            if (r7 >= 0) goto L4
            r7 = r0
        L4:
            if (r7 <= r8) goto L9
            r5 = r8
            r8 = r7
            r7 = r5
        L9:
            r1 = 1
            int r8 = r8 + r1
            int r2 = r6.size()
            if (r8 <= r2) goto L12
            r8 = r2
        L12:
            z7.c r2 = r6.f9563k
        L14:
            if (r7 >= r8) goto L27
            java.lang.Object[] r3 = r2.f22584g
            r3 = r3[r7]
            k7.a r3 = (k7.a) r3
            int r4 = r3.f7388g
            if (r4 == r7) goto L24
            r3.H(r7)
            r0 = r1
        L24:
            int r7 = r7 + 1
            goto L14
        L27:
            return r0
    }

    public final java.util.Iterator iterator() {
            r1 = this;
            z7.c r0 = r1.f9563k
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // k7.a
    public int p() {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            if (r0 == 0) goto L27
            boolean r2 = r4.R()
            if (r2 == 0) goto L17
            k7.a r1 = r4.Q(r1)
            int r1 = r1.p()
            int r1 = r1 * r0
            return r1
        L17:
            r2 = r1
        L18:
            if (r1 >= r0) goto L26
            k7.a r3 = r4.Q(r1)
            int r3 = r3.p()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L18
        L26:
            return r2
        L27:
            return r1
    }

    @Override // k7.a
    public final byte[] r() {
            r3 = this;
            z7.c r0 = r3.f9563k
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            k7.a r2 = (k7.a) r2
            byte[] r2 = r2.r()
            byte[] r1 = k7.a.o(r1, r2)
            goto L7
        L1c:
            return r1
    }

    public final boolean removeIf(java.util.function.Predicate r2) {
            r1 = this;
            z7.c r0 = r1.f9563k
            boolean r2 = r0.removeIf(r2)
            if (r2 == 0) goto Lc
            r0 = 0
            r1.h0(r0)
        Lc:
            return r2
    }

    public int size() {
            r1 = this;
            z7.c r0 = r1.f9563k
            int r0 = r0.size()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size="
            r0.<init>(r1)
            int r1 = r2.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // k7.a
    public void z(f6.b r4) {
            r3 = this;
            boolean r0 = r4.f3306b
            java.lang.Object r1 = r4.f3308d
            k7.a r1 = (k7.a) r1
            if (r0 == 0) goto L9
            goto L57
        L9:
            if (r1 != r3) goto Lf
            r0 = 1
            r4.f3306b = r0
            return
        Lf:
            int r0 = r3.size()
            if (r0 != 0) goto L16
            goto L2f
        L16:
            if (r1 != 0) goto L19
            goto L2f
        L19:
            boolean r0 = r3.R()
            r2 = 0
            if (r0 != 0) goto L21
            goto L40
        L21:
            k7.a r0 = r3.Q(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r1 = r1.getClass()
            if (r0 == r1) goto L40
        L2f:
            int r0 = r3.p()
            boolean r1 = r4.f3306b
            if (r1 != 0) goto L57
            if (r0 != 0) goto L3a
            goto L57
        L3a:
            int r1 = r4.f3307c
            int r1 = r1 + r0
            r4.f3307c = r1
            return
        L40:
            int r0 = r3.size()
        L44:
            if (r2 >= r0) goto L57
            boolean r1 = r4.f3306b
            if (r1 != 0) goto L57
            k7.a r1 = r3.Q(r2)
            if (r1 != 0) goto L51
            goto L54
        L51:
            r1.z(r4)
        L54:
            int r2 = r2 + 1
            goto L44
        L57:
            return
    }
}
