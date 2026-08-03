package Yue;

import Yue.C3630;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥ */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "-Base64")
public final class C0000 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final byte[] f0;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final byte[] f1;

    static {
        C3630.C0198 c0198 = C3630.f6370;
        f0 = c0198.m9876("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m9824();
        f1 = c0198.m9876("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m9824();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final byte[] m0(@InterfaceC6399 String str) {
        int i;
        char cCharAt;
        C5499.m17103(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt2 = str.charAt(i6);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                bArr[i5] = (byte) (i4 >> 16);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (i4 >> 8);
                i5 += 3;
                bArr[i7] = (byte) i4;
            }
        }
        int i8 = i3 % 4;
        if (i8 == 1) {
            return null;
        }
        if (i8 == 2) {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        } else if (i8 == 3) {
            int i9 = i4 << 6;
            int i10 = i5 + 1;
            bArr[i5] = (byte) (i9 >> 16);
            i5 += 2;
            bArr[i10] = (byte) (i9 >> 8);
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
        C5499.m17102(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m1(@InterfaceC6399 byte[] bArr, @InterfaceC6399 byte[] bArr2) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & C8149.f3255];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return C8582.m28586(bArr3);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ String m5444(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f0;
        }
        return m1(bArr, bArr2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final byte[] m5445() {
        return f0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m5446() {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final byte[] m5447() {
        return f1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m5448() {
    }
}
