package p000a;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: a.b2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0491b2 {

    /* JADX INFO: renamed from: a */
    public final Context f1823a;

    /* JADX INFO: renamed from: b */
    public C0598ge<InterfaceMenuItemC0179Je, MenuItem> f1824b;

    /* JADX INFO: renamed from: c */
    public C0598ge<InterfaceSubMenuC0197Ke, SubMenu> f1825c;

    public AbstractC0491b2(Context context) {
        this.f1823a = context;
    }

    /* JADX INFO: renamed from: c */
    public final MenuItem m1193c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0179Je)) {
            return menuItem;
        }
        InterfaceMenuItemC0179Je interfaceMenuItemC0179Je = (InterfaceMenuItemC0179Je) menuItem;
        if (this.f1824b == null) {
            this.f1824b = new C0598ge<>();
        }
        MenuItem orDefault = this.f1824b.getOrDefault(interfaceMenuItemC0179Je, null);
        if (orDefault != null) {
            return orDefault;
        }
        MenuItemC0538db menuItemC0538db = new MenuItemC0538db(this.f1823a, interfaceMenuItemC0179Je);
        this.f1824b.put(interfaceMenuItemC0179Je, menuItemC0538db);
        return menuItemC0538db;
    }

    /* JADX INFO: renamed from: d */
    public final SubMenu m1194d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0197Ke)) {
            return subMenu;
        }
        InterfaceSubMenuC0197Ke interfaceSubMenuC0197Ke = (InterfaceSubMenuC0197Ke) subMenu;
        if (this.f1825c == null) {
            this.f1825c = new C0598ge<>();
        }
        SubMenu orDefault = this.f1825c.getOrDefault(interfaceSubMenuC0197Ke, null);
        if (orDefault != null) {
            return orDefault;
        }
        SubMenuC0071De subMenuC0071De = new SubMenuC0071De(this.f1823a, interfaceSubMenuC0197Ke);
        this.f1825c.put(interfaceSubMenuC0197Ke, subMenuC0071De);
        return subMenuC0071De;
    }
}
