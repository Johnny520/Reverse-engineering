package p036;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p020.C6921;
import p023.C6978;
import p023.C6980;
import p029.AbstractC7059;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7116 extends AbstractC7119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17699;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C7120 f17700;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7116(C7120 c7120, C6978 c6978, long j) {
        super(c7120, c6978);
        c6978.getClass();
        this.f17700 = c7120;
        this.f17699 = j;
        if (j == 0) {
            m12376(C6980.f17237);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM12259;
        if (this.f17709) {
            return;
        }
        if (this.f17699 != 0) {
            TimeZone timeZone = AbstractC7059.f17512;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM12259 = AbstractC7059.m12259(this, 100);
            } catch (IOException unused) {
                zM12259 = false;
            }
            if (!zM12259) {
                this.f17700.f17715.mo12180();
                m12376(C7120.f17711);
            }
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
        long j2 = this.f17699;
        if (j2 == 0) {
            return -1L;
        }
        long jMo11491 = super.mo11491(c6921, Math.min(j2, 8192L));
        if (jMo11491 == -1) {
            this.f17700.f17715.mo12180();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m12376(C7120.f17711);
            throw protocolException;
        }
        long j3 = this.f17699 - jMo11491;
        this.f17699 = j3;
        if (j3 == 0) {
            m12376(C6980.f17237);
        }
        return jMo11491;
    }
}
