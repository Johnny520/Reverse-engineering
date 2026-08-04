package yyds;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: yyds.ᲇᛳᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2413 implements InterfaceC1504 {
    @Override // yyds.InterfaceC1504
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo1859(SSLSocket sSLSocket) {
        return C1373.f6406 && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // yyds.InterfaceC1504
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final InterfaceC0881 mo1864(SSLSocket sSLSocket) {
        return new C1373();
    }
}
