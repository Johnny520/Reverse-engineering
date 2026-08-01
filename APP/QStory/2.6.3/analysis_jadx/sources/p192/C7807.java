package p192;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.C0076;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0197;
import java.lang.ref.WeakReference;
import p190.InterfaceC7797;
import p190.MenuC7802;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7807 extends AbstractC7810 implements InterfaceC7797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0076 f21278;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ActionBarContextView f21279;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public MenuC7802 f21280;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public WeakReference f21281;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f21282;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Context f21283;

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final CharSequence mo406() {
        return this.f21279.getTitle();
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final CharSequence mo407() {
        return this.f21279.getSubtitle();
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final MenuInflater mo408() {
        return new C7817(this.f21279.getContext());
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final MenuC7802 mo409() {
        return this.f21280;
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final View mo410() {
        WeakReference weakReference = this.f21281;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo411() {
        if (this.f21282) {
            return;
        }
        this.f21282 = true;
        this.f21278.mo279(this);
    }

    @Override // p190.InterfaceC7797
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo204(MenuC7802 menuC7802) {
        mo416();
        C0197 c0197 = this.f21279.f410;
        if (c0197 != null) {
            c0197.m703();
        }
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo412(int i) {
        mo413(this.f21283.getString(i));
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo413(CharSequence charSequence) {
        this.f21279.setTitle(charSequence);
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo414(boolean z) {
        this.f21290 = z;
        this.f21279.setTitleOptional(z);
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo415() {
        return this.f21279.f405;
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo416() {
        this.f21278.mo286(this, this.f21280);
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo417(int i) {
        mo418(this.f21283.getString(i));
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo418(CharSequence charSequence) {
        this.f21279.setSubtitle(charSequence);
    }

    @Override // p192.AbstractC7810
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo419(View view) {
        this.f21279.setCustomView(view);
        this.f21281 = view != null ? new WeakReference(view) : null;
    }

    @Override // p190.InterfaceC7797
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo205(MenuC7802 menuC7802, MenuItem menuItem) {
        return ((InterfaceC7811) this.f21278.f227).mo298(this, menuItem);
    }
}
