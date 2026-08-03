package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: a.hb */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0614hb extends AbstractC0491b2 implements Menu {

    /* JADX INFO: renamed from: d */
    public final InterfaceMenuC0143He f2274d;

    public MenuC0614hb(Context context, InterfaceMenuC0143He interfaceMenuC0143He) {
        super(context);
        if (interfaceMenuC0143He == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2274d = interfaceMenuC0143He;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1193c(this.f2274d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f2274d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m1193c(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return m1194d(this.f2274d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        C0598ge<InterfaceMenuItemC0179Je, MenuItem> c0598ge = this.f1824b;
        if (c0598ge != null) {
            c0598ge.clear();
        }
        C0598ge<InterfaceSubMenuC0197Ke, SubMenu> c0598ge2 = this.f1825c;
        if (c0598ge2 != null) {
            c0598ge2.clear();
        }
        this.f2274d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f2274d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m1193c(this.f2274d.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m1193c(this.f2274d.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f2274d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f2274d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f2274d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f2274d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.f1824b != null) {
            int i2 = 0;
            while (true) {
                C0598ge<InterfaceMenuItemC0179Je, MenuItem> c0598ge = this.f1824b;
                if (i2 >= c0598ge.f2221c) {
                    break;
                }
                if (c0598ge.m1436h(i2).getGroupId() == i) {
                    this.f1824b.m1437i(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f2274d.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.f1824b != null) {
            int i2 = 0;
            while (true) {
                C0598ge<InterfaceMenuItemC0179Je, MenuItem> c0598ge = this.f1824b;
                if (i2 >= c0598ge.f2221c) {
                    break;
                }
                if (c0598ge.m1436h(i2).getItemId() == i) {
                    this.f1824b.m1437i(i2);
                    break;
                }
                i2++;
            }
        }
        this.f2274d.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f2274d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f2274d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f2274d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f2274d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2274d.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m1193c(this.f2274d.add(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return m1194d(this.f2274d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1193c(this.f2274d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m1194d(this.f2274d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m1193c(this.f2274d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m1194d(this.f2274d.addSubMenu(i, i2, i3, i4));
    }
}
