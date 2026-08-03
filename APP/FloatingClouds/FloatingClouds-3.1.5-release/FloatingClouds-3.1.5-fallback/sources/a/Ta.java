package a;

/* JADX INFO: loaded from: classes.dex */
public class Ta extends android.graphics.drawable.Drawable implements a.Zd {
    public static final android.graphics.Paint x = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.Ta.b f278a;
    public final a.Yd.f[] b;
    public final a.Yd.f[] c;
    public final java.util.BitSet d;
    public boolean e;
    public final android.graphics.Matrix f;
    public final android.graphics.Path g;
    public final android.graphics.Path h;
    public final android.graphics.RectF i;
    public final android.graphics.RectF j;
    public final android.graphics.Region k;
    public final android.graphics.Region l;
    public a.Vd m;
    public final android.graphics.Paint n;
    public final android.graphics.Paint o;
    public final a.Ud p;
    public final a.Ta.a q;
    public final a.Wd r;
    public android.graphics.PorterDuffColorFilter s;
    public android.graphics.PorterDuffColorFilter t;
    public int u;
    public final android.graphics.RectF v;
    public final boolean w;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Ta f279a;

        public a(a.Ta r1) {
                r0 = this;
                r0.<init>()
                r0.f279a = r1
                return
        }
    }

    public static class b extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.Vd f280a;
        public a.J5 b;
        public android.content.res.ColorStateList c;
        public android.content.res.ColorStateList d;
        public android.content.res.ColorStateList e;
        public android.graphics.PorterDuff.Mode f;
        public android.graphics.Rect g;
        public final float h;
        public float i;
        public float j;
        public int k;
        public float l;
        public float m;
        public int n;
        public int o;
        public final android.graphics.Paint.Style p;

        public b(a.Ta.b r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.c = r0
                r2.d = r0
                r2.e = r0
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.f = r1
                r2.g = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.h = r0
                r2.i = r0
                r0 = 255(0xff, float:3.57E-43)
                r2.k = r0
                r0 = 0
                r2.l = r0
                r2.m = r0
                r0 = 0
                r2.n = r0
                r2.o = r0
                android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
                r2.p = r0
                a.Vd r0 = r3.f280a
                r2.f280a = r0
                a.J5 r0 = r3.b
                r2.b = r0
                float r0 = r3.j
                r2.j = r0
                android.content.res.ColorStateList r0 = r3.c
                r2.c = r0
                android.content.res.ColorStateList r0 = r3.d
                r2.d = r0
                android.graphics.PorterDuff$Mode r0 = r3.f
                r2.f = r0
                android.content.res.ColorStateList r0 = r3.e
                r2.e = r0
                int r0 = r3.k
                r2.k = r0
                float r0 = r3.h
                r2.h = r0
                int r0 = r3.o
                r2.o = r0
                float r0 = r3.i
                r2.i = r0
                float r0 = r3.l
                r2.l = r0
                float r0 = r3.m
                r2.m = r0
                int r0 = r3.n
                r2.n = r0
                android.graphics.Paint$Style r0 = r3.p
                r2.p = r0
                android.graphics.Rect r0 = r3.g
                if (r0 == 0) goto L71
                android.graphics.Rect r0 = new android.graphics.Rect
                android.graphics.Rect r3 = r3.g
                r0.<init>(r3)
                r2.g = r0
            L71:
                return
        }

        public b(a.Vd r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.c = r0
                r2.d = r0
                r2.e = r0
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.f = r1
                r2.g = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.h = r1
                r2.i = r1
                r1 = 255(0xff, float:3.57E-43)
                r2.k = r1
                r1 = 0
                r2.l = r1
                r2.m = r1
                r1 = 0
                r2.n = r1
                r2.o = r1
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
                r2.p = r1
                r2.f280a = r3
                r2.b = r0
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                a.Ta r0 = new a.Ta
                r0.<init>(r2)
                r1 = 1
                r0.e = r1
                return r0
        }
    }

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            a.Ta.x = r0
            r1 = -1
            r0.setColor(r1)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
            r1.<init>(r2)
            r0.setXfermode(r1)
            return
    }

    public Ta() {
            r1 = this;
            a.Vd r0 = new a.Vd
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public Ta(a.Ta.b r6) {
            r5 = this;
            r5.<init>()
            r0 = 4
            a.Yd$f[] r1 = new a.Yd.f[r0]
            r5.b = r1
            a.Yd$f[] r0 = new a.Yd.f[r0]
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
            a.Ud r3 = new a.Ud
            r3.<init>()
            r5.p = r3
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r3 != r4) goto L6d
            a.Wd r3 = a.Wd.a.f328a
            goto L72
        L6d:
            a.Wd r3 = new a.Wd
            r3.<init>()
        L72:
            r5.r = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r5.v = r3
            r5.w = r1
            r5.f278a = r6
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r0.setStyle(r6)
            r5.m()
            int[] r6 = r5.getState()
            r5.l(r6)
            a.Ta$a r6 = new a.Ta$a
            r6.<init>(r5)
            r5.q = r6
            return
    }

    public Ta(a.Vd r2) {
            r1 = this;
            a.Ta$b r0 = new a.Ta$b
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public Ta(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            a.Vd$a r1 = a.Vd.b(r1, r2, r3, r4)
            a.Vd r1 = r1.a()
            r0.<init>(r1)
            return
    }

    public final void b(android.graphics.RectF r8, android.graphics.Path r9) {
            r7 = this;
            a.Ta$b r0 = r7.f278a
            a.Vd r2 = r0.f280a
            float r3 = r0.i
            a.Ta$a r5 = r7.q
            a.Wd r1 = r7.r
            r4 = r8
            r6 = r9
            r1.a(r2, r3, r4, r5, r6)
            a.Ta$b r8 = r7.f278a
            float r8 = r8.h
            r9 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L34
            android.graphics.Matrix r8 = r7.f
            r8.reset()
            a.Ta$b r9 = r7.f278a
            float r9 = r9.h
            float r0 = r4.width()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r4.height()
            float r2 = r2 / r1
            r8.setScale(r9, r9, r0, r2)
            r6.transform(r8)
        L34:
            android.graphics.RectF r8 = r7.v
            r9 = 1
            r6.computeBounds(r8, r9)
            return
    }

    public final int c(int r7) {
            r6 = this;
            a.Ta$b r0 = r6.f278a
            float r1 = r0.m
            r2 = 0
            float r1 = r1 + r2
            float r3 = r0.l
            float r1 = r1 + r3
            a.J5 r0 = r0.b
            if (r0 == 0) goto L62
            boolean r3 = r0.f134a
            if (r3 == 0) goto L62
            r3 = 255(0xff, float:3.57E-43)
            int r4 = a.C0419v3.d(r7, r3)
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
            int r7 = a.C0419v3.d(r7, r3)
            int r3 = r0.b
            int r7 = a.Na.d(r7, r3, r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L5e
            int r0 = r0.c
            if (r0 == 0) goto L5e
            int r1 = a.J5.f
            int r0 = a.C0419v3.d(r0, r1)
            int r7 = a.C0419v3.b(r0, r7)
        L5e:
            int r7 = a.C0419v3.d(r7, r4)
        L62:
            return r7
    }

    public final void d(android.graphics.Canvas r9) {
            r8 = this;
            java.util.BitSet r0 = r8.d
            int r0 = r0.cardinality()
            if (r0 <= 0) goto Lf
            java.lang.String r0 = "Ta"
            java.lang.String r1 = "Compatibility shadow requested but can't be drawn for all operations in this shape."
            android.util.Log.w(r0, r1)
        Lf:
            a.Ta$b r0 = r8.f278a
            int r0 = r0.o
            android.graphics.Path r1 = r8.g
            a.Ud r2 = r8.p
            if (r0 == 0) goto L1e
            android.graphics.Paint r0 = r2.f293a
            r9.drawPath(r1, r0)
        L1e:
            r0 = 0
            r3 = r0
        L20:
            r4 = 4
            if (r3 >= r4) goto L3e
            a.Yd$f[] r4 = r8.b
            r4 = r4[r3]
            a.Ta$b r5 = r8.f278a
            int r5 = r5.n
            android.graphics.Matrix r6 = a.Yd.f.b
            r4.a(r6, r2, r5, r9)
            a.Yd$f[] r4 = r8.c
            r4 = r4[r3]
            a.Ta$b r5 = r8.f278a
            int r5 = r5.n
            r4.a(r6, r2, r5, r9)
            int r3 = r3 + 1
            goto L20
        L3e:
            boolean r2 = r8.w
            if (r2 == 0) goto L72
            a.Ta$b r2 = r8.f278a
            int r2 = r2.o
            double r2 = (double) r2
            double r4 = (double) r0
            double r6 = java.lang.Math.toRadians(r4)
            double r6 = java.lang.Math.sin(r6)
            double r6 = r6 * r2
            int r0 = (int) r6
            a.Ta$b r2 = r8.f278a
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
            android.graphics.Paint r3 = a.Ta.x
            r9.drawPath(r1, r3)
            float r0 = (float) r0
            float r1 = (float) r2
            r9.translate(r0, r1)
        L72:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            android.graphics.Paint r2 = r0.n
            android.graphics.PorterDuffColorFilter r3 = r0.s
            r2.setColorFilter(r3)
            int r6 = r2.getAlpha()
            a.Ta$b r3 = r0.f278a
            int r3 = r3.k
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r6
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            android.graphics.Paint r7 = r0.o
            android.graphics.PorterDuffColorFilter r3 = r0.t
            r7.setColorFilter(r3)
            a.Ta$b r3 = r0.f278a
            float r3 = r3.j
            r7.setStrokeWidth(r3)
            int r8 = r7.getAlpha()
            a.Ta$b r3 = r0.f278a
            int r3 = r3.k
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r8
            int r3 = r3 >>> 8
            r7.setAlpha(r3)
            boolean r3 = r0.e
            r4 = r3
            android.graphics.Path r3 = r0.g
            r5 = 0
            if (r4 == 0) goto Lcf
            boolean r4 = r0.h()
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L52
            float r4 = r7.getStrokeWidth()
            float r4 = r4 / r10
            goto L53
        L52:
            r4 = r9
        L53:
            float r4 = -r4
            a.Ta$b r11 = r0.f278a
            a.Vd r11 = r11.f280a
            a.Vd$a r12 = r11.e()
            a.w4 r13 = r11.e
            boolean r14 = r13 instanceof a.Xc
            if (r14 == 0) goto L63
            goto L69
        L63:
            a.n0 r14 = new a.n0
            r14.<init>(r4, r13)
            r13 = r14
        L69:
            r12.e = r13
            a.w4 r13 = r11.f
            boolean r14 = r13 instanceof a.Xc
            if (r14 == 0) goto L72
            goto L78
        L72:
            a.n0 r14 = new a.n0
            r14.<init>(r4, r13)
            r13 = r14
        L78:
            r12.f = r13
            a.w4 r13 = r11.h
            boolean r14 = r13 instanceof a.Xc
            if (r14 == 0) goto L81
            goto L87
        L81:
            a.n0 r14 = new a.n0
            r14.<init>(r4, r13)
            r13 = r14
        L87:
            r12.h = r13
            a.w4 r11 = r11.g
            boolean r13 = r11 instanceof a.Xc
            if (r13 == 0) goto L90
            goto L96
        L90:
            a.n0 r13 = new a.n0
            r13.<init>(r4, r11)
            r11 = r13
        L96:
            r12.g = r11
            a.Vd r14 = r12.a()
            r0.m = r14
            a.Ta$b r4 = r0.f278a
            float r15 = r4.i
            android.graphics.RectF r4 = r0.j
            android.graphics.RectF r11 = r0.g()
            r4.set(r11)
            boolean r11 = r0.h()
            if (r11 == 0) goto Lb6
            float r9 = r7.getStrokeWidth()
            float r9 = r9 / r10
        Lb6:
            r4.inset(r9, r9)
            android.graphics.Path r9 = r0.h
            r17 = 0
            a.Wd r13 = r0.r
            r16 = r4
            r18 = r9
            r13.a(r14, r15, r16, r17, r18)
            android.graphics.RectF r4 = r0.g()
            r0.b(r4, r3)
            r0.e = r5
        Lcf:
            a.Ta$b r4 = r0.f278a
            r4.getClass()
            int r4 = r4.n
            if (r4 <= 0) goto L1a3
            int r4 = android.os.Build.VERSION.SDK_INT
            a.Ta$b r9 = r0.f278a
            a.Vd r9 = r9.f280a
            android.graphics.RectF r10 = r0.g()
            boolean r9 = r9.d(r10)
            if (r9 != 0) goto L1a3
            boolean r9 = r3.isConvex()
            if (r9 != 0) goto L1a3
            r9 = 29
            if (r4 >= r9) goto L1a3
            r1.save()
            a.Ta$b r4 = r0.f278a
            int r4 = r4.o
            double r9 = (double) r4
            double r4 = (double) r5
            double r11 = java.lang.Math.toRadians(r4)
            double r11 = java.lang.Math.sin(r11)
            double r11 = r11 * r9
            int r9 = (int) r11
            a.Ta$b r10 = r0.f278a
            int r10 = r10.o
            double r10 = (double) r10
            double r4 = java.lang.Math.toRadians(r4)
            double r4 = java.lang.Math.cos(r4)
            double r4 = r4 * r10
            int r4 = (int) r4
            float r5 = (float) r9
            float r4 = (float) r4
            r1.translate(r5, r4)
            boolean r4 = r0.w
            if (r4 != 0) goto L125
            r19.d(r20)
            r1.restore()
            goto L1a3
        L125:
            android.graphics.RectF r4 = r0.v
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
            if (r5 < 0) goto L19b
            if (r9 < 0) goto L19b
            float r10 = r4.width()
            int r10 = (int) r10
            a.Ta$b r11 = r0.f278a
            int r11 = r11.n
            int r11 = r11 * 2
            int r11 = r11 + r10
            int r11 = r11 + r5
            float r4 = r4.height()
            int r4 = (int) r4
            a.Ta$b r10 = r0.f278a
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
            a.Ta$b r12 = r0.f278a
            int r12 = r12.n
            int r11 = r11 - r12
            int r11 = r11 - r5
            float r5 = (float) r11
            android.graphics.Rect r11 = r0.getBounds()
            int r11 = r11.top
            a.Ta$b r12 = r0.f278a
            int r12 = r12.n
            int r11 = r11 - r12
            int r11 = r11 - r9
            float r9 = (float) r11
            float r11 = -r5
            float r12 = -r9
            r10.translate(r11, r12)
            r0.d(r10)
            r10 = 0
            r1.drawBitmap(r4, r5, r9, r10)
            r4.recycle()
            r1.restore()
            goto L1a3
        L19b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r1.<init>(r2)
            throw r1
        L1a3:
            a.Ta$b r4 = r0.f278a
            android.graphics.Paint$Style r5 = r4.p
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r5 == r9) goto L1af
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL
            if (r5 != r9) goto L1b8
        L1af:
            a.Vd r4 = r4.f280a
            android.graphics.RectF r5 = r0.g()
            r0.e(r1, r2, r3, r4, r5)
        L1b8:
            boolean r0 = r19.h()
            if (r0 == 0) goto L1c1
            r19.f(r20)
        L1c1:
            r2.setAlpha(r6)
            r7.setAlpha(r8)
            return
    }

    public final void e(android.graphics.Canvas r2, android.graphics.Paint r3, android.graphics.Path r4, a.Vd r5, android.graphics.RectF r6) {
            r1 = this;
            boolean r0 = r5.d(r6)
            if (r0 == 0) goto L15
            a.w4 r4 = r5.f
            float r4 = r4.a(r6)
            a.Ta$b r5 = r1.f278a
            float r5 = r5.i
            float r4 = r4 * r5
            r2.drawRoundRect(r6, r4, r4, r3)
            return
        L15:
            r2.drawPath(r4, r3)
            return
    }

    public void f(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.Paint r2 = r6.o
            android.graphics.Path r3 = r6.h
            a.Vd r4 = r6.m
            android.graphics.RectF r5 = r6.j
            android.graphics.RectF r0 = r6.g()
            r5.set(r0)
            boolean r0 = r6.h()
            if (r0 == 0) goto L1d
            float r0 = r2.getStrokeWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r5.inset(r0, r0)
            r0 = r6
            r1 = r7
            r0.e(r1, r2, r3, r4, r5)
            return
    }

    public final android.graphics.RectF g() {
            r2 = this;
            android.graphics.RectF r0 = r2.i
            android.graphics.Rect r1 = r2.getBounds()
            r0.set(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            a.Ta$b r0 = r1.f278a
            int r0 = r0.k
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            a.Ta$b r0 = r1.f278a
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @android.annotation.TargetApi(21)
    public void getOutline(android.graphics.Outline r4) {
            r3 = this;
            a.Ta$b r0 = r3.f278a
            r0.getClass()
            a.Ta$b r0 = r3.f278a
            a.Vd r0 = r0.f280a
            android.graphics.RectF r1 = r3.g()
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L2e
            a.Ta$b r0 = r3.f278a
            a.Vd r0 = r0.f280a
            a.w4 r0 = r0.e
            android.graphics.RectF r1 = r3.g()
            float r0 = r0.a(r1)
            a.Ta$b r1 = r3.f278a
            float r1 = r1.i
            float r0 = r0 * r1
            android.graphics.Rect r1 = r3.getBounds()
            r4.setRoundRect(r1, r0)
            return
        L2e:
            android.graphics.RectF r0 = r3.g()
            android.graphics.Path r1 = r3.g
            r3.b(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L41
            a.C0475y5.b.a(r4, r1)
            return
        L41:
            r2 = 29
            if (r0 < r2) goto L49
            a.C0475y5.a.a(r4, r1)     // Catch: java.lang.IllegalArgumentException -> L52
            return
        L49:
            boolean r0 = r1.isConvex()
            if (r0 == 0) goto L52
            a.C0475y5.a.a(r4, r1)
        L52:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            a.Ta$b r0 = r1.f278a
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
            android.graphics.RectF r0 = r3.g()
            android.graphics.Path r2 = r3.g
            r3.b(r0, r2)
            android.graphics.Region r0 = r3.l
            r0.setPath(r2, r1)
            android.graphics.Region$Op r2 = android.graphics.Region.Op.DIFFERENCE
            r1.op(r0, r2)
            return r1
    }

    public final boolean h() {
            r2 = this;
            a.Ta$b r0 = r2.f278a
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

    public final void i(android.content.Context r3) {
            r2 = this;
            a.Ta$b r0 = r2.f278a
            a.J5 r1 = new a.J5
            r1.<init>(r3)
            r0.b = r1
            r2.n()
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
            a.Ta$b r0 = r1.f278a
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L12
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L32
        L12:
            a.Ta$b r0 = r1.f278a
            r0.getClass()
            a.Ta$b r0 = r1.f278a
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L23
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L32
        L23:
            a.Ta$b r0 = r1.f278a
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

    public final void j(float r3) {
            r2 = this;
            a.Ta$b r0 = r2.f278a
            float r1 = r0.m
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Ld
            r0.m = r3
            r2.n()
        Ld:
            return
    }

    public final void k(android.content.res.ColorStateList r3) {
            r2 = this;
            a.Ta$b r0 = r2.f278a
            android.content.res.ColorStateList r1 = r0.c
            if (r1 == r3) goto Lf
            r0.c = r3
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        Lf:
            return
    }

    public final boolean l(int[] r6) {
            r5 = this;
            a.Ta$b r0 = r5.f278a
            android.content.res.ColorStateList r0 = r0.c
            r1 = 1
            if (r0 == 0) goto L1c
            android.graphics.Paint r0 = r5.n
            int r2 = r0.getColor()
            a.Ta$b r3 = r5.f278a
            android.content.res.ColorStateList r3 = r3.c
            int r3 = r3.getColorForState(r6, r2)
            if (r2 == r3) goto L1c
            r0.setColor(r3)
            r0 = r1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            a.Ta$b r2 = r5.f278a
            android.content.res.ColorStateList r2 = r2.d
            if (r2 == 0) goto L37
            android.graphics.Paint r2 = r5.o
            int r3 = r2.getColor()
            a.Ta$b r4 = r5.f278a
            android.content.res.ColorStateList r4 = r4.d
            int r6 = r4.getColorForState(r6, r3)
            if (r3 == r6) goto L37
            r2.setColor(r6)
            return r1
        L37:
            return r0
    }

    public final boolean m() {
            r7 = this;
            android.graphics.PorterDuffColorFilter r0 = r7.s
            android.graphics.PorterDuffColorFilter r1 = r7.t
            a.Ta$b r2 = r7.f278a
            android.content.res.ColorStateList r3 = r2.e
            android.graphics.PorterDuff$Mode r2 = r2.f
            android.graphics.Paint r4 = r7.n
            r5 = 1
            if (r3 == 0) goto L27
            if (r2 != 0) goto L12
            goto L27
        L12:
            int[] r4 = r7.getState()
            r6 = 0
            int r3 = r3.getColorForState(r4, r6)
            int r3 = r7.c(r3)
            r7.u = r3
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r3, r2)
            goto L3c
        L27:
            int r2 = r4.getColor()
            int r3 = r7.c(r2)
            r7.u = r3
            if (r3 == r2) goto L3b
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r4.<init>(r3, r2)
            goto L3c
        L3b:
            r4 = 0
        L3c:
            r7.s = r4
            a.Ta$b r2 = r7.f278a
            r2.getClass()
            r2 = 0
            r7.t = r2
            a.Ta$b r2 = r7.f278a
            r2.getClass()
            android.graphics.PorterDuffColorFilter r2 = r7.s
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L5e
            android.graphics.PorterDuffColorFilter r0 = r7.t
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 != 0) goto L5c
            goto L5e
        L5c:
            r0 = 0
            return r0
        L5e:
            return r5
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            a.Ta$b r0 = new a.Ta$b
            a.Ta$b r1 = r2.f278a
            r0.<init>(r1)
            r2.f278a = r0
            return r2
    }

    public final void n() {
            r4 = this;
            a.Ta$b r0 = r4.f278a
            float r1 = r0.m
            r2 = 0
            float r1 = r1 + r2
            r2 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r1
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.n = r2
            a.Ta$b r0 = r4.f278a
            r2 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r0.o = r1
            r4.m()
            super.invalidateSelf()
            return
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
            boolean r2 = r1.l(r2)
            boolean r0 = r1.m()
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
            a.Ta$b r0 = r2.f278a
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
            a.Ta$b r1 = r0.f278a
            r1.getClass()
            super.invalidateSelf()
            return
    }

    @Override // a.Zd
    public final void setShapeAppearanceModel(a.Vd r2) {
            r1 = this;
            a.Ta$b r0 = r1.f278a
            r0.f280a = r2
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
            a.Ta$b r0 = r1.f278a
            r0.e = r2
            r1.m()
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            a.Ta$b r0 = r2.f278a
            android.graphics.PorterDuff$Mode r1 = r0.f
            if (r1 == r3) goto Le
            r0.f = r3
            r2.m()
            super.invalidateSelf()
        Le:
            return
    }
}
