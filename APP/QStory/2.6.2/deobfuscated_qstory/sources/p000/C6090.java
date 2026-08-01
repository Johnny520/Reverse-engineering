package p000;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子楪苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6090 implements InterfaceC6089 {
    @Override // p000.InterfaceC6089
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC6083 mo11378(SSLSocket sSLSocket) {
        return new C6088();
    }

    @Override // p000.InterfaceC6089
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11379(SSLSocket sSLSocket) {
        return C6088.f16642 && Conscrypt.isConscrypt(sSLSocket);
    }
}
