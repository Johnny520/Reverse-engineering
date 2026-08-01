package retrofit2;

import java.io.IOException;
import p020.C6928;
import p020.InterfaceC6939;
import p023.AbstractC6957;
import p023.C6973;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6600 extends AbstractC6957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public IOException f16184;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6928 f16185;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC6957 f16186;

    public C6600(AbstractC6957 abstractC6957) {
        this.f16186 = abstractC6957;
        this.f16185 = new C6928(new C6616(this, abstractC6957.mo11726()));
    }

    @Override // p023.AbstractC6957, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16186.close();
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6973 mo11724() {
        return this.f16186.mo11724();
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo11725() {
        return this.f16186.mo11725();
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6939 mo11726() {
        return this.f16185;
    }
}
