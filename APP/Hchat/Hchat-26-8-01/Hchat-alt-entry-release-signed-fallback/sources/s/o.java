package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.t[] f12051a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b8.c f12052b = null;

    static {
            r0 = 0
            s.t[] r0 = new s.t[r0]
            s.o.f12051a = r0
            b8.c r0 = new b8.c
            r1 = 10
            r0.<init>(r1)
            s.o.f12052b = r0
            return
    }

    public static final void a(fg.a r6, y0.o r7, s.m0 r8, r.o r9, i0.h0 r10, int r11) {
            r0 = 1055276397(0x3ee63d6d, float:0.4496874)
            r10.b0(r0)
            boolean r0 = r10.h(r6)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r11
            boolean r1 = r10.f(r7)
            if (r1 == 0) goto L19
            r1 = 32
            goto L1b
        L19:
            r1 = 16
        L1b:
            r0 = r0 | r1
            boolean r1 = r10.f(r8)
            if (r1 == 0) goto L25
            r1 = 256(0x100, float:3.59E-43)
            goto L27
        L25:
            r1 = 128(0x80, float:1.8E-43)
        L27:
            r0 = r0 | r1
            boolean r1 = r10.f(r9)
            if (r1 == 0) goto L31
            r1 = 2048(0x800, float:2.87E-42)
            goto L33
        L31:
            r1 = 1024(0x400, float:1.435E-42)
        L33:
            r0 = r0 | r1
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            r3 = 1
            if (r1 == r2) goto L3d
            r1 = r3
            goto L3e
        L3d:
            r1 = 0
        L3e:
            r0 = r0 & r3
            boolean r0 = r10.S(r0, r1)
            if (r0 == 0) goto L5a
            i0.a1 r0 = i0.r.y(r6, r10)
            s.c0 r1 = new s.c0
            r1.<init>(r8, r7, r9, r0)
            r0 = -933153643(0xffffffffc8613495, float:-230610.33)
            s0.d r0 = s0.i.e(r0, r1, r10)
            r1 = 6
            c(r0, r10, r1)
            goto L5d
        L5a:
            r10.V()
        L5d:
            i0.r1 r10 = r10.t()
            if (r10 == 0) goto L6f
            s.d0 r0 = new s.d0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.f6035d = r0
        L6f:
            return
    }

    public static final void b(java.lang.Object r17, int r18, s.j0 r19, s0.d r20, i0.h0 r21, int r22) {
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r0 = r21
            r5 = r22
            r6 = 872548579(0x340208e3, float:1.2110426E-7)
            r0.b0(r6)
            r6 = r5 & 6
            if (r6 != 0) goto L21
            boolean r6 = r0.h(r1)
            if (r6 == 0) goto L1e
            r6 = 4
            goto L1f
        L1e:
            r6 = 2
        L1f:
            r6 = r6 | r5
            goto L22
        L21:
            r6 = r5
        L22:
            r7 = r5 & 48
            if (r7 != 0) goto L32
            boolean r7 = r0.d(r2)
            if (r7 == 0) goto L2f
            r7 = 32
            goto L31
        L2f:
            r7 = 16
        L31:
            r6 = r6 | r7
        L32:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L42
            boolean r7 = r0.h(r3)
            if (r7 == 0) goto L3f
            r7 = 256(0x100, float:3.59E-43)
            goto L41
        L3f:
            r7 = 128(0x80, float:1.8E-43)
        L41:
            r6 = r6 | r7
        L42:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L52
            boolean r7 = r0.h(r4)
            if (r7 == 0) goto L4f
            r7 = 2048(0x800, float:2.87E-42)
            goto L51
        L4f:
            r7 = 1024(0x400, float:1.435E-42)
        L51:
            r6 = r6 | r7
        L52:
            r7 = r6 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 == r8) goto L5a
            r7 = 1
            goto L5b
        L5a:
            r7 = 0
        L5b:
            r8 = r6 & 1
            boolean r7 = r0.S(r8, r7)
            if (r7 == 0) goto Lf0
            boolean r7 = r0.f(r1)
            boolean r8 = r0.f(r3)
            r7 = r7 | r8
            java.lang.Object r8 = r0.P()
            i0.e r9 = i0.l.f5952a
            if (r7 != 0) goto L76
            if (r8 != r9) goto L7e
        L76:
            s.h0 r8 = new s.h0
            r8.<init>(r1, r3)
            r0.k0(r8)
        L7e:
            s.h0 r8 = (s.h0) r8
            r8.f12020c = r2
            i0.j1 r7 = r8.f12024g
            i0.u r10 = v1.z0.f14057a
            java.lang.Object r11 = r0.j(r10)
            s.h0 r11 = (s.h0) r11
            w0.f r12 = w0.q.e()
            if (r12 == 0) goto L97
            fg.l r14 = r12.e()
            goto L98
        L97:
            r14 = 0
        L98:
            w0.f r15 = w0.q.h(r12)
            java.lang.Object r16 = r7.getValue()     // Catch: java.lang.Throwable -> Lb5
            r13 = r16
            s.h0 r13 = (s.h0) r13     // Catch: java.lang.Throwable -> Lb5
            if (r11 == r13) goto Lc0
            r7.setValue(r11)     // Catch: java.lang.Throwable -> Lb5
            int r7 = r8.f12021d     // Catch: java.lang.Throwable -> Lb5
            if (r7 <= 0) goto Lc0
            s.h0 r7 = r8.f12022e     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto Lb7
            r7.b()     // Catch: java.lang.Throwable -> Lb5
            goto Lb7
        Lb5:
            r0 = move-exception
            goto Lec
        Lb7:
            if (r11 == 0) goto Lbd
            r11.a()     // Catch: java.lang.Throwable -> Lb5
            goto Lbe
        Lbd:
            r11 = 0
        Lbe:
            r8.f12022e = r11     // Catch: java.lang.Throwable -> Lb5
        Lc0:
            w0.q.k(r12, r15, r14)
            boolean r7 = r0.f(r8)
            java.lang.Object r11 = r0.P()
            if (r7 != 0) goto Lcf
            if (r11 != r9) goto Ld8
        Lcf:
            nb.a r11 = new nb.a
            r7 = 7
            r11.<init>(r8, r7)
            r0.k0(r11)
        Ld8:
            fg.l r11 = (fg.l) r11
            i0.r.c(r8, r11, r0)
            i0.q1 r7 = r10.a(r8)
            int r6 = r6 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r8 = 8
            r6 = r6 | r8
            i0.r.a(r7, r4, r0, r6)
            goto Lf3
        Lec:
            w0.q.k(r12, r15, r14)
            throw r0
        Lf0:
            r0.V()
        Lf3:
            i0.r1 r6 = r0.t()
            if (r6 == 0) goto L100
            s.i0 r0 = new s.i0
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L100:
            return
    }

    public static final void c(s0.d r10, i0.h0 r11, int r12) {
            r0 = -709502251(0xffffffffd5b5dad5, float:-2.4993935E13)
            r11.b0(r0)
            r0 = r12 & 3
            r1 = 2
            r2 = 0
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = r2
        Lf:
            r1 = r12 & 1
            boolean r0 = r11.S(r1, r0)
            if (r0 == 0) goto La4
            i0.m2 r0 = v0.h.f13882a
            java.lang.Object r1 = r11.j(r0)
            v0.f r1 = (v0.f) r1
            r3 = 1967007413(0x753e26b5, float:2.4104528E32)
            r11.a0(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r4 = r11.P()
            i0.e r5 = i0.l.f5952a
            if (r4 != r5) goto L39
            k.s1 r4 = new k.s1
            r6 = 14
            r4.<init>(r6)
            r11.k0(r4)
        L39:
            fg.a r4 = (fg.a) r4
            r6 = 384(0x180, float:5.38E-43)
            p4.t r7 = v0.d.f13874k
            java.lang.Object r3 = v0.k.e(r3, r7, r4, r11, r6)
            v0.d r3 = (v0.d) r3
            java.lang.Object r4 = r11.j(r0)
            v0.f r4 = (v0.f) r4
            r3.f13877i = r4
            r11.p(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            i2.y r6 = new i2.y
            r7 = 15
            r6.<init>(r7)
            m.b r7 = new m.b
            r8 = 14
            r7.<init>(r1, r8, r3)
            p4.t r8 = new p4.t
            r9 = 12
            r8.<init>(r6, r9, r7)
            boolean r6 = r11.h(r1)
            boolean r7 = r11.h(r3)
            r6 = r6 | r7
            java.lang.Object r7 = r11.P()
            if (r6 != 0) goto L7a
            if (r7 != r5) goto L84
        L7a:
            aa.c r7 = new aa.c
            r5 = 28
            r7.<init>(r1, r5, r3)
            r11.k0(r7)
        L84:
            fg.a r7 = (fg.a) r7
            java.lang.Object r1 = v0.k.e(r4, r8, r7, r11, r2)
            s.x0 r1 = (s.x0) r1
            i0.q1 r0 = r0.a(r1)
            b0.q r2 = new b0.q
            r3 = 12
            r2.<init>(r10, r3, r1)
            r1 = -412824043(0xffffffffe764ce15, float:-1.0805011E24)
            s0.d r1 = s0.i.e(r1, r2, r11)
            r2 = 56
            i0.r.a(r0, r1, r11, r2)
            goto La7
        La4:
            r11.V()
        La7:
            i0.r1 r11 = r11.t()
            if (r11 == 0) goto Lb5
            bi.i r0 = new bi.i
            r1 = 1
            r0.<init>(r10, r12, r1)
            r11.f6035d = r0
        Lb5:
            return
    }

    public static final void d(r.k r7, java.lang.Object r8, int r9, java.lang.Object r10, i0.h0 r11, int r12) {
            r0 = 1439843069(0x55d242fd, float:2.8898144E13)
            r11.b0(r0)
            boolean r0 = r11.f(r7)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r12
            boolean r1 = r11.f(r8)
            if (r1 == 0) goto L19
            r1 = 32
            goto L1b
        L19:
            r1 = 16
        L1b:
            r0 = r0 | r1
            boolean r1 = r11.d(r9)
            if (r1 == 0) goto L25
            r1 = 256(0x100, float:3.59E-43)
            goto L27
        L25:
            r1 = 128(0x80, float:1.8E-43)
        L27:
            r0 = r0 | r1
            boolean r1 = r11.f(r10)
            if (r1 == 0) goto L31
            r1 = 2048(0x800, float:2.87E-42)
            goto L33
        L31:
            r1 = 1024(0x400, float:1.435E-42)
        L33:
            r0 = r0 | r1
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            r3 = 1
            if (r1 == r2) goto L3d
            r1 = r3
            goto L3e
        L3d:
            r1 = 0
        L3e:
            r0 = r0 & r3
            boolean r0 = r11.S(r0, r1)
            if (r0 == 0) goto L5a
            r0 = r8
            v0.c r0 = (v0.c) r0
            r.j r1 = new r.j
            r1.<init>(r9, r10, r7)
            r2 = 980966366(0x3a785bde, float:9.4741385E-4)
            s0.d r1 = s0.i.e(r2, r1, r11)
            r2 = 48
            r0.b(r10, r1, r11, r2)
            goto L5d
        L5a:
            r11.V()
        L5d:
            i0.r1 r11 = r11.t()
            if (r11 == 0) goto L70
            b0.r r0 = new b0.r
            r6 = 6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f6035d = r0
        L70:
            return
    }

    public static final int e(int r5, j0.b r6) {
            int r0 = r6.f6673i
            int r0 = r0 + (-1)
            r1 = 0
        L5:
            if (r1 >= r0) goto L27
            int r2 = r0 - r1
            int r2 = r2 / 2
            int r2 = r2 + r1
            java.lang.Object[] r3 = r6.f6671g
            r4 = r3[r2]
            s.i r4 = (s.i) r4
            int r4 = r4.f12025a
            if (r4 != r5) goto L17
            goto L23
        L17:
            if (r4 >= r5) goto L24
            int r1 = r2 + 1
            r3 = r3[r1]
            s.i r3 = (s.i) r3
            int r3 = r3.f12025a
            if (r5 >= r3) goto L5
        L23:
            return r2
        L24:
            int r0 = r2 + (-1)
            goto L5
        L27:
            return r1
    }

    public static final int f(int r1, java.lang.Object r2, r.k r3) {
            if (r2 == 0) goto L24
            int r0 = r3.c()
            if (r0 != 0) goto L9
            goto L24
        L9:
            int r0 = r3.c()
            if (r1 >= r0) goto L1a
            java.lang.Object r0 = r3.d(r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1a
            goto L24
        L1a:
            ac.k r3 = r3.f11177d
            int r2 = r3.o(r2)
            r3 = -1
            if (r2 == r3) goto L24
            return r2
        L24:
            return r1
    }

    public static final y0.o g(r.g r1, m.c r2, m.p1 r3) {
            s.n r0 = new s.n
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static final y0.o h(y0.o r1, r.l r2, r.f r3, m.p1 r4, boolean r5) {
            s.s0 r0 = new s.s0
            r0.<init>(r2, r3, r4, r5)
            y0.o r1 = r1.d(r0)
            return r1
    }
}
