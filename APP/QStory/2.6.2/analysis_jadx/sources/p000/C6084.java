package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子楪苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6084 implements InterfaceC6083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC6083 f16635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6089 f16636;

    public C6084(InterfaceC6089 interfaceC6089) {
        this.f16636 = interfaceC6089;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final synchronized InterfaceC6083 m11386(SSLSocket sSLSocket) {
        try {
            if (this.f16635 == null && this.f16636.mo11379(sSLSocket)) {
                this.f16635 = this.f16636.mo11378(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f16635;
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11380(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        InterfaceC6083 interfaceC6083M11386 = m11386(sSLSocket);
        if (interfaceC6083M11386 != null) {
            interfaceC6083M11386.mo11380(sSLSocket, str, list);
        }
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11381(SSLSocket sSLSocket) {
        InterfaceC6083 interfaceC6083M11386 = m11386(sSLSocket);
        if (interfaceC6083M11386 != null) {
            return interfaceC6083M11386.mo11381(sSLSocket);
        }
        return null;
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11382(SSLSocket sSLSocket) {
        return this.f16636.mo11379(sSLSocket);
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11383() {
        return true;
    }
}
