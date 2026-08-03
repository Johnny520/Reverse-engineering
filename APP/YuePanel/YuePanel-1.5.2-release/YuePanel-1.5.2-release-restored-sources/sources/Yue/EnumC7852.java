package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC7852 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1378 f23467 = new C1378(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final String f23474;

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۟$ۥ */
    public static final class C1378 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۡۧ۟.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1378(C4335 c4335) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ */
        public final EnumC7852 m3941(@InterfaceC6399 String str) {
            C5499.m17103(str, "javaName");
            int iHashCode = str.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return EnumC7852.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return EnumC7852.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return EnumC7852.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return EnumC7852.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return EnumC7852.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1378() {
        }
    }

    EnumC7852(String str) {
        this.f23474 = str;
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final EnumC7852 m24917(@InterfaceC6399 String str) {
        return f23467.m3941(str);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "javaName", imports = {}))
    @InterfaceC5572(name = "-deprecated_javaName")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final String m24918() {
        return this.f23474;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "javaName")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final String m24919() {
        return this.f23474;
    }
}
