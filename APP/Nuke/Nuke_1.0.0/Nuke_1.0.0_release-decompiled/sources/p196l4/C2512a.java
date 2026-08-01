package p196l4;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: l4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2512a extends AbstractC0797o {

    /* JADX INFO: renamed from: c */
    public final InterfaceC2515d f8032c;

    public C2512a(InterfaceC2515d interfaceC2515d) {
        AbstractC1665j.m2985e(interfaceC2515d, "trustRootIndex");
        this.f8032c = interfaceC2515d;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m4461E(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i5) {
        if (!AbstractC1665j.m2981a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i5) {
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
        return (obj instanceof C2512a) && AbstractC1665j.m2981a(((C2512a) obj).f8032c, this.f8032c);
    }

    public final int hashCode() {
        return this.f8032c.hashCode();
    }

    @Override // p049I2.AbstractC0797o
    /* JADX INFO: renamed from: i */
    public final List mo1402i(String str, List list) throws SSLPeerUnverifiedException {
        AbstractC1665j.m2985e(list, "chain");
        AbstractC1665j.m2985e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC1665j.m2984d(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z5 = false;
        for (int i5 = 0; i5 < 9; i5++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo4119a = this.f8032c.mo4119a(x509Certificate);
            if (x509CertificateMo4119a == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC1665j.m2984d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC1665j.m2983c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m4461E(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z5) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo4119a)) {
                arrayList.add(x509CertificateMo4119a);
            }
            if (m4461E(x509CertificateMo4119a, x509CertificateMo4119a, arrayList.size() - 2)) {
                return arrayList;
            }
            z5 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
