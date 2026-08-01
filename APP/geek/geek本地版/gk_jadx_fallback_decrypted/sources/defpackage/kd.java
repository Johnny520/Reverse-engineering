package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kd extends android.content.ContextWrapper {
    public static android.content.res.Configuration f;
    public int a;
    public android.content.res.Resources.Theme b;
    public android.view.LayoutInflater c;
    public android.content.res.Configuration d;
    public android.content.res.Resources e;

    public kd(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r2
            return
    }

    public final void a(android.content.res.Configuration r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.e
            if (r0 != 0) goto L18
            android.content.res.Configuration r0 = r1.d
            if (r0 != 0) goto L10
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>(r2)
            r1.d = r0
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

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            return
    }

    public final void b() {
            r3 = this;
            android.content.res.Resources$Theme r0 = r3.b
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r3.b = r0
            android.content.Context r0 = r3.getBaseContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            if (r0 == 0) goto L1d
            android.content.res.Resources$Theme r1 = r3.b
            r1.setTo(r0)
        L1d:
            android.content.res.Resources$Theme r0 = r3.b
            int r1 = r3.a
            r2 = 1
            r0.applyStyle(r1, r2)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r3 = this;
            android.content.res.Resources r0 = r3.e
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r3.d
            if (r0 == 0) goto L2c
            android.content.res.Configuration r1 = defpackage.kd.f
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            defpackage.kd.f = r1
        L16:
            android.content.res.Configuration r1 = defpackage.kd.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L2c
        L1f:
            android.content.res.Configuration r0 = r3.d
            android.content.Context r0 = defpackage.jd.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.e = r0
            goto L32
        L2c:
            android.content.res.Resources r0 = super.getResources()
            r3.e = r0
        L32:
            android.content.res.Resources r0 = r3.e
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            android.view.LayoutInflater r2 = r1.c
            if (r2 != 0) goto L1a
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.c = r2
        L1a:
            android.view.LayoutInflater r2 = r1.c
            return r2
        L1d:
            android.content.Context r0 = r1.getBaseContext()
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.b
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.a
            if (r0 != 0) goto Le
            r0 = 2131821081(0x7f110219, float:1.9274895E38)
            r1.a = r0
        Le:
            r1.b()
            android.content.res.Resources$Theme r0 = r1.b
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
            r1 = this;
            int r0 = r1.a
            if (r0 == r2) goto L9
            r1.a = r2
            r1.b()
        L9:
            return
    }
}
