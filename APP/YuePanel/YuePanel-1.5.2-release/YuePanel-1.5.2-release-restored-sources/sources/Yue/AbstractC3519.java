package Yue;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3519 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Context f5945;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C7467<InterfaceMenuItemC7684, MenuItem> f5946;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C7467<InterfaceSubMenuC7685, SubMenu> f5947;

    public AbstractC3519(Context context) {
        this.f5945 = context;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final MenuItem m9433(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC7684)) {
            return menuItem;
        }
        InterfaceMenuItemC7684 interfaceMenuItemC7684 = (InterfaceMenuItemC7684) menuItem;
        if (this.f5946 == null) {
            this.f5946 = new C7467<>();
        }
        MenuItem menuItem2 = this.f5946.get(interfaceMenuItemC7684);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC6158 menuItemC6158 = new MenuItemC6158(this.f5945, interfaceMenuItemC7684);
        this.f5946.put(interfaceMenuItemC7684, menuItemC6158);
        return menuItemC6158;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final SubMenu m9434(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC7685)) {
            return subMenu;
        }
        InterfaceSubMenuC7685 interfaceSubMenuC7685 = (InterfaceSubMenuC7685) subMenu;
        if (this.f5947 == null) {
            this.f5947 = new C7467<>();
        }
        SubMenu subMenu2 = this.f5947.get(interfaceSubMenuC7685);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC7663 subMenuC7663 = new SubMenuC7663(this.f5945, interfaceSubMenuC7685);
        this.f5947.put(interfaceSubMenuC7685, subMenuC7663);
        return subMenuC7663;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m9435() {
        C7467<InterfaceMenuItemC7684, MenuItem> c7467 = this.f5946;
        if (c7467 != null) {
            c7467.clear();
        }
        C7467<InterfaceSubMenuC7685, SubMenu> c74672 = this.f5947;
        if (c74672 != null) {
            c74672.clear();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m9436(int i) {
        if (this.f5946 == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f5946.size()) {
            if (this.f5946.keyAt(i2).getGroupId() == i) {
                this.f5946.removeAt(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m9437(int i) {
        if (this.f5946 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f5946.size(); i2++) {
            if (this.f5946.keyAt(i2).getItemId() == i) {
                this.f5946.removeAt(i2);
                return;
            }
        }
    }
}
