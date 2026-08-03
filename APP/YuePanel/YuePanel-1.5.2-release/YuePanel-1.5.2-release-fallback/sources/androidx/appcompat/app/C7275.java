package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7275 implements Yue.C2019.InterfaceC2024 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.appcompat.app.C7275.InterfaceC7277 f25111;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C2019 f25112;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C2017 f25113;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f25114;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25115;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f25116;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f25117;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int f25118;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int f25119;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public android.view.View.OnClickListener f25120;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f25121;

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ, reason: contains not printable characters */
    public class ViewOnClickListenerC7276 implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.app.C7275 f25122;

        public ViewOnClickListenerC7276(androidx.appcompat.app.C7275 r1) {
                r0 = this;
                r0.f25122 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.app.ۥ۟ r0 = r2.f25122
                boolean r1 = r0.f25116
                if (r1 == 0) goto La
                r0.m27936()
                goto L11
            La:
                android.view.View$OnClickListener r0 = r0.f25120
                if (r0 == 0) goto L11
                r0.onClick(r3)
            L11:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC7277 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        boolean mo27937();

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        android.content.Context mo27938();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void mo27939(android.graphics.drawable.Drawable r1, @Yue.InterfaceC5971 int r2);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        android.graphics.drawable.Drawable mo27940();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        void mo27941(@Yue.InterfaceC5971 int r1);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC7278 {
        @Yue.InterfaceC4544
        androidx.appcompat.app.C7275.InterfaceC7277 getDrawerToggleDelegate();
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7279 implements androidx.appcompat.app.C7275.InterfaceC7277 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.app.Activity f25123;

        public C7279(android.app.Activity r1) {
                r0 = this;
                r0.<init>()
                r0.f25123 = r1
                return
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ */
        public boolean mo27937() {
                r1 = this;
                android.app.Activity r0 = r1.f25123
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto L12
                int r0 = r0.getDisplayOptions()
                r0 = r0 & 4
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ۟ */
        public android.content.Context mo27938() {
                r1 = this;
                android.app.Activity r0 = r1.f25123
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto Ld
                android.content.Context r0 = r0.getThemedContext()
                return r0
            Ld:
                android.app.Activity r0 = r1.f25123
                return r0
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo27939(android.graphics.drawable.Drawable r2, int r3) {
                r1 = this;
                android.app.Activity r0 = r1.f25123
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto Le
                r0.setHomeAsUpIndicator(r2)
                r0.setHomeActionContentDescription(r3)
            Le:
                return
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public android.graphics.drawable.Drawable mo27940() {
                r5 = this;
                android.content.Context r0 = r5.mo27938()
                r1 = 16843531(0x101030b, float:2.369574E-38)
                int[] r1 = new int[]{r1}
                r2 = 0
                r3 = 16843470(0x10102ce, float:2.369557E-38)
                r4 = 0
                android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2, r1, r3, r4)
                android.graphics.drawable.Drawable r1 = r0.getDrawable(r4)
                r0.recycle()
                return r1
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo27941(int r2) {
                r1 = this;
                android.app.Activity r0 = r1.f25123
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto Lb
                r0.setHomeActionContentDescription(r2)
            Lb:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7280 implements androidx.appcompat.app.C7275.InterfaceC7277 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.appcompat.widget.Toolbar f25124;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.graphics.drawable.Drawable f25125;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.CharSequence f25126;

        public C7280(androidx.appcompat.widget.Toolbar r2) {
                r1 = this;
                r1.<init>()
                r1.f25124 = r2
                android.graphics.drawable.Drawable r0 = r2.getNavigationIcon()
                r1.f25125 = r0
                java.lang.CharSequence r2 = r2.getNavigationContentDescription()
                r1.f25126 = r2
                return
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ */
        public boolean mo27937() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ۟ */
        public android.content.Context mo27938() {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f25124
                android.content.Context r0 = r0.getContext()
                return r0
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo27939(android.graphics.drawable.Drawable r2, @Yue.InterfaceC5971 int r3) {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.f25124
                r0.setNavigationIcon(r2)
                r1.mo27941(r3)
                return
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public android.graphics.drawable.Drawable mo27940() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f25125
                return r0
        }

        @Override // androidx.appcompat.app.C7275.InterfaceC7277
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo27941(@Yue.InterfaceC5971 int r2) {
                r1 = this;
                if (r2 != 0) goto La
                androidx.appcompat.widget.Toolbar r2 = r1.f25124
                java.lang.CharSequence r0 = r1.f25126
                r2.setNavigationContentDescription(r0)
                goto Lf
            La:
                androidx.appcompat.widget.Toolbar r0 = r1.f25124
                r0.setNavigationContentDescription(r2)
            Lf:
                return
        }
    }

    public C7275(android.app.Activity r8, Yue.C2019 r9, @Yue.InterfaceC5971 int r10, @Yue.InterfaceC5971 int r11) {
            r7 = this;
            r2 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C7275(android.app.Activity r8, Yue.C2019 r9, androidx.appcompat.widget.Toolbar r10, @Yue.InterfaceC5971 int r11, @Yue.InterfaceC5971 int r12) {
            r7 = this;
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r9
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C7275(android.app.Activity r2, androidx.appcompat.widget.Toolbar r3, Yue.C2019 r4, Yue.C2017 r5, @Yue.InterfaceC5971 int r6, @Yue.InterfaceC5971 int r7) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f25114 = r0
            r1.f25116 = r0
            r0 = 0
            r1.f25121 = r0
            if (r3 == 0) goto L1d
            androidx.appcompat.app.ۥ۟$ۥ۟۟۟۟ r2 = new androidx.appcompat.app.ۥ۟$ۥ۟۟۟۟
            r2.<init>(r3)
            r1.f25111 = r2
            androidx.appcompat.app.ۥ۟$ۥ r2 = new androidx.appcompat.app.ۥ۟$ۥ
            r2.<init>(r1)
            r3.setNavigationOnClickListener(r2)
            goto L31
        L1d:
            boolean r3 = r2 instanceof androidx.appcompat.app.C7275.InterfaceC7278
            if (r3 == 0) goto L2a
            androidx.appcompat.app.ۥ۟$ۥ۟۟ r2 = (androidx.appcompat.app.C7275.InterfaceC7278) r2
            androidx.appcompat.app.ۥ۟$ۥ۟ r2 = r2.getDrawerToggleDelegate()
            r1.f25111 = r2
            goto L31
        L2a:
            androidx.appcompat.app.ۥ۟$ۥ۟۟۟ r3 = new androidx.appcompat.app.ۥ۟$ۥ۟۟۟
            r3.<init>(r2)
            r1.f25111 = r3
        L31:
            r1.f25112 = r4
            r1.f25118 = r6
            r1.f25119 = r7
            if (r5 != 0) goto L47
            Yue.ۥ۠۠ۡۨ r2 = new Yue.ۥ۠۠ۡۨ
            androidx.appcompat.app.ۥ۟$ۥ۟ r3 = r1.f25111
            android.content.Context r3 = r3.mo27938()
            r2.<init>(r3)
            r1.f25113 = r2
            goto L49
        L47:
            r1.f25113 = r5
        L49:
            android.graphics.drawable.Drawable r2 = r1.m27920()
            r1.f25115 = r2
            return
    }

    @Override // Yue.C2019.InterfaceC2024
    public void onDrawerClosed(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.m27933(r1)
            boolean r1 = r0.f25116
            if (r1 == 0) goto Ld
            int r1 = r0.f25118
            r0.m27926(r1)
        Ld:
            return
    }

    @Override // Yue.C2019.InterfaceC2024
    public void onDrawerOpened(android.view.View r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.m27933(r1)
            boolean r1 = r0.f25116
            if (r1 == 0) goto Le
            int r1 = r0.f25119
            r0.m27926(r1)
        Le:
            return
    }

    @Override // Yue.C2019.InterfaceC2024
    public void onDrawerSlide(android.view.View r2, float r3) {
            r1 = this;
            boolean r2 = r1.f25114
            r0 = 0
            if (r2 == 0) goto L13
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.max(r0, r3)
            float r2 = java.lang.Math.min(r2, r3)
            r1.m27933(r2)
            goto L16
        L13:
            r1.m27933(r0)
        L16:
            return
    }

    @Override // Yue.C2019.InterfaceC2024
    public void onDrawerStateChanged(int r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C2017 m27919() {
            r1 = this;
            Yue.ۥ۠۠ۡۨ r0 = r1.f25113
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.graphics.drawable.Drawable m27920() {
            r1 = this;
            androidx.appcompat.app.ۥ۟$ۥ۟ r0 = r1.f25111
            android.graphics.drawable.Drawable r0 = r0.mo27940()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.view.View.OnClickListener m27921() {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.f25120
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m27922() {
            r1 = this;
            boolean r0 = r1.f25116
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m27923() {
            r1 = this;
            boolean r0 = r1.f25114
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m27924(android.content.res.Configuration r1) {
            r0 = this;
            boolean r1 = r0.f25117
            if (r1 != 0) goto La
            android.graphics.drawable.Drawable r1 = r0.m27920()
            r0.f25115 = r1
        La:
            r0.m27935()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m27925(android.view.MenuItem r2) {
            r1 = this;
            if (r2 == 0) goto L14
            int r2 = r2.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r2 != r0) goto L14
            boolean r2 = r1.f25116
            if (r2 == 0) goto L14
            r1.m27936()
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m27926(int r2) {
            r1 = this;
            androidx.appcompat.app.ۥ۟$ۥ۟ r0 = r1.f25111
            r0.mo27941(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m27927(android.graphics.drawable.Drawable r3, int r4) {
            r2 = this;
            boolean r0 = r2.f25121
            if (r0 != 0) goto L16
            androidx.appcompat.app.ۥ۟$ۥ۟ r0 = r2.f25111
            boolean r0 = r0.mo27937()
            if (r0 != 0) goto L16
            java.lang.String r0 = "ActionBarDrawerToggle"
            java.lang.String r1 = "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);"
            android.util.Log.w(r0, r1)
            r0 = 1
            r2.f25121 = r0
        L16:
            androidx.appcompat.app.ۥ۟$ۥ۟ r0 = r2.f25111
            r0.mo27939(r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m27928(@Yue.InterfaceC4410 Yue.C2017 r1) {
            r0 = this;
            r0.f25113 = r1
            r0.m27935()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m27929(boolean r4) {
            r3 = this;
            boolean r0 = r3.f25116
            if (r4 == r0) goto L24
            if (r4 == 0) goto L1c
            Yue.ۥ۠۠ۡۨ r0 = r3.f25113
            Yue.ۥ۠۠ۢ r1 = r3.f25112
            r2 = 8388611(0x800003, float:1.1754948E-38)
            boolean r1 = r1.m9360(r2)
            if (r1 == 0) goto L16
            int r1 = r3.f25119
            goto L18
        L16:
            int r1 = r3.f25118
        L18:
            r3.m27927(r0, r1)
            goto L22
        L1c:
            android.graphics.drawable.Drawable r0 = r3.f25115
            r1 = 0
            r3.m27927(r0, r1)
        L22:
            r3.f25116 = r4
        L24:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m27930(boolean r1) {
            r0 = this;
            r0.f25114 = r1
            if (r1 != 0) goto L8
            r1 = 0
            r0.m27933(r1)
        L8:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m27931(int r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            Yue.ۥ۠۠ۢ r0 = r1.f25112
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            goto Le
        Ld:
            r2 = 0
        Le:
            r1.m27932(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m27932(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto Lc
            android.graphics.drawable.Drawable r2 = r1.m27920()
            r1.f25115 = r2
            r1.f25117 = r0
            goto L11
        Lc:
            r1.f25115 = r2
            r2 = 1
            r1.f25117 = r2
        L11:
            boolean r2 = r1.f25116
            if (r2 != 0) goto L1a
            android.graphics.drawable.Drawable r2 = r1.f25115
            r1.m27927(r2, r0)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m27933(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            Yue.ۥ۠۠ۡۨ r0 = r2.f25113
            r1 = 1
            r0.m9331(r1)
            goto L18
        Ld:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L18
            Yue.ۥ۠۠ۡۨ r0 = r2.f25113
            r1 = 0
            r0.m9331(r1)
        L18:
            Yue.ۥ۠۠ۡۨ r0 = r2.f25113
            r0.m9329(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m27934(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.f25120 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m27935() {
            r3 = this;
            Yue.ۥ۠۠ۢ r0 = r3.f25112
            r1 = 8388611(0x800003, float:1.1754948E-38)
            boolean r0 = r0.m9360(r1)
            if (r0 == 0) goto L11
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.m27933(r0)
            goto L15
        L11:
            r0 = 0
            r3.m27933(r0)
        L15:
            boolean r0 = r3.f25116
            if (r0 == 0) goto L2b
            Yue.ۥ۠۠ۡۨ r0 = r3.f25113
            Yue.ۥ۠۠ۢ r2 = r3.f25112
            boolean r1 = r2.m9360(r1)
            if (r1 == 0) goto L26
            int r1 = r3.f25119
            goto L28
        L26:
            int r1 = r3.f25118
        L28:
            r3.m27927(r0, r1)
        L2b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m27936() {
            r3 = this;
            Yue.ۥ۠۠ۢ r0 = r3.f25112
            r1 = 8388611(0x800003, float:1.1754948E-38)
            int r0 = r0.m9351(r1)
            Yue.ۥ۠۠ۢ r2 = r3.f25112
            boolean r2 = r2.m9363(r1)
            if (r2 == 0) goto L1a
            r2 = 2
            if (r0 == r2) goto L1a
            Yue.ۥ۠۠ۢ r0 = r3.f25112
            r0.m9338(r1)
            goto L22
        L1a:
            r2 = 1
            if (r0 == r2) goto L22
            Yue.ۥ۠۠ۢ r0 = r3.f25112
            r0.m9368(r1)
        L22:
            return
    }
}
