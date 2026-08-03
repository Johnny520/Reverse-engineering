package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends qd.l implements qd.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qd.s f10923m;

    public r(int r1, qd.j r2) {
            r0 = this;
            r0.<init>()
            r0.f10902i = r2
            r0.f10922l = r1
            return
    }

    @Override // qd.l
    public final /* bridge */ /* synthetic */ qd.l H() {
            r1 = this;
            qd.r r0 = r1.c0()
            return r0
    }

    @Override // qd.l
    public final qd.j I() {
            r1 = this;
            qd.s r0 = r1.f10923m
            if (r0 == 0) goto Lb
            p4.t r0 = r0.f10930l
            java.lang.Object r0 = r0.f10224h
            qd.j r0 = (qd.j) r0
            return r0
        Lb:
            qd.h r0 = qd.j.f10887u
            return r0
    }

    @Override // qd.l
    public final boolean P() {
            r2 = this;
            qd.s r0 = r2.f10923m
            if (r0 == 0) goto L9
            boolean r0 = r0.i()
            return r0
        L9:
            md.a r0 = md.a.N
            md.f r1 = r2.f8877g
            boolean r0 = r1.a(r0)
            return r0
    }

    @Override // qd.l
    public final void W(qd.j r2) {
            r1 = this;
            qd.s r0 = r1.f10923m
            if (r0 == 0) goto L8
            r0.n(r2)
            return
        L8:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Can't change type for register without SSA variable: "
            java.lang.String r2 = r0.concat(r2)
            ah.a.k(r2)
            return
    }

    @Override // qd.l
    public final java.lang.String X() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "r"
            r0.<init>(r1)
            int r1 = r2.f10922l
            r0.append(r1)
            qd.s r1 = r2.f10923m
            if (r1 == 0) goto L1c
            r1 = 118(0x76, float:1.65E-43)
            r0.append(r1)
            qd.s r1 = r2.f10923m
            int r1 = r1.f10926h
            r0.append(r1)
        L1c:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final qd.r c0() {
            r3 = this;
            qd.j r0 = r3.f10902i
            qd.s r1 = r3.f10923m
            int r2 = r3.f10922l
            qd.r r0 = r3.d0(r2, r0, r1)
            return r0
    }

    public final qd.r d0(int r2, qd.j r3, qd.s r4) {
            r1 = this;
            qd.r r0 = new qd.r
            r0.<init>(r2, r3)
            if (r4 == 0) goto L9
            r0.f10923m = r4
        L9:
            r0.B(r1)
            ud.p r2 = r1.f10903j
            r0.V(r2)
            return r0
    }

    public final qd.r e0(ud.r r4) {
            r3 = this;
            qd.j r0 = r3.f10902i
            r1 = 0
            int r2 = r3.f10922l
            qd.r r0 = r3.d0(r2, r0, r1)
            r4.b0(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof qd.r
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qd.r r5 = (qd.r) r5
            int r1 = r4.f10922l
            int r3 = r5.f10922l
            if (r1 != r3) goto L1d
            qd.s r1 = r4.f10923m
            qd.s r5 = r5.f10923m
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public final ud.p f0() {
            r1 = this;
            qd.s r0 = r1.f10923m
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            qd.r r0 = r0.f10927i
            ud.p r0 = r0.f10903j
            return r0
    }

    public final boolean g0(qd.r r2) {
            r1 = this;
            qd.s r0 = r1.f10923m
            qd.k r0 = r0.b()
            qd.s r2 = r2.f10923m
            qd.k r2 = r2.b()
            if (r0 != r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // qd.o
    public final java.lang.String getName() {
            r2 = this;
            md.a r0 = md.a.K
            md.f r1 = r2.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto Ld
            java.lang.String r0 = "super"
            return r0
        Ld:
            boolean r0 = r2.N()
            if (r0 == 0) goto L16
            java.lang.String r0 = "this"
            return r0
        L16:
            qd.s r0 = r2.f10923m
            if (r0 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            java.lang.String r0 = r0.e()
            return r0
    }

    public final boolean h0(qd.l r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r5.getClass()
            boolean r1 = r5 instanceof qd.r
            r2 = 0
            if (r1 != 0) goto Ld
            return r2
        Ld:
            qd.r r5 = (qd.r) r5
            int r1 = r4.f10922l
            int r3 = r5.f10922l
            if (r1 != r3) goto L20
            qd.s r1 = r4.f10923m
            qd.s r5 = r5.f10923m
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f10922l
            return r0
    }

    @Override // qd.o
    public final void p(java.lang.String r3) {
            r2 = this;
            qd.s r0 = r2.f10923m
            if (r0 == 0) goto L1a
            if (r3 == 0) goto L1a
            qd.k r1 = r0.f10931m
            if (r1 == 0) goto Ld
            r1.f10894a = r3
            return
        Ld:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "CodeVar not initialized for name set in SSAVar: "
            java.lang.String r3 = r0.concat(r3)
            ah.a.k(r3)
        L1a:
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "(r"
            r0.<init>(r1)
            int r1 = r5.f10922l
            r0.append(r1)
            qd.s r1 = r5.f10923m
            if (r1 == 0) goto L1c
            r1 = 118(0x76, float:1.65E-43)
            r0.append(r1)
            qd.s r1 = r5.f10923m
            int r1 = r1.f10926h
            r0.append(r1)
        L1c:
            java.lang.String r1 = r5.getName()
            if (r1 == 0) goto L33
            java.lang.String r1 = " '"
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            r1 = 39
            r0.append(r1)
        L33:
            qd.s r1 = r5.f10923m
            if (r1 == 0) goto L3c
            qd.j r1 = r5.I()
            goto L3d
        L3c:
            r1 = 0
        L3d:
            r2 = 32
            if (r1 == 0) goto L47
            r0.append(r2)
            r0.append(r1)
        L47:
            qd.j r3 = r5.f10902i
            if (r1 == 0) goto L57
            boolean r4 = r1.equals(r3)
            if (r4 != 0) goto L5f
            boolean r1 = r1.w()
            if (r1 != 0) goto L5f
        L57:
            java.lang.String r1 = " I:"
            r0.append(r1)
            r0.append(r3)
        L5f:
            md.f r1 = r5.f8877g
            boolean r1 = r1.f()
            if (r1 != 0) goto L73
            r0.append(r2)
            md.f r1 = r5.f8877g
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L73:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
