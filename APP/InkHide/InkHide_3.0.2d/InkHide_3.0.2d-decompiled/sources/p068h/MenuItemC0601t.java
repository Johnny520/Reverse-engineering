package p068h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.fragment.app.AbstractC0429g;
import java.lang.reflect.Method;
import p089t.InterfaceMenuItemC1005a;

/* JADX INFO: renamed from: h.t */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC0601t extends AbstractC0429g implements MenuItem {

    /* JADX INFO: renamed from: c */
    public final InterfaceMenuItemC1005a f2094c;

    /* JADX INFO: renamed from: d */
    public Method f2095d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuItemC0601t(Context context, InterfaceMenuItemC1005a interfaceMenuItemC1005a) {
        super(context);
        if (interfaceMenuItemC1005a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2094c = interfaceMenuItemC1005a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f2094c.collapseActionView();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f2094c.expandActionView();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597pMo1169b = this.f2094c.mo1169b();
        if (actionProviderVisibilityListenerC0597pMo1169b != null) {
            return actionProviderVisibilityListenerC0597pMo1169b.f2086a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f2094c.getActionView();
        return actionView instanceof C0598q ? (View) ((C0598q) actionView).f2089b : actionView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2094c.getAlphabeticModifiers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2094c.getAlphabeticShortcut();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2094c.getContentDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2094c.getGroupId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f2094c.getIcon();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2094c.getIconTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2094c.getIconTintMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2094c.getIntent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2094c.getItemId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2094c.getMenuInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2094c.getNumericModifiers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2094c.getNumericShortcut();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2094c.getOrder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2094c.getSubMenu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2094c.getTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f2094c.getTitleCondensed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2094c.getTooltipText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2094c.hasSubMenu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2094c.isActionViewExpanded();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f2094c.isCheckable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f2094c.isChecked();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f2094c.isEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f2094c.isVisible();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p = new ActionProviderVisibilityListenerC0597p(this, actionProvider);
        if (actionProvider == null) {
            actionProviderVisibilityListenerC0597p = null;
        }
        this.f2094c.mo1168a(actionProviderVisibilityListenerC0597p);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0598q(view);
        }
        this.f2094c.setActionView(view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f2094c.setAlphabeticShortcut(c2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f2094c.setCheckable(z2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f2094c.setChecked(z2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f2094c.setContentDescription(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f2094c.setEnabled(z2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2094c.setIcon(drawable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2094c.setIconTintList(colorStateList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2094c.setIconTintMode(mode);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2094c.setIntent(intent);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f2094c.setNumericShortcut(c2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2094c.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0599r(this, onActionExpandListener) : null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2094c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC0600s(this, onMenuItemClickListener) : null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2094c.setShortcut(c2, c3);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        this.f2094c.setShowAsAction(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        this.f2094c.setShowAsActionFlags(i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2094c.setTitle(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2094c.setTitleCondensed(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f2094c.setTooltipText(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        return this.f2094c.setVisible(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f2094c.setAlphabeticShortcut(c2, i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f2094c.setIcon(i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.f2094c.setNumericShortcut(c2, i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2094c.setShortcut(c2, c3, i2, i3);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f2094c.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        InterfaceMenuItemC1005a interfaceMenuItemC1005a = this.f2094c;
        interfaceMenuItemC1005a.setActionView(i2);
        View actionView = interfaceMenuItemC1005a.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC1005a.setActionView(new C0598q(actionView));
        }
        return this;
    }
}
