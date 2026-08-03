package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Class[] f21913a = null;

    static {
            java.lang.Class<android.util.Size> r5 = android.util.Size.class
            java.lang.Class<android.util.SizeF> r6 = android.util.SizeF.class
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class<android.util.SparseArray> r3 = android.util.SparseArray.class
            java.lang.Class<android.os.Binder> r4 = android.os.Binder.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1, r2, r3, r4, r5, r6}
            y1.g0.f21913a = r0
            return
    }

    public static final boolean a(android.view.View r1, android.view.View r2) {
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L7
            goto L16
        L7:
            android.view.ViewParent r2 = r2.getParent()
        Lb:
            if (r2 == 0) goto L16
            if (r2 != r1) goto L11
            r1 = 1
            return r1
        L11:
            android.view.ViewParent r2 = r2.getParent()
            goto Lb
        L16:
            r1 = 0
            return r1
    }

    public static final boolean b(f2.q r1) {
            f2.m r1 = r1.k()
            f2.x r0 = f2.u.f3232j
            f.k0 r1 = r1.f3204g
            boolean r1 = r1.c(r0)
            r1 = r1 ^ 1
            return r1
    }

    public static final boolean c(f2.q r3, android.content.res.Resources r4) {
            f2.m r0 = r3.f3213d
            f2.x r1 = f2.u.f3223a
            f.k0 r0 = r0.f3204g
            java.lang.Object r0 = r0.g(r1)
            r1 = 0
            if (r0 != 0) goto Le
            r0 = r1
        Le:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L19
            java.lang.Object r0 = tf.m.v1(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L19:
            r0 = 1
            r2 = 0
            if (r1 != 0) goto L32
            i2.g r1 = m(r3)
            if (r1 != 0) goto L32
            java.lang.String r4 = l(r3, r4)
            if (r4 != 0) goto L32
            boolean r4 = k(r3)
            if (r4 == 0) goto L30
            goto L32
        L30:
            r4 = r2
            goto L33
        L32:
            r4 = r0
        L33:
            boolean r1 = f2.t.g(r3)
            if (r1 != 0) goto L48
            f2.m r1 = r3.f3213d
            boolean r1 = r1.f3206i
            if (r1 != 0) goto L47
            boolean r3 = r3.q()
            if (r3 == 0) goto L48
            if (r4 == 0) goto L48
        L47:
            return r0
        L48:
            return r2
    }

    public static final void d(f2.q r4, h3.g r5) {
            f2.m r0 = r4.f3213d
            f.k0 r1 = r0.f3204g
            f2.x r2 = f2.u.f3247y
            f.k0 r0 = r0.f3204g
            java.lang.Object r0 = r0.g(r2)
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r2
        L10:
            f2.i r0 = (f2.i) r0
            boolean r4 = b(r4)
            if (r4 == 0) goto L8a
            if (r0 != 0) goto L1b
            goto L22
        L1b:
            int r4 = r0.f3155a
            r0 = 8
            if (r4 != r0) goto L22
            goto L8a
        L22:
            f2.x r4 = f2.l.f3202y
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L2b
            r4 = r2
        L2b:
            f2.a r4 = (f2.a) r4
            if (r4 == 0) goto L3c
            h3.e r0 = new h3.e
            r3 = 16908358(0x1020046, float:2.3877425E-38)
            java.lang.String r4 = r4.f3137a
            r0.<init>(r2, r3, r4, r2)
            r5.a(r0)
        L3c:
            f2.x r4 = f2.l.A
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L45
            r4 = r2
        L45:
            f2.a r4 = (f2.a) r4
            if (r4 == 0) goto L56
            h3.e r0 = new h3.e
            r3 = 16908359(0x1020047, float:2.3877428E-38)
            java.lang.String r4 = r4.f3137a
            r0.<init>(r2, r3, r4, r2)
            r5.a(r0)
        L56:
            f2.x r4 = f2.l.f3203z
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L5f
            r4 = r2
        L5f:
            f2.a r4 = (f2.a) r4
            if (r4 == 0) goto L70
            h3.e r0 = new h3.e
            r3 = 16908360(0x1020048, float:2.387743E-38)
            java.lang.String r4 = r4.f3137a
            r0.<init>(r2, r3, r4, r2)
            r5.a(r0)
        L70:
            f2.x r4 = f2.l.B
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L79
            r4 = r2
        L79:
            f2.a r4 = (f2.a) r4
            if (r4 == 0) goto L8a
            h3.e r0 = new h3.e
            r1 = 16908361(0x1020049, float:2.3877434E-38)
            java.lang.String r4 = r4.f3137a
            r0.<init>(r2, r1, r4, r2)
            r5.a(r0)
        L8a:
            return
    }

    public static final y1.j1 e(android.view.View r7) {
            android.content.Context r7 = r7.getContext()
            r0 = r7
        L5:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r2 = 0
            if (r1 == 0) goto L21
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Lf
            goto L28
        Lf:
            boolean r1 = r0 instanceof android.inputmethodservice.InputMethodService
            if (r1 == 0) goto L14
            goto L28
        L14:
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L19
            goto L28
        L19:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r1 = r0.getBaseContext()
            if (r1 != 0) goto L23
        L21:
            r0 = r2
            goto L28
        L23:
            android.content.Context r0 = r0.getBaseContext()
            goto L5
        L28:
            if (r0 == 0) goto L7f
            b4.c r7 = b4.d.f463a
            r7.getClass()
            b4.c r7 = b4.c.f461a
            b4.e r7 = b4.c.f462b
            r7.getClass()
            r1 = r0
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L42
            c4.f r2 = c4.f.f1023c
            goto L4b
        L42:
            r3 = 30
            if (r2 < r3) goto L49
            c4.d r2 = c4.d.f1021c
            goto L4b
        L49:
            c4.c r2 = c4.c.f1018g
        L4b:
            c4.e r7 = r7.f464b
            b4.a r7 = r2.c(r1, r7)
            android.graphics.Rect r1 = r7.a()
            int r1 = r1.width()
            android.graphics.Rect r7 = r7.a()
            int r7 = r7.height()
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            long r3 = (long) r7
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r1 = r1 | r3
            u2.e r7 = be.h.a(r0)
            long r3 = r9.e0.q0(r1)
            long r3 = r7.K(r3)
            y1.j1 r7 = new y1.j1
            r7.<init>(r1, r3)
            return r7
        L7f:
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            u2.e r7 = be.h.a(r7)
            int r1 = r0.screenWidthDp
            float r1 = (float) r1
            int r0 = r0.screenHeightDp
            float r0 = (float) r0
            long r0 = g4.a.d(r1, r0)
            long r2 = r7.L0(r0)
            long r2 = r9.e0.p0(r2)
            y1.j1 r7 = new y1.j1
            r7.<init>(r2, r0)
            return r7
    }

    public static final boolean f(java.lang.Object r3) {
            boolean r0 = r3 instanceof w0.n
            r1 = 0
            if (r0 == 0) goto L2b
            w0.n r3 = (w0.n) r3
            i0.e r0 = r3.b()
            i0.e r2 = i0.e.f5867j
            if (r0 == r2) goto L1f
            i0.e r0 = r3.b()
            i0.e r2 = i0.e.f5870m
            if (r0 == r2) goto L1f
            i0.e r0 = r3.b()
            i0.e r2 = i0.e.f5868k
            if (r0 != r2) goto L47
        L1f:
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto L26
            goto L42
        L26:
            boolean r3 = f(r3)
            return r3
        L2b:
            boolean r0 = r3 instanceof sf.b
            if (r0 == 0) goto L34
            boolean r0 = r3 instanceof java.io.Serializable
            if (r0 == 0) goto L34
            return r1
        L34:
            r0 = r1
        L35:
            r2 = 7
            if (r0 >= r2) goto L47
            java.lang.Class[] r2 = y1.g0.f21913a
            r2 = r2[r0]
            boolean r2 = r2.isInstance(r3)
            if (r2 == 0) goto L44
        L42:
            r3 = 1
            return r3
        L44:
            int r0 = r0 + 1
            goto L35
        L47:
            return r1
    }

    public static final float g(float[] r3, int r4, float[] r5, int r6) {
            r0 = 4
            int r4 = r4 * r0
            r1 = r3[r4]
            r2 = r5[r6]
            float r1 = r1 * r2
            int r2 = r4 + 1
            r2 = r3[r2]
            int r0 = r0 + r6
            r0 = r5[r0]
            float r2 = r2 * r0
            float r2 = r2 + r1
            int r0 = r4 + 2
            r0 = r3[r0]
            r1 = 8
            int r1 = r1 + r6
            r1 = r5[r1]
            float r0 = r0 * r1
            float r0 = r0 + r2
            int r4 = r4 + 3
            r3 = r3[r4]
            r4 = 12
            int r4 = r4 + r6
            r4 = r5[r4]
            float r3 = r3 * r4
            float r3 = r3 + r0
            return r3
    }

    public static final int h(android.view.View r5, int r6) {
            r0 = 0
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = r0
        L6:
            if (r5 == 0) goto L29
            java.lang.Object r4 = r5.getTag(r6)
            if (r4 == 0) goto L1a
            if (r3 != 0) goto L12
            r3 = r4
            goto L19
        L12:
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L19
            goto L29
        L19:
            r2 = r1
        L1a:
            int r1 = r1 + 1
            android.view.ViewParent r5 = fb.v0.t(r5)
            boolean r4 = r5 instanceof android.view.View
            if (r4 == 0) goto L27
            android.view.View r5 = (android.view.View) r5
            goto L6
        L27:
            r5 = r0
            goto L6
        L29:
            return r2
    }

    public static final android.view.View i(android.view.View r6) {
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L44
            r0 = 2131099773(0x7f06007d, float:1.7811909E38)
            int r0 = h(r6, r0)
            r1 = 2131099776(0x7f060080, float:1.7811915E38)
            int r1 = h(r6, r1)
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r6
            r3 = r1
            r1 = r2
        L1c:
            if (r6 == 0) goto L43
            if (r3 != r0) goto L29
            android.view.ViewParent r0 = r6.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 != 0) goto L2f
            return r2
        L29:
            y1.f1 r1 = j(r6)
            if (r1 == 0) goto L30
        L2f:
            return r6
        L30:
            int r3 = r3 + 1
            android.view.ViewParent r1 = fb.v0.t(r6)
            boolean r4 = r1 instanceof android.view.View
            if (r4 == 0) goto L3d
            android.view.View r1 = (android.view.View) r1
            goto L3e
        L3d:
            r1 = 0
        L3e:
            r5 = r2
            r2 = r6
            r6 = r1
            r1 = r5
            goto L1c
        L43:
            return r1
        L44:
            return r6
    }

    public static final y1.f1 j(android.view.View r2) {
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            java.lang.Object r2 = r2.getTag(r0)
            boolean r0 = r2 instanceof java.lang.ref.WeakReference
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.get()
            y1.f1 r2 = (y1.f1) r2
            return r2
        L19:
            return r1
    }

    public static final boolean k(f2.q r5) {
            f2.m r0 = r5.f3213d
            f2.x r1 = f2.u.J
            f.k0 r0 = r0.f3204g
            java.lang.Object r0 = r0.g(r1)
            r1 = 0
            if (r0 != 0) goto Le
            r0 = r1
        Le:
            h2.a r0 = (h2.a) r0
            f2.m r5 = r5.f3213d
            f.k0 r5 = r5.f3204g
            f2.x r2 = f2.u.f3247y
            java.lang.Object r2 = r5.g(r2)
            if (r2 != 0) goto L1d
            r2 = r1
        L1d:
            f2.i r2 = (f2.i) r2
            r3 = 1
            if (r0 == 0) goto L24
            r0 = r3
            goto L25
        L24:
            r0 = 0
        L25:
            f2.x r4 = f2.u.I
            java.lang.Object r5 = r5.g(r4)
            if (r5 != 0) goto L2e
            goto L2f
        L2e:
            r1 = r5
        L2f:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L3d
            if (r2 != 0) goto L36
            goto L3c
        L36:
            int r5 = r2.f3155a
            r1 = 4
            if (r5 != r1) goto L3c
            goto L3d
        L3c:
            return r3
        L3d:
            return r0
    }

    public static final java.lang.String l(f2.q r9, android.content.res.Resources r10) {
            f2.m r0 = r9.f3213d
            f2.m r1 = r9.f3213d
            f2.x r2 = f2.u.f3224b
            f.k0 r0 = r0.f3204g
            java.lang.Object r0 = r0.g(r2)
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r2
        L10:
            f.k0 r3 = r1.f3204g
            f2.x r4 = f2.u.J
            java.lang.Object r4 = r3.g(r4)
            if (r4 != 0) goto L1b
            r4 = r2
        L1b:
            h2.a r4 = (h2.a) r4
            f2.x r5 = f2.u.f3247y
            java.lang.Object r5 = r3.g(r5)
            if (r5 != 0) goto L26
            r5 = r2
        L26:
            f2.i r5 = (f2.i) r5
            r6 = 1
            if (r4 == 0) goto L65
            int r4 = r4.ordinal()
            r7 = 2
            if (r4 == 0) goto L55
            if (r4 == r6) goto L44
            if (r4 != r7) goto L40
            if (r0 != 0) goto L65
            r0 = 2131296273(0x7f090011, float:1.8210458E38)
            java.lang.String r0 = r10.getString(r0)
            goto L65
        L40:
            okio.a.k()
            return r2
        L44:
            if (r5 != 0) goto L47
            goto L65
        L47:
            int r4 = r5.f3155a
            if (r4 != r7) goto L65
            if (r0 != 0) goto L65
            r0 = 2131296281(0x7f090019, float:1.8210474E38)
            java.lang.String r0 = r10.getString(r0)
            goto L65
        L55:
            if (r5 != 0) goto L58
            goto L65
        L58:
            int r4 = r5.f3155a
            if (r4 != r7) goto L65
            if (r0 != 0) goto L65
            r0 = 2131296282(0x7f09001a, float:1.8210476E38)
            java.lang.String r0 = r10.getString(r0)
        L65:
            f2.x r4 = f2.u.I
            java.lang.Object r4 = r3.g(r4)
            if (r4 != 0) goto L6e
            r4 = r2
        L6e:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L92
            boolean r4 = r4.booleanValue()
            if (r5 != 0) goto L79
            goto L7f
        L79:
            int r5 = r5.f3155a
            r7 = 4
            if (r5 != r7) goto L7f
            goto L92
        L7f:
            if (r0 != 0) goto L92
            if (r4 == 0) goto L8b
            r0 = 2131296278(0x7f090016, float:1.8210468E38)
            java.lang.String r0 = r10.getString(r0)
            goto L92
        L8b:
            r0 = 2131296275(0x7f090013, float:1.8210462E38)
            java.lang.String r0 = r10.getString(r0)
        L92:
            f2.x r4 = f2.u.f3225c
            java.lang.Object r4 = r3.g(r4)
            if (r4 != 0) goto L9b
            r4 = r2
        L9b:
            f2.h r4 = (f2.h) r4
            if (r4 == 0) goto Lf8
            f2.h r5 = f2.h.f3151d
            if (r4 == r5) goto Lef
            if (r0 != 0) goto Lf8
            lg.a r0 = r4.f3153b
            float r5 = r0.f8041b
            float r0 = r0.f8040a
            float r7 = r5 - r0
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto Lb4
            r4 = r8
            goto Lb9
        Lb4:
            float r4 = r4.f3152a
            float r4 = r4 - r0
            float r5 = r5 - r0
            float r4 = r4 / r5
        Lb9:
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto Lbe
            r4 = r8
        Lbe:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 <= 0) goto Lc5
            r4 = r0
        Lc5:
            int r5 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r5 != 0) goto Lcb
            r0 = 0
            goto Ldf
        Lcb:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r5 = 100
            if (r0 != 0) goto Ld3
            r0 = r5
            goto Ldf
        Ld3:
            float r0 = (float) r5
            float r4 = r4 * r0
            int r0 = java.lang.Math.round(r4)
            r4 = 99
            int r0 = r9.e0.r(r0, r6, r4)
        Ldf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r4 = 2131296286(0x7f09001e, float:1.8210484E38)
            java.lang.String r0 = r10.getString(r4, r0)
            goto Lf8
        Lef:
            if (r0 != 0) goto Lf8
            r0 = 2131296272(0x7f090010, float:1.8210456E38)
            java.lang.String r0 = r10.getString(r0)
        Lf8:
            f2.x r4 = f2.u.F
            boolean r3 = r3.c(r4)
            if (r3 == 0) goto L14e
            f2.q r0 = new f2.q
            y0.n r3 = r9.f3210a
            x1.f0 r9 = r9.f3212c
            r0.<init>(r3, r6, r9, r1)
            f2.m r9 = r0.k()
            f.k0 r9 = r9.f3204g
            f2.x r0 = f2.u.f3223a
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L118
            r0 = r2
        L118:
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L122
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14d
        L122:
            f2.x r0 = f2.u.B
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L12b
            r0 = r2
        L12b:
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L135
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14d
        L135:
            java.lang.Object r9 = r9.g(r4)
            if (r9 != 0) goto L13c
            r9 = r2
        L13c:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L146
            int r9 = r9.length()
            if (r9 != 0) goto L14d
        L146:
            r9 = 2131296280(0x7f090018, float:1.8210472E38)
            java.lang.String r2 = r10.getString(r9)
        L14d:
            r0 = r2
        L14e:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static final i2.g m(f2.q r3) {
            f2.m r0 = r3.f3213d
            f2.x r1 = f2.u.F
            f.k0 r0 = r0.f3204g
            java.lang.Object r0 = r0.g(r1)
            r1 = 0
            if (r0 != 0) goto Le
            r0 = r1
        Le:
            i2.g r0 = (i2.g) r0
            f2.m r3 = r3.f3213d
            f2.x r2 = f2.u.B
            f.k0 r3 = r3.f3204g
            java.lang.Object r3 = r3.g(r2)
            if (r3 != 0) goto L1d
            r3 = r1
        L1d:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L28
            java.lang.Object r3 = tf.m.v1(r3)
            r1 = r3
            i2.g r1 = (i2.g) r1
        L28:
            if (r0 != 0) goto L2b
            return r1
        L2b:
            return r0
    }

    public static boolean n() {
            java.lang.Class r0 = y1.t.T0     // Catch: java.lang.Exception -> L47
            if (r0 != 0) goto Lc
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L47
            y1.t.T0 = r0     // Catch: java.lang.Exception -> L47
        Lc:
            java.lang.reflect.Method r0 = y1.t.U0     // Catch: java.lang.Exception -> L47
            r1 = 0
            if (r0 != 0) goto L27
            java.lang.Class r0 = y1.t.T0     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L24
            java.lang.String r2 = "getBoolean"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L47
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Exception -> L47
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L47
            goto L25
        L24:
            r0 = r1
        L25:
            y1.t.U0 = r0     // Catch: java.lang.Exception -> L47
        L27:
            java.lang.reflect.Method r0 = y1.t.U0     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L38
            java.lang.String r2 = "debug.layout"
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L47
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Exception -> L47
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L47
            goto L39
        L38:
            r0 = r1
        L39:
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L40
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L47
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L47
            boolean r0 = gg.l.a(r1, r0)     // Catch: java.lang.Exception -> L47
            return r0
        L47:
            r0 = 0
            return r0
    }

    public static final i2.k0 o(f2.m r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            f2.x r1 = f2.l.f3178a
            f.k0 r2 = r2.f3204g
            java.lang.Object r2 = r2.g(r1)
            r1 = 0
            if (r2 != 0) goto L11
            r2 = r1
        L11:
            f2.a r2 = (f2.a) r2
            if (r2 == 0) goto L2f
            sf.b r2 = r2.f3138b
            fg.l r2 = (fg.l) r2
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r2.invoke(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2f
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            i2.k0 r2 = (i2.k0) r2
            return r2
        L2f:
            return r1
    }

    public static final boolean p(float[] r49, float[] r50) {
            r0 = r49
            r1 = r50
            int r2 = r0.length
            r3 = 0
            r4 = 16
            if (r2 < r4) goto Ld
            int r2 = r1.length
            if (r2 >= r4) goto L11
        Ld:
            r19 = r3
            goto L1a3
        L11:
            r2 = r0[r3]
            r4 = 1
            r5 = r0[r4]
            r6 = 2
            r7 = r0[r6]
            r8 = 3
            r9 = r0[r8]
            r10 = 4
            r11 = r0[r10]
            r12 = 5
            r13 = r0[r12]
            r14 = 6
            r15 = r0[r14]
            r16 = 7
            r17 = r0[r16]
            r18 = 8
            r19 = r3
            r3 = r0[r18]
            r20 = 9
            r21 = r4
            r4 = r0[r20]
            r22 = 10
            r23 = r0[r22]
            r24 = 11
            r25 = r0[r24]
            r26 = 12
            r27 = r6
            r6 = r0[r26]
            r28 = 13
            r29 = r0[r28]
            r30 = 14
            r31 = r0[r30]
            r32 = 15
            r0 = r0[r32]
            float r33 = r2 * r13
            float r34 = r5 * r11
            float r33 = r33 - r34
            float r34 = r2 * r15
            float r35 = r7 * r11
            float r34 = r34 - r35
            float r35 = r2 * r17
            float r36 = r9 * r11
            float r35 = r35 - r36
            float r36 = r5 * r15
            float r37 = r7 * r13
            float r36 = r36 - r37
            float r37 = r5 * r17
            float r38 = r9 * r13
            float r37 = r37 - r38
            float r38 = r7 * r17
            float r39 = r9 * r15
            float r38 = r38 - r39
            float r39 = r3 * r29
            float r40 = r4 * r6
            float r39 = r39 - r40
            float r40 = r3 * r31
            float r41 = r23 * r6
            float r40 = r40 - r41
            float r41 = r3 * r0
            float r42 = r25 * r6
            float r41 = r41 - r42
            float r42 = r4 * r31
            float r43 = r23 * r29
            float r42 = r42 - r43
            float r43 = r4 * r0
            float r44 = r25 * r29
            float r43 = r43 - r44
            float r44 = r23 * r0
            float r45 = r25 * r31
            float r44 = r44 - r45
            float r45 = r33 * r44
            float r46 = r34 * r43
            float r45 = r45 - r46
            float r46 = r35 * r42
            float r46 = r46 + r45
            float r45 = r36 * r41
            float r45 = r45 + r46
            float r46 = r37 * r40
            float r45 = r45 - r46
            float r46 = r38 * r39
            float r46 = r46 + r45
            r45 = 0
            int r45 = (r46 > r45 ? 1 : (r46 == r45 ? 0 : -1))
            if (r45 != 0) goto Lb5
            goto L199
        Lb5:
            r47 = 1065353216(0x3f800000, float:1.0)
            float r47 = r47 / r46
            float r46 = r13 * r44
            float r48 = r15 * r43
            float r46 = r46 - r48
            float r48 = r17 * r42
            float r48 = r48 + r46
            float r48 = r48 * r47
            r1[r19] = r48
            r46 = r8
            float r8 = -r5
            float r8 = r8 * r44
            float r48 = r7 * r43
            float r48 = r48 + r8
            float r8 = r9 * r42
            float r48 = r48 - r8
            float r48 = r48 * r47
            r1[r21] = r48
            float r8 = r29 * r38
            float r48 = r31 * r37
            float r8 = r8 - r48
            float r48 = r0 * r36
            float r48 = r48 + r8
            float r48 = r48 * r47
            r1[r27] = r48
            float r8 = -r4
            float r8 = r8 * r38
            float r27 = r23 * r37
            float r27 = r27 + r8
            float r8 = r25 * r36
            float r27 = r27 - r8
            float r27 = r27 * r47
            r1[r46] = r27
            float r8 = -r11
            float r27 = r8 * r44
            float r46 = r15 * r41
            float r46 = r46 + r27
            float r27 = r17 * r40
            float r46 = r46 - r27
            float r46 = r46 * r47
            r1[r10] = r46
            float r44 = r44 * r2
            float r10 = r7 * r41
            float r44 = r44 - r10
            float r10 = r9 * r40
            float r10 = r10 + r44
            float r10 = r10 * r47
            r1[r12] = r10
            float r10 = -r6
            float r12 = r10 * r38
            float r27 = r31 * r35
            float r27 = r27 + r12
            float r12 = r0 * r34
            float r27 = r27 - r12
            float r27 = r27 * r47
            r1[r14] = r27
            float r38 = r38 * r3
            float r12 = r23 * r35
            float r38 = r38 - r12
            float r12 = r25 * r34
            float r12 = r12 + r38
            float r12 = r12 * r47
            r1[r16] = r12
            float r11 = r11 * r43
            float r12 = r13 * r41
            float r11 = r11 - r12
            float r17 = r17 * r39
            float r17 = r17 + r11
            float r17 = r17 * r47
            r1[r18] = r17
            float r11 = -r2
            float r11 = r11 * r43
            float r41 = r41 * r5
            float r41 = r41 + r11
            float r9 = r9 * r39
            float r41 = r41 - r9
            float r41 = r41 * r47
            r1[r20] = r41
            float r6 = r6 * r37
            float r9 = r29 * r35
            float r6 = r6 - r9
            float r0 = r0 * r33
            float r0 = r0 + r6
            float r0 = r0 * r47
            r1[r22] = r0
            float r0 = -r3
            float r0 = r0 * r37
            float r35 = r35 * r4
            float r35 = r35 + r0
            float r25 = r25 * r33
            float r35 = r35 - r25
            float r35 = r35 * r47
            r1[r24] = r35
            float r8 = r8 * r42
            float r13 = r13 * r40
            float r13 = r13 + r8
            float r15 = r15 * r39
            float r13 = r13 - r15
            float r13 = r13 * r47
            r1[r26] = r13
            float r2 = r2 * r42
            float r5 = r5 * r40
            float r2 = r2 - r5
            float r7 = r7 * r39
            float r7 = r7 + r2
            float r7 = r7 * r47
            r1[r28] = r7
            float r10 = r10 * r36
            float r29 = r29 * r34
            float r29 = r29 + r10
            float r31 = r31 * r33
            float r29 = r29 - r31
            float r29 = r29 * r47
            r1[r30] = r29
            float r3 = r3 * r36
            float r4 = r4 * r34
            float r3 = r3 - r4
            float r23 = r23 * r33
            float r23 = r23 + r3
            float r23 = r23 * r47
            r1[r32] = r23
        L199:
            if (r45 != 0) goto L19e
            r3 = r21
            goto L1a0
        L19e:
            r3 = r19
        L1a0:
            r0 = r3 ^ 1
            return r0
        L1a3:
            return r19
    }

    public static final boolean q(float r4, float r5, f1.j r6) {
            r0 = 1000593162(0x3ba3d70a, float:0.005)
            float r1 = r4 - r0
            float r2 = r5 - r0
            float r4 = r4 + r0
            float r5 = r5 + r0
            f1.j r0 = f1.l.a()
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 != 0) goto L25
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L25
            boolean r3 = java.lang.Float.isNaN(r4)
            if (r3 != 0) goto L25
            boolean r3 = java.lang.Float.isNaN(r5)
            if (r3 == 0) goto L2a
        L25:
            java.lang.String r3 = "Invalid rectangle, make sure no value is NaN"
            f1.l.b(r3)
        L2a:
            android.graphics.RectF r3 = r0.f3068b
            if (r3 != 0) goto L35
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.f3068b = r3
        L35:
            android.graphics.RectF r3 = r0.f3068b
            r3.getClass()
            r3.set(r1, r2, r4, r5)
            android.graphics.Path r4 = r0.f3067a
            android.graphics.RectF r5 = r0.f3068b
            r5.getClass()
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CCW
            r4.addRect(r5, r1)
            f1.j r4 = f1.l.a()
            r5 = 1
            r4.g(r6, r0, r5)
            android.graphics.Path r6 = r4.f3067a
            boolean r6 = r6.isEmpty()
            r4.h()
            r0.h()
            r4 = r6 ^ 1
            return r4
    }

    public static final boolean r(float r2, float r3, float r4, float r5, long r6) {
            float r2 = r2 - r4
            float r3 = r3 - r5
            r4 = 32
            long r4 = r6 >> r4
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r6 & r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r2 = r2 * r2
            float r4 = r4 * r4
            float r2 = r2 / r4
            float r3 = r3 * r3
            float r5 = r5 * r5
            float r3 = r3 / r5
            float r3 = r3 + r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public static final void s(float[] r21, float[] r22) {
            r0 = r21
            r1 = r22
            r2 = 0
            float r3 = g(r1, r2, r0, r2)
            r4 = 1
            float r5 = g(r1, r2, r0, r4)
            r6 = 2
            float r7 = g(r1, r2, r0, r6)
            r8 = 3
            float r9 = g(r1, r2, r0, r8)
            float r10 = g(r1, r4, r0, r2)
            float r11 = g(r1, r4, r0, r4)
            float r12 = g(r1, r4, r0, r6)
            float r13 = g(r1, r4, r0, r8)
            float r14 = g(r1, r6, r0, r2)
            float r15 = g(r1, r6, r0, r4)
            float r16 = g(r1, r6, r0, r6)
            float r17 = g(r1, r6, r0, r8)
            float r18 = g(r1, r8, r0, r2)
            float r19 = g(r1, r8, r0, r4)
            float r20 = g(r1, r8, r0, r6)
            float r1 = g(r1, r8, r0, r8)
            r0[r2] = r3
            r0[r4] = r5
            r0[r6] = r7
            r0[r8] = r9
            r2 = 4
            r0[r2] = r10
            r2 = 5
            r0[r2] = r11
            r2 = 6
            r0[r2] = r12
            r2 = 7
            r0[r2] = r13
            r2 = 8
            r0[r2] = r14
            r2 = 9
            r0[r2] = r15
            r2 = 10
            r0[r2] = r16
            r2 = 11
            r0[r2] = r17
            r2 = 12
            r0[r2] = r18
            r2 = 13
            r0[r2] = r19
            r2 = 14
            r0[r2] = r20
            r2 = 15
            r0[r2] = r1
            return
    }

    public static final x2.h t(y1.r0 r3, int r4) {
            java.util.HashMap r3 = r3.getLayoutNodeToHolder()
            java.util.Set r3 = r3.entrySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            r2 = r0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            x1.f0 r2 = (x1.f0) r2
            int r2 = r2.f20890h
            if (r2 != r4) goto Le
            goto L28
        L27:
            r0 = r1
        L28:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L33
            java.lang.Object r3 = r0.getValue()
            x2.h r3 = (x2.h) r3
            return r3
        L33:
            return r1
    }

    public static final java.lang.String u(java.lang.Object r2) {
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r0.isAnonymousClass()
            if (r0 == 0) goto L13
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            goto L1b
        L13:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 64
            r1.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r0 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = "%07x"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    public static final java.lang.String v(int r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "android.widget.Button"
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            java.lang.String r1 = "android.widget.CheckBox"
            return r1
        Lb:
            r0 = 3
            if (r1 != r0) goto L11
            java.lang.String r1 = "android.widget.RadioButton"
            return r1
        L11:
            r0 = 5
            if (r1 != r0) goto L17
            java.lang.String r1 = "android.widget.ImageView"
            return r1
        L17:
            r0 = 6
            if (r1 != r0) goto L1d
            java.lang.String r1 = "android.widget.Spinner"
            return r1
        L1d:
            r0 = 7
            if (r1 != r0) goto L23
            java.lang.String r1 = "android.widget.NumberPicker"
            return r1
        L23:
            r1 = 0
            return r1
    }
}
