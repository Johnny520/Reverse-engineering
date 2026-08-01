package androidx.compose.runtime.snapshots;

import p124.AbstractC7415;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1260 extends AbstractC1255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f3658;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f3659;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC7415 f3660;

    public C1260(long j, AbstractC7415 abstractC7415) {
        super(j);
        this.f3660 = abstractC7415;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC1255 mo2196(long j) {
        return new C1260(j, this.f3660);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2197(AbstractC1255 abstractC1255) {
        synchronized (AbstractC1274.f3707) {
            abstractC1255.getClass();
            this.f3660 = ((C1260) abstractC1255).f3660;
            this.f3659 = ((C1260) abstractC1255).f3659;
            this.f3658 = ((C1260) abstractC1255).f3658;
        }
    }
}
