package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RealResponseBody extends okhttp3.ResponseBody {
    private final long contentLength;
    private final java.lang.String contentTypeString;
    private final okio.BufferedSource source;

    public RealResponseBody(java.lang.String r1, long r2, okio.BufferedSource r4) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.contentTypeString = r1
            r0.contentLength = r2
            r0.source = r4
            return
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
            r2 = this;
            long r0 = r2.contentLength
            return r0
    }

    @Override // okhttp3.ResponseBody
    public okhttp3.MediaType contentType() {
            r2 = this;
            java.lang.String r0 = r2.contentTypeString
            if (r0 == 0) goto Lb
            okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
            okhttp3.MediaType r0 = r1.parse(r0)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // okhttp3.ResponseBody
    public okio.BufferedSource source() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            return r0
    }
}
