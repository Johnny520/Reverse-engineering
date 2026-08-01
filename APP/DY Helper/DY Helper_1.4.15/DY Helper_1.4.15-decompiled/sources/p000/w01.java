package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w01 extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: α */
    public final android.content.res.Resources f11505;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f11506;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f11507;

    /* JADX INFO: renamed from: δ */
    public final java.lang.ClassLoader f11508;

    /* JADX INFO: renamed from: ε */
    public android.view.LayoutInflater f11509;

    /* JADX INFO: renamed from: ζ */
    public android.content.res.Resources.Theme f11510;

    public w01(android.content.Context r1, android.content.res.Resources r2, java.lang.String r3, java.lang.ClassLoader r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>(r1)
            r0.f11505 = r2
            r0.f11506 = r3
            java.lang.String r1 = "com.example.dyhelper"
            r0.f11507 = r1
            r0.f11508 = r4
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.AssetManager getAssets() {
            r0 = this;
            android.content.res.Resources r0 = r0.f11505
            android.content.res.AssetManager r0 = r0.getAssets()
            r0.getClass()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.ClassLoader getClassLoader() {
            r1 = this;
            java.lang.ClassLoader r0 = r1.f11508
            if (r0 != 0) goto L18
            java.lang.Class<x01> r0 = p000.x01.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != 0) goto L18
            android.content.Context r1 = r1.getBaseContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r1.getClass()
            return r1
        L18:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.String getPackageCodePath() {
            r0 = this;
            java.lang.String r0 = r0.f11506
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.String getPackageName() {
            r0 = this;
            java.lang.String r0 = r0.f11507
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.String getPackageResourcePath() {
            r0 = this;
            java.lang.String r0 = r0.f11506
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r0 = this;
            android.content.res.Resources r0 = r0.f11505
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            android.view.LayoutInflater r2 = r1.f11509
            if (r2 != 0) goto L1d
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f11509 = r2
        L1d:
            return r2
        L1e:
            android.content.Context r1 = r1.getBaseContext()
            java.lang.Object r1 = r1.getSystemService(r2)
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources.Theme getTheme() {
            r3 = this;
            android.content.res.Resources$Theme r0 = r3.f11510
            if (r0 != 0) goto L2b
            android.content.res.Resources r0 = r3.f11505
            android.content.res.Resources$Theme r0 = r0.newTheme()
            android.content.Context r1 = r3.getBaseContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r2 = 32
            if (r1 != r2) goto L22
            r1 = 16974382(0x103022e, float:2.4062464E-38)
            goto L25
        L22:
            r1 = 16974401(0x1030241, float:2.4062517E-38)
        L25:
            r2 = 1
            r0.applyStyle(r1, r2)
            r3.f11510 = r0
        L2b:
            return r0
    }
}
