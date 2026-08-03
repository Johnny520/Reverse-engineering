package okio;

/* JADX INFO: renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DeflaterSinkExtensions {
    public static final okio.DeflaterSink deflate(okio.Sink r1, java.util.zip.Deflater r2) {
            r1.getClass()
            r2.getClass()
            okio.DeflaterSink r0 = new okio.DeflaterSink
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.DeflaterSink deflate$default(okio.Sink r0, java.util.zip.Deflater r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L9
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
        L9:
            r0.getClass()
            r1.getClass()
            okio.DeflaterSink r2 = new okio.DeflaterSink
            r2.<init>(r0, r1)
            return r2
    }
}
