package okhttp3;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import gg.AbstractC1417m;
import gg.AbstractC1428x;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.InterfaceC3954a;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder add(String str, String... strArr) {
            str.getClass();
            strArr.getClass();
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(AbstractC4166m.m8412U1(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Pin(String str, String str2) {
            str.getClass();
            str2.getClass();
            if ((!AbstractC3156t.m6740d0(str, "*.", false) || AbstractC3149m.m6719r0(str, "*", 1, false, 4) != -1) && ((!AbstractC3156t.m6740d0(str, "**.", false) || AbstractC3149m.m6719r0(str, "*", 2, false, 4) != -1) && AbstractC3149m.m6719r0(str, "*", 0, false, 6) != -1)) {
                C2104o.m5291q("Unexpected pattern: ".concat(str));
                throw null;
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                C2104o.m5294t("Invalid pattern: ".concat(str));
                throw null;
            }
            this.pattern = canonicalHost;
            if (AbstractC3156t.m6740d0(str2, "sha1/", false)) {
                this.hashAlgorithm = "sha1";
                ByteString byteStringDecodeBase64 = ByteString.Companion.decodeBase64(str2.substring(5));
                if (byteStringDecodeBase64 != null) {
                    this.hash = byteStringDecodeBase64;
                    return;
                } else {
                    C2104o.m5294t("Invalid pin hash: ".concat(str2));
                    throw null;
                }
            }
            if (!AbstractC3156t.m6740d0(str2, "sha256/", false)) {
                C2104o.m5294t("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                throw null;
            }
            this.hashAlgorithm = "sha256";
            ByteString byteStringDecodeBase642 = ByteString.Companion.decodeBase64(str2.substring(7));
            if (byteStringDecodeBase642 != null) {
                this.hash = byteStringDecodeBase642;
            } else {
                C2104o.m5294t("Invalid pin hash: ".concat(str2));
                throw null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return AbstractC1416l.m3825a(this.pattern, pin.pattern) && AbstractC1416l.m3825a(this.hashAlgorithm, pin.hashAlgorithm) && AbstractC1416l.m3825a(this.hash, pin.hash);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ByteString getHash() {
            return this.hash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getPattern() {
            return this.pattern;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.hash.hashCode() + AbstractC0921a.m2244g(this.pattern.hashCode() * 31, 31, this.hashAlgorithm);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            String str = this.hashAlgorithm;
            if (AbstractC1416l.m3825a(str, "sha256")) {
                return AbstractC1416l.m3825a(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (AbstractC1416l.m3825a(str, "sha1")) {
                return AbstractC1416l.m3825a(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean matchesHostname(String str) {
            str.getClass();
            boolean zM6740d0 = AbstractC3156t.m6740d0(this.pattern, "**.", false);
            String str2 = this.pattern;
            if (zM6740d0) {
                int length = str2.length() - 3;
                int length2 = str.length() - length;
                return AbstractC3156t.m6735Y(str, str.length() - length, this.pattern, 3, length, false) && (length2 == 0 || str.charAt(length2 - 1) == '.');
            }
            boolean zM6740d02 = AbstractC3156t.m6740d0(str2, "*.", false);
            String str3 = this.pattern;
            if (!zM6740d02) {
                return str.equals(str3);
            }
            int length3 = str3.length() - 1;
            int length4 = str.length() - length3;
            if (!AbstractC3156t.m6735Y(str, str.length() - length3, this.pattern, 1, length3, false) || AbstractC3149m.m6724w0(str, '.', length4 - 1, 4) != -1) {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }
    }

    /* JADX INFO: renamed from: okhttp3.CertificatePinner$check$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31691 extends AbstractC1417m implements InterfaceC1220a {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.security.cert.Certificate> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31691(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p085fg.InterfaceC1220a
        public final List<X509Certificate> invoke() {
            List<Certificate> listClean;
            CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
            if (certificateChainCleaner$okhttp == null || (listClean = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
                listClean = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listClean));
            for (Certificate certificate : listClean) {
                certificate.getClass();
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        set.getClass();
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void check(String str, List<? extends Certificate> list) {
        str.getClass();
        list.getClass();
        check$okhttp(str, new C31691(list, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void check$okhttp(String str, InterfaceC1220a interfaceC1220a) throws SSLPeerUnverifiedException {
        str.getClass();
        interfaceC1220a.getClass();
        List<Pin> listFindMatchingPins = findMatchingPins(str);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC1220a.invoke();
        for (X509Certificate x509Certificate : list) {
            ByteString byteStringSha256Hash = null;
            ByteString byteStringSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (AbstractC1416l.m3825a(hashAlgorithm, "sha256")) {
                    if (byteStringSha256Hash == null) {
                        byteStringSha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (AbstractC1416l.m3825a(pin.getHash(), byteStringSha256Hash)) {
                        return;
                    }
                } else {
                    if (!AbstractC1416l.m3825a(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (byteStringSha1Hash == null) {
                        byteStringSha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (AbstractC1416l.m3825a(pin.getHash(), byteStringSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(Companion.pin(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        for (Pin pin2 : listFindMatchingPins) {
            sb2.append("\n    ");
            sb2.append(pin2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return AbstractC1416l.m3825a(certificatePinner.pins, this.pins) && AbstractC1416l.m3825a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Pin> findMatchingPins(String str) {
        str.getClass();
        List arrayList = C4173t.f13710g;
        for (Object obj : this.pins) {
            if (((Pin) obj).matchesHostname(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                AbstractC1428x.m3836a(arrayList).add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<Pin> getPins() {
        return this.pins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iHashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        certificateChainCleaner.getClass();
        return AbstractC1416l.m3825a(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.CertificatePinner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String pin(Certificate certificate) {
            certificate.getClass();
            if (!(certificate instanceof X509Certificate)) {
                C2104o.m5294t("Certificate pinning requires X509 certificates");
                return null;
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.Set)
  (wrap:okhttp3.internal.tls.CertificateChainCleaner:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null okhttp3.internal.tls.CertificateChainCleaner) : (r2v0 okhttp3.internal.tls.CertificateChainCleaner))
 A[MD:(java.util.Set<okhttp3.CertificatePinner$Pin>, okhttp3.internal.tls.CertificateChainCleaner):void (m)] (LINE:12) call: okhttp3.CertificatePinner.<init>(java.util.Set, okhttp3.internal.tls.CertificateChainCleaner):void type: THIS */
    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i9, AbstractC1411g abstractC1411g) {
        this(set, (i9 & 2) != 0 ? null : certificateChainCleaner);
    }

    @InterfaceC3954a
    public final void check(String str, Certificate... certificateArr) {
        str.getClass();
        certificateArr.getClass();
        check(str, AbstractC4165l.m8375L0(certificateArr));
    }
}
