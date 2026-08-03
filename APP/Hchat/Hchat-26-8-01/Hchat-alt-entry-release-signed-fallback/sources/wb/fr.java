package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class fr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb.fr f16252a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.os.Handler f16253b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.WeakHashMap f16254c = null;

    static {
            wb.fr r0 = new wb.fr
            r0.<init>()
            wb.fr.f16252a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            wb.fr.f16253b = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            wb.fr.f16254c = r0
            return
    }

    public static void c(android.view.View r4, android.view.ViewGroup r5, android.view.ViewGroup r6, int r7, android.view.ViewGroup.LayoutParams r8, android.graphics.drawable.Drawable r9, android.view.View r10, java.util.ArrayList r11, android.widget.FrameLayout r12, android.widget.FrameLayout r13) {
            android.view.ViewParent r0 = r12.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L12
            r0.removeView(r12)
        L12:
            android.view.ViewParent r12 = r13.getParent()
            boolean r0 = r12 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1d
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            goto L1e
        L1d:
            r12 = r2
        L1e:
            if (r12 == 0) goto L23
            r12.removeView(r13)
        L23:
            wb.e2 r12 = new wb.e2
            r13 = 9
            r12.<init>(r13)
            java.util.List r11 = tf.m.K1(r11, r12)
            java.util.Iterator r11 = r11.iterator()
        L32:
            boolean r12 = r11.hasNext()
            r13 = 0
            if (r12 == 0) goto L62
            java.lang.Object r12 = r11.next()
            wb.br r12 = (wb.br) r12
            android.view.View r0 = r12.f15284a
            android.view.ViewParent r1 = r0.getParent()
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L4c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L4d
        L4c:
            r1 = r2
        L4d:
            if (r1 == 0) goto L52
            r1.removeView(r0)
        L52:
            int r1 = r12.f15285b
            int r3 = r5.getChildCount()
            int r13 = r9.e0.r(r1, r13, r3)
            android.view.ViewGroup$LayoutParams r12 = r12.f15286c
            r5.addView(r0, r13, r12)
            goto L32
        L62:
            android.view.ViewParent r5 = r4.getParent()
            boolean r11 = r5 instanceof android.view.ViewGroup
            if (r11 == 0) goto L6d
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L6e
        L6d:
            r5 = r2
        L6e:
            if (r5 == 0) goto L73
            r5.removeView(r4)
        L73:
            android.view.ViewParent r5 = r10.getParent()
            boolean r11 = r5 instanceof android.view.ViewGroup
            if (r11 == 0) goto L7e
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L7f
        L7e:
            r5 = r2
        L7f:
            if (r5 != r6) goto L97
            int r11 = r6.indexOfChild(r10)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            if (r11 < 0) goto L8d
            r11 = 1
            goto L8e
        L8d:
            r11 = r13
        L8e:
            if (r11 == 0) goto L91
            r2 = r12
        L91:
            if (r2 == 0) goto L97
            int r7 = r2.intValue()
        L97:
            int r11 = r6.getChildCount()
            int r7 = r9.e0.r(r7, r13, r11)
            if (r5 == 0) goto La4
            r5.removeView(r10)
        La4:
            r4.setBackground(r9)
            r6.addView(r4, r7, r8)
            return
    }

    public final void a(android.widget.FrameLayout r20, android.widget.FrameLayout r21, int r22, wb.er r23, i0.h0 r24, int r25) {
            r19 = this;
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r9 = r24
            r0 = 1762765574(0x6911ab06, float:1.1006367E25)
            r9.b0(r0)
            boolean r0 = r9.h(r2)
            if (r0 == 0) goto L18
            r0 = 4
            goto L19
        L18:
            r0 = 2
        L19:
            r0 = r25 | r0
            boolean r1 = r9.h(r3)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r0 = r0 | r1
            boolean r1 = r9.d(r4)
            if (r1 == 0) goto L30
            r1 = 256(0x100, float:3.59E-43)
            goto L32
        L30:
            r1 = 128(0x80, float:1.8E-43)
        L32:
            r0 = r0 | r1
            boolean r1 = r9.f(r5)
            if (r1 == 0) goto L3c
            r1 = 2048(0x800, float:2.87E-42)
            goto L3e
        L3c:
            r1 = 1024(0x400, float:1.435E-42)
        L3e:
            r0 = r0 | r1
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            r12 = 0
            r13 = 1
            if (r1 == r6) goto L49
            r1 = r13
            goto L4a
        L49:
            r1 = r12
        L4a:
            r0 = r0 & r13
            boolean r0 = r9.S(r0, r1)
            if (r0 == 0) goto L150
            i0.m2 r0 = y1.h1.f21946h
            java.lang.Object r0 = r9.j(r0)
            u2.c r0 = (u2.c) r0
            float r0 = r0.i0(r4)
            r1 = 3
            r6 = 0
            th.j r1 = th.c.e(r6, r9, r12, r1)
            p.a0 r14 = p.h1.f9915c
            y0.g r6 = y0.b.f21792g
            v1.n0 r6 = p.o.d(r6, r12)
            long r7 = r9.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r9.l()
            y0.o r10 = y0.a.c(r9, r14)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r15 = x1.f.f20883b
            r9.d0()
            boolean r11 = r9.S
            if (r11 == 0) goto L8b
            r9.k(r15)
            goto L8e
        L8b:
            r9.n0()
        L8e:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r9, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r9, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            x1.e r8 = x1.f.f20887f
            i0.r.A(r8, r9, r7)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r9)
            x1.e r13 = x1.f.f20884c
            i0.r.A(r13, r9, r10)
            boolean r10 = r9.h(r2)
            java.lang.Object r12 = r9.P()
            if (r10 != 0) goto Lb9
            i0.e r10 = i0.l.f5952a
            if (r12 != r10) goto Lc2
        Lb9:
            wb.ar r12 = new wb.ar
            r10 = 0
            r12.<init>(r2, r10)
            r9.k0(r12)
        Lc2:
            fg.l r12 = (fg.l) r12
            r10 = r7
            y0.o r7 = th.c.d(r14, r1)
            r16 = r10
            r10 = 0
            r17 = r11
            r11 = 4
            r18 = r8
            r8 = 0
            r2 = r16
            r16 = r0
            r0 = r6
            r6 = r12
            r12 = r17
            r17 = r1
            r1 = r18
            x2.i.b(r6, r7, r8, r9, r10, r11)
            float r7 = r5.f16008c
            float r10 = r5.f16009d
            r11 = 2
            r8 = 0
            r9 = r7
            r6 = r14
            r14 = r24
            y0.o r6 = p.d.p(r6, r7, r8, r9, r10, r11)
            y0.g r7 = y0.b.f21799n
            r8 = 0
            v1.n0 r7 = p.o.d(r7, r8)
            long r8 = r14.T
            int r8 = java.lang.Long.hashCode(r8)
            s0.h r9 = r14.l()
            y0.o r6 = y0.a.c(r14, r6)
            r14.d0()
            boolean r10 = r14.S
            if (r10 == 0) goto L10f
            r14.k(r15)
            goto L112
        L10f:
            r14.n0()
        L112:
            i0.r.A(r12, r14, r7)
            i0.r.A(r0, r14, r9)
            j8.b.p(r8, r14, r1, r14, r2)
            i0.r.A(r13, r14, r6)
            boolean r7 = r5.f16006a
            r0 = 1065353216(0x3f800000, float:1.0)
            y0.l r1 = y0.l.f21818a
            y0.o r0 = p.h1.d(r1, r0)
            r1 = 8
            float r1 = (float) r1
            float r1 = r16 + r1
            y0.o r8 = p.h1.e(r0, r1)
            f0.h r0 = new f0.h
            r1 = 13
            r0.<init>(r3, r1)
            r1 = 1558922973(0x5ceb46dd, float:5.2979628E17)
            s0.d r9 = s0.i.e(r1, r0, r14)
            r11 = 3072(0xc00, float:4.305E-42)
            r10 = r14
            r6 = r17
            wb.o3.d(r6, r7, r8, r9, r10, r11)
            r9 = r10
            r0 = 1
            r9.p(r0)
            r9.p(r0)
            goto L153
        L150:
            r9.V()
        L153:
            i0.r1 r7 = r9.t()
            if (r7 == 0) goto L166
            s0.c r0 = new s0.c
            r1 = r19
            r2 = r20
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L166:
            return
    }

    public final void b(android.app.Activity r8, s0.d r9, i0.h0 r10, int r11) {
            r7 = this;
            r0 = 1449312867(0x5662c263, float:6.233113E13)
            r10.b0(r0)
            boolean r0 = r10.h(r8)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r11
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0 = r0 & r3
            boolean r0 = r10.S(r0, r1)
            if (r0 == 0) goto L44
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L36
            bi.b r0 = bi.d.a()
            goto L3a
        L36:
            bi.b r0 = bi.d.b()
        L3a:
            r2 = 0
            r5 = 3072(0xc00, float:4.305E-42)
            r1 = 0
            r3 = r9
            r4 = r10
            ig.a.b(r0, r1, r2, r3, r4, r5)
            goto L47
        L44:
            r10.V()
        L47:
            i0.r1 r0 = r10.t()
            if (r0 == 0) goto L5a
            wb.rj r1 = new wb.rj
            r6 = 13
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.f6035d = r1
        L5a:
            return
    }
}
