package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements o5.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Object f7242l;

    public n(i2.g r3, long r4) {
            r2 = this;
            r0 = 1
            r2.f7237g = r0
            r2.<init>()
            c8.a r0 = new c8.a
            java.lang.String r3 = r3.f6314h
            r0.<init>()
            r0.f1055d = r3
            r1 = -1
            r0.f1053b = r1
            r0.f1054c = r1
            r2.f7242l = r0
            int r0 = i2.m0.f(r4)
            r2.f7238h = r0
            int r0 = i2.m0.e(r4)
            r2.f7239i = r0
            r2.f7240j = r1
            r2.f7241k = r1
            int r0 = i2.m0.f(r4)
            int r4 = i2.m0.e(r4)
            java.lang.String r5 = ") offset is outside of text region "
            if (r0 < 0) goto L5f
            int r1 = r3.length()
            if (r0 > r1) goto L5f
            if (r4 < 0) goto L50
            int r1 = r3.length()
            if (r4 > r1) goto L50
            if (r0 > r4) goto L43
            return
        L43:
            java.lang.String r3 = "Do not set reversed range: "
            java.lang.String r5 = " > "
            java.lang.String r3 = p.a.j(r0, r3, r5, r4)
            j8.o.t(r3)
            r3 = 0
            throw r3
        L50:
            java.lang.String r0 = "end ("
            java.lang.StringBuilder r4 = eh.a.t(r4, r0, r5)
            int r3 = r3.length()
            j8.o.e(r3, r4)
            r3 = 0
            throw r3
        L5f:
            java.lang.String r4 = "start ("
            java.lang.StringBuilder r4 = eh.a.t(r0, r4, r5)
            int r3 = r3.length()
            j8.o.e(r3, r4)
            r3 = 0
            throw r3
    }

    public n(k5.o r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f7237g = r0
            r1.<init>()
            r1.f7242l = r2
            r1.f7238h = r3
            return
    }

    public n(o5.d r2, int r3, int r4) {
            r1 = this;
            r0 = 2
            r1.f7237g = r0
            r1.<init>()
            r1.f7242l = r2
            r1.f7238h = r3
            r1.f7239i = r4
            k5.u r2 = r2.f9508b
            androidx.lifecycle.x r2 = r2.f7264b
            int r2 = r2.N(r3)
            r1.f7241k = r2
            r2 = 0
            r1.f7240j = r2
            return
    }

    public void a(int r5, int r6) {
            r4 = this;
            long r0 = i2.e0.b(r5, r6)
            java.lang.Object r2 = r4.f7242l
            c8.a r2 = (c8.a) r2
            java.lang.String r3 = ""
            r2.k(r5, r6, r3)
            int r5 = r4.f7238h
            int r6 = r4.f7239i
            long r5 = i2.e0.b(r5, r6)
            long r5 = f8.i.Q0(r5, r0)
            int r2 = i2.m0.f(r5)
            r4.j(r2)
            int r5 = i2.m0.e(r5)
            r4.i(r5)
            int r5 = r4.f7240j
            r6 = -1
            if (r5 == r6) goto L4d
            int r2 = r4.f7241k
            long r2 = i2.e0.b(r5, r2)
            long r0 = f8.i.Q0(r2, r0)
            boolean r5 = i2.m0.c(r0)
            if (r5 == 0) goto L41
            r4.f7240j = r6
            r4.f7241k = r6
            return
        L41:
            int r5 = i2.m0.f(r0)
            r4.f7240j = r5
            int r5 = i2.m0.e(r0)
            r4.f7241k = r5
        L4d:
            return
    }

    public char b(int r6) {
            r5 = this;
            java.lang.Object r0 = r5.f7242l
            c8.a r0 = (c8.a) r0
            java.lang.Object r1 = r0.f1056e
            h0.s r1 = (h0.s) r1
            if (r1 != 0) goto L13
            java.lang.Object r0 = r0.f1055d
            java.lang.String r0 = (java.lang.String) r0
            char r6 = r0.charAt(r6)
            return r6
        L13:
            int r2 = r0.f1053b
            if (r6 >= r2) goto L20
            java.lang.Object r0 = r0.f1055d
            java.lang.String r0 = (java.lang.String) r0
            char r6 = r0.charAt(r6)
            return r6
        L20:
            int r2 = r1.f4979b
            int r3 = r1.b()
            int r2 = r2 - r3
            int r3 = r0.f1053b
            int r4 = r2 + r3
            if (r6 >= r4) goto L40
            int r6 = r6 - r3
            int r0 = r1.f4980c
            java.lang.Object r2 = r1.f4982e
            char[] r2 = (char[]) r2
            if (r6 >= r0) goto L39
            char r6 = r2[r6]
            return r6
        L39:
            int r6 = r6 - r0
            int r0 = r1.f4981d
            int r6 = r6 + r0
            char r6 = r2[r6]
            return r6
        L40:
            java.lang.Object r1 = r0.f1055d
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r0.f1054c
            int r2 = r2 - r0
            int r2 = r2 + r3
            int r6 = r6 - r2
            char r6 = r1.charAt(r6)
            return r6
    }

    public i2.m0 c() {
            r3 = this;
            int r0 = r3.f7240j
            r1 = -1
            if (r0 == r1) goto L11
            int r1 = r3.f7241k
            long r0 = i2.e0.b(r0, r1)
            i2.m0 r2 = new i2.m0
            r2.<init>(r0)
            return r2
        L11:
            r0 = 0
            return r0
    }

    public int d() {
            r5 = this;
            java.lang.Object r0 = r5.f7242l
            k5.o r0 = (k5.o) r0
            int r1 = r5.f7240j
            if (r1 != 0) goto L29
            k5.u r1 = r0.f7243j
            androidx.lifecycle.x r1 = r1.f7264b
            int r2 = r5.e()
            r1.getClass()
            a5.a r3 = new a5.a
            r4 = 5
            r3.<init>(r2, r4, r1)
            r1 = 0
            r2 = r1
        L1b:
            int r4 = r0.f7251r
            if (r2 >= r4) goto L25
            r3.o(r1)
            int r2 = r2 + 1
            goto L1b
        L25:
            int r0 = r3.f56h
            r5.f7240j = r0
        L29:
            int r0 = r5.f7240j
            return r0
    }

    public int e() {
            r5 = this;
            java.lang.Object r0 = r5.f7242l
            k5.o r0 = (k5.o) r0
            int r1 = r5.f7239i
            if (r1 != 0) goto L27
            k5.u r1 = r0.f7243j
            androidx.lifecycle.x r1 = r1.f7264b
            int r2 = r5.f7238h
            r1.getClass()
            a5.a r3 = new a5.a
            r4 = 5
            r3.<init>(r2, r4, r1)
            r1 = 0
            r2 = r1
        L19:
            int r4 = r0.f7250q
            if (r2 >= r4) goto L23
            r3.o(r1)
            int r2 = r2 + 1
            goto L19
        L23:
            int r0 = r3.f56h
            r5.f7239i = r0
        L27:
            int r0 = r5.f7239i
            return r0
    }

    public void f(int r4, int r5, java.lang.String r6) {
            r3 = this;
            java.lang.Object r0 = r3.f7242l
            c8.a r0 = (c8.a) r0
            java.lang.String r1 = ") offset is outside of text region "
            if (r4 < 0) goto L4b
            int r2 = r0.b()
            if (r4 > r2) goto L4b
            if (r5 < 0) goto L3d
            int r2 = r0.b()
            if (r5 > r2) goto L3d
            if (r4 > r5) goto L31
            r0.k(r4, r5, r6)
            int r5 = r6.length()
            int r5 = r5 + r4
            r3.j(r5)
            int r5 = r6.length()
            int r5 = r5 + r4
            r3.i(r5)
            r4 = -1
            r3.f7240j = r4
            r3.f7241k = r4
            return
        L31:
            java.lang.String r6 = "Do not set reversed range: "
            java.lang.String r0 = " > "
            java.lang.String r4 = p.a.j(r4, r6, r0, r5)
            j8.o.t(r4)
            return
        L3d:
            java.lang.String r4 = "end ("
            java.lang.StringBuilder r4 = eh.a.t(r5, r4, r1)
            int r5 = r0.b()
            j8.o.e(r5, r4)
            return
        L4b:
            java.lang.String r5 = "start ("
            java.lang.StringBuilder r4 = eh.a.t(r4, r5, r1)
            int r5 = r0.b()
            j8.o.e(r5, r4)
            return
    }

    public void g(int r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.f7242l
            c8.a r0 = (c8.a) r0
            java.lang.String r1 = ") offset is outside of text region "
            if (r4 < 0) goto L37
            int r2 = r0.b()
            if (r4 > r2) goto L37
            if (r5 < 0) goto L29
            int r2 = r0.b()
            if (r5 > r2) goto L29
            if (r4 >= r5) goto L1d
            r3.f7240j = r4
            r3.f7241k = r5
            return
        L1d:
            java.lang.String r0 = "Do not set reversed or empty range: "
            java.lang.String r1 = " > "
            java.lang.String r4 = p.a.j(r4, r0, r1, r5)
            j8.o.t(r4)
            return
        L29:
            java.lang.String r4 = "end ("
            java.lang.StringBuilder r4 = eh.a.t(r5, r4, r1)
            int r5 = r0.b()
            j8.o.e(r5, r4)
            return
        L37:
            java.lang.String r5 = "start ("
            java.lang.StringBuilder r4 = eh.a.t(r4, r5, r1)
            int r5 = r0.b()
            j8.o.e(r5, r4)
            return
    }

    public void h(int r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.f7242l
            c8.a r0 = (c8.a) r0
            java.lang.String r1 = ") offset is outside of text region "
            if (r4 < 0) goto L39
            int r2 = r0.b()
            if (r4 > r2) goto L39
            if (r5 < 0) goto L2b
            int r2 = r0.b()
            if (r5 > r2) goto L2b
            if (r4 > r5) goto L1f
            r3.j(r4)
            r3.i(r5)
            return
        L1f:
            java.lang.String r0 = "Do not set reversed range: "
            java.lang.String r1 = " > "
            java.lang.String r4 = p.a.j(r4, r0, r1, r5)
            j8.o.t(r4)
            return
        L2b:
            java.lang.String r4 = "end ("
            java.lang.StringBuilder r4 = eh.a.t(r5, r4, r1)
            int r5 = r0.b()
            j8.o.e(r5, r4)
            return
        L39:
            java.lang.String r5 = "start ("
            java.lang.StringBuilder r4 = eh.a.t(r4, r5, r1)
            int r5 = r0.b()
            j8.o.e(r5, r4)
            return
    }

    public void i(int r3) {
            r2 = this;
            if (r3 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 != 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set selectionEnd to a negative value: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            o2.a.a(r0)
        L18:
            r2.f7239i = r3
            return
    }

    public void j(int r3) {
            r2 = this;
            if (r3 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 != 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set selectionStart to a negative value: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            o2.a.a(r0)
        L18:
            r2.f7238h = r3
            return
    }

    @Override // o5.c
    public int seekTo(int r6) {
            r5 = this;
            int r0 = r5.f7238h
            java.lang.Object r1 = r5.f7242l
            o5.d r1 = (o5.d) r1
            k5.u r1 = r1.f9508b
        L8:
            int r2 = r5.f7241k
            if (r2 >= r6) goto L22
            int r3 = r5.f7240j
            int r3 = r3 + 1
            int r4 = r5.f7239i
            if (r3 >= r4) goto L22
            r5.f7240j = r3
            androidx.lifecycle.x r2 = r1.f7264b
            int r3 = r3 * 8
            int r3 = r3 + r0
            int r2 = r2.N(r3)
            r5.f7241k = r2
            goto L8
        L22:
            if (r2 != r6) goto L32
            androidx.lifecycle.x r6 = r1.f7264b
            int r1 = r5.f7240j
            int r1 = r1 * 8
            int r1 = r1 + r0
            int r1 = r1 + 4
            int r6 = r6.N(r1)
            return r6
        L32:
            r6 = 0
            return r6
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f7237g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r1.f7242l
            c8.a r0 = (c8.a) r0
            java.lang.String r0 = r0.toString()
            return r0
    }
}
