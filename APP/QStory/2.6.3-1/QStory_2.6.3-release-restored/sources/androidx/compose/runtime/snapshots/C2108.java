package androidx.compose.runtime.snapshots;

import p139.C8230;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2108 extends AbstractC2090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f4048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8230 f4049;

    public C2108(long j, C8230 c8230) {
        super(j);
        this.f4049 = c8230;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2090
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2090 mo2756(long j) {
        return new C2108(j, this.f4049);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2090
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2757(AbstractC2090 abstractC2090) {
        abstractC2090.getClass();
        C2108 c2108 = (C2108) abstractC2090;
        synchronized (AbstractC2109.f4051) {
            this.f4049 = c2108.f4049;
            this.f4048 = c2108.f4048;
        }
    }
}
