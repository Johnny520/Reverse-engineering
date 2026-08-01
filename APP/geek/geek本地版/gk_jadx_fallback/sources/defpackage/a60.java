package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a60 {
    public final android.content.res.ColorStateList a;
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

    public a60(android.content.Context r6, int r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.m = r0
            int[] r1 = defpackage.wy.y
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1)
            r2 = 0
            float r3 = r1.getDimension(r0, r2)
            r5.k = r3
            r3 = 3
            android.content.res.ColorStateList r3 = defpackage.ct.n(r6, r1, r3)
            r5.j = r3
            r3 = 4
            defpackage.ct.n(r6, r1, r3)
            r3 = 5
            defpackage.ct.n(r6, r1, r3)
            r3 = 2
            int r3 = r1.getInt(r3, r0)
            r5.c = r3
            r3 = 1
            int r3 = r1.getInt(r3, r3)
            r5.d = r3
            r3 = 12
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L39
            goto L3b
        L39:
            r3 = 10
        L3b:
            int r4 = r1.getResourceId(r3, r0)
            r5.l = r4
            java.lang.String r3 = r1.getString(r3)
            r5.b = r3
            r3 = 14
            r1.getBoolean(r3, r0)
            r3 = 6
            android.content.res.ColorStateList r3 = defpackage.ct.n(r6, r1, r3)
            r5.a = r3
            r3 = 7
            float r3 = r1.getFloat(r3, r2)
            r5.e = r3
            r3 = 8
            float r3 = r1.getFloat(r3, r2)
            r5.f = r3
            r3 = 9
            float r3 = r1.getFloat(r3, r2)
            r5.g = r3
            r1.recycle()
            int[] r1 = defpackage.wy.q
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r1)
            boolean r7 = r6.hasValue(r0)
            r5.h = r7
            float r7 = r6.getFloat(r0, r2)
            r5.i = r7
            r6.recycle()
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
            android.graphics.Typeface r3 = defpackage.c10.a(r3, r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L36
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

    public final void c(android.content.Context r10, defpackage.gt r11) {
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
            r11.q(r10, r1)
            return
        L1e:
            y50 r6 = new y50     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            r6.<init>(r9, r11)     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            java.lang.ThreadLocal r0 = defpackage.c10.a     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            boolean r0 = r10.isRestricted()     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            if (r0 == 0) goto L30
            r10 = -4
            r6.c(r10)     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            return
        L30:
            android.util.TypedValue r4 = new android.util.TypedValue     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            r4.<init>()     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
            r7 = 0
            r8 = 0
            r5 = 0
            r2 = r10
            defpackage.c10.b(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L3d android.content.res.Resources.NotFoundException -> L5b
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
            r11.p(r10)
            goto L60
        L5b:
            r9.m = r1
            r11.p(r1)
        L60:
            return
    }

    public final boolean d(android.content.Context r9) {
            r8 = this;
            r0 = 0
            int r2 = r8.l
            if (r2 == 0) goto L1c
            java.lang.ThreadLocal r1 = defpackage.c10.a
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
            android.graphics.Typeface r0 = defpackage.c10.b(r1, r2, r3, r4, r5, r6, r7)
        L1c:
            if (r0 == 0) goto L20
            r9 = 1
            return r9
        L20:
            r9 = 0
            return r9
    }

    public final void e(android.content.Context r3, android.text.TextPaint r4, defpackage.gt r5) {
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
            android.content.res.ColorStateList r3 = r2.a
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

    public final void f(android.content.Context r2, android.text.TextPaint r3, defpackage.gt r4) {
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
            z50 r0 = new z50
            r0.<init>(r1, r2, r3, r4)
            r1.c(r2, r0)
            return
    }

    public final void g(android.content.Context r1, android.text.TextPaint r2, android.graphics.Typeface r3) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.graphics.Typeface r1 = defpackage.zt.G(r1, r3)
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
