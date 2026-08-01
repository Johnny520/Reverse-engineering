package p190;

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
import p163.InterfaceMenuItemC7660;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7783 implements InterfaceMenuItemC7660 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f21171;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f21172;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public PorterDuff.Mode f21173;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ColorStateList f21174;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public CharSequence f21175;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public CharSequence f21176;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f21177;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f21178;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public char f21179;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable f21180;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Context f21181;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public char f21182;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f21183;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public CharSequence f21184;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Intent f21185;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CharSequence f21186;

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

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f21183;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f21182;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f21176;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f21180;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f21174;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f21173;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f21185;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f21178;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f21179;
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
        return this.f21186;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21184;
        return charSequence != null ? charSequence : this.f21186;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f21175;
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
        return (this.f21177 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f21177 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f21177 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f21177 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f21182 = Character.toLowerCase(c);
        this.f21183 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f21177 = (z ? 1 : 0) | (this.f21177 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f21177 = (z ? 2 : 0) | (this.f21177 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f21176 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f21177 = (z ? 16 : 0) | (this.f21177 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f21180 = this.f21181.getDrawable(i);
        m13115();
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21174 = colorStateList;
        this.f21172 = true;
        m13115();
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21173 = mode;
        this.f21171 = true;
        m13115();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f21185 = intent;
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f21179 = c;
        this.f21178 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f21179 = c;
        this.f21178 = KeyEvent.normalizeMetaState(i);
        this.f21182 = Character.toLowerCase(c2);
        this.f21183 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f21186 = this.f21181.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21184 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f21175 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f21177 = (this.f21177 & 8) | (z ? 0 : 8);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13115() {
        Drawable drawable = this.f21180;
        if (drawable != null) {
            if (this.f21172 || this.f21171) {
                this.f21180 = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f21180 = drawableMutate;
                if (this.f21172) {
                    drawableMutate.setTintList(this.f21174);
                }
                if (this.f21171) {
                    this.f21180.setTintMode(this.f21173);
                }
            }
        }
    }

    @Override // p163.InterfaceMenuItemC7660
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ActionProviderVisibilityListenerC7791 mo12894() {
        return null;
    }

    @Override // p163.InterfaceMenuItemC7660
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceMenuItemC7660 mo12895(ActionProviderVisibilityListenerC7791 actionProviderVisibilityListenerC7791) {
        throw new UnsupportedOperationException();
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final InterfaceMenuItemC7660 setContentDescription(CharSequence charSequence) {
        this.f21176 = charSequence;
        return this;
    }

    @Override // p163.InterfaceMenuItemC7660, android.view.MenuItem
    public final InterfaceMenuItemC7660 setTooltipText(CharSequence charSequence) {
        this.f21175 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f21179 = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f21180 = drawable;
        m13115();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f21182 = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f21186 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f21179 = c;
        this.f21182 = Character.toLowerCase(c2);
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
