package p023;

import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C0987;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;
import p029.AbstractC7054;
import p050.AbstractC7176;
import p071.C7397;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6981 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final List f17239;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final List f17240;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6981 f17241;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6981 f17242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String[] f17243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String[] f17244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f17245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f17246;

    static {
        C6982 c6982 = C6982.f17257;
        C6982 c69822 = C6982.f17253;
        C6982 c69823 = C6982.f17252;
        C6982 c69824 = C6982.f17263;
        C6982 c69825 = C6982.f17254;
        C6982 c69826 = C6982.f17255;
        C6982 c69827 = C6982.f17258;
        C6982 c69828 = C6982.f17256;
        C6982 c69829 = C6982.f17259;
        List listM12490 = AbstractC7176.m12490(c6982, c69822, c69823, c69824, c69825, c69826, c69827, c69828, c69829);
        f17240 = listM12490;
        List listM124902 = AbstractC7176.m12490(c6982, c69822, c69823, c69824, c69825, c69826, c69827, c69828, c69829, C6982.f17265, C6982.f17262, C6982.f17260, C6982.f17264, C6982.f17247, C6982.f17261, C6982.f17248);
        f17239 = listM124902;
        C0987 c0987 = new C0987();
        C6982[] c6982Arr = (C6982[]) listM12490.toArray(new C6982[0]);
        c0987.m1154((C6982[]) Arrays.copyOf(c6982Arr, c6982Arr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        c0987.m1156(tlsVersion, tlsVersion2);
        c0987.f946 = true;
        c0987.m1155();
        C0987 c09872 = new C0987();
        C6982[] c6982Arr2 = (C6982[]) listM124902.toArray(new C6982[0]);
        c09872.m1154((C6982[]) Arrays.copyOf(c6982Arr2, c6982Arr2.length));
        c09872.m1156(tlsVersion, tlsVersion2);
        c09872.f946 = true;
        f17242 = c09872.m1155();
        C0987 c09873 = new C0987();
        C6982[] c6982Arr3 = (C6982[]) listM124902.toArray(new C6982[0]);
        c09873.m1154((C6982[]) Arrays.copyOf(c6982Arr3, c6982Arr3.length));
        c09873.m1156(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        c09873.f946 = true;
        c09873.m1155();
        f17241 = new C6981(false, false, null, null);
    }

    public C6981(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f17246 = z;
        this.f17245 = z2;
        this.f17244 = strArr;
        this.f17243 = strArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6981)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C6981 c6981 = (C6981) obj;
        boolean z = c6981.f17246;
        boolean z2 = this.f17246;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f17244, c6981.f17244) && Arrays.equals(this.f17243, c6981.f17243) && this.f17245 == c6981.f17245;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f17246) {
            return 17;
        }
        String[] strArr = this.f17244;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f17243;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f17245 ? 1 : 0);
    }

    public final String toString() {
        if (!this.f17246) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m12113(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m12112(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return AbstractC0900.m712(sb, this.f17245, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList m12112() {
        String[] strArr = this.f17243;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(C6948.m12073(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m12113() {
        String[] strArr = this.f17244;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C6982.f17251.m12085(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12114(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.f17244;
        if (strArr != null) {
            enabledCipherSuites = AbstractC7054.m12246(strArr, enabledCipherSuites, C6982.f17250);
        }
        String[] strArr2 = this.f17243;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = AbstractC7054.m12246(enabledProtocols2, strArr2, C7397.f18282);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        C6963 c6963 = C6982.f17250;
        byte[] bArr = AbstractC7054.f17503;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (c6963.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
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
        boolean z2 = this.f17246;
        if (!z2) {
            C6755.m11869("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            C6755.m11869("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            C6755.m11869("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            C6755.m11869("At least one TLS version is required");
            return;
        }
        C6981 c6981 = new C6981(z2, this.f17245, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (c6981.m12112() != null) {
            sSLSocket.setEnabledProtocols(c6981.f17243);
        }
        if (c6981.m12113() != null) {
            sSLSocket.setEnabledCipherSuites(c6981.f17244);
        }
    }
}
