package p144;

import android.view.ViewGroup;
import p069.AbstractC7390;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8293 extends AbstractC8304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ViewGroup f20542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f20543 = false;

    public C8293(ViewGroup viewGroup) {
        this.f20542 = viewGroup;
    }

    @Override // p144.AbstractC8304, p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo13224() {
        AbstractC7390.m12620(this.f20542, true);
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo13225(AbstractC8312 abstractC8312) {
        if (!this.f20543) {
            AbstractC7390.m12620(this.f20542, false);
        }
        abstractC8312.mo13234(this);
    }

    @Override // p144.AbstractC8304, p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo13226(AbstractC8312 abstractC8312) {
        AbstractC7390.m12620(this.f20542, false);
        this.f20543 = true;
    }

    @Override // p144.AbstractC8304, p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo13227() {
        AbstractC7390.m12620(this.f20542, false);
    }
}
