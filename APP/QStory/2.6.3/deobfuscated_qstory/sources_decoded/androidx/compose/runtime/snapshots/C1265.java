package androidx.compose.runtime.snapshots;

import p122.C7395;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1265 extends AbstractC1255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f3679;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7395 f3680;

    public C1265(long j, C7395 c7395) {
        super(j);
        this.f3680 = c7395;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC1255 mo2196(long j) {
        return new C1265(j, this.f3680);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2197(AbstractC1255 abstractC1255) {
        synchronized (AbstractC1274.f3705) {
            abstractC1255.getClass();
            this.f3680 = ((C1265) abstractC1255).f3680;
            this.f3679 = ((C1265) abstractC1255).f3679;
        }
    }
}
