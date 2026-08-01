package retrofit2;

import p005.InterfaceC6119;
import p015.AbstractC6201;
import p015.C6217;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5768 extends AbstractC6201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f15837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6217 f15838;

    public C5768(C6217 c6217, long j) {
        this.f15838 = c6217;
        this.f15837 = j;
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6217 mo11108() {
        return this.f15838;
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long mo11109() {
        return this.f15837;
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6119 mo11110() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
