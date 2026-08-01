package p005;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6120 extends InterfaceC6112, WritableByteChannel {
    @Override // p005.InterfaceC6112, java.io.Flushable
    void flush();

    InterfaceC6120 write(byte[] bArr);

    InterfaceC6120 writeByte(int i);

    InterfaceC6120 writeInt(int i);

    InterfaceC6120 writeShort(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    InterfaceC6120 mo11464(ByteString byteString);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    InterfaceC6120 mo11470(byte[] bArr, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    InterfaceC6120 mo11477(String str);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    C6101 mo11482();

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    long mo11495(InterfaceC6110 interfaceC6110);
}
