package Yue;

import Yue.InterfaceC7490;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4362 implements InterfaceC7490 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC0386 f837;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public InterfaceC7490 f838;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۧۧ$ۥ */
    public interface InterfaceC0386 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo297(@InterfaceC6399 SSLSocket sSLSocket);

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        InterfaceC7490 mo298(@InterfaceC6399 SSLSocket sSLSocket);
    }

    public C4362(@InterfaceC6399 InterfaceC0386 interfaceC0386) {
        C5499.m17103(interfaceC0386, "socketAdapterFactory");
        this.f837 = interfaceC0386;
    }

    @Override // Yue.InterfaceC7490
    public boolean isSupported() {
        return true;
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ */
    public boolean mo279(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        return this.f837.mo297(sSLSocket);
    }

    @Override // Yue.InterfaceC7490
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo280(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        InterfaceC7490 interfaceC7490M12615 = m12615(sSLSocket);
        if (interfaceC7490M12615 != null) {
            return interfaceC7490M12615.mo280(sSLSocket);
        }
        return null;
    }

    @Override // Yue.InterfaceC7490
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ */
    public X509TrustManager mo6565(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        return InterfaceC7490.C1277.m3684(this, sSLSocketFactory);
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo6566(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        return InterfaceC7490.C1277.m3683(this, sSLSocketFactory);
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo6567(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<? extends EnumC6835> list) {
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
        InterfaceC7490 interfaceC7490M12615 = m12615(sSLSocket);
        if (interfaceC7490M12615 != null) {
            interfaceC7490M12615.mo6567(sSLSocket, str, list);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final synchronized InterfaceC7490 m12615(SSLSocket sSLSocket) {
        try {
            if (this.f838 == null && this.f837.mo297(sSLSocket)) {
                this.f838 = this.f837.mo298(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f838;
    }
}
