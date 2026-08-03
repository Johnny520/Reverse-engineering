package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends androidx.constraintlayout.widget.c {
    public boolean g;
    public boolean h;

    public i(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.constraintlayout.widget.c
    public void e(android.util.AttributeSet r6) {
            r5 = this;
            super.e(r6)
            if (r6 == 0) goto L2b
            android.content.Context r0 = r5.getContext()
            int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            int r0 = r6.getIndexCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L2b
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_visibility
            r4 = 1
            if (r2 != r3) goto L22
            r5.g = r4
            goto L28
        L22:
            int r3 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_elevation
            if (r2 != r3) goto L28
            r5.h = r4
        L28:
            int r1 = r1 + 1
            goto L14
        L2b:
            return
    }

    public void h(a.Yg r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public final void onAttachedToWindow() {
            r6 = this;
            super.onAttachedToWindow()
            boolean r0 = r6.g
            if (r0 != 0) goto Lb
            boolean r0 = r6.h
            if (r0 == 0) goto L4d
        Lb:
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L4d
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L4d
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            int r1 = r6.getVisibility()
            float r2 = r6.getElevation()
            r3 = 0
        L20:
            int r4 = r6.b
            if (r3 >= r4) goto L4d
            int[] r4 = r6.f864a
            r4 = r4[r3]
            android.util.SparseArray<android.view.View> r5 = r0.f857a
            java.lang.Object r4 = r5.get(r4)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L4a
            boolean r5 = r6.g
            if (r5 == 0) goto L39
            r4.setVisibility(r1)
        L39:
            boolean r5 = r6.h
            if (r5 == 0) goto L4a
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L4a
            float r5 = r4.getTranslationZ()
            float r5 = r5 + r2
            r4.setTranslationZ(r5)
        L4a:
            int r3 = r3 + 1
            goto L20
        L4d:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            r0.c()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0.c()
            return
    }
}
