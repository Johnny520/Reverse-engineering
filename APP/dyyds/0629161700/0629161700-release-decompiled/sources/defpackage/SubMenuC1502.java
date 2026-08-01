package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC1502 extends defpackage.MenuC1701 implements android.view.SubMenu {

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public final defpackage.MenuC1701 f6611;

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public final defpackage.C0254 f6612;

    public SubMenuC1502(android.content.Context r1, defpackage.MenuC1701 r2, defpackage.C0254 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f6611 = r2
            r0.f6612 = r3
            return
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
            r0 = this;
            ᛲᛲᛶᲁ r0 = r0.f6612
            return r0
    }

    @Override // defpackage.MenuC1701, android.view.Menu
    public final void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f6611
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
            r0.m3078(r1, r2, r3, r4, r5)
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
            r0.m3078(r1, r2, r3, r4, r5)
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
            r0.m3078(r1, r2, r3, r4, r5)
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
            r0.m3078(r1, r2, r3, r4, r5)
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
            r0.m3078(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int r2) {
            r1 = this;
            ᛲᛲᛶᲁ r0 = r1.f6612
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            ᛲᛲᛶᲁ r0 = r1.f6612
            r0.setIcon(r2)
            return r1
    }

    @Override // defpackage.MenuC1701, android.view.Menu
    public final void setQwertyMode(boolean r1) {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f6611
            r0.setQwertyMode(r1)
            return
    }

    @Override // defpackage.MenuC1701
    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.MenuC1701 mo2716() {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f6611
            ᲀᛷᛱᲇ r0 = r0.mo2716()
            return r0
    }

    @Override // defpackage.MenuC1701
    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final boolean mo2717() {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f6611
            boolean r0 = r0.mo2717()
            return r0
    }

    @Override // defpackage.MenuC1701
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean mo2718(defpackage.MenuC1701 r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.mo2718(r2, r3)
            if (r0 != 0) goto L11
            ᲀᛷᛱᲇ r1 = r1.f6611
            boolean r1 = r1.mo2718(r2, r3)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    @Override // defpackage.MenuC1701
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final boolean mo2719() {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f6611
            boolean r0 = r0.mo2719()
            return r0
    }

    @Override // defpackage.MenuC1701
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean mo2720(defpackage.C0254 r1) {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f6611
            boolean r0 = r0.mo2720(r1)
            return r0
    }

    @Override // defpackage.MenuC1701
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.lang.String mo2721() {
            r1 = this;
            ᛲᛲᛶᲁ r1 = r1.f6612
            int r1 = r1.f1494
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "android:menu:actionviewstates:"
            java.lang.String r1 = defpackage.AbstractC1124.m2145(r1, r0)
            return r1
    }

    @Override // defpackage.MenuC1701
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final boolean mo2722() {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f6611
            boolean r0 = r0.mo2722()
            return r0
    }

    @Override // defpackage.MenuC1701
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean mo2723(defpackage.C0254 r1) {
            r0 = this;
            ᲀᛷᛱᲇ r0 = r0.f6611
            boolean r0 = r0.mo2723(r1)
            return r0
    }
}
