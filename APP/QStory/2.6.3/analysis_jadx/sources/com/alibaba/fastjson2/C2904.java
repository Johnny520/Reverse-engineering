package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.compose.foundation.text.C0966;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.reader.C2707;
import com.alibaba.fastjson2.reader.C2708;
import com.alibaba.fastjson2.reader.C2711;
import com.alibaba.fastjson2.reader.C2729;
import com.alibaba.fastjson2.reader.C2796;
import com.alibaba.fastjson2.reader.C2802;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.AbstractC2867;
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
import lin.xposed.hook.javaplugin.C5554;
import p009.AbstractC6183;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2904 extends AbstractC2899 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final byte[] f9229;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static Charset f9231;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f9233;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f9234;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f9235;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public byte f9236;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C2911 f9237;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public byte[] f9238;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public byte f9239;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f9240;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int f9241;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final byte[] f9242;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public byte f9243;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f9244;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public long[] f9245;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static final long f9232 = AbstractC2854.f8921.arrayBaseOffset(byte[].class);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static final byte[] f9230 = InterfaceC2912.m6355("Asia/Shanghai");

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
        f9229 = bArr;
    }

    public C2904(int i, C2943 c2943, byte[] bArr) {
        super(c2943, true);
        this.f9242 = bArr;
        this.f9194 = 0;
        this.f9241 = i;
        C2911[] c2911Arr = AbstractC2933.f9299;
        this.f9237 = c2911Arr[System.identityHashCode(Thread.currentThread()) & (c2911Arr.length - 1)];
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰世哲子, reason: contains not printable characters */
    public static int m6266(int i, byte[] bArr, int i2) {
        return ((i2 + 48) << 8) + (bArr[i] & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲, reason: contains not printable characters */
    public static int m6267(int i, byte[] bArr, int i2) {
        return ((i2 + 60) << 16) + (AbstractC2849.m5698(bArr, i) & 65535);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰哲世子, reason: contains not printable characters */
    public static JSONException m6268(byte b) {
        return new JSONException("name not support input : " + InterfaceC2912.m6357(b));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰子世哲, reason: contains not printable characters */
    public static int m6269(int i, byte[] bArr, int i2) {
        return ((i2 - 68) << 16) + (AbstractC2849.m5698(bArr, i) & 65535);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰子哲世, reason: contains not printable characters */
    public static int m6270(int i, byte[] bArr, int i2) {
        return ((i2 - 56) << 8) + (bArr[i] & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲世兰子, reason: contains not printable characters */
    public static void m6271(int i, int i2) {
        if (i + 3 < i2) {
            return;
        }
        C0276.m850(AbstractC6183.m11591(i, i2, "offset overflow, offset ", ", end "));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲兰子世, reason: contains not printable characters */
    public static void m6272(int i, int i2) {
        if (i + 7 < i2) {
            return;
        }
        C0276.m850(AbstractC6183.m11591(i, i2, "offset overflow, offset ", ", end "));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = this.f9238;
        if (bArr == null || bArr.length >= 8388608) {
            return;
        }
        AbstractC2933.f9290.lazySet(this.f9237, bArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final int mo6099() {
        byte b = this.f9242[this.f9194];
        this.f9239 = b;
        if (b >= 73 && b < 120) {
            return b - 73;
        }
        C5554.m10882();
        return 0;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final String mo6100() {
        Charset charset;
        byte b = this.f9236;
        int i = this.f9240;
        if (b == -81) {
            return null;
        }
        if (i < 0) {
            throw null;
        }
        byte[] bArr = this.f9242;
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
                    throw m6268(b);
                }
                charset = StandardCharsets.UTF_16BE;
            }
        } else {
            if (AbstractC2854.f8923 != null) {
                return AbstractC2854.m5769(this.f9235, bArr, i);
            }
            BiFunction biFunction = AbstractC2854.f8922;
            if (biFunction != null) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, this.f9235, bArr2, 0, i);
                return (String) biFunction.apply(bArr2, (byte) 0);
            }
            charset = StandardCharsets.ISO_8859_1;
        }
        return new String(bArr, this.f9235, i, charset);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final String mo6104() {
        return mo6100();
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final long mo6106() {
        byte[] bArr;
        long j;
        long j2;
        int i = this.f9235;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f9240;
            bArr = this.f9242;
            if (i3 < i4) {
                byte b = bArr[i];
                if (b >= 0 && i3 < 8 && (i3 != 0 || bArr[this.f9235] != 0)) {
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
        i = this.f9235;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = -3750763034362895579L;
        while (i2 < this.f9240) {
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

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final boolean mo6108() {
        this.f9196 = false;
        int i = this.f9194;
        this.f9194 = i + 1;
        byte b = this.f9242[i];
        if (b == -79) {
            return true;
        }
        if (b == -80) {
            return false;
        }
        return m6276(b);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final char mo6109() {
        int iMo6212;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -112) {
            this.f9194 = i + 1;
            iMo6212 = mo6212();
        } else {
            if (b == 73) {
                this.f9194 = i + 1;
                return (char) 0;
            }
            if (b <= 73 || b >= 120) {
                String strMo6184 = mo6184();
                if (strMo6184 == null || strMo6184.isEmpty()) {
                    return (char) 0;
                }
                return strMo6184.charAt(0);
            }
            this.f9194 = i + 2;
            iMo6212 = bArr[i + 1] & DefaultClassResolver.NAME;
        }
        return (char) iMo6212;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public final BigInteger mo6110() {
        int i = this.f9194;
        int i2 = i + 1;
        this.f9194 = i2;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -70) {
            return BigInteger.valueOf(mo6209());
        }
        if (b == -69) {
            int iMo6212 = mo6212();
            byte[] bArr2 = new byte[iMo6212];
            System.arraycopy(bArr, this.f9194, bArr2, 0, iMo6212);
            this.f9194 += iMo6212;
            return new BigInteger(bArr2);
        }
        if (b == -111) {
            int iMo62122 = mo6212();
            byte[] bArr3 = new byte[iMo62122];
            System.arraycopy(bArr, this.f9194, bArr3, 0, iMo62122);
            this.f9194 += iMo62122;
            return new BigInteger(bArr3);
        }
        if (b == -71) {
            int iMo62123 = mo6212();
            BigInteger bigIntegerMo6110 = mo6110();
            return (iMo62123 == 0 ? new BigDecimal(bigIntegerMo6110) : new BigDecimal(bigIntegerMo6110, iMo62123)).toBigInteger();
        }
        int i3 = this.f9241;
        if (b != 72) {
            if (b == 124) {
                int iMo62124 = mo6212();
                String str = new String(bArr, this.f9194, iMo62124, StandardCharsets.UTF_16LE);
                this.f9194 += iMo62124;
                return str.indexOf(46) == -1 ? new BigInteger(str) : AbstractC2867.m5913(str).toBigInteger();
            }
            if (b == 121) {
                int iMo62125 = mo6212();
                String str2 = new String(bArr, this.f9194, iMo62125, StandardCharsets.ISO_8859_1);
                this.f9194 += iMo62125;
                return str2.indexOf(46) == -1 ? new BigInteger(str2) : AbstractC2867.m5913(str2).toBigInteger();
            }
            if (b == 122) {
                int iMo62126 = mo6212();
                String str3 = new String(bArr, this.f9194, iMo62126, StandardCharsets.UTF_8);
                this.f9194 += iMo62126;
                return str3.indexOf(46) == -1 ? new BigInteger(str3) : AbstractC2867.m5913(str3).toBigInteger();
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
                    return BigInteger.valueOf(mo6209());
                case -75:
                    m6272(i2, i3);
                    long jM5730 = AbstractC2849.m5730(bArr, i2);
                    this.f9194 += 8;
                    return BigInteger.valueOf((long) Double.longBitsToDouble(jM5730));
                case -74:
                    return BigInteger.valueOf(mo6212());
                case -73:
                    m6271(i2, i3);
                    int iM5737 = AbstractC2849.m5737(bArr, i2);
                    this.f9194 += 4;
                    return BigInteger.valueOf((long) Float.intBitsToFloat(iM5737));
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9194 = i + 3;
                            return BigInteger.valueOf(i4);
                        case -67:
                            this.f9194 = i + 2;
                            return BigInteger.valueOf(bArr[i2]);
                        case -66:
                            m6272(i2, i3);
                            long jM57302 = AbstractC2849.m5730(bArr, i2);
                            this.f9194 += 8;
                            return BigInteger.valueOf(jM57302);
                        case -65:
                            break;
                        default:
                            if (InterfaceC2912.m6361(b)) {
                                return BigInteger.valueOf(b);
                            }
                            if (InterfaceC2912.m6356(b)) {
                                this.f9194 = this.f9194 + 1;
                                return BigInteger.valueOf(m6270(r0, bArr, b));
                            }
                            if (InterfaceC2912.m6353(b)) {
                                int i5 = this.f9194;
                                if (i5 + 1 < i3) {
                                    int iM6269 = m6269(i5, bArr, b);
                                    this.f9194 += 2;
                                    return BigInteger.valueOf(iM6269);
                                }
                            }
                            if (InterfaceC2912.m6359(b)) {
                                return BigInteger.valueOf(b + 32);
                            }
                            if (InterfaceC2912.m6358(b)) {
                                this.f9194 = this.f9194 + 1;
                                return BigInteger.valueOf(m6266(r0, bArr, b));
                            }
                            if (InterfaceC2912.m6354(b)) {
                                int i6 = this.f9194;
                                if (i6 + 1 < i3) {
                                    int iM6267 = m6267(i6, bArr, b);
                                    this.f9194 += 2;
                                    return BigInteger.valueOf(iM6267);
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6268(b);
                            }
                            int i7 = b - 73;
                            String strM6275 = m6275(i7);
                            this.f9194 += i7;
                            return new BigInteger(strM6275);
                    }
                    break;
            }
        }
        m6271(i2, i3);
        int iM57372 = AbstractC2849.m5737(bArr, i2);
        this.f9194 += 4;
        return BigInteger.valueOf(iM57372);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public final BigDecimal mo6111() {
        int i = this.f9194;
        int i2 = i + 1;
        this.f9194 = i2;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        int i3 = this.f9241;
        if (b == -71) {
            int iMo6212 = mo6212();
            int i4 = this.f9194;
            byte b2 = bArr[i4];
            if (b2 == -70) {
                this.f9194 = i4 + 1;
                return BigDecimal.valueOf(mo6209(), iMo6212);
            }
            if (b2 == 72) {
                m6271(i4 + 1, i3);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(AbstractC2849.m5737(bArr, r1), iMo6212);
                this.f9194 += 5;
                return bigDecimalValueOf;
            }
            if (b2 != -66) {
                BigInteger bigIntegerMo6110 = mo6110();
                return iMo6212 == 0 ? new BigDecimal(bigIntegerMo6110) : new BigDecimal(bigIntegerMo6110, iMo6212);
            }
            int i5 = i4 + 1;
            m6272(i5, i3);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(AbstractC2849.m5730(bArr, i5), iMo6212);
            this.f9194 += 9;
            return bigDecimalValueOf2;
        }
        if (b == -72) {
            return BigDecimal.valueOf(mo6209());
        }
        if (b != 72) {
            if (b == 124) {
                int iMo62122 = mo6212();
                String str = new String(bArr, this.f9194, iMo62122, StandardCharsets.UTF_16LE);
                this.f9194 += iMo62122;
                return AbstractC2867.m5913(str);
            }
            if (b == 121) {
                int iMo62123 = mo6212();
                String str2 = new String(bArr, this.f9194, iMo62123, StandardCharsets.ISO_8859_1);
                this.f9194 += iMo62123;
                return AbstractC2867.m5913(str2);
            }
            if (b == 122) {
                int iMo62124 = mo6212();
                String str3 = new String(bArr, this.f9194, iMo62124, StandardCharsets.UTF_8);
                this.f9194 += iMo62124;
                return AbstractC2867.m5913(str3);
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
                    return BigDecimal.valueOf(mo6209());
                case -75:
                    m6272(i2, i3);
                    long jM5730 = AbstractC2849.m5730(bArr, i2);
                    this.f9194 += 8;
                    return BigDecimal.valueOf((long) Double.longBitsToDouble(jM5730));
                case -74:
                    return BigDecimal.valueOf(mo6212());
                case -73:
                    m6271(i2, i3);
                    int iM5737 = AbstractC2849.m5737(bArr, i2);
                    this.f9194 += 4;
                    return BigDecimal.valueOf((long) Float.intBitsToFloat(iM5737));
                default:
                    switch (b) {
                        case -69:
                            return new BigDecimal(mo6110());
                        case -68:
                            int i6 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9194 = i + 3;
                            return BigDecimal.valueOf(i6);
                        case -67:
                            this.f9194 = i + 2;
                            return BigDecimal.valueOf(bArr[i2]);
                        case -66:
                            m6272(i2, i3);
                            long jM57302 = AbstractC2849.m5730(bArr, i2);
                            this.f9194 += 8;
                            return BigDecimal.valueOf(jM57302);
                        case -65:
                            break;
                        default:
                            if (InterfaceC2912.m6361(b)) {
                                return BigDecimal.valueOf(b);
                            }
                            if (InterfaceC2912.m6356(b)) {
                                this.f9194 = this.f9194 + 1;
                                return BigDecimal.valueOf(m6270(r0, bArr, b));
                            }
                            if (InterfaceC2912.m6353(b)) {
                                int i7 = this.f9194;
                                if (i7 + 1 < i3) {
                                    int iM6269 = m6269(i7, bArr, b);
                                    this.f9194 += 2;
                                    return BigDecimal.valueOf(iM6269);
                                }
                            }
                            if (InterfaceC2912.m6359(b)) {
                                return BigDecimal.valueOf(b + 32);
                            }
                            if (InterfaceC2912.m6358(b)) {
                                this.f9194 = this.f9194 + 1;
                                return BigDecimal.valueOf(m6266(r0, bArr, b));
                            }
                            if (InterfaceC2912.m6354(b)) {
                                int i8 = this.f9194;
                                if (i8 + 1 < i3) {
                                    int iM6267 = m6267(i8, bArr, b);
                                    this.f9194 += 2;
                                    return BigDecimal.valueOf(iM6267);
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6268(b);
                            }
                            int i9 = b - 73;
                            String strM6275 = m6275(i9);
                            this.f9194 += i9;
                            return AbstractC2867.m5913(strM6275);
                    }
                    break;
            }
        }
        m6271(i2, i3);
        int iM57372 = AbstractC2849.m5737(bArr, i2);
        this.f9194 += 4;
        return BigDecimal.valueOf(iM57372);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public final Boolean mo6112() {
        int i = this.f9194;
        this.f9194 = i + 1;
        byte b = this.f9242[i];
        if (b == -81) {
            return null;
        }
        return b == -79 ? Boolean.TRUE : b == -80 ? Boolean.FALSE : Boolean.valueOf(m6276(b));
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public final byte[] mo6113() {
        int i = this.f9194;
        this.f9194 = i + 1;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b != -111) {
            throw m6268(b);
        }
        int iM6278 = m6278();
        byte[] bArr2 = new byte[iM6278];
        System.arraycopy(bArr, this.f9194, bArr2, 0, iM6278);
        this.f9194 += iM6278;
        return bArr2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏 */
    public final float mo6114() {
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != -73) {
            return m6279();
        }
        int i2 = i + 1;
        m6271(i2, this.f9241);
        int iM5737 = AbstractC2849.m5737(bArr, i2);
        this.f9194 = i + 5;
        return Float.intBitsToFloat(iM5737);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪 */
    public final byte[] mo6115() {
        String strMo6184 = mo6184();
        int length = strMo6184.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char cCharAt = strMo6184.charAt(i2);
            char cCharAt2 = strMo6184.charAt(i2 + 1);
            char c = '7';
            int i3 = cCharAt - (cCharAt <= '9' ? '0' : '7');
            if (cCharAt2 <= '9') {
                c = '0';
            }
            bArr[i] = (byte) ((cCharAt2 - c) | (i3 << 4));
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public final Float mo6117() {
        int i = this.f9194;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -73) {
            int i2 = (bArr[i + 4] & DefaultClassResolver.NAME) + ((bArr[i + 3] & DefaultClassResolver.NAME) << 8) + ((bArr[i + 2] & DefaultClassResolver.NAME) << 16) + (bArr[i + 1] << 24);
            this.f9194 = i + 5;
            return Float.valueOf(Float.intBitsToFloat(i2));
        }
        if (b != -81) {
            return Float.valueOf(m6279());
        }
        this.f9194 = i + 1;
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public final Instant mo6118() {
        int i = this.f9194;
        int i2 = i + 1;
        this.f9194 = i2;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        int i3 = this.f9241;
        if (b != -66) {
            switch (b) {
                case -85:
                    break;
                case -84:
                    m6271(i2, i3);
                    long jM5737 = AbstractC2849.m5737(bArr, i2);
                    this.f9194 += 4;
                    return Instant.ofEpochSecond(jM5737, 0L);
                case -83:
                    m6271(i2, i3);
                    long jM57372 = AbstractC2849.m5737(bArr, i2);
                    this.f9194 += 4;
                    return Instant.ofEpochSecond(jM57372 * 60, 0L);
                case -82:
                    return Instant.ofEpochSecond(mo6209(), mo6212());
                default:
                    C5554.m10882();
                    return null;
            }
        }
        m6272(i2, i3);
        long jM5730 = AbstractC2849.m5730(bArr, i2);
        this.f9194 += 8;
        return Instant.ofEpochMilli(jM5730);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final boolean mo6119() {
        int i = this.f9194;
        if (this.f9242[i] != -81) {
            return false;
        }
        this.f9194 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public final void mo6120(Map map, long j) {
        Object objMo6194;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != -90) {
            C0276.m850("object not support input ".concat(m6282(this.f9239)));
            return;
        }
        this.f9194 = i + 1;
        long j2 = j | this.f9201.f9320;
        while (true) {
            int i2 = this.f9194;
            byte b = bArr[i2];
            if (b == -91) {
                this.f9194 = i2 + 1;
                return;
            }
            Object objMo6126 = b >= 73 ? mo6126() : mo6124();
            if (mo6180()) {
                String strMo6189 = mo6189();
                if ("..".equals(strMo6189)) {
                    map.put(objMo6126, map);
                } else {
                    m6153(map, objMo6126, AbstractC2922.m6378(strMo6189));
                    map.put(objMo6126, null);
                }
            } else {
                byte b2 = bArr[this.f9194];
                if (b2 >= 73 && b2 <= 126) {
                    objMo6194 = mo6184();
                } else if (InterfaceC2912.m6361(b2)) {
                    this.f9194++;
                    objMo6194 = Integer.valueOf(b2);
                } else if (b2 == -79) {
                    this.f9194++;
                    objMo6194 = Boolean.TRUE;
                } else if (b2 == -80) {
                    this.f9194++;
                    objMo6194 = Boolean.FALSE;
                } else {
                    objMo6194 = b2 == -90 ? mo6194() : mo6124();
                }
                if (objMo6194 != null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j2) == 0) {
                    map.put(objMo6126, objMo6194);
                }
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public final List mo6122(Type type) {
        if (mo6133()) {
            return null;
        }
        if (this.f9242[this.f9194] == -110) {
            Object objMo6124 = mo6124();
            if (objMo6124 instanceof List) {
                return (List) objMo6124;
            }
            if (objMo6124 instanceof Collection) {
                return new JSONArray((Collection<?>) objMo6124);
            }
            C0276.m850(AbstractC2442.m4581(objMo6124, new StringBuilder("not support class ")));
            return null;
        }
        int iMo6232 = mo6232();
        JSONArray jSONArray = new JSONArray(iMo6232);
        for (int i = 0; i < iMo6232; i++) {
            jSONArray.add(mo6139(type));
        }
        return jSONArray;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲 */
    public final Object mo6124() {
        Object objMo6126;
        String str;
        String str2;
        Object objMo6194;
        String str3;
        String str4;
        int i = 0;
        int i2 = this.f9194;
        byte[] bArr = this.f9242;
        String str5 = "/";
        if (i2 >= bArr.length) {
            throw new JSONException("readAny overflow : " + this.f9194 + "/" + bArr.length);
        }
        int i3 = i2 + 1;
        this.f9194 = i3;
        byte b = bArr[i2];
        this.f9239 = b;
        int i4 = this.f9241;
        if (b == 72) {
            m6271(i3, i4);
            int iM5737 = AbstractC2849.m5737(bArr, i3);
            this.f9194 += 4;
            return Integer.valueOf(iM5737);
        }
        String str6 = ", offset ";
        C2943 c2943 = this.f9201;
        switch (b) {
            case -112:
                return Character.valueOf((char) mo6212());
            case -111:
                int iM6278 = m6278();
                int i5 = this.f9194;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i5 + iM6278);
                this.f9194 += iM6278;
                return bArrCopyOfRange;
            case -110:
                long jMo6239 = mo6239();
                c2943.getClass();
                if ((c2943.f9320 & JSONReader$Feature.SupportAutoType.mask) == 0) {
                    if (mo6177()) {
                        return mo6194();
                    }
                    if (mo6169()) {
                        return mo6125();
                    }
                    throw new JSONException("autoType not support , offset " + this.f9194 + "/" + bArr.length);
                }
                InterfaceC2788 interfaceC2788M5630 = ((C2802) c2943.f9318).m5630(jMo6239);
                if (interfaceC2788M5630 == null) {
                    String strMo6100 = mo6100();
                    InterfaceC2788 interfaceC2788M6410 = c2943.m6410(null, strMo6100);
                    if (interfaceC2788M6410 == null) {
                        StringBuilder sbM11585 = AbstractC6183.m11585("autoType not support : ", strMo6100, ", offset ");
                        sbM11585.append(this.f9194);
                        sbM11585.append("/");
                        sbM11585.append(bArr.length);
                        throw new JSONException(sbM11585.toString());
                    }
                    interfaceC2788M5630 = interfaceC2788M6410;
                }
                return interfaceC2788M5630.mo5467(this, null, null, 0L);
            default:
                boolean z = true;
                switch (b) {
                    case -90:
                        boolean z2 = (c2943.f9320 & JSONReader$Feature.SupportAutoType.mask) != 0;
                        Map map = null;
                        while (true) {
                            int i6 = this.f9194;
                            byte b2 = bArr[i6];
                            if (b2 == -91) {
                                this.f9194 = i6 + 1;
                                return map == null ? (c2943.f9320 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new HashMap() : new JSONObject() : map;
                            }
                            if (!z2 || i != 0 || b2 < 73) {
                                objMo6126 = b2 >= 73 ? mo6126() : mo6124();
                            } else {
                                if (mo6129() == InterfaceC2788.f8586) {
                                    InterfaceC2788 interfaceC2788M56302 = ((C2802) c2943.f9318).m5630(mo6244());
                                    if (interfaceC2788M56302 == null) {
                                        String strMo61002 = mo6100();
                                        InterfaceC2788 interfaceC2788M64102 = c2943.m6410(null, strMo61002);
                                        if (interfaceC2788M64102 == null) {
                                            StringBuilder sbM115852 = AbstractC6183.m11585("autoType not support : ", strMo61002, str6);
                                            sbM115852.append(this.f9194);
                                            sbM115852.append(str5);
                                            sbM115852.append(bArr.length);
                                            throw new JSONException(sbM115852.toString());
                                        }
                                        interfaceC2788M56302 = interfaceC2788M64102;
                                    }
                                    this.f9180 = z;
                                    return interfaceC2788M56302.mo5467(this, null, null, 0L);
                                }
                                objMo6126 = mo6100();
                            }
                            if (map == null) {
                                str2 = str6;
                                str = str5;
                                map = (JSONReader$Feature.UseNativeObject.mask & c2943.f9320) != 0 ? new HashMap() : new JSONObject();
                            } else {
                                str = str5;
                                str2 = str6;
                            }
                            if (mo6180()) {
                                String strMo6189 = mo6189();
                                if ("..".equals(strMo6189)) {
                                    map.put(objMo6126, map);
                                } else {
                                    m6153(map, objMo6126, AbstractC2922.m6378(strMo6189));
                                    map.put(objMo6126, null);
                                }
                                z = true;
                            } else {
                                byte b3 = bArr[this.f9194];
                                if (b3 >= 73 && b3 <= 126) {
                                    objMo6194 = mo6184();
                                    z = true;
                                } else if (InterfaceC2912.m6361(b3)) {
                                    z = true;
                                    this.f9194++;
                                    objMo6194 = Integer.valueOf(b3);
                                } else {
                                    z = true;
                                    if (b3 == -79) {
                                        this.f9194++;
                                        objMo6194 = Boolean.TRUE;
                                    } else if (b3 == -80) {
                                        this.f9194++;
                                        objMo6194 = Boolean.FALSE;
                                    } else {
                                        objMo6194 = b3 == -90 ? mo6194() : mo6124();
                                    }
                                }
                                if (objMo6194 != null || (c2943.f9320 & JSONReader$Feature.IgnoreNullPropertyValue.mask) == 0) {
                                    map.put(objMo6126, objMo6194);
                                }
                            }
                            i++;
                            str6 = str2;
                            str5 = str;
                        }
                        break;
                    case -89:
                        int i7 = i2 + 2;
                        this.f9194 = i7;
                        byte b4 = bArr[i3];
                        int i8 = i2 + 3;
                        this.f9194 = i8;
                        byte b5 = bArr[i7];
                        this.f9194 = i2 + 4;
                        return LocalTime.of(b4, b5, bArr[i8], mo6212());
                    case -88:
                        int i9 = i2 + 2;
                        this.f9194 = i9;
                        int i10 = bArr[i3] << 8;
                        int i11 = i2 + 3;
                        this.f9194 = i11;
                        int i12 = i10 + (bArr[i9] & DefaultClassResolver.NAME);
                        int i13 = i2 + 4;
                        this.f9194 = i13;
                        byte b6 = bArr[i11];
                        int i14 = i2 + 5;
                        this.f9194 = i14;
                        byte b7 = bArr[i13];
                        int i15 = i2 + 6;
                        this.f9194 = i15;
                        byte b8 = bArr[i14];
                        int i16 = i2 + 7;
                        this.f9194 = i16;
                        byte b9 = bArr[i15];
                        this.f9194 = i2 + 8;
                        return LocalDateTime.of(i12, b6, b7, b8, b9, bArr[i16], mo6212());
                    case -87:
                        int i17 = i2 + 2;
                        this.f9194 = i17;
                        int i18 = bArr[i3] << 8;
                        int i19 = i2 + 3;
                        this.f9194 = i19;
                        int i20 = i18 + (bArr[i17] & DefaultClassResolver.NAME);
                        int i21 = i2 + 4;
                        this.f9194 = i21;
                        byte b10 = bArr[i19];
                        this.f9194 = i2 + 5;
                        return LocalDate.of(i20, b10, bArr[i21]);
                    case -86:
                        return m6273();
                    case -85:
                        m6272(i3, i4);
                        long jM5730 = AbstractC2849.m5730(bArr, i3);
                        this.f9194 += 8;
                        return new Date(jM5730);
                    case -84:
                        m6271(i3, i4);
                        long jM5737 = AbstractC2849.m5737(bArr, i3);
                        this.f9194 += 4;
                        return new Date(jM5737 * 1000);
                    case -83:
                        m6271(i3, i4);
                        long jM57372 = AbstractC2849.m5737(bArr, i3);
                        this.f9194 += 4;
                        return new Date(jM57372 * 60000);
                    case -82:
                        return Instant.ofEpochSecond(mo6209(), mo6212());
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
                        return Double.valueOf(mo6209());
                    case -75:
                        m6272(i3, i4);
                        long jM57302 = AbstractC2849.m5730(bArr, i3);
                        this.f9194 += 8;
                        return Double.valueOf(Double.longBitsToDouble(jM57302));
                    case -74:
                        return Float.valueOf(mo6212());
                    case -73:
                        m6271(i3, i4);
                        int iM57372 = AbstractC2849.m5737(bArr, i3);
                        this.f9194 += 4;
                        return Float.valueOf(Float.intBitsToFloat(iM57372));
                    case -72:
                        return BigDecimal.valueOf(mo6209());
                    case -71:
                        int iMo6212 = mo6212();
                        BigInteger bigIntegerMo6110 = mo6110();
                        return iMo6212 == 0 ? new BigDecimal(bigIntegerMo6110) : new BigDecimal(bigIntegerMo6110, iMo6212);
                    case -70:
                        return BigInteger.valueOf(mo6209());
                    case -69:
                        int iMo62122 = mo6212();
                        byte[] bArr2 = new byte[iMo62122];
                        System.arraycopy(bArr, this.f9194, bArr2, 0, iMo62122);
                        this.f9194 += iMo62122;
                        return new BigInteger(bArr2);
                    case -68:
                        int i22 = i2 + 2;
                        this.f9194 = i22;
                        int i23 = bArr[i3] << 8;
                        this.f9194 = i2 + 3;
                        return Short.valueOf((short) (i23 + (bArr[i22] & DefaultClassResolver.NAME)));
                    case -67:
                        this.f9194 = i2 + 2;
                        return Byte.valueOf(bArr[i3]);
                    case -66:
                        m6272(i3, i4);
                        long jM57303 = AbstractC2849.m5730(bArr, i3);
                        this.f9194 += 8;
                        return Long.valueOf(jM57303);
                    case -65:
                        m6271(i3, i4);
                        int iM57373 = AbstractC2849.m5737(bArr, i3);
                        this.f9194 += 4;
                        return Long.valueOf(iM57373);
                    default:
                        switch (b) {
                            case 122:
                                int iM62782 = m6278();
                                BiFunction biFunction = AbstractC2854.f8922;
                                if (biFunction != null && !AbstractC2854.f8931) {
                                    if (this.f9238 == null) {
                                        byte[] bArr3 = (byte[]) AbstractC2933.f9290.getAndSet(this.f9237, null);
                                        this.f9238 = bArr3;
                                        if (bArr3 == null) {
                                            this.f9238 = new byte[8192];
                                        }
                                    }
                                    int i24 = iM62782 << 1;
                                    if (i24 > this.f9238.length) {
                                        this.f9238 = new byte[i24];
                                    }
                                    int iM5724 = AbstractC2849.m5724(this.f9194, iM62782, bArr, this.f9238);
                                    if (iM5724 != -1) {
                                        byte[] bArr4 = new byte[iM5724];
                                        System.arraycopy(this.f9238, 0, bArr4, 0, iM5724);
                                        String str7 = (String) biFunction.apply(bArr4, (byte) 1);
                                        this.f9194 += iM62782;
                                        return str7;
                                    }
                                }
                                String str8 = new String(bArr, this.f9194, iM62782, StandardCharsets.UTF_8);
                                this.f9194 += iM62782;
                                return str8;
                            case 123:
                                int iM62783 = m6278();
                                String str9 = new String(bArr, this.f9194, iM62783, StandardCharsets.UTF_16);
                                this.f9194 += iM62783;
                                return str9;
                            case 124:
                                int iM62784 = m6278();
                                BiFunction biFunction2 = AbstractC2854.f8922;
                                if (biFunction2 == null || AbstractC2854.f8931) {
                                    str3 = new String(bArr, this.f9194, iM62784, StandardCharsets.UTF_16LE);
                                } else {
                                    byte[] bArr5 = new byte[iM62784];
                                    System.arraycopy(bArr, this.f9194, bArr5, 0, iM62784);
                                    str3 = (String) biFunction2.apply(bArr5, iM62784 != 0 ? (byte) 1 : (byte) 0);
                                }
                                this.f9194 += iM62784;
                                return str3;
                            case 125:
                                int iM62785 = m6278();
                                BiFunction biFunction3 = AbstractC2854.f8922;
                                if (biFunction3 == null || !AbstractC2854.f8931) {
                                    str4 = new String(bArr, this.f9194, iM62785, StandardCharsets.UTF_16BE);
                                } else {
                                    byte[] bArr6 = new byte[iM62785];
                                    System.arraycopy(bArr, this.f9194, bArr6, 0, iM62785);
                                    str4 = (String) biFunction3.apply(bArr6, iM62785 != 0 ? (byte) 1 : (byte) 0);
                                }
                                this.f9194 += iM62785;
                                return str4;
                            case 126:
                                if (f9231 == null) {
                                    f9231 = Charset.forName("GB18030");
                                }
                                int iM62786 = m6278();
                                String str10 = new String(bArr, this.f9194, iM62786, f9231);
                                this.f9194 += iM62786;
                                return str10;
                            default:
                                if (InterfaceC2912.m6361(b)) {
                                    return Integer.valueOf(b);
                                }
                                if (InterfaceC2912.m6356(b)) {
                                    int i25 = this.f9194;
                                    this.f9194 = i25 + 1;
                                    return Integer.valueOf(m6270(i25, bArr, b));
                                }
                                if (InterfaceC2912.m6353(b)) {
                                    int i26 = this.f9194;
                                    if (i26 + 1 < i4) {
                                        int iM6269 = m6269(i26, bArr, b);
                                        this.f9194 += 2;
                                        return Integer.valueOf(iM6269);
                                    }
                                }
                                if (InterfaceC2912.m6359(b)) {
                                    return Long.valueOf(((long) (b + 40)) - 8);
                                }
                                if (InterfaceC2912.m6358(b)) {
                                    this.f9194 = this.f9194 + 1;
                                    return Long.valueOf(m6266(r0, bArr, b));
                                }
                                if (InterfaceC2912.m6354(b)) {
                                    int i27 = this.f9194;
                                    if (i27 + 1 < i4) {
                                        long jM6267 = m6267(i27, bArr, b);
                                        this.f9194 += 2;
                                        return Long.valueOf(jM6267);
                                    }
                                }
                                if (b >= -108 && b <= -92) {
                                    int iM62787 = b == -92 ? m6278() : b + 108;
                                    if (iM62787 == 0) {
                                        return (c2943.f9320 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new ArrayList() : new JSONArray();
                                    }
                                    List arrayList = (c2943.f9320 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new ArrayList(iM62787) : new JSONArray(iM62787);
                                    while (i < iM62787) {
                                        if (mo6180()) {
                                            String strMo61892 = mo6189();
                                            if ("..".equals(strMo61892)) {
                                                arrayList.add(arrayList);
                                            } else {
                                                arrayList.add(null);
                                                m6154(arrayList, i, AbstractC2922.m6378(strMo61892));
                                            }
                                        } else {
                                            arrayList.add(mo6124());
                                        }
                                        i++;
                                    }
                                    return arrayList;
                                }
                                if (b < 73 || b > 121) {
                                    if (b != 127) {
                                        C0276.m850("not support type : ".concat(m6282(b)));
                                        return null;
                                    }
                                    int iM62788 = m6278();
                                    this.f9240 = iM62788;
                                    if (iM62788 < 0) {
                                        throw null;
                                    }
                                    C0276.m844(this.f9240, "not support symbol : ");
                                    return null;
                                }
                                int iM62789 = b == 121 ? m6278() : b - 73;
                                this.f9240 = iM62789;
                                if (iM62789 < 0) {
                                    throw null;
                                }
                                if (AbstractC2854.f8923 != null) {
                                    String strM5769 = AbstractC2854.m5769(this.f9194, bArr, iM62789);
                                    this.f9194 += this.f9240;
                                    if ((c2943.f9320 & JSONReader$Feature.TrimString.mask) != 0) {
                                        strM5769 = strM5769.trim();
                                    }
                                    if (!strM5769.isEmpty() || (c2943.f9320 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
                                        return strM5769;
                                    }
                                } else {
                                    BiFunction biFunction4 = AbstractC2854.f8922;
                                    if (biFunction4 != null) {
                                        byte[] bArr7 = new byte[iM62789];
                                        System.arraycopy(bArr, this.f9194, bArr7, 0, iM62789);
                                        this.f9194 += this.f9240;
                                        String strTrim = (String) biFunction4.apply(bArr7, b);
                                        if ((c2943.f9320 & JSONReader$Feature.TrimString.mask) != 0) {
                                            strTrim = strTrim.trim();
                                        }
                                        if (!strTrim.isEmpty() || (c2943.f9320 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
                                            return strTrim;
                                        }
                                    } else {
                                        String str11 = new String(bArr, this.f9194, iM62789, StandardCharsets.ISO_8859_1);
                                        this.f9194 += this.f9240;
                                        if ((c2943.f9320 & JSONReader$Feature.TrimString.mask) != 0) {
                                            str11 = str11.trim();
                                        }
                                        if (!str11.isEmpty() || (c2943.f9320 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
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
    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List mo6125() {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2904.mo6125():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0393  */
    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo6126() {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2904.mo6126():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public final double mo6127() {
        int i = this.f9194;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -75) {
            long j = (((long) bArr[i + 8]) & 255) + ((((long) bArr[i + 7]) & 255) << 8) + ((((long) bArr[i + 6]) & 255) << 16) + ((((long) bArr[i + 5]) & 255) << 24) + ((((long) bArr[i + 4]) & 255) << 32) + ((((long) bArr[i + 3]) & 255) << 40) + ((((long) bArr[i + 2]) & 255) << 48) + (((long) bArr[i + 1]) << 56);
            this.f9194 = i + 9;
            return Double.longBitsToDouble(j);
        }
        int i2 = i + 1;
        this.f9194 = i2;
        if (b == -74) {
            return mo6212();
        }
        int i3 = this.f9241;
        if (b == -73) {
            m6271(i2, i3);
            int iM5737 = AbstractC2849.m5737(bArr, i2);
            this.f9194 += 4;
            return Float.intBitsToFloat(iM5737);
        }
        if (b == -71) {
            int iMo6212 = mo6212();
            BigInteger bigIntegerMo6110 = mo6110();
            return (iMo6212 == 0 ? new BigDecimal(bigIntegerMo6110) : new BigDecimal(bigIntegerMo6110, iMo6212)).intValue();
        }
        if (b != 72) {
            if (b == 124) {
                int iMo62122 = mo6212();
                String str = new String(bArr, this.f9194, iMo62122, StandardCharsets.UTF_16LE);
                this.f9194 += iMo62122;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC2867.m5913(str).intValue();
            }
            if (b == 121) {
                int iMo62123 = mo6212();
                String str2 = new String(bArr, this.f9194, iMo62123, StandardCharsets.ISO_8859_1);
                this.f9194 += iMo62123;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC2867.m5913(str2).intValue();
            }
            if (b == 122) {
                int iMo62124 = mo6212();
                String str3 = new String(bArr, this.f9194, iMo62124, StandardCharsets.UTF_8);
                this.f9194 += iMo62124;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC2867.m5913(str3).intValue();
            }
            switch (b) {
                case -81:
                    if ((this.f9201.f9320 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                        this.f9196 = true;
                        return 0.0d;
                    }
                    C0276.m850(mo6170("long value not support input null"));
                    return 0.0d;
                case -80:
                case -78:
                    return 0.0d;
                case -79:
                case -77:
                    return 1.0d;
                case -76:
                    return mo6209();
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9194 = i + 3;
                            return i4;
                        case -67:
                            this.f9194 = i + 2;
                            return bArr[i2];
                        case -66:
                            m6272(i2, i3);
                            long jM5730 = AbstractC2849.m5730(bArr, i2);
                            this.f9194 += 8;
                            return jM5730;
                        case -65:
                            break;
                        default:
                            if (InterfaceC2912.m6361(b)) {
                                return b;
                            }
                            if (InterfaceC2912.m6356(b)) {
                                this.f9194 = this.f9194 + 1;
                                return m6270(r0, bArr, b);
                            }
                            if (InterfaceC2912.m6353(b)) {
                                int i5 = this.f9194;
                                if (i5 + 1 < i3) {
                                    int iM6269 = m6269(i5, bArr, b);
                                    this.f9194 += 2;
                                    return iM6269;
                                }
                            }
                            if (InterfaceC2912.m6359(b)) {
                                return ((long) (b + 40)) - 8;
                            }
                            if (InterfaceC2912.m6358(b)) {
                                this.f9194 = this.f9194 + 1;
                                return m6266(r0, bArr, b);
                            }
                            if (InterfaceC2912.m6354(b)) {
                                int i6 = this.f9194;
                                if (i6 + 1 < i3) {
                                    int iM6267 = m6267(i6, bArr, b);
                                    this.f9194 += 2;
                                    return iM6267;
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6268(b);
                            }
                            int i7 = b - 73;
                            String strM6275 = m6275(i7);
                            this.f9194 += i7;
                            return strM6275.indexOf(46) == -1 ? new BigInteger(strM6275).intValue() : AbstractC2867.m5913(strM6275).intValue();
                    }
                    break;
            }
        }
        m6271(i2, i3);
        int iM57372 = AbstractC2849.m5737(bArr, i2);
        this.f9194 += 4;
        return iM57372;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public final long mo6128() {
        return mo6129();
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世 */
    public final long mo6129() {
        int iM6278;
        char c;
        long j;
        long j2;
        int i;
        long j3;
        long j4;
        int i2;
        int iMo6212;
        int i3 = this.f9194;
        int i4 = i3 + 1;
        this.f9194 = i4;
        byte[] bArr = this.f9242;
        byte b = bArr[i3];
        this.f9236 = b;
        boolean z = b == 127;
        byte b2 = b;
        if (z) {
            byte b3 = bArr[i4];
            this.f9236 = b3;
            if (InterfaceC2912.m6360(b3)) {
                if (b3 <= 47) {
                    this.f9194++;
                    iMo6212 = b3;
                } else {
                    iMo6212 = mo6212();
                }
                if (iMo6212 < 0) {
                    throw null;
                }
                if (iMo6212 == 0) {
                    this.f9236 = this.f9243;
                    this.f9240 = this.f9244;
                    this.f9235 = this.f9234;
                    if (this.f9233 == 0) {
                        this.f9233 = m6281();
                    }
                    return this.f9233;
                }
                int i5 = iMo6212 * 2;
                long[] jArr = this.f9245;
                long j5 = jArr[i5 + 1];
                int i6 = (int) j5;
                this.f9236 = (byte) i6;
                this.f9240 = i6 >> 8;
                this.f9235 = (int) (j5 >> 32);
                long j6 = jArr[i5];
                if (j6 != 0) {
                    return j6;
                }
                long jM6281 = m6281();
                this.f9245[i5] = jM6281;
                return jM6281;
            }
            this.f9194++;
            b2 = b3;
        }
        if (b2 >= 73 && b2 <= 120) {
            iM6278 = b2 - 73;
        } else {
            if (b2 != 121 && b2 != 122) {
                StringBuilder sb = new StringBuilder("fieldName not support input type ");
                sb.append(InterfaceC2912.m6357(this.f9236));
                if (this.f9236 == -109) {
                    sb.append(" ");
                    sb.append(mo6184());
                }
                int i7 = this.f9194;
                sb.append(", offset ");
                sb.append(i7);
                throw new JSONException(sb.toString());
            }
            iM6278 = m6278();
        }
        this.f9240 = iM6278;
        int i8 = this.f9194;
        this.f9235 = i8;
        if (iM6278 < 0) {
            throw null;
        }
        if (iM6278 <= 8 && i8 + iM6278 <= bArr.length) {
            long j7 = ((long) i8) + f9232;
            switch (iM6278) {
                case 1:
                    c = '\b';
                    j = 0;
                    i = bArr[i8];
                    j2 = i;
                    break;
                case 2:
                    c = '\b';
                    j = 0;
                    j2 = ((long) AbstractC2854.f8921.getShort(bArr, j7)) & 65535;
                    break;
                case 3:
                    c = '\b';
                    j = 0;
                    j3 = bArr[i8 + 2] << 16;
                    j4 = ((long) AbstractC2854.f8921.getShort(bArr, j7)) & 65535;
                    j2 = j3 + j4;
                    break;
                case 4:
                    c = '\b';
                    j = 0;
                    i = AbstractC2854.f8921.getInt(bArr, j7);
                    j2 = i;
                    break;
                case 5:
                    c = '\b';
                    j = 0;
                    j3 = ((long) bArr[i8 + 4]) << 32;
                    i2 = AbstractC2854.f8921.getInt(bArr, j7);
                    j4 = ((long) i2) & 4294967295L;
                    j2 = j3 + j4;
                    break;
                case 6:
                    c = '\b';
                    j = 0;
                    Unsafe unsafe = AbstractC2854.f8921;
                    j2 = (((long) unsafe.getShort(bArr, 4 + j7)) << 32) + (((long) unsafe.getInt(bArr, j7)) & 4294967295L);
                    break;
                case 7:
                    c = '\b';
                    j = 0;
                    j3 = (((long) bArr[i8 + 6]) << 48) + ((((long) bArr[i8 + 5]) & 255) << 40) + ((((long) bArr[i8 + 4]) & 255) << 32);
                    i2 = AbstractC2854.f8921.getInt(bArr, j7);
                    j4 = ((long) i2) & 4294967295L;
                    j2 = j3 + j4;
                    break;
                default:
                    j2 = AbstractC2854.f8921.getLong(bArr, j7);
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
            this.f9194 += iM6278;
        } else {
            j2 = -3750763034362895579L;
            for (int i9 = 0; i9 < iM6278; i9++) {
                int i10 = this.f9194;
                this.f9194 = i10 + 1;
                j2 = (((long) bArr[i10]) ^ j2) * 1099511628211L;
            }
        }
        if (z) {
            int iMo62122 = bArr[this.f9194];
            if (InterfaceC2912.m6361(iMo62122)) {
                this.f9194++;
            } else {
                iMo62122 = mo6212();
            }
            if (iMo62122 == 0) {
                this.f9234 = this.f9235;
                this.f9244 = iM6278;
                this.f9243 = b2;
                this.f9233 = j2;
                return j2;
            }
            int i11 = iMo62122 << 1;
            int i12 = i11 + 2;
            long[] jArr2 = this.f9245;
            if (jArr2 == null) {
                this.f9245 = new long[Math.max(i12, 32)];
            } else if (jArr2.length < i12) {
                this.f9245 = Arrays.copyOf(jArr2, i11 + 18);
            }
            long[] jArr3 = this.f9245;
            jArr3[i11] = j2;
            jArr3[i11 + 1] = (((long) this.f9235) << 32) + (((long) iM6278) << c) + ((long) b2);
        }
        return j2;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final Date mo6130() {
        long j;
        int i;
        int i2 = this.f9194;
        byte[] bArr = this.f9242;
        byte b = bArr[i2];
        int i3 = this.f9241;
        C2943 c2943 = this.f9201;
        ZonedDateTime zonedDateTimeOfLocal = null;
        switch (b) {
            case -89:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(LocalDate.of(1970, 1, 1), mo6219()), c2943.m6409(), null);
                break;
            case -88:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(mo6221(), c2943.m6409(), null);
                break;
            case -87:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(mo6226(), LocalTime.MIN), c2943.m6409(), null);
                break;
            case -86:
                this.f9194 = i2 + 1;
                zonedDateTimeOfLocal = m6273();
                break;
            case -85:
                long jM5730 = AbstractC2849.m5730(bArr, i2 + 1);
                this.f9194 += 9;
                return new Date(jM5730);
            case -84:
                int i4 = i2 + 1;
                m6271(i4, i3);
                long jM5737 = AbstractC2849.m5737(bArr, i4);
                this.f9194 += 5;
                return new Date(jM5737 * 1000);
            case -83:
                int i5 = i2 + 1;
                m6271(i5, i3);
                long jM57372 = AbstractC2849.m5737(bArr, i5);
                this.f9194 += 5;
                return new Date(jM57372 * 60000);
            case -82:
                this.f9194 = i2 + 1;
                return Date.from(Instant.ofEpochSecond(mo6209(), mo6212()));
        }
        if (zonedDateTimeOfLocal == null) {
            return super.mo6130();
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

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo6132() {
        int i = this.f9194;
        if (this.f9242[i] != -110) {
            return false;
        }
        this.f9194 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final boolean mo6133() {
        int i = this.f9194;
        if (this.f9242[i] != -81) {
            return false;
        }
        this.f9194 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final boolean mo6134(char c, char c2, char c3, char c4) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo6135() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final boolean mo6136() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo6137(char c, char c2, char c3, char c4, char c5, char c6) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final Object mo6139(Type type) {
        C2943 c2943 = this.f9201;
        return ((C2802) c2943.f9318).m5633(type, (c2943.f9320 & JSONReader$Feature.FieldBased.mask) != 0).mo5467(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final Object mo6140(Class cls) {
        C2943 c2943 = this.f9201;
        return ((C2802) c2943.f9318).m5633(cls, (c2943.f9320 & JSONReader$Feature.FieldBased.mask) != 0).mo5467(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final boolean mo6141() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final boolean mo6142() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final boolean mo6143(byte b) {
        int i = this.f9194;
        if (this.f9242[i] != b) {
            return false;
        }
        this.f9194 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final boolean mo6144(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final boolean mo6145() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo6146() {
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final boolean mo6147() {
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final boolean mo6148() {
        int i = this.f9194;
        if (this.f9242[i] != -90) {
            return false;
        }
        this.f9194 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final boolean mo6151() {
        int i = this.f9194;
        byte b = this.f9242[i];
        if (b != -81 && b != 73) {
            return false;
        }
        this.f9194 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final boolean mo6152() {
        int i = this.f9194;
        if (this.f9242[i] != -91) {
            return false;
        }
        this.f9194 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC2788 mo6164(long j, long j2, Class cls) {
        Class clsMo5498;
        ClassLoader classLoader;
        ClassLoader contextClassLoader;
        InterfaceC2788 interfaceC2788M6411;
        Class clsMo54982;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] == -110) {
            this.f9194 = i + 1;
            long jMo6239 = mo6239();
            C2943 c2943 = this.f9201;
            if (j == jMo6239 && (clsMo54982 = (interfaceC2788M6411 = c2943.m6411(cls)).mo5498()) != null && clsMo54982 == cls) {
                ((C2802) c2943.f9318).m5628(jMo6239, interfaceC2788M6411);
                return interfaceC2788M6411;
            }
            c2943.getClass();
            C2802 c2802 = (C2802) c2943.f9318;
            long j3 = c2943.f9320 | j2;
            if ((JSONReader$Feature.SupportAutoType.mask & j3) != 0) {
                InterfaceC2788 interfaceC2788M5630 = c2802.m5630(jMo6239);
                if (interfaceC2788M5630 != null && (clsMo5498 = interfaceC2788M5630.mo5498()) != null && (classLoader = clsMo5498.getClassLoader()) != null && classLoader != (contextClassLoader = Thread.currentThread().getContextClassLoader())) {
                    String strMo6100 = mo6100();
                    Class<?> clsLoadClass = (Class) AbstractC2867.f9033.get(strMo6100);
                    if (clsLoadClass == null) {
                        if (contextClassLoader == null) {
                            try {
                                contextClassLoader = InterfaceC2916.class.getClassLoader();
                            } catch (ClassNotFoundException unused) {
                            }
                        }
                        clsLoadClass = contextClassLoader.loadClass(strMo6100);
                    }
                    if (clsLoadClass != null && !clsMo5498.equals(clsLoadClass)) {
                        interfaceC2788M5630 = m6102(clsLoadClass);
                    }
                }
                if (interfaceC2788M5630 != null || (interfaceC2788M5630 = c2802.m5629(mo6100(), cls, j3)) != null) {
                    this.f9239 = bArr[this.f9194];
                    return interfaceC2788M5630;
                }
                if ((j3 & JSONReader$Feature.ErrorOnNotSupportAutoType.mask) != 0) {
                    C0276.m841(mo6100(), "autoType not support : ");
                    return null;
                }
            } else if ((j3 & JSONReader$Feature.ErrorOnNotSupportAutoType.mask) != 0) {
                C0276.m841(mo6100(), "autoType not support : ");
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo6165() {
        return this.f9194 >= this.f9241;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final boolean mo6167() {
        byte b = this.f9242[this.f9194];
        return b >= -89 && b <= -82;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final boolean mo6168() {
        return this.f9242[this.f9194] == -111;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final boolean mo6169() {
        byte b;
        int i = this.f9194;
        return i < this.f9241 && (b = this.f9242[i]) >= -108 && b <= -92;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo6173() {
        this.f9194++;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final C0966 mo6174() {
        return new C0966(this.f9194, this.f9239);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final boolean mo6177() {
        int i = this.f9194;
        return i < this.f9241 && this.f9242[i] == -90;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo6178() {
        byte b = this.f9242[this.f9194];
        return b >= -78 && b <= 72;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo6179() {
        int i = this.f9194;
        if (i >= this.f9241) {
            return false;
        }
        byte b = this.f9242[i];
        this.f9239 = b;
        return b >= 73;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final boolean mo6180() {
        int i = this.f9194;
        byte[] bArr = this.f9242;
        return i < bArr.length && bArr[i] == -109;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final boolean mo6181() {
        byte b = this.f9242[this.f9194];
        return (b >= -70 && b <= 72) || b == -84 || b == -83 || b == -85;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo6183() {
        return this.f9242[this.f9194];
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo6184() {
        /*
            Method dump skipped, instruction units count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2904.mo6184():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子 */
    public final String[] mo6185() {
        if (mo6143((byte) -110) && mo6239() != C2796.f8648) {
            C0276.m850(mo6170("not support type " + mo6100()));
            return null;
        }
        int iMo6232 = mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        String[] strArr = new String[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            strArr[i] = mo6184();
        }
        return strArr;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏 */
    public final String mo6186() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子苏哲 */
    public final OffsetTime mo6187() {
        ZonedDateTime zonedDateTimeMo6241 = mo6241();
        if (zonedDateTimeMo6241 == null) {
            return null;
        }
        return zonedDateTimeMo6241.toOffsetDateTime().toOffsetTime();
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏哲子 */
    public final boolean mo6188(int i, Collection collection) {
        int i2 = this.f9194;
        if (this.f9242[i2] != -109) {
            return false;
        }
        this.f9194 = i2 + 1;
        String strMo6184 = mo6184();
        if ("..".equals(strMo6184)) {
            collection.add(collection);
            return true;
        }
        m6154(collection, i, AbstractC2922.m6378(strMo6184));
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏子哲 */
    public final String mo6189() {
        int i = this.f9194;
        if (this.f9242[i] != -109) {
            return null;
        }
        this.f9194 = i + 1;
        if (mo6179()) {
            return mo6184();
        }
        C0276.m850("reference not support input ".concat(m6282(this.f9239)));
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子 */
    public final OffsetDateTime mo6191() {
        ZonedDateTime zonedDateTimeMo6241 = mo6241();
        if (zonedDateTimeMo6241 == null) {
            return null;
        }
        return zonedDateTimeMo6241.toOffsetDateTime();
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子兰苏 */
    public final Number mo6192() {
        int i = this.f9194;
        this.f9194 = i + 1;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (InterfaceC2912.m6361(b)) {
            return Integer.valueOf(b);
        }
        if (InterfaceC2912.m6356(b)) {
            int i2 = this.f9194;
            this.f9194 = i2 + 1;
            return Integer.valueOf(m6270(i2, bArr, b));
        }
        boolean zM6353 = InterfaceC2912.m6353(b);
        int i3 = this.f9241;
        if (zM6353) {
            int i4 = this.f9194;
            if (i4 + 1 < i3) {
                int iM6269 = m6269(i4, bArr, b);
                this.f9194 += 2;
                return Integer.valueOf(iM6269);
            }
        }
        if (InterfaceC2912.m6359(b)) {
            return Long.valueOf(((long) (b + 40)) - 8);
        }
        if (InterfaceC2912.m6358(b)) {
            this.f9194 = this.f9194 + 1;
            return Long.valueOf(m6266(r2, bArr, b));
        }
        if (InterfaceC2912.m6354(b)) {
            int i5 = this.f9194;
            if (i5 + 1 < i3) {
                int iM6267 = m6267(i5, bArr, b);
                this.f9194 += 2;
                return Integer.valueOf(iM6267);
            }
        }
        if (b == -110) {
            C0276.m850(AbstractC0053.m157("not support input type : ", mo6184()));
            return null;
        }
        if (b == 72) {
            int i6 = this.f9194;
            m6271(i6, i3);
            int iM5737 = AbstractC2849.m5737(bArr, i6);
            this.f9194 += 4;
            return Integer.valueOf(iM5737);
        }
        if (b == 121) {
            int iMo6212 = mo6212();
            String str = new String(bArr, this.f9194, iMo6212, StandardCharsets.ISO_8859_1);
            this.f9194 += iMo6212;
            return AbstractC2867.m5913(str);
        }
        if (b == 122) {
            int iMo62122 = mo6212();
            String str2 = new String(bArr, this.f9194, iMo62122, StandardCharsets.UTF_8);
            this.f9194 += iMo62122;
            return AbstractC2867.m5913(str2);
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
                return Double.valueOf(mo6209());
            case -75:
                int i7 = this.f9194;
                m6272(i7, i3);
                long jM5730 = AbstractC2849.m5730(bArr, i7);
                this.f9194 += 8;
                return Double.valueOf(Double.longBitsToDouble(jM5730));
            case -74:
                return Float.valueOf(mo6212());
            case -73:
                int i8 = this.f9194;
                m6271(i8, i3);
                int iM57372 = AbstractC2849.m5737(bArr, i8);
                this.f9194 += 4;
                return Float.valueOf(Float.intBitsToFloat(iM57372));
            case -72:
                return BigDecimal.valueOf(mo6209());
            case -71:
                int iMo62123 = mo6212();
                BigInteger bigIntegerMo6110 = mo6110();
                return iMo62123 == 0 ? new BigDecimal(bigIntegerMo6110) : new BigDecimal(bigIntegerMo6110, iMo62123);
            case -70:
                return BigInteger.valueOf(mo6209());
            case -69:
                int iMo62124 = mo6212();
                byte[] bArr2 = new byte[iMo62124];
                System.arraycopy(bArr, this.f9194, bArr2, 0, iMo62124);
                this.f9194 += iMo62124;
                return new BigInteger(bArr2);
            case -68:
                int i9 = this.f9194;
                int i10 = (bArr[i9 + 1] & DefaultClassResolver.NAME) + (bArr[i9] << 8);
                this.f9194 = i9 + 2;
                return Short.valueOf((short) i10);
            case -67:
                int i11 = this.f9194;
                this.f9194 = i11 + 1;
                return Byte.valueOf(bArr[i11]);
            case -66:
                int i12 = this.f9194;
                m6272(i12, i3);
                long jM57302 = AbstractC2849.m5730(bArr, i12);
                this.f9194 += 8;
                return Long.valueOf(jM57302);
            case -65:
                int i13 = this.f9194;
                m6271(i13, i3);
                int iM57373 = AbstractC2849.m5737(bArr, i13);
                this.f9194 += 4;
                return Long.valueOf(iM57373);
            default:
                if (b < 73 || b > 120) {
                    throw m6268(b);
                }
                int i14 = b - 73;
                String strM6275 = m6275(i14);
                this.f9194 += i14;
                return AbstractC2867.m5913(strM6275);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰 */
    public final Date mo6193() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ef  */
    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏兰子 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map mo6194() {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2904.mo6194():java.util.Map");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰 */
    public final void mo6195() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏 */
    public final LocalTime mo6196() {
        LocalTime localTimeM5896;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 80 || (localTimeM5896 = AbstractC2866.m5896(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 8;
        return localTimeM5896;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲 */
    public final LocalTime mo6197() {
        LocalTime localTimeM5892;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 79 || (localTimeM5892 = AbstractC2866.m5892(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 7;
        return localTimeM5892;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public final LocalTime mo6198() {
        LocalTime localTimeM5893;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 78 || (localTimeM5893 = AbstractC2866.m5893(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 6;
        return localTimeM5893;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public final LocalTime mo6199() {
        LocalTime localTimeM5833;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 91 || (localTimeM5833 = AbstractC2866.m5833(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 19;
        return localTimeM5833;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲 */
    public final LocalTime mo6200() {
        LocalTime localTimeM5832;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 88 || (localTimeM5832 = AbstractC2866.m5832(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 16;
        return localTimeM5832;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰 */
    public final LocalTime mo6201() {
        LocalTime localTimeM5836;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 85 || (localTimeM5836 = AbstractC2866.m5836(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 13;
        return localTimeM5836;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子 */
    public final void mo6202() {
        int i = this.f9194;
        this.f9194 = i + 1;
        byte b = this.f9242[i];
        this.f9239 = b;
        if (b == -81) {
            return;
        }
        C0276.m844(this.f9239, "null not match, ");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰 */
    public final long mo6205() {
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 92) {
            C0276.m850("date only support string input");
            return 0L;
        }
        long jM5883 = AbstractC2866.m5883(bArr, i + 1, (ZoneId) this.f9201.f9319);
        this.f9194 += 20;
        return jM5883;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲 */
    public final LocalTime mo6206() {
        LocalTime localTimeM5894;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 82 || (localTimeM5894 = AbstractC2866.m5894(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 10;
        return localTimeM5894;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰 */
    public final LocalTime mo6207() {
        LocalTime localTimeM5894;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 81 || (localTimeM5894 = AbstractC2866.m5894(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 9;
        return localTimeM5894;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲世子兰苏, reason: contains not printable characters */
    public final ZonedDateTime m6273() {
        ZoneId zoneIdM5856;
        int i = this.f9194;
        int i2 = i + 1;
        this.f9194 = i2;
        byte[] bArr = this.f9242;
        int i3 = bArr[i] << 8;
        int i4 = i + 2;
        this.f9194 = i4;
        int i5 = i3 + (bArr[i2] & DefaultClassResolver.NAME);
        int i6 = i + 3;
        this.f9194 = i6;
        byte b = bArr[i4];
        int i7 = i + 4;
        this.f9194 = i7;
        byte b2 = bArr[i6];
        int i8 = i + 5;
        this.f9194 = i8;
        byte b3 = bArr[i7];
        int i9 = i + 6;
        this.f9194 = i9;
        byte b4 = bArr[i8];
        this.f9194 = i + 7;
        byte b5 = bArr[i9];
        int iMo6212 = mo6212();
        int i10 = this.f9194;
        byte[] bArr2 = f9230;
        if (i10 + bArr2.length < bArr.length) {
            int i11 = 0;
            while (true) {
                int length = bArr2.length;
                int i12 = this.f9194;
                if (i11 >= length) {
                    this.f9194 = i12 + bArr2.length;
                    zoneIdM5856 = AbstractC2866.f9026;
                    break;
                }
                if (bArr[i12 + i11] != bArr2[i11]) {
                    break;
                }
                i11++;
            }
            zoneIdM5856 = AbstractC2866.m5856(mo6184(), AbstractC2866.f9026);
        } else {
            zoneIdM5856 = AbstractC2866.m5856(mo6184(), AbstractC2866.f9026);
        }
        return ZonedDateTime.of(LocalDateTime.of(i5, b, b2, b3, b4, b5, iMo6212), zoneIdM5856);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲世子苏兰, reason: contains not printable characters */
    public final void m6274() {
        throw new JSONException("string value not support input " + InterfaceC2912.m6357(this.f9239) + " offset " + this.f9194 + "/" + this.f9242.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子世兰苏, reason: contains not printable characters */
    public final String m6275(int i) {
        int i2 = this.f9194;
        byte[] bArr = this.f9242;
        return i == 1 ? AbstractC2867.m5903((char) (bArr[i2] & DefaultClassResolver.NAME)) : i == 2 ? AbstractC2867.m5902((char) (bArr[i2] & DefaultClassResolver.NAME), (char) (bArr[i2 + 1] & DefaultClassResolver.NAME)) : AbstractC2854.f8923 != null ? AbstractC2854.m5769(i2, bArr, i) : new String(bArr, i2, i, StandardCharsets.ISO_8859_1);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0196  */
    /* JADX INFO: renamed from: 飘花落叶言楪哲子世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6276(byte r20) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2904.m6276(byte):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰世苏, reason: contains not printable characters */
    public final long m6277(byte[] bArr, byte b) {
        int i = this.f9194;
        if (InterfaceC2912.m6361(b)) {
            return b;
        }
        if (InterfaceC2912.m6356(b)) {
            long jM6270 = m6270(i, bArr, b);
            this.f9194 = i + 1;
            return jM6270;
        }
        boolean zM6353 = InterfaceC2912.m6353(b);
        int i2 = this.f9241;
        if (zM6353 && i + 1 < i2) {
            this.f9194 = i + 2;
            return m6269(i, bArr, b);
        }
        if (b == -71) {
            int iMo6212 = mo6212();
            BigInteger bigIntegerMo6110 = mo6110();
            return (iMo6212 == 0 ? new BigDecimal(bigIntegerMo6110) : new BigDecimal(bigIntegerMo6110, iMo6212)).longValue();
        }
        if (b == 72) {
            int i3 = this.f9194;
            m6271(i3, i2);
            int iM5737 = AbstractC2849.m5737(bArr, i3);
            this.f9194 += 4;
            return iM5737;
        }
        if (b == 124) {
            int iMo62122 = mo6212();
            String str = new String(bArr, this.f9194, iMo62122, StandardCharsets.UTF_16LE);
            this.f9194 += iMo62122;
            return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC2867.m5913(str).intValue();
        }
        if (b == -68) {
            int i4 = this.f9194;
            int i5 = (bArr[i4 + 1] & DefaultClassResolver.NAME) + (bArr[i4] << 8);
            this.f9194 = i4 + 2;
            return i5;
        }
        if (b == -67) {
            this.f9194 = this.f9194 + 1;
            return bArr[r9];
        }
        if (b == 121) {
            int iMo62123 = mo6212();
            String str2 = new String(bArr, this.f9194, iMo62123, StandardCharsets.ISO_8859_1);
            this.f9194 += iMo62123;
            return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC2867.m5913(str2).intValue();
        }
        if (b == 122) {
            int iMo62124 = mo6212();
            String str3 = new String(bArr, this.f9194, iMo62124, StandardCharsets.UTF_8);
            this.f9194 += iMo62124;
            return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC2867.m5913(str3).intValue();
        }
        switch (b) {
            case -85:
                int i6 = this.f9194;
                m6272(i6, i2);
                long jM5730 = AbstractC2849.m5730(bArr, i6);
                this.f9194 += 8;
                return jM5730;
            case -84:
                int i7 = this.f9194;
                m6271(i7, i2);
                long jM5737 = AbstractC2849.m5737(bArr, i7);
                this.f9194 += 4;
                return jM5737 * 1000;
            case -83:
                int i8 = this.f9194;
                m6271(i8, i2);
                long jM57372 = AbstractC2849.m5737(bArr, i8);
                this.f9194 += 4;
                return jM57372 * 60000;
            default:
                switch (b) {
                    case -81:
                        if ((this.f9201.f9320 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                            this.f9196 = true;
                            return 0L;
                        }
                        C0276.m850(mo6170("long value not support input null"));
                        return 0L;
                    case -80:
                    case -78:
                        return 0L;
                    case -79:
                    case -77:
                        return 1L;
                    case -76:
                        return mo6209();
                    case -75:
                        this.f9194--;
                        return (long) mo6127();
                    case -74:
                        return mo6212();
                    case -73:
                        int i9 = this.f9194;
                        m6271(i9, i2);
                        int iM57372 = AbstractC2849.m5737(bArr, i9);
                        this.f9194 += 4;
                        return (long) Float.intBitsToFloat(iM57372);
                    default:
                        if (b < 73 || b > 120) {
                            C2942.m6398("readInt64Value not support ", InterfaceC2912.m6357(b), this.f9194, this.f9242.length);
                            return 0L;
                        }
                        int i10 = b - 73;
                        String strM6275 = m6275(i10);
                        this.f9194 += i10;
                        return strM6275.indexOf(46) == -1 ? new BigInteger(strM6275).longValue() : AbstractC2867.m5913(strM6275).longValue();
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世, reason: contains not printable characters */
    public final int m6278() {
        int i = this.f9194;
        int i2 = i + 1;
        byte[] bArr = this.f9242;
        int iM5737 = bArr[i];
        if (!InterfaceC2912.m6361(iM5737)) {
            if (InterfaceC2912.m6356(iM5737)) {
                iM5737 = m6270(i2, bArr, iM5737);
                i2 = i + 2;
            } else {
                boolean zM6353 = InterfaceC2912.m6353(iM5737);
                int i3 = this.f9241;
                if (zM6353 && i + 2 < i3) {
                    iM5737 = m6269(i2, bArr, iM5737);
                    i2 = i + 3;
                } else {
                    if (iM5737 != 72 || i + 4 >= i3) {
                        throw m6268((byte) iM5737);
                    }
                    iM5737 = AbstractC2849.m5737(bArr, i2);
                    i2 = i + 5;
                    if (iM5737 > 268435456) {
                        C0276.m850("input length overflow");
                        return 0;
                    }
                }
            }
        }
        this.f9194 = i2;
        return iM5737;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰, reason: contains not printable characters */
    public final float m6279() {
        int i = this.f9194;
        int i2 = i + 1;
        this.f9194 = i2;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -71) {
            int iMo6212 = mo6212();
            BigInteger bigIntegerMo6110 = mo6110();
            return (iMo6212 == 0 ? new BigDecimal(bigIntegerMo6110) : new BigDecimal(bigIntegerMo6110, iMo6212)).intValue();
        }
        int i3 = this.f9241;
        if (b != 72) {
            if (b == 124) {
                int iMo62122 = mo6212();
                String str = new String(bArr, this.f9194, iMo62122, StandardCharsets.UTF_16LE);
                this.f9194 += iMo62122;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC2867.m5913(str).intValue();
            }
            if (b == 121) {
                int iMo62123 = mo6212();
                String str2 = new String(bArr, this.f9194, iMo62123, StandardCharsets.ISO_8859_1);
                this.f9194 += iMo62123;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC2867.m5913(str2).intValue();
            }
            if (b == 122) {
                int iMo62124 = mo6212();
                String str3 = new String(bArr, this.f9194, iMo62124, StandardCharsets.UTF_8);
                this.f9194 += iMo62124;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC2867.m5913(str3).intValue();
            }
            switch (b) {
                case -81:
                    if ((this.f9201.f9320 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                        this.f9196 = true;
                        return 0.0f;
                    }
                    C0276.m850(mo6170("long value not support input null"));
                    return 0.0f;
                case -80:
                case -78:
                    return 0.0f;
                case -79:
                case -77:
                    return 1.0f;
                case -76:
                    return mo6209();
                case -75:
                    m6272(i2, i3);
                    long jM5730 = AbstractC2849.m5730(bArr, i2);
                    this.f9194 += 8;
                    return (float) Double.longBitsToDouble(jM5730);
                case -74:
                    return mo6212();
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9194 = i + 3;
                            return i4;
                        case -67:
                            this.f9194 = i + 2;
                            return bArr[i2];
                        case -66:
                            m6272(i2, i3);
                            long jM57302 = AbstractC2849.m5730(bArr, i2);
                            this.f9194 += 8;
                            return jM57302;
                        case -65:
                            break;
                        default:
                            if (InterfaceC2912.m6361(b)) {
                                return b;
                            }
                            if (InterfaceC2912.m6356(b)) {
                                this.f9194 = this.f9194 + 1;
                                return m6270(r0, bArr, b);
                            }
                            if (InterfaceC2912.m6353(b)) {
                                int i5 = this.f9194;
                                if (i5 + 1 < i3) {
                                    int iM6269 = m6269(i5, bArr, b);
                                    this.f9194 += 2;
                                    return iM6269;
                                }
                            }
                            if (InterfaceC2912.m6359(b)) {
                                return b + 32;
                            }
                            if (InterfaceC2912.m6358(b)) {
                                this.f9194 = this.f9194 + 1;
                                return m6266(r0, bArr, b);
                            }
                            if (InterfaceC2912.m6354(b)) {
                                int i6 = this.f9194;
                                if (i6 + 1 < i3) {
                                    int iM6267 = m6267(i6, bArr, b);
                                    this.f9194 += 2;
                                    return iM6267;
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6268(b);
                            }
                            int i7 = b - 73;
                            String strM6275 = m6275(i7);
                            this.f9194 += i7;
                            return strM6275.indexOf(46) == -1 ? new BigInteger(strM6275).intValue() : AbstractC2867.m5913(strM6275).intValue();
                    }
                    break;
            }
        }
        m6271(i2, i3);
        int iM5737 = AbstractC2849.m5737(bArr, i2);
        this.f9194 += 4;
        return iM5737;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子苏兰世, reason: contains not printable characters */
    public final int m6280(byte[] bArr, byte b) {
        if (InterfaceC2912.m6359(b)) {
            return b + 32;
        }
        if (InterfaceC2912.m6358(b)) {
            int i = this.f9194;
            this.f9194 = i + 1;
            return m6266(i, bArr, b);
        }
        boolean zM6354 = InterfaceC2912.m6354(b);
        int i2 = this.f9241;
        if (zM6354) {
            int i3 = this.f9194;
            if (i3 + 1 < i2) {
                int iM6267 = m6267(i3, bArr, b);
                this.f9194 += 2;
                return iM6267;
            }
        }
        if (b == -71) {
            int iMo6212 = mo6212();
            BigInteger bigIntegerMo6110 = mo6110();
            return (iMo6212 == 0 ? new BigDecimal(bigIntegerMo6110) : new BigDecimal(bigIntegerMo6110, iMo6212)).intValue();
        }
        if (b == 124) {
            int iMo62122 = mo6212();
            String str = new String(bArr, this.f9194, iMo62122, StandardCharsets.UTF_16LE);
            this.f9194 += iMo62122;
            return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC2867.m5913(str).intValue();
        }
        if (b == 121) {
            int iMo62123 = mo6212();
            String str2 = new String(bArr, this.f9194, iMo62123, StandardCharsets.ISO_8859_1);
            this.f9194 += iMo62123;
            return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC2867.m5913(str2).intValue();
        }
        if (b == 122) {
            int iMo62124 = mo6212();
            String str3 = new String(bArr, this.f9194, iMo62124, StandardCharsets.UTF_8);
            this.f9194 += iMo62124;
            return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC2867.m5913(str3).intValue();
        }
        switch (b) {
            case -85:
                int i4 = this.f9194;
                m6272(i4, i2);
                long jM5730 = AbstractC2849.m5730(bArr, i4);
                this.f9194 += 8;
                return (int) jM5730;
            case -84:
            case -83:
                break;
            default:
                switch (b) {
                    case -81:
                        if ((this.f9201.f9320 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                            this.f9196 = true;
                            return 0;
                        }
                        C0276.m850(mo6170("int value not support input null"));
                        return 0;
                    case -80:
                    case -78:
                        return 0;
                    case -79:
                    case -77:
                        return 1;
                    case -76:
                        return (int) mo6209();
                    case -75:
                        this.f9194--;
                        return (int) mo6127();
                    case -74:
                        return mo6212();
                    case -73:
                        int i5 = this.f9194;
                        m6271(i5, i2);
                        int iM5737 = AbstractC2849.m5737(bArr, i5);
                        this.f9194 += 4;
                        return (int) Float.intBitsToFloat(iM5737);
                    default:
                        switch (b) {
                            case -68:
                                int i6 = this.f9194;
                                int i7 = (bArr[i6 + 1] & DefaultClassResolver.NAME) + (bArr[i6] << 8);
                                this.f9194 = i6 + 2;
                                return i7;
                            case -67:
                                int i8 = this.f9194;
                                this.f9194 = i8 + 1;
                                return bArr[i8];
                            case -66:
                                int i9 = this.f9194;
                                m6272(i9, i2);
                                long jM57302 = AbstractC2849.m5730(bArr, i9);
                                this.f9194 += 8;
                                return (int) jM57302;
                            case -65:
                                break;
                            default:
                                if (b < 73 || b > 120) {
                                    C2942.m6398("readInt32Value not support ", InterfaceC2912.m6357(b), this.f9194, this.f9242.length);
                                    return 0;
                                }
                                int i10 = b - 73;
                                String strM6275 = m6275(i10);
                                this.f9194 += i10;
                                return strM6275.indexOf(46) == -1 ? new BigInteger(strM6275).intValue() : AbstractC2867.m5913(strM6275).intValue();
                        }
                        break;
                }
                break;
        }
        int i11 = this.f9194;
        m6271(i11, i2);
        int iM57372 = AbstractC2849.m5737(bArr, i11);
        this.f9194 += 4;
        return iM57372;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public final long[] mo6208() {
        if (mo6143((byte) -110)) {
            long jMo6239 = mo6239();
            if (jMo6239 != C2711.f8240 && jMo6239 != C2707.f8230 && jMo6239 != C2729.f8303 && jMo6239 != C2708.f8232) {
                C0276.m850(mo6170("not support " + mo6100()));
                return null;
            }
        }
        int iMo6232 = mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        long[] jArr = new long[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            jArr[i] = mo6209();
        }
        return jArr;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final long mo6209() {
        long jM5730;
        this.f9196 = false;
        int i = this.f9194;
        int i2 = i + 1;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (InterfaceC2912.m6359(b)) {
            jM5730 = b + 32;
        } else if (InterfaceC2912.m6358(b)) {
            jM5730 = m6266(i2, bArr, b);
            i2 = i + 2;
        } else {
            boolean zM6354 = InterfaceC2912.m6354(b);
            int i3 = this.f9241;
            if (zM6354 && i + 2 < i3) {
                jM5730 = m6267(i2, bArr, b);
                i2 = i + 3;
            } else if (b == -65 && i + 4 < i3) {
                jM5730 = AbstractC2849.m5737(bArr, i2);
                i2 = i + 5;
            } else {
                if (b != -66 || i + 8 >= i3) {
                    this.f9194 = i2;
                    return m6277(bArr, b);
                }
                jM5730 = AbstractC2849.m5730(bArr, i2);
                i2 = i + 9;
            }
        }
        this.f9194 = i2;
        return jM5730;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏 */
    public final Long mo6210() {
        long jM5730;
        int i = this.f9194;
        int i2 = i + 1;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -81) {
            this.f9194 = i2;
            return null;
        }
        if (InterfaceC2912.m6359(b)) {
            jM5730 = b + 32;
        } else if (InterfaceC2912.m6358(b)) {
            jM5730 = m6266(i2, bArr, b);
            i2 = i + 2;
        } else {
            boolean zM6354 = InterfaceC2912.m6354(b);
            int i3 = this.f9241;
            if (zM6354 && i + 2 < i3) {
                jM5730 = m6267(i2, bArr, b);
                i2 = i + 3;
            } else if (b == -65 && i + 4 < i3) {
                jM5730 = AbstractC2849.m5737(bArr, i2);
                i2 = i + 5;
            } else {
                if (b != -66 || i + 8 >= i3) {
                    this.f9194 = i2;
                    return Long.valueOf(m6277(bArr, b));
                }
                jM5730 = AbstractC2849.m5730(bArr, i2);
                i2 = i + 9;
            }
        }
        this.f9194 = i2;
        return Long.valueOf(jM5730);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final int mo6212() {
        int i = this.f9194;
        int i2 = i + 1;
        byte[] bArr = this.f9242;
        int iM5737 = bArr[i];
        if (!InterfaceC2912.m6361(iM5737)) {
            if (InterfaceC2912.m6356(iM5737)) {
                iM5737 = m6270(i2, bArr, iM5737);
                i2 = i + 2;
            } else {
                boolean zM6353 = InterfaceC2912.m6353(iM5737);
                int i3 = this.f9241;
                if (zM6353 && i + 2 < i3) {
                    iM5737 = m6269(i2, bArr, iM5737);
                    i2 = i + 3;
                } else {
                    if (iM5737 != 72 || i + 4 >= i3) {
                        this.f9194 = i2;
                        return m6280(bArr, (byte) iM5737);
                    }
                    iM5737 = AbstractC2849.m5737(bArr, i2);
                    i2 = i + 5;
                }
            }
        }
        this.f9194 = i2;
        return iM5737;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public final Integer mo6213() {
        int i = this.f9194;
        int i2 = i + 1;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -81) {
            this.f9194 = i2;
            return null;
        }
        boolean zM6361 = InterfaceC2912.m6361(b);
        int i3 = b;
        if (!zM6361) {
            if (InterfaceC2912.m6356(b)) {
                int iM6270 = m6270(i2, bArr, b);
                i2 = i + 2;
                i3 = iM6270;
            } else {
                boolean zM6353 = InterfaceC2912.m6353(b);
                int i4 = this.f9241;
                if (zM6353 && i + 2 < i4) {
                    int iM6269 = m6269(i2, bArr, b);
                    i2 = i + 3;
                    i3 = iM6269;
                } else {
                    if (b != 72 || i + 4 >= i4) {
                        this.f9194 = i2;
                        return Integer.valueOf(m6280(bArr, b));
                    }
                    int iM5737 = AbstractC2849.m5737(bArr, i2);
                    i2 = i + 5;
                    i3 = iM5737;
                }
            }
        }
        this.f9194 = i2;
        return Integer.valueOf(i3);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏 */
    public final LocalDateTime mo6214() {
        LocalDateTime localDateTimeM5838;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 93 || (localDateTimeM5838 = AbstractC2866.m5838(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 21;
        return localDateTimeM5838;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final LocalDateTime mo6215() {
        int i = this.f9194;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        this.f9239 = b;
        if (b != 92) {
            C0276.m850("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM5843 = AbstractC2866.m5843(bArr, i + 1);
        if (localDateTimeM5843 != null) {
            this.f9194 += 20;
            return localDateTimeM5843;
        }
        C0276.m850("date only support string input");
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏 */
    public final LocalTime mo6216() {
        LocalTime localTimeM5834;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 83 || (localTimeM5834 = AbstractC2866.m5834(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 11;
        return localTimeM5834;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public final LocalTime mo6217() {
        LocalTime localTimeM5837;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 84 || (localTimeM5837 = AbstractC2866.m5837(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 12;
        return localTimeM5837;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final LocalDateTime mo6218(int i) {
        LocalDateTime localDateTimeM5835;
        int i2 = this.f9194;
        byte[] bArr = this.f9242;
        byte b = bArr[i2];
        this.f9239 = b;
        if (b < 73 || b > 120) {
            C0276.m850("date only support string input");
            return null;
        }
        if (i < 21 || i > 29 || (localDateTimeM5835 = AbstractC2866.m5835(i2 + 1, bArr, i)) == null) {
            C0276.m841(mo6184(), "illegal LocalDateTime string : ");
            return null;
        }
        this.f9194 = i + 1 + this.f9194;
        return localDateTimeM5835;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世 */
    public final LocalTime mo6219() {
        int i = this.f9194;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -89) {
            int i2 = i + 2;
            this.f9194 = i2;
            byte b2 = bArr[i + 1];
            int i3 = i + 3;
            this.f9194 = i3;
            byte b3 = bArr[i2];
            this.f9194 = i + 4;
            return LocalTime.of(b2, b3, bArr[i3], mo6212());
        }
        if (b == -81) {
            this.f9194 = i + 1;
            return null;
        }
        if (b < 73 || b > 120) {
            C5554.m10882();
            return null;
        }
        int iMo6099 = mo6099();
        if (iMo6099 == 18) {
            return mo6199();
        }
        switch (iMo6099) {
            case 5:
                return mo6198();
            case 6:
                return mo6197();
            case 7:
                return mo6196();
            case 8:
                return mo6207();
            case 9:
                return mo6206();
            case 10:
                return mo6216();
            case 11:
                return mo6217();
            case 12:
                return mo6201();
            default:
                C0276.m850(AbstractC6183.m11588(iMo6099, "not support len : "));
                return null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final LocalDateTime mo6220() {
        LocalDateTime localDateTimeM5845;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 85 || (localDateTimeM5845 = AbstractC2866.m5845(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 13;
        return localDateTimeM5845;
    }

    /* JADX WARN: Type inference failed for: r12v20, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final LocalDateTime mo6221() {
        int i = this.f9194;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -88) {
            int i2 = i + 2;
            this.f9194 = i2;
            int i3 = bArr[i + 1] << 8;
            int i4 = i + 3;
            this.f9194 = i4;
            int i5 = i3 + (bArr[i2] & DefaultClassResolver.NAME);
            int i6 = i + 4;
            this.f9194 = i6;
            byte b2 = bArr[i4];
            int i7 = i + 5;
            this.f9194 = i7;
            byte b3 = bArr[i6];
            int i8 = i + 6;
            this.f9194 = i8;
            byte b4 = bArr[i7];
            int i9 = i + 7;
            this.f9194 = i9;
            byte b5 = bArr[i8];
            this.f9194 = i + 8;
            return LocalDateTime.of(i5, b2, b3, b4, b5, bArr[i9], mo6212());
        }
        if (b == -81) {
            this.f9194 = i + 1;
            return null;
        }
        if (b == -87) {
            LocalDate localDateMo6226 = mo6226();
            if (localDateMo6226 != null) {
                return LocalDateTime.of(localDateMo6226, LocalTime.MIN);
            }
        } else {
            if (b == -86) {
                return mo6241().toLocalDateTime();
            }
            if (b < 73 || b > 120) {
                throw m6268(b);
            }
            int iMo6099 = mo6099();
            switch (iMo6099) {
                case 8:
                    return LocalDateTime.of(mo6228(), LocalTime.MIN);
                case 9:
                    return LocalDateTime.of(mo6229(), LocalTime.MIN);
                case 10:
                    LocalDate localDateMo6230 = mo6230();
                    if (localDateMo6230 != null) {
                        return LocalDateTime.of(localDateMo6230, LocalTime.MIN);
                    }
                    break;
                case 11:
                    LocalDate localDateMo6231 = mo6231();
                    if (localDateMo6231 != null) {
                        return LocalDateTime.of(localDateMo6231, LocalTime.MIN);
                    }
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    StringBuilder sbM150 = AbstractC0053.m150(iMo6099, "TODO : ", ", ");
                    sbM150.append(mo6184());
                    throw new JSONException(sbM150.toString());
                case 16:
                    return mo6225();
                case 17:
                    return mo6222();
                case 18:
                    return mo6223();
                case 19:
                    return mo6215();
                case 20:
                    return mo6214();
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return mo6218(iMo6099);
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏 */
    public final LocalDateTime mo6222() {
        LocalDateTime localDateTimeM5851;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 90 || (localDateTimeM5851 = AbstractC2866.m5851(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 18;
        return localDateTimeM5851;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世 */
    public final LocalDateTime mo6223() {
        LocalDateTime localDateTimeM5841;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 91 || (localDateTimeM5841 = AbstractC2866.m5841(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 19;
        return localDateTimeM5841;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final LocalDateTime mo6224() {
        LocalDateTime localDateTimeM5855;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 87 || (localDateTimeM5855 = AbstractC2866.m5855(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 15;
        return localDateTimeM5855;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final LocalDateTime mo6225() {
        LocalDateTime localDateTimeM5853;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 89 || (localDateTimeM5853 = AbstractC2866.m5853(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 17;
        return localDateTimeM5853;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲 */
    public final LocalDate mo6226() {
        int i;
        int i2 = this.f9194;
        int i3 = i2 + 1;
        byte[] bArr = this.f9242;
        byte b = bArr[i2];
        if (b == -87 && (i = i2 + 4) < this.f9241) {
            short sM5698 = AbstractC2849.m5698(bArr, i3);
            byte bM5740 = AbstractC2849.m5740(bArr, i2 + 3);
            byte bM57402 = AbstractC2849.m5740(bArr, i);
            this.f9194 = i2 + 5;
            return LocalDate.of(sM5698, bM5740, bM57402);
        }
        if (b == -81) {
            this.f9194 = i3;
            return null;
        }
        if (b == -88) {
            return mo6221().toLocalDate();
        }
        if (b == -86) {
            return mo6241().toLocalDate();
        }
        if (b >= 73 && b <= 120) {
            int iMo6099 = mo6099();
            switch (iMo6099) {
                case 8:
                    return mo6228();
                case 9:
                    return mo6229();
                case 10:
                    return mo6230();
                case 11:
                    return mo6231();
                default:
                    if (bArr[this.f9194 + iMo6099] == 90) {
                        return mo6241().toInstant().atZone(this.f9201.m6409()).toLocalDate();
                    }
                    StringBuilder sbM150 = AbstractC0053.m150(iMo6099, "TODO : ", ", ");
                    sbM150.append(mo6184());
                    throw new JSONException(sbM150.toString());
            }
        }
        if (b == 122 || b == 121) {
            this.f9236 = b;
            this.f9194 = i3;
            int iM6278 = m6278();
            this.f9240 = iM6278;
            switch (iM6278) {
                case 8:
                    return mo6228();
                case 9:
                    return mo6229();
                case 10:
                    return mo6230();
                case 11:
                    return mo6231();
            }
        }
        throw m6268(b);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final LocalDate mo6228() {
        LocalDate localDateM5867;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 81 || (localDateM5867 = AbstractC2866.m5867(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 9;
        return localDateM5867;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final LocalDate mo6229() {
        LocalDate localDateM5865;
        int i = this.f9194;
        byte[] bArr = this.f9242;
        if (bArr[i] != 82 || (localDateM5865 = AbstractC2866.m5865(bArr, i + 1)) == null) {
            C0276.m850("date only support string input");
            return null;
        }
        this.f9194 += 10;
        return localDateM5865;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final LocalDate mo6230() {
        LocalDate localDateM5871;
        byte b = this.f9236;
        byte[] bArr = this.f9242;
        if ((b == 121 || b == 122) && this.f9240 == 10) {
            localDateM5871 = AbstractC2866.m5871(bArr, this.f9194);
        } else {
            int i = this.f9194;
            if (bArr[i] != 83 || (localDateM5871 = AbstractC2866.m5871(bArr, i + 1)) == null) {
                C0276.m850("date only support string input");
                return null;
            }
        }
        this.f9194 += 11;
        return localDateM5871;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final LocalDate mo6231() {
        LocalDate localDateM5862;
        byte b = this.f9236;
        byte[] bArr = this.f9242;
        if ((b == 121 || b == 122) && this.f9240 == 11) {
            localDateM5862 = AbstractC2866.m5862(bArr, this.f9194);
        } else {
            int i = this.f9194;
            if (bArr[i] != 84 || (localDateM5862 = AbstractC2866.m5862(bArr, i + 1)) == null) {
                C0276.m850("date only support string input");
                return null;
            }
        }
        this.f9194 += 12;
        return localDateM5862;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏世兰子哲 */
    public final int mo6232() {
        int i = this.f9194;
        this.f9194 = i + 1;
        byte b = this.f9242[i];
        this.f9239 = b;
        if (b == -81) {
            return -1;
        }
        if (b >= -108 && b <= -93) {
            this.f9193 = (char) (-b);
            return b - (-108);
        }
        if (b == -111) {
            return mo6212();
        }
        if (b == -92) {
            return mo6212();
        }
        C0276.m850("array not support input ".concat(m6282(b)));
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲兰子 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6233() {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2904.mo6233():void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰 */
    public final void mo6234() {
        int i = this.f9194;
        int i2 = i + 1;
        this.f9194 = i2;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        this.f9236 = b;
        if (b >= 73 && b <= 120) {
            this.f9194 = (b - 73) + i2;
            return;
        }
        if (b == 121 || b == 122 || b == 123 || b == 124 || b == 125) {
            int iM6278 = m6278();
            this.f9240 = iM6278;
            this.f9194 += iM6278;
        } else {
            if (b != 127) {
                throw m6268(b);
            }
            byte b2 = bArr[i2];
            if (b2 >= -16 && b2 <= 72) {
                mo6212();
            } else {
                mo6184();
                mo6212();
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲 */
    public final void mo6235() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏世子哲兰 */
    public final void mo6236(C0966 c0966) {
        this.f9194 = c0966.f2756;
        this.f9239 = (byte) c0966.f2755;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰哲子世, reason: contains not printable characters */
    public final long m6281() {
        byte[] bArr;
        long j;
        long j2;
        int i = this.f9235;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f9240;
            bArr = this.f9242;
            if (i3 < i4) {
                byte b = bArr[i];
                if (b >= 0 && i3 < 8 && (i3 != 0 || bArr[this.f9235] != 0)) {
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
        i = this.f9235;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = -3750763034362895579L;
        while (i2 < this.f9240) {
            j4 = (j4 ^ ((long) bArr[i])) * 1099511628211L;
            i2++;
            i++;
        }
        return j4;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子, reason: contains not printable characters */
    public final String m6282(byte b) {
        String strMo6184;
        StringBuilder sb = new StringBuilder();
        sb.append(InterfaceC2912.m6357(b));
        if (mo6179()) {
            int i = this.f9194;
            this.f9194 = i - 1;
            try {
                strMo6184 = mo6184();
            } catch (Throwable unused) {
                strMo6184 = null;
            }
            if (strMo6184 != null) {
                sb.append(' ');
                sb.append(strMo6184);
            }
            this.f9194 = i;
        }
        sb.append(", offset ");
        sb.append(this.f9194);
        sb.append('/');
        sb.append(this.f9242.length);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02bc  */
    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏子世兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo6239() {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2904.mo6239():long");
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰世哲 */
    public final ZonedDateTime mo6241() {
        ZoneId zoneIdM6409;
        int i = this.f9194;
        int i2 = i + 1;
        this.f9194 = i2;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -86) {
            int i3 = (bArr[i2] << 8) + (bArr[i + 2] & DefaultClassResolver.NAME);
            byte b2 = bArr[i + 3];
            byte b3 = bArr[i + 4];
            byte b4 = bArr[i + 5];
            byte b5 = bArr[i + 6];
            byte b6 = bArr[i + 7];
            this.f9194 = i + 8;
            LocalDateTime localDateTimeOf = LocalDateTime.of(i3, b2, b3, b4, b5, b6, mo6212());
            if (mo6244() == -4800907791268808639L) {
                zoneIdM6409 = AbstractC2866.f9026;
            } else {
                String strMo6100 = mo6100();
                zoneIdM6409 = this.f9201.m6409();
                if (!zoneIdM6409.getId().equals(strMo6100)) {
                    zoneIdM6409 = AbstractC2866.m5856(strMo6100, AbstractC2866.f9026);
                }
            }
            return ZonedDateTime.ofLocal(localDateTimeOf, zoneIdM6409, null);
        }
        if (b == -88) {
            int i4 = i + 2;
            this.f9194 = i4;
            int i5 = bArr[i2] << 8;
            int i6 = i + 3;
            this.f9194 = i6;
            int i7 = i5 + (bArr[i4] & DefaultClassResolver.NAME);
            int i8 = i + 4;
            this.f9194 = i8;
            byte b7 = bArr[i6];
            int i9 = i + 5;
            this.f9194 = i9;
            byte b8 = bArr[i8];
            int i10 = i + 6;
            this.f9194 = i10;
            byte b9 = bArr[i9];
            int i11 = i + 7;
            this.f9194 = i11;
            byte b10 = bArr[i10];
            this.f9194 = i + 8;
            return ZonedDateTime.of(LocalDateTime.of(i7, b7, b8, b9, b10, bArr[i11], mo6212()), AbstractC2866.f9027);
        }
        if (b == -87) {
            int i12 = i + 2;
            this.f9194 = i12;
            int i13 = bArr[i2] << 8;
            int i14 = i + 3;
            this.f9194 = i14;
            int i15 = i13 + (bArr[i12] & DefaultClassResolver.NAME);
            int i16 = i + 4;
            this.f9194 = i16;
            byte b11 = bArr[i14];
            this.f9194 = i + 5;
            return ZonedDateTime.of(LocalDate.of(i15, b11, bArr[i16]), LocalTime.MIN, AbstractC2866.f9027);
        }
        int i17 = this.f9241;
        if (b != -66) {
            switch (b) {
                case -85:
                    break;
                case -84:
                    m6271(i2, i17);
                    long jM5737 = AbstractC2849.m5737(bArr, i2);
                    this.f9194 += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(jM5737), AbstractC2866.f9027);
                case -83:
                    m6271(i2, i17);
                    long jM57372 = AbstractC2849.m5737(bArr, i2);
                    this.f9194 += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(jM57372 * 60), AbstractC2866.f9027);
                case -82:
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(mo6209(), mo6212()), AbstractC2866.f9027);
                case -81:
                    return null;
                default:
                    if (b < 73 || b > 120) {
                        throw m6268(b);
                    }
                    this.f9194 = i;
                    return mo6242(b - 73);
            }
        }
        m6272(i2, i17);
        long jM5730 = AbstractC2849.m5730(bArr, i2);
        this.f9194 += 8;
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(jM5730), AbstractC2866.f9027);
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世 */
    public final ZonedDateTime mo6242(int i) {
        ZonedDateTime zonedDateTimeM5881;
        int i2 = this.f9194;
        byte[] bArr = this.f9242;
        byte b = bArr[i2];
        this.f9239 = b;
        if (b < 73 || b > 120) {
            C0276.m850("date only support string input");
            return null;
        }
        if (i < 19 || (zonedDateTimeM5881 = AbstractC2866.m5881(bArr, i2 + 1, i, (ZoneId) this.f9201.f9319)) == null) {
            C0276.m841(mo6184(), "illegal LocalDateTime string : ");
            return null;
        }
        this.f9194 = i + 1 + this.f9194;
        return zonedDateTimeM5881;
    }

    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰 */
    public final UUID mo6243() {
        int i = this.f9194;
        int i2 = i + 1;
        this.f9194 = i2;
        byte[] bArr = this.f9242;
        byte b = bArr[i];
        if (b == -111) {
            this.f9194 = i + 2;
            byte b2 = bArr[i2];
            if (b2 != 16 && i + 17 >= this.f9241) {
                C0276.m850(AbstractC6183.m11588(b2, "uuid not support "));
                return null;
            }
            UUID uuid = new UUID(AbstractC2849.m5730(bArr, this.f9194), AbstractC2849.m5730(bArr, this.f9194 + 8));
            this.f9194 += 16;
            return uuid;
        }
        if (b == -81) {
            return null;
        }
        if (b == 105) {
            UUID uuidM6251 = C2902.m6251(bArr, i2);
            this.f9194 += 32;
            return uuidM6251;
        }
        if (b == 109) {
            if (bArr[i + 9] != 45 || bArr[i + 14] != 45 || bArr[i + 19] != 45 || bArr[i + 24] != 45) {
                C0276.m850("Invalid UUID string:  ".concat(new String(bArr, i2, 36, StandardCharsets.ISO_8859_1)));
                return null;
            }
            UUID uuidM6254 = C2902.m6254(bArr, i2);
            this.f9194 += 36;
            return uuidM6254;
        }
        if (b != 121 && b != 122) {
            throw m6268(b);
        }
        int iM6278 = m6278();
        if (iM6278 == 32) {
            UUID uuidM62512 = C2902.m6251(bArr, this.f9194);
            this.f9194 += 32;
            return uuidM62512;
        }
        if (iM6278 == 36) {
            int i3 = this.f9194;
            if (bArr[i3 + 8] == 45 && bArr[i3 + 13] == 45 && bArr[i3 + 18] == 45 && bArr[i3 + 23] == 45) {
                UUID uuidM62542 = C2902.m6254(bArr, i3);
                this.f9194 += 36;
                return uuidM62542;
            }
        }
        C0276.m850("Invalid UUID string:  ".concat(new String(bArr, this.f9194, iM6278, StandardCharsets.UTF_8)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0302 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d A[RETURN] */
    @Override // com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo6244() {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2904.mo6244():long");
    }
}
