package defpackage;

/* JADX INFO: renamed from: ᛱᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0112 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f973;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.ViewTreeObserverOnGlobalLayoutListenerC1527 f974;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.ViewOnLayoutChangeListenerC0603 f975;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public com.kongzue.dialogx.interfaces.AbstractC0008 f976;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C1606 f977;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f978;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout f979;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C1331 f980;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f981;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int m622() {
            r3 = this;
            boolean r0 = r3.m627()
            if (r0 != 0) goto L4b
            android.view.View r0 = r3.m624()
            if (r0 != 0) goto Ld
            goto L4b
        Ld:
            android.view.View r0 = r3.m624()
            android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
            if (r0 == 0) goto L20
            int r0 = r0.getSystemBarsBehavior()
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.f979
            if (r0 == 0) goto L36
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto L2b
            goto L36
        L2b:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r3.f979
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            goto L3a
        L36:
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
        L3a:
            java.lang.String r0 = "dimen"
            java.lang.String r1 = "android"
            java.lang.String r2 = "status_bar_height"
            int r0 = r3.getIdentifier(r2, r0, r1)
            if (r0 <= 0) goto L4b
            int r3 = r3.getDimensionPixelSize(r0)
            return r3
        L4b:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int m623() {
            r4 = this;
            boolean r0 = r4.m627()
            r1 = 0
            if (r0 != 0) goto L4e
            android.view.View r0 = r4.m624()
            if (r0 != 0) goto Le
            goto L4e
        Le:
            android.view.View r0 = r4.m624()
            android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
            if (r0 == 0) goto L23
            int r0 = r0.getSystemBarsBehavior()
            r0 = r0 & 16
            if (r0 != 0) goto L23
            int r4 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f387
            return r1
        L23:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r4.f979
            if (r0 == 0) goto L39
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto L2e
            goto L39
        L2e:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4 = r4.f979
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            goto L3d
        L39:
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
        L3d:
            java.lang.String r0 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "navigation_bar_height"
            int r0 = r4.getIdentifier(r3, r0, r2)
            if (r0 <= 0) goto L4e
            int r4 = r4.getDimensionPixelSize(r0)
            return r4
        L4e:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.view.View m624() {
            r0 = this;
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = r0.f976
            if (r0 != 0) goto L9
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            goto Ld
        L9:
            android.app.Activity r0 = r0.m271()
        Ld:
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m625(defpackage.C1331 r8) {
            r7 = this;
            ᛸᲈᛸᲈ r0 = r7.f977
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r8.f5896
            r2 = 1
            int r0 = r0.m2903(r2)
            int r0 = r0 + r1
            r8.f5896 = r0
            int r0 = r8.f5897
            ᛸᲈᛸᲈ r1 = r7.f977
            r2 = 2
            int r1 = r1.m2903(r2)
            int r1 = r1 + r0
            r8.f5897 = r1
            int r0 = r8.f5895
            ᛸᲈᛸᲈ r1 = r7.f977
            r3 = 3
            int r1 = r1.m2903(r3)
            int r1 = r1 + r0
            r8.f5895 = r1
            int r0 = r8.f5894
            ᛸᲈᛸᲈ r1 = r7.f977
            r3 = 4
            int r1 = r1.m2903(r3)
            int r1 = r1 + r0
            r8.f5894 = r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.f979
            if (r0 == 0) goto L38
            goto L43
        L38:
            int r3 = r8.f5896
            int r4 = r8.f5897
            int r5 = r8.f5895
            java.util.WeakHashMap r6 = defpackage.AbstractC0858.f3911
            r0.setPaddingRelative(r3, r4, r5, r1)
        L43:
            int r0 = r8.f5896
            int r1 = r8.f5897
            int r3 = r8.f5895
            int r8 = r8.f5894
            boolean r4 = r7.f973
            int r5 = r7.f981
            int r6 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f387
            ᛸᲈᛸᲈ r7 = r7.f977
            if (r4 == 0) goto L56
            goto L57
        L56:
            r5 = 0
        L57:
            int r8 = r8 + r5
            java.lang.Object r7 = r7.f7101
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r7 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r7
            android.graphics.Rect r4 = r7.f401
            if (r4 != 0) goto L67
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r7.f401 = r4
        L67:
            android.view.WindowInsets r4 = r7.getRootWindowInsets()
            r5 = 0
            if (r4 == 0) goto L9e
            android.view.WindowInsets r4 = r7.getRootWindowInsets()
            ᲈᛸᛱᲀ r4 = defpackage.C2300.m3730(r5, r4)
            ᛲᲇᲀᲈ r4 = r4.f9727
            boolean r2 = r4.mo360(r2)
            r6 = 8
            boolean r6 = r4.mo360(r6)
            if (r6 != 0) goto L9e
            if (r2 == 0) goto L9e
            r2 = 519(0x207, float:7.27E-43)
            ᛶᛳᛴᛲ r2 = r4.mo357(r2)
            int r4 = r2.f4595
            if (r4 != r8) goto L9d
            int r4 = r2.f4598
            if (r4 != r1) goto L9d
            int r4 = r2.f4597
            if (r4 != r0) goto L9d
            int r4 = r2.f4596
            if (r4 != r3) goto L9d
            goto L9e
        L9d:
            r5 = r2
        L9e:
            android.graphics.Rect r2 = r7.f401
            if (r5 == 0) goto Lc9
            int r4 = r5.f4597
            int r0 = java.lang.Math.max(r4, r0)
            r2.left = r0
            android.graphics.Rect r0 = r7.f401
            int r2 = r5.f4598
            int r1 = java.lang.Math.max(r2, r1)
            r0.top = r1
            android.graphics.Rect r0 = r7.f401
            int r1 = r5.f4596
            int r1 = java.lang.Math.max(r1, r3)
            r0.right = r1
            android.graphics.Rect r0 = r7.f401
            int r1 = r5.f4595
            int r8 = java.lang.Math.max(r1, r8)
            r0.bottom = r8
            goto Ld1
        Lc9:
            r2.left = r0
            r2.top = r1
            r2.right = r3
            r2.bottom = r8
        Ld1:
            android.graphics.Rect r8 = r7.f401
            int r0 = r8.left
            int r1 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            r7.m282(r0, r1, r2, r8)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m626(defpackage.C2300 r14, defpackage.C1331 r15) {
            r13 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r13.f979
            if (r0 == 0) goto L143
            ᛲᲇᲀᲈ r14 = r14.f9727
            r1 = 8
            ᛶᛳᛴᛲ r2 = r14.mo357(r1)
            boolean r3 = r14.mo360(r1)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1a
            int r2 = r2.f4595
            if (r2 <= 0) goto L1a
            r2 = r4
            goto L1b
        L1a:
            r2 = r5
        L1b:
            r0.f405 = r2
            r13.f980 = r15
            ᛳᲇᛲᲈ r0 = r14.mo629()
            if (r0 == 0) goto L38
            android.view.DisplayCutout r0 = r0.f2836
            int r2 = r0.getSafeInsetTop()
            int r3 = r0.getSafeInsetLeft()
            int r6 = r0.getSafeInsetRight()
            int r0 = r0.getSafeInsetRight()
            goto L3c
        L38:
            r0 = r5
            r2 = r0
            r3 = r2
            r6 = r3
        L3c:
            r7 = 527(0x20f, float:7.38E-43)
            ᛶᛳᛴᛲ r7 = r14.mo357(r7)
            int r8 = r7.f4597
            int r9 = r7.f4598
            int r10 = r7.f4595
            int r11 = r7.f4596
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r12 = r13.f979
            android.view.View r12 = r12.getRootView()
            r12.getWindowSystemUiVisibility()
            boolean r1 = r14.mo360(r1)
            r12 = 2
            if (r1 != 0) goto L63
            boolean r1 = r14.mo360(r12)
            if (r1 == 0) goto L61
            goto L63
        L61:
            r1 = r5
            goto L64
        L63:
            r1 = r10
        L64:
            boolean r14 = r14.mo360(r4)
            if (r14 == 0) goto L6c
            r14 = r9
            goto L6d
        L6c:
            r14 = r5
        L6d:
            if (r9 != 0) goto Le6
            if (r10 != 0) goto Le6
            int r7 = r7.f4597
            if (r7 != 0) goto Le6
            if (r11 != 0) goto Le6
            int r14 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f387
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r14 = r13.f976
            if (r14 != 0) goto L82
            android.app.Activity r14 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            goto L86
        L82:
            android.app.Activity r14 = r14.m271()
        L86:
            if (r14 != 0) goto L89
            goto Lb4
        L89:
            android.content.res.Resources r0 = r14.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r0 != r12) goto Lb4
            android.view.WindowManager r14 = r14.getWindowManager()
            android.view.Display r14 = r14.getDefaultDisplay()
            int r14 = r14.getRotation()
            if (r14 == r4) goto Lb4
            r0 = 3
            if (r14 == r0) goto La7
            goto Lb4
        La7:
            int r14 = r13.m622()
            r15.f5895 = r14
            int r14 = r13.m623()
            r15.f5896 = r14
            goto Lc0
        Lb4:
            int r14 = r13.m622()
            r15.f5897 = r14
            int r14 = r13.m623()
            r15.f5894 = r14
        Lc0:
            r13.f973 = r4
            android.view.View r14 = r13.m624()
            if (r14 != 0) goto Lca
            goto L140
        Lca:
            ᛸᛷᛴᲀ r0 = r13.f974
            if (r0 == 0) goto Ld7
            android.view.ViewTreeObserver r0 = r14.getViewTreeObserver()
            ᛸᛷᛴᲀ r1 = r13.f974
            r0.removeOnGlobalLayoutListener(r1)
        Ld7:
            android.view.ViewTreeObserver r0 = r14.getViewTreeObserver()
            ᛸᛷᛴᲀ r1 = new ᛸᛷᛴᲀ
            r1.<init>(r13, r14)
            r13.f974 = r1
            r0.addOnGlobalLayoutListener(r1)
            goto L140
        Le6:
            r13.f973 = r5
            ᛸᲈᛸᲈ r7 = r13.f977
            r7.getClass()
            int r7 = r15.f5897
            int r14 = java.lang.Math.max(r14, r2)
            int r14 = r14 + r7
            r15.f5897 = r14
            ᛸᲈᛸᲈ r14 = r13.f977
            r14.getClass()
            int r14 = r15.f5894
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = r0 + r14
            r15.f5894 = r0
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r14 = r13.f979
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            int r14 = r14.getLayoutDirection()
            if (r14 != r4) goto L10f
            goto L110
        L10f:
            r4 = r5
        L110:
            ᛸᲈᛸᲈ r14 = r13.f977
            r14.getClass()
            int r14 = r15.f5896
            if (r4 == 0) goto L121
            int r0 = java.lang.Math.max(r11, r6)
            int r0 = r0 + r14
            r15.f5896 = r0
            goto L128
        L121:
            int r0 = java.lang.Math.max(r8, r3)
            int r0 = r0 + r14
            r15.f5896 = r0
        L128:
            ᛸᲈᛸᲈ r14 = r13.f977
            r14.getClass()
            int r14 = r15.f5895
            if (r4 == 0) goto L139
            int r0 = java.lang.Math.max(r8, r3)
            int r0 = r0 + r14
            r15.f5895 = r0
            goto L140
        L139:
            int r0 = java.lang.Math.max(r11, r6)
            int r0 = r0 + r14
            r15.f5895 = r0
        L140:
            r13.m625(r15)
        L143:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean m627() {
            r1 = this;
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r1 = r1.f976
            if (r1 != 0) goto L9
            android.app.Activity r1 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            goto Ld
        L9:
            android.app.Activity r1 = r1.m271()
        Ld:
            if (r1 != 0) goto L10
            goto L31
        L10:
            android.view.Window r0 = r1.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.flags
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L1f
            goto L2f
        L1f:
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            int r1 = r1.getSystemUiVisibility()
            r1 = r1 & 4
            if (r1 == 0) goto L31
        L2f:
            r1 = 1
            return r1
        L31:
            r1 = 0
            return r1
    }
}
