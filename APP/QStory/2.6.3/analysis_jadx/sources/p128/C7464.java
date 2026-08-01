package p128;

import android.view.ViewGroup;
import p053.AbstractC6561;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7464 extends AbstractC7475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ViewGroup f20197;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f20198 = false;

    public C7464(ViewGroup viewGroup) {
        this.f20197 = viewGroup;
    }

    @Override // p128.AbstractC7475, p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo12665() {
        AbstractC6561.m12061(this.f20197, true);
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo12666(AbstractC7483 abstractC7483) {
        if (!this.f20198) {
            AbstractC6561.m12061(this.f20197, false);
        }
        abstractC7483.mo12675(this);
    }

    @Override // p128.AbstractC7475, p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo12667(AbstractC7483 abstractC7483) {
        AbstractC6561.m12061(this.f20197, false);
        this.f20198 = true;
    }

    @Override // p128.AbstractC7475, p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo12668() {
        AbstractC6561.m12061(this.f20197, false);
    }
}
