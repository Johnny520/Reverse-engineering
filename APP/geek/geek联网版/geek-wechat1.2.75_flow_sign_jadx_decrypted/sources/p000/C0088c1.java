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
public final class C0088c1 implements s50 {

    /* JADX INFO: renamed from: a */
    public CharSequence f794a;

    /* JADX INFO: renamed from: b */
    public CharSequence f795b;

    /* JADX INFO: renamed from: c */
    public Intent f796c;

    /* JADX INFO: renamed from: d */
    public char f797d;

    /* JADX INFO: renamed from: e */
    public int f798e;

    /* JADX INFO: renamed from: f */
    public char f799f;

    /* JADX INFO: renamed from: g */
    public int f800g;

    /* JADX INFO: renamed from: h */
    public Drawable f801h;

    /* JADX INFO: renamed from: i */
    public Context f802i;

    /* JADX INFO: renamed from: j */
    public CharSequence f803j;

    /* JADX INFO: renamed from: k */
    public CharSequence f804k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f805l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f806m;

    /* JADX INFO: renamed from: n */
    public boolean f807n;

    /* JADX INFO: renamed from: o */
    public boolean f808o;

    /* JADX INFO: renamed from: p */
    public int f809p;

    @Override // p000.s50
    /* JADX INFO: renamed from: a */
    public final s50 mo581a(ActionProviderVisibilityListenerC0906xu actionProviderVisibilityListenerC0906xu) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC0906xu mo582b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m583c() {
        Drawable drawable = this.f801h;
        if (drawable != null) {
            if (this.f807n || this.f808o) {
                this.f801h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f801h = drawableMutate;
                if (this.f807n) {
                    AbstractC0187eh.m995h(drawableMutate, this.f805l);
                }
                if (this.f808o) {
                    AbstractC0187eh.m996i(this.f801h, this.f806m);
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

    @Override // p000.s50, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f800g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f799f;
    }

    @Override // p000.s50, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f803j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f801h;
    }

    @Override // p000.s50, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f805l;
    }

    @Override // p000.s50, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f806m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f796c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.s50, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f798e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f797d;
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
        return this.f794a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f795b;
        return charSequence != null ? charSequence : this.f794a;
    }

    @Override // p000.s50, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f804k;
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
        return (this.f809p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f809p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f809p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f809p & 8) == 0;
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
        this.f799f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f809p = (z ? 1 : 0) | (this.f809p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f809p = (z ? 2 : 0) | (this.f809p & (-3));
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final s50 setContentDescription(CharSequence charSequence) {
        this.f803j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f809p = (z ? 16 : 0) | (this.f809p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f801h = drawable;
        m583c();
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f805l = colorStateList;
        this.f807n = true;
        m583c();
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f806m = mode;
        this.f808o = true;
        m583c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f796c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f797d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f797d = c;
        this.f799f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f794a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f795b = charSequence;
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final s50 setTooltipText(CharSequence charSequence) {
        this.f804k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f809p = (this.f809p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f799f = Character.toLowerCase(c);
        this.f800g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f803j = charSequence;
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f797d = c;
        this.f798e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f794a = this.f802i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f804k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f801h = AbstractC0629qd.m2148b(this.f802i, i);
        m583c();
        return this;
    }

    @Override // p000.s50, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f797d = c;
        this.f798e = KeyEvent.normalizeMetaState(i);
        this.f799f = Character.toLowerCase(c2);
        this.f800g = KeyEvent.normalizeMetaState(i2);
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
