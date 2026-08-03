package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7318 extends androidx.appcompat.app.AbstractC7267 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC1763 f25266;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final android.view.Window.Callback f25267;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final androidx.appcompat.app.LayoutInflaterFactory2C7289.InterfaceC7299 f25268;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f25269;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean f25270;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean f25271;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public java.util.ArrayList<androidx.appcompat.app.AbstractC7267.InterfaceC7271> f25272;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final java.lang.Runnable f25273;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final androidx.appcompat.widget.Toolbar.InterfaceC7407 f25274;

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ, reason: contains not printable characters */
    public class RunnableC7319 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.app.C7318 f25275;

        public RunnableC7319(androidx.appcompat.app.C7318 r1) {
                r0 = this;
                r0.f25275 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.app.ۥ۟۟۟ۡ r0 = r1.f25275
                r0.m28131()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟, reason: contains not printable characters */
    public class C7320 implements androidx.appcompat.widget.Toolbar.InterfaceC7407 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.app.C7318 f25276;

        public C7320(androidx.appcompat.app.C7318 r1) {
                r0 = this;
                r0.f25276 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC7407
        public boolean onMenuItemClick(android.view.MenuItem r3) {
                r2 = this;
                androidx.appcompat.app.ۥ۟۟۟ۡ r0 = r2.f25276
                android.view.Window$Callback r0 = r0.f25267
                r1 = 0
                boolean r3 = r0.onMenuItemSelected(r1, r3)
                return r3
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟, reason: contains not printable characters */
    public final class C7321 implements androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f25277;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.app.C7318 f25278;

        public C7321(androidx.appcompat.app.C7318 r1) {
                r0 = this;
                r0.f25278 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353
        public void onCloseMenu(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2, boolean r3) {
                r1 = this;
                boolean r3 = r1.f25277
                if (r3 == 0) goto L5
                return
            L5:
                r3 = 1
                r1.f25277 = r3
                androidx.appcompat.app.ۥ۟۟۟ۡ r3 = r1.f25278
                Yue.ۥ۟ۨۤۨ r3 = r3.f25266
                r3.mo8391()
                androidx.appcompat.app.ۥ۟۟۟ۡ r3 = r1.f25278
                android.view.Window$Callback r3 = r3.f25267
                r0 = 108(0x6c, float:1.51E-43)
                r3.onPanelClosed(r0, r2)
                r2 = 0
                r1.f25277 = r2
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353
        /* JADX INFO: renamed from: ۥ */
        public boolean mo28095(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r3) {
                r2 = this;
                androidx.appcompat.app.ۥ۟۟۟ۡ r0 = r2.f25278
                android.view.Window$Callback r0 = r0.f25267
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
                r3 = 1
                return r3
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C7322 implements androidx.appcompat.view.menu.C7343.InterfaceC7344 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.app.C7318 f25279;

        public C7322(androidx.appcompat.app.C7318 r1) {
                r0 = this;
                r0.f25279 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.C7343.InterfaceC7344
        public boolean onMenuItemSelected(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r1, @Yue.InterfaceC4410 android.view.MenuItem r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.C7343.InterfaceC7344
        public void onMenuModeChange(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r5) {
                r4 = this;
                androidx.appcompat.app.ۥ۟۟۟ۡ r0 = r4.f25279
                Yue.ۥ۟ۨۤۨ r0 = r0.f25266
                boolean r0 = r0.mo8382()
                r1 = 108(0x6c, float:1.51E-43)
                if (r0 == 0) goto L14
                androidx.appcompat.app.ۥ۟۟۟ۡ r0 = r4.f25279
                android.view.Window$Callback r0 = r0.f25267
                r0.onPanelClosed(r1, r5)
                goto L27
            L14:
                androidx.appcompat.app.ۥ۟۟۟ۡ r0 = r4.f25279
                android.view.Window$Callback r0 = r0.f25267
                r2 = 0
                r3 = 0
                boolean r0 = r0.onPreparePanel(r2, r3, r5)
                if (r0 == 0) goto L27
                androidx.appcompat.app.ۥ۟۟۟ۡ r0 = r4.f25279
                android.view.Window$Callback r0 = r0.f25267
                r0.onMenuOpened(r1, r5)
            L27:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C7323 implements androidx.appcompat.app.LayoutInflaterFactory2C7289.InterfaceC7299 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.app.C7318 f25280;

        public C7323(androidx.appcompat.app.C7318 r1) {
                r0 = this;
                r0.f25280 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C7289.InterfaceC7299
        public android.view.View onCreatePanelView(int r2) {
                r1 = this;
                if (r2 != 0) goto L10
                android.view.View r2 = new android.view.View
                androidx.appcompat.app.ۥ۟۟۟ۡ r0 = r1.f25280
                Yue.ۥ۟ۨۤۨ r0 = r0.f25266
                android.content.Context r0 = r0.getContext()
                r2.<init>(r0)
                return r2
            L10:
                r2 = 0
                return r2
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C7289.InterfaceC7299
        /* JADX INFO: renamed from: ۥ */
        public boolean mo28094(int r2) {
                r1 = this;
                if (r2 != 0) goto L12
                androidx.appcompat.app.ۥ۟۟۟ۡ r2 = r1.f25280
                boolean r0 = r2.f25269
                if (r0 != 0) goto L12
                Yue.ۥ۟ۨۤۨ r2 = r2.f25266
                r2.mo8383()
                androidx.appcompat.app.ۥ۟۟۟ۡ r2 = r1.f25280
                r0 = 1
                r2.f25269 = r0
            L12:
                r2 = 0
                return r2
        }
    }

    public C7318(@Yue.InterfaceC4410 androidx.appcompat.widget.Toolbar r4, @Yue.InterfaceC4544 java.lang.CharSequence r5, @Yue.InterfaceC4410 android.view.Window.Callback r6) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f25272 = r0
            androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ r0 = new androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ
            r0.<init>(r3)
            r3.f25273 = r0
            androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟ r0 = new androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟
            r0.<init>(r3)
            r3.f25274 = r0
            Yue.C4868.m19181(r4)
            androidx.appcompat.widget.ۥ۟۟۟ۡ r1 = new androidx.appcompat.widget.ۥ۟۟۟ۡ
            r2 = 0
            r1.<init>(r4, r2)
            r3.f25266 = r1
            java.lang.Object r2 = Yue.C4868.m19181(r6)
            android.view.Window$Callback r2 = (android.view.Window.Callback) r2
            r3.f25267 = r2
            r1.setWindowCallback(r6)
            r4.setOnMenuItemClickListener(r0)
            r1.setWindowTitle(r5)
            androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟۟۟ r4 = new androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟۟۟
            r4.<init>(r3)
            r3.f25268 = r4
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo27821(androidx.appcompat.app.AbstractC7267.InterfaceC7271 r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.ۥ$ۥ۟۟۟> r0 = r1.f25272
            r0.add(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo27822(androidx.appcompat.app.AbstractC7267.AbstractC7273 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Tabs are not supported in toolbar action bars"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo27823(androidx.appcompat.app.AbstractC7267.AbstractC7273 r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Tabs are not supported in toolbar action bars"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo27824(androidx.appcompat.app.AbstractC7267.AbstractC7273 r1, int r2, boolean r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Tabs are not supported in toolbar action bars"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo27825(androidx.appcompat.app.AbstractC7267.AbstractC7273 r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Tabs are not supported in toolbar action bars"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo27826() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            boolean r0 = r0.mo8388()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo27827() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            boolean r0 = r0.mo8395()
            if (r0 == 0) goto Lf
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.collapseActionView()
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo27828(boolean r4) {
            r3 = this;
            boolean r0 = r3.f25271
            if (r4 != r0) goto L5
            return
        L5:
            r3.f25271 = r4
            java.util.ArrayList<androidx.appcompat.app.ۥ$ۥ۟۟۟> r0 = r3.f25272
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1e
            java.util.ArrayList<androidx.appcompat.app.ۥ$ۥ۟۟۟> r2 = r3.f25272
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.app.ۥ$ۥ۟۟۟ r2 = (androidx.appcompat.app.AbstractC7267.InterfaceC7271) r2
            r2.m27897(r4)
            int r1 = r1 + 1
            goto Le
        L1e:
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public android.view.View mo27829() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            android.view.View r0 = r0.mo8392()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public int mo27830() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            int r0 = r0.mo8416()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public float mo27831() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            android.view.ViewGroup r0 = r0.mo8411()
            float r0 = Yue.C6794.m26131(r0)
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public int mo27832() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            int r0 = r0.getHeight()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public int mo27834() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public int mo27835() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public int mo27836() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public androidx.appcompat.app.AbstractC7267.AbstractC7273 mo27837() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Tabs are not supported in toolbar action bars"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public java.lang.CharSequence mo27838() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            java.lang.CharSequence r0 = r0.mo8415()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public androidx.appcompat.app.AbstractC7267.AbstractC7273 mo27839(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Tabs are not supported in toolbar action bars"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public int mo27840() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public android.content.Context mo27841() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public java.lang.CharSequence mo27842() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo27843() {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public boolean mo27844() {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            android.view.ViewGroup r0 = r0.mo8411()
            java.lang.Runnable r1 = r2.f25273
            r0.removeCallbacks(r1)
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            android.view.ViewGroup r0 = r0.mo8411()
            java.lang.Runnable r1 = r2.f25273
            Yue.C6794.m26211(r0, r1)
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo27846() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public boolean mo27847() {
            r1 = this;
            boolean r0 = super.mo27847()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public androidx.appcompat.app.AbstractC7267.AbstractC7273 mo27848() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Tabs are not supported in toolbar action bars"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public void mo27849(android.content.res.Configuration r1) {
            r0 = this;
            super.mo27849(r1)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public void mo27850() {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            android.view.ViewGroup r0 = r0.mo8411()
            java.lang.Runnable r1 = r2.f25273
            r0.removeCallbacks(r1)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public boolean mo27851(int r5, android.view.KeyEvent r6) {
            r4 = this;
            android.view.Menu r0 = r4.m28130()
            r1 = 0
            if (r0 == 0) goto L24
            if (r6 == 0) goto Le
            int r2 = r6.getDeviceId()
            goto Lf
        Le:
            r2 = -1
        Lf:
            android.view.KeyCharacterMap r2 = android.view.KeyCharacterMap.load(r2)
            int r2 = r2.getKeyboardType()
            r3 = 1
            if (r2 == r3) goto L1b
            goto L1c
        L1b:
            r3 = r1
        L1c:
            r0.setQwertyMode(r3)
            boolean r5 = r0.performShortcut(r5, r6, r1)
            return r5
        L24:
            return r1
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public boolean mo27852(android.view.KeyEvent r2) {
            r1 = this;
            int r2 = r2.getAction()
            r0 = 1
            if (r2 != r0) goto La
            r1.mo27853()
        La:
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public boolean mo27853() {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            boolean r0 = r0.mo8389()
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public void mo27854() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Tabs are not supported in toolbar action bars"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public void mo27855(androidx.appcompat.app.AbstractC7267.InterfaceC7271 r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.ۥ$ۥ۟۟۟> r0 = r1.f25272
            r0.remove(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo27856(androidx.appcompat.app.AbstractC7267.AbstractC7273 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Tabs are not supported in toolbar action bars"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public void mo27857(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Tabs are not supported in toolbar action bars"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public boolean mo27858() {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            android.view.ViewGroup r0 = r0.mo8411()
            if (r0 == 0) goto L13
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L13
            r0.requestFocus()
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    public void mo27859(androidx.appcompat.app.AbstractC7267.AbstractC7273 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Tabs are not supported in toolbar action bars"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public void mo27860(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.setBackgroundDrawable(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public void mo27861(int r4) {
            r3 = this;
            Yue.ۥ۟ۨۤۨ r0 = r3.f25266
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            Yue.ۥ۟ۨۤۨ r1 = r3.f25266
            android.view.ViewGroup r1 = r1.mo8411()
            r2 = 0
            android.view.View r4 = r0.inflate(r4, r1, r2)
            r3.mo27862(r4)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public void mo27862(android.view.View r3) {
            r2 = this;
            androidx.appcompat.app.ۥ$ۥ۟ r0 = new androidx.appcompat.app.ۥ$ۥ۟
            r1 = -2
            r0.<init>(r1, r1)
            r2.mo27863(r3, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo27863(android.view.View r1, androidx.appcompat.app.AbstractC7267.C7269 r2) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.setLayoutParams(r2)
        L5:
            Yue.ۥ۟ۨۤۨ r2 = r0.f25266
            r2.mo8419(r1)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo27864(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo27865(boolean r2) {
            r1 = this;
            r0 = 4
            if (r2 == 0) goto L5
            r2 = r0
            goto L6
        L5:
            r2 = 0
        L6:
            r1.mo27867(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    @android.annotation.SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo27866(int r2) {
            r1 = this;
            r0 = -1
            r1.mo27867(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo27867(int r3, int r4) {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            int r0 = r0.mo8416()
            Yue.ۥ۟ۨۤۨ r1 = r2.f25266
            r3 = r3 & r4
            int r4 = ~r4
            r4 = r4 & r0
            r3 = r3 | r4
            r1.mo8397(r3)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo27868(boolean r2) {
            r1 = this;
            r0 = 16
            if (r2 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = 0
        L7:
            r1.mo27867(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public void mo27869(boolean r2) {
            r1 = this;
            r0 = 2
            if (r2 == 0) goto L5
            r2 = r0
            goto L6
        L5:
            r2 = 0
        L6:
            r1.mo27867(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public void mo27870(boolean r2) {
            r1 = this;
            r0 = 8
            if (r2 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = 0
        L7:
            r1.mo27867(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public void mo27871(boolean r2) {
            r1 = this;
            r0 = 1
            r1.mo27867(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public void mo27872(float r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            android.view.ViewGroup r0 = r0.mo8411()
            Yue.C6794.m26237(r0, r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo27875(int r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.mo8418(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public void mo27876(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.mo8398(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public void mo27877(int r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.mo8409(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo27878(android.graphics.drawable.Drawable r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.mo8423(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public void mo27879(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo27880(int r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ */
    public void mo27881(android.graphics.drawable.Drawable r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo27882(android.widget.SpinnerAdapter r3, androidx.appcompat.app.AbstractC7267.InterfaceC7272 r4) {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            androidx.appcompat.app.ۥ۟۟۟۠ r1 = new androidx.appcompat.app.ۥ۟۟۟۠
            r1.<init>(r4)
            r0.mo8413(r3, r1)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ */
    public void mo27883(int r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.setLogo(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥ */
    public void mo27884(android.graphics.drawable.Drawable r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.mo8394(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟ */
    public void mo27885(int r2) {
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L9
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.mo8408(r2)
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Tabs not supported in this configuration"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo27886(int r3) {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            int r0 = r0.mo8405()
            r1 = 1
            if (r0 != r1) goto Lf
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            r0.mo8402(r3)
            return
        Lf:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "setSelectedNavigationIndex not valid for current navigation mode"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ */
    public void mo27887(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public void mo27888(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ */
    public void mo27889(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    public void mo27890(int r3) {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            if (r3 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            java.lang.CharSequence r3 = r1.getText(r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            r0.mo8399(r3)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public void mo27891(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.mo8399(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ */
    public void mo27892(int r3) {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            if (r3 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            java.lang.CharSequence r3 = r1.getText(r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            r0.setTitle(r3)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ */
    public void mo27893(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.setTitle(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public void mo27894(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥ۟ۨۤۨ r0 = r1.f25266
            r0.setWindowTitle(r2)
            return
    }

    @Override // androidx.appcompat.app.AbstractC7267
    /* JADX INFO: renamed from: ۥ۟۟ۦ */
    public void mo27895() {
            r2 = this;
            Yue.ۥ۟ۨۤۨ r0 = r2.f25266
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public final android.view.Menu m28130() {
            r3 = this;
            boolean r0 = r3.f25270
            if (r0 != 0) goto L16
            Yue.ۥ۟ۨۤۨ r0 = r3.f25266
            androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟ r1 = new androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟
            r1.<init>(r3)
            androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟۟ r2 = new androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟۟
            r2.<init>(r3)
            r0.mo8410(r1, r2)
            r0 = 1
            r3.f25270 = r0
        L16:
            Yue.ۥ۟ۨۤۨ r0 = r3.f25266
            android.view.Menu r0 = r0.mo8403()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public void m28131() {
            r5 = this;
            android.view.Menu r0 = r5.m28130()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.C7343
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r0
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = (androidx.appcompat.view.menu.C7343) r1
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == 0) goto L13
            r1.stopDispatchingItemsChanged()
        L13:
            r0.clear()     // Catch: java.lang.Throwable -> L28
            android.view.Window$Callback r3 = r5.f25267     // Catch: java.lang.Throwable -> L28
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            android.view.Window$Callback r3 = r5.f25267     // Catch: java.lang.Throwable -> L28
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2d
            goto L2a
        L28:
            r0 = move-exception
            goto L33
        L2a:
            r0.clear()     // Catch: java.lang.Throwable -> L28
        L2d:
            if (r1 == 0) goto L32
            r1.startDispatchingItemsChanged()
        L32:
            return
        L33:
            if (r1 == 0) goto L38
            r1.startDispatchingItemsChanged()
        L38:
            throw r0
    }
}
