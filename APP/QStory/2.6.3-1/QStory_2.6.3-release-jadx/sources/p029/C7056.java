package p029;

import p020.C6919;
import p020.C6921;
import p020.C6928;
import p020.InterfaceC6930;
import p020.InterfaceC6939;
import p023.AbstractC6957;
import p023.C6973;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7056 extends AbstractC6957 implements InterfaceC6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f17505;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6973 f17506;

    public C7056(C6973 c6973, long j) {
        this.f17506 = c6973;
        this.f17505 = j;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) {
        c6921.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6973 mo11724() {
        return this.f17506;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return C6919.f16988;
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo11725() {
        return this.f17505;
    }

    @Override // p023.AbstractC6957
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6939 mo11726() {
        return new C6928(this);
    }

    @Override // p023.AbstractC6957, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
