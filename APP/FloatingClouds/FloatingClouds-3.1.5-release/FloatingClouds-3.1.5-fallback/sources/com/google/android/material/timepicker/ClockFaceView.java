package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends a.Mc implements com.google.android.material.timepicker.ClockHandView.a {
    public final float[] A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final java.lang.String[] F;
    public float G;
    public final android.content.res.ColorStateList H;
    public final com.google.android.material.timepicker.ClockHandView t;
    public final android.graphics.Rect u;
    public final android.graphics.RectF v;
    public final android.graphics.Rect w;
    public final android.util.SparseArray<android.widget.TextView> x;
    public final com.google.android.material.timepicker.b y;
    public final int[] z;

    public ClockFaceView(android.content.Context r12, android.util.AttributeSet r13) {
            r11 = this;
            r0 = 12
            r1 = 1
            int r2 = com.google.android.material.R.attr.materialClockStyle
            r11.<init>(r12, r13, r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r11.u = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r11.v = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r11.w = r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r11.x = r3
            r4 = 3
            float[] r4 = new float[r4]
            r4 = {x0142: FILL_ARRAY_DATA , data: [0, 1063675494, 1065353216} // fill-array
            r11.A = r4
            int[] r4 = com.google.android.material.R.styleable.ClockFaceView
            int r5 = com.google.android.material.R.style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r4, r2, r5)
            android.content.res.Resources r2 = r11.getResources()
            int r4 = com.google.android.material.R.styleable.ClockFaceView_clockNumberTextColor
            android.content.res.ColorStateList r4 = a.Sa.b(r12, r13, r4)
            r11.H = r4
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r12)
            int r6 = com.google.android.material.R.layout.material_clockface_view
            r5.inflate(r6, r11, r1)
            int r5 = com.google.android.material.R.id.material_clock_hand
            android.view.View r5 = r11.findViewById(r5)
            com.google.android.material.timepicker.ClockHandView r5 = (com.google.android.material.timepicker.ClockHandView) r5
            r11.t = r5
            int r6 = com.google.android.material.R.dimen.material_clock_hand_padding
            int r6 = r2.getDimensionPixelSize(r6)
            r11.B = r6
            r6 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r6 = new int[]{r6}
            int r7 = r4.getDefaultColor()
            int r6 = r4.getColorForState(r6, r7)
            int r4 = r4.getDefaultColor()
            int[] r4 = new int[]{r6, r6, r4}
            r11.z = r4
            java.util.ArrayList r4 = r5.c
            r4.add(r11)
            int r4 = com.google.android.material.R.color.material_timepicker_clockface
            android.content.res.ColorStateList r4 = a.Y3.a(r12, r4)
            int r4 = r4.getDefaultColor()
            int r5 = com.google.android.material.R.styleable.ClockFaceView_clockFaceBackgroundColor
            android.content.res.ColorStateList r12 = a.Sa.b(r12, r13, r5)
            if (r12 != 0) goto L8c
            goto L90
        L8c:
            int r4 = r12.getDefaultColor()
        L90:
            r11.setBackgroundColor(r4)
            android.view.ViewTreeObserver r12 = r11.getViewTreeObserver()
            com.google.android.material.timepicker.a r4 = new com.google.android.material.timepicker.a
            r4.<init>(r11)
            r12.addOnPreDrawListener(r4)
            r11.setFocusable(r1)
            r13.recycle()
            com.google.android.material.timepicker.b r12 = new com.google.android.material.timepicker.b
            r12.<init>(r11)
            r11.y = r12
            java.lang.String[] r12 = new java.lang.String[r0]
            java.lang.String r13 = ""
            java.util.Arrays.fill(r12, r13)
            r11.F = r12
            android.content.Context r12 = r11.getContext()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r12)
            int r13 = r3.size()
            r4 = 0
            r5 = r4
            r6 = r5
        Lc4:
            java.lang.String[] r7 = r11.F
            int r7 = r7.length
            int r7 = java.lang.Math.max(r7, r13)
            if (r5 >= r7) goto L11a
            java.lang.Object r7 = r3.get(r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String[] r8 = r11.F
            int r8 = r8.length
            if (r5 < r8) goto Ldf
            r11.removeView(r7)
            r3.remove(r5)
            goto L118
        Ldf:
            if (r7 != 0) goto Lef
            int r7 = com.google.android.material.R.layout.material_clockface_textview
            android.view.View r7 = r12.inflate(r7, r11, r4)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3.put(r5, r7)
            r11.addView(r7)
        Lef:
            java.lang.String[] r8 = r11.F
            r8 = r8[r5]
            r7.setText(r8)
            int r8 = com.google.android.material.R.id.material_value_index
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.setTag(r8, r9)
            int r8 = r5 / 12
            int r8 = r8 + r1
            int r9 = com.google.android.material.R.id.material_clock_level
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r7.setTag(r9, r10)
            if (r8 <= r1) goto L10e
            r6 = r1
        L10e:
            com.google.android.material.timepicker.b r8 = r11.y
            a.C0414ug.j(r7, r8)
            android.content.res.ColorStateList r8 = r11.H
            r7.setTextColor(r8)
        L118:
            int r5 = r5 + r1
            goto Lc4
        L11a:
            com.google.android.material.timepicker.ClockHandView r12 = r11.t
            boolean r13 = r12.b
            if (r13 == 0) goto L124
            if (r6 != 0) goto L124
            r12.m = r1
        L124:
            r12.b = r6
            r12.invalidate()
            int r12 = com.google.android.material.R.dimen.material_time_picker_minimum_screen_height
            int r12 = r2.getDimensionPixelSize(r12)
            r11.C = r12
            int r12 = com.google.android.material.R.dimen.material_time_picker_minimum_screen_width
            int r12 = r2.getDimensionPixelSize(r12)
            r11.D = r12
            int r12 = com.google.android.material.R.dimen.material_clock_size
            int r12 = r2.getDimensionPixelSize(r12)
            r11.E = r12
            return
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float r3) {
            r2 = this;
            float r0 = r2.G
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            r1 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L13
            r2.G = r3
            r2.g()
        L13:
            return
    }

    @Override // a.Mc
    public final void f() {
            r4 = this;
            super.f()
            r0 = 0
            r1 = r0
        L5:
            android.util.SparseArray<android.widget.TextView> r2 = r4.x
            int r3 = r2.size()
            if (r1 >= r3) goto L19
            java.lang.Object r2 = r2.get(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setVisibility(r0)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    public final void g() {
            r18 = this;
            r0 = r18
            com.google.android.material.timepicker.ClockHandView r1 = r0.t
            android.graphics.RectF r1 = r1.g
            r2 = 0
            r3 = 0
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r6 = r2
            r5 = r3
        Ld:
            android.util.SparseArray<android.widget.TextView> r7 = r0.x
            int r8 = r7.size()
            android.graphics.RectF r9 = r0.v
            android.graphics.Rect r10 = r0.u
            if (r5 >= r8) goto L3d
            java.lang.Object r7 = r7.get(r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 != 0) goto L22
            goto L3a
        L22:
            r7.getHitRect(r10)
            r9.set(r10)
            r9.union(r1)
            float r8 = r9.width()
            float r9 = r9.height()
            float r9 = r9 * r8
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 >= 0) goto L3a
            r6 = r7
            r4 = r9
        L3a:
            int r5 = r5 + 1
            goto Ld
        L3d:
            r4 = r3
        L3e:
            int r5 = r7.size()
            if (r4 >= r5) goto La2
            java.lang.Object r5 = r7.get(r4)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 != 0) goto L4d
            goto L9f
        L4d:
            if (r5 != r6) goto L51
            r8 = 1
            goto L52
        L51:
            r8 = r3
        L52:
            r5.setSelected(r8)
            r5.getHitRect(r10)
            r9.set(r10)
            android.graphics.Rect r8 = r0.w
            r5.getLineBounds(r3, r8)
            int r11 = r8.left
            float r11 = (float) r11
            int r8 = r8.top
            float r8 = (float) r8
            r9.inset(r11, r8)
            boolean r8 = android.graphics.RectF.intersects(r1, r9)
            if (r8 != 0) goto L71
            r11 = r2
            goto L95
        L71:
            android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
            float r8 = r1.centerX()
            float r12 = r9.left
            float r12 = r8 - r12
            float r8 = r1.centerY()
            float r13 = r9.top
            float r13 = r8 - r13
            float r8 = r1.width()
            r14 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 * r8
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP
            int[] r15 = r0.z
            float[] r8 = r0.A
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L95:
            android.text.TextPaint r8 = r5.getPaint()
            r8.setShader(r11)
            r5.invalidate()
        L9f:
            int r4 = r4 + 1
            goto L3e
        La2:
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            java.lang.String[] r0 = r3.F
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
            r0.g()
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
            int r0 = r2.E
            float r0 = (float) r0
            int r1 = r2.C
            float r1 = (float) r1
            float r1 = r1 / r4
            int r4 = r2.D
            float r4 = (float) r4
            float r4 = r4 / r3
            float r3 = java.lang.Math.max(r1, r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.max(r3, r4)
            float r0 = r0 / r3
            int r3 = (int) r0
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r2.setMeasuredDimension(r3, r3)
            super.onMeasure(r4, r4)
            return
    }
}
