package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends r7.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v7.h0 f14161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f14162n;

    public j0(int r2, int r3) {
            r1 = this;
            r1.<init>(r2)
            r1.f14162n = r3
            int r2 = r1.p()
            int r2 = r2 - r3
            byte[] r0 = r1.f11553k
            short r2 = (short) r2
            k7.a.F(r0, r3, r2)
            return
    }

    @Override // r7.b, k7.a
    public void B(q7.b r6) {
            r5 = this;
            int r0 = r6.f10666k
            int r1 = r5.f14162n
            r6.c(r1)
            r2 = 65535(0xffff, float:9.1834E-41)
            short r3 = r6.readShort()
            r2 = r2 & r3
            r3 = 8
            if (r2 >= r3) goto L1b
            int r4 = r6.available()
            if (r4 < r3) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r2
        L1c:
            r6.g(r0)
            int r4 = r4 + r1
            r0 = 0
            r5.M(r4, r0)
            super.B(r6)
            if (r2 >= r3) goto L39
            int r6 = r1 + 8
            r5.M(r6, r0)
            int r6 = r5.p()
            int r6 = r6 - r1
            byte[] r0 = r5.f11553k
            short r6 = (short) r6
            k7.a.F(r0, r1, r6)
        L39:
            return
    }

    public java.lang.String N() {
            r10 = this;
            v7.k0 r0 = r10.T()
            r1 = 0
            if (r0 != 0) goto L9
            goto L72
        L9:
            v7.k0 r2 = v7.k0.f14180w
            v7.k0 r3 = v7.k0.f14179v
            v7.k0 r4 = v7.k0.f14167j
            r5 = 1
            java.lang.String r6 = "?null"
            java.lang.String r7 = "@null"
            v7.k0 r8 = v7.k0.f14166i
            if (r0 == r8) goto L60
            if (r0 == r4) goto L60
            if (r0 == r3) goto L60
            if (r0 != r2) goto L1f
            goto L60
        L1f:
            v7.k0 r2 = v7.k0.f14178u
            if (r0 != r2) goto L28
            java.lang.String r0 = r10.S()
            return r0
        L28:
            int r2 = r10.O()
            java.util.HashMap r3 = n7.g.f9048a
            if (r2 == 0) goto L34
            if (r2 == r5) goto L34
        L32:
            r7 = r1
            goto L4d
        L34:
            v7.k0 r3 = v7.k0.f14165h
            if (r0 != r3) goto L3e
            if (r2 != 0) goto L3b
            goto L4d
        L3b:
            java.lang.String r7 = "@empty"
            goto L4d
        L3e:
            if (r2 == 0) goto L41
            goto L32
        L41:
            if (r0 != r4) goto L49
            if (r2 != 0) goto L46
            goto L47
        L46:
            r6 = r1
        L47:
            r7 = r6
            goto L4d
        L49:
            if (r0 != r8) goto L32
            if (r2 != 0) goto L32
        L4d:
            if (r7 == 0) goto L50
            return r7
        L50:
            java.util.HashMap r3 = n7.g.f9048a
            java.lang.Object r0 = r3.get(r0)
            n7.a r0 = (n7.a) r0
            if (r0 != 0) goto L5b
            goto L72
        L5b:
            java.lang.String r0 = r0.a(r2)
            return r0
        L60:
            int r9 = r10.O()
            if (r9 != 0) goto L74
            java.util.HashMap r2 = n7.g.f9048a
            if (r9 != 0) goto L73
            if (r0 != r8) goto L6f
            if (r9 != 0) goto L72
            return r7
        L6f:
            if (r9 != 0) goto L72
            return r6
        L72:
            return r1
        L73:
            throw r1
        L74:
            v7.k0 r6 = r10.T()
            if (r6 == 0) goto L88
            if (r6 == r8) goto L82
            if (r6 == r4) goto L82
            if (r6 == r3) goto L82
            if (r6 != r2) goto L88
        L82:
            l7.f r2 = r10.i()
            if (r2 != 0) goto L8a
        L88:
            r4 = r1
            goto L9e
        L8a:
            int r3 = r10.O()
            t7.b r4 = r2.W(r3)
            if (r4 != 0) goto L9e
            l7.l r6 = r2.Y()
            if (r6 == 0) goto L9e
            t7.b r4 = r6.X(r2, r3)
        L9e:
            if (r4 != 0) goto Lad
            l7.f r2 = r10.i()
            if (r2 == 0) goto La7
            goto Lad
        La7:
            java.lang.String r0 = "Parent package block is null"
            bsh.j.c(r0)
            return r1
        Lad:
            if (r4 == 0) goto Lbe
            java.lang.String r1 = r4.b()
            if (r1 == 0) goto Lbe
            l7.f r1 = r10.i()
            java.lang.String r0 = r4.a(r1, r0)
            return r0
        Lbe:
            if (r0 != r8) goto Lc1
            goto Lc2
        Lc1:
            r5 = 0
        Lc2:
            java.util.HashMap r0 = n7.g.f9048a
            if (r5 == 0) goto Lcd
            java.lang.String r0 = "@0x"
            java.lang.String r0 = y7.a.p(r9, r0)
            return r0
        Lcd:
            java.lang.String r0 = "?0x"
            java.lang.String r0 = y7.a.p(r9, r0)
            return r0
    }

    public int O() {
            r2 = this;
            byte[] r0 = r2.f11553k
            int r1 = r2.f14162n
            int r1 = r1 + 4
            int r0 = k7.a.s(r0, r1)
            return r0
    }

    public abstract l7.g P();

    public int Q() {
            r2 = this;
            byte[] r0 = r2.f11553k
            int r1 = r2.f14162n
            short r0 = k7.a.w(r0, r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    public byte R() {
            r2 = this;
            byte[] r0 = r2.f11553k
            int r1 = r2.f14162n
            int r1 = r1 + 3
            r0 = r0[r1]
            return r0
    }

    public final java.lang.String S() {
            r3 = this;
            v7.k0 r0 = r3.T()
            v7.k0 r1 = v7.k0.f14178u
            r2 = 0
            if (r0 == r1) goto Lb
        L9:
            r0 = r2
            goto L1a
        Lb:
            u7.c r0 = r3.g()
            if (r0 != 0) goto L12
            goto L9
        L12:
            int r1 = r3.O()
            r7.s r0 = r0.V(r1)
        L1a:
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.Y()
            if (r0 != 0) goto L24
            java.lang.String r0 = ""
        L24:
            return r0
        L25:
            return r2
    }

    public final v7.k0 T() {
            r8 = this;
            byte r0 = r8.R()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 >= 0) goto L9
            goto L34
        L9:
            v7.k0[] r1 = v7.k0.f14181x
            if (r1 == 0) goto Le
            goto L2e
        Le:
            java.lang.Class<v7.k0> r1 = v7.k0.class
            monitor-enter(r1)
            r2 = 32
            v7.k0[] r2 = new v7.k0[r2]     // Catch: java.lang.Throwable -> L28
            v7.k0[] r3 = v7.k0.values()     // Catch: java.lang.Throwable -> L28
            int r4 = r3.length     // Catch: java.lang.Throwable -> L28
            r5 = 0
        L1b:
            if (r5 >= r4) goto L2a
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L28
            byte r7 = r6.f14183g     // Catch: java.lang.Throwable -> L28
            r7 = r7 & 255(0xff, float:3.57E-43)
            r2[r7] = r6     // Catch: java.lang.Throwable -> L28
            int r5 = r5 + 1
            goto L1b
        L28:
            r0 = move-exception
            goto L36
        L2a:
            v7.k0.f14181x = r2     // Catch: java.lang.Throwable -> L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            r1 = r2
        L2e:
            int r2 = r1.length
            if (r0 >= r2) goto L34
            r0 = r1[r0]
            return r0
        L34:
            r0 = 0
            return r0
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            throw r0
    }

    public final void U(u7.c r3) {
            r2 = this;
            int r0 = r2.O()
            r7.s r3 = r3.V(r0)
            if (r3 != 0) goto Le
            r2.W()
            return
        Le:
            v7.h0 r0 = r2.f14161m
            if (r0 == 0) goto L15
            r2.W()
        L15:
            v7.h0 r0 = new v7.h0
            r1 = 1
            r0.<init>(r2, r1)
            r2.f14161m = r0
            r3.P(r0)
            return
    }

    public void V(v7.h0 r2) {
            r1 = this;
            u7.c r0 = r1.g()
            if (r0 != 0) goto L7
            return
        L7:
            r0.b0(r2)
            return
    }

    public final void W() {
            r2 = this;
            v7.h0 r0 = r2.f14161m
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r2.f14161m = r1
            r2.V(r0)
            return
    }

    public void X(int r3) {
            r2 = this;
            byte[] r0 = r2.f11553k
            int r1 = r2.f14162n
            int r1 = r1 + 4
            k7.a.D(r0, r1, r3)
            return
    }

    public u7.c g() {
            r2 = this;
            k7.a r0 = r2.f7389h
        L2:
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof l7.b
            if (r1 == 0) goto Lf
            l7.b r0 = (l7.b) r0
            u7.c r0 = r0.g()
            return r0
        Lf:
            k7.a r0 = r0.f7389h
            goto L2
        L12:
            r0 = 0
            return r0
    }

    public final l7.f i() {
            r1 = this;
            l7.g r0 = r1.P()
            if (r0 == 0) goto Lb
            l7.f r0 = r0.i()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            l7.f r0 = r6.i()
            r1 = 8
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v7.k0 r2 = r6.T()
            r0.append(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            int r2 = r6.O()
            java.lang.String r1 = y7.a.k(r2, r1)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r6.N()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r6.Q()
            if (r2 == r1) goto L51
            java.lang.String r2 = "size="
            r0.append(r2)
            int r2 = r6.Q()
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
        L51:
            java.lang.String r2 = "type="
            r0.append(r2)
            v7.k0 r2 = r6.T()
            if (r2 == 0) goto L60
            r0.append(r2)
            goto L6b
        L60:
            byte r3 = r6.R()
            java.lang.String r3 = y7.a.n(r3)
            r0.append(r3)
        L6b:
            java.lang.String r3 = ", data="
            r0.append(r3)
            int r3 = r6.O()
            v7.k0 r4 = v7.k0.f14178u
            if (r2 != r4) goto Lae
            v7.k0 r2 = r6.T()
            r5 = 0
            if (r2 == r4) goto L81
        L7f:
            r2 = r5
            goto L90
        L81:
            u7.c r2 = r6.g()
            if (r2 != 0) goto L88
            goto L7f
        L88:
            int r4 = r6.O()
            r7.s r2 = r2.V(r4)
        L90:
            if (r2 == 0) goto La6
            java.lang.String r1 = r2.f11578m
            if (r1 != 0) goto L97
            goto La2
        L97:
            r7.u r2 = r2.f11583q
            if (r2 != 0) goto L9d
            r5 = r1
            goto La2
        L9d:
            r3 = 0
            java.lang.String r5 = r2.Q(r1, r3)
        La2:
            r0.append(r5)
            goto Lb5
        La6:
            java.lang.String r1 = y7.a.k(r3, r1)
            r0.append(r1)
            goto Lb5
        Lae:
            java.lang.String r1 = y7.a.k(r3, r1)
            r0.append(r1)
        Lb5:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
