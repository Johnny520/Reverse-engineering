package androidx.activity;

import p144.AbstractC7548;
import p144.C7551;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0035 extends AbstractC7548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f69;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC0034 f70;

    public C0035(AbstractC0034 abstractC0034, C0033 c0033) {
        super(c0033, abstractC0034.f67);
        this.f70 = abstractC0034;
        this.f69 = true;
    }

    @Override // p144.AbstractC7548
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo66(C7551 c7551) {
        c7551.getClass();
        this.f70.mo22(new C0041(c7551));
    }

    @Override // p144.AbstractC7548
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo67(C7551 c7551) {
        this.f70.mo23(new C0041(c7551));
    }

    @Override // p144.AbstractC7548
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo68() {
        this.f70.mo24();
    }

    @Override // p144.AbstractC7548
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo69() {
        this.f70.mo25();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m70(boolean z) {
        this.f69 = z;
        m12782(z && this.f70.f67);
    }
}
