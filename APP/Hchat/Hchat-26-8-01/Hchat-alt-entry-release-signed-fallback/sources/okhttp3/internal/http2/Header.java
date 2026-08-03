package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Header {
    public static final okhttp3.internal.http2.Header.Companion Companion = null;
    public static final okio.ByteString PSEUDO_PREFIX = null;
    public static final okio.ByteString RESPONSE_STATUS = null;
    public static final java.lang.String RESPONSE_STATUS_UTF8 = ":status";
    public static final okio.ByteString TARGET_AUTHORITY = null;
    public static final java.lang.String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final okio.ByteString TARGET_METHOD = null;
    public static final java.lang.String TARGET_METHOD_UTF8 = ":method";
    public static final okio.ByteString TARGET_PATH = null;
    public static final java.lang.String TARGET_PATH_UTF8 = ":path";
    public static final okio.ByteString TARGET_SCHEME = null;
    public static final java.lang.String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final okio.ByteString name;
    public final okio.ByteString value;

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
            okhttp3.internal.http2.Header$Companion r0 = new okhttp3.internal.http2.Header$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Header.Companion = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = ":"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.PSEUDO_PREFIX = r1
            java.lang.String r1 = ":status"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.RESPONSE_STATUS = r1
            java.lang.String r1 = ":method"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.TARGET_METHOD = r1
            java.lang.String r1 = ":path"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.TARGET_PATH = r1
            java.lang.String r1 = ":scheme"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.TARGET_SCHEME = r1
            java.lang.String r1 = ":authority"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Header.TARGET_AUTHORITY = r0
            return
    }

    public Header(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r2 = r0.encodeUtf8(r2)
            okio.ByteString r3 = r0.encodeUtf8(r3)
            r1.<init>(r2, r3)
            return
    }

    public Header(okio.ByteString r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r3 = r0.encodeUtf8(r3)
            r1.<init>(r2, r3)
            return
    }

    public Header(okio.ByteString r1, okio.ByteString r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.name = r1
            r0.value = r2
            int r1 = r1.size()
            int r1 = r1 + 32
            int r2 = r2.size()
            int r2 = r2 + r1
            r0.hpackSize = r2
            return
    }

    public static /* synthetic */ okhttp3.internal.http2.Header copy$default(okhttp3.internal.http2.Header r0, okio.ByteString r1, okio.ByteString r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            okio.ByteString r1 = r0.name
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            okio.ByteString r2 = r0.value
        Lc:
            okhttp3.internal.http2.Header r0 = r0.copy(r1, r2)
            return r0
    }

    public final okio.ByteString component1() {
            r1 = this;
            okio.ByteString r0 = r1.name
            return r0
    }

    public final okio.ByteString component2() {
            r1 = this;
            okio.ByteString r0 = r1.value
            return r0
    }

    public final okhttp3.internal.http2.Header copy(okio.ByteString r2, okio.ByteString r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof okhttp3.internal.http2.Header
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            okhttp3.internal.http2.Header r5 = (okhttp3.internal.http2.Header) r5
            okio.ByteString r1 = r4.name
            okio.ByteString r3 = r5.name
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            okio.ByteString r1 = r4.value
            okio.ByteString r5 = r5.value
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r2 = this;
            okio.ByteString r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            okio.ByteString r1 = r2.value
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okio.ByteString r1 = r2.name
            java.lang.String r1 = r1.utf8()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            okio.ByteString r1 = r2.value
            java.lang.String r1 = r1.utf8()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
