package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class eu extends android.graphics.drawable.Drawable implements defpackage.q30 {
    public static final android.graphics.Paint w = null;
    public defpackage.du a;
    public final defpackage.o30[] b;
    public final defpackage.o30[] c;
    public final java.util.BitSet d;
    public boolean e;
    public final android.graphics.Matrix f;
    public final android.graphics.Path g;
    public final android.graphics.Path h;
    public final android.graphics.RectF i;
    public final android.graphics.RectF j;
    public final android.graphics.Region k;
    public final android.graphics.Region l;
    public defpackage.f30 m;
    public final android.graphics.Paint n;
    public final android.graphics.Paint o;
    public final defpackage.d30 p;
    public final defpackage.l0 q;
    public final defpackage.h30 r;
    public android.graphics.PorterDuffColorFilter s;
    public android.graphics.PorterDuffColorFilter t;
    public final android.graphics.RectF u;
    public final boolean v;

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            defpackage.eu.w = r0
            r1 = -1
            r0.setColor(r1)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
            r1.<init>(r2)
            r0.setXfermode(r1)
            return
    }

    public eu() {
            r1 = this;
            f30 r0 = new f30
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public eu(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            e30 r1 = defpackage.f30.b(r1, r2, r3, r4)
            f30 r1 = r1.a()
            r0.<init>(r1)
            return
    }

    public eu(defpackage.du r6) {
            r5 = this;
            r5.<init>()
            r0 = 4
            o30[] r1 = new defpackage.o30[r0]
            r5.b = r1
            o30[] r0 = new defpackage.o30[r0]
            r5.c = r0
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 8
            r0.<init>(r1)
            r5.d = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r5.f = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.g = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.h = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.i = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.j = r0
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>()
            r5.k = r0
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>()
            r5.l = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r5.n = r0
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r1)
            r5.o = r2
            d30 r3 = new d30
            r3.<init>()
            r5.p = r3
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r3 != r4) goto L6d
            h30 r3 = defpackage.g30.a
            goto L72
        L6d:
            h30 r3 = new h30
            r3.<init>()
        L72:
            r5.r = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r5.u = r3
            r5.v = r1
            r5.a = r6
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r0.setStyle(r6)
            r5.l()
            int[] r6 = r5.getState()
            r5.k(r6)
            l0 r6 = new l0
            r0 = 20
            r6.<init>(r0, r5)
            r5.q = r6
            return
    }

    public eu(defpackage.f30 r2) {
            r1 = this;
            du r0 = new du
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public final void a(android.graphics.RectF r8, android.graphics.Path r9) {
            r7 = this;
            du r0 = r7.a
            f30 r2 = r0.a
            float r3 = r0.i
            l0 r5 = r7.q
            h30 r1 = r7.r
            r4 = r8
            r6 = r9
            r1.a(r2, r3, r4, r5, r6)
            du r8 = r7.a
            float r8 = r8.h
            r9 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L34
            android.graphics.Matrix r8 = r7.f
            r8.reset()
            du r9 = r7.a
            float r9 = r9.h
            float r0 = r4.width()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r4.height()
            float r2 = r2 / r1
            r8.setScale(r9, r9, r0, r2)
            r6.transform(r8)
        L34:
            android.graphics.RectF r8 = r7.u
            r9 = 1
            r6.computeBounds(r8, r9)
            return
    }

    public final int b(int r7) {
            r6 = this;
            du r0 = r6.a
            float r1 = r0.m
            r2 = 0
            float r1 = r1 + r2
            float r3 = r0.l
            float r1 = r1 + r3
            xh r0 = r0.b
            if (r0 == 0) goto L62
            boolean r3 = r0.a
            if (r3 == 0) goto L62
            r3 = 255(0xff, float:3.57E-43)
            int r4 = defpackage.ib.d(r7, r3)
            int r5 = r0.d
            if (r4 != r5) goto L62
            float r4 = r0.e
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L3d
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 > 0) goto L26
            goto L3d
        L26:
            float r1 = r1 / r4
            double r4 = (double) r1
            double r4 = java.lang.Math.log1p(r4)
            float r1 = (float) r4
            r4 = 1083179008(0x40900000, float:4.5)
            float r1 = r1 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 + r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r1, r4)
            goto L3e
        L3d:
            r1 = r2
        L3e:
            int r4 = android.graphics.Color.alpha(r7)
            int r7 = defpackage.ib.d(r7, r3)
            int r3 = r0.b
            int r7 = defpackage.zt.E(r1, r7, r3)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L5e
            int r0 = r0.c
            if (r0 == 0) goto L5e
            int r1 = defpackage.xh.f
            int r0 = defpackage.ib.d(r0, r1)
            int r7 = defpackage.ib.b(r0, r7)
        L5e:
            int r7 = defpackage.ib.d(r7, r4)
        L62:
            return r7
    }

    public final void c(android.graphics.Canvas r9) {
            r8 = this;
            java.util.BitSet r0 = r8.d
            int r0 = r0.cardinality()
            if (r0 <= 0) goto Lf
            java.lang.String r0 = "eu"
            java.lang.String r1 = "Compatibility shadow requested but can't be drawn for all operations in this shape."
            android.util.Log.w(r0, r1)
        Lf:
            du r0 = r8.a
            int r0 = r0.o
            android.graphics.Path r1 = r8.g
            d30 r2 = r8.p
            if (r0 == 0) goto L1e
            android.graphics.Paint r0 = r2.a
            r9.drawPath(r1, r0)
        L1e:
            r0 = 0
            r3 = r0
        L20:
            r4 = 4
            if (r3 >= r4) goto L3e
            o30[] r4 = r8.b
            r4 = r4[r3]
            du r5 = r8.a
            int r5 = r5.n
            android.graphics.Matrix r6 = defpackage.o30.b
            r4.a(r6, r2, r5, r9)
            o30[] r4 = r8.c
            r4 = r4[r3]
            du r5 = r8.a
            int r5 = r5.n
            r4.a(r6, r2, r5, r9)
            int r3 = r3 + 1
            goto L20
        L3e:
            boolean r2 = r8.v
            if (r2 == 0) goto L72
            du r2 = r8.a
            int r2 = r2.o
            double r2 = (double) r2
            double r4 = (double) r0
            double r6 = java.lang.Math.toRadians(r4)
            double r6 = java.lang.Math.sin(r6)
            double r6 = r6 * r2
            int r0 = (int) r6
            du r2 = r8.a
            int r2 = r2.o
            double r2 = (double) r2
            double r4 = java.lang.Math.toRadians(r4)
            double r4 = java.lang.Math.cos(r4)
            double r4 = r4 * r2
            int r2 = (int) r4
            int r3 = -r0
            float r3 = (float) r3
            int r4 = -r2
            float r4 = (float) r4
            r9.translate(r3, r4)
            android.graphics.Paint r3 = defpackage.eu.w
            r9.drawPath(r1, r3)
            float r0 = (float) r0
            float r1 = (float) r2
            r9.translate(r0, r1)
        L72:
            return
    }

    public final void d(android.graphics.Canvas r2, android.graphics.Paint r3, android.graphics.Path r4, defpackage.f30 r5, android.graphics.RectF r6) {
            r1 = this;
            boolean r0 = r5.d(r6)
            if (r0 == 0) goto L15
            de r4 = r5.f
            float r4 = r4.a(r6)
            du r5 = r1.a
            float r5 = r5.i
            float r4 = r4 * r5
            r2.drawRoundRect(r6, r4, r4, r3)
            return
        L15:
            r2.drawPath(r4, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            android.graphics.PorterDuffColorFilter r2 = r0.s
            android.graphics.Paint r3 = r0.n
            r3.setColorFilter(r2)
            int r6 = r3.getAlpha()
            du r2 = r0.a
            int r2 = r2.k
            int r4 = r2 >>> 7
            int r2 = r2 + r4
            int r2 = r2 * r6
            int r2 = r2 >>> 8
            r3.setAlpha(r2)
            android.graphics.PorterDuffColorFilter r2 = r0.t
            android.graphics.Paint r7 = r0.o
            r7.setColorFilter(r2)
            du r2 = r0.a
            float r2 = r2.j
            r7.setStrokeWidth(r2)
            int r8 = r7.getAlpha()
            du r2 = r0.a
            int r2 = r2.k
            int r4 = r2 >>> 7
            int r2 = r2 + r4
            int r2 = r2 * r8
            int r2 = r2 >>> 8
            r7.setAlpha(r2)
            boolean r2 = r0.e
            r4 = 0
            r5 = r2
            r2 = r3
            android.graphics.Path r3 = r0.g
            if (r5 == 0) goto Ld1
            boolean r5 = r0.g()
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            if (r5 == 0) goto L53
            float r5 = r7.getStrokeWidth()
            float r5 = r5 / r10
            goto L54
        L53:
            r5 = r9
        L54:
            float r5 = -r5
            du r11 = r0.a
            f30 r11 = r11.a
            e30 r12 = r11.e()
            de r13 = r11.e
            boolean r14 = r13 instanceof defpackage.l00
            if (r14 == 0) goto L64
            goto L6a
        L64:
            z1 r14 = new z1
            r14.<init>(r5, r13)
            r13 = r14
        L6a:
            r12.e = r13
            de r13 = r11.f
            boolean r14 = r13 instanceof defpackage.l00
            if (r14 == 0) goto L73
            goto L79
        L73:
            z1 r14 = new z1
            r14.<init>(r5, r13)
            r13 = r14
        L79:
            r12.f = r13
            de r13 = r11.h
            boolean r14 = r13 instanceof defpackage.l00
            if (r14 == 0) goto L82
            goto L88
        L82:
            z1 r14 = new z1
            r14.<init>(r5, r13)
            r13 = r14
        L88:
            r12.h = r13
            de r11 = r11.g
            boolean r13 = r11 instanceof defpackage.l00
            if (r13 == 0) goto L91
            goto L97
        L91:
            z1 r13 = new z1
            r13.<init>(r5, r11)
            r11 = r13
        L97:
            r12.g = r11
            f30 r14 = r12.a()
            r0.m = r14
            du r5 = r0.a
            float r15 = r5.i
            android.graphics.RectF r5 = r0.f()
            android.graphics.RectF r11 = r0.j
            r11.set(r5)
            boolean r5 = r0.g()
            if (r5 == 0) goto Lb8
            float r5 = r7.getStrokeWidth()
            float r9 = r5 / r10
        Lb8:
            r11.inset(r9, r9)
            android.graphics.Path r5 = r0.h
            r17 = 0
            h30 r13 = r0.r
            r18 = r5
            r16 = r11
            r13.a(r14, r15, r16, r17, r18)
            android.graphics.RectF r5 = r0.f()
            r0.a(r5, r3)
            r0.e = r4
        Ld1:
            du r5 = r0.a
            r5.getClass()
            int r5 = r5.n
            if (r5 <= 0) goto L1a5
            int r5 = android.os.Build.VERSION.SDK_INT
            du r9 = r0.a
            f30 r9 = r9.a
            android.graphics.RectF r10 = r0.f()
            boolean r9 = r9.d(r10)
            if (r9 != 0) goto L1a5
            boolean r9 = r3.isConvex()
            if (r9 != 0) goto L1a5
            r9 = 29
            if (r5 >= r9) goto L1a5
            r1.save()
            du r5 = r0.a
            int r5 = r5.o
            double r9 = (double) r5
            double r4 = (double) r4
            double r11 = java.lang.Math.toRadians(r4)
            double r11 = java.lang.Math.sin(r11)
            double r11 = r11 * r9
            int r9 = (int) r11
            du r10 = r0.a
            int r10 = r10.o
            double r10 = (double) r10
            double r4 = java.lang.Math.toRadians(r4)
            double r4 = java.lang.Math.cos(r4)
            double r4 = r4 * r10
            int r4 = (int) r4
            float r5 = (float) r9
            float r4 = (float) r4
            r1.translate(r5, r4)
            boolean r4 = r0.v
            if (r4 != 0) goto L127
            r19.c(r20)
            r1.restore()
            goto L1a5
        L127:
            android.graphics.RectF r4 = r0.u
            float r5 = r4.width()
            android.graphics.Rect r9 = r0.getBounds()
            int r9 = r9.width()
            float r9 = (float) r9
            float r5 = r5 - r9
            int r5 = (int) r5
            float r9 = r4.height()
            android.graphics.Rect r10 = r0.getBounds()
            int r10 = r10.height()
            float r10 = (float) r10
            float r9 = r9 - r10
            int r9 = (int) r9
            if (r5 < 0) goto L19d
            if (r9 < 0) goto L19d
            float r10 = r4.width()
            int r10 = (int) r10
            du r11 = r0.a
            int r11 = r11.n
            int r11 = r11 * 2
            int r11 = r11 + r10
            int r11 = r11 + r5
            float r4 = r4.height()
            int r4 = (int) r4
            du r10 = r0.a
            int r10 = r10.n
            int r10 = r10 * 2
            int r10 = r10 + r4
            int r10 = r10 + r9
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r11, r10, r4)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r4)
            android.graphics.Rect r11 = r0.getBounds()
            int r11 = r11.left
            du r12 = r0.a
            int r12 = r12.n
            int r11 = r11 - r12
            int r11 = r11 - r5
            float r5 = (float) r11
            android.graphics.Rect r11 = r0.getBounds()
            int r11 = r11.top
            du r12 = r0.a
            int r12 = r12.n
            int r11 = r11 - r12
            int r11 = r11 - r9
            float r9 = (float) r11
            float r11 = -r5
            float r12 = -r9
            r10.translate(r11, r12)
            r0.c(r10)
            r10 = 0
            r1.drawBitmap(r4, r5, r9, r10)
            r4.recycle()
            r1.restore()
            goto L1a5
        L19d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r1.<init>(r2)
            throw r1
        L1a5:
            du r4 = r0.a
            android.graphics.Paint$Style r5 = r4.p
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r5 == r9) goto L1b1
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL
            if (r5 != r9) goto L1ba
        L1b1:
            f30 r4 = r4.a
            android.graphics.RectF r5 = r0.f()
            r0.d(r1, r2, r3, r4, r5)
        L1ba:
            boolean r0 = r19.g()
            if (r0 == 0) goto L1c3
            r19.e(r20)
        L1c3:
            r2.setAlpha(r6)
            r7.setAlpha(r8)
            return
    }

    public void e(android.graphics.Canvas r7) {
            r6 = this;
            f30 r4 = r6.m
            android.graphics.RectF r0 = r6.f()
            android.graphics.RectF r5 = r6.j
            r5.set(r0)
            boolean r0 = r6.g()
            android.graphics.Paint r2 = r6.o
            if (r0 == 0) goto L1b
            float r0 = r2.getStrokeWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r5.inset(r0, r0)
            android.graphics.Path r3 = r6.h
            r0 = r6
            r1 = r7
            r0.d(r1, r2, r3, r4, r5)
            return
    }

    public final android.graphics.RectF f() {
            r2 = this;
            android.graphics.Rect r0 = r2.getBounds()
            android.graphics.RectF r1 = r2.i
            r1.set(r0)
            return r1
    }

    public final boolean g() {
            r2 = this;
            du r0 = r2.a
            android.graphics.Paint$Style r0 = r0.p
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto Lc
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L19
        Lc:
            android.graphics.Paint r0 = r2.o
            float r0 = r0.getStrokeWidth()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L19
            r0 = 1
            return r0
        L19:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            du r0 = r1.a
            int r0 = r0.k
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            du r0 = r1.a
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r4) {
            r3 = this;
            du r0 = r3.a
            r0.getClass()
            du r0 = r3.a
            f30 r0 = r0.a
            android.graphics.RectF r1 = r3.f()
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L2e
            du r0 = r3.a
            f30 r0 = r0.a
            de r0 = r0.e
            android.graphics.RectF r1 = r3.f()
            float r0 = r0.a(r1)
            du r1 = r3.a
            float r1 = r1.i
            float r0 = r0 * r1
            android.graphics.Rect r1 = r3.getBounds()
            r4.setRoundRect(r1, r0)
            return
        L2e:
            android.graphics.RectF r0 = r3.f()
            android.graphics.Path r1 = r3.g
            r3.a(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L41
            defpackage.d0.n(r4, r1)
            return
        L41:
            r2 = 29
            if (r0 < r2) goto L49
            r4.setConvexPath(r1)     // Catch: java.lang.IllegalArgumentException -> L48
        L48:
            return
        L49:
            boolean r0 = r1.isConvex()
            if (r0 == 0) goto L52
            r4.setConvexPath(r1)
        L52:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            du r0 = r1.a
            android.graphics.Rect r0 = r0.g
            if (r0 == 0) goto Lb
            r2.set(r0)
            r2 = 1
            return r2
        Lb:
            boolean r2 = super.getPadding(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
            r3 = this;
            android.graphics.Rect r0 = r3.getBounds()
            android.graphics.Region r1 = r3.k
            r1.set(r0)
            android.graphics.RectF r0 = r3.f()
            android.graphics.Path r2 = r3.g
            r3.a(r0, r2)
            android.graphics.Region r0 = r3.l
            r0.setPath(r2, r1)
            android.graphics.Region$Op r2 = android.graphics.Region.Op.DIFFERENCE
            r1.op(r0, r2)
            return r1
    }

    public final void h(android.content.Context r3) {
            r2 = this;
            du r0 = r2.a
            xh r1 = new xh
            r1.<init>(r3)
            r0.b = r1
            r2.m()
            return
    }

    public final void i(float r3) {
            r2 = this;
            du r0 = r2.a
            float r1 = r0.m
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Ld
            r0.m = r3
            r2.m()
        Ld:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
            r1 = this;
            r0 = 1
            r1.e = r0
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L32
            du r0 = r1.a
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L12
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L32
        L12:
            du r0 = r1.a
            r0.getClass()
            du r0 = r1.a
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L23
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L32
        L23:
            du r0 = r1.a
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L30
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L30
            goto L32
        L30:
            r0 = 0
            return r0
        L32:
            r0 = 1
            return r0
    }

    public final void j(android.content.res.ColorStateList r3) {
            r2 = this;
            du r0 = r2.a
            android.content.res.ColorStateList r1 = r0.c
            if (r1 == r3) goto Lf
            r0.c = r3
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        Lf:
            return
    }

    public final boolean k(int[] r6) {
            r5 = this;
            du r0 = r5.a
            android.content.res.ColorStateList r0 = r0.c
            r1 = 1
            if (r0 == 0) goto L1c
            android.graphics.Paint r0 = r5.n
            int r2 = r0.getColor()
            du r3 = r5.a
            android.content.res.ColorStateList r3 = r3.c
            int r3 = r3.getColorForState(r6, r2)
            if (r2 == r3) goto L1c
            r0.setColor(r3)
            r0 = r1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            du r2 = r5.a
            android.content.res.ColorStateList r2 = r2.d
            if (r2 == 0) goto L37
            android.graphics.Paint r2 = r5.o
            int r3 = r2.getColor()
            du r4 = r5.a
            android.content.res.ColorStateList r4 = r4.d
            int r6 = r4.getColorForState(r6, r3)
            if (r3 == r6) goto L37
            r2.setColor(r6)
            return r1
        L37:
            return r0
    }

    public final boolean l() {
            r7 = this;
            android.graphics.PorterDuffColorFilter r0 = r7.s
            android.graphics.PorterDuffColorFilter r1 = r7.t
            du r2 = r7.a
            android.content.res.ColorStateList r3 = r2.e
            android.graphics.PorterDuff$Mode r2 = r2.f
            r4 = 1
            if (r3 == 0) goto L23
            if (r2 != 0) goto L10
            goto L23
        L10:
            int[] r5 = r7.getState()
            r6 = 0
            int r3 = r3.getColorForState(r5, r6)
            int r3 = r7.b(r3)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r3, r2)
            goto L38
        L23:
            android.graphics.Paint r2 = r7.n
            int r2 = r2.getColor()
            int r3 = r7.b(r2)
            if (r3 == r2) goto L37
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r5.<init>(r3, r2)
            goto L38
        L37:
            r5 = 0
        L38:
            r7.s = r5
            du r2 = r7.a
            r2.getClass()
            r2 = 0
            r7.t = r2
            du r2 = r7.a
            r2.getClass()
            android.graphics.PorterDuffColorFilter r2 = r7.s
            boolean r0 = defpackage.pw.a(r0, r2)
            if (r0 == 0) goto L5a
            android.graphics.PorterDuffColorFilter r0 = r7.t
            boolean r0 = defpackage.pw.a(r1, r0)
            if (r0 != 0) goto L58
            goto L5a
        L58:
            r0 = 0
            return r0
        L5a:
            return r4
    }

    public final void m() {
            r4 = this;
            du r0 = r4.a
            float r1 = r0.m
            r2 = 0
            float r1 = r1 + r2
            r2 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r1
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.n = r2
            du r0 = r4.a
            r2 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r0.o = r1
            r4.l()
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            du r0 = new du
            du r1 = r2.a
            r0.<init>(r1)
            r2.a = r0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            r0 = 1
            r1.e = r0
            super.onBoundsChange(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r2) {
            r1 = this;
            boolean r2 = r1.k(r2)
            boolean r0 = r1.l()
            if (r2 != 0) goto Lf
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L15
            r1.invalidateSelf()
        L15:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r3) {
            r2 = this;
            du r0 = r2.a
            int r1 = r0.k
            if (r1 == r3) goto Lb
            r0.k = r3
            super.invalidateSelf()
        Lb:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            du r1 = r0.a
            r1.getClass()
            super.invalidateSelf()
            return
    }

    @Override // defpackage.q30
    public final void setShapeAppearanceModel(defpackage.f30 r2) {
            r1 = this;
            du r0 = r1.a
            r0.a = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            du r0 = r1.a
            r0.e = r2
            r1.l()
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            du r0 = r2.a
            android.graphics.PorterDuff$Mode r1 = r0.f
            if (r1 == r3) goto Le
            r0.f = r3
            r2.l()
            super.invalidateSelf()
        Le:
            return
    }
}
