package p020;

import java.io.IOException;
import p005.C6101;
import p015.C6224;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6246 extends AbstractC6251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17203;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17217) {
            return;
        }
        if (!this.f17203) {
            m11726(C6252.f17219);
        }
        this.f17217 = true;
    }

    @Override // p020.AbstractC6251, p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) throws IOException {
        c6101.getClass();
        if (this.f17217) {
            C5919.m11250("closed");
            return 0L;
        }
        if (this.f17203) {
            return -1L;
        }
        long jMo10876 = super.mo10876(c6101, 8192L);
        if (jMo10876 != -1) {
            return jMo10876;
        }
        this.f17203 = true;
        m11726(C6224.f17131);
        return -1L;
    }
}
