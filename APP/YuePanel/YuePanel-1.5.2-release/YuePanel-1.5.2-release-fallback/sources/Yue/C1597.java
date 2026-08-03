package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1597 extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.content.res.Configuration f5009;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f5010;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.content.res.Resources.Theme f5011;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.view.LayoutInflater f5012;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.content.res.Configuration f5013;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.content.res.Resources f5014;

    public C1597() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C1597(android.content.Context r1, @Yue.InterfaceC6018 int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f5010 = r2
            return
    }

    public C1597(android.content.Context r1, android.content.res.Resources.Theme r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f5011 = r2
            return
    }

    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m7803(android.content.res.Configuration r2) {
            if (r2 != 0) goto L4
            r2 = 1
            return r2
        L4:
            android.content.res.Configuration r0 = Yue.C1597.f5009
            if (r0 != 0) goto L12
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>()
            r1 = 0
            r0.fontScale = r1
            Yue.C1597.f5009 = r0
        L12:
            android.content.res.Configuration r0 = Yue.C1597.f5009
            boolean r2 = r2.equals(r0)
            return r2
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.m7805()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            android.view.LayoutInflater r2 = r1.f5012
            if (r2 != 0) goto L1a
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f5012 = r2
        L1a:
            android.view.LayoutInflater r2 = r1.f5012
            return r2
        L1d:
            android.content.Context r0 = r1.getBaseContext()
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f5011
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.f5010
            if (r0 != 0) goto Ld
            int r0 = Yue.C5058.C5070.f17508
            r1.f5010 = r0
        Ld:
            r1.m7807()
            android.content.res.Resources$Theme r0 = r1.f5011
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
            r1 = this;
            int r0 = r1.f5010
            if (r0 == r2) goto L9
            r1.f5010 = r2
            r1.m7807()
        L9:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m7804(android.content.res.Configuration r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f5014
            if (r0 != 0) goto L18
            android.content.res.Configuration r0 = r1.f5013
            if (r0 != 0) goto L10
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>(r2)
            r1.f5013 = r0
            return
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Override configuration has already been set"
            r2.<init>(r0)
            throw r2
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "getResources() or getAssets() has already been called"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.content.res.Resources m7805() {
            r1 = this;
            android.content.res.Resources r0 = r1.f5014
            if (r0 != 0) goto L22
            android.content.res.Configuration r0 = r1.f5013
            if (r0 == 0) goto L1c
            boolean r0 = m7803(r0)
            if (r0 == 0) goto Lf
            goto L1c
        Lf:
            android.content.res.Configuration r0 = r1.f5013
            android.content.Context r0 = r1.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r1.f5014 = r0
            goto L22
        L1c:
            android.content.res.Resources r0 = super.getResources()
            r1.f5014 = r0
        L22:
            android.content.res.Resources r0 = r1.f5014
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m7806() {
            r1 = this;
            int r0 = r1.f5010
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m7807() {
            r3 = this;
            android.content.res.Resources$Theme r0 = r3.f5011
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto L22
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Resources$Theme r1 = r1.newTheme()
            r3.f5011 = r1
            android.content.Context r1 = r3.getBaseContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            if (r1 == 0) goto L22
            android.content.res.Resources$Theme r2 = r3.f5011
            r2.setTo(r1)
        L22:
            android.content.res.Resources$Theme r1 = r3.f5011
            int r2 = r3.f5010
            r3.m7808(r1, r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m7808(android.content.res.Resources.Theme r1, int r2, boolean r3) {
            r0 = this;
            r3 = 1
            r1.applyStyle(r2, r3)
            return
    }
}
