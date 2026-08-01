package okio;

/* JADX INFO: renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, m115d2 = {"deflate", "Lokio/DeflaterSink;", "Lokio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class DeflaterSinkExtensions {
    public static final okio.DeflaterSink deflate(okio.Sink r2, java.util.zip.Deflater r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "deflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            okio.DeflaterSink r1 = new okio.DeflaterSink
            r1.<init>(r2, r3)
            return r1
    }

    public static /* synthetic */ okio.DeflaterSink deflate$default(okio.Sink r0, java.util.zip.Deflater r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            java.util.zip.Deflater r2 = new java.util.zip.Deflater
            r2.<init>()
            r1 = r2
        La:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "deflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            okio.DeflaterSink r3 = new okio.DeflaterSink
            r3.<init>(r0, r1)
            return r3
    }
}
