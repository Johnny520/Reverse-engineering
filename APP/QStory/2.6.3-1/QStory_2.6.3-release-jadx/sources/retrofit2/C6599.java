package retrofit2;

import p020.InterfaceC6939;
import p023.AbstractC6957;
import p023.C6973;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6599 extends AbstractC6957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f16182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6973 f16183;

    public C6599(C6973 c6973, long j) {
        this.f16183 = c6973;
        this.f16182 = j;
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6973 mo11724() {
        return this.f16183;
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long mo11725() {
        return this.f16182;
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6939 mo11726() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
