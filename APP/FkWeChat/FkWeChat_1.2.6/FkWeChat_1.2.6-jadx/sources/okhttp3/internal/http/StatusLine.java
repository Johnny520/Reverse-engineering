package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8644z;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m16758d2 = {"Lokhttp3/internal/http/StatusLine;", _UrlKt.FRAGMENT_ENCODE_SET, "protocol", "Lokhttp3/Protocol;", "code", _UrlKt.FRAGMENT_ENCODE_SET, "message", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class StatusLine {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final int code;
    public final String message;
    public final Protocol protocol;

    public StatusLine(Protocol protocol, int i10, String str) {
        protocol.getClass();
        str.getClass();
        this.protocol = protocol;
        this.code = i10;
        this.message = str;
    }

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

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m16758d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "get", "Lokhttp3/internal/http/StatusLine;", "response", "Lokhttp3/Response;", "parse", "statusLine", _UrlKt.FRAGMENT_ENCODE_SET, "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final StatusLine get(Response response) {
            response.getClass();
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String statusLine) throws ProtocolException {
            Protocol protocol;
            int i10;
            String strSubstring;
            statusLine.getClass();
            if (AbstractC8611a0.m33075T(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else if (AbstractC8611a0.m33075T(statusLine, "ICY ", false, 2, null)) {
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            } else {
                if (!AbstractC8611a0.m33075T(statusLine, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = Protocol.HTTP_1_1;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            Integer numM33252s = AbstractC8644z.m33252s(statusLine.substring(i10, i11));
            if (numM33252s == null) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iIntValue = numM33252s.intValue();
            if (statusLine.length() <= i11) {
                strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i10 + 4);
            }
            return new StatusLine(protocol, iIntValue, strSubstring);
        }

        private Companion() {
        }
    }
}
