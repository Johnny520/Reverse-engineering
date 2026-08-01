package p013;

import p004.C6090;
import p004.C6092;
import p004.C6099;
import p004.InterfaceC6101;
import p004.InterfaceC6110;
import p007.AbstractC6128;
import p007.C6144;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6227 extends AbstractC6128 implements InterfaceC6101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f17160;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6144 f17161;

    public C6227(C6144 c6144, long j) {
        this.f17161 = c6144;
        this.f17160 = j;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) {
        c6092.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C6144 mo11165() {
        return this.f17161;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return C6090.f16643;
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final long mo11166() {
        return this.f17160;
    }

    @Override // p007.AbstractC6128
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC6110 mo11167() {
        return new C6099(this);
    }

    @Override // p007.AbstractC6128, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
