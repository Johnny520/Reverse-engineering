package yyds;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛵᛸᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1175 implements InterfaceMenuItemC0339 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public ColorStateList f5384;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public char f5385;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public CharSequence f5386;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f5387;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Intent f5388;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public PorterDuff.Mode f5389;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f5390;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f5391;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f5392;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public Context f5393;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public CharSequence f5394;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Drawable f5395;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public CharSequence f5396;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f5397;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public char f5398;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public CharSequence f5399;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5387;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5385;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5394;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f5395;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5384;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5389;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5388;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5392;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5398;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5396;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5399;
        return charSequence != null ? charSequence : this.f5396;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5386;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f5390 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f5390 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f5390 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f5390 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f5385 = Character.toLowerCase(c);
        this.f5387 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f5390 = (z ? 1 : 0) | (this.f5390 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f5390 = (z ? 2 : 0) | (this.f5390 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f5394 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f5390 = (z ? 16 : 0) | (this.f5390 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f5395 = this.f5393.getDrawable(i);
        m2370();
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5384 = colorStateList;
        this.f5397 = true;
        m2370();
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5389 = mode;
        this.f5391 = true;
        m2370();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5388 = intent;
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f5398 = c;
        this.f5392 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5398 = c;
        this.f5392 = KeyEvent.normalizeMetaState(i);
        this.f5385 = Character.toLowerCase(c2);
        this.f5387 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f5396 = this.f5393.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5399 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f5386 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f5390 = (this.f5390 & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final ActionProviderVisibilityListenerC2022 mo1024() {
        return null;
    }

    @Override // yyds.InterfaceMenuItemC0339
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceMenuItemC0339 mo1025(ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC2022) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2370() {
        Drawable drawable = this.f5395;
        if (drawable != null) {
            if (this.f5397 || this.f5391) {
                this.f5395 = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f5395 = drawableMutate;
                if (this.f5397) {
                    drawableMutate.setTintList(this.f5384);
                }
                if (this.f5391) {
                    this.f5395.setTintMode(this.f5389);
                }
            }
        }
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final InterfaceMenuItemC0339 setContentDescription(CharSequence charSequence) {
        this.f5394 = charSequence;
        return this;
    }

    @Override // yyds.InterfaceMenuItemC0339, android.view.MenuItem
    public final InterfaceMenuItemC0339 setTooltipText(CharSequence charSequence) {
        this.f5386 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f5398 = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5395 = drawable;
        m2370();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f5385 = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5396 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f5398 = c;
        this.f5385 = Character.toLowerCase(c2);
        return this;
    }
}
