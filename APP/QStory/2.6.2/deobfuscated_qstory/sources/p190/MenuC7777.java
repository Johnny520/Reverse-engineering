package p190;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.app.AbstractC0080;
import androidx.collection.C0283;
import p163.InterfaceMenuItemC7660;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MenuC7777 extends AbstractC0080 implements Menu {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final MenuC7801 f21133;

    public MenuC7777(Context context, MenuC7801 menuC7801) {
        super(context);
        if (menuC7801 != null) {
            this.f21133 = menuC7801;
        } else {
            C5919.m11249("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m310(this.f21133.m13128(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f21133.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m310(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f21133.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C0283 c0283 = (C0283) this.f232;
        if (c0283 != null) {
            c0283.clear();
        }
        this.f21133.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f21133.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m310(this.f21133.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m310(this.f21133.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f21133.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f21133.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f21133.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f21133.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C0283) this.f232) != null) {
            int i2 = 0;
            while (true) {
                C0283 c0283 = (C0283) this.f232;
                if (i2 >= c0283.f994) {
                    break;
                }
                if (((InterfaceMenuItemC7660) c0283.m861(i2)).getGroupId() == i) {
                    ((C0283) this.f232).mo867(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f21133.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C0283) this.f232) != null) {
            int i2 = 0;
            while (true) {
                C0283 c0283 = (C0283) this.f232;
                if (i2 >= c0283.f994) {
                    break;
                }
                if (((InterfaceMenuItemC7660) c0283.m861(i2)).getItemId() == i) {
                    ((C0283) this.f232).mo867(i2);
                    break;
                }
                i2++;
            }
        }
        this.f21133.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f21133.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f21133.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f21133.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f21133.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f21133.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f21133.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f21133.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f21133.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m310(this.f21133.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m310(this.f21133.m13128(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m310(this.f21133.add(i, i2, i3, i4));
    }
}
