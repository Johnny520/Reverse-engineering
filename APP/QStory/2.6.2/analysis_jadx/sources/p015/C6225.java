package p015;

import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0140;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;
import p017.AbstractC6233;
import p055.C6567;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6225 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final List f17133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final List f17134;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6225 f17135;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6225 f17136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String[] f17137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String[] f17138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f17139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f17140;

    static {
        C6226 c6226 = C6226.f17151;
        C6226 c62262 = C6226.f17147;
        C6226 c62263 = C6226.f17146;
        C6226 c62264 = C6226.f17157;
        C6226 c62265 = C6226.f17148;
        C6226 c62266 = C6226.f17149;
        C6226 c62267 = C6226.f17152;
        C6226 c62268 = C6226.f17150;
        C6226 c62269 = C6226.f17153;
        List listM13659 = AbstractC8189.m13659(c6226, c62262, c62263, c62264, c62265, c62266, c62267, c62268, c62269);
        f17134 = listM13659;
        List listM136592 = AbstractC8189.m13659(c6226, c62262, c62263, c62264, c62265, c62266, c62267, c62268, c62269, C6226.f17159, C6226.f17156, C6226.f17154, C6226.f17158, C6226.f17141, C6226.f17155, C6226.f17142);
        f17133 = listM136592;
        C0140 c0140 = new C0140();
        C6226[] c6226Arr = (C6226[]) listM13659.toArray(new C6226[0]);
        c0140.m593((C6226[]) Arrays.copyOf(c6226Arr, c6226Arr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        c0140.m595(tlsVersion, tlsVersion2);
        c0140.f601 = true;
        c0140.m594();
        C0140 c01402 = new C0140();
        C6226[] c6226Arr2 = (C6226[]) listM136592.toArray(new C6226[0]);
        c01402.m593((C6226[]) Arrays.copyOf(c6226Arr2, c6226Arr2.length));
        c01402.m595(tlsVersion, tlsVersion2);
        c01402.f601 = true;
        f17136 = c01402.m594();
        C0140 c01403 = new C0140();
        C6226[] c6226Arr3 = (C6226[]) listM136592.toArray(new C6226[0]);
        c01403.m593((C6226[]) Arrays.copyOf(c6226Arr3, c6226Arr3.length));
        c01403.m595(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        c01403.f601 = true;
        c01403.m594();
        f17135 = new C6225(false, false, null, null);
    }

    public C6225(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f17140 = z;
        this.f17139 = z2;
        this.f17138 = strArr;
        this.f17137 = strArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6225)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C6225 c6225 = (C6225) obj;
        boolean z = c6225.f17140;
        boolean z2 = this.f17140;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f17138, c6225.f17138) && Arrays.equals(this.f17137, c6225.f17137) && this.f17139 == c6225.f17139;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f17140) {
            return 17;
        }
        String[] strArr = this.f17138;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f17137;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f17139 ? 1 : 0);
    }

    public final String toString() {
        if (!this.f17140) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m11683(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m11682(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return AbstractC0053.m150(sb, this.f17139, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList m11682() {
        String[] strArr = this.f17137;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(C6192.m11643(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m11683() {
        String[] strArr = this.f17138;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C6226.f17145.m11655(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11684(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.f17138;
        if (strArr != null) {
            enabledCipherSuites = AbstractC6233.m11697(strArr, enabledCipherSuites, C6226.f17144);
        }
        String[] strArr2 = this.f17137;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = AbstractC6233.m11697(enabledProtocols2, strArr2, C6567.f17942);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        C6207 c6207 = C6226.f17144;
        byte[] bArr = AbstractC6233.f17181;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (c6207.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
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
        boolean z2 = this.f17140;
        if (!z2) {
            C5919.m11249("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            C5919.m11249("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            C5919.m11249("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            C5919.m11249("At least one TLS version is required");
            return;
        }
        C6225 c6225 = new C6225(z2, this.f17139, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (c6225.m11682() != null) {
            sSLSocket.setEnabledProtocols(c6225.f17137);
        }
        if (c6225.m11683() != null) {
            sSLSocket.setEnabledCipherSuites(c6225.f17138);
        }
    }
}
