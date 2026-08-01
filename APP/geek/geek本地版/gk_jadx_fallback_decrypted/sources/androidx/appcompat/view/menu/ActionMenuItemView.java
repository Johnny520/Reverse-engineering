package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends defpackage.g5 implements defpackage.ev, android.view.View.OnClickListener, defpackage.k1 {
    public defpackage.ou h;
    public java.lang.CharSequence i;
    public android.graphics.drawable.Drawable j;
    public defpackage.ju k;
    public defpackage.d1 l;
    public defpackage.e1 m;
    public boolean n;
    public boolean o;
    public final int p;
    public int q;
    public final int r;

    public ActionMenuItemView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            android.content.res.Resources r1 = r4.getResources()
            boolean r2 = r3.f()
            r3.n = r2
            int[] r2 = defpackage.xy.c
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r0)
            int r5 = r4.getDimensionPixelSize(r0, r0)
            r3.p = r5
            r4.recycle()
            android.util.DisplayMetrics r4 = r1.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r3.r = r4
            r3.setOnClickListener(r3)
            r4 = -1
            r3.q = r4
            r3.setSaveEnabled(r0)
            return
    }

    @Override // defpackage.k1
    public final boolean a() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.k1
    public final boolean b() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            ou r0 = r1.h
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            if (r0 != 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // defpackage.ev
    public final void c(defpackage.ou r2) {
            r1 = this;
            r1.h = r2
            android.graphics.drawable.Drawable r0 = r2.getIcon()
            r1.setIcon(r0)
            java.lang.CharSequence r0 = r2.getTitleCondensed()
            r1.setTitle(r0)
            int r0 = r2.a
            r1.setId(r0)
            boolean r0 = r2.isVisible()
            if (r0 == 0) goto L1d
            r0 = 0
            goto L1f
        L1d:
            r0 = 8
        L1f:
            r1.setVisibility(r0)
            boolean r0 = r2.isEnabled()
            r1.setEnabled(r0)
            boolean r2 = r2.hasSubMenu()
            if (r2 == 0) goto L3a
            d1 r2 = r1.l
            if (r2 != 0) goto L3a
            d1 r2 = new d1
            r2.<init>(r1)
            r1.l = r2
        L3a:
            return
    }

    public final boolean f() {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            r3 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r3) goto L22
            r4 = 640(0x280, float:8.97E-43)
            if (r1 < r4) goto L1a
            if (r2 >= r3) goto L22
        L1a:
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto L20
            goto L22
        L20:
            r0 = 0
            return r0
        L22:
            r0 = 1
            return r0
    }

    public final void g() {
            r4 = this;
            java.lang.CharSequence r0 = r4.i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            android.graphics.drawable.Drawable r2 = r4.j
            if (r2 == 0) goto L1e
            ou r2 = r4.h
            int r2 = r2.y
            r3 = 4
            r2 = r2 & r3
            if (r2 != r3) goto L1d
            boolean r2 = r4.n
            if (r2 != 0) goto L1e
            boolean r2 = r4.o
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L25
            java.lang.CharSequence r2 = r4.i
            goto L26
        L25:
            r2 = r1
        L26:
            r4.setText(r2)
            ou r2 = r4.h
            java.lang.CharSequence r2 = r2.q
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L3f
            if (r0 == 0) goto L37
            r2 = r1
            goto L3b
        L37:
            ou r2 = r4.h
            java.lang.CharSequence r2 = r2.e
        L3b:
            r4.setContentDescription(r2)
            goto L42
        L3f:
            r4.setContentDescription(r2)
        L42:
            ou r2 = r4.h
            java.lang.CharSequence r2 = r2.r
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L57
            if (r0 == 0) goto L4f
            goto L53
        L4f:
            ou r0 = r4.h
            java.lang.CharSequence r1 = r0.e
        L53:
            defpackage.l70.a(r4, r1)
            return
        L57:
            defpackage.l70.a(r4, r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // defpackage.ev
    public defpackage.ou getItemData() {
            r1 = this;
            ou r0 = r1.h
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            ju r2 = r1.k
            if (r2 == 0) goto L9
            ou r0 = r1.h
            r2.a(r0)
        L9:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            boolean r1 = r0.f()
            r0.n = r1
            r0.g()
            return
    }

    @Override // defpackage.g5, android.widget.TextView, android.view.View
    public final void onMeasure(int r6, int r7) {
            r5 = this;
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            int r1 = r5.q
            if (r1 < 0) goto L1d
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingRight()
            int r4 = r5.getPaddingBottom()
            super.setPadding(r1, r2, r3, r4)
        L1d:
            super.onMeasure(r6, r7)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getMeasuredWidth()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r5.p
            if (r1 != r3) goto L37
            int r6 = java.lang.Math.min(r6, r4)
            goto L38
        L37:
            r6 = r4
        L38:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L47
            if (r4 <= 0) goto L47
            if (r2 >= r6) goto L47
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            super.onMeasure(r6, r7)
        L47:
            if (r0 == 0) goto L6d
            android.graphics.drawable.Drawable r6 = r5.j
            if (r6 == 0) goto L6d
            int r6 = r5.getMeasuredWidth()
            android.graphics.drawable.Drawable r7 = r5.j
            android.graphics.Rect r7 = r7.getBounds()
            int r7 = r7.width()
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r7 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            int r1 = r5.getPaddingBottom()
            super.setPadding(r6, r7, r0, r1)
        L6d:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            r1 = 0
            super.onRestoreInstanceState(r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            ou r0 = r1.h
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L14
            d1 r0 = r1.l
            if (r0 == 0) goto L14
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    public void setCheckable(boolean r1) {
            r0 = this;
            return
    }

    public void setChecked(boolean r1) {
            r0 = this;
            return
    }

    public void setExpandedFormat(boolean r2) {
            r1 = this;
            boolean r0 = r1.o
            if (r0 == r2) goto L12
            r1.o = r2
            ou r2 = r1.h
            if (r2 == 0) goto L12
            ku r2 = r2.n
            r0 = 1
            r2.k = r0
            r2.p(r0)
        L12:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.j = r5
            if (r5 == 0) goto L25
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.r
            if (r0 <= r2) goto L17
            float r3 = (float) r2
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r1 = (int) r0
            r0 = r2
        L17:
            if (r1 <= r2) goto L20
            float r3 = (float) r2
            float r1 = (float) r1
            float r3 = r3 / r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            goto L21
        L20:
            r2 = r1
        L21:
            r1 = 0
            r5.setBounds(r1, r1, r0, r2)
        L25:
            r0 = 0
            r4.setCompoundDrawables(r5, r0, r0, r0)
            r4.g()
            return
    }

    public void setItemInvoker(defpackage.ju r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.q = r1
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public void setPopupCallback(defpackage.e1 r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.i = r1
            r0.g()
            return
    }
}
