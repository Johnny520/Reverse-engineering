package yyds;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: yyds.ᲇᲁᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2537 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final HostnameVerifier f12494;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f12495;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C0135 f12496;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final InterfaceC2656 f12497;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2098 f12498;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2729 f12499;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final X509TrustManager f12500;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final InterfaceC2656 f12501;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final SocketFactory f12502;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f12503;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final boolean f12504;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int f12505;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public int f12506;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final AbstractC0181 f12507;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C0052 f12508;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final C1985 f12509;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C2342 f12510;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final SSLSocketFactory f12511;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f12512;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final ProxySelector f12513;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f12514;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2115 f12515;

    public C2537(C2729 c2729, ArrayList arrayList, int i, C2115 c2115, C2098 c2098, int i2, int i3, int i4, InterfaceC2656 interfaceC2656, C2342 c2342, C0052 c0052, C1985 c1985, C0135 c0135, HostnameVerifier hostnameVerifier, InterfaceC2656 interfaceC26562, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, AbstractC0181 abstractC0181) {
        this.f12499 = c2729;
        this.f12503 = arrayList;
        this.f12512 = i;
        this.f12515 = c2115;
        this.f12498 = c2098;
        this.f12514 = i2;
        this.f12505 = i3;
        this.f12495 = i4;
        this.f12497 = interfaceC2656;
        this.f12510 = c2342;
        this.f12508 = c0052;
        this.f12509 = c1985;
        this.f12496 = c0135;
        this.f12494 = hostnameVerifier;
        this.f12501 = interfaceC26562;
        this.f12513 = proxySelector;
        this.f12504 = z;
        this.f12502 = socketFactory;
        this.f12511 = sSLSocketFactory;
        this.f12500 = x509TrustManager;
        this.f12507 = abstractC0181;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2537 m4577(C2537 c2537, int i, C2115 c2115, C2098 c2098, int i2) {
        return new C2537(c2537.f12499, c2537.f12503, (i2 & 1) != 0 ? c2537.f12512 : i, (i2 & 2) != 0 ? c2537.f12515 : c2115, (i2 & 4) != 0 ? c2537.f12498 : c2098, c2537.f12514, c2537.f12505, c2537.f12495, c2537.f12497, c2537.f12510, c2537.f12508, c2537.f12509, c2537.f12496, c2537.f12494, c2537.f12501, c2537.f12513, c2537.f12504, c2537.f12502, c2537.f12511, c2537.f12500, c2537.f12507);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0837 m4578(C2098 c2098) {
        ArrayList arrayList = this.f12503;
        int size = arrayList.size();
        int i = this.f12512;
        if (i >= size) {
            C0188.m800("Check failed.");
            return null;
        }
        this.f12506++;
        C2115 c2115 = this.f12515;
        if (c2115 != null) {
            C1864 c1864Mo2232 = ((InterfaceC1028) c2115.f10456).mo2232();
            C0082 c0082 = c2098.f10389;
            C0082 c00822 = c1864Mo2232.f9351.f8234;
            if (c0082.f664 != c00822.f664 || !AbstractC1544.m3188(c0082.f670, c00822.f670)) {
                C1693.m3443(arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.f12506 != 1) {
                C1693.m3443(arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        C2537 c2537M4577 = m4577(this, i2, null, c2098, 2097146);
        C2717 c2717 = (C2717) arrayList.get(i);
        C0837 c0837M4826 = c2717.m4826(c2537M4577);
        if (c0837M4826 == null) {
            throw new NullPointerException("interceptor " + c2717 + " returned null");
        }
        if (c2115 == null || i2 >= arrayList.size() || c2537M4577.f12506 == 1) {
            return c0837M4826;
        }
        C1693.m3443(c2717, " must call proceed() exactly once");
        return null;
    }
}
