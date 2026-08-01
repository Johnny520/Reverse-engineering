package androidx.compose.runtime.snapshots;

import p123.C7401;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1273 extends AbstractC1255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f3703;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7401 f3704;

    public C1273(long j, C7401 c7401) {
        super(j);
        this.f3704 = c7401;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC1255 mo2196(long j) {
        return new C1273(j, this.f3704);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2197(AbstractC1255 abstractC1255) {
        abstractC1255.getClass();
        C1273 c1273 = (C1273) abstractC1255;
        synchronized (AbstractC1274.f3706) {
            this.f3704 = c1273.f3704;
            this.f3703 = c1273.f3703;
        }
    }
}
