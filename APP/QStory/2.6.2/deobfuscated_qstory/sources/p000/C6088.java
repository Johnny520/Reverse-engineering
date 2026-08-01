package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p019.AbstractC6241;
import p305.C8631;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子楪苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6088 implements InterfaceC6083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f16642;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6090 f16643 = new C6090();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC6091.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC6091.m11445()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f16642 = z;
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11380(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo11382(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            AbstractC6241 abstractC6241 = AbstractC6241.f17194;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C8631.m14291(list).toArray(new String[0]));
        }
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11381(SSLSocket sSLSocket) {
        if (mo11382(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11382(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11383() {
        return f16642;
    }
}
