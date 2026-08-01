package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tb2 implements p000.InterfaceC1141 {

    /* JADX INFO: renamed from: Α */
    public static final android.view.animation.AccelerateInterpolator f10277 = null;

    /* JADX INFO: renamed from: Β */
    public static final android.view.animation.DecelerateInterpolator f10278 = null;

    /* JADX INFO: renamed from: α */
    public android.content.Context f10279;

    /* JADX INFO: renamed from: β */
    public android.content.Context f10280;

    /* JADX INFO: renamed from: γ */
    public androidx.appcompat.widget.ActionBarOverlayLayout f10281;

    /* JADX INFO: renamed from: δ */
    public androidx.appcompat.widget.ActionBarContainer f10282;

    /* JADX INFO: renamed from: ε */
    public p000.InterfaceC1030yq f10283;

    /* JADX INFO: renamed from: ζ */
    public androidx.appcompat.widget.ActionBarContextView f10284;

    /* JADX INFO: renamed from: η */
    public final android.view.View f10285;

    /* JADX INFO: renamed from: θ */
    public boolean f10286;

    /* JADX INFO: renamed from: ι */
    public p000.sb2 f10287;

    /* JADX INFO: renamed from: κ */
    public p000.sb2 f10288;

    /* JADX INFO: renamed from: λ */
    public p000.C0574n5 f10289;

    /* JADX INFO: renamed from: μ */
    public boolean f10290;

    /* JADX INFO: renamed from: ν */
    public final java.util.ArrayList f10291;

    /* JADX INFO: renamed from: ξ */
    public int f10292;

    /* JADX INFO: renamed from: ο */
    public boolean f10293;

    /* JADX INFO: renamed from: π */
    public boolean f10294;

    /* JADX INFO: renamed from: ρ */
    public boolean f10295;

    /* JADX INFO: renamed from: σ */
    public boolean f10296;

    /* JADX INFO: renamed from: τ */
    public p000.y92 f10297;

    /* JADX INFO: renamed from: υ */
    public boolean f10298;

    /* JADX INFO: renamed from: φ */
    public boolean f10299;

    /* JADX INFO: renamed from: χ */
    public final p000.rb2 f10300;

    /* JADX INFO: renamed from: ψ */
    public final p000.rb2 f10301;

    /* JADX INFO: renamed from: ω */
    public final p000.y21 f10302;

    static {
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            p000.tb2.f10277 = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            p000.tb2.f10278 = r0
            return
    }

    public tb2(android.app.Activity r3, boolean r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f10291 = r0
            r0 = 0
            r2.f10292 = r0
            r0 = 1
            r2.f10293 = r0
            r2.f10296 = r0
            rb2 r0 = new rb2
            r1 = 0
            r0.<init>(r2, r1)
            r2.f10300 = r0
            rb2 r0 = new rb2
            r1 = 1
            r0.<init>(r2, r1)
            r2.f10301 = r0
            y21 r0 = new y21
            r0.<init>(r2)
            r2.f10302 = r0
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r2.m5625(r3)
            if (r4 != 0) goto L44
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)
            r2.f10285 = r3
        L44:
            return
    }

    public tb2(android.app.Dialog r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f10291 = r0
            r0 = 0
            r2.f10292 = r0
            r0 = 1
            r2.f10293 = r0
            r2.f10296 = r0
            rb2 r0 = new rb2
            r1 = 0
            r0.<init>(r2, r1)
            r2.f10300 = r0
            rb2 r0 = new rb2
            r1 = 1
            r0.<init>(r2, r1)
            r2.f10301 = r0
            y21 r0 = new y21
            r0.<init>(r2)
            r2.f10302 = r0
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r2.m5625(r3)
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m5623(boolean r11) {
            r10 = this;
            boolean r0 = r10.f10295
            r1 = 0
            if (r11 == 0) goto L15
            if (r0 != 0) goto L23
            r0 = 1
            r10.f10295 = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r10.f10281
            if (r2 == 0) goto L11
            r2.setShowingForActionMode(r0)
        L11:
            r10.m5628(r1)
            goto L23
        L15:
            if (r0 == 0) goto L23
            r10.f10295 = r1
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r10.f10281
            if (r0 == 0) goto L20
            r0.setShowingForActionMode(r1)
        L20:
            r10.m5628(r1)
        L23:
            androidx.appcompat.widget.ActionBarContainer r0 = r10.f10282
            boolean r0 = r0.isLaidOut()
            yq r2 = r10.f10283
            r3 = 8
            r4 = 4
            if (r0 == 0) goto Lac
            r5 = 200(0xc8, double:9.9E-322)
            r7 = 100
            if (r11 == 0) goto L54
            b52 r2 = (p000.b52) r2
            androidx.appcompat.widget.Toolbar r11 = r2.f1484
            x92 r11 = p000.b92.m823(r11)
            r0 = 0
            r11.m6540(r0)
            r11.m6542(r7)
            a52 r0 = new a52
            r0.<init>(r2, r4)
            r11.m6543(r0)
            androidx.appcompat.widget.ActionBarContextView r10 = r10.f10284
            x92 r10 = r10.m247(r1, r5)
            goto L75
        L54:
            b52 r2 = (p000.b52) r2
            androidx.appcompat.widget.Toolbar r11 = r2.f1484
            x92 r11 = p000.b92.m823(r11)
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.m6540(r0)
            r11.m6542(r5)
            a52 r0 = new a52
            r0.<init>(r2, r1)
            r11.m6543(r0)
            androidx.appcompat.widget.ActionBarContextView r10 = r10.f10284
            x92 r10 = r10.m247(r3, r7)
            r9 = r11
            r11 = r10
            r10 = r9
        L75:
            y92 r0 = new y92
            r0.<init>()
            java.util.ArrayList r1 = r0.f12504
            r1.add(r11)
            java.lang.ref.WeakReference r11 = r11.f12083
            java.lang.Object r11 = r11.get()
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L92
            android.view.ViewPropertyAnimator r11 = r11.animate()
            long r2 = r11.getDuration()
            goto L94
        L92:
            r2 = 0
        L94:
            java.lang.ref.WeakReference r11 = r10.f12083
            java.lang.Object r11 = r11.get()
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto La5
            android.view.ViewPropertyAnimator r11 = r11.animate()
            r11.setStartDelay(r2)
        La5:
            r1.add(r10)
            r0.m6842()
            return
        Lac:
            if (r11 == 0) goto Lbb
            b52 r2 = (p000.b52) r2
            androidx.appcompat.widget.Toolbar r11 = r2.f1484
            r11.setVisibility(r4)
            androidx.appcompat.widget.ActionBarContextView r10 = r10.f10284
            r10.setVisibility(r1)
            return
        Lbb:
            b52 r2 = (p000.b52) r2
            androidx.appcompat.widget.Toolbar r11 = r2.f1484
            r11.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r10 = r10.f10284
            r10.setVisibility(r3)
            return
    }

    /* JADX INFO: renamed from: β */
    public final android.content.Context m5624() {
            r4 = this;
            android.content.Context r0 = r4.f10280
            if (r0 != 0) goto L28
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.f10279
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 2130968586(0x7f04000a, float:1.754583E38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r0 = r0.resourceId
            if (r0 == 0) goto L24
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r4.f10279
            r1.<init>(r2, r0)
            r4.f10280 = r1
            goto L28
        L24:
            android.content.Context r0 = r4.f10279
            r4.f10280 = r0
        L28:
            android.content.Context r4 = r4.f10280
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public final void m5625(android.view.View r7) {
            r6 = this;
            r0 = 2131296507(0x7f0900fb, float:1.8210933E38)
            android.view.View r0 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r6.f10281 = r0
            if (r0 == 0) goto L10
            r0.setActionBarVisibilityCallback(r6)
        L10:
            r0 = 2131296295(0x7f090027, float:1.8210503E38)
            android.view.View r0 = r7.findViewById(r0)
            boolean r1 = r0 instanceof p000.InterfaceC1030yq
            if (r1 == 0) goto L1e
            yq r0 = (p000.InterfaceC1030yq) r0
            goto L28
        L1e:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto Lcf
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            yq r0 = r0.getWrapper()
        L28:
            r6.f10283 = r0
            r0 = 2131296303(0x7f09002f, float:1.8210519E38)
            android.view.View r0 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r6.f10284 = r0
            r0 = 2131296297(0x7f090029, float:1.8210507E38)
            android.view.View r7 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r7 = (androidx.appcompat.widget.ActionBarContainer) r7
            r6.f10282 = r7
            yq r0 = r6.f10283
            if (r0 == 0) goto Lbf
            androidx.appcompat.widget.ActionBarContextView r1 = r6.f10284
            if (r1 == 0) goto Lbf
            if (r7 == 0) goto Lbf
            b52 r0 = (p000.b52) r0
            androidx.appcompat.widget.Toolbar r7 = r0.f1484
            android.content.Context r7 = r7.getContext()
            r6.f10279 = r7
            yq r0 = r6.f10283
            b52 r0 = (p000.b52) r0
            int r0 = r0.f1485
            r0 = r0 & 4
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L62
            r0 = r1
            goto L63
        L62:
            r0 = r2
        L63:
            if (r0 == 0) goto L67
            r6.f10286 = r1
        L67:
            ｍ r7 = p000.C1143.m7359(r7)
            android.content.Context r7 = r7.f13489
            android.content.pm.ApplicationInfo r3 = r7.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            r4 = 14
            yq r0 = r6.f10283
            r0.getClass()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131034112(0x7f050000, float:1.7678732E38)
            boolean r7 = r7.getBoolean(r0)
            r6.m5627(r7)
            android.content.Context r7 = r6.f10279
            int[] r0 = p000.kk1.f5967
            r3 = 2130968581(0x7f040005, float:1.754582E38)
            r5 = 0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r5, r0, r3, r2)
            boolean r0 = r7.getBoolean(r4, r2)
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r6.f10281
            boolean r3 = r0.f503
            if (r3 == 0) goto La5
            r6.f10299 = r1
            r0.setHideOnContentScrollEnabled(r1)
            goto Lab
        La5:
            java.lang.String r6 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
            p000.C1080.m7279(r6)
            return
        Lab:
            r0 = 12
            int r0 = r7.getDimensionPixelSize(r0, r2)
            if (r0 == 0) goto Lbb
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r6 = r6.f10282
            java.util.WeakHashMap r1 = p000.b92.f1572
            p000.u82.m5826(r6, r0)
        Lbb:
            r7.recycle()
            return
        Lbf:
            java.lang.Class<tb2> r6 = p000.tb2.class
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r7 = " can only be used with a compatible window decor layout"
            java.lang.String r6 = r6.concat(r7)
            p000.C1080.m7279(r6)
            return
        Lcf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            if (r0 == 0) goto Ldc
            java.lang.Class r7 = r0.getClass()
            java.lang.String r7 = r7.getSimpleName()
            goto Lde
        Ldc:
            java.lang.String r7 = "null"
        Lde:
            java.lang.String r0 = "Can't make a decor toolbar out of "
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: δ */
    public final void m5626(boolean r5) {
            r4 = this;
            boolean r0 = r4.f10286
            if (r0 != 0) goto L1b
            r0 = 4
            if (r5 == 0) goto L9
            r5 = r0
            goto La
        L9:
            r5 = 0
        La:
            yq r1 = r4.f10283
            b52 r1 = (p000.b52) r1
            int r2 = r1.f1485
            r3 = 1
            r4.f10286 = r3
            r4 = r5 & 4
            r5 = r2 & (-5)
            r4 = r4 | r5
            r1.m744(r4)
        L1b:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m5627(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L10
            yq r2 = r1.f10283
            b52 r2 = (p000.b52) r2
            r2.getClass()
            androidx.appcompat.widget.ActionBarContainer r2 = r1.f10282
            r2.setTabContainer(r0)
            goto L1c
        L10:
            androidx.appcompat.widget.ActionBarContainer r2 = r1.f10282
            r2.setTabContainer(r0)
            yq r2 = r1.f10283
            b52 r2 = (p000.b52) r2
            r2.getClass()
        L1c:
            yq r2 = r1.f10283
            r2.getClass()
            yq r2 = r1.f10283
            b52 r2 = (p000.b52) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f1484
            r0 = 0
            r2.setCollapsible(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r1.f10281
            r1.setHasNonEmbeddedTabs(r0)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m5628(boolean r12) {
            r11 = this;
            boolean r0 = r11.f10294
            boolean r1 = r11.f10295
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L9
            goto Ld
        L9:
            if (r0 == 0) goto Ld
            r0 = r3
            goto Le
        Ld:
            r0 = r2
        Le:
            boolean r1 = r11.f10296
            r4 = 250(0xfa, double:1.235E-321)
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            y21 r8 = r11.f10302
            android.view.View r9 = r11.f10285
            if (r0 == 0) goto Ld5
            if (r1 != 0) goto L169
            r11.f10296 = r2
            y92 r0 = r11.f10297
            if (r0 == 0) goto L26
            r0.m6841()
        L26:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.f10282
            r0.setVisibility(r3)
            int r0 = r11.f10292
            rb2 r1 = r11.f10301
            r10 = 0
            if (r0 != 0) goto Lb5
            boolean r0 = r11.f10298
            if (r0 != 0) goto L38
            if (r12 == 0) goto Lb5
        L38:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.f10282
            r0.setTranslationY(r10)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.f10282
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r12 == 0) goto L54
            int[] r12 = new int[]{r3, r3}
            androidx.appcompat.widget.ActionBarContainer r3 = r11.f10282
            r3.getLocationInWindow(r12)
            r12 = r12[r2]
            float r12 = (float) r12
            float r0 = r0 - r12
        L54:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.f10282
            r12.setTranslationY(r0)
            y92 r12 = new y92
            r12.<init>()
            androidx.appcompat.widget.ActionBarContainer r2 = r11.f10282
            x92 r2 = p000.b92.m823(r2)
            r2.m6544(r10)
            java.lang.ref.WeakReference r3 = r2.f12083
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L7f
            if (r8 == 0) goto L78
            fg r6 = new fg
            r6.<init>(r8, r3)
        L78:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.setUpdateListener(r6)
        L7f:
            boolean r3 = r12.f12508
            java.util.ArrayList r6 = r12.f12504
            if (r3 != 0) goto L88
            r6.add(r2)
        L88:
            boolean r2 = r11.f10293
            if (r2 == 0) goto L9f
            if (r9 == 0) goto L9f
            r9.setTranslationY(r0)
            x92 r0 = p000.b92.m823(r9)
            r0.m6544(r10)
            boolean r2 = r12.f12508
            if (r2 != 0) goto L9f
            r6.add(r0)
        L9f:
            boolean r0 = r12.f12508
            if (r0 != 0) goto La7
            android.view.animation.DecelerateInterpolator r2 = p000.tb2.f10278
            r12.f12506 = r2
        La7:
            if (r0 != 0) goto Lab
            r12.f12505 = r4
        Lab:
            if (r0 != 0) goto Laf
            r12.f12507 = r1
        Laf:
            r11.f10297 = r12
            r12.m6842()
            goto Lcb
        Lb5:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.f10282
            r12.setAlpha(r7)
            androidx.appcompat.widget.ActionBarContainer r12 = r11.f10282
            r12.setTranslationY(r10)
            boolean r12 = r11.f10293
            if (r12 == 0) goto Lc8
            if (r9 == 0) goto Lc8
            r9.setTranslationY(r10)
        Lc8:
            r1.mo38()
        Lcb:
            androidx.appcompat.widget.ActionBarOverlayLayout r11 = r11.f10281
            if (r11 == 0) goto L169
            java.util.WeakHashMap r12 = p000.b92.f1572
            p000.s82.m5376(r11)
            return
        Ld5:
            if (r1 == 0) goto L169
            r11.f10296 = r3
            y92 r0 = r11.f10297
            if (r0 == 0) goto Le0
            r0.m6841()
        Le0:
            int r0 = r11.f10292
            rb2 r1 = r11.f10300
            if (r0 != 0) goto L166
            boolean r0 = r11.f10298
            if (r0 != 0) goto Lec
            if (r12 == 0) goto L166
        Lec:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.f10282
            r0.setAlpha(r7)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.f10282
            r0.setTransitioning(r2)
            y92 r0 = new y92
            r0.<init>()
            androidx.appcompat.widget.ActionBarContainer r7 = r11.f10282
            int r7 = r7.getHeight()
            int r7 = -r7
            float r7 = (float) r7
            if (r12 == 0) goto L112
            int[] r12 = new int[]{r3, r3}
            androidx.appcompat.widget.ActionBarContainer r3 = r11.f10282
            r3.getLocationInWindow(r12)
            r12 = r12[r2]
            float r12 = (float) r12
            float r7 = r7 - r12
        L112:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.f10282
            x92 r12 = p000.b92.m823(r12)
            r12.m6544(r7)
            java.lang.ref.WeakReference r2 = r12.f12083
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L133
            if (r8 == 0) goto L12c
            fg r6 = new fg
            r6.<init>(r8, r2)
        L12c:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r2.setUpdateListener(r6)
        L133:
            boolean r2 = r0.f12508
            java.util.ArrayList r3 = r0.f12504
            if (r2 != 0) goto L13c
            r3.add(r12)
        L13c:
            boolean r12 = r11.f10293
            if (r12 == 0) goto L150
            if (r9 == 0) goto L150
            x92 r12 = p000.b92.m823(r9)
            r12.m6544(r7)
            boolean r2 = r0.f12508
            if (r2 != 0) goto L150
            r3.add(r12)
        L150:
            boolean r12 = r0.f12508
            if (r12 != 0) goto L158
            android.view.animation.AccelerateInterpolator r2 = p000.tb2.f10277
            r0.f12506 = r2
        L158:
            if (r12 != 0) goto L15c
            r0.f12505 = r4
        L15c:
            if (r12 != 0) goto L160
            r0.f12507 = r1
        L160:
            r11.f10297 = r0
            r0.m6842()
            return
        L166:
            r1.mo38()
        L169:
            return
    }
}
