package okhttp3.internal.http1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HeadersReader {
    public static final okhttp3.internal.http1.HeadersReader.Companion Companion = null;
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http1.HeadersReader$Companion r0 = new okhttp3.internal.http1.HeadersReader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http1.HeadersReader.Companion = r0
            return
    }

    public HeadersReader(okio.BufferedSource r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.source = r3
            r0 = 262144(0x40000, double:1.295163E-318)
            r2.headerLimit = r0
            return
    }

    public final okio.BufferedSource getSource() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            return r0
    }

    public final okhttp3.Headers readHeaders() {
            r3 = this;
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
        L5:
            java.lang.String r1 = r3.readLine()
            int r2 = r1.length()
            if (r2 != 0) goto L14
            okhttp3.Headers r0 = r0.build()
            return r0
        L14:
            r0.addLenient$okhttp(r1)
            goto L5
    }

    public final java.lang.String readLine() {
            r5 = this;
            okio.BufferedSource r0 = r5.source
            long r1 = r5.headerLimit
            java.lang.String r0 = r0.readUtf8LineStrict(r1)
            long r1 = r5.headerLimit
            int r3 = r0.length()
            long r3 = (long) r3
            long r1 = r1 - r3
            r5.headerLimit = r1
            return r0
    }
}
