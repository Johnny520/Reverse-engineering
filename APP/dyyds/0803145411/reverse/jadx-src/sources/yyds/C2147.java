package yyds;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: renamed from: yyds.ᲀᲈᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2147 implements InterfaceC0881 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2339 f10587 = new C2339();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final boolean f10588;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, C2810.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f10588 = z;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final String mo844(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo845(SSLSocket sSLSocket) {
        return false;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo846() {
        return f10588;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo847(SSLSocket sSLSocket, String str, List list) {
        if (mo845(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C1966 c1966 = AbstractC1325.f6087;
            parameters.setApplicationProtocols((String[]) C0135.m601(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
