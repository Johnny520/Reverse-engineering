package com.alibaba.fastjson2;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.compose.foundation.text.C1804;
import androidx.profileinstaller.AbstractC3275;
import androidx.recyclerview.widget.C3329;
import com.alibaba.fastjson2.reader.C3540;
import com.alibaba.fastjson2.reader.C3541;
import com.alibaba.fastjson2.reader.C3544;
import com.alibaba.fastjson2.reader.C3562;
import com.alibaba.fastjson2.reader.C3629;
import com.alibaba.fastjson2.reader.C3635;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3699;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.BuildConfig;
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
import lin.xposed.hook.javaplugin.C6385;
import p025.AbstractC7012;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3737 extends AbstractC3732 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final byte[] f9574;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static Charset f9576;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public long f9578;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f9579;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f9580;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public byte f9581;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C3744 f9582;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public byte[] f9583;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public byte f9584;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f9585;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int f9586;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final byte[] f9587;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public byte f9588;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f9589;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public long[] f9590;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static final long f9577 = AbstractC3687.f9266.arrayBaseOffset(byte[].class);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static final byte[] f9575 = InterfaceC3745.m6915("Asia/Shanghai");

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
        f9574 = bArr;
    }

    public C3737(int i, C3776 c3776, byte[] bArr) {
        super(c3776, true);
        this.f9587 = bArr;
        this.f9539 = 0;
        this.f9586 = i;
        C3744[] c3744Arr = AbstractC3766.f9644;
        this.f9582 = c3744Arr[System.identityHashCode(Thread.currentThread()) & (c3744Arr.length - 1)];
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰世哲子, reason: contains not printable characters */
    public static int m6826(int i, byte[] bArr, int i2) {
        return ((i2 + 48) << 8) + (bArr[i] & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲, reason: contains not printable characters */
    public static int m6827(int i, byte[] bArr, int i2) {
        return ((i2 + 60) << 16) + (AbstractC3682.m6258(bArr, i) & 65535);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰哲世子, reason: contains not printable characters */
    public static JSONException m6828(byte b) {
        return new JSONException("name not support input : " + InterfaceC3745.m6917(b));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰子世哲, reason: contains not printable characters */
    public static int m6829(int i, byte[] bArr, int i2) {
        return ((i2 - 68) << 16) + (AbstractC3682.m6258(bArr, i) & 65535);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰子哲世, reason: contains not printable characters */
    public static int m6830(int i, byte[] bArr, int i2) {
        return ((i2 - 56) << 8) + (bArr[i] & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲世兰子, reason: contains not printable characters */
    public static void m6831(int i, int i2) {
        if (i + 3 < i2) {
            return;
        }
        C1123.m1410(AbstractC7012.m12150(i, i2, "offset overflow, offset ", ", end "));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲兰子世, reason: contains not printable characters */
    public static void m6832(int i, int i2) {
        if (i + 7 < i2) {
            return;
        }
        C1123.m1410(AbstractC7012.m12150(i, i2, "offset overflow, offset ", ", end "));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = this.f9583;
        if (bArr == null || bArr.length >= 8388608) {
            return;
        }
        AbstractC3766.f9635.lazySet(this.f9582, bArr);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final int mo6659() {
        byte b = this.f9587[this.f9539];
        this.f9584 = b;
        if (b >= 73 && b < 120) {
            return b - 73;
        }
        C6385.m11441();
        return 0;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final String mo6660() {
        Charset charset;
        byte b = this.f9581;
        int i = this.f9585;
        if (b == -81) {
            return null;
        }
        if (i < 0) {
            throw null;
        }
        byte[] bArr = this.f9587;
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
                    throw m6828(b);
                }
                charset = StandardCharsets.UTF_16BE;
            }
        } else {
            if (AbstractC3687.f9268 != null) {
                return AbstractC3687.m6329(this.f9580, bArr, i);
            }
            BiFunction biFunction = AbstractC3687.f9267;
            if (biFunction != null) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, this.f9580, bArr2, 0, i);
                return (String) biFunction.apply(bArr2, (byte) 0);
            }
            charset = StandardCharsets.ISO_8859_1;
        }
        return new String(bArr, this.f9580, i, charset);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final String mo6664() {
        return mo6660();
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final long mo6666() {
        byte[] bArr;
        long j;
        long j2;
        int i = this.f9580;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f9585;
            bArr = this.f9587;
            if (i3 < i4) {
                byte b = bArr[i];
                if (b >= 0 && i3 < 8 && (i3 != 0 || bArr[this.f9580] != 0)) {
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
        i = this.f9580;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = -3750763034362895579L;
        while (i2 < this.f9585) {
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

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final boolean mo6668() {
        this.f9541 = false;
        int i = this.f9539;
        this.f9539 = i + 1;
        byte b = this.f9587[i];
        if (b == -79) {
            return true;
        }
        if (b == -80) {
            return false;
        }
        return m6836(b);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public final char mo6669() {
        int iMo6772;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -112) {
            this.f9539 = i + 1;
            iMo6772 = mo6772();
        } else {
            if (b == 73) {
                this.f9539 = i + 1;
                return (char) 0;
            }
            if (b <= 73 || b >= 120) {
                String strMo6744 = mo6744();
                if (strMo6744 == null || strMo6744.isEmpty()) {
                    return (char) 0;
                }
                return strMo6744.charAt(0);
            }
            this.f9539 = i + 2;
            iMo6772 = bArr[i + 1] & DefaultClassResolver.NAME;
        }
        return (char) iMo6772;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public final BigInteger mo6670() {
        int i = this.f9539;
        int i2 = i + 1;
        this.f9539 = i2;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -70) {
            return BigInteger.valueOf(mo6769());
        }
        if (b == -69) {
            int iMo6772 = mo6772();
            byte[] bArr2 = new byte[iMo6772];
            System.arraycopy(bArr, this.f9539, bArr2, 0, iMo6772);
            this.f9539 += iMo6772;
            return new BigInteger(bArr2);
        }
        if (b == -111) {
            int iMo67722 = mo6772();
            byte[] bArr3 = new byte[iMo67722];
            System.arraycopy(bArr, this.f9539, bArr3, 0, iMo67722);
            this.f9539 += iMo67722;
            return new BigInteger(bArr3);
        }
        if (b == -71) {
            int iMo67723 = mo6772();
            BigInteger bigIntegerMo6670 = mo6670();
            return (iMo67723 == 0 ? new BigDecimal(bigIntegerMo6670) : new BigDecimal(bigIntegerMo6670, iMo67723)).toBigInteger();
        }
        int i3 = this.f9586;
        if (b != 72) {
            if (b == 124) {
                int iMo67724 = mo6772();
                String str = new String(bArr, this.f9539, iMo67724, StandardCharsets.UTF_16LE);
                this.f9539 += iMo67724;
                return str.indexOf(46) == -1 ? new BigInteger(str) : AbstractC3700.m6473(str).toBigInteger();
            }
            if (b == 121) {
                int iMo67725 = mo6772();
                String str2 = new String(bArr, this.f9539, iMo67725, StandardCharsets.ISO_8859_1);
                this.f9539 += iMo67725;
                return str2.indexOf(46) == -1 ? new BigInteger(str2) : AbstractC3700.m6473(str2).toBigInteger();
            }
            if (b == 122) {
                int iMo67726 = mo6772();
                String str3 = new String(bArr, this.f9539, iMo67726, StandardCharsets.UTF_8);
                this.f9539 += iMo67726;
                return str3.indexOf(46) == -1 ? new BigInteger(str3) : AbstractC3700.m6473(str3).toBigInteger();
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
                    return BigInteger.valueOf(mo6769());
                case -75:
                    m6832(i2, i3);
                    long jM6290 = AbstractC3682.m6290(bArr, i2);
                    this.f9539 += 8;
                    return BigInteger.valueOf((long) Double.longBitsToDouble(jM6290));
                case -74:
                    return BigInteger.valueOf(mo6772());
                case -73:
                    m6831(i2, i3);
                    int iM6297 = AbstractC3682.m6297(bArr, i2);
                    this.f9539 += 4;
                    return BigInteger.valueOf((long) Float.intBitsToFloat(iM6297));
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9539 = i + 3;
                            return BigInteger.valueOf(i4);
                        case -67:
                            this.f9539 = i + 2;
                            return BigInteger.valueOf(bArr[i2]);
                        case -66:
                            m6832(i2, i3);
                            long jM62902 = AbstractC3682.m6290(bArr, i2);
                            this.f9539 += 8;
                            return BigInteger.valueOf(jM62902);
                        case -65:
                            break;
                        default:
                            if (InterfaceC3745.m6921(b)) {
                                return BigInteger.valueOf(b);
                            }
                            if (InterfaceC3745.m6916(b)) {
                                this.f9539 = this.f9539 + 1;
                                return BigInteger.valueOf(m6830(r0, bArr, b));
                            }
                            if (InterfaceC3745.m6913(b)) {
                                int i5 = this.f9539;
                                if (i5 + 1 < i3) {
                                    int iM6829 = m6829(i5, bArr, b);
                                    this.f9539 += 2;
                                    return BigInteger.valueOf(iM6829);
                                }
                            }
                            if (InterfaceC3745.m6919(b)) {
                                return BigInteger.valueOf(b + 32);
                            }
                            if (InterfaceC3745.m6918(b)) {
                                this.f9539 = this.f9539 + 1;
                                return BigInteger.valueOf(m6826(r0, bArr, b));
                            }
                            if (InterfaceC3745.m6914(b)) {
                                int i6 = this.f9539;
                                if (i6 + 1 < i3) {
                                    int iM6827 = m6827(i6, bArr, b);
                                    this.f9539 += 2;
                                    return BigInteger.valueOf(iM6827);
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6828(b);
                            }
                            int i7 = b - 73;
                            String strM6835 = m6835(i7);
                            this.f9539 += i7;
                            return new BigInteger(strM6835);
                    }
                    break;
            }
        }
        m6831(i2, i3);
        int iM62972 = AbstractC3682.m6297(bArr, i2);
        this.f9539 += 4;
        return BigInteger.valueOf(iM62972);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public final BigDecimal mo6671() {
        int i = this.f9539;
        int i2 = i + 1;
        this.f9539 = i2;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        int i3 = this.f9586;
        if (b == -71) {
            int iMo6772 = mo6772();
            int i4 = this.f9539;
            byte b2 = bArr[i4];
            if (b2 == -70) {
                this.f9539 = i4 + 1;
                return BigDecimal.valueOf(mo6769(), iMo6772);
            }
            if (b2 == 72) {
                m6831(i4 + 1, i3);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(AbstractC3682.m6297(bArr, r1), iMo6772);
                this.f9539 += 5;
                return bigDecimalValueOf;
            }
            if (b2 != -66) {
                BigInteger bigIntegerMo6670 = mo6670();
                return iMo6772 == 0 ? new BigDecimal(bigIntegerMo6670) : new BigDecimal(bigIntegerMo6670, iMo6772);
            }
            int i5 = i4 + 1;
            m6832(i5, i3);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(AbstractC3682.m6290(bArr, i5), iMo6772);
            this.f9539 += 9;
            return bigDecimalValueOf2;
        }
        if (b == -72) {
            return BigDecimal.valueOf(mo6769());
        }
        if (b != 72) {
            if (b == 124) {
                int iMo67722 = mo6772();
                String str = new String(bArr, this.f9539, iMo67722, StandardCharsets.UTF_16LE);
                this.f9539 += iMo67722;
                return AbstractC3700.m6473(str);
            }
            if (b == 121) {
                int iMo67723 = mo6772();
                String str2 = new String(bArr, this.f9539, iMo67723, StandardCharsets.ISO_8859_1);
                this.f9539 += iMo67723;
                return AbstractC3700.m6473(str2);
            }
            if (b == 122) {
                int iMo67724 = mo6772();
                String str3 = new String(bArr, this.f9539, iMo67724, StandardCharsets.UTF_8);
                this.f9539 += iMo67724;
                return AbstractC3700.m6473(str3);
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
                    return BigDecimal.valueOf(mo6769());
                case -75:
                    m6832(i2, i3);
                    long jM6290 = AbstractC3682.m6290(bArr, i2);
                    this.f9539 += 8;
                    return BigDecimal.valueOf((long) Double.longBitsToDouble(jM6290));
                case -74:
                    return BigDecimal.valueOf(mo6772());
                case -73:
                    m6831(i2, i3);
                    int iM6297 = AbstractC3682.m6297(bArr, i2);
                    this.f9539 += 4;
                    return BigDecimal.valueOf((long) Float.intBitsToFloat(iM6297));
                default:
                    switch (b) {
                        case -69:
                            return new BigDecimal(mo6670());
                        case -68:
                            int i6 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9539 = i + 3;
                            return BigDecimal.valueOf(i6);
                        case -67:
                            this.f9539 = i + 2;
                            return BigDecimal.valueOf(bArr[i2]);
                        case -66:
                            m6832(i2, i3);
                            long jM62902 = AbstractC3682.m6290(bArr, i2);
                            this.f9539 += 8;
                            return BigDecimal.valueOf(jM62902);
                        case -65:
                            break;
                        default:
                            if (InterfaceC3745.m6921(b)) {
                                return BigDecimal.valueOf(b);
                            }
                            if (InterfaceC3745.m6916(b)) {
                                this.f9539 = this.f9539 + 1;
                                return BigDecimal.valueOf(m6830(r0, bArr, b));
                            }
                            if (InterfaceC3745.m6913(b)) {
                                int i7 = this.f9539;
                                if (i7 + 1 < i3) {
                                    int iM6829 = m6829(i7, bArr, b);
                                    this.f9539 += 2;
                                    return BigDecimal.valueOf(iM6829);
                                }
                            }
                            if (InterfaceC3745.m6919(b)) {
                                return BigDecimal.valueOf(b + 32);
                            }
                            if (InterfaceC3745.m6918(b)) {
                                this.f9539 = this.f9539 + 1;
                                return BigDecimal.valueOf(m6826(r0, bArr, b));
                            }
                            if (InterfaceC3745.m6914(b)) {
                                int i8 = this.f9539;
                                if (i8 + 1 < i3) {
                                    int iM6827 = m6827(i8, bArr, b);
                                    this.f9539 += 2;
                                    return BigDecimal.valueOf(iM6827);
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6828(b);
                            }
                            int i9 = b - 73;
                            String strM6835 = m6835(i9);
                            this.f9539 += i9;
                            return AbstractC3700.m6473(strM6835);
                    }
                    break;
            }
        }
        m6831(i2, i3);
        int iM62972 = AbstractC3682.m6297(bArr, i2);
        this.f9539 += 4;
        return BigDecimal.valueOf(iM62972);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public final Boolean mo6672() {
        int i = this.f9539;
        this.f9539 = i + 1;
        byte b = this.f9587[i];
        if (b == -81) {
            return null;
        }
        return b == -79 ? Boolean.TRUE : b == -80 ? Boolean.FALSE : Boolean.valueOf(m6836(b));
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public final byte[] mo6673() {
        int i = this.f9539;
        this.f9539 = i + 1;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b != -111) {
            throw m6828(b);
        }
        int iM6838 = m6838();
        byte[] bArr2 = new byte[iM6838];
        System.arraycopy(bArr, this.f9539, bArr2, 0, iM6838);
        this.f9539 += iM6838;
        return bArr2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏 */
    public final float mo6674() {
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != -73) {
            return m6839();
        }
        int i2 = i + 1;
        m6831(i2, this.f9586);
        int iM6297 = AbstractC3682.m6297(bArr, i2);
        this.f9539 = i + 5;
        return Float.intBitsToFloat(iM6297);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪 */
    public final byte[] mo6675() {
        String strMo6744 = mo6744();
        int length = strMo6744.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char cCharAt = strMo6744.charAt(i2);
            char cCharAt2 = strMo6744.charAt(i2 + 1);
            char c = '7';
            int i3 = cCharAt - (cCharAt <= '9' ? '0' : '7');
            if (cCharAt2 <= '9') {
                c = '0';
            }
            bArr[i] = (byte) ((cCharAt2 - c) | (i3 << 4));
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public final Float mo6677() {
        int i = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -73) {
            int i2 = (bArr[i + 4] & DefaultClassResolver.NAME) + ((bArr[i + 3] & DefaultClassResolver.NAME) << 8) + ((bArr[i + 2] & DefaultClassResolver.NAME) << 16) + (bArr[i + 1] << 24);
            this.f9539 = i + 5;
            return Float.valueOf(Float.intBitsToFloat(i2));
        }
        if (b != -81) {
            return Float.valueOf(m6839());
        }
        this.f9539 = i + 1;
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public final Instant mo6678() {
        int i = this.f9539;
        int i2 = i + 1;
        this.f9539 = i2;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        int i3 = this.f9586;
        if (b != -66) {
            switch (b) {
                case -85:
                    break;
                case -84:
                    m6831(i2, i3);
                    long jM6297 = AbstractC3682.m6297(bArr, i2);
                    this.f9539 += 4;
                    return Instant.ofEpochSecond(jM6297, 0L);
                case -83:
                    m6831(i2, i3);
                    long jM62972 = AbstractC3682.m6297(bArr, i2);
                    this.f9539 += 4;
                    return Instant.ofEpochSecond(jM62972 * 60, 0L);
                case -82:
                    return Instant.ofEpochSecond(mo6769(), mo6772());
                default:
                    C6385.m11441();
                    return null;
            }
        }
        m6832(i2, i3);
        long jM6290 = AbstractC3682.m6290(bArr, i2);
        this.f9539 += 8;
        return Instant.ofEpochMilli(jM6290);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final boolean mo6679() {
        int i = this.f9539;
        if (this.f9587[i] != -81) {
            return false;
        }
        this.f9539 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public final void mo6680(Map map, long j) {
        Object objMo6754;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != -90) {
            C1123.m1410("object not support input ".concat(m6842(this.f9584)));
            return;
        }
        this.f9539 = i + 1;
        long j2 = j | this.f9546.f9665;
        while (true) {
            int i2 = this.f9539;
            byte b = bArr[i2];
            if (b == -91) {
                this.f9539 = i2 + 1;
                return;
            }
            Object objMo6686 = b >= 73 ? mo6686() : mo6684();
            if (mo6740()) {
                String strMo6749 = mo6749();
                if ("..".equals(strMo6749)) {
                    map.put(objMo6686, map);
                } else {
                    m6713(map, objMo6686, AbstractC3755.m6938(strMo6749));
                    map.put(objMo6686, null);
                }
            } else {
                byte b2 = bArr[this.f9539];
                if (b2 >= 73 && b2 <= 126) {
                    objMo6754 = mo6744();
                } else if (InterfaceC3745.m6921(b2)) {
                    this.f9539++;
                    objMo6754 = Integer.valueOf(b2);
                } else if (b2 == -79) {
                    this.f9539++;
                    objMo6754 = Boolean.TRUE;
                } else if (b2 == -80) {
                    this.f9539++;
                    objMo6754 = Boolean.FALSE;
                } else {
                    objMo6754 = b2 == -90 ? mo6754() : mo6684();
                }
                if (objMo6754 != null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j2) == 0) {
                    map.put(objMo6686, objMo6754);
                }
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public final List mo6682(Type type) {
        if (mo6693()) {
            return null;
        }
        if (this.f9587[this.f9539] == -110) {
            Object objMo6684 = mo6684();
            if (objMo6684 instanceof List) {
                return (List) objMo6684;
            }
            if (objMo6684 instanceof Collection) {
                return new JSONArray((Collection<?>) objMo6684);
            }
            C1123.m1410(AbstractC3275.m5141(objMo6684, new StringBuilder("not support class ")));
            return null;
        }
        int iMo6792 = mo6792();
        JSONArray jSONArray = new JSONArray(iMo6792);
        for (int i = 0; i < iMo6792; i++) {
            jSONArray.add(mo6699(type));
        }
        return jSONArray;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲 */
    public final Object mo6684() {
        Object objMo6686;
        String str;
        String str2;
        Object objMo6754;
        String str3;
        String str4;
        int i = 0;
        int i2 = this.f9539;
        byte[] bArr = this.f9587;
        String str5 = "/";
        if (i2 >= bArr.length) {
            throw new JSONException("readAny overflow : " + this.f9539 + "/" + bArr.length);
        }
        int i3 = i2 + 1;
        this.f9539 = i3;
        byte b = bArr[i2];
        this.f9584 = b;
        int i4 = this.f9586;
        if (b == 72) {
            m6831(i3, i4);
            int iM6297 = AbstractC3682.m6297(bArr, i3);
            this.f9539 += 4;
            return Integer.valueOf(iM6297);
        }
        String str6 = ", offset ";
        C3776 c3776 = this.f9546;
        switch (b) {
            case -112:
                return Character.valueOf((char) mo6772());
            case -111:
                int iM6838 = m6838();
                int i5 = this.f9539;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i5 + iM6838);
                this.f9539 += iM6838;
                return bArrCopyOfRange;
            case -110:
                long jMo6799 = mo6799();
                c3776.getClass();
                if ((c3776.f9665 & JSONReader$Feature.SupportAutoType.mask) == 0) {
                    if (mo6737()) {
                        return mo6754();
                    }
                    if (mo6729()) {
                        return mo6685();
                    }
                    throw new JSONException("autoType not support , offset " + this.f9539 + "/" + bArr.length);
                }
                InterfaceC3621 interfaceC3621M6190 = ((C3635) c3776.f9663).m6190(jMo6799);
                if (interfaceC3621M6190 == null) {
                    String strMo6660 = mo6660();
                    InterfaceC3621 interfaceC3621M6970 = c3776.m6970(null, strMo6660);
                    if (interfaceC3621M6970 == null) {
                        StringBuilder sbM12144 = AbstractC7012.m12144("autoType not support : ", strMo6660, ", offset ");
                        sbM12144.append(this.f9539);
                        sbM12144.append("/");
                        sbM12144.append(bArr.length);
                        throw new JSONException(sbM12144.toString());
                    }
                    interfaceC3621M6190 = interfaceC3621M6970;
                }
                return interfaceC3621M6190.mo6027(this, null, null, 0L);
            default:
                boolean z = true;
                switch (b) {
                    case -90:
                        boolean z2 = (c3776.f9665 & JSONReader$Feature.SupportAutoType.mask) != 0;
                        Map map = null;
                        while (true) {
                            int i6 = this.f9539;
                            byte b2 = bArr[i6];
                            if (b2 == -91) {
                                this.f9539 = i6 + 1;
                                return map == null ? (c3776.f9665 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new HashMap() : new JSONObject() : map;
                            }
                            if (!z2 || i != 0 || b2 < 73) {
                                objMo6686 = b2 >= 73 ? mo6686() : mo6684();
                            } else {
                                if (mo6689() == InterfaceC3621.f8931) {
                                    InterfaceC3621 interfaceC3621M61902 = ((C3635) c3776.f9663).m6190(mo6804());
                                    if (interfaceC3621M61902 == null) {
                                        String strMo66602 = mo6660();
                                        InterfaceC3621 interfaceC3621M69702 = c3776.m6970(null, strMo66602);
                                        if (interfaceC3621M69702 == null) {
                                            StringBuilder sbM121442 = AbstractC7012.m12144("autoType not support : ", strMo66602, str6);
                                            sbM121442.append(this.f9539);
                                            sbM121442.append(str5);
                                            sbM121442.append(bArr.length);
                                            throw new JSONException(sbM121442.toString());
                                        }
                                        interfaceC3621M61902 = interfaceC3621M69702;
                                    }
                                    this.f9525 = z;
                                    return interfaceC3621M61902.mo6027(this, null, null, 0L);
                                }
                                objMo6686 = mo6660();
                            }
                            if (map == null) {
                                str2 = str6;
                                str = str5;
                                map = (JSONReader$Feature.UseNativeObject.mask & c3776.f9665) != 0 ? new HashMap() : new JSONObject();
                            } else {
                                str = str5;
                                str2 = str6;
                            }
                            if (mo6740()) {
                                String strMo6749 = mo6749();
                                if ("..".equals(strMo6749)) {
                                    map.put(objMo6686, map);
                                } else {
                                    m6713(map, objMo6686, AbstractC3755.m6938(strMo6749));
                                    map.put(objMo6686, null);
                                }
                                z = true;
                            } else {
                                byte b3 = bArr[this.f9539];
                                if (b3 >= 73 && b3 <= 126) {
                                    objMo6754 = mo6744();
                                    z = true;
                                } else if (InterfaceC3745.m6921(b3)) {
                                    z = true;
                                    this.f9539++;
                                    objMo6754 = Integer.valueOf(b3);
                                } else {
                                    z = true;
                                    if (b3 == -79) {
                                        this.f9539++;
                                        objMo6754 = Boolean.TRUE;
                                    } else if (b3 == -80) {
                                        this.f9539++;
                                        objMo6754 = Boolean.FALSE;
                                    } else {
                                        objMo6754 = b3 == -90 ? mo6754() : mo6684();
                                    }
                                }
                                if (objMo6754 != null || (c3776.f9665 & JSONReader$Feature.IgnoreNullPropertyValue.mask) == 0) {
                                    map.put(objMo6686, objMo6754);
                                }
                            }
                            i++;
                            str6 = str2;
                            str5 = str;
                        }
                        break;
                    case -89:
                        int i7 = i2 + 2;
                        this.f9539 = i7;
                        byte b4 = bArr[i3];
                        int i8 = i2 + 3;
                        this.f9539 = i8;
                        byte b5 = bArr[i7];
                        this.f9539 = i2 + 4;
                        return LocalTime.of(b4, b5, bArr[i8], mo6772());
                    case -88:
                        int i9 = i2 + 2;
                        this.f9539 = i9;
                        int i10 = bArr[i3] << 8;
                        int i11 = i2 + 3;
                        this.f9539 = i11;
                        int i12 = i10 + (bArr[i9] & DefaultClassResolver.NAME);
                        int i13 = i2 + 4;
                        this.f9539 = i13;
                        byte b6 = bArr[i11];
                        int i14 = i2 + 5;
                        this.f9539 = i14;
                        byte b7 = bArr[i13];
                        int i15 = i2 + 6;
                        this.f9539 = i15;
                        byte b8 = bArr[i14];
                        int i16 = i2 + 7;
                        this.f9539 = i16;
                        byte b9 = bArr[i15];
                        this.f9539 = i2 + 8;
                        return LocalDateTime.of(i12, b6, b7, b8, b9, bArr[i16], mo6772());
                    case -87:
                        int i17 = i2 + 2;
                        this.f9539 = i17;
                        int i18 = bArr[i3] << 8;
                        int i19 = i2 + 3;
                        this.f9539 = i19;
                        int i20 = i18 + (bArr[i17] & DefaultClassResolver.NAME);
                        int i21 = i2 + 4;
                        this.f9539 = i21;
                        byte b10 = bArr[i19];
                        this.f9539 = i2 + 5;
                        return LocalDate.of(i20, b10, bArr[i21]);
                    case -86:
                        return m6833();
                    case -85:
                        m6832(i3, i4);
                        long jM6290 = AbstractC3682.m6290(bArr, i3);
                        this.f9539 += 8;
                        return new Date(jM6290);
                    case -84:
                        m6831(i3, i4);
                        long jM6297 = AbstractC3682.m6297(bArr, i3);
                        this.f9539 += 4;
                        return new Date(jM6297 * 1000);
                    case -83:
                        m6831(i3, i4);
                        long jM62972 = AbstractC3682.m6297(bArr, i3);
                        this.f9539 += 4;
                        return new Date(jM62972 * 60000);
                    case -82:
                        return Instant.ofEpochSecond(mo6769(), mo6772());
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
                        return Double.valueOf(mo6769());
                    case -75:
                        m6832(i3, i4);
                        long jM62902 = AbstractC3682.m6290(bArr, i3);
                        this.f9539 += 8;
                        return Double.valueOf(Double.longBitsToDouble(jM62902));
                    case -74:
                        return Float.valueOf(mo6772());
                    case -73:
                        m6831(i3, i4);
                        int iM62972 = AbstractC3682.m6297(bArr, i3);
                        this.f9539 += 4;
                        return Float.valueOf(Float.intBitsToFloat(iM62972));
                    case -72:
                        return BigDecimal.valueOf(mo6769());
                    case -71:
                        int iMo6772 = mo6772();
                        BigInteger bigIntegerMo6670 = mo6670();
                        return iMo6772 == 0 ? new BigDecimal(bigIntegerMo6670) : new BigDecimal(bigIntegerMo6670, iMo6772);
                    case -70:
                        return BigInteger.valueOf(mo6769());
                    case -69:
                        int iMo67722 = mo6772();
                        byte[] bArr2 = new byte[iMo67722];
                        System.arraycopy(bArr, this.f9539, bArr2, 0, iMo67722);
                        this.f9539 += iMo67722;
                        return new BigInteger(bArr2);
                    case -68:
                        int i22 = i2 + 2;
                        this.f9539 = i22;
                        int i23 = bArr[i3] << 8;
                        this.f9539 = i2 + 3;
                        return Short.valueOf((short) (i23 + (bArr[i22] & DefaultClassResolver.NAME)));
                    case -67:
                        this.f9539 = i2 + 2;
                        return Byte.valueOf(bArr[i3]);
                    case -66:
                        m6832(i3, i4);
                        long jM62903 = AbstractC3682.m6290(bArr, i3);
                        this.f9539 += 8;
                        return Long.valueOf(jM62903);
                    case -65:
                        m6831(i3, i4);
                        int iM62973 = AbstractC3682.m6297(bArr, i3);
                        this.f9539 += 4;
                        return Long.valueOf(iM62973);
                    default:
                        switch (b) {
                            case 122:
                                int iM68382 = m6838();
                                BiFunction biFunction = AbstractC3687.f9267;
                                if (biFunction != null && !AbstractC3687.f9276) {
                                    if (this.f9583 == null) {
                                        byte[] bArr3 = (byte[]) AbstractC3766.f9635.getAndSet(this.f9582, null);
                                        this.f9583 = bArr3;
                                        if (bArr3 == null) {
                                            this.f9583 = new byte[8192];
                                        }
                                    }
                                    int i24 = iM68382 << 1;
                                    if (i24 > this.f9583.length) {
                                        this.f9583 = new byte[i24];
                                    }
                                    int iM6284 = AbstractC3682.m6284(this.f9539, iM68382, bArr, this.f9583);
                                    if (iM6284 != -1) {
                                        byte[] bArr4 = new byte[iM6284];
                                        System.arraycopy(this.f9583, 0, bArr4, 0, iM6284);
                                        String str7 = (String) biFunction.apply(bArr4, (byte) 1);
                                        this.f9539 += iM68382;
                                        return str7;
                                    }
                                }
                                String str8 = new String(bArr, this.f9539, iM68382, StandardCharsets.UTF_8);
                                this.f9539 += iM68382;
                                return str8;
                            case 123:
                                int iM68383 = m6838();
                                String str9 = new String(bArr, this.f9539, iM68383, StandardCharsets.UTF_16);
                                this.f9539 += iM68383;
                                return str9;
                            case 124:
                                int iM68384 = m6838();
                                BiFunction biFunction2 = AbstractC3687.f9267;
                                if (biFunction2 == null || AbstractC3687.f9276) {
                                    str3 = new String(bArr, this.f9539, iM68384, StandardCharsets.UTF_16LE);
                                } else {
                                    byte[] bArr5 = new byte[iM68384];
                                    System.arraycopy(bArr, this.f9539, bArr5, 0, iM68384);
                                    str3 = (String) biFunction2.apply(bArr5, iM68384 != 0 ? (byte) 1 : (byte) 0);
                                }
                                this.f9539 += iM68384;
                                return str3;
                            case 125:
                                int iM68385 = m6838();
                                BiFunction biFunction3 = AbstractC3687.f9267;
                                if (biFunction3 == null || !AbstractC3687.f9276) {
                                    str4 = new String(bArr, this.f9539, iM68385, StandardCharsets.UTF_16BE);
                                } else {
                                    byte[] bArr6 = new byte[iM68385];
                                    System.arraycopy(bArr, this.f9539, bArr6, 0, iM68385);
                                    str4 = (String) biFunction3.apply(bArr6, iM68385 != 0 ? (byte) 1 : (byte) 0);
                                }
                                this.f9539 += iM68385;
                                return str4;
                            case 126:
                                if (f9576 == null) {
                                    f9576 = Charset.forName("GB18030");
                                }
                                int iM68386 = m6838();
                                String str10 = new String(bArr, this.f9539, iM68386, f9576);
                                this.f9539 += iM68386;
                                return str10;
                            default:
                                if (InterfaceC3745.m6921(b)) {
                                    return Integer.valueOf(b);
                                }
                                if (InterfaceC3745.m6916(b)) {
                                    int i25 = this.f9539;
                                    this.f9539 = i25 + 1;
                                    return Integer.valueOf(m6830(i25, bArr, b));
                                }
                                if (InterfaceC3745.m6913(b)) {
                                    int i26 = this.f9539;
                                    if (i26 + 1 < i4) {
                                        int iM6829 = m6829(i26, bArr, b);
                                        this.f9539 += 2;
                                        return Integer.valueOf(iM6829);
                                    }
                                }
                                if (InterfaceC3745.m6919(b)) {
                                    return Long.valueOf(((long) (b + 40)) - 8);
                                }
                                if (InterfaceC3745.m6918(b)) {
                                    this.f9539 = this.f9539 + 1;
                                    return Long.valueOf(m6826(r0, bArr, b));
                                }
                                if (InterfaceC3745.m6914(b)) {
                                    int i27 = this.f9539;
                                    if (i27 + 1 < i4) {
                                        long jM6827 = m6827(i27, bArr, b);
                                        this.f9539 += 2;
                                        return Long.valueOf(jM6827);
                                    }
                                }
                                if (b >= -108 && b <= -92) {
                                    int iM68387 = b == -92 ? m6838() : b + 108;
                                    if (iM68387 == 0) {
                                        return (c3776.f9665 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new ArrayList() : new JSONArray();
                                    }
                                    List arrayList = (c3776.f9665 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new ArrayList(iM68387) : new JSONArray(iM68387);
                                    while (i < iM68387) {
                                        if (mo6740()) {
                                            String strMo67492 = mo6749();
                                            if ("..".equals(strMo67492)) {
                                                arrayList.add(arrayList);
                                            } else {
                                                arrayList.add(null);
                                                m6714(arrayList, i, AbstractC3755.m6938(strMo67492));
                                            }
                                        } else {
                                            arrayList.add(mo6684());
                                        }
                                        i++;
                                    }
                                    return arrayList;
                                }
                                if (b < 73 || b > 121) {
                                    if (b != 127) {
                                        C1123.m1410("not support type : ".concat(m6842(b)));
                                        return null;
                                    }
                                    int iM68388 = m6838();
                                    this.f9585 = iM68388;
                                    if (iM68388 < 0) {
                                        throw null;
                                    }
                                    C1123.m1404(this.f9585, "not support symbol : ");
                                    return null;
                                }
                                int iM68389 = b == 121 ? m6838() : b - 73;
                                this.f9585 = iM68389;
                                if (iM68389 < 0) {
                                    throw null;
                                }
                                if (AbstractC3687.f9268 != null) {
                                    String strM6329 = AbstractC3687.m6329(this.f9539, bArr, iM68389);
                                    this.f9539 += this.f9585;
                                    if ((c3776.f9665 & JSONReader$Feature.TrimString.mask) != 0) {
                                        strM6329 = strM6329.trim();
                                    }
                                    if (!strM6329.isEmpty() || (c3776.f9665 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
                                        return strM6329;
                                    }
                                } else {
                                    BiFunction biFunction4 = AbstractC3687.f9267;
                                    if (biFunction4 != null) {
                                        byte[] bArr7 = new byte[iM68389];
                                        System.arraycopy(bArr, this.f9539, bArr7, 0, iM68389);
                                        this.f9539 += this.f9585;
                                        String strTrim = (String) biFunction4.apply(bArr7, b);
                                        if ((c3776.f9665 & JSONReader$Feature.TrimString.mask) != 0) {
                                            strTrim = strTrim.trim();
                                        }
                                        if (!strTrim.isEmpty() || (c3776.f9665 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
                                            return strTrim;
                                        }
                                    } else {
                                        String str11 = new String(bArr, this.f9539, iM68389, StandardCharsets.ISO_8859_1);
                                        this.f9539 += this.f9585;
                                        if ((c3776.f9665 & JSONReader$Feature.TrimString.mask) != 0) {
                                            str11 = str11.trim();
                                        }
                                        if (!str11.isEmpty() || (c3776.f9665 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List mo6685() {
        Object objMo6684;
        int iMo6792 = mo6792();
        JSONArray jSONArray = new JSONArray(iMo6792);
        for (int i = 0; i < iMo6792; i++) {
            int i2 = this.f9539;
            byte[] bArr = this.f9587;
            int i3 = bArr[i2];
            if (i3 >= 73 && i3 <= 126) {
                objMo6684 = mo6744();
            } else if (InterfaceC3745.m6921(i3)) {
                this.f9539++;
                objMo6684 = Integer.valueOf(i3);
            } else if (i3 == -79) {
                this.f9539++;
                objMo6684 = Boolean.TRUE;
            } else if (i3 == -80) {
                this.f9539++;
                objMo6684 = Boolean.FALSE;
            } else if (i3 == -90) {
                objMo6684 = mo6754();
            } else {
                int i4 = this.f9586;
                if (i3 == -66) {
                    int i5 = this.f9539 + 1;
                    this.f9539 = i5;
                    m6832(i5, i4);
                    objMo6684 = Long.valueOf(AbstractC3682.m6290(bArr, i5));
                    this.f9539 += 8;
                } else if (i3 >= -108 && i3 <= -92) {
                    this.f9539++;
                    int iM6838 = i3 == -92 ? m6838() : i3 + 108;
                    C3776 c3776 = this.f9546;
                    if (iM6838 == 0) {
                        objMo6684 = (c3776.f9665 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new ArrayList() : new JSONArray();
                    } else {
                        List arrayList = (JSONReader$Feature.UseNativeObject.mask & c3776.f9665) != 0 ? new ArrayList(iM6838) : new JSONArray(iM6838);
                        for (int i6 = 0; i6 < iM6838; i6++) {
                            if (mo6740()) {
                                String strMo6749 = mo6749();
                                if ("..".equals(strMo6749)) {
                                    arrayList.add(arrayList);
                                } else {
                                    arrayList.add(null);
                                    m6714(arrayList, i6, AbstractC3755.m6938(strMo6749));
                                }
                            } else {
                                byte b = bArr[this.f9539];
                                arrayList.add((b < 73 || b > 126) ? b == -90 ? mo6754() : mo6684() : mo6744());
                            }
                        }
                        objMo6684 = arrayList;
                    }
                } else if (InterfaceC3745.m6916(i3)) {
                    objMo6684 = Integer.valueOf(m6830(this.f9539 + 1, bArr, i3));
                    this.f9539 += 2;
                } else {
                    if (InterfaceC3745.m6914(i3)) {
                        int i7 = this.f9539;
                        if (i7 + 2 < i4) {
                            int iM6827 = m6827(i7 + 1, bArr, i3);
                            this.f9539 += 3;
                            objMo6684 = Integer.valueOf(iM6827);
                        } else if (i3 == 72) {
                            int i8 = this.f9539 + 1;
                            m6831(i8, i4);
                            objMo6684 = Integer.valueOf(AbstractC3682.m6297(bArr, i8));
                            this.f9539 += 5;
                        } else if (i3 == -109) {
                            String strMo67492 = mo6749();
                            if ("..".equals(strMo67492)) {
                                objMo6684 = jSONArray;
                            } else {
                                m6714(jSONArray, i, AbstractC3755.m6938(strMo67492));
                            }
                        } else {
                            objMo6684 = mo6684();
                        }
                    }
                }
            }
            jSONArray.add(objMo6684);
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0393  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo6686() {
        char c;
        Charset charset;
        String strM6462;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        int i2;
        String strM6329;
        int i3;
        int i4 = this.f9539;
        int i5 = i4 + 1;
        this.f9539 = i5;
        byte[] bArr = this.f9587;
        byte b = bArr[i4];
        this.f9581 = b;
        if (b == -81) {
            return null;
        }
        boolean z = b == 127;
        if (z) {
            b = bArr[i5];
            this.f9581 = b;
            if (InterfaceC3745.m6920(b)) {
                int iMo6772 = mo6772();
                if (iMo6772 < 0) {
                    throw null;
                }
                if (iMo6772 == 0) {
                    this.f9581 = this.f9588;
                    this.f9585 = this.f9589;
                    this.f9580 = this.f9579;
                    return mo6660();
                }
                long j11 = this.f9590[(iMo6772 * 2) + 1];
                int i6 = (int) j11;
                this.f9581 = (byte) i6;
                this.f9585 = i6 >> 8;
                this.f9580 = (int) (j11 >> 32);
                return mo6660();
            }
            this.f9539++;
        }
        int i7 = this.f9539;
        this.f9580 = i7;
        if (b == 74) {
            strM6462 = AbstractC3700.m6463((char) (bArr[i7] & DefaultClassResolver.NAME));
            this.f9585 = 1;
            this.f9539++;
        } else {
            if (b != 75) {
                if (b < 73 || b > 121) {
                    c = '\b';
                    if (b == 122) {
                        this.f9585 = m6838();
                        this.f9580 = this.f9539;
                        BiFunction biFunction = AbstractC3687.f9267;
                        if (biFunction == null || AbstractC3687.f9276) {
                            strM6462 = null;
                            charset = StandardCharsets.UTF_8;
                        } else {
                            if (this.f9583 == null) {
                                byte[] bArr2 = (byte[]) AbstractC3766.f9635.getAndSet(this.f9582, null);
                                this.f9583 = bArr2;
                                if (bArr2 == null) {
                                    this.f9583 = new byte[8192];
                                }
                            }
                            int i8 = this.f9585;
                            int i9 = i8 << 1;
                            if (i9 > this.f9583.length) {
                                this.f9583 = new byte[i9];
                            }
                            int iM6284 = AbstractC3682.m6284(this.f9539, i8, bArr, this.f9583);
                            if (iM6284 != -1) {
                                byte[] bArr3 = new byte[iM6284];
                                System.arraycopy(this.f9583, 0, bArr3, 0, iM6284);
                                String str = (String) biFunction.apply(bArr3, (byte) 1);
                                this.f9539 += this.f9585;
                                strM6462 = str;
                            }
                            charset = StandardCharsets.UTF_8;
                        }
                    } else {
                        if (b == 123) {
                            this.f9585 = m6838();
                            this.f9580 = this.f9539;
                            charset = StandardCharsets.UTF_16;
                        } else if (b == 124) {
                            int iM6838 = m6838();
                            this.f9585 = iM6838;
                            int i10 = this.f9539;
                            this.f9580 = i10;
                            BiFunction biFunction2 = AbstractC3687.f9267;
                            if (biFunction2 == null || AbstractC3687.f9276) {
                                strM6462 = null;
                            } else {
                                byte[] bArr4 = new byte[iM6838];
                                System.arraycopy(bArr, i10, bArr4, 0, iM6838);
                                String str2 = (String) biFunction2.apply(bArr4, (byte) 1);
                                this.f9539 += this.f9585;
                                strM6462 = str2;
                            }
                            charset = StandardCharsets.UTF_16LE;
                        } else if (b == 125) {
                            int iM68382 = m6838();
                            this.f9585 = iM68382;
                            int i11 = this.f9539;
                            this.f9580 = i11;
                            BiFunction biFunction3 = AbstractC3687.f9267;
                            if (biFunction3 == null || !AbstractC3687.f9276) {
                                strM6462 = null;
                            } else {
                                byte[] bArr5 = new byte[iM68382];
                                System.arraycopy(bArr, i11, bArr5, 0, iM68382);
                                String str3 = (String) biFunction3.apply(bArr5, (byte) 1);
                                this.f9539 += this.f9585;
                                strM6462 = str3;
                            }
                            charset = StandardCharsets.UTF_16BE;
                        } else if (b == 126) {
                            this.f9585 = m6838();
                            if (f9576 == null) {
                                f9576 = Charset.forName("GB18030");
                            }
                            charset = f9576;
                        } else {
                            charset = null;
                            strM6462 = null;
                        }
                        strM6462 = null;
                    }
                } else {
                    if (b == 121) {
                        this.f9585 = m6838();
                        this.f9580 = this.f9539;
                    } else {
                        int i12 = b - 73;
                        this.f9585 = i12;
                        if (i7 + i12 > bArr.length) {
                            C1123.m1410("illegal jsonb data");
                            return null;
                        }
                        long j12 = f9577;
                        switch (i12) {
                            case 3:
                                c = '\b';
                                j = -1;
                                j2 = ((long) (bArr[i7 + 2] << 16)) + ((((long) bArr[i7 + 1]) & 255) << 8);
                                j3 = ((long) bArr[i7]) & 255;
                                j5 = j2 + j3;
                                j4 = j5;
                                j6 = j;
                                break;
                            case 4:
                                c = '\b';
                                j = -1;
                                j4 = AbstractC3687.f9266.getInt(bArr, j12 + ((long) i7));
                                j6 = j;
                                break;
                            case 5:
                                c = '\b';
                                j = -1;
                                j2 = ((long) bArr[i7 + 4]) << 32;
                                i = AbstractC3687.f9266.getInt(bArr, j12 + ((long) i7));
                                j3 = ((long) i) & 4294967295L;
                                j5 = j2 + j3;
                                j4 = j5;
                                j6 = j;
                                break;
                            case 6:
                                c = '\b';
                                j = -1;
                                j2 = (((long) bArr[i7 + 5]) << 40) + ((((long) bArr[i7 + 4]) & 255) << 32);
                                i = AbstractC3687.f9266.getInt(bArr, j12 + ((long) i7));
                                j3 = ((long) i) & 4294967295L;
                                j5 = j2 + j3;
                                j4 = j5;
                                j6 = j;
                                break;
                            case 7:
                                c = '\b';
                                j = -1;
                                j2 = (((long) bArr[i7 + 6]) << 48) + ((((long) bArr[i7 + 5]) & 255) << 40) + ((((long) bArr[i7 + 4]) & 255) << 32);
                                i = AbstractC3687.f9266.getInt(bArr, j12 + ((long) i7));
                                j3 = ((long) i) & 4294967295L;
                                j5 = j2 + j3;
                                j4 = j5;
                                j6 = j;
                                break;
                            case 8:
                                c = '\b';
                                j = -1;
                                j5 = AbstractC3687.f9266.getLong(bArr, j12 + ((long) i7));
                                j4 = j5;
                                j6 = j;
                                break;
                            case 9:
                                c = '\b';
                                j = -1;
                                j4 = bArr[i7];
                                j6 = AbstractC3687.f9266.getLong(bArr, j12 + ((long) i7) + 1);
                                break;
                            case 10:
                                c = '\b';
                                j = -1;
                                Unsafe unsafe = AbstractC3687.f9266;
                                long j13 = j12 + ((long) i7);
                                j7 = unsafe.getShort(bArr, j13);
                                j8 = unsafe.getLong(bArr, j13 + 2);
                                j6 = j8;
                                j4 = j7;
                                break;
                            case 11:
                                c = '\b';
                                j = -1;
                                j9 = ((long) (bArr[i7] << 16)) + ((((long) bArr[i7 + 1]) & 255) << 8) + (((long) bArr[i7 + 2]) & 255);
                                j10 = AbstractC3687.f9266.getLong(bArr, j12 + ((long) i7) + 3);
                                j6 = j10;
                                j4 = j9;
                                break;
                            case 12:
                                c = '\b';
                                j = -1;
                                Unsafe unsafe2 = AbstractC3687.f9266;
                                long j14 = j12 + ((long) i7);
                                j7 = unsafe2.getInt(bArr, j14);
                                j8 = unsafe2.getLong(bArr, j14 + 4);
                                j6 = j8;
                                j4 = j7;
                                break;
                            case 13:
                                c = '\b';
                                j = -1;
                                long j15 = ((long) bArr[i7 + 4]) << 32;
                                Unsafe unsafe3 = AbstractC3687.f9266;
                                long j16 = j12 + ((long) i7);
                                j9 = j15 + (((long) unsafe3.getInt(bArr, j16)) & 4294967295L);
                                j10 = unsafe3.getLong(bArr, j16 + 5);
                                j6 = j10;
                                j4 = j9;
                                break;
                            case 14:
                                c = '\b';
                                j = -1;
                                long j17 = (((long) bArr[i7 + 5]) << 40) + ((((long) bArr[i7 + 4]) & 255) << 32);
                                Unsafe unsafe4 = AbstractC3687.f9266;
                                long j18 = j12 + ((long) i7);
                                j9 = j17 + (((long) unsafe4.getInt(bArr, j18)) & 4294967295L);
                                j10 = unsafe4.getLong(bArr, j18 + 6);
                                j6 = j10;
                                j4 = j9;
                                break;
                            case 15:
                                c = '\b';
                                long j19 = (((long) bArr[i7 + 6]) << 48) + ((((long) bArr[i7 + 5]) & 255) << 40) + ((((long) bArr[i7 + 4]) & 255) << 32);
                                Unsafe unsafe5 = AbstractC3687.f9266;
                                long j20 = j12 + ((long) i7);
                                j = -1;
                                j9 = j19 + (((long) unsafe5.getInt(bArr, j20)) & 4294967295L);
                                j10 = unsafe5.getLong(bArr, j20 + 7);
                                j6 = j10;
                                j4 = j9;
                                break;
                            case 16:
                                Unsafe unsafe6 = AbstractC3687.f9266;
                                c = '\b';
                                long j21 = j12 + ((long) i7);
                                long j22 = unsafe6.getLong(bArr, j21);
                                j6 = unsafe6.getLong(bArr, j21 + 8);
                                j4 = j22;
                                j = -1;
                                break;
                        }
                        int i13 = this.f9585;
                        int i14 = this.f9539;
                        i2 = i14 + i13;
                        if (bArr[i2 - 1] > 0 || j4 == j) {
                            strM6329 = null;
                            if (strM6329 != null) {
                                if (i13 >= 0) {
                                    if (AbstractC3687.f9268 != null) {
                                        strM6329 = AbstractC3687.m6329(this.f9539, bArr, i13);
                                        this.f9539 += i13;
                                    } else {
                                        BiFunction biFunction4 = AbstractC3687.f9267;
                                        if (biFunction4 != null) {
                                            byte[] bArr6 = new byte[i13];
                                            System.arraycopy(bArr, this.f9539, bArr6, 0, i13);
                                            strM6329 = (String) biFunction4.apply(bArr6, (byte) 0);
                                            this.f9539 += i13;
                                        }
                                    }
                                }
                                charset = StandardCharsets.ISO_8859_1;
                            } else {
                                charset = null;
                            }
                            strM6462 = strM6329;
                        } else if (j6 != j) {
                            long j23 = j4 ^ j6;
                            C3762[] c3762Arr = AbstractC3766.f9650;
                            int i15 = ((int) (j23 ^ (j23 >>> 32))) & 8191;
                            C3762 c3762 = c3762Arr[i15];
                            if (c3762 == null) {
                                strM6329 = AbstractC3687.f9268 != null ? AbstractC3687.m6329(i14, bArr, i13) : new String(bArr, i14, i13, StandardCharsets.ISO_8859_1);
                                c3762Arr[i15] = new C3762(strM6329, j4, j6);
                                this.f9539 += i13;
                            } else {
                                if (c3762.f9623 == j4 && c3762.f9622 == j6) {
                                    this.f9539 = i2;
                                    strM6329 = (String) c3762.f9621;
                                }
                            }
                            if (strM6329 != null) {
                            }
                            strM6462 = strM6329;
                        } else {
                            long j24 = j4;
                            C3329[] c3329Arr = AbstractC3766.f9649;
                            int i16 = ((int) ((j24 >>> 32) ^ j24)) & 8191;
                            C3329 c3329 = c3329Arr[i16];
                            if (c3329 == null) {
                                String strM63292 = AbstractC3687.f9268 != null ? AbstractC3687.m6329(i14, bArr, i13) : new String(bArr, i14, i13, StandardCharsets.ISO_8859_1);
                                c3329Arr[i16] = new C3329(strM63292, j24);
                                this.f9539 += i13;
                                strM6329 = strM63292;
                            } else if (c3329.f7820 == j24) {
                                this.f9539 = i2;
                                strM6329 = (String) c3329.f7819;
                            }
                            if (strM6329 != null) {
                            }
                            strM6462 = strM6329;
                        }
                    }
                    c = '\b';
                    j = -1;
                    j4 = -1;
                    j6 = -1;
                    int i132 = this.f9585;
                    int i142 = this.f9539;
                    i2 = i142 + i132;
                    if (bArr[i2 - 1] > 0) {
                        strM6329 = null;
                        if (strM6329 != null) {
                        }
                        strM6462 = strM6329;
                    }
                }
                i3 = this.f9585;
                if (i3 >= 0) {
                    throw null;
                }
                if (strM6462 == null) {
                    strM6462 = new String(bArr, this.f9539, i3, charset);
                    this.f9539 += this.f9585;
                }
                if (z) {
                    int iMo67722 = mo6772();
                    if (iMo67722 == 0) {
                        this.f9579 = this.f9580;
                        this.f9589 = this.f9585;
                        this.f9588 = b;
                        return strM6462;
                    }
                    int i17 = iMo67722 * 2;
                    int i18 = i17 + 2;
                    long[] jArr = this.f9590;
                    if (jArr == null) {
                        this.f9590 = new long[Math.max(i18, 32)];
                    } else if (jArr.length < i18) {
                        this.f9590 = Arrays.copyOf(jArr, jArr.length + 16);
                    }
                    this.f9590[i17 + 1] = (((long) this.f9580) << 32) + (((long) this.f9585) << c) + ((long) b);
                }
                return strM6462;
            }
            strM6462 = AbstractC3700.m6462((char) (bArr[i7] & DefaultClassResolver.NAME), (char) (bArr[i7 + 1] & DefaultClassResolver.NAME));
            this.f9585 = 2;
            this.f9539 += 2;
        }
        charset = null;
        c = '\b';
        i3 = this.f9585;
        if (i3 >= 0) {
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public final double mo6687() {
        int i = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -75) {
            long j = (((long) bArr[i + 8]) & 255) + ((((long) bArr[i + 7]) & 255) << 8) + ((((long) bArr[i + 6]) & 255) << 16) + ((((long) bArr[i + 5]) & 255) << 24) + ((((long) bArr[i + 4]) & 255) << 32) + ((((long) bArr[i + 3]) & 255) << 40) + ((((long) bArr[i + 2]) & 255) << 48) + (((long) bArr[i + 1]) << 56);
            this.f9539 = i + 9;
            return Double.longBitsToDouble(j);
        }
        int i2 = i + 1;
        this.f9539 = i2;
        if (b == -74) {
            return mo6772();
        }
        int i3 = this.f9586;
        if (b == -73) {
            m6831(i2, i3);
            int iM6297 = AbstractC3682.m6297(bArr, i2);
            this.f9539 += 4;
            return Float.intBitsToFloat(iM6297);
        }
        if (b == -71) {
            int iMo6772 = mo6772();
            BigInteger bigIntegerMo6670 = mo6670();
            return (iMo6772 == 0 ? new BigDecimal(bigIntegerMo6670) : new BigDecimal(bigIntegerMo6670, iMo6772)).intValue();
        }
        if (b != 72) {
            if (b == 124) {
                int iMo67722 = mo6772();
                String str = new String(bArr, this.f9539, iMo67722, StandardCharsets.UTF_16LE);
                this.f9539 += iMo67722;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC3700.m6473(str).intValue();
            }
            if (b == 121) {
                int iMo67723 = mo6772();
                String str2 = new String(bArr, this.f9539, iMo67723, StandardCharsets.ISO_8859_1);
                this.f9539 += iMo67723;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC3700.m6473(str2).intValue();
            }
            if (b == 122) {
                int iMo67724 = mo6772();
                String str3 = new String(bArr, this.f9539, iMo67724, StandardCharsets.UTF_8);
                this.f9539 += iMo67724;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC3700.m6473(str3).intValue();
            }
            switch (b) {
                case -81:
                    if ((this.f9546.f9665 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                        this.f9541 = true;
                        return 0.0d;
                    }
                    C1123.m1410(mo6730("long value not support input null"));
                    return 0.0d;
                case -80:
                case -78:
                    return 0.0d;
                case -79:
                case -77:
                    return 1.0d;
                case -76:
                    return mo6769();
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9539 = i + 3;
                            return i4;
                        case -67:
                            this.f9539 = i + 2;
                            return bArr[i2];
                        case -66:
                            m6832(i2, i3);
                            long jM6290 = AbstractC3682.m6290(bArr, i2);
                            this.f9539 += 8;
                            return jM6290;
                        case -65:
                            break;
                        default:
                            if (InterfaceC3745.m6921(b)) {
                                return b;
                            }
                            if (InterfaceC3745.m6916(b)) {
                                this.f9539 = this.f9539 + 1;
                                return m6830(r0, bArr, b);
                            }
                            if (InterfaceC3745.m6913(b)) {
                                int i5 = this.f9539;
                                if (i5 + 1 < i3) {
                                    int iM6829 = m6829(i5, bArr, b);
                                    this.f9539 += 2;
                                    return iM6829;
                                }
                            }
                            if (InterfaceC3745.m6919(b)) {
                                return ((long) (b + 40)) - 8;
                            }
                            if (InterfaceC3745.m6918(b)) {
                                this.f9539 = this.f9539 + 1;
                                return m6826(r0, bArr, b);
                            }
                            if (InterfaceC3745.m6914(b)) {
                                int i6 = this.f9539;
                                if (i6 + 1 < i3) {
                                    int iM6827 = m6827(i6, bArr, b);
                                    this.f9539 += 2;
                                    return iM6827;
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6828(b);
                            }
                            int i7 = b - 73;
                            String strM6835 = m6835(i7);
                            this.f9539 += i7;
                            return strM6835.indexOf(46) == -1 ? new BigInteger(strM6835).intValue() : AbstractC3700.m6473(strM6835).intValue();
                    }
                    break;
            }
        }
        m6831(i2, i3);
        int iM62972 = AbstractC3682.m6297(bArr, i2);
        this.f9539 += 4;
        return iM62972;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public final long mo6688() {
        return mo6689();
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世 */
    public final long mo6689() {
        int iM6838;
        char c;
        long j;
        long j2;
        int i;
        long j3;
        long j4;
        int i2;
        int iMo6772;
        int i3 = this.f9539;
        int i4 = i3 + 1;
        this.f9539 = i4;
        byte[] bArr = this.f9587;
        byte b = bArr[i3];
        this.f9581 = b;
        boolean z = b == 127;
        byte b2 = b;
        if (z) {
            byte b3 = bArr[i4];
            this.f9581 = b3;
            if (InterfaceC3745.m6920(b3)) {
                if (b3 <= 47) {
                    this.f9539++;
                    iMo6772 = b3;
                } else {
                    iMo6772 = mo6772();
                }
                if (iMo6772 < 0) {
                    throw null;
                }
                if (iMo6772 == 0) {
                    this.f9581 = this.f9588;
                    this.f9585 = this.f9589;
                    this.f9580 = this.f9579;
                    if (this.f9578 == 0) {
                        this.f9578 = m6841();
                    }
                    return this.f9578;
                }
                int i5 = iMo6772 * 2;
                long[] jArr = this.f9590;
                long j5 = jArr[i5 + 1];
                int i6 = (int) j5;
                this.f9581 = (byte) i6;
                this.f9585 = i6 >> 8;
                this.f9580 = (int) (j5 >> 32);
                long j6 = jArr[i5];
                if (j6 != 0) {
                    return j6;
                }
                long jM6841 = m6841();
                this.f9590[i5] = jM6841;
                return jM6841;
            }
            this.f9539++;
            b2 = b3;
        }
        if (b2 >= 73 && b2 <= 120) {
            iM6838 = b2 - 73;
        } else {
            if (b2 != 121 && b2 != 122) {
                StringBuilder sb = new StringBuilder("fieldName not support input type ");
                sb.append(InterfaceC3745.m6917(this.f9581));
                if (this.f9581 == -109) {
                    sb.append(" ");
                    sb.append(mo6744());
                }
                int i7 = this.f9539;
                sb.append(", offset ");
                sb.append(i7);
                throw new JSONException(sb.toString());
            }
            iM6838 = m6838();
        }
        this.f9585 = iM6838;
        int i8 = this.f9539;
        this.f9580 = i8;
        if (iM6838 < 0) {
            throw null;
        }
        if (iM6838 <= 8 && i8 + iM6838 <= bArr.length) {
            long j7 = ((long) i8) + f9577;
            switch (iM6838) {
                case 1:
                    c = '\b';
                    j = 0;
                    i = bArr[i8];
                    j2 = i;
                    break;
                case 2:
                    c = '\b';
                    j = 0;
                    j2 = ((long) AbstractC3687.f9266.getShort(bArr, j7)) & 65535;
                    break;
                case 3:
                    c = '\b';
                    j = 0;
                    j3 = bArr[i8 + 2] << 16;
                    j4 = ((long) AbstractC3687.f9266.getShort(bArr, j7)) & 65535;
                    j2 = j3 + j4;
                    break;
                case 4:
                    c = '\b';
                    j = 0;
                    i = AbstractC3687.f9266.getInt(bArr, j7);
                    j2 = i;
                    break;
                case 5:
                    c = '\b';
                    j = 0;
                    j3 = ((long) bArr[i8 + 4]) << 32;
                    i2 = AbstractC3687.f9266.getInt(bArr, j7);
                    j4 = ((long) i2) & 4294967295L;
                    j2 = j3 + j4;
                    break;
                case 6:
                    c = '\b';
                    j = 0;
                    Unsafe unsafe = AbstractC3687.f9266;
                    j2 = (((long) unsafe.getShort(bArr, 4 + j7)) << 32) + (((long) unsafe.getInt(bArr, j7)) & 4294967295L);
                    break;
                case 7:
                    c = '\b';
                    j = 0;
                    j3 = (((long) bArr[i8 + 6]) << 48) + ((((long) bArr[i8 + 5]) & 255) << 40) + ((((long) bArr[i8 + 4]) & 255) << 32);
                    i2 = AbstractC3687.f9266.getInt(bArr, j7);
                    j4 = ((long) i2) & 4294967295L;
                    j2 = j3 + j4;
                    break;
                default:
                    j2 = AbstractC3687.f9266.getLong(bArr, j7);
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
            this.f9539 += iM6838;
        } else {
            j2 = -3750763034362895579L;
            for (int i9 = 0; i9 < iM6838; i9++) {
                int i10 = this.f9539;
                this.f9539 = i10 + 1;
                j2 = (((long) bArr[i10]) ^ j2) * 1099511628211L;
            }
        }
        if (z) {
            int iMo67722 = bArr[this.f9539];
            if (InterfaceC3745.m6921(iMo67722)) {
                this.f9539++;
            } else {
                iMo67722 = mo6772();
            }
            if (iMo67722 == 0) {
                this.f9579 = this.f9580;
                this.f9589 = iM6838;
                this.f9588 = b2;
                this.f9578 = j2;
                return j2;
            }
            int i11 = iMo67722 << 1;
            int i12 = i11 + 2;
            long[] jArr2 = this.f9590;
            if (jArr2 == null) {
                this.f9590 = new long[Math.max(i12, 32)];
            } else if (jArr2.length < i12) {
                this.f9590 = Arrays.copyOf(jArr2, i11 + 18);
            }
            long[] jArr3 = this.f9590;
            jArr3[i11] = j2;
            jArr3[i11 + 1] = (((long) this.f9580) << 32) + (((long) iM6838) << c) + ((long) b2);
        }
        return j2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public final Date mo6690() {
        long j;
        int i;
        int i2 = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i2];
        int i3 = this.f9586;
        C3776 c3776 = this.f9546;
        ZonedDateTime zonedDateTimeOfLocal = null;
        switch (b) {
            case -89:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(LocalDate.of(1970, 1, 1), mo6779()), c3776.m6969(), null);
                break;
            case -88:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(mo6781(), c3776.m6969(), null);
                break;
            case -87:
                zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(mo6786(), LocalTime.MIN), c3776.m6969(), null);
                break;
            case -86:
                this.f9539 = i2 + 1;
                zonedDateTimeOfLocal = m6833();
                break;
            case -85:
                long jM6290 = AbstractC3682.m6290(bArr, i2 + 1);
                this.f9539 += 9;
                return new Date(jM6290);
            case -84:
                int i4 = i2 + 1;
                m6831(i4, i3);
                long jM6297 = AbstractC3682.m6297(bArr, i4);
                this.f9539 += 5;
                return new Date(jM6297 * 1000);
            case -83:
                int i5 = i2 + 1;
                m6831(i5, i3);
                long jM62972 = AbstractC3682.m6297(bArr, i5);
                this.f9539 += 5;
                return new Date(jM62972 * 60000);
            case -82:
                this.f9539 = i2 + 1;
                return Date.from(Instant.ofEpochSecond(mo6769(), mo6772()));
        }
        if (zonedDateTimeOfLocal == null) {
            return super.mo6690();
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

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo6692() {
        int i = this.f9539;
        if (this.f9587[i] != -110) {
            return false;
        }
        this.f9539 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final boolean mo6693() {
        int i = this.f9539;
        if (this.f9587[i] != -81) {
            return false;
        }
        this.f9539 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final boolean mo6694(char c, char c2, char c3, char c4) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo6695() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final boolean mo6696() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo6697(char c, char c2, char c3, char c4, char c5, char c6) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public final Object mo6699(Type type) {
        C3776 c3776 = this.f9546;
        return ((C3635) c3776.f9663).m6193(type, (c3776.f9665 & JSONReader$Feature.FieldBased.mask) != 0).mo6027(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final Object mo6700(Class cls) {
        C3776 c3776 = this.f9546;
        return ((C3635) c3776.f9663).m6193(cls, (c3776.f9665 & JSONReader$Feature.FieldBased.mask) != 0).mo6027(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final boolean mo6701() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final boolean mo6702() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final boolean mo6703(byte b) {
        int i = this.f9539;
        if (this.f9587[i] != b) {
            return false;
        }
        this.f9539 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final boolean mo6704(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final boolean mo6705() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo6706() {
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final boolean mo6707() {
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final boolean mo6708() {
        int i = this.f9539;
        if (this.f9587[i] != -90) {
            return false;
        }
        this.f9539 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final boolean mo6711() {
        int i = this.f9539;
        byte b = this.f9587[i];
        if (b != -81 && b != 73) {
            return false;
        }
        this.f9539 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final boolean mo6712() {
        int i = this.f9539;
        if (this.f9587[i] != -91) {
            return false;
        }
        this.f9539 = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC3621 mo6724(long j, long j2, Class cls) {
        Class clsMo6058;
        ClassLoader classLoader;
        ClassLoader contextClassLoader;
        InterfaceC3621 interfaceC3621M6971;
        Class clsMo60582;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] == -110) {
            this.f9539 = i + 1;
            long jMo6799 = mo6799();
            C3776 c3776 = this.f9546;
            if (j == jMo6799 && (clsMo60582 = (interfaceC3621M6971 = c3776.m6971(cls)).mo6058()) != null && clsMo60582 == cls) {
                ((C3635) c3776.f9663).m6188(jMo6799, interfaceC3621M6971);
                return interfaceC3621M6971;
            }
            c3776.getClass();
            C3635 c3635 = (C3635) c3776.f9663;
            long j3 = c3776.f9665 | j2;
            if ((JSONReader$Feature.SupportAutoType.mask & j3) != 0) {
                InterfaceC3621 interfaceC3621M6190 = c3635.m6190(jMo6799);
                if (interfaceC3621M6190 != null && (clsMo6058 = interfaceC3621M6190.mo6058()) != null && (classLoader = clsMo6058.getClassLoader()) != null && classLoader != (contextClassLoader = Thread.currentThread().getContextClassLoader())) {
                    String strMo6660 = mo6660();
                    Class<?> clsLoadClass = (Class) AbstractC3700.f9378.get(strMo6660);
                    if (clsLoadClass == null) {
                        if (contextClassLoader == null) {
                            try {
                                contextClassLoader = InterfaceC3749.class.getClassLoader();
                            } catch (ClassNotFoundException unused) {
                            }
                        }
                        clsLoadClass = contextClassLoader.loadClass(strMo6660);
                    }
                    if (clsLoadClass != null && !clsMo6058.equals(clsLoadClass)) {
                        interfaceC3621M6190 = m6662(clsLoadClass);
                    }
                }
                if (interfaceC3621M6190 != null || (interfaceC3621M6190 = c3635.m6189(mo6660(), cls, j3)) != null) {
                    this.f9584 = bArr[this.f9539];
                    return interfaceC3621M6190;
                }
                if ((j3 & JSONReader$Feature.ErrorOnNotSupportAutoType.mask) != 0) {
                    C1123.m1401(mo6660(), "autoType not support : ");
                    return null;
                }
            } else if ((j3 & JSONReader$Feature.ErrorOnNotSupportAutoType.mask) != 0) {
                C1123.m1401(mo6660(), "autoType not support : ");
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final boolean mo6725() {
        return this.f9539 >= this.f9586;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final boolean mo6727() {
        byte b = this.f9587[this.f9539];
        return b >= -89 && b <= -82;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final boolean mo6728() {
        return this.f9587[this.f9539] == -111;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final boolean mo6729() {
        byte b;
        int i = this.f9539;
        return i < this.f9586 && (b = this.f9587[i]) >= -108 && b <= -92;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo6733() {
        this.f9539++;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final C1804 mo6734() {
        return new C1804(this.f9539, this.f9584);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final boolean mo6737() {
        int i = this.f9539;
        return i < this.f9586 && this.f9587[i] == -90;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo6738() {
        byte b = this.f9587[this.f9539];
        return b >= -78 && b <= 72;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final boolean mo6739() {
        int i = this.f9539;
        if (i >= this.f9586) {
            return false;
        }
        byte b = this.f9587[i];
        this.f9584 = b;
        return b >= 73;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final boolean mo6740() {
        int i = this.f9539;
        byte[] bArr = this.f9587;
        return i < bArr.length && bArr[i] == -109;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final boolean mo6741() {
        byte b = this.f9587[this.f9539];
        return (b >= -70 && b <= 72) || b == -84 || b == -83 || b == -85;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo6743() {
        return this.f9587[this.f9539];
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo6744() {
        Charset charset;
        String strTrim;
        Charset charset2;
        char[] cArr;
        String str;
        int i;
        int iM6838;
        String strM6329;
        int i2 = this.f9539;
        int i3 = i2 + 1;
        this.f9539 = i3;
        byte[] bArr = this.f9587;
        byte b = bArr[i2];
        this.f9581 = b;
        String strTrim2 = null;
        if (b == -81) {
            return null;
        }
        this.f9580 = i3;
        C3776 c3776 = this.f9546;
        if (b >= 73 && b <= 121) {
            if (b == 121) {
                iM6838 = bArr[i3];
                if (InterfaceC3745.m6921(iM6838)) {
                    this.f9539++;
                } else {
                    iM6838 = m6838();
                }
                this.f9580 = this.f9539;
            } else {
                iM6838 = b - 73;
            }
            this.f9585 = iM6838;
            if (iM6838 < 0) {
                strM6329 = null;
                if (strM6329 != null) {
                    this.f9539 += iM6838;
                    return AbstractC3732.m6657(c3776.f9665, strM6329);
                }
            } else {
                BiFunction biFunction = AbstractC3687.f9267;
                if (biFunction != null) {
                    byte[] bArr2 = new byte[iM6838];
                    System.arraycopy(bArr, this.f9539, bArr2, 0, iM6838);
                    strM6329 = (String) biFunction.apply(bArr2, (byte) 0);
                } else if (AbstractC3687.f9268 != null) {
                    strM6329 = AbstractC3687.m6329(this.f9539, bArr, iM6838);
                }
                if (strM6329 != null) {
                }
            }
        }
        byte b2 = this.f9581;
        int i4 = -1;
        C3744 c3744 = this.f9582;
        if (b2 < 73 || b2 > 121) {
            if (b2 == 122) {
                byte b3 = bArr[this.f9539];
                if (InterfaceC3745.m6921(b3)) {
                    this.f9539++;
                    this.f9585 = b3;
                } else if (InterfaceC3745.m6916(b3)) {
                    this.f9585 = m6830(this.f9539 + 1, bArr, b3);
                    this.f9539 += 2;
                } else {
                    this.f9585 = m6838();
                }
                this.f9580 = this.f9539;
                BiFunction biFunction2 = AbstractC3687.f9267;
                if (biFunction2 == null || AbstractC3687.f9276) {
                    strTrim = null;
                    charset2 = StandardCharsets.UTF_8;
                } else {
                    if (this.f9583 == null) {
                        byte[] bArr3 = (byte[]) AbstractC3766.f9635.getAndSet(c3744, null);
                        this.f9583 = bArr3;
                        if (bArr3 == null) {
                            this.f9583 = new byte[8192];
                        }
                    }
                    int i5 = this.f9585;
                    int i6 = i5 << 1;
                    if (i6 > this.f9583.length) {
                        this.f9583 = new byte[i6];
                    }
                    int iM6284 = AbstractC3682.m6284(this.f9539, i5, bArr, this.f9583);
                    if (iM6284 != -1) {
                        byte[] bArr4 = new byte[iM6284];
                        System.arraycopy(this.f9583, 0, bArr4, 0, iM6284);
                        strTrim = (String) biFunction2.apply(bArr4, (byte) 1);
                        this.f9539 += this.f9585;
                        if ((JSONReader$Feature.TrimString.mask & c3776.f9665) != 0) {
                            strTrim = strTrim.trim();
                        }
                        if (strTrim.isEmpty() && (c3776.f9665 & JSONReader$Feature.EmptyStringAsNull.mask) != 0) {
                        }
                        charset2 = StandardCharsets.UTF_8;
                    }
                }
                return null;
            }
            if (b2 == 123) {
                this.f9585 = m6838();
                this.f9580 = this.f9539;
                charset = StandardCharsets.UTF_16;
            } else if (b2 == 124) {
                byte b4 = bArr[this.f9539];
                if (InterfaceC3745.m6921(b4)) {
                    this.f9539++;
                    this.f9585 = b4;
                } else if (InterfaceC3745.m6916(b4)) {
                    this.f9585 = m6830(this.f9539 + 1, bArr, b4);
                    this.f9539 += 2;
                } else {
                    this.f9585 = m6838();
                }
                int i7 = this.f9539;
                this.f9580 = i7;
                int i8 = this.f9585;
                if (i8 != 0) {
                    BiFunction biFunction3 = AbstractC3687.f9267;
                    if (biFunction3 == null || AbstractC3687.f9276) {
                        strTrim = null;
                    } else {
                        byte[] bArr5 = new byte[i8];
                        System.arraycopy(bArr, i7, bArr5, 0, i8);
                        strTrim = (String) biFunction3.apply(bArr5, (byte) 1);
                        this.f9539 += this.f9585;
                        if ((c3776.f9665 & JSONReader$Feature.TrimString.mask) != 0) {
                            strTrim = strTrim.trim();
                        }
                        if (strTrim.isEmpty() && (c3776.f9665 & JSONReader$Feature.EmptyStringAsNull.mask) != 0) {
                        }
                    }
                    return null;
                }
                strTrim = "";
                charset2 = StandardCharsets.UTF_16LE;
            } else {
                if (b2 == 125) {
                    int iM68382 = m6838();
                    this.f9585 = iM68382;
                    int i9 = this.f9539;
                    this.f9580 = i9;
                    BiFunction biFunction4 = AbstractC3687.f9267;
                    if (biFunction4 == null || !AbstractC3687.f9276) {
                        strTrim = null;
                        if (strTrim == null) {
                            return strTrim;
                        }
                        charset2 = StandardCharsets.UTF_16BE;
                    } else {
                        byte[] bArr6 = new byte[iM68382];
                        System.arraycopy(bArr, i9, bArr6, 0, iM68382);
                        strTrim = (String) biFunction4.apply(bArr6, (byte) 1);
                        this.f9539 += this.f9585;
                        if ((c3776.f9665 & JSONReader$Feature.TrimString.mask) != 0) {
                            strTrim = strTrim.trim();
                        }
                        if (strTrim.isEmpty() && (c3776.f9665 & JSONReader$Feature.EmptyStringAsNull.mask) != 0) {
                        }
                        if (strTrim == null) {
                        }
                    }
                    return null;
                }
                if (b2 != 126) {
                    if (InterfaceC3745.m6921(b2)) {
                        return Byte.toString(b2);
                    }
                    if (InterfaceC3745.m6916(b2)) {
                        int i10 = this.f9539;
                        this.f9539 = i10 + 1;
                        return Integer.toString(m6830(i10, bArr, b2));
                    }
                    boolean zM6913 = InterfaceC3745.m6913(b2);
                    int i11 = this.f9586;
                    if (zM6913) {
                        int i12 = this.f9539;
                        if (i12 + 1 < i11) {
                            int iM6829 = m6829(i12, bArr, b2);
                            this.f9539 += 2;
                            return Integer.toString(iM6829);
                        }
                    }
                    if (InterfaceC3745.m6919(b2)) {
                        return Integer.toString(b2 - (-32));
                    }
                    if (InterfaceC3745.m6918(b2)) {
                        int i13 = this.f9539;
                        this.f9539 = i13 + 1;
                        return Integer.toString(m6826(i13, bArr, b2));
                    }
                    if (InterfaceC3745.m6914(b2)) {
                        int i14 = this.f9539;
                        if (i14 + 1 < i11) {
                            int iM6827 = m6827(i14, bArr, b2);
                            this.f9539 += 2;
                            return Integer.toString(iM6827);
                        }
                    }
                    if (b2 == -110) {
                        this.f9539--;
                        Object objMo6684 = mo6684();
                        if (objMo6684 != null) {
                            return InterfaceC3749.m6932(objMo6684, JSONWriter$Feature.WriteThrowableClassName);
                        }
                    } else if (b2 != -81) {
                        if (b2 != 72) {
                            if (b2 == -66) {
                                int i15 = this.f9539;
                                m6832(i15, i11);
                                long jM6290 = AbstractC3682.m6290(bArr, i15);
                                this.f9539 += 8;
                                return Long.toString(jM6290);
                            }
                            if (b2 != -65) {
                                switch (b2) {
                                    case -85:
                                        int i16 = this.f9539;
                                        m6832(i16, i11);
                                        long jM62902 = AbstractC3682.m6290(bArr, i16);
                                        this.f9539 += 8;
                                        Date date = new Date(jM62902);
                                        ZoneId zoneId = AbstractC3699.f9372;
                                        return AbstractC3699.m6446(date.getTime(), AbstractC3699.f9372);
                                    case -84:
                                        int i17 = this.f9539;
                                        m6831(i17, i11);
                                        long jM6297 = ((long) AbstractC3682.m6297(bArr, i17)) * 1000;
                                        this.f9539 += 4;
                                        Date date2 = new Date(jM6297);
                                        ZoneId zoneId2 = AbstractC3699.f9372;
                                        return AbstractC3699.m6446(date2.getTime(), AbstractC3699.f9372);
                                    case -83:
                                        int i18 = this.f9539;
                                        m6831(i18, i11);
                                        long jM62972 = ((long) AbstractC3682.m6297(bArr, i18)) * 60000;
                                        this.f9539 += 4;
                                        Date date3 = new Date(jM62972);
                                        ZoneId zoneId3 = AbstractC3699.f9372;
                                        return AbstractC3699.m6446(date3.getTime(), AbstractC3699.f9372);
                                    default:
                                        switch (b2) {
                                            case -78:
                                                return "0.0";
                                            case -77:
                                                return BuildConfig.VERSION_NAME;
                                            case -76:
                                                return Double.toString(mo6769());
                                            case -75:
                                                int i19 = this.f9539;
                                                m6832(i19, i11);
                                                long jM62903 = AbstractC3682.m6290(bArr, i19);
                                                this.f9539 += 8;
                                                return Double.toString(Double.longBitsToDouble(jM62903));
                                            case -74:
                                                return Float.toString(mo6772());
                                            case -73:
                                                int i20 = this.f9539;
                                                m6831(i20, i11);
                                                int iM6297 = AbstractC3682.m6297(bArr, i20);
                                                this.f9539 += 4;
                                                return Float.toString(Float.intBitsToFloat(iM6297));
                                            case -72:
                                            case -70:
                                                return Long.toString(mo6769());
                                            case -71:
                                                int iMo6772 = mo6772();
                                                BigInteger bigIntegerMo6670 = mo6670();
                                                return (iMo6772 == 0 ? new BigDecimal(bigIntegerMo6670) : new BigDecimal(bigIntegerMo6670, iMo6772)).toString();
                                            case -69:
                                                int iMo67722 = mo6772();
                                                byte[] bArr7 = new byte[iMo67722];
                                                System.arraycopy(bArr, this.f9539, bArr7, 0, iMo67722);
                                                this.f9539 += iMo67722;
                                                return new BigInteger(bArr7).toString();
                                            default:
                                                C3775.m6958("readString not support type ", InterfaceC3745.m6917(this.f9581), this.f9539, bArr.length);
                                                return null;
                                        }
                                }
                            }
                        }
                        int i21 = this.f9539;
                        m6831(i21, i11);
                        int iM62972 = AbstractC3682.m6297(bArr, i21);
                        this.f9539 += 4;
                        return Long.toString(iM62972);
                    }
                    return null;
                }
                this.f9585 = m6838();
                this.f9580 = this.f9539;
                if (f9576 == null) {
                    f9576 = Charset.forName("GB18030");
                }
                charset = f9576;
            }
            strTrim2 = null;
            strTrim2 = strTrim;
            charset = charset2;
        } else {
            charset = StandardCharsets.ISO_8859_1;
        }
        if (strTrim2 != null) {
            if ((c3776.f9665 & JSONReader$Feature.TrimString.mask) != 0) {
                strTrim2 = strTrim2.trim();
            }
            if (!strTrim2.isEmpty() || (c3776.f9665 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
                return strTrim2;
            }
        } else {
            int i22 = this.f9585;
            if (i22 < 0) {
                throw null;
            }
            if (AbstractC3687.f9263 == 8 && this.f9581 == 122 && i22 < 8192) {
                int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
                cArr = (char[]) AbstractC3766.f9636.getAndSet(AbstractC3766.f9644[iIdentityHashCode & (r4.length - 1)], null);
                if (cArr == null) {
                    cArr = new char[8192];
                }
            } else {
                cArr = null;
            }
            int i23 = this.f9539;
            int i24 = this.f9585;
            if (cArr != null) {
                short s = AbstractC3682.f9228;
                int i25 = i23 + i24;
                int iMin = Math.min(i24, cArr.length);
                int i26 = 0;
                while (i26 < iMin) {
                    byte b5 = bArr[i23];
                    if (b5 < 0) {
                        break;
                    }
                    i23++;
                    cArr[i26] = (char) b5;
                    i26++;
                }
                while (true) {
                    if (i23 >= i25) {
                        i4 = i26;
                        break;
                    }
                    int i27 = i23 + 1;
                    byte b6 = bArr[i23];
                    if (b6 < 0) {
                        if ((b6 >> 5) == -2 && (b6 & 30) != 0) {
                            if (i27 >= i25) {
                                break;
                            }
                            i23 += 2;
                            byte b7 = bArr[i27];
                            if ((b7 & 192) != 128) {
                                break;
                            }
                            cArr[i26] = (char) ((b7 ^ (b6 << 6)) ^ 3968);
                            i26++;
                        } else if ((b6 >> 4) == -2) {
                            int i28 = i23 + 2;
                            if (i28 >= i25) {
                                break;
                            }
                            byte b8 = bArr[i27];
                            byte b9 = bArr[i28];
                            i23 += 3;
                            if ((b6 == -32 && (b8 & 224) == 128) || (b8 & 192) != 128 || (b9 & 192) != 128) {
                                break;
                            }
                            char c = (char) (((b8 << 6) ^ (b6 << 12)) ^ ((-123008) ^ b9));
                            if (c >= 55296 && c < 57344) {
                                break;
                            }
                            cArr[i26] = c;
                            i26++;
                        } else {
                            if ((b6 >> 3) != -2 || (i = i23 + 3) >= i25) {
                                break;
                            }
                            byte b10 = bArr[i27];
                            byte b11 = bArr[i23 + 2];
                            byte b12 = bArr[i];
                            i23 += 4;
                            int i29 = (((b6 << 18) ^ (b10 << 12)) ^ (b11 << 6)) ^ (b12 ^ 3678080);
                            if ((b10 & 192) != 128 || (b11 & 192) != 128 || (b12 & 192) != 128 || i29 < 65536 || i29 >= 1114112) {
                                break;
                            }
                            cArr[i26] = (char) ((i29 >>> 10) + 55232);
                            cArr[i26 + 1] = (char) ((i29 & 1023) + 56320);
                            i26 += 2;
                        }
                    } else {
                        cArr[i26] = (char) b6;
                        i26++;
                        i23 = i27;
                    }
                }
                str = new String(cArr, 0, i4);
                if (cArr.length < 8388608) {
                    AbstractC3766.f9636.lazySet(c3744, cArr);
                }
            } else {
                str = new String(bArr, i23, i24, charset);
            }
            this.f9539 += this.f9585;
            if ((c3776.f9665 & JSONReader$Feature.TrimString.mask) != 0) {
                str = str.trim();
            }
            if (!str.isEmpty() || (c3776.f9665 & JSONReader$Feature.EmptyStringAsNull.mask) == 0) {
                return str;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子 */
    public final String[] mo6745() {
        if (mo6703((byte) -110) && mo6799() != C3629.f8993) {
            C1123.m1410(mo6730("not support type " + mo6660()));
            return null;
        }
        int iMo6792 = mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        String[] strArr = new String[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            strArr[i] = mo6744();
        }
        return strArr;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏 */
    public final String mo6746() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子苏哲 */
    public final OffsetTime mo6747() {
        ZonedDateTime zonedDateTimeMo6801 = mo6801();
        if (zonedDateTimeMo6801 == null) {
            return null;
        }
        return zonedDateTimeMo6801.toOffsetDateTime().toOffsetTime();
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏哲子 */
    public final boolean mo6748(int i, Collection collection) {
        int i2 = this.f9539;
        if (this.f9587[i2] != -109) {
            return false;
        }
        this.f9539 = i2 + 1;
        String strMo6744 = mo6744();
        if ("..".equals(strMo6744)) {
            collection.add(collection);
            return true;
        }
        m6714(collection, i, AbstractC3755.m6938(strMo6744));
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏子哲 */
    public final String mo6749() {
        int i = this.f9539;
        if (this.f9587[i] != -109) {
            return null;
        }
        this.f9539 = i + 1;
        if (mo6739()) {
            return mo6744();
        }
        C1123.m1410("reference not support input ".concat(m6842(this.f9584)));
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子 */
    public final OffsetDateTime mo6751() {
        ZonedDateTime zonedDateTimeMo6801 = mo6801();
        if (zonedDateTimeMo6801 == null) {
            return null;
        }
        return zonedDateTimeMo6801.toOffsetDateTime();
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子兰苏 */
    public final Number mo6752() {
        int i = this.f9539;
        this.f9539 = i + 1;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (InterfaceC3745.m6921(b)) {
            return Integer.valueOf(b);
        }
        if (InterfaceC3745.m6916(b)) {
            int i2 = this.f9539;
            this.f9539 = i2 + 1;
            return Integer.valueOf(m6830(i2, bArr, b));
        }
        boolean zM6913 = InterfaceC3745.m6913(b);
        int i3 = this.f9586;
        if (zM6913) {
            int i4 = this.f9539;
            if (i4 + 1 < i3) {
                int iM6829 = m6829(i4, bArr, b);
                this.f9539 += 2;
                return Integer.valueOf(iM6829);
            }
        }
        if (InterfaceC3745.m6919(b)) {
            return Long.valueOf(((long) (b + 40)) - 8);
        }
        if (InterfaceC3745.m6918(b)) {
            this.f9539 = this.f9539 + 1;
            return Long.valueOf(m6826(r2, bArr, b));
        }
        if (InterfaceC3745.m6914(b)) {
            int i5 = this.f9539;
            if (i5 + 1 < i3) {
                int iM6827 = m6827(i5, bArr, b);
                this.f9539 += 2;
                return Integer.valueOf(iM6827);
            }
        }
        if (b == -110) {
            C1123.m1410(AbstractC0900.m717("not support input type : ", mo6744()));
            return null;
        }
        if (b == 72) {
            int i6 = this.f9539;
            m6831(i6, i3);
            int iM6297 = AbstractC3682.m6297(bArr, i6);
            this.f9539 += 4;
            return Integer.valueOf(iM6297);
        }
        if (b == 121) {
            int iMo6772 = mo6772();
            String str = new String(bArr, this.f9539, iMo6772, StandardCharsets.ISO_8859_1);
            this.f9539 += iMo6772;
            return AbstractC3700.m6473(str);
        }
        if (b == 122) {
            int iMo67722 = mo6772();
            String str2 = new String(bArr, this.f9539, iMo67722, StandardCharsets.UTF_8);
            this.f9539 += iMo67722;
            return AbstractC3700.m6473(str2);
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
                return Double.valueOf(mo6769());
            case -75:
                int i7 = this.f9539;
                m6832(i7, i3);
                long jM6290 = AbstractC3682.m6290(bArr, i7);
                this.f9539 += 8;
                return Double.valueOf(Double.longBitsToDouble(jM6290));
            case -74:
                return Float.valueOf(mo6772());
            case -73:
                int i8 = this.f9539;
                m6831(i8, i3);
                int iM62972 = AbstractC3682.m6297(bArr, i8);
                this.f9539 += 4;
                return Float.valueOf(Float.intBitsToFloat(iM62972));
            case -72:
                return BigDecimal.valueOf(mo6769());
            case -71:
                int iMo67723 = mo6772();
                BigInteger bigIntegerMo6670 = mo6670();
                return iMo67723 == 0 ? new BigDecimal(bigIntegerMo6670) : new BigDecimal(bigIntegerMo6670, iMo67723);
            case -70:
                return BigInteger.valueOf(mo6769());
            case -69:
                int iMo67724 = mo6772();
                byte[] bArr2 = new byte[iMo67724];
                System.arraycopy(bArr, this.f9539, bArr2, 0, iMo67724);
                this.f9539 += iMo67724;
                return new BigInteger(bArr2);
            case -68:
                int i9 = this.f9539;
                int i10 = (bArr[i9 + 1] & DefaultClassResolver.NAME) + (bArr[i9] << 8);
                this.f9539 = i9 + 2;
                return Short.valueOf((short) i10);
            case -67:
                int i11 = this.f9539;
                this.f9539 = i11 + 1;
                return Byte.valueOf(bArr[i11]);
            case -66:
                int i12 = this.f9539;
                m6832(i12, i3);
                long jM62902 = AbstractC3682.m6290(bArr, i12);
                this.f9539 += 8;
                return Long.valueOf(jM62902);
            case -65:
                int i13 = this.f9539;
                m6831(i13, i3);
                int iM62973 = AbstractC3682.m6297(bArr, i13);
                this.f9539 += 4;
                return Long.valueOf(iM62973);
            default:
                if (b < 73 || b > 120) {
                    throw m6828(b);
                }
                int i14 = b - 73;
                String strM6835 = m6835(i14);
                this.f9539 += i14;
                return AbstractC3700.m6473(strM6835);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰 */
    public final Date mo6753() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ef  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏兰子 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo6754() {
        long j;
        Object objMo6684;
        int i;
        int iM6838;
        long j2 = this.f9546.f9665;
        int i2 = this.f9539;
        int i3 = i2 + 1;
        this.f9539 = i3;
        byte[] bArr = this.f9587;
        byte b = bArr[i2];
        this.f9584 = b;
        if (b == -81) {
            return null;
        }
        if (b < -90) {
            if (b == -110) {
                return (Map) mo6724(0L, 0L, Map.class).mo6023(this, null, null, 0L);
            }
            throw m6828(b);
        }
        long j3 = 0;
        Map map = (JSONReader$Feature.UseNativeObject.mask & j2) != 0 ? (AbstractC3687.f9263 != 8 || bArr[i3] == -91) ? new HashMap() : new HashMap(10) : (AbstractC3687.f9263 != 8 || bArr[i3] == -91) ? new JSONObject() : new JSONObject(10);
        while (true) {
            int i4 = this.f9539;
            byte b2 = bArr[i4];
            this.f9584 = b2;
            if (b2 == -91) {
                this.f9539 = i4 + 1;
                return map;
            }
            Object objMo6686 = mo6739() ? mo6686() : mo6684();
            int i5 = this.f9539;
            if (i5 >= bArr.length || bArr[i5] != -109) {
                byte b3 = bArr[i5];
                if (b3 >= 73 && b3 <= 126) {
                    objMo6684 = mo6744();
                } else if (InterfaceC3745.m6921(b3)) {
                    this.f9539++;
                    objMo6684 = Integer.valueOf(b3);
                } else if (b3 == -79) {
                    this.f9539++;
                    objMo6684 = Boolean.TRUE;
                } else if (b3 == -80) {
                    this.f9539++;
                    objMo6684 = Boolean.FALSE;
                } else if (b3 == -90) {
                    objMo6684 = mo6754();
                } else {
                    j = j3;
                    int i6 = this.f9586;
                    if (b3 == -66) {
                        int i7 = this.f9539 + 1;
                        m6832(i7, i6);
                        objMo6684 = Long.valueOf(AbstractC3682.m6290(bArr, i7));
                        this.f9539 += 9;
                    } else if (b3 >= -108 && b3 <= -92) {
                        int i8 = this.f9539 + 1;
                        this.f9539 = i8;
                        if (b3 == -92) {
                            iM6838 = bArr[i8];
                            if (InterfaceC3745.m6921(iM6838)) {
                                this.f9539++;
                            } else {
                                iM6838 = m6838();
                            }
                        } else {
                            iM6838 = b3 + 108;
                        }
                        if (iM6838 == 0) {
                            objMo6684 = (JSONReader$Feature.UseNativeObject.mask & j2) != j ? new ArrayList() : new JSONArray();
                        } else {
                            List arrayList = (JSONReader$Feature.UseNativeObject.mask & j2) != j ? new ArrayList(iM6838) : new JSONArray(iM6838);
                            for (int i9 = 0; i9 < iM6838; i9++) {
                                if (mo6740()) {
                                    String strMo6749 = mo6749();
                                    if ("..".equals(strMo6749)) {
                                        arrayList.add(arrayList);
                                    } else {
                                        arrayList.add(null);
                                        m6714(arrayList, i9, AbstractC3755.m6938(strMo6749));
                                    }
                                } else {
                                    byte b4 = bArr[this.f9539];
                                    arrayList.add((b4 < 73 || b4 > 126) ? b4 == -90 ? mo6754() : mo6684() : mo6744());
                                }
                            }
                            objMo6684 = arrayList;
                        }
                    } else if (InterfaceC3745.m6916(b3)) {
                        objMo6684 = Integer.valueOf(m6830(this.f9539 + 1, bArr, b3));
                        this.f9539 += 2;
                    } else if (InterfaceC3745.m6913(b3) && (i = this.f9539 + 1) < i6) {
                        int iM6829 = m6829(i, bArr, b3);
                        this.f9539 += 3;
                        objMo6684 = Integer.valueOf(iM6829);
                    } else if (b3 == 72) {
                        int i10 = this.f9539;
                        if (i10 + 3 < i6) {
                            int iM6297 = AbstractC3682.m6297(bArr, i10 + 1);
                            this.f9539 += 5;
                            objMo6684 = Integer.valueOf(iM6297);
                        } else {
                            objMo6684 = mo6684();
                        }
                    }
                    if (objMo6684 == null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j2) == j) {
                        map.put(objMo6686, objMo6684);
                    }
                }
                j = j3;
                if (objMo6684 == null) {
                    map.put(objMo6686, objMo6684);
                }
            } else {
                String strMo67492 = mo6749();
                if ("..".equals(strMo67492)) {
                    map.put(objMo6686, map);
                } else {
                    m6713(map, objMo6686, AbstractC3755.m6938(strMo67492));
                }
                j = j3;
            }
            j3 = j;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰 */
    public final void mo6755() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏 */
    public final LocalTime mo6756() {
        LocalTime localTimeM6456;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 80 || (localTimeM6456 = AbstractC3699.m6456(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 8;
        return localTimeM6456;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲 */
    public final LocalTime mo6757() {
        LocalTime localTimeM6452;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 79 || (localTimeM6452 = AbstractC3699.m6452(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 7;
        return localTimeM6452;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public final LocalTime mo6758() {
        LocalTime localTimeM6453;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 78 || (localTimeM6453 = AbstractC3699.m6453(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 6;
        return localTimeM6453;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public final LocalTime mo6759() {
        LocalTime localTimeM6393;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 91 || (localTimeM6393 = AbstractC3699.m6393(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 19;
        return localTimeM6393;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲 */
    public final LocalTime mo6760() {
        LocalTime localTimeM6392;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 88 || (localTimeM6392 = AbstractC3699.m6392(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 16;
        return localTimeM6392;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰 */
    public final LocalTime mo6761() {
        LocalTime localTimeM6396;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 85 || (localTimeM6396 = AbstractC3699.m6396(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 13;
        return localTimeM6396;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子 */
    public final void mo6762() {
        int i = this.f9539;
        this.f9539 = i + 1;
        byte b = this.f9587[i];
        this.f9584 = b;
        if (b == -81) {
            return;
        }
        C1123.m1404(this.f9584, "null not match, ");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰 */
    public final long mo6765() {
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 92) {
            C1123.m1410("date only support string input");
            return 0L;
        }
        long jM6443 = AbstractC3699.m6443(bArr, i + 1, (ZoneId) this.f9546.f9664);
        this.f9539 += 20;
        return jM6443;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲 */
    public final LocalTime mo6766() {
        LocalTime localTimeM6454;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 82 || (localTimeM6454 = AbstractC3699.m6454(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 10;
        return localTimeM6454;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰 */
    public final LocalTime mo6767() {
        LocalTime localTimeM6454;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 81 || (localTimeM6454 = AbstractC3699.m6454(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 9;
        return localTimeM6454;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲世子兰苏, reason: contains not printable characters */
    public final ZonedDateTime m6833() {
        ZoneId zoneIdM6416;
        int i = this.f9539;
        int i2 = i + 1;
        this.f9539 = i2;
        byte[] bArr = this.f9587;
        int i3 = bArr[i] << 8;
        int i4 = i + 2;
        this.f9539 = i4;
        int i5 = i3 + (bArr[i2] & DefaultClassResolver.NAME);
        int i6 = i + 3;
        this.f9539 = i6;
        byte b = bArr[i4];
        int i7 = i + 4;
        this.f9539 = i7;
        byte b2 = bArr[i6];
        int i8 = i + 5;
        this.f9539 = i8;
        byte b3 = bArr[i7];
        int i9 = i + 6;
        this.f9539 = i9;
        byte b4 = bArr[i8];
        this.f9539 = i + 7;
        byte b5 = bArr[i9];
        int iMo6772 = mo6772();
        int i10 = this.f9539;
        byte[] bArr2 = f9575;
        if (i10 + bArr2.length < bArr.length) {
            int i11 = 0;
            while (true) {
                int length = bArr2.length;
                int i12 = this.f9539;
                if (i11 >= length) {
                    this.f9539 = i12 + bArr2.length;
                    zoneIdM6416 = AbstractC3699.f9371;
                    break;
                }
                if (bArr[i12 + i11] != bArr2[i11]) {
                    break;
                }
                i11++;
            }
            zoneIdM6416 = AbstractC3699.m6416(mo6744(), AbstractC3699.f9371);
        } else {
            zoneIdM6416 = AbstractC3699.m6416(mo6744(), AbstractC3699.f9371);
        }
        return ZonedDateTime.of(LocalDateTime.of(i5, b, b2, b3, b4, b5, iMo6772), zoneIdM6416);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲世子苏兰, reason: contains not printable characters */
    public final void m6834() {
        throw new JSONException("string value not support input " + InterfaceC3745.m6917(this.f9584) + " offset " + this.f9539 + "/" + this.f9587.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子世兰苏, reason: contains not printable characters */
    public final String m6835(int i) {
        int i2 = this.f9539;
        byte[] bArr = this.f9587;
        return i == 1 ? AbstractC3700.m6463((char) (bArr[i2] & DefaultClassResolver.NAME)) : i == 2 ? AbstractC3700.m6462((char) (bArr[i2] & DefaultClassResolver.NAME), (char) (bArr[i2 + 1] & DefaultClassResolver.NAME)) : AbstractC3687.f9268 != null ? AbstractC3687.m6329(i2, bArr, i) : new String(bArr, i2, i, StandardCharsets.ISO_8859_1);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0196  */
    /* JADX INFO: renamed from: 飘花落叶言楪哲子世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m6836(byte b) {
        boolean z;
        int i;
        byte b2;
        int iM6838;
        String str;
        if (b == -81) {
            if ((this.f9546.f9665 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                this.f9541 = true;
                return false;
            }
            C1123.m1410(mo6730("long value not support input null"));
            return false;
        }
        byte[] bArr = this.f9587;
        if (b != 74) {
            if (b != 0) {
                if (b != 1) {
                    if (b == 77) {
                        z = false;
                    } else {
                        if (b == 78) {
                            z = false;
                            i = this.f9539;
                            b2 = bArr[i];
                            if (b2 != 102 && bArr[i + 1] == 97 && bArr[i + 2] == 108 && bArr[i + 3] == 115 && bArr[i + 4] == 101) {
                                this.f9539 = i + 5;
                                return z;
                            }
                            if (b2 == 70 && bArr[i + 1] == 65 && bArr[i + 2] == 76 && bArr[i + 3] == 83 && bArr[i + 4] == 69) {
                                this.f9539 = i + 5;
                                return z;
                            }
                            iM6838 = m6838();
                            this.f9585 = iM6838;
                            if (iM6838 == 1) {
                            }
                            String str2 = new String(bArr, this.f9539, iM6838, StandardCharsets.ISO_8859_1);
                            this.f9539 += this.f9585;
                            C1123.m1410("not support input ".concat(str2));
                            return z;
                        }
                        switch (b) {
                            case 121:
                            case 122:
                                z = false;
                                iM6838 = m6838();
                                this.f9585 = iM6838;
                                if (iM6838 == 1) {
                                    int i2 = this.f9539;
                                    byte b3 = bArr[i2];
                                    if (b3 == 89) {
                                        this.f9539 = i2 + 1;
                                        return true;
                                    }
                                    if (b3 == 78) {
                                        this.f9539 = i2 + 1;
                                        return true;
                                    }
                                } else {
                                    if (iM6838 == 4) {
                                        int i3 = this.f9539;
                                        if (bArr[i3] == 116 && bArr[i3 + 1] == 114 && bArr[i3 + 2] == 117 && bArr[i3 + 3] == 101) {
                                            this.f9539 = i3 + 4;
                                            return true;
                                        }
                                    }
                                    if (iM6838 == 5) {
                                        int i4 = this.f9539;
                                        byte b4 = bArr[i4];
                                        if (b4 == 102 && bArr[i4 + 1] == 97 && bArr[i4 + 2] == 108 && bArr[i4 + 3] == 115 && bArr[i4 + 4] == 101) {
                                            this.f9539 = i4 + 5;
                                            return z;
                                        }
                                        if (b4 == 70 && bArr[i4 + 1] == 65 && bArr[i4 + 2] == 76 && bArr[i4 + 3] == 83 && bArr[i4 + 4] == 69) {
                                            this.f9539 = i4 + 5;
                                            return z;
                                        }
                                    }
                                }
                                String str22 = new String(bArr, this.f9539, iM6838, StandardCharsets.ISO_8859_1);
                                this.f9539 += this.f9585;
                                C1123.m1410("not support input ".concat(str22));
                                return z;
                            case 123:
                            case 124:
                            case 125:
                                int iM68382 = m6838();
                                this.f9585 = iM68382;
                                byte[] bArr2 = new byte[iM68382];
                                System.arraycopy(bArr, this.f9539, bArr2, 0, iM68382);
                                str = new String(bArr2, b == 125 ? StandardCharsets.UTF_16BE : b == 124 ? StandardCharsets.UTF_16LE : StandardCharsets.UTF_16);
                                this.f9539 += this.f9585;
                                switch (str) {
                                    case "0":
                                    case "N":
                                    case "FALSE":
                                    case "false":
                                        break;
                                    case "1":
                                    case "Y":
                                    case "TRUE":
                                    case "true":
                                        break;
                                    default:
                                        C1123.m1410("not support input ".concat(str));
                                        return false;
                                }
                                break;
                            default:
                                throw m6828(b);
                        }
                    }
                }
                return true;
            }
            return false;
        }
        int i5 = this.f9539;
        byte b5 = bArr[i5];
        z = false;
        if (b5 == 49 || b5 == 89) {
            this.f9539 = i5 + 1;
            return true;
        }
        if (b5 == 48 || b5 == 78) {
            this.f9539 = i5 + 1;
            return false;
        }
        int i6 = this.f9539;
        byte b6 = bArr[i6];
        if (b6 == 116 && bArr[i6 + 1] == 114 && bArr[i6 + 2] == 117 && bArr[i6 + 3] == 101) {
            this.f9539 = i6 + 4;
            return true;
        }
        if (b6 == 84 && bArr[i6 + 1] == 82 && bArr[i6 + 2] == 85 && bArr[i6 + 3] == 69) {
            this.f9539 = i6 + 4;
            return true;
        }
        i = this.f9539;
        b2 = bArr[i];
        if (b2 != 102) {
        }
        if (b2 == 70) {
            this.f9539 = i + 5;
            return z;
        }
        iM6838 = m6838();
        this.f9585 = iM6838;
        if (iM6838 == 1) {
        }
        String str222 = new String(bArr, this.f9539, iM6838, StandardCharsets.ISO_8859_1);
        this.f9539 += this.f9585;
        C1123.m1410("not support input ".concat(str222));
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰世苏, reason: contains not printable characters */
    public final long m6837(byte[] bArr, byte b) {
        int i = this.f9539;
        if (InterfaceC3745.m6921(b)) {
            return b;
        }
        if (InterfaceC3745.m6916(b)) {
            long jM6830 = m6830(i, bArr, b);
            this.f9539 = i + 1;
            return jM6830;
        }
        boolean zM6913 = InterfaceC3745.m6913(b);
        int i2 = this.f9586;
        if (zM6913 && i + 1 < i2) {
            this.f9539 = i + 2;
            return m6829(i, bArr, b);
        }
        if (b == -71) {
            int iMo6772 = mo6772();
            BigInteger bigIntegerMo6670 = mo6670();
            return (iMo6772 == 0 ? new BigDecimal(bigIntegerMo6670) : new BigDecimal(bigIntegerMo6670, iMo6772)).longValue();
        }
        if (b == 72) {
            int i3 = this.f9539;
            m6831(i3, i2);
            int iM6297 = AbstractC3682.m6297(bArr, i3);
            this.f9539 += 4;
            return iM6297;
        }
        if (b == 124) {
            int iMo67722 = mo6772();
            String str = new String(bArr, this.f9539, iMo67722, StandardCharsets.UTF_16LE);
            this.f9539 += iMo67722;
            return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC3700.m6473(str).intValue();
        }
        if (b == -68) {
            int i4 = this.f9539;
            int i5 = (bArr[i4 + 1] & DefaultClassResolver.NAME) + (bArr[i4] << 8);
            this.f9539 = i4 + 2;
            return i5;
        }
        if (b == -67) {
            this.f9539 = this.f9539 + 1;
            return bArr[r9];
        }
        if (b == 121) {
            int iMo67723 = mo6772();
            String str2 = new String(bArr, this.f9539, iMo67723, StandardCharsets.ISO_8859_1);
            this.f9539 += iMo67723;
            return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC3700.m6473(str2).intValue();
        }
        if (b == 122) {
            int iMo67724 = mo6772();
            String str3 = new String(bArr, this.f9539, iMo67724, StandardCharsets.UTF_8);
            this.f9539 += iMo67724;
            return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC3700.m6473(str3).intValue();
        }
        switch (b) {
            case -85:
                int i6 = this.f9539;
                m6832(i6, i2);
                long jM6290 = AbstractC3682.m6290(bArr, i6);
                this.f9539 += 8;
                return jM6290;
            case -84:
                int i7 = this.f9539;
                m6831(i7, i2);
                long jM6297 = AbstractC3682.m6297(bArr, i7);
                this.f9539 += 4;
                return jM6297 * 1000;
            case -83:
                int i8 = this.f9539;
                m6831(i8, i2);
                long jM62972 = AbstractC3682.m6297(bArr, i8);
                this.f9539 += 4;
                return jM62972 * 60000;
            default:
                switch (b) {
                    case -81:
                        if ((this.f9546.f9665 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                            this.f9541 = true;
                            return 0L;
                        }
                        C1123.m1410(mo6730("long value not support input null"));
                        return 0L;
                    case -80:
                    case -78:
                        return 0L;
                    case -79:
                    case -77:
                        return 1L;
                    case -76:
                        return mo6769();
                    case -75:
                        this.f9539--;
                        return (long) mo6687();
                    case -74:
                        return mo6772();
                    case -73:
                        int i9 = this.f9539;
                        m6831(i9, i2);
                        int iM62972 = AbstractC3682.m6297(bArr, i9);
                        this.f9539 += 4;
                        return (long) Float.intBitsToFloat(iM62972);
                    default:
                        if (b < 73 || b > 120) {
                            C3775.m6958("readInt64Value not support ", InterfaceC3745.m6917(b), this.f9539, this.f9587.length);
                            return 0L;
                        }
                        int i10 = b - 73;
                        String strM6835 = m6835(i10);
                        this.f9539 += i10;
                        return strM6835.indexOf(46) == -1 ? new BigInteger(strM6835).longValue() : AbstractC3700.m6473(strM6835).longValue();
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世, reason: contains not printable characters */
    public final int m6838() {
        int i = this.f9539;
        int i2 = i + 1;
        byte[] bArr = this.f9587;
        int iM6297 = bArr[i];
        if (!InterfaceC3745.m6921(iM6297)) {
            if (InterfaceC3745.m6916(iM6297)) {
                iM6297 = m6830(i2, bArr, iM6297);
                i2 = i + 2;
            } else {
                boolean zM6913 = InterfaceC3745.m6913(iM6297);
                int i3 = this.f9586;
                if (zM6913 && i + 2 < i3) {
                    iM6297 = m6829(i2, bArr, iM6297);
                    i2 = i + 3;
                } else {
                    if (iM6297 != 72 || i + 4 >= i3) {
                        throw m6828((byte) iM6297);
                    }
                    iM6297 = AbstractC3682.m6297(bArr, i2);
                    i2 = i + 5;
                    if (iM6297 > 268435456) {
                        C1123.m1410("input length overflow");
                        return 0;
                    }
                }
            }
        }
        this.f9539 = i2;
        return iM6297;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰, reason: contains not printable characters */
    public final float m6839() {
        int i = this.f9539;
        int i2 = i + 1;
        this.f9539 = i2;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -71) {
            int iMo6772 = mo6772();
            BigInteger bigIntegerMo6670 = mo6670();
            return (iMo6772 == 0 ? new BigDecimal(bigIntegerMo6670) : new BigDecimal(bigIntegerMo6670, iMo6772)).intValue();
        }
        int i3 = this.f9586;
        if (b != 72) {
            if (b == 124) {
                int iMo67722 = mo6772();
                String str = new String(bArr, this.f9539, iMo67722, StandardCharsets.UTF_16LE);
                this.f9539 += iMo67722;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC3700.m6473(str).intValue();
            }
            if (b == 121) {
                int iMo67723 = mo6772();
                String str2 = new String(bArr, this.f9539, iMo67723, StandardCharsets.ISO_8859_1);
                this.f9539 += iMo67723;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC3700.m6473(str2).intValue();
            }
            if (b == 122) {
                int iMo67724 = mo6772();
                String str3 = new String(bArr, this.f9539, iMo67724, StandardCharsets.UTF_8);
                this.f9539 += iMo67724;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC3700.m6473(str3).intValue();
            }
            switch (b) {
                case -81:
                    if ((this.f9546.f9665 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                        this.f9541 = true;
                        return 0.0f;
                    }
                    C1123.m1410(mo6730("long value not support input null"));
                    return 0.0f;
                case -80:
                case -78:
                    return 0.0f;
                case -79:
                case -77:
                    return 1.0f;
                case -76:
                    return mo6769();
                case -75:
                    m6832(i2, i3);
                    long jM6290 = AbstractC3682.m6290(bArr, i2);
                    this.f9539 += 8;
                    return (float) Double.longBitsToDouble(jM6290);
                case -74:
                    return mo6772();
                default:
                    switch (b) {
                        case -68:
                            int i4 = (bArr[i + 2] & DefaultClassResolver.NAME) + (bArr[i2] << 8);
                            this.f9539 = i + 3;
                            return i4;
                        case -67:
                            this.f9539 = i + 2;
                            return bArr[i2];
                        case -66:
                            m6832(i2, i3);
                            long jM62902 = AbstractC3682.m6290(bArr, i2);
                            this.f9539 += 8;
                            return jM62902;
                        case -65:
                            break;
                        default:
                            if (InterfaceC3745.m6921(b)) {
                                return b;
                            }
                            if (InterfaceC3745.m6916(b)) {
                                this.f9539 = this.f9539 + 1;
                                return m6830(r0, bArr, b);
                            }
                            if (InterfaceC3745.m6913(b)) {
                                int i5 = this.f9539;
                                if (i5 + 1 < i3) {
                                    int iM6829 = m6829(i5, bArr, b);
                                    this.f9539 += 2;
                                    return iM6829;
                                }
                            }
                            if (InterfaceC3745.m6919(b)) {
                                return b + 32;
                            }
                            if (InterfaceC3745.m6918(b)) {
                                this.f9539 = this.f9539 + 1;
                                return m6826(r0, bArr, b);
                            }
                            if (InterfaceC3745.m6914(b)) {
                                int i6 = this.f9539;
                                if (i6 + 1 < i3) {
                                    int iM6827 = m6827(i6, bArr, b);
                                    this.f9539 += 2;
                                    return iM6827;
                                }
                            }
                            if (b < 73 || b > 120) {
                                throw m6828(b);
                            }
                            int i7 = b - 73;
                            String strM6835 = m6835(i7);
                            this.f9539 += i7;
                            return strM6835.indexOf(46) == -1 ? new BigInteger(strM6835).intValue() : AbstractC3700.m6473(strM6835).intValue();
                    }
                    break;
            }
        }
        m6831(i2, i3);
        int iM6297 = AbstractC3682.m6297(bArr, i2);
        this.f9539 += 4;
        return iM6297;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪哲子苏兰世, reason: contains not printable characters */
    public final int m6840(byte[] bArr, byte b) {
        if (InterfaceC3745.m6919(b)) {
            return b + 32;
        }
        if (InterfaceC3745.m6918(b)) {
            int i = this.f9539;
            this.f9539 = i + 1;
            return m6826(i, bArr, b);
        }
        boolean zM6914 = InterfaceC3745.m6914(b);
        int i2 = this.f9586;
        if (zM6914) {
            int i3 = this.f9539;
            if (i3 + 1 < i2) {
                int iM6827 = m6827(i3, bArr, b);
                this.f9539 += 2;
                return iM6827;
            }
        }
        if (b == -71) {
            int iMo6772 = mo6772();
            BigInteger bigIntegerMo6670 = mo6670();
            return (iMo6772 == 0 ? new BigDecimal(bigIntegerMo6670) : new BigDecimal(bigIntegerMo6670, iMo6772)).intValue();
        }
        if (b == 124) {
            int iMo67722 = mo6772();
            String str = new String(bArr, this.f9539, iMo67722, StandardCharsets.UTF_16LE);
            this.f9539 += iMo67722;
            return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : AbstractC3700.m6473(str).intValue();
        }
        if (b == 121) {
            int iMo67723 = mo6772();
            String str2 = new String(bArr, this.f9539, iMo67723, StandardCharsets.ISO_8859_1);
            this.f9539 += iMo67723;
            return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : AbstractC3700.m6473(str2).intValue();
        }
        if (b == 122) {
            int iMo67724 = mo6772();
            String str3 = new String(bArr, this.f9539, iMo67724, StandardCharsets.UTF_8);
            this.f9539 += iMo67724;
            return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : AbstractC3700.m6473(str3).intValue();
        }
        switch (b) {
            case -85:
                int i4 = this.f9539;
                m6832(i4, i2);
                long jM6290 = AbstractC3682.m6290(bArr, i4);
                this.f9539 += 8;
                return (int) jM6290;
            case -84:
            case -83:
                break;
            default:
                switch (b) {
                    case -81:
                        if ((this.f9546.f9665 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                            this.f9541 = true;
                            return 0;
                        }
                        C1123.m1410(mo6730("int value not support input null"));
                        return 0;
                    case -80:
                    case -78:
                        return 0;
                    case -79:
                    case -77:
                        return 1;
                    case -76:
                        return (int) mo6769();
                    case -75:
                        this.f9539--;
                        return (int) mo6687();
                    case -74:
                        return mo6772();
                    case -73:
                        int i5 = this.f9539;
                        m6831(i5, i2);
                        int iM6297 = AbstractC3682.m6297(bArr, i5);
                        this.f9539 += 4;
                        return (int) Float.intBitsToFloat(iM6297);
                    default:
                        switch (b) {
                            case -68:
                                int i6 = this.f9539;
                                int i7 = (bArr[i6 + 1] & DefaultClassResolver.NAME) + (bArr[i6] << 8);
                                this.f9539 = i6 + 2;
                                return i7;
                            case -67:
                                int i8 = this.f9539;
                                this.f9539 = i8 + 1;
                                return bArr[i8];
                            case -66:
                                int i9 = this.f9539;
                                m6832(i9, i2);
                                long jM62902 = AbstractC3682.m6290(bArr, i9);
                                this.f9539 += 8;
                                return (int) jM62902;
                            case -65:
                                break;
                            default:
                                if (b < 73 || b > 120) {
                                    C3775.m6958("readInt32Value not support ", InterfaceC3745.m6917(b), this.f9539, this.f9587.length);
                                    return 0;
                                }
                                int i10 = b - 73;
                                String strM6835 = m6835(i10);
                                this.f9539 += i10;
                                return strM6835.indexOf(46) == -1 ? new BigInteger(strM6835).intValue() : AbstractC3700.m6473(strM6835).intValue();
                        }
                        break;
                }
                break;
        }
        int i11 = this.f9539;
        m6831(i11, i2);
        int iM62972 = AbstractC3682.m6297(bArr, i11);
        this.f9539 += 4;
        return iM62972;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public final long[] mo6768() {
        if (mo6703((byte) -110)) {
            long jMo6799 = mo6799();
            if (jMo6799 != C3544.f8585 && jMo6799 != C3540.f8575 && jMo6799 != C3562.f8648 && jMo6799 != C3541.f8577) {
                C1123.m1410(mo6730("not support " + mo6660()));
                return null;
            }
        }
        int iMo6792 = mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        long[] jArr = new long[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            jArr[i] = mo6769();
        }
        return jArr;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final long mo6769() {
        long jM6290;
        this.f9541 = false;
        int i = this.f9539;
        int i2 = i + 1;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (InterfaceC3745.m6919(b)) {
            jM6290 = b + 32;
        } else if (InterfaceC3745.m6918(b)) {
            jM6290 = m6826(i2, bArr, b);
            i2 = i + 2;
        } else {
            boolean zM6914 = InterfaceC3745.m6914(b);
            int i3 = this.f9586;
            if (zM6914 && i + 2 < i3) {
                jM6290 = m6827(i2, bArr, b);
                i2 = i + 3;
            } else if (b == -65 && i + 4 < i3) {
                jM6290 = AbstractC3682.m6297(bArr, i2);
                i2 = i + 5;
            } else {
                if (b != -66 || i + 8 >= i3) {
                    this.f9539 = i2;
                    return m6837(bArr, b);
                }
                jM6290 = AbstractC3682.m6290(bArr, i2);
                i2 = i + 9;
            }
        }
        this.f9539 = i2;
        return jM6290;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏 */
    public final Long mo6770() {
        long jM6290;
        int i = this.f9539;
        int i2 = i + 1;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -81) {
            this.f9539 = i2;
            return null;
        }
        if (InterfaceC3745.m6919(b)) {
            jM6290 = b + 32;
        } else if (InterfaceC3745.m6918(b)) {
            jM6290 = m6826(i2, bArr, b);
            i2 = i + 2;
        } else {
            boolean zM6914 = InterfaceC3745.m6914(b);
            int i3 = this.f9586;
            if (zM6914 && i + 2 < i3) {
                jM6290 = m6827(i2, bArr, b);
                i2 = i + 3;
            } else if (b == -65 && i + 4 < i3) {
                jM6290 = AbstractC3682.m6297(bArr, i2);
                i2 = i + 5;
            } else {
                if (b != -66 || i + 8 >= i3) {
                    this.f9539 = i2;
                    return Long.valueOf(m6837(bArr, b));
                }
                jM6290 = AbstractC3682.m6290(bArr, i2);
                i2 = i + 9;
            }
        }
        this.f9539 = i2;
        return Long.valueOf(jM6290);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final int mo6772() {
        int i = this.f9539;
        int i2 = i + 1;
        byte[] bArr = this.f9587;
        int iM6297 = bArr[i];
        if (!InterfaceC3745.m6921(iM6297)) {
            if (InterfaceC3745.m6916(iM6297)) {
                iM6297 = m6830(i2, bArr, iM6297);
                i2 = i + 2;
            } else {
                boolean zM6913 = InterfaceC3745.m6913(iM6297);
                int i3 = this.f9586;
                if (zM6913 && i + 2 < i3) {
                    iM6297 = m6829(i2, bArr, iM6297);
                    i2 = i + 3;
                } else {
                    if (iM6297 != 72 || i + 4 >= i3) {
                        this.f9539 = i2;
                        return m6840(bArr, (byte) iM6297);
                    }
                    iM6297 = AbstractC3682.m6297(bArr, i2);
                    i2 = i + 5;
                }
            }
        }
        this.f9539 = i2;
        return iM6297;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public final Integer mo6773() {
        int i = this.f9539;
        int i2 = i + 1;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -81) {
            this.f9539 = i2;
            return null;
        }
        boolean zM6921 = InterfaceC3745.m6921(b);
        int i3 = b;
        if (!zM6921) {
            if (InterfaceC3745.m6916(b)) {
                int iM6830 = m6830(i2, bArr, b);
                i2 = i + 2;
                i3 = iM6830;
            } else {
                boolean zM6913 = InterfaceC3745.m6913(b);
                int i4 = this.f9586;
                if (zM6913 && i + 2 < i4) {
                    int iM6829 = m6829(i2, bArr, b);
                    i2 = i + 3;
                    i3 = iM6829;
                } else {
                    if (b != 72 || i + 4 >= i4) {
                        this.f9539 = i2;
                        return Integer.valueOf(m6840(bArr, b));
                    }
                    int iM6297 = AbstractC3682.m6297(bArr, i2);
                    i2 = i + 5;
                    i3 = iM6297;
                }
            }
        }
        this.f9539 = i2;
        return Integer.valueOf(i3);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏 */
    public final LocalDateTime mo6774() {
        LocalDateTime localDateTimeM6398;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 93 || (localDateTimeM6398 = AbstractC3699.m6398(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 21;
        return localDateTimeM6398;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final LocalDateTime mo6775() {
        int i = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        this.f9584 = b;
        if (b != 92) {
            C1123.m1410("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM6403 = AbstractC3699.m6403(bArr, i + 1);
        if (localDateTimeM6403 != null) {
            this.f9539 += 20;
            return localDateTimeM6403;
        }
        C1123.m1410("date only support string input");
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏 */
    public final LocalTime mo6776() {
        LocalTime localTimeM6394;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 83 || (localTimeM6394 = AbstractC3699.m6394(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 11;
        return localTimeM6394;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public final LocalTime mo6777() {
        LocalTime localTimeM6397;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 84 || (localTimeM6397 = AbstractC3699.m6397(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 12;
        return localTimeM6397;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final LocalDateTime mo6778(int i) {
        LocalDateTime localDateTimeM6395;
        int i2 = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i2];
        this.f9584 = b;
        if (b < 73 || b > 120) {
            C1123.m1410("date only support string input");
            return null;
        }
        if (i < 21 || i > 29 || (localDateTimeM6395 = AbstractC3699.m6395(i2 + 1, bArr, i)) == null) {
            C1123.m1401(mo6744(), "illegal LocalDateTime string : ");
            return null;
        }
        this.f9539 = i + 1 + this.f9539;
        return localDateTimeM6395;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世 */
    public final LocalTime mo6779() {
        int i = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -89) {
            int i2 = i + 2;
            this.f9539 = i2;
            byte b2 = bArr[i + 1];
            int i3 = i + 3;
            this.f9539 = i3;
            byte b3 = bArr[i2];
            this.f9539 = i + 4;
            return LocalTime.of(b2, b3, bArr[i3], mo6772());
        }
        if (b == -81) {
            this.f9539 = i + 1;
            return null;
        }
        if (b < 73 || b > 120) {
            C6385.m11441();
            return null;
        }
        int iMo6659 = mo6659();
        if (iMo6659 == 18) {
            return mo6759();
        }
        switch (iMo6659) {
            case 5:
                return mo6758();
            case 6:
                return mo6757();
            case 7:
                return mo6756();
            case 8:
                return mo6767();
            case 9:
                return mo6766();
            case 10:
                return mo6776();
            case 11:
                return mo6777();
            case 12:
                return mo6761();
            default:
                C1123.m1410(AbstractC7012.m12147(iMo6659, "not support len : "));
                return null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final LocalDateTime mo6780() {
        LocalDateTime localDateTimeM6405;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 85 || (localDateTimeM6405 = AbstractC3699.m6405(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 13;
        return localDateTimeM6405;
    }

    /* JADX WARN: Type inference failed for: r12v20, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final LocalDateTime mo6781() {
        int i = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -88) {
            int i2 = i + 2;
            this.f9539 = i2;
            int i3 = bArr[i + 1] << 8;
            int i4 = i + 3;
            this.f9539 = i4;
            int i5 = i3 + (bArr[i2] & DefaultClassResolver.NAME);
            int i6 = i + 4;
            this.f9539 = i6;
            byte b2 = bArr[i4];
            int i7 = i + 5;
            this.f9539 = i7;
            byte b3 = bArr[i6];
            int i8 = i + 6;
            this.f9539 = i8;
            byte b4 = bArr[i7];
            int i9 = i + 7;
            this.f9539 = i9;
            byte b5 = bArr[i8];
            this.f9539 = i + 8;
            return LocalDateTime.of(i5, b2, b3, b4, b5, bArr[i9], mo6772());
        }
        if (b == -81) {
            this.f9539 = i + 1;
            return null;
        }
        if (b == -87) {
            LocalDate localDateMo6786 = mo6786();
            if (localDateMo6786 != null) {
                return LocalDateTime.of(localDateMo6786, LocalTime.MIN);
            }
        } else {
            if (b == -86) {
                return mo6801().toLocalDateTime();
            }
            if (b < 73 || b > 120) {
                throw m6828(b);
            }
            int iMo6659 = mo6659();
            switch (iMo6659) {
                case 8:
                    return LocalDateTime.of(mo6788(), LocalTime.MIN);
                case 9:
                    return LocalDateTime.of(mo6789(), LocalTime.MIN);
                case 10:
                    LocalDate localDateMo6790 = mo6790();
                    if (localDateMo6790 != null) {
                        return LocalDateTime.of(localDateMo6790, LocalTime.MIN);
                    }
                    break;
                case 11:
                    LocalDate localDateMo6791 = mo6791();
                    if (localDateMo6791 != null) {
                        return LocalDateTime.of(localDateMo6791, LocalTime.MIN);
                    }
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    StringBuilder sbM710 = AbstractC0900.m710(iMo6659, "TODO : ", ", ");
                    sbM710.append(mo6744());
                    throw new JSONException(sbM710.toString());
                case 16:
                    return mo6785();
                case 17:
                    return mo6782();
                case 18:
                    return mo6783();
                case 19:
                    return mo6775();
                case 20:
                    return mo6774();
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return mo6778(iMo6659);
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏 */
    public final LocalDateTime mo6782() {
        LocalDateTime localDateTimeM6411;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 90 || (localDateTimeM6411 = AbstractC3699.m6411(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 18;
        return localDateTimeM6411;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世 */
    public final LocalDateTime mo6783() {
        LocalDateTime localDateTimeM6401;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 91 || (localDateTimeM6401 = AbstractC3699.m6401(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 19;
        return localDateTimeM6401;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final LocalDateTime mo6784() {
        LocalDateTime localDateTimeM6415;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 87 || (localDateTimeM6415 = AbstractC3699.m6415(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 15;
        return localDateTimeM6415;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final LocalDateTime mo6785() {
        LocalDateTime localDateTimeM6413;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 89 || (localDateTimeM6413 = AbstractC3699.m6413(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 17;
        return localDateTimeM6413;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲 */
    public final LocalDate mo6786() {
        int i;
        int i2 = this.f9539;
        int i3 = i2 + 1;
        byte[] bArr = this.f9587;
        byte b = bArr[i2];
        if (b == -87 && (i = i2 + 4) < this.f9586) {
            short sM6258 = AbstractC3682.m6258(bArr, i3);
            byte bM6300 = AbstractC3682.m6300(bArr, i2 + 3);
            byte bM63002 = AbstractC3682.m6300(bArr, i);
            this.f9539 = i2 + 5;
            return LocalDate.of(sM6258, bM6300, bM63002);
        }
        if (b == -81) {
            this.f9539 = i3;
            return null;
        }
        if (b == -88) {
            return mo6781().toLocalDate();
        }
        if (b == -86) {
            return mo6801().toLocalDate();
        }
        if (b >= 73 && b <= 120) {
            int iMo6659 = mo6659();
            switch (iMo6659) {
                case 8:
                    return mo6788();
                case 9:
                    return mo6789();
                case 10:
                    return mo6790();
                case 11:
                    return mo6791();
                default:
                    if (bArr[this.f9539 + iMo6659] == 90) {
                        return mo6801().toInstant().atZone(this.f9546.m6969()).toLocalDate();
                    }
                    StringBuilder sbM710 = AbstractC0900.m710(iMo6659, "TODO : ", ", ");
                    sbM710.append(mo6744());
                    throw new JSONException(sbM710.toString());
            }
        }
        if (b == 122 || b == 121) {
            this.f9581 = b;
            this.f9539 = i3;
            int iM6838 = m6838();
            this.f9585 = iM6838;
            switch (iM6838) {
                case 8:
                    return mo6788();
                case 9:
                    return mo6789();
                case 10:
                    return mo6790();
                case 11:
                    return mo6791();
            }
        }
        throw m6828(b);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final LocalDate mo6788() {
        LocalDate localDateM6427;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 81 || (localDateM6427 = AbstractC3699.m6427(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 9;
        return localDateM6427;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final LocalDate mo6789() {
        LocalDate localDateM6425;
        int i = this.f9539;
        byte[] bArr = this.f9587;
        if (bArr[i] != 82 || (localDateM6425 = AbstractC3699.m6425(bArr, i + 1)) == null) {
            C1123.m1410("date only support string input");
            return null;
        }
        this.f9539 += 10;
        return localDateM6425;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final LocalDate mo6790() {
        LocalDate localDateM6431;
        byte b = this.f9581;
        byte[] bArr = this.f9587;
        if ((b == 121 || b == 122) && this.f9585 == 10) {
            localDateM6431 = AbstractC3699.m6431(bArr, this.f9539);
        } else {
            int i = this.f9539;
            if (bArr[i] != 83 || (localDateM6431 = AbstractC3699.m6431(bArr, i + 1)) == null) {
                C1123.m1410("date only support string input");
                return null;
            }
        }
        this.f9539 += 11;
        return localDateM6431;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final LocalDate mo6791() {
        LocalDate localDateM6422;
        byte b = this.f9581;
        byte[] bArr = this.f9587;
        if ((b == 121 || b == 122) && this.f9585 == 11) {
            localDateM6422 = AbstractC3699.m6422(bArr, this.f9539);
        } else {
            int i = this.f9539;
            if (bArr[i] != 84 || (localDateM6422 = AbstractC3699.m6422(bArr, i + 1)) == null) {
                C1123.m1410("date only support string input");
                return null;
            }
        }
        this.f9539 += 12;
        return localDateM6422;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏世兰子哲 */
    public final int mo6792() {
        int i = this.f9539;
        this.f9539 = i + 1;
        byte b = this.f9587[i];
        this.f9584 = b;
        if (b == -81) {
            return -1;
        }
        if (b >= -108 && b <= -93) {
            this.f9538 = (char) (-b);
            return b - (-108);
        }
        if (b == -111) {
            return mo6772();
        }
        if (b == -92) {
            return mo6772();
        }
        C1123.m1410("array not support input ".concat(m6842(b)));
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲兰子 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6793() {
        int i = this.f9539;
        this.f9539 = i + 1;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b != 72) {
            if (b != 73) {
                switch (b) {
                    case -111:
                        this.f9539 += mo6772();
                        return;
                    case -110:
                        mo6799();
                        mo6793();
                        return;
                    case -109:
                        if (!mo6739()) {
                            throw m6828(b);
                        }
                        mo6794();
                        return;
                    case -108:
                        return;
                    default:
                        byte[] bArr2 = f9574;
                        switch (b) {
                            case -90:
                                while (true) {
                                    int i2 = this.f9539;
                                    byte b2 = bArr[i2];
                                    if (b2 == -91) {
                                        this.f9539 = i2 + 1;
                                        return;
                                    }
                                    byte b3 = bArr2[b2 & DefaultClassResolver.NAME];
                                    if (b3 > 0) {
                                        this.f9539 = i2 + b3;
                                    } else if (b3 == -1) {
                                        this.f9539 = i2 + 1;
                                        this.f9539 += mo6772();
                                    } else {
                                        mo6794();
                                    }
                                    int i3 = this.f9539;
                                    byte b4 = bArr2[bArr[i3] & DefaultClassResolver.NAME];
                                    if (b4 > 0) {
                                        this.f9539 = i3 + b4;
                                    } else if (b4 == -1) {
                                        this.f9539 = i3 + 1;
                                        this.f9539 += mo6772();
                                    } else {
                                        mo6793();
                                    }
                                }
                                break;
                            case -89:
                                this.f9539 = i + 4;
                                mo6772();
                                return;
                            case -88:
                                this.f9539 = i + 8;
                                mo6772();
                                return;
                            case -87:
                            case -84:
                            case -83:
                                break;
                            case -86:
                                this.f9539 = i + 8;
                                mo6772();
                                mo6744();
                                return;
                            case -85:
                                this.f9539 = i + 9;
                                return;
                            default:
                                switch (b) {
                                    case -81:
                                    case -80:
                                    case -79:
                                    case -78:
                                    case -77:
                                        return;
                                    case -76:
                                    case -72:
                                        mo6769();
                                        return;
                                    case -75:
                                        break;
                                    case -74:
                                        mo6772();
                                        return;
                                    case -73:
                                        break;
                                    case -71:
                                        mo6772();
                                        mo6670();
                                        return;
                                    default:
                                        switch (b) {
                                            case -68:
                                                this.f9539 = i + 3;
                                                return;
                                            case -67:
                                                this.f9539 = i + 2;
                                                return;
                                            case -66:
                                                break;
                                            case -65:
                                                break;
                                            default:
                                                switch (b) {
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                        this.f9539 += mo6772();
                                                        return;
                                                    default:
                                                        if (InterfaceC3745.m6921(b) || InterfaceC3745.m6919(b)) {
                                                            return;
                                                        }
                                                        if (InterfaceC3745.m6916(b) || InterfaceC3745.m6918(b)) {
                                                            this.f9539++;
                                                            return;
                                                        }
                                                        if (InterfaceC3745.m6913(b) || InterfaceC3745.m6914(b)) {
                                                            this.f9539 += 2;
                                                            return;
                                                        }
                                                        if (b >= 73 && b <= 120) {
                                                            this.f9539 = (b - 73) + this.f9539;
                                                            return;
                                                        }
                                                        if (b < -108 || b > -92) {
                                                            throw m6828(b);
                                                        }
                                                        int iMo6772 = b == -92 ? mo6772() : b + 108;
                                                        for (int i4 = 0; i4 < iMo6772; i4++) {
                                                            int i5 = this.f9539;
                                                            byte b5 = bArr2[bArr[i5] & DefaultClassResolver.NAME];
                                                            if (b5 > 0) {
                                                                this.f9539 = i5 + b5;
                                                            } else if (b5 == -1) {
                                                                this.f9539 = i5 + 1;
                                                                this.f9539 += mo6772();
                                                            } else {
                                                                mo6793();
                                                            }
                                                        }
                                                        return;
                                                }
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                return;
            }
        }
        this.f9539 = i + 5;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰 */
    public final void mo6794() {
        int i = this.f9539;
        int i2 = i + 1;
        this.f9539 = i2;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        this.f9581 = b;
        if (b >= 73 && b <= 120) {
            this.f9539 = (b - 73) + i2;
            return;
        }
        if (b == 121 || b == 122 || b == 123 || b == 124 || b == 125) {
            int iM6838 = m6838();
            this.f9585 = iM6838;
            this.f9539 += iM6838;
        } else {
            if (b != 127) {
                throw m6828(b);
            }
            byte b2 = bArr[i2];
            if (b2 >= -16 && b2 <= 72) {
                mo6772();
            } else {
                mo6744();
                mo6772();
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲 */
    public final void mo6795() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏世子哲兰 */
    public final void mo6796(C1804 c1804) {
        this.f9539 = c1804.f3101;
        this.f9584 = (byte) c1804.f3100;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏兰哲子世, reason: contains not printable characters */
    public final long m6841() {
        byte[] bArr;
        long j;
        long j2;
        int i = this.f9580;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f9585;
            bArr = this.f9587;
            if (i3 < i4) {
                byte b = bArr[i];
                if (b >= 0 && i3 < 8 && (i3 != 0 || bArr[this.f9580] != 0)) {
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
        i = this.f9580;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = -3750763034362895579L;
        while (i2 < this.f9585) {
            j4 = (j4 ^ ((long) bArr[i])) * 1099511628211L;
            i2++;
            i++;
        }
        return j4;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子, reason: contains not printable characters */
    public final String m6842(byte b) {
        String strMo6744;
        StringBuilder sb = new StringBuilder();
        sb.append(InterfaceC3745.m6917(b));
        if (mo6739()) {
            int i = this.f9539;
            this.f9539 = i - 1;
            try {
                strMo6744 = mo6744();
            } catch (Throwable unused) {
                strMo6744 = null;
            }
            if (strMo6744 != null) {
                sb.append(' ');
                sb.append(strMo6744);
            }
            this.f9539 = i;
        }
        sb.append(", offset ");
        sb.append(this.f9539);
        sb.append('/');
        sb.append(this.f9587.length);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02bc  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏子世兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo6799() {
        long j;
        long j2;
        long j3;
        long j4;
        int iMo6772;
        int iMo67722;
        long jM6334;
        int iMo67723;
        int i;
        int i2;
        int i3 = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i3];
        this.f9581 = b;
        if (b != 121 || (i = bArr[i3 + 1]) <= 8 || i > 63) {
            j = 1099511628211L;
        } else {
            if (i <= 47) {
                i2 = i3 + 2;
            } else {
                i = ((i - 56) << 8) + (bArr[i3 + 2] & Opcodes.CONST_METHOD_TYPE);
                i2 = i3 + 3;
            }
            int i4 = i2;
            long j5 = -3750763034362895579L;
            int i5 = 0;
            j = 1099511628211L;
            while (i5 < i) {
                j5 = (j5 ^ ((long) bArr[i4])) * 1099511628211L;
                i5++;
                i4++;
            }
            int i6 = bArr[i4];
            if (i6 >= 0 && i6 <= 47) {
                int i7 = i4 + 1;
                if (i6 == 0) {
                    this.f9579 = i2;
                    this.f9589 = i;
                    this.f9588 = b;
                    this.f9578 = j5;
                } else {
                    int i8 = i6 * 2;
                    int i9 = i8 + 2;
                    long[] jArr = this.f9590;
                    if (jArr == null) {
                        this.f9590 = new long[Math.max(i9, 32)];
                    } else if (jArr.length < i9) {
                        this.f9590 = Arrays.copyOf(jArr, i8 + 18);
                    }
                    this.f9590[i8 + 1] = (((long) i2) << 32) + (((long) i) << 8) + ((long) b);
                }
                this.f9580 = i2;
                this.f9585 = i;
                this.f9539 = i7;
                return j5;
            }
        }
        int i10 = this.f9539;
        byte b2 = bArr[i10];
        this.f9581 = b2;
        byte b3 = b2;
        if (b2 == 127) {
            int i11 = i10 + 1;
            this.f9539 = i11;
            byte b4 = bArr[i11];
            this.f9581 = b4;
            boolean zM6920 = InterfaceC3745.m6920(b4);
            b3 = b4;
            if (zM6920) {
                if (b4 <= 47) {
                    this.f9539++;
                    iMo67723 = b4;
                } else {
                    iMo67723 = mo6772();
                }
                if (iMo67723 < 0) {
                    throw null;
                }
                if (iMo67723 == 0) {
                    this.f9581 = this.f9588;
                    this.f9585 = this.f9589;
                    this.f9580 = this.f9579;
                    if (this.f9578 == 0) {
                        this.f9578 = m6841();
                    }
                    return this.f9578;
                }
                int i12 = iMo67723 * 2;
                long[] jArr2 = this.f9590;
                long j6 = jArr2[i12 + 1];
                int i13 = (int) j6;
                this.f9581 = (byte) i13;
                this.f9585 = i13 >> 8;
                this.f9580 = (int) (j6 >> 32);
                long j7 = jArr2[i12];
                if (j7 != 0) {
                    return j7;
                }
                long jM6841 = m6841();
                this.f9590[i12] = jM6841;
                return jM6841;
            }
        }
        if (InterfaceC3745.m6920(b3)) {
            if (b3 <= 47) {
                this.f9539++;
                iMo67722 = b3;
            } else if (b3 <= 63) {
                int i14 = this.f9539;
                this.f9539 = i14 + 2;
                iMo67722 = ((b3 - 56) << 8) + (bArr[i14 + 1] & Opcodes.CONST_METHOD_TYPE);
            } else {
                iMo67722 = mo6772();
            }
            if (iMo67722 == 0) {
                this.f9581 = this.f9588;
                this.f9585 = this.f9589;
                this.f9580 = this.f9579;
                if (this.f9578 == 0) {
                    this.f9578 = AbstractC3693.m6334(mo6660());
                }
                jM6334 = this.f9578;
            } else {
                if (iMo67722 < 0) {
                    this.f9585 = b3;
                    throw null;
                }
                long[] jArr3 = this.f9590;
                int i15 = iMo67722 * 2;
                long j8 = jArr3[i15];
                if (j8 == 0) {
                    long j9 = jArr3[i15 + 1];
                    int i16 = (int) j9;
                    this.f9581 = (byte) i16;
                    this.f9585 = i16 >> 8;
                    this.f9580 = (int) (j9 >> 32);
                    jM6334 = AbstractC3693.m6334(mo6660());
                } else {
                    jM6334 = j8;
                }
            }
            if (jM6334 != -1) {
                return jM6334;
            }
            C1123.m1410(AbstractC7012.m12147(iMo67722, "type ref not found : "));
            return 0L;
        }
        int i17 = this.f9539 + 1;
        this.f9539 = i17;
        this.f9580 = i17;
        if (b3 >= 73 && b3 <= 120) {
            this.f9585 = b3 - 73;
        } else {
            if (b3 != 121 && b3 != 122 && b3 != 123 && b3 != 124 && b3 != 125) {
                m6834();
                throw null;
            }
            int i18 = bArr[i17];
            if (InterfaceC3745.m6921(i18)) {
                this.f9539++;
                this.f9585 = i18;
            } else if (InterfaceC3745.m6916(i18)) {
                int i19 = this.f9539;
                this.f9539 = i19 + 2;
                this.f9585 = m6830(i19 + 1, bArr, i18);
            } else {
                this.f9585 = m6838();
            }
            this.f9580 = this.f9539;
        }
        int i20 = this.f9585;
        if (i20 < 0) {
            throw null;
        }
        if (b3 == 122) {
            int i21 = this.f9539 + i20;
            j2 = -3750763034362895579L;
            while (true) {
                int i22 = this.f9539;
                if (i22 < i21) {
                    int iM6821 = bArr[i22];
                    if (iM6821 >= 0) {
                        this.f9539 = i22 + 1;
                    } else {
                        int i23 = iM6821 & Opcodes.CONST_METHOD_TYPE;
                        switch (i23 >> 4) {
                            case 12:
                            case 13:
                                iM6821 = C3735.m6821(i23, bArr[i22 + 1], i22);
                                this.f9539 += 2;
                                break;
                            case 14:
                                iM6821 = C3735.m6822(i23, bArr[i22 + 1], bArr[i22 + 2], i22);
                                this.f9539 += 3;
                                break;
                            default:
                                C1123.m1404(this.f9539, "malformed input around byte ");
                                return 0L;
                        }
                    }
                    j2 = (j2 ^ ((long) iM6821)) * j;
                }
            }
        } else if (b3 == 123 || b3 == 125) {
            j2 = -3750763034362895579L;
            for (int i24 = 0; i24 < this.f9585; i24 += 2) {
                int i25 = this.f9539 + i24;
                j2 = (((long) ((char) ((bArr[i25 + 1] & Opcodes.CONST_METHOD_TYPE) | ((bArr[i25] & Opcodes.CONST_METHOD_TYPE) << 8)))) ^ j2) * j;
            }
        } else if (b3 == 124) {
            j2 = -3750763034362895579L;
            for (int i26 = 0; i26 < this.f9585; i26 += 2) {
                int i27 = this.f9539 + i26;
                j2 = (((long) ((char) (((bArr[i27 + 1] & Opcodes.CONST_METHOD_TYPE) << 8) | (bArr[i27] & Opcodes.CONST_METHOD_TYPE)))) ^ j2) * j;
            }
        } else if (i20 <= 8) {
            int i28 = this.f9539;
            j2 = 0;
            for (int i29 = 0; i29 < this.f9585; i29++) {
                int i30 = this.f9539;
                int i31 = bArr[i30];
                if (i31 < 0 || (i31 == 0 && bArr[i28] == 0)) {
                    this.f9539 = i28;
                    j2 = 0;
                    if (j2 == 0) {
                        j2 = -3750763034362895579L;
                        for (int i32 = 0; i32 < this.f9585; i32++) {
                            int i33 = this.f9539;
                            this.f9539 = i33 + 1;
                            j2 = (((long) bArr[i33]) ^ j2) * j;
                        }
                    }
                } else {
                    switch (i29) {
                        case 0:
                            j2 = i31;
                            continue;
                            this.f9539 = i30 + 1;
                            break;
                        case 1:
                            j3 = i31 << 8;
                            j4 = 255;
                            break;
                        case 2:
                            j3 = i31 << 16;
                            j4 = 65535;
                            break;
                        case 3:
                            j3 = i31 << 24;
                            j4 = 16777215;
                            break;
                        case 4:
                            j3 = ((long) i31) << 32;
                            j4 = 4294967295L;
                            break;
                        case 5:
                            j3 = ((long) i31) << 40;
                            j4 = 1099511627775L;
                            break;
                        case 6:
                            j3 = ((long) i31) << 48;
                            j4 = 281474976710655L;
                            break;
                        case 7:
                            j3 = ((long) i31) << 56;
                            j4 = 72057594037927935L;
                            break;
                        default:
                            this.f9539 = i30 + 1;
                            break;
                    }
                    j2 = (j2 & j4) + j3;
                    this.f9539 = i30 + 1;
                }
            }
            if (j2 == 0) {
            }
        } else {
            j2 = 0;
            if (j2 == 0) {
            }
        }
        byte b5 = bArr[this.f9539];
        this.f9584 = b5;
        if (InterfaceC3745.m6921(b5)) {
            iMo6772 = this.f9584;
            this.f9539++;
        } else {
            iMo6772 = mo6772();
        }
        if (iMo6772 == 0) {
            this.f9579 = this.f9580;
            this.f9589 = this.f9585;
            this.f9588 = b3;
            this.f9578 = j2;
            return j2;
        }
        int i34 = iMo6772 * 2;
        int i35 = i34 + 2;
        long[] jArr4 = this.f9590;
        if (jArr4 == null) {
            this.f9590 = new long[Math.max(i35, 32)];
        } else if (jArr4.length < i35) {
            this.f9590 = Arrays.copyOf(jArr4, i34 + 18);
        }
        this.f9590[i34 + 1] = (((long) this.f9580) << 32) + (((long) this.f9585) << 8) + ((long) b3);
        return j2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰世哲 */
    public final ZonedDateTime mo6801() {
        ZoneId zoneIdM6969;
        int i = this.f9539;
        int i2 = i + 1;
        this.f9539 = i2;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -86) {
            int i3 = (bArr[i2] << 8) + (bArr[i + 2] & DefaultClassResolver.NAME);
            byte b2 = bArr[i + 3];
            byte b3 = bArr[i + 4];
            byte b4 = bArr[i + 5];
            byte b5 = bArr[i + 6];
            byte b6 = bArr[i + 7];
            this.f9539 = i + 8;
            LocalDateTime localDateTimeOf = LocalDateTime.of(i3, b2, b3, b4, b5, b6, mo6772());
            if (mo6804() == -4800907791268808639L) {
                zoneIdM6969 = AbstractC3699.f9371;
            } else {
                String strMo6660 = mo6660();
                zoneIdM6969 = this.f9546.m6969();
                if (!zoneIdM6969.getId().equals(strMo6660)) {
                    zoneIdM6969 = AbstractC3699.m6416(strMo6660, AbstractC3699.f9371);
                }
            }
            return ZonedDateTime.ofLocal(localDateTimeOf, zoneIdM6969, null);
        }
        if (b == -88) {
            int i4 = i + 2;
            this.f9539 = i4;
            int i5 = bArr[i2] << 8;
            int i6 = i + 3;
            this.f9539 = i6;
            int i7 = i5 + (bArr[i4] & DefaultClassResolver.NAME);
            int i8 = i + 4;
            this.f9539 = i8;
            byte b7 = bArr[i6];
            int i9 = i + 5;
            this.f9539 = i9;
            byte b8 = bArr[i8];
            int i10 = i + 6;
            this.f9539 = i10;
            byte b9 = bArr[i9];
            int i11 = i + 7;
            this.f9539 = i11;
            byte b10 = bArr[i10];
            this.f9539 = i + 8;
            return ZonedDateTime.of(LocalDateTime.of(i7, b7, b8, b9, b10, bArr[i11], mo6772()), AbstractC3699.f9372);
        }
        if (b == -87) {
            int i12 = i + 2;
            this.f9539 = i12;
            int i13 = bArr[i2] << 8;
            int i14 = i + 3;
            this.f9539 = i14;
            int i15 = i13 + (bArr[i12] & DefaultClassResolver.NAME);
            int i16 = i + 4;
            this.f9539 = i16;
            byte b11 = bArr[i14];
            this.f9539 = i + 5;
            return ZonedDateTime.of(LocalDate.of(i15, b11, bArr[i16]), LocalTime.MIN, AbstractC3699.f9372);
        }
        int i17 = this.f9586;
        if (b != -66) {
            switch (b) {
                case -85:
                    break;
                case -84:
                    m6831(i2, i17);
                    long jM6297 = AbstractC3682.m6297(bArr, i2);
                    this.f9539 += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(jM6297), AbstractC3699.f9372);
                case -83:
                    m6831(i2, i17);
                    long jM62972 = AbstractC3682.m6297(bArr, i2);
                    this.f9539 += 4;
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(jM62972 * 60), AbstractC3699.f9372);
                case -82:
                    return ZonedDateTime.ofInstant(Instant.ofEpochSecond(mo6769(), mo6772()), AbstractC3699.f9372);
                case -81:
                    return null;
                default:
                    if (b < 73 || b > 120) {
                        throw m6828(b);
                    }
                    this.f9539 = i;
                    return mo6802(b - 73);
            }
        }
        m6832(i2, i17);
        long jM6290 = AbstractC3682.m6290(bArr, i2);
        this.f9539 += 8;
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(jM6290), AbstractC3699.f9372);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世 */
    public final ZonedDateTime mo6802(int i) {
        ZonedDateTime zonedDateTimeM6441;
        int i2 = this.f9539;
        byte[] bArr = this.f9587;
        byte b = bArr[i2];
        this.f9584 = b;
        if (b < 73 || b > 120) {
            C1123.m1410("date only support string input");
            return null;
        }
        if (i < 19 || (zonedDateTimeM6441 = AbstractC3699.m6441(bArr, i2 + 1, i, (ZoneId) this.f9546.f9664)) == null) {
            C1123.m1401(mo6744(), "illegal LocalDateTime string : ");
            return null;
        }
        this.f9539 = i + 1 + this.f9539;
        return zonedDateTimeM6441;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰 */
    public final UUID mo6803() {
        int i = this.f9539;
        int i2 = i + 1;
        this.f9539 = i2;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        if (b == -111) {
            this.f9539 = i + 2;
            byte b2 = bArr[i2];
            if (b2 != 16 && i + 17 >= this.f9586) {
                C1123.m1410(AbstractC7012.m12147(b2, "uuid not support "));
                return null;
            }
            UUID uuid = new UUID(AbstractC3682.m6290(bArr, this.f9539), AbstractC3682.m6290(bArr, this.f9539 + 8));
            this.f9539 += 16;
            return uuid;
        }
        if (b == -81) {
            return null;
        }
        if (b == 105) {
            UUID uuidM6811 = C3735.m6811(bArr, i2);
            this.f9539 += 32;
            return uuidM6811;
        }
        if (b == 109) {
            if (bArr[i + 9] != 45 || bArr[i + 14] != 45 || bArr[i + 19] != 45 || bArr[i + 24] != 45) {
                C1123.m1410("Invalid UUID string:  ".concat(new String(bArr, i2, 36, StandardCharsets.ISO_8859_1)));
                return null;
            }
            UUID uuidM6814 = C3735.m6814(bArr, i2);
            this.f9539 += 36;
            return uuidM6814;
        }
        if (b != 121 && b != 122) {
            throw m6828(b);
        }
        int iM6838 = m6838();
        if (iM6838 == 32) {
            UUID uuidM68112 = C3735.m6811(bArr, this.f9539);
            this.f9539 += 32;
            return uuidM68112;
        }
        if (iM6838 == 36) {
            int i3 = this.f9539;
            if (bArr[i3 + 8] == 45 && bArr[i3 + 13] == 45 && bArr[i3 + 18] == 45 && bArr[i3 + 23] == 45) {
                UUID uuidM68142 = C3735.m6814(bArr, i3);
                this.f9539 += 36;
                return uuidM68142;
            }
        }
        C1123.m1410("Invalid UUID string:  ".concat(new String(bArr, this.f9539, iM6838, StandardCharsets.UTF_8)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0302 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d A[RETURN] */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo6804() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        int i = this.f9539;
        int i2 = i + 1;
        this.f9539 = i2;
        byte[] bArr = this.f9587;
        byte b = bArr[i];
        this.f9581 = b;
        this.f9580 = i2;
        if (b >= 73 && b <= 120) {
            this.f9585 = b - 73;
        } else {
            if (b != 121 && b != 122 && b != 123 && b != 124 && b != 125 && b != 127) {
                m6834();
                throw null;
            }
            this.f9585 = m6838();
            this.f9580 = this.f9539;
        }
        int i3 = this.f9585;
        if (i3 < 0) {
            throw null;
        }
        if (b != 122) {
            if (b == 123) {
                int i4 = this.f9539;
                char c = bArr[i4];
                if (c != -2 || bArr[i4 + 1] != -1) {
                    if (c == -1 && bArr[i4 + 1] == -2) {
                        long j9 = -3750763034362895579L;
                        for (int i5 = 2; i5 < this.f9585; i5 += 2) {
                            int i6 = i4 + i5;
                            j9 = (((long) ((char) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255)))) ^ j9) * 1099511628211L;
                        }
                        return j9;
                    }
                    long j10 = -3750763034362895579L;
                    for (int i7 = 0; i7 < this.f9585; i7 += 2) {
                        int i8 = i4 + i7;
                        j10 = (((long) ((char) (((bArr[i8 + 1] & 255) << 8) | (bArr[i8] & 255)))) ^ j10) * 1099511628211L;
                    }
                    return j10;
                }
                if (i3 <= 16) {
                    long j11 = 0;
                    for (int i9 = 2; i9 < this.f9585; i9 += 2) {
                        int i10 = i4 + i9;
                        char c2 = (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
                        if (c2 > 127 || (i9 == 0 && c2 == 0)) {
                            j11 = 0;
                            if (j11 != 0) {
                                return j11;
                            }
                        } else {
                            byte b2 = (byte) c2;
                            switch ((i9 - 2) >> 1) {
                                case 0:
                                    j11 = b2;
                                    continue;
                                    break;
                                case 1:
                                    j7 = b2 << 8;
                                    j8 = j11 & 255;
                                    break;
                                case 2:
                                    j7 = b2 << 16;
                                    j8 = j11 & 65535;
                                    break;
                                case 3:
                                    j7 = b2 << 24;
                                    j8 = j11 & 16777215;
                                    break;
                                case 4:
                                    j7 = ((long) b2) << 32;
                                    j8 = j11 & 4294967295L;
                                    break;
                                case 5:
                                    j7 = ((long) b2) << 40;
                                    j8 = j11 & 1099511627775L;
                                    break;
                                case 6:
                                    j7 = ((long) b2) << 48;
                                    j8 = j11 & 281474976710655L;
                                    break;
                                case 7:
                                    j7 = ((long) b2) << 56;
                                    j8 = j11 & 72057594037927935L;
                                    break;
                                default:
                                    break;
                            }
                            j11 = j8 + j7;
                        }
                    }
                    if (j11 != 0) {
                    }
                }
                long j12 = -3750763034362895579L;
                for (int i11 = 2; i11 < this.f9585; i11 += 2) {
                    int i12 = i4 + i11;
                    j12 = (((long) ((char) ((bArr[i12 + 1] & 255) | ((bArr[i12] & 255) << 8)))) ^ j12) * 1099511628211L;
                }
                return j12;
            }
            if (b == 125) {
                int i13 = this.f9539;
                if (i3 <= 16) {
                    long j13 = 0;
                    for (int i14 = 0; i14 < this.f9585; i14 += 2) {
                        int i15 = i13 + i14;
                        char c3 = (char) ((bArr[i15 + 1] & 255) | ((bArr[i15] & 255) << 8));
                        if (c3 > 127 || (i14 == 0 && c3 == 0)) {
                            j13 = 0;
                            if (j13 != 0) {
                                return j13;
                            }
                        } else {
                            byte b3 = (byte) c3;
                            switch (i14 >> 1) {
                                case 0:
                                    j13 = b3;
                                    continue;
                                    break;
                                case 1:
                                    j5 = b3 << 8;
                                    j6 = j13 & 255;
                                    break;
                                case 2:
                                    j5 = b3 << 16;
                                    j6 = j13 & 65535;
                                    break;
                                case 3:
                                    j5 = b3 << 24;
                                    j6 = j13 & 16777215;
                                    break;
                                case 4:
                                    j5 = ((long) b3) << 32;
                                    j6 = j13 & 4294967295L;
                                    break;
                                case 5:
                                    j5 = ((long) b3) << 40;
                                    j6 = j13 & 1099511627775L;
                                    break;
                                case 6:
                                    j5 = ((long) b3) << 48;
                                    j6 = j13 & 281474976710655L;
                                    break;
                                case 7:
                                    j5 = ((long) b3) << 56;
                                    j6 = j13 & 72057594037927935L;
                                    break;
                                default:
                                    break;
                            }
                            j13 = j6 + j5;
                        }
                    }
                    if (j13 != 0) {
                    }
                }
                long j14 = -3750763034362895579L;
                for (int i16 = 0; i16 < this.f9585; i16 += 2) {
                    int i17 = i13 + i16;
                    j14 = (((long) ((char) ((bArr[i17 + 1] & 255) | ((bArr[i17] & 255) << 8)))) ^ j14) * 1099511628211L;
                }
                return j14;
            }
            if (b == 124) {
                int i18 = this.f9539;
                if (i3 <= 16) {
                    long j15 = 0;
                    for (int i19 = 0; i19 < this.f9585; i19 += 2) {
                        int i20 = i18 + i19;
                        char c4 = (char) (((bArr[i20 + 1] & 255) << 8) | (bArr[i20] & 255));
                        if (c4 > 127 || (i19 == 0 && c4 == 0)) {
                            j15 = 0;
                            if (j15 != 0) {
                                return j15;
                            }
                        } else {
                            byte b4 = (byte) c4;
                            switch (i19 >> 1) {
                                case 0:
                                    j15 = b4;
                                    continue;
                                    break;
                                case 1:
                                    j3 = b4 << 8;
                                    j4 = j15 & 255;
                                    break;
                                case 2:
                                    j3 = b4 << 16;
                                    j4 = j15 & 65535;
                                    break;
                                case 3:
                                    j3 = b4 << 24;
                                    j4 = j15 & 16777215;
                                    break;
                                case 4:
                                    j3 = ((long) b4) << 32;
                                    j4 = j15 & 4294967295L;
                                    break;
                                case 5:
                                    j3 = ((long) b4) << 40;
                                    j4 = j15 & 1099511627775L;
                                    break;
                                case 6:
                                    j3 = ((long) b4) << 48;
                                    j4 = j15 & 281474976710655L;
                                    break;
                                case 7:
                                    j3 = ((long) b4) << 56;
                                    j4 = j15 & 72057594037927935L;
                                    break;
                                default:
                                    break;
                            }
                            j15 = j4 + j3;
                        }
                    }
                    if (j15 != 0) {
                    }
                }
                long j16 = -3750763034362895579L;
                for (int i21 = 0; i21 < this.f9585; i21 += 2) {
                    int i22 = i18 + i21;
                    j16 = (((long) ((char) (((bArr[i22 + 1] & 255) << 8) | (bArr[i22] & 255)))) ^ j16) * 1099511628211L;
                }
                return j16;
            }
            if (i3 <= 8) {
                int i23 = this.f9539;
                long j17 = 0;
                for (int i24 = 0; i24 < this.f9585; i24++) {
                    int i25 = this.f9539;
                    int i26 = bArr[i25];
                    if (i26 < 0 || (i26 == 0 && bArr[i23] == 0)) {
                        this.f9539 = i23;
                        j17 = 0;
                        if (j17 != 0) {
                            return j17;
                        }
                    } else {
                        switch (i24) {
                            case 0:
                                j17 = i26;
                                continue;
                                this.f9539 = i25 + 1;
                                break;
                            case 1:
                                j = i26 << 8;
                                j2 = j17 & 255;
                                break;
                            case 2:
                                j = i26 << 16;
                                j2 = j17 & 65535;
                                break;
                            case 3:
                                j = i26 << 24;
                                j2 = j17 & 16777215;
                                break;
                            case 4:
                                j = ((long) i26) << 32;
                                j2 = j17 & 4294967295L;
                                break;
                            case 5:
                                j = ((long) i26) << 40;
                                j2 = j17 & 1099511627775L;
                                break;
                            case 6:
                                j = ((long) i26) << 48;
                                j2 = j17 & 281474976710655L;
                                break;
                            case 7:
                                j = ((long) i26) << 56;
                                j2 = j17 & 72057594037927935L;
                                break;
                            default:
                                this.f9539 = i25 + 1;
                                break;
                        }
                        j17 = j2 + j;
                        this.f9539 = i25 + 1;
                    }
                }
                if (j17 != 0) {
                }
            }
            long j18 = -3750763034362895579L;
            for (int i27 = 0; i27 < this.f9585; i27++) {
                int i28 = this.f9539;
                this.f9539 = i28 + 1;
                j18 = (((long) bArr[i28]) ^ j18) * 1099511628211L;
            }
            return j18;
        }
        int i29 = this.f9539 + i3;
        long j19 = -3750763034362895579L;
        while (true) {
            int i30 = this.f9539;
            if (i30 >= i29) {
                return j19;
            }
            int iM6821 = bArr[i30];
            if (iM6821 >= 0) {
                this.f9539 = i30 + 1;
            } else {
                int i31 = iM6821 & Opcodes.CONST_METHOD_TYPE;
                switch (i31 >> 4) {
                    case 12:
                    case 13:
                        iM6821 = C3735.m6821(i31, bArr[i30 + 1], i30);
                        this.f9539 += 2;
                        break;
                    case 14:
                        iM6821 = C3735.m6822(i31, bArr[i30 + 1], bArr[i30 + 2], i30);
                        this.f9539 += 3;
                        break;
                    default:
                        C1123.m1404(this.f9539, "malformed input around byte ");
                        return 0L;
                }
            }
            j19 = (((long) iM6821) ^ j19) * 1099511628211L;
        }
    }
}
