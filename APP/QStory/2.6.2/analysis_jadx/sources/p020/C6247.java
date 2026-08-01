package p020;

import p005.C6099;
import p005.C6101;
import p005.C6116;
import p005.C6122;
import p005.InterfaceC6112;
import p017.AbstractC6233;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6247 implements InterfaceC6112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f17204;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6252 f17205;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6122 f17206;

    public C6247(C6252 c6252) {
        this.f17205 = c6252;
        this.f17206 = new C6122(((C6116) c6252.f17222.f318).f16698.mo10878());
    }

    @Override // p005.InterfaceC6112, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17204) {
            return;
        }
        this.f17204 = true;
        C6122 c6122 = this.f17206;
        C6099 c6099 = c6122.f16704;
        c6122.f16704 = C6099.f16653;
        c6099.mo11461();
        c6099.mo11460();
        this.f17205.f17221 = 3;
    }

    @Override // p005.InterfaceC6112, java.io.Flushable
    public final void flush() {
        if (this.f17204) {
            return;
        }
        ((C6116) this.f17205.f17222.f318).flush();
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo10877(C6101 c6101, long j) {
        if (this.f17204) {
            C5919.m11250("closed");
        } else {
            AbstractC6233.m11691(c6101.f16657, 0L, j);
            ((C6116) this.f17205.f17222.f318).mo10877(c6101, j);
        }
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10878() {
        return this.f17206;
    }
}
