package kotlinx.io;

import androidx.activity.AbstractC0053;
import androidx.window.area.C2558;
import com.android.dx.io.Opcodes;
import io.ktor.util.C4210;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Ref$IntRef;
import net.bytebuddy.asm.Advice;
import p000.AbstractC6087;
import p052.InterfaceC6542;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5477 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f15144 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[PHI: r18
  0x0073: PHI (r18v3 long) = (r18v2 long), (r18v2 long), (r18v2 long), (r18v5 long), (r18v5 long), (r18v5 long) binds: [B:45:0x00c6, B:79:0x0073, B:80:0x0073, B:24:0x0071, B:73:0x0073, B:74:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m10613(kotlinx.io.InterfaceC5480 r20, byte r21) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.io.AbstractC5477.m10613(kotlinx.io.飘花落叶言子楪苏兰世哲, byte):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m10614(C5478 c5478, byte b, int i, int i2) {
        if (i < 0 || i >= c5478.m10633()) {
            C5919.m11253(String.valueOf(i));
            return 0;
        }
        if (i > i2 || i2 > c5478.m10633()) {
            C5919.m11253(String.valueOf(i2));
            return 0;
        }
        int i3 = c5478.f15149;
        byte[] bArr = c5478.f15150;
        while (i < i2) {
            if (bArr[i3 + i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m10615(C5476 c5476, long j) throws EOFException {
        if (j == 0) {
            return "";
        }
        C5478 c5478 = c5476.f15143;
        if (c5478 == null) {
            C5919.m11250("Unreacheable");
            return null;
        }
        if (c5478.m10633() < j) {
            byte[] bArrM10628 = m10628(c5476, (int) j);
            return AbstractC6087.m11418(0, bArrM10628, bArrM10628.length);
        }
        byte[] bArr = c5478.f15150;
        int i = c5478.f15149;
        String strM11418 = AbstractC6087.m11418(i, bArr, Math.min(c5478.f15148, ((int) j) + i));
        c5476.skip(j);
        return strM11418;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m10616(long j, long j2, long j3) {
        if (j2 < 0 || j2 > j || j - j2 < j3 || j3 < 0) {
            throw new IllegalArgumentException("offset (" + j2 + ") and byteCount (" + j3 + ") are not within the range [0..size(" + j + "))");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m10617(long j, long j2, long j3) {
        if (j2 < 0 || j3 > j) {
            throw new IndexOutOfBoundsException("startIndex (" + j2 + ") and endIndex (" + j3 + ") are not within the range [0..size(" + j + "))");
        }
        if (j2 <= j3) {
            return;
        }
        throw new IllegalArgumentException("startIndex (" + j2 + ") > endIndex (" + j3 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5481 m10618(final InterfaceC5480 interfaceC5480) {
        InterfaceC6542 c2558;
        if (interfaceC5480 instanceof C5471) {
            c2558 = new MutablePropertyReference0Impl(interfaceC5480) { // from class: kotlinx.io.SourcesJvmKt$asInputStream$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                public Object get() {
                    return Boolean.valueOf(((C5471) this.receiver).f15131);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                public void set(Object obj) {
                    ((C5471) this.receiver).f15131 = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(interfaceC5480 instanceof C5476)) {
                C4210.m8621();
                return null;
            }
            c2558 = new C2558(17);
        }
        return new C5481(c2558, interfaceC5480);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m10619(InterfaceC5480 interfaceC5480, byte[] bArr, int i, int i2) throws EOFException {
        interfaceC5480.getClass();
        bArr.getClass();
        m10617(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            int iMo10603 = interfaceC5480.mo10603(i3, bArr, i2);
            if (iMo10603 == -1) {
                throw new EOFException("Source exhausted before reading " + (i2 - i) + " bytes. Only " + iMo10603 + " bytes were read.");
            }
            i3 += iMo10603;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String m10620(InterfaceC5480 interfaceC5480, long j) {
        interfaceC5480.getClass();
        interfaceC5480.mo10602(j);
        return m10615(interfaceC5480.mo10600(), j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m10621(C5476 c5476, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        while (iRemaining > 0) {
            C5478 c5478M10608 = c5476.m10608(1);
            byte[] bArr = c5478M10608.f15150;
            int i = c5478M10608.f15148;
            int iMin = Math.min(iRemaining, bArr.length - i);
            byteBuffer.get(bArr, i, iMin);
            iRemaining -= iMin;
            if (iMin == 1) {
                c5478M10608.f15148 += iMin;
                c5476.f15142 += (long) iMin;
            } else if (iMin < 0 || iMin > c5478M10608.m10634()) {
                C4210.m8618(AbstractC0053.m148(iMin, "Invalid number of bytes written: ", ". Should be in 0.."), c5478M10608.m10634());
                return;
            } else if (iMin != 0) {
                c5478M10608.f15148 += iMin;
                c5476.f15142 += (long) iMin;
            } else if (m10624(c5478M10608)) {
                c5476.m10605();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final void m10622(InterfaceC5483 interfaceC5483, String str, int i, int i2) {
        long j;
        long j2;
        interfaceC5483.getClass();
        str.getClass();
        m10617(str.length(), i, i2);
        C5476 c5476 = (C5476) interfaceC5483;
        while (i < i2) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            char cCharAt = str.charAt(i);
            ref$IntRef.element = cCharAt;
            if (cCharAt < 128) {
                C5478 c5478M10608 = c5476.m10608(1);
                byte[] bArr = c5478M10608.f15150;
                int i3 = -i;
                int iMin = Math.min(i2, c5478M10608.m10634() + i);
                bArr[c5478M10608.f15148 + i + i3] = (byte) ref$IntRef.element;
                i++;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    ref$IntRef.element = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[c5478M10608.f15148 + i + i3] = (byte) cCharAt2;
                    i++;
                }
                int i4 = i3 + i;
                if (i4 == 1) {
                    c5478M10608.f15148 += i4;
                    c5476.f15142 += (long) i4;
                } else if (i4 < 0 || i4 > c5478M10608.m10634()) {
                    C4210.m8618(AbstractC0053.m148(i4, "Invalid number of bytes written: ", ". Should be in 0.."), c5478M10608.m10634());
                    return;
                } else if (i4 != 0) {
                    c5478M10608.f15148 += i4;
                    c5476.f15142 += (long) i4;
                } else if (m10624(c5478M10608)) {
                    c5476.m10605();
                }
            } else {
                if (cCharAt < 2048) {
                    C5478 c5478M106082 = c5476.m10608(2);
                    int i5 = ref$IntRef.element;
                    byte[] bArr2 = c5478M106082.f15150;
                    int i6 = c5478M106082.f15148;
                    bArr2[i6] = (byte) ((i5 >> 6) | 192);
                    bArr2[i6 + 1] = (byte) ((i5 & 63) | 128);
                    c5478M106082.f15148 = i6 + 2;
                    j = c5476.f15142;
                    j2 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    C5478 c5478M106083 = c5476.m10608(3);
                    int i7 = ref$IntRef.element;
                    byte b = (byte) ((i7 >> 12) | Opcodes.SHL_INT_LIT8);
                    byte[] bArr3 = c5478M106083.f15150;
                    int i8 = c5478M106083.f15148;
                    bArr3[i8] = b;
                    bArr3[i8 + 1] = (byte) (((i7 >> 6) & 63) | 128);
                    bArr3[i8 + 2] = (byte) ((i7 & 63) | 128);
                    c5478M106083.f15148 = i8 + 3;
                    j = c5476.f15142;
                    j2 = 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    int i10 = ref$IntRef.element;
                    if (i10 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        c5476.m10610((byte) 63);
                        i = i9;
                    } else {
                        int i11 = (((i10 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C5478 c5478M106084 = c5476.m10608(4);
                        byte[] bArr4 = c5478M106084.f15150;
                        int i12 = c5478M106084.f15148;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        c5478M106084.f15148 = i12 + 4;
                        c5476.f15142 += 4;
                        i += 2;
                    }
                }
                c5476.f15142 = j + j2;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int m10623(InterfaceC5480 interfaceC5480, ByteBuffer byteBuffer) throws EOFException {
        interfaceC5480.getClass();
        byteBuffer.getClass();
        if (interfaceC5480.mo10600().f15142 == 0) {
            interfaceC5480.mo10599(8192L);
            if (interfaceC5480.mo10600().f15142 == 0) {
                return -1;
            }
        }
        C5476 c5476Mo10600 = interfaceC5480.mo10600();
        c5476Mo10600.getClass();
        if (c5476Mo10600.mo10601()) {
            return -1;
        }
        if (c5476Mo10600.mo10601()) {
            C5919.m11249("Buffer is empty");
            return 0;
        }
        C5478 c5478 = c5476Mo10600.f15143;
        c5478.getClass();
        byte[] bArr = c5478.f15150;
        int i = c5478.f15149;
        int iMin = Math.min(byteBuffer.remaining(), c5478.f15148 - i);
        byteBuffer.put(bArr, i, iMin);
        if (iMin == 0) {
            return iMin;
        }
        if (iMin < 0) {
            C5919.m11250("Returned negative read bytes count");
            return 0;
        }
        if (iMin <= c5478.m10633()) {
            c5476Mo10600.skip(iMin);
            return iMin;
        }
        C5919.m11250("Returned too many bytes");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m10624(C5478 c5478) {
        c5478.getClass();
        return c5478.m10633() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final byte[] m10625(InterfaceC5480 interfaceC5480, int i) {
        if (i == -1) {
            for (long j = 2147483647L; interfaceC5480.mo10600().f15142 < 2147483647L && interfaceC5480.mo10599(j); j *= 2) {
            }
            if (interfaceC5480.mo10600().f15142 >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + interfaceC5480.mo10600().f15142).toString());
            }
            i = (int) interfaceC5480.mo10600().f15142;
        } else {
            interfaceC5480.mo10602(i);
        }
        byte[] bArr = new byte[i];
        m10619(interfaceC5480.mo10600(), bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final String m10626(InterfaceC5480 interfaceC5480) {
        interfaceC5480.getClass();
        interfaceC5480.mo10599(Long.MAX_VALUE);
        return m10615(interfaceC5480.mo10600(), interfaceC5480.mo10600().f15142);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final byte[] m10627(InterfaceC5480 interfaceC5480) {
        interfaceC5480.getClass();
        return m10625(interfaceC5480, -1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final byte[] m10628(InterfaceC5480 interfaceC5480, int i) {
        interfaceC5480.getClass();
        long j = i;
        if (j >= 0) {
            return m10625(interfaceC5480, i);
        }
        C4210.m8619("byteCount (", j, ") < 0");
        return null;
    }
}
