package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z4.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Object f6474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f6475k;

    public n(int r2, int r3) {
            r1 = this;
            r1.f6472h = r3
            switch(r3) {
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            r3 = 0
            if (r2 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = r3
        Lb:
            r1.<init>(r0)
            w4.d[] r0 = new w4.d[r2]
            r1.f6474j = r0
            boolean[] r2 = new boolean[r2]
            r1.f6475k = r2
            r1.f6473i = r3
            return
        L19:
            r3 = 1
            r1.<init>(r3)
            z4.g r3 = new z4.g
            r3.<init>(r2)
            r1.f6474j = r3
            z4.g r3 = new z4.g
            int r0 = r2 + 1
            r3.<init>(r0)
            r1.f6475k = r3
            r1.f6473i = r2
            return
    }

    public static void t(java.lang.String r2) {
            i4.b0 r0 = new i4.b0
            java.lang.String r1 = "stack: "
            java.lang.String r2 = r1.concat(r2)
            r1 = 0
            r0.<init>(r2, r1)
            throw r0
    }

    @Override // z4.j
    public void i() {
            r2 = this;
            int r0 = r2.f6472h
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.i()
            return
        L9:
            java.lang.Object r0 = r2.f6474j
            z4.g r0 = (z4.g) r0
            r1 = 0
            r0.f22555g = r1
            java.lang.Object r0 = r2.f6475k
            z4.g r0 = (z4.g) r0
            r0.f22555g = r1
            r2.f22555g = r1
            return
    }

    public void l(i4.b0 r6) {
            r5 = this;
            int r0 = r5.f6473i
            int r0 = r0 + (-1)
            r1 = 0
        L5:
            if (r1 > r0) goto L36
            if (r1 != r0) goto Lc
            java.lang.String r2 = "top0"
            goto L12
        Lc:
            int r2 = r0 - r1
            java.lang.String r2 = a.a.X0(r2)
        L12:
            java.lang.String r3 = "stack["
            java.lang.String r4 = "]: "
            java.lang.StringBuilder r2 = bc.e.o(r3, r2, r4)
            java.lang.Object r3 = r5.f6474j
            w4.d[] r3 = (w4.d[]) r3
            r3 = r3[r1]
            if (r3 != 0) goto L25
            java.lang.String r3 = "<invalid>"
            goto L29
        L25:
            java.lang.String r3 = r3.toString()
        L29:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r6.a(r2)
            int r1 = r1 + 1
            goto L5
        L36:
            return
    }

    public void m(int r5, w4.d r6) {
            r4 = this;
            java.lang.Object r0 = r4.f6474j
            w4.d[] r0 = (w4.d[]) r0
            r4.j()
            w4.d r6 = r6.g()     // Catch: java.lang.NullPointerException -> L55
            int r1 = r4.f6473i
            int r1 = r1 - r5
            int r1 = r1 + (-1)
            r5 = r0[r1]
            if (r5 == 0) goto L29
            w4.c r2 = r5.getType()
            int r2 = r2.i()
            w4.c r3 = r6.getType()
            int r3 = r3.i()
            if (r2 != r3) goto L29
            r0[r1] = r6
            return
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "incompatible substitution: "
            r0.<init>(r1)
            java.lang.String r1 = "<invalid>"
            if (r5 != 0) goto L36
            r5 = r1
            goto L3a
        L36:
            java.lang.String r5 = r5.toString()
        L3a:
            r0.append(r5)
            java.lang.String r5 = " -> "
            r0.append(r5)
            if (r6 != 0) goto L45
            goto L49
        L45:
            java.lang.String r1 = r6.toString()
        L49:
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            t(r5)
            r5 = 0
            throw r5
        L55:
            java.lang.String r5 = "type == null"
            bsh.j.c(r5)
            return
    }

    public i4.n n() {
            r5 = this;
            i4.n r0 = new i4.n
            java.lang.Object r1 = r5.f6474j
            w4.d[] r1 = (w4.d[]) r1
            int r2 = r1.length
            r3 = 0
            r0.<init>(r2, r3)
            java.lang.Object r2 = r0.f6474j
            w4.d[] r2 = (w4.d[]) r2
            int r3 = r1.length
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            java.lang.Object r1 = r5.f6475k
            boolean[] r1 = (boolean[]) r1
            java.lang.Object r2 = r0.f6475k
            boolean[] r2 = (boolean[]) r2
            int r3 = r1.length
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            int r1 = r5.f6473i
            r0.f6473i = r1
            return r0
    }

    public w4.d o(int r3) {
            r2 = this;
            if (r3 < 0) goto L17
            int r0 = r2.f6473i
            if (r3 >= r0) goto L10
            java.lang.Object r1 = r2.f6474j
            w4.d[] r1 = (w4.d[]) r1
            int r0 = r0 - r3
            int r0 = r0 + (-1)
            r3 = r1[r0]
            return r3
        L10:
            java.lang.String r3 = "underflow"
            t(r3)
            r3 = 0
            throw r3
        L17:
            java.lang.String r3 = "n < 0"
            j8.o.t(r3)
            r3 = 0
            return r3
    }

    public w4.c p(int r1) {
            r0 = this;
            w4.d r1 = r0.o(r1)
            w4.c r1 = r1.getType()
            return r1
    }

    public void q(w4.d r7) {
            r6 = this;
            r6.j()
            w4.d r7 = r7.g()     // Catch: java.lang.NullPointerException -> L33
            w4.c r0 = r7.getType()     // Catch: java.lang.NullPointerException -> L33
            int r0 = r0.i()     // Catch: java.lang.NullPointerException -> L33
            int r1 = r6.f6473i
            int r2 = r1 + r0
            java.lang.Object r3 = r6.f6474j
            w4.d[] r3 = (w4.d[]) r3
            int r4 = r3.length
            r5 = 0
            if (r2 > r4) goto L2d
            r2 = 2
            if (r0 != r2) goto L24
            r3[r1] = r5
            int r1 = r1 + 1
            r6.f6473i = r1
        L24:
            int r0 = r6.f6473i
            r3[r0] = r7
            int r0 = r0 + 1
            r6.f6473i = r0
            return
        L2d:
            java.lang.String r7 = "overflow"
            t(r7)
            throw r5
        L33:
            java.lang.String r7 = "type == null"
            bsh.j.c(r7)
            return
    }

    public void r() {
            r7 = this;
            java.lang.Object r0 = r7.f6474j
            z4.g r0 = (z4.g) r0
            r7.j()
            int r1 = r7.f6473i
            java.lang.Object r2 = r7.f6475k
            z4.g r2 = (z4.g) r2
            int r3 = r2.f22552i
            int r3 = r3 + (-1)
            if (r1 != r3) goto L42
            int r3 = r2.n(r1)
            r4 = 0
            r5 = r4
        L19:
            if (r4 >= r1) goto L32
            int r6 = r2.n(r4)
            if (r6 == r3) goto L2f
            if (r4 == r5) goto L2d
            r2.q(r5, r6)
            int r6 = r0.n(r4)
            r0.q(r5, r6)
        L2d:
            int r5 = r5 + 1
        L2f:
            int r4 = r4 + 1
            goto L19
        L32:
            if (r5 == r1) goto L41
            r0.r(r5)
            r2.q(r5, r3)
            int r0 = r5 + 1
            r2.r(r0)
            r7.f6473i = r5
        L41:
            return
        L42:
            java.lang.String r0 = "incomplete instance"
            j8.o.t(r0)
            return
    }

    public void s(int r4) {
            r3 = this;
            r3.j()
            if (r4 < 0) goto L19
            java.lang.Object r0 = r3.f6475k
            z4.g r0 = (z4.g) r0
            int r1 = r0.f22552i
            int r2 = r3.f6473i
            if (r1 != r2) goto L13
            r0.l(r4)
            return
        L13:
            java.lang.String r4 = "non-default elements not all set"
            bsh.j.g(r4)
            return
        L19:
            java.lang.String r4 = "target < 0"
            j8.o.t(r4)
            return
    }
}
