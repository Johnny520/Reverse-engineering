package p179i4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p110W0.C1577b;
import p117X2.AbstractC1665j;
import p173h4.AbstractC2263d;

/* JADX INFO: renamed from: i4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2356k implements InterfaceC2359n {

    /* JADX INFO: renamed from: a */
    public static final C2354i f7654a = new C2354i();

    /* JADX INFO: renamed from: b */
    public static final boolean f7655b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        boolean z5 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC2355j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC2355j.m4214a()) {
                    z5 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f7655b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: a */
    public final boolean mo4172a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: b */
    public final String mo4173b(SSLSocket sSLSocket) {
        if (mo4172a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: c */
    public final boolean mo4174c() {
        return f7655b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: d */
    public final void mo4175d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1665j.m2985e(list, "protocols");
        if (mo4172a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C1577b.m2844l(list).toArray(new String[0]));
        }
    }
}
