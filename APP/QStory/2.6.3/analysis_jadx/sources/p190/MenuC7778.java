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
import p163.InterfaceMenuItemC7661;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MenuC7778 extends AbstractC0080 implements Menu {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final MenuC7802 f21130;

    public MenuC7778(Context context, MenuC7802 menuC7802) {
        super(context);
        if (menuC7802 != null) {
            this.f21130 = menuC7802;
        } else {
            C5925.m11310("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m311(this.f21130.m13156(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f21130.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m311(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f21130.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C0283 c0283 = (C0283) this.f232;
        if (c0283 != null) {
            c0283.clear();
        }
        this.f21130.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f21130.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m311(this.f21130.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m311(this.f21130.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f21130.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f21130.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f21130.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f21130.performShortcut(i, keyEvent, i2);
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
                if (((InterfaceMenuItemC7661) c0283.m862(i2)).getGroupId() == i) {
                    ((C0283) this.f232).mo868(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f21130.removeGroup(i);
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
                if (((InterfaceMenuItemC7661) c0283.m862(i2)).getItemId() == i) {
                    ((C0283) this.f232).mo868(i2);
                    break;
                }
                i2++;
            }
        }
        this.f21130.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f21130.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f21130.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f21130.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f21130.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f21130.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f21130.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f21130.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f21130.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m311(this.f21130.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m311(this.f21130.m13156(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m311(this.f21130.add(i, i2, i3, i4));
    }
}
