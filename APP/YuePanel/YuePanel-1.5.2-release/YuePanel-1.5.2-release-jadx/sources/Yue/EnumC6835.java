package Yue;

import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۡۥۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6835 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1095 f17734 = new C1095(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final String f17742;

    /* JADX INFO: renamed from: Yue.ۥۡۥۣۧ$ۥ */
    public static final class C1095 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۥۣۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1095(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ */
        public final EnumC6835 m3287(@InterfaceC6399 String str) throws IOException {
            C5499.m17103(str, "protocol");
            EnumC6835 enumC6835 = EnumC6835.HTTP_1_0;
            if (!C5499.m17094(str, enumC6835.f17742)) {
                enumC6835 = EnumC6835.HTTP_1_1;
                if (!C5499.m17094(str, enumC6835.f17742)) {
                    enumC6835 = EnumC6835.H2_PRIOR_KNOWLEDGE;
                    if (!C5499.m17094(str, enumC6835.f17742)) {
                        enumC6835 = EnumC6835.HTTP_2;
                        if (!C5499.m17094(str, enumC6835.f17742)) {
                            enumC6835 = EnumC6835.SPDY_3;
                            if (!C5499.m17094(str, enumC6835.f17742)) {
                                enumC6835 = EnumC6835.QUIC;
                                if (!C5499.m17094(str, enumC6835.f17742)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return enumC6835;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1095() {
        }
    }

    EnumC6835(String str) {
        this.f17742 = str;
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final EnumC6835 m21584(@InterfaceC6399 String str) throws IOException {
        return f17734.m3287(str);
    }

    @Override // java.lang.Enum
    @InterfaceC6399
    public String toString() {
        return this.f17742;
    }
}
