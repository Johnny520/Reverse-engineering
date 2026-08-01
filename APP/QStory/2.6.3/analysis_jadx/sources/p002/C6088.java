package p002;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC4395;
import p053.AbstractC6561;

/* JADX INFO: renamed from: 飘花落叶言世兰哲楪子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6088 extends AbstractC6561 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6085 f16641;

    public C6088(InterfaceC6085 interfaceC6085) {
        interfaceC6085.getClass();
        this.f16641 = interfaceC6085;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static boolean m11443(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!AbstractC4395.m8907(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
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
        return (obj instanceof C6088) && AbstractC4395.m8907(((C6088) obj).f16641, this.f16641);
    }

    public final int hashCode() {
        return this.f16641.hashCode();
    }

    @Override // p053.AbstractC6561
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final List mo11444(String str, List list) throws SSLPeerUnverifiedException {
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        objRemoveFirst.getClass();
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo11440 = this.f16641.mo11440(x509Certificate);
            if (x509CertificateMo11440 == null) {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m11443(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo11440)) {
                arrayList.add(x509CertificateMo11440);
            }
            if (m11443(x509CertificateMo11440, x509CertificateMo11440, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
