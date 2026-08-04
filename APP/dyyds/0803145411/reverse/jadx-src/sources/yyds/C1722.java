package yyds;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: yyds.ᛸᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1722 implements InterfaceC0881 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1504 f8709;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public InterfaceC0881 f8710;

    public C1722(InterfaceC1504 interfaceC1504) {
        this.f8709 = interfaceC1504;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final synchronized InterfaceC0881 m3457(SSLSocket sSLSocket) {
        try {
            if (this.f8710 == null && this.f8709.mo1859(sSLSocket)) {
                this.f8710 = this.f8709.mo1864(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8710;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final String mo844(SSLSocket sSLSocket) {
        InterfaceC0881 interfaceC0881M3457 = m3457(sSLSocket);
        if (interfaceC0881M3457 != null) {
            return interfaceC0881M3457.mo844(sSLSocket);
        }
        return null;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo845(SSLSocket sSLSocket) {
        return this.f8709.mo1859(sSLSocket);
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo846() {
        return true;
    }

    @Override // yyds.InterfaceC0881
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo847(SSLSocket sSLSocket, String str, List list) {
        InterfaceC0881 interfaceC0881M3457 = m3457(sSLSocket);
        if (interfaceC0881M3457 != null) {
            interfaceC0881M3457.mo847(sSLSocket, str, list);
        }
    }
}
