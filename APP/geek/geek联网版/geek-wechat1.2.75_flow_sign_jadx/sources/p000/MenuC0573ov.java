package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: ov */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0573ov extends AbstractC0545o3 implements Menu {

    /* JADX INFO: renamed from: c */
    public final MenuC0646qu f3546c;

    public MenuC0573ov(Context context, MenuC0646qu menuC0646qu) {
        super(context);
        if (menuC0646qu == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f3546c = menuC0646qu;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1968g(this.f3546c.m2165a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f3546c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m1968g(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f3546c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        b40 b40Var = (b40) this.f3365b;
        if (b40Var != null) {
            b40Var.clear();
        }
        this.f3546c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f3546c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m1968g(this.f3546c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m1968g(this.f3546c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f3546c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f3546c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f3546c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f3546c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((b40) this.f3365b) != null) {
            int i2 = 0;
            while (true) {
                b40 b40Var = (b40) this.f3365b;
                if (i2 >= b40Var.f681c) {
                    break;
                }
                if (((s50) b40Var.m485h(i2)).getGroupId() == i) {
                    ((b40) this.f3365b).m486i(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f3546c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((b40) this.f3365b) != null) {
            int i2 = 0;
            while (true) {
                b40 b40Var = (b40) this.f3365b;
                if (i2 >= b40Var.f681c) {
                    break;
                }
                if (((s50) b40Var.m485h(i2)).getItemId() == i) {
                    ((b40) this.f3365b).m486i(i2);
                    break;
                }
                i2++;
            }
        }
        this.f3546c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f3546c.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f3546c.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f3546c.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f3546c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3546c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f3546c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m1968g(this.f3546c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f3546c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1968g(this.f3546c.m2165a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f3546c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m1968g(this.f3546c.add(i, i2, i3, i4));
    }
}
