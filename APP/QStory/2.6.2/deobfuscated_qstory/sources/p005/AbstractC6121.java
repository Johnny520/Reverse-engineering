package p005;

import java.io.IOException;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6121 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6110 f16703;

    public AbstractC6121(InterfaceC6110 interfaceC6110) {
        interfaceC6110.getClass();
        this.f16703 = interfaceC6110;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16703.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f16703 + ')';
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return this.f16703.mo10875();
    }
}
