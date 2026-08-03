package p000;

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

/* JADX INFO: renamed from: w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2652w0 implements InterfaceMenuItemC0558Mz {

    /* JADX INFO: renamed from: a */
    public CharSequence f9169a;

    /* JADX INFO: renamed from: b */
    public CharSequence f9170b;

    /* JADX INFO: renamed from: c */
    public Intent f9171c;

    /* JADX INFO: renamed from: d */
    public char f9172d;

    /* JADX INFO: renamed from: e */
    public int f9173e;

    /* JADX INFO: renamed from: f */
    public char f9174f;

    /* JADX INFO: renamed from: g */
    public int f9175g;

    /* JADX INFO: renamed from: h */
    public Drawable f9176h;

    /* JADX INFO: renamed from: i */
    public Context f9177i;

    /* JADX INFO: renamed from: j */
    public CharSequence f9178j;

    /* JADX INFO: renamed from: k */
    public CharSequence f9179k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f9180l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f9181m;

    /* JADX INFO: renamed from: n */
    public boolean f9182n;

    /* JADX INFO: renamed from: o */
    public boolean f9183o;

    /* JADX INFO: renamed from: p */
    public int f9184p;

    @Override // p000.InterfaceMenuItemC0558Mz
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC0558Mz mo1101a(ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC0558Mz
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC2470rr mo1102b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m5184c() {
        Drawable drawable = this.f9176h;
        if (drawable != null) {
            if (this.f9182n || this.f9183o) {
                this.f9176h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f9176h = drawableMutate;
                if (this.f9182n) {
                    drawableMutate.setTintList(this.f9180l);
                }
                if (this.f9183o) {
                    this.f9176h.setTintMode(this.f9181m);
                }
            }
        }
    }

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

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9175g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9174f;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9178j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f9176h;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9180l;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9181m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9171c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9173e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9172d;
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
        return this.f9169a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9170b;
        return charSequence != null ? charSequence : this.f9169a;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9179k;
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
        return (this.f9184p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9184p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9184p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f9184p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f9174f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f9184p = (z ? 1 : 0) | (this.f9184p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f9184p = (z ? 2 : 0) | (this.f9184p & (-3));
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final InterfaceMenuItemC0558Mz setContentDescription(CharSequence charSequence) {
        this.f9178j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f9184p = (z ? 16 : 0) | (this.f9184p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9176h = drawable;
        m5184c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9180l = colorStateList;
        this.f9182n = true;
        m5184c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9181m = mode;
        this.f9183o = true;
        m5184c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9171c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f9172d = c;
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

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f9172d = c;
        this.f9174f = Character.toLowerCase(c2);
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
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9169a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9170b = charSequence;
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final InterfaceMenuItemC0558Mz setTooltipText(CharSequence charSequence) {
        this.f9179k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f9184p = (this.f9184p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f9174f = Character.toLowerCase(c);
        this.f9175g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f9178j = charSequence;
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f9172d = c;
        this.f9173e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f9169a = this.f9177i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f9179k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f9176h = this.f9177i.getDrawable(i);
        m5184c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC0558Mz, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f9172d = c;
        this.f9173e = KeyEvent.normalizeMetaState(i);
        this.f9174f = Character.toLowerCase(c2);
        this.f9175g = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
