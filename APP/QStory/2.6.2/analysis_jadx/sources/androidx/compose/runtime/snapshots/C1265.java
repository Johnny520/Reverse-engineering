package androidx.compose.runtime.snapshots;

import p122.C7394;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1265 extends AbstractC1255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f3678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7394 f3679;

    public C1265(long j, C7394 c7394) {
        super(j);
        this.f3679 = c7394;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC1255 mo2186(long j) {
        return new C1265(j, this.f3679);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2187(AbstractC1255 abstractC1255) {
        synchronized (AbstractC1274.f3704) {
            abstractC1255.getClass();
            this.f3679 = ((C1265) abstractC1255).f3679;
            this.f3678 = ((C1265) abstractC1255).f3678;
        }
    }
}
