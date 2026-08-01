package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends defpackage.yy implements defpackage.va {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final java.lang.String[] E;
    public float F;
    public final android.content.res.ColorStateList G;
    public final com.google.android.material.timepicker.ClockHandView s;
    public final android.graphics.Rect t;
    public final android.graphics.RectF u;
    public final android.graphics.Rect v;
    public final android.util.SparseArray w;
    public final com.google.android.material.timepicker.c x;
    public final int[] y;
    public final float[] z;

    public ClockFaceView(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            r10.<init>(r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.t = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.u = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.v = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r10.w = r0
            r1 = 3
            float[] r1 = new float[r1]
            r1 = {x014c: FILL_ARRAY_DATA , data: [0, 1063675494, 1065353216} // fill-array
            r10.z = r1
            int[] r1 = defpackage.wy.d
            r2 = 2131821646(0x7f11044e, float:1.9276041E38)
            r3 = 2130969286(0x7f0402c6, float:1.754725E38)
            android.content.res.TypedArray r12 = r11.obtainStyledAttributes(r12, r1, r3, r2)
            android.content.res.Resources r1 = r10.getResources()
            r2 = 1
            android.content.res.ColorStateList r3 = defpackage.ct.n(r11, r12, r2)
            r10.G = r3
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r11)
            r5 = 2131492920(0x7f0c0038, float:1.8609306E38)
            r4.inflate(r5, r10, r2)
            r4 = 2131296473(0x7f0900d9, float:1.8210864E38)
            android.view.View r4 = r10.findViewById(r4)
            com.google.android.material.timepicker.ClockHandView r4 = (com.google.android.material.timepicker.ClockHandView) r4
            r10.s = r4
            r5 = 2131165730(0x7f070222, float:1.7945685E38)
            int r5 = r1.getDimensionPixelSize(r5)
            r10.A = r5
            r5 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r5 = new int[]{r5}
            int r6 = r3.getDefaultColor()
            int r5 = r3.getColorForState(r5, r6)
            int r3 = r3.getDefaultColor()
            int[] r3 = new int[]{r5, r5, r3}
            r10.y = r3
            java.util.ArrayList r3 = r4.c
            r3.add(r10)
            r3 = 2131100335(0x7f0602af, float:1.7813049E38)
            android.content.res.ColorStateList r3 = defpackage.ip.v(r11, r3)
            int r3 = r3.getDefaultColor()
            r4 = 0
            android.content.res.ColorStateList r11 = defpackage.ct.n(r11, r12, r4)
            if (r11 != 0) goto L8d
            goto L91
        L8d:
            int r3 = r11.getDefaultColor()
        L91:
            r10.setBackgroundColor(r3)
            android.view.ViewTreeObserver r11 = r10.getViewTreeObserver()
            com.google.android.material.timepicker.b r3 = new com.google.android.material.timepicker.b
            r3.<init>(r10)
            r11.addOnPreDrawListener(r3)
            r10.setFocusable(r2)
            r12.recycle()
            com.google.android.material.timepicker.c r11 = new com.google.android.material.timepicker.c
            r11.<init>(r10)
            r10.x = r11
            r11 = 12
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.String r12 = ""
            java.util.Arrays.fill(r11, r12)
            r10.E = r11
            android.content.Context r11 = r10.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            int r12 = r0.size()
            r3 = r4
            r5 = r3
        Lc6:
            java.lang.String[] r6 = r10.E
            int r6 = r6.length
            int r6 = java.lang.Math.max(r6, r12)
            if (r3 >= r6) goto L120
            java.lang.Object r6 = r0.get(r3)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String[] r7 = r10.E
            int r7 = r7.length
            if (r3 < r7) goto Le1
            r10.removeView(r6)
            r0.remove(r3)
            goto L11d
        Le1:
            if (r6 != 0) goto Lf2
            r6 = 2131492919(0x7f0c0037, float:1.8609303E38)
            android.view.View r6 = r11.inflate(r6, r10, r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0.put(r3, r6)
            r10.addView(r6)
        Lf2:
            java.lang.String[] r7 = r10.E
            r7 = r7[r3]
            r6.setText(r7)
            r7 = 2131296489(0x7f0900e9, float:1.8210896E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r6.setTag(r7, r8)
            int r7 = r3 / 12
            int r7 = r7 + r2
            r8 = 2131296474(0x7f0900da, float:1.8210866E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r6.setTag(r8, r9)
            if (r7 <= r2) goto L113
            r5 = r2
        L113:
            com.google.android.material.timepicker.c r7 = r10.x
            defpackage.ja0.l(r6, r7)
            android.content.res.ColorStateList r7 = r10.G
            r6.setTextColor(r7)
        L11d:
            int r3 = r3 + 1
            goto Lc6
        L120:
            com.google.android.material.timepicker.ClockHandView r11 = r10.s
            boolean r12 = r11.b
            if (r12 == 0) goto L12a
            if (r5 != 0) goto L12a
            r11.m = r2
        L12a:
            r11.b = r5
            r11.invalidate()
            r11 = 2131165758(0x7f07023e, float:1.7945742E38)
            int r11 = r1.getDimensionPixelSize(r11)
            r10.B = r11
            r11 = 2131165759(0x7f07023f, float:1.7945744E38)
            int r11 = r1.getDimensionPixelSize(r11)
            r10.C = r11
            r11 = 2131165737(0x7f070229, float:1.79457E38)
            int r11 = r1.getDimensionPixelSize(r11)
            r10.D = r11
            return
    }

    @Override // defpackage.yy
    public final void e() {
            r12 = this;
            oc r0 = new oc
            r0.<init>()
            r0.b(r12)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = r2
        Lf:
            int r4 = r12.getChildCount()
            r5 = 2131296356(0x7f090064, float:1.8210626E38)
            if (r3 >= r4) goto L59
            android.view.View r4 = r12.getChildAt(r3)
            int r6 = r4.getId()
            if (r6 == r5) goto L56
            java.lang.String r5 = "skip"
            java.lang.Object r6 = r4.getTag()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L2f
            goto L56
        L2f:
            r5 = 2131296474(0x7f0900da, float:1.8210866E38)
            java.lang.Object r5 = r4.getTag(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L3f
            r5 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L3f:
            boolean r6 = r1.containsKey(r5)
            if (r6 != 0) goto L4d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1.put(r5, r6)
        L4d:
            java.lang.Object r5 = r1.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
        L56:
            int r3 = r3 + 1
            goto Lf
        L59:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L61:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ld7
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r3.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6 = 2
            if (r3 != r6) goto L8c
            int r3 = r12.q
            float r3 = (float) r3
            r6 = 1059648963(0x3f28f5c3, float:0.66)
            float r3 = r3 * r6
            int r3 = java.lang.Math.round(r3)
            goto L8e
        L8c:
            int r3 = r12.q
        L8e:
            java.util.Iterator r6 = r4.iterator()
            r7 = 0
        L93:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L61
            java.lang.Object r8 = r6.next()
            android.view.View r8 = (android.view.View) r8
            int r8 = r8.getId()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r10 = r0.c
            boolean r9 = r10.containsKey(r9)
            if (r9 != 0) goto Lbb
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            jc r11 = new jc
            r11.<init>()
            r10.put(r9, r11)
        Lbb:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r10.get(r8)
            jc r8 = (defpackage.jc) r8
            kc r8 = r8.d
            r8.w = r5
            r8.x = r3
            r8.y = r7
            int r8 = r4.size()
            float r8 = (float) r8
            r9 = 1135869952(0x43b40000, float:360.0)
            float r9 = r9 / r8
            float r7 = r7 + r9
            goto L93
        Ld7:
            r0.a(r12)
            r0 = 0
            r12.setConstraintSet(r0)
            r12.requestLayout()
            r0 = r2
        Le2:
            android.util.SparseArray r1 = r12.w
            int r3 = r1.size()
            if (r0 >= r3) goto Lf6
            java.lang.Object r1 = r1.get(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r2)
            int r0 = r0 + 1
            goto Le2
        Lf6:
            return
    }

    public final void f() {
            r18 = this;
            r0 = r18
            com.google.android.material.timepicker.ClockHandView r1 = r0.s
            android.graphics.RectF r1 = r1.g
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3 = 0
            r4 = 0
            r6 = r3
            r5 = r4
        Ld:
            android.util.SparseArray r7 = r0.w
            int r8 = r7.size()
            android.graphics.Rect r9 = r0.t
            android.graphics.RectF r10 = r0.u
            if (r5 >= r8) goto L3d
            java.lang.Object r7 = r7.get(r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 != 0) goto L22
            goto L3a
        L22:
            r7.getHitRect(r9)
            r10.set(r9)
            r10.union(r1)
            float r8 = r10.width()
            float r9 = r10.height()
            float r9 = r9 * r8
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 >= 0) goto L3a
            r6 = r7
            r2 = r9
        L3a:
            int r5 = r5 + 1
            goto Ld
        L3d:
            r2 = r4
        L3e:
            int r5 = r7.size()
            if (r2 >= r5) goto La2
            java.lang.Object r5 = r7.get(r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 != 0) goto L4d
            goto L9f
        L4d:
            if (r5 != r6) goto L51
            r8 = 1
            goto L52
        L51:
            r8 = r4
        L52:
            r5.setSelected(r8)
            r5.getHitRect(r9)
            r10.set(r9)
            android.graphics.Rect r8 = r0.v
            r5.getLineBounds(r4, r8)
            int r11 = r8.left
            float r11 = (float) r11
            int r8 = r8.top
            float r8 = (float) r8
            r10.inset(r11, r8)
            boolean r8 = android.graphics.RectF.intersects(r1, r10)
            if (r8 != 0) goto L71
            r11 = r3
            goto L95
        L71:
            android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
            float r8 = r1.centerX()
            float r12 = r10.left
            float r12 = r8 - r12
            float r8 = r1.centerY()
            float r13 = r10.top
            float r13 = r8 - r13
            float r8 = r1.width()
            r14 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 * r8
            float[] r8 = r0.z
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP
            int[] r15 = r0.y
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L95:
            android.text.TextPaint r8 = r5.getPaint()
            r8.setShader(r11)
            r5.invalidate()
        L9f:
            int r2 = r2 + 1
            goto L3e
        La2:
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            java.lang.String[] r0 = r3.E
            int r0 = r0.length
            r1 = 0
            r2 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r2, r0, r1, r2)
            r4.setCollectionInfo(r0)
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.f()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            android.content.res.Resources r3 = r2.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r4 = r3.heightPixels
            float r4 = (float) r4
            int r3 = r3.widthPixels
            float r3 = (float) r3
            int r0 = r2.D
            float r0 = (float) r0
            int r1 = r2.B
            float r1 = (float) r1
            float r1 = r1 / r4
            int r4 = r2.C
            float r4 = (float) r4
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.max(r1, r4)
            float r3 = java.lang.Math.max(r4, r3)
            float r0 = r0 / r3
            int r3 = (int) r0
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r2.setMeasuredDimension(r3, r3)
            super.onMeasure(r4, r4)
            return
    }
}
