package p022;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import p005.C6099;
import p005.C6101;
import p005.InterfaceC6110;
import p005.InterfaceC6119;
import p017.AbstractC6233;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6280 implements InterfaceC6110 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f17311;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f17312;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f17313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6119 f17316;

    public C6280(InterfaceC6119 interfaceC6119) {
        interfaceC6119.getClass();
        this.f17316 = interfaceC6119;
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10875() {
        return this.f17316.mo10875();
    }

    @Override // p005.InterfaceC6110
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final long mo10876(C6101 c6101, long j) throws IOException {
        int i;
        int i2;
        c6101.getClass();
        do {
            int i3 = this.f17311;
            InterfaceC6119 interfaceC6119 = this.f17316;
            if (i3 == 0) {
                interfaceC6119.skip(this.f17313);
                this.f17313 = 0;
                if ((this.f17315 & 4) == 0) {
                    i = this.f17312;
                    int iM11696 = AbstractC6233.m11696(interfaceC6119);
                    this.f17311 = iM11696;
                    this.f17314 = iM11696;
                    int i4 = interfaceC6119.readByte() & DefaultClassResolver.NAME;
                    this.f17315 = interfaceC6119.readByte() & DefaultClassResolver.NAME;
                    Logger logger = C6272.f17277;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = AbstractC6283.f17354;
                        logger.fine(AbstractC6283.m11797(true, this.f17312, this.f17314, i4, this.f17315));
                    }
                    i2 = interfaceC6119.readInt() & Integer.MAX_VALUE;
                    this.f17312 = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo10876 = interfaceC6119.mo10876(c6101, Math.min(8192L, i3));
                if (jMo10876 != -1) {
                    this.f17311 -= (int) jMo10876;
                    return jMo10876;
                }
            }
            return -1L;
        } while (i2 == i);
        C5919.m11246("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
