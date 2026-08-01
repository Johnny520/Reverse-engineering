package p206;

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
import p179.InterfaceMenuItemC8490;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8613 implements InterfaceMenuItemC8490 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f21513;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f21514;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public PorterDuff.Mode f21515;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ColorStateList f21516;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public CharSequence f21517;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public CharSequence f21518;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f21519;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f21520;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public char f21521;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Drawable f21522;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Context f21523;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public char f21524;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f21525;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public CharSequence f21526;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Intent f21527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CharSequence f21528;

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

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f21525;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f21524;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f21518;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f21522;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f21516;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f21515;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f21527;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f21520;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f21521;
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
        return this.f21528;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21526;
        return charSequence != null ? charSequence : this.f21528;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f21517;
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
        return (this.f21519 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f21519 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f21519 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f21519 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f21524 = Character.toLowerCase(c);
        this.f21525 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f21519 = (z ? 1 : 0) | (this.f21519 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f21519 = (z ? 2 : 0) | (this.f21519 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f21518 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f21519 = (z ? 16 : 0) | (this.f21519 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f21522 = this.f21523.getDrawable(i);
        m13702();
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21516 = colorStateList;
        this.f21514 = true;
        m13702();
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21515 = mode;
        this.f21513 = true;
        m13702();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f21527 = intent;
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f21521 = c;
        this.f21520 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f21521 = c;
        this.f21520 = KeyEvent.normalizeMetaState(i);
        this.f21524 = Character.toLowerCase(c2);
        this.f21525 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f21528 = this.f21523.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21526 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f21517 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f21519 = (this.f21519 & 8) | (z ? 0 : 8);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13702() {
        Drawable drawable = this.f21522;
        if (drawable != null) {
            if (this.f21514 || this.f21513) {
                this.f21522 = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f21522 = drawableMutate;
                if (this.f21514) {
                    drawableMutate.setTintList(this.f21516);
                }
                if (this.f21513) {
                    this.f21522.setTintMode(this.f21515);
                }
            }
        }
    }

    @Override // p179.InterfaceMenuItemC8490
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ActionProviderVisibilityListenerC8621 mo13482() {
        return null;
    }

    @Override // p179.InterfaceMenuItemC8490
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceMenuItemC8490 mo13483(ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC8621) {
        throw new UnsupportedOperationException();
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final InterfaceMenuItemC8490 setContentDescription(CharSequence charSequence) {
        this.f21518 = charSequence;
        return this;
    }

    @Override // p179.InterfaceMenuItemC8490, android.view.MenuItem
    public final InterfaceMenuItemC8490 setTooltipText(CharSequence charSequence) {
        this.f21517 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f21521 = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f21522 = drawable;
        m13702();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f21524 = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f21528 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f21521 = c;
        this.f21524 = Character.toLowerCase(c2);
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
