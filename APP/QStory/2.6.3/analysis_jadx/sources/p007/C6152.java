package p007;

import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0140;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;
import p013.AbstractC6225;
import p034.AbstractC6347;
import p055.C6568;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final List f16894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final List f16895;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6152 f16896;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6152 f16897;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String[] f16898;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String[] f16899;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f16900;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f16901;

    static {
        C6153 c6153 = C6153.f16912;
        C6153 c61532 = C6153.f16908;
        C6153 c61533 = C6153.f16907;
        C6153 c61534 = C6153.f16918;
        C6153 c61535 = C6153.f16909;
        C6153 c61536 = C6153.f16910;
        C6153 c61537 = C6153.f16913;
        C6153 c61538 = C6153.f16911;
        C6153 c61539 = C6153.f16914;
        List listM11931 = AbstractC6347.m11931(c6153, c61532, c61533, c61534, c61535, c61536, c61537, c61538, c61539);
        f16895 = listM11931;
        List listM119312 = AbstractC6347.m11931(c6153, c61532, c61533, c61534, c61535, c61536, c61537, c61538, c61539, C6153.f16920, C6153.f16917, C6153.f16915, C6153.f16919, C6153.f16902, C6153.f16916, C6153.f16903);
        f16894 = listM119312;
        C0140 c0140 = new C0140();
        C6153[] c6153Arr = (C6153[]) listM11931.toArray(new C6153[0]);
        c0140.m594((C6153[]) Arrays.copyOf(c6153Arr, c6153Arr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        c0140.m596(tlsVersion, tlsVersion2);
        c0140.f601 = true;
        c0140.m595();
        C0140 c01402 = new C0140();
        C6153[] c6153Arr2 = (C6153[]) listM119312.toArray(new C6153[0]);
        c01402.m594((C6153[]) Arrays.copyOf(c6153Arr2, c6153Arr2.length));
        c01402.m596(tlsVersion, tlsVersion2);
        c01402.f601 = true;
        f16897 = c01402.m595();
        C0140 c01403 = new C0140();
        C6153[] c6153Arr3 = (C6153[]) listM119312.toArray(new C6153[0]);
        c01403.m594((C6153[]) Arrays.copyOf(c6153Arr3, c6153Arr3.length));
        c01403.m596(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        c01403.f601 = true;
        c01403.m595();
        f16896 = new C6152(false, false, null, null);
    }

    public C6152(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f16901 = z;
        this.f16900 = z2;
        this.f16899 = strArr;
        this.f16898 = strArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6152)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C6152 c6152 = (C6152) obj;
        boolean z = c6152.f16901;
        boolean z2 = this.f16901;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f16899, c6152.f16899) && Arrays.equals(this.f16898, c6152.f16898) && this.f16900 == c6152.f16900;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f16901) {
            return 17;
        }
        String[] strArr = this.f16899;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f16898;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f16900 ? 1 : 0);
    }

    public final String toString() {
        if (!this.f16901) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m11554(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m11553(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return AbstractC0053.m152(sb, this.f16900, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList m11553() {
        String[] strArr = this.f16898;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(C6119.m11514(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m11554() {
        String[] strArr = this.f16899;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C6153.f16906.m11526(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11555(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.f16899;
        if (strArr != null) {
            enabledCipherSuites = AbstractC6225.m11687(strArr, enabledCipherSuites, C6153.f16905);
        }
        String[] strArr2 = this.f16898;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = AbstractC6225.m11687(enabledProtocols2, strArr2, C6568.f17937);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        C6134 c6134 = C6153.f16905;
        byte[] bArr = AbstractC6225.f17158;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (c6134.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
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
        boolean z2 = this.f16901;
        if (!z2) {
            C5925.m11310("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            C5925.m11310("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            C5925.m11310("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            C5925.m11310("At least one TLS version is required");
            return;
        }
        C6152 c6152 = new C6152(z2, this.f16900, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (c6152.m11553() != null) {
            sSLSocket.setEnabledProtocols(c6152.f16898);
        }
        if (c6152.m11554() != null) {
            sSLSocket.setEnabledCipherSuites(c6152.f16899);
        }
    }
}
