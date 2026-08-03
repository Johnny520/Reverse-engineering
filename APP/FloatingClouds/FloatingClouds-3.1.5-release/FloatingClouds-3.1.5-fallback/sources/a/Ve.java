package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.res.ColorStateList f309a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public final android.content.res.ColorStateList j;
    public float k;
    public final int l;
    public boolean m;
    public android.graphics.Typeface n;

    public class a extends a.C0340qd.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC0040a2 f310a;
        public final /* synthetic */ a.Ve b;

        public a(a.Ve r1, a.AbstractC0040a2 r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.f310a = r2
                return
        }

        @Override // a.C0340qd.e
        public final void b(int r3) {
                r2 = this;
                a.Ve r0 = r2.b
                r1 = 1
                r0.m = r1
                a.a2 r0 = r2.f310a
                r0.d(r3)
                return
        }

        @Override // a.C0340qd.e
        public final void c(android.graphics.Typeface r3) {
                r2 = this;
                a.Ve r0 = r2.b
                int r1 = r0.c
                android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
                r0.n = r3
                r3 = 1
                r0.m = r3
                android.graphics.Typeface r3 = r0.n
                r0 = 0
                a.a2 r1 = r2.f310a
                r1.e(r3, r0)
                return
        }
    }

    public Ve(android.content.Context r7, int r8) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.m = r0
            int[] r1 = com.google.android.material.R.styleable.TextAppearance
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r8, r1)
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textSize
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r6.k = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textColor
            android.content.res.ColorStateList r2 = a.Sa.b(r7, r1, r2)
            r6.j = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textColorHint
            a.Sa.b(r7, r1, r2)
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textColorLink
            a.Sa.b(r7, r1, r2)
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_textStyle
            int r2 = r1.getInt(r2, r0)
            r6.c = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_android_typeface
            r4 = 1
            int r2 = r1.getInt(r2, r4)
            r6.d = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_fontFamily
            int r4 = com.google.android.material.R.styleable.TextAppearance_android_fontFamily
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L43
            goto L44
        L43:
            r2 = r4
        L44:
            int r4 = r1.getResourceId(r2, r0)
            r6.l = r4
            java.lang.String r2 = r1.getString(r2)
            r6.b = r2
            int r2 = com.google.android.material.R.styleable.TextAppearance_textAllCaps
            r1.getBoolean(r2, r0)
            int r0 = com.google.android.material.R.styleable.TextAppearance_android_shadowColor
            android.content.res.ColorStateList r0 = a.Sa.b(r7, r1, r0)
            r6.f309a = r0
            int r0 = com.google.android.material.R.styleable.TextAppearance_android_shadowDx
            float r0 = r1.getFloat(r0, r3)
            r6.e = r0
            int r0 = com.google.android.material.R.styleable.TextAppearance_android_shadowDy
            float r0 = r1.getFloat(r0, r3)
            r6.f = r0
            int r0 = com.google.android.material.R.styleable.TextAppearance_android_shadowRadius
            float r0 = r1.getFloat(r0, r3)
            r6.g = r0
            r1.recycle()
            int[] r0 = com.google.android.material.R.styleable.MaterialTextAppearance
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r0)
            int r8 = com.google.android.material.R.styleable.MaterialTextAppearance_android_letterSpacing
            boolean r8 = r7.hasValue(r8)
            r6.h = r8
            int r8 = com.google.android.material.R.styleable.MaterialTextAppearance_android_letterSpacing
            float r8 = r7.getFloat(r8, r3)
            r6.i = r8
            r7.recycle()
            return
    }

    public final void a() {
            r3 = this;
            android.graphics.Typeface r0 = r3.n
            int r1 = r3.c
            if (r0 != 0) goto L10
            java.lang.String r0 = r3.b
            if (r0 == 0) goto L10
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r3.n = r0
        L10:
            android.graphics.Typeface r0 = r3.n
            if (r0 != 0) goto L3a
            r0 = 1
            int r2 = r3.d
            if (r2 == r0) goto L2e
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L24
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r3.n = r0
            goto L32
        L24:
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            r3.n = r0
            goto L32
        L29:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            r3.n = r0
            goto L32
        L2e:
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r3.n = r0
        L32:
            android.graphics.Typeface r0 = r3.n
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r3.n = r0
        L3a:
            return
    }

    public final android.graphics.Typeface b(android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.m
            if (r0 == 0) goto L7
            android.graphics.Typeface r3 = r2.n
            return r3
        L7:
            boolean r0 = r3.isRestricted()
            if (r0 != 0) goto L36
            int r0 = r2.l     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L36
            android.graphics.Typeface r3 = a.C0340qd.a(r3, r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L36
            r2.n = r3     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L36
            if (r3 == 0) goto L36
            int r0 = r2.c     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L36
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L36
            r2.n = r3     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L36
            goto L36
        L20:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error loading font "
            r0.<init>(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TextAppearance"
            android.util.Log.d(r1, r0, r3)
        L36:
            r2.a()
            r3 = 1
            r2.m = r3
            android.graphics.Typeface r3 = r2.n
            return r3
    }

    public final void c(android.content.Context r10, a.AbstractC0040a2 r11) {
            r9 = this;
            boolean r0 = r9.d(r10)
            if (r0 == 0) goto La
            r9.b(r10)
            goto Ld
        La:
            r9.a()
        Ld:
            r1 = 1
            int r3 = r9.l
            if (r3 != 0) goto L14
            r9.m = r1
        L14:
            boolean r0 = r9.m
            if (r0 == 0) goto L1e
            android.graphics.Typeface r10 = r9.n
            r11.e(r10, r1)
            return
        L1e:
            a.Ve$a r6 = new a.Ve$a     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            r6.<init>(r9, r11)     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            java.lang.ThreadLocal<android.util.TypedValue> r0 = a.C0340qd.f657a     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            boolean r0 = r10.isRestricted()     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            if (r0 == 0) goto L30
            r10 = -4
            r6.a(r10)     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            return
        L30:
            android.util.TypedValue r4 = new android.util.TypedValue     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            r4.<init>()     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            r5 = 0
            r7 = 0
            r8 = 0
            r2 = r10
            a.C0340qd.b(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            return
        L3d:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Error loading font "
            r0.<init>(r2)
            java.lang.String r2 = r9.b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TextAppearance"
            android.util.Log.d(r2, r0, r10)
            r9.m = r1
            r10 = -3
            r11.d(r10)
            goto L60
        L5b:
            r9.m = r1
            r11.d(r1)
        L60:
            return
    }

    public final boolean d(android.content.Context r9) {
            r8 = this;
            r0 = 0
            int r2 = r8.l
            if (r2 == 0) goto L1c
            java.lang.ThreadLocal<android.util.TypedValue> r1 = a.C0340qd.f657a
            boolean r1 = r9.isRestricted()
            if (r1 == 0) goto Le
            goto L1c
        Le:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r6 = 0
            r7 = 1
            r4 = 0
            r5 = 0
            r1 = r9
            android.graphics.Typeface r0 = a.C0340qd.b(r1, r2, r3, r4, r5, r6, r7)
        L1c:
            if (r0 == 0) goto L20
            r9 = 1
            return r9
        L20:
            r9 = 0
            return r9
    }

    public final void e(android.content.Context r3, android.text.TextPaint r4, a.AbstractC0040a2 r5) {
            r2 = this;
            r2.f(r3, r4, r5)
            android.content.res.ColorStateList r3 = r2.j
            if (r3 == 0) goto L12
            int[] r5 = r4.drawableState
            int r0 = r3.getDefaultColor()
            int r3 = r3.getColorForState(r5, r0)
            goto L14
        L12:
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L14:
            r4.setColor(r3)
            android.content.res.ColorStateList r3 = r2.f309a
            if (r3 == 0) goto L26
            int[] r5 = r4.drawableState
            int r0 = r3.getDefaultColor()
            int r3 = r3.getColorForState(r5, r0)
            goto L27
        L26:
            r3 = 0
        L27:
            float r5 = r2.g
            float r0 = r2.e
            float r1 = r2.f
            r4.setShadowLayer(r5, r0, r1, r3)
            return
    }

    public final void f(android.content.Context r2, android.text.TextPaint r3, a.AbstractC0040a2 r4) {
            r1 = this;
            boolean r0 = r1.d(r2)
            if (r0 == 0) goto Le
            android.graphics.Typeface r4 = r1.b(r2)
            r1.g(r2, r3, r4)
            return
        Le:
            r1.a()
            android.graphics.Typeface r0 = r1.n
            r1.g(r2, r3, r0)
            a.We r0 = new a.We
            r0.<init>(r1, r2, r3, r4)
            r1.c(r2, r0)
            return
    }

    public final void g(android.content.Context r1, android.text.TextPaint r2, android.graphics.Typeface r3) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.graphics.Typeface r1 = a.Vf.a(r1, r3)
            if (r1 == 0) goto Lf
            r3 = r1
        Lf:
            r2.setTypeface(r3)
            int r1 = r3.getStyle()
            int r1 = ~r1
            int r3 = r0.c
            r1 = r1 & r3
            r3 = r1 & 1
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            r2.setFakeBoldText(r3)
            r1 = r1 & 2
            if (r1 == 0) goto L2b
            r1 = -1098907648(0xffffffffbe800000, float:-0.25)
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r2.setTextSkewX(r1)
            float r1 = r0.k
            r2.setTextSize(r1)
            boolean r1 = r0.h
            if (r1 == 0) goto L3d
            float r1 = r0.i
            r2.setLetterSpacing(r1)
        L3d:
            return
    }
}
