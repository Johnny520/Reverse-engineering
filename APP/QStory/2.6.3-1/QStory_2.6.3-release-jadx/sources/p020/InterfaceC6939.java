package p020;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6939 extends InterfaceC6930, ReadableByteChannel {
    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    ByteString mo12019();

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    int mo12026(C6938 c6938);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    String mo12028(Charset charset);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    boolean mo12032(long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    C6921 mo12035();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    String mo12038(long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    ByteString mo12040(long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    void mo12046(long j);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    long mo12048(C6921 c6921);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    InputStream mo12049();
}
