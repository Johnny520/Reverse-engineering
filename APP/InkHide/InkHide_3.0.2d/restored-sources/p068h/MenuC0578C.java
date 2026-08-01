package p068h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.fragment.app.AbstractC0429g;
import p075l.C0753k;
import p089t.InterfaceMenuItemC1005a;

/* JADX INFO: renamed from: h.C */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0578C extends AbstractC0429g implements Menu {

    /* JADX INFO: renamed from: c */
    public final MenuC0594m f1941c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuC0578C(Context context, MenuC0594m menuC0594m) {
        super(context);
        if (menuC0594m == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1941c = menuC0594m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m829g(this.f1941c.m1182a(0, 0, 0, charSequence));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f1941c.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = m829g(menuItemArr2[i6]);
            }
        }
        return iAddIntentOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f1941c.addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void clear() {
        C0753k c0753k = (C0753k) this.f1329b;
        if (c0753k != null) {
            c0753k.clear();
        }
        this.f1941c.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void close() {
        this.f1941c.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        return m829g(this.f1941c.findItem(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return m829g(this.f1941c.getItem(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f1941c.hasVisibleItems();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f1941c.isShortcutKey(i2, keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return this.f1941c.performIdentifierAction(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f1941c.performShortcut(i2, keyEvent, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        if (((C0753k) this.f1329b) != null) {
            int i3 = 0;
            while (true) {
                C0753k c0753k = (C0753k) this.f1329b;
                if (i3 >= c0753k.f2556c) {
                    break;
                }
                if (((InterfaceMenuItemC1005a) c0753k.m1418g(i3)).getGroupId() == i2) {
                    ((C0753k) this.f1329b).m1419h(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f1941c.removeGroup(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void removeItem(int i2) {
        if (((C0753k) this.f1329b) != null) {
            int i3 = 0;
            while (true) {
                C0753k c0753k = (C0753k) this.f1329b;
                if (i3 >= c0753k.f2556c) {
                    break;
                }
                if (((InterfaceMenuItemC1005a) c0753k.m1418g(i3)).getItemId() == i2) {
                    ((C0753k) this.f1329b).m1419h(i3);
                    break;
                }
                i3++;
            }
        }
        this.f1941c.removeItem(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.f1941c.setGroupCheckable(i2, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        this.f1941c.setGroupEnabled(i2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        this.f1941c.setGroupVisible(i2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f1941c.setQwertyMode(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final int size() {
        return this.f1941c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return this.f1941c.addSubMenu(i2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m829g(this.f1941c.add(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return this.f1941c.addSubMenu(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m829g(this.f1941c.m1182a(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return this.f1941c.addSubMenu(i2, i3, i4, i5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m829g(this.f1941c.add(i2, i3, i4, i5));
    }
}
