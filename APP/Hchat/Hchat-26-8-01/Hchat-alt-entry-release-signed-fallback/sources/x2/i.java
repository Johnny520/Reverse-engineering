package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uf.d f21143a = null;

    static {
            uf.d r0 = new uf.d
            r1 = 6
            r0.<init>(r1)
            x2.i.f21143a = r0
            return
    }

    public static final void a(fg.l r22, y0.o r23, fg.l r24, i0.h0 r25, int r26) {
            r1 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            x2.b r11 = x2.b.f21106k
            r0 = -180024211(0xfffffffff5450c6d, float:-2.497887E32)
            r9.b0(r0)
            r0 = r10 & 6
            if (r0 != 0) goto L21
            boolean r0 = r9.h(r1)
            if (r0 == 0) goto L1e
            r0 = 4
            goto L1f
        L1e:
            r0 = 2
        L1f:
            r0 = r0 | r10
            goto L22
        L21:
            r0 = r10
        L22:
            r2 = r10 & 48
            if (r2 != 0) goto L32
            boolean r2 = r9.f(r7)
            if (r2 == 0) goto L2f
            r2 = 32
            goto L31
        L2f:
            r2 = 16
        L31:
            r0 = r0 | r2
        L32:
            r0 = r0 | 384(0x180, float:5.38E-43)
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L44
            boolean r2 = r9.h(r11)
            if (r2 == 0) goto L41
            r2 = 2048(0x800, float:2.87E-42)
            goto L43
        L41:
            r2 = 1024(0x400, float:1.435E-42)
        L43:
            r0 = r0 | r2
        L44:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L54
            boolean r2 = r9.h(r8)
            if (r2 == 0) goto L51
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L53
        L51:
            r2 = 8192(0x2000, float:1.148E-41)
        L53:
            r0 = r0 | r2
        L54:
            r2 = r0 & 9363(0x2493, float:1.312E-41)
            r3 = 9362(0x2492, float:1.3119E-41)
            if (r2 == r3) goto L5c
            r2 = 1
            goto L5d
        L5c:
            r2 = 0
        L5d:
            r3 = r0 & 1
            boolean r2 = r9.S(r3, r2)
            if (r2 == 0) goto L18c
            long r2 = r9.T
            int r14 = java.lang.Long.hashCode(r2)
            x2.o r2 = x2.o.f21166a
            y0.o r2 = r7.d(r2)
            d1.a0 r3 = d1.a0.f1898a
            y0.o r2 = r2.d(r3)
            x2.t r3 = x2.t.f21175a
            y0.o r2 = r2.d(r3)
            x2.r r3 = x2.r.f21172a
            y0.o r2 = r2.d(r3)
            y0.o r15 = y0.a.c(r9, r2)
            i0.m2 r2 = y1.h1.f21946h
            java.lang.Object r2 = r9.j(r2)
            u2.c r2 = (u2.c) r2
            i0.m2 r3 = y1.h1.f21952n
            java.lang.Object r3 = r9.j(r3)
            u2.m r3 = (u2.m) r3
            s0.h r4 = r9.l()
            i0.p1 r5 = o3.a.f9501a
            java.lang.Object r5 = r9.j(r5)
            androidx.lifecycle.q r5 = (androidx.lifecycle.q) r5
            i0.p1 r6 = v3.a.f14063a
            java.lang.Object r6 = r9.j(r6)
            u3.c r6 = (u3.c) r6
            r12 = 1314774735(0x4e5ddecf, float:9.305917E8)
            r9.a0(r12)
            r0 = r0 & 14
            r16 = r14
            long r13 = r9.T
            int r13 = java.lang.Long.hashCode(r13)
            i0.m2 r14 = y1.i0.f21966b
            java.lang.Object r14 = r9.j(r14)
            android.content.Context r14 = (android.content.Context) r14
            r17 = r3
            i0.f0 r3 = i0.r.x(r9)
            i0.m2 r12 = v0.h.f13882a
            java.lang.Object r12 = r9.j(r12)
            v0.f r12 = (v0.f) r12
            r18 = r0
            i0.m2 r0 = y1.i0.f21970f
            java.lang.Object r0 = r9.j(r0)
            android.view.View r0 = (android.view.View) r0
            boolean r19 = r9.h(r14)
            r20 = r18 & 14
            r21 = r2
            r2 = r20 ^ 6
            r20 = r4
            r4 = 4
            if (r2 <= r4) goto Lf0
            boolean r2 = r9.f(r1)
            if (r2 != 0) goto Lf4
        Lf0:
            r2 = r18 & 6
            if (r2 != r4) goto Lf6
        Lf4:
            r2 = 1
            goto Lf7
        Lf6:
            r2 = 0
        Lf7:
            r2 = r19 | r2
            boolean r4 = r9.h(r3)
            r2 = r2 | r4
            boolean r4 = r9.h(r12)
            r2 = r2 | r4
            boolean r4 = r9.d(r13)
            r2 = r2 | r4
            boolean r4 = r9.h(r0)
            r2 = r2 | r4
            java.lang.Object r4 = r9.P()
            if (r2 != 0) goto L117
            i0.e r2 = i0.l.f5952a
            if (r4 != r2) goto L11a
        L117:
            r2 = r6
            r6 = r0
            goto L121
        L11a:
            r12 = r5
            r7 = r6
            r14 = r17
            r13 = r21
            goto L134
        L121:
            x2.l r0 = new x2.l
            r7 = r2
            r4 = r12
            r2 = r1
            r12 = r5
            r5 = r13
            r1 = r14
            r14 = r17
            r13 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.k0(r0)
            r4 = r0
        L134:
            fg.a r4 = (fg.a) r4
            r0 = 125(0x7d, float:1.75E-43)
            r1 = 0
            r2 = 1
            r9.W(r0, r1, r1, r2)
            r9.f5911r = r2
            r5 = r12
            r0 = r20
            boolean r1 = r9.S
            if (r1 == 0) goto L14a
            r9.k(r4)
            goto L14d
        L14a:
            r9.n0()
        L14d:
            x1.f r1 = x1.g.f20914f
            r1.getClass()
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r9, r0)
            x2.k r0 = x2.k.f21151j
            i0.r.A(r0, r9, r15)
            x2.k r0 = x2.k.f21152k
            i0.r.A(r0, r9, r13)
            x2.k r0 = x2.k.f21153l
            i0.r.A(r0, r9, r5)
            x2.k r0 = x2.k.f21154m
            i0.r.A(r0, r9, r7)
            x2.k r0 = x2.k.f21155n
            i0.r.A(r0, r9, r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r9, r0)
            x2.k r0 = x2.k.f21149h
            i0.r.A(r0, r9, r8)
            x2.k r0 = x2.k.f21150i
            i0.r.A(r0, r9, r11)
            r12 = 1
            r9.p(r12)
            r0 = 0
            r9.p(r0)
            goto L18f
        L18c:
            r9.V()
        L18f:
            i0.r1 r6 = r9.t()
            if (r6 == 0) goto L1a3
            v1.g1 r0 = new v1.g1
            r5 = 1
            r1 = r22
            r2 = r23
            r3 = r8
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L1a3:
            return
    }

    public static final void b(fg.l r7, y0.o r8, fg.l r9, i0.h0 r10, int r11, int r12) {
            x2.b r0 = x2.b.f21106k
            r1 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            r10.b0(r1)
            r1 = r11 & 6
            if (r1 != 0) goto L17
            boolean r1 = r10.h(r7)
            if (r1 == 0) goto L14
            r1 = 4
            goto L15
        L14:
            r1 = 2
        L15:
            r1 = r1 | r11
            goto L18
        L17:
            r1 = r11
        L18:
            r2 = r11 & 48
            if (r2 != 0) goto L28
            boolean r2 = r10.f(r8)
            if (r2 == 0) goto L25
            r2 = 32
            goto L27
        L25:
            r2 = 16
        L27:
            r1 = r1 | r2
        L28:
            r2 = r12 & 4
            if (r2 == 0) goto L2f
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L3b
        L2f:
            boolean r3 = r10.h(r9)
            if (r3 == 0) goto L38
            r3 = 256(0x100, float:3.59E-43)
            goto L3a
        L38:
            r3 = 128(0x80, float:1.8E-43)
        L3a:
            r1 = r1 | r3
        L3b:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 == r4) goto L43
            r3 = 1
            goto L44
        L43:
            r3 = 0
        L44:
            r4 = r1 & 1
            boolean r3 = r10.S(r4, r3)
            if (r3 == 0) goto L62
            if (r2 == 0) goto L4f
            r9 = r0
        L4f:
            r0 = r1 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            int r1 = r1 << 6
            r1 = r1 & r2
            r0 = r0 | r1
            a(r7, r8, r9, r10, r0)
        L60:
            r4 = r9
            goto L66
        L62:
            r10.V()
            goto L60
        L66:
            i0.r1 r9 = r10.t()
            if (r9 == 0) goto L77
            x2.j r1 = new x2.j
            r2 = r7
            r3 = r8
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r9.f6035d = r1
        L77:
            return
    }

    public static final android.view.View c(y0.n r0) {
            y0.n r0 = r0.f21819g
            x1.f0 r0 = x1.k.w(r0)
            x2.v r0 = r0.f20903u
            if (r0 == 0) goto Lf
            android.view.View r0 = r0.getInteropView()
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L13
            return r0
        L13:
            java.lang.String r0 = "Could not fetch interop view"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public static final void d(x2.v r4, x1.f0 r5) {
            x1.b1 r5 = r5.L
            x1.r r5 = r5.f20841c
            r0 = 0
            long r0 = r5.m0(r0)
            r5 = 32
            long r2 = r0 >> r5
            int r5 = (int) r2
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r5 = java.lang.Math.round(r5)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Math.round(r0)
            int r1 = r4.getMeasuredWidth()
            int r1 = r1 + r5
            int r2 = r4.getMeasuredHeight()
            int r2 = r2 + r0
            r4.layout(r5, r0, r1, r2)
            return
    }

    public static final x2.v e(x1.f0 r0) {
            x2.v r0 = r0.f20903u
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Required value was null."
            af.d r0 = wb.en.a(r0)
            throw r0
    }
}
