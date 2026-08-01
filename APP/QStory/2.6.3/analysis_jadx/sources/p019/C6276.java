package p019;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import p004.C6090;
import p004.C6092;
import p004.InterfaceC6101;
import p004.InterfaceC6110;
import p013.AbstractC6225;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6276 implements InterfaceC6101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f17293;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f17294;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f17295;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17296;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17297;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6110 f17298;

    public C6276(InterfaceC6110 interfaceC6110) {
        interfaceC6110.getClass();
        this.f17298 = interfaceC6110;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo10932(C6092 c6092, long j) throws IOException {
        int i;
        int i2;
        c6092.getClass();
        do {
            int i3 = this.f17293;
            InterfaceC6110 interfaceC6110 = this.f17298;
            if (i3 == 0) {
                interfaceC6110.skip(this.f17295);
                this.f17295 = 0;
                if ((this.f17297 & 4) == 0) {
                    i = this.f17294;
                    int iM11686 = AbstractC6225.m11686(interfaceC6110);
                    this.f17293 = iM11686;
                    this.f17296 = iM11686;
                    int i4 = interfaceC6110.readByte() & DefaultClassResolver.NAME;
                    this.f17297 = interfaceC6110.readByte() & DefaultClassResolver.NAME;
                    Logger logger = C6268.f17259;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = AbstractC6279.f17336;
                        logger.fine(AbstractC6279.m11814(true, this.f17294, this.f17296, i4, this.f17297));
                    }
                    i2 = interfaceC6110.readInt() & Integer.MAX_VALUE;
                    this.f17294 = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo10932 = interfaceC6110.mo10932(c6092, Math.min(8192L, i3));
                if (jMo10932 != -1) {
                    this.f17293 -= (int) jMo10932;
                    return jMo10932;
                }
            }
            return -1L;
        } while (i2 == i);
        C5925.m11307("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // p004.InterfaceC6101
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10933() {
        return this.f17298.mo10933();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
