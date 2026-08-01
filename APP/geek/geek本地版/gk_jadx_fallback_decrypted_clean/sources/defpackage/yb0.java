package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 extends defpackage.a80 implements defpackage.a1 {
    public static final android.view.animation.AccelerateInterpolator U = null;
    public static final android.view.animation.DecelerateInterpolator V = null;
    public defpackage.hf A;
    public androidx.appcompat.widget.ActionBarContextView B;
    public final android.view.View C;
    public boolean D;
    public defpackage.xb0 E;
    public defpackage.xb0 F;
    public defpackage.d4 G;
    public boolean H;
    public final java.util.ArrayList I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public defpackage.xa0 O;
    public boolean P;
    public boolean Q;
    public final defpackage.wb0 R;
    public final defpackage.wb0 S;
    public final defpackage.l0 T;
    public android.content.Context w;
    public android.content.Context x;
    public androidx.appcompat.widget.ActionBarOverlayLayout y;
    public androidx.appcompat.widget.ActionBarContainer z;

    static {
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            defpackage.yb0.U = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            defpackage.yb0.V = r0
            return
    }

    public yb0(android.app.Activity r3, boolean r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.I = r0
            r0 = 0
            r2.J = r0
            r0 = 1
            r2.K = r0
            r2.N = r0
            wb0 r0 = new wb0
            r1 = 0
            r0.<init>(r2, r1)
            r2.R = r0
            wb0 r0 = new wb0
            r1 = 1
            r0.<init>(r2, r1)
            r2.S = r0
            l0 r0 = new l0
            r1 = 29
            r0.<init>(r1, r2)
            r2.T = r0
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r2.M(r3)
            if (r4 != 0) goto L46
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)
            r2.C = r3
        L46:
            return
    }

    public yb0(android.app.Dialog r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.I = r0
            r0 = 0
            r2.J = r0
            r0 = 1
            r2.K = r0
            r2.N = r0
            wb0 r0 = new wb0
            r1 = 0
            r0.<init>(r2, r1)
            r2.R = r0
            wb0 r0 = new wb0
            r1 = 1
            r0.<init>(r2, r1)
            r2.S = r0
            l0 r0 = new l0
            r1 = 29
            r0.<init>(r1, r2)
            r2.T = r0
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r2.M(r3)
            return
    }

    public final void K(boolean r10) {
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L15
            boolean r1 = r9.M
            if (r1 != 0) goto L25
            r1 = 1
            r9.M = r1
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r9.y
            if (r2 == 0) goto L11
            r2.setShowingForActionMode(r1)
        L11:
            r9.P(r0)
            goto L25
        L15:
            boolean r1 = r9.M
            if (r1 == 0) goto L25
            r9.M = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r9.y
            if (r1 == 0) goto L22
            r1.setShowingForActionMode(r0)
        L22:
            r9.P(r0)
        L25:
            androidx.appcompat.widget.ActionBarContainer r1 = r9.z
            java.util.WeakHashMap r2 = defpackage.ja0.a
            boolean r1 = defpackage.v90.c(r1)
            r2 = 8
            r3 = 4
            if (r1 == 0) goto Lb2
            r4 = 200(0xc8, double:9.9E-322)
            r6 = 100
            if (r10 == 0) goto L58
            hf r10 = r9.A
            k70 r10 = (defpackage.k70) r10
            androidx.appcompat.widget.Toolbar r1 = r10.a
            wa0 r1 = defpackage.ja0.a(r1)
            r2 = 0
            r1.a(r2)
            r1.c(r6)
            j70 r2 = new j70
            r2.<init>(r10, r3)
            r1.d(r2)
            androidx.appcompat.widget.ActionBarContextView r10 = r9.B
            wa0 r10 = r10.i(r0, r4)
            goto L7b
        L58:
            hf r10 = r9.A
            k70 r10 = (defpackage.k70) r10
            androidx.appcompat.widget.Toolbar r1 = r10.a
            wa0 r1 = defpackage.ja0.a(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.a(r3)
            r1.c(r4)
            j70 r3 = new j70
            r3.<init>(r10, r0)
            r1.d(r3)
            androidx.appcompat.widget.ActionBarContextView r10 = r9.B
            wa0 r10 = r10.i(r2, r6)
            r8 = r1
            r1 = r10
            r10 = r8
        L7b:
            xa0 r0 = new xa0
            r0.<init>()
            java.util.ArrayList r2 = r0.a
            r2.add(r1)
            java.lang.ref.WeakReference r1 = r1.a
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L98
            android.view.ViewPropertyAnimator r1 = r1.animate()
            long r3 = r1.getDuration()
            goto L9a
        L98:
            r3 = 0
        L9a:
            java.lang.ref.WeakReference r1 = r10.a
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Lab
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.setStartDelay(r3)
        Lab:
            r2.add(r10)
            r0.b()
            return
        Lb2:
            if (r10 == 0) goto Lc3
            hf r10 = r9.A
            k70 r10 = (defpackage.k70) r10
            androidx.appcompat.widget.Toolbar r10 = r10.a
            r10.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r10 = r9.B
            r10.setVisibility(r0)
            return
        Lc3:
            hf r10 = r9.A
            k70 r10 = (defpackage.k70) r10
            androidx.appcompat.widget.Toolbar r10 = r10.a
            r10.setVisibility(r0)
            androidx.appcompat.widget.ActionBarContextView r10 = r9.B
            r10.setVisibility(r2)
            return
    }

    public final android.content.Context L() {
            r4 = this;
            android.content.Context r0 = r4.x
            if (r0 != 0) goto L28
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.w
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 2130968586(0x7f04000a, float:1.754583E38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r0 = r0.resourceId
            if (r0 == 0) goto L24
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r4.w
            r1.<init>(r2, r0)
            r4.x = r1
            goto L28
        L24:
            android.content.Context r0 = r4.w
            r4.x = r0
        L28:
            android.content.Context r0 = r4.x
            return r0
    }

    public final void M(android.view.View r7) {
            r6 = this;
            r0 = 2131296378(0x7f09007a, float:1.821067E38)
            android.view.View r0 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r6.y = r0
            if (r0 == 0) goto L10
            r0.setActionBarVisibilityCallback(r6)
        L10:
            r0 = 2131296304(0x7f090030, float:1.821052E38)
            android.view.View r0 = r7.findViewById(r0)
            boolean r1 = r0 instanceof defpackage.hf
            if (r1 == 0) goto L1e
            hf r0 = (defpackage.hf) r0
            goto L28
        L1e:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto Lcd
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            hf r0 = r0.getWrapper()
        L28:
            r6.A = r0
            r0 = 2131296312(0x7f090038, float:1.8210537E38)
            android.view.View r0 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r6.B = r0
            r0 = 2131296306(0x7f090032, float:1.8210525E38)
            android.view.View r7 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r7 = (androidx.appcompat.widget.ActionBarContainer) r7
            r6.z = r7
            hf r0 = r6.A
            if (r0 == 0) goto Lbb
            androidx.appcompat.widget.ActionBarContextView r1 = r6.B
            if (r1 == 0) goto Lbb
            if (r7 == 0) goto Lbb
            k70 r0 = (defpackage.k70) r0
            androidx.appcompat.widget.Toolbar r7 = r0.a
            android.content.Context r7 = r7.getContext()
            r6.w = r7
            hf r0 = r6.A
            k70 r0 = (defpackage.k70) r0
            int r0 = r0.b
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
            r6.D = r1
        L67:
            android.content.pm.ApplicationInfo r3 = r7.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            r4 = 14
            hf r0 = r6.A
            r0.getClass()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131034112(0x7f050000, float:1.7678732E38)
            boolean r7 = r7.getBoolean(r0)
            r6.O(r7)
            android.content.Context r7 = r6.w
            int[] r0 = defpackage.xy.a
            r3 = 2130968581(0x7f040005, float:1.754582E38)
            r5 = 0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r5, r0, r3, r2)
            boolean r0 = r7.getBoolean(r4, r2)
            if (r0 == 0) goto La7
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r6.y
            boolean r3 = r0.h
            if (r3 == 0) goto L9f
            r6.Q = r1
            r0.setHideOnContentScrollEnabled(r1)
            goto La7
        L9f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
            r7.<init>(r0)
            throw r7
        La7:
            r0 = 12
            int r0 = r7.getDimensionPixelSize(r0, r2)
            if (r0 == 0) goto Lb7
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r6.z
            java.util.WeakHashMap r2 = defpackage.ja0.a
            defpackage.y90.s(r1, r0)
        Lb7:
            r7.recycle()
            return
        Lbb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.Class<yb0> r0 = defpackage.yb0.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = " can only be used with a compatible window decor layout"
            java.lang.String r0 = r0.concat(r1)
            r7.<init>(r0)
            throw r7
        Lcd:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            if (r0 == 0) goto Lda
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            goto Ldc
        Lda:
            java.lang.String r0 = "null"
        Ldc:
            java.lang.String r1 = "Can't make a decor toolbar out of "
            java.lang.String r0 = r1.concat(r0)
            r7.<init>(r0)
            throw r7
    }

    public final void N(boolean r5) {
            r4 = this;
            boolean r0 = r4.D
            if (r0 != 0) goto L1a
            r0 = 4
            if (r5 == 0) goto L9
            r5 = r0
            goto La
        L9:
            r5 = 0
        La:
            hf r1 = r4.A
            k70 r1 = (defpackage.k70) r1
            int r2 = r1.b
            r3 = 1
            r4.D = r3
            r5 = r5 & r0
            r0 = r2 & (-5)
            r5 = r5 | r0
            r1.a(r5)
        L1a:
            return
    }

    public final void O(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L10
            hf r2 = r1.A
            k70 r2 = (defpackage.k70) r2
            r2.getClass()
            androidx.appcompat.widget.ActionBarContainer r2 = r1.z
            r2.setTabContainer(r0)
            goto L1c
        L10:
            androidx.appcompat.widget.ActionBarContainer r2 = r1.z
            r2.setTabContainer(r0)
            hf r2 = r1.A
            k70 r2 = (defpackage.k70) r2
            r2.getClass()
        L1c:
            hf r2 = r1.A
            r2.getClass()
            hf r2 = r1.A
            k70 r2 = (defpackage.k70) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            r0 = 0
            r2.setCollapsible(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.y
            r2.setHasNonEmbeddedTabs(r0)
            return
    }

    public final void P(boolean r12) {
            r11 = this;
            boolean r0 = r11.L
            boolean r1 = r11.M
            r2 = 250(0xfa, double:1.235E-321)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            l0 r6 = r11.T
            android.view.View r7 = r11.C
            r8 = 1
            r9 = 0
            if (r1 == 0) goto L13
            goto Lac
        L13:
            if (r0 == 0) goto Lac
            boolean r0 = r11.N
            if (r0 == 0) goto L167
            r11.N = r9
            xa0 r0 = r11.O
            if (r0 == 0) goto L22
            r0.a()
        L22:
            int r0 = r11.J
            wb0 r1 = r11.R
            if (r0 != 0) goto La8
            boolean r0 = r11.P
            if (r0 != 0) goto L2e
            if (r12 == 0) goto La8
        L2e:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.z
            r0.setAlpha(r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.z
            r0.setTransitioning(r8)
            xa0 r0 = new xa0
            r0.<init>()
            androidx.appcompat.widget.ActionBarContainer r5 = r11.z
            int r5 = r5.getHeight()
            int r5 = -r5
            float r5 = (float) r5
            if (r12 == 0) goto L54
            int[] r12 = new int[]{r9, r9}
            androidx.appcompat.widget.ActionBarContainer r9 = r11.z
            r9.getLocationInWindow(r12)
            r12 = r12[r8]
            float r12 = (float) r12
            float r5 = r5 - r12
        L54:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.z
            wa0 r12 = defpackage.ja0.a(r12)
            r12.e(r5)
            java.lang.ref.WeakReference r8 = r12.a
            java.lang.Object r8 = r8.get()
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L75
            if (r6 == 0) goto L6e
            lh r4 = new lh
            r4.<init>(r6, r8)
        L6e:
            android.view.ViewPropertyAnimator r6 = r8.animate()
            defpackage.va0.a(r6, r4)
        L75:
            boolean r4 = r0.e
            java.util.ArrayList r6 = r0.a
            if (r4 != 0) goto L7e
            r6.add(r12)
        L7e:
            boolean r12 = r11.K
            if (r12 == 0) goto L92
            if (r7 == 0) goto L92
            wa0 r12 = defpackage.ja0.a(r7)
            r12.e(r5)
            boolean r4 = r0.e
            if (r4 != 0) goto L92
            r6.add(r12)
        L92:
            boolean r12 = r0.e
            if (r12 != 0) goto L9a
            android.view.animation.AccelerateInterpolator r4 = defpackage.yb0.U
            r0.c = r4
        L9a:
            if (r12 != 0) goto L9e
            r0.b = r2
        L9e:
            if (r12 != 0) goto La2
            r0.d = r1
        La2:
            r11.O = r0
            r0.b()
            return
        La8:
            r1.a()
            return
        Lac:
            boolean r0 = r11.N
            if (r0 != 0) goto L167
            r11.N = r8
            xa0 r0 = r11.O
            if (r0 == 0) goto Lb9
            r0.a()
        Lb9:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.z
            r0.setVisibility(r9)
            int r0 = r11.J
            wb0 r1 = r11.S
            r10 = 0
            if (r0 != 0) goto L148
            boolean r0 = r11.P
            if (r0 != 0) goto Lcb
            if (r12 == 0) goto L148
        Lcb:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.z
            r0.setTranslationY(r10)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.z
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r12 == 0) goto Le7
            int[] r12 = new int[]{r9, r9}
            androidx.appcompat.widget.ActionBarContainer r5 = r11.z
            r5.getLocationInWindow(r12)
            r12 = r12[r8]
            float r12 = (float) r12
            float r0 = r0 - r12
        Le7:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.z
            r12.setTranslationY(r0)
            xa0 r12 = new xa0
            r12.<init>()
            androidx.appcompat.widget.ActionBarContainer r5 = r11.z
            wa0 r5 = defpackage.ja0.a(r5)
            r5.e(r10)
            java.lang.ref.WeakReference r8 = r5.a
            java.lang.Object r8 = r8.get()
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L112
            if (r6 == 0) goto L10b
            lh r4 = new lh
            r4.<init>(r6, r8)
        L10b:
            android.view.ViewPropertyAnimator r6 = r8.animate()
            defpackage.va0.a(r6, r4)
        L112:
            boolean r4 = r12.e
            java.util.ArrayList r6 = r12.a
            if (r4 != 0) goto L11b
            r6.add(r5)
        L11b:
            boolean r4 = r11.K
            if (r4 == 0) goto L132
            if (r7 == 0) goto L132
            r7.setTranslationY(r0)
            wa0 r0 = defpackage.ja0.a(r7)
            r0.e(r10)
            boolean r4 = r12.e
            if (r4 != 0) goto L132
            r6.add(r0)
        L132:
            boolean r0 = r12.e
            if (r0 != 0) goto L13a
            android.view.animation.DecelerateInterpolator r4 = defpackage.yb0.V
            r12.c = r4
        L13a:
            if (r0 != 0) goto L13e
            r12.b = r2
        L13e:
            if (r0 != 0) goto L142
            r12.d = r1
        L142:
            r11.O = r12
            r12.b()
            goto L15e
        L148:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.z
            r12.setAlpha(r5)
            androidx.appcompat.widget.ActionBarContainer r12 = r11.z
            r12.setTranslationY(r10)
            boolean r12 = r11.K
            if (r12 == 0) goto L15b
            if (r7 == 0) goto L15b
            r7.setTranslationY(r10)
        L15b:
            r1.a()
        L15e:
            androidx.appcompat.widget.ActionBarOverlayLayout r12 = r11.y
            if (r12 == 0) goto L167
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.w90.c(r12)
        L167:
            return
    }
}
