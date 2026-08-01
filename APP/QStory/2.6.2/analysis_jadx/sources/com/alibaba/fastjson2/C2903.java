package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.compose.foundation.text.C0966;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.reader.C2706;
import com.alibaba.fastjson2.reader.C2707;
import com.alibaba.fastjson2.reader.C2710;
import com.alibaba.fastjson2.reader.C2728;
import com.alibaba.fastjson2.reader.C2795;
import com.alibaba.fastjson2.reader.C2801;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiFunction;
import lin.xposed.hook.javaplugin.C5553;
import p007.AbstractC6136;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2903 extends AbstractC2898 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final byte[] f9227;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static Charset f9229;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f9231;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f9232;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f9233;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public byte f9234;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C2910 f9235;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public byte[] f9236;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public byte f9237;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f9238;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int f9239;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final byte[] f9240;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public byte f9241;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f9242;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public long[] f9243;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static final long f9230 = AbstractC2853.f8919.arrayBaseOffset(byte[].class);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static final byte[] f9228 = InterfaceC2911.m6297("Asia/Shanghai");

    static {
        byte[] bArr = new byte[256];
        for (int i = -16; i < 47; i++) {
            bArr[i & Opcodes.CONST_METHOD_TYPE] = 1;
        }
        for (int i2 = 48; i2 < 63; i2++) {
            bArr[i2 & Opcodes.CONST_METHOD_TYPE] = 2;
        }
        for (int i3 = 64; i3 < 71; i3++) {
            bArr[i3 & Opcodes.CONST_METHOD_TYPE] = 3;
        }
        for (int i4 = -40; i4 < -17; i4++) {
            bArr[i4 & Opcodes.CONST_METHOD_TYPE] = 1;
        }
        for (int i5 = -56; i5 < -41; i5++) {
            bArr[i5 & Opcodes.CONST_METHOD_TYPE] = 2;
        }
        for (int i6 = -64; i6 < -57; i6++) {
            bArr[i6 & Opcodes.CONST_METHOD_TYPE] = 3;
        }
        for (int i7 = 73; i7 < 120; i7++) {
            bArr[i7 & Opcodes.CONST_METHOD_TYPE] = (byte) (i7 - 72);
        }
        bArr[148] = 1;
        bArr[73] = 1;
        bArr[175] = 1;
        bArr[176] = 1;
        bArr[177] = 1;
        bArr[189] = 2;
        bArr[188] = 3;
        bArr[72] = 5;
        bArr[172] = 5;
        bArr[183] = 5;
        bArr[191] = 5;
        bArr[190] = 9;
        bArr[171] = 9;
        bArr[181] = 9;
        bArr[121] = -1;
        bArr[122] = -1;
        bArr[123] = -1;
        bArr[124] = -1;
        bArr[125] = -1;
        f9227 = bArr;
    }

    public C2903(int i, C2942 c2942, byte[] bArr) {
        super(c2942, true);
        this.f9240 = bArr;
        this.f9192 = 0;
        this.f9239 = i;
        C2910[] c2910Arr = AbstractC2932.f9297;
        this.f9235 = c2910Arr[System.identityHashCode(Thread.currentThread()) & (c2910Arr.length - 1)];
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰世哲子, reason: contains not printable characters */
    public static int m6221(int i, byte[] bArr, int i2) {
        return ((i2 + 48) << 8) + (bArr[i] & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲, reason: contains not printable characters */
    public static int m6222(int i, byte[] bArr, int i2) {
        return ((i2 + 60) << 16) + (AbstractC2848.m5653(bArr, i) & 65535);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰哲世子, reason: contains not printable characters */
    public static JSONException m6223(byte b) {
        return new JSONException("name not support input : " + InterfaceC2911.m6299(b));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰子世哲, reason: contains not printable characters */
    public static int m6224(int i, byte[] bArr, int i2) {
        return ((i2 - 68) << 16) + (AbstractC2848.m5653(bArr, i) & 65535);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰子哲世, reason: contains not printable characters */
    public static int m6225(int i, byte[] bArr, int i2) {
        return ((i2 - 56) << 8) + (bArr[i] & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲世兰子, reason: contains not printable characters */
    public static void m6226(int i, int i2) {
        if (i + 3 < i2) {
            return;
        }
        C0276.m849(AbstractC6136.m11559(i, i2, "offset overflow, offset ", ", end "));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲兰子世, reason: contains not printable characters */
    public static void m6227(int i, int i2) {
        if (i + 7 < i2) {
            return;
        }
        C0276.m849(AbstractC6136.m11559(i, i2, "offset overflow, offset ", ", end "));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = this.f9236;
        if (bArr == null || bArr.length >= 8388608) {
            return;
        }
        AbstractC2932.f9288.lazySet(this.f9235, bArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final String mo6055() {
        Charset charset;
        byte b = this.f9234;
        int i = this.f9238;
        if (b == -81) {
            return null;
        }
        if (i < 0) {
            throw null;
        }
        byte[] bArr = this.f9240;
        if (b == 121) {
            charset = StandardCharsets.ISO_8859_1;
        } else if (b < 73 || b > 120) {
            if (b == 122) {
                charset = StandardCharsets.UTF_8;
            } else if (b == 123) {
                charset = StandardCharsets.UTF_16;
            } else if (b == 124) {
                charset = StandardCharsets.UTF_16LE;
            } else {
                if (b != 125) {
                    throw m6223(b);
                }
                charset = StandardCharsets.UTF_16BE;
            }
        } else {
            if (AbstractC2853.f8921 != null) {
                return AbstractC2853.m5724(this.f9233, bArr, i);
            }
            BiFunction biFunction = AbstractC2853.f8920;
            if (biFunction != null) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, this.f9233, bArr2, 0, i);
                return (String) biFunction.apply(bArr2, (byte) 0);
            }
            charset = StandardCharsets.ISO_8859_1;
        }
        return new String(bArr, this.f9233, i, charset);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final String mo6058() {
        return mo6055();
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo6060() {
        byte[] bArr;
        long j;
        long j2;
        int i = this.f9233;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f9238;
            bArr = this.f9240;
            if (i3 < i4) {
                byte b = bArr[i];
                if (b >= 0 && i3 < 8 && (i3 != 0 || bArr[this.f9233] != 0)) {
                    if ((b != 95 && b != 45 && b != 32) || bArr[i + 1] == b) {
                        if (b >= 65 && b <= 90) {
                            b = (byte) (b + 32);
                        }
                        switch (i3) {
                            case 0:
                                j3 = b;
                                break;
                            case 1:
                                j = b << 8;
                                j2 = 255;
                                j3 = (j3 & j2) + j;
                                break;
                            case 2:
                                j = b << 16;
                                j2 = 65535;
                                j3 = (j3 & j2) + j;
                                break;
                            case 3:
                                j = b << 24;
                                j2 = 16777215;
                                j3 = (j3 & j2) + j;
                                break;
                            case 4:
                                j = ((long) b) << 32;
                                j2 = 4294967295L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 5:
                                j = ((long) b) << 40;
                                j2 = 1099511627775L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 6:
                                j = ((long) b) << 48;
                                j2 = 281474976710655L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 7:
                                j = ((long) b) << 56;
                                j2 = 72057594037927935L;
                                j3 = (j3 & j2) + j;
                                break;
                        }
                        i3++;
                    }
                    i++;
                }
            }
        }
        i = this.f9233;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = -3750763034362895579L;
        while (i2 < this.f9238) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                b2 = (byte) (b2 + 32);
            }
            if (b2 != 95 && b2 != 45 && b2 != 32) {
                j4 = (j4 ^ ((long) b2)) * 1099511628211L;
            }
            i2++;
            i = i5;
        }
        return j4;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final boolean mo6062() {
        this.f9194 = false;
        int i = this.f9192;
        this.f9192 = i + 1;
        byte b = this.f9240[i];
        if (b == -79) {
            return true;
        }
        if (b == -80) {
            return false;
        }
        return m6231(b);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final char mo6063() {
        int iMo6167;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -112) {
            this.f9192 = i + 1;
            iMo6167 = mo6167();
        } else {
            if (b == 73) {
                this.f9192 = i + 1;
                return (char) 0;
            }
            if (b <= 73 || b >= 120) {
                String strMo6139 = mo6139();
                if (strMo6139 == null || strMo6139.isEmpty()) {
                    return (char) 0;
                }
                return strMo6139.charAt(0);
            }
            this.f9192 = i + 2;
            iMo6167 = bArr[i + 1] & DefaultClassResolver.NAME;
        }
        return (char) iMo6167;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public final BigInteger mo6064() {
        int i = this.f9192;
        int i2 = i + 1;
        this.f9192 = i2;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -70) {
            return BigInteger.valueOf(mo6164());
        }
        if (b == -69) {
            int iMo6167 = mo6167();
            byte[] bArr2 = new byte[iMo6167];
            System.arraycopy(bArr, this.f9192, bArr2, 0, iMo6167);
            this.f9192 += iMo6167;
            return new BigInteger(bArr2);
        }
        if (b == -111) {
            int iMo61672 = mo6167();
            byte[] bArr3 = new byte[iMo61672];
            System.arraycopy(bArr, this.f9192, bArr3, 0, iMo61672);
            this.f9192 += iMo61672;
            return new BigInteger(bArr3);
        }
        if (b == -71) {
            int iMo61673 = mo6167();
            BigInteger bigIntegerMo6064 = mo6064();
            return (iMo61673 == 0 ? new BigDecimal(bigIntegerMo6064) : new BigDecimal(bigIntegerMo6064, iMo61673)).toBigInteger();
        }
        int i3 = this.f9239;
        if (b != 72) {
            if (b == 124) {
                int iMo61674 = mo6167();
                String str = new String(bArr, this.f9192, iMo61674, StandardCharsets.UTF_16LE);
                this.f9192 += iMo61674;
                return str.indexOf(46) == -1 ? new BigInteger(str) : AbstractC2866.m5868(str).toBigInteger();
            }
            if (b == 121) {
                int iMo61675 = mo6167();
                String str2 = new String(bArr, this.f9192, iMo61675, StandardCharsets.ISO_8859_1);
                this.f9192 += iMo61675;
                return str2.indexOf(46) == -1 ? new BigInteger(str2) : AbstractC2866.m5868(str2).toBigInteger();
            }
            if (b == 122) {
                int iMo61676 = mo6167();
                String str3 = new String(bArr, this.f9192, iMo61676, StandardCharsets.UTF_8);
                this.f9192 += iMo61676;
                return str3.indexOf(46) == -1 ? new BigInteger(str3) : AbstractC2866.m5868(str3).toBigInteger();
            }
            switch (b) {
                case -81:
                    return null;
                case -80:
                case -78:
                    return BigInteger.ZERO;
                case -79:
                case -77:
                    return BigInteger.ONE;
                case -76:
                    return BigInteger.valueOf(mo6164());
                case -75:
                    m6227(i2, i3);
                    long jM5685 = AbstractC2848.m5685(bArr, i2);
                    this.f9192 += 8;
                    return BigInteger.valueOf((long) Double.longBitsToDouble(jM5685));
                case -74:
                    return BigInteger.valueOf(mo6167());
                case -73:
                    m6226(i2, i3);
                    int iM5692 = AbstractC2848.m5692(bArr, i2);
                    this.f9192 += 4;
                    return BigInteger.valueOf((long) Float.intBitsToFloat(iM5692));
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9192 = i + 3;
                            return BigInteger.valueOf(i4);
                        case -67:
                            this.f9192 = i + 2;
                            return BigInteger.valueOf(bArr[i2]);
                        case -66:
                            m6227(i2, i3);
                            long jM56852 = AbstractC2848.m5685(bArr, i2);
                            this.f9192 += 8;
                            return BigInteger.valueOf(jM56852);
                        case -65:
                            break;
                        default:
                            if (InterfaceC2911.m6303(b)) {
                                return BigInteger.valueOf(b);
                            }
                            if (InterfaceC2911.m6298(b)) {
                                this.f9192 = this.f9192 + 1;
                                return BigInteger.valueOf(m6225(r0, bArr, b));
                            }
                            if (InterfaceC2911.m6295(b)) {
                                int i5 = this.f9192;
                                if (i5 + 1 < i3) {
                                    int iM6224 = m6224(i5, bArr, b);
                                    this.f9192 += 2;
                                    return BigInteger.valueOf(iM6224);
                                }
                            }
                            if (InterfaceC2911.m6301(b)) {
                                return BigInteger.valueOf(b + 32);
                            }
                            if (InterfaceC2911.m6300(b)) {
                                this.f9192 = this.f9192 + 1;
                                return BigInteger.valueOf(m6221(r0, bArr, b));
                            }
                            if (InterfaceC2911.m6296(b)) {
                                int i6 = this.f9192;
                                if (i6 + 1 < i3) {
                                    int iM6222 = m6222(i6, bArr, b);
                                    this.f9192 += 2;
                                    return BigInteger.valueOf(iM6222);
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6223(b);
                            }
                            int i7 = b - 73;
                            String strM6230 = m6230(i7);
                            this.f9192 += i7;
                            return new BigInteger(strM6230);
                    }
                    break;
            }
        }
        m6226(i2, i3);
        int iM56922 = AbstractC2848.m5692(bArr, i2);
        this.f9192 += 4;
        return BigInteger.valueOf(iM56922);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public final BigDecimal mo6065() {
        int i = this.f9192;
        int i2 = i + 1;
        this.f9192 = i2;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        int i3 = this.f9239;
        if (b == -71) {
            int iMo6167 = mo6167();
            int i4 = this.f9192;
            byte b2 = bArr[i4];
            if (b2 == -70) {
                this.f9192 = i4 + 1;
                return BigDecimal.valueOf(mo6164(), iMo6167);
            }
            if (b2 == 72) {
                m6226(i4 + 1, i3);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(AbstractC2848.m5692(bArr, r1), iMo6167);
                this.f9192 += 5;
                return bigDecimalValueOf;
            }
            if (b2 != -66) {
                BigInteger bigIntegerMo6064 = mo6064();
                return iMo6167 == 0 ? new BigDecimal(bigIntegerMo6064) : new BigDecimal(bigIntegerMo6064, iMo6167);
            }
            int i5 = i4 + 1;
            m6227(i5, i3);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(AbstractC2848.m5685(bArr, i5), iMo6167);
            this.f9192 += 9;
            return bigDecimalValueOf2;
        }
        if (b == -72) {
            return BigDecimal.valueOf(mo6164());
        }
        if (b != 72) {
            if (b == 124) {
                int iMo61672 = mo6167();
                String str = new String(bArr, this.f9192, iMo61672, StandardCharsets.UTF_16LE);
                this.f9192 += iMo61672;
                return AbstractC2866.m5868(str);
            }
            if (b == 121) {
                int iMo61673 = mo6167();
                String str2 = new String(bArr, this.f9192, iMo61673, StandardCharsets.ISO_8859_1);
                this.f9192 += iMo61673;
                return AbstractC2866.m5868(str2);
            }
            if (b == 122) {
                int iMo61674 = mo6167();
                String str3 = new String(bArr, this.f9192, iMo61674, StandardCharsets.UTF_8);
                this.f9192 += iMo61674;
                return AbstractC2866.m5868(str3);
            }
            switch (b) {
                case -81:
                    return null;
                case -80:
                case -78:
                    return BigDecimal.ZERO;
                case -79:
                case -77:
                    return BigDecimal.ONE;
                case -76:
                    return BigDecimal.valueOf(mo6164());
                case -75:
                    m6227(i2, i3);
                    long jM5685 = AbstractC2848.m5685(bArr, i2);
                    this.f9192 += 8;
                    return BigDecimal.valueOf((long) Double.longBitsToDouble(jM5685));
                case -74:
                    return BigDecimal.valueOf(mo6167());
                case -73:
                    m6226(i2, i3);
                    int iM5692 = AbstractC2848.m5692(bArr, i2);
                    this.f9192 += 4;
                    return BigDecimal.valueOf((long) Float.intBitsToFloat(iM5692));
                default:
                    switch (b) {
                        case -69:
                            return new BigDecimal(mo6064());
                        case -68:
                            int i6 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9192 = i + 3;
                            return BigDecimal.valueOf(i6);
                        case -67:
                            this.f9192 = i + 2;
                            return BigDecimal.valueOf(bArr[i2]);
                        case -66:
                            m6227(i2, i3);
                            long jM56852 = AbstractC2848.m5685(bArr, i2);
                            this.f9192 += 8;
                            return BigDecimal.valueOf(jM56852);
                        case -65:
                            break;
                        default:
                            if (InterfaceC2911.m6303(b)) {
                                return BigDecimal.valueOf(b);
                            }
                            if (InterfaceC2911.m6298(b)) {
                                this.f9192 = this.f9192 + 1;
                                return BigDecimal.valueOf(m6225(r0, bArr, b));
                            }
                            if (InterfaceC2911.m6295(b)) {
                                int i7 = this.f9192;
                                if (i7 + 1 < i3) {
                                    int iM6224 = m6224(i7, bArr, b);
                                    this.f9192 += 2;
                                    return BigDecimal.valueOf(iM6224);
                                }
                            }
                            if (InterfaceC2911.m6301(b)) {
                                return BigDecimal.valueOf(b + 32);
                            }
                            if (InterfaceC2911.m6300(b)) {
                                this.f9192 = this.f9192 + 1;
                                return BigDecimal.valueOf(m6221(r0, bArr, b));
                            }
                            if (InterfaceC2911.m6296(b)) {
                                int i8 = this.f9192;
                                if (i8 + 1 < i3) {
                                    int iM6222 = m6222(i8, bArr, b);
                                    this.f9192 += 2;
                                    return BigDecimal.valueOf(iM6222);
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6223(b);
                            }
                            int i9 = b - 73;
                            String strM6230 = m6230(i9);
                            this.f9192 += i9;
                            return AbstractC2866.m5868(strM6230);
                    }
                    break;
            }
        }
        m6226(i2, i3);
        int iM56922 = AbstractC2848.m5692(bArr, i2);
        this.f9192 += 4;
        return BigDecimal.valueOf(iM56922);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public final Boolean mo6066() {
        int i = this.f9192;
        this.f9192 = i + 1;
        byte b = this.f9240[i];
        if (b == -81) {
            return null;
        }
        return b == -79 ? Boolean.TRUE : b == -80 ? Boolean.FALSE : Boolean.valueOf(m6231(b));
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public final byte[] mo6067() {
        int i = this.f9192;
        this.f9192 = i + 1;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b != -111) {
            throw m6223(b);
        }
        int iM6233 = m6233();
        byte[] bArr2 = new byte[iM6233];
        System.arraycopy(bArr, this.f9192, bArr2, 0, iM6233);
        this.f9192 += iM6233;
        return bArr2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏 */
    public final float mo6068() {
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != -73) {
            return m6234();
        }
        int i2 = i + 1;
        m6226(i2, this.f9239);
        int iM5692 = AbstractC2848.m5692(bArr, i2);
        this.f9192 = i + 5;
        return Float.intBitsToFloat(iM5692);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪 */
    public final byte[] mo6069() {
        String strMo6139 = mo6139();
        int length = strMo6139.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char cCharAt = strMo6139.charAt(i2);
            char cCharAt2 = strMo6139.charAt(i2 + 1);
            char c = '7';
            int i3 = cCharAt - (cCharAt <= '9' ? '0' : '7');
            if (cCharAt2 <= '9') {
                c = '0';
            }
            bArr[i] = (byte) ((cCharAt2 - c) | (i3 << 4));
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public final Float mo6071() {
        int i = this.f9192;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -73) {
            int i2 = (bArr[i + 4] & DefaultClassResolver.NAME) + ((bArr[i + 3] & DefaultClassResolver.NAME) << 8) + ((bArr[i + 2] & DefaultClassResolver.NAME) << 16) + (bArr[i + 1] << 24);
            this.f9192 = i + 5;
            return Float.valueOf(Float.intBitsToFloat(i2));
        }
        if (b != -81) {
            return Float.valueOf(m6234());
        }
        this.f9192 = i + 1;
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public final Instant mo6072() {
        int i = this.f9192;
        int i2 = i + 1;
        this.f9192 = i2;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        int i3 = this.f9239;
        if (b != -66) {
            switch (b) {
                case -85:
                    break;
                case -84:
                    m6226(i2, i3);
                    long jM5692 = AbstractC2848.m5692(bArr, i2);
                    this.f9192 += 4;
                    return Instant.ofEpochSecond(jM5692, 0L);
                case -83:
                    m6226(i2, i3);
                    long jM56922 = AbstractC2848.m5692(bArr, i2);
                    this.f9192 += 4;
                    return Instant.ofEpochSecond(jM56922 * 60, 0L);
                case -82:
                    return Instant.ofEpochSecond(mo6164(), mo6167());
                default:
                    C5553.m10825();
                    return null;
            }
        }
        m6227(i2, i3);
        long jM5685 = AbstractC2848.m5685(bArr, i2);
        this.f9192 += 8;
        return Instant.ofEpochMilli(jM5685);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final boolean mo6073() {
        int i = this.f9192;
        if (this.f9240[i] != -81) {
            return false;
        }
        this.f9192 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public final void mo6074(Map map, long j) {
        Object objMo6149;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != -90) {
            C0276.m849("object not support input ".concat(m6237(this.f9237)));
            return;
        }
        this.f9192 = i + 1;
        long j2 = j | this.f9199.f9318;
        while (true) {
            int i2 = this.f9192;
            byte b = bArr[i2];
            if (b == -91) {
                this.f9192 = i2 + 1;
                return;
            }
            Object objMo6080 = b >= 73 ? mo6080() : mo6078();
            if (mo6134()) {
                String strMo6144 = mo6144();
                if ("..".equals(strMo6144)) {
                    map.put(objMo6080, map);
                } else {
                    m6107(map, objMo6080, AbstractC2921.m6320(strMo6144));
                    map.put(objMo6080, null);
                }
            } else {
                byte b2 = bArr[this.f9192];
                if (b2 >= 73 && b2 <= 126) {
                    objMo6149 = mo6139();
                } else if (InterfaceC2911.m6303(b2)) {
                    this.f9192++;
                    objMo6149 = Integer.valueOf(b2);
                } else if (b2 == -79) {
                    this.f9192++;
                    objMo6149 = Boolean.TRUE;
                } else if (b2 == -80) {
                    this.f9192++;
                    objMo6149 = Boolean.FALSE;
                } else {
                    objMo6149 = b2 == -90 ? mo6149() : mo6078();
                }
                if (objMo6149 != null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j2) == 0) {
                    map.put(objMo6080, objMo6149);
                }
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public final List mo6076(Type type) {
        if (mo6087()) {
            return null;
        }
        if (this.f9240[this.f9192] == -110) {
            Object objMo6078 = mo6078();
            if (objMo6078 instanceof List) {
                return (List) objMo6078;
            }
            if (objMo6078 instanceof Collection) {
                return new JSONArray((Collection<?>) objMo6078);
            }
            C0276.m849(AbstractC2442.m4571(objMo6078, new StringBuilder("not support class ")));
            return null;
        }
        int iMo6187 = mo6187();
        JSONArray jSONArray = new JSONArray(iMo6187);
        for (int i = 0; i < iMo6187; i++) {
            jSONArray.add(mo6093(type));
        }
        return jSONArray;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲 */
    public final Object mo6078() {
        Object objMo6080;
        String str;
        String str2;
        Object objMo6149;
        String str3;
        String str4;
        int i = 0;
        int i2 = this.f9192;
        byte[] bArr = this.f9240;
        String str5 = "/";
        if (i2 >= bArr.length) {
            throw new JSONException("readAny overflow : " + this.f9192 + "/" + bArr.length);
        }
        int i3 = i2 + 1;
        this.f9192 = i3;
        byte b = bArr[i2];
        this.f9237 = b;
        int i4 = this.f9239;
        if (b == 72) {
            m6226(i3, i4);
            int iM5692 = AbstractC2848.m5692(bArr, i3);
            this.f9192 += 4;
            return Integer.valueOf(iM5692);
        }
        String str6 = ", offset ";
        C2942 c2942 = this.f9199;
        switch (b) {
            case -112:
                return Character.valueOf((char) mo6167());
            case -111:
                int iM6233 = m6233();
                int i5 = this.f9192;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i5 + iM6233);
                this.f9192 += iM6233;
                return bArrCopyOfRange;
            case -110:
                long jMo6194 = mo6194();
                c2942.getClass();
                if ((c2942.f9318 & JSONReader$Feature.SupportAutoType.mask) == 0) {
                    if (mo6131()) {
                        return mo6149();
                    }
                    if (mo6123()) {
                        return mo6079();
                    }
                    throw new JSONException("autoType not support , offset " + this.f9192 + "/" + bArr.length);
                }
                InterfaceC2787 interfaceC2787M5585 = ((C2801) c2942.f9316).m5585(jMo6194);
                if (interfaceC2787M5585 == null) {
                    String strMo6055 = mo6055();
                    InterfaceC2787 interfaceC2787M6352 = c2942.m6352(null, strMo6055);
                    if (interfaceC2787M6352 == null) {
                        StringBuilder sbM11550 = AbstractC6136.m11550("autoType not support : ", strMo6055, ", offset ");
                        sbM11550.append(this.f9192);
                        sbM11550.append("/");
                        sbM11550.append(bArr.length);
                        throw new JSONException(sbM11550.toString());
                    }
                    interfaceC2787M5585 = interfaceC2787M6352;
                }
                return interfaceC2787M5585.mo5422(this, null, null, 0L);
            default:
                boolean z = true;
                switch (b) {
                    case -90:
                        boolean z2 = (c2942.f9318 & JSONReader$Feature.SupportAutoType.mask) != 0;
                        Map map = null;
                        while (true) {
                            int i6 = this.f9192;
                            byte b2 = bArr[i6];
                            if (b2 == -91) {
                                this.f9192 = i6 + 1;
                                return map == null ? (c2942.f9318 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new HashMap() : new JSONObject() : map;
                            }
                            if (!z2 || i != 0 || b2 < 73) {
                                objMo6080 = b2 >= 73 ? mo6080() : mo6078();
                            } else {
                                if (mo6083() == InterfaceC2787.f8584) {
                                    InterfaceC2787 interfaceC2787M55852 = ((C2801) c2942.f9316).m5585(mo6199());
                                    if (interfaceC2787M55852 == null) {
                                        String strMo60552 = mo6055();
                                        InterfaceC2787 interfaceC2787M63522 = c2942.m6352(null, strMo60552);
                                        if (interfaceC2787M63522 == null) {
                                            StringBuilder sbM115502 = AbstractC6136.m11550("autoType not support : ", strMo60552, str6);
                                            sbM115502.append(this.f9192);
                                            sbM115502.append(str5);
                                            sbM115502.append(bArr.length);
                                            throw new JSONException(sbM115502.toString());
                                        }
                                        interfaceC2787M55852 = interfaceC2787M63522;
                                    }
                                    this.f9178 = z;
                                    return interfaceC2787M55852.mo5422(this, null, null, 0L);
                                }
                                objMo6080 = mo6055();
                            }
                            if (map == null) {
                                str2 = str6;
                                str = str5;
                                map = (JSONReader$Feature.UseNativeObject.mask & c2942.f9318) != 0 ? new HashMap() : new JSONObject();
                            } else {
                                str = str5;
                                str2 = str6;
                            }
                            if (mo6134()) {
                                String strMo6144 = mo6144();
                                if ("..".equals(strMo6144)) {
                                    map.put(objMo6080, map);
                                } else {
                                    m6107(map, objMo6080, AbstractC2921.m6320(strMo6144));
                                    map.put(objMo6080, null);
                                }
                                z = true;
                            } else {
                                byte b3 = bArr[this.f9192];
                                if (b3 >= 73 && b3 <= 126) {
                                    objMo6149 = mo6139();
                                    z = true;
                                } else if (InterfaceC2911.m6303(b3)) {
                                    z = true;
                                    this.f9192++;
                                    objMo6149 = Integer.valueOf(b3);
                                } else {
                                    z = true;
                                    if (b3 == -79) {
                                        this.f9192++;
                                        objMo6149 = Boolean.TRUE;
                                    } else if (b3 == -80) {
                                        this.f9192++;
                                        objMo6149 = Boolean.FALSE;
                                    } else {
                                        objMo6149 = b3 == -90 ? mo6149() : mo6078();
                                    }
                                }
                                if (objMo6149 != null || (c2942.f9318 & JSONReader$Feature.IgnoreNullPropertyValue.mask) == 0) {
                                    map.put(objMo6080, objMo6149);
                                }
                            }
                            i++;
                            str6 = str2;
                            str5 = str;
                        }
                        break;
                    case -89:
                        int i7 = i2 + 2;
                        this.f9192 = i7;
                        byte b4 = bArr[i3];
                        int i8 = i2 + 3;
                        this.f9192 = i8;
                        byte b5 = bArr[i7];
                        this.f9192 = i2 + 4;
                        return LocalTime.of(b4, b5, bArr[i8], mo6167());
                    case -88:
                        int i9 = i2 + 2;
                        this.f9192 = i9;
                        int i10 = bArr[i3] << 8;
                        int i11 = i2 + 3;
                        this.f9192 = i11;
                        int i12 = i10 + (bArr[i9] & DefaultClassResolver.NAME);
                        int i13 = i2 + 4;
                        this.f9192 = i13;
                        byte b6 = bArr[i11];
                        int i14 = i2 + 5;
                        this.f9192 = i14;
                        byte b7 = bArr[i13];
                        int i15 = i2 + 6;
                        this.f9192 = i15;
                        byte b8 = bArr[i14];
                        int i16 = i2 + 7;
                        this.f9192 = i16;
                        byte b9 = bArr[i15];
                        this.f9192 = i2 + 8;
                        return LocalDateTime.of(i12, b6, b7, b8, b9, bArr[i16], mo6167());
                    case -87:
                        int i17 = i2 + 2;
                        this.f9192 = i17;
                        int i18 = bArr[i3] << 8;
                        int i19 = i2 + 3;
                        this.f9192 = i19;
                        int i20 = i18 + (bArr[i17] & DefaultClassResolver.NAME);
                        int i21 = i2 + 4;
                        this.f9192 = i21;
                        byte b10 = bArr[i19];
                        this.f9192 = i2 + 5;
                        return LocalDate.of(i20, b10, bArr[i21]);
                    case -86:
                        return m6228();
                    case -85:
                        m6227(i3, i4);
                        long jM5685 = AbstractC2848.m5685(bArr, i3);
                        this.f9192 += 8;
                        return new Date(jM5685);
                    case -84:
                        m6226(i3, i4);
                        long jM5692 = AbstractC2848.m5692(bArr, i3);
                        this.f9192 += 4;
                        return new Date(jM5692 * 1000);
                    case -83:
                        m6226(i3, i4);
                        long jM56922 = AbstractC2848.m5692(bArr, i3);
                        this.f9192 += 4;
                        return new Date(jM56922 * 60000);
                    case -82:
                        return Instant.ofEpochSecond(mo6164(), mo6167());
                    case -81:
                        return null;
                    case -80:
                        return Boolean.FALSE;
                    case -79:
                        return Boolean.TRUE;
                    case -78:
                        return Double.valueOf(0.0d);
                    case -77:
                        return Double.valueOf(1.0d);
                    case -76:
                        return Double.valueOf(mo6164());
                    case -75:
                        m6227(i3, i4);
                        long jM56852 = AbstractC2848.m5685(bArr, i3);
                        this.f9192 += 8;
                        return Double.valueOf(Double.longBitsToDouble(jM56852));
                    case -74:
                        return Float.valueOf(mo6167());
                    case -73:
                        m6226(i3, i4);
                        int iM56922 = AbstractC2848.m5692(bArr, i3);
                        this.f9192 += 4;
                        return Float.valueOf(Float.intBitsToFloat(iM56922));
                    case -72:
                        return BigDecimal.valueOf(mo6164());
                    case -71:
                        int iMo6167 = mo6167();
                        BigInteger bigIntegerMo6064 = mo6064();
                        return iMo6167 == 0 ? new BigDecimal(bigIntegerMo6064) : new BigDecimal(bigIntegerMo6064, iMo6167);
                    case -70:
                        return BigInteger.valueOf(mo6164());
                    case -69:
                        int iMo61672 = mo6167();
                        byte[] bArr2 = new byte[iMo61672];
                        System.arraycopy(bArr, this.f9192, bArr2, 0, iMo61672);
                        this.f9192 += iMo61672;
                        return new BigInteger(bArr2);
                    case -68:
                        int i22 = i2 + 2;
                        this.f9192 = i22;
                        int i23 = bArr[i3] << 8;
                        this.f9192 = i2 + 3;
                        return Short.valueOf((short) (i23 + (bArr[i22] & DefaultClassResolver.NAME)));
                    case -67:
                        this.f9192 = i2 + 2;
                        return Byte.valueOf(bArr[i3]);
                    case -66:
                        m6227(i3, i4);
                        long jM56853 = AbstractC2848.m5685(bArr, i3);
                        this.f9192 += 8;
                        return Long.valueOf(jM56853);
                    case -65:
                        m6226(i3, i4);
                        int iM56923 = AbstractC2848.m5692(bArr, i3);
                        this.f9192 += 4;
                        return Long.valueOf(iM56923);
                    default:
                        switch (b) {
                            case 122:
                                int iM62332 = m6233();
                                BiFunction biFunction = AbstractC2853.f8920;
                                if (biFunction != null && !AbstractC2853.f8929) {
                                    if (this.f9236 == null) {
                                        byte[] bArr3 = (byte[]) AbstractC2932.f9288.getAndSet(this.f9235, null);
                                        this.f9236 = bArr3;
                                        if (bArr3 == null) {
                                            this.f9236 = new byte[8192];
                                        }
                                    }
                                    int i24 = iM62332 << 1;
                                    if (i24 > this.f9236.length) {
                                        this.f9236 = new byte[i24];
                                    }
                                    int iM5679 = AbstractC2848.m5679(this.f9192, iM62332, bArr, this.f9236);
                                    if (iM5679 != -1) {
                                        byte[] bArr4 = new byte[iM5679];
                                        System.arraycopy(this.f9236, 0, bArr4, 0, iM5679);
                                        String str7 = (String) biFunction.apply(bArr4, (byte) 1);
                                        this.f9192 += iM62332;
                                        return str7;
                                    }
                                }
                                String str8 = new String(bArr, this.f9192, iM62332, StandardCharsets.UTF_8);
                                this.f9192 += iM62332;
                                return str8;
                            case 123:
                                int iM62333 = m6233();
                                String str9 = new String(bArr, this.f9192, iM62333, StandardCharsets.UTF_16);
                                this.f9192 += iM62333;
                                return str9;
                            case 124:
                                int iM62334 = m6233();
                                BiFunction biFunction2 = AbstractC2853.f8920;
                                if (biFunction2 == null || AbstractC2853.f8929) {
                                    str3 = new String(bArr, this.f9192, iM62334, StandardCharsets.UTF_16LE);
                                } else {
                                    byte[] bArr5 = new byte[iM62334];
                                    System.arraycopy(bArr, this.f9192, bArr5, 0, iM62334);
                                    str3 = (String) biFunction2.apply(bArr5, iM62334 != 0 ? (byte) 1 : (byte) 0);
                                }
                                this.f9192 += iM62334;
                                return str3;
                            case 125:
                                int iM62335 = m6233();
                                BiFunction biFunction3 = AbstractC2853.f8920;
                                if (biFunction3 == null || !AbstractC2853.f8929) {
                                    str4 = new String(bArr, this.f9192, iM62335, StandardCharsets.UTF_16BE);
                                } else {
                                    byte[] bArr6 = new byte[iM62335];
                                    System.arraycopy(bArr, this.f9192, bArr6, 0, iM62335);
                                    str4 = (String) biFunction3.apply(bArr6, iM62335 != 0 ? (byte) 1 : (byte) 0);
                                }
                                this.f9192 += iM62335;
                                return str4;
                            case 126:
                                if (f9229 == null) {
                                    f9229 = Charset.forName("GB18030");
                                }
                                int iM62336 = m6233();
                                String str10 = new String(bArr, this.f9192, iM62336, f9229);
                                this.f9192 += iM62336;
                                return str10;
                            default:
                                if (InterfaceC2911.m6303(b)) {
                                    return Integer.valueOf(b);
                                }
                                if (InterfaceC2911.m6298(b)) {
                                    int i25 = this.f9192;
                                    this.f9192 = i25 + 1;
                                    return Integer.valueOf(m6225(i25, bArr, b));
                                }
                                if (InterfaceC2911.m6295(b)) {
                                    int i26 = this.f9192;
                                    if (i26 + 1 < i4) {
                                        int iM6224 = m6224(i26, bArr, b);
                                        this.f9192 += 2;
                                        return Integer.valueOf(iM6224);
                                    }
                                }
                                if (InterfaceC2911.m6301(b)) {
                                    return Long.valueOf(((long) (b + 40)) - 8);
                                }
                                if (InterfaceC2911.m6300(b)) {
                                    this.f9192 = this.f9192 + 1;
                                    return Long.valueOf(m6221(r0, bArr, b));
                                }
                                if (InterfaceC2911.m6296(b)) {
                                    int i27 = this.f9192;
                                    if (i27 + 1 < i4) {
                                        long jM6222 = m6222(i27, bArr, b);
                                        this.f9192 += 2;
                                        return Long.valueOf(jM6222);
                                    }
                                }
                                if (b >= -108 && b <= -92) {
                                    int iM62337 = b == -92 ? m6233() : b + 108;
                                    if (iM62337 == 0) {
                                        return (c2942.f9318 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new ArrayList() : new JSONArray();
                                    }
                                    List arrayList = (c2942.f9318 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new ArrayList(iM62337) : new JSONArray(iM62337);
                                    while (i < iM62337) {
                                        if (mo6134()) {
                                            String strMo61442 = mo6144();
                                            if ("..".equals(strMo61442)) {
                                                arrayList.add(arrayList);
                                            } else {
                                                arrayList.add(null);
                                                m6108(arrayList, i, AbstractC2921.m6320(strMo61442));
                                            }
                                        } else {
                                            arrayList.add(mo6078());
                                        }
                                        i++;
                                    }
                                    return arrayList;
                                }
                                if (b < 73 || b > 121) {
                                    if (b != 127) {
                                        C0276.m849("not support type : ".concat(m6237(b)));
                                        return null;
                                    }
                                    int iM62338 = m6233();
                                    this.f9238 = iM62338;
                                    if (iM62338 < 0) {
                                        throw null;
                                    }
                                    C0276.m843(this.f9238, "not support symbol : ");
                                    return null;
                                }
                                int iM62339 = b == 121 ? m6233() : b - 73;
                                this.f9238 = iM62339;
                                if (iM62339 < 0) {
                                    throw null;
                                }
                                if (AbstractC2853.f8921 != null) {
                                    String strM5724 = AbstractC2853.m5724(this.f9192, bArr, iM62339);
                                    this.f9192 += this.f9238;
                                    if ((c2942.f9318 & JSONReader$Feature.TrimString.mask) != 0) {
                                        strM5724 = strM5724.trim();
                                    }
                                    if (!strM5724.isEmpty() || (c2942.f9318 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
                                        return strM5724;
                                    }
                                } else {
                                    BiFunction biFunction4 = AbstractC2853.f8920;
                                    if (biFunction4 != null) {
                                        byte[] bArr7 = new byte[iM62339];
                                        System.arraycopy(bArr, this.f9192, bArr7, 0, iM62339);
                                        this.f9192 += this.f9238;
                                        String strTrim = (String) biFunction4.apply(bArr7, b);
                                        if ((c2942.f9318 & JSONReader$Feature.TrimString.mask) != 0) {
                                            strTrim = strTrim.trim();
                                        }
                                        if (!strTrim.isEmpty() || (c2942.f9318 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
                                            return strTrim;
                                        }
                                    } else {
                                        String str11 = new String(bArr, this.f9192, iM62339, StandardCharsets.ISO_8859_1);
                                        this.f9192 += this.f9238;
                                        if ((c2942.f9318 & JSONReader$Feature.TrimString.mask) != 0) {
                                            str11 = str11.trim();
                                        }
                                        if (!str11.isEmpty() || (c2942.f9318 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
                                            return str11;
                                        }
                                    }
                                }
                                return null;
                        }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List mo6079() {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6079():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0393  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo6080() {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6080():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public final double mo6081() {
        int i = this.f9192;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -75) {
            long j = (((long) bArr[i + 8]) & 255) + ((((long) bArr[i + 7]) & 255) << 8) + ((((long) bArr[i + 6]) & 255) << 16) + ((((long) bArr[i + 5]) & 255) << 24) + ((((long) bArr[i + 4]) & 255) << 32) + ((((long) bArr[i + 3]) & 255) << 40) + ((((long) bArr[i + 2]) & 255) << 48) + (((long) bArr[i + 1]) << 56);
            this.f9192 = i + 9;
            return Double.longBitsToDouble(j);
        }
        int i2 = i + 1;
        this.f9192 = i2;
        if (b == -74) {
            return mo6167();
        }
        int i3 = this.f9239;
        if (b == -73) {
            m6226(i2, i3);
            int iM5692 = AbstractC2848.m5692(bArr, i2);
            this.f9192 += 4;
            return Float.intBitsToFloat(iM5692);
        }
        if (b == -71) {
            int iMo6167 = mo6167();
            BigInteger bigIntegerMo6064 = mo6064();
            return (iMo6167 == 0 ? new BigDecimal(bigIntegerMo6064) : new BigDecimal(bigIntegerMo6064, iMo6167)).intValue();
        }
        if (b != 72) {
            if (b == 124) {
                int iMo61672 = mo6167();
                String str = new String(bArr, this.f9192, iMo61672, StandardCharsets.UTF_16LE);
                this.f9192 += iMo61672;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC2866.m5868(str).intValue();
            }
            if (b == 121) {
                int iMo61673 = mo6167();
                String str2 = new String(bArr, this.f9192, iMo61673, StandardCharsets.ISO_8859_1);
                this.f9192 += iMo61673;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC2866.m5868(str2).intValue();
            }
            if (b == 122) {
                int iMo61674 = mo6167();
                String str3 = new String(bArr, this.f9192, iMo61674, StandardCharsets.UTF_8);
                this.f9192 += iMo61674;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC2866.m5868(str3).intValue();
            }
            switch (b) {
                case -81:
                    if ((this.f9199.f9318 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                        this.f9194 = true;
                        return 0.0d;
                    }
                    C0276.m849(mo6124("long value not support input null"));
                    return 0.0d;
                case -80:
                case -78:
                    return 0.0d;
                case -79:
                case -77:
                    return 1.0d;
                case -76:
                    return mo6164();
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9192 = i + 3;
                            return i4;
                        case -67:
                            this.f9192 = i + 2;
                            return bArr[i2];
                        case -66:
                            m6227(i2, i3);
                            long jM5685 = AbstractC2848.m5685(bArr, i2);
                            this.f9192 += 8;
                            return jM5685;
                        case -65:
                            break;
                        default:
                            if (InterfaceC2911.m6303(b)) {
                                return b;
                            }
                            if (InterfaceC2911.m6298(b)) {
                                this.f9192 = this.f9192 + 1;
                                return m6225(r0, bArr, b);
                            }
                            if (InterfaceC2911.m6295(b)) {
                                int i5 = this.f9192;
                                if (i5 + 1 < i3) {
                                    int iM6224 = m6224(i5, bArr, b);
                                    this.f9192 += 2;
                                    return iM6224;
                                }
                            }
                            if (InterfaceC2911.m6301(b)) {
                                return ((long) (b + 40)) - 8;
                            }
                            if (InterfaceC2911.m6300(b)) {
                                this.f9192 = this.f9192 + 1;
                                return m6221(r0, bArr, b);
                            }
                            if (InterfaceC2911.m6296(b)) {
                                int i6 = this.f9192;
                                if (i6 + 1 < i3) {
                                    int iM6222 = m6222(i6, bArr, b);
                                    this.f9192 += 2;
                                    return iM6222;
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6223(b);
                            }
                            int i7 = b - 73;
                            String strM6230 = m6230(i7);
                            this.f9192 += i7;
                            return strM6230.indexOf(46) == -1 ? new BigInteger(strM6230).intValue() : AbstractC2866.m5868(strM6230).intValue();
                    }
                    break;
            }
        }
        m6226(i2, i3);
        int iM56922 = AbstractC2848.m5692(bArr, i2);
        this.f9192 += 4;
        return iM56922;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public final long mo6082() {
        return mo6083();
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世 */
    public final long mo6083() {
        int iM6233;
        char c;
        long j;
        long j2;
        int i;
        long j3;
        long j4;
        int i2;
        int iMo6167;
        int i3 = this.f9192;
        int i4 = i3 + 1;
        this.f9192 = i4;
        byte[] bArr = this.f9240;
        byte b = bArr[i3];
        this.f9234 = b;
        boolean z = b == 127;
        byte b2 = b;
        if (z) {
            byte b3 = bArr[i4];
            this.f9234 = b3;
            if (InterfaceC2911.m6302(b3)) {
                if (b3 <= 47) {
                    this.f9192++;
                    iMo6167 = b3;
                } else {
                    iMo6167 = mo6167();
                }
                if (iMo6167 < 0) {
                    throw null;
                }
                if (iMo6167 == 0) {
                    this.f9234 = this.f9241;
                    this.f9238 = this.f9242;
                    this.f9233 = this.f9232;
                    if (this.f9231 == 0) {
                        this.f9231 = m6236();
                    }
                    return this.f9231;
                }
                int i5 = iMo6167 * 2;
                long[] jArr = this.f9243;
                long j5 = jArr[i5 + 1];
                int i6 = (int) j5;
                this.f9234 = (byte) i6;
                this.f9238 = i6 >> 8;
                this.f9233 = (int) (j5 >> 32);
                long j6 = jArr[i5];
                if (j6 != 0) {
                    return j6;
                }
                long jM6236 = m6236();
                this.f9243[i5] = jM6236;
                return jM6236;
            }
            this.f9192++;
            b2 = b3;
        }
        if (b2 >= 73 && b2 <= 120) {
            iM6233 = b2 - 73;
        } else {
            if (b2 != 121 && b2 != 122) {
                StringBuilder sb = new StringBuilder("fieldName not support input type ");
                sb.append(InterfaceC2911.m6299(this.f9234));
                if (this.f9234 == -109) {
                    sb.append(" ");
                    sb.append(mo6139());
                }
                int i7 = this.f9192;
                sb.append(", offset ");
                sb.append(i7);
                throw new JSONException(sb.toString());
            }
            iM6233 = m6233();
        }
        this.f9238 = iM6233;
        int i8 = this.f9192;
        this.f9233 = i8;
        if (iM6233 < 0) {
            throw null;
        }
        if (iM6233 <= 8 && i8 + iM6233 <= bArr.length) {
            long j7 = ((long) i8) + f9230;
            switch (iM6233) {
                case 1:
                    c = '\b';
                    j = 0;
                    i = bArr[i8];
                    j2 = i;
                    break;
                case 2:
                    c = '\b';
                    j = 0;
                    j2 = ((long) AbstractC2853.f8919.getShort(bArr, j7)) & 65535;
                    break;
                case 3:
                    c = '\b';
                    j = 0;
                    j3 = bArr[i8 + 2] << 16;
                    j4 = ((long) AbstractC2853.f8919.getShort(bArr, j7)) & 65535;
                    j2 = j3 + j4;
                    break;
                case 4:
                    c = '\b';
                    j = 0;
                    i = AbstractC2853.f8919.getInt(bArr, j7);
                    j2 = i;
                    break;
                case 5:
                    c = '\b';
                    j = 0;
                    j3 = ((long) bArr[i8 + 4]) << 32;
                    i2 = AbstractC2853.f8919.getInt(bArr, j7);
                    j4 = ((long) i2) & 4294967295L;
                    j2 = j3 + j4;
                    break;
                case 6:
                    c = '\b';
                    j = 0;
                    Unsafe unsafe = AbstractC2853.f8919;
                    j2 = (((long) unsafe.getShort(bArr, 4 + j7)) << 32) + (((long) unsafe.getInt(bArr, j7)) & 4294967295L);
                    break;
                case 7:
                    c = '\b';
                    j = 0;
                    j3 = (((long) bArr[i8 + 6]) << 48) + ((((long) bArr[i8 + 5]) & 255) << 40) + ((((long) bArr[i8 + 4]) & 255) << 32);
                    i2 = AbstractC2853.f8919.getInt(bArr, j7);
                    j4 = ((long) i2) & 4294967295L;
                    j2 = j3 + j4;
                    break;
                default:
                    j2 = AbstractC2853.f8919.getLong(bArr, j7);
                    c = '\b';
                    j = 0;
                    break;
            }
        } else {
            c = '\b';
            j = 0;
            j2 = 0;
        }
        if (j2 != j) {
            this.f9192 += iM6233;
        } else {
            j2 = -3750763034362895579L;
            for (int i9 = 0; i9 < iM6233; i9++) {
                int i10 = this.f9192;
                this.f9192 = i10 + 1;
                j2 = (((long) bArr[i10]) ^ j2) * 1099511628211L;
            }
        }
        if (z) {
            int iMo61672 = bArr[this.f9192];
            if (InterfaceC2911.m6303(iMo61672)) {
                this.f9192++;
            } else {
                iMo61672 = mo6167();
            }
            if (iMo61672 == 0) {
                this.f9232 = this.f9233;
                this.f9242 = iM6233;
                this.f9241 = b2;
                this.f9231 = j2;
                return j2;
            }
            int i11 = iMo61672 << 1;
            int i12 = i11 + 2;
            long[] jArr2 = this.f9243;
            if (jArr2 == null) {
                this.f9243 = new long[Math.max(i12, 32)];
            } else if (jArr2.length < i12) {
                this.f9243 = Arrays.copyOf(jArr2, i11 + 18);
            }
            long[] jArr3 = this.f9243;
            jArr3[i11] = j2;
            jArr3[i11 + 1] = (((long) this.f9233) << 32) + (((long) iM6233) << c) + ((long) b2);
        }
        return j2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final Date mo6084() {
        long j;
        int i;
        int i2 = this.f9192;
        byte[] bArr = this.f9240;
        byte b = bArr[i2];
        int i3 = this.f9239;
        C2942 c2942 = this.f9199;
        ZonedDateTime zonedDateTimeOfLocal = null;
        switch (b) {
            case -89:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(LocalDate.of(1970, 1, 1), mo6174()), c2942.m6351(), null);
                break;
            case -88:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(mo6176(), c2942.m6351(), null);
                break;
            case -87:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(mo6181(), LocalTime.MIN), c2942.m6351(), null);
                break;
            case -86:
                this.f9192 = i2 + 1;
                zonedDateTimeOfLocal = m6228();
                break;
            case -85:
                long jM5685 = AbstractC2848.m5685(bArr, i2 + 1);
                this.f9192 += 9;
                return new Date(jM5685);
            case -84:
                int i4 = i2 + 1;
                m6226(i4, i3);
                long jM5692 = AbstractC2848.m5692(bArr, i4);
                this.f9192 += 5;
                return new Date(jM5692 * 1000);
            case -83:
                int i5 = i2 + 1;
                m6226(i5, i3);
                long jM56922 = AbstractC2848.m5692(bArr, i5);
                this.f9192 += 5;
                return new Date(jM56922 * 60000);
            case -82:
                this.f9192 = i2 + 1;
                return Date.from(Instant.ofEpochSecond(mo6164(), mo6167()));
        }
        if (zonedDateTimeOfLocal == null) {
            return super.mo6084();
        }
        long epochSecond = zonedDateTimeOfLocal.toEpochSecond();
        int nano = zonedDateTimeOfLocal.toLocalTime().getNano();
        if (epochSecond >= 0 || nano <= 0) {
            j = epochSecond * 1000;
            i = nano / 1000000;
        } else {
            j = (epochSecond + 1) * 1000;
            i = (nano / 1000000) - 1000;
        }
        return new Date(j + ((long) i));
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo6086() {
        int i = this.f9192;
        if (this.f9240[i] != -110) {
            return false;
        }
        this.f9192 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final boolean mo6087() {
        int i = this.f9192;
        if (this.f9240[i] != -81) {
            return false;
        }
        this.f9192 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final boolean mo6088(char c, char c2, char c3, char c4) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo6089() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final boolean mo6090() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo6091(char c, char c2, char c3, char c4, char c5, char c6) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final Object mo6093(Type type) {
        C2942 c2942 = this.f9199;
        return ((C2801) c2942.f9316).m5588(type, (c2942.f9318 & JSONReader$Feature.FieldBased.mask) != 0).mo5422(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final Object mo6094(Class cls) {
        C2942 c2942 = this.f9199;
        return ((C2801) c2942.f9316).m5588(cls, (c2942.f9318 & JSONReader$Feature.FieldBased.mask) != 0).mo5422(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final boolean mo6095() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final boolean mo6096() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final boolean mo6097(byte b) {
        int i = this.f9192;
        if (this.f9240[i] != b) {
            return false;
        }
        this.f9192 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final boolean mo6098(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final boolean mo6099() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo6100() {
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final boolean mo6101() {
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final boolean mo6102() {
        int i = this.f9192;
        if (this.f9240[i] != -90) {
            return false;
        }
        this.f9192 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final boolean mo6105() {
        int i = this.f9192;
        byte b = this.f9240[i];
        if (b != -81 && b != 73) {
            return false;
        }
        this.f9192 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final boolean mo6106() {
        int i = this.f9192;
        if (this.f9240[i] != -91) {
            return false;
        }
        this.f9192 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC2787 mo6118(long j, long j2, Class cls) {
        Class clsMo5453;
        ClassLoader classLoader;
        ClassLoader contextClassLoader;
        InterfaceC2787 interfaceC2787M6353;
        Class clsMo54532;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] == -110) {
            this.f9192 = i + 1;
            long jMo6194 = mo6194();
            C2942 c2942 = this.f9199;
            if (j == jMo6194 && (clsMo54532 = (interfaceC2787M6353 = c2942.m6353(cls)).mo5453()) != null && clsMo54532 == cls) {
                ((C2801) c2942.f9316).m5583(jMo6194, interfaceC2787M6353);
                return interfaceC2787M6353;
            }
            c2942.getClass();
            C2801 c2801 = (C2801) c2942.f9316;
            long j3 = c2942.f9318 | j2;
            if ((JSONReader$Feature.SupportAutoType.mask & j3) != 0) {
                InterfaceC2787 interfaceC2787M5585 = c2801.m5585(jMo6194);
                if (interfaceC2787M5585 != null && (clsMo5453 = interfaceC2787M5585.mo5453()) != null && (classLoader = clsMo5453.getClassLoader()) != null && classLoader != (contextClassLoader = Thread.currentThread().getContextClassLoader())) {
                    String strMo6055 = mo6055();
                    Class<?> clsLoadClass = (Class) AbstractC2866.f9031.get(strMo6055);
                    if (clsLoadClass == null) {
                        if (contextClassLoader == null) {
                            try {
                                contextClassLoader = InterfaceC2915.class.getClassLoader();
                            } catch (ClassNotFoundException unused) {
                            }
                        }
                        clsLoadClass = contextClassLoader.loadClass(strMo6055);
                    }
                    if (clsLoadClass != null && !clsMo5453.equals(clsLoadClass)) {
                        interfaceC2787M5585 = m6056(clsLoadClass);
                    }
                }
                if (interfaceC2787M5585 != null || (interfaceC2787M5585 = c2801.m5584(mo6055(), cls, j3)) != null) {
                    this.f9237 = bArr[this.f9192];
                    return interfaceC2787M5585;
                }
                if ((j3 & JSONReader$Feature.ErrorOnNotSupportAutoType.mask) != 0) {
                    C0276.m840(mo6055(), "autoType not support : ");
                    return null;
                }
            } else if ((j3 & JSONReader$Feature.ErrorOnNotSupportAutoType.mask) != 0) {
                C0276.m840(mo6055(), "autoType not support : ");
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo6119() {
        return this.f9192 >= this.f9239;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final boolean mo6121() {
        byte b = this.f9240[this.f9192];
        return b >= -89 && b <= -82;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final boolean mo6122() {
        return this.f9240[this.f9192] == -111;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final boolean mo6123() {
        byte b;
        int i = this.f9192;
        return i < this.f9239 && (b = this.f9240[i]) >= -108 && b <= -92;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo6127() {
        this.f9192++;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final C0966 mo6128() {
        return new C0966(this.f9192, this.f9237);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final boolean mo6131() {
        int i = this.f9192;
        return i < this.f9239 && this.f9240[i] == -90;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo6132() {
        byte b = this.f9240[this.f9192];
        return b >= -78 && b <= 72;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo6133() {
        int i = this.f9192;
        if (i >= this.f9239) {
            return false;
        }
        byte b = this.f9240[i];
        this.f9237 = b;
        return b >= 73;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final boolean mo6134() {
        int i = this.f9192;
        byte[] bArr = this.f9240;
        return i < bArr.length && bArr[i] == -109;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final boolean mo6135() {
        byte b = this.f9240[this.f9192];
        return (b >= -70 && b <= 72) || b == -84 || b == -83 || b == -85;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final int mo6136() {
        byte b = this.f9240[this.f9192];
        this.f9237 = b;
        if (b >= 73 && b < 120) {
            return b - 73;
        }
        C5553.m10825();
        return 0;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo6138() {
        return this.f9240[this.f9192];
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo6139() {
        /*
            Method dump skipped, instruction units count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6139():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子 */
    public final String[] mo6140() {
        if (mo6097((byte) -110) && mo6194() != C2795.f8646) {
            C0276.m849(mo6124("not support type " + mo6055()));
            return null;
        }
        int iMo6187 = mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        String[] strArr = new String[iMo6187];
        for (int i = 0; i < iMo6187; i++) {
            strArr[i] = mo6139();
        }
        return strArr;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏 */
    public final String mo6141() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子苏哲 */
    public final OffsetTime mo6142() {
        ZonedDateTime zonedDateTimeMo6196 = mo6196();
        if (zonedDateTimeMo6196 == null) {
            return null;
        }
        return zonedDateTimeMo6196.toOffsetDateTime().toOffsetTime();
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏哲子 */
    public final boolean mo6143(int i, Collection collection) {
        int i2 = this.f9192;
        if (this.f9240[i2] != -109) {
            return false;
        }
        this.f9192 = i2 + 1;
        String strMo6139 = mo6139();
        if ("..".equals(strMo6139)) {
            collection.add(collection);
            return true;
        }
        m6108(collection, i, AbstractC2921.m6320(strMo6139));
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏子哲 */
    public final String mo6144() {
        int i = this.f9192;
        if (this.f9240[i] != -109) {
            return null;
        }
        this.f9192 = i + 1;
        if (mo6133()) {
            return mo6139();
        }
        C0276.m849("reference not support input ".concat(m6237(this.f9237)));
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子 */
    public final OffsetDateTime mo6146() {
        ZonedDateTime zonedDateTimeMo6196 = mo6196();
        if (zonedDateTimeMo6196 == null) {
            return null;
        }
        return zonedDateTimeMo6196.toOffsetDateTime();
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子兰苏 */
    public final Number mo6147() {
        int i = this.f9192;
        this.f9192 = i + 1;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (InterfaceC2911.m6303(b)) {
            return Integer.valueOf(b);
        }
        if (InterfaceC2911.m6298(b)) {
            int i2 = this.f9192;
            this.f9192 = i2 + 1;
            return Integer.valueOf(m6225(i2, bArr, b));
        }
        boolean zM6295 = InterfaceC2911.m6295(b);
        int i3 = this.f9239;
        if (zM6295) {
            int i4 = this.f9192;
            if (i4 + 1 < i3) {
                int iM6224 = m6224(i4, bArr, b);
                this.f9192 += 2;
                return Integer.valueOf(iM6224);
            }
        }
        if (InterfaceC2911.m6301(b)) {
            return Long.valueOf(((long) (b + 40)) - 8);
        }
        if (InterfaceC2911.m6300(b)) {
            this.f9192 = this.f9192 + 1;
            return Long.valueOf(m6221(r2, bArr, b));
        }
        if (InterfaceC2911.m6296(b)) {
            int i5 = this.f9192;
            if (i5 + 1 < i3) {
                int iM6222 = m6222(i5, bArr, b);
                this.f9192 += 2;
                return Integer.valueOf(iM6222);
            }
        }
        if (b == -110) {
            C0276.m849(AbstractC0053.m152("not support input type : ", mo6139()));
            return null;
        }
        if (b == 72) {
            int i6 = this.f9192;
            m6226(i6, i3);
            int iM5692 = AbstractC2848.m5692(bArr, i6);
            this.f9192 += 4;
            return Integer.valueOf(iM5692);
        }
        if (b == 121) {
            int iMo6167 = mo6167();
            String str = new String(bArr, this.f9192, iMo6167, StandardCharsets.ISO_8859_1);
            this.f9192 += iMo6167;
            return AbstractC2866.m5868(str);
        }
        if (b == 122) {
            int iMo61672 = mo6167();
            String str2 = new String(bArr, this.f9192, iMo61672, StandardCharsets.UTF_8);
            this.f9192 += iMo61672;
            return AbstractC2866.m5868(str2);
        }
        switch (b) {
            case -81:
                return null;
            case -80:
            case -78:
                return Double.valueOf(0.0d);
            case -79:
            case -77:
                return Double.valueOf(1.0d);
            case -76:
                return Double.valueOf(mo6164());
            case -75:
                int i7 = this.f9192;
                m6227(i7, i3);
                long jM5685 = AbstractC2848.m5685(bArr, i7);
                this.f9192 += 8;
                return Double.valueOf(Double.longBitsToDouble(jM5685));
            case -74:
                return Float.valueOf(mo6167());
            case -73:
                int i8 = this.f9192;
                m6226(i8, i3);
                int iM56922 = AbstractC2848.m5692(bArr, i8);
                this.f9192 += 4;
                return Float.valueOf(Float.intBitsToFloat(iM56922));
            case -72:
                return BigDecimal.valueOf(mo6164());
            case -71:
                int iMo61673 = mo6167();
                BigInteger bigIntegerMo6064 = mo6064();
                return iMo61673 == 0 ? new BigDecimal(bigIntegerMo6064) : new BigDecimal(bigIntegerMo6064, iMo61673);
            case -70:
                return BigInteger.valueOf(mo6164());
            case -69:
                int iMo61674 = mo6167();
                byte[] bArr2 = new byte[iMo61674];
                System.arraycopy(bArr, this.f9192, bArr2, 0, iMo61674);
                this.f9192 += iMo61674;
                return new BigInteger(bArr2);
            case -68:
                int i9 = this.f9192;
                int i10 = (bArr[i9 + 1] & DefaultClassResolver.NAME) + (bArr[i9] << 8);
                this.f9192 = i9 + 2;
                return Short.valueOf((short) i10);
            case -67:
                int i11 = this.f9192;
                this.f9192 = i11 + 1;
                return Byte.valueOf(bArr[i11]);
            case -66:
                int i12 = this.f9192;
                m6227(i12, i3);
                long jM56852 = AbstractC2848.m5685(bArr, i12);
                this.f9192 += 8;
                return Long.valueOf(jM56852);
            case -65:
                int i13 = this.f9192;
                m6226(i13, i3);
                int iM56923 = AbstractC2848.m5692(bArr, i13);
                this.f9192 += 4;
                return Long.valueOf(iM56923);
            default:
                if (b < 73 || b > 120) {
                    throw m6223(b);
                }
                int i14 = b - 73;
                String strM6230 = m6230(i14);
                this.f9192 += i14;
                return AbstractC2866.m5868(strM6230);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰 */
    public final Date mo6148() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ef  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏兰子 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map mo6149() {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6149():java.util.Map");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰 */
    public final void mo6150() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏 */
    public final LocalTime mo6151() {
        LocalTime localTimeM5851;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 80 || (localTimeM5851 = AbstractC2865.m5851(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 8;
        return localTimeM5851;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲 */
    public final LocalTime mo6152() {
        LocalTime localTimeM5847;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 79 || (localTimeM5847 = AbstractC2865.m5847(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 7;
        return localTimeM5847;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public final LocalTime mo6153() {
        LocalTime localTimeM5848;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 78 || (localTimeM5848 = AbstractC2865.m5848(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 6;
        return localTimeM5848;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public final LocalTime mo6154() {
        LocalTime localTimeM5788;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 91 || (localTimeM5788 = AbstractC2865.m5788(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 19;
        return localTimeM5788;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲 */
    public final LocalTime mo6155() {
        LocalTime localTimeM5787;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 88 || (localTimeM5787 = AbstractC2865.m5787(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 16;
        return localTimeM5787;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰 */
    public final LocalTime mo6156() {
        LocalTime localTimeM5791;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 85 || (localTimeM5791 = AbstractC2865.m5791(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 13;
        return localTimeM5791;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子 */
    public final void mo6157() {
        int i = this.f9192;
        this.f9192 = i + 1;
        byte b = this.f9240[i];
        this.f9237 = b;
        if (b == -81) {
            return;
        }
        C0276.m843(this.f9237, "null not match, ");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰 */
    public final long mo6160() {
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 92) {
            C0276.m849("date only support string input");
            return 0L;
        }
        long jM5838 = AbstractC2865.m5838(bArr, i + 1, (ZoneId) this.f9199.f9317);
        this.f9192 += 20;
        return jM5838;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲 */
    public final LocalTime mo6161() {
        LocalTime localTimeM5849;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 82 || (localTimeM5849 = AbstractC2865.m5849(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 10;
        return localTimeM5849;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰 */
    public final LocalTime mo6162() {
        LocalTime localTimeM5849;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 81 || (localTimeM5849 = AbstractC2865.m5849(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 9;
        return localTimeM5849;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲世子兰苏, reason: contains not printable characters */
    public final ZonedDateTime m6228() {
        ZoneId zoneIdM5811;
        int i = this.f9192;
        int i2 = i + 1;
        this.f9192 = i2;
        byte[] bArr = this.f9240;
        int i3 = bArr[i] << 8;
        int i4 = i + 2;
        this.f9192 = i4;
        int i5 = i3 + (bArr[i2] & DefaultClassResolver.NAME);
        int i6 = i + 3;
        this.f9192 = i6;
        byte b = bArr[i4];
        int i7 = i + 4;
        this.f9192 = i7;
        byte b2 = bArr[i6];
        int i8 = i + 5;
        this.f9192 = i8;
        byte b3 = bArr[i7];
        int i9 = i + 6;
        this.f9192 = i9;
        byte b4 = bArr[i8];
        this.f9192 = i + 7;
        byte b5 = bArr[i9];
        int iMo6167 = mo6167();
        int i10 = this.f9192;
        byte[] bArr2 = f9228;
        if (i10 + bArr2.length < bArr.length) {
            int i11 = 0;
            while (true) {
                int length = bArr2.length;
                int i12 = this.f9192;
                if (i11 >= length) {
                    this.f9192 = i12 + bArr2.length;
                    zoneIdM5811 = AbstractC2865.f9024;
                    break;
                }
                if (bArr[i12 + i11] != bArr2[i11]) {
                    break;
                }
                i11++;
            }
            zoneIdM5811 = AbstractC2865.m5811(mo6139(), AbstractC2865.f9024);
        } else {
            zoneIdM5811 = AbstractC2865.m5811(mo6139(), AbstractC2865.f9024);
        }
        return ZonedDateTime.of(LocalDateTime.of(i5, b, b2, b3, b4, b5, iMo6167), zoneIdM5811);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲世子苏兰, reason: contains not printable characters */
    public final void m6229() {
        throw new JSONException("string value not support input " + InterfaceC2911.m6299(this.f9237) + " offset " + this.f9192 + "/" + this.f9240.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子世兰苏, reason: contains not printable characters */
    public final String m6230(int i) {
        int i2 = this.f9192;
        byte[] bArr = this.f9240;
        return i == 1 ? AbstractC2866.m5858((char) (bArr[i2] & DefaultClassResolver.NAME)) : i == 2 ? AbstractC2866.m5857((char) (bArr[i2] & DefaultClassResolver.NAME), (char) (bArr[i2 + 1] & DefaultClassResolver.NAME)) : AbstractC2853.f8921 != null ? AbstractC2853.m5724(i2, bArr, i) : new String(bArr, i2, i, StandardCharsets.ISO_8859_1);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0196  */
    /* JADX INFO: renamed from: 飘花落叶言楪哲子世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6231(byte r20) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.m6231(byte):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰世苏, reason: contains not printable characters */
    public final long m6232(byte[] bArr, byte b) {
        int i = this.f9192;
        if (InterfaceC2911.m6303(b)) {
            return b;
        }
        if (InterfaceC2911.m6298(b)) {
            long jM6225 = m6225(i, bArr, b);
            this.f9192 = i + 1;
            return jM6225;
        }
        boolean zM6295 = InterfaceC2911.m6295(b);
        int i2 = this.f9239;
        if (zM6295 && i + 1 < i2) {
            this.f9192 = i + 2;
            return m6224(i, bArr, b);
        }
        if (b == -71) {
            int iMo6167 = mo6167();
            BigInteger bigIntegerMo6064 = mo6064();
            return (iMo6167 == 0 ? new BigDecimal(bigIntegerMo6064) : new BigDecimal(bigIntegerMo6064, iMo6167)).longValue();
        }
        if (b == 72) {
            int i3 = this.f9192;
            m6226(i3, i2);
            int iM5692 = AbstractC2848.m5692(bArr, i3);
            this.f9192 += 4;
            return iM5692;
        }
        if (b == 124) {
            int iMo61672 = mo6167();
            String str = new String(bArr, this.f9192, iMo61672, StandardCharsets.UTF_16LE);
            this.f9192 += iMo61672;
            return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC2866.m5868(str).intValue();
        }
        if (b == -68) {
            int i4 = this.f9192;
            int i5 = (bArr[i4 + 1] & DefaultClassResolver.NAME) + (bArr[i4] << 8);
            this.f9192 = i4 + 2;
            return i5;
        }
        if (b == -67) {
            this.f9192 = this.f9192 + 1;
            return bArr[r9];
        }
        if (b == 121) {
            int iMo61673 = mo6167();
            String str2 = new String(bArr, this.f9192, iMo61673, StandardCharsets.ISO_8859_1);
            this.f9192 += iMo61673;
            return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC2866.m5868(str2).intValue();
        }
        if (b == 122) {
            int iMo61674 = mo6167();
            String str3 = new String(bArr, this.f9192, iMo61674, StandardCharsets.UTF_8);
            this.f9192 += iMo61674;
            return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC2866.m5868(str3).intValue();
        }
        switch (b) {
            case -85:
                int i6 = this.f9192;
                m6227(i6, i2);
                long jM5685 = AbstractC2848.m5685(bArr, i6);
                this.f9192 += 8;
                return jM5685;
            case -84:
                int i7 = this.f9192;
                m6226(i7, i2);
                long jM5692 = AbstractC2848.m5692(bArr, i7);
                this.f9192 += 4;
                return jM5692 * 1000;
            case -83:
                int i8 = this.f9192;
                m6226(i8, i2);
                long jM56922 = AbstractC2848.m5692(bArr, i8);
                this.f9192 += 4;
                return jM56922 * 60000;
            default:
                switch (b) {
                    case -81:
                        if ((this.f9199.f9318 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                            this.f9194 = true;
                            return 0L;
                        }
                        C0276.m849(mo6124("long value not support input null"));
                        return 0L;
                    case -80:
                    case -78:
                        return 0L;
                    case -79:
                    case -77:
                        return 1L;
                    case -76:
                        return mo6164();
                    case -75:
                        this.f9192--;
                        return (long) mo6081();
                    case -74:
                        return mo6167();
                    case -73:
                        int i9 = this.f9192;
                        m6226(i9, i2);
                        int iM56922 = AbstractC2848.m5692(bArr, i9);
                        this.f9192 += 4;
                        return (long) Float.intBitsToFloat(iM56922);
                    default:
                        if (b < 73 || b > 120) {
                            C2941.m6340("readInt64Value not support ", InterfaceC2911.m6299(b), this.f9192, this.f9240.length);
                            return 0L;
                        }
                        int i10 = b - 73;
                        String strM6230 = m6230(i10);
                        this.f9192 += i10;
                        return strM6230.indexOf(46) == -1 ? new BigInteger(strM6230).longValue() : AbstractC2866.m5868(strM6230).longValue();
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世, reason: contains not printable characters */
    public final int m6233() {
        int i = this.f9192;
        int i2 = i + 1;
        byte[] bArr = this.f9240;
        int iM5692 = bArr[i];
        if (!InterfaceC2911.m6303(iM5692)) {
            if (InterfaceC2911.m6298(iM5692)) {
                iM5692 = m6225(i2, bArr, iM5692);
                i2 = i + 2;
            } else {
                boolean zM6295 = InterfaceC2911.m6295(iM5692);
                int i3 = this.f9239;
                if (zM6295 && i + 2 < i3) {
                    iM5692 = m6224(i2, bArr, iM5692);
                    i2 = i + 3;
                } else {
                    if (iM5692 != 72 || i + 4 >= i3) {
                        throw m6223((byte) iM5692);
                    }
                    iM5692 = AbstractC2848.m5692(bArr, i2);
                    i2 = i + 5;
                    if (iM5692 > 268435456) {
                        C0276.m849("input length overflow");
                        return 0;
                    }
                }
            }
        }
        this.f9192 = i2;
        return iM5692;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰, reason: contains not printable characters */
    public final float m6234() {
        int i = this.f9192;
        int i2 = i + 1;
        this.f9192 = i2;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -71) {
            int iMo6167 = mo6167();
            BigInteger bigIntegerMo6064 = mo6064();
            return (iMo6167 == 0 ? new BigDecimal(bigIntegerMo6064) : new BigDecimal(bigIntegerMo6064, iMo6167)).intValue();
        }
        int i3 = this.f9239;
        if (b != 72) {
            if (b == 124) {
                int iMo61672 = mo6167();
                String str = new String(bArr, this.f9192, iMo61672, StandardCharsets.UTF_16LE);
                this.f9192 += iMo61672;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC2866.m5868(str).intValue();
            }
            if (b == 121) {
                int iMo61673 = mo6167();
                String str2 = new String(bArr, this.f9192, iMo61673, StandardCharsets.ISO_8859_1);
                this.f9192 += iMo61673;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC2866.m5868(str2).intValue();
            }
            if (b == 122) {
                int iMo61674 = mo6167();
                String str3 = new String(bArr, this.f9192, iMo61674, StandardCharsets.UTF_8);
                this.f9192 += iMo61674;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC2866.m5868(str3).intValue();
            }
            switch (b) {
                case -81:
                    if ((this.f9199.f9318 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                        this.f9194 = true;
                        return 0.0f;
                    }
                    C0276.m849(mo6124("long value not support input null"));
                    return 0.0f;
                case -80:
                case -78:
                    return 0.0f;
                case -79:
                case -77:
                    return 1.0f;
                case -76:
                    return mo6164();
                case -75:
                    m6227(i2, i3);
                    long jM5685 = AbstractC2848.m5685(bArr, i2);
                    this.f9192 += 8;
                    return (float) Double.longBitsToDouble(jM5685);
                case -74:
                    return mo6167();
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9192 = i + 3;
                            return i4;
                        case -67:
                            this.f9192 = i + 2;
                            return bArr[i2];
                        case -66:
                            m6227(i2, i3);
                            long jM56852 = AbstractC2848.m5685(bArr, i2);
                            this.f9192 += 8;
                            return jM56852;
                        case -65:
                            break;
                        default:
                            if (InterfaceC2911.m6303(b)) {
                                return b;
                            }
                            if (InterfaceC2911.m6298(b)) {
                                this.f9192 = this.f9192 + 1;
                                return m6225(r0, bArr, b);
                            }
                            if (InterfaceC2911.m6295(b)) {
                                int i5 = this.f9192;
                                if (i5 + 1 < i3) {
                                    int iM6224 = m6224(i5, bArr, b);
                                    this.f9192 += 2;
                                    return iM6224;
                                }
                            }
                            if (InterfaceC2911.m6301(b)) {
                                return b + 32;
                            }
                            if (InterfaceC2911.m6300(b)) {
                                this.f9192 = this.f9192 + 1;
                                return m6221(r0, bArr, b);
                            }
                            if (InterfaceC2911.m6296(b)) {
                                int i6 = this.f9192;
                                if (i6 + 1 < i3) {
                                    int iM6222 = m6222(i6, bArr, b);
                                    this.f9192 += 2;
                                    return iM6222;
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6223(b);
                            }
                            int i7 = b - 73;
                            String strM6230 = m6230(i7);
                            this.f9192 += i7;
                            return strM6230.indexOf(46) == -1 ? new BigInteger(strM6230).intValue() : AbstractC2866.m5868(strM6230).intValue();
                    }
                    break;
            }
        }
        m6226(i2, i3);
        int iM5692 = AbstractC2848.m5692(bArr, i2);
        this.f9192 += 4;
        return iM5692;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子苏兰世, reason: contains not printable characters */
    public final int m6235(byte[] bArr, byte b) {
        if (InterfaceC2911.m6301(b)) {
            return b + 32;
        }
        if (InterfaceC2911.m6300(b)) {
            int i = this.f9192;
            this.f9192 = i + 1;
            return m6221(i, bArr, b);
        }
        boolean zM6296 = InterfaceC2911.m6296(b);
        int i2 = this.f9239;
        if (zM6296) {
            int i3 = this.f9192;
            if (i3 + 1 < i2) {
                int iM6222 = m6222(i3, bArr, b);
                this.f9192 += 2;
                return iM6222;
            }
        }
        if (b == -71) {
            int iMo6167 = mo6167();
            BigInteger bigIntegerMo6064 = mo6064();
            return (iMo6167 == 0 ? new BigDecimal(bigIntegerMo6064) : new BigDecimal(bigIntegerMo6064, iMo6167)).intValue();
        }
        if (b == 124) {
            int iMo61672 = mo6167();
            String str = new String(bArr, this.f9192, iMo61672, StandardCharsets.UTF_16LE);
            this.f9192 += iMo61672;
            return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC2866.m5868(str).intValue();
        }
        if (b == 121) {
            int iMo61673 = mo6167();
            String str2 = new String(bArr, this.f9192, iMo61673, StandardCharsets.ISO_8859_1);
            this.f9192 += iMo61673;
            return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC2866.m5868(str2).intValue();
        }
        if (b == 122) {
            int iMo61674 = mo6167();
            String str3 = new String(bArr, this.f9192, iMo61674, StandardCharsets.UTF_8);
            this.f9192 += iMo61674;
            return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC2866.m5868(str3).intValue();
        }
        switch (b) {
            case -85:
                int i4 = this.f9192;
                m6227(i4, i2);
                long jM5685 = AbstractC2848.m5685(bArr, i4);
                this.f9192 += 8;
                return (int) jM5685;
            case -84:
            case -83:
                break;
            default:
                switch (b) {
                    case -81:
                        if ((this.f9199.f9318 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                            this.f9194 = true;
                            return 0;
                        }
                        C0276.m849(mo6124("int value not support input null"));
                        return 0;
                    case -80:
                    case -78:
                        return 0;
                    case -79:
                    case -77:
                        return 1;
                    case -76:
                        return (int) mo6164();
                    case -75:
                        this.f9192--;
                        return (int) mo6081();
                    case -74:
                        return mo6167();
                    case -73:
                        int i5 = this.f9192;
                        m6226(i5, i2);
                        int iM5692 = AbstractC2848.m5692(bArr, i5);
                        this.f9192 += 4;
                        return (int) Float.intBitsToFloat(iM5692);
                    default:
                        switch (b) {
                            case -68:
                                int i6 = this.f9192;
                                int i7 = (bArr[i6 + 1] & DefaultClassResolver.NAME) + (bArr[i6] << 8);
                                this.f9192 = i6 + 2;
                                return i7;
                            case -67:
                                int i8 = this.f9192;
                                this.f9192 = i8 + 1;
                                return bArr[i8];
                            case -66:
                                int i9 = this.f9192;
                                m6227(i9, i2);
                                long jM56852 = AbstractC2848.m5685(bArr, i9);
                                this.f9192 += 8;
                                return (int) jM56852;
                            case -65:
                                break;
                            default:
                                if (b < 73 || b > 120) {
                                    C2941.m6340("readInt32Value not support ", InterfaceC2911.m6299(b), this.f9192, this.f9240.length);
                                    return 0;
                                }
                                int i10 = b - 73;
                                String strM6230 = m6230(i10);
                                this.f9192 += i10;
                                return strM6230.indexOf(46) == -1 ? new BigInteger(strM6230).intValue() : AbstractC2866.m5868(strM6230).intValue();
                        }
                        break;
                }
                break;
        }
        int i11 = this.f9192;
        m6226(i11, i2);
        int iM56922 = AbstractC2848.m5692(bArr, i11);
        this.f9192 += 4;
        return iM56922;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public final long[] mo6163() {
        if (mo6097((byte) -110)) {
            long jMo6194 = mo6194();
            if (jMo6194 != C2710.f8238 && jMo6194 != C2706.f8228 && jMo6194 != C2728.f8301 && jMo6194 != C2707.f8230) {
                C0276.m849(mo6124("not support " + mo6055()));
                return null;
            }
        }
        int iMo6187 = mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        long[] jArr = new long[iMo6187];
        for (int i = 0; i < iMo6187; i++) {
            jArr[i] = mo6164();
        }
        return jArr;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final long mo6164() {
        long jM5685;
        this.f9194 = false;
        int i = this.f9192;
        int i2 = i + 1;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (InterfaceC2911.m6301(b)) {
            jM5685 = b + 32;
        } else if (InterfaceC2911.m6300(b)) {
            jM5685 = m6221(i2, bArr, b);
            i2 = i + 2;
        } else {
            boolean zM6296 = InterfaceC2911.m6296(b);
            int i3 = this.f9239;
            if (zM6296 && i + 2 < i3) {
                jM5685 = m6222(i2, bArr, b);
                i2 = i + 3;
            } else if (b == -65 && i + 4 < i3) {
                jM5685 = AbstractC2848.m5692(bArr, i2);
                i2 = i + 5;
            } else {
                if (b != -66 || i + 8 >= i3) {
                    this.f9192 = i2;
                    return m6232(bArr, b);
                }
                jM5685 = AbstractC2848.m5685(bArr, i2);
                i2 = i + 9;
            }
        }
        this.f9192 = i2;
        return jM5685;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏 */
    public final Long mo6165() {
        long jM5685;
        int i = this.f9192;
        int i2 = i + 1;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -81) {
            this.f9192 = i2;
            return null;
        }
        if (InterfaceC2911.m6301(b)) {
            jM5685 = b + 32;
        } else if (InterfaceC2911.m6300(b)) {
            jM5685 = m6221(i2, bArr, b);
            i2 = i + 2;
        } else {
            boolean zM6296 = InterfaceC2911.m6296(b);
            int i3 = this.f9239;
            if (zM6296 && i + 2 < i3) {
                jM5685 = m6222(i2, bArr, b);
                i2 = i + 3;
            } else if (b == -65 && i + 4 < i3) {
                jM5685 = AbstractC2848.m5692(bArr, i2);
                i2 = i + 5;
            } else {
                if (b != -66 || i + 8 >= i3) {
                    this.f9192 = i2;
                    return Long.valueOf(m6232(bArr, b));
                }
                jM5685 = AbstractC2848.m5685(bArr, i2);
                i2 = i + 9;
            }
        }
        this.f9192 = i2;
        return Long.valueOf(jM5685);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final int mo6167() {
        int i = this.f9192;
        int i2 = i + 1;
        byte[] bArr = this.f9240;
        int iM5692 = bArr[i];
        if (!InterfaceC2911.m6303(iM5692)) {
            if (InterfaceC2911.m6298(iM5692)) {
                iM5692 = m6225(i2, bArr, iM5692);
                i2 = i + 2;
            } else {
                boolean zM6295 = InterfaceC2911.m6295(iM5692);
                int i3 = this.f9239;
                if (zM6295 && i + 2 < i3) {
                    iM5692 = m6224(i2, bArr, iM5692);
                    i2 = i + 3;
                } else {
                    if (iM5692 != 72 || i + 4 >= i3) {
                        this.f9192 = i2;
                        return m6235(bArr, (byte) iM5692);
                    }
                    iM5692 = AbstractC2848.m5692(bArr, i2);
                    i2 = i + 5;
                }
            }
        }
        this.f9192 = i2;
        return iM5692;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public final Integer mo6168() {
        int i = this.f9192;
        int i2 = i + 1;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -81) {
            this.f9192 = i2;
            return null;
        }
        boolean zM6303 = InterfaceC2911.m6303(b);
        int i3 = b;
        if (!zM6303) {
            if (InterfaceC2911.m6298(b)) {
                int iM6225 = m6225(i2, bArr, b);
                i2 = i + 2;
                i3 = iM6225;
            } else {
                boolean zM6295 = InterfaceC2911.m6295(b);
                int i4 = this.f9239;
                if (zM6295 && i + 2 < i4) {
                    int iM6224 = m6224(i2, bArr, b);
                    i2 = i + 3;
                    i3 = iM6224;
                } else {
                    if (b != 72 || i + 4 >= i4) {
                        this.f9192 = i2;
                        return Integer.valueOf(m6235(bArr, b));
                    }
                    int iM5692 = AbstractC2848.m5692(bArr, i2);
                    i2 = i + 5;
                    i3 = iM5692;
                }
            }
        }
        this.f9192 = i2;
        return Integer.valueOf(i3);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏 */
    public final LocalDateTime mo6169() {
        LocalDateTime localDateTimeM5793;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 93 || (localDateTimeM5793 = AbstractC2865.m5793(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 21;
        return localDateTimeM5793;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final LocalDateTime mo6170() {
        int i = this.f9192;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        this.f9237 = b;
        if (b != 92) {
            C0276.m849("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM5798 = AbstractC2865.m5798(bArr, i + 1);
        if (localDateTimeM5798 != null) {
            this.f9192 += 20;
            return localDateTimeM5798;
        }
        C0276.m849("date only support string input");
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏 */
    public final LocalTime mo6171() {
        LocalTime localTimeM5789;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 83 || (localTimeM5789 = AbstractC2865.m5789(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 11;
        return localTimeM5789;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public final LocalTime mo6172() {
        LocalTime localTimeM5792;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 84 || (localTimeM5792 = AbstractC2865.m5792(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 12;
        return localTimeM5792;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final LocalDateTime mo6173(int i) {
        LocalDateTime localDateTimeM5790;
        int i2 = this.f9192;
        byte[] bArr = this.f9240;
        byte b = bArr[i2];
        this.f9237 = b;
        if (b < 73 || b > 120) {
            C0276.m849("date only support string input");
            return null;
        }
        if (i < 21 || i > 29 || (localDateTimeM5790 = AbstractC2865.m5790(i2 + 1, bArr, i)) == null) {
            C0276.m840(mo6139(), "illegal LocalDateTime string : ");
            return null;
        }
        this.f9192 = i + 1 + this.f9192;
        return localDateTimeM5790;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世 */
    public final LocalTime mo6174() {
        int i = this.f9192;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -89) {
            int i2 = i + 2;
            this.f9192 = i2;
            byte b2 = bArr[i + 1];
            int i3 = i + 3;
            this.f9192 = i3;
            byte b3 = bArr[i2];
            this.f9192 = i + 4;
            return LocalTime.of(b2, b3, bArr[i3], mo6167());
        }
        if (b == -81) {
            this.f9192 = i + 1;
            return null;
        }
        if (b < 73 || b > 120) {
            C5553.m10825();
            return null;
        }
        int iMo6136 = mo6136();
        if (iMo6136 == 18) {
            return mo6154();
        }
        switch (iMo6136) {
            case 5:
                return mo6153();
            case 6:
                return mo6152();
            case 7:
                return mo6151();
            case 8:
                return mo6162();
            case 9:
                return mo6161();
            case 10:
                return mo6171();
            case 11:
                return mo6172();
            case 12:
                return mo6156();
            default:
                C0276.m849(AbstractC6136.m11556(iMo6136, "not support len : "));
                return null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final LocalDateTime mo6175() {
        LocalDateTime localDateTimeM5800;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 85 || (localDateTimeM5800 = AbstractC2865.m5800(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 13;
        return localDateTimeM5800;
    }

    /* JADX WARN: Type inference failed for: r12v20, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final LocalDateTime mo6176() {
        int i = this.f9192;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -88) {
            int i2 = i + 2;
            this.f9192 = i2;
            int i3 = bArr[i + 1] << 8;
            int i4 = i + 3;
            this.f9192 = i4;
            int i5 = i3 + (bArr[i2] & DefaultClassResolver.NAME);
            int i6 = i + 4;
            this.f9192 = i6;
            byte b2 = bArr[i4];
            int i7 = i + 5;
            this.f9192 = i7;
            byte b3 = bArr[i6];
            int i8 = i + 6;
            this.f9192 = i8;
            byte b4 = bArr[i7];
            int i9 = i + 7;
            this.f9192 = i9;
            byte b5 = bArr[i8];
            this.f9192 = i + 8;
            return LocalDateTime.of(i5, b2, b3, b4, b5, bArr[i9], mo6167());
        }
        if (b == -81) {
            this.f9192 = i + 1;
            return null;
        }
        if (b == -87) {
            LocalDate localDateMo6181 = mo6181();
            if (localDateMo6181 != null) {
                return LocalDateTime.of(localDateMo6181, LocalTime.MIN);
            }
        } else {
            if (b == -86) {
                return mo6196().toLocalDateTime();
            }
            if (b < 73 || b > 120) {
                throw m6223(b);
            }
            int iMo6136 = mo6136();
            switch (iMo6136) {
                case 8:
                    return LocalDateTime.of(mo6183(), LocalTime.MIN);
                case 9:
                    return LocalDateTime.of(mo6184(), LocalTime.MIN);
                case 10:
                    LocalDate localDateMo6185 = mo6185();
                    if (localDateMo6185 != null) {
                        return LocalDateTime.of(localDateMo6185, LocalTime.MIN);
                    }
                    break;
                case 11:
                    LocalDate localDateMo6186 = mo6186();
                    if (localDateMo6186 != null) {
                        return LocalDateTime.of(localDateMo6186, LocalTime.MIN);
                    }
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    StringBuilder sbM148 = AbstractC0053.m148(iMo6136, "TODO : ", ", ");
                    sbM148.append(mo6139());
                    throw new JSONException(sbM148.toString());
                case 16:
                    return mo6180();
                case 17:
                    return mo6177();
                case 18:
                    return mo6178();
                case 19:
                    return mo6170();
                case 20:
                    return mo6169();
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return mo6173(iMo6136);
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏 */
    public final LocalDateTime mo6177() {
        LocalDateTime localDateTimeM5806;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 90 || (localDateTimeM5806 = AbstractC2865.m5806(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 18;
        return localDateTimeM5806;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世 */
    public final LocalDateTime mo6178() {
        LocalDateTime localDateTimeM5796;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 91 || (localDateTimeM5796 = AbstractC2865.m5796(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 19;
        return localDateTimeM5796;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final LocalDateTime mo6179() {
        LocalDateTime localDateTimeM5810;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 87 || (localDateTimeM5810 = AbstractC2865.m5810(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 15;
        return localDateTimeM5810;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final LocalDateTime mo6180() {
        LocalDateTime localDateTimeM5808;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 89 || (localDateTimeM5808 = AbstractC2865.m5808(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 17;
        return localDateTimeM5808;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲 */
    public final LocalDate mo6181() {
        int i;
        int i2 = this.f9192;
        int i3 = i2 + 1;
        byte[] bArr = this.f9240;
        byte b = bArr[i2];
        if (b == -87 && (i = i2 + 4) < this.f9239) {
            short sM5653 = AbstractC2848.m5653(bArr, i3);
            byte bM5695 = AbstractC2848.m5695(bArr, i2 + 3);
            byte bM56952 = AbstractC2848.m5695(bArr, i);
            this.f9192 = i2 + 5;
            return LocalDate.of(sM5653, bM5695, bM56952);
        }
        if (b == -81) {
            this.f9192 = i3;
            return null;
        }
        if (b == -88) {
            return mo6176().toLocalDate();
        }
        if (b == -86) {
            return mo6196().toLocalDate();
        }
        if (b >= 73 && b <= 120) {
            int iMo6136 = mo6136();
            switch (iMo6136) {
                case 8:
                    return mo6183();
                case 9:
                    return mo6184();
                case 10:
                    return mo6185();
                case 11:
                    return mo6186();
                default:
                    if (bArr[this.f9192 + iMo6136] == 90) {
                        return mo6196().toInstant().atZone(this.f9199.m6351()).toLocalDate();
                    }
                    StringBuilder sbM148 = AbstractC0053.m148(iMo6136, "TODO : ", ", ");
                    sbM148.append(mo6139());
                    throw new JSONException(sbM148.toString());
            }
        }
        if (b == 122 || b == 121) {
            this.f9234 = b;
            this.f9192 = i3;
            int iM6233 = m6233();
            this.f9238 = iM6233;
            switch (iM6233) {
                case 8:
                    return mo6183();
                case 9:
                    return mo6184();
                case 10:
                    return mo6185();
                case 11:
                    return mo6186();
            }
        }
        throw m6223(b);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final LocalDate mo6183() {
        LocalDate localDateM5822;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 81 || (localDateM5822 = AbstractC2865.m5822(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 9;
        return localDateM5822;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final LocalDate mo6184() {
        LocalDate localDateM5820;
        int i = this.f9192;
        byte[] bArr = this.f9240;
        if (bArr[i] != 82 || (localDateM5820 = AbstractC2865.m5820(bArr, i + 1)) == null) {
            C0276.m849("date only support string input");
            return null;
        }
        this.f9192 += 10;
        return localDateM5820;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final LocalDate mo6185() {
        LocalDate localDateM5826;
        byte b = this.f9234;
        byte[] bArr = this.f9240;
        if ((b == 121 || b == 122) && this.f9238 == 10) {
            localDateM5826 = AbstractC2865.m5826(bArr, this.f9192);
        } else {
            int i = this.f9192;
            if (bArr[i] != 83 || (localDateM5826 = AbstractC2865.m5826(bArr, i + 1)) == null) {
                C0276.m849("date only support string input");
                return null;
            }
        }
        this.f9192 += 11;
        return localDateM5826;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final LocalDate mo6186() {
        LocalDate localDateM5817;
        byte b = this.f9234;
        byte[] bArr = this.f9240;
        if ((b == 121 || b == 122) && this.f9238 == 11) {
            localDateM5817 = AbstractC2865.m5817(bArr, this.f9192);
        } else {
            int i = this.f9192;
            if (bArr[i] != 84 || (localDateM5817 = AbstractC2865.m5817(bArr, i + 1)) == null) {
                C0276.m849("date only support string input");
                return null;
            }
        }
        this.f9192 += 12;
        return localDateM5817;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏世兰子哲 */
    public final int mo6187() {
        int i = this.f9192;
        this.f9192 = i + 1;
        byte b = this.f9240[i];
        this.f9237 = b;
        if (b == -81) {
            return -1;
        }
        if (b >= -108 && b <= -93) {
            this.f9191 = (char) (-b);
            return b - (-108);
        }
        if (b == -111) {
            return mo6167();
        }
        if (b == -92) {
            return mo6167();
        }
        C0276.m849("array not support input ".concat(m6237(b)));
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲兰子 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6188() {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6188():void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰 */
    public final void mo6189() {
        int i = this.f9192;
        int i2 = i + 1;
        this.f9192 = i2;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        this.f9234 = b;
        if (b >= 73 && b <= 120) {
            this.f9192 = (b - 73) + i2;
            return;
        }
        if (b == 121 || b == 122 || b == 123 || b == 124 || b == 125) {
            int iM6233 = m6233();
            this.f9238 = iM6233;
            this.f9192 += iM6233;
        } else {
            if (b != 127) {
                throw m6223(b);
            }
            byte b2 = bArr[i2];
            if (b2 >= -16 && b2 <= 72) {
                mo6167();
            } else {
                mo6139();
                mo6167();
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲 */
    public final void mo6190() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏世子哲兰 */
    public final void mo6191(C0966 c0966) {
        this.f9192 = c0966.f2755;
        this.f9237 = (byte) c0966.f2754;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰哲子世, reason: contains not printable characters */
    public final long m6236() {
        byte[] bArr;
        long j;
        long j2;
        int i = this.f9233;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f9238;
            bArr = this.f9240;
            if (i3 < i4) {
                byte b = bArr[i];
                if (b >= 0 && i3 < 8 && (i3 != 0 || bArr[this.f9233] != 0)) {
                    switch (i3) {
                        case 0:
                            j3 = b;
                            continue;
                            i3++;
                            i++;
                            break;
                        case 1:
                            j = b << 8;
                            j2 = 255;
                            break;
                        case 2:
                            j = b << 16;
                            j2 = 65535;
                            break;
                        case 3:
                            j = b << 24;
                            j2 = 16777215;
                            break;
                        case 4:
                            j = ((long) b) << 32;
                            j2 = 4294967295L;
                            break;
                        case 5:
                            j = ((long) b) << 40;
                            j2 = 1099511627775L;
                            break;
                        case 6:
                            j = ((long) b) << 48;
                            j2 = 281474976710655L;
                            break;
                        case 7:
                            j = ((long) b) << 56;
                            j2 = 72057594037927935L;
                            break;
                        default:
                            i3++;
                            i++;
                            break;
                    }
                    j3 = (j3 & j2) + j;
                    i3++;
                    i++;
                }
            }
        }
        i = this.f9233;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = -3750763034362895579L;
        while (i2 < this.f9238) {
            j4 = (j4 ^ ((long) bArr[i])) * 1099511628211L;
            i2++;
            i++;
        }
        return j4;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子, reason: contains not printable characters */
    public final String m6237(byte b) {
        String strMo6139;
        StringBuilder sb = new StringBuilder();
        sb.append(InterfaceC2911.m6299(b));
        if (mo6133()) {
            int i = this.f9192;
            this.f9192 = i - 1;
            try {
                strMo6139 = mo6139();
            } catch (Throwable unused) {
                strMo6139 = null;
            }
            if (strMo6139 != null) {
                sb.append(' ');
                sb.append(strMo6139);
            }
            this.f9192 = i;
        }
        sb.append(", offset ");
        sb.append(this.f9192);
        sb.append('/');
        sb.append(this.f9240.length);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02bc  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏子世兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo6194() {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6194():long");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰世哲 */
    public final ZonedDateTime mo6196() {
        ZoneId zoneIdM6351;
        int i = this.f9192;
        int i2 = i + 1;
        this.f9192 = i2;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -86) {
            int i3 = (bArr[i2] << 8) + (bArr[i + 2] & DefaultClassResolver.NAME);
            byte b2 = bArr[i + 3];
            byte b3 = bArr[i + 4];
            byte b4 = bArr[i + 5];
            byte b5 = bArr[i + 6];
            byte b6 = bArr[i + 7];
            this.f9192 = i + 8;
            LocalDateTime localDateTimeOf = LocalDateTime.of(i3, b2, b3, b4, b5, b6, mo6167());
            if (mo6199() == -4800907791268808639L) {
                zoneIdM6351 = AbstractC2865.f9024;
            } else {
                String strMo6055 = mo6055();
                zoneIdM6351 = this.f9199.m6351();
                if (!zoneIdM6351.getId().equals(strMo6055)) {
                    zoneIdM6351 = AbstractC2865.m5811(strMo6055, AbstractC2865.f9024);
                }
            }
            return ZonedDateTime.ofLocal(localDateTimeOf, zoneIdM6351, null);
        }
        if (b == -88) {
            int i4 = i + 2;
            this.f9192 = i4;
            int i5 = bArr[i2] << 8;
            int i6 = i + 3;
            this.f9192 = i6;
            int i7 = i5 + (bArr[i4] & DefaultClassResolver.NAME);
            int i8 = i + 4;
            this.f9192 = i8;
            byte b7 = bArr[i6];
            int i9 = i + 5;
            this.f9192 = i9;
            byte b8 = bArr[i8];
            int i10 = i + 6;
            this.f9192 = i10;
            byte b9 = bArr[i9];
            int i11 = i + 7;
            this.f9192 = i11;
            byte b10 = bArr[i10];
            this.f9192 = i + 8;
            return ZonedDateTime.of(LocalDateTime.of(i7, b7, b8, b9, b10, bArr[i11], mo6167()), AbstractC2865.f9025);
        }
        if (b == -87) {
            int i12 = i + 2;
            this.f9192 = i12;
            int i13 = bArr[i2] << 8;
            int i14 = i + 3;
            this.f9192 = i14;
            int i15 = i13 + (bArr[i12] & DefaultClassResolver.NAME);
            int i16 = i + 4;
            this.f9192 = i16;
            byte b11 = bArr[i14];
            this.f9192 = i + 5;
            return ZonedDateTime.of(LocalDate.of(i15, b11, bArr[i16]), LocalTime.MIN, AbstractC2865.f9025);
        }
        int i17 = this.f9239;
        if (b != -66) {
            switch (b) {
                case -85:
                    break;
                case -84:
                    m6226(i2, i17);
                    long jM5692 = AbstractC2848.m5692(bArr, i2);
                    this.f9192 += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(jM5692), AbstractC2865.f9025);
                case -83:
                    m6226(i2, i17);
                    long jM56922 = AbstractC2848.m5692(bArr, i2);
                    this.f9192 += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(jM56922 * 60), AbstractC2865.f9025);
                case -82:
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(mo6164(), mo6167()), AbstractC2865.f9025);
                case -81:
                    return null;
                default:
                    if (b < 73 || b > 120) {
                        throw m6223(b);
                    }
                    this.f9192 = i;
                    return mo6197(b - 73);
            }
        }
        m6227(i2, i17);
        long jM5685 = AbstractC2848.m5685(bArr, i2);
        this.f9192 += 8;
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(jM5685), AbstractC2865.f9025);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世 */
    public final ZonedDateTime mo6197(int i) {
        ZonedDateTime zonedDateTimeM5836;
        int i2 = this.f9192;
        byte[] bArr = this.f9240;
        byte b = bArr[i2];
        this.f9237 = b;
        if (b < 73 || b > 120) {
            C0276.m849("date only support string input");
            return null;
        }
        if (i < 19 || (zonedDateTimeM5836 = AbstractC2865.m5836(bArr, i2 + 1, i, (ZoneId) this.f9199.f9317)) == null) {
            C0276.m840(mo6139(), "illegal LocalDateTime string : ");
            return null;
        }
        this.f9192 = i + 1 + this.f9192;
        return zonedDateTimeM5836;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰 */
    public final UUID mo6198() {
        int i = this.f9192;
        int i2 = i + 1;
        this.f9192 = i2;
        byte[] bArr = this.f9240;
        byte b = bArr[i];
        if (b == -111) {
            this.f9192 = i + 2;
            byte b2 = bArr[i2];
            if (b2 != 16 && i + 17 >= this.f9239) {
                C0276.m849(AbstractC6136.m11556(b2, "uuid not support "));
                return null;
            }
            UUID uuid = new UUID(AbstractC2848.m5685(bArr, this.f9192), AbstractC2848.m5685(bArr, this.f9192 + 8));
            this.f9192 += 16;
            return uuid;
        }
        if (b == -81) {
            return null;
        }
        if (b == 105) {
            UUID uuidM6206 = C2901.m6206(bArr, i2);
            this.f9192 += 32;
            return uuidM6206;
        }
        if (b == 109) {
            if (bArr[i + 9] != 45 || bArr[i + 14] != 45 || bArr[i + 19] != 45 || bArr[i + 24] != 45) {
                C0276.m849("Invalid UUID string:  ".concat(new String(bArr, i2, 36, StandardCharsets.ISO_8859_1)));
                return null;
            }
            UUID uuidM6209 = C2901.m6209(bArr, i2);
            this.f9192 += 36;
            return uuidM6209;
        }
        if (b != 121 && b != 122) {
            throw m6223(b);
        }
        int iM6233 = m6233();
        if (iM6233 == 32) {
            UUID uuidM62062 = C2901.m6206(bArr, this.f9192);
            this.f9192 += 32;
            return uuidM62062;
        }
        if (iM6233 == 36) {
            int i3 = this.f9192;
            if (bArr[i3 + 8] == 45 && bArr[i3 + 13] == 45 && bArr[i3 + 18] == 45 && bArr[i3 + 23] == 45) {
                UUID uuidM62092 = C2901.m6209(bArr, i3);
                this.f9192 += 36;
                return uuidM62092;
            }
        }
        C0276.m849("Invalid UUID string:  ".concat(new String(bArr, this.f9192, iM6233, StandardCharsets.UTF_8)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0302 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d A[RETURN] */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo6199() {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6199():long");
    }
}
