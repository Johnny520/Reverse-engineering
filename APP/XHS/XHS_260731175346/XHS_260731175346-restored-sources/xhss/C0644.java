package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛴᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0644 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout f2202;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C1037 f2203;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.ViewOnLayoutChangeListenerC0855 f2204;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public boolean f2205;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public xhss.ViewTreeObserverOnGlobalLayoutListenerC0804 f2206;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public boolean f2207;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int f2208;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public com.kongzue.dialogx.interfaces.AbstractC0001 f2209;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.C1096 f2210;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1126(xhss.C0847 r14, xhss.C1096 r15) {
            r13 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r13.f2202
            if (r0 == 0) goto L143
            xhss.ᛵᛸᛱ r14 = r14.f2754
            r1 = 8
            xhss.ᲀᲈᲈᛸ r2 = r14.mo330(r1)
            boolean r3 = r14.mo406(r1)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1a
            int r2 = r2.f2971
            if (r2 <= 0) goto L1a
            r2 = r4
            goto L1b
        L1a:
            r2 = r5
        L1b:
            r0.f102 = r2
            r13.f2210 = r15
            xhss.ᛷᛵᛳᛸ r0 = r14.mo906()
            if (r0 == 0) goto L38
            android.view.DisplayCutout r0 = r0.f2254
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
            xhss.ᲀᲈᲈᛸ r7 = r14.mo330(r7)
            int r8 = r7.f2970
            int r9 = r7.f2968
            int r10 = r7.f2971
            int r11 = r7.f2969
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r12 = r13.f2202
            android.view.View r12 = r12.getRootView()
            r12.getWindowSystemUiVisibility()
            boolean r1 = r14.mo406(r1)
            r12 = 2
            if (r1 != 0) goto L63
            boolean r1 = r14.mo406(r12)
            if (r1 == 0) goto L61
            goto L63
        L61:
            r1 = r5
            goto L64
        L63:
            r1 = r10
        L64:
            boolean r14 = r14.mo406(r4)
            if (r14 == 0) goto L6c
            r14 = r9
            goto L6d
        L6c:
            r14 = r5
        L6d:
            if (r9 != 0) goto Le6
            if (r10 != 0) goto Le6
            int r7 = r7.f2970
            if (r7 != 0) goto Le6
            if (r11 != 0) goto Le6
            int r14 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f97
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r14 = r13.f2209
            if (r14 != 0) goto L82
            android.app.Activity r14 = com.kongzue.dialogx.interfaces.AbstractC0001.m35()
            goto L86
        L82:
            android.app.Activity r14 = r14.m54()
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
            int r14 = r13.m1128()
            r15.f3529 = r14
            int r14 = r13.m1130()
            r15.f3530 = r14
            goto Lc0
        Lb4:
            int r14 = r13.m1128()
            r15.f3528 = r14
            int r14 = r13.m1130()
            r15.f3531 = r14
        Lc0:
            r13.f2207 = r4
            android.view.View r14 = r13.m1127()
            if (r14 != 0) goto Lca
            goto L140
        Lca:
            xhss.ᛸᲀᲈᛳ r0 = r13.f2206
            if (r0 == 0) goto Ld7
            android.view.ViewTreeObserver r0 = r14.getViewTreeObserver()
            xhss.ᛸᲀᲈᛳ r1 = r13.f2206
            r0.removeOnGlobalLayoutListener(r1)
        Ld7:
            android.view.ViewTreeObserver r0 = r14.getViewTreeObserver()
            xhss.ᛸᲀᲈᛳ r1 = new xhss.ᛸᲀᲈᛳ
            r1.<init>(r13, r14)
            r13.f2206 = r1
            r0.addOnGlobalLayoutListener(r1)
            goto L140
        Le6:
            r13.f2207 = r5
            xhss.ᲇᛵᛲᲁ r7 = r13.f2203
            r7.getClass()
            int r7 = r15.f3528
            int r14 = java.lang.Math.max(r14, r2)
            int r14 = r14 + r7
            r15.f3528 = r14
            xhss.ᲇᛵᛲᲁ r14 = r13.f2203
            r14.getClass()
            int r14 = r15.f3531
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = r0 + r14
            r15.f3531 = r0
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r14 = r13.f2202
            int r0 = xhss.AbstractC0624.f2154
            int r14 = r14.getLayoutDirection()
            if (r14 != r4) goto L10f
            goto L110
        L10f:
            r4 = r5
        L110:
            xhss.ᲇᛵᛲᲁ r14 = r13.f2203
            r14.getClass()
            int r14 = r15.f3530
            if (r4 == 0) goto L121
            int r0 = java.lang.Math.max(r11, r6)
            int r0 = r0 + r14
            r15.f3530 = r0
            goto L128
        L121:
            int r0 = java.lang.Math.max(r8, r3)
            int r0 = r0 + r14
            r15.f3530 = r0
        L128:
            xhss.ᲇᛵᛲᲁ r14 = r13.f2203
            r14.getClass()
            int r14 = r15.f3529
            if (r4 == 0) goto L139
            int r0 = java.lang.Math.max(r8, r3)
            int r0 = r0 + r14
            r15.f3529 = r0
            goto L140
        L139:
            int r0 = java.lang.Math.max(r11, r6)
            int r0 = r0 + r14
            r15.f3529 = r0
        L140:
            r13.m1129(r15)
        L143:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final android.view.View m1127() {
            r0 = this;
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = r0.f2209
            if (r0 != 0) goto L9
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.AbstractC0001.m35()
            goto Ld
        L9:
            android.app.Activity r0 = r0.m54()
        Ld:
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int m1128() {
            r3 = this;
            boolean r0 = r3.m1131()
            if (r0 != 0) goto L4b
            android.view.View r0 = r3.m1127()
            if (r0 != 0) goto Ld
            goto L4b
        Ld:
            android.view.View r0 = r3.m1127()
            android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
            if (r0 == 0) goto L20
            int r0 = r0.getSystemBarsBehavior()
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.f2202
            if (r0 == 0) goto L36
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto L2b
            goto L36
        L2b:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r3.f2202
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1129(xhss.C1096 r8) {
            r7 = this;
            xhss.ᲇᛵᛲᲁ r0 = r7.f2203
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r8.f3530
            r2 = 1
            int r0 = r0.m1694(r2)
            int r0 = r0 + r1
            r8.f3530 = r0
            int r0 = r8.f3528
            xhss.ᲇᛵᛲᲁ r1 = r7.f2203
            r2 = 2
            int r1 = r1.m1694(r2)
            int r1 = r1 + r0
            r8.f3528 = r1
            int r0 = r8.f3529
            xhss.ᲇᛵᛲᲁ r1 = r7.f2203
            r3 = 3
            int r1 = r1.m1694(r3)
            int r1 = r1 + r0
            r8.f3529 = r1
            int r0 = r8.f3531
            xhss.ᲇᛵᛲᲁ r1 = r7.f2203
            r3 = 4
            int r1 = r1.m1694(r3)
            int r1 = r1 + r0
            r8.f3531 = r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r7.f2202
            if (r0 == 0) goto L38
            goto L43
        L38:
            int r3 = r8.f3530
            int r4 = r8.f3528
            int r5 = r8.f3529
            int r6 = xhss.AbstractC0624.f2154
            r0.setPaddingRelative(r3, r4, r5, r1)
        L43:
            int r0 = r8.f3530
            int r1 = r8.f3528
            int r3 = r8.f3529
            int r8 = r8.f3531
            boolean r4 = r7.f2207
            int r5 = r7.f2208
            int r6 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f97
            xhss.ᲇᛵᛲᲁ r7 = r7.f2203
            if (r4 == 0) goto L56
            goto L57
        L56:
            r5 = 0
        L57:
            int r8 = r8 + r5
            java.lang.Object r7 = r7.f3349
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r7 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r7
            android.graphics.Rect r4 = r7.f100
            if (r4 != 0) goto L67
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r7.f100 = r4
        L67:
            android.view.WindowInsets r4 = r7.getRootWindowInsets()
            r5 = 0
            if (r4 == 0) goto L9e
            android.view.WindowInsets r4 = r7.getRootWindowInsets()
            xhss.ᲀᛳᛲᛶ r4 = xhss.C0847.m1430(r5, r4)
            xhss.ᛵᛸᛱ r4 = r4.f2754
            boolean r2 = r4.mo406(r2)
            r6 = 8
            boolean r6 = r4.mo406(r6)
            if (r6 != 0) goto L9e
            if (r2 == 0) goto L9e
            r2 = 519(0x207, float:7.27E-43)
            xhss.ᲀᲈᲈᛸ r2 = r4.mo330(r2)
            int r4 = r2.f2971
            if (r4 != r8) goto L9d
            int r4 = r2.f2968
            if (r4 != r1) goto L9d
            int r4 = r2.f2970
            if (r4 != r0) goto L9d
            int r4 = r2.f2969
            if (r4 != r3) goto L9d
            goto L9e
        L9d:
            r5 = r2
        L9e:
            android.graphics.Rect r2 = r7.f100
            if (r5 == 0) goto Lc9
            int r4 = r5.f2970
            int r0 = java.lang.Math.max(r4, r0)
            r2.left = r0
            android.graphics.Rect r0 = r7.f100
            int r2 = r5.f2968
            int r1 = java.lang.Math.max(r2, r1)
            r0.top = r1
            android.graphics.Rect r0 = r7.f100
            int r1 = r5.f2969
            int r1 = java.lang.Math.max(r1, r3)
            r0.right = r1
            android.graphics.Rect r0 = r7.f100
            int r1 = r5.f2971
            int r8 = java.lang.Math.max(r1, r8)
            r0.bottom = r8
            goto Ld1
        Lc9:
            r2.left = r0
            r2.top = r1
            r2.right = r3
            r2.bottom = r8
        Ld1:
            android.graphics.Rect r8 = r7.f100
            int r0 = r8.left
            int r1 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            r7.m70(r0, r1, r2, r8)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int m1130() {
            r4 = this;
            boolean r0 = r4.m1131()
            r1 = 0
            if (r0 != 0) goto L4e
            android.view.View r0 = r4.m1127()
            if (r0 != 0) goto Le
            goto L4e
        Le:
            android.view.View r0 = r4.m1127()
            android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
            if (r0 == 0) goto L23
            int r0 = r0.getSystemBarsBehavior()
            r0 = r0 & 16
            if (r0 != 0) goto L23
            int r4 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f97
            return r1
        L23:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r4.f2202
            if (r0 == 0) goto L39
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto L2e
            goto L39
        L2e:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4 = r4.f2202
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

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final boolean m1131() {
            r1 = this;
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r1 = r1.f2209
            if (r1 != 0) goto L9
            android.app.Activity r1 = com.kongzue.dialogx.interfaces.AbstractC0001.m35()
            goto Ld
        L9:
            android.app.Activity r1 = r1.m54()
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
