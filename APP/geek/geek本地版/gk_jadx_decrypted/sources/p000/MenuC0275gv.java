package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: gv */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0275gv extends AbstractC0545o3 implements Menu {

    /* JADX INFO: renamed from: c */
    public final MenuC0424ku f2168c;

    public MenuC0275gv(Context context, MenuC0424ku menuC0424ku) {
        super(context);
        if (menuC0424ku == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2168c = menuC0424ku;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1987g(this.f2168c.m1716a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f2168c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m1987g(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f2168c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        u30 u30Var = (u30) this.f3480b;
        if (u30Var != null) {
            u30Var.clear();
        }
        this.f2168c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f2168c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m1987g(this.f2168c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m1987g(this.f2168c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f2168c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f2168c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f2168c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f2168c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((u30) this.f3480b) != null) {
            int i2 = 0;
            while (true) {
                u30 u30Var = (u30) this.f3480b;
                if (i2 >= u30Var.f4662c) {
                    break;
                }
                if (((l50) u30Var.m2416h(i2)).getGroupId() == i) {
                    ((u30) this.f3480b).m2417i(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f2168c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((u30) this.f3480b) != null) {
            int i2 = 0;
            while (true) {
                u30 u30Var = (u30) this.f3480b;
                if (i2 >= u30Var.f4662c) {
                    break;
                }
                if (((l50) u30Var.m2416h(i2)).getItemId() == i) {
                    ((u30) this.f3480b).m2417i(i2);
                    break;
                }
                i2++;
            }
        }
        this.f2168c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f2168c.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f2168c.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f2168c.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f2168c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2168c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f2168c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m1987g(this.f2168c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f2168c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1987g(this.f2168c.m1716a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f2168c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m1987g(this.f2168c.add(i, i2, i3, i4));
    }
}
