package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class ActionMenuItemView extends Yue.C0508 implements androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355, android.view.View.OnClickListener, androidx.appcompat.widget.ActionMenuView.InterfaceC7368 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f25334 = "ActionMenuItemView";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f25335 = 32;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7348 f25336;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.CharSequence f25337;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25338;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7343.InterfaceC7345 f25339;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.AbstractViewOnTouchListenerC2750 f25340;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.ActionMenuItemView.AbstractC7331 f25341;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f25342;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f25343;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f25344;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f25345;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f25346;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$ۥ, reason: contains not printable characters */
    public class C7330 extends Yue.AbstractViewOnTouchListenerC2750 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.view.menu.ActionMenuItemView f25347;

        public C7330(androidx.appcompat.view.menu.ActionMenuItemView r1) {
                r0 = this;
                r0.f25347 = r1
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.InterfaceC5782 mo1750() {
                r1 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r1.f25347
                androidx.appcompat.view.menu.ActionMenuItemView$ۥ۟ r0 = r0.f25341
                if (r0 == 0) goto Lb
                Yue.ۥۢ۟۠ۤ r0 = r0.mo28166()
                return r0
            Lb:
                r0 = 0
                return r0
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo1751() {
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r3.f25347
                androidx.appcompat.view.menu.ۥ۟۟۟۟$ۥ۟ r1 = r0.f25339
                r2 = 0
                if (r1 == 0) goto L1c
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r0.f25336
                boolean r0 = r1.mo28167(r0)
                if (r0 == 0) goto L1c
                Yue.ۥۢ۟۠ۤ r0 = r3.mo1750()
                if (r0 == 0) goto L1c
                boolean r0 = r0.mo14691()
                if (r0 == 0) goto L1c
                r2 = 1
            L1c:
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractC7331 {
        public AbstractC7331() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public abstract Yue.InterfaceC5782 mo28166();
    }

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
            boolean r1 = r3.m28164()
            r3.f25342 = r1
            int[] r1 = Yue.C5058.C5071.f17621
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r2)
            int r5 = Yue.C5058.C5071.f17622
            int r5 = r4.getDimensionPixelSize(r5, r2)
            r3.f25344 = r5
            r4.recycle()
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r3.f25346 = r4
            r3.setOnClickListener(r3)
            r4 = -1
            r3.f25345 = r4
            r3.setSaveEnabled(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public androidx.appcompat.view.menu.C7348 getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.f25336
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void initialize(androidx.appcompat.view.menu.C7348 r1, int r2) {
            r0 = this;
            r0.f25336 = r1
            android.graphics.drawable.Drawable r2 = r1.getIcon()
            r0.setIcon(r2)
            java.lang.CharSequence r2 = r1.m28223(r0)
            r0.setTitle(r2)
            int r2 = r1.getItemId()
            r0.setId(r2)
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L1f
            r2 = 0
            goto L21
        L1f:
            r2 = 8
        L21:
            r0.setVisibility(r2)
            boolean r2 = r1.isEnabled()
            r0.setEnabled(r2)
            boolean r1 = r1.hasSubMenu()
            if (r1 == 0) goto L3c
            Yue.ۥ۠ۢۦۨ r1 = r0.f25340
            if (r1 != 0) goto L3c
            androidx.appcompat.view.menu.ActionMenuItemView$ۥ r1 = new androidx.appcompat.view.menu.ActionMenuItemView$ۥ
            r1.<init>(r0)
            r0.f25340 = r1
        L3c:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟$ۥ۟ r2 = r1.f25339
            if (r2 == 0) goto L9
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.f25336
            r2.mo28167(r0)
        L9:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            boolean r1 = r0.m28164()
            r0.f25342 = r1
            r0.m28165()
            return
    }

    @Override // Yue.C0508, android.widget.TextView, android.view.View
    public void onMeasure(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.m28163()
            if (r0 == 0) goto L19
            int r1 = r5.f25345
            if (r1 < 0) goto L19
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingRight()
            int r4 = r5.getPaddingBottom()
            super.setPadding(r1, r2, r3, r4)
        L19:
            super.onMeasure(r6, r7)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getMeasuredWidth()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L33
            int r3 = r5.f25344
            int r6 = java.lang.Math.min(r6, r3)
            goto L35
        L33:
            int r6 = r5.f25344
        L35:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L46
            int r1 = r5.f25344
            if (r1 <= 0) goto L46
            if (r2 >= r6) goto L46
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            super.onMeasure(r6, r7)
        L46:
            if (r0 != 0) goto L6c
            android.graphics.drawable.Drawable r6 = r5.f25338
            if (r6 == 0) goto L6c
            int r6 = r5.getMeasuredWidth()
            android.graphics.drawable.Drawable r7 = r5.f25338
            android.graphics.Rect r7 = r7.getBounds()
            int r7 = r7.width()
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r7 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            int r1 = r5.getPaddingBottom()
            super.setPadding(r6, r7, r0, r1)
        L6c:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            r1 = 0
            super.onRestoreInstanceState(r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.f25336
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L14
            Yue.ۥ۠ۢۦۨ r0 = r1.f25340
            if (r0 == 0) goto L14
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public boolean prefersCondensedTitle() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setCheckable(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setChecked(boolean r1) {
            r0 = this;
            return
    }

    public void setExpandedFormat(boolean r2) {
            r1 = this;
            boolean r0 = r1.f25343
            if (r0 == r2) goto Ld
            r1.f25343 = r2
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r2 = r1.f25336
            if (r2 == 0) goto Ld
            r2.m28217()
        Ld:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.f25338 = r5
            if (r5 == 0) goto L25
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.f25346
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
            r4.m28165()
            return
    }

    public void setItemInvoker(androidx.appcompat.view.menu.C7343.InterfaceC7345 r1) {
            r0 = this;
            r0.f25339 = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f25345 = r1
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public void setPopupCallback(androidx.appcompat.view.menu.ActionMenuItemView.AbstractC7331 r1) {
            r0 = this;
            r0.f25341 = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setShortcut(boolean r1, char r2) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f25337 = r1
            r0.m28165()
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355
    public boolean showsIcon() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC7368
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean mo28161() {
            r1 = this;
            boolean r0 = r1.m28163()
            return r0
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC7368
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean mo28162() {
            r1 = this;
            boolean r0 = r1.m28163()
            if (r0 == 0) goto L10
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.f25336
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m28163() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m28164() {
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
            goto L23
        L22:
            r0 = 1
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m28165() {
            r4 = this;
            java.lang.CharSequence r0 = r4.f25337
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            android.graphics.drawable.Drawable r2 = r4.f25338
            if (r2 == 0) goto L1e
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r2 = r4.f25336
            boolean r2 = r2.m28242()
            if (r2 == 0) goto L1d
            boolean r2 = r4.f25342
            if (r2 != 0) goto L1e
            boolean r2 = r4.f25343
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L25
            java.lang.CharSequence r2 = r4.f25337
            goto L26
        L25:
            r2 = r1
        L26:
            r4.setText(r2)
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r2 = r4.f25336
            java.lang.CharSequence r2 = r2.getContentDescription()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L43
            if (r0 == 0) goto L39
            r2 = r1
            goto L3f
        L39:
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r2 = r4.f25336
            java.lang.CharSequence r2 = r2.getTitle()
        L3f:
            r4.setContentDescription(r2)
            goto L46
        L43:
            r4.setContentDescription(r2)
        L46:
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r2 = r4.f25336
            java.lang.CharSequence r2 = r2.getTooltipText()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L5f
            if (r0 == 0) goto L55
            goto L5b
        L55:
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r4.f25336
            java.lang.CharSequence r1 = r0.getTitle()
        L5b:
            Yue.C6374.m23531(r4, r1)
            goto L62
        L5f:
            Yue.C6374.m23531(r4, r2)
        L62:
            return
    }
}
