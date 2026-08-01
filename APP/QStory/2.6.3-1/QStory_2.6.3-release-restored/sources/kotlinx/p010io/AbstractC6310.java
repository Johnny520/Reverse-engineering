package kotlinx.p010io;

import androidx.activity.AbstractC0900;
import androidx.window.area.C3391;
import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Ref$IntRef;
import net.bytebuddy.asm.Advice;
import p068.InterfaceC7372;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f15489 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[PHI: r18
  0x0073: PHI (r18v3 long) = (r18v2 long), (r18v2 long), (r18v2 long), (r18v5 long), (r18v5 long), (r18v5 long) binds: [B:45:0x00c6, B:79:0x0073, B:80:0x0073, B:24:0x0071, B:73:0x0073, B:74:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m11176(InterfaceC6313 interfaceC6313, byte b) {
        C6311 c6311;
        long j;
        long j2;
        interfaceC6313.getClass();
        long j3 = 0;
        while (j3 < Long.MAX_VALUE && interfaceC6313.mo11161(1 + j3)) {
            C6309 c6309Mo11162 = interfaceC6313.mo11162();
            long jMin = Math.min(Long.MAX_VALUE, interfaceC6313.mo11162().f15487);
            c6309Mo11162.getClass();
            long jMin2 = Math.min(jMin, c6309Mo11162.f15487);
            m11180(c6309Mo11162.f15487, j3, jMin2);
            if (j3 == jMin2 || (c6311 = c6309Mo11162.f15488) == null) {
                j2 = -1;
                j = -1;
            } else {
                long jM11196 = c6309Mo11162.f15487;
                int i = 0;
                if (jM11196 - j3 < j3) {
                    C6311 c63112 = c6309Mo11162.f15486;
                    while (c63112 != null && jM11196 > j3) {
                        j = -1;
                        jM11196 -= (long) (c63112.f15493 - c63112.f15494);
                        if (jM11196 <= j3) {
                            break;
                        }
                        c63112 = c63112.f15496;
                    }
                    j = -1;
                    if (jM11196 != j) {
                        while (jMin2 > jM11196) {
                            c63112.getClass();
                            int iM11177 = m11177(c63112, b, Math.max((int) (j3 - jM11196), i), Math.min(c63112.m11196(), (int) (jMin2 - jM11196)));
                            if (iM11177 != -1) {
                                j2 = jM11196 + ((long) iM11177);
                            } else {
                                jM11196 += (long) c63112.m11196();
                                c63112 = c63112.f15490;
                                if (c63112 == null || jM11196 >= jMin2) {
                                    j2 = j;
                                } else {
                                    i = 0;
                                }
                            }
                        }
                        C6755.m11870("Check failed.");
                        return 0L;
                    }
                    j2 = j;
                } else {
                    j = -1;
                    long jM111962 = 0;
                    while (c6311 != null) {
                        long j4 = ((long) (c6311.f15493 - c6311.f15494)) + jM111962;
                        if (j4 > j3) {
                            break;
                        }
                        c6311 = c6311.f15490;
                        jM111962 = j4;
                    }
                    if (jM111962 != -1) {
                        while (jMin2 > jM111962) {
                            c6311.getClass();
                            int iM111772 = m11177(c6311, b, Math.max((int) (j3 - jM111962), 0), Math.min(c6311.m11196(), (int) (jMin2 - jM111962)));
                            if (iM111772 != -1) {
                                j2 = jM111962 + ((long) iM111772);
                            } else {
                                jM111962 += (long) c6311.m11196();
                                c6311 = c6311.f15490;
                                if (c6311 == null || jM111962 >= jMin2) {
                                    j2 = j;
                                }
                            }
                        }
                        C6755.m11870("Check failed.");
                        return 0L;
                    }
                }
            }
            if (j2 != j) {
                return j2;
            }
            j3 = interfaceC6313.mo11162().f15487;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m11177(C6311 c6311, byte b, int i, int i2) {
        if (i < 0 || i >= c6311.m11196()) {
            C6755.m11873(String.valueOf(i));
            return 0;
        }
        if (i > i2 || i2 > c6311.m11196()) {
            C6755.m11873(String.valueOf(i2));
            return 0;
        }
        int i3 = c6311.f15494;
        byte[] bArr = c6311.f15495;
        while (i < i2) {
            if (bArr[i3 + i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m11178(C6309 c6309, long j) throws EOFException {
        if (j == 0) {
            return "";
        }
        C6311 c6311 = c6309.f15488;
        if (c6311 == null) {
            C6755.m11870("Unreacheable");
            return null;
        }
        if (c6311.m11196() < j) {
            byte[] bArrM11191 = m11191(c6309, (int) j);
            return C9496.m14929(0, bArrM11191, bArrM11191.length);
        }
        byte[] bArr = c6311.f15495;
        int i = c6311.f15494;
        String strM14929 = C9496.m14929(i, bArr, Math.min(c6311.f15493, ((int) j) + i));
        c6309.skip(j);
        return strM14929;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m11179(long j, long j2, long j3) {
        if (j2 < 0 || j2 > j || j - j2 < j3 || j3 < 0) {
            throw new IllegalArgumentException("offset (" + j2 + ") and byteCount (" + j3 + ") are not within the range [0..size(" + j + "))");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11180(long j, long j2, long j3) {
        if (j2 < 0 || j3 > j) {
            throw new IndexOutOfBoundsException("startIndex (" + j2 + ") and endIndex (" + j3 + ") are not within the range [0..size(" + j + "))");
        }
        if (j2 <= j3) {
            return;
        }
        throw new IllegalArgumentException("startIndex (" + j2 + ") > endIndex (" + j3 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6314 m11181(final InterfaceC6313 interfaceC6313) {
        InterfaceC7372 c3391;
        if (interfaceC6313 instanceof C6304) {
            c3391 = new MutablePropertyReference0Impl(interfaceC6313) { // from class: kotlinx.io.SourcesJvmKt$asInputStream$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                public Object get() {
                    return Boolean.valueOf(((C6304) this.receiver).f15476);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                public void set(Object obj) {
                    ((C6304) this.receiver).f15476 = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(interfaceC6313 instanceof C6309)) {
                C5043.m9170();
                return null;
            }
            c3391 = new C3391(17);
        }
        return new C6314(c3391, interfaceC6313);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m11182(InterfaceC6313 interfaceC6313, byte[] bArr, int i, int i2) throws EOFException {
        interfaceC6313.getClass();
        bArr.getClass();
        m11180(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            int iMo11166 = interfaceC6313.mo11166(i3, bArr, i2);
            if (iMo11166 == -1) {
                throw new EOFException("Source exhausted before reading " + (i2 - i) + " bytes. Only " + iMo11166 + " bytes were read.");
            }
            i3 += iMo11166;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String m11183(InterfaceC6313 interfaceC6313, long j) {
        interfaceC6313.getClass();
        interfaceC6313.mo11165(j);
        return m11178(interfaceC6313.mo11162(), j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m11184(C6309 c6309, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        while (iRemaining > 0) {
            C6311 c6311M11171 = c6309.m11171(1);
            byte[] bArr = c6311M11171.f15495;
            int i = c6311M11171.f15493;
            int iMin = Math.min(iRemaining, bArr.length - i);
            byteBuffer.get(bArr, i, iMin);
            iRemaining -= iMin;
            if (iMin == 1) {
                c6311M11171.f15493 += iMin;
                c6309.f15487 += (long) iMin;
            } else if (iMin < 0 || iMin > c6311M11171.m11197()) {
                C5043.m9167(AbstractC0900.m710(iMin, "Invalid number of bytes written: ", ". Should be in 0.."), c6311M11171.m11197());
                return;
            } else if (iMin != 0) {
                c6311M11171.f15493 += iMin;
                c6309.f15487 += (long) iMin;
            } else if (m11187(c6311M11171)) {
                c6309.m11168();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final void m11185(InterfaceC6316 interfaceC6316, String str, int i, int i2) {
        long j;
        long j2;
        interfaceC6316.getClass();
        str.getClass();
        m11180(str.length(), i, i2);
        C6309 c6309 = (C6309) interfaceC6316;
        while (i < i2) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            char cCharAt = str.charAt(i);
            ref$IntRef.element = cCharAt;
            if (cCharAt < 128) {
                C6311 c6311M11171 = c6309.m11171(1);
                byte[] bArr = c6311M11171.f15495;
                int i3 = -i;
                int iMin = Math.min(i2, c6311M11171.m11197() + i);
                bArr[c6311M11171.f15493 + i + i3] = (byte) ref$IntRef.element;
                i++;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    ref$IntRef.element = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[c6311M11171.f15493 + i + i3] = (byte) cCharAt2;
                    i++;
                }
                int i4 = i3 + i;
                if (i4 == 1) {
                    c6311M11171.f15493 += i4;
                    c6309.f15487 += (long) i4;
                } else if (i4 < 0 || i4 > c6311M11171.m11197()) {
                    C5043.m9167(AbstractC0900.m710(i4, "Invalid number of bytes written: ", ". Should be in 0.."), c6311M11171.m11197());
                    return;
                } else if (i4 != 0) {
                    c6311M11171.f15493 += i4;
                    c6309.f15487 += (long) i4;
                } else if (m11187(c6311M11171)) {
                    c6309.m11168();
                }
            } else {
                if (cCharAt < 2048) {
                    C6311 c6311M111712 = c6309.m11171(2);
                    int i5 = ref$IntRef.element;
                    byte[] bArr2 = c6311M111712.f15495;
                    int i6 = c6311M111712.f15493;
                    bArr2[i6] = (byte) ((i5 >> 6) | 192);
                    bArr2[i6 + 1] = (byte) ((i5 & 63) | 128);
                    c6311M111712.f15493 = i6 + 2;
                    j = c6309.f15487;
                    j2 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    C6311 c6311M111713 = c6309.m11171(3);
                    int i7 = ref$IntRef.element;
                    byte b = (byte) ((i7 >> 12) | Opcodes.SHL_INT_LIT8);
                    byte[] bArr3 = c6311M111713.f15495;
                    int i8 = c6311M111713.f15493;
                    bArr3[i8] = b;
                    bArr3[i8 + 1] = (byte) (((i7 >> 6) & 63) | 128);
                    bArr3[i8 + 2] = (byte) ((i7 & 63) | 128);
                    c6311M111713.f15493 = i8 + 3;
                    j = c6309.f15487;
                    j2 = 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    int i10 = ref$IntRef.element;
                    if (i10 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        c6309.m11173((byte) 63);
                        i = i9;
                    } else {
                        int i11 = (((i10 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C6311 c6311M111714 = c6309.m11171(4);
                        byte[] bArr4 = c6311M111714.f15495;
                        int i12 = c6311M111714.f15493;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        c6311M111714.f15493 = i12 + 4;
                        c6309.f15487 += 4;
                        i += 2;
                    }
                }
                c6309.f15487 = j + j2;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m11186(InterfaceC6313 interfaceC6313, ByteBuffer byteBuffer) throws EOFException {
        interfaceC6313.getClass();
        byteBuffer.getClass();
        if (interfaceC6313.mo11162().f15487 == 0) {
            interfaceC6313.mo11161(8192L);
            if (interfaceC6313.mo11162().f15487 == 0) {
                return -1;
            }
        }
        C6309 c6309Mo11162 = interfaceC6313.mo11162();
        c6309Mo11162.getClass();
        if (c6309Mo11162.mo11163()) {
            return -1;
        }
        if (c6309Mo11162.mo11163()) {
            C6755.m11869("Buffer is empty");
            return 0;
        }
        C6311 c6311 = c6309Mo11162.f15488;
        c6311.getClass();
        byte[] bArr = c6311.f15495;
        int i = c6311.f15494;
        int iMin = Math.min(byteBuffer.remaining(), c6311.f15493 - i);
        byteBuffer.put(bArr, i, iMin);
        if (iMin == 0) {
            return iMin;
        }
        if (iMin < 0) {
            C6755.m11870("Returned negative read bytes count");
            return 0;
        }
        if (iMin <= c6311.m11196()) {
            c6309Mo11162.skip(iMin);
            return iMin;
        }
        C6755.m11870("Returned too many bytes");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m11187(C6311 c6311) {
        c6311.getClass();
        return c6311.m11196() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final byte[] m11188(InterfaceC6313 interfaceC6313, int i) {
        if (i == -1) {
            for (long j = 2147483647L; interfaceC6313.mo11162().f15487 < 2147483647L && interfaceC6313.mo11161(j); j *= 2) {
            }
            if (interfaceC6313.mo11162().f15487 >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + interfaceC6313.mo11162().f15487).toString());
            }
            i = (int) interfaceC6313.mo11162().f15487;
        } else {
            interfaceC6313.mo11165(i);
        }
        byte[] bArr = new byte[i];
        m11182(interfaceC6313.mo11162(), bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final String m11189(InterfaceC6313 interfaceC6313) {
        interfaceC6313.getClass();
        interfaceC6313.mo11161(Long.MAX_VALUE);
        return m11178(interfaceC6313.mo11162(), interfaceC6313.mo11162().f15487);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final byte[] m11190(InterfaceC6313 interfaceC6313) {
        interfaceC6313.getClass();
        return m11188(interfaceC6313, -1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final byte[] m11191(InterfaceC6313 interfaceC6313, int i) {
        interfaceC6313.getClass();
        long j = i;
        if (j >= 0) {
            return m11188(interfaceC6313, i);
        }
        C5043.m9168("byteCount (", j, ") < 0");
        return null;
    }
}
