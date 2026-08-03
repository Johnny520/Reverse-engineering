package Yue;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3522 extends AbstractC3685 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0167 f5950 = new C0167(null);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f5951 = 9;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC8002 f357;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۦ۠$ۥ */
    public static final class C0167 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۢۦ۠.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0167(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0167() {
        }
    }

    public C3522(@InterfaceC6399 InterfaceC8002 interfaceC8002) {
        C5499.m17103(interfaceC8002, "trustRootIndex");
        this.f357 = interfaceC8002;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C3522) && C5499.m17094(((C3522) obj).f357, this.f357);
    }

    public int hashCode() {
        return this.f357.hashCode();
    }

    @Override // Yue.AbstractC3685
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public List<Certificate> mo283(@InterfaceC6399 List<? extends Certificate> list, @InterfaceC6399 String str) throws SSLPeerUnverifiedException {
        C5499.m17103(list, "chain");
        C5499.m17103(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        C5499.m17102(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            C5499.m17101(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo293 = this.f357.mo293(x509Certificate);
            if (x509CertificateMo293 == null) {
                Iterator it = arrayDeque.iterator();
                C5499.m17102(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    C5499.m17101(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m585(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !C5499.m17094(x509Certificate, x509CertificateMo293)) {
                arrayList.add(x509CertificateMo293);
            }
            if (m585(x509CertificateMo293, x509CertificateMo293)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m585(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C5499.m17094(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
