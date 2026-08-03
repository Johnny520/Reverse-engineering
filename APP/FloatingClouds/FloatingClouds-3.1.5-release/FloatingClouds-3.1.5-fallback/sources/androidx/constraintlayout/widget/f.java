package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public final class f extends android.view.ViewGroup {

    public static class a extends androidx.constraintlayout.widget.ConstraintLayout.a {
        public float m0;
        public boolean n0;
        public float o0;
        public float p0;
        public float q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            androidx.constraintlayout.widget.f$a r0 = new androidx.constraintlayout.widget.f$a
            r0.<init>()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.m0 = r1
            r2 = 0
            r0.n0 = r2
            r2 = 0
            r0.o0 = r2
            r0.p0 = r2
            r0.q0 = r2
            r0.r0 = r2
            r0.s0 = r1
            r0.t0 = r1
            r0.u0 = r2
            r0.v0 = r2
            r0.w0 = r2
            r0.x0 = r2
            r0.y0 = r2
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r6) {
            r5 = this;
            androidx.constraintlayout.widget.f$a r0 = new androidx.constraintlayout.widget.f$a
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1, r6)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.m0 = r2
            r3 = 0
            r0.n0 = r3
            r4 = 0
            r0.o0 = r4
            r0.p0 = r4
            r0.q0 = r4
            r0.r0 = r4
            r0.s0 = r2
            r0.t0 = r2
            r0.u0 = r4
            r0.v0 = r4
            r0.w0 = r4
            r0.x0 = r4
            r0.y0 = r4
            int[] r2 = androidx.constraintlayout.widget.R.styleable.ConstraintSet
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r2)
            int r1 = r6.getIndexCount()
        L31:
            if (r3 >= r1) goto Ldd
            int r2 = r6.getIndex(r3)
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_alpha
            if (r2 != r4) goto L45
            float r4 = r0.m0
            float r2 = r6.getFloat(r2, r4)
            r0.m0 = r2
            goto Ld9
        L45:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_elevation
            if (r2 != r4) goto L56
            float r4 = r0.o0
            float r2 = r6.getFloat(r2, r4)
            r0.o0 = r2
            r2 = 1
            r0.n0 = r2
            goto Ld9
        L56:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_rotationX
            if (r2 != r4) goto L64
            float r4 = r0.q0
            float r2 = r6.getFloat(r2, r4)
            r0.q0 = r2
            goto Ld9
        L64:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_rotationY
            if (r2 != r4) goto L72
            float r4 = r0.r0
            float r2 = r6.getFloat(r2, r4)
            r0.r0 = r2
            goto Ld9
        L72:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_rotation
            if (r2 != r4) goto L7f
            float r4 = r0.p0
            float r2 = r6.getFloat(r2, r4)
            r0.p0 = r2
            goto Ld9
        L7f:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_scaleX
            if (r2 != r4) goto L8c
            float r4 = r0.s0
            float r2 = r6.getFloat(r2, r4)
            r0.s0 = r2
            goto Ld9
        L8c:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_scaleY
            if (r2 != r4) goto L99
            float r4 = r0.t0
            float r2 = r6.getFloat(r2, r4)
            r0.t0 = r2
            goto Ld9
        L99:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_transformPivotX
            if (r2 != r4) goto La6
            float r4 = r0.u0
            float r2 = r6.getFloat(r2, r4)
            r0.u0 = r2
            goto Ld9
        La6:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_transformPivotY
            if (r2 != r4) goto Lb3
            float r4 = r0.v0
            float r2 = r6.getFloat(r2, r4)
            r0.v0 = r2
            goto Ld9
        Lb3:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_translationX
            if (r2 != r4) goto Lc0
            float r4 = r0.w0
            float r2 = r6.getFloat(r2, r4)
            r0.w0 = r2
            goto Ld9
        Lc0:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_translationY
            if (r2 != r4) goto Lcd
            float r4 = r0.x0
            float r2 = r6.getFloat(r2, r4)
            r0.x0 = r2
            goto Ld9
        Lcd:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintSet_android_translationZ
            if (r2 != r4) goto Ld9
            float r4 = r0.y0
            float r2 = r6.getFloat(r2, r4)
            r0.y0 = r2
        Ld9:
            int r3 = r3 + 1
            goto L31
        Ldd:
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = new androidx.constraintlayout.widget.ConstraintLayout$a
            r0.<init>(r2)
            return r0
    }

    public androidx.constraintlayout.widget.e getConstraintSet() {
            r1 = this;
            r1.getChildCount()
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }
}
