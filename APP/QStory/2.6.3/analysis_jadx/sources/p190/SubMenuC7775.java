package p190;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p009.AbstractC6183;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC7775 extends MenuC7802 implements SubMenu {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final MenuC7802 f21108;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C7800 f21109;

    public SubMenuC7775(Context context, MenuC7802 menuC7802, C7800 c7800) {
        super(context);
        this.f21108 = menuC7802;
        this.f21109 = c7800;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f21109;
    }

    @Override // p190.MenuC7802, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f21108.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m13160(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m13160(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m13160(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f21109.setIcon(drawable);
        return this;
    }

    @Override // p190.MenuC7802, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f21108.setQwertyMode(z);
    }

    @Override // p190.MenuC7802
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo13125(C7800 c7800) {
        return this.f21108.mo13125(c7800);
    }

    @Override // p190.MenuC7802
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo13126(MenuC7802 menuC7802, MenuItem menuItem) {
        return super.mo13126(menuC7802, menuItem) || this.f21108.mo13126(menuC7802, menuItem);
    }

    @Override // p190.MenuC7802
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo13127(C7800 c7800) {
        return this.f21108.mo13127(c7800);
    }

    @Override // p190.MenuC7802
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean mo13128() {
        return this.f21108.mo13128();
    }

    @Override // p190.MenuC7802
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo13129() {
        return this.f21108.mo13129();
    }

    @Override // p190.MenuC7802
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo13130() {
        return this.f21108.mo13130();
    }

    @Override // p190.MenuC7802
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final MenuC7802 mo13131() {
        return this.f21108.mo13131();
    }

    @Override // p190.MenuC7802
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String mo13132() {
        C7800 c7800 = this.f21109;
        int i = c7800 != null ? c7800.f21244 : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC6183.m11588(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f21109.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m13160(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m13160(i, null, 0, null, null);
        return this;
    }
}
