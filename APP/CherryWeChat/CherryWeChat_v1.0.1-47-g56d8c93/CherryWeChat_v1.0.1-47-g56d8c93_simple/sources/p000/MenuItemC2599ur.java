package p000;

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
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ur */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC2599ur extends AbstractC0047B3 implements MenuItem {

    /* JADX INFO: renamed from: c */
    public final InterfaceMenuItemC0558Mz f8974c;

    /* JADX INFO: renamed from: d */
    public Method f8975d;

    public MenuItemC2599ur(Context r1, InterfaceMenuItemC0558Mz r2) {
        super(r1);
        if (r2 == null) goto L7;
        this.f8974c = r2;
        return;
    L7:
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f8974c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f8974c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ActionProviderVisibilityListenerC2470rr r0 = this.f8974c.mo1102b();
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f8695b;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View r0 = this.f8974c.getActionView();
        if ((r0 instanceof C2513sr) == true) goto L5;
        return r0;
    L5:
        return (View) ((C2513sr) r0).f8802a;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8974c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8974c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8974c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f8974c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f8974c.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8974c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8974c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8974c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f8974c.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f8974c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8974c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8974c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f8974c.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f8974c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8974c.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f8974c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8974c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f8974c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f8974c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f8974c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f8974c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f8974c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f8974c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r2) {
        ActionProviderVisibilityListenerC2470rr r0 = new ActionProviderVisibilityListenerC2470rr(this, r2);
        if (r2 != null) goto L6;
        r0 = null;
    L6:
        this.f8974c.mo1101a(r0);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r2) {
        if ((r2 instanceof CollapsibleActionView) == false) goto L5;
        r2 = new C2513sr(r2);
    L5:
        this.f8974c.setActionView(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2) {
        this.f8974c.setAlphabeticShortcut(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r2) {
        this.f8974c.setCheckable(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r2) {
        this.f8974c.setChecked(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence r2) {
        this.f8974c.setContentDescription(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        this.f8974c.setEnabled(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r2) {
        this.f8974c.setIcon(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r2) {
        this.f8974c.setIconTintList(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r2) {
        this.f8974c.setIconTintMode(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r2) {
        this.f8974c.setIntent(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2) {
        this.f8974c.setNumericShortcut(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r2) {
        if (r2 == null) goto L4;
        MenuItemOnActionExpandListenerC2556tr r0 = new MenuItemOnActionExpandListenerC2556tr(this, r2);
    L5:
        this.f8974c.setOnActionExpandListener(r0);
        return this;
    L4:
        r0 = null;
        goto L5
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r2) {
        if (r2 == null) goto L4;
        MenuItemOnMenuItemClickListenerC0429Jz r0 = new MenuItemOnMenuItemClickListenerC0429Jz(this, r2);
    L5:
        this.f8974c.setOnMenuItemClickListener(r0);
        return this;
    L4:
        r0 = null;
        goto L5
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r2, char r3) {
        this.f8974c.setShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r2) {
        this.f8974c.setShowAsAction(r2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r2) {
        this.f8974c.setShowAsActionFlags(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r2) {
        this.f8974c.setTitle(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r2) {
        this.f8974c.setTitleCondensed(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence r2) {
        this.f8974c.setTooltipText(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r2) {
        return this.f8974c.setVisible(r2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2, int r3) {
        this.f8974c.setAlphabeticShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.f8974c.setIcon(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2, int r3) {
        this.f8974c.setNumericShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r2, char r3, int r4, int r5) {
        this.f8974c.setShortcut(r2, r3, r4, r5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        this.f8974c.setTitle(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r3) {
        InterfaceMenuItemC0558Mz r0 = this.f8974c;
        r0.setActionView(r3);
        View r32 = r0.getActionView();
        if ((r32 instanceof CollapsibleActionView) == false) goto L5;
        r0.setActionView(new C2513sr(r32));
    L5:
        return this;
    }
}
