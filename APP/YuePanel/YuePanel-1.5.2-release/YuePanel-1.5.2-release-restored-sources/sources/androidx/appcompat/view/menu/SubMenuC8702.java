package androidx.appcompat.view.menu;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C8694;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class SubMenuC8702 extends C8694 implements SubMenu {
    private C8697 mItem;
    private C8694 mParentMenu;

    public SubMenuC8702(Context context, C8694 c8694, C8697 c8697) {
        super(context);
        this.mParentMenu = c8694;
        this.mItem = c8697;
    }

    @Override // androidx.appcompat.view.menu.C8694
    public boolean collapseItemActionView(C8697 c8697) {
        return this.mParentMenu.collapseItemActionView(c8697);
    }

    @Override // androidx.appcompat.view.menu.C8694
    public boolean dispatchMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
        return super.dispatchMenuItemSelected(c8694, menuItem) || this.mParentMenu.dispatchMenuItemSelected(c8694, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C8694
    public boolean expandItemActionView(C8697 c8697) {
        return this.mParentMenu.expandItemActionView(c8697);
    }

    @Override // androidx.appcompat.view.menu.C8694
    public String getActionViewStatesKey() {
        C8697 c8697 = this.mItem;
        int itemId = c8697 != null ? c8697.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.C8694
    public C8694 getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.C8694
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.C8694
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.C8694
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.C8694
    public void setCallback(C8694.InterfaceC1603 interfaceC1603) {
        this.mParentMenu.setCallback(interfaceC1603);
    }

    @Override // androidx.appcompat.view.menu.C8694, Yue.InterfaceMenuC7682, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C8694, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C8694
    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.setHeaderIconInt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.setHeaderTitleInt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.mItem.setIcon(i);
        return this;
    }
}
