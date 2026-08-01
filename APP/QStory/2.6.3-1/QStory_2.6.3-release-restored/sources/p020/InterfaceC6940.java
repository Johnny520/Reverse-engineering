package p020;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6940 extends InterfaceC6932, WritableByteChannel {
    @Override // p020.InterfaceC6932, java.io.Flushable
    void flush();

    InterfaceC6940 write(byte[] bArr);

    InterfaceC6940 writeByte(int i);

    InterfaceC6940 writeInt(int i);

    InterfaceC6940 writeShort(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    InterfaceC6940 mo12018(ByteString byteString);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    InterfaceC6940 mo12022(String str);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    InterfaceC6940 mo12024(byte[] bArr, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    long mo12027(InterfaceC6930 interfaceC6930);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    C6921 mo12035();
}
