package Yue;

import Yue.C3630;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
public final class C3686 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0224 f6502 = new C0224(null);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3686 f6503 = new C0223().m758();

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Set<C3687> f459;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final AbstractC3685 f460;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ$ۥ */
    public static final class C0223 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final List<C3687> f461 = new ArrayList();

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C0223 m757(@InterfaceC6399 String str, @InterfaceC6399 String... strArr) {
            C5499.m17103(str, "pattern");
            C5499.m17103(strArr, "pins");
            for (String str2 : strArr) {
                this.f461.add(new C3687(str, str2));
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C3686 m758() {
            return new C3686(C3888.m11067(this.f461), null, 2, 0 == true ? 1 : 0);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final List<C3687> m10112() {
            return this.f461;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ$ۥ۟ */
    @InterfaceC7507({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    public static final class C0224 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۤ۟ۧ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0224(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ */
        public final String m759(@InterfaceC6399 Certificate certificate) {
            C5499.m17103(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + m10113((X509Certificate) certificate).mo9816();
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟ */
        public final C3630 m760(@InterfaceC6399 X509Certificate x509Certificate) {
            C5499.m17103(x509Certificate, "<this>");
            C3630.C0198 c0198 = C3630.f6370;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C5499.m17102(encoded, "publicKey.encoded");
            return C3630.C0198.m9867(c0198, encoded, 0, 0, 3, null).m9849();
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C3630 m10113(@InterfaceC6399 X509Certificate x509Certificate) {
            C5499.m17103(x509Certificate, "<this>");
            C3630.C0198 c0198 = C3630.f6370;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C5499.m17102(encoded, "publicKey.encoded");
            return C3630.C0198.m9867(c0198, encoded, 0, 0, 3, null).m9850();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0224() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3687 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final String f462;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final String f463;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final C3630 f6504;

        public C3687(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "pattern");
            C5499.m17103(str2, "pin");
            if ((!C7627.m24008(str, "*.", false, 2, null) || C7628.m24057(str, InterfaceC5949.f14892, 1, false, 4, null) != -1) && ((!C7627.m24008(str, "**.", false, 2, null) || C7628.m24057(str, InterfaceC5949.f14892, 2, false, 4, null) != -1) && C7628.m24057(str, InterfaceC5949.f14892, 0, false, 6, null) != -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
            String strM16319 = C5317.m16319(str);
            if (strM16319 == null) {
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            this.f462 = strM16319;
            if (C7627.m24008(str2, "sha1/", false, 2, null)) {
                this.f463 = "sha1";
                C3630.C0198 c0198 = C3630.f6370;
                String strSubstring = str2.substring(5);
                C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
                C3630 c3630M9873 = c0198.m9873(strSubstring);
                if (c3630M9873 != null) {
                    this.f6504 = c3630M9873;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + str2);
            }
            if (!C7627.m24008(str2, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            }
            this.f463 = "sha256";
            C3630.C0198 c01982 = C3630.f6370;
            String strSubstring2 = str2.substring(7);
            C5499.m17102(strSubstring2, "this as java.lang.String).substring(startIndex)");
            C3630 c3630M98732 = c01982.m9873(strSubstring2);
            if (c3630M98732 != null) {
                this.f6504 = c3630M98732;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + str2);
        }

        public boolean equals(@InterfaceC6489 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3687)) {
                return false;
            }
            C3687 c3687 = (C3687) obj;
            return C5499.m17094(this.f462, c3687.f462) && C5499.m17094(this.f463, c3687.f463) && C5499.m17094(this.f6504, c3687.f6504);
        }

        public int hashCode() {
            return (((this.f462.hashCode() * 31) + this.f463.hashCode()) * 31) + this.f6504.hashCode();
        }

        @InterfaceC6399
        public String toString() {
            return this.f463 + '/' + this.f6504.mo9816();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C3630 m761() {
            return this.f6504;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final String m762() {
            return this.f463;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String m10114() {
            return this.f462;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m10115(@InterfaceC6399 X509Certificate x509Certificate) {
            C5499.m17103(x509Certificate, "certificate");
            String str = this.f463;
            if (C5499.m17094(str, "sha256")) {
                return C5499.m17094(this.f6504, C3686.f6502.m10113(x509Certificate));
            }
            if (C5499.m17094(str, "sha1")) {
                return C5499.m17094(this.f6504, C3686.f6502.m760(x509Certificate));
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m10116(@InterfaceC6399 String str) {
            C5499.m17103(str, "hostname");
            if (C7627.m24008(this.f462, "**.", false, 2, null)) {
                int length = this.f462.length() - 3;
                int length2 = str.length() - length;
                if (!C7627.m23993(str, str.length() - length, this.f462, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!C7627.m24008(this.f462, "*.", false, 2, null)) {
                    return C5499.m17094(str, this.f462);
                }
                int length3 = this.f462.length() - 1;
                int length4 = str.length() - length3;
                if (!C7627.m23993(str, str.length() - length3, this.f462, 1, length3, false, 16, null) || C7628.m24070(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۧ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n*L\n152#1:371\n152#1:372,3\n*E\n"})
    public static final class C3688 extends AbstractC5673 implements InterfaceC5122<List<? extends X509Certificate>> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ List<Certificate> f6506;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ String f6507;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.security.cert.Certificate> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3688(List<? extends Certificate> list, String str) {
            super(0);
            this.f6506 = list;
            this.f6507 = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX DEBUG: Return type fixed from 'java.util.List<java.security.cert.X509Certificate>' to match base method */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final List<? extends X509Certificate> invoke() {
            List<Certificate> listMo283;
            AbstractC3685 abstractC3685M10109 = C3686.this.m10109();
            if (abstractC3685M10109 == null || (listMo283 = abstractC3685M10109.mo283(this.f6506, this.f6507)) == null) {
                listMo283 = this.f6506;
            }
            ArrayList arrayList = new ArrayList(C3881.m10756(listMo283, 10));
            for (Certificate certificate : listMo283) {
                C5499.m17101(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3686(@InterfaceC6399 Set<C3687> set, @InterfaceC6489 AbstractC3685 abstractC3685) {
        C5499.m17103(set, "pins");
        this.f459 = set;
        this.f460 = abstractC3685;
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String m10104(@InterfaceC6399 Certificate certificate) {
        return f6502.m759(certificate);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C3630 m10105(@InterfaceC6399 X509Certificate x509Certificate) {
        return f6502.m760(x509Certificate);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C3630 m10106(@InterfaceC6399 X509Certificate x509Certificate) {
        return f6502.m10113(x509Certificate);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C3686) {
            C3686 c3686 = (C3686) obj;
            if (C5499.m17094(c3686.f459, this.f459) && C5499.m17094(c3686.f460, this.f460)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f459.hashCode()) * 41;
        AbstractC3685 abstractC3685 = this.f460;
        return iHashCode + (abstractC3685 != null ? abstractC3685.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m755(@InterfaceC6399 String str, @InterfaceC6399 List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        C5499.m17103(str, "hostname");
        C5499.m17103(list, "peerCertificates");
        m10107(str, new C3688(list, str));
    }

    @InterfaceC4372(message = "replaced with {@link #check(String, List)}.", replaceWith = @InterfaceC7097(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ */
    public final void m756(@InterfaceC6399 String str, @InterfaceC6399 Certificate... certificateArr) throws SSLPeerUnverifiedException {
        C5499.m17103(str, "hostname");
        C5499.m17103(certificateArr, "peerCertificates");
        m755(str, C3411.m8926(certificateArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m10107(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5122<? extends List<? extends X509Certificate>> interfaceC5122) throws SSLPeerUnverifiedException {
        C5499.m17103(str, "hostname");
        C5499.m17103(interfaceC5122, "cleanedPeerCertificatesFn");
        List<C3687> listM10108 = m10108(str);
        if (listM10108.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = interfaceC5122.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            C3630 c3630M10113 = null;
            C3630 c3630M760 = null;
            for (C3687 c3687 : listM10108) {
                String strM762 = c3687.m762();
                if (C5499.m17094(strM762, "sha256")) {
                    if (c3630M10113 == null) {
                        c3630M10113 = f6502.m10113(x509Certificate);
                    }
                    if (C5499.m17094(c3687.m761(), c3630M10113)) {
                        return;
                    }
                } else {
                    if (!C5499.m17094(strM762, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + c3687.m762());
                    }
                    if (c3630M760 == null) {
                        c3630M760 = f6502.m760(x509Certificate);
                    }
                    if (C5499.m17094(c3687.m761(), c3630M760)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb.append("\n    ");
            sb.append(f6502.m759(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (C3687 c36872 : listM10108) {
            sb.append("\n    ");
            sb.append(c36872);
        }
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final List<C3687> m10108(@InterfaceC6399 String str) {
        C5499.m17103(str, "hostname");
        Set<C3687> set = this.f459;
        List<C3687> listM10735 = C3880.m10735();
        for (Object obj : set) {
            if (((C3687) obj).m10116(str)) {
                if (listM10735.isEmpty()) {
                    listM10735 = new ArrayList<>();
                }
                C5499.m17101(listM10735, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                C8012.m25255(listM10735).add(obj);
            }
        }
        return listM10735;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final AbstractC3685 m10109() {
        return this.f460;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Set<C3687> m10110() {
        return this.f459;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C3686 m10111(@InterfaceC6399 AbstractC3685 abstractC3685) {
        C5499.m17103(abstractC3685, "certificateChainCleaner");
        return C5499.m17094(this.f460, abstractC3685) ? this : new C3686(this.f459, abstractC3685);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.Set)
  (wrap:Yue.ۥ۟ۤ۟ۦ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null Yue.ۥ۟ۤ۟ۦ) : (r2v0 Yue.ۥ۟ۤ۟ۦ))
 A[MD:(java.util.Set<Yue.ۥ۟ۤ۟ۧ$ۥ۟۟>, Yue.ۥ۟ۤ۟ۦ):void (m)] (LINE:4) call: Yue.ۥ۟ۤ۟ۧ.<init>(java.util.Set, Yue.ۥ۟ۤ۟ۦ):void type: THIS */
    public /* synthetic */ C3686(Set set, AbstractC3685 abstractC3685, int i, C4335 c4335) {
        this(set, (i & 2) != 0 ? null : abstractC3685);
    }
}
