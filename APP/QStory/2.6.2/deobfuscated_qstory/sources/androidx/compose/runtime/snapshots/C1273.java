package androidx.compose.runtime.snapshots;

import p123.C7400;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1273 extends AbstractC1255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f3702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7400 f3703;

    public C1273(long j, C7400 c7400) {
        super(j);
        this.f3703 = c7400;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC1255 mo2186(long j) {
        return new C1273(j, this.f3703);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2187(AbstractC1255 abstractC1255) {
        abstractC1255.getClass();
        C1273 c1273 = (C1273) abstractC1255;
        synchronized (AbstractC1274.f3705) {
            this.f3703 = c1273.f3703;
            this.f3702 = c1273.f3702;
        }
    }
}
