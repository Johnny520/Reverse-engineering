package p017;

import p005.C6099;
import p005.C6101;
import p005.C6108;
import p005.InterfaceC6110;
import p005.InterfaceC6119;
import p015.AbstractC6201;
import p015.C6217;

/* JADX INFO: renamed from: 飘花落叶言世兰楪苏子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6235 extends AbstractC6201 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f17183;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6217 f17184;

    public C6235(C6217 c6217, long j) {
        this.f17184 = c6217;
        this.f17183 = j;
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6217 mo11108() {
        return this.f17184;
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return C6099.f16653;
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo11109() {
        return this.f17183;
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) {
        c6101.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p015.AbstractC6201
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6119 mo11110() {
        return new C6108(this);
    }

    @Override // p015.AbstractC6201, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
