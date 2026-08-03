package a;

/* JADX INFO: loaded from: classes.dex */
public final class Vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.C0435w1 f307a;
    public a.C0435w1 b;
    public a.C0435w1 c;
    public a.C0435w1 d;
    public a.InterfaceC0438w4 e;
    public a.InterfaceC0438w4 f;
    public a.InterfaceC0438w4 g;
    public a.InterfaceC0438w4 h;
    public a.H5 i;
    public a.H5 j;
    public a.H5 k;
    public a.H5 l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.C0435w1 f308a;
        public a.C0435w1 b;
        public a.C0435w1 c;
        public a.C0435w1 d;
        public a.InterfaceC0438w4 e;
        public a.InterfaceC0438w4 f;
        public a.InterfaceC0438w4 g;
        public a.InterfaceC0438w4 h;
        public a.H5 i;
        public a.H5 j;
        public a.H5 k;
        public a.H5 l;

        public a() {
                r2 = this;
                r2.<init>()
                a.Ad r0 = new a.Ad
                r0.<init>()
                r2.f308a = r0
                a.Ad r0 = new a.Ad
                r0.<init>()
                r2.b = r0
                a.Ad r0 = new a.Ad
                r0.<init>()
                r2.c = r0
                a.Ad r0 = new a.Ad
                r0.<init>()
                r2.d = r0
                a.s r0 = new a.s
                r1 = 0
                r0.<init>(r1)
                r2.e = r0
                a.s r0 = new a.s
                r0.<init>(r1)
                r2.f = r0
                a.s r0 = new a.s
                r0.<init>(r1)
                r2.g = r0
                a.s r0 = new a.s
                r0.<init>(r1)
                r2.h = r0
                a.H5 r0 = new a.H5
                r0.<init>()
                r2.i = r0
                a.H5 r0 = new a.H5
                r0.<init>()
                r2.j = r0
                a.H5 r0 = new a.H5
                r0.<init>()
                r2.k = r0
                a.H5 r0 = new a.H5
                r0.<init>()
                r2.l = r0
                return
        }

        public static float b(a.C0435w1 r2) {
                boolean r0 = r2 instanceof a.Ad
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r0 == 0) goto Lc
                a.Ad r2 = (a.Ad) r2
                r2.getClass()
                return r1
            Lc:
                boolean r0 = r2 instanceof a.E4
                if (r0 == 0) goto L15
                a.E4 r2 = (a.E4) r2
                r2.getClass()
            L15:
                return r1
        }

        public final a.Vd a() {
                r2 = this;
                a.Vd r0 = new a.Vd
                r0.<init>()
                a.w1 r1 = r2.f308a
                r0.f307a = r1
                a.w1 r1 = r2.b
                r0.b = r1
                a.w1 r1 = r2.c
                r0.c = r1
                a.w1 r1 = r2.d
                r0.d = r1
                a.w4 r1 = r2.e
                r0.e = r1
                a.w4 r1 = r2.f
                r0.f = r1
                a.w4 r1 = r2.g
                r0.g = r1
                a.w4 r1 = r2.h
                r0.h = r1
                a.H5 r1 = r2.i
                r0.i = r1
                a.H5 r1 = r2.j
                r0.j = r1
                a.H5 r1 = r2.k
                r0.k = r1
                a.H5 r1 = r2.l
                r0.l = r1
                return r0
        }
    }

    public Vd() {
            r2 = this;
            r2.<init>()
            a.Ad r0 = new a.Ad
            r0.<init>()
            r2.f307a = r0
            a.Ad r0 = new a.Ad
            r0.<init>()
            r2.b = r0
            a.Ad r0 = new a.Ad
            r0.<init>()
            r2.c = r0
            a.Ad r0 = new a.Ad
            r0.<init>()
            r2.d = r0
            a.s r0 = new a.s
            r1 = 0
            r0.<init>(r1)
            r2.e = r0
            a.s r0 = new a.s
            r0.<init>(r1)
            r2.f = r0
            a.s r0 = new a.s
            r0.<init>(r1)
            r2.g = r0
            a.s r0 = new a.s
            r0.<init>(r1)
            r2.h = r0
            a.H5 r0 = new a.H5
            r0.<init>()
            r2.i = r0
            a.H5 r0 = new a.H5
            r0.<init>()
            r2.j = r0
            a.H5 r0 = new a.H5
            r0.<init>()
            r2.k = r0
            a.H5 r0 = new a.H5
            r0.<init>()
            r2.l = r0
            return
    }

    public static a.Vd.a a(android.content.Context r6, int r7, int r8, a.C0361s r9) {
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r6, r7)
            if (r8 == 0) goto Ld
            android.view.ContextThemeWrapper r6 = new android.view.ContextThemeWrapper
            r6.<init>(r0, r8)
            r0 = r6
        Ld:
            int[] r6 = com.google.android.material.R.styleable.ShapeAppearance
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6)
            int r7 = com.google.android.material.R.styleable.ShapeAppearance_cornerFamily     // Catch: java.lang.Throwable -> L85
            r8 = 0
            int r7 = r6.getInt(r7, r8)     // Catch: java.lang.Throwable -> L85
            int r8 = com.google.android.material.R.styleable.ShapeAppearance_cornerFamilyTopLeft     // Catch: java.lang.Throwable -> L85
            int r8 = r6.getInt(r8, r7)     // Catch: java.lang.Throwable -> L85
            int r0 = com.google.android.material.R.styleable.ShapeAppearance_cornerFamilyTopRight     // Catch: java.lang.Throwable -> L85
            int r0 = r6.getInt(r0, r7)     // Catch: java.lang.Throwable -> L85
            int r1 = com.google.android.material.R.styleable.ShapeAppearance_cornerFamilyBottomRight     // Catch: java.lang.Throwable -> L85
            int r1 = r6.getInt(r1, r7)     // Catch: java.lang.Throwable -> L85
            int r2 = com.google.android.material.R.styleable.ShapeAppearance_cornerFamilyBottomLeft     // Catch: java.lang.Throwable -> L85
            int r7 = r6.getInt(r2, r7)     // Catch: java.lang.Throwable -> L85
            int r2 = com.google.android.material.R.styleable.ShapeAppearance_cornerSize     // Catch: java.lang.Throwable -> L85
            a.w4 r9 = c(r6, r2, r9)     // Catch: java.lang.Throwable -> L85
            int r2 = com.google.android.material.R.styleable.ShapeAppearance_cornerSizeTopLeft     // Catch: java.lang.Throwable -> L85
            a.w4 r2 = c(r6, r2, r9)     // Catch: java.lang.Throwable -> L85
            int r3 = com.google.android.material.R.styleable.ShapeAppearance_cornerSizeTopRight     // Catch: java.lang.Throwable -> L85
            a.w4 r3 = c(r6, r3, r9)     // Catch: java.lang.Throwable -> L85
            int r4 = com.google.android.material.R.styleable.ShapeAppearance_cornerSizeBottomRight     // Catch: java.lang.Throwable -> L85
            a.w4 r4 = c(r6, r4, r9)     // Catch: java.lang.Throwable -> L85
            int r5 = com.google.android.material.R.styleable.ShapeAppearance_cornerSizeBottomLeft     // Catch: java.lang.Throwable -> L85
            a.w4 r9 = c(r6, r5, r9)     // Catch: java.lang.Throwable -> L85
            a.Vd$a r5 = new a.Vd$a     // Catch: java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L85
            a.w1 r8 = a.C0282n9.l(r8)     // Catch: java.lang.Throwable -> L85
            r5.f308a = r8     // Catch: java.lang.Throwable -> L85
            a.Vd.a.b(r8)     // Catch: java.lang.Throwable -> L85
            r5.e = r2     // Catch: java.lang.Throwable -> L85
            a.w1 r8 = a.C0282n9.l(r0)     // Catch: java.lang.Throwable -> L85
            r5.b = r8     // Catch: java.lang.Throwable -> L85
            a.Vd.a.b(r8)     // Catch: java.lang.Throwable -> L85
            r5.f = r3     // Catch: java.lang.Throwable -> L85
            a.w1 r8 = a.C0282n9.l(r1)     // Catch: java.lang.Throwable -> L85
            r5.c = r8     // Catch: java.lang.Throwable -> L85
            a.Vd.a.b(r8)     // Catch: java.lang.Throwable -> L85
            r5.g = r4     // Catch: java.lang.Throwable -> L85
            a.w1 r7 = a.C0282n9.l(r7)     // Catch: java.lang.Throwable -> L85
            r5.d = r7     // Catch: java.lang.Throwable -> L85
            a.Vd.a.b(r7)     // Catch: java.lang.Throwable -> L85
            r5.h = r9     // Catch: java.lang.Throwable -> L85
            r6.recycle()
            return r5
        L85:
            r7 = move-exception
            r6.recycle()
            throw r7
    }

    public static a.Vd.a b(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            a.s r0 = new a.s
            r1 = 0
            float r2 = (float) r1
            r0.<init>(r2)
            int[] r2 = com.google.android.material.R.styleable.MaterialShape
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r2, r5, r6)
            int r5 = com.google.android.material.R.styleable.MaterialShape_shapeAppearance
            int r5 = r4.getResourceId(r5, r1)
            int r6 = com.google.android.material.R.styleable.MaterialShape_shapeAppearanceOverlay
            int r6 = r4.getResourceId(r6, r1)
            r4.recycle()
            a.Vd$a r3 = a(r3, r5, r6, r0)
            return r3
    }

    public static a.InterfaceC0438w4 c(android.content.res.TypedArray r2, int r3, a.InterfaceC0438w4 r4) {
            android.util.TypedValue r3 = r2.peekValue(r3)
            if (r3 != 0) goto L7
            goto L30
        L7:
            int r0 = r3.type
            r1 = 5
            if (r0 != r1) goto L21
            a.s r4 = new a.s
            int r3 = r3.data
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = android.util.TypedValue.complexToDimensionPixelSize(r3, r2)
            float r2 = (float) r2
            r4.<init>(r2)
            return r4
        L21:
            r2 = 6
            if (r0 != r2) goto L30
            a.Xc r2 = new a.Xc
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.getFraction(r4, r4)
            r2.<init>(r3)
            return r2
        L30:
            return r4
    }

    public final boolean d(android.graphics.RectF r6) {
            r5 = this;
            a.H5 r0 = r5.l
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<a.H5> r1 = a.H5.class
            boolean r0 = r0.equals(r1)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L36
            a.H5 r0 = r5.j
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            a.H5 r0 = r5.i
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            a.H5 r0 = r5.k
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = r3
            goto L37
        L36:
            r0 = r2
        L37:
            a.w4 r1 = r5.e
            float r1 = r1.a(r6)
            a.w4 r4 = r5.f
            float r4 = r4.a(r6)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L5d
            a.w4 r4 = r5.h
            float r4 = r4.a(r6)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L5d
            a.w4 r4 = r5.g
            float r6 = r4.a(r6)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L5d
            r6 = r3
            goto L5e
        L5d:
            r6 = r2
        L5e:
            a.w1 r1 = r5.b
            boolean r1 = r1 instanceof a.Ad
            if (r1 == 0) goto L78
            a.w1 r1 = r5.f307a
            boolean r1 = r1 instanceof a.Ad
            if (r1 == 0) goto L78
            a.w1 r1 = r5.c
            boolean r1 = r1 instanceof a.Ad
            if (r1 == 0) goto L78
            a.w1 r1 = r5.d
            boolean r1 = r1 instanceof a.Ad
            if (r1 == 0) goto L78
            r1 = r3
            goto L79
        L78:
            r1 = r2
        L79:
            if (r0 == 0) goto L80
            if (r6 == 0) goto L80
            if (r1 == 0) goto L80
            return r3
        L80:
            return r2
    }

    public final a.Vd.a e() {
            r3 = this;
            a.Vd$a r0 = new a.Vd$a
            r0.<init>()
            a.Ad r1 = new a.Ad
            r1.<init>()
            r0.f308a = r1
            a.Ad r1 = new a.Ad
            r1.<init>()
            r0.b = r1
            a.Ad r1 = new a.Ad
            r1.<init>()
            r0.c = r1
            a.Ad r1 = new a.Ad
            r1.<init>()
            r0.d = r1
            a.s r1 = new a.s
            r2 = 0
            r1.<init>(r2)
            r0.e = r1
            a.s r1 = new a.s
            r1.<init>(r2)
            r0.f = r1
            a.s r1 = new a.s
            r1.<init>(r2)
            r0.g = r1
            a.s r1 = new a.s
            r1.<init>(r2)
            r0.h = r1
            a.H5 r1 = new a.H5
            r1.<init>()
            r0.i = r1
            a.H5 r1 = new a.H5
            r1.<init>()
            r0.j = r1
            a.H5 r1 = new a.H5
            r1.<init>()
            r0.k = r1
            a.H5 r1 = new a.H5
            r1.<init>()
            a.w1 r1 = r3.f307a
            r0.f308a = r1
            a.w1 r1 = r3.b
            r0.b = r1
            a.w1 r1 = r3.c
            r0.c = r1
            a.w1 r1 = r3.d
            r0.d = r1
            a.w4 r1 = r3.e
            r0.e = r1
            a.w4 r1 = r3.f
            r0.f = r1
            a.w4 r1 = r3.g
            r0.g = r1
            a.w4 r1 = r3.h
            r0.h = r1
            a.H5 r1 = r3.i
            r0.i = r1
            a.H5 r1 = r3.j
            r0.j = r1
            a.H5 r1 = r3.k
            r0.k = r1
            a.H5 r1 = r3.l
            r0.l = r1
            return r0
    }
}
