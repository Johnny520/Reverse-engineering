package p004;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6110 extends InterfaceC6101, ReadableByteChannel {
    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    ByteString mo11460();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    int mo11467(C6109 c6109);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    String mo11469(Charset charset);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    boolean mo11473(long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    C6092 mo11476();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    String mo11479(long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    ByteString mo11481(long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    void mo11487(long j);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    long mo11489(C6092 c6092);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    InputStream mo11490();
}
