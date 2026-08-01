package p020;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p005.C6101;
import p015.C6222;
import p015.C6224;
import p017.AbstractC6238;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6248 extends AbstractC6251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17207;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C6252 f17208;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6248(C6252 c6252, C6222 c6222, long j) {
        super(c6252, c6222);
        c6222.getClass();
        this.f17208 = c6252;
        this.f17207 = j;
        if (j == 0) {
            m11726(C6224.f17131);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM11708;
        if (this.f17217) {
            return;
        }
        if (this.f17207 != 0) {
            TimeZone timeZone = AbstractC6238.f17190;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM11708 = AbstractC6238.m11708(this, 100);
            } catch (IOException unused) {
                zM11708 = false;
            }
            if (!zM11708) {
                this.f17208.f17223.mo11602();
                m11726(C6252.f17219);
            }
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
        long j2 = this.f17207;
        if (j2 == 0) {
            return -1L;
        }
        long jMo10876 = super.mo10876(c6101, Math.min(j2, 8192L));
        if (jMo10876 == -1) {
            this.f17208.f17223.mo11602();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m11726(C6252.f17219);
            throw protocolException;
        }
        long j3 = this.f17207 - jMo10876;
        this.f17207 = j3;
        if (j3 == 0) {
            m11726(C6224.f17131);
        }
        return jMo10876;
    }
}
