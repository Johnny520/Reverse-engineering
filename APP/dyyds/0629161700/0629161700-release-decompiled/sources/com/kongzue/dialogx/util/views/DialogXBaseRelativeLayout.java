package com.kongzue.dialogx.util.views;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class DialogXBaseRelativeLayout extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static final /* synthetic */ int f387 = 0;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final android.graphics.Rect f388;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public defpackage.C0112 f389;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f390;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.C1825 f391;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final int[] f392;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public float f393;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public float f394;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f395;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f396;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f397;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f398;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.InterfaceC2245 f399;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public float f400;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public android.graphics.Rect f401;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public boolean f402;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f403;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public defpackage.C1773 f404;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f405;

    public DialogXBaseRelativeLayout(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            r1.f397 = r2
            r1.f395 = r2
            r1.f403 = r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f388 = r0
            r0 = 0
            r1.f390 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f401 = r0
            r1.f402 = r2
            r2 = 4
            int[] r2 = new int[r2]
            r1.f392 = r2
            r2 = 0
            r1.m281(r2)
            return
    }

    public DialogXBaseRelativeLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 1
            r1.f397 = r2
            r1.f395 = r2
            r1.f403 = r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f388 = r0
            r0 = 0
            r1.f390 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f401 = r0
            r1.f402 = r2
            r2 = 4
            int[] r2 = new int[r2]
            r1.f392 = r2
            r1.m281(r3)
            return
    }

    private void setBackPressedDispatcher(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L49
            ᛵᲀᛱᲈ r4 = new ᛵᲀᛱᲈ
            ᛲᲀ r0 = new ᛲᲀ
            r1 = 16
            r0.<init>(r1, r3)
            r1 = 1
            r4.<init>(r1, r0)
            ᛱᛷᛷᛲ r0 = new ᛱᛷᛷᛲ
            r1 = 2
            ᛱᛶᛲᛶ r2 = defpackage.C0110.f969
            r0.<init>(r4, r2, r1)
            ᛴᛳᛷᛸ r4 = new ᛴᛳᛷᛸ
            r1 = 8
            r4.<init>(r1)
            ᛷᛵᛵᛶ r1 = new ᛷᛵᛵᛶ
            r2 = 0
            r1.<init>(r0, r2, r4)
            ᲈᲁᛵᲁ r4 = new ᲈᲁᛵᲁ
            r4.<init>(r1)
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L31
            r4 = 0
            goto L35
        L31:
            java.lang.Object r4 = r4.next()
        L35:
            ᲀᲀᛲᲈ r4 = (defpackage.InterfaceC1734) r4
            if (r4 != 0) goto L3a
            goto L63
        L3a:
            androidx.activity.ᛷᲁᛳᛳ r0 = r4.mo3()
            ᲀᲇᲁᲇ r1 = new ᲀᲇᲁᲇ
            r1.<init>(r3, r4)
            r3.f404 = r1
            r0.m8(r4, r1)
            return
        L49:
            ᲀᲇᲁᲇ r3 = r3.f404
            if (r3 == 0) goto L63
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.f3137
            java.util.Iterator r3 = r3.iterator()
        L53:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r3.next()
            ᛱᲀᛶᛵ r4 = (defpackage.InterfaceC0165) r4
            r4.cancel()
            goto L53
        L63:
            return
    }

    @Override // android.view.View
    public final boolean callOnClick() {
            r1 = this;
            boolean r0 = r1.isEnabled()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = super.callOnClick()
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            r4.getKeyCode()
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L30
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != r1) goto L30
            int r0 = r4.getKeyCode()
            r2 = 4
            if (r0 != r2) goto L30
            boolean r0 = r3.f403
            if (r0 == 0) goto L30
            boolean r0 = r3.m280()
            if (r0 == 0) goto L22
            return r1
        L22:
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = r3.getParentDialog()
            ᲈᛵᛷᲁ r2 = r3.f399
            if (r2 == 0) goto L30
            if (r0 == 0) goto L30
            r2.mo2296()
            return r1
        L30:
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
    }

    public defpackage.C0112 getFitSystemBarUtils() {
            r0 = this;
            ᛱᛶᛴ r0 = r0.f389
            return r0
    }

    public defpackage.InterfaceC1839 getOnSafeInsetsChangeListener() {
            r0 = this;
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.interfaces.AbstractC0008 getParentDialog() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f398
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = (com.kongzue.dialogx.interfaces.AbstractC0008) r0
            return r0
    }

    public int getRootPaddingBottom() {
            r1 = this;
            int[] r1 = r1.f392
            r0 = 3
            r1 = r1[r0]
            return r1
    }

    public int getRootPaddingLeft() {
            r1 = this;
            int[] r1 = r1.f392
            r0 = 0
            r1 = r1[r0]
            return r1
    }

    public int getRootPaddingRight() {
            r1 = this;
            int[] r1 = r1.f392
            r0 = 2
            r1 = r1[r0]
            return r1
    }

    public int getRootPaddingTop() {
            r1 = this;
            int[] r1 = r1.f392
            r0 = 1
            r1 = r1[r0]
            return r1
    }

    public float getSafeHeight() {
            r2 = this;
            int r0 = r2.getMeasuredHeight()
            android.graphics.Rect r2 = r2.f401
            int r1 = r2.bottom
            int r0 = r0 - r1
            int r2 = r2.top
            int r0 = r0 - r2
            float r2 = (float) r0
            return r2
    }

    public android.graphics.Rect getUnsafePlace() {
            r0 = this;
            android.graphics.Rect r0 = r0.f401
            return r0
    }

    public int getUseAreaHeight() {
            r1 = this;
            int r0 = r1.getHeight()
            int r1 = r1.getRootPaddingBottom()
            int r0 = r0 - r1
            return r0
    }

    public int getUseAreaWidth() {
            r1 = this;
            int r0 = r1.getWidth()
            int r1 = r1.getRootPaddingRight()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r6 = this;
            super.onAttachedToWindow()
            r0 = 1
            r6.setBackPressedDispatcher(r0)
            boolean r1 = r6.isInEditMode()
            if (r1 != 0) goto Lc3
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r1 = r6.getParentDialog()
            if (r1 == 0) goto Lc3
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r1 = r6.getParentDialog()
            android.app.Activity r1 = r1.m271()
            if (r1 != 0) goto L1f
            goto Lc3
        L1f:
            ᲁᛲᲇᲁ r1 = r6.f391
            if (r1 == 0) goto La8
            int r2 = r1.f7964
            ᛳᲇᲇᛱ r3 = defpackage.EnumC0578.f2851
            switch(r2) {
                case 0: goto L88;
                case 1: goto L48;
                default: goto L2a;
            }
        L2a:
            java.lang.Object r2 = r1.f7965
            ᛱᛳᲀᛷ r2 = (defpackage.C0060) r2
            ᛳᛸᛳᛸ r4 = r2.f701
            r4.f369 = r0
            r4.m260(r3)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f702
            r4 = 0
            r3.setAlpha(r4)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.f699
            ᛳᛳᛵᛲ r3 = new ᛳᛳᛵᛲ
            r4 = 18
            r3.<init>(r4, r1)
            r2.post(r3)
            goto La8
        L48:
            java.lang.Object r2 = r1.f7965
            ᛷᛷᛸᛱ r2 = (defpackage.C1315) r2
            java.lang.Object r4 = r2.f5821
            ᛱᲁᲀᲁ r4 = (defpackage.C0185) r4
            r4.f369 = r0
            r4.m260(r3)
            r4.mo269()
            ᲈᲀᛴᛷ r3 = new ᲈᲀᛴᛷ
            r3.<init>()
            r3.m3793()
            ᛱᲁᲀᲁ r3 = r4.f1238
            ᛲᛵᛲ r5 = r4.f1235
            if (r5 != 0) goto L6d
            ᛲᛵᛲ r5 = new ᛲᛵᛲ
            r5.<init>(r0, r2)
            r4.f1235 = r5
        L6d:
            r5.m952(r3)
            ᲈᛴᛵᲈ r3 = r4.f375
            r3.getClass()
            boolean r3 = r4.f379
            if (r3 == 0) goto La8
            android.widget.EditText r2 = r2.f5817
            ᛳᛳᛵᛲ r3 = new ᛳᛳᛵᛲ
            r4 = 11
            r3.<init>(r4, r1)
            r4 = 300(0x12c, double:1.48E-321)
            r2.postDelayed(r3, r4)
            goto La8
        L88:
            java.lang.Object r1 = r1.f7965
            ᛳᛳᛴᛸ r1 = (defpackage.C0438) r1
            ᛶᛵᛳᛸ r1 = r1.f2151
            r1.f369 = r0
            r1.m260(r3)
            r1.getClass()
            ᲈᲀᛴᛷ r2 = new ᲈᲀᛴᛷ
            r2.<init>()
            ᛶᛵᛳᛸ r3 = r1.f4761
            r2.m3793()
            ᛶᛵᛳᛸ r2 = r1.f4761
            r1.mo269()
            r1.mo2037()
        La8:
            android.content.res.Resources r1 = r6.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r2 = 16
            if (r1 != r2) goto Lb9
            goto Lba
        Lb9:
            r0 = 0
        Lba:
            r6.f402 = r0
            boolean r0 = r6.f395
            if (r0 == 0) goto Lc3
            r6.requestFocus()
        Lc3:
            return
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            int r2 = r2.uiMode
            r2 = r2 & 48
            r0 = 16
            if (r2 != r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            boolean r0 = r1.f402
            if (r0 == r2) goto L24
            int r2 = defpackage.AbstractC0042.f552
            r0 = 3
            if (r2 != r0) goto L24
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r2 = r1.getParentDialog()
            if (r2 == 0) goto L24
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r1 = r1.getParentDialog()
            r1.mo265()
        L24:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r7 = this;
            ᲁᛲᲇᲁ r0 = r7.f391
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L4c
            int r3 = r0.f7964
            ᛳᲇᲇᛱ r4 = defpackage.EnumC0578.f2853
            switch(r3) {
                case 0: goto L2f;
                case 1: goto L17;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r0.f7965
            ᛱᛳᲀᛷ r0 = (defpackage.C0060) r0
            ᛳᛸᛳᛸ r0 = r0.f701
            r0.m1318()
            goto L4c
        L17:
            java.lang.Object r0 = r0.f7965
            ᛷᛷᛸᛱ r0 = (defpackage.C1315) r0
            java.lang.Object r0 = r0.f5821
            ᛱᲁᲀᲁ r0 = (defpackage.C0185) r0
            r0.f369 = r1
            ᲈᲀᛴᛷ r3 = new ᲈᲀᛴᛷ
            r3.<init>()
            r3.m3794()
            r0.m260(r4)
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            goto L4c
        L2f:
            java.lang.Object r0 = r0.f7965
            ᛳᛳᛴᛸ r0 = (defpackage.C0438) r0
            ᛶᛵᛳᛸ r3 = r0.f2151
            r3.f369 = r1
            ᲈᲀᛴᛷ r5 = new ᲈᲀᛴᛷ
            r5.<init>()
            ᛶᛵᛳᛸ r6 = r3.f4761
            r5.m3794()
            ᛶᛵᛳᛸ r5 = r3.f4761
            r3.m260(r4)
            r3.f4767 = r2
            r0.f2159 = r2
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
        L4c:
            ᛱᛶᛴ r0 = r7.f389
            if (r0 == 0) goto L6b
            android.view.View r3 = r0.m624()
            if (r3 == 0) goto L63
            ᛸᛷᛴᲀ r4 = r0.f974
            if (r4 == 0) goto L63
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            ᛸᛷᛴᲀ r4 = r0.f974
            r3.removeOnGlobalLayoutListener(r4)
        L63:
            r0.f974 = r2
            r0.f977 = r2
            r0.f979 = r2
            r0.f976 = r2
        L6b:
            r7.setBackPressedDispatcher(r1)
            r7.f389 = r2
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L47
            if (r0 == r1) goto La
            goto L55
        La:
            boolean r0 = r3.f396
            if (r0 == 0) goto L55
            android.view.View r0 = r3.findFocus()
            if (r0 == r3) goto L55
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = r3.getParentDialog()
            if (r0 == 0) goto L55
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = r3.getParentDialog()
            r1 = 1084227584(0x40a00000, float:5.0)
            int r0 = r0.m258(r1)
            float r0 = (float) r0
            float r1 = r4.getX()
            float r2 = r3.f400
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 > 0) goto L55
            float r1 = r4.getY()
            float r2 = r3.f393
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L55
            r3.callOnClick()
            goto L55
        L47:
            r3.f396 = r1
            float r0 = r4.getX()
            r3.f400 = r0
            float r0 = r4.getY()
            r3.f393 = r0
        L55:
            r3.getParentDialog()
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.os.IBinder r1 = r3.getWindowToken()
            r2 = 2
            r0.hideSoftInputFromWindow(r1, r2)
            boolean r3 = super.onTouchEvent(r4)
            return r3
    }

    @Override // android.view.View
    public final boolean performClick() {
            r1 = this;
            boolean r0 = r1.isEnabled()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = super.performClick()
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r2, android.graphics.Rect r3) {
            r1 = this;
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = r1.getParentDialog()
            if (r0 == 0) goto L9
            r1.getParentDialog()
        L9:
            android.view.View r0 = r1.findFocus()
            if (r0 == 0) goto L16
            if (r0 == r1) goto L16
            r0.requestFocus()
            r1 = 1
            return r1
        L16:
            boolean r1 = super.requestFocus(r2, r3)
            return r1
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            float r0 = r2.f394
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.setAlpha(r0)
            super.setBackground(r3)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setBackground(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            r0 = 8
            if (r3 != r0) goto L13
            float r0 = r2.getAlpha()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            r0 = 1008981770(0x3c23d70a, float:0.01)
            r2.setAlpha(r0)
        L13:
            super.setVisibility(r3)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m277(com.kongzue.dialogx.interfaces.AbstractC0008 r4) {
            r3 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.f398 = r0
            if (r4 == 0) goto L11
            int r4 = r4.f373
            r0 = 1
            if (r4 == r0) goto L11
            r3.setFitsSystemWindows(r0)
        L11:
            android.graphics.Rect r4 = r3.f401
            if (r4 == 0) goto L29
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r4 = r3.getParentDialog()
            java.util.Objects.toString(r4)
            android.graphics.Rect r4 = r3.f401
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.m282(r0, r1, r2, r4)
        L29:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m278(float r2) {
            r1 = this;
            r1.f394 = r2
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.setAlpha(r2)
        L17:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean m279() {
            r5 = this;
            android.view.View r0 = r5.getRootView()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.graphics.Rect r2 = r5.f388
            r0.getWindowVisibleDisplayFrame(r2)
            int r0 = r0.getHeight()
            int r2 = r2.height()
            int r2 = r0 - r2
            float r3 = (float) r0
            r4 = 1041865114(0x3e19999a, float:0.15)
            float r3 = r3 * r4
            int r3 = (int) r3
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r4 = 1117782016(0x42a00000, float:80.0)
            float r5 = r5 * r4
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r3, r5)
            if (r0 <= 0) goto L35
            if (r2 <= r5) goto L35
            r5 = 1
            return r5
        L35:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m280() {
            r6 = this;
            r6.getParentDialog()
            android.view.WindowInsets r0 = r6.getRootWindowInsets()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L34
            android.view.WindowInsets r0 = r6.getRootWindowInsets()
            r3 = 0
            ᲈᛸᛱᲀ r0 = defpackage.C2300.m3730(r3, r0)
            ᛲᲇᲀᲈ r0 = r0.f9727
            r3 = 8
            ᛶᛳᛴᛲ r4 = r0.mo357(r3)
            boolean r0 = r0.mo360(r3)
            if (r0 == 0) goto L28
            int r0 = r4.f4595
            if (r0 <= 0) goto L28
            r0 = r1
            goto L29
        L28:
            r0 = r2
        L29:
            r6.f405 = r0
            if (r0 != 0) goto L40
            boolean r0 = r6.m279()
            if (r0 == 0) goto L3f
            goto L40
        L34:
            boolean r0 = r6.f405
            if (r0 != 0) goto L40
            boolean r0 = r6.m279()
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            return r2
        L40:
            android.view.View r0 = r6.findFocus()
            if (r0 == 0) goto L48
            if (r0 != r6) goto L52
        L48:
            android.view.View r3 = r6.getRootView()
            if (r3 == 0) goto L52
            android.view.View r0 = r3.findFocus()
        L52:
            if (r0 != 0) goto L56
            r3 = r6
            goto L57
        L56:
            r3 = r0
        L57:
            android.content.Context r4 = r6.getContext()
            java.lang.String r5 = "input_method"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            if (r4 == 0) goto L6d
            android.os.IBinder r3 = r3.getWindowToken()
            r5 = 2
            r4.hideSoftInputFromWindow(r3, r5)
        L6d:
            if (r0 == 0) goto L74
            if (r0 == r6) goto L74
            r0.clearFocus()
        L74:
            boolean r0 = r6.f395
            if (r0 == 0) goto L7b
            r6.requestFocus()
        L7b:
            r6.f405 = r2
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m281(android.util.AttributeSet r8) {
            r7 = this;
            r0 = 0
            r7.setForceDarkAllowed(r0)
            boolean r1 = r7.f390
            if (r1 != 0) goto Lc7
            r1 = 1
            if (r8 == 0) goto L2d
            android.content.Context r2 = r7.getContext()
            int[] r3 = defpackage.AbstractC0875.f3951
            android.content.res.TypedArray r8 = r2.obtainStyledAttributes(r8, r3)
            boolean r2 = r8.getBoolean(r1, r1)
            r7.f395 = r2
            boolean r2 = r8.getBoolean(r0, r1)
            r7.f397 = r2
            r2 = 2
            boolean r2 = r8.getBoolean(r2, r1)
            r7.f403 = r2
            r8.recycle()
            r7.f390 = r1
        L2d:
            boolean r8 = r7.f395
            if (r8 == 0) goto L37
            r7.setFocusable(r1)
            r7.setFocusableInTouchMode(r1)
        L37:
            r8 = 0
            r7.m278(r8)
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r8 = r7.getParentDialog()
            if (r8 == 0) goto L4c
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r8 = r7.getParentDialog()
            int r8 = r8.f373
            if (r8 == r1) goto L4c
            r7.setFitsSystemWindows(r1)
        L4c:
            r7.setClipChildren(r0)
            r7.setClipToPadding(r0)
            r7.setDefaultFocusHighlightEnabled(r0)
            ᛸᲈᛸᲈ r8 = new ᛸᲈᛸᲈ
            r2 = 15
            r8.<init>(r2, r7)
            ᛱᛶᛴ r2 = new ᛱᛶᛴ
            r2.<init>()
            r2.f978 = r0
            r2.f979 = r7
            r2.f977 = r8
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r8 = r7.getParentDialog()
            r2.f976 = r8
            ᛷᛸᛳᛶ r8 = new ᛷᛸᛳᛶ
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f979
            java.util.WeakHashMap r4 = defpackage.AbstractC0858.f3911
            int r3 = r3.getPaddingStart()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4 = r2.f979
            int r4 = r4.getPaddingTop()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r5 = r2.f979
            int r5 = r5.getPaddingEnd()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r2.f979
            int r6 = r6.getPaddingBottom()
            r8.<init>()
            r8.f5896 = r3
            r8.f5897 = r4
            r8.f5895 = r5
            r8.f5894 = r6
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f979
            ᛷᛶᛴᛲ r4 = new ᛷᛶᛴᛲ
            r4.<init>(r2, r8)
            defpackage.AbstractC2204.m3604(r3, r4)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f979
            ᛴᛵᲇᲇ r4 = new ᛴᛵᲇᲇ
            r5 = 22
            r4.<init>(r2, r8, r5, r0)
            ᲈᛲᛷᲁ r0 = new ᲈᛲᛷᲁ
            r0.<init>(r4)
            r3.setWindowInsetsAnimationCallback(r0)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.f979
            boolean r0 = r0.isAttachedToWindow()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f979
            if (r0 == 0) goto Lbd
            r3.requestApplyInsets()
            goto Lc5
        Lbd:
            ᲈᲈᛴᛶ r0 = new ᲈᲈᛴᛶ
            r0.<init>(r2, r1, r8)
            r3.addOnAttachStateChangeListener(r0)
        Lc5:
            r7.f389 = r2
        Lc7:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m282(int r11, int r12, int r13, int r14) {
            r10 = this;
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = r10.getParentDialog()
            java.util.Objects.toString(r0)
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            r10.getParentDialog()
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = r10.getParentDialog()
            boolean r0 = r0 instanceof defpackage.C1069
            java.lang.String r1 = "DialogXSafetyArea"
            if (r0 != 0) goto L1e
            android.view.View r0 = r10.findViewWithTag(r1)
            boolean r0 = r0 instanceof com.kongzue.dialogx.util.views.MaxRelativeLayout
            if (r0 == 0) goto L88
        L1e:
            android.view.View r0 = r10.findViewWithTag(r1)
            boolean r1 = r0 instanceof com.kongzue.dialogx.util.views.MaxRelativeLayout
            r2 = 0
            if (r1 == 0) goto L70
            r1 = r0
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r1
            int r1 = r1.getDialogXSafetyMode()
            r3 = r1 & 1
            r4 = 1
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r2
        L36:
            r5 = r1 & 2
            if (r5 == 0) goto L3c
            r5 = r4
            goto L3d
        L3c:
            r5 = r2
        L3d:
            r6 = r1 & 4
            if (r6 == 0) goto L43
            r6 = r4
            goto L44
        L43:
            r6 = r2
        L44:
            r1 = r1 & 8
            if (r1 == 0) goto L49
            goto L4a
        L49:
            r4 = r2
        L4a:
            r0.toString()
            if (r5 == 0) goto L51
            r1 = r11
            goto L52
        L51:
            r1 = r2
        L52:
            if (r3 == 0) goto L56
            r7 = r12
            goto L57
        L56:
            r7 = r2
        L57:
            if (r4 == 0) goto L5b
            r8 = r13
            goto L5c
        L5b:
            r8 = r2
        L5c:
            if (r6 == 0) goto L60
            r9 = r14
            goto L61
        L60:
            r9 = r2
        L61:
            r0.setPadding(r1, r7, r8, r9)
            if (r3 == 0) goto L67
            r12 = r2
        L67:
            if (r5 == 0) goto L6a
            r11 = r2
        L6a:
            if (r4 == 0) goto L6d
            r13 = r2
        L6d:
            if (r6 == 0) goto L88
            goto L87
        L70:
            r0 = 1711865964(0x6609006c, float:1.61743E23)
            android.view.View r0 = r10.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r1 = r10.getParentDialog()
            ᛶᛵᛳᛸ r1 = (defpackage.C1069) r1
            r1.getClass()
            if (r0 == 0) goto L87
            r0.setPadding(r2, r2, r2, r14)
        L87:
            r14 = r2
        L88:
            boolean r0 = r10.f397
            if (r0 == 0) goto L8f
            r10.setPadding(r11, r12, r13, r14)
        L8f:
            return
    }
}
