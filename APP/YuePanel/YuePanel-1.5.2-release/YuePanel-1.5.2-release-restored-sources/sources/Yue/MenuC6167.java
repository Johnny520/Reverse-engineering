package Yue;

import Yue.InterfaceC7144;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class MenuC6167 extends AbstractC3519 implements Menu {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final InterfaceMenuC7682 f15079;

    public MenuC6167(Context context, InterfaceMenuC7682 interfaceMenuC7682) {
        super(context);
        if (interfaceMenuC7682 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f15079 = interfaceMenuC7682;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m9433(this.f15079.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f15079.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m9433(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m9434(this.f15079.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m9435();
        this.f15079.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f15079.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m9433(this.f15079.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m9433(this.f15079.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f15079.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f15079.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f15079.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f15079.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m9436(i);
        this.f15079.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m9437(i);
        this.f15079.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f15079.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f15079.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f15079.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f15079.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f15079.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m9433(this.f15079.add(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m9434(this.f15079.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m9433(this.f15079.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m9434(this.f15079.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m9433(this.f15079.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m9434(this.f15079.addSubMenu(i, i2, i3, i4));
    }
}
