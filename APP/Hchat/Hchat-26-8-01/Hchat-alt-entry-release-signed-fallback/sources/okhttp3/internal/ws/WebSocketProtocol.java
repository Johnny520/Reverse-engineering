package okhttp3.internal.ws;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketProtocol {
    public static final java.lang.String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final okhttp3.internal.ws.WebSocketProtocol INSTANCE = null;
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    static {
            okhttp3.internal.ws.WebSocketProtocol r0 = new okhttp3.internal.ws.WebSocketProtocol
            r0.<init>()
            okhttp3.internal.ws.WebSocketProtocol.INSTANCE = r0
            return
    }

    private WebSocketProtocol() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String acceptHeader(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            java.lang.String r3 = r3.concat(r1)
            okio.ByteString r3 = r0.encodeUtf8(r3)
            okio.ByteString r3 = r3.sha1()
            java.lang.String r3 = r3.base64()
            return r3
    }

    public final java.lang.String closeCodeExceptionMessage(int r3) {
            r2 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r0) goto L25
            r0 = 5000(0x1388, float:7.006E-42)
            if (r3 < r0) goto L9
            goto L25
        L9:
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r0 > r3) goto L12
            r0 = 1007(0x3ef, float:1.411E-42)
            if (r3 >= r0) goto L12
            goto L1a
        L12:
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r3) goto L23
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r3 >= r0) goto L23
        L1a:
            java.lang.String r0 = "Code "
            java.lang.String r1 = " is reserved and may not be used."
            java.lang.String r3 = eh.a.m(r3, r0, r1)
            return r3
        L23:
            r3 = 0
            return r3
        L25:
            java.lang.String r0 = "Code must be in range [1000,5000): "
            java.lang.String r3 = eh.a.l(r3, r0)
            return r3
    }

    public final void toggleMask(okio.Buffer.UnsafeCursor r8, byte[] r9) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            int r0 = r9.length
            r1 = 0
        L8:
            byte[] r2 = r8.data
            int r3 = r8.start
            int r4 = r8.end
            if (r2 == 0) goto L20
        L10:
            if (r3 >= r4) goto L20
            int r1 = r1 % r0
            r5 = r2[r3]
            r6 = r9[r1]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L10
        L20:
            int r2 = r8.next()
            r3 = -1
            if (r2 != r3) goto L8
            return
    }

    public final void validateCloseCode(int r1) {
            r0 = this;
            java.lang.String r1 = r0.closeCodeExceptionMessage(r1)
            if (r1 != 0) goto L7
            return
        L7:
            r1.getClass()
            j8.o.q(r1)
            return
    }
}
