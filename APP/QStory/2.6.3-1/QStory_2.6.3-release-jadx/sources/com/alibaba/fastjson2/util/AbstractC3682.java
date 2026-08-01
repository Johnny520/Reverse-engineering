package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.google.protobuf.DescriptorProtos$Edition;
import java.io.Closeable;
import java.lang.invoke.MethodHandle;
import java.time.LocalTime;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p025.AbstractC7012;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3682 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f9223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int f9224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f9225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final short f9226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f9227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final short f9228;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final short f9229;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long[] f9230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final long[] f9231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final int[] f9232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final short[] f9233;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final int[] f9234;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final byte[] f9235;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final char[] f9236;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long f9237;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f9238;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final long f9239;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int[] f9240;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int f9241;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final long f9242;

    static {
        boolean z = AbstractC3687.f9276;
        f9228 = z ? (short) 11824 : (short) 12334;
        f9227 = z ? 3014704 : 3145774;
        f9226 = z ? (short) 12334 : (short) 11824;
        f9225 = z ? 3145774 : 3014704;
        f9224 = z ? 1853189228 : 1819047278;
        f9223 = z ? 30962749956423788L : 30399761348886638L;
        f9238 = z ? 1953658213 : 1702195828;
        f9237 = z ? 32651586932375653L : 28429475166421108L;
        f9241 = z ? 1634497381 : 1702063201;
        f9242 = z ? 27303536604938341L : 28429466576093281L;
        f9239 = z ? 11776L : 46L;
        f9240 = new int[]{9, 99, 999, DescriptorProtos$Edition.EDITION_UNSTABLE_VALUE, DescriptorProtos$Edition.EDITION_99999_TEST_ONLY_VALUE, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
        f9232 = new int[1024];
        f9231 = new long[1024];
        f9235 = "-9223372036854775808".getBytes();
        f9236 = new char[]{SignatureVisitor.SUPER, '9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '8'};
        f9230 = new long[]{10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
        f9233 = new short[]{12336, 12592, 12848, 13104, 13360, 13616, 13872, 14128, 14384, 14640, 12337, 12593, 12849, 13105, 13361, 13617, 13873, 14129, 14385, 14641, 12338, 12594, 12850, 13106, 13362, 13618, 13874, 14130, 14386, 14642, 12339, 12595, 12851, 13107, 13363, 13619, 13875, 14131, 14387, 14643, 12340, 12596, 12852, 13108, 13364, 13620, 13876, 14132, 14388, 14644, 12341, 12597, 12853, 13109, 13365, 13621, 13877, 14133, 14389, 14645, 12342, 12598, 12854, 13110, 13366, 13622, 13878, 14134, 14390, 14646, 12343, 12599, 12855, 13111, 13367, 13623, 13879, 14135, 14391, 14647, 12344, 12600, 12856, 13112, 13368, 13624, 13880, 14136, 14392, 14648, 12345, 12601, 12857, 13113, 13369, 13625, 13881, 14137, 14393, 14649, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        f9234 = new int[]{3145776, 3211312, 3276848, 3342384, 3407920, 3473456, 3538992, 3604528, 3670064, 3735600, 3145777, 3211313, 3276849, 3342385, 3407921, 3473457, 3538993, 3604529, 3670065, 3735601, 3145778, 3211314, 3276850, 3342386, 3407922, 3473458, 3538994, 3604530, 3670066, 3735602, 3145779, 3211315, 3276851, 3342387, 3407923, 3473459, 3538995, 3604531, 3670067, 3735603, 3145780, 3211316, 3276852, 3342388, 3407924, 3473460, 3538996, 3604532, 3670068, 3735604, 3145781, 3211317, 3276853, 3342389, 3407925, 3473461, 3538997, 3604533, 3670069, 3735605, 3145782, 3211318, 3276854, 3342390, 3407926, 3473462, 3538998, 3604534, 3670070, 3735606, 3145783, 3211319, 3276855, 3342391, 3407927, 3473463, 3538999, 3604535, 3670071, 3735607, 3145784, 3211320, 3276856, 3342392, 3407928, 3473464, 3539000, 3604536, 3670072, 3735608, 3145785, 3211321, 3276857, 3342393, 3407929, 3473465, 3539001, 3604537, 3670073, 3735609, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int i = 0;
        while (true) {
            int i2 = 2;
            if (i >= 1000) {
                f9229 = AbstractC3687.f9266.getShort(new byte[]{48, 46}, AbstractC3687.f9265);
                return;
            }
            if (i >= 10) {
                i2 = i < 100 ? 1 : 0;
            }
            int i3 = (i / 100) + 48;
            int i4 = ((i / 10) % 10) + 48;
            int i5 = (i % 10) + 48;
            f9232[i] = (i3 << 8) + i2 + (i4 << 16) + (i5 << 24);
            f9231[i] = ((long) i2) + ((long) (i3 << 16)) + (((long) i4) << 32) + (((long) i5) << 48);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static int m6242(char[] cArr, int i, boolean z) {
        long j = AbstractC3687.f9264 + (((long) i) << 1);
        if (z) {
            AbstractC3687.f9266.putLong(cArr, j, f9237);
            return i + 4;
        }
        Unsafe unsafe = AbstractC3687.f9266;
        unsafe.putChar(cArr, j, 'f');
        unsafe.putLong(cArr, 2 + j, f9242);
        return i + 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m6243(byte[] bArr, int i, byte b) {
        AbstractC3687.f9266.putByte(bArr, AbstractC3687.f9265 + ((long) i), b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static boolean m6244(int i, char[] cArr) {
        return AbstractC3687.f9266.getLong(cArr, AbstractC3687.f9264 + (((long) i) << 1)) != f9237;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static boolean m6245(byte[] bArr, int i) {
        return AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265 + ((long) i)) != f9224;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static int m6246(byte[] bArr, int i, boolean z) {
        long j = AbstractC3687.f9265 + ((long) i);
        if (z) {
            AbstractC3687.f9266.putInt(bArr, j, f9238);
            return i + 4;
        }
        Unsafe unsafe = AbstractC3687.f9266;
        unsafe.putByte(bArr, j, (byte) 102);
        unsafe.putInt(bArr, j + 1, f9241);
        return i + 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static boolean m6247(byte[] bArr, int i) {
        return AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265 + ((long) i)) != f9238;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static boolean m6248(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                if (i != 0 || length == 1) {
                    return false;
                }
            } else if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static boolean m6249(byte[] bArr, int i) {
        return AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265 + ((long) i)) != f9241;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m6250(int i) {
        return i >= 48 && i <= 57;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m6251(byte[] bArr, int i) {
        int i2 = i & (-8);
        long j = AbstractC3687.f9265;
        int i3 = 0;
        while (i3 < i2 && (AbstractC3687.f9266.getLong(bArr, j) & (-9187201950435737472L)) == 0) {
            j += 8;
            i3 += 8;
        }
        while (true) {
            int i4 = i3 + 1;
            if (i3 >= i) {
                return true;
            }
            long j2 = 1 + j;
            if ((AbstractC3687.f9266.getByte(bArr, j) & 128) != 0) {
                return false;
            }
            i3 = i4;
            j = j2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static boolean m6252(byte[] bArr, int i) {
        return AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265 + ((long) i)) == f9224;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static boolean m6253(int i, char[] cArr) {
        int i2 = i & (-8);
        long j = AbstractC3687.f9264;
        int i3 = 0;
        while (i3 < i2) {
            Unsafe unsafe = AbstractC3687.f9266;
            long jReverseBytes = unsafe.getLong(cArr, j) | unsafe.getLong(cArr, 8 + j);
            if (AbstractC3687.f9276) {
                jReverseBytes = Long.reverseBytes(jReverseBytes);
            }
            if ((jReverseBytes & (-71777214294589696L)) != 0) {
                break;
            }
            j += 16;
            i3 += 8;
        }
        while (true) {
            int i4 = i3 + 1;
            if (i3 >= i) {
                return true;
            }
            short sReverseBytes = AbstractC3687.f9266.getShort(cArr, j);
            if (AbstractC3687.f9276) {
                sReverseBytes = Short.reverseBytes(sReverseBytes);
            }
            if ((sReverseBytes & 65280) != 0) {
                return false;
            }
            j += 2;
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static int m6254(byte[] bArr, int i) {
        int iM6295 = m6295(bArr, i);
        int i2 = 252645135 & iM6295;
        int i3 = iM6295 & 1077952576;
        int i4 = i2 + (((i3 << 1) | (i3 >> 2)) >>> 4);
        return ((251658240 & i4) >>> 24) + ((983040 & i4) >>> 12) + (i4 & 3840) + ((i4 & 15) << 12);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static int m6255(int i, char[] cArr) {
        long jM6291 = m6291(i, cArr);
        long j = 4222189076152335L & jM6291;
        long j2 = jM6291 & 18014673391583296L;
        long j3 = j + (((j2 << 1) | (j2 >> 2)) >>> 4);
        return (int) (((4222124650659840L & j3) >>> 48) + ((64424509440L & j3) >>> 28) + ((983040 & j3) >> 8) + ((j3 & 15) << 12));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static short m6256(byte[] bArr, int i) {
        return AbstractC3687.f9266.getShort(bArr, AbstractC3687.f9265 + ((long) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static short m6257(byte[] bArr, int i) {
        short s = AbstractC3687.f9266.getShort(bArr, AbstractC3687.f9265 + ((long) i));
        return !AbstractC3687.f9276 ? s : Short.reverseBytes(s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static short m6258(byte[] bArr, int i) {
        short s = AbstractC3687.f9266.getShort(bArr, AbstractC3687.f9265 + ((long) i));
        return true == AbstractC3687.f9276 ? s : Short.reverseBytes(s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static long m6259(byte[] bArr, int i) {
        return AbstractC3687.f9266.getLong(bArr, AbstractC3687.f9265 + ((long) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m6260(byte[] bArr, int i) {
        return AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265 + ((long) i)) == f9241;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static int m6261(int i, byte[] bArr, int i2) {
        long j = AbstractC3687.f9265 + ((long) i);
        int i3 = ((i2 - i) & (-8)) + i;
        while (i < i3) {
            long j2 = AbstractC3687.f9266.getLong(bArr, j) ^ 6655295901103053916L;
            if (((~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L)) != 0) {
                break;
            }
            i += 8;
            j += 8;
        }
        return m6265(92, bArr, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static int m6262(int i, byte[] bArr, int i2) {
        MethodHandle methodHandle = AbstractC3687.f9270;
        if (methodHandle == null) {
            return m6261(i, bArr, i2);
        }
        try {
            return (int) methodHandle.invokeExact(bArr, 92, i, i2);
        } catch (Throwable th) {
            C1123.m1410(th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static int m6263(int i, byte[] bArr, int i2, int i3) {
        long j = AbstractC3687.f9265 + ((long) i2);
        int i4 = ((i3 - i2) & (-8)) + i2;
        long j2 = i == 39 ? 2821266740684990247L : 2459565876494606882L;
        while (i2 < i4) {
            long j3 = AbstractC3687.f9266.getLong(bArr, j) ^ j2;
            if (((~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L)) != 0) {
                break;
            }
            i2 += 8;
            j += 8;
        }
        return m6265(i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static int m6264(int i, byte[] bArr, int i2, int i3) {
        MethodHandle methodHandle = AbstractC3687.f9270;
        if (methodHandle == null) {
            return m6263(i, bArr, i2, i3);
        }
        try {
            return (int) methodHandle.invokeExact(bArr, i, i2, i3);
        } catch (Throwable th) {
            C1123.m1410(th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static int m6265(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3) {
            if (bArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public static int m6266(byte[] bArr, int i, LocalTime localTime) {
        int i2;
        m6278(bArr, i, localTime.getHour(), localTime.getMinute(), localTime.getSecond());
        int i3 = i + 8;
        int nano = localTime.getNano();
        if (nano == 0) {
            return i3;
        }
        int i4 = (int) ((((long) nano) * 274877907) >> 38);
        int i5 = (int) ((((long) i4) * 274877907) >> 38);
        int i6 = nano - (i4 * DescriptorProtos$Edition.EDITION_2023_VALUE);
        int[] iArr = f9232;
        m6327(i3, bArr, (iArr[i5 & 1023] & (-256)) | 46);
        int i7 = i + 12;
        if (i6 == 0) {
            int i8 = i4 - (i5 * DescriptorProtos$Edition.EDITION_2023_VALUE);
            if (i8 == 0) {
                return i7;
            }
            i2 = iArr[i8 & 1023];
        } else {
            i2 = iArr[(i4 - (i5 * DescriptorProtos$Edition.EDITION_2023_VALUE)) & 1023];
        }
        m6321(bArr, i7, (short) (i2 >> 8));
        int i9 = i + 14;
        if (i6 == 0) {
            m6243(bArr, i9, (byte) (i2 >> 24));
            return i + 15;
        }
        m6327(i9, bArr, (iArr[i6] & (-256)) | (i2 >> 24));
        return i + 18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public static int m6267(char[] cArr, int i, LocalTime localTime) {
        long j;
        m6279(cArr, i, localTime.getHour(), localTime.getMinute(), localTime.getSecond());
        int i2 = i + 8;
        int nano = localTime.getNano();
        if (nano == 0) {
            return i2;
        }
        int i3 = (int) ((((long) nano) * 274877907) >> 38);
        int i4 = (int) ((((long) i3) * 274877907) >> 38);
        int i5 = nano - (i3 * DescriptorProtos$Edition.EDITION_2023_VALUE);
        long[] jArr = f9231;
        m6307(cArr, i2, (jArr[i4 & 1023] & (-65536)) | f9239);
        int i6 = i + 12;
        if (i5 == 0) {
            int i7 = i3 - (i4 * DescriptorProtos$Edition.EDITION_2023_VALUE);
            if (i7 == 0) {
                return i6;
            }
            j = jArr[i7 & 1023];
        } else {
            j = jArr[(i3 - (i4 * DescriptorProtos$Edition.EDITION_2023_VALUE)) & 1023];
        }
        m6326(i6, (int) (j >> 16), cArr);
        int i8 = i + 14;
        if (i5 == 0) {
            m6323(cArr, i8, (char) (j >> 48));
            return i + 15;
        }
        m6307(cArr, i8, (j >> 48) | (jArr[i5 & 1023] & (-65536)));
        return i + 18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public static int m6268(char[] cArr, int i, byte b) {
        int i2 = b;
        if (b < 0) {
            m6323(cArr, i, SignatureVisitor.SUPER);
            i++;
            i2 = -b;
        }
        long j = f9231[i2 & 1023];
        byte b2 = (byte) j;
        if (b2 == 0) {
            m6326(i, (int) (j >> 16), cArr);
            i += 2;
        } else if (b2 == 1) {
            m6323(cArr, i, (char) (j >> 32));
            i++;
        }
        m6323(cArr, i, (char) (j >> 48));
        return i + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public static int m6269(byte[] bArr, int i, byte b) {
        int i2 = b;
        if (b < 0) {
            m6243(bArr, i, (byte) 45);
            i++;
            i2 = -b;
        }
        int i3 = f9232[i2 & 1023];
        byte b2 = (byte) i3;
        if (b2 == 0) {
            m6321(bArr, i, (short) (i3 >> 8));
            i += 2;
        } else if (b2 == 1) {
            m6243(bArr, i, (byte) (i3 >> 16));
            i++;
        }
        m6243(bArr, i, (byte) (i3 >> 24));
        return i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m6270(char[] cArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iM6312;
        if (i2 >= 0) {
            if (i2 > 9999) {
                i5 = i + 1;
                cArr[i] = SignatureVisitor.EXTENDS;
            }
            i6 = (int) ((((long) i2) * 1374389535) >> 37);
            int i7 = i2 - (i6 * 100);
            if (i2 >= 0 || i2 >= 10000) {
                iM6312 = m6312(cArr, i, i6);
            } else {
                m6314(i, i6, cArr);
                iM6312 = i + 2;
            }
            int i8 = i3 & 127;
            int[] iArr = f9234;
            int i9 = iArr[i8];
            m6307(cArr, iM6312, ((long) iArr[i7 & 127]) | (((long) (65535 & i9)) << 48) | 193273528320L);
            m6307(cArr, iM6312 + 4, (((long) iArr[i4 & 127]) << 32) | (((long) (i9 & Opcodes.V_PREVIEW)) >> 16) | 2949120);
            return iM6312 + 8;
        }
        i5 = i + 1;
        cArr[i] = SignatureVisitor.SUPER;
        i2 = -i2;
        i = i5;
        i6 = (int) ((((long) i2) * 1374389535) >> 37);
        int i72 = i2 - (i6 * 100);
        if (i2 >= 0) {
            iM6312 = m6312(cArr, i, i6);
        }
        int i82 = i3 & 127;
        int[] iArr2 = f9234;
        int i92 = iArr2[i82];
        m6307(cArr, iM6312, ((long) iArr2[i72 & 127]) | (((long) (65535 & i92)) << 48) | 193273528320L);
        m6307(cArr, iM6312 + 4, (((long) iArr2[i4 & 127]) << 32) | (((long) (i92 & Opcodes.V_PREVIEW)) >> 16) | 2949120);
        return iM6312 + 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m6271(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iM6313;
        if (i2 >= 0) {
            if (i2 > 9999) {
                i5 = i + 1;
                bArr[i] = 43;
            }
            i6 = (int) ((((long) i2) * 1374389535) >> 37);
            int i7 = i2 - (i6 * 100);
            if (i2 >= 0 || i2 >= 10000) {
                iM6313 = m6313(i6, bArr, i);
            } else {
                m6315(i, bArr, i6);
                iM6313 = i + 2;
            }
            m6308((((long) m6302(i3)) << 24) | ((long) m6302(i7)) | 49478026199040L | (((long) m6302(i4)) << 48), bArr, iM6313);
            return iM6313 + 8;
        }
        i5 = i + 1;
        bArr[i] = 45;
        i2 = -i2;
        i = i5;
        i6 = (int) ((((long) i2) * 1374389535) >> 37);
        int i72 = i2 - (i6 * 100);
        if (i2 >= 0) {
            iM6313 = m6313(i6, bArr, i);
        }
        m6308((((long) m6302(i3)) << 24) | ((long) m6302(i72)) | 49478026199040L | (((long) m6302(i4)) << 48), bArr, iM6313);
        return iM6313 + 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static int m6272(int i, byte[] bArr, int i2) {
        int i3 = (int) ((((long) i2) * 1374389535) >> 37);
        int i4 = i2 - (i3 * 100);
        short[] sArr = f9233;
        int iReverseBytes = (sArr[i4 & 127] << 16) | sArr[i3 & 127];
        if (AbstractC3687.f9276) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        AbstractC3687.f9266.putInt(bArr, AbstractC3687.f9265 + ((long) i), iReverseBytes);
        return i + 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static int m6273(int i, int i2, char[] cArr) {
        int i3 = (int) ((((long) i2) * 1374389535) >> 37);
        int[] iArr = f9234;
        long jReverseBytes = (((long) iArr[(i2 - (i3 * 100)) & 127]) << 32) | iArr[i3 & 127];
        if (AbstractC3687.f9276) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        m6306(cArr, i, jReverseBytes);
        return i + 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public static int m6274(int i, int i2, char[] cArr, int i3) {
        int i4 = (int) ((((long) i2) * 1374389535) >> 37);
        int[] iArr = f9234;
        long jReverseBytes = (((long) iArr[(i2 - (i4 * 100)) & 127]) << 32) | ((long) iArr[i4 & 127]);
        int i5 = (int) ((((long) i3) * 1374389535) >> 37);
        long jReverseBytes2 = ((long) iArr[i5 & 127]) | (((long) iArr[(i3 - (i5 * 100)) & 127]) << 32);
        if (AbstractC3687.f9276) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
        }
        long j = jReverseBytes;
        Unsafe unsafe = AbstractC3687.f9266;
        long j2 = AbstractC3687.f9264;
        long j3 = ((long) i) << 1;
        unsafe.putLong(cArr, j2 + j3, j);
        unsafe.putLong(cArr, j2 + j3 + 8, jReverseBytes2);
        return i + 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public static int m6275(int i, byte[] bArr, int i2, int i3) {
        int i4 = (int) ((((long) i2) * 1374389535) >> 37);
        int i5 = (int) ((((long) i3) * 1374389535) >> 37);
        short[] sArr = f9233;
        long jReverseBytes = (((long) sArr[(i3 - (i5 * 100)) & 127]) << 48) | ((long) ((sArr[(i2 - (i4 * 100)) & 127] << 16) | sArr[i4 & 127])) | (((long) sArr[i5 & 127]) << 32);
        if (AbstractC3687.f9276) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        AbstractC3687.f9266.putLong(bArr, AbstractC3687.f9265 + ((long) i), jReverseBytes);
        return i + 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public static int m6276(long j, byte[] bArr, int i) {
        int iM6272;
        if (j < 0) {
            if (j == Long.MIN_VALUE) {
                byte[] bArr2 = f9235;
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                return i + bArr2.length;
            }
            j = -j;
            m6243(bArr, i, (byte) 45);
            i++;
        }
        if (j <= 2147483647L) {
            return m6313((int) j, bArr, i);
        }
        AbstractC3660.f9151.getClass();
        long jM6237 = C3661.m6237(j, 7555786372591432342L) >> 12;
        int i2 = (int) (j - (jM6237 * 10000));
        long jM62372 = C3661.m6237(jM6237, 1844674407370956L);
        int i3 = (int) (jM6237 - (jM62372 * 10000));
        if (jM62372 < 10000) {
            int i4 = (int) jM62372;
            return m6275(i4 < 1000 ? m6310(i, bArr, i4) : m6272(i, bArr, i4), bArr, i3, i2);
        }
        long jM62373 = C3661.m6237(jM62372, 1844674407370956L);
        int i5 = (int) (jM62372 - (jM62373 * 10000));
        if (jM62373 >= 10000) {
            long jM62374 = C3661.m6237(jM62373, 1844674407370956L);
            return m6275(m6275(m6310(i, bArr, (int) jM62374), bArr, (int) (jM62373 - (10000 * jM62374)), i5), bArr, i3, i2);
        }
        int i6 = (int) jM62373;
        if (i6 < 1000) {
            iM6272 = m6272(m6310(i, bArr, i6), bArr, i5);
        } else {
            m6275(i, bArr, i6, i5);
            iM6272 = i + 8;
        }
        return m6275(iM6272, bArr, i3, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public static int m6277(char[] cArr, int i, long j) {
        int iM6273;
        if (j < 0) {
            if (j == Long.MIN_VALUE) {
                char[] cArr2 = f9236;
                System.arraycopy(cArr2, 0, cArr, i, cArr2.length);
                return i + cArr2.length;
            }
            j = -j;
            m6323(cArr, i, SignatureVisitor.SUPER);
            i++;
        }
        if (j <= 2147483647L) {
            return m6312(cArr, i, (int) j);
        }
        AbstractC3660.f9151.getClass();
        long jM6237 = C3661.m6237(j, 7555786372591432342L) >> 12;
        int i2 = (int) (j - (jM6237 * 10000));
        long jM62372 = C3661.m6237(jM6237, 1844674407370956L);
        int i3 = (int) (jM6237 - (jM62372 * 10000));
        if (jM62372 < 10000) {
            int i4 = (int) jM62372;
            return m6274(i4 < 1000 ? m6311(i, i4, cArr) : m6273(i, i4, cArr), i3, cArr, i2);
        }
        long jM62373 = C3661.m6237(jM62372, 1844674407370956L);
        int i5 = (int) (jM62372 - (jM62373 * 10000));
        if (jM62373 >= 10000) {
            long jM62374 = C3661.m6237(jM62373, 1844674407370956L);
            return m6274(m6274(m6311(i, (int) jM62374, cArr), (int) (jM62373 - (10000 * jM62374)), cArr, i5), i3, cArr, i2);
        }
        int i6 = (int) jM62373;
        if (i6 < 1000) {
            iM6273 = m6273(m6311(i, i6, cArr), i5, cArr);
        } else {
            m6274(i, i6, cArr, i5);
            iM6273 = i + 8;
        }
        return m6274(iM6273, i3, cArr, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public static void m6278(byte[] bArr, int i, int i2, int i3, int i4) {
        m6308((((long) m6302(i3)) << 24) | ((long) m6302(i2)) | 63771678212096L | (((long) m6302(i4)) << 48), bArr, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static void m6279(char[] cArr, int i, int i2, int i3, int i4) {
        m6314(i, i2, cArr);
        m6323(cArr, i + 2, ':');
        m6314(i + 3, i3, cArr);
        m6323(cArr, i + 5, ':');
        m6314(i + 6, i4, cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m6280(byte[] bArr, int i) {
        short sReverseBytes = AbstractC3687.f9266.getShort(bArr, AbstractC3687.f9265 + ((long) i));
        if (AbstractC3687.f9276) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        int i2 = sReverseBytes & 3855;
        if (((61680 & (i2 + 1542)) | ((sReverseBytes & 61680) - 12336)) != 0) {
            return -1;
        }
        return ((sReverseBytes & 15) * 10) + (i2 >> 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m6281(int i, char[] cArr) {
        int iReverseBytes = AbstractC3687.f9266.getInt(cArr, AbstractC3687.f9264 + (((long) i) << 1));
        if (AbstractC3687.f9276) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        int i2 = 983055 & iReverseBytes;
        if (((((-983056) & iReverseBytes) - 3145776) | ((393222 + i2) & 15728880)) != 0) {
            return -1;
        }
        return ((iReverseBytes & 15) * 10) + (i2 >> 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m6282(byte[] bArr, int i) {
        int i2 = AbstractC3687.f9266.getByte(bArr, AbstractC3687.f9265 + ((long) i)) - 48;
        if (i2 < 0 || i2 > 9) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m6283(int i, char[] cArr) {
        int i2 = AbstractC3687.f9266.getByte(cArr, AbstractC3687.f9264 + (((long) i) << 1)) - 48;
        if (i2 < 0 || i2 > 9) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m6284(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int i4 = i2 + i;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                bArr2[i5] = b;
                bArr2[i5 + 1] = 0;
                i5 += 2;
                i = i6;
            } else {
                if ((b >> 5) != -2 || (b & 30) == 0) {
                    if ((b >> 4) == -2) {
                        int i7 = i + 2;
                        if (i7 >= i4) {
                            return -1;
                        }
                        byte b2 = bArr[i6];
                        byte b3 = bArr[i7];
                        i += 3;
                        if ((b == -32 && (b2 & 224) == 128) || (b2 & 192) != 128 || (b3 & 192) != 128) {
                            return -1;
                        }
                        char c = (char) (((b2 << 6) ^ (b << 12)) ^ ((-123008) ^ b3));
                        if (c >= 55296 && c < 57344) {
                            return -1;
                        }
                        bArr2[i5] = (byte) c;
                        bArr2[i5 + 1] = (byte) (c >> '\b');
                    } else {
                        if ((b >> 3) != -2 || (i3 = i + 3) >= i4) {
                            return -1;
                        }
                        byte b4 = bArr[i6];
                        byte b5 = bArr[i + 2];
                        byte b6 = bArr[i3];
                        i += 4;
                        int i8 = (((b << 18) ^ (b4 << 12)) ^ (b5 << 6)) ^ (3678080 ^ b6);
                        if ((b4 & 192) != 128 || (b5 & 192) != 128 || (b6 & 192) != 128 || i8 < 65536 || i8 >= 1114112) {
                            return -1;
                        }
                        char c2 = (char) ((i8 >>> 10) + 55232);
                        bArr2[i5] = (byte) c2;
                        bArr2[i5 + 1] = (byte) (c2 >> '\b');
                        char c3 = (char) ((i8 & 1023) + 56320);
                        bArr2[i5 + 2] = (byte) c3;
                        bArr2[i5 + 3] = (byte) (c3 >> '\b');
                        i5 += 4;
                    }
                } else {
                    if (i6 >= i4) {
                        bArr2[i5] = b;
                        bArr2[i5 + 1] = 0;
                        return i5 + 2;
                    }
                    i += 2;
                    byte b7 = bArr[i6];
                    if ((b7 & 192) != 128) {
                        return -1;
                    }
                    char c4 = (char) ((b7 ^ (b << 6)) ^ 3968);
                    bArr2[i5] = (byte) c4;
                    bArr2[i5 + 1] = (byte) (c4 >> '\b');
                }
                i5 += 2;
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m6285(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static int m6286(char[] cArr) {
        return AbstractC3687.f9266.getInt(cArr, AbstractC3687.f9264);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static int m6287(byte[] bArr, int i) {
        return AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265 + ((long) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static long m6288(byte[] bArr, int i) {
        long j = AbstractC3687.f9266.getLong(bArr, AbstractC3687.f9265 + ((long) i));
        return !AbstractC3687.f9276 ? j : Long.reverseBytes(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static long m6289(int i, char[] cArr) {
        return AbstractC3687.f9266.getLong(cArr, AbstractC3687.f9264 + (((long) i) << 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static long m6290(byte[] bArr, int i) {
        long j = AbstractC3687.f9266.getLong(bArr, AbstractC3687.f9265 + ((long) i));
        return !AbstractC3687.f9276 ? Long.reverseBytes(j) : j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static long m6291(int i, char[] cArr) {
        long j = AbstractC3687.f9266.getLong(cArr, AbstractC3687.f9264 + (((long) i) << 1));
        return AbstractC3687.f9276 ? Long.reverseBytes(j) : j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m6292(int i, int i2, char[] cArr) {
        int i3;
        boolean z = i < 0;
        if (!z) {
            i = -i;
        }
        while (i <= -100) {
            int i4 = i / 100;
            i2 -= 2;
            m6314(i2, (i4 * 100) - i, cArr);
            i = i4;
        }
        if (i < -9) {
            i3 = i2 - 2;
            m6314(i3, -i, cArr);
        } else {
            i3 = i2 - 1;
            m6323(cArr, i3, (char) (48 - i));
        }
        if (z) {
            m6323(cArr, i3 - 1, SignatureVisitor.SUPER);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static char m6293(byte[] bArr, int i) {
        return AbstractC3687.f9266.getChar(bArr, AbstractC3687.f9265 + (((long) i) << 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static int m6294(int i, char[] cArr) {
        int i2 = AbstractC3687.f9266.getInt(cArr, AbstractC3687.f9264 + (((long) i) << 1));
        return AbstractC3687.f9276 ? Integer.reverseBytes(i2) : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int m6295(byte[] bArr, int i) {
        int i2 = AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265 + ((long) i));
        return AbstractC3687.f9276 ? Integer.reverseBytes(i2) : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m6296(int i, byte[] bArr, int i2) {
        int i3;
        boolean z = i < 0;
        if (!z) {
            i = -i;
        }
        while (i <= -100) {
            int i4 = i / 100;
            i2 -= 2;
            m6315(i2, bArr, (i4 * 100) - i);
            i = i4;
        }
        if (i < -9) {
            i3 = i2 - 2;
            m6315(i3, bArr, -i);
        } else {
            i3 = i2 - 1;
            m6243(bArr, i3, (byte) (48 - i));
        }
        if (z) {
            m6243(bArr, i3 - 1, (byte) 45);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static int m6297(byte[] bArr, int i) {
        int i2 = AbstractC3687.f9266.getInt(bArr, AbstractC3687.f9265 + ((long) i));
        return !AbstractC3687.f9276 ? Integer.reverseBytes(i2) : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m6298(byte[] bArr, int i) {
        int iM6295 = m6295(bArr, i);
        int i2 = 252645135 & iM6295;
        if ((((-252645136) & (101058054 + i2)) | ((iM6295 & (-252645136)) - 808464432)) != 0) {
            return -1;
        }
        return ((((((iM6295 & 15) * 10) + ((i2 >> 8) & 15)) * 10) + ((i2 >> 16) & 15)) * 10) + (i2 >> 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m6299(int i, char[] cArr) {
        long jM6291 = m6291(i, cArr);
        long j = 4222189076152335L & jM6291;
        if (((((-4222189076152336L) & jM6291) - 13511005043687472L) | ((1688875630460934L + j) & 67555025218437360L)) != 0) {
            return -1;
        }
        return (int) (((((((jM6291 & 15) * 10) + ((j >> 16) & 15)) * 10) + (15 & (j >> 32))) * 10) + (j >> 48));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static byte m6300(byte[] bArr, int i) {
        return AbstractC3687.f9266.getByte(bArr, AbstractC3687.f9265 + ((long) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static char m6301(int i, char[] cArr) {
        return AbstractC3687.f9266.getChar(cArr, AbstractC3687.f9264 + (((long) i) << 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static short m6302(int i) {
        return f9233[i & 127];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m6303(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        byte[] bArr3;
        byte[] bArr4;
        int i4 = 0;
        int i5 = i2;
        while (i4 < i) {
            char c = AbstractC3687.f9266.getChar(bArr, AbstractC3687.f9265 + ((long) i4));
            int i6 = i4 + 2;
            if (c < 128) {
                bArr2[i5] = (byte) c;
                i3 = i;
                i5++;
            } else if (c < 2048) {
                bArr2[i5] = (byte) ((c >> 6) | 192);
                bArr2[i5 + 1] = (byte) (128 | (c & '?'));
                i5 += 2;
                i3 = i;
            } else if (c < 55296 || c > 57343) {
                i3 = i;
                bArr3 = bArr;
                bArr4 = bArr2;
                bArr4[i5] = (byte) ((c >> '\f') | com.android.p002dx.p005io.Opcodes.SHL_INT_LIT8);
                bArr4[i5 + 1] = (byte) (((c >> 6) & 63) | 128);
                bArr4[i5 + 2] = (byte) (128 | (c & '?'));
                i5 += 3;
                i4 = i6;
                bArr = bArr3;
                i = i3;
                bArr2 = bArr4;
            } else {
                i3 = i;
                bArr3 = bArr;
                bArr4 = bArr2;
                m6318(bArr3, i6, i3, c, bArr4, i5);
                i4 += 4;
                i5 += 4;
                bArr = bArr3;
                i = i3;
                bArr2 = bArr4;
            }
            bArr3 = bArr;
            bArr4 = bArr2;
            i4 = i6;
            bArr = bArr3;
            i = i3;
            bArr2 = bArr4;
        }
        return i5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static void m6304(byte[] bArr, int i) {
        AbstractC3687.f9266.putInt(bArr, AbstractC3687.f9265 + ((long) i), f9224);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static void m6305(int i, char[] cArr) {
        AbstractC3687.f9266.putLong(cArr, AbstractC3687.f9264 + (((long) i) << 1), f9223);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static void m6306(char[] cArr, int i, long j) {
        AbstractC3687.f9266.putLong(cArr, AbstractC3687.f9264 + (((long) i) << 1), j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static void m6307(char[] cArr, int i, long j) {
        Unsafe unsafe = AbstractC3687.f9266;
        long j2 = AbstractC3687.f9264 + (((long) i) << 1);
        if (AbstractC3687.f9276) {
            j = Long.reverseBytes(j);
        }
        unsafe.putLong(cArr, j2, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static void m6308(long j, byte[] bArr, int i) {
        Unsafe unsafe = AbstractC3687.f9266;
        long j2 = AbstractC3687.f9265 + ((long) i);
        if (AbstractC3687.f9276) {
            j = Long.reverseBytes(j);
        }
        unsafe.putLong(bArr, j2, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static void m6309(long j, byte[] bArr, int i) {
        Unsafe unsafe = AbstractC3687.f9266;
        long j2 = AbstractC3687.f9265 + ((long) i);
        if (true != AbstractC3687.f9276) {
            j = Long.reverseBytes(j);
        }
        unsafe.putLong(bArr, j2, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static int m6310(int i, byte[] bArr, int i2) {
        int i3 = f9232[i2 & 1023];
        byte b = (byte) i3;
        AbstractC3687.f9266.putInt(bArr, AbstractC3687.f9265 + ((long) i), i3 >> ((b + 1) << 3));
        return (i + 3) - b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static int m6311(int i, int i2, char[] cArr) {
        long j = f9231[i2 & 1023];
        int i3 = (int) j;
        AbstractC3687.f9266.putLong(cArr, AbstractC3687.f9264 + (((long) i) << 1), j >> ((((short) i3) + 1) << 4));
        return (i + 3) - ((byte) i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static int m6312(char[] cArr, int i, long j) {
        if (j < 0) {
            j = -j;
            m6323(cArr, i, SignatureVisitor.SUPER);
            i++;
        }
        if (j < 10000) {
            int i2 = (int) j;
            return i2 < 1000 ? m6311(i, i2, cArr) : m6273(i, i2, cArr);
        }
        long j2 = (int) ((j * 1759218605) >> 44);
        int i3 = (int) (j - (j2 * 10000));
        if (j2 < 10000) {
            int i4 = (int) j2;
            return i4 < 1000 ? m6273(m6311(i, i4, cArr), i3, cArr) : m6274(i, i4, cArr, i3);
        }
        long j3 = (int) ((1759218605 * j2) >> 44);
        return m6274(m6311(i, (int) j3, cArr), (int) (j2 - (j3 * 10000)), cArr, i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static int m6313(long j, byte[] bArr, int i) {
        if (j < 0) {
            j = -j;
            m6243(bArr, i, (byte) 45);
            i++;
        }
        if (j < 10000) {
            int i2 = (int) j;
            return i2 < 1000 ? m6310(i, bArr, i2) : m6272(i, bArr, i2);
        }
        long j2 = (int) ((j * 1759218605) >> 44);
        int i3 = (int) (j - (j2 * 10000));
        if (j2 < 10000) {
            int i4 = (int) j2;
            return i4 < 1000 ? m6272(m6310(i, bArr, i4), bArr, i3) : m6275(i, bArr, i4, i3);
        }
        long j3 = (int) ((1759218605 * j2) >> 44);
        return m6275(m6310(i, bArr, (int) j3), bArr, (int) (j2 - (j3 * 10000)), i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static void m6314(int i, int i2, char[] cArr) {
        m6326(i, f9234[i2 & 127], cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static void m6315(int i, byte[] bArr, int i2) {
        m6321(bArr, i, f9233[i2 & 127]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static int m6316(int i) {
        int i2 = 0;
        while (i > f9240[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static void m6317(byte[] bArr, int i, short s) {
        AbstractC3687.f9266.putShort(bArr, AbstractC3687.f9265 + ((long) i), s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static void m6318(byte[] bArr, int i, int i2, char c, byte[] bArr2, int i3) {
        char c2;
        if (c > 56319 || i2 - i < 1 || (c2 = AbstractC3687.f9266.getChar(bArr, AbstractC3687.f9265 + ((long) i))) < 56320 || c2 > 57343) {
            C1123.m1410(AbstractC7012.m12147(i, "malformed input off : "));
            return;
        }
        int i4 = ((c << '\n') + c2) - 56613888;
        bArr2[i3] = (byte) ((i4 >> 18) | 240);
        bArr2[i3 + 1] = (byte) (((i4 >> 12) & 63) | 128);
        bArr2[i3 + 2] = (byte) (((i4 >> 6) & 63) | 128);
        bArr2[i3 + 3] = (byte) ((i4 & 63) | 128);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static int m6319(long j) {
        long j2 = 10;
        for (int i = 1; i < 19; i++) {
            if (j < j2) {
                return i;
            }
            j2 *= 10;
        }
        return 19;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static void m6320(byte[] bArr, int i, short s) {
        Unsafe unsafe = AbstractC3687.f9266;
        long j = AbstractC3687.f9265 + ((long) i);
        if (true != AbstractC3687.f9276) {
            s = Short.reverseBytes(s);
        }
        unsafe.putShort(bArr, j, s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static void m6321(byte[] bArr, int i, short s) {
        Unsafe unsafe = AbstractC3687.f9266;
        long j = AbstractC3687.f9265 + ((long) i);
        if (AbstractC3687.f9276) {
            s = Short.reverseBytes(s);
        }
        unsafe.putShort(bArr, j, s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static void m6322(int i, byte[] bArr, int i2) {
        if (!AbstractC3687.f9276) {
            i2 = Integer.reverseBytes(i2);
        }
        AbstractC3687.f9266.putInt(bArr, AbstractC3687.f9265 + ((long) i), i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m6323(char[] cArr, int i, char c) {
        AbstractC3687.f9266.putChar(cArr, AbstractC3687.f9264 + (((long) i) << 1), c);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static void m6324(int i, int i2, char[] cArr) {
        AbstractC3687.f9266.putInt(cArr, AbstractC3687.f9264 + (((long) i) << 1), i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static void m6325(int i, byte[] bArr, int i2) {
        AbstractC3687.f9266.putInt(bArr, AbstractC3687.f9265 + ((long) i), i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static void m6326(int i, int i2, char[] cArr) {
        if (AbstractC3687.f9276) {
            i2 = Integer.reverseBytes(i2);
        }
        AbstractC3687.f9266.putInt(cArr, AbstractC3687.f9264 + (((long) i) << 1), i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static void m6327(int i, byte[] bArr, int i2) {
        if (AbstractC3687.f9276) {
            i2 = Integer.reverseBytes(i2);
        }
        AbstractC3687.f9266.putInt(bArr, AbstractC3687.f9265 + ((long) i), i2);
    }
}
