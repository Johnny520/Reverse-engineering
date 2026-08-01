package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends defpackage.C1454 implements defpackage.InterfaceC1637, android.view.View.OnClickListener, defpackage.InterfaceC1298 {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f16;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public defpackage.InterfaceC0705 f17;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.C0254 f18;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public boolean f19;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final int f20;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public defpackage.C1227 f21;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public java.lang.CharSequence f22;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public defpackage.AbstractC1780 f23;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final int f24;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public int f25;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public boolean f26;

    public ActionMenuItemView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            android.content.res.Resources r1 = r4.getResources()
            boolean r2 = r3.m12()
            r3.f19 = r2
            int[] r2 = defpackage.AbstractC1070.f4791
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r0)
            int r5 = r4.getDimensionPixelSize(r0, r0)
            r3.f24 = r5
            r4.recycle()
            android.util.DisplayMetrics r4 = r1.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r3.f20 = r4
            r3.setOnClickListener(r3)
            r4 = -1
            r3.f25 = r4
            r3.setSaveEnabled(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r0 = this;
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // defpackage.InterfaceC1637
    public defpackage.C0254 getItemData() {
            r0 = this;
            ᛲᛲᛶᲁ r0 = r0.f18
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            ᛴᛷᛵᛱ r1 = r0.f17
            if (r1 == 0) goto L9
            ᛲᛲᛶᲁ r0 = r0.f18
            r1.mo16(r0)
        L9:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            boolean r1 = r0.m12()
            r0.f19 = r1
            r0.m11()
            return
    }

    @Override // defpackage.C1454, android.widget.TextView, android.view.View
    public final void onMeasure(int r6, int r7) {
            r5 = this;
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            int r1 = r5.f25
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
            int r4 = r5.f24
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
            android.graphics.drawable.Drawable r6 = r5.f16
            if (r6 == 0) goto L6d
            int r6 = r5.getMeasuredWidth()
            android.graphics.drawable.Drawable r7 = r5.f16
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
            ᛲᛲᛶᲁ r0 = r1.f18
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L14
            ᛷᛲᛶᲀ r0 = r1.f21
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
            boolean r0 = r1.f26
            if (r0 == r2) goto L12
            r1.f26 = r2
            ᛲᛲᛶᲁ r1 = r1.f18
            if (r1 == 0) goto L12
            ᲀᛷᛱᲇ r1 = r1.f1505
            r2 = 1
            r1.f7569 = r2
            r1.m3088(r2)
        L12:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.f16 = r5
            if (r5 == 0) goto L25
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.f20
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
            r4.m11()
            return
    }

    public void setItemInvoker(defpackage.InterfaceC0705 r1) {
            r0 = this;
            r0.f17 = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f25 = r1
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public void setPopupCallback(defpackage.AbstractC1780 r1) {
            r0 = this;
            r0.f23 = r1
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f22 = r1
            r0.m11()
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m11() {
            r4 = this;
            java.lang.CharSequence r0 = r4.f22
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            android.graphics.drawable.Drawable r2 = r4.f16
            if (r2 == 0) goto L1e
            ᛲᛲᛶᲁ r2 = r4.f18
            int r2 = r2.f1500
            r3 = 4
            r2 = r2 & r3
            if (r2 != r3) goto L1d
            boolean r2 = r4.f19
            if (r2 != 0) goto L1e
            boolean r2 = r4.f26
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L25
            java.lang.CharSequence r2 = r4.f22
            goto L26
        L25:
            r2 = r1
        L26:
            r4.setText(r2)
            ᛲᛲᛶᲁ r2 = r4.f18
            java.lang.CharSequence r2 = r2.f1487
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L3f
            if (r0 == 0) goto L37
            r2 = r1
            goto L3b
        L37:
            ᛲᛲᛶᲁ r2 = r4.f18
            java.lang.CharSequence r2 = r2.f1507
        L3b:
            r4.setContentDescription(r2)
            goto L42
        L3f:
            r4.setContentDescription(r2)
        L42:
            ᛲᛲᛶᲁ r2 = r4.f18
            java.lang.CharSequence r2 = r2.f1485
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L57
            if (r0 == 0) goto L4f
            goto L53
        L4f:
            ᛲᛲᛶᲁ r0 = r4.f18
            java.lang.CharSequence r1 = r0.f1507
        L53:
            defpackage.AbstractC2137.m3557(r4, r1)
            return
        L57:
            defpackage.AbstractC2137.m3557(r4, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean m12() {
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

    @Override // defpackage.InterfaceC1298
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean mo13() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            ᛲᛲᛶᲁ r1 = r1.f18
            android.graphics.drawable.Drawable r1 = r1.getIcon()
            if (r1 != 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC1637
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo14(defpackage.C0254 r2) {
            r1 = this;
            r1.f18 = r2
            android.graphics.drawable.Drawable r0 = r2.getIcon()
            r1.setIcon(r0)
            java.lang.CharSequence r0 = r2.getTitleCondensed()
            r1.setTitle(r0)
            int r0 = r2.f1494
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
            ᛷᛲᛶᲀ r2 = r1.f21
            if (r2 != 0) goto L3a
            ᛷᛲᛶᲀ r2 = new ᛷᛲᛶᲀ
            r2.<init>(r1)
            r1.f21 = r2
        L3a:
            return
    }

    @Override // defpackage.InterfaceC1298
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean mo15() {
            r0 = this;
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }
}
