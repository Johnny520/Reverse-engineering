package okhttp3.internal.http1;

import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal.url._UrlKt;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m16758d2 = {"Lokhttp3/internal/http1/HeadersReader;", _UrlKt.FRAGMENT_ENCODE_SET, "Lzd/k;", "source", "<init>", "(Lzd/k;)V", _UrlKt.FRAGMENT_ENCODE_SET, "readLine", "()Ljava/lang/String;", "Lokhttp3/Headers;", "readHeaders", "()Lokhttp3/Headers;", "Lzd/k;", "getSource", "()Lzd/k;", _UrlKt.FRAGMENT_ENCODE_SET, "headerLimit", "J", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class HeadersReader {
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final InterfaceC9999k source;

    public HeadersReader(InterfaceC9999k interfaceC9999k) {
        interfaceC9999k.getClass();
        this.source = interfaceC9999k;
        this.headerLimit = 262144L;
    }

    public final InterfaceC9999k getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    public final String readLine() {
        String strMo38694U = this.source.mo38694U(this.headerLimit);
        this.headerLimit -= (long) strMo38694U.length();
        return strMo38694U;
    }
}
