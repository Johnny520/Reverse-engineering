package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class StreamResetException extends java.io.IOException {
    public final okhttp3.internal.http2.ErrorCode errorCode;

    public StreamResetException(okhttp3.internal.http2.ErrorCode r3) {
            r2 = this;
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "stream was reset: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.errorCode = r3
            return
    }
}
