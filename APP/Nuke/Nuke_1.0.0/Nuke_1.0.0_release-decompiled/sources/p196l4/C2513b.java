package p196l4;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: l4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2513b implements InterfaceC2515d {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f8033a;

    public C2513b(X509Certificate... x509CertificateArr) {
        AbstractC1665j.m2985e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f8033a = linkedHashMap;
    }

    @Override // p196l4.InterfaceC2515d
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo4119a(X509Certificate x509Certificate) {
        Set set = (Set) this.f8033a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
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
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C2513b) && AbstractC1665j.m2981a(((C2513b) obj).f8033a, this.f8033a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f8033a.hashCode();
    }
}
