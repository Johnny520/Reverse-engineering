package p7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends p7.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r7.c f10298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7.c f10299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r7.f f10300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r7.f f10301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v7.y f10302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s7.a f10303w;

    public k() {
            r7 = this;
            r0 = 513(0x201, float:7.19E-43)
            r7.<init>(r0)
            r7.c r0 = new r7.c
            r1 = 1
            r2 = 1
            r0.<init>(r2, r1)
            r7.f10298r = r0
            r7.c r1 = new r7.c
            r3 = 1
            r1.<init>(r2, r3)
            r7.f10299s = r1
            r7.a r2 = new r7.a
            r4 = 0
            r2.<init>(r3, r4)
            r7.f r3 = new r7.f
            r3.<init>(r4)
            r7.f10300t = r3
            r7.f r5 = new r7.f
            r5.<init>(r4)
            r7.f10301u = r5
            v7.y r4 = new v7.y
            r6 = 64
            r4.<init>(r6)
            r7.f10302v = r4
            r7.P(r0)
            r7.P(r1)
            r7.P(r2)
            r7.P(r3)
            r7.P(r5)
            r7.P(r4)
            return
    }

    public static p7.k U(q7.b r5) {
            p7.k r0 = new p7.k
            r0.<init>()
            r7.c r1 = r0.f10299s
            int r2 = r1.get()
            r2 = r2 & 3
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L14
            r0.V(r4)
        L14:
            int r1 = r1.get()
            r1 = r1 & 3
            r2 = 2
            if (r1 != r2) goto L20
            r0.V(r4)
        L20:
            int r1 = r5.available()
            r2 = 36
            if (r1 < r2) goto L31
            int r1 = r5.f10666k
            r0.G(r5)
            r5.g(r1)
            return r0
        L31:
            java.lang.String r0 = "Too few bytes to read type header, available = "
            int r5 = r5.available()
            j8.o.u(r5, r0)
            r5 = 0
            return r5
    }

    @Override // p7.a, k7.c, k7.a
    public final void B(q7.b r1) {
            r0 = this;
            super.B(r1)
            r0.T()
            return
    }

    public final void T() {
            r10 = this;
            s7.a r0 = r10.f10303w
            if (r0 == 0) goto L8f
            r7.c r1 = r10.f10299s
            int r1 = r1.get()
            r1 = r1 & 3
            s7.b r0 = r0.f12368g
            o7.c r2 = r0.f12372n
            s7.c r2 = (s7.c) r2
            k7.f r3 = r2.f9564l
            r4 = 1
            r5 = 0
            r6 = 2
            okio.a r7 = r7.k.f11567p
            okio.a r8 = r7.k.f11565n
            if (r3 != r8) goto L1f
            r9 = r6
            goto L24
        L1f:
            if (r3 != r7) goto L23
            r9 = r4
            goto L24
        L23:
            r9 = r5
        L24:
            if (r1 == r9) goto L8a
            if (r1 != r4) goto L64
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L32
            r2.b0(r7)
            goto L84
        L32:
            z7.c r1 = s7.c.l0(r0)
            int r3 = r1.f22586i
            r2.N()
            r2.b0(r7)
            r2.c0(r3)
        L41:
            if (r5 >= r3) goto L59
            java.lang.Object[] r6 = r1.f22584g
            r6 = r6[r5]
            java.lang.Integer r6 = (java.lang.Integer) r6
            k7.a r7 = r2.Q(r5)
            r7.k r7 = (r7.k) r7
            int r6 = r6.intValue()
            r7.Q(r6)
            int r5 = r5 + 1
            goto L41
        L59:
            ce.n r1 = new ce.n
            r2 = 27
            r1.<init>(r2)
            r0.removeIf(r1)
            goto L84
        L64:
            okio.a r5 = r7.k.f11566o
            if (r3 != r7) goto L72
            if (r1 != r6) goto L6e
            r2.k0(r0, r8)
            goto L84
        L6e:
            r2.k0(r0, r5)
            goto L84
        L72:
            if (r1 != r6) goto L78
            r2.b0(r8)
            goto L7b
        L78:
            r2.b0(r5)
        L7b:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L84
            r2.N()
        L84:
            boolean r1 = r0.isEmpty()
            r5 = r1 ^ 1
        L8a:
            if (r5 == 0) goto L8f
            r0.j0()
        L8f:
            return
    }

    public final void V(int r3) {
            r2 = this;
            r7.c r0 = r2.f10299s
            int r1 = r0.get()
            r1 = r1 & 3
            if (r3 == r1) goto L2b
            if (r3 == 0) goto L1d
            r1 = 2
            if (r3 == r1) goto L1d
            r1 = 1
            if (r3 != r1) goto L13
            goto L1d
        L13:
            java.lang.String r0 = "Invalid offset type: "
            java.lang.String r3 = eh.a.l(r3, r0)
            j8.o.t(r3)
            return
        L1d:
            int r1 = r0.get()
            r1 = r1 & 252(0xfc, float:3.53E-43)
            r3 = r3 | r1
            byte r3 = (byte) r3
            r0.P(r3)
            r2.T()
        L2b:
            return
    }

    @Override // p7.a
    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.Q()
            r1 = 13
            if (r0 == r1) goto Ld
            java.lang.String r0 = super.toString()
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<p7.k> r1 = p7.k.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " {id="
            r0.append(r1)
            r7.c r1 = r3.f10298r
            byte[] r1 = r1.f11553k
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = y7.a.n(r1)
            r0.append(r1)
            java.lang.String r1 = ", flags="
            r0.append(r1)
            r7.c r1 = r3.f10299s
            byte[] r1 = r1.f11553k
            r1 = r1[r2]
            java.lang.String r1 = y7.a.n(r1)
            r0.append(r1)
            java.lang.String r1 = ", count="
            r0.append(r1)
            r7.f r1 = r3.f10300t
            r0.append(r1)
            java.lang.String r1 = ", entriesStart="
            r0.append(r1)
            r7.f r1 = r3.f10301u
            r0.append(r1)
            java.lang.String r1 = ", config="
            r0.append(r1)
            v7.y r1 = r3.f10302v
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
