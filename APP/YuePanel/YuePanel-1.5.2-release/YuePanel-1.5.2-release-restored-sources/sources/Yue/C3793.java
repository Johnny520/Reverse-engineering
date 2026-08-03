package Yue;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3793 {

    /* JADX INFO: renamed from: ۥ */
    public static final CodingErrorAction f502 = CodingErrorAction.REPORT;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int[] f503 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ۥ */
    public static byte[] m838(String str) {
        return str.getBytes(StandardCharsets.US_ASCII);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m839(ByteBuffer byteBuffer) {
        return m10488(byteBuffer, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m10488(ByteBuffer byteBuffer, int i) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < i) {
            return false;
        }
        int i2 = 0;
        while (i < iRemaining) {
            int[] iArr = f503;
            i2 = iArr[(i2 << 4) + 256 + iArr[byteBuffer.get(i) & 255]];
            if (i2 == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String m10489(byte[] bArr) {
        return m10490(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m10490(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, StandardCharsets.US_ASCII);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String m10491(ByteBuffer byteBuffer) throws C5509 {
        CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = f502;
        charsetDecoderNewDecoder.onMalformedInput(codingErrorAction);
        charsetDecoderNewDecoder.onUnmappableCharacter(codingErrorAction);
        try {
            byteBuffer.mark();
            String string = charsetDecoderNewDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return string;
        } catch (CharacterCodingException e) {
            throw new C5509(1007, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static String m10492(byte[] bArr) throws C5509 {
        return m10491(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static byte[] m10493(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }
}
