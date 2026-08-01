package p020;

import java.io.IOException;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6941 implements InterfaceC6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6930 f17038;

    public AbstractC6941(InterfaceC6930 interfaceC6930) {
        interfaceC6930.getClass();
        this.f17038 = interfaceC6930;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f17038.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f17038 + ')';
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return this.f17038.mo11492();
    }
}
