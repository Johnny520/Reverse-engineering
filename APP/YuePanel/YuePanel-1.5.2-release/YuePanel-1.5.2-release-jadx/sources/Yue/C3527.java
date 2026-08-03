package Yue;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nBasicTrustRootIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n372#2,7:57\n288#3,2:64\n*S KotlinDebug\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n*L\n28#1:57,7\n37#1:64,2\n*E\n"})
public final class C3527 implements InterfaceC8002 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Map<X500Principal, Set<X509Certificate>> f365;

    public C3527(@InterfaceC6399 X509Certificate... x509CertificateArr) {
        C5499.m17103(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C5499.m17102(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f365 = linkedHashMap;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return obj == this || ((obj instanceof C3527) && C5499.m17094(((C3527) obj).f365, this.f365));
    }

    public int hashCode() {
        return this.f365.hashCode();
    }

    @Override // Yue.InterfaceC8002
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public X509Certificate mo293(@InterfaceC6399 X509Certificate x509Certificate) {
        C5499.m17103(x509Certificate, "cert");
        Set<X509Certificate> set = this.f365.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
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
}
