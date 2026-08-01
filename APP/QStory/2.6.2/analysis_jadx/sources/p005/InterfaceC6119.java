package p005;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6119 extends InterfaceC6110, ReadableByteChannel {
    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    ByteString mo11467();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    String mo11472(long j);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    String mo11473(Charset charset);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    long mo11475(C6101 c6101);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    boolean mo11479(long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    C6101 mo11482();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    ByteString mo11487(long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    int mo11490(C6118 c6118);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    void mo11493(long j);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    InputStream mo11497();
}
