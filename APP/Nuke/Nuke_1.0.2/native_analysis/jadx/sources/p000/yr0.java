package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yr0 {

    /* JADX INFO: renamed from: a */
    public final s23 f13596a;

    /* JADX INFO: renamed from: b */
    public final C0591ps f13597b;

    /* JADX INFO: renamed from: c */
    public final List f13598c;

    /* JADX INFO: renamed from: d */
    public final hx2 f13599d;

    public yr0(s23 s23Var, C0591ps c0591ps, List list, xm0 xm0Var) {
        this.f13596a = s23Var;
        this.f13597b = c0591ps;
        this.f13598c = list;
        this.f13599d = new hx2(new xr0(xm0Var, 0));
    }

    /* JADX INFO: renamed from: a */
    public final List m6320a() {
        return (List) this.f13599d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yr0)) {
            return false;
        }
        yr0 yr0Var = (yr0) obj;
        return yr0Var.f13596a == this.f13596a && yr0Var.f13597b == this.f13597b && t11.m5086l(yr0Var.m6320a(), m6320a()) && yr0Var.f13598c.equals(this.f13598c);
    }

    public final int hashCode() {
        return this.f13598c.hashCode() + ((m6320a().hashCode() + ((this.f13597b.hashCode() + ((this.f13596a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM6320a = m6320a();
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(listM6320a, 10));
        for (Certificate certificate : listM6320a) {
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
        sb.append(this.f13596a);
        sb.append(" cipherSuite=");
        sb.append(this.f13597b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f13598c;
        ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(list, 10));
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
}
