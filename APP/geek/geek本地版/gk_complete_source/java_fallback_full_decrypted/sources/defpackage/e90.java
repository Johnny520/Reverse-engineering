package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e90 extends defpackage.v80 {
    public static final android.graphics.PorterDuff.Mode j = null;
    public defpackage.c90 b;
    public android.graphics.PorterDuffColorFilter c;
    public android.graphics.ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final android.graphics.Matrix h;
    public final android.graphics.Rect i;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            defpackage.e90.j = r0
            return
    }

    public e90() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f = r0
            r0 = 9
            float[] r0 = new float[r0]
            r2.g = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.i = r0
            c90 r0 = new c90
            r0.<init>()
            r1 = 0
            r0.c = r1
            android.graphics.PorterDuff$Mode r1 = defpackage.e90.j
            r0.d = r1
            b90 r1 = new b90
            r1.<init>()
            r0.b = r1
            r2.b = r0
            return
    }

    public e90(defpackage.c90 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.g = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.i = r0
            r1.b = r2
            android.content.res.ColorStateList r0 = r2.c
            android.graphics.PorterDuff$Mode r2 = r2.d
            android.graphics.PorterDuffColorFilter r2 = r1.a(r0, r2)
            r1.c = r2
            return
    }

    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r2 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L14:
            r3 = 0
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L7
            defpackage.ch.b(r0)
        L7:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.drawable.Drawable r2 = r0.a
            if (r2 == 0) goto Lc
            r2.draw(r1)
            return
        Lc:
            android.graphics.Rect r2 = r0.i
            r0.copyBounds(r2)
            int r3 = r2.width()
            if (r3 <= 0) goto L16e
            int r3 = r2.height()
            if (r3 > 0) goto L1f
            goto L16e
        L1f:
            android.graphics.ColorFilter r3 = r0.d
            if (r3 != 0) goto L25
            android.graphics.PorterDuffColorFilter r3 = r0.c
        L25:
            android.graphics.Matrix r4 = r0.h
            r1.getMatrix(r4)
            float[] r5 = r0.g
            r4.getValues(r5)
            r4 = 0
            r6 = r5[r4]
            float r6 = java.lang.Math.abs(r6)
            r7 = 4
            r7 = r5[r7]
            float r7 = java.lang.Math.abs(r7)
            r8 = 1
            r9 = r5[r8]
            float r9 = java.lang.Math.abs(r9)
            r10 = 3
            r5 = r5[r10]
            float r5 = java.lang.Math.abs(r5)
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r9 != 0) goto L56
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L58
        L56:
            r6 = r11
            r7 = r6
        L58:
            int r5 = r2.width()
            float r5 = (float) r5
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = r2.height()
            float r6 = (float) r6
            float r6 = r6 * r7
            int r6 = (int) r6
            r7 = 2048(0x800, float:2.87E-42)
            int r5 = java.lang.Math.min(r7, r5)
            int r6 = java.lang.Math.min(r7, r6)
            if (r5 <= 0) goto L16e
            if (r6 > 0) goto L76
            goto L16e
        L76:
            int r7 = r1.save()
            int r9 = r2.left
            float r9 = (float) r9
            int r12 = r2.top
            float r12 = (float) r12
            r1.translate(r9, r12)
            boolean r9 = r0.isAutoMirrored()
            if (r9 == 0) goto L9c
            int r9 = defpackage.dh.a(r0)
            if (r9 != r8) goto L9c
            int r9 = r2.width()
            float r9 = (float) r9
            r1.translate(r9, r10)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r9, r11)
        L9c:
            r2.offsetTo(r4, r4)
            c90 r9 = r0.b
            android.graphics.Bitmap r10 = r9.f
            if (r10 == 0) goto Lb4
            int r10 = r10.getWidth()
            if (r5 != r10) goto Lb4
            android.graphics.Bitmap r10 = r9.f
            int r10 = r10.getHeight()
            if (r6 != r10) goto Lb4
            goto Lbe
        Lb4:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r5, r6, r10)
            r9.f = r10
            r9.k = r8
        Lbe:
            boolean r9 = r0.f
            if (r9 != 0) goto Lde
            c90 r9 = r0.b
            android.graphics.Bitmap r10 = r9.f
            r10.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r4 = r9.f
            r15.<init>(r4)
            b90 r12 = r9.b
            y80 r13 = r12.g
            android.graphics.Matrix r14 = defpackage.b90.p
            r16 = r5
            r17 = r6
            r12.a(r13, r14, r15, r16, r17)
            goto L134
        Lde:
            r16 = r5
            r17 = r6
            c90 r5 = r0.b
            boolean r6 = r5.k
            if (r6 != 0) goto L105
            android.content.res.ColorStateList r6 = r5.g
            android.content.res.ColorStateList r9 = r5.c
            if (r6 != r9) goto L105
            android.graphics.PorterDuff$Mode r6 = r5.h
            android.graphics.PorterDuff$Mode r9 = r5.d
            if (r6 != r9) goto L105
            boolean r6 = r5.j
            boolean r9 = r5.e
            if (r6 != r9) goto L105
            int r6 = r5.i
            b90 r5 = r5.b
            int r5 = r5.getRootAlpha()
            if (r6 != r5) goto L105
            goto L134
        L105:
            c90 r5 = r0.b
            android.graphics.Bitmap r6 = r5.f
            r6.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r6 = r5.f
            r15.<init>(r6)
            b90 r12 = r5.b
            y80 r13 = r12.g
            android.graphics.Matrix r14 = defpackage.b90.p
            r12.a(r13, r14, r15, r16, r17)
            c90 r5 = r0.b
            android.content.res.ColorStateList r6 = r5.c
            r5.g = r6
            android.graphics.PorterDuff$Mode r6 = r5.d
            r5.h = r6
            b90 r6 = r5.b
            int r6 = r6.getRootAlpha()
            r5.i = r6
            boolean r6 = r5.e
            r5.j = r6
            r5.k = r4
        L134:
            c90 r4 = r0.b
            b90 r5 = r4.b
            int r5 = r5.getRootAlpha()
            r6 = 255(0xff, float:3.57E-43)
            r9 = 0
            if (r5 >= r6) goto L142
            goto L146
        L142:
            if (r3 != 0) goto L146
            r3 = r9
            goto L166
        L146:
            android.graphics.Paint r5 = r4.l
            if (r5 != 0) goto L154
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r4.l = r5
            r5.setFilterBitmap(r8)
        L154:
            android.graphics.Paint r5 = r4.l
            b90 r6 = r4.b
            int r6 = r6.getRootAlpha()
            r5.setAlpha(r6)
            android.graphics.Paint r5 = r4.l
            r5.setColorFilter(r3)
            android.graphics.Paint r3 = r4.l
        L166:
            android.graphics.Bitmap r4 = r4.f
            r1.drawBitmap(r4, r9, r2, r3)
            r1.restoreToCount(r7)
        L16e:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = defpackage.bh.a(r0)
            return r0
        L9:
            c90 r0 = r1.b
            b90 r0 = r0.b
            int r0 = r0.getRootAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.a
            if (r0 == 0) goto L9
            int r0 = r0.getChangingConfigurations()
            return r0
        L9:
            int r0 = super.getChangingConfigurations()
            c90 r1 = r2.b
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r0 = defpackage.ch.c(r0)
            return r0
        L9:
            android.graphics.ColorFilter r0 = r1.d
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.a
            if (r0 == 0) goto L10
            d90 r0 = new d90
            android.graphics.drawable.Drawable r1 = r2.a
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L10:
            c90 r0 = r2.b
            int r1 = r2.getChangingConfigurations()
            r0.a = r1
            c90 r0 = r2.b
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicHeight()
            return r0
        L9:
            c90 r0 = r1.b
            b90 r0 = r0.b
            float r0 = r0.i
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicWidth()
            return r0
        L9:
            c90 r0 = r1.b
            b90 r0 = r0.b
            float r0 = r0.h
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L8
            r0.inflate(r2, r3, r4)
            return
        L8:
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.content.res.Resources.Theme r32) {
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L12
            defpackage.ch.d(r0, r2, r3, r4, r5)
            return
        L12:
            c90 r6 = r1.b
            b90 r0 = new b90
            r0.<init>()
            r6.b = r0
            int[] r0 = defpackage.ff.a
            android.content.res.TypedArray r7 = defpackage.zt.H(r2, r5, r4, r0)
            c90 r8 = r1.b
            b90 r9 = r8.b
            java.lang.String r0 = "tintMode"
            boolean r0 = defpackage.zt.y(r3, r0)
            r10 = -1
            r11 = 6
            if (r0 != 0) goto L31
            r0 = r10
            goto L35
        L31:
            int r0 = r7.getInt(r11, r10)
        L35:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r13 = 9
            r14 = 3
            r15 = 5
            if (r0 == r14) goto L51
            if (r0 == r15) goto L53
            if (r0 == r13) goto L4e
            switch(r0) {
                case 14: goto L4b;
                case 15: goto L48;
                case 16: goto L45;
                default: goto L44;
            }
        L44:
            goto L53
        L45:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.ADD
            goto L53
        L48:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SCREEN
            goto L53
        L4b:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L53
        L4e:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L53
        L51:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_OVER
        L53:
            r8.d = r12
            java.lang.String r0 = "tint"
            java.lang.String r12 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r3.getAttributeValue(r12, r0)
            r16 = 0
            r11 = 2
            r13 = 0
            r10 = 1
            if (r0 == 0) goto L7e
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.getValue(r10, r0)
            int r14 = r0.type
            if (r14 == r11) goto L9d
            r11 = 28
            if (r14 < r11) goto L81
            r11 = 31
            if (r14 > r11) goto L81
            int r0 = r0.data
            android.content.res.ColorStateList r16 = android.content.res.ColorStateList.valueOf(r0)
        L7e:
            r0 = r16
            goto Lb1
        L81:
            android.content.res.Resources r0 = r7.getResources()
            int r11 = r7.getResourceId(r10, r13)
            java.lang.ThreadLocal r14 = defpackage.hb.a
            android.content.res.XmlResourceParser r11 = r0.getXml(r11)     // Catch: java.lang.Exception -> L94
            android.content.res.ColorStateList r16 = defpackage.hb.a(r0, r11, r5)     // Catch: java.lang.Exception -> L94
            goto L7e
        L94:
            r0 = move-exception
            java.lang.String r11 = "CSLCompat"
            java.lang.String r14 = "Failed to inflate ColorStateList."
            android.util.Log.e(r11, r14, r0)
            goto L7e
        L9d:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to resolve attribute at index 1: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        Lb1:
            if (r0 == 0) goto Lb5
            r8.c = r0
        Lb5:
            boolean r0 = r8.e
            java.lang.String r11 = "autoMirrored"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto Lc3
            boolean r0 = r7.getBoolean(r15, r0)
        Lc3:
            r8.e = r0
            float r0 = r9.j
            java.lang.String r8 = "viewportWidth"
            java.lang.String r8 = r3.getAttributeValue(r12, r8)
            r11 = 7
            if (r8 == 0) goto Ld4
            float r0 = r7.getFloat(r11, r0)
        Ld4:
            r9.j = r0
            float r0 = r9.k
            java.lang.String r8 = "viewportHeight"
            java.lang.String r8 = r3.getAttributeValue(r12, r8)
            r14 = 8
            if (r8 == 0) goto Le6
            float r0 = r7.getFloat(r14, r0)
        Le6:
            r9.k = r0
            float r8 = r9.j
            r15 = 0
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 <= 0) goto L486
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 <= 0) goto L46b
            float r0 = r9.h
            r8 = 3
            float r0 = r7.getDimension(r8, r0)
            r9.h = r0
            float r0 = r9.i
            r8 = 2
            float r0 = r7.getDimension(r8, r0)
            r9.i = r0
            float r8 = r9.h
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 <= 0) goto L450
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 <= 0) goto L435
            float r0 = r9.getAlpha()
            java.lang.String r8 = "alpha"
            java.lang.String r8 = r3.getAttributeValue(r12, r8)
            r11 = 4
            if (r8 == 0) goto L120
            float r0 = r7.getFloat(r11, r0)
        L120:
            r9.setAlpha(r0)
            java.lang.String r0 = r7.getString(r13)
            if (r0 == 0) goto L130
            r9.m = r0
            n6 r8 = r9.o
            r8.put(r0, r9)
        L130:
            r7.recycle()
            int r0 = r1.getChangingConfigurations()
            r6.a = r0
            r6.k = r10
            c90 r0 = r1.b
            b90 r7 = r0.b
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            y80 r9 = r7.g
            n6 r7 = r7.o
            r8.push(r9)
            int r9 = r3.getEventType()
            int r21 = r3.getDepth()
            int r11 = r21 + 1
            r21 = r10
        L157:
            if (r9 == r10) goto L420
            int r14 = r3.getDepth()
            if (r14 >= r11) goto L162
            r14 = 3
            if (r9 == r14) goto L420
        L162:
            java.lang.String r14 = "group"
            r10 = 2
            if (r9 != r10) goto L3f2
            java.lang.String r9 = r3.getName()
            java.lang.Object r10 = r8.peek()
            y80 r10 = (defpackage.y80) r10
            java.lang.String r13 = "path"
            boolean r13 = r13.equals(r9)
            java.lang.String r15 = "fillType"
            r25 = r11
            java.lang.String r11 = "pathData"
            if (r13 == 0) goto L2de
            x80 r9 = new x80
            r9.<init>()
            r13 = 0
            r9.e = r13
            r14 = 1065353216(0x3f800000, float:1.0)
            r9.g = r14
            r9.h = r14
            r9.i = r13
            r9.j = r14
            r9.k = r13
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.BUTT
            r9.l = r14
            android.graphics.Paint$Join r13 = android.graphics.Paint.Join.MITER
            r9.m = r13
            r21 = r13
            r13 = 1082130432(0x40800000, float:4.0)
            r9.n = r13
            int[] r13 = defpackage.ff.c
            android.content.res.TypedArray r13 = defpackage.zt.H(r2, r5, r4, r13)
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L2b9
            r26 = r14
            r11 = 0
            java.lang.String r14 = r13.getString(r11)
            if (r14 == 0) goto L1b8
            r9.b = r14
        L1b8:
            r11 = 2
            java.lang.String r14 = r13.getString(r11)
            if (r14 == 0) goto L1c5
            ox[] r11 = defpackage.ct.j(r14)
            r9.a = r11
        L1c5:
            java.lang.String r11 = "fillColor"
            r14 = 1
            z3 r11 = defpackage.zt.p(r13, r3, r5, r11, r14)
            r9.f = r11
            float r11 = r9.h
            java.lang.String r14 = "fillAlpha"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L1de
            r14 = 12
            float r11 = r13.getFloat(r14, r11)
        L1de:
            r9.h = r11
            java.lang.String r11 = "strokeLineCap"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L1f2
            r11 = 8
            r14 = -1
            int r23 = r13.getInt(r11, r14)
            r14 = r23
            goto L1f3
        L1f2:
            r14 = -1
        L1f3:
            android.graphics.Paint$Cap r11 = r9.l
            if (r14 == 0) goto L208
            r27 = r11
            r11 = 1
            if (r14 == r11) goto L205
            r11 = 2
            if (r14 == r11) goto L202
            r14 = r27
            goto L20a
        L202:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.SQUARE
            goto L20a
        L205:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.ROUND
            goto L20a
        L208:
            r14 = r26
        L20a:
            r9.l = r14
            java.lang.String r11 = "strokeLineJoin"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L21e
            r11 = -1
            r14 = 9
            int r18 = r13.getInt(r14, r11)
            r11 = r18
            goto L21f
        L21e:
            r11 = -1
        L21f:
            android.graphics.Paint$Join r14 = r9.m
            if (r11 == 0) goto L234
            r26 = r14
            r14 = 1
            if (r11 == r14) goto L231
            r14 = 2
            if (r11 == r14) goto L22e
            r11 = r26
            goto L236
        L22e:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.BEVEL
            goto L236
        L231:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.ROUND
            goto L236
        L234:
            r11 = r21
        L236:
            r9.m = r11
            float r11 = r9.n
            java.lang.String r14 = "strokeMiterLimit"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L248
            r14 = 10
            float r11 = r13.getFloat(r14, r11)
        L248:
            r9.n = r11
            java.lang.String r11 = "strokeColor"
            r14 = 3
            z3 r11 = defpackage.zt.p(r13, r3, r5, r11, r14)
            r9.d = r11
            float r11 = r9.g
            java.lang.String r14 = "strokeAlpha"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L263
            r14 = 11
            float r11 = r13.getFloat(r14, r11)
        L263:
            r9.g = r11
            float r11 = r9.e
            java.lang.String r14 = "strokeWidth"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L274
            r14 = 4
            float r11 = r13.getFloat(r14, r11)
        L274:
            r9.e = r11
            float r11 = r9.j
            java.lang.String r14 = "trimPathEnd"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L285
            r14 = 6
            float r11 = r13.getFloat(r14, r11)
        L285:
            r9.j = r11
            float r11 = r9.k
            java.lang.String r14 = "trimPathOffset"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L296
            r14 = 7
            float r11 = r13.getFloat(r14, r11)
        L296:
            r9.k = r11
            float r11 = r9.i
            java.lang.String r14 = "trimPathStart"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L2a7
            r14 = 5
            float r11 = r13.getFloat(r14, r11)
        L2a7:
            r9.i = r11
            int r11 = r9.c
            java.lang.String r14 = r3.getAttributeValue(r12, r15)
            if (r14 == 0) goto L2b7
            r14 = 13
            int r11 = r13.getInt(r14, r11)
        L2b7:
            r9.c = r11
        L2b9:
            r13.recycle()
            java.util.ArrayList r10 = r10.b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L2ce
            java.lang.String r10 = r9.getPathName()
            r7.put(r10, r9)
        L2ce:
            int r9 = r0.a
            r0.a = r9
            r13 = 0
            r15 = 2
            r18 = 9
            r19 = -1
            r21 = 0
            r23 = 8
            goto L3e8
        L2de:
            r18 = 9
            r19 = -1
            r23 = 8
            java.lang.String r13 = "clip-path"
            boolean r13 = r13.equals(r9)
            if (r13 == 0) goto L340
            w80 r9 = new w80
            r9.<init>()
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L326
            int[] r11 = defpackage.ff.d
            android.content.res.TypedArray r11 = defpackage.zt.H(r2, r5, r4, r11)
            r13 = 0
            java.lang.String r14 = r11.getString(r13)
            if (r14 == 0) goto L306
            r9.b = r14
        L306:
            r14 = 1
            java.lang.String r13 = r11.getString(r14)
            if (r13 == 0) goto L313
            ox[] r13 = defpackage.ct.j(r13)
            r9.a = r13
        L313:
            boolean r13 = defpackage.zt.y(r3, r15)
            if (r13 != 0) goto L31b
            r15 = 0
            goto L321
        L31b:
            r13 = 0
            r14 = 2
            int r15 = r11.getInt(r14, r13)
        L321:
            r9.c = r15
            r11.recycle()
        L326:
            java.util.ArrayList r10 = r10.b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L338
            java.lang.String r10 = r9.getPathName()
            r7.put(r10, r9)
        L338:
            int r9 = r0.a
            r0.a = r9
        L33c:
            r13 = 0
            r15 = 2
            goto L3e8
        L340:
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L33c
            y80 r9 = new y80
            r9.<init>()
            int[] r11 = defpackage.ff.b
            android.content.res.TypedArray r11 = defpackage.zt.H(r2, r5, r4, r11)
            float r13 = r9.c
            java.lang.String r14 = "rotation"
            boolean r14 = defpackage.zt.y(r3, r14)
            if (r14 != 0) goto L35d
            r15 = 5
            goto L362
        L35d:
            r15 = 5
            float r13 = r11.getFloat(r15, r13)
        L362:
            r9.c = r13
            float r13 = r9.d
            r14 = 1
            float r13 = r11.getFloat(r14, r13)
            r9.d = r13
            float r13 = r9.e
            r15 = 2
            float r13 = r11.getFloat(r15, r13)
            r9.e = r13
            float r13 = r9.f
            java.lang.String r14 = "scaleX"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L385
            r14 = 3
            float r13 = r11.getFloat(r14, r13)
        L385:
            r9.f = r13
            float r13 = r9.g
            java.lang.String r14 = "scaleY"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L397
            r14 = 4
            float r13 = r11.getFloat(r14, r13)
            goto L398
        L397:
            r14 = 4
        L398:
            r9.g = r13
            float r13 = r9.h
            java.lang.String r14 = "translateX"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L3aa
            r14 = 6
            float r13 = r11.getFloat(r14, r13)
            goto L3ab
        L3aa:
            r14 = 6
        L3ab:
            r9.h = r13
            float r13 = r9.i
            java.lang.String r14 = "translateY"
            java.lang.String r14 = r3.getAttributeValue(r12, r14)
            if (r14 == 0) goto L3bd
            r14 = 7
            float r13 = r11.getFloat(r14, r13)
            goto L3be
        L3bd:
            r14 = 7
        L3be:
            r9.i = r13
            r13 = 0
            java.lang.String r14 = r11.getString(r13)
            if (r14 == 0) goto L3c9
            r9.k = r14
        L3c9:
            r9.c()
            r11.recycle()
            java.util.ArrayList r10 = r10.b
            r10.add(r9)
            r8.push(r9)
            java.lang.String r10 = r9.getGroupName()
            if (r10 == 0) goto L3e4
            java.lang.String r10 = r9.getGroupName()
            r7.put(r10, r9)
        L3e4:
            int r9 = r0.a
            r0.a = r9
        L3e8:
            r10 = 3
            r17 = 6
            r20 = 7
            r22 = 4
            r24 = 1
            goto L413
        L3f2:
            r15 = r10
            r25 = r11
            r10 = 3
            r17 = 6
            r18 = 9
            r19 = -1
            r20 = 7
            r22 = 4
            r23 = 8
            r24 = 1
            if (r9 != r10) goto L413
            java.lang.String r9 = r3.getName()
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L413
            r8.pop()
        L413:
            int r9 = r3.next()
            r14 = r23
            r10 = r24
            r11 = r25
            r15 = 0
            goto L157
        L420:
            if (r21 != 0) goto L42d
            android.content.res.ColorStateList r0 = r6.c
            android.graphics.PorterDuff$Mode r2 = r6.d
            android.graphics.PorterDuffColorFilter r0 = r1.a(r0, r2)
            r1.c = r0
            return
        L42d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "no path defined"
            r0.<init>(r2)
            throw r0
        L435:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L450:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L46b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L486:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L8
            r0.invalidateSelf()
            return
        L8:
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L9
            boolean r0 = defpackage.bh.d(r0)
            return r0
        L9:
            c90 r0 = r1.b
            boolean r0 = r0.e
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.a
            if (r0 == 0) goto L9
            boolean r0 = r0.isStateful()
            return r0
        L9:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L3c
            c90 r0 = r2.b
            if (r0 == 0) goto L3a
            b90 r0 = r0.b
            java.lang.Boolean r1 = r0.n
            if (r1 != 0) goto L25
            y80 r1 = r0.g
            boolean r1 = r1.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.n = r1
        L25:
            java.lang.Boolean r0 = r0.n
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
            c90 r0 = r2.b
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L3a
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3a
            goto L3c
        L3a:
            r0 = 0
            return r0
        L3c:
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.a
            if (r0 == 0) goto L8
            r0.mutate()
            return r5
        L8:
            boolean r0 = r5.e
            if (r0 != 0) goto L64
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r5) goto L64
            c90 r0 = new c90
            c90 r1 = r5.b
            r0.<init>()
            r2 = 0
            r0.c = r2
            android.graphics.PorterDuff$Mode r2 = defpackage.e90.j
            r0.d = r2
            if (r1 == 0) goto L5f
            int r2 = r1.a
            r0.a = r2
            b90 r2 = new b90
            b90 r3 = r1.b
            r2.<init>(r3)
            r0.b = r2
            b90 r3 = r1.b
            android.graphics.Paint r3 = r3.e
            if (r3 == 0) goto L40
            android.graphics.Paint r3 = new android.graphics.Paint
            b90 r4 = r1.b
            android.graphics.Paint r4 = r4.e
            r3.<init>(r4)
            r2.e = r3
        L40:
            b90 r2 = r1.b
            android.graphics.Paint r2 = r2.d
            if (r2 == 0) goto L53
            b90 r2 = r0.b
            android.graphics.Paint r3 = new android.graphics.Paint
            b90 r4 = r1.b
            android.graphics.Paint r4 = r4.d
            r3.<init>(r4)
            r2.d = r3
        L53:
            android.content.res.ColorStateList r2 = r1.c
            r0.c = r2
            android.graphics.PorterDuff$Mode r2 = r1.d
            r0.d = r2
            boolean r1 = r1.e
            r0.e = r1
        L5f:
            r5.b = r0
            r0 = 1
            r5.e = r0
        L64:
            return r5
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.a
            if (r0 == 0) goto L9
            boolean r6 = r0.setState(r6)
            return r6
        L9:
            c90 r0 = r5.b
            android.content.res.ColorStateList r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L1f
            android.graphics.PorterDuff$Mode r3 = r0.d
            if (r3 == 0) goto L1f
            android.graphics.PorterDuffColorFilter r1 = r5.a(r1, r3)
            r5.c = r1
            r5.invalidateSelf()
            r1 = r2
            goto L20
        L1f:
            r1 = 0
        L20:
            b90 r3 = r0.b
            java.lang.Boolean r4 = r3.n
            if (r4 != 0) goto L32
            y80 r4 = r3.g
            boolean r4 = r4.a()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.n = r4
        L32:
            java.lang.Boolean r3 = r3.n
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4d
            b90 r3 = r0.b
            y80 r3 = r3.g
            boolean r6 = r3.b(r6)
            boolean r3 = r0.k
            r3 = r3 | r6
            r0.k = r3
            if (r6 == 0) goto L4d
            r5.invalidateSelf()
            return r2
        L4d:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L8
            r0.scheduleSelf(r2, r3)
            return
        L8:
            super.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            c90 r0 = r1.b
            b90 r0 = r0.b
            int r0 = r0.getRootAlpha()
            if (r0 == r2) goto L1c
            c90 r0 = r1.b
            b90 r0 = r0.b
            r0.setRootAlpha(r2)
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L8
            defpackage.bh.e(r0, r2)
            return
        L8:
            c90 r0 = r1.b
            r0.e = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            r1.d = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L8
            defpackage.a80.E(r0, r2)
            return
        L8:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.a
            if (r0 == 0) goto L8
            defpackage.ch.h(r0, r3)
            return
        L8:
            c90 r0 = r2.b
            android.content.res.ColorStateList r1 = r0.c
            if (r1 == r3) goto L1b
            r0.c = r3
            android.graphics.PorterDuff$Mode r0 = r0.d
            android.graphics.PorterDuffColorFilter r3 = r2.a(r3, r0)
            r2.c = r3
            r2.invalidateSelf()
        L1b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.a
            if (r0 == 0) goto L8
            defpackage.ch.i(r0, r3)
            return
        L8:
            c90 r0 = r2.b
            android.graphics.PorterDuff$Mode r1 = r0.d
            if (r1 == r3) goto L1b
            r0.d = r3
            android.content.res.ColorStateList r0 = r0.c
            android.graphics.PorterDuffColorFilter r3 = r2.a(r0, r3)
            r2.c = r3
            r2.invalidateSelf()
        L1b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L9
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        L9:
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(java.lang.Runnable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L8
            r0.unscheduleSelf(r2)
            return
        L8:
            super.unscheduleSelf(r2)
            return
    }
}
