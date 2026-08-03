package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.e f5707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.k1 f5708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f5709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.j1 f5710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0.j1 f5711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.h1 f5712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.h1 f5713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.j1 f5714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w0.p f5715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w0.p f5716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0.j1 f5717k;

    public k1(b.e r1, i.k1 r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f5707a = r1
            r0.f5708b = r2
            r0.f5709c = r3
            java.lang.Object r1 = r0.c()
            i0.j1 r1 = i0.r.u(r1)
            r0.f5710d = r1
            i.f1 r1 = new i.f1
            java.lang.Object r2 = r0.c()
            java.lang.Object r3 = r0.c()
            r1.<init>(r2, r3)
            i0.j1 r1 = i0.r.u(r1)
            r0.f5711e = r1
            i0.h1 r1 = new i0.h1
            r2 = 0
            r1.<init>(r2)
            r0.f5712f = r1
            i0.h1 r1 = new i0.h1
            r2 = -9223372036854775808
            r1.<init>(r2)
            r0.f5713g = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i0.j1 r2 = i0.r.u(r1)
            r0.f5714h = r2
            w0.p r2 = new w0.p
            r2.<init>()
            r0.f5715i = r2
            w0.p r2 = new w0.p
            r2.<init>()
            r0.f5716j = r2
            i0.j1 r1 = i0.r.u(r1)
            r0.f5717k = r1
            i.a1 r1 = new i.a1
            r2 = 1
            r1.<init>(r0, r2)
            i0.r.p(r1)
            return
    }

    public final void a(java.lang.Object r8, i0.h0 r9, int r10) {
            r7 = this;
            r0 = -1493585151(0xffffffffa6f9b301, float:-1.7326365E-15)
            r9.b0(r0)
            r0 = r10 & 6
            if (r0 != 0) goto L1e
            r0 = r10 & 8
            if (r0 != 0) goto L13
            boolean r0 = r9.f(r8)
            goto L17
        L13:
            boolean r0 = r9.h(r8)
        L17:
            if (r0 == 0) goto L1b
            r0 = 4
            goto L1c
        L1b:
            r0 = 2
        L1c:
            r0 = r0 | r10
            goto L1f
        L1e:
            r0 = r10
        L1f:
            r1 = r10 & 48
            r2 = 32
            if (r1 != 0) goto L30
            boolean r1 = r9.f(r7)
            if (r1 == 0) goto L2d
            r1 = r2
            goto L2f
        L2d:
            r1 = 16
        L2f:
            r0 = r0 | r1
        L30:
            r1 = r0 & 19
            r3 = 18
            r4 = 1
            r5 = 0
            if (r1 == r3) goto L3a
            r1 = r4
            goto L3b
        L3a:
            r1 = r5
        L3b:
            r3 = r0 & 1
            boolean r1 = r9.S(r3, r1)
            if (r1 == 0) goto Lcf
            boolean r1 = r7.g()
            if (r1 != 0) goto Lc5
            r1 = 466062241(0x1bc78ba1, float:3.3012021E-22)
            r9.a0(r1)
            r7.k(r8)
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r2) goto L58
            r1 = r4
            goto L59
        L58:
            r1 = r5
        L59:
            java.lang.Object r3 = r9.P()
            i0.e r6 = i0.l.f5952a
            if (r1 != 0) goto L63
            if (r3 != r6) goto L70
        L63:
            i.a1 r1 = new i.a1
            r3 = 0
            r1.<init>(r7, r3)
            i0.x r3 = i0.r.p(r1)
            r9.k0(r3)
        L70:
            i0.l2 r3 = (i0.l2) r3
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lb8
            r1 = 466470356(0x1bcdc5d4, float:3.4042249E-22)
            r9.a0(r1)
            java.lang.Object r1 = r9.P()
            if (r1 != r6) goto L91
            qg.t r1 = i0.r.n(r9)
            r9.k0(r1)
        L91:
            qg.t r1 = (qg.t) r1
            boolean r3 = r9.h(r1)
            if (r0 != r2) goto L9a
            goto L9b
        L9a:
            r4 = r5
        L9b:
            r0 = r3 | r4
            java.lang.Object r2 = r9.P()
            if (r0 != 0) goto La5
            if (r2 != r6) goto Laf
        La5:
            c9.i r2 = new c9.i
            r0 = 15
            r2.<init>(r1, r0, r7)
            r9.k0(r2)
        Laf:
            fg.l r2 = (fg.l) r2
            i0.r.d(r1, r7, r2, r9)
            r9.p(r5)
            goto Lc1
        Lb8:
            r0 = 467712929(0x1be0bba1, float:3.7178944E-22)
            r9.a0(r0)
            r9.p(r5)
        Lc1:
            r9.p(r5)
            goto Ld2
        Lc5:
            r0 = 467722849(0x1be0e261, float:3.7203985E-22)
            r9.a0(r0)
            r9.p(r5)
            goto Ld2
        Lcf:
            r9.V()
        Ld2:
            i0.r1 r9 = r9.t()
            if (r9 == 0) goto Le0
            i.b1 r0 = new i.b1
            r1 = 0
            r0.<init>(r7, r8, r10, r1)
            r9.f6035d = r0
        Le0:
            return
    }

    public final long b() {
            r8 = this;
            w0.p r0 = r8.f5715i
            int r1 = r0.size()
            r2 = 0
            r4 = 0
            r5 = r4
        La:
            if (r5 >= r1) goto L1f
            java.lang.Object r6 = r0.get(r5)
            i.g1 r6 = (i.g1) r6
            i0.h1 r6 = r6.f5675p
            long r6 = r6.g()
            long r2 = java.lang.Math.max(r2, r6)
            int r5 = r5 + 1
            goto La
        L1f:
            w0.p r0 = r8.f5716j
            int r1 = r0.size()
        L25:
            if (r4 >= r1) goto L38
            java.lang.Object r5 = r0.get(r4)
            i.k1 r5 = (i.k1) r5
            long r5 = r5.b()
            long r2 = java.lang.Math.max(r2, r5)
            int r4 = r4 + 1
            goto L25
        L38:
            return r2
    }

    public final java.lang.Object c() {
            r1 = this;
            b.e r0 = r1.f5707a
            java.lang.Object r0 = r0.f333i
            i0.j1 r0 = (i0.j1) r0
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public final boolean d() {
            r5 = this;
            w0.p r0 = r5.f5715i
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L16
            java.lang.Object r4 = r0.get(r3)
            i.g1 r4 = (i.g1) r4
            r4.getClass()
            int r3 = r3 + 1
            goto L8
        L16:
            w0.p r0 = r5.f5716j
            int r1 = r0.size()
            r3 = r2
        L1d:
            if (r3 >= r1) goto L30
            java.lang.Object r4 = r0.get(r3)
            i.k1 r4 = (i.k1) r4
            boolean r4 = r4.d()
            if (r4 == 0) goto L2d
            r0 = 1
            return r0
        L2d:
            int r3 = r3 + 1
            goto L1d
        L30:
            return r2
    }

    public final long e() {
            r2 = this;
            i.k1 r0 = r2.f5708b
            if (r0 == 0) goto L9
            long r0 = r0.e()
            return r0
        L9:
            i0.h1 r0 = r2.f5712f
            long r0 = r0.g()
            return r0
    }

    public final i.e1 f() {
            r1 = this;
            i0.j1 r0 = r1.f5711e
            java.lang.Object r0 = r0.getValue()
            i.e1 r0 = (i.e1) r0
            return r0
    }

    public final boolean g() {
            r1 = this;
            i0.j1 r0 = r1.f5717k
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final void h(long r12, boolean r14) {
            r11 = this;
            b.e r0 = r11.f5707a
            java.lang.Object r1 = r0.f332h
            i0.j1 r1 = (i0.j1) r1
            i0.h1 r2 = r11.f5713g
            long r3 = r2.g()
            r5 = -9223372036854775808
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1f
            r2.h(r12)
            java.lang.Object r0 = r0.f332h
            i0.j1 r0 = (i0.j1) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            goto L30
        L1f:
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L30
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
        L30:
            i0.j1 r0 = r11.f5714h
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            w0.p r0 = r11.f5715i
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            r4 = r2
        L40:
            if (r4 >= r1) goto L9a
            java.lang.Object r5 = r0.get(r4)
            i.g1 r5 = (i.g1) r5
            i0.j1 r6 = r5.f5670k
            i0.j1 r7 = r5.f5670k
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L8a
            if (r14 == 0) goto L63
            i.z0 r6 = r5.a()
            long r8 = r6.b()
            goto L64
        L63:
            r8 = r12
        L64:
            i.z0 r6 = r5.a()
            java.lang.Object r6 = r6.f(r8)
            i0.j1 r10 = r5.f5673n
            r10.setValue(r6)
            i.z0 r6 = r5.a()
            i.q r6 = r6.d(r8)
            r5.f5674o = r6
            i.z0 r5 = r5.a()
            boolean r5 = r5.e(r8)
            if (r5 == 0) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r7.setValue(r5)
        L8a:
            java.lang.Object r5 = r7.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L97
            r3 = r2
        L97:
            int r4 = r4 + 1
            goto L40
        L9a:
            w0.p r0 = r11.f5716j
            int r1 = r0.size()
            r4 = r2
        La1:
            if (r4 >= r1) goto Ld0
            java.lang.Object r5 = r0.get(r4)
            i.k1 r5 = (i.k1) r5
            i0.j1 r6 = r5.f5710d
            java.lang.Object r6 = r6.getValue()
            java.lang.Object r7 = r5.c()
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto Lbc
            r5.h(r12, r14)
        Lbc:
            i0.j1 r6 = r5.f5710d
            java.lang.Object r6 = r6.getValue()
            java.lang.Object r5 = r5.c()
            boolean r5 = gg.l.a(r6, r5)
            if (r5 != 0) goto Lcd
            r3 = r2
        Lcd:
            int r4 = r4 + 1
            goto La1
        Ld0:
            if (r3 == 0) goto Ld5
            r11.i()
        Ld5:
            return
    }

    public final void i() {
            r4 = this;
            r0 = -9223372036854775808
            i0.h1 r2 = r4.f5713g
            r2.h(r0)
            i0.j1 r0 = r4.f5710d
            java.lang.Object r0 = r0.getValue()
            b.e r1 = r4.f5707a
            java.lang.Object r2 = r1.f333i
            i0.j1 r2 = (i0.j1) r2
            r2.setValue(r0)
            i.k1 r0 = r4.f5708b
            if (r0 != 0) goto L21
            i0.h1 r0 = r4.f5712f
            r2 = 0
            r0.h(r2)
        L21:
            java.lang.Object r0 = r1.f332h
            i0.j1 r0 = (i0.j1) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            w0.p r0 = r4.f5716j
            int r1 = r0.size()
            r2 = 0
        L31:
            if (r2 >= r1) goto L3f
            java.lang.Object r3 = r0.get(r2)
            i.k1 r3 = (i.k1) r3
            r3.i()
            int r2 = r2 + 1
            goto L31
        L3f:
            return
    }

    public final void j(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            r0 = -9223372036854775808
            i0.h1 r2 = r5.f5713g
            r2.h(r0)
            b.e r0 = r5.f5707a
            java.lang.Object r1 = r0.f332h
            i0.j1 r1 = (i0.j1) r1
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            boolean r1 = r5.g()
            i0.j1 r2 = r5.f5710d
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r5.c()
            boolean r1 = gg.l.a(r1, r6)
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.getValue()
            boolean r1 = gg.l.a(r1, r7)
            if (r1 != 0) goto L53
        L2e:
            java.lang.Object r1 = r5.c()
            boolean r1 = gg.l.a(r1, r6)
            if (r1 != 0) goto L3f
            java.lang.Object r0 = r0.f333i
            i0.j1 r0 = (i0.j1) r0
            r0.setValue(r6)
        L3f:
            r2.setValue(r7)
            i0.j1 r0 = r5.f5717k
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            i.f1 r0 = new i.f1
            r0.<init>(r6, r7)
            i0.j1 r6 = r5.f5711e
            r6.setValue(r0)
        L53:
            w0.p r6 = r5.f5716j
            int r7 = r6.size()
            r0 = 0
            r1 = r0
        L5b:
            if (r1 >= r7) goto L7c
            java.lang.Object r2 = r6.get(r1)
            i.k1 r2 = (i.k1) r2
            r2.getClass()
            boolean r3 = r2.g()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r2.c()
            i0.j1 r4 = r2.f5710d
            java.lang.Object r4 = r4.getValue()
            r2.j(r3, r4)
        L79:
            int r1 = r1 + 1
            goto L5b
        L7c:
            w0.p r6 = r5.f5715i
            int r7 = r6.size()
        L82:
            if (r0 >= r7) goto L90
            java.lang.Object r1 = r6.get(r0)
            i.g1 r1 = (i.g1) r1
            r1.d()
            int r0 = r0 + 1
            goto L82
        L90:
            return
    }

    public final void k(java.lang.Object r5) {
            r4 = this;
            i0.j1 r0 = r4.f5710d
            java.lang.Object r1 = r0.getValue()
            boolean r1 = gg.l.a(r1, r5)
            if (r1 != 0) goto L65
            i.f1 r1 = new i.f1
            java.lang.Object r2 = r0.getValue()
            r1.<init>(r2, r5)
            i0.j1 r2 = r4.f5711e
            r2.setValue(r1)
            java.lang.Object r1 = r4.c()
            java.lang.Object r2 = r0.getValue()
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L35
            java.lang.Object r1 = r0.getValue()
            b.e r2 = r4.f5707a
            java.lang.Object r2 = r2.f333i
            i0.j1 r2 = (i0.j1) r2
            r2.setValue(r1)
        L35:
            r0.setValue(r5)
            i0.h1 r5 = r4.f5713g
            long r0 = r5.g()
            r2 = -9223372036854775808
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L45
            goto L4c
        L45:
            i0.j1 r5 = r4.f5714h
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.setValue(r0)
        L4c:
            w0.p r5 = r4.f5715i
            int r0 = r5.size()
            r1 = 0
        L53:
            if (r1 >= r0) goto L65
            java.lang.Object r2 = r5.get(r1)
            i.g1 r2 = (i.g1) r2
            r3 = -1073741824(0xffffffffc0000000, float:-2.0)
            i0.f1 r2 = r2.f5671l
            r2.h(r3)
            int r1 = r1 + 1
            goto L53
        L65:
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            w0.p r0 = r6.f5715i
            int r1 = r0.size()
            java.lang.String r2 = "Transition animation values: "
            r3 = 0
        L9:
            if (r3 >= r1) goto L28
            java.lang.Object r4 = r0.get(r3)
            i.g1 r4 = (i.g1) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = ", "
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            int r3 = r3 + 1
            goto L9
        L28:
            return r2
    }
}
