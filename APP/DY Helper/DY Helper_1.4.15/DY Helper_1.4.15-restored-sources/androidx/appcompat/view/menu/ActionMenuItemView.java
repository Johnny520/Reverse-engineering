package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends androidx.appcompat.widget.AppCompatTextView implements p000.vz0, android.view.View.OnClickListener, p000.InterfaceC1150 {

    /* JADX INFO: renamed from: λ */
    public p000.lz0 f423;

    /* JADX INFO: renamed from: μ */
    public java.lang.CharSequence f424;

    /* JADX INFO: renamed from: ν */
    public android.graphics.drawable.Drawable f425;

    /* JADX INFO: renamed from: ξ */
    public p000.hz0 f426;

    /* JADX INFO: renamed from: ο */
    public p000.C1145 f427;

    /* JADX INFO: renamed from: π */
    public p000.AbstractC1146 f428;

    /* JADX INFO: renamed from: ρ */
    public boolean f429;

    /* JADX INFO: renamed from: σ */
    public boolean f430;

    /* JADX INFO: renamed from: τ */
    public final int f431;

    /* JADX INFO: renamed from: υ */
    public int f432;

    /* JADX INFO: renamed from: φ */
    public final int f433;

    public ActionMenuItemView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.content.res.Resources r0 = r4.getResources()
            boolean r1 = r3.m235()
            r3.f429 = r1
            int[] r1 = p000.kk1.f5969
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r2)
            int r5 = r4.getDimensionPixelSize(r2, r2)
            r3.f431 = r5
            r4.recycle()
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r3.f433 = r4
            r3.setOnClickListener(r3)
            r4 = -1
            r3.f432 = r4
            r3.setSaveEnabled(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r0 = this;
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // p000.vz0
    public p000.lz0 getItemData() {
            r0 = this;
            lz0 r0 = r0.f423
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            hz0 r1 = r0.f426
            if (r1 == 0) goto L9
            lz0 r0 = r0.f423
            r1.mo237(r0)
        L9:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            boolean r1 = r0.m235()
            r0.f429 = r1
            r0.m236()
            return
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int r6, int r7) {
            r5 = this;
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            int r1 = r5.f432
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
            int r4 = r5.f431
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
            android.graphics.drawable.Drawable r6 = r5.f425
            if (r6 == 0) goto L6d
            int r6 = r5.getMeasuredWidth()
            android.graphics.drawable.Drawable r7 = r5.f425
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
            lz0 r0 = r1.f423
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L14
            ｏ r0 = r1.f427
            if (r0 == 0) goto L14
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto L14
            r1 = 1
            return r1
        L14:
            boolean r1 = super.onTouchEvent(r2)
            return r1
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
            boolean r0 = r1.f430
            if (r0 == r2) goto L12
            r1.f430 = r2
            lz0 r1 = r1.f423
            if (r1 == 0) goto L12
            iz0 r1 = r1.f6866
            r2 = 1
            r1.f5261 = r2
            r1.m2836(r2)
        L12:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.f425 = r5
            if (r5 == 0) goto L25
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.f433
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
            r4.m236()
            return
    }

    public void setItemInvoker(p000.hz0 r1) {
            r0 = this;
            r0.f426 = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f432 = r1
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public void setPopupCallback(p000.AbstractC1146 r1) {
            r0 = this;
            r0.f428 = r1
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f424 = r1
            r0.m236()
            return
    }

    @Override // p000.vz0
    /* JADX INFO: renamed from: α */
    public final void mo232(p000.lz0 r2) {
            r1 = this;
            r1.f423 = r2
            android.graphics.drawable.Drawable r0 = r2.getIcon()
            r1.setIcon(r0)
            java.lang.CharSequence r0 = r2.getTitleCondensed()
            r1.setTitle(r0)
            int r0 = r2.f6853
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
            ｏ r2 = r1.f427
            if (r2 != 0) goto L3a
            ｏ r2 = new ｏ
            r2.<init>(r1)
            r1.f427 = r2
        L3a:
            return
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: β */
    public final boolean mo233() {
            r0 = this;
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: γ */
    public final boolean mo234() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            lz0 r1 = r1.f423
            android.graphics.drawable.Drawable r1 = r1.getIcon()
            if (r1 != 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m235() {
            r4 = this;
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r0 = r4.screenWidthDp
            int r1 = r4.screenHeightDp
            r2 = 480(0x1e0, float:6.73E-43)
            if (r0 >= r2) goto L22
            r3 = 640(0x280, float:8.97E-43)
            if (r0 < r3) goto L1a
            if (r1 >= r2) goto L22
        L1a:
            int r4 = r4.orientation
            r0 = 2
            if (r4 != r0) goto L20
            goto L22
        L20:
            r4 = 0
            return r4
        L22:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    public final void m236() {
            r4 = this;
            java.lang.CharSequence r0 = r4.f424
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            android.graphics.drawable.Drawable r2 = r4.f425
            if (r2 == 0) goto L1e
            lz0 r2 = r4.f423
            int r2 = r2.f6848
            r3 = 4
            r2 = r2 & r3
            if (r2 != r3) goto L1d
            boolean r2 = r4.f429
            if (r2 != 0) goto L1e
            boolean r2 = r4.f430
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L25
            java.lang.CharSequence r2 = r4.f424
            goto L26
        L25:
            r2 = r1
        L26:
            r4.setText(r2)
            lz0 r2 = r4.f423
            java.lang.CharSequence r2 = r2.f6869
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L3f
            if (r0 == 0) goto L37
            r2 = r1
            goto L3b
        L37:
            lz0 r2 = r4.f423
            java.lang.CharSequence r2 = r2.f6857
        L3b:
            r4.setContentDescription(r2)
            goto L42
        L3f:
            r4.setContentDescription(r2)
        L42:
            lz0 r2 = r4.f423
            java.lang.CharSequence r2 = r2.f6870
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L57
            if (r0 == 0) goto L4f
            goto L53
        L4f:
            lz0 r0 = r4.f423
            java.lang.CharSequence r1 = r0.f6857
        L53:
            p000.c52.m1142(r4, r1)
            return
        L57:
            p000.c52.m1142(r4, r2)
            return
    }
}
