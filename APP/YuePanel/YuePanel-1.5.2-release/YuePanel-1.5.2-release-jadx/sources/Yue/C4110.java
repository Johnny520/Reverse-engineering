package Yue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,350:1\n11065#2:351\n11400#2,3:352\n11065#2:355\n11400#2,3:356\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n*L\n59#1:351\n59#1:352,3\n75#1:355\n75#1:356,3\n*E\n"})
public final class C4110 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0327 f8200 = new C0327(null);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3820[] f8201;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3820[] f8202;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C4110 f8203;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C4110 f8204;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C4110 f8205;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C4110 f8206;

    /* JADX INFO: renamed from: ۥ */
    public final boolean f672;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f673;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final String[] f8207;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final String[] f8208;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۨ$ۥ۟ */
    public static final class C0327 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۦۧۨ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0327(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0327() {
        }
    }

    static {
        C3820 c3820 = C3820.f7211;
        C3820 c38202 = C3820.f7212;
        C3820 c38203 = C3820.f7213;
        C3820 c38204 = C3820.f7197;
        C3820 c38205 = C3820.f7201;
        C3820 c38206 = C3820.f7198;
        C3820 c38207 = C3820.f7202;
        C3820 c38208 = C3820.f7208;
        C3820 c38209 = C3820.f7207;
        C3820[] c3820Arr = {c3820, c38202, c38203, c38204, c38205, c38206, c38207, c38208, c38209};
        f8201 = c3820Arr;
        C3820[] c3820Arr2 = {c3820, c38202, c38203, c38204, c38205, c38206, c38207, c38208, c38209, C3820.f7182, C3820.f7183, C3820.f7154, C3820.f7155, C3820.f7126, C3820.f7130, C3820.f7104};
        f8202 = c3820Arr2;
        C0326 c0326M11710 = new C0326(true).m11710((C3820[]) Arrays.copyOf(c3820Arr, c3820Arr.length));
        EnumC7852 enumC7852 = EnumC7852.TLS_1_3;
        EnumC7852 enumC78522 = EnumC7852.TLS_1_2;
        f8203 = c0326M11710.m11721(enumC7852, enumC78522).m11720(true).m11709();
        f8204 = new C0326(true).m11710((C3820[]) Arrays.copyOf(c3820Arr2, c3820Arr2.length)).m11721(enumC7852, enumC78522).m11720(true).m11709();
        f8205 = new C0326(true).m11710((C3820[]) Arrays.copyOf(c3820Arr2, c3820Arr2.length)).m11721(enumC7852, enumC78522, EnumC7852.TLS_1_1, EnumC7852.TLS_1_0).m11720(true).m11709();
        f8206 = new C0326(false).m11709();
    }

    public C4110(boolean z, boolean z2, @InterfaceC6489 String[] strArr, @InterfaceC6489 String[] strArr2) {
        this.f672 = z;
        this.f673 = z2;
        this.f8207 = strArr;
        this.f8208 = strArr2;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (!(obj instanceof C4110)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f672;
        C4110 c4110 = (C4110) obj;
        if (z != c4110.f672) {
            return false;
        }
        return !z || (Arrays.equals(this.f8207, c4110.f8207) && Arrays.equals(this.f8208, c4110.f8208) && this.f673 == c4110.f673);
    }

    public int hashCode() {
        if (!this.f672) {
            return 17;
        }
        String[] strArr = this.f8207;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f8208;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f673 ? 1 : 0);
    }

    @InterfaceC6399
    public String toString() {
        if (!this.f672) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m11703(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m11708(), "[all enabled]") + ", supportsTlsExtensions=" + this.f673 + ')';
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "cipherSuites", imports = {}))
    @InterfaceC5572(name = "-deprecated_cipherSuites")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final List<C3820> m1069() {
        return m11703();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "supportsTlsExtensions", imports = {}))
    @InterfaceC5572(name = "-deprecated_supportsTlsExtensions")
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m1070() {
        return this.f673;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "tlsVersions", imports = {}))
    @InterfaceC5572(name = "-deprecated_tlsVersions")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final List<EnumC7852> m11701() {
        return m11708();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m11702(@InterfaceC6399 SSLSocket sSLSocket, boolean z) {
        C5499.m17103(sSLSocket, "sslSocket");
        C4110 c4110M11706 = m11706(sSLSocket, z);
        if (c4110M11706.m11708() != null) {
            sSLSocket.setEnabledProtocols(c4110M11706.f8208);
        }
        if (c4110M11706.m11703() != null) {
            sSLSocket.setEnabledCipherSuites(c4110M11706.f8207);
        }
    }

    @InterfaceC5572(name = "cipherSuites")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final List<C3820> m11703() {
        String[] strArr = this.f8207;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C3820.f521.m868(str));
        }
        return C3888.m11062(arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m11704(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "socket");
        if (!this.f672) {
            return false;
        }
        String[] strArr = this.f8208;
        if (strArr != null && !C8158.m26855(strArr, sSLSocket.getEnabledProtocols(), C4033.m11394())) {
            return false;
        }
        String[] strArr2 = this.f8207;
        return strArr2 == null || C8158.m26855(strArr2, sSLSocket.getEnabledCipherSuites(), C3820.f521.m10532());
    }

    @InterfaceC5572(name = "isTls")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m11705() {
        return this.f672;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C4110 m11706(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f8207 != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            C5499.m17102(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = C8158.m26867(enabledCipherSuites2, this.f8207, C3820.f521.m10532());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f8208 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            C5499.m17102(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = C8158.m26867(enabledProtocols2, this.f8208, C4033.m11394());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C5499.m17102(supportedCipherSuites, "supportedCipherSuites");
        int iM26859 = C8158.m26859(supportedCipherSuites, "TLS_FALLBACK_SCSV", C3820.f521.m10532());
        if (z && iM26859 != -1) {
            C5499.m17102(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iM26859];
            C5499.m17102(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = C8158.m26847(enabledCipherSuites, str);
        }
        C0326 c0326 = new C0326(this);
        C5499.m17102(enabledCipherSuites, "cipherSuitesIntersection");
        C0326 c0326M11711 = c0326.m11711((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        C5499.m17102(enabledProtocols, "tlsVersionsIntersection");
        return c0326M11711.m11722((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).m11709();
    }

    @InterfaceC5572(name = "supportsTlsExtensions")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m11707() {
        return this.f673;
    }

    @InterfaceC5572(name = "tlsVersions")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final List<EnumC7852> m11708() {
        String[] strArr = this.f8208;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(EnumC7852.f23467.m3941(str));
        }
        return C3888.m11062(arrayList);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۨ$ۥ */
    @InterfaceC7507({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"})
    public static final class C0326 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f674;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6489
        public String[] f675;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public String[] f8209;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f8210;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0326(boolean z) {
            this.f674 = z;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C0326 m1071() {
            if (!this.f674) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            this.f675 = null;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0326 m1072() {
            if (!this.f674) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            this.f8209 = null;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C4110 m11709() {
            return new C4110(this.f674, this.f8210, this.f675, this.f8209);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C0326 m11710(@InterfaceC6399 C3820... c3820Arr) {
            C5499.m17103(c3820Arr, "cipherSuites");
            if (!this.f674) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(c3820Arr.length);
            for (C3820 c3820 : c3820Arr) {
                arrayList.add(c3820.m10531());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m11711((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C0326 m11711(@InterfaceC6399 String... strArr) {
            C5499.m17103(strArr, "cipherSuites");
            if (!this.f674) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.f675 = (String[]) strArr.clone();
            return this;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final String[] m11712() {
            return this.f675;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m11713() {
            return this.f8210;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean m11714() {
            return this.f674;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final String[] m11715() {
            return this.f8209;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m11716(@InterfaceC6489 String[] strArr) {
            this.f675 = strArr;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m11717(boolean z) {
            this.f8210 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m11718(boolean z) {
            this.f674 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m11719(@InterfaceC6489 String[] strArr) {
            this.f8209 = strArr;
        }

        @InterfaceC6399
        @InterfaceC4372(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final C0326 m11720(boolean z) {
            if (!this.f674) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f8210 = z;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final C0326 m11721(@InterfaceC6399 EnumC7852... enumC7852Arr) {
            C5499.m17103(enumC7852Arr, "tlsVersions");
            if (!this.f674) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(enumC7852Arr.length);
            for (EnumC7852 enumC7852 : enumC7852Arr) {
                arrayList.add(enumC7852.m24919());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m11722((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final C0326 m11722(@InterfaceC6399 String... strArr) {
            C5499.m17103(strArr, "tlsVersions");
            if (!this.f674) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.f8209 = (String[]) strArr.clone();
            return this;
        }

        public C0326(@InterfaceC6399 C4110 c4110) {
            C5499.m17103(c4110, "connectionSpec");
            this.f674 = c4110.m11705();
            this.f675 = c4110.f8207;
            this.f8209 = c4110.f8208;
            this.f8210 = c4110.m11707();
        }
    }
}
