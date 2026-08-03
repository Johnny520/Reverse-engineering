package Yue;

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

/* JADX INFO: renamed from: Yue.ۥ۠ۤۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"})
public final class C5241 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0680 f12481 = new C0680(null);

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final EnumC7852 f1362;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final C3820 f1363;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final List<Certificate> f12482;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5684 f12483;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۡ۠$ۥ */
    @InterfaceC7507({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    public static final class C0680 {

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۡ۠$ۥ$ۥ, reason: contains not printable characters */
        public static final class C5242 extends AbstractC5673 implements InterfaceC5122<List<? extends Certificate>> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ List<Certificate> f12484;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends java.security.cert.Certificate> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C5242(List<? extends Certificate> list) {
                super(0);
                this.f12484 = list;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX DEBUG: Return type fixed from 'java.util.List<java.security.cert.Certificate>' to match base method */
            @Override // Yue.InterfaceC5122
            @InterfaceC6399
            public final List<? extends Certificate> invoke() {
                return this.f12484;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۤۡ۠$ۥ$ۥ۟, reason: contains not printable characters */
        public static final class C5243 extends AbstractC5673 implements InterfaceC5122<List<? extends Certificate>> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ List<Certificate> f12485;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends java.security.cert.Certificate> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C5243(List<? extends Certificate> list) {
                super(0);
                this.f12485 = list;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX DEBUG: Return type fixed from 'java.util.List<java.security.cert.Certificate>' to match base method */
            @Override // Yue.InterfaceC5122
            @InterfaceC6399
            public final List<? extends Certificate> invoke() {
                return this.f12485;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۡ۠.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0680(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "sslSession.handshake()", imports = {}))
        @InterfaceC5572(name = "-deprecated_get")
        /* JADX INFO: renamed from: ۥ */
        public final C5241 m2008(@InterfaceC6399 SSLSession sSLSession) throws IOException {
            C5499.m17103(sSLSession, "sslSession");
            return m16069(sSLSession);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟ */
        public final C5241 m2009(@InterfaceC6399 EnumC7852 enumC7852, @InterfaceC6399 C3820 c3820, @InterfaceC6399 List<? extends Certificate> list, @InterfaceC6399 List<? extends Certificate> list2) {
            C5499.m17103(enumC7852, "tlsVersion");
            C5499.m17103(c3820, "cipherSuite");
            C5499.m17103(list, "peerCertificates");
            C5499.m17103(list2, "localCertificates");
            return new C5241(enumC7852, c3820, C8158.m26889(list2), new C5242(C8158.m26889(list)));
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5572(name = "get")
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5241 m16069(@InterfaceC6399 SSLSession sSLSession) throws IOException {
            List<Certificate> listM10735;
            C5499.m17103(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (C5499.m17094(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : C5499.m17094(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C3820 c3820M868 = C3820.f521.m868(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (C5499.m17094("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            EnumC7852 enumC7852M3941 = EnumC7852.f23467.m3941(protocol);
            try {
                listM10735 = m16070(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listM10735 = C3880.m10735();
            }
            return new C5241(enumC7852M3941, c3820M868, m16070(sSLSession.getLocalCertificates()), new C5243(listM10735));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final List<Certificate> m16070(Certificate[] certificateArr) {
            return certificateArr != null ? C8158.m26858(Arrays.copyOf(certificateArr, certificateArr.length)) : C3880.m10735();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0680() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۡ۠$ۥ۟ */
    public static final class C0681 extends AbstractC5673 implements InterfaceC5122<List<? extends Certificate>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<List<Certificate>> f12486;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends java.util.List<? extends java.security.cert.Certificate>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0681(InterfaceC5122<? extends List<? extends Certificate>> interfaceC5122) {
            super(0);
            this.f12486 = interfaceC5122;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX DEBUG: Return type fixed from 'java.util.List<java.security.cert.Certificate>' to match base method */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final List<? extends Certificate> invoke() {
            try {
                return this.f12486.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C3880.m10735();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends java.security.cert.Certificate> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5241(@InterfaceC6399 EnumC7852 enumC7852, @InterfaceC6399 C3820 c3820, @InterfaceC6399 List<? extends Certificate> list, @InterfaceC6399 InterfaceC5122<? extends List<? extends Certificate>> interfaceC5122) {
        C5499.m17103(enumC7852, "tlsVersion");
        C5499.m17103(c3820, "cipherSuite");
        C5499.m17103(list, "localCertificates");
        C5499.m17103(interfaceC5122, "peerCertificatesFn");
        this.f1362 = enumC7852;
        this.f1363 = c3820;
        this.f12482 = list;
        this.f12483 = C5689.m2370(new C0681(interfaceC5122));
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C5241 m16056(@InterfaceC6399 EnumC7852 enumC7852, @InterfaceC6399 C3820 c3820, @InterfaceC6399 List<? extends Certificate> list, @InterfaceC6399 List<? extends Certificate> list2) {
        return f12481.m2009(enumC7852, c3820, list, list2);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5572(name = "get")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C5241 m16057(@InterfaceC6399 SSLSession sSLSession) throws IOException {
        return f12481.m16069(sSLSession);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C5241) {
            C5241 c5241 = (C5241) obj;
            if (c5241.f1362 == this.f1362 && C5499.m17094(c5241.f1363, this.f1363) && C5499.m17094(c5241.m16066(), m16066()) && C5499.m17094(c5241.f12482, this.f12482)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f1362.hashCode()) * 31) + this.f1363.hashCode()) * 31) + m16066().hashCode()) * 31) + this.f12482.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        List<Certificate> listM16066 = m16066();
        ArrayList arrayList = new ArrayList(C3881.m10756(listM16066, 10));
        Iterator<T> it = listM16066.iterator();
        while (it.hasNext()) {
            arrayList.add(m16063((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f1362);
        sb.append(" cipherSuite=");
        sb.append(this.f1363);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f12482;
        ArrayList arrayList2 = new ArrayList(C3881.m10756(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m16063((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append(C6193.f1885);
        return sb.toString();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "cipherSuite", imports = {}))
    @InterfaceC5572(name = "-deprecated_cipherSuite")
    /* JADX INFO: renamed from: ۥ */
    public final C3820 m2006() {
        return this.f1363;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "localCertificates", imports = {}))
    @InterfaceC5572(name = "-deprecated_localCertificates")
    /* JADX INFO: renamed from: ۥ۟ */
    public final List<Certificate> m2007() {
        return this.f12482;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "localPrincipal", imports = {}))
    @InterfaceC5572(name = "-deprecated_localPrincipal")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Principal m16058() {
        return m16065();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "peerCertificates", imports = {}))
    @InterfaceC5572(name = "-deprecated_peerCertificates")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final List<Certificate> m16059() {
        return m16066();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "peerPrincipal", imports = {}))
    @InterfaceC5572(name = "-deprecated_peerPrincipal")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Principal m16060() {
        return m16067();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "tlsVersion", imports = {}))
    @InterfaceC5572(name = "-deprecated_tlsVersion")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final EnumC7852 m16061() {
        return this.f1362;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "cipherSuite")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final C3820 m16062() {
        return this.f1363;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final String m16063(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C5499.m17102(type, "type");
        return type;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "localCertificates")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final List<Certificate> m16064() {
        return this.f12482;
    }

    @InterfaceC5572(name = "localPrincipal")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Principal m16065() {
        Object objM10891 = C3888.m10891(this.f12482);
        X509Certificate x509Certificate = objM10891 instanceof X509Certificate ? (X509Certificate) objM10891 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "peerCertificates")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final List<Certificate> m16066() {
        return (List) this.f12483.getValue();
    }

    @InterfaceC5572(name = "peerPrincipal")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Principal m16067() {
        Object objM10891 = C3888.m10891(m16066());
        X509Certificate x509Certificate = objM10891 instanceof X509Certificate ? (X509Certificate) objM10891 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "tlsVersion")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final EnumC7852 m16068() {
        return this.f1362;
    }
}
