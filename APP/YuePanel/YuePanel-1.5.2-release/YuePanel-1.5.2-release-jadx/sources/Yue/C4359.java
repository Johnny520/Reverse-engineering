package Yue;

import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4359 implements InterfaceC8421 {
    @Override // Yue.InterfaceC8421
    public void close() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC8413
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ InterfaceC8409 mo1315(AbstractC8410 abstractC8410, List list) {
        return mo1315(abstractC8410, (List<AbstractC4514>) list);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel; */
    @Override // Yue.InterfaceC8421
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public SocketChannel mo12319(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: ۥ(LYue/ۥۢۥۡۡ;LYue/ۥ۠۠۠۟;)LYue/ۥۢۥۡ۠; */
    @Override // Yue.InterfaceC8413
    /* JADX INFO: renamed from: ۥ */
    public C8414 mo1314(AbstractC8410 abstractC8410, AbstractC4514 abstractC4514) {
        return new C8414(abstractC8410, abstractC4514);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC8421, Yue.InterfaceC8413
    /* JADX INFO: renamed from: ۥ۟ */
    public C8414 mo1315(AbstractC8410 abstractC8410, List<AbstractC4514> list) {
        return new C8414(abstractC8410, list);
    }
}
