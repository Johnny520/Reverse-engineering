package yyds;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᲈᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2126 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final EnumC2365 f10511;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1248 f10512;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final List f10513;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0078 f10514;

    public C2126(EnumC2365 enumC2365, C1248 c1248, List list, InterfaceC2266 interfaceC2266) {
        this.f10511 = enumC2365;
        this.f10512 = c1248;
        this.f10513 = list;
        this.f10514 = new C0078(new C1223(11, interfaceC2266));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2126)) {
            return false;
        }
        C2126 c2126 = (C2126) obj;
        return c2126.f10511 == this.f10511 && c2126.f10512 == this.f10512 && AbstractC1544.m3188(c2126.m4040(), m4040()) && c2126.f10513.equals(this.f10513);
    }

    public final int hashCode() {
        return this.f10513.hashCode() + ((m4040().hashCode() + ((this.f10512.hashCode() + ((this.f10511.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listM4040 = m4040();
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(listM4040, 10));
        for (Certificate certificate : listM4040) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f10511);
        sb.append(" cipherSuite=");
        sb.append(this.f10512);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f10513;
        ArrayList arrayList2 = new ArrayList(AbstractC0055.m419(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final List m4040() {
        return (List) this.f10514.getValue();
    }
}
