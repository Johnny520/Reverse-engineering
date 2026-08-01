package kotlinx.io;

import androidx.activity.AbstractC0053;
import androidx.window.area.C2558;
import com.android.dx.io.Opcodes;
import io.ktor.util.C4211;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Ref$IntRef;
import net.bytebuddy.asm.Advice;
import p052.InterfaceC6543;
import p316.C8667;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f15144 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[PHI: r18
  0x0073: PHI (r18v3 long) = (r18v2 long), (r18v2 long), (r18v2 long), (r18v5 long), (r18v5 long), (r18v5 long) binds: [B:45:0x00c6, B:79:0x0073, B:80:0x0073, B:24:0x0071, B:73:0x0073, B:74:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m10617(kotlinx.io.InterfaceC5481 r20, byte r21) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.io.AbstractC5478.m10617(kotlinx.io.飘花落叶言子楪苏兰世哲, byte):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m10618(C5479 c5479, byte b, int i, int i2) {
        if (i < 0 || i >= c5479.m10637()) {
            C5925.m11314(String.valueOf(i));
            return 0;
        }
        if (i > i2 || i2 > c5479.m10637()) {
            C5925.m11314(String.valueOf(i2));
            return 0;
        }
        int i3 = c5479.f15149;
        byte[] bArr = c5479.f15150;
        while (i < i2) {
            if (bArr[i3 + i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m10619(C5477 c5477, long j) throws EOFException {
        if (j == 0) {
            return "";
        }
        C5479 c5479 = c5477.f15143;
        if (c5479 == null) {
            C5925.m11311("Unreacheable");
            return null;
        }
        if (c5479.m10637() < j) {
            byte[] bArrM10632 = m10632(c5477, (int) j);
            return C8667.m14370(0, bArrM10632, bArrM10632.length);
        }
        byte[] bArr = c5479.f15150;
        int i = c5479.f15149;
        String strM14370 = C8667.m14370(i, bArr, Math.min(c5479.f15148, ((int) j) + i));
        c5477.skip(j);
        return strM14370;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m10620(long j, long j2, long j3) {
        if (j2 < 0 || j2 > j || j - j2 < j3 || j3 < 0) {
            throw new IllegalArgumentException("offset (" + j2 + ") and byteCount (" + j3 + ") are not within the range [0..size(" + j + "))");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m10621(long j, long j2, long j3) {
        if (j2 < 0 || j3 > j) {
            throw new IndexOutOfBoundsException("startIndex (" + j2 + ") and endIndex (" + j3 + ") are not within the range [0..size(" + j + "))");
        }
        if (j2 <= j3) {
            return;
        }
        throw new IllegalArgumentException("startIndex (" + j2 + ") > endIndex (" + j3 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5482 m10622(final InterfaceC5481 interfaceC5481) {
        InterfaceC6543 c2558;
        if (interfaceC5481 instanceof C5472) {
            c2558 = new MutablePropertyReference0Impl(interfaceC5481) { // from class: kotlinx.io.SourcesJvmKt$asInputStream$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                public Object get() {
                    return Boolean.valueOf(((C5472) this.receiver).f15131);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                public void set(Object obj) {
                    ((C5472) this.receiver).f15131 = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(interfaceC5481 instanceof C5477)) {
                C4211.m8611();
                return null;
            }
            c2558 = new C2558(17);
        }
        return new C5482(c2558, interfaceC5481);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m10623(InterfaceC5481 interfaceC5481, byte[] bArr, int i, int i2) throws EOFException {
        interfaceC5481.getClass();
        bArr.getClass();
        m10621(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            int iMo10607 = interfaceC5481.mo10607(i3, bArr, i2);
            if (iMo10607 == -1) {
                throw new EOFException("Source exhausted before reading " + (i2 - i) + " bytes. Only " + iMo10607 + " bytes were read.");
            }
            i3 += iMo10607;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String m10624(InterfaceC5481 interfaceC5481, long j) {
        interfaceC5481.getClass();
        interfaceC5481.mo10606(j);
        return m10619(interfaceC5481.mo10603(), j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m10625(C5477 c5477, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        while (iRemaining > 0) {
            C5479 c5479M10612 = c5477.m10612(1);
            byte[] bArr = c5479M10612.f15150;
            int i = c5479M10612.f15148;
            int iMin = Math.min(iRemaining, bArr.length - i);
            byteBuffer.get(bArr, i, iMin);
            iRemaining -= iMin;
            if (iMin == 1) {
                c5479M10612.f15148 += iMin;
                c5477.f15142 += (long) iMin;
            } else if (iMin < 0 || iMin > c5479M10612.m10638()) {
                C4211.m8608(AbstractC0053.m150(iMin, "Invalid number of bytes written: ", ". Should be in 0.."), c5479M10612.m10638());
                return;
            } else if (iMin != 0) {
                c5479M10612.f15148 += iMin;
                c5477.f15142 += (long) iMin;
            } else if (m10628(c5479M10612)) {
                c5477.m10609();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final void m10626(InterfaceC5484 interfaceC5484, String str, int i, int i2) {
        long j;
        long j2;
        interfaceC5484.getClass();
        str.getClass();
        m10621(str.length(), i, i2);
        C5477 c5477 = (C5477) interfaceC5484;
        while (i < i2) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            char cCharAt = str.charAt(i);
            ref$IntRef.element = cCharAt;
            if (cCharAt < 128) {
                C5479 c5479M10612 = c5477.m10612(1);
                byte[] bArr = c5479M10612.f15150;
                int i3 = -i;
                int iMin = Math.min(i2, c5479M10612.m10638() + i);
                bArr[c5479M10612.f15148 + i + i3] = (byte) ref$IntRef.element;
                i++;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    ref$IntRef.element = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[c5479M10612.f15148 + i + i3] = (byte) cCharAt2;
                    i++;
                }
                int i4 = i3 + i;
                if (i4 == 1) {
                    c5479M10612.f15148 += i4;
                    c5477.f15142 += (long) i4;
                } else if (i4 < 0 || i4 > c5479M10612.m10638()) {
                    C4211.m8608(AbstractC0053.m150(i4, "Invalid number of bytes written: ", ". Should be in 0.."), c5479M10612.m10638());
                    return;
                } else if (i4 != 0) {
                    c5479M10612.f15148 += i4;
                    c5477.f15142 += (long) i4;
                } else if (m10628(c5479M10612)) {
                    c5477.m10609();
                }
            } else {
                if (cCharAt < 2048) {
                    C5479 c5479M106122 = c5477.m10612(2);
                    int i5 = ref$IntRef.element;
                    byte[] bArr2 = c5479M106122.f15150;
                    int i6 = c5479M106122.f15148;
                    bArr2[i6] = (byte) ((i5 >> 6) | 192);
                    bArr2[i6 + 1] = (byte) ((i5 & 63) | 128);
                    c5479M106122.f15148 = i6 + 2;
                    j = c5477.f15142;
                    j2 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    C5479 c5479M106123 = c5477.m10612(3);
                    int i7 = ref$IntRef.element;
                    byte b = (byte) ((i7 >> 12) | Opcodes.SHL_INT_LIT8);
                    byte[] bArr3 = c5479M106123.f15150;
                    int i8 = c5479M106123.f15148;
                    bArr3[i8] = b;
                    bArr3[i8 + 1] = (byte) (((i7 >> 6) & 63) | 128);
                    bArr3[i8 + 2] = (byte) ((i7 & 63) | 128);
                    c5479M106123.f15148 = i8 + 3;
                    j = c5477.f15142;
                    j2 = 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    int i10 = ref$IntRef.element;
                    if (i10 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        c5477.m10614((byte) 63);
                        i = i9;
                    } else {
                        int i11 = (((i10 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C5479 c5479M106124 = c5477.m10612(4);
                        byte[] bArr4 = c5479M106124.f15150;
                        int i12 = c5479M106124.f15148;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        c5479M106124.f15148 = i12 + 4;
                        c5477.f15142 += 4;
                        i += 2;
                    }
                }
                c5477.f15142 = j + j2;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m10627(InterfaceC5481 interfaceC5481, ByteBuffer byteBuffer) throws EOFException {
        interfaceC5481.getClass();
        byteBuffer.getClass();
        if (interfaceC5481.mo10603().f15142 == 0) {
            interfaceC5481.mo10602(8192L);
            if (interfaceC5481.mo10603().f15142 == 0) {
                return -1;
            }
        }
        C5477 c5477Mo10603 = interfaceC5481.mo10603();
        c5477Mo10603.getClass();
        if (c5477Mo10603.mo10604()) {
            return -1;
        }
        if (c5477Mo10603.mo10604()) {
            C5925.m11310("Buffer is empty");
            return 0;
        }
        C5479 c5479 = c5477Mo10603.f15143;
        c5479.getClass();
        byte[] bArr = c5479.f15150;
        int i = c5479.f15149;
        int iMin = Math.min(byteBuffer.remaining(), c5479.f15148 - i);
        byteBuffer.put(bArr, i, iMin);
        if (iMin == 0) {
            return iMin;
        }
        if (iMin < 0) {
            C5925.m11311("Returned negative read bytes count");
            return 0;
        }
        if (iMin <= c5479.m10637()) {
            c5477Mo10603.skip(iMin);
            return iMin;
        }
        C5925.m11311("Returned too many bytes");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m10628(C5479 c5479) {
        c5479.getClass();
        return c5479.m10637() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final byte[] m10629(InterfaceC5481 interfaceC5481, int i) {
        if (i == -1) {
            for (long j = 2147483647L; interfaceC5481.mo10603().f15142 < 2147483647L && interfaceC5481.mo10602(j); j *= 2) {
            }
            if (interfaceC5481.mo10603().f15142 >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + interfaceC5481.mo10603().f15142).toString());
            }
            i = (int) interfaceC5481.mo10603().f15142;
        } else {
            interfaceC5481.mo10606(i);
        }
        byte[] bArr = new byte[i];
        m10623(interfaceC5481.mo10603(), bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final String m10630(InterfaceC5481 interfaceC5481) {
        interfaceC5481.getClass();
        interfaceC5481.mo10602(Long.MAX_VALUE);
        return m10619(interfaceC5481.mo10603(), interfaceC5481.mo10603().f15142);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final byte[] m10631(InterfaceC5481 interfaceC5481) {
        interfaceC5481.getClass();
        return m10629(interfaceC5481, -1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final byte[] m10632(InterfaceC5481 interfaceC5481, int i) {
        interfaceC5481.getClass();
        long j = i;
        if (j >= 0) {
            return m10629(interfaceC5481, i);
        }
        C4211.m8609("byteCount (", j, ") < 0");
        return null;
    }
}
