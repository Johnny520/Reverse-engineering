package com.kongzue.dialogx.util.views;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class DialogXBaseRelativeLayout extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static final /* synthetic */ int f97 = 0;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public boolean f98;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean f99;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public android.graphics.Rect f100;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public boolean f101;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public boolean f102;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f103;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public float f104;

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final int[] f105;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public xhss.C0644 f106;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public xhss.InterfaceC0010 f107;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public float f108;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public float f109;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public boolean f110;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0915 f111;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f112;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final android.graphics.Rect f113;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public xhss.C1041 f114;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public boolean f115;

    public DialogXBaseRelativeLayout(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            r1.f98 = r2
            r1.f99 = r2
            r1.f112 = r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f113 = r0
            r0 = 0
            r1.f110 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f100 = r0
            r1.f101 = r2
            r2 = 4
            int[] r2 = new int[r2]
            r1.f105 = r2
            r2 = 0
            r1.m71(r2)
            return
    }

    public DialogXBaseRelativeLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 1
            r1.f98 = r2
            r1.f99 = r2
            r1.f112 = r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f113 = r0
            r0 = 0
            r1.f110 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f100 = r0
            r1.f101 = r2
            r2 = 4
            int[] r2 = new int[r2]
            r1.f105 = r2
            r1.m71(r3)
            return
    }

    private void setBackPressedDispatcher(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L35
            xhss.ᲈᛱᛱᲀ r3 = new xhss.ᲈᛱᛱᲀ
            xhss.ᛲᛶᲀᛲ r0 = new xhss.ᛲᛶᲀᛲ
            r1 = 3
            r0.<init>(r1, r2)
            r2 = 1
            r3.<init>(r2, r0)
            xhss.ᲀᲈᲇᛱ r0 = xhss.C0919.f2960
            xhss.ᲀᛲᲇᛲ r1 = new xhss.ᲀᛲᲇᛲ
            r1.<init>(r3, r0, r2)
            xhss.ᲀᛲᛲᲇ r2 = new xhss.ᲀᛲᛲᲇ
            r3 = 6
            r2.<init>(r3)
            xhss.ᛶᲇᲇᛲ r3 = new xhss.ᛶᲇᲇᛲ
            r0 = 0
            r3.<init>(r1, r0, r2)
            xhss.ᲀᲀᛳᛱ r2 = new xhss.ᲀᲀᛳᛱ
            r2.<init>(r3)
            boolean r3 = r2.hasNext()
            r0 = 0
            if (r3 != 0) goto L2e
            goto L32
        L2e:
            java.lang.Object r0 = r2.next()
        L32:
            xhss.ᛲᛸᛱᛸ r0 = (xhss.AbstractActivityC0194) r0
            goto L4f
        L35:
            xhss.ᲇᛵᛸᛲ r2 = r2.f114
            if (r2 == 0) goto L4f
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f3362
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            xhss.ᛷᛶᲈᲀ r3 = (xhss.InterfaceC0672) r3
            r3.cancel()
            goto L3f
        L4f:
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
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
            r6 = this;
            r7.getKeyCode()
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto La7
            int r0 = r7.getAction()
            r1 = 1
            if (r0 != r1) goto La7
            int r0 = r7.getKeyCode()
            r2 = 4
            if (r0 != r2) goto La7
            boolean r0 = r6.f112
            if (r0 == 0) goto La7
            r6.getParentDialog()
            android.view.WindowInsets r0 = r6.getRootWindowInsets()
            r2 = 0
            if (r0 == 0) goto L4e
            android.view.WindowInsets r0 = r6.getRootWindowInsets()
            r3 = 0
            xhss.ᲀᛳᛲᛶ r0 = xhss.C0847.m1430(r3, r0)
            xhss.ᛵᛸᛱ r0 = r0.f2754
            r3 = 8
            xhss.ᲀᲈᲈᛸ r4 = r0.mo330(r3)
            boolean r0 = r0.mo406(r3)
            if (r0 == 0) goto L42
            int r0 = r4.f2971
            if (r0 <= 0) goto L42
            r0 = r1
            goto L43
        L42:
            r0 = r2
        L43:
            r6.f102 = r0
            if (r0 != 0) goto L58
            boolean r0 = r6.m68()
            if (r0 == 0) goto L96
            goto L58
        L4e:
            boolean r0 = r6.f102
            if (r0 != 0) goto L58
            boolean r0 = r6.m68()
            if (r0 == 0) goto L96
        L58:
            android.view.View r0 = r6.findFocus()
            if (r0 == 0) goto L60
            if (r0 != r6) goto L6a
        L60:
            android.view.View r3 = r6.getRootView()
            if (r3 == 0) goto L6a
            android.view.View r0 = r3.findFocus()
        L6a:
            if (r0 != 0) goto L6e
            r3 = r6
            goto L6f
        L6e:
            r3 = r0
        L6f:
            android.content.Context r4 = r6.getContext()
            java.lang.String r5 = "input_method"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            if (r4 == 0) goto L85
            android.os.IBinder r3 = r3.getWindowToken()
            r5 = 2
            r4.hideSoftInputFromWindow(r3, r5)
        L85:
            if (r0 == 0) goto L8c
            if (r0 == r6) goto L8c
            r0.clearFocus()
        L8c:
            boolean r0 = r6.f99
            if (r0 == 0) goto L93
            r6.requestFocus()
        L93:
            r6.f102 = r2
            r2 = r1
        L96:
            if (r2 == 0) goto L99
            return r1
        L99:
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = r6.getParentDialog()
            xhss.ᛱᛱᲇᲁ r2 = r6.f107
            if (r2 == 0) goto La7
            if (r0 == 0) goto La7
            r2.mo107()
            return r1
        La7:
            boolean r6 = super.dispatchKeyEvent(r7)
            return r6
    }

    public xhss.C0644 getFitSystemBarUtils() {
            r0 = this;
            xhss.ᛷᛴᛱᲀ r0 = r0.f106
            return r0
    }

    public xhss.InterfaceC0916 getOnSafeInsetsChangeListener() {
            r0 = this;
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.interfaces.AbstractC0001 getParentDialog() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f103
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = (com.kongzue.dialogx.interfaces.AbstractC0001) r0
            return r0
    }

    public int getRootPaddingBottom() {
            r1 = this;
            int[] r1 = r1.f105
            r0 = 3
            r1 = r1[r0]
            return r1
    }

    public int getRootPaddingLeft() {
            r1 = this;
            int[] r1 = r1.f105
            r0 = 0
            r1 = r1[r0]
            return r1
    }

    public int getRootPaddingRight() {
            r1 = this;
            int[] r1 = r1.f105
            r0 = 2
            r1 = r1[r0]
            return r1
    }

    public int getRootPaddingTop() {
            r1 = this;
            int[] r1 = r1.f105
            r0 = 1
            r1 = r1[r0]
            return r1
    }

    public float getSafeHeight() {
            r2 = this;
            int r0 = r2.getMeasuredHeight()
            android.graphics.Rect r2 = r2.f100
            int r1 = r2.bottom
            int r0 = r0 - r1
            int r2 = r2.top
            int r0 = r0 - r2
            float r2 = (float) r0
            return r2
    }

    public android.graphics.Rect getUnsafePlace() {
            r0 = this;
            android.graphics.Rect r0 = r0.f100
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
            r5 = this;
            super.onAttachedToWindow()
            r0 = 1
            r5.setBackPressedDispatcher(r0)
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto La4
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r1 = r5.getParentDialog()
            if (r1 == 0) goto La4
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r1 = r5.getParentDialog()
            android.app.Activity r1 = r1.m54()
            if (r1 != 0) goto L1f
            goto La4
        L1f:
            xhss.ᲀᲈᛵᛸ r1 = r5.f111
            if (r1 == 0) goto L89
            int r2 = r1.f2957
            xhss.ᛱᛷᛸᲁ r3 = xhss.EnumC0064.f355
            switch(r2) {
                case 0: goto L73;
                case 1: goto L47;
                default: goto L2a;
            }
        L2a:
            java.lang.Object r2 = r1.f2956
            xhss.ᲀᲀ r2 = (xhss.C0891) r2
            xhss.ᛳᛴᛵ r4 = r2.f2877
            r4.f90 = r0
            r4.m55(r3)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f2871
            r4 = 0
            r3.setAlpha(r4)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.f2872
            xhss.ᛴᲈᲀᲇ r3 = new xhss.ᛴᲈᲀᲇ
            r4 = 7
            r3.<init>(r4, r1)
            r2.post(r3)
            goto L89
        L47:
            java.lang.Object r1 = r1.f2956
            xhss.ᲁᛳᛵᛷ r1 = (xhss.C0935) r1
            xhss.ᛱᛴᛳᛴ r2 = r1.f3025
            r2.f90 = r0
            r2.m55(r3)
            r2.mo51()
            xhss.ᲁᛲᛸᛴ r3 = new xhss.ᲁᛲᛸᛴ
            r3.<init>()
            r3.m1529()
            xhss.ᛱᛴᛳᛴ r3 = r2.f225
            xhss.ᛶᲈᛴᛲ r4 = r2.f227
            if (r4 != 0) goto L6a
            xhss.ᛶᲈᛴᛲ r4 = new xhss.ᛶᲈᛴᛲ
            r4.<init>(r0, r1)
            r2.f227 = r4
        L6a:
            r4.m1078(r3)
            xhss.ᛶᛵᲇᛸ r1 = r2.f95
            r1.getClass()
            goto L89
        L73:
            java.lang.Object r1 = r1.f2956
            xhss.ᛲᛵᛶᲁ r1 = (xhss.C0158) r1
            xhss.ᛵᲇᲀᛳ r1 = r1.f654
            r1.f90 = r0
            r1.m55(r3)
            xhss.ᲁᛲᛸᛴ r2 = new xhss.ᲁᛲᛸᛴ
            r2.<init>()
            r2.m1529()
            r1.m933()
        L89:
            android.content.res.Resources r1 = r5.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r2 = 16
            if (r1 != r2) goto L9a
            goto L9b
        L9a:
            r0 = 0
        L9b:
            r5.f101 = r0
            boolean r0 = r5.f99
            if (r0 == 0) goto La4
            r5.requestFocus()
        La4:
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
            boolean r0 = r1.f101
            if (r0 == r2) goto L24
            int r2 = xhss.AbstractC1069.f3452
            r0 = 3
            if (r2 != r0) goto L24
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r2 = r1.getParentDialog()
            if (r2 == 0) goto L24
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r1 = r1.getParentDialog()
            r1.mo52()
        L24:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r6 = this;
            xhss.ᲀᲈᛵᛸ r0 = r6.f111
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L46
            int r3 = r0.f2957
            xhss.ᛱᛷᛸᲁ r4 = xhss.EnumC0064.f351
            switch(r3) {
                case 0: goto L2d;
                case 1: goto L17;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r0.f2956
            xhss.ᲀᲀ r0 = (xhss.C0891) r0
            xhss.ᛳᛴᛵ r0 = r0.f2877
            r0.m573()
            goto L46
        L17:
            java.lang.Object r0 = r0.f2956
            xhss.ᲁᛳᛵᛷ r0 = (xhss.C0935) r0
            xhss.ᛱᛴᛳᛴ r0 = r0.f3025
            r0.f90 = r1
            xhss.ᲁᛲᛸᛴ r3 = new xhss.ᲁᛲᛸᛴ
            r3.<init>()
            r3.m1528()
            r0.m55(r4)
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            goto L46
        L2d:
            java.lang.Object r0 = r0.f2956
            xhss.ᛲᛵᛶᲁ r0 = (xhss.C0158) r0
            xhss.ᛵᲇᲀᛳ r3 = r0.f654
            r3.f90 = r1
            xhss.ᲁᛲᛸᛴ r5 = new xhss.ᲁᛲᛸᛴ
            r5.<init>()
            r5.m1528()
            r3.m55(r4)
            r3.f1897 = r2
            r0.f645 = r2
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
        L46:
            xhss.ᛷᛴᛱᲀ r0 = r6.f106
            if (r0 == 0) goto L65
            android.view.View r3 = r0.m1127()
            if (r3 == 0) goto L5d
            xhss.ᛸᲀᲈᛳ r4 = r0.f2206
            if (r4 == 0) goto L5d
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            xhss.ᛸᲀᲈᛳ r4 = r0.f2206
            r3.removeOnGlobalLayoutListener(r4)
        L5d:
            r0.f2206 = r2
            r0.f2203 = r2
            r0.f2202 = r2
            r0.f2209 = r2
        L65:
            r6.setBackPressedDispatcher(r1)
            r6.f106 = r2
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
            boolean r0 = r3.f115
            if (r0 == 0) goto L55
            android.view.View r0 = r3.findFocus()
            if (r0 == r3) goto L55
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = r3.getParentDialog()
            if (r0 == 0) goto L55
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = r3.getParentDialog()
            r1 = 1084227584(0x40a00000, float:5.0)
            int r0 = r0.m64(r1)
            float r0 = (float) r0
            float r1 = r4.getX()
            float r2 = r3.f104
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 > 0) goto L55
            float r1 = r4.getY()
            float r2 = r3.f109
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L55
            r3.callOnClick()
            goto L55
        L47:
            r3.f115 = r1
            float r0 = r4.getX()
            r3.f104 = r0
            float r0 = r4.getY()
            r3.f109 = r0
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
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = r1.getParentDialog()
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
            float r0 = r2.f108
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

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean m68() {
            r5 = this;
            android.view.View r0 = r5.getRootView()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.graphics.Rect r2 = r5.f113
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

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m69(float r2) {
            r1 = this;
            r1.f108 = r2
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

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m70(int r11, int r12, int r13, int r14) {
            r10 = this;
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = r10.getParentDialog()
            java.util.Objects.toString(r0)
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            r10.getParentDialog()
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = r10.getParentDialog()
            boolean r0 = r0 instanceof xhss.C0523
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
            r0 = 1678245957(0x64080045, float:1.0035106E22)
            android.view.View r0 = r10.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r1 = r10.getParentDialog()
            xhss.ᛵᲇᲀᛳ r1 = (xhss.C0523) r1
            r1.getClass()
            if (r0 == 0) goto L87
            r0.setPadding(r2, r2, r2, r14)
        L87:
            r14 = r2
        L88:
            boolean r0 = r10.f98
            if (r0 == 0) goto L8f
            r10.setPadding(r11, r12, r13, r14)
        L8f:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m71(android.util.AttributeSet r8) {
            r7 = this;
            r0 = 0
            r7.setForceDarkAllowed(r0)
            boolean r1 = r7.f110
            if (r1 != 0) goto Lc6
            r1 = 1
            if (r8 == 0) goto L2d
            android.content.Context r2 = r7.getContext()
            int[] r3 = xhss.AbstractC1143.f3689
            android.content.res.TypedArray r8 = r2.obtainStyledAttributes(r8, r3)
            boolean r2 = r8.getBoolean(r1, r1)
            r7.f99 = r2
            boolean r2 = r8.getBoolean(r0, r1)
            r7.f98 = r2
            r2 = 2
            boolean r2 = r8.getBoolean(r2, r1)
            r7.f112 = r2
            r8.recycle()
            r7.f110 = r1
        L2d:
            boolean r8 = r7.f99
            if (r8 == 0) goto L37
            r7.setFocusable(r1)
            r7.setFocusableInTouchMode(r1)
        L37:
            r8 = 0
            r7.m69(r8)
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r8 = r7.getParentDialog()
            if (r8 == 0) goto L4c
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r8 = r7.getParentDialog()
            int r8 = r8.f82
            if (r8 == r1) goto L4c
            r7.setFitsSystemWindows(r1)
        L4c:
            r7.setClipChildren(r0)
            r7.setClipToPadding(r0)
            r7.setDefaultFocusHighlightEnabled(r0)
            xhss.ᲇᛵᛲᲁ r8 = new xhss.ᲇᛵᛲᲁ
            r2 = 5
            r8.<init>(r2, r7)
            xhss.ᛷᛴᛱᲀ r2 = new xhss.ᛷᛴᛱᲀ
            r2.<init>()
            r2.f2205 = r0
            r2.f2202 = r7
            r2.f2203 = r8
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r8 = r7.getParentDialog()
            r2.f2209 = r8
            xhss.ᲇᲇᛱ r8 = new xhss.ᲇᲇᛱ
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f2202
            int r4 = xhss.AbstractC0624.f2154
            int r3 = r3.getPaddingStart()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4 = r2.f2202
            int r4 = r4.getPaddingTop()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r5 = r2.f2202
            int r5 = r5.getPaddingEnd()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = r2.f2202
            int r6 = r6.getPaddingBottom()
            r8.<init>()
            r8.f3530 = r3
            r8.f3528 = r4
            r8.f3529 = r5
            r8.f3531 = r6
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f2202
            xhss.ᛳᛲᲈᛵ r4 = new xhss.ᛳᛲᲈᛵ
            r4.<init>(r2, r8)
            xhss.AbstractC0462.m836(r3, r4)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f2202
            xhss.ᛳᛱᛲᲀ r4 = new xhss.ᛳᛱᛲᲀ
            r5 = 9
            r4.<init>(r2, r8, r5, r0)
            xhss.ᛴᛶᲈᛲ r0 = new xhss.ᛴᛶᲈᛲ
            r0.<init>(r4)
            r3.setWindowInsetsAnimationCallback(r0)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.f2202
            boolean r0 = r0.isAttachedToWindow()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f2202
            if (r0 == 0) goto Lbc
            r3.requestApplyInsets()
            goto Lc4
        Lbc:
            xhss.ᲇᛵᛴᛲ r0 = new xhss.ᲇᛵᛴᛲ
            r0.<init>(r1, r2, r8)
            r3.addOnAttachStateChangeListener(r0)
        Lc4:
            r7.f106 = r2
        Lc6:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m72(com.kongzue.dialogx.interfaces.AbstractC0001 r4) {
            r3 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.f103 = r0
            if (r4 == 0) goto L11
            int r4 = r4.f82
            r0 = 1
            if (r4 == r0) goto L11
            r3.setFitsSystemWindows(r0)
        L11:
            android.graphics.Rect r4 = r3.f100
            if (r4 == 0) goto L29
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r4 = r3.getParentDialog()
            java.util.Objects.toString(r4)
            android.graphics.Rect r4 = r3.f100
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.m70(r0, r1, r2, r4)
        L29:
            return
    }
}
