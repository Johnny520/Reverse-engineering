package androidx.compose.runtime.snapshots;

import p140.AbstractC8244;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2095 extends AbstractC2090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f4003;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f4004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC8244 f4005;

    public C2095(long j, AbstractC8244 abstractC8244) {
        super(j);
        this.f4005 = abstractC8244;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2090
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2090 mo2756(long j) {
        return new C2095(j, this.f4005);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2090
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2757(AbstractC2090 abstractC2090) {
        synchronized (AbstractC2109.f4052) {
            abstractC2090.getClass();
            this.f4005 = ((C2095) abstractC2090).f4005;
            this.f4004 = ((C2095) abstractC2090).f4004;
            this.f4003 = ((C2095) abstractC2090).f4003;
        }
    }
}
