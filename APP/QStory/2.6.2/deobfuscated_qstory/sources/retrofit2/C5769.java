package retrofit2;

import java.io.IOException;
import p005.C6108;
import p005.InterfaceC6119;
import p015.AbstractC6201;
import p015.C6217;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5769 extends AbstractC6201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public IOException f15839;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6108 f15840;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC6201 f15841;

    public C5769(AbstractC6201 abstractC6201) {
        this.f15841 = abstractC6201;
        this.f15840 = new C6108(new C5785(this, abstractC6201.mo11110()));
    }

    @Override // p015.AbstractC6201, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15841.close();
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6217 mo11108() {
        return this.f15841.mo11108();
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo11109() {
        return this.f15841.mo11109();
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6119 mo11110() {
        return this.f15840;
    }
}
