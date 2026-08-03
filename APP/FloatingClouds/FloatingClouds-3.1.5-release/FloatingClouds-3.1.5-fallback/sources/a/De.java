package a;

/* JADX INFO: loaded from: classes.dex */
public final class De extends a.MenuC0177hb implements android.view.SubMenu {
    public final a.Ke e;

    public De(android.content.Context r1, a.Ke r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.e = r2
            return
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
            r1 = this;
            a.Ke r0 = r1.e
            r0.clearHeader()
            return
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
            r1 = this;
            a.Ke r0 = r1.e
            android.view.MenuItem r0 = r0.getItem()
            android.view.MenuItem r0 = r1.c(r0)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int r2) {
            r1 = this;
            a.Ke r0 = r1.e
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.Ke r0 = r1.e
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int r2) {
            r1 = this;
            a.Ke r0 = r1.e
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence r2) {
            r1 = this;
            a.Ke r0 = r1.e
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View r2) {
            r1 = this;
            a.Ke r0 = r1.e
            r0.setHeaderView(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int r2) {
            r1 = this;
            a.Ke r0 = r1.e
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.Ke r0 = r1.e
            r0.setIcon(r2)
            return r1
    }
}
