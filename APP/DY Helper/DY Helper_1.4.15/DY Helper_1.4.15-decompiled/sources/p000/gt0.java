package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gt0 {

    /* JADX INFO: renamed from: α */
    public final p000.C0379i0 f4449;

    /* JADX INFO: renamed from: β */
    public final p000.C0930w0 f4450;

    /* JADX INFO: renamed from: γ */
    public final p000.C0930w0 f4451;

    /* JADX INFO: renamed from: δ */
    public final java.lang.ref.WeakReference f4452;

    /* JADX INFO: renamed from: ε */
    public final p000.x91 f4453;

    /* JADX INFO: renamed from: ζ */
    public final java.util.LinkedHashMap f4454;

    /* JADX INFO: renamed from: η */
    public final java.util.LinkedHashSet f4455;

    /* JADX INFO: renamed from: θ */
    public final p000.ns0 f4456;

    /* JADX INFO: renamed from: ι */
    public boolean f4457;

    /* JADX INFO: renamed from: κ */
    public com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout f4458;

    /* JADX INFO: renamed from: λ */
    public p000.qt0 f4459;

    /* JADX INFO: renamed from: μ */
    public boolean f4460;

    /* JADX INFO: renamed from: ν */
    public final p000.dn0 f4461;

    public gt0(android.view.ViewGroup r1, p000.C0379i0 r2, p000.C0930w0 r3, p000.C0930w0 r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f4449 = r2
            r0.f4450 = r3
            r0.f4451 = r4
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f4452 = r2
            ps0 r2 = p000.ps0.f8686
            x91 r2 = p000.j81.m2882(r2)
            r0.f4453 = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.f4454 = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0.f4455 = r2
            ns0 r2 = new ns0
            dt0 r3 = new dt0
            r4 = 0
            r3.<init>(r0, r4)
            r2.<init>(r3)
            r0.f4456 = r2
            dn0 r2 = new dn0
            r3 = 1
            r2.<init>(r3, r0)
            r0.f4461 = r2
            k2 r2 = new k2
            r3 = 3
            r2.<init>(r3, r0)
            r1.addOnAttachStateChangeListener(r2)
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2319(android.view.ViewGroup r18, float r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r2 = r0.f4458
            r3 = 0
            if (r2 == 0) goto L15
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != r1) goto L10
            goto L11
        L10:
            r2 = r3
        L11:
            if (r2 == 0) goto L15
            goto L156
        L15:
            float r2 = java.lang.Math.abs(r19)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1069547520(0x3fc00000, float:1.5)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r2 > 0) goto L2e
            r2 = r19
            float r2 = p000.j81.m2905(r2, r7, r6)
            r13 = r2
            goto L2f
        L2e:
            r13 = r5
        L2f:
            qt0 r2 = new qt0
            r2.<init>()
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r15 = new com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout
            android.content.Context r8 = r1.getContext()
            r8.getClass()
            r15.<init>(r8)
            float r8 = java.lang.Math.abs(r13)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 > 0) goto L4d
            float r8 = p000.j81.m2905(r13, r7, r6)
            goto L4e
        L4d:
            r8 = r5
        L4e:
            r15.f2262 = r8
            r8 = 0
            r15.setBackgroundColor(r8)
            r15.setSaveEnabled(r8)
            r9 = 1
            r15.setImportantForAccessibility(r9)
            android.content.res.Resources r10 = r15.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            r11 = 1111490560(0x42400000, float:48.0)
            float r10 = r10 * r11
            r15.setElevation(r10)
            r10 = 4
            r15.setVisibility(r10)
            androidx.compose.ui.platform.ComposeView r11 = r15.getComposeView()
            xn0 r12 = p000.xn0.f12223
            r11.setViewCompositionStrategy(r12)
            r11.setBackgroundColor(r8)
            r11.setSaveEnabled(r8)
            r11.setFocusable(r9)
            r11.setImportantForAccessibility(r9)
            android.view.View r12 = r1.getRootView()
            r12.getClass()
            boolean r14 = r2.f9103
            if (r14 != 0) goto L157
            r14 = 2131297158(0x7f090386, float:1.8212253E38)
            r11.setTag(r14, r2)
            r16 = r4
            r4 = 2131297161(0x7f090389, float:1.821226E38)
            r11.setTag(r4, r2)
            r4 = 2131297160(0x7f090388, float:1.8212257E38)
            r11.setTag(r4, r2)
            hr0 r4 = p000.v71.m6037(r12)
            if (r4 != 0) goto Lb3
            r12.setTag(r14, r2)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r12)
            r2.f9104 = r4
        Lb3:
            boolean r4 = r1 instanceof android.widget.FrameLayout
            r12 = -1
            if (r4 != 0) goto Lbe
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r12, r12)
            goto Lfe
        Lbe:
            float r4 = java.lang.Math.abs(r13)
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 > 0) goto Lca
            float r5 = p000.j81.m2905(r13, r7, r6)
        Lca:
            android.content.res.Resources r4 = r15.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r6 = 1116733440(0x42900000, float:72.0)
            float r4 = r4 * r6
            float r4 = r4 * r5
            int r4 = p000.jx0.m3061(r4)
            if (r4 >= r9) goto Ldf
            r4 = r9
        Ldf:
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = 80
            r5.<init>(r12, r4, r6)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            if (r4 == 0) goto Lfb
            int r6 = android.view.WindowInsets.Type.navigationBars()
            android.graphics.Insets r4 = r4.getInsets(r6)
            if (r4 == 0) goto Lfb
            int r8 = r4.bottom
        Lfb:
            r5.bottomMargin = r8
            r4 = r5
        Lfe:
            et0 r5 = new et0
            r5.<init>()
            r15.setOnApplyWindowInsetsListener(r5)
            r0.f4458 = r15
            r0.f4459 = r2
            x91 r2 = r0.f4453
            java.lang.Object r5 = r2.getValue()
            r8 = r5
            ps0 r8 = (p000.ps0) r8
            r12 = 0
            r14 = 15
            r5 = r9
            r9 = 0
            r6 = r10
            r10 = 0
            r7 = r11
            r11 = 0
            ps0 r8 = p000.ps0.m4587(r8, r9, r10, r11, r12, r13, r14)
            r2.setValue(r8)
            r1.addView(r15, r4)
            r15.requestApplyInsets()
            dt0 r2 = new dt0
            r2.<init>(r0, r5)
            an r4 = new an
            r8 = -734125282(0xffffffffd43e231e, float:-3.2665318E12)
            r4.<init>(r8, r5, r2)
            r7.setContent(r4)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "液态玻璃覆盖层已挂载: "
            java.lang.String r1 = r2.concat(r1)
            java.util.LinkedHashSet r0 = r0.f4455
            java.lang.String r2 = "overlay_attached"
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L156
            java.lang.String r0 = "ra2e8a11463d992df"
            p000.C0888ux.m5988(r0, r1, r3, r6, r3)
        L156:
            return
        L157:
            java.lang.String r0 = "不能安装已销毁的液态玻璃 Compose owner"
            p000.C1080.m7279(r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m2320(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            java.util.LinkedHashSet r0 = r0.f4455
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto Ld
            java.lang.String r0 = "ra2e8a11463d992df"
            p000.C0888ux.m5977(r0, r2, r3)
        Ld:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m2321(android.view.ViewGroup r6) {
            r5 = this;
            x91 r0 = r5.f4453
            ps0 r1 = p000.ps0.f8686
            r0.setValue(r1)
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r0 = r5.f4458
            s62 r1 = p000.s62.f9751
            if (r0 == 0) goto L49
            androidx.compose.ui.platform.ComposeView r2 = r0.getComposeView()     // Catch: java.lang.Throwable -> L16
            r2.m358()     // Catch: java.lang.Throwable -> L16
            r3 = r1
            goto L1c
        L16:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
        L1c:
            java.lang.Throwable r2 = p000.fo1.m2190(r3)
            if (r2 == 0) goto L29
            java.lang.String r3 = "dispose"
            java.lang.String r4 = "释放玻璃底栏组合失败"
            r5.m2320(r3, r4, r2)
        L29:
            android.view.ViewParent r2 = r0.getParent()     // Catch: java.lang.Throwable -> L33
            if (r2 != r6) goto L35
            r6.removeView(r0)     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r6 = move-exception
            goto L37
        L35:
            r0 = r1
            goto L3c
        L37:
            eo1 r0 = new eo1
            r0.<init>(r6)
        L3c:
            java.lang.Throwable r6 = p000.fo1.m2190(r0)
            if (r6 == 0) goto L49
            java.lang.String r0 = "remove"
            java.lang.String r2 = "移除玻璃底栏 View 失败"
            r5.m2320(r0, r2, r6)
        L49:
            r6 = 0
            r5.f4458 = r6
            qt0 r0 = r5.f4459
            if (r0 == 0) goto L97
            boolean r2 = r0.f9103     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L55
            goto L8a
        L55:
            r2 = 1
            r0.f9103 = r2     // Catch: java.lang.Throwable -> L84
            java.lang.ref.WeakReference r2 = r0.f9104     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L70
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L84
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L70
            hr0 r3 = p000.v71.m6037(r2)     // Catch: java.lang.Throwable -> L84
            if (r3 != r0) goto L70
            r3 = 2131297158(0x7f090386, float:1.8212253E38)
            r2.setTag(r3, r6)     // Catch: java.lang.Throwable -> L84
        L70:
            r0.f9104 = r6     // Catch: java.lang.Throwable -> L84
            jr0 r2 = r0.f9100     // Catch: java.lang.Throwable -> L84
            cr0 r3 = p000.cr0.f2724     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "setCurrentState"
            r2.m2982(r4)     // Catch: java.lang.Throwable -> L84
            r2.m2984(r3)     // Catch: java.lang.Throwable -> L84
            q92 r0 = r0.f9102     // Catch: java.lang.Throwable -> L84
            r0.m4818()     // Catch: java.lang.Throwable -> L84
            goto L8a
        L84:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
        L8a:
            java.lang.Throwable r0 = p000.fo1.m2190(r1)
            if (r0 == 0) goto L97
            java.lang.String r1 = "destroy_owner"
            java.lang.String r2 = "销毁玻璃底栏 Compose owner 失败"
            r5.m2320(r1, r2, r0)
        L97:
            r5.f4459 = r6
            ns0 r5 = r5.f4456
            long r0 = r5.f7726
            r2 = 1
            long r0 = r0 + r2
            r5.f7726 = r0
            r0 = 0
            r5.f7725 = r0
            android.graphics.Bitmap[] r1 = r5.f7720
            xm0 r2 = p000.AbstractC0312g7.m2251(r1)
            java.util.Iterator r2 = r2.iterator()
        Laf:
            r3 = r2
            wm0 r3 = (p000.wm0) r3
            boolean r4 = r3.f11765
            if (r4 == 0) goto Lbd
            int r3 = r3.nextInt()
            r1[r3] = r6
            goto Laf
        Lbd:
            r5.f7721 = r6
            r5.f7722 = r0
            r5.f7723 = r0
            r0 = 0
            r5.f7724 = r0
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m2322() {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.f4452
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L15
            sb r1 = p000.C0792sb.f9786
            η r1 = new η
            r2 = 4
            r1.<init>(r2, r0)
            p000.C0792sb.m5401(r1)
        L15:
            java.util.LinkedHashMap r3 = r3.f4454
            r3.clear()
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m2323(boolean r6) {
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.f4452
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto Lc
            goto Lad
        Lc:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 != 0) goto L24
            jg r1 = new jg
            r2 = 3
            r1.<init>(r5, r6, r2)
            r0.post(r1)
            return
        L24:
            boolean r1 = r5.f4457
            r2 = 1
            if (r6 != r1) goto L2f
            if (r6 == 0) goto Lad
            r5.m2324(r2)
            return
        L2f:
            dn0 r1 = r5.f4461
            r3 = 0
            if (r6 != 0) goto L51
            r5.f4457 = r3
            boolean r6 = r5.f4460
            if (r6 != 0) goto L3b
            goto L4a
        L3b:
            android.view.ViewTreeObserver r6 = r0.getViewTreeObserver()
            boolean r2 = r6.isAlive()
            if (r2 == 0) goto L48
            r6.removeOnPreDrawListener(r1)
        L48:
            r5.f4460 = r3
        L4a:
            r5.m2322()
            r5.m2321(r0)
            return
        L51:
            w0 r6 = r5.f4451     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L7d
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L7d
            float r6 = r6.floatValue()     // Catch: java.lang.Throwable -> L7d
            r5.m2319(r0, r6)     // Catch: java.lang.Throwable -> L7d
            r5.f4457 = r2     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r5.f4460     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L67
            goto L77
        L67:
            android.view.ViewTreeObserver r6 = r0.getViewTreeObserver()     // Catch: java.lang.Throwable -> L7d
            boolean r4 = r6.isAlive()     // Catch: java.lang.Throwable -> L7d
            if (r4 != 0) goto L72
            goto L77
        L72:
            r6.addOnPreDrawListener(r1)     // Catch: java.lang.Throwable -> L7d
            r5.f4460 = r2     // Catch: java.lang.Throwable -> L7d
        L77:
            r5.m2324(r2)     // Catch: java.lang.Throwable -> L7d
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L7d
            goto L84
        L7d:
            r6 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r6)
            r6 = r2
        L84:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto Lad
            r5.f4457 = r3
            boolean r2 = r5.f4460
            if (r2 != 0) goto L91
            goto La0
        L91:
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            boolean r4 = r2.isAlive()
            if (r4 == 0) goto L9e
            r2.removeOnPreDrawListener(r1)
        L9e:
            r5.f4460 = r3
        La0:
            r5.m2322()
            r5.m2321(r0)
            java.lang.String r0 = "activate"
            java.lang.String r1 = "装配液态玻璃底栏失败，已恢复宿主原底栏"
            r5.m2320(r0, r1, r6)
        Lad:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m2324(boolean r23) {
            r22 = this;
            r1 = r22
            java.util.LinkedHashMap r0 = r1.f4454
            boolean r2 = r1.f4457
            if (r2 != 0) goto La
            goto L27d
        La:
            java.lang.ref.WeakReference r2 = r1.f4452
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L16
            goto L27d
        L16:
            w0 r3 = r1.f4450
            java.lang.Object r3 = r3.invoke()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 != 0) goto L29
            r1.m2323(r4)
            return
        L29:
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L27d
            int r3 = r2.getWidth()
            if (r3 <= 0) goto L27d
            int r3 = r2.getHeight()
            if (r3 > 0) goto L3d
            goto L27d
        L3d:
            w0 r3 = r1.f4451     // Catch: java.lang.Throwable -> L71
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L71
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L71
            float r3 = r3.floatValue()     // Catch: java.lang.Throwable -> L71
            boolean r3 = r1.m2325(r2, r3)     // Catch: java.lang.Throwable -> L71
            i0 r5 = r1.f4449     // Catch: java.lang.Throwable -> L71
            java.util.List r5 = r5.m2560(r2)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L71
        L5c:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L71
            if (r8 == 0) goto L75
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L71
            r9 = r8
            st0 r9 = (p000.st0) r9     // Catch: java.lang.Throwable -> L71
            boolean r9 = r9.f10032     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L5c
            r6.add(r8)     // Catch: java.lang.Throwable -> L71
            goto L5c
        L71:
            r0 = move-exception
            r3 = r1
            goto L266
        L75:
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> L71
            java.lang.String r13 = "ra2e8a11463d992df"
            java.util.LinkedHashSet r14 = r1.f4455
            r15 = 4
            r8 = 0
            java.lang.String r9 = ", visible="
            x91 r10 = r1.f4453
            if (r7 == 0) goto Le3
            java.lang.String r0 = "tabs_not_ready"
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L71
            int r5 = r6.size()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = "宿主底栏已发现，但当前没有可展示 Tab: all="
            r6.append(r7)     // Catch: java.lang.Throwable -> L71
            r6.append(r3)     // Catch: java.lang.Throwable -> L71
            r6.append(r9)     // Catch: java.lang.Throwable -> L71
            r6.append(r5)     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = ", container="
            r6.append(r3)     // Catch: java.lang.Throwable -> L71
            r6.append(r2)     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L71
            boolean r0 = r14.add(r0)     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto Lbf
            p000.C0888ux.m5988(r13, r2, r8, r15, r8)     // Catch: java.lang.Throwable -> L71
        Lbf:
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r0 = r1.f4458     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto Lc6
            r0.setVisibility(r15)     // Catch: java.lang.Throwable -> L71
        Lc6:
            r1.m2322()     // Catch: java.lang.Throwable -> L71
            ps0 r11 = p000.ps0.f8686     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r10.getValue()     // Catch: java.lang.Throwable -> L71
            ps0 r0 = (p000.ps0) r0     // Catch: java.lang.Throwable -> L71
            float r0 = r0.f8691     // Catch: java.lang.Throwable -> L71
            r17 = 15
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = r0
            ps0 r0 = p000.ps0.m4587(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L71
            r10.setValue(r0)     // Catch: java.lang.Throwable -> L71
            return
        Le3:
            int r7 = r6.size()     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r11.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r12 = "tabs_ready_"
            r11.append(r12)     // Catch: java.lang.Throwable -> L71
            r11.append(r7)     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = r11.toString()     // Catch: java.lang.Throwable -> L71
            int r11 = r5.size()     // Catch: java.lang.Throwable -> L71
            int r12 = r6.size()     // Catch: java.lang.Throwable -> L71
            r16 = r7
            java.lang.String r7 = ","
            r17 = r11
            gp0 r11 = new gp0     // Catch: java.lang.Throwable -> L71
            r4 = 1
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r18 = r12
            r12 = 30
            r19 = r8
            r8 = 0
            r20 = r9
            r9 = 0
            r21 = r10
            r10 = 0
            r4 = r16
            r15 = r17
            r1 = r20
            r17 = r3
            r3 = r18
            java.lang.String r7 = p000.AbstractC0984xh.m6644(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L174
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L174
            r8.<init>()     // Catch: java.lang.Throwable -> L174
            java.lang.String r9 = "按宿主当前条件创建液态玻璃 Tab: all="
            r8.append(r9)     // Catch: java.lang.Throwable -> L174
            r8.append(r15)     // Catch: java.lang.Throwable -> L174
            r8.append(r1)     // Catch: java.lang.Throwable -> L174
            r8.append(r3)     // Catch: java.lang.Throwable -> L174
            java.lang.String r1 = ", ids="
            r8.append(r1)     // Catch: java.lang.Throwable -> L174
            r8.append(r7)     // Catch: java.lang.Throwable -> L174
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L174
            boolean r3 = r14.add(r4)     // Catch: java.lang.Throwable -> L174
            if (r3 == 0) goto L151
            r3 = 4
            r4 = 0
            p000.C0888ux.m5988(r13, r1, r4, r3, r4)     // Catch: java.lang.Throwable -> L174
        L151:
            sb r1 = p000.C0792sb.f9786     // Catch: java.lang.Throwable -> L174
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L174
            r3 = 10
            int r4 = p000.AbstractC1021yh.m6889(r5, r3)     // Catch: java.lang.Throwable -> L174
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L174
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Throwable -> L174
        L162:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L174
            if (r5 == 0) goto L179
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L174
            st0 r5 = (p000.st0) r5     // Catch: java.lang.Throwable -> L174
            android.view.View r5 = r5.f10025     // Catch: java.lang.Throwable -> L174
            r1.add(r5)     // Catch: java.lang.Throwable -> L174
            goto L162
        L174:
            r0 = move-exception
            r3 = r22
            goto L266
        L179:
            p3 r4 = new p3     // Catch: java.lang.Throwable -> L174
            r5 = 2
            r4.<init>(r2, r5, r1)     // Catch: java.lang.Throwable -> L174
            p000.C0792sb.m5401(r4)     // Catch: java.lang.Throwable -> L174
            r0.clear()     // Catch: java.lang.Throwable -> L174
            java.util.Iterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L174
        L189:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L174
            if (r4 == 0) goto L1a2
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L174
            st0 r4 = (p000.st0) r4     // Catch: java.lang.Throwable -> L174
            java.lang.String r7 = r4.f10026     // Catch: java.lang.Throwable -> L174
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L174
            android.view.View r4 = r4.f10025     // Catch: java.lang.Throwable -> L174
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L174
            r0.put(r7, r8)     // Catch: java.lang.Throwable -> L174
            goto L189
        L1a2:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L174
            int r0 = p000.AbstractC1021yh.m6889(r6, r3)     // Catch: java.lang.Throwable -> L174
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L174
            java.util.Iterator r0 = r6.iterator()     // Catch: java.lang.Throwable -> L174
        L1af:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L174
            if (r1 == 0) goto L1d0
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L174
            st0 r1 = (p000.st0) r1     // Catch: java.lang.Throwable -> L174
            xt0 r7 = new xt0     // Catch: java.lang.Throwable -> L174
            java.lang.String r8 = r1.f10026     // Catch: java.lang.Throwable -> L174
            java.lang.String r9 = r1.f10027     // Catch: java.lang.Throwable -> L174
            android.graphics.Bitmap r10 = r1.f10031     // Catch: java.lang.Throwable -> L174
            boolean r11 = r1.f10028     // Catch: java.lang.Throwable -> L174
            java.lang.String r12 = r1.f10029     // Catch: java.lang.Throwable -> L174
            boolean r13 = r1.f10030     // Catch: java.lang.Throwable -> L174
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L174
            r4.add(r7)     // Catch: java.lang.Throwable -> L174
            goto L1af
        L1d0:
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L174
            if (r0 == 0) goto L1d8
            r1 = 0
            goto L1fb
        L1d8:
            java.util.Iterator r0 = r6.iterator()     // Catch: java.lang.Throwable -> L174
            r1 = 0
        L1dd:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L174
            if (r3 == 0) goto L1fb
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L174
            st0 r3 = (p000.st0) r3     // Catch: java.lang.Throwable -> L174
            boolean r3 = r3.f10033     // Catch: java.lang.Throwable -> L174
            if (r3 == 0) goto L1f8
            int r1 = r1 + 1
            if (r1 < 0) goto L1f2
            goto L1dd
        L1f2:
            p000.AbstractC1021yh.m6916()     // Catch: java.lang.Throwable -> L174
            r19 = 0
            throw r19     // Catch: java.lang.Throwable -> L174
        L1f8:
            r19 = 0
            goto L1dd
        L1fb:
            int r1 = r1 * r5
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L174
            if (r1 < r0) goto L204
            r7 = 1
            goto L205
        L204:
            r7 = 0
        L205:
            java.lang.Object r0 = r21.getValue()     // Catch: java.lang.Throwable -> L174
            r3 = r0
            ps0 r3 = (p000.ps0) r3     // Catch: java.lang.Throwable -> L174
            java.util.List r0 = r3.f8687     // Catch: java.lang.Throwable -> L174
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L174
            if (r0 == 0) goto L21e
            boolean r0 = r3.f8690     // Catch: java.lang.Throwable -> L174
            if (r0 == r7) goto L219
            goto L21e
        L219:
            r1 = r21
        L21b:
            r3 = r22
            goto L22d
        L21e:
            r8 = 0
            r9 = 22
            r5 = 0
            r6 = 0
            ps0 r0 = p000.ps0.m4587(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L174
            r1 = r21
            r1.setValue(r0)     // Catch: java.lang.Throwable -> L174
            goto L21b
        L22d:
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r0 = r3.f4458     // Catch: java.lang.Throwable -> L239
            if (r0 == 0) goto L23b
            r4 = 0
            r0.setVisibility(r4)     // Catch: java.lang.Throwable -> L239
            r0.bringToFront()     // Catch: java.lang.Throwable -> L239
            goto L23b
        L239:
            r0 = move-exception
            goto L266
        L23b:
            if (r23 != 0) goto L242
            if (r17 == 0) goto L240
            goto L242
        L240:
            r7 = 0
            goto L243
        L242:
            r7 = 1
        L243:
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r6 = r3.f4458     // Catch: java.lang.Throwable -> L239
            if (r6 != 0) goto L248
            goto L263
        L248:
            ns0 r4 = r3.f4456     // Catch: java.lang.Throwable -> L239
            android.view.View r5 = r2.getRootView()     // Catch: java.lang.Throwable -> L239
            r5.getClass()     // Catch: java.lang.Throwable -> L239
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> L239
            ps0 r0 = (p000.ps0) r0     // Catch: java.lang.Throwable -> L239
            float r8 = r0.f8691     // Catch: java.lang.Throwable -> L239
            wa r9 = new wa     // Catch: java.lang.Throwable -> L239
            r0 = 20
            r9.<init>(r3, r0, r6)     // Catch: java.lang.Throwable -> L239
            r4.m4091(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L239
        L263:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L239
            goto L26c
        L266:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L26c:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L27d
            java.lang.String r1 = "sync"
            java.lang.String r2 = "同步宿主底栏状态失败，已恢复原底栏"
            r3.m2320(r1, r2, r0)
            r4 = 0
            r3.m2323(r4)
        L27d:
            return
    }

    /* JADX INFO: renamed from: η */
    public final boolean m2325(android.view.ViewGroup r14, float r15) {
            r13 = this;
            float r0 = java.lang.Math.abs(r15)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1069547520(0x3fc00000, float:1.5)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r0 > 0) goto L17
            float r15 = p000.j81.m2905(r15, r4, r3)
            r10 = r15
            goto L18
        L17:
            r10 = r2
        L18:
            x91 r15 = r13.f4453
            java.lang.Object r0 = r15.getValue()
            ps0 r0 = (p000.ps0) r0
            float r0 = r0.f8691
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r5 = 1
            if (r0 != 0) goto L29
            r0 = r5
            goto L2a
        L29:
            r0 = 0
        L2a:
            r12 = r0 ^ 1
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r13 = r13.f4458
            if (r13 != 0) goto L31
            goto L86
        L31:
            float r6 = java.lang.Math.abs(r10)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L3d
            float r2 = p000.j81.m2905(r10, r4, r3)
        L3d:
            r13.f2262 = r2
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto L4a
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            goto L4b
        L4a:
            r1 = 0
        L4b:
            boolean r14 = r14 instanceof android.widget.FrameLayout
            if (r14 == 0) goto L70
            if (r1 == 0) goto L70
            android.content.res.Resources r14 = r13.getResources()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            r2 = 1116733440(0x42900000, float:72.0)
            float r14 = r14 * r2
            float r14 = r14 * r10
            int r14 = p000.jx0.m3061(r14)
            if (r14 >= r5) goto L66
            goto L67
        L66:
            r5 = r14
        L67:
            int r14 = r1.height
            if (r14 == r5) goto L70
            r1.height = r5
            r13.setLayoutParams(r1)
        L70:
            if (r0 != 0) goto L86
            java.lang.Object r13 = r15.getValue()
            r5 = r13
            ps0 r5 = (p000.ps0) r5
            r9 = 0
            r11 = 15
            r6 = 0
            r7 = 0
            r8 = 0
            ps0 r13 = p000.ps0.m4587(r5, r6, r7, r8, r9, r10, r11)
            r15.setValue(r13)
        L86:
            return r12
    }
}
