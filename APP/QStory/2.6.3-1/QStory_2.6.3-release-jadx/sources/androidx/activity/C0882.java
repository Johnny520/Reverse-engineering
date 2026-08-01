package androidx.activity;

import p160.AbstractC8377;
import p160.C8380;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0882 extends AbstractC8377 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f414;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC0881 f415;

    public C0882(AbstractC0881 abstractC0881, C0880 c0880) {
        super(c0880, abstractC0881.f412);
        this.f415 = abstractC0881;
        this.f414 = true;
    }

    @Override // p160.AbstractC8377
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo626(C8380 c8380) {
        c8380.getClass();
        this.f415.mo582(new C0888(c8380));
    }

    @Override // p160.AbstractC8377
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo627(C8380 c8380) {
        this.f415.mo583(new C0888(c8380));
    }

    @Override // p160.AbstractC8377
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo628() {
        this.f415.mo584();
    }

    @Override // p160.AbstractC8377
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo629() {
        this.f415.mo585();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m630(boolean z) {
        this.f414 = z;
        m13341(z && this.f415.f412);
    }
}
