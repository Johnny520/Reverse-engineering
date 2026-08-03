package p000a;

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
import p000a.C0437Y3;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0254O implements InterfaceMenuItemC0179Je {

    /* JADX INFO: renamed from: a */
    public CharSequence f870a;

    /* JADX INFO: renamed from: b */
    public CharSequence f871b;

    /* JADX INFO: renamed from: c */
    public Intent f872c;

    /* JADX INFO: renamed from: d */
    public char f873d;

    /* JADX INFO: renamed from: e */
    public int f874e;

    /* JADX INFO: renamed from: f */
    public char f875f;

    /* JADX INFO: renamed from: g */
    public int f876g;

    /* JADX INFO: renamed from: h */
    public Drawable f877h;

    /* JADX INFO: renamed from: i */
    public Context f878i;

    /* JADX INFO: renamed from: j */
    public CharSequence f879j;

    /* JADX INFO: renamed from: k */
    public CharSequence f880k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f881l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f882m;

    /* JADX INFO: renamed from: n */
    public boolean f883n;

    /* JADX INFO: renamed from: o */
    public boolean f884o;

    /* JADX INFO: renamed from: p */
    public int f885p;

    @Override // p000a.InterfaceMenuItemC0179Je
    /* JADX INFO: renamed from: a */
    public final AbstractC0290Q mo486a() {
        return null;
    }

    @Override // p000a.InterfaceMenuItemC0179Je
    /* JADX INFO: renamed from: b */
    public final InterfaceMenuItemC0179Je mo487b(AbstractC0290Q abstractC0290Q) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public final void m692c() {
        Drawable drawable = this.f877h;
        if (drawable != null) {
            if (this.f883n || this.f884o) {
                this.f877h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f877h = drawableMutate;
                if (this.f883n) {
                    C0893w5.a.m2176h(drawableMutate, this.f881l);
                }
                if (this.f884o) {
                    C0893w5.a.m2177i(this.f877h, this.f882m);
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

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f876g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f875f;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f879j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f877h;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f881l;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f882m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f872c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f874e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f873d;
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
        return this.f870a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f871b;
        return charSequence != null ? charSequence : this.f870a;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f880k;
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
        return (this.f885p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f885p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f885p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f885p & 8) == 0;
    }

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
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f875f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f885p = (z ? 1 : 0) | (this.f885p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f885p = (z ? 2 : 0) | (this.f885p & (-3));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final InterfaceMenuItemC0179Je setContentDescription(CharSequence charSequence) {
        this.f879j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f885p = (z ? 16 : 0) | (this.f885p & (-17));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f877h = drawable;
        m692c();
        return this;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f881l = colorStateList;
        this.f883n = true;
        m692c();
        return this;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f882m = mode;
        this.f884o = true;
        m692c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f872c = intent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f873d = c;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f873d = c;
        this.f875f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f870a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f871b = charSequence;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final InterfaceMenuItemC0179Je setTooltipText(CharSequence charSequence) {
        this.f880k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f885p = (this.f885p & 8) | (z ? 0 : 8);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f875f = Character.toLowerCase(c);
        this.f876g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f879j = charSequence;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f873d = c;
        this.f874e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f870a = this.f878i.getResources().getString(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f880k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f877h = C0437Y3.a.m1093b(this.f878i, i);
        m692c();
        return this;
    }

    @Override // p000a.InterfaceMenuItemC0179Je, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f873d = c;
        this.f874e = KeyEvent.normalizeMetaState(i);
        this.f875f = Character.toLowerCase(c2);
        this.f876g = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
