package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b12 extends p000.iz0 implements android.view.SubMenu {

    /* JADX INFO: renamed from: Β */
    public final p000.iz0 f1419;

    /* JADX INFO: renamed from: Γ */
    public final p000.lz0 f1420;

    public b12(android.content.Context r1, p000.iz0 r2, p000.lz0 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f1419 = r2
            r0.f1420 = r3
            return
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
            r0 = this;
            lz0 r0 = r0.f1420
            return r0
    }

    @Override // p000.iz0, android.view.Menu
    public final void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            iz0 r0 = r0.f1419
            r0.setGroupDividerEnabled(r1)
            return
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r3 = r7
            r0.m2841(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r3 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r4 = r7
            r0.m2841(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.m2841(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r0.m2841(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View r7) {
            r6 = this;
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r5 = r7
            r0.m2841(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int r2) {
            r1 = this;
            lz0 r0 = r1.f1420
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            lz0 r0 = r1.f1420
            r0.setIcon(r2)
            return r1
    }

    @Override // p000.iz0, android.view.Menu
    public final void setQwertyMode(boolean r1) {
            r0 = this;
            iz0 r0 = r0.f1419
            r0.setQwertyMode(r1)
            return
    }

    @Override // p000.iz0
    /* JADX INFO: renamed from: δ */
    public final boolean mo681(p000.lz0 r1) {
            r0 = this;
            iz0 r0 = r0.f1419
            boolean r0 = r0.mo681(r1)
            return r0
    }

    @Override // p000.iz0
    /* JADX INFO: renamed from: ε */
    public final boolean mo682(p000.iz0 r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.mo682(r2, r3)
            if (r0 != 0) goto L11
            iz0 r1 = r1.f1419
            boolean r1 = r1.mo682(r2, r3)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    @Override // p000.iz0
    /* JADX INFO: renamed from: ζ */
    public final boolean mo683(p000.lz0 r1) {
            r0 = this;
            iz0 r0 = r0.f1419
            boolean r0 = r0.mo683(r1)
            return r0
    }

    @Override // p000.iz0
    /* JADX INFO: renamed from: κ */
    public final java.lang.String mo684() {
            r1 = this;
            lz0 r1 = r1.f1420
            if (r1 == 0) goto L7
            int r1 = r1.f6853
            goto L8
        L7:
            r1 = 0
        L8:
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.String r0 = "android:menu:actionviewstates:"
            java.lang.String r1 = p000.a12.m17(r0, r1)
            return r1
    }

    @Override // p000.iz0
    /* JADX INFO: renamed from: λ */
    public final p000.iz0 mo685() {
            r0 = this;
            iz0 r0 = r0.f1419
            iz0 r0 = r0.mo685()
            return r0
    }

    @Override // p000.iz0
    /* JADX INFO: renamed from: ν */
    public final boolean mo686() {
            r0 = this;
            iz0 r0 = r0.f1419
            boolean r0 = r0.mo686()
            return r0
    }

    @Override // p000.iz0
    /* JADX INFO: renamed from: ξ */
    public final boolean mo687() {
            r0 = this;
            iz0 r0 = r0.f1419
            boolean r0 = r0.mo687()
            return r0
    }

    @Override // p000.iz0
    /* JADX INFO: renamed from: ο */
    public final boolean mo688() {
            r0 = this;
            iz0 r0 = r0.f1419
            boolean r0 = r0.mo688()
            return r0
    }
}
