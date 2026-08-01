package p118X3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p061L2.AbstractC0972l;
import p069N2.C1020b;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;

/* JADX INFO: renamed from: X3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1700j {

    /* JADX INFO: renamed from: e */
    public static final C1700j f5829e;

    /* JADX INFO: renamed from: f */
    public static final C1700j f5830f;

    /* JADX INFO: renamed from: a */
    public final boolean f5831a;

    /* JADX INFO: renamed from: b */
    public final boolean f5832b;

    /* JADX INFO: renamed from: c */
    public final String[] f5833c;

    /* JADX INFO: renamed from: d */
    public final String[] f5834d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1698h c1698h = C1698h.f5821r;
        C1698h c1698h2 = C1698h.f5822s;
        C1698h c1698h3 = C1698h.f5823t;
        C1698h c1698h4 = C1698h.f5815l;
        C1698h c1698h5 = C1698h.f5817n;
        C1698h c1698h6 = C1698h.f5816m;
        C1698h c1698h7 = C1698h.f5818o;
        C1698h c1698h8 = C1698h.f5820q;
        C1698h c1698h9 = C1698h.f5819p;
        List listM1987K = AbstractC0972l.m1987K(new C1698h[]{c1698h, c1698h2, c1698h3, c1698h4, c1698h5, c1698h6, c1698h7, c1698h8, c1698h9});
        List listM1987K2 = AbstractC0972l.m1987K(new C1698h[]{c1698h, c1698h2, c1698h3, c1698h4, c1698h5, c1698h6, c1698h7, c1698h8, c1698h9, C1698h.f5813j, C1698h.f5814k, C1698h.f5811h, C1698h.f5812i, C1698h.f5809f, C1698h.f5810g, C1698h.f5808e});
        C1699i c1699i = new C1699i();
        C1698h[] c1698hArr = (C1698h[]) listM1987K.toArray(new C1698h[0]);
        c1699i.m3013b((C1698h[]) Arrays.copyOf(c1698hArr, c1698hArr.length));
        EnumC1689K enumC1689K = EnumC1689K.f5767f;
        EnumC1689K enumC1689K2 = EnumC1689K.f5768g;
        c1699i.m3015d(enumC1689K, enumC1689K2);
        c1699i.f5828d = true;
        c1699i.m3012a();
        C1699i c1699i2 = new C1699i();
        C1698h[] c1698hArr2 = (C1698h[]) listM1987K2.toArray(new C1698h[0]);
        c1699i2.m3013b((C1698h[]) Arrays.copyOf(c1698hArr2, c1698hArr2.length));
        c1699i2.m3015d(enumC1689K, enumC1689K2);
        c1699i2.f5828d = true;
        f5829e = c1699i2.m3012a();
        C1699i c1699i3 = new C1699i();
        C1698h[] c1698hArr3 = (C1698h[]) listM1987K2.toArray(new C1698h[0]);
        c1699i3.m3013b((C1698h[]) Arrays.copyOf(c1698hArr3, c1698hArr3.length));
        c1699i3.m3015d(enumC1689K, enumC1689K2, EnumC1689K.f5769h, EnumC1689K.f5770i);
        c1699i3.f5828d = true;
        c1699i3.m3012a();
        f5830f = new C1700j(false, false, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1700j(boolean z5, boolean z6, String[] strArr, String[] strArr2) {
        this.f5831a = z5;
        this.f5832b = z6;
        this.f5833c = strArr;
        this.f5834d = strArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3017a(SSLSocket sSLSocket, boolean z5) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        AbstractC1665j.m2982b(enabledCipherSuites);
        String[] strArr = this.f5833c;
        if (strArr != null) {
            enabledCipherSuites = AbstractC1774e.m3168i(strArr, enabledCipherSuites, C1698h.f5806c);
        }
        String[] strArr2 = this.f5834d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC1665j.m2984d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = AbstractC1774e.m3168i(enabledProtocols2, strArr2, C1020b.f3162b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC1665j.m2982b(supportedCipherSuites);
        C1697g c1697g = C1698h.f5806c;
        byte[] bArr = AbstractC1774e.f6072a;
        int length = supportedCipherSuites.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            } else if (c1697g.compare(supportedCipherSuites[i5], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i5++;
            }
        }
        if (z5 && i5 != -1) {
            String str = supportedCipherSuites[i5];
            AbstractC1665j.m2984d(str, "get(...)");
            AbstractC1665j.m2985e(enabledCipherSuites, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C1699i c1699i = new C1699i();
        c1699i.f5825a = this.f5831a;
        c1699i.f5826b = strArr;
        c1699i.f5827c = strArr2;
        c1699i.f5828d = this.f5832b;
        c1699i.m3014c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        c1699i.m3016e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C1700j c1700jM3012a = c1699i.m3012a();
        if (c1700jM3012a.m3019c() != null) {
            sSLSocket.setEnabledProtocols(c1700jM3012a.f5834d);
        }
        if (c1700jM3012a.m3018b() != null) {
            sSLSocket.setEnabledCipherSuites(c1700jM3012a.f5833c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final ArrayList m3018b() {
        String[] strArr = this.f5833c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1698h.f5805b.m3011b(str));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final ArrayList m3019c() {
        String[] strArr = this.f5834d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            EnumC1689K.f5766e.getClass();
            arrayList.add(C1692b.m3009c(str));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1700j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1700j c1700j = (C1700j) obj;
        boolean z5 = c1700j.f5831a;
        boolean z6 = this.f5831a;
        if (z6 != z5) {
            return false;
        }
        if (z6) {
            return Arrays.equals(this.f5833c, c1700j.f5833c) && Arrays.equals(this.f5834d, c1700j.f5834d) && this.f5832b == c1700j.f5832b;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        if (!this.f5831a) {
            return 17;
        }
        String[] strArr = this.f5833c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f5834d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f5832b ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (!this.f5831a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m3018b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m3019c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f5832b + ')';
    }
}
