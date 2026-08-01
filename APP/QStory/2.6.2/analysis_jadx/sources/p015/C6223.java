package p015;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import okhttp3.TlsVersion;
import p052.InterfaceC6542;
import top.suzhelan.qstory.ui.components.C5964;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5183 f17127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f17128;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6226 f17129;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TlsVersion f17130;

    public C6223(TlsVersion tlsVersion, C6226 c6226, List list, InterfaceC6542 interfaceC6542) {
        tlsVersion.getClass();
        list.getClass();
        this.f17130 = tlsVersion;
        this.f17129 = c6226;
        this.f17128 = list;
        this.f17127 = AbstractC5186.m10210(new C5964(interfaceC6542, 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6223)) {
            return false;
        }
        C6223 c6223 = (C6223) obj;
        return c6223.f17130 == this.f17130 && c6223.f17129 == this.f17129 && AbstractC4394.m8917(c6223.m11676(), m11676()) && AbstractC4394.m8917(c6223.f17128, this.f17128);
    }

    public final int hashCode() {
        return this.f17128.hashCode() + ((m11676().hashCode() + ((this.f17129.hashCode() + ((this.f17130.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM11676 = m11676();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM11676, 10));
        for (Certificate certificate : listM11676) {
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
        sb.append(this.f17130);
        sb.append(" cipherSuite=");
        sb.append(this.f17129);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f17128;
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(list, 10));
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
    public final List m11676() {
        return (List) this.f17127.getValue();
    }
}
