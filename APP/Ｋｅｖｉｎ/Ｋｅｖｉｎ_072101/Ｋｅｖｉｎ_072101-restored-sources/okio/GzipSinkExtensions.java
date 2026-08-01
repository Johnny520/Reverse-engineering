package okio;

/* JADX INFO: renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b¨\u0006\u0003"}, m115d2 = {"gzip", "Lokio/GzipSink;", "Lokio/Sink;", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class GzipSinkExtensions {
    public static final okio.GzipSink gzip(okio.Sink r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.GzipSink r1 = new okio.GzipSink
            r1.<init>(r2)
            return r1
    }
}
