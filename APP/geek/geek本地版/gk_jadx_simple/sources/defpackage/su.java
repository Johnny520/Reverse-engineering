package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public final class su extends o3 implements MenuItem {
    public final l50 c;
    public Method d;

    public su(Context r1, l50 r2) {
        super(r1);
        if (r2 == null) goto L7;
        this.c = r2;
        return;
    L7:
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        pu r0 = this.c.b();
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.a;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View r0 = this.c.getActionView();
        if ((r0 instanceof qu) == true) goto L5;
        return r0;
    L5:
        return (View) ((qu) r0).a;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.c.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.c.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.c.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r2) {
        pu r0 = new pu(this, r2);
        if (r2 != null) goto L6;
        r0 = null;
    L6:
        this.c.a(r0);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r2) {
        if ((r2 instanceof CollapsibleActionView) == false) goto L5;
        r2 = new qu(r2);
    L5:
        this.c.setActionView(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2) {
        this.c.setAlphabeticShortcut(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r2) {
        this.c.setCheckable(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r2) {
        this.c.setChecked(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence r2) {
        this.c.setContentDescription(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        this.c.setEnabled(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r2) {
        this.c.setIcon(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r2) {
        this.c.setIconTintList(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r2) {
        this.c.setIconTintMode(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r2) {
        this.c.setIntent(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2) {
        this.c.setNumericShortcut(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r2) {
        if (r2 == null) goto L4;
        ru r0 = new ru(this, r2);
    L5:
        this.c.setOnActionExpandListener(r0);
        return this;
    L4:
        r0 = null;
        goto L5
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r2) {
        if (r2 == null) goto L4;
        i50 r0 = new i50(this, r2);
    L5:
        this.c.setOnMenuItemClickListener(r0);
        return this;
    L4:
        r0 = null;
        goto L5
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r2, char r3) {
        this.c.setShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r2) {
        this.c.setShowAsAction(r2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r2) {
        this.c.setShowAsActionFlags(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r2) {
        this.c.setTitle(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r2) {
        this.c.setTitleCondensed(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence r2) {
        this.c.setTooltipText(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r2) {
        return this.c.setVisible(r2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2, int r3) {
        this.c.setAlphabeticShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.c.setIcon(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2, int r3) {
        this.c.setNumericShortcut(r2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r2, char r3, int r4, int r5) {
        this.c.setShortcut(r2, r3, r4, r5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        this.c.setTitle(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r3) {
        l50 r0 = this.c;
        r0.setActionView(r3);
        View r32 = r0.getActionView();
        if ((r32 instanceof CollapsibleActionView) == false) goto L5;
        r0.setActionView(new qu(r32));
    L5:
        return this;
    }
}
