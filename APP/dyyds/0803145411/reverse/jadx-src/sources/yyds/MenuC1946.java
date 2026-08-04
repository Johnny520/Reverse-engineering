package yyds;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: yyds.ᲀᛲᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class MenuC1946 extends AbstractC2315 implements Menu {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final MenuC0836 f9789;

    public MenuC1946(Context context, MenuC0836 menuC0836) {
        super(context);
        if (menuC0836 != null) {
            this.f9789 = menuC0836;
        } else {
            C0188.m798("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m4327(this.f9789.m1900(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f9789.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m4327(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f9789.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C0988 c0988 = (C0988) this.f11354;
        if (c0988 != null) {
            c0988.clear();
        }
        this.f9789.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f9789.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m4327(this.f9789.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m4327(this.f9789.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f9789.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f9789.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f9789.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f9789.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C0988) this.f11354) != null) {
            int i2 = 0;
            while (true) {
                C0988 c0988 = (C0988) this.f11354;
                if (i2 >= c0988.f4500) {
                    break;
                }
                if (((InterfaceMenuItemC0339) c0988.m2173(i2)).getGroupId() == i) {
                    ((C0988) this.f11354).mo1163(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f9789.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C0988) this.f11354) != null) {
            int i2 = 0;
            while (true) {
                C0988 c0988 = (C0988) this.f11354;
                if (i2 >= c0988.f4500) {
                    break;
                }
                if (((InterfaceMenuItemC0339) c0988.m2173(i2)).getItemId() == i) {
                    ((C0988) this.f11354).mo1163(i2);
                    break;
                }
                i2++;
            }
        }
        this.f9789.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f9789.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f9789.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f9789.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f9789.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f9789.f3823.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f9789.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f9789.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f9789.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m4327(this.f9789.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m4327(this.f9789.m1900(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m4327(this.f9789.add(i, i2, i3, i4));
    }
}
