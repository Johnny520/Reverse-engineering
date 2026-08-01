package p034;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p033.AbstractC7067;
import p321.C9452;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7083 implements InterfaceC7078 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f17566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7085 f17567 = new C7085();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC7086.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC7086.m12321()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f17566 = z;
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12287(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo12289(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            AbstractC7067 abstractC7067 = AbstractC7067.f17543;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C9452.m14869(list).toArray(new String[0]));
        }
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo12288(SSLSocket sSLSocket) {
        if (mo12289(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12289(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo12290() {
        return f17566;
    }
}
