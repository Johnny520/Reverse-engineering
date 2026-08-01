package defpackage;

/* JADX INFO: renamed from: ᛴᛱᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0620 extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static android.content.res.Configuration f3027;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.content.res.Resources f3028;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.content.res.Configuration f3029;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.view.LayoutInflater f3030;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f3031;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public android.content.res.Resources.Theme f3032;

    public C0620(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f3031 = r2
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
            android.content.res.Resources r0 = r3.f3028
            if (r0 != 0) goto L30
            android.content.res.Configuration r0 = r3.f3029
            if (r0 == 0) goto L2a
            android.content.res.Configuration r1 = defpackage.C0620.f3027
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            defpackage.C0620.f3027 = r1
        L16:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d
            goto L2a
        L1d:
            android.content.res.Configuration r0 = r3.f3029
            android.content.Context r0 = defpackage.AbstractC1097.m2077(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f3028 = r0
            return r0
        L2a:
            android.content.res.Resources r0 = super.getResources()
            r3.f3028 = r0
        L30:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1b
            android.view.LayoutInflater r2 = r1.f3030
            if (r2 != 0) goto L1a
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f3030 = r2
        L1a:
            return r2
        L1b:
            android.content.Context r1 = r1.getBaseContext()
            java.lang.Object r1 = r1.getSystemService(r2)
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f3032
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.f3031
            if (r0 != 0) goto Le
            r0 = 1712259401(0x660f0149, float:1.6883053E23)
            r1.f3031 = r0
        Le:
            r1.m1424()
            android.content.res.Resources$Theme r1 = r1.f3032
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
            r1 = this;
            int r0 = r1.f3031
            if (r0 == r2) goto L9
            r1.f3031 = r2
            r1.m1424()
        L9:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1424() {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.f3032
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.f3032 = r0
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            if (r0 == 0) goto L1d
            android.content.res.Resources$Theme r1 = r2.f3032
            r1.setTo(r0)
        L1d:
            android.content.res.Resources$Theme r0 = r2.f3032
            int r2 = r2.f3031
            r1 = 1
            r0.applyStyle(r2, r1)
            return
    }
}
