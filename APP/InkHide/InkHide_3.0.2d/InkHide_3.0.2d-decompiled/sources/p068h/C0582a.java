package p068h;

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
import p082p.AbstractC0783a;
import p087s.AbstractC0962a;
import p089t.InterfaceMenuItemC1005a;

/* JADX INFO: renamed from: h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0582a implements InterfaceMenuItemC1005a {

    /* JADX INFO: renamed from: a */
    public CharSequence f1963a;

    /* JADX INFO: renamed from: b */
    public CharSequence f1964b;

    /* JADX INFO: renamed from: c */
    public Intent f1965c;

    /* JADX INFO: renamed from: d */
    public char f1966d;

    /* JADX INFO: renamed from: e */
    public int f1967e;

    /* JADX INFO: renamed from: f */
    public char f1968f;

    /* JADX INFO: renamed from: g */
    public int f1969g;

    /* JADX INFO: renamed from: h */
    public Drawable f1970h;

    /* JADX INFO: renamed from: i */
    public Context f1971i;

    /* JADX INFO: renamed from: j */
    public CharSequence f1972j;

    /* JADX INFO: renamed from: k */
    public CharSequence f1973k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f1974l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f1975m;

    /* JADX INFO: renamed from: n */
    public boolean f1976n;

    /* JADX INFO: renamed from: o */
    public boolean f1977o;

    /* JADX INFO: renamed from: p */
    public int f1978p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC1005a mo1168a(ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC0597p mo1169b() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1170c() {
        Drawable drawable = this.f1970h;
        if (drawable != null) {
            if (this.f1976n || this.f1977o) {
                this.f1970h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f1970h = drawableMutate;
                if (this.f1976n) {
                    AbstractC0962a.m2143h(drawableMutate, this.f1974l);
                }
                if (this.f1977o) {
                    AbstractC0962a.m2144i(this.f1970h, this.f1975m);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1969g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1968f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f1972j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f1970h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f1974l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1975m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f1965c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f1967e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f1966d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f1963a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1964b;
        return charSequence != null ? charSequence : this.f1963a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f1973k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f1978p & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f1978p & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f1978p & 16) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f1978p & 8) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f1968f = Character.toLowerCase(c2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f1978p = (z2 ? 1 : 0) | (this.f1978p & (-2));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f1978p = (z2 ? 2 : 0) | (this.f1978p & (-3));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f1972j = charSequence;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f1978p = (z2 ? 16 : 0) | (this.f1978p & (-17));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1970h = drawable;
        m1170c();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1974l = colorStateList;
        this.f1976n = true;
        m1170c();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1975m = mode;
        this.f1977o = true;
        m1170c();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f1965c = intent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f1966d = c2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f1966d = c2;
        this.f1968f = Character.toLowerCase(c3);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1963a = charSequence;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1964b = charSequence;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f1973k = charSequence;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f1978p = (this.f1978p & 8) | (z2 ? 0 : 8);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f1968f = Character.toLowerCase(c2);
        this.f1969g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final InterfaceMenuItemC1005a setContentDescription(CharSequence charSequence) {
        this.f1972j = charSequence;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.f1966d = c2;
        this.f1967e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f1963a = this.f1971i.getResources().getString(i2);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final InterfaceMenuItemC1005a setTooltipText(CharSequence charSequence) {
        this.f1973k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f1970h = AbstractC0783a.m1446b(this.f1971i, i2);
        m1170c();
        return this;
    }

    @Override // p089t.InterfaceMenuItemC1005a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1966d = c2;
        this.f1967e = KeyEvent.normalizeMetaState(i2);
        this.f1968f = Character.toLowerCase(c3);
        this.f1969g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }
}
