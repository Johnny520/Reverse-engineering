package p018;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p017.AbstractC6238;
import p305.C8623;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6254 implements InterfaceC6249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f17221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6256 f17222 = new C6256();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC6257.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC6257.m11762()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f17221 = z;
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11728(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo11730(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            AbstractC6238 abstractC6238 = AbstractC6238.f17198;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C8623.m14310(list).toArray(new String[0]));
        }
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11729(SSLSocket sSLSocket) {
        if (mo11730(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11730(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11731() {
        return f17221;
    }
}
