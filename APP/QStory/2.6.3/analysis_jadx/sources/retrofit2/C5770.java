package retrofit2;

import java.io.IOException;
import p004.C6099;
import p004.InterfaceC6110;
import p007.AbstractC6128;
import p007.C6144;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5770 extends AbstractC6128 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public IOException f15839;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6099 f15840;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC6128 f15841;

    public C5770(AbstractC6128 abstractC6128) {
        this.f15841 = abstractC6128;
        this.f15840 = new C6099(new C5786(this, abstractC6128.mo11167()));
    }

    @Override // p007.AbstractC6128, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15841.close();
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6144 mo11165() {
        return this.f15841.mo11165();
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo11166() {
        return this.f15841.mo11166();
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6110 mo11167() {
        return this.f15840;
    }
}
