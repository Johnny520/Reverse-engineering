package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final BufferedSource source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RealResponseBody(String str, long j3, BufferedSource bufferedSource) {
        bufferedSource.getClass();
        this.contentTypeString = str;
        this.contentLength = j3;
        this.source = bufferedSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        return this.source;
    }
}
