package p035;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import p020.C6919;
import p020.C6921;
import p020.InterfaceC6930;
import p020.InterfaceC6939;
import p029.AbstractC7054;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7105 implements InterfaceC6930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f17638;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f17639;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f17640;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17641;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17642;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6939 f17643;

    public C7105(InterfaceC6939 interfaceC6939) {
        interfaceC6939.getClass();
        this.f17643 = interfaceC6939;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) throws IOException {
        int i;
        int i2;
        c6921.getClass();
        do {
            int i3 = this.f17638;
            InterfaceC6939 interfaceC6939 = this.f17643;
            if (i3 == 0) {
                interfaceC6939.skip(this.f17640);
                this.f17640 = 0;
                if ((this.f17642 & 4) == 0) {
                    i = this.f17639;
                    int iM12245 = AbstractC7054.m12245(interfaceC6939);
                    this.f17638 = iM12245;
                    this.f17641 = iM12245;
                    int i4 = interfaceC6939.readByte() & DefaultClassResolver.NAME;
                    this.f17642 = interfaceC6939.readByte() & DefaultClassResolver.NAME;
                    Logger logger = C7097.f17604;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = AbstractC7108.f17681;
                        logger.fine(AbstractC7108.m12373(true, this.f17639, this.f17641, i4, this.f17642));
                    }
                    i2 = interfaceC6939.readInt() & Integer.MAX_VALUE;
                    this.f17639 = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo11491 = interfaceC6939.mo11491(c6921, Math.min(8192L, i3));
                if (jMo11491 != -1) {
                    this.f17638 -= (int) jMo11491;
                    return jMo11491;
                }
            }
            return -1L;
        } while (i2 == i);
        C6755.m11866("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11492() {
        return this.f17643.mo11492();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
