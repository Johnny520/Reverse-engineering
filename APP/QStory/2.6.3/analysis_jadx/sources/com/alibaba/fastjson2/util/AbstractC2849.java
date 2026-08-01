package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.android.dx.io.Opcodes;
import com.google.protobuf.DescriptorProtos$Edition;
import java.io.Closeable;
import java.lang.invoke.MethodHandle;
import java.time.LocalTime;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p009.AbstractC6183;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2849 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f8878;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int f8879;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f8880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final short f8881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f8882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final short f8883;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final short f8884;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long[] f8885;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final long[] f8886;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final int[] f8887;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final short[] f8888;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final int[] f8889;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final byte[] f8890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final char[] f8891;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final long f8892;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f8893;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final long f8894;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int[] f8895;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int f8896;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final long f8897;

    static {
        boolean z = AbstractC2854.f8931;
        f8883 = z ? (short) 11824 : (short) 12334;
        f8882 = z ? 3014704 : 3145774;
        f8881 = z ? (short) 12334 : (short) 11824;
        f8880 = z ? 3145774 : 3014704;
        f8879 = z ? 1853189228 : 1819047278;
        f8878 = z ? 30962749956423788L : 30399761348886638L;
        f8893 = z ? 1953658213 : 1702195828;
        f8892 = z ? 32651586932375653L : 28429475166421108L;
        f8896 = z ? 1634497381 : 1702063201;
        f8897 = z ? 27303536604938341L : 28429466576093281L;
        f8894 = z ? 11776L : 46L;
        f8895 = new int[]{9, 99, 999, DescriptorProtos$Edition.EDITION_UNSTABLE_VALUE, DescriptorProtos$Edition.EDITION_99999_TEST_ONLY_VALUE, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
        f8887 = new int[1024];
        f8886 = new long[1024];
        f8890 = "-9223372036854775808".getBytes();
        f8891 = new char[]{SignatureVisitor.SUPER, '9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '8'};
        f8885 = new long[]{10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
        f8888 = new short[]{12336, 12592, 12848, 13104, 13360, 13616, 13872, 14128, 14384, 14640, 12337, 12593, 12849, 13105, 13361, 13617, 13873, 14129, 14385, 14641, 12338, 12594, 12850, 13106, 13362, 13618, 13874, 14130, 14386, 14642, 12339, 12595, 12851, 13107, 13363, 13619, 13875, 14131, 14387, 14643, 12340, 12596, 12852, 13108, 13364, 13620, 13876, 14132, 14388, 14644, 12341, 12597, 12853, 13109, 13365, 13621, 13877, 14133, 14389, 14645, 12342, 12598, 12854, 13110, 13366, 13622, 13878, 14134, 14390, 14646, 12343, 12599, 12855, 13111, 13367, 13623, 13879, 14135, 14391, 14647, 12344, 12600, 12856, 13112, 13368, 13624, 13880, 14136, 14392, 14648, 12345, 12601, 12857, 13113, 13369, 13625, 13881, 14137, 14393, 14649, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        f8889 = new int[]{3145776, 3211312, 3276848, 3342384, 3407920, 3473456, 3538992, 3604528, 3670064, 3735600, 3145777, 3211313, 3276849, 3342385, 3407921, 3473457, 3538993, 3604529, 3670065, 3735601, 3145778, 3211314, 3276850, 3342386, 3407922, 3473458, 3538994, 3604530, 3670066, 3735602, 3145779, 3211315, 3276851, 3342387, 3407923, 3473459, 3538995, 3604531, 3670067, 3735603, 3145780, 3211316, 3276852, 3342388, 3407924, 3473460, 3538996, 3604532, 3670068, 3735604, 3145781, 3211317, 3276853, 3342389, 3407925, 3473461, 3538997, 3604533, 3670069, 3735605, 3145782, 3211318, 3276854, 3342390, 3407926, 3473462, 3538998, 3604534, 3670070, 3735606, 3145783, 3211319, 3276855, 3342391, 3407927, 3473463, 3538999, 3604535, 3670071, 3735607, 3145784, 3211320, 3276856, 3342392, 3407928, 3473464, 3539000, 3604536, 3670072, 3735608, 3145785, 3211321, 3276857, 3342393, 3407929, 3473465, 3539001, 3604537, 3670073, 3735609, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int i = 0;
        while (true) {
            int i2 = 2;
            if (i >= 1000) {
                f8884 = AbstractC2854.f8921.getShort(new byte[]{48, 46}, AbstractC2854.f8920);
                return;
            }
            if (i >= 10) {
                i2 = i < 100 ? 1 : 0;
            }
            int i3 = (i / 100) + 48;
            int i4 = ((i / 10) % 10) + 48;
            int i5 = (i % 10) + 48;
            f8887[i] = (i3 << 8) + i2 + (i4 << 16) + (i5 << 24);
            f8886[i] = ((long) i2) + ((long) (i3 << 16)) + (((long) i4) << 32) + (((long) i5) << 48);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static int m5682(char[] cArr, int i, boolean z) {
        long j = AbstractC2854.f8919 + (((long) i) << 1);
        if (z) {
            AbstractC2854.f8921.putLong(cArr, j, f8892);
            return i + 4;
        }
        Unsafe unsafe = AbstractC2854.f8921;
        unsafe.putChar(cArr, j, 'f');
        unsafe.putLong(cArr, 2 + j, f8897);
        return i + 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m5683(byte[] bArr, int i, byte b) {
        AbstractC2854.f8921.putByte(bArr, AbstractC2854.f8920 + ((long) i), b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static boolean m5684(int i, char[] cArr) {
        return AbstractC2854.f8921.getLong(cArr, AbstractC2854.f8919 + (((long) i) << 1)) != f8892;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static boolean m5685(byte[] bArr, int i) {
        return AbstractC2854.f8921.getInt(bArr, AbstractC2854.f8920 + ((long) i)) != f8879;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static int m5686(byte[] bArr, int i, boolean z) {
        long j = AbstractC2854.f8920 + ((long) i);
        if (z) {
            AbstractC2854.f8921.putInt(bArr, j, f8893);
            return i + 4;
        }
        Unsafe unsafe = AbstractC2854.f8921;
        unsafe.putByte(bArr, j, (byte) 102);
        unsafe.putInt(bArr, j + 1, f8896);
        return i + 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static boolean m5687(byte[] bArr, int i) {
        return AbstractC2854.f8921.getInt(bArr, AbstractC2854.f8920 + ((long) i)) != f8893;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static boolean m5688(String str) {
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
    public static boolean m5689(byte[] bArr, int i) {
        return AbstractC2854.f8921.getInt(bArr, AbstractC2854.f8920 + ((long) i)) != f8896;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m5690(int i) {
        return i >= 48 && i <= 57;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m5691(byte[] bArr, int i) {
        int i2 = i & (-8);
        long j = AbstractC2854.f8920;
        int i3 = 0;
        while (i3 < i2 && (AbstractC2854.f8921.getLong(bArr, j) & (-9187201950435737472L)) == 0) {
            j += 8;
            i3 += 8;
        }
        while (true) {
            int i4 = i3 + 1;
            if (i3 >= i) {
                return true;
            }
            long j2 = 1 + j;
            if ((AbstractC2854.f8921.getByte(bArr, j) & 128) != 0) {
                return false;
            }
            i3 = i4;
            j = j2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static boolean m5692(byte[] bArr, int i) {
        return AbstractC2854.f8921.getInt(bArr, AbstractC2854.f8920 + ((long) i)) == f8879;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static boolean m5693(int i, char[] cArr) {
        int i2 = i & (-8);
        long j = AbstractC2854.f8919;
        int i3 = 0;
        while (i3 < i2) {
            Unsafe unsafe = AbstractC2854.f8921;
            long jReverseBytes = unsafe.getLong(cArr, j) | unsafe.getLong(cArr, 8 + j);
            if (AbstractC2854.f8931) {
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
            short sReverseBytes = AbstractC2854.f8921.getShort(cArr, j);
            if (AbstractC2854.f8931) {
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
    public static int m5694(byte[] bArr, int i) {
        int iM5735 = m5735(bArr, i);
        int i2 = 252645135 & iM5735;
        int i3 = iM5735 & 1077952576;
        int i4 = i2 + (((i3 << 1) | (i3 >> 2)) >>> 4);
        return ((251658240 & i4) >>> 24) + ((983040 & i4) >>> 12) + (i4 & 3840) + ((i4 & 15) << 12);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static int m5695(int i, char[] cArr) {
        long jM5731 = m5731(i, cArr);
        long j = 4222189076152335L & jM5731;
        long j2 = jM5731 & 18014673391583296L;
        long j3 = j + (((j2 << 1) | (j2 >> 2)) >>> 4);
        return (int) (((4222124650659840L & j3) >>> 48) + ((64424509440L & j3) >>> 28) + ((983040 & j3) >> 8) + ((j3 & 15) << 12));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static short m5696(byte[] bArr, int i) {
        return AbstractC2854.f8921.getShort(bArr, AbstractC2854.f8920 + ((long) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static short m5697(byte[] bArr, int i) {
        short s = AbstractC2854.f8921.getShort(bArr, AbstractC2854.f8920 + ((long) i));
        return !AbstractC2854.f8931 ? s : Short.reverseBytes(s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static short m5698(byte[] bArr, int i) {
        short s = AbstractC2854.f8921.getShort(bArr, AbstractC2854.f8920 + ((long) i));
        return true == AbstractC2854.f8931 ? s : Short.reverseBytes(s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static long m5699(byte[] bArr, int i) {
        return AbstractC2854.f8921.getLong(bArr, AbstractC2854.f8920 + ((long) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m5700(byte[] bArr, int i) {
        return AbstractC2854.f8921.getInt(bArr, AbstractC2854.f8920 + ((long) i)) == f8896;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static int m5701(int i, byte[] bArr, int i2) {
        long j = AbstractC2854.f8920 + ((long) i);
        int i3 = ((i2 - i) & (-8)) + i;
        while (i < i3) {
            long j2 = AbstractC2854.f8921.getLong(bArr, j) ^ 6655295901103053916L;
            if (((~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L)) != 0) {
                break;
            }
            i += 8;
            j += 8;
        }
        return m5705(92, bArr, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static int m5702(int i, byte[] bArr, int i2) {
        MethodHandle methodHandle = AbstractC2854.f8925;
        if (methodHandle == null) {
            return m5701(i, bArr, i2);
        }
        try {
            return (int) methodHandle.invokeExact(bArr, 92, i, i2);
        } catch (Throwable th) {
            C0276.m850(th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static int m5703(int i, byte[] bArr, int i2, int i3) {
        long j = AbstractC2854.f8920 + ((long) i2);
        int i4 = ((i3 - i2) & (-8)) + i2;
        long j2 = i == 39 ? 2821266740684990247L : 2459565876494606882L;
        while (i2 < i4) {
            long j3 = AbstractC2854.f8921.getLong(bArr, j) ^ j2;
            if (((~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L)) != 0) {
                break;
            }
            i2 += 8;
            j += 8;
        }
        return m5705(i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static int m5704(int i, byte[] bArr, int i2, int i3) {
        MethodHandle methodHandle = AbstractC2854.f8925;
        if (methodHandle == null) {
            return m5703(i, bArr, i2, i3);
        }
        try {
            return (int) methodHandle.invokeExact(bArr, i, i2, i3);
        } catch (Throwable th) {
            C0276.m850(th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static int m5705(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3) {
            if (bArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public static int m5706(byte[] bArr, int i, LocalTime localTime) {
        int i2;
        m5718(bArr, i, localTime.getHour(), localTime.getMinute(), localTime.getSecond());
        int i3 = i + 8;
        int nano = localTime.getNano();
        if (nano == 0) {
            return i3;
        }
        int i4 = (int) ((((long) nano) * 274877907) >> 38);
        int i5 = (int) ((((long) i4) * 274877907) >> 38);
        int i6 = nano - (i4 * DescriptorProtos$Edition.EDITION_2023_VALUE);
        int[] iArr = f8887;
        m5767(i3, bArr, (iArr[i5 & 1023] & (-256)) | 46);
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
        m5761(bArr, i7, (short) (i2 >> 8));
        int i9 = i + 14;
        if (i6 == 0) {
            m5683(bArr, i9, (byte) (i2 >> 24));
            return i + 15;
        }
        m5767(i9, bArr, (iArr[i6] & (-256)) | (i2 >> 24));
        return i + 18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public static int m5707(char[] cArr, int i, LocalTime localTime) {
        long j;
        m5719(cArr, i, localTime.getHour(), localTime.getMinute(), localTime.getSecond());
        int i2 = i + 8;
        int nano = localTime.getNano();
        if (nano == 0) {
            return i2;
        }
        int i3 = (int) ((((long) nano) * 274877907) >> 38);
        int i4 = (int) ((((long) i3) * 274877907) >> 38);
        int i5 = nano - (i3 * DescriptorProtos$Edition.EDITION_2023_VALUE);
        long[] jArr = f8886;
        m5747(cArr, i2, (jArr[i4 & 1023] & (-65536)) | f8894);
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
        m5766(i6, (int) (j >> 16), cArr);
        int i8 = i + 14;
        if (i5 == 0) {
            m5763(cArr, i8, (char) (j >> 48));
            return i + 15;
        }
        m5747(cArr, i8, (j >> 48) | (jArr[i5 & 1023] & (-65536)));
        return i + 18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public static int m5708(char[] cArr, int i, byte b) {
        int i2 = b;
        if (b < 0) {
            m5763(cArr, i, SignatureVisitor.SUPER);
            i++;
            i2 = -b;
        }
        long j = f8886[i2 & 1023];
        byte b2 = (byte) j;
        if (b2 == 0) {
            m5766(i, (int) (j >> 16), cArr);
            i += 2;
        } else if (b2 == 1) {
            m5763(cArr, i, (char) (j >> 32));
            i++;
        }
        m5763(cArr, i, (char) (j >> 48));
        return i + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public static int m5709(byte[] bArr, int i, byte b) {
        int i2 = b;
        if (b < 0) {
            m5683(bArr, i, (byte) 45);
            i++;
            i2 = -b;
        }
        int i3 = f8887[i2 & 1023];
        byte b2 = (byte) i3;
        if (b2 == 0) {
            m5761(bArr, i, (short) (i3 >> 8));
            i += 2;
        } else if (b2 == 1) {
            m5683(bArr, i, (byte) (i3 >> 16));
            i++;
        }
        m5683(bArr, i, (byte) (i3 >> 24));
        return i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5710(char[] r6, int r7, int r8, int r9, int r10) {
        /*
            if (r8 >= 0) goto Lb
            int r0 = r7 + 1
            r1 = 45
            r6[r7] = r1
            int r8 = -r8
        L9:
            r7 = r0
            goto L16
        Lb:
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r8 <= r0) goto L16
            int r0 = r7 + 1
            r1 = 43
            r6[r7] = r1
            goto L9
        L16:
            long r0 = (long) r8
            r2 = 1374389535(0x51eb851f, double:6.790386532E-315)
            long r0 = r0 * r2
            r2 = 37
            long r0 = r0 >> r2
            int r0 = (int) r0
            int r1 = r0 * 100
            int r1 = r8 - r1
            if (r8 < 0) goto L2f
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r8 >= r2) goto L2f
            m5754(r7, r0, r6)
            int r7 = r7 + 2
            goto L34
        L2f:
            long r2 = (long) r0
            int r7 = m5752(r6, r7, r2)
        L34:
            r8 = r9 & 127(0x7f, float:1.78E-43)
            int[] r9 = com.alibaba.fastjson2.util.AbstractC2849.f8889
            r8 = r9[r8]
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r8
            long r2 = (long) r0
            r0 = 48
            long r2 = r2 << r0
            r4 = 193273528320(0x2d00000000, double:9.54898105934E-313)
            long r2 = r2 | r4
            r0 = r1 & 127(0x7f, float:1.78E-43)
            r0 = r9[r0]
            long r0 = (long) r0
            long r0 = r0 | r2
            m5747(r6, r7, r0)
            int r0 = r7 + 4
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r1
            long r1 = (long) r8
            r8 = 16
            long r1 = r1 >> r8
            r3 = 2949120(0x2d0000, double:1.457059E-317)
            long r1 = r1 | r3
            r8 = r10 & 127(0x7f, float:1.78E-43)
            r8 = r9[r8]
            long r8 = (long) r8
            r10 = 32
            long r8 = r8 << r10
            long r8 = r8 | r1
            m5747(r6, r0, r8)
            int r7 = r7 + 8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2849.m5710(char[], int, int, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5711(byte[] r4, int r5, int r6, int r7, int r8) {
        /*
            if (r6 >= 0) goto Lb
            int r0 = r5 + 1
            r1 = 45
            r4[r5] = r1
            int r6 = -r6
        L9:
            r5 = r0
            goto L16
        Lb:
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r6 <= r0) goto L16
            int r0 = r5 + 1
            r1 = 43
            r4[r5] = r1
            goto L9
        L16:
            long r0 = (long) r6
            r2 = 1374389535(0x51eb851f, double:6.790386532E-315)
            long r0 = r0 * r2
            r2 = 37
            long r0 = r0 >> r2
            int r0 = (int) r0
            int r1 = r0 * 100
            int r1 = r6 - r1
            if (r6 < 0) goto L2f
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r6 >= r2) goto L2f
            m5755(r5, r4, r0)
            int r5 = r5 + 2
            goto L34
        L2f:
            long r2 = (long) r0
            int r5 = m5753(r2, r4, r5)
        L34:
            short r6 = m5742(r1)
            long r0 = (long) r6
            r2 = 49478026199040(0x2d00002d0000, double:2.4445392968979E-310)
            long r0 = r0 | r2
            short r6 = m5742(r7)
            long r6 = (long) r6
            r2 = 24
            long r6 = r6 << r2
            long r6 = r6 | r0
            short r8 = m5742(r8)
            long r0 = (long) r8
            r8 = 48
            long r0 = r0 << r8
            long r6 = r6 | r0
            m5748(r6, r4, r5)
            int r5 = r5 + 8
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2849.m5711(byte[], int, int, int, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static int m5712(int i, byte[] bArr, int i2) {
        int i3 = (int) ((((long) i2) * 1374389535) >> 37);
        int i4 = i2 - (i3 * 100);
        short[] sArr = f8888;
        int iReverseBytes = (sArr[i4 & 127] << 16) | sArr[i3 & 127];
        if (AbstractC2854.f8931) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        AbstractC2854.f8921.putInt(bArr, AbstractC2854.f8920 + ((long) i), iReverseBytes);
        return i + 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static int m5713(int i, int i2, char[] cArr) {
        int i3 = (int) ((((long) i2) * 1374389535) >> 37);
        int[] iArr = f8889;
        long jReverseBytes = (((long) iArr[(i2 - (i3 * 100)) & 127]) << 32) | iArr[i3 & 127];
        if (AbstractC2854.f8931) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        m5746(cArr, i, jReverseBytes);
        return i + 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public static int m5714(int i, int i2, char[] cArr, int i3) {
        int i4 = (int) ((((long) i2) * 1374389535) >> 37);
        int[] iArr = f8889;
        long jReverseBytes = (((long) iArr[(i2 - (i4 * 100)) & 127]) << 32) | ((long) iArr[i4 & 127]);
        int i5 = (int) ((((long) i3) * 1374389535) >> 37);
        long jReverseBytes2 = ((long) iArr[i5 & 127]) | (((long) iArr[(i3 - (i5 * 100)) & 127]) << 32);
        if (AbstractC2854.f8931) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
        }
        long j = jReverseBytes;
        Unsafe unsafe = AbstractC2854.f8921;
        long j2 = AbstractC2854.f8919;
        long j3 = ((long) i) << 1;
        unsafe.putLong(cArr, j2 + j3, j);
        unsafe.putLong(cArr, j2 + j3 + 8, jReverseBytes2);
        return i + 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public static int m5715(int i, byte[] bArr, int i2, int i3) {
        int i4 = (int) ((((long) i2) * 1374389535) >> 37);
        int i5 = (int) ((((long) i3) * 1374389535) >> 37);
        short[] sArr = f8888;
        long jReverseBytes = (((long) sArr[(i3 - (i5 * 100)) & 127]) << 48) | ((long) ((sArr[(i2 - (i4 * 100)) & 127] << 16) | sArr[i4 & 127])) | (((long) sArr[i5 & 127]) << 32);
        if (AbstractC2854.f8931) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        AbstractC2854.f8921.putLong(bArr, AbstractC2854.f8920 + ((long) i), jReverseBytes);
        return i + 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public static int m5716(long j, byte[] bArr, int i) {
        int iM5712;
        if (j < 0) {
            if (j == Long.MIN_VALUE) {
                byte[] bArr2 = f8890;
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                return i + bArr2.length;
            }
            j = -j;
            m5683(bArr, i, (byte) 45);
            i++;
        }
        if (j <= 2147483647L) {
            return m5753((int) j, bArr, i);
        }
        AbstractC2827.f8806.getClass();
        long jM5677 = C2828.m5677(j, 7555786372591432342L) >> 12;
        int i2 = (int) (j - (jM5677 * 10000));
        long jM56772 = C2828.m5677(jM5677, 1844674407370956L);
        int i3 = (int) (jM5677 - (jM56772 * 10000));
        if (jM56772 < 10000) {
            int i4 = (int) jM56772;
            return m5715(i4 < 1000 ? m5750(i, bArr, i4) : m5712(i, bArr, i4), bArr, i3, i2);
        }
        long jM56773 = C2828.m5677(jM56772, 1844674407370956L);
        int i5 = (int) (jM56772 - (jM56773 * 10000));
        if (jM56773 >= 10000) {
            long jM56774 = C2828.m5677(jM56773, 1844674407370956L);
            return m5715(m5715(m5750(i, bArr, (int) jM56774), bArr, (int) (jM56773 - (10000 * jM56774)), i5), bArr, i3, i2);
        }
        int i6 = (int) jM56773;
        if (i6 < 1000) {
            iM5712 = m5712(m5750(i, bArr, i6), bArr, i5);
        } else {
            m5715(i, bArr, i6, i5);
            iM5712 = i + 8;
        }
        return m5715(iM5712, bArr, i3, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public static int m5717(char[] cArr, int i, long j) {
        int iM5713;
        if (j < 0) {
            if (j == Long.MIN_VALUE) {
                char[] cArr2 = f8891;
                System.arraycopy(cArr2, 0, cArr, i, cArr2.length);
                return i + cArr2.length;
            }
            j = -j;
            m5763(cArr, i, SignatureVisitor.SUPER);
            i++;
        }
        if (j <= 2147483647L) {
            return m5752(cArr, i, (int) j);
        }
        AbstractC2827.f8806.getClass();
        long jM5677 = C2828.m5677(j, 7555786372591432342L) >> 12;
        int i2 = (int) (j - (jM5677 * 10000));
        long jM56772 = C2828.m5677(jM5677, 1844674407370956L);
        int i3 = (int) (jM5677 - (jM56772 * 10000));
        if (jM56772 < 10000) {
            int i4 = (int) jM56772;
            return m5714(i4 < 1000 ? m5751(i, i4, cArr) : m5713(i, i4, cArr), i3, cArr, i2);
        }
        long jM56773 = C2828.m5677(jM56772, 1844674407370956L);
        int i5 = (int) (jM56772 - (jM56773 * 10000));
        if (jM56773 >= 10000) {
            long jM56774 = C2828.m5677(jM56773, 1844674407370956L);
            return m5714(m5714(m5751(i, (int) jM56774, cArr), (int) (jM56773 - (10000 * jM56774)), cArr, i5), i3, cArr, i2);
        }
        int i6 = (int) jM56773;
        if (i6 < 1000) {
            iM5713 = m5713(m5751(i, i6, cArr), i5, cArr);
        } else {
            m5714(i, i6, cArr, i5);
            iM5713 = i + 8;
        }
        return m5714(iM5713, i3, cArr, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public static void m5718(byte[] bArr, int i, int i2, int i3, int i4) {
        m5748((((long) m5742(i3)) << 24) | ((long) m5742(i2)) | 63771678212096L | (((long) m5742(i4)) << 48), bArr, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static void m5719(char[] cArr, int i, int i2, int i3, int i4) {
        m5754(i, i2, cArr);
        m5763(cArr, i + 2, ':');
        m5754(i + 3, i3, cArr);
        m5763(cArr, i + 5, ':');
        m5754(i + 6, i4, cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m5720(byte[] bArr, int i) {
        short sReverseBytes = AbstractC2854.f8921.getShort(bArr, AbstractC2854.f8920 + ((long) i));
        if (AbstractC2854.f8931) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        int i2 = sReverseBytes & 3855;
        if (((61680 & (i2 + 1542)) | ((sReverseBytes & 61680) - 12336)) != 0) {
            return -1;
        }
        return ((sReverseBytes & 15) * 10) + (i2 >> 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m5721(int i, char[] cArr) {
        int iReverseBytes = AbstractC2854.f8921.getInt(cArr, AbstractC2854.f8919 + (((long) i) << 1));
        if (AbstractC2854.f8931) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        int i2 = 983055 & iReverseBytes;
        if (((((-983056) & iReverseBytes) - 3145776) | ((393222 + i2) & 15728880)) != 0) {
            return -1;
        }
        return ((iReverseBytes & 15) * 10) + (i2 >> 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m5722(byte[] bArr, int i) {
        int i2 = AbstractC2854.f8921.getByte(bArr, AbstractC2854.f8920 + ((long) i)) - 48;
        if (i2 < 0 || i2 > 9) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m5723(int i, char[] cArr) {
        int i2 = AbstractC2854.f8921.getByte(cArr, AbstractC2854.f8919 + (((long) i) << 1)) - 48;
        if (i2 < 0 || i2 > 9) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m5724(int i, int i2, byte[] bArr, byte[] bArr2) {
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
    public static void m5725(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static int m5726(char[] cArr) {
        return AbstractC2854.f8921.getInt(cArr, AbstractC2854.f8919);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static int m5727(byte[] bArr, int i) {
        return AbstractC2854.f8921.getInt(bArr, AbstractC2854.f8920 + ((long) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static long m5728(byte[] bArr, int i) {
        long j = AbstractC2854.f8921.getLong(bArr, AbstractC2854.f8920 + ((long) i));
        return !AbstractC2854.f8931 ? j : Long.reverseBytes(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static long m5729(int i, char[] cArr) {
        return AbstractC2854.f8921.getLong(cArr, AbstractC2854.f8919 + (((long) i) << 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static long m5730(byte[] bArr, int i) {
        long j = AbstractC2854.f8921.getLong(bArr, AbstractC2854.f8920 + ((long) i));
        return !AbstractC2854.f8931 ? Long.reverseBytes(j) : j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static long m5731(int i, char[] cArr) {
        long j = AbstractC2854.f8921.getLong(cArr, AbstractC2854.f8919 + (((long) i) << 1));
        return AbstractC2854.f8931 ? Long.reverseBytes(j) : j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m5732(int i, int i2, char[] cArr) {
        int i3;
        boolean z = i < 0;
        if (!z) {
            i = -i;
        }
        while (i <= -100) {
            int i4 = i / 100;
            i2 -= 2;
            m5754(i2, (i4 * 100) - i, cArr);
            i = i4;
        }
        if (i < -9) {
            i3 = i2 - 2;
            m5754(i3, -i, cArr);
        } else {
            i3 = i2 - 1;
            m5763(cArr, i3, (char) (48 - i));
        }
        if (z) {
            m5763(cArr, i3 - 1, SignatureVisitor.SUPER);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static char m5733(byte[] bArr, int i) {
        return AbstractC2854.f8921.getChar(bArr, AbstractC2854.f8920 + (((long) i) << 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static int m5734(int i, char[] cArr) {
        int i2 = AbstractC2854.f8921.getInt(cArr, AbstractC2854.f8919 + (((long) i) << 1));
        return AbstractC2854.f8931 ? Integer.reverseBytes(i2) : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int m5735(byte[] bArr, int i) {
        int i2 = AbstractC2854.f8921.getInt(bArr, AbstractC2854.f8920 + ((long) i));
        return AbstractC2854.f8931 ? Integer.reverseBytes(i2) : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m5736(int i, byte[] bArr, int i2) {
        int i3;
        boolean z = i < 0;
        if (!z) {
            i = -i;
        }
        while (i <= -100) {
            int i4 = i / 100;
            i2 -= 2;
            m5755(i2, bArr, (i4 * 100) - i);
            i = i4;
        }
        if (i < -9) {
            i3 = i2 - 2;
            m5755(i3, bArr, -i);
        } else {
            i3 = i2 - 1;
            m5683(bArr, i3, (byte) (48 - i));
        }
        if (z) {
            m5683(bArr, i3 - 1, (byte) 45);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static int m5737(byte[] bArr, int i) {
        int i2 = AbstractC2854.f8921.getInt(bArr, AbstractC2854.f8920 + ((long) i));
        return !AbstractC2854.f8931 ? Integer.reverseBytes(i2) : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m5738(byte[] bArr, int i) {
        int iM5735 = m5735(bArr, i);
        int i2 = 252645135 & iM5735;
        if ((((-252645136) & (101058054 + i2)) | ((iM5735 & (-252645136)) - 808464432)) != 0) {
            return -1;
        }
        return ((((((iM5735 & 15) * 10) + ((i2 >> 8) & 15)) * 10) + ((i2 >> 16) & 15)) * 10) + (i2 >> 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m5739(int i, char[] cArr) {
        long jM5731 = m5731(i, cArr);
        long j = 4222189076152335L & jM5731;
        if (((((-4222189076152336L) & jM5731) - 13511005043687472L) | ((1688875630460934L + j) & 67555025218437360L)) != 0) {
            return -1;
        }
        return (int) (((((((jM5731 & 15) * 10) + ((j >> 16) & 15)) * 10) + (15 & (j >> 32))) * 10) + (j >> 48));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static byte m5740(byte[] bArr, int i) {
        return AbstractC2854.f8921.getByte(bArr, AbstractC2854.f8920 + ((long) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static char m5741(int i, char[] cArr) {
        return AbstractC2854.f8921.getChar(cArr, AbstractC2854.f8919 + (((long) i) << 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static short m5742(int i) {
        return f8888[i & 127];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m5743(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        byte[] bArr3;
        byte[] bArr4;
        int i4 = 0;
        int i5 = i2;
        while (i4 < i) {
            char c = AbstractC2854.f8921.getChar(bArr, AbstractC2854.f8920 + ((long) i4));
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
                bArr4[i5] = (byte) ((c >> '\f') | Opcodes.SHL_INT_LIT8);
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
                m5758(bArr3, i6, i3, c, bArr4, i5);
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
    public static void m5744(byte[] bArr, int i) {
        AbstractC2854.f8921.putInt(bArr, AbstractC2854.f8920 + ((long) i), f8879);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static void m5745(int i, char[] cArr) {
        AbstractC2854.f8921.putLong(cArr, AbstractC2854.f8919 + (((long) i) << 1), f8878);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static void m5746(char[] cArr, int i, long j) {
        AbstractC2854.f8921.putLong(cArr, AbstractC2854.f8919 + (((long) i) << 1), j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static void m5747(char[] cArr, int i, long j) {
        Unsafe unsafe = AbstractC2854.f8921;
        long j2 = AbstractC2854.f8919 + (((long) i) << 1);
        if (AbstractC2854.f8931) {
            j = Long.reverseBytes(j);
        }
        unsafe.putLong(cArr, j2, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static void m5748(long j, byte[] bArr, int i) {
        Unsafe unsafe = AbstractC2854.f8921;
        long j2 = AbstractC2854.f8920 + ((long) i);
        if (AbstractC2854.f8931) {
            j = Long.reverseBytes(j);
        }
        unsafe.putLong(bArr, j2, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static void m5749(long j, byte[] bArr, int i) {
        Unsafe unsafe = AbstractC2854.f8921;
        long j2 = AbstractC2854.f8920 + ((long) i);
        if (true != AbstractC2854.f8931) {
            j = Long.reverseBytes(j);
        }
        unsafe.putLong(bArr, j2, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static int m5750(int i, byte[] bArr, int i2) {
        int i3 = f8887[i2 & 1023];
        byte b = (byte) i3;
        AbstractC2854.f8921.putInt(bArr, AbstractC2854.f8920 + ((long) i), i3 >> ((b + 1) << 3));
        return (i + 3) - b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static int m5751(int i, int i2, char[] cArr) {
        long j = f8886[i2 & 1023];
        int i3 = (int) j;
        AbstractC2854.f8921.putLong(cArr, AbstractC2854.f8919 + (((long) i) << 1), j >> ((((short) i3) + 1) << 4));
        return (i + 3) - ((byte) i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static int m5752(char[] cArr, int i, long j) {
        if (j < 0) {
            j = -j;
            m5763(cArr, i, SignatureVisitor.SUPER);
            i++;
        }
        if (j < 10000) {
            int i2 = (int) j;
            return i2 < 1000 ? m5751(i, i2, cArr) : m5713(i, i2, cArr);
        }
        long j2 = (int) ((j * 1759218605) >> 44);
        int i3 = (int) (j - (j2 * 10000));
        if (j2 < 10000) {
            int i4 = (int) j2;
            return i4 < 1000 ? m5713(m5751(i, i4, cArr), i3, cArr) : m5714(i, i4, cArr, i3);
        }
        long j3 = (int) ((1759218605 * j2) >> 44);
        return m5714(m5751(i, (int) j3, cArr), (int) (j2 - (j3 * 10000)), cArr, i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static int m5753(long j, byte[] bArr, int i) {
        if (j < 0) {
            j = -j;
            m5683(bArr, i, (byte) 45);
            i++;
        }
        if (j < 10000) {
            int i2 = (int) j;
            return i2 < 1000 ? m5750(i, bArr, i2) : m5712(i, bArr, i2);
        }
        long j2 = (int) ((j * 1759218605) >> 44);
        int i3 = (int) (j - (j2 * 10000));
        if (j2 < 10000) {
            int i4 = (int) j2;
            return i4 < 1000 ? m5712(m5750(i, bArr, i4), bArr, i3) : m5715(i, bArr, i4, i3);
        }
        long j3 = (int) ((1759218605 * j2) >> 44);
        return m5715(m5750(i, bArr, (int) j3), bArr, (int) (j2 - (j3 * 10000)), i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static void m5754(int i, int i2, char[] cArr) {
        m5766(i, f8889[i2 & 127], cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static void m5755(int i, byte[] bArr, int i2) {
        m5761(bArr, i, f8888[i2 & 127]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static int m5756(int i) {
        int i2 = 0;
        while (i > f8895[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static void m5757(byte[] bArr, int i, short s) {
        AbstractC2854.f8921.putShort(bArr, AbstractC2854.f8920 + ((long) i), s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static void m5758(byte[] bArr, int i, int i2, char c, byte[] bArr2, int i3) {
        char c2;
        if (c > 56319 || i2 - i < 1 || (c2 = AbstractC2854.f8921.getChar(bArr, AbstractC2854.f8920 + ((long) i))) < 56320 || c2 > 57343) {
            C0276.m850(AbstractC6183.m11588(i, "malformed input off : "));
            return;
        }
        int i4 = ((c << '\n') + c2) - 56613888;
        bArr2[i3] = (byte) ((i4 >> 18) | 240);
        bArr2[i3 + 1] = (byte) (((i4 >> 12) & 63) | 128);
        bArr2[i3 + 2] = (byte) (((i4 >> 6) & 63) | 128);
        bArr2[i3 + 3] = (byte) ((i4 & 63) | 128);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static int m5759(long j) {
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
    public static void m5760(byte[] bArr, int i, short s) {
        Unsafe unsafe = AbstractC2854.f8921;
        long j = AbstractC2854.f8920 + ((long) i);
        if (true != AbstractC2854.f8931) {
            s = Short.reverseBytes(s);
        }
        unsafe.putShort(bArr, j, s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static void m5761(byte[] bArr, int i, short s) {
        Unsafe unsafe = AbstractC2854.f8921;
        long j = AbstractC2854.f8920 + ((long) i);
        if (AbstractC2854.f8931) {
            s = Short.reverseBytes(s);
        }
        unsafe.putShort(bArr, j, s);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static void m5762(int i, byte[] bArr, int i2) {
        if (!AbstractC2854.f8931) {
            i2 = Integer.reverseBytes(i2);
        }
        AbstractC2854.f8921.putInt(bArr, AbstractC2854.f8920 + ((long) i), i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m5763(char[] cArr, int i, char c) {
        AbstractC2854.f8921.putChar(cArr, AbstractC2854.f8919 + (((long) i) << 1), c);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static void m5764(int i, int i2, char[] cArr) {
        AbstractC2854.f8921.putInt(cArr, AbstractC2854.f8919 + (((long) i) << 1), i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static void m5765(int i, byte[] bArr, int i2) {
        AbstractC2854.f8921.putInt(bArr, AbstractC2854.f8920 + ((long) i), i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static void m5766(int i, int i2, char[] cArr) {
        if (AbstractC2854.f8931) {
            i2 = Integer.reverseBytes(i2);
        }
        AbstractC2854.f8921.putInt(cArr, AbstractC2854.f8919 + (((long) i) << 1), i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static void m5767(int i, byte[] bArr, int i2) {
        if (AbstractC2854.f8931) {
            i2 = Integer.reverseBytes(i2);
        }
        AbstractC2854.f8921.putInt(bArr, AbstractC2854.f8920 + ((long) i), i2);
    }
}
