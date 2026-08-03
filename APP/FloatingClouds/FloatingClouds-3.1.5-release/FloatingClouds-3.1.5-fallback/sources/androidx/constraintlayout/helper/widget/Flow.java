package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends androidx.constraintlayout.widget.i {
    public a.H6 i;

    public Flow(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.constraintlayout.widget.i, androidx.constraintlayout.widget.c
    public final void e(android.util.AttributeSet r7) {
            r6 = this;
            super.e(r7)
            a.H6 r0 = new a.H6
            r0.<init>()
            r6.i = r0
            if (r7 == 0) goto L197
            android.content.Context r0 = r6.getContext()
            int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = r1
        L1c:
            if (r2 >= r0) goto L197
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_orientation
            if (r3 != r4) goto L30
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r1)
            r4.J0 = r3
            goto L193
        L30:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_padding
            if (r3 != r4) goto L44
            a.H6 r4 = r6.i
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.g0 = r3
            r4.h0 = r3
            r4.i0 = r3
            r4.j0 = r3
            goto L193
        L44:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingStart
            if (r3 != r4) goto L56
            a.H6 r4 = r6.i
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.i0 = r3
            r4.k0 = r3
            r4.l0 = r3
            goto L193
        L56:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingEnd
            if (r3 != r4) goto L64
            a.H6 r4 = r6.i
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.j0 = r3
            goto L193
        L64:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingLeft
            if (r3 != r4) goto L72
            a.H6 r4 = r6.i
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.k0 = r3
            goto L193
        L72:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingTop
            if (r3 != r4) goto L80
            a.H6 r4 = r6.i
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.g0 = r3
            goto L193
        L80:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingRight
            if (r3 != r4) goto L8e
            a.H6 r4 = r6.i
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.l0 = r3
            goto L193
        L8e:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingBottom
            if (r3 != r4) goto L9c
            a.H6 r4 = r6.i
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.h0 = r3
            goto L193
        L9c:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_wrapMode
            if (r3 != r4) goto Laa
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r1)
            r4.H0 = r3
            goto L193
        Laa:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_horizontalStyle
            if (r3 != r4) goto Lb8
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r1)
            r4.r0 = r3
            goto L193
        Lb8:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_verticalStyle
            if (r3 != r4) goto Lc6
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r1)
            r4.s0 = r3
            goto L193
        Lc6:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle
            if (r3 != r4) goto Ld4
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r1)
            r4.t0 = r3
            goto L193
        Ld4:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle
            if (r3 != r4) goto Le2
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r1)
            r4.v0 = r3
            goto L193
        Le2:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle
            if (r3 != r4) goto Lf0
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r1)
            r4.u0 = r3
            goto L193
        Lf0:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle
            if (r3 != r4) goto Lfe
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r1)
            r4.w0 = r3
            goto L193
        Lfe:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_horizontalBias
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r3 != r4) goto L10e
            a.H6 r4 = r6.i
            float r3 = r7.getFloat(r3, r5)
            r4.x0 = r3
            goto L193
        L10e:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias
            if (r3 != r4) goto L11c
            a.H6 r4 = r6.i
            float r3 = r7.getFloat(r3, r5)
            r4.z0 = r3
            goto L193
        L11c:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias
            if (r3 != r4) goto L12a
            a.H6 r4 = r6.i
            float r3 = r7.getFloat(r3, r5)
            r4.B0 = r3
            goto L193
        L12a:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias
            if (r3 != r4) goto L137
            a.H6 r4 = r6.i
            float r3 = r7.getFloat(r3, r5)
            r4.A0 = r3
            goto L193
        L137:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias
            if (r3 != r4) goto L144
            a.H6 r4 = r6.i
            float r3 = r7.getFloat(r3, r5)
            r4.C0 = r3
            goto L193
        L144:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_verticalBias
            if (r3 != r4) goto L151
            a.H6 r4 = r6.i
            float r3 = r7.getFloat(r3, r5)
            r4.y0 = r3
            goto L193
        L151:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_horizontalAlign
            r5 = 2
            if (r3 != r4) goto L15f
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r5)
            r4.F0 = r3
            goto L193
        L15f:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_verticalAlign
            if (r3 != r4) goto L16c
            a.H6 r4 = r6.i
            int r3 = r7.getInt(r3, r5)
            r4.G0 = r3
            goto L193
        L16c:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_horizontalGap
            if (r3 != r4) goto L179
            a.H6 r4 = r6.i
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.D0 = r3
            goto L193
        L179:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_verticalGap
            if (r3 != r4) goto L186
            a.H6 r4 = r6.i
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.E0 = r3
            goto L193
        L186:
            int r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap
            if (r3 != r4) goto L193
            a.H6 r4 = r6.i
            r5 = -1
            int r3 = r7.getInt(r3, r5)
            r4.I0 = r3
        L193:
            int r2 = r2 + 1
            goto L1c
        L197:
            a.H6 r7 = r6.i
            r6.d = r7
            r6.g()
            return
    }

    @Override // androidx.constraintlayout.widget.c
    public final void f(a.N3 r3, boolean r4) {
            r2 = this;
            a.H6 r3 = r2.i
            int r0 = r3.i0
            if (r0 > 0) goto Lc
            int r1 = r3.j0
            if (r1 <= 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            if (r4 == 0) goto L15
            int r4 = r3.j0
            r3.k0 = r4
            r3.l0 = r0
            return
        L15:
            r3.k0 = r0
            int r4 = r3.j0
            r3.l0 = r4
            return
    }

    @Override // androidx.constraintlayout.widget.i
    public final void h(a.Yg r3, int r4, int r5) {
            r2 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r3 == 0) goto L1d
            r3.C(r0, r4, r1, r5)
            int r4 = r3.n0
            int r3 = r3.o0
            r2.setMeasuredDimension(r4, r3)
            return
        L1d:
            r3 = 0
            r2.setMeasuredDimension(r3, r3)
            return
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    @android.annotation.SuppressLint({"WrongCall"})
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            a.H6 r0 = r1.i
            r1.h(r0, r2, r3)
            return
    }

    public void setFirstHorizontalBias(float r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.z0 = r2
            r1.requestLayout()
            return
    }

    public void setFirstHorizontalStyle(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.t0 = r2
            r1.requestLayout()
            return
    }

    public void setFirstVerticalBias(float r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.A0 = r2
            r1.requestLayout()
            return
    }

    public void setFirstVerticalStyle(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.u0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalAlign(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.F0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalBias(float r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.x0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalGap(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.D0 = r2
            r1.requestLayout()
            return
    }

    public void setHorizontalStyle(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.r0 = r2
            r1.requestLayout()
            return
    }

    public void setMaxElementsWrap(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.I0 = r2
            r1.requestLayout()
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.J0 = r2
            r1.requestLayout()
            return
    }

    public void setPadding(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.g0 = r2
            r0.h0 = r2
            r0.i0 = r2
            r0.j0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingBottom(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.h0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingLeft(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.k0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingRight(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.l0 = r2
            r1.requestLayout()
            return
    }

    public void setPaddingTop(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.g0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalAlign(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.G0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalBias(float r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.y0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalGap(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.E0 = r2
            r1.requestLayout()
            return
    }

    public void setVerticalStyle(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.s0 = r2
            r1.requestLayout()
            return
    }

    public void setWrapMode(int r2) {
            r1 = this;
            a.H6 r0 = r1.i
            r0.H0 = r2
            r1.requestLayout()
            return
    }
}
