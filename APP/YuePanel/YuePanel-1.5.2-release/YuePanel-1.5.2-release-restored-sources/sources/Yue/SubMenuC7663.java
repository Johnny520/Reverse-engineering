package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class SubMenuC7663 extends MenuC6167 implements SubMenu {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final InterfaceSubMenuC7685 f23059;

    public SubMenuC7663(Context context, InterfaceSubMenuC7685 interfaceSubMenuC7685) {
        super(context, interfaceSubMenuC7685);
        this.f23059 = interfaceSubMenuC7685;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f23059.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m9433(this.f23059.getItem());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f23059.setHeaderIcon(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f23059.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f23059.setHeaderView(view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f23059.setIcon(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f23059.setHeaderIcon(drawable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f23059.setHeaderTitle(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f23059.setIcon(drawable);
        return this;
    }
}
