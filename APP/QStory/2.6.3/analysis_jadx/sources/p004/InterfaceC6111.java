package p004;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6111 extends InterfaceC6103, WritableByteChannel {
    @Override // p004.InterfaceC6103, java.io.Flushable
    void flush();

    InterfaceC6111 write(byte[] bArr);

    InterfaceC6111 writeByte(int i);

    InterfaceC6111 writeInt(int i);

    InterfaceC6111 writeShort(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    InterfaceC6111 mo11459(ByteString byteString);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    InterfaceC6111 mo11463(String str);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    InterfaceC6111 mo11465(byte[] bArr, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    long mo11468(InterfaceC6101 interfaceC6101);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    C6092 mo11476();
}
