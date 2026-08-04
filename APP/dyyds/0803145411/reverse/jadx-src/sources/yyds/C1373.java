package yyds;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: yyds.ᛶᛷᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1373 implements InterfaceC0881 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2413 f6405 = new C2413();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final boolean f6406;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC0155.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC0155.m703()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f6406 = z;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final String mo844(SSLSocket sSLSocket) {
        if (mo845(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo845(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo846() {
        return f6406;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo847(SSLSocket sSLSocket, String str, List list) {
        if (mo845(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C1966 c1966 = AbstractC1325.f6087;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C0135.m601(list).toArray(new String[0]));
        }
    }
}
