package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: uy */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0790uy {

    /* JADX INFO: renamed from: e */
    public static final C0790uy f11548e;

    /* JADX INFO: renamed from: f */
    public static final C0790uy f11549f;

    /* JADX INFO: renamed from: a */
    public final boolean f11550a;

    /* JADX INFO: renamed from: b */
    public final boolean f11551b;

    /* JADX INFO: renamed from: c */
    public final String[] f11552c;

    /* JADX INFO: renamed from: d */
    public final String[] f11553d;

    static {
        C0591ps c0591ps = C0591ps.f8545r;
        C0591ps c0591ps2 = C0591ps.f8546s;
        C0591ps c0591ps3 = C0591ps.f8547t;
        C0591ps c0591ps4 = C0591ps.f8539l;
        C0591ps c0591ps5 = C0591ps.f8541n;
        C0591ps c0591ps6 = C0591ps.f8540m;
        C0591ps c0591ps7 = C0591ps.f8542o;
        C0591ps c0591ps8 = C0591ps.f8544q;
        C0591ps c0591ps9 = C0591ps.f8543p;
        List listM1435P = AbstractC0179eu.m1435P(c0591ps, c0591ps2, c0591ps3, c0591ps4, c0591ps5, c0591ps6, c0591ps7, c0591ps8, c0591ps9);
        List listM1435P2 = AbstractC0179eu.m1435P(c0591ps, c0591ps2, c0591ps3, c0591ps4, c0591ps5, c0591ps6, c0591ps7, c0591ps8, c0591ps9, C0591ps.f8537j, C0591ps.f8538k, C0591ps.f8535h, C0591ps.f8536i, C0591ps.f8533f, C0591ps.f8534g, C0591ps.f8532e);
        C0753ty c0753ty = new C0753ty();
        C0591ps[] c0591psArr = (C0591ps[]) listM1435P.toArray(new C0591ps[0]);
        c0753ty.m5447b((C0591ps[]) Arrays.copyOf(c0591psArr, c0591psArr.length));
        s23 s23Var = s23.f9882j;
        s23 s23Var2 = s23.f9883k;
        c0753ty.m5448c(s23Var, s23Var2);
        c0753ty.f10999d = true;
        c0753ty.m5446a();
        C0753ty c0753ty2 = new C0753ty();
        C0591ps[] c0591psArr2 = (C0591ps[]) listM1435P2.toArray(new C0591ps[0]);
        c0753ty2.m5447b((C0591ps[]) Arrays.copyOf(c0591psArr2, c0591psArr2.length));
        c0753ty2.m5448c(s23Var, s23Var2);
        c0753ty2.f10999d = true;
        f11548e = c0753ty2.m5446a();
        C0753ty c0753ty3 = new C0753ty();
        C0591ps[] c0591psArr3 = (C0591ps[]) listM1435P2.toArray(new C0591ps[0]);
        c0753ty3.m5447b((C0591ps[]) Arrays.copyOf(c0591psArr3, c0591psArr3.length));
        c0753ty3.m5448c(s23Var, s23Var2, s23.f9884l, s23.f9885m);
        c0753ty3.f10999d = true;
        c0753ty3.m5446a();
        f11549f = new C0790uy(false, false, null, null);
    }

    public C0790uy(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f11550a = z;
        this.f11551b = z2;
        this.f11552c = strArr;
        this.f11553d = strArr2;
    }

    /* JADX INFO: renamed from: a */
    public final void m5594a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.f11552c;
        if (strArr != null) {
            enabledCipherSuites = ug3.m5501i(strArr, enabledCipherSuites, C0591ps.f8530c);
        }
        String[] strArr2 = this.f11553d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = ug3.m5501i(enabledProtocols2, strArr2, dm1.f2113b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        sl0 sl0Var = C0591ps.f8530c;
        byte[] bArr = ug3.f11300a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (sl0Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.f11550a;
        if (!z2) {
            C0676s.m4651j("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            C0676s.m4651j("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            C0676s.m4651j("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            C0676s.m4651j("At least one TLS version is required");
            return;
        }
        C0790uy c0790uy = new C0790uy(z2, this.f11551b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (c0790uy.m5596c() != null) {
            sSLSocket.setEnabledProtocols(c0790uy.f11553d);
        }
        if (c0790uy.m5595b() != null) {
            sSLSocket.setEnabledCipherSuites(c0790uy.f11552c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m5595b() {
        String[] strArr = this.f11552c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0591ps.f8529b.m6399j(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m5596c() {
        String[] strArr = this.f11553d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            s23.f9881i.getClass();
            arrayList.add(ix2.m2412e(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0790uy)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0790uy c0790uy = (C0790uy) obj;
        boolean z = c0790uy.f11550a;
        boolean z2 = this.f11550a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f11552c, c0790uy.f11552c) && Arrays.equals(this.f11553d, c0790uy.f11553d) && this.f11551b == c0790uy.f11551b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f11550a) {
            return 17;
        }
        String[] strArr = this.f11552c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f11553d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f11551b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f11550a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m5595b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m5596c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f11551b + ')';
    }
}
