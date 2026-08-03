package okhttp3;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import gg.AbstractC1417m;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;
import p085fg.InterfaceC1220a;
import p136j8.C2104o;
import p276sf.C3962i;
import p276sf.InterfaceC3954a;
import p276sf.InterfaceC3956c;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final InterfaceC3956c peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    /* JADX INFO: renamed from: okhttp3.Handshake$peerCertificates$2 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31702 extends AbstractC1417m implements InterfaceC1220a {
        final /* synthetic */ InterfaceC1220a $peerCertificatesFn;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31702(InterfaceC1220a interfaceC1220a) {
            super(0);
            this.$peerCertificatesFn = interfaceC1220a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p085fg.InterfaceC1220a
        public final List<Certificate> invoke() {
            try {
                return (List) this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C4173t.f13710g;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.security.cert.Certificate> */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, InterfaceC1220a interfaceC1220a) {
        tlsVersion.getClass();
        cipherSuite.getClass();
        list.getClass();
        interfaceC1220a.getClass();
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = new C3962i(new C31702(interfaceC1220a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Handshake get(SSLSession sSLSession) {
        return Companion.get(sSLSession);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m10968deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m10969deprecated_localCertificates() {
        return this.localCertificates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m10970deprecated_localPrincipal() {
        return localPrincipal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m10971deprecated_peerCertificates() {
        return peerCertificates();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m10972deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m10973deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.tlsVersion == this.tlsVersion && AbstractC1416l.m3825a(handshake.cipherSuite, this.cipherSuite) && AbstractC1416l.m3825a(handshake.peerCertificates(), peerCertificates()) && AbstractC1416l.m3825a(handshake.localCertificates, this.localCertificates);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Principal localPrincipal() {
        Object objM8424v1 = AbstractC4166m.m8424v1(this.localCertificates);
        X509Certificate x509Certificate = objM8424v1 instanceof X509Certificate ? (X509Certificate) objM8424v1 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Principal peerPrincipal() {
        Object objM8424v1 = AbstractC4166m.m8424v1(peerCertificates());
        X509Certificate x509Certificate = objM8424v1 instanceof X509Certificate ? (X509Certificate) objM8424v1 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listPeerCertificates));
        Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.tlsVersion);
        sb2.append(" cipherSuite=");
        sb2.append(this.cipherSuite);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.Handshake.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : C4173t.f13710g;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m10974deprecated_get(SSLSession sSLSession) {
            sSLSession.getClass();
            return get(sSLSession);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Handshake get(SSLSession sSLSession) throws IOException {
            List<Certificate> immutableList;
            sSLSession.getClass();
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                C2104o.m5276A("cipherSuite == null");
                return null;
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                C2104o.m5299y("cipherSuite == ".concat(cipherSuite));
                return null;
            }
            CipherSuite cipherSuiteForJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                C2104o.m5276A("tlsVersion == null");
                return null;
            }
            if ("NONE".equals(protocol)) {
                C2104o.m5299y("tlsVersion == NONE");
                return null;
            }
            TlsVersion tlsVersionForJavaName = TlsVersion.Companion.forJavaName(protocol);
            try {
                immutableList = toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                immutableList = C4173t.f13710g;
            }
            return new Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(immutableList));
        }

        private Companion() {
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            tlsVersion.getClass();
            cipherSuite.getClass();
            list.getClass();
            list2.getClass();
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }
}
