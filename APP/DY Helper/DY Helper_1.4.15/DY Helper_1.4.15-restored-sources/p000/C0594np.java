package p000;

/* JADX INFO: renamed from: np */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0594np extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: ζ */
    public static android.content.res.Configuration f7695;

    /* JADX INFO: renamed from: α */
    public int f7696;

    /* JADX INFO: renamed from: β */
    public android.content.res.Resources.Theme f7697;

    /* JADX INFO: renamed from: γ */
    public android.view.LayoutInflater f7698;

    /* JADX INFO: renamed from: δ */
    public android.content.res.Configuration f7699;

    /* JADX INFO: renamed from: ε */
    public android.content.res.Resources f7700;

    public C0594np(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f7696 = r2
            return
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.AssetManager getAssets() {
            r0 = this;
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r3 = this;
            android.content.res.Resources r0 = r3.f7700
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r3.f7699
            if (r0 == 0) goto L2c
            android.content.res.Configuration r1 = p000.C0594np.f7695
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            p000.C0594np.f7695 = r1
        L16:
            android.content.res.Configuration r1 = p000.C0594np.f7695
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L2c
        L1f:
            android.content.res.Configuration r0 = r3.f7699
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f7700 = r0
            goto L32
        L2c:
            android.content.res.Resources r0 = super.getResources()
            r3.f7700 = r0
        L32:
            android.content.res.Resources r3 = r3.f7700
            return r3
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            android.view.LayoutInflater r2 = r1.f7698
            if (r2 != 0) goto L1a
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f7698 = r2
        L1a:
            android.view.LayoutInflater r1 = r1.f7698
            return r1
        L1d:
            android.content.Context r1 = r1.getBaseContext()
            java.lang.Object r1 = r1.getSystemService(r2)
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f7697
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.f7696
            if (r0 != 0) goto Le
            r0 = 2131755289(0x7f100119, float:1.9141453E38)
            r1.f7696 = r0
        Le:
            r1.m4087()
            android.content.res.Resources$Theme r1 = r1.f7697
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
            r1 = this;
            int r0 = r1.f7696
            if (r0 == r2) goto L9
            r1.f7696 = r2
            r1.m4087()
        L9:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m4086(android.content.res.Configuration r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f7700
            if (r0 != 0) goto L16
            android.content.res.Configuration r0 = r1.f7699
            if (r0 != 0) goto L10
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>(r2)
            r1.f7699 = r0
            return
        L10:
            java.lang.String r1 = "Override configuration has already been set"
            p000.C1080.m7279(r1)
            return
        L16:
            java.lang.String r1 = "getResources() or getAssets() has already been called"
            p000.C1080.m7279(r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m4087() {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.f7697
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.f7697 = r0
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            if (r0 == 0) goto L1d
            android.content.res.Resources$Theme r1 = r2.f7697
            r1.setTo(r0)
        L1d:
            android.content.res.Resources$Theme r0 = r2.f7697
            int r2 = r2.f7696
            r1 = 1
            r0.applyStyle(r2, r1)
            return
    }
}
