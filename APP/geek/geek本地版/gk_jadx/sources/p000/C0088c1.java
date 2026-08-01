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

/* JADX INFO: renamed from: c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0088c1 implements l50 {

    /* JADX INFO: renamed from: a */
    public CharSequence f863a;

    /* JADX INFO: renamed from: b */
    public CharSequence f864b;

    /* JADX INFO: renamed from: c */
    public Intent f865c;

    /* JADX INFO: renamed from: d */
    public char f866d;

    /* JADX INFO: renamed from: e */
    public int f867e;

    /* JADX INFO: renamed from: f */
    public char f868f;

    /* JADX INFO: renamed from: g */
    public int f869g;

    /* JADX INFO: renamed from: h */
    public Drawable f870h;

    /* JADX INFO: renamed from: i */
    public Context f871i;

    /* JADX INFO: renamed from: j */
    public CharSequence f872j;

    /* JADX INFO: renamed from: k */
    public CharSequence f873k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f874l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f875m;

    /* JADX INFO: renamed from: n */
    public boolean f876n;

    /* JADX INFO: renamed from: o */
    public boolean f877o;

    /* JADX INFO: renamed from: p */
    public int f878p;

    @Override // p000.l50
    /* JADX INFO: renamed from: a */
    public final l50 mo622a(ActionProviderVisibilityListenerC0610pu actionProviderVisibilityListenerC0610pu) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.l50
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC0610pu mo623b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m624c() {
        Drawable drawable = this.f870h;
        if (drawable != null) {
            if (this.f876n || this.f877o) {
                this.f870h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f870h = drawableMutate;
                if (this.f876n) {
                    AbstractC0104ch.m688h(drawableMutate, this.f874l);
                }
                if (this.f877o) {
                    AbstractC0104ch.m689i(this.f870h, this.f875m);
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

    @Override // p000.l50, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f869g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f868f;
    }

    @Override // p000.l50, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f872j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f870h;
    }

    @Override // p000.l50, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f874l;
    }

    @Override // p000.l50, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f875m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f865c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.l50, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f867e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f866d;
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
        return this.f863a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f864b;
        return charSequence != null ? charSequence : this.f863a;
    }

    @Override // p000.l50, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f873k;
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
        return (this.f878p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f878p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f878p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f878p & 8) == 0;
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
        this.f868f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f878p = (z ? 1 : 0) | (this.f878p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f878p = (z ? 2 : 0) | (this.f878p & (-3));
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final l50 setContentDescription(CharSequence charSequence) {
        this.f872j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f878p = (z ? 16 : 0) | (this.f878p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f870h = drawable;
        m624c();
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f874l = colorStateList;
        this.f876n = true;
        m624c();
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f875m = mode;
        this.f877o = true;
        m624c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f865c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f866d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f866d = c;
        this.f868f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f863a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f864b = charSequence;
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final l50 setTooltipText(CharSequence charSequence) {
        this.f873k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f878p = (this.f878p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f868f = Character.toLowerCase(c);
        this.f869g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f872j = charSequence;
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f866d = c;
        this.f867e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f863a = this.f871i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f873k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f870h = AbstractC0257gd.m1270b(this.f871i, i);
        m624c();
        return this;
    }

    @Override // p000.l50, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f866d = c;
        this.f867e = KeyEvent.normalizeMetaState(i);
        this.f868f = Character.toLowerCase(c2);
        this.f869g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
