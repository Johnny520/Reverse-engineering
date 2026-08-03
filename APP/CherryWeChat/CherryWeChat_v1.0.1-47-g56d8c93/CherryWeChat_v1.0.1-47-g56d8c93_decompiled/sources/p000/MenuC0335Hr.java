package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: Hr */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0335Hr extends AbstractC0047B3 implements Menu {

    /* JADX INFO: renamed from: c */
    public final MenuC2204lr f1142c;

    public MenuC0335Hr(Context context, MenuC2204lr menuC2204lr) {
        super(context);
        if (menuC2204lr == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1142c = menuC2204lr;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m83i(this.f1142c.m4428a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f1142c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m83i(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f1142c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C2520sy c2520sy = (C2520sy) this.f97b;
        if (c2520sy != null) {
            c2520sy.clear();
        }
        this.f1142c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f1142c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m83i(this.f1142c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m83i(this.f1142c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f1142c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1142c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f1142c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1142c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C2520sy) this.f97b) != null) {
            int i2 = 0;
            while (true) {
                C2520sy c2520sy = (C2520sy) this.f97b;
                if (i2 >= c2520sy.f8818c) {
                    break;
                }
                if (((InterfaceMenuItemC0558Mz) c2520sy.m5002f(i2)).getGroupId() == i) {
                    ((C2520sy) this.f97b).mo4h(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f1142c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C2520sy) this.f97b) != null) {
            int i2 = 0;
            while (true) {
                C2520sy c2520sy = (C2520sy) this.f97b;
                if (i2 >= c2520sy.f8818c) {
                    break;
                }
                if (((InterfaceMenuItemC0558Mz) c2520sy.m5002f(i2)).getItemId() == i) {
                    ((C2520sy) this.f97b).mo4h(i2);
                    break;
                }
                i2++;
            }
        }
        this.f1142c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1142c.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f1142c.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f1142c.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f1142c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f1142c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f1142c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m83i(this.f1142c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f1142c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m83i(this.f1142c.m4428a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f1142c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m83i(this.f1142c.add(i, i2, i3, i4));
    }
}
