package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h7 extends android.widget.FrameLayout {
    public static final defpackage.g7 i = null;
    public final defpackage.f30 a;
    public int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;

    static {
            g7 r0 = new g7
            r0.<init>()
            defpackage.h7.i = r0
            return
    }

    public h7(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 0
            android.content.Context r5 = defpackage.ff.W(r5, r6, r0, r0)
            r4.<init>(r5, r6)
            android.content.Context r5 = r4.getContext()
            int[] r1 = defpackage.wy.x
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
            r2 = 6
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L23
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            java.util.WeakHashMap r3 = defpackage.ja0.a
            defpackage.y90.s(r4, r2)
        L23:
            r2 = 2
            int r2 = r1.getInt(r2, r0)
            r4.b = r2
            r2 = 8
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L3a
            r2 = 9
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L44
        L3a:
            e30 r6 = defpackage.f30.b(r5, r6, r0, r0)
            f30 r6 = r6.a()
            r4.a = r6
        L44:
            r6 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r2)
            r4.c = r6
            r6 = 4
            android.content.res.ColorStateList r5 = defpackage.ct.n(r5, r1, r6)
            r4.setBackgroundTintList(r5)
            r5 = 5
            r6 = -1
            int r5 = r1.getInt(r5, r6)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r5 = defpackage.gt.v(r5, r3)
            r4.setBackgroundTintMode(r5)
            r5 = 1
            float r2 = r1.getFloat(r5, r2)
            r4.d = r2
            int r2 = r1.getDimensionPixelSize(r0, r6)
            r4.e = r2
            r2 = 7
            int r6 = r1.getDimensionPixelSize(r2, r6)
            r4.f = r6
            r1.recycle()
            g7 r6 = defpackage.h7.i
            r4.setOnTouchListener(r6)
            r4.setFocusable(r5)
            android.graphics.drawable.Drawable r5 = r4.getBackground()
            if (r5 != 0) goto Lda
            float r5 = r4.getBackgroundOverlayColorAlpha()
            r6 = 2130968841(0x7f040109, float:1.7546347E38)
            int r6 = defpackage.zt.k(r4, r6)
            r1 = 2130968819(0x7f0400f3, float:1.7546302E38)
            int r1 = defpackage.zt.k(r4, r1)
            int r5 = defpackage.zt.E(r5, r6, r1)
            f30 r6 = r4.a
            if (r6 == 0) goto Lb2
            int r0 = defpackage.i7.a
            eu r0 = new eu
            r0.<init>(r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.j(r5)
            goto Lce
        Lb2:
            android.content.res.Resources r6 = r4.getResources()
            int r1 = defpackage.i7.a
            r1 = 2131165930(0x7f0702ea, float:1.794609E38)
            float r6 = r6.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r6)
            r1.setColor(r5)
            r0 = r1
        Lce:
            android.content.res.ColorStateList r5 = r4.g
            if (r5 == 0) goto Ld5
            defpackage.ch.h(r0, r5)
        Ld5:
            java.util.WeakHashMap r5 = defpackage.ja0.a
            defpackage.s90.q(r4, r0)
        Lda:
            return
    }

    private void setBaseTransientBottomBar(defpackage.i7 r1) {
            r0 = this;
            return
    }

    public float getActionTextColorAlpha() {
            r1 = this;
            float r0 = r1.d
            return r0
    }

    public int getAnimationMode() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public float getBackgroundOverlayColorAlpha() {
            r1 = this;
            float r0 = r1.c
            return r0
    }

    public int getMaxInlineActionWidth() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.w90.c(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            int r2 = r1.e
            if (r2 <= 0) goto L16
            int r0 = r1.getMeasuredWidth()
            if (r0 <= r2) goto L16
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            super.onMeasure(r2, r3)
        L16:
            return
    }

    public void setAnimationMode(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L14
            android.content.res.ColorStateList r0 = r1.g
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.content.res.ColorStateList r0 = r1.g
            defpackage.ch.h(r2, r0)
            android.graphics.PorterDuff$Mode r0 = r1.h
            defpackage.ch.i(r2, r0)
        L14:
            super.setBackgroundDrawable(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.g = r2
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto L21
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            defpackage.ch.h(r0, r2)
            android.graphics.PorterDuff$Mode r2 = r1.h
            defpackage.ch.i(r0, r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            if (r0 == r2) goto L21
            super.setBackgroundDrawable(r0)
        L21:
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.h = r2
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto L1c
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            defpackage.ch.i(r0, r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            if (r0 == r2) goto L1c
            super.setBackgroundDrawable(r0)
        L1c:
            return
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams r5) {
            r4 = this;
            super.setLayoutParams(r5)
            boolean r0 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L16
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r5.leftMargin
            int r2 = r5.topMargin
            int r3 = r5.rightMargin
            int r5 = r5.bottomMargin
            r0.<init>(r1, r2, r3, r5)
        L16:
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 0
            goto L6
        L4:
            g7 r0 = defpackage.h7.i
        L6:
            r1.setOnTouchListener(r0)
            super.setOnClickListener(r2)
            return
    }
}
