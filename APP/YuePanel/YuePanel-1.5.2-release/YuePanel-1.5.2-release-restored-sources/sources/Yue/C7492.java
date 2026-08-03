package Yue;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7492 {
    public C7492() {
        throw new IllegalStateException("Utility class");
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m3685(C8414 c8414, ByteChannel byteChannel) throws IOException {
        InterfaceC8533 interfaceC8533;
        if (c8414 == null) {
            return false;
        }
        ByteBuffer byteBufferPeek = c8414.f25136.peek();
        if (byteBufferPeek == null) {
            if (byteChannel instanceof InterfaceC8533) {
                interfaceC8533 = (InterfaceC8533) byteChannel;
                if (interfaceC8533.mo5926()) {
                    interfaceC8533.mo5924();
                }
            }
            if (c8414.f25136.isEmpty() && c8414.mo28024() && c8414.mo28018() != null && c8414.mo28018().m13179() != null && c8414.mo28018().m13179() == EnumC7178.SERVER) {
                c8414.m28089();
            }
            return (interfaceC8533 == null && ((InterfaceC8533) byteChannel).mo5926()) ? false : true;
        }
        do {
            byteChannel.write(byteBufferPeek);
            if (byteBufferPeek.remaining() > 0) {
                return false;
            }
            c8414.f25136.poll();
            byteBufferPeek = c8414.f25136.peek();
        } while (byteBufferPeek != null);
        interfaceC8533 = null;
        if (c8414.f25136.isEmpty()) {
            c8414.m28089();
        }
        if (interfaceC8533 == null) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m3686(ByteBuffer byteBuffer, C8414 c8414, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int i = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (i != -1) {
            return i != 0;
        }
        c8414.m28097();
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m23444(ByteBuffer byteBuffer, C8414 c8414, InterfaceC8533 interfaceC8533) throws IOException {
        byteBuffer.clear();
        int iMo5925 = interfaceC8533.mo5925(byteBuffer);
        byteBuffer.flip();
        if (iMo5925 != -1) {
            return interfaceC8533.mo5927();
        }
        c8414.m28097();
        return false;
    }
}
