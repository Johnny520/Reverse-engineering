package retrofit2;

import p004.InterfaceC6110;
import p007.AbstractC6128;
import p007.C6144;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5769 extends AbstractC6128 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f15837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6144 f15838;

    public C5769(C6144 c6144, long j) {
        this.f15838 = c6144;
        this.f15837 = j;
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6144 mo11165() {
        return this.f15838;
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long mo11166() {
        return this.f15837;
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6110 mo11167() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
