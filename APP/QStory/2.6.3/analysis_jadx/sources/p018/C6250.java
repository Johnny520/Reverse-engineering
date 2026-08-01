package p018;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6250 implements InterfaceC6249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC6249 f17217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6255 f17218;

    public C6250(InterfaceC6255 interfaceC6255) {
        this.f17218 = interfaceC6255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final synchronized InterfaceC6249 m11734(SSLSocket sSLSocket) {
        try {
            if (this.f17217 == null && this.f17218.mo8274(sSLSocket)) {
                this.f17217 = this.f17218.mo8277(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17217;
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11728(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        InterfaceC6249 interfaceC6249M11734 = m11734(sSLSocket);
        if (interfaceC6249M11734 != null) {
            interfaceC6249M11734.mo11728(sSLSocket, str, list);
        }
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11729(SSLSocket sSLSocket) {
        InterfaceC6249 interfaceC6249M11734 = m11734(sSLSocket);
        if (interfaceC6249M11734 != null) {
            return interfaceC6249M11734.mo11729(sSLSocket);
        }
        return null;
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11730(SSLSocket sSLSocket) {
        return this.f17218.mo8274(sSLSocket);
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11731() {
        return true;
    }
}
