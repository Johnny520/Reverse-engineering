package p004;

import java.io.IOException;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6112 implements InterfaceC6101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6101 f16693;

    public AbstractC6112(InterfaceC6101 interfaceC6101) {
        interfaceC6101.getClass();
        this.f16693 = interfaceC6101;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16693.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f16693 + ')';
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return this.f16693.mo10933();
    }
}
