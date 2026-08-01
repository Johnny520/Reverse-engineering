package p018;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6256 implements InterfaceC6255 {
    @Override // p018.InterfaceC6255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8274(SSLSocket sSLSocket) {
        return C6254.f17221 && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p018.InterfaceC6255
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC6249 mo8277(SSLSocket sSLSocket) {
        return new C6254();
    }
}
