package yyds;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: yyds.ᛱᛶᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0143 extends AbstractC0181 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0460 f882;

    public C0143(C0460 c0460) {
        this.f882 = c0460;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static boolean m661(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!AbstractC1544.m3188(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0143) && AbstractC1544.m3188(((C0143) obj).f882, this.f882);
    }

    public final int hashCode() {
        return this.f882.hashCode();
    }

    @Override // yyds.AbstractC0181
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final List mo662(String str, List list) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        int i = 0;
        boolean z = false;
        while (i < 9) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            C0460 c0460 = this.f882;
            c0460.getClass();
            Set set = (Set) c0460.f2310.get(x509Certificate.getIssuerX500Principal());
            X509Certificate x509Certificate2 = null;
            Object obj = null;
            if (set != null) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    try {
                        x509Certificate.verify(((X509Certificate) next).getPublicKey());
                        obj = next;
                        break;
                    } catch (Exception unused) {
                    }
                }
                x509Certificate2 = (X509Certificate) obj;
            }
            if (x509Certificate2 == null) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext()) {
                    X509Certificate x509Certificate3 = (X509Certificate) it2.next();
                    if (m661(x509Certificate, x509Certificate3, arrayList.size() - 1)) {
                        it2.remove();
                        arrayList.add(x509Certificate3);
                        i++;
                        z = z;
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509Certificate2)) {
                arrayList.add(x509Certificate2);
            }
            if (m661(x509Certificate2, x509Certificate2, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
            i++;
            z = z;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
