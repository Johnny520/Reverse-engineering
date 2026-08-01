package p190;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC7774 extends MenuC7801 implements SubMenu {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final MenuC7801 f21111;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C7799 f21112;

    public SubMenuC7774(Context context, MenuC7801 menuC7801, C7799 c7799) {
        super(context);
        this.f21111 = menuC7801;
        this.f21112 = c7799;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f21112;
    }

    @Override // p190.MenuC7801, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f21111.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m13132(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m13132(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m13132(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f21112.setIcon(drawable);
        return this;
    }

    @Override // p190.MenuC7801, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f21111.setQwertyMode(z);
    }

    @Override // p190.MenuC7801
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo13097(C7799 c7799) {
        return this.f21111.mo13097(c7799);
    }

    @Override // p190.MenuC7801
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo13098(MenuC7801 menuC7801, MenuItem menuItem) {
        return super.mo13098(menuC7801, menuItem) || this.f21111.mo13098(menuC7801, menuItem);
    }

    @Override // p190.MenuC7801
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo13099(C7799 c7799) {
        return this.f21111.mo13099(c7799);
    }

    @Override // p190.MenuC7801
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean mo13100() {
        return this.f21111.mo13100();
    }

    @Override // p190.MenuC7801
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo13101() {
        return this.f21111.mo13101();
    }

    @Override // p190.MenuC7801
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo13102() {
        return this.f21111.mo13102();
    }

    @Override // p190.MenuC7801
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final MenuC7801 mo13103() {
        return this.f21111.mo13103();
    }

    @Override // p190.MenuC7801
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String mo13104() {
        C7799 c7799 = this.f21112;
        int i = c7799 != null ? c7799.f21247 : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC6136.m11556(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f21112.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m13132(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m13132(i, null, 0, null, null);
        return this;
    }
}
