package p036;

import java.io.IOException;
import p020.C6921;
import p023.C6980;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7114 extends AbstractC7119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17695;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17709) {
            return;
        }
        if (!this.f17695) {
            m12376(C7120.f17711);
        }
        this.f17709 = true;
    }

    @Override // p036.AbstractC7119, p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) throws IOException {
        c6921.getClass();
        if (this.f17709) {
            C6755.m11870("closed");
            return 0L;
        }
        if (this.f17695) {
            return -1L;
        }
        long jMo11491 = super.mo11491(c6921, 8192L);
        if (jMo11491 != -1) {
            return jMo11491;
        }
        this.f17695 = true;
        m12376(C6980.f17237);
        return -1L;
    }
}
