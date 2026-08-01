package p299ub;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import okhttp3.internal.url._UrlKt;
import p024b9.C1062t0;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5078f;
import p376zd.C10001l;

/* JADX INFO: renamed from: ub.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8611a0 extends AbstractC8644z {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m33056A(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return m33079z(bArr, i10, i11, z10);
    }

    /* JADX INFO: renamed from: B */
    public static final byte[] m33057B(String str, int i10, int i11, boolean z10) throws CharacterCodingException {
        str.getClass();
        AbstractC5078f.f15387q.m20520a(i10, i11, str.length());
        if (!z10) {
            byte[] bytes = str.substring(i10, i11).getBytes(C8614c.f28652b);
            bytes.getClass();
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = C8614c.f28652b.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i10, i11));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            bArrArray.getClass();
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                bArrArray2.getClass();
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ byte[] m33058C(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return m33057B(str, i10, i11, z10);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m33059D(String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        return !z10 ? str.endsWith(str2) : m33063H(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ boolean m33060E(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m33059D(str, str2, z10);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m33061F(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: G */
    public static Comparator m33062G(C1062t0 c1062t0) {
        c1062t0.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        return comparator;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m33063H(String str, int i10, String str2, int i11, int i12, boolean z10) {
        str.getClass();
        str2.getClass();
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ boolean m33064I(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return m33063H(str, i10, str2, i11, i12, z10);
    }

    /* JADX INFO: renamed from: J */
    public static String m33065J(CharSequence charSequence, int i10) {
        charSequence.getClass();
        if (i10 < 0) {
            C10001l.m38755a("Count 'n' must be non-negative, but was ", i10, 46);
            return null;
        }
        if (i10 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (length != 1) {
            StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
            if (1 <= i10) {
                while (true) {
                    sb2.append(charSequence);
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            return sb2.toString();
        }
        char cCharAt = charSequence.charAt(0);
        char[] cArr = new char[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            cArr[i12] = cCharAt;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: K */
    public static final String m33066K(String str, char c10, char c11, boolean z10) {
        str.getClass();
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            strReplace.getClass();
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC8612b.m33080d(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: L */
    public static final String m33067L(String str, String str2, String str3, boolean z10) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int i10 = 0;
        int iM33144j0 = AbstractC8621f0.m33144j0(str, str2, 0, z10);
        if (iM33144j0 < 0) {
            return str;
        }
        int length = str2.length();
        int iM8578e = AbstractC2368o.m8578e(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iM33144j0);
            sb2.append(str3);
            i10 = iM33144j0 + length;
            if (iM33144j0 >= str.length()) {
                break;
            }
            iM33144j0 = AbstractC8621f0.m33144j0(str, str2, iM33144j0 + iM8578e, z10);
        } while (iM33144j0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ String m33068M(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m33066K(str, c10, c11, z10);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ String m33069N(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m33067L(str, str2, str3, z10);
    }

    /* JADX INFO: renamed from: O */
    public static final String m33070O(String str, String str2, String str3, boolean z10) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM33152n0 = AbstractC8621f0.m33152n0(str, str2, 0, z10, 2, null);
        return iM33152n0 < 0 ? str : AbstractC8621f0.m33106M0(str, iM33152n0, str2.length() + iM33152n0, str3).toString();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ String m33071P(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m33070O(str, str2, str3, z10);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m33072Q(String str, String str2, int i10, boolean z10) {
        str.getClass();
        str2.getClass();
        return !z10 ? str.startsWith(str2, i10) : m33063H(str, i10, str2, 0, str2.length(), z10);
    }

    /* JADX INFO: renamed from: R */
    public static boolean m33073R(String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        return !z10 ? str.startsWith(str2) : m33063H(str, 0, str2, 0, str2.length(), z10);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ boolean m33074S(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m33072Q(str, str2, i10, z10);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m33075T(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m33073R(str, str2, z10);
    }

    /* JADX INFO: renamed from: w */
    public static String m33076w(char[] cArr) {
        cArr.getClass();
        return new String(cArr);
    }

    /* JADX INFO: renamed from: x */
    public static String m33077x(char[] cArr, int i10, int i11) {
        cArr.getClass();
        AbstractC5078f.f15387q.m20520a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    /* JADX INFO: renamed from: y */
    public static String m33078y(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, C8614c.f28652b);
    }

    /* JADX INFO: renamed from: z */
    public static final String m33079z(byte[] bArr, int i10, int i11, boolean z10) {
        bArr.getClass();
        AbstractC5078f.f15387q.m20520a(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, C8614c.f28652b);
        }
        CharsetDecoder charsetDecoderNewDecoder = C8614c.f28652b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        string.getClass();
        return string;
    }
}
