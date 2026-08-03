package okio;

/* JADX INFO: renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    private static final boolean getBit(int r0, int r1) {
            int r0 = r0 >> r1
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public static final okio.GzipSource gzip(okio.Source r1) {
            r1.getClass()
            okio.GzipSource r0 = new okio.GzipSource
            r0.<init>(r1)
            return r0
    }
}
