package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p172l8.InterfaceC4691e;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p376zd.C10003m;
import p376zd.C9987e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0003+,*B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0016\"\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0017J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, m16758d2 = {"Lokhttp3/CertificatePinner;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/CertificatePinner$Pin;", "pins", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", _UrlKt.FRAGMENT_ENCODE_SET, "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "peerCertificates", "Ll8/i0;", "check", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;La9/a;)V", _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "findMatchingPins", "(Ljava/lang/String;)Ljava/util/List;", "withCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "withCertificateChainCleaner", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "Companion", "Pin", "Builder", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class CertificatePinner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\f\"\u00020\u000b¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m16758d2 = {"Lokhttp3/CertificatePinner$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "pins", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            pattern.getClass();
            pins.getClass();
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(AbstractC5081g0.m20564c1(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m16758d2 = {"Lokhttp3/CertificatePinner$Pin;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "matchesHostname", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "Ljava/lang/String;", "getPattern", "hashAlgorithm", "getHashAlgorithm", "Lzd/m;", "hash", "Lzd/m;", "getHash", "()Lzd/m;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Pin {
        private final C10003m hash;
        private final String hashAlgorithm;
        private final String pattern;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Pin(java.lang.String r12, java.lang.String r13) {
            /*
                r11 = this;
                r12.getClass()
                r13.getClass()
                r11.<init>()
                java.lang.String r0 = "*."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = p299ub.AbstractC8611a0.m33075T(r12, r0, r1, r2, r3)
                r4 = -1
                if (r0 == 0) goto L23
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 1
                r8 = 0
                r5 = r12
                int r12 = p299ub.AbstractC8621f0.m33152n0(r5, r6, r7, r8, r9, r10)
                if (r12 == r4) goto L44
                goto L24
            L23:
                r5 = r12
            L24:
                java.lang.String r12 = "**."
                boolean r12 = p299ub.AbstractC8611a0.m33075T(r5, r12, r1, r2, r3)
                if (r12 == 0) goto L38
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 2
                r8 = 0
                int r12 = p299ub.AbstractC8621f0.m33152n0(r5, r6, r7, r8, r9, r10)
                if (r12 == r4) goto L44
            L38:
                r9 = 6
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 0
                r8 = 0
                int r12 = p299ub.AbstractC8621f0.m33152n0(r5, r6, r7, r8, r9, r10)
                if (r12 != r4) goto La6
            L44:
                java.lang.String r12 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r5)
                if (r12 == 0) goto L9f
                r11.pattern = r12
                java.lang.String r12 = "sha1/"
                boolean r12 = p299ub.AbstractC8611a0.m33075T(r13, r12, r1, r2, r3)
                java.lang.String r0 = "Invalid pin hash: "
                if (r12 == 0) goto L73
                java.lang.String r12 = "sha1"
                r11.hashAlgorithm = r12
                zd.m$a r12 = p376zd.C10003m.f33582t
                r1 = 5
                java.lang.String r1 = r13.substring(r1)
                zd.m r12 = r12.m38791a(r1)
                if (r12 == 0) goto L6a
                r11.hash = r12
                return
            L6a:
                java.lang.String r12 = r0.concat(r13)
                p376zd.C9987e.m38645a(r12)
                r12 = 0
                throw r12
            L73:
                java.lang.String r12 = "sha256/"
                boolean r12 = p299ub.AbstractC8611a0.m33075T(r13, r12, r1, r2, r3)
                if (r12 == 0) goto L98
                java.lang.String r12 = "sha256"
                r11.hashAlgorithm = r12
                zd.m$a r12 = p376zd.C10003m.f33582t
                r1 = 7
                java.lang.String r1 = r13.substring(r1)
                zd.m r12 = r12.m38791a(r1)
                if (r12 == 0) goto L8f
                r11.hash = r12
                return
            L8f:
                java.lang.String r12 = r0.concat(r13)
                p376zd.C9987e.m38645a(r12)
                r12 = 0
                throw r12
            L98:
                java.lang.String r12 = "pins must start with 'sha256/' or 'sha1/': "
                ae.C0307f.m923a(r12, r13)
                r12 = 0
                throw r12
            L9f:
                java.lang.String r12 = "Invalid pattern: "
                ae.C0307f.m923a(r12, r5)
                r12 = 0
                throw r12
            La6:
                java.lang.String r12 = "Unexpected pattern: "
                p376zd.C9994h0.m38667a(r12, r5)
                r12 = 0
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.<init>(java.lang.String, java.lang.String):void");
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return AbstractC1061t.m3842c(this.pattern, pin.pattern) && AbstractC1061t.m3842c(this.hashAlgorithm, pin.hashAlgorithm) && AbstractC1061t.m3842c(this.hash, pin.hash);
        }

        public final C10003m getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            certificate.getClass();
            String str = this.hashAlgorithm;
            if (AbstractC1061t.m3842c(str, "sha256")) {
                return AbstractC1061t.m3842c(this.hash, CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            if (AbstractC1061t.m3842c(str, "sha1")) {
                return AbstractC1061t.m3842c(this.hash, CertificatePinner.INSTANCE.sha1Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String hostname) {
            hostname.getClass();
            boolean zM33075T = AbstractC8611a0.m33075T(this.pattern, "**.", false, 2, null);
            String str = this.pattern;
            if (zM33075T) {
                int length = str.length() - 3;
                int length2 = hostname.length() - length;
                return AbstractC8611a0.m33064I(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            boolean zM33075T2 = AbstractC8611a0.m33075T(str, "*.", false, 2, null);
            String str2 = this.pattern;
            if (!zM33075T2) {
                return AbstractC1061t.m3842c(hostname, str2);
            }
            int length3 = str2.length() - 1;
            return AbstractC8611a0.m33064I(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null) && AbstractC8621f0.m33164t0(hostname, '.', (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.mo38772a();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        set.getClass();
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    /* JADX INFO: renamed from: a */
    public static List m23243a(CertificatePinner certificatePinner, List list, String str) {
        List<Certificate> listClean;
        CertificateChainCleaner certificateChainCleaner = certificatePinner.certificateChainCleaner;
        if (certificateChainCleaner != null && (listClean = certificateChainCleaner.clean(list, str)) != null) {
            list = listClean;
        }
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        for (Certificate certificate : list) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public static final String pin(Certificate certificate) {
        return INSTANCE.pin(certificate);
    }

    public static final C10003m sha1Hash(X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    public static final C10003m sha256Hash(X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    public final void check(final String hostname, final List<? extends Certificate> peerCertificates) {
        hostname.getClass();
        peerCertificates.getClass();
        check$okhttp(hostname, new InterfaceC0173a() { // from class: okhttp3.a
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return CertificatePinner.m23243a(this.f18113q, peerCertificates, hostname);
            }
        });
    }

    public final void check$okhttp(String hostname, InterfaceC0173a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        hostname.getClass();
        cleanedPeerCertificatesFn.getClass();
        List<Pin> listFindMatchingPins = findMatchingPins(hostname);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            C10003m c10003mSha256Hash = null;
            C10003m c10003mSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (AbstractC1061t.m3842c(hashAlgorithm, "sha256")) {
                    if (c10003mSha256Hash == null) {
                        c10003mSha256Hash = INSTANCE.sha256Hash(x509Certificate);
                    }
                    if (AbstractC1061t.m3842c(pin.getHash(), c10003mSha256Hash)) {
                        return;
                    }
                } else {
                    if (!AbstractC1061t.m3842c(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (c10003mSha1Hash == null) {
                        c10003mSha1Hash = INSTANCE.sha1Hash(x509Certificate);
                    }
                    if (AbstractC1061t.m3842c(pin.getHash(), c10003mSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(INSTANCE.pin(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (Pin pin2 : listFindMatchingPins) {
            sb2.append("\n    ");
            sb2.append(pin2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public boolean equals(Object other) {
        if (!(other instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) other;
        return AbstractC1061t.m3842c(certificatePinner.pins, this.pins) && AbstractC1061t.m3842c(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<Pin> findMatchingPins(String hostname) {
        hostname.getClass();
        Set<Pin> set = this.pins;
        List<Pin> listM20800o = AbstractC5114x.m20800o();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (listM20800o.isEmpty()) {
                    listM20800o = new ArrayList<>();
                }
                AbstractC1064u0.m3855c(listM20800o).add(obj);
            }
        }
        return listM20800o;
    }

    /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        certificateChainCleaner.getClass();
        return AbstractC1061t.m3842c(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m16758d2 = {"Lokhttp3/CertificatePinner$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Ljava/security/cert/X509Certificate;", "Lzd/m;", "sha1Hash", "(Ljava/security/cert/X509Certificate;)Lzd/m;", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", _UrlKt.FRAGMENT_ENCODE_SET, "pin", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final String pin(Certificate certificate) {
            certificate.getClass();
            if (!(certificate instanceof X509Certificate)) {
                C9987e.m38645a("Certificate pinning requires X509 certificates");
                return null;
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).mo38772a();
        }

        public final C10003m sha1Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            C10003m.a aVar = C10003m.f33582t;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return C10003m.a.m38790g(aVar, encoded, 0, 0, 3, null).m38763E();
        }

        public final C10003m sha256Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            C10003m.a aVar = C10003m.f33582t;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return C10003m.a.m38790g(aVar, encoded, 0, 0, 3, null).m38764F();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i10, AbstractC1043k abstractC1043k) {
        this(set, (i10 & 2) != 0 ? null : certificateChainCleaner);
    }

    @InterfaceC4691e
    public final void check(String hostname, Certificate... peerCertificates) {
        hostname.getClass();
        peerCertificates.getClass();
        check(hostname, AbstractC5106t.m20713V0(peerCertificates));
    }
}
