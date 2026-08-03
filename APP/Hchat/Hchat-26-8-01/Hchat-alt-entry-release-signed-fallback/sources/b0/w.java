package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2.c0 f415a = null;

    static {
            y2.c0 r0 = new y2.c0
            r1 = 30
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto La
            r1 = 0
            goto Lb
        La:
            r1 = r2
        Lb:
            y2.d0 r3 = y2.d0.f22212g
            r0.<init>(r1, r3, r2)
            b0.w.f415a = r0
            return
    }

    public static final void a(z.g r8, z.c r9, i0.h0 r10, int r11) {
            r0 = 1904307118(0x71816bae, float:1.2817198E30)
            r10.b0(r0)
            boolean r0 = r10.f(r8)
            r1 = 4
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 2
        L10:
            r0 = r0 | r11
            boolean r2 = r10.h(r9)
            if (r2 == 0) goto L1a
            r2 = 32
            goto L1c
        L1a:
            r2 = 16
        L1c:
            r0 = r0 | r2
            r2 = r0 & 19
            r3 = 18
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L27
            r2 = r4
            goto L28
        L27:
            r2 = r5
        L28:
            r3 = r0 & 1
            boolean r2 = r10.S(r3, r2)
            if (r2 == 0) goto L81
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L48
            r2 = -1009482584(0xffffffffc3d484a8, float:-425.03638)
            r10.a0(r2)
            i0.m2 r2 = y1.i0.f21966b
            java.lang.Object r2 = r10.j(r2)
            android.content.Context r2 = (android.content.Context) r2
            r10.p(r5)
            goto L52
        L48:
            r2 = -1009433480(0xffffffffc3d54478, float:-426.5349)
            r10.a0(r2)
            r10.p(r5)
            r2 = 0
        L52:
            boolean r3 = r10.h(r9)
            r0 = r0 & 14
            if (r0 == r1) goto L5b
            r4 = r5
        L5b:
            r0 = r3 | r4
            boolean r1 = r10.h(r2)
            r0 = r0 | r1
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L6c
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L75
        L6c:
            b0.s r1 = new b0.s
            r0 = 0
            r1.<init>(r9, r2, r8, r0)
            r10.k0(r1)
        L75:
            r4 = r1
            fg.l r4 = (fg.l) r4
            r6 = 0
            r7 = 3
            r2 = 0
            r3 = 0
            r5 = r10
            l.i.b(r2, r3, r4, r5, r6, r7)
            goto L85
        L81:
            r5 = r10
            r5.V()
        L85:
            i0.r1 r10 = r5.t()
            if (r10 == 0) goto L92
            b0.q r0 = new b0.q
            r0.<init>(r8, r9, r11)
            r10.f6035d = r0
        L92:
            return
    }

    public static final void b(int r17, long r18, i0.h0 r20, int r21) {
            r3 = r18
            r0 = r20
            r1 = -1240244237(0xffffffffb6135ff3, float:-2.1960557E-6)
            r0.b0(r1)
            r1 = r21 & 6
            r2 = 4
            if (r1 != 0) goto L1d
            r1 = r17
            boolean r5 = r0.d(r1)
            if (r5 == 0) goto L19
            r5 = r2
            goto L1a
        L19:
            r5 = 2
        L1a:
            r5 = r21 | r5
            goto L21
        L1d:
            r1 = r17
            r5 = r21
        L21:
            r6 = r21 & 48
            r7 = 32
            if (r6 != 0) goto L32
            boolean r6 = r0.e(r3)
            if (r6 == 0) goto L2f
            r6 = r7
            goto L31
        L2f:
            r6 = 16
        L31:
            r5 = r5 | r6
        L32:
            r6 = r5 & 19
            r8 = 18
            r9 = 1
            r10 = 0
            if (r6 == r8) goto L3c
            r6 = r9
            goto L3d
        L3c:
            r6 = r10
        L3d:
            r8 = r5 & 1
            boolean r6 = r0.S(r8, r6)
            if (r6 == 0) goto L1ae
            i0.m2 r6 = y1.i0.f21966b
            java.lang.Object r8 = r0.j(r6)
            android.content.Context r8 = (android.content.Context) r8
            boolean r11 = r0.f(r8)
            r12 = r5 & 14
            if (r12 != r2) goto L57
            r2 = r9
            goto L58
        L57:
            r2 = r10
        L58:
            r2 = r2 | r11
            java.lang.Object r11 = r0.P()
            r12 = -1
            if (r2 != 0) goto L64
            i0.e r2 = i0.l.f5952a
            if (r11 != r2) goto L77
        L64:
            int[] r2 = new int[]{r1}
            android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r2)
            int r2 = r2.getResourceId(r10, r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r0.k0(r11)
        L77:
            java.lang.Number r11 = (java.lang.Number) r11
            int r2 = r11.intValue()
            if (r2 != r12) goto L90
            i0.r1 r6 = r0.t()
            if (r6 == 0) goto L1c3
            b0.p r0 = new b0.p
            r5 = 1
            r2 = r21
            r0.<init>(r1, r2, r3, r5)
        L8d:
            r6.f6035d = r0
            return
        L90:
            java.lang.Object r1 = r0.j(r6)
            android.content.Context r1 = (android.content.Context) r1
            i0.u r6 = y1.i0.f21967c
            java.lang.Object r6 = r0.j(r6)
            android.content.res.Resources r6 = (android.content.res.Resources) r6
            i0.m2 r8 = y1.i0.f21969e
            java.lang.Object r8 = r0.j(r8)
            d2.d r8 = (d2.d) r8
            monitor-enter(r8)
            f.w r11 = r8.f1971a     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r11 = r11.b(r2)     // Catch: java.lang.Throwable -> Lca
            android.util.TypedValue r11 = (android.util.TypedValue) r11     // Catch: java.lang.Throwable -> Lca
            if (r11 != 0) goto Lcd
            android.util.TypedValue r11 = new android.util.TypedValue     // Catch: java.lang.Throwable -> Lca
            r11.<init>()     // Catch: java.lang.Throwable -> Lca
            r6.getValue(r2, r11, r9)     // Catch: java.lang.Throwable -> Lca
            f.w r12 = r8.f1971a     // Catch: java.lang.Throwable -> Lca
            int r13 = r12.d(r2)     // Catch: java.lang.Throwable -> Lca
            java.lang.Object[] r14 = r12.f2845c     // Catch: java.lang.Throwable -> Lca
            r15 = r14[r13]     // Catch: java.lang.Throwable -> Lca
            int[] r12 = r12.f2844b     // Catch: java.lang.Throwable -> Lca
            r12[r13] = r2     // Catch: java.lang.Throwable -> Lca
            r14[r13] = r11     // Catch: java.lang.Throwable -> Lca
            goto Lcd
        Lca:
            r0 = move-exception
            goto L1ac
        Lcd:
            monitor-exit(r8)
            java.lang.CharSequence r8 = r11.string
            r11 = 0
            if (r8 == 0) goto L106
            java.lang.String r12 = ".xml"
            boolean r12 = og.m.m0(r8, r12)
            if (r12 != r9) goto L106
            r3 = -1771798434(0xffffffff9664805e, float:-1.8458199E-25)
            r0.a0(r3)
            android.content.res.Resources$Theme r1 = r1.getTheme()
            i0.m2 r3 = y1.i0.f21968d
            java.lang.Object r0 = r0.j(r3)
            d2.c r0 = (d2.c) r0
            d2.b r3 = new d2.b
            r3.<init>(r1, r2)
            java.util.HashMap r0 = r0.f1970a
            java.lang.Object r0 = r0.get(r3)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L102
            java.lang.Object r0 = r0.get()
            d2.a r0 = (d2.a) r0
        L102:
            r6.getXml(r2)
            throw r11
        L106:
            r12 = -1771643000(0xffffffff9666df88, float:-1.8649786E-25)
            r0.a0(r12)
            android.content.res.Resources$Theme r1 = r1.getTheme()
            boolean r12 = r0.f(r8)
            boolean r13 = r0.d(r2)
            r12 = r12 | r13
            boolean r1 = r0.f(r1)
            r1 = r1 | r12
            java.lang.Object r12 = r0.P()
            if (r1 != 0) goto L128
            i0.e r1 = i0.l.f5952a
            if (r12 != r1) goto L13d
        L128:
            android.graphics.drawable.Drawable r1 = r6.getDrawable(r2, r11)     // Catch: java.lang.Exception -> L197
            r1.getClass()     // Catch: java.lang.Exception -> L197
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch: java.lang.Exception -> L197
            android.graphics.Bitmap r1 = r1.getBitmap()     // Catch: java.lang.Exception -> L197
            f1.g r12 = new f1.g     // Catch: java.lang.Exception -> L197
            r12.<init>(r1)     // Catch: java.lang.Exception -> L197
            r0.k0(r12)
        L13d:
            f1.g r12 = (f1.g) r12
            k1.a r1 = new k1.a
            android.graphics.Bitmap r2 = r12.f3055a
            int r2 = r2.getWidth()
            android.graphics.Bitmap r6 = r12.f3055a
            int r6 = r6.getHeight()
            long r13 = (long) r2
            long r13 = r13 << r7
            long r7 = (long) r6
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r7 & r15
            long r6 = r6 | r13
            r1.<init>(r12, r6)
            r0.p(r10)
            r5 = r5 & 112(0x70, float:1.57E-43)
            r2 = 32
            if (r5 != r2) goto L165
            goto L166
        L165:
            r9 = r10
        L166:
            java.lang.Object r2 = r0.P()
            if (r9 != 0) goto L170
            i0.e r5 = i0.l.f5952a
            if (r2 != r5) goto L181
        L170:
            r5 = 16
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L177
            goto L17d
        L177:
            f1.n r11 = new f1.n
            r2 = 5
            r11.<init>(r3, r2)
        L17d:
            r0.k0(r11)
            r2 = r11
        L181:
            f1.n r2 = (f1.n) r2
            y0.l r5 = y0.l.f21818a
            float r6 = l.f.f7634j
            y0.o r5 = p.h1.j(r5, r6)
            v1.s0 r6 = v1.g.f13935b
            r7 = 22
            y0.o r1 = c1.h.g(r5, r1, r6, r2, r7)
            p.o.a(r1, r0, r10)
            goto L1b1
        L197:
            r0 = move-exception
            af.d r1 = new af.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error attempting to load resource: "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L1ac:
            monitor-exit(r8)
            throw r0
        L1ae:
            r0.V()
        L1b1:
            i0.r1 r6 = r0.t()
            if (r6 == 0) goto L1c3
            b0.p r0 = new b0.p
            r5 = 0
            r1 = r17
            r2 = r21
            r0.<init>(r1, r2, r3, r5)
            goto L8d
        L1c3:
            return
    }

    public static final void c(z.g r13, d0.d r14, fg.a r15, i0.h0 r16, int r17) {
            r8 = r16
            r0 = r17
            r1 = -2040393164(0xffffffff86621234, float:-4.251925E-35)
            r8.b0(r1)
            r1 = r0 & 6
            r4 = 4
            if (r1 != 0) goto L23
            r1 = r0 & 8
            if (r1 != 0) goto L18
            boolean r1 = r8.f(r13)
            goto L1c
        L18:
            boolean r1 = r8.h(r13)
        L1c:
            if (r1 == 0) goto L20
            r1 = r4
            goto L21
        L20:
            r1 = 2
        L21:
            r1 = r1 | r0
            goto L24
        L23:
            r1 = r0
        L24:
            r5 = r0 & 48
            r6 = 32
            if (r5 != 0) goto L3e
            r5 = r0 & 64
            if (r5 != 0) goto L33
            boolean r5 = r8.f(r14)
            goto L37
        L33:
            boolean r5 = r8.h(r14)
        L37:
            if (r5 == 0) goto L3b
            r5 = r6
            goto L3d
        L3b:
            r5 = 16
        L3d:
            r1 = r1 | r5
        L3e:
            r5 = r0 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L4e
            boolean r5 = r8.h(r15)
            if (r5 == 0) goto L4b
            r5 = 256(0x100, float:3.59E-43)
            goto L4d
        L4b:
            r5 = 128(0x80, float:1.8E-43)
        L4d:
            r1 = r1 | r5
        L4e:
            r5 = r1 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            r9 = 0
            r10 = 1
            if (r5 == r7) goto L58
            r5 = r10
            goto L59
        L58:
            r5 = r9
        L59:
            r7 = r1 & 1
            boolean r5 = r8.S(r7, r5)
            if (r5 == 0) goto Lce
            r5 = r1 & 112(0x70, float:1.57E-43)
            if (r5 == r6) goto L72
            r5 = r1 & 64
            if (r5 == 0) goto L70
            boolean r5 = r8.f(r14)
            if (r5 == 0) goto L70
            goto L72
        L70:
            r5 = r9
            goto L73
        L72:
            r5 = r10
        L73:
            java.lang.Object r6 = r8.P()
            i0.e r7 = i0.l.f5952a
            if (r5 != 0) goto L7d
            if (r6 != r7) goto L92
        L7d:
            b0.y r6 = new b0.y
            androidx.lifecycle.x r5 = new androidx.lifecycle.x
            aa.c r11 = new aa.c
            r12 = 2
            r11.<init>(r14, r12, r15)
            r12 = 29
            r5.<init>(r11, r12)
            r6.<init>(r5)
            r8.k0(r6)
        L92:
            b0.y r6 = (b0.y) r6
            r5 = r1 & 14
            if (r5 == r4) goto La2
            r1 = r1 & 8
            if (r1 == 0) goto La3
            boolean r1 = r8.h(r13)
            if (r1 == 0) goto La3
        La2:
            r9 = r10
        La3:
            java.lang.Object r1 = r8.P()
            if (r9 != 0) goto Lab
            if (r1 != r7) goto Lb4
        Lab:
            ab.a r1 = new ab.a
            r4 = 2
            r1.<init>(r13, r4)
            r8.k0(r1)
        Lb4:
            r5 = r1
            fg.a r5 = (fg.a) r5
            b0.q r1 = new b0.q
            r4 = 0
            r1.<init>(r14, r4, r13)
            r4 = 1315155414(0x4e63add6, float:9.5495514E8)
            s0.d r7 = s0.i.e(r4, r1, r8)
            r9 = 3456(0xd80, float:4.843E-42)
            r10 = 0
            r4 = r6
            y2.c0 r6 = b0.w.f415a
            y2.m.a(r4, r5, r6, r7, r8, r9, r10)
            goto Ld1
        Lce:
            r16.V()
        Ld1:
            i0.r1 r6 = r16.t()
            if (r6 == 0) goto Le4
            b0.r r0 = new b0.r
            r5 = 0
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        Le4:
            return
    }

    public static final void d(y0.o r3, s0.d r4, i0.h0 r5, int r6) {
            r0 = 1392105195(0x52f9d6eb, float:5.365263E11)
            r5.b0(r0)
            r0 = r6 & 6
            if (r0 != 0) goto L15
            boolean r0 = r5.f(r3)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r6
            goto L16
        L15:
            r0 = r6
        L16:
            r1 = r6 & 48
            if (r1 != 0) goto L26
            boolean r1 = r5.h(r4)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r0 & 19
            r2 = 18
            if (r1 == r2) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            r2 = r0 & 1
            boolean r1 = r5.S(r2, r1)
            if (r1 == 0) goto L46
            i0.u r1 = d0.f.f1894a
            r2 = r0 & 14
            r2 = r2 | 432(0x1b0, float:6.05E-43)
            int r0 = r0 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r9.e0.e(r3, r1, r4, r5, r0)
            goto L49
        L46:
            r5.V()
        L49:
            i0.r1 r5 = r5.t()
            if (r5 == 0) goto L57
            b0.i r0 = new b0.i
            r1 = 2
            r0.<init>(r3, r4, r6, r1)
            r5.f6035d = r0
        L57:
            return
    }
}
