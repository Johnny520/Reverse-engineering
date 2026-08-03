package p000a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: a.De */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC0071De extends MenuC0614hb implements SubMenu {

    /* JADX INFO: renamed from: e */
    public final InterfaceSubMenuC0197Ke f241e;

    public SubMenuC0071De(Context context, InterfaceSubMenuC0197Ke interfaceSubMenuC0197Ke) {
        super(context, interfaceSubMenuC0197Ke);
        this.f241e = interfaceSubMenuC0197Ke;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f241e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return m1193c(this.f241e.getItem());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.f241e.setHeaderIcon(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.f241e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f241e.setHeaderView(view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f241e.setIcon(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f241e.setHeaderIcon(drawable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f241e.setHeaderTitle(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f241e.setIcon(drawable);
        return this;
    }
}
