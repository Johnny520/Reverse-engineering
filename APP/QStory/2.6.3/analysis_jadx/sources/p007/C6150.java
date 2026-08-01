package p007;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import okhttp3.TlsVersion;
import p052.InterfaceC6543;
import top.suzhelan.qstory.ui.components.C5970;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f16888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f16889;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6153 f16890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TlsVersion f16891;

    public C6150(TlsVersion tlsVersion, C6153 c6153, List list, InterfaceC6543 interfaceC6543) {
        tlsVersion.getClass();
        list.getClass();
        this.f16891 = tlsVersion;
        this.f16890 = c6153;
        this.f16889 = list;
        this.f16888 = AbstractC5187.m10214(new C5970(interfaceC6543, 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6150)) {
            return false;
        }
        C6150 c6150 = (C6150) obj;
        return c6150.f16891 == this.f16891 && c6150.f16890 == this.f16890 && AbstractC4395.m8907(c6150.m11547(), m11547()) && AbstractC4395.m8907(c6150.f16889, this.f16889);
    }

    public final int hashCode() {
        return this.f16889.hashCode() + ((m11547().hashCode() + ((this.f16890.hashCode() + ((this.f16891.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM11547 = m11547();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM11547, 10));
        for (Certificate certificate : listM11547) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f16891);
        sb.append(" cipherSuite=");
        sb.append(this.f16890);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f16889;
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List m11547() {
        return (List) this.f16888.getValue();
    }
}
