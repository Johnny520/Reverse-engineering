package okhttp3.internal.p221ws;

import okio.Buffer;
import okio.ByteString;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
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
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private WebSocketProtocol() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String acceptHeader(String str) {
        str.getClass();
        return ByteString.Companion.encodeUtf8(str.concat(ACCEPT_MAGIC)).sha1().base64();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String closeCodeExceptionMessage(int i9) {
        if (i9 < 1000 || i9 >= 5000) {
            return AbstractC0921a.m2249l(i9, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i9 || i9 >= 1007) && (1015 > i9 || i9 >= 3000)) {
            return null;
        }
        return AbstractC0921a.m2250m(i9, "Code ", " is reserved and may not be used.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void toggleMask(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        unsafeCursor.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i9 = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i10 = unsafeCursor.start;
            int i11 = unsafeCursor.end;
            if (bArr2 != null) {
                while (i10 < i11) {
                    int i12 = i9 % length;
                    bArr2[i10] = (byte) (bArr2[i10] ^ bArr[i12]);
                    i10++;
                    i9 = i12 + 1;
                }
            }
        } while (unsafeCursor.next() != -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void validateCloseCode(int i9) {
        String strCloseCodeExceptionMessage = closeCodeExceptionMessage(i9);
        if (strCloseCodeExceptionMessage == null) {
            return;
        }
        strCloseCodeExceptionMessage.getClass();
        C2104o.m5291q(strCloseCodeExceptionMessage);
    }
}
