package Yue;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۥۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8421 extends InterfaceC8413 {
    void close();

    @Override // Yue.InterfaceC8413
    /* JADX INFO: renamed from: ۥ */
    C8414 mo1314(AbstractC8410 abstractC8410, AbstractC4514 abstractC4514);

    @Override // Yue.InterfaceC8413
    /* JADX INFO: renamed from: ۥ۟ */
    C8414 mo1315(AbstractC8410 abstractC8410, List<AbstractC4514> list);

    /* JADX INFO: renamed from: ۥ۟۟ */
    ByteChannel mo12319(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException;
}
