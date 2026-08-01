package p118X3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import p037G2.C0494f;
import p049I2.AbstractC0797o;
import p056K2.C0887m;
import p061L2.AbstractC0974n;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: X3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1705o {

    /* JADX INFO: renamed from: a */
    public final EnumC1689K f5853a;

    /* JADX INFO: renamed from: b */
    public final C1698h f5854b;

    /* JADX INFO: renamed from: c */
    public final List f5855c;

    /* JADX INFO: renamed from: d */
    public final C0887m f5856d;

    public C1705o(EnumC1689K enumC1689K, C1698h c1698h, List list, InterfaceC1599a interfaceC1599a) {
        this.f5853a = enumC1689K;
        this.f5854b = c1698h;
        this.f5855c = list;
        this.f5856d = AbstractC0797o.m1396u(new C0494f(interfaceC1599a, 4));
    }

    /* JADX INFO: renamed from: a */
    public final List m3021a() {
        return (List) this.f5856d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1705o)) {
            return false;
        }
        C1705o c1705o = (C1705o) obj;
        return c1705o.f5853a == this.f5853a && AbstractC1665j.m2981a(c1705o.f5854b, this.f5854b) && AbstractC1665j.m2981a(c1705o.m3021a(), m3021a()) && AbstractC1665j.m2981a(c1705o.f5855c, this.f5855c);
    }

    public final int hashCode() {
        return this.f5855c.hashCode() + ((m3021a().hashCode() + ((this.f5854b.hashCode() + ((this.f5853a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM3021a = m3021a();
        ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(listM3021a, 10));
        for (Certificate certificate : listM3021a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC1665j.m2984d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f5853a);
        sb.append(" cipherSuite=");
        sb.append(this.f5854b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f5855c;
        ArrayList arrayList2 = new ArrayList(AbstractC0974n.m2029K(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC1665j.m2984d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
