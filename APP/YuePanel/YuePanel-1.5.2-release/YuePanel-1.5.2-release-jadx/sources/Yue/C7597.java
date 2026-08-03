package Yue;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7597 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1304 f22994 = new C1304(null);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f22995 = 307;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f22996 = 308;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f22997 = 421;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f22998 = 100;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    @InterfaceC5568
    public final EnumC6835 f2959;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5568
    public final int f2960;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final String f22999;

    /* JADX INFO: renamed from: Yue.ۥۢ۠۠۟$ۥ */
    public static final class C1304 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢ۠۠۟.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1304(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C7597 m3756(@InterfaceC6399 C7141 c7141) {
            C5499.m17103(c7141, "response");
            return new C7597(c7141.m22329(), c7141.m22315(), c7141.m22324());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C7597 m3757(@InterfaceC6399 String str) throws IOException {
            EnumC6835 enumC6835;
            int i;
            String strSubstring;
            C5499.m17103(str, "statusLine");
            if (C7627.m24008(str, "HTTP/1.", false, 2, null)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    enumC6835 = EnumC6835.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    enumC6835 = EnumC6835.HTTP_1_1;
                }
            } else {
                if (!C7627.m24008(str, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                enumC6835 = EnumC6835.HTTP_1_0;
                i = 4;
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            try {
                String strSubstring2 = str.substring(i, i2);
                C5499.m17102(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i3 = Integer.parseInt(strSubstring2);
                if (str.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i2) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    strSubstring = str.substring(i + 4);
                    C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new C7597(enumC6835, i3, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1304() {
        }
    }

    public C7597(@InterfaceC6399 EnumC6835 enumC6835, int i, @InterfaceC6399 String str) {
        C5499.m17103(enumC6835, "protocol");
        C5499.m17103(str, "message");
        this.f2959 = enumC6835;
        this.f2960 = i;
        this.f22999 = str;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f2959 == EnumC6835.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f2960);
        sb.append(' ');
        sb.append(this.f22999);
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
