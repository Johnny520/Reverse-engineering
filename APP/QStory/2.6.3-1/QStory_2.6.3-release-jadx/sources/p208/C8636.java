package p208;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.C0923;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1044;
import java.lang.ref.WeakReference;
import p206.InterfaceC8626;
import p206.MenuC8631;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8636 extends AbstractC8639 implements InterfaceC8626 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0923 f21623;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ActionBarContextView f21624;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public MenuC8631 f21625;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public WeakReference f21626;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f21627;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Context f21628;

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final CharSequence mo966() {
        return this.f21624.getTitle();
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final CharSequence mo967() {
        return this.f21624.getSubtitle();
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final MenuInflater mo968() {
        return new C8646(this.f21624.getContext());
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final MenuC8631 mo969() {
        return this.f21625;
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final View mo970() {
        WeakReference weakReference = this.f21626;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo971() {
        if (this.f21627) {
            return;
        }
        this.f21627 = true;
        this.f21623.mo839(this);
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo764(MenuC8631 menuC8631) {
        mo976();
        C1044 c1044 = this.f21624.f755;
        if (c1044 != null) {
            c1044.m1263();
        }
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo972(int i) {
        mo973(this.f21628.getString(i));
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo973(CharSequence charSequence) {
        this.f21624.setTitle(charSequence);
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo974(boolean z) {
        this.f21635 = z;
        this.f21624.setTitleOptional(z);
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo975() {
        return this.f21624.f750;
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo976() {
        this.f21623.mo846(this, this.f21625);
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo977(int i) {
        mo978(this.f21628.getString(i));
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo978(CharSequence charSequence) {
        this.f21624.setSubtitle(charSequence);
    }

    @Override // p208.AbstractC8639
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo979(View view) {
        this.f21624.setCustomView(view);
        this.f21626 = view != null ? new WeakReference(view) : null;
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo765(MenuC8631 menuC8631, MenuItem menuItem) {
        return ((InterfaceC8640) this.f21623.f572).mo858(this, menuItem);
    }
}
