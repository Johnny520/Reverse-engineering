package p192;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.C0076;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0197;
import java.lang.ref.WeakReference;
import p190.InterfaceC7796;
import p190.MenuC7801;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7806 extends AbstractC7809 implements InterfaceC7796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0076 f21281;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ActionBarContextView f21282;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public MenuC7801 f21283;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public WeakReference f21284;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f21285;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Context f21286;

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final CharSequence mo405() {
        return this.f21282.getTitle();
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final CharSequence mo406() {
        return this.f21282.getSubtitle();
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final MenuInflater mo407() {
        return new C7816(this.f21282.getContext());
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final MenuC7801 mo408() {
        return this.f21283;
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final View mo409() {
        WeakReference weakReference = this.f21284;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo410() {
        if (this.f21285) {
            return;
        }
        this.f21285 = true;
        this.f21281.mo278(this);
    }

    @Override // p190.InterfaceC7796
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo203(MenuC7801 menuC7801) {
        mo415();
        C0197 c0197 = this.f21282.f410;
        if (c0197 != null) {
            c0197.m702();
        }
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo411(int i) {
        mo412(this.f21286.getString(i));
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo412(CharSequence charSequence) {
        this.f21282.setTitle(charSequence);
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo413(boolean z) {
        this.f21293 = z;
        this.f21282.setTitleOptional(z);
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo414() {
        return this.f21282.f405;
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo415() {
        this.f21281.mo285(this, this.f21283);
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo416(int i) {
        mo417(this.f21286.getString(i));
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo417(CharSequence charSequence) {
        this.f21282.setSubtitle(charSequence);
    }

    @Override // p192.AbstractC7809
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo418(View view) {
        this.f21282.setCustomView(view);
        this.f21284 = view != null ? new WeakReference(view) : null;
    }

    @Override // p190.InterfaceC7796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo204(MenuC7801 menuC7801, MenuItem menuItem) {
        return ((InterfaceC7810) this.f21281.f227).mo297(this, menuItem);
    }
}
