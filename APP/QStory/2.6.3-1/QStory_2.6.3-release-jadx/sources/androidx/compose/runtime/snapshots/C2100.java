package androidx.compose.runtime.snapshots;

import p138.C8224;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2100 extends AbstractC2090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f4024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8224 f4025;

    public C2100(long j, C8224 c8224) {
        super(j);
        this.f4025 = c8224;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2090
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2090 mo2756(long j) {
        return new C2100(j, this.f4025);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2090
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2757(AbstractC2090 abstractC2090) {
        synchronized (AbstractC2109.f4050) {
            abstractC2090.getClass();
            this.f4025 = ((C2100) abstractC2090).f4025;
            this.f4024 = ((C2100) abstractC2090).f4024;
        }
    }
}
