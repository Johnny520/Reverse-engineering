package okhttp3.internal.http;

import gg.AbstractC1411g;
import java.net.ProtocolException;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Response;
import p218og.AbstractC3156t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StatusLine(Protocol protocol, int i9, String str) {
        protocol.getClass();
        str.getClass();
        this.protocol = protocol;
        this.code = i9;
        this.message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.code);
        sb2.append(' ');
        sb2.append(this.message);
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.http.StatusLine.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final StatusLine get(Response response) {
            response.getClass();
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final StatusLine parse(String str) throws ProtocolException {
            Protocol protocol;
            int i9;
            String strSubstring;
            str.getClass();
            if (AbstractC3156t.m6740d0(str, "HTTP/1.", false)) {
                i9 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!AbstractC3156t.m6740d0(str, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_0;
                i9 = 4;
            }
            int i10 = i9 + 3;
            if (str.length() < i10) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            try {
                int i11 = Integer.parseInt(str.substring(i9, i10));
                if (str.length() <= i10) {
                    strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    if (str.charAt(i10) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    strSubstring = str.substring(i9 + 4);
                }
                return new StatusLine(protocol, i11, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }

        private Companion() {
        }
    }
}
