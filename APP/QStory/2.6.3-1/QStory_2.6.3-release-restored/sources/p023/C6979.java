package p023;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import okhttp3.TlsVersion;
import p068.InterfaceC7372;
import top.suzhelan.qstory.p015ui.components.C6800;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6979 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f17233;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f17234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6982 f17235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TlsVersion f17236;

    public C6979(TlsVersion tlsVersion, C6982 c6982, List list, InterfaceC7372 interfaceC7372) {
        tlsVersion.getClass();
        list.getClass();
        this.f17236 = tlsVersion;
        this.f17235 = c6982;
        this.f17234 = list;
        this.f17233 = AbstractC6019.m10773(new C6800(interfaceC7372, 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6979)) {
            return false;
        }
        C6979 c6979 = (C6979) obj;
        return c6979.f17236 == this.f17236 && c6979.f17235 == this.f17235 && AbstractC5227.m9466(c6979.m12106(), m12106()) && AbstractC5227.m9466(c6979.f17234, this.f17234);
    }

    public final int hashCode() {
        return this.f17234.hashCode() + ((m12106().hashCode() + ((this.f17235.hashCode() + ((this.f17236.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM12106 = m12106();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM12106, 10));
        for (Certificate certificate : listM12106) {
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
        sb.append(this.f17236);
        sb.append(" cipherSuite=");
        sb.append(this.f17235);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f17234;
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
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
    public final List m12106() {
        return (List) this.f17233.getValue();
    }
}
