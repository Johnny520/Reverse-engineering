package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛱᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0727 extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public android.content.res.Resources.Theme f2455;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public android.view.LayoutInflater f2456;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f2457;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public android.content.res.Resources f2458;

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
            r1 = this;
            android.content.res.Resources r0 = r1.f2458
            if (r0 != 0) goto La
            android.content.res.Resources r0 = super.getResources()
            r1.f2458 = r0
        La:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1b
            android.view.LayoutInflater r2 = r1.f2456
            if (r2 != 0) goto L1a
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f2456 = r2
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
            android.content.res.Resources$Theme r0 = r1.f2455
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.f2457
            if (r0 != 0) goto Le
            r0 = 1678639368(0x640e0108, float:1.0478048E22)
            r1.f2457 = r0
        Le:
            r1.m1272()
            android.content.res.Resources$Theme r1 = r1.f2455
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
            r1 = this;
            int r0 = r1.f2457
            if (r0 == r2) goto L9
            r1.f2457 = r2
            r1.m1272()
        L9:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1272() {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.f2455
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.f2455 = r0
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            if (r0 == 0) goto L1d
            android.content.res.Resources$Theme r1 = r2.f2455
            r1.setTo(r0)
        L1d:
            android.content.res.Resources$Theme r0 = r2.f2455
            int r2 = r2.f2457
            r1 = 1
            r0.applyStyle(r2, r1)
            return
    }
}
