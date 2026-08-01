package p034;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7085 implements InterfaceC7084 {
    @Override // p034.InterfaceC7084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8833(SSLSocket sSLSocket) {
        return C7083.f17566 && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p034.InterfaceC7084
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC7078 mo8836(SSLSocket sSLSocket) {
        return new C7083();
    }
}
