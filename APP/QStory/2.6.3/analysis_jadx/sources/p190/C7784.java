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
import p163.InterfaceMenuItemC7661;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7784 implements InterfaceMenuItemC7661 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f21168;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f21169;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public PorterDuff.Mode f21170;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ColorStateList f21171;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public CharSequence f21172;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public CharSequence f21173;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f21174;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f21175;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public char f21176;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable f21177;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Context f21178;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public char f21179;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f21180;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public CharSequence f21181;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Intent f21182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CharSequence f21183;

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

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f21180;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f21179;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f21173;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f21177;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f21171;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f21170;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f21182;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f21175;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f21176;
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
        return this.f21183;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21181;
        return charSequence != null ? charSequence : this.f21183;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f21172;
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
        return (this.f21174 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f21174 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f21174 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f21174 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f21179 = Character.toLowerCase(c);
        this.f21180 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f21174 = (z ? 1 : 0) | (this.f21174 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f21174 = (z ? 2 : 0) | (this.f21174 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f21173 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f21174 = (z ? 16 : 0) | (this.f21174 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f21177 = this.f21178.getDrawable(i);
        m13143();
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21171 = colorStateList;
        this.f21169 = true;
        m13143();
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21170 = mode;
        this.f21168 = true;
        m13143();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f21182 = intent;
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f21176 = c;
        this.f21175 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f21176 = c;
        this.f21175 = KeyEvent.normalizeMetaState(i);
        this.f21179 = Character.toLowerCase(c2);
        this.f21180 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f21183 = this.f21178.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21181 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f21172 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f21174 = (this.f21174 & 8) | (z ? 0 : 8);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13143() {
        Drawable drawable = this.f21177;
        if (drawable != null) {
            if (this.f21169 || this.f21168) {
                this.f21177 = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f21177 = drawableMutate;
                if (this.f21169) {
                    drawableMutate.setTintList(this.f21171);
                }
                if (this.f21168) {
                    this.f21177.setTintMode(this.f21170);
                }
            }
        }
    }

    @Override // p163.InterfaceMenuItemC7661
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ActionProviderVisibilityListenerC7792 mo12923() {
        return null;
    }

    @Override // p163.InterfaceMenuItemC7661
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceMenuItemC7661 mo12924(ActionProviderVisibilityListenerC7792 actionProviderVisibilityListenerC7792) {
        throw new UnsupportedOperationException();
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final InterfaceMenuItemC7661 setContentDescription(CharSequence charSequence) {
        this.f21173 = charSequence;
        return this;
    }

    @Override // p163.InterfaceMenuItemC7661, android.view.MenuItem
    public final InterfaceMenuItemC7661 setTooltipText(CharSequence charSequence) {
        this.f21172 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f21176 = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f21177 = drawable;
        m13143();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f21179 = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f21183 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f21176 = c;
        this.f21179 = Character.toLowerCase(c2);
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
