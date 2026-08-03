package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2 {
    private static final java.lang.String[] BINARY = null;
    public static final okio.ByteString CONNECTION_PREFACE = null;
    private static final java.lang.String[] FLAGS = null;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final java.lang.String[] FRAME_NAMES = null;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final okhttp3.internal.http2.Http2 INSTANCE = null;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
            okhttp3.internal.http2.Http2 r0 = new okhttp3.internal.http2.Http2
            r0.<init>()
            okhttp3.internal.http2.Http2.INSTANCE = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Http2.CONNECTION_PREFACE = r0
            java.lang.String r9 = "WINDOW_UPDATE"
            java.lang.String r10 = "CONTINUATION"
            java.lang.String r1 = "DATA"
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PRIORITY"
            java.lang.String r4 = "RST_STREAM"
            java.lang.String r5 = "SETTINGS"
            java.lang.String r6 = "PUSH_PROMISE"
            java.lang.String r7 = "PING"
            java.lang.String r8 = "GOAWAY"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            okhttp3.internal.http2.Http2.FRAME_NAMES = r0
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            okhttp3.internal.http2.Http2.FLAGS = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L37:
            r4 = 32
            if (r3 >= r0) goto L57
            java.lang.String r5 = java.lang.Integer.toBinaryString(r3)
            r5.getClass()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "%8s"
            java.lang.String r5 = okhttp3.internal.Util.format(r6, r5)
            r6 = 48
            java.lang.String r4 = og.t.b0(r5, r4, r6)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L37
        L57:
            okhttp3.internal.http2.Http2.BINARY = r1
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r1 = ""
            r0[r2] = r1
            java.lang.String r1 = "END_STREAM"
            r3 = 1
            r0[r3] = r1
            int[] r1 = new int[]{r3}
            java.lang.String r3 = "PADDED"
            r5 = 8
            r0[r5] = r3
            r3 = r1[r2]
            r6 = r3 | 8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r3 = r0[r3]
            java.lang.String r8 = "|PADDED"
            java.lang.String r3 = eh.a.r(r7, r3, r8)
            r0[r6] = r3
            java.lang.String r3 = "END_HEADERS"
            r6 = 4
            r0[r6] = r3
            java.lang.String r3 = "PRIORITY"
            r0[r4] = r3
            java.lang.String r3 = "END_HEADERS|PRIORITY"
            r7 = 36
            r0[r7] = r3
            int[] r0 = new int[]{r6, r4, r7}
            r3 = r2
        L95:
            r4 = 3
            if (r3 >= r4) goto Ld3
            r4 = r0[r3]
            r6 = r1[r2]
            java.lang.String[] r7 = okhttp3.internal.http2.Http2.FLAGS
            r9 = r6 | r4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = r7[r6]
            r10.append(r11)
            r11 = 124(0x7c, float:1.74E-43)
            r10.append(r11)
            r12 = r7[r4]
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r7[r9] = r10
            r9 = r9 | r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r6 = r7[r6]
            r10.append(r6)
            r10.append(r11)
            r4 = r7[r4]
            java.lang.String r4 = eh.a.r(r10, r4, r8)
            r7[r9] = r4
            int r3 = r3 + 1
            goto L95
        Ld3:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            int r0 = r0.length
        Ld6:
            if (r2 >= r0) goto Le7
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.FLAGS
            r3 = r1[r2]
            if (r3 != 0) goto Le4
            java.lang.String[] r3 = okhttp3.internal.http2.Http2.BINARY
            r3 = r3[r2]
            r1[r2] = r3
        Le4:
            int r2 = r2 + 1
            goto Ld6
        Le7:
            return
    }

    private Http2() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String formatFlags(int r4, int r5) {
            r3 = this;
            if (r5 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            r0 = 2
            if (r4 == r0) goto L53
            r0 = 3
            if (r4 == r0) goto L53
            r0 = 4
            if (r4 == r0) goto L48
            r0 = 6
            if (r4 == r0) goto L48
            r0 = 7
            if (r4 == r0) goto L53
            r0 = 8
            if (r4 == r0) goto L53
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            int r1 = r0.length
            if (r5 >= r1) goto L23
            r0 = r0[r5]
            r0.getClass()
            goto L27
        L23:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.BINARY
            r0 = r0[r5]
        L27:
            r1 = 5
            r2 = 0
            if (r4 != r1) goto L38
            r1 = r5 & 4
            if (r1 == 0) goto L38
            java.lang.String r4 = "HEADERS"
            java.lang.String r5 = "PUSH_PROMISE"
            java.lang.String r4 = og.t.a0(r0, r4, r5, r2)
            return r4
        L38:
            if (r4 != 0) goto L47
            r4 = r5 & 32
            if (r4 == 0) goto L47
            java.lang.String r4 = "PRIORITY"
            java.lang.String r5 = "COMPRESSED"
            java.lang.String r4 = og.t.a0(r0, r4, r5, r2)
            return r4
        L47:
            return r0
        L48:
            r4 = 1
            if (r5 != r4) goto L4e
            java.lang.String r4 = "ACK"
            return r4
        L4e:
            java.lang.String[] r4 = okhttp3.internal.http2.Http2.BINARY
            r4 = r4[r5]
            return r4
        L53:
            java.lang.String[] r4 = okhttp3.internal.http2.Http2.BINARY
            r4 = r4[r5]
            return r4
    }

    public final java.lang.String formattedType$okhttp(int r3) {
            r2 = this;
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FRAME_NAMES
            int r1 = r0.length
            if (r3 >= r1) goto L8
            r3 = r0[r3]
            return r3
        L8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = "0x%02x"
            java.lang.String r3 = okhttp3.internal.Util.format(r0, r3)
            return r3
    }

    public final java.lang.String frameLog(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            java.lang.String r0 = r1.formattedType$okhttp(r5)
            java.lang.String r5 = r1.formatFlags(r5, r6)
            if (r2 == 0) goto Ld
            java.lang.String r2 = "<<"
            goto Lf
        Ld:
            java.lang.String r2 = ">>"
        Lf:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r0, r5}
            java.lang.String r3 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r2 = okhttp3.internal.Util.format(r3, r2)
            return r2
    }
}
