package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.constraintlayout.widget.c {
    public int g;
    public int h;
    public a.V1 i;

    @Override // androidx.constraintlayout.widget.c
    public final void e(android.util.AttributeSet r7) {
            r6 = this;
            super.e(r7)
            a.V1 r0 = new a.V1
            r0.<init>()
            r6.i = r0
            if (r7 == 0) goto L4b
            android.content.Context r0 = r6.getContext()
            int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = r1
        L1c:
            if (r2 >= r0) goto L4b
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_barrierDirection
            if (r3 != r4) goto L2e
            int r3 = r7.getInt(r3, r1)
            r6.setType(r3)
            goto L48
        L2e:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets
            if (r3 != r4) goto L3c
            a.V1 r4 = r6.i
            r5 = 1
            boolean r3 = r7.getBoolean(r3, r5)
            r4.h0 = r3
            goto L48
        L3c:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_barrierMargin
            if (r3 != r4) goto L48
            int r3 = r7.getDimensionPixelSize(r3, r1)
            a.V1 r4 = r6.i
            r4.i0 = r3
        L48:
            int r2 = r2 + 1
            goto L1c
        L4b:
            a.V1 r7 = r6.i
            r6.d = r7
            r6.g()
            return
    }

    @Override // androidx.constraintlayout.widget.c
    public final void f(a.N3 r6, boolean r7) {
            r5 = this;
            int r0 = r5.g
            r5.h = r0
            r1 = 0
            r2 = 6
            r3 = 1
            r4 = 5
            if (r7 == 0) goto L14
            if (r0 != r4) goto Lf
            r5.h = r3
            goto L1d
        Lf:
            if (r0 != r2) goto L1d
            r5.h = r1
            goto L1d
        L14:
            if (r0 != r4) goto L19
            r5.h = r1
            goto L1d
        L19:
            if (r0 != r2) goto L1d
            r5.h = r3
        L1d:
            boolean r7 = r6 instanceof a.V1
            if (r7 == 0) goto L27
            a.V1 r6 = (a.V1) r6
            int r7 = r5.h
            r6.g0 = r7
        L27:
            return
    }

    public int getMargin() {
            r1 = this;
            a.V1 r0 = r1.i
            int r0 = r0.i0
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public void setAllowsGoneWidget(boolean r2) {
            r1 = this;
            a.V1 r0 = r1.i
            r0.h0 = r2
            return
    }

    public void setDpMargin(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            a.V1 r0 = r1.i
            r0.i0 = r2
            return
    }

    public void setMargin(int r2) {
            r1 = this;
            a.V1 r0 = r1.i
            r0.i0 = r2
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.g = r1
            return
    }
}
