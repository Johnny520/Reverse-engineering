package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0002\b#J.\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, m115d2 = {"Lokhttp3/internal/http2/Http2;", "", "()V", "BINARY", "", "", "[Ljava/lang/String;", "CONNECTION_PREFACE", "Lokio/ByteString;", "FLAGS", "FLAG_ACK", "", "FLAG_COMPRESSED", "FLAG_END_HEADERS", "FLAG_END_PUSH_PROMISE", "FLAG_END_STREAM", "FLAG_NONE", "FLAG_PADDED", "FLAG_PRIORITY", "FRAME_NAMES", "INITIAL_MAX_FRAME_SIZE", "TYPE_CONTINUATION", "TYPE_DATA", "TYPE_GOAWAY", "TYPE_HEADERS", "TYPE_PING", "TYPE_PRIORITY", "TYPE_PUSH_PROMISE", "TYPE_RST_STREAM", "TYPE_SETTINGS", "TYPE_WINDOW_UPDATE", "formatFlags", "type", "flags", "formattedType", "formattedType$okhttp", "frameLog", "inbound", "", "streamId", "length", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
            java.lang.String r10 = "CONTINUATION"
            java.lang.String r1 = "DATA"
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PRIORITY"
            java.lang.String r4 = "RST_STREAM"
            java.lang.String r5 = "SETTINGS"
            java.lang.String r6 = "PUSH_PROMISE"
            java.lang.String r7 = "PING"
            java.lang.String r8 = "GOAWAY"
            java.lang.String r9 = "WINDOW_UPDATE"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            okhttp3.internal.http2.Http2.FRAME_NAMES = r0
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            okhttp3.internal.http2.Http2.FLAGS = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L3c:
            if (r3 >= r0) goto L61
            java.lang.String r4 = java.lang.Integer.toBinaryString(r3)
            java.lang.String r5 = "toBinaryString(it)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "%8s"
            java.lang.String r6 = okhttp3.internal.Util.format(r5, r4)
            r10 = 4
            r11 = 0
            r7 = 32
            r8 = 48
            r9 = 0
            java.lang.String r4 = kotlin.text.StringsKt.replace$default(r6, r7, r8, r9, r10, r11)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L3c
        L61:
            okhttp3.internal.http2.Http2.BINARY = r1
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r1 = ""
            r0[r2] = r1
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r1 = "END_STREAM"
            r3 = 1
            r0[r3] = r1
            int[] r0 = new int[]{r3}
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r3 = "PADDED"
            r4 = 8
            r1[r4] = r3
            int r1 = r0.length
            r3 = r2
        L7f:
            java.lang.String r5 = "|PADDED"
            if (r3 >= r1) goto La3
            r6 = r0[r3]
            java.lang.String[] r7 = okhttp3.internal.http2.Http2.FLAGS
            r8 = r6 | 8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String[] r10 = okhttp3.internal.http2.Http2.FLAGS
            r10 = r10[r6]
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r5 = r9.append(r5)
            java.lang.String r5 = r5.toString()
            r7[r8] = r5
            int r3 = r3 + 1
            goto L7f
        La3:
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r3 = "END_HEADERS"
            r6 = 4
            r1[r6] = r3
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r3 = "PRIORITY"
            r7 = 32
            r1[r7] = r3
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r3 = "END_HEADERS|PRIORITY"
            r8 = 36
            r1[r8] = r3
            int[] r1 = new int[]{r6, r7, r8}
            int r3 = r1.length
            r6 = r2
        Lc0:
            if (r6 >= r3) goto L11d
            r7 = r1[r6]
            int r8 = r0.length
            r9 = r2
        Lc6:
            if (r9 >= r8) goto L11a
            r10 = r0[r9]
            java.lang.String[] r11 = okhttp3.internal.http2.Http2.FLAGS
            r12 = r10 | r7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String[] r14 = okhttp3.internal.http2.Http2.FLAGS
            r14 = r14[r10]
            java.lang.StringBuilder r13 = r13.append(r14)
            r14 = 124(0x7c, float:1.74E-43)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String[] r15 = okhttp3.internal.http2.Http2.FLAGS
            r15 = r15[r7]
            java.lang.StringBuilder r13 = r13.append(r15)
            java.lang.String r13 = r13.toString()
            r11[r12] = r13
            java.lang.String[] r11 = okhttp3.internal.http2.Http2.FLAGS
            r12 = r10 | r7
            r12 = r12 | r4
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String[] r15 = okhttp3.internal.http2.Http2.FLAGS
            r15 = r15[r10]
            java.lang.StringBuilder r13 = r13.append(r15)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String[] r14 = okhttp3.internal.http2.Http2.FLAGS
            r14 = r14[r7]
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r5)
            java.lang.String r13 = r13.toString()
            r11[r12] = r13
            int r9 = r9 + 1
            goto Lc6
        L11a:
            int r6 = r6 + 1
            goto Lc0
        L11d:
            r2 = 0
            java.lang.String[] r3 = okhttp3.internal.http2.Http2.FLAGS
            int r3 = r3.length
        L121:
            if (r2 >= r3) goto L134
            java.lang.String[] r4 = okhttp3.internal.http2.Http2.FLAGS
            r4 = r4[r2]
            if (r4 != 0) goto L131
            java.lang.String[] r4 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String[] r5 = okhttp3.internal.http2.Http2.BINARY
            r5 = r5[r2]
            r4[r2] = r5
        L131:
            int r2 = r2 + 1
            goto L121
        L134:
            return
    }

    private Http2() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String formatFlags(int r9, int r10) {
            r8 = this;
            if (r10 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            switch(r9) {
                case 2: goto L20;
                case 3: goto L20;
                case 4: goto L15;
                case 5: goto L8;
                case 6: goto L15;
                case 7: goto L20;
                case 8: goto L20;
                default: goto L8;
            }
        L8:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            int r0 = r0.length
            if (r10 >= r0) goto L25
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            r0 = r0[r10]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            goto L29
        L15:
            r0 = 1
            if (r10 != r0) goto L1b
            java.lang.String r0 = "ACK"
            goto L1f
        L1b:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.BINARY
            r0 = r0[r10]
        L1f:
            return r0
        L20:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.BINARY
            r0 = r0[r10]
            return r0
        L25:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.BINARY
            r0 = r0[r10]
        L29:
            r1 = r0
            r0 = 5
            if (r9 != r0) goto L3e
            r0 = r10 & 4
            if (r0 == 0) goto L3e
            r5 = 4
            r6 = 0
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PUSH_PROMISE"
            r4 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
            goto L52
        L3e:
            if (r9 != 0) goto L51
            r0 = r10 & 32
            if (r0 == 0) goto L51
            r6 = 4
            r7 = 0
            java.lang.String r3 = "PRIORITY"
            java.lang.String r4 = "COMPRESSED"
            r5 = 0
            r2 = r1
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r2, r3, r4, r5, r6, r7)
            goto L52
        L51:
            r0 = r1
        L52:
            return r0
    }

    public final java.lang.String formattedType$okhttp(int r3) {
            r2 = this;
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FRAME_NAMES
            int r0 = r0.length
            if (r3 >= r0) goto La
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FRAME_NAMES
            r0 = r0[r3]
            goto L18
        La:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = okhttp3.internal.Util.format(r1, r0)
        L18:
            return r0
    }

    public final java.lang.String frameLog(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            java.lang.String r0 = r5.formattedType$okhttp(r9)
            java.lang.String r1 = r5.formatFlags(r9, r10)
            if (r6 == 0) goto Ld
            java.lang.String r2 = "<<"
            goto Lf
        Ld:
            java.lang.String r2 = ">>"
        Lf:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3, r4, r0, r1}
            java.lang.String r4 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r3 = okhttp3.internal.Util.format(r4, r3)
            return r3
    }
}
