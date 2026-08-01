package p034;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7079 implements InterfaceC7078 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC7078 f17562;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7084 f17563;

    public C7079(InterfaceC7084 interfaceC7084) {
        this.f17563 = interfaceC7084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final synchronized InterfaceC7078 m12293(SSLSocket sSLSocket) {
        try {
            if (this.f17562 == null && this.f17563.mo8833(sSLSocket)) {
                this.f17562 = this.f17563.mo8836(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17562;
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12287(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        InterfaceC7078 interfaceC7078M12293 = m12293(sSLSocket);
        if (interfaceC7078M12293 != null) {
            interfaceC7078M12293.mo12287(sSLSocket, str, list);
        }
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo12288(SSLSocket sSLSocket) {
        InterfaceC7078 interfaceC7078M12293 = m12293(sSLSocket);
        if (interfaceC7078M12293 != null) {
            return interfaceC7078M12293.mo12288(sSLSocket);
        }
        return null;
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12289(SSLSocket sSLSocket) {
        return this.f17563.mo8833(sSLSocket);
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo12290() {
        return true;
    }
}
