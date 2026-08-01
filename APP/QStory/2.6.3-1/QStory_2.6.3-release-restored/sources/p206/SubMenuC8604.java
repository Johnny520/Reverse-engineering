package p206;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC8604 extends MenuC8631 implements SubMenu {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final MenuC8631 f21453;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C8629 f21454;

    public SubMenuC8604(Context context, MenuC8631 menuC8631, C8629 c8629) {
        super(context);
        this.f21453 = menuC8631;
        this.f21454 = c8629;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f21454;
    }

    @Override // p206.MenuC8631, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f21453.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m13719(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m13719(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m13719(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f21454.setIcon(drawable);
        return this;
    }

    @Override // p206.MenuC8631, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f21453.setQwertyMode(z);
    }

    @Override // p206.MenuC8631
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo13684(C8629 c8629) {
        return this.f21453.mo13684(c8629);
    }

    @Override // p206.MenuC8631
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo13685(MenuC8631 menuC8631, MenuItem menuItem) {
        return super.mo13685(menuC8631, menuItem) || this.f21453.mo13685(menuC8631, menuItem);
    }

    @Override // p206.MenuC8631
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo13686(C8629 c8629) {
        return this.f21453.mo13686(c8629);
    }

    @Override // p206.MenuC8631
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean mo13687() {
        return this.f21453.mo13687();
    }

    @Override // p206.MenuC8631
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo13688() {
        return this.f21453.mo13688();
    }

    @Override // p206.MenuC8631
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo13689() {
        return this.f21453.mo13689();
    }

    @Override // p206.MenuC8631
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final MenuC8631 mo13690() {
        return this.f21453.mo13690();
    }

    @Override // p206.MenuC8631
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String mo13691() {
        C8629 c8629 = this.f21454;
        int i = c8629 != null ? c8629.f21589 : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC7012.m12147(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f21454.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m13719(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m13719(i, null, 0, null, null);
        return this;
    }
}
