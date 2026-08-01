package com.alibaba.fastjson2;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.compose.foundation.text.C1804;
import com.alibaba.fastjson2.reader.AbstractC3595;
import com.alibaba.fastjson2.reader.C3537;
import com.alibaba.fastjson2.reader.C3605;
import com.alibaba.fastjson2.reader.C3635;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3699;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3662;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3732 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final boolean[] f9524;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f9525;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f9526;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public short f9527;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public short f9528;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public byte f9529;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f9530;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f9531;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Object f9532;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public String f9533;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f9534;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f9535;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f9536;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f9537;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public char f9538;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9539;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f9540;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f9541;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f9542;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f9543;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f9544;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ArrayList f9545;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3776 f9546;

    static {
        boolean[] zArr = new boolean[256];
        f9524 = zArr;
        Arrays.fill(zArr, true);
        char[] cArr = {TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 'e', 'E', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, 'f', 'n', '{', TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH, '0', '1', '2', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < 19; i++) {
            f9524[cArr[i]] = false;
        }
    }

    public AbstractC3732(C3776 c3776, boolean z) {
        this.f9546 = c3776;
        this.f9544 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public static AbstractC3732 m6651(String str) {
        return m6652(str, AbstractC3766.m6949());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static AbstractC3732 m6652(String str, C3776 c3776) {
        ToIntFunction toIntFunction;
        if (str == null || c3776 == null) {
            throw null;
        }
        Function function = AbstractC3687.f9272;
        if (function != null && (toIntFunction = AbstractC3687.f9271) != null) {
            try {
                if (toIntFunction.applyAsInt(str) == 0) {
                    byte[] bArr = (byte[]) function.apply(str);
                    return new C3736(c3776, str, bArr, bArr.length);
                }
            } catch (Exception unused) {
                C1123.m1410("unsafe get String.coder error");
                return null;
            }
        }
        return new C3734(c3776, str, AbstractC3687.f9263 == 8 ? AbstractC3687.m6330(str) : str.toCharArray(), str.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public static JSONException m6653(int i, int i2) {
        StringBuilder sbM710 = AbstractC0900.m710(i, "illegal number, offset ", ", char ");
        sbM710.append((char) i2);
        return new JSONException(sbM710.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m6654(int i, int i2) {
        StringBuilder sbM710 = AbstractC0900.m710(i, "error, offset ", ", char ");
        sbM710.append((char) i2);
        throw new JSONValidException(sbM710.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static char m6655(int i, int i2) {
        int[] iArr = AbstractC3766.f9645;
        return (char) ((iArr[i] * 16) + iArr[i2]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static boolean m6656(int i) {
        if (i >= 65 && i <= 90) {
            return true;
        }
        if ((i >= 97 && i <= 122) || i == 95 || i == 36) {
            return true;
        }
        return (i >= 48 && i <= 57) || i > 127;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏世兰哲子, reason: contains not printable characters */
    public static String m6657(long j, String str) {
        if ((16384 & j) != 0) {
            str = str.trim();
        }
        if ((j & 134217728) == 0 || !str.isEmpty()) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲子世兰, reason: contains not printable characters */
    public static JSONException m6658(int i, int i2) {
        StringBuilder sbM710 = AbstractC0900.m710(i, "syntax error, offset ", ", char ");
        sbM710.append((char) i2);
        return new JSONException(sbM710.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public abstract int mo6659();

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public abstract String mo6660();

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC3621 m6661(long j, long j2, Class cls) {
        C3776 c3776 = this.f9546;
        InterfaceC3621 interfaceC3621M6190 = ((C3635) c3776.f9663).m6190(j);
        if (interfaceC3621M6190 != null) {
            return interfaceC3621M6190;
        }
        return ((C3635) c3776.f9663).m6189(mo6660(), cls, c3776.f9665 | j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC3621 m6662(Type type) {
        C3776 c3776 = this.f9546;
        return ((C3635) c3776.f9663).m6193(type, (c3776.f9665 & 1) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Number m6663() {
        int[] iArr;
        int i;
        char c;
        int i2;
        BigDecimal bigDecimalValueOf;
        char c2;
        int[] iArr2;
        int[] iArr3;
        BigDecimal bigDecimal;
        int i3;
        int i4;
        int i5;
        int[] iArr4;
        int[] iArr5;
        byte b;
        if (this.f9541) {
            return null;
        }
        byte b2 = this.f9529;
        C3776 c3776 = this.f9546;
        switch (b2) {
            case 1:
            case 11:
                int i6 = this.f9526;
                if (i6 == 0 && this.f9537 == 0 && this.f9536 == 0 && (i = this.f9535) != Integer.MIN_VALUE) {
                    if (this.f9530) {
                        if (i < 0) {
                            long j = -(((long) i) & 4294967295L);
                            return (c3776.f9665 & JSONReader$Feature.UseBigIntegerForInts.mask) != 0 ? BigInteger.valueOf(j) : Long.valueOf(j);
                        }
                        i = -i;
                    } else if (i < 0) {
                        long j2 = ((long) i) & 4294967295L;
                        return (c3776.f9665 & JSONReader$Feature.UseBigIntegerForInts.mask) != 0 ? BigInteger.valueOf(j2) : Long.valueOf(j2);
                    }
                    long j3 = c3776.f9665;
                    return (JSONReader$Feature.UseBigIntegerForInts.mask & j3) != 0 ? BigInteger.valueOf(i) : (j3 & JSONReader$Feature.UseLongForInts.mask) != 0 ? Long.valueOf(i) : b2 == 11 ? Long.valueOf(i) : Integer.valueOf(i);
                }
                if (i6 == 0) {
                    int i7 = this.f9537;
                    if (i7 == 0) {
                        int i8 = this.f9535;
                        long j4 = ((long) i8) & 4294967295L;
                        int i9 = this.f9536;
                        long j5 = ((long) i9) & 4294967295L;
                        if (j5 <= 2147483647L) {
                            long j6 = (j5 << 32) + j4;
                            if (this.f9530) {
                                j6 = -j6;
                            }
                            return (c3776.f9665 & JSONReader$Feature.UseBigIntegerForInts.mask) != 0 ? BigInteger.valueOf(j6) : Long.valueOf(j6);
                        }
                        iArr = new int[]{i9, i8};
                    } else {
                        iArr = new int[]{i7, this.f9536, this.f9535};
                    }
                } else {
                    iArr = new int[]{i6, this.f9537, this.f9536, this.f9535};
                }
                BigInteger bigInteger = (BigInteger) C3777.f9666.apply(Integer.valueOf(this.f9530 ? -1 : 1), iArr);
                return (c3776.f9665 & JSONReader$Feature.UseLongForInts.mask) != 0 ? Long.valueOf(bigInteger.longValue()) : bigInteger;
            case 2:
                if (this.f9526 == 0 && this.f9537 == 0) {
                    int i10 = this.f9536;
                    if (i10 != 0 || (i3 = this.f9535) < 0) {
                        long j7 = ((long) this.f9535) & 4294967295L;
                        char c3 = 0;
                        i2 = 1;
                        long j8 = ((long) i10) & 4294967295L;
                        c = c3;
                        if (j8 <= 2147483647L) {
                            long j9 = (j8 << 32) + j7;
                            if (this.f9530) {
                                j9 = -j9;
                            }
                            bigDecimalValueOf = BigDecimal.valueOf(j9, this.f9527);
                            c2 = c3;
                        }
                    } else {
                        if (this.f9530) {
                            i3 = -i3;
                        }
                        bigDecimalValueOf = BigDecimal.valueOf(i3, this.f9527);
                        c2 = 0;
                        i2 = 1;
                    }
                    if (bigDecimalValueOf == null) {
                        int i11 = this.f9526;
                        if (i11 == 0) {
                            int i12 = this.f9537;
                            if (i12 == 0) {
                                iArr3 = new int[2];
                                iArr3[c2] = this.f9536;
                                iArr3[i2] = this.f9535;
                                bigDecimal = new BigDecimal((BigInteger) C3777.f9666.apply(Integer.valueOf(this.f9530 ? -1 : i2), iArr3), this.f9527 - this.f9528);
                                if (this.f9528 == 0 && (c3776.f9665 & (JSONReader$Feature.UseBigDecimalForDoubles.mask | JSONReader$Feature.UseBigDecimalForFloats.mask)) == 0) {
                                    return Double.valueOf(bigDecimal.doubleValue());
                                }
                                bigDecimalValueOf = bigDecimal;
                            } else {
                                iArr2 = new int[3];
                                iArr2[c2] = i12;
                                iArr2[i2] = this.f9536;
                                iArr2[2] = this.f9535;
                            }
                        } else {
                            iArr2 = new int[4];
                            iArr2[c2] = i11;
                            iArr2[i2] = this.f9537;
                            iArr2[2] = this.f9536;
                            iArr2[3] = this.f9535;
                        }
                        iArr3 = iArr2;
                        bigDecimal = new BigDecimal((BigInteger) C3777.f9666.apply(Integer.valueOf(this.f9530 ? -1 : i2), iArr3), this.f9527 - this.f9528);
                        if (this.f9528 == 0) {
                        }
                        bigDecimalValueOf = bigDecimal;
                    }
                    if (this.f9528 != 0) {
                        return (c3776.f9665 & JSONReader$Feature.UseDoubleForDecimals.mask) != 0 ? Double.valueOf(bigDecimalValueOf.doubleValue()) : bigDecimalValueOf;
                    }
                    String plainString = bigDecimalValueOf.toPlainString();
                    if ((c3776.f9665 & (JSONReader$Feature.UseBigDecimalForDoubles.mask | JSONReader$Feature.UseBigDecimalForFloats.mask)) == 0) {
                        StringBuilder sbM12143 = AbstractC7012.m12143(plainString, "E");
                        sbM12143.append((int) this.f9528);
                        return Double.valueOf(Double.parseDouble(sbM12143.toString()));
                    }
                    if (bigDecimalValueOf.signum() == 0) {
                        return BigDecimal.ZERO;
                    }
                    StringBuilder sbM121432 = AbstractC7012.m12143(plainString, "E");
                    sbM121432.append((int) this.f9528);
                    return new BigDecimal(sbM121432.toString());
                }
                c = 0;
                i2 = 1;
                bigDecimalValueOf = null;
                c2 = c;
                if (bigDecimalValueOf == null) {
                }
                if (this.f9528 != 0) {
                }
                break;
            case 3:
                return Long.valueOf(m6797(this.f9533));
            case 4:
                return Integer.valueOf(this.f9531 ? 1 : 0);
            case 5:
                return null;
            case 6:
                Object obj = ((Map) this.f9532).get("val");
                if (obj instanceof Number) {
                    return (Number) obj;
                }
                return null;
            case 7:
                List list = (List) this.f9532;
                if (list.size() != 1) {
                    return null;
                }
                Object obj2 = list.get(0);
                if (obj2 instanceof Number) {
                    return (Number) obj2;
                }
                if (obj2 instanceof String) {
                    return AbstractC3700.m6473((String) obj2);
                }
                return null;
            case 8:
                short s = this.f9527;
                if (s <= 0) {
                    return new BigInteger(this.f9533);
                }
                String str = AbstractC3766.f9634;
                if (s <= 2048) {
                    return AbstractC3700.m6473(this.f9533);
                }
                C1123.m1404(this.f9527, "scale overflow : ");
                return null;
            case 9:
                if (this.f9526 != 0 || this.f9537 != 0 || this.f9536 != 0 || (i4 = this.f9535) < 0) {
                    C1123.m1410(mo6730("shortValue overflow"));
                    return null;
                }
                if (this.f9530) {
                    i4 = -i4;
                }
                return Byte.valueOf((byte) i4);
            case 10:
                if (this.f9526 != 0 || this.f9537 != 0 || this.f9536 != 0 || (i5 = this.f9535) < 0) {
                    C1123.m1410(mo6730("shortValue overflow"));
                    return null;
                }
                if (this.f9530) {
                    i5 = -i5;
                }
                return Short.valueOf((short) i5);
            case 12:
            case 13:
                int i13 = this.f9526;
                if (i13 == 0) {
                    int i14 = this.f9537;
                    if (i14 == 0) {
                        int i15 = this.f9536;
                        iArr5 = i15 == 0 ? new int[]{this.f9535} : new int[]{i15, this.f9535};
                        BigDecimal bigDecimal2 = new BigDecimal((BigInteger) C3777.f9666.apply(Integer.valueOf(this.f9530 ? -1 : 1), iArr5), this.f9527);
                        b = this.f9529;
                        short s2 = this.f9528;
                        if (b != 12) {
                            if (s2 == 0) {
                                return Float.valueOf(bigDecimal2.floatValue());
                            }
                            return Float.valueOf(Float.parseFloat(bigDecimal2 + "E" + ((int) this.f9528)));
                        }
                        if (s2 == 0) {
                            return Double.valueOf(bigDecimal2.doubleValue());
                        }
                        return Double.valueOf(Double.parseDouble(bigDecimal2 + "E" + ((int) this.f9528)));
                    }
                    iArr4 = new int[]{i14, this.f9536, this.f9535};
                } else {
                    iArr4 = new int[]{i13, this.f9537, this.f9536, this.f9535};
                }
                iArr5 = iArr4;
                BigDecimal bigDecimal22 = new BigDecimal((BigInteger) C3777.f9666.apply(Integer.valueOf(this.f9530 ? -1 : 1), iArr5), this.f9527);
                b = this.f9529;
                short s22 = this.f9528;
                if (b != 12) {
                }
                break;
            default:
                C1123.m1404(this.f9529, "TODO : ");
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract String mo6664();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final double m6665() {
        int i;
        byte b = this.f9529;
        C3776 c3776 = this.f9546;
        switch (b) {
            case 1:
            case 9:
            case 10:
                if (this.f9537 == 0 && this.f9536 == 0 && (i = this.f9535) != Integer.MIN_VALUE) {
                    return this.f9530 ? -i : i;
                }
                Number numberM6663 = m6663();
                if (!(numberM6663 instanceof BigInteger)) {
                    return numberM6663.doubleValue();
                }
                BigInteger bigInteger = (BigInteger) numberM6663;
                if ((c3776.f9665 & JSONReader$Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return bigInteger.longValue();
                }
                try {
                    return bigInteger.longValueExact();
                } catch (ArithmeticException unused) {
                    throw m6698();
                }
            case 2:
            case 11:
            case 12:
            case 13:
                return m6663().doubleValue();
            case 3:
                try {
                    return AbstractC3700.m6477(this.f9533);
                } catch (NumberFormatException e) {
                    C1123.m1410(mo6730(e.getMessage()));
                    return 0.0d;
                }
            case 4:
                return this.f9531 ? 1.0d : 0.0d;
            case 5:
                if ((c3776.f9665 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C1123.m1410(mo6730("long value not support input null"));
                    return 0.0d;
                }
            case 6:
                Map map = (Map) this.f9532;
                if (map != null && !map.isEmpty()) {
                    return AbstractC3700.m6477(map);
                }
                this.f9541 = true;
                return 0.0d;
            case 7:
                Collection collection = (Collection) this.f9532;
                if (collection != null && !collection.isEmpty()) {
                    return AbstractC3700.m6477(this.f9532);
                }
                this.f9541 = true;
                return 0.0d;
            case 8:
                try {
                    return m6718().doubleValue();
                } catch (ArithmeticException unused2) {
                    throw m6698();
                }
            case 14:
                return Double.NaN;
            default:
                C1123.m1404(this.f9529, "TODO : ");
                return 0.0d;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract long mo6666();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m6667() {
        this.f9546.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public abstract boolean mo6668();

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public char mo6669() {
        String strMo6744 = mo6744();
        if (strMo6744 != null && !strMo6744.isEmpty()) {
            return strMo6744.charAt(0);
        }
        this.f9541 = true;
        return (char) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public BigInteger mo6670() {
        mo6755();
        Number numberM6663 = m6663();
        if (numberM6663 == null) {
            return null;
        }
        return numberM6663 instanceof BigInteger ? (BigInteger) numberM6663 : BigInteger.valueOf(numberM6663.longValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public abstract BigDecimal mo6671();

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public Boolean mo6672() {
        if (mo6693()) {
            return null;
        }
        this.f9541 = false;
        boolean zMo6668 = mo6668();
        if (zMo6668 || !this.f9541) {
            return Boolean.valueOf(zMo6668);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public byte[] mo6673() {
        if (this.f9538 == 'x') {
            return mo6675();
        }
        if (mo6739()) {
            String strMo6744 = mo6744();
            if (strMo6744.isEmpty()) {
                return null;
            }
            if ((this.f9546.f9665 & JSONReader$Feature.Base64StringAsByteArray.mask) != 0) {
                return Base64.getDecoder().decode(strMo6744);
            }
            C1123.m1410(mo6730("not support input ".concat(strMo6744)));
            return null;
        }
        if (!mo6701()) {
            C1123.m1410(mo6730("not support read binary"));
            return null;
        }
        byte[] bArrCopyOf = new byte[64];
        int i = 0;
        while (this.f9538 != ']') {
            if (i == bArrCopyOf.length) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + (length >> 1));
            }
            bArrCopyOf[i] = (byte) mo6772();
            i++;
        }
        mo6733();
        mo6705();
        return Arrays.copyOf(bArrCopyOf, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public abstract float mo6674();

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public abstract byte[] mo6675();

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final String m6676() {
        if (this.f9538 == '/') {
            mo6795();
        }
        mo6688();
        String strMo6664 = mo6664();
        if (strMo6664 != null && !strMo6664.isEmpty()) {
            return strMo6664;
        }
        C1123.m1410(mo6730("illegal input"));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public Float mo6677() {
        if (mo6693()) {
            return null;
        }
        this.f9541 = false;
        float fMo6674 = mo6674();
        if (this.f9541) {
            return null;
        }
        return Float.valueOf(fMo6674);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public Instant mo6678() {
        if (mo6693()) {
            return null;
        }
        if (mo6738()) {
            long jMo6769 = mo6769();
            this.f9546.getClass();
            return Instant.ofEpochMilli(jMo6769);
        }
        if (mo6737()) {
            return (Instant) m6662(Instant.class).mo6067(mo6754(), 0L);
        }
        ZonedDateTime zonedDateTimeMo6801 = mo6801();
        if (zonedDateTimeMo6801 == null) {
            return null;
        }
        return Instant.ofEpochSecond(zonedDateTimeMo6801.toEpochSecond(), zonedDateTimeMo6801.toLocalTime().getNano());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public abstract boolean mo6679();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0235  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6680(Map map, long j) throws IOException {
        boolean z;
        long j2;
        boolean z2;
        Object objMo6686;
        boolean z3;
        Object objMo6744;
        Object objPut;
        Map map2;
        char c = this.f9538;
        C3776 c3776 = this.f9546;
        long j3 = 0;
        if (c == '\'' && (c3776.f9665 & JSONReader$Feature.DisableSingleQuote.mask) != 0) {
            throw m6709();
        }
        if ((c == '\"' || c == '\'') && !this.f9525) {
            String strMo6744 = mo6744();
            if (strMo6744.isEmpty()) {
                return;
            }
            if (strMo6744.charAt(0) == '{') {
                AbstractC3732 abstractC3732M6652 = m6652(strMo6744, c3776);
                try {
                    abstractC3732M6652.m6750(map, j);
                    abstractC3732M6652.close();
                    return;
                } finally {
                }
            }
        }
        boolean zMo6708 = mo6708();
        String str = null;
        if (zMo6708) {
            z = false;
        } else {
            boolean z4 = this.f9525;
            if (!z4) {
                if (mo6739() && mo6744().isEmpty()) {
                    return;
                }
                C1123.m1410(mo6730(null));
                return;
            }
            this.f9525 = false;
            z = z4;
        }
        long j4 = j | c3776.f9665;
        int i = 0;
        while (true) {
            if (this.f9538 == '/') {
                mo6795();
            }
            if (mo6712()) {
                mo6705();
                return;
            }
            if (i != 0 && !this.f9542) {
                C1123.m1410(mo6730(str));
                return;
            }
            if (zMo6708 || z) {
                char c2 = this.f9538;
                j2 = j3;
                if ((c2 < '0' || c2 > '9') && c2 != '-') {
                    z2 = zMo6708;
                    objMo6686 = mo6686();
                } else {
                    z2 = zMo6708;
                    objMo6686 = str;
                }
            } else {
                objMo6686 = mo6664();
                j2 = j3;
                z2 = true;
            }
            if (objMo6686 == null) {
                if (mo6738()) {
                    objMo6686 = mo6752();
                    z3 = z;
                    if ((c3776.f9665 & JSONReader$Feature.NonStringKeyAsString.mask) != j2) {
                        objMo6686 = objMo6686.toString();
                    }
                    if (this.f9542) {
                        C1123.m1410(mo6730("syntax error, illegal key-value"));
                        return;
                    }
                } else {
                    z3 = z;
                    if ((c3776.f9665 & JSONReader$Feature.AllowUnQuotedFieldNames.mask) == j2) {
                        C1123.m1410(mo6730("not allow unquoted fieldName"));
                        return;
                    }
                    objMo6686 = m6676();
                }
                if (this.f9538 == ':') {
                    mo6733();
                }
            } else {
                z3 = z;
            }
            Object obj = objMo6686;
            if (!mo6740()) {
                this.f9542 = false;
                char c3 = this.f9538;
                switch (c3) {
                    case '\"':
                    case '\'':
                        objMo6744 = mo6744();
                        if ((objMo6744 == null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j4) == j2) && (((JSONReader$Feature.SupportAutoType.mask & j4) == j2 || !obj.equals("@type") || !map.getClass().getName().equals(objMo6744)) && (objPut = map.put(obj, objMo6744)) != null && (JSONReader$Feature.DuplicateKeyValueAsArray.mask & j4) != j2)) {
                            if (!(objPut instanceof Collection)) {
                                map.put(obj, JSONArray.m1of(objPut, objMo6744));
                            } else {
                                ((Collection) objPut).add(objMo6744);
                                map.put(obj, objPut);
                            }
                        }
                        break;
                    case '+':
                        objMo6744 = mo6752();
                        if (objMo6744 == null) {
                            if (!(objPut instanceof Collection)) {
                            }
                        } else if (!(objPut instanceof Collection)) {
                        }
                        break;
                    case 'I':
                        if (!mo6706()) {
                            C3775.m6953(this.f9539, this.f9538, "FASTJSON2.0.60error, offset ");
                            return;
                        } else {
                            objMo6744 = Double.valueOf(Double.POSITIVE_INFINITY);
                            if (objMo6744 == null) {
                            }
                        }
                        break;
                    case 'S':
                        if (!mo6707()) {
                            C3775.m6953(this.f9539, this.f9538, "FASTJSON2.0.60error, offset ");
                            return;
                        } else {
                            objMo6744 = mo6700(HashSet.class);
                            if (objMo6744 == null) {
                            }
                        }
                        break;
                    case '[':
                        objMo6744 = mo6685();
                        if (objMo6744 == null) {
                        }
                        break;
                    case 'f':
                    case 't':
                        objMo6744 = Boolean.valueOf(mo6668());
                        if (objMo6744 == null) {
                        }
                        break;
                    case 'n':
                        objMo6744 = mo6753();
                        if (objMo6744 == null) {
                        }
                        break;
                    case 'x':
                        objMo6744 = mo6673();
                        if (objMo6744 == null) {
                        }
                        break;
                    case '{':
                        objMo6744 = z3 ? C3537.f8553.mo6023(this, null, obj, j) : mo6754();
                        if (objMo6744 == null) {
                        }
                        break;
                    default:
                        switch (c3) {
                            case '-':
                            case '.':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case '/':
                                mo6733();
                                if (this.f9538 != '/') {
                                    throw new JSONException("FASTJSON2.0.60input not support " + this.f9538 + ", offset " + this.f9539);
                                }
                                mo6795();
                                continue;
                                break;
                            default:
                                C3775.m6953(this.f9539, this.f9538, "FASTJSON2.0.60error, offset ");
                                return;
                        }
                        if (objMo6744 == null) {
                        }
                        break;
                }
            } else {
                String strMo6749 = mo6749();
                if ("..".equals(strMo6749)) {
                    map2 = map;
                } else {
                    try {
                        m6713(map, obj, AbstractC3755.m6938(strMo6749));
                        map2 = null;
                    } catch (Exception unused) {
                        map.put(obj, JSONObject.m9of("$ref", (Object) strMo6749));
                    }
                }
                map.put(obj, map2);
            }
            i++;
            zMo6708 = z2;
            j3 = j2;
            z = z3;
            str = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m6681(JSONArray jSONArray) {
        if (!mo6701()) {
            C3775.m6953(this.f9539, this.f9538, "illegal input, offset ");
            return;
        }
        int i = this.f9534 + 1;
        this.f9534 = i;
        this.f9546.getClass();
        if (i >= 2048) {
            C1123.m1404(this.f9534, "level too large : ");
            return;
        }
        while (!this.mo6702()) {
            AbstractC3732 abstractC3732 = this;
            jSONArray.add(C3537.f8553.mo6023(abstractC3732, null, null, 0L));
            abstractC3732.mo6705();
            this = abstractC3732;
        }
        this.f9534--;
        this.mo6705();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public List mo6682(Type type) {
        AbstractC3732 abstractC3732;
        AbstractC3732 abstractC37322;
        Object objMo6023;
        char c;
        if (mo6693()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char c2 = this.f9538;
        if (c2 == '[') {
            mo6733();
            C3776 c3776 = this.f9546;
            InterfaceC3621 interfaceC3621M6193 = ((C3635) c3776.f9663).m6193(type, (c3776.f9665 & JSONReader$Feature.FieldBased.mask) != 0);
            int i = 0;
            while (!this.mo6702()) {
                int i2 = this.f9539;
                if (this.mo6740()) {
                    String strMo6749 = this.mo6749();
                    if ("..".equals(strMo6749)) {
                        objMo6023 = arrayList;
                    } else {
                        this.m6714(arrayList, i, AbstractC3755.m6938(strMo6749));
                        objMo6023 = null;
                    }
                    abstractC37322 = this;
                } else {
                    abstractC37322 = this;
                    objMo6023 = interfaceC3621M6193.mo6023(abstractC37322, null, null, 0L);
                }
                arrayList.add(objMo6023);
                if (i2 == abstractC37322.f9539 || (c = abstractC37322.f9538) == '}' || c == 26) {
                    throw new JSONException("illegal input : " + abstractC37322.f9538 + ", offset " + abstractC37322.f9539);
                }
                i++;
                this = abstractC37322;
            }
            abstractC3732 = this;
        } else {
            abstractC3732 = this;
            if (c2 != '\"' && c2 != '\'' && c2 != '{') {
                C1123.m1410(abstractC3732.mo6730("syntax error"));
                return null;
            }
            String strMo6744 = abstractC3732.mo6744();
            if (strMo6744 != null && !strMo6744.isEmpty()) {
                arrayList.add(strMo6744);
            }
        }
        boolean z = abstractC3732.f9538 == ',';
        abstractC3732.f9542 = z;
        if (z) {
            abstractC3732.mo6733();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public byte[] mo6683() {
        int iIndexOf;
        int i;
        int iIndexOf2;
        String strMo6744 = mo6744();
        if (strMo6744 != null && strMo6744.startsWith("data:image/") && (iIndexOf = strMo6744.indexOf(59, 12)) != -1 && (iIndexOf2 = strMo6744.indexOf(44, (i = iIndexOf + 1))) != -1 && strMo6744.regionMatches(i, "base64", 0, 6)) {
            strMo6744 = strMo6744.substring(iIndexOf2 + 1);
        }
        return strMo6744.isEmpty() ? new byte[0] : Base64.getDecoder().decode(strMo6744);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public Object mo6684() {
        return mo6700(Object.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List mo6685() {
        JSONArray jSONArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object objMo6744;
        mo6733();
        int i = this.f9534 + 1;
        this.f9534 = i;
        C3776 c3776 = this.f9546;
        c3776.getClass();
        if (i >= 2048) {
            C1123.m1404(this.f9534, "level too large : ");
            return null;
        }
        ArrayList jSONArray2 = null;
        Object obj = null;
        Object obj2 = null;
        int i2 = 0;
        while (true) {
            char c = this.f9538;
            switch (c) {
                case '\"':
                case '\'':
                    objMo6744 = mo6744();
                    if (i2 == 0) {
                        obj = objMo6744;
                    } else if (i2 == 1) {
                        obj2 = objMo6744;
                    } else if (i2 == 2) {
                        jSONArray2 = new JSONArray();
                        m6715(jSONArray2, 0, obj);
                        m6715(jSONArray2, 1, obj2);
                        m6715(jSONArray2, i2, objMo6744);
                    } else {
                        m6715(jSONArray2, i2, objMo6744);
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case '+':
                case '-':
                    mo6755();
                    objMo6744 = m6663();
                    if (i2 == 0) {
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case 'N':
                    objMo6744 = Double.valueOf(mo6763());
                    if (i2 == 0) {
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case 'S':
                    if (!mo6707()) {
                        C1123.m1410(mo6730(null));
                        return null;
                    }
                    objMo6744 = mo6700(Set.class);
                    if (i2 == 0) {
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                    break;
                case '[':
                    objMo6744 = mo6685();
                    if (i2 == 0) {
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case ']':
                    mo6733();
                    ArrayList arrayList3 = jSONArray2;
                    if (jSONArray2 == null) {
                        if ((c3776.f9665 & JSONReader$Feature.UseNativeObject.mask) != 0) {
                            if (i2 == 2) {
                                arrayList = arrayList2;
                                arrayList2 = new ArrayList(2);
                            } else {
                                arrayList = arrayList2;
                                arrayList2 = new ArrayList(1);
                            }
                        } else if (i2 == 2) {
                            arrayList = jSONArray;
                            jSONArray = new JSONArray(2);
                        } else {
                            arrayList = jSONArray;
                            jSONArray = new JSONArray(1);
                        }
                        ArrayList arrayList4 = arrayList;
                        arrayList3 = arrayList4;
                        if (i2 == 1) {
                            m6715(arrayList4, 0, obj);
                            arrayList3 = arrayList4;
                        } else if (i2 == 2) {
                            m6715(arrayList4, 0, obj);
                            m6715(arrayList4, 1, obj2);
                            arrayList3 = arrayList4;
                        }
                    }
                    boolean z = this.f9538 == ',';
                    this.f9542 = z;
                    if (z) {
                        mo6733();
                    }
                    this.f9534--;
                    return arrayList3;
                case 'f':
                case 't':
                    objMo6744 = Boolean.valueOf(mo6668());
                    if (i2 == 0) {
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case 'n':
                    mo6762();
                    objMo6744 = null;
                    if (i2 == 0) {
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case '{':
                    objMo6744 = (JSONReader$Feature.SupportAutoType.mask & c3776.f9665) != 0 ? C3537.f8553.mo6023(this, null, null, 0L) : mo6740() ? AbstractC3755.m6938(mo6749()) : mo6754();
                    if (i2 == 0) {
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                default:
                    switch (c) {
                        case '/':
                            mo6795();
                            i2--;
                            continue;
                            i2++;
                            jSONArray2 = jSONArray2;
                            break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        default:
                            C1123.m1410(mo6730(null));
                            return null;
                    }
                    if (i2 == 0) {
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public abstract String mo6686();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public abstract double mo6687();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public abstract long mo6688();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public abstract long mo6689();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public Date mo6690() throws IOException {
        long jM6764;
        if (mo6741()) {
            return new Date(mo6769());
        }
        if (mo6679() || mo6711()) {
            return null;
        }
        if (this.f9538 == 'n') {
            return mo6753();
        }
        if (this.f9525 && mo6696()) {
            mo6704(':');
            jM6764 = mo6769();
            mo6712();
            this.f9525 = false;
        } else {
            if (mo6737()) {
                JSONObject jSONObject = new JSONObject();
                mo6680(jSONObject, 0L);
                Object obj = jSONObject.get("$date");
                if (!(obj instanceof String)) {
                    return AbstractC3700.m6479(jSONObject);
                }
                long jM6455 = AbstractC3699.m6455((String) obj, this.f9546.m6969());
                if (jM6455 == 0) {
                    return null;
                }
                return new Date(jM6455);
            }
            jM6764 = m6764();
        }
        if (jM6764 == 0 && this.f9541) {
            return null;
        }
        return new Date(jM6764);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final Double m6691() {
        if (mo6693()) {
            return null;
        }
        this.f9541 = false;
        double dMo6687 = mo6687();
        if (this.f9541) {
            return null;
        }
        return Double.valueOf(dMo6687);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public boolean mo6692() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public abstract boolean mo6693();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public abstract boolean mo6694(char c, char c2, char c3, char c4);

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public abstract boolean mo6695();

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public abstract boolean mo6696();

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public abstract boolean mo6697(char c, char c2, char c3, char c4, char c5, char c6);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final JSONException m6698() {
        return new JSONException("illegal number, offset " + this.f9539 + ", char " + this.f9538);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public Object mo6699(Type type) {
        C3776 c3776 = this.f9546;
        return ((C3635) c3776.f9663).m6193(type, (c3776.f9665 & JSONReader$Feature.FieldBased.mask) != 0).mo6023(this, null, null, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public Object mo6700(Class cls) {
        C3776 c3776 = this.f9546;
        return ((C3635) c3776.f9663).m6193(cls, (c3776.f9665 & JSONReader$Feature.FieldBased.mask) != 0).mo6023(this, null, null, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public abstract boolean mo6701();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public abstract boolean mo6702();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public boolean mo6703(byte b) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public abstract boolean mo6704(char c);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public abstract boolean mo6705();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public abstract boolean mo6706();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public abstract boolean mo6707();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public abstract boolean mo6708();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final JSONException m6709() {
        return new JSONException(mo6730("not support unquoted name"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public void mo6710() {
        mo6733();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public abstract boolean mo6711();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public abstract boolean mo6712();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m6713(Map map, Object obj, AbstractC3755 abstractC3755) {
        if (this.f9545 == null) {
            this.f9545 = new ArrayList();
        }
        if (map instanceof LinkedHashMap) {
            map.put(obj, null);
        }
        this.f9545.add(new C3733(null, map, obj, abstractC3755));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m6714(Collection collection, int i, AbstractC3755 abstractC3755) {
        if (this.f9545 == null) {
            this.f9545 = new ArrayList();
        }
        this.f9545.add(new C3733(null, collection, Integer.valueOf(i), abstractC3755));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6715(ArrayList arrayList, int i, Object obj) {
        if (!(obj instanceof AbstractC3755)) {
            arrayList.add(obj);
        } else {
            m6714(arrayList, i, (AbstractC3755) obj);
            arrayList.add(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m6716(Class cls) {
        if ((this.f9546.f9665 & 4) == 0 || Serializable.class.isAssignableFrom(cls)) {
            return;
        }
        C1123.m1410("not support none-Serializable, class ".concat(cls.getName()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long m6717(long j) {
        return this.f9546.f9665 | j;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BigDecimal m6718() {
        int[] iArr;
        int i;
        BigDecimal bigDecimal;
        int[] iArr2;
        int[] iArr3;
        int i2;
        if (this.f9541) {
            return null;
        }
        byte b = this.f9529;
        if (b == 1) {
            int i3 = this.f9537;
            if (i3 == 0 && this.f9536 == 0 && (i = this.f9535) >= 0) {
                return BigDecimal.valueOf(this.f9530 ? -i : i);
            }
            int i4 = this.f9526;
            if (i4 != 0) {
                iArr = new int[]{i4, i3, this.f9536, this.f9535};
            } else if (i3 == 0) {
                int i5 = this.f9535;
                long j = ((long) i5) & 4294967295L;
                int i6 = this.f9536;
                long j2 = 4294967295L & ((long) i6);
                if (j2 <= 2147483647L) {
                    long j3 = (j2 << 32) + j;
                    if (this.f9530) {
                        j3 = -j3;
                    }
                    return BigDecimal.valueOf(j3);
                }
                iArr = new int[]{i6, i5};
            } else {
                iArr = new int[]{i3, this.f9536, this.f9535};
            }
            return new BigDecimal((BigInteger) C3777.f9666.apply(Integer.valueOf(this.f9530 ? -1 : 1), iArr));
        }
        if (b != 2) {
            if (b == 3) {
                try {
                    return AbstractC3700.m6473(this.f9533);
                } catch (NumberFormatException e) {
                    C1123.m1403(mo6730("read decimal error, value " + this.f9533), e);
                    return null;
                }
            }
            if (b == 4) {
                return this.f9531 ? BigDecimal.ONE : BigDecimal.ZERO;
            }
            if (b != 6) {
                if (b == 8) {
                    return AbstractC3700.m6473(this.f9533);
                }
                C1123.m1404(this.f9529, "TODO : ");
                return null;
            }
            JSONObject jSONObject = (JSONObject) this.f9532;
            BigDecimal bigDecimal2 = jSONObject.getBigDecimal("value");
            if (bigDecimal2 == null) {
                bigDecimal2 = jSONObject.getBigDecimal("$numberDecimal");
            }
            if (bigDecimal2 != null) {
                return bigDecimal2;
            }
            C1123.m1404(this.f9529, "TODO : ");
            return null;
        }
        if (this.f9528 == 0 && this.f9526 == 0 && this.f9537 == 0) {
            int i7 = this.f9536;
            if (i7 != 0 || (i2 = this.f9535) < 0) {
                long j4 = ((long) this.f9535) & 4294967295L;
                long j5 = ((long) i7) & 4294967295L;
                if (j5 <= 2147483647L) {
                    long j6 = (j5 << 32) + j4;
                    if (this.f9530) {
                        j6 = -j6;
                    }
                    bigDecimal = BigDecimal.valueOf(j6, this.f9527);
                }
            } else {
                if (this.f9530) {
                    i2 = -i2;
                }
                bigDecimal = BigDecimal.valueOf(i2, this.f9527);
            }
        } else {
            bigDecimal = null;
        }
        if (bigDecimal == null) {
            int i8 = this.f9526;
            if (i8 == 0) {
                int i9 = this.f9537;
                if (i9 == 0) {
                    int i10 = this.f9536;
                    if (i10 == 0) {
                        iArr3 = new int[]{this.f9535};
                        bigDecimal = new BigDecimal((BigInteger) C3777.f9666.apply(Integer.valueOf(!this.f9530 ? -1 : 1), iArr3), this.f9527);
                    } else {
                        iArr2 = new int[]{i10, this.f9535};
                    }
                } else {
                    iArr2 = new int[]{i9, this.f9536, this.f9535};
                }
            } else {
                iArr2 = new int[]{i8, this.f9537, this.f9536, this.f9535};
            }
            iArr3 = iArr2;
            bigDecimal = new BigDecimal((BigInteger) C3777.f9666.apply(Integer.valueOf(!this.f9530 ? -1 : 1), iArr3), this.f9527);
        }
        if (this.f9528 == 0) {
            return bigDecimal;
        }
        return AbstractC3700.m6475(Double.parseDouble(bigDecimal.toPlainString() + "E" + ((int) this.f9528)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final JSONException m6719(String str) {
        return new JSONException(mo6730(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m6720() {
        throw new JSONValidException("error, offset " + this.f9539 + ", char " + this.f9538);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final char m6721(int i) {
        if (i != 34 && i != 35) {
            switch (i) {
                case 32:
                case 44:
                case 64:
                case 95:
                case 126:
                    break;
                case 70:
                case 102:
                    return '\f';
                case 98:
                    return '\b';
                case 110:
                    return '\n';
                case 114:
                    return '\r';
                case 116:
                    return '\t';
                case 118:
                    return (char) 11;
                default:
                    switch (i) {
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                            break;
                        default:
                            switch (i) {
                                case 46:
                                case 47:
                                    break;
                                case 48:
                                    return (char) 0;
                                case 49:
                                    return (char) 1;
                                case 50:
                                    return (char) 2;
                                case 51:
                                    return (char) 3;
                                case 52:
                                    return (char) 4;
                                case 53:
                                    return (char) 5;
                                case 54:
                                    return (char) 6;
                                case 55:
                                    return (char) 7;
                                default:
                                    switch (i) {
                                        case 91:
                                        case 92:
                                        case 93:
                                            break;
                                        default:
                                            C1123.m1410(mo6730("unclosed.str '\\" + ((char) i)));
                                            break;
                                    }
                                    return (char) 0;
                            }
                            break;
                    }
                    break;
            }
        }
        return (char) i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m6722(int i) {
        long j = this.f9546.f9665;
        if (i == 39 && (2147483648L & j) != 0) {
            throw m6709();
        }
        if (i == 34 || i == 39) {
            return false;
        }
        if ((j & 131072) == 0) {
            throw m6709();
        }
        mo6688();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final BigDecimal m6723(JSONObject jSONObject) {
        BigDecimal bigDecimal = jSONObject.getBigDecimal("value");
        if (bigDecimal == null) {
            bigDecimal = jSONObject.getBigDecimal("$numberDecimal");
        }
        if (bigDecimal != null) {
            return bigDecimal;
        }
        throw m6719("can not cast to decimal " + jSONObject);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC3621 mo6724(long j, long j2, Class cls) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean mo6725() {
        return this.f9538 == 26;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m6726(JSONReader$Feature jSONReader$Feature) {
        return (jSONReader$Feature.mask & this.f9546.f9665) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public boolean mo6727() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public boolean mo6728() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean mo6729() {
        return this.f9538 == '[';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public String mo6730(String str) {
        if (str == null || str.isEmpty()) {
            return "offset " + this.f9539;
        }
        StringBuilder sbM12143 = AbstractC7012.m12143(str, ", offset ");
        sbM12143.append(this.f9539);
        return sbM12143.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final boolean m6731(long j) {
        return ((this.f9546.f9665 | j) & 64) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean m6732(long j) {
        return ((this.f9546.f9665 | j) & 8) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public abstract void mo6733();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public C1804 mo6734() {
        return new C1804(this.f9539, this.f9538);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final boolean m6735(long j) {
        return ((this.f9546.f9665 | j) & 32) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final boolean m6736() {
        return (this.f9546.f9665 & 8) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public boolean mo6737() {
        return this.f9538 == '{';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean mo6738() {
        char c = this.f9538;
        if (c == '+' || c == '-') {
            return true;
        }
        switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public boolean mo6739() {
        char c = this.f9538;
        return c == '\"' || c == '\'';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public abstract boolean mo6740();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public boolean mo6741() {
        char c = this.f9538;
        if (c == '-' || c == '+') {
            return true;
        }
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m6742(Object obj) {
        ArrayList<C3733> arrayList = this.f9545;
        if (arrayList == null) {
            return;
        }
        Object objMo6508 = null;
        for (C3733 c3733 : arrayList) {
            AbstractC3755 abstractC3755 = c3733.f9547;
            AbstractC3595 abstractC3595 = c3733.f9550;
            abstractC3755.getClass();
            if (!(abstractC3755 instanceof C3751)) {
                if (!abstractC3755.mo6506()) {
                    C3775.m6964(abstractC3755, "reference path invalid : ");
                    return;
                }
                if ((this.f9546.f9665 & JSONReader$Feature.FieldBased.mask) != 0) {
                    C3728 c3728 = new C3728(AbstractC3766.f9639);
                    c3728.f9498 |= JSONWriter$Feature.FieldBased.mask;
                    abstractC3755.f9609 = c3728;
                }
                objMo6508 = abstractC3755.mo6508(obj);
            }
            Object obj2 = c3733.f9548;
            Object obj3 = c3733.f9549;
            if (obj2 != null) {
                if (obj3 instanceof Map) {
                    Map map = (Map) obj3;
                    if (!(obj2 instanceof C3662)) {
                        map.put(obj2, objMo6508);
                    } else if (map instanceof LinkedHashMap) {
                        int size = map.size();
                        if (size != 0) {
                            Object[] objArr = new Object[size];
                            Object[] objArr2 = new Object[size];
                            int i = 0;
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                if (obj2 == key) {
                                    objArr[i] = objMo6508;
                                } else {
                                    objArr[i] = key;
                                }
                                objArr2[i] = entry.getValue();
                                i++;
                            }
                            map.clear();
                            for (int i2 = 0; i2 < size; i2++) {
                                map.put(objArr[i2], objArr2[i2]);
                            }
                        }
                    } else {
                        map.put(objMo6508, map.remove(obj2));
                    }
                } else if (obj2 instanceof Integer) {
                    if (obj3 instanceof List) {
                        int iIntValue = ((Integer) obj2).intValue();
                        List list = (List) obj3;
                        if (iIntValue == list.size()) {
                            list.add(objMo6508);
                        } else if (iIntValue >= list.size() || list.get(iIntValue) != null) {
                            list.add(iIntValue, objMo6508);
                        } else {
                            list.set(iIntValue, objMo6508);
                        }
                    } else if (obj3 instanceof Object[]) {
                        ((Object[]) obj3)[((Integer) obj2).intValue()] = objMo6508;
                    } else if (obj3 instanceof Collection) {
                        ((Collection) obj3).add(objMo6508);
                    }
                }
            }
            abstractC3595.mo6031(obj3, objMo6508);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public byte mo6743() {
        return (byte) -128;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏, reason: contains not printable characters */
    public abstract String mo6744();

    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子, reason: contains not printable characters */
    public String[] mo6745() {
        if (this.f9538 != 'n' || !mo6693()) {
            if (mo6701()) {
                int i = 0;
                String[] strArr = null;
                while (!mo6702()) {
                    if (mo6725()) {
                        C1123.m1410(mo6730("input end"));
                        return null;
                    }
                    if (strArr == null) {
                        strArr = new String[16];
                    } else if (i == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                    }
                    strArr[i] = mo6744();
                    i++;
                }
                if (strArr == null) {
                    strArr = new String[0];
                }
                return strArr.length == i ? strArr : (String[]) Arrays.copyOf(strArr, i);
            }
            char c = this.f9538;
            if (c != '\"' && c != '\'') {
                C1123.m1410(mo6730("not support input"));
                return null;
            }
            String strMo6744 = mo6744();
            if (!strMo6744.isEmpty()) {
                C1123.m1410(mo6730("not support input ".concat(strMo6744)));
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏, reason: contains not printable characters */
    public abstract String mo6746();

    /* JADX INFO: renamed from: 飘花落叶言楪世兰子苏哲, reason: contains not printable characters */
    public abstract OffsetTime mo6747();

    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏哲子, reason: contains not printable characters */
    public boolean mo6748(int i, Collection collection) {
        if (!mo6740()) {
            return false;
        }
        String strMo6749 = mo6749();
        if ("..".equals(strMo6749)) {
            collection.add(collection);
            return true;
        }
        m6714(collection, i, AbstractC3755.m6938(strMo6749));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏子哲, reason: contains not printable characters */
    public abstract String mo6749();

    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰子苏, reason: contains not printable characters */
    public final void m6750(Map map, long j) throws IOException {
        if (map == null) {
            C1123.m1410("object is null");
            return;
        }
        Class<?> cls = map.getClass();
        C3776 c3776 = this.f9546;
        InterfaceC3621 interfaceC3621M6193 = ((C3635) c3776.f9663).m6193(cls, ((c3776.f9665 | j) & JSONReader$Feature.FieldBased.mask) != 0);
        if (!(interfaceC3621M6193 instanceof C3605)) {
            mo6680(map, j);
            return;
        }
        C3605 c3605 = (C3605) interfaceC3621M6193;
        if (mo6693()) {
            mo6705();
            return;
        }
        if (!mo6708()) {
            C1123.m1410(mo6730(null));
            return;
        }
        while (!mo6712()) {
            AbstractC3595 abstractC3595Mo6025 = c3605.mo6025(mo6689());
            if (abstractC3595Mo6025 == null && m6731(c3605.f8792 | j)) {
                abstractC3595Mo6025 = c3605.mo6024(mo6666());
            }
            if (abstractC3595Mo6025 == null) {
                c3605.m6141(this, map);
            } else {
                abstractC3595Mo6025.mo6032(this, map);
            }
        }
        mo6705();
        JSONSchema jSONSchema = c3605.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(map);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子, reason: contains not printable characters */
    public abstract OffsetDateTime mo6751();

    /* JADX INFO: renamed from: 飘花落叶言楪世哲子兰苏, reason: contains not printable characters */
    public Number mo6752() {
        mo6755();
        return m6663();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰, reason: contains not printable characters */
    public abstract Date mo6753();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0189  */
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏兰子, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map mo6754() {
        Object objMo6744;
        Object objPut;
        mo6708();
        int i = this.f9534 + 1;
        this.f9534 = i;
        C3776 c3776 = this.f9546;
        c3776.getClass();
        if (i >= 2048) {
            C1123.m1404(this.f9534, "level too large : ");
            return null;
        }
        Map map = (c3776.f9665 & JSONReader$Feature.UseNativeObject.mask) != 0 ? new HashMap() : new JSONObject();
        int i2 = 0;
        while (true) {
            if (this.f9538 == '/') {
                mo6795();
            }
            if (this.f9538 == '}') {
                mo6733();
                boolean z = this.f9538 == ',';
                this.f9542 = z;
                if (z) {
                    mo6733();
                }
                this.f9534--;
                return map;
            }
            Object objMo6686 = mo6686();
            if (objMo6686 == null) {
                char c = this.f9538;
                if (c == 26) {
                    C1123.m1410("input end");
                    return null;
                }
                if (c == '-' || (c >= '0' && c <= '9')) {
                    mo6755();
                    objMo6686 = m6663();
                } else {
                    objMo6686 = c == '{' ? mo6754() : c == '[' ? mo6685() : m6676();
                }
                mo6704(':');
            }
            if (i2 != 0 || (c3776.f9665 & JSONReader$Feature.ErrorOnNotSupportAutoType.mask) == 0 || !"@type".equals(objMo6686)) {
                char c2 = this.f9538;
                switch (c2) {
                    case '\"':
                    case '\'':
                        objMo6744 = mo6744();
                        if ((objMo6744 != null || (c3776.f9665 & JSONReader$Feature.IgnoreNullPropertyValue.mask) == 0) && (objPut = map.put(objMo6686, objMo6744)) != null && (c3776.f9665 & JSONReader$Feature.DuplicateKeyValueAsArray.mask) != 0) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(objMo6744);
                                map.put(objMo6686, objPut);
                            } else {
                                map.put(objMo6686, JSONArray.m1of(objPut, objMo6744));
                            }
                        }
                        i2++;
                        break;
                    case '+':
                    case '-':
                        mo6755();
                        objMo6744 = m6663();
                        if (objMo6744 != null) {
                            if (objPut instanceof Collection) {
                            }
                        } else if (objPut instanceof Collection) {
                        }
                        i2++;
                        break;
                    case 'I':
                        if (!mo6706()) {
                            C1123.m1410(mo6730("illegal input " + this.f9538));
                            return null;
                        }
                        objMo6744 = Double.valueOf(Double.POSITIVE_INFINITY);
                        if (objMo6744 != null) {
                        }
                        i2++;
                        break;
                        break;
                    case 'S':
                        if (!mo6707()) {
                            C1123.m1410(mo6730("illegal input " + this.f9538));
                            return null;
                        }
                        objMo6744 = mo6700(Set.class);
                        if (objMo6744 != null) {
                        }
                        i2++;
                        break;
                        break;
                    case '[':
                        objMo6744 = mo6685();
                        if (objMo6744 != null) {
                        }
                        i2++;
                        break;
                    case 'f':
                    case 't':
                        objMo6744 = Boolean.valueOf(mo6668());
                        if (objMo6744 != null) {
                        }
                        i2++;
                        break;
                    case 'n':
                        objMo6744 = mo6753();
                        if (objMo6744 != null) {
                        }
                        i2++;
                        break;
                    case '{':
                        if (mo6740()) {
                            m6713(map, objMo6686, AbstractC3755.m6938(mo6749()));
                            objMo6744 = null;
                        } else {
                            objMo6744 = mo6754();
                        }
                        if (objMo6744 != null) {
                        }
                        i2++;
                        break;
                    default:
                        switch (c2) {
                            case '/':
                                mo6795();
                                continue;
                                i2++;
                                break;
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            default:
                                C1123.m1410(mo6730("illegal input " + this.f9538));
                                return null;
                        }
                        if (objMo6744 != null) {
                        }
                        i2++;
                        break;
                }
            } else {
                C1123.m1410(AbstractC0900.m717("autoType not support : ", mo6744()));
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰, reason: contains not printable characters */
    public abstract void mo6755();

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public abstract LocalTime mo6756();

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public abstract LocalTime mo6757();

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏, reason: contains not printable characters */
    public abstract LocalTime mo6758();

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰, reason: contains not printable characters */
    public abstract LocalTime mo6759();

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲, reason: contains not printable characters */
    public abstract LocalTime mo6760();

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
    public abstract LocalTime mo6761();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
    public abstract void mo6762();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲, reason: contains not printable characters */
    public double mo6763() {
        throw new JSONException("not support");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
    public final long m6764() {
        LocalDateTime localDateTimeOf;
        ZonedDateTime zonedDateTimeM6440;
        Function function;
        long j;
        int i;
        this.f9541 = false;
        C3776 c3776 = this.f9546;
        c3776.getClass();
        int iMo6659 = mo6659();
        ZonedDateTime zonedDateTimeOfLocal = null;
        switch (iMo6659) {
            case 8:
                LocalDate localDateMo6788 = mo6788();
                if (localDateMo6788 == null) {
                    C1123.m1401(mo6744(), "TODO : ");
                    return 0L;
                }
                localDateTimeOf = LocalDateTime.of(localDateMo6788, LocalTime.MIN);
                break;
                break;
            case 9:
                LocalDate localDateMo6789 = mo6789();
                localDateTimeOf = localDateMo6789 == null ? null : LocalDateTime.of(localDateMo6789, LocalTime.MIN);
                break;
            case 10:
                LocalDate localDateMo6790 = mo6790();
                if (localDateMo6790 == null) {
                    String strMo6744 = mo6744();
                    if ("0000-00-00".equals(strMo6744)) {
                        this.f9541 = true;
                        return 0L;
                    }
                    if (AbstractC3682.m6248(strMo6744)) {
                        return Long.parseLong(strMo6744);
                    }
                    C1123.m1410("TODO : ".concat(strMo6744));
                    return 0L;
                }
                localDateTimeOf = LocalDateTime.of(localDateMo6790, LocalTime.MIN);
                break;
            case 11:
                LocalDate localDateMo6791 = mo6791();
                localDateTimeOf = localDateMo6791 == null ? null : LocalDateTime.of(localDateMo6791, LocalTime.MIN);
                break;
            case 12:
                localDateTimeOf = mo6780();
                break;
            case 13:
            case 15:
            default:
                localDateTimeOf = null;
                break;
            case 14:
                localDateTimeOf = mo6784();
                break;
            case 16:
                localDateTimeOf = mo6785();
                break;
            case 17:
                localDateTimeOf = mo6782();
                break;
            case 18:
                localDateTimeOf = mo6783();
                break;
            case 19:
                long jMo6765 = mo6765();
                if (jMo6765 != 0 || !this.f9541) {
                    return jMo6765;
                }
                localDateTimeOf = mo6775();
                break;
                break;
            case 20:
                localDateTimeOf = mo6774();
                break;
        }
        if (localDateTimeOf != null) {
            zonedDateTimeOfLocal = ZonedDateTime.ofLocal(localDateTimeOf, c3776.m6969(), null);
        } else if (iMo6659 >= 20) {
            ZonedDateTime zonedDateTimeMo6802 = mo6802(iMo6659);
            if (zonedDateTimeMo6802 != null || iMo6659 < 32 || iMo6659 > 35) {
                zonedDateTimeOfLocal = zonedDateTimeMo6802;
            } else {
                String strMo67442 = mo6744();
                ZoneId zoneId = AbstractC3699.f9372;
                if (strMo67442 != null && strMo67442.length() != 0) {
                    ToIntFunction toIntFunction = AbstractC3687.f9271;
                    if (toIntFunction == null || (function = AbstractC3687.f9272) == null || toIntFunction.applyAsInt(strMo67442) != 0) {
                        char[] cArrM6330 = AbstractC3687.m6330(strMo67442);
                        zonedDateTimeM6440 = AbstractC3699.m6440(cArrM6330, 0, cArrM6330.length, null);
                    } else {
                        byte[] bArr = (byte[]) function.apply(strMo67442);
                        zonedDateTimeM6440 = AbstractC3699.m6441(bArr, 0, bArr.length, null);
                    }
                    if (zonedDateTimeM6440 == null) {
                        switch (strMo67442) {
                            case "0":
                            case "null":
                            case "0000-00-00":
                                break;
                            default:
                                throw new DateTimeParseException(strMo67442, strMo67442, 0);
                        }
                    } else {
                        zonedDateTimeOfLocal = zonedDateTimeM6440;
                    }
                }
            }
        }
        if (zonedDateTimeOfLocal != null) {
            long epochSecond = zonedDateTimeOfLocal.toEpochSecond();
            int nano = zonedDateTimeOfLocal.toLocalTime().getNano();
            if (epochSecond >= 0 || nano <= 0) {
                j = epochSecond * 1000;
                i = nano / 1000000;
            } else {
                j = (epochSecond + 1) * 1000;
                i = (nano / 1000000) - 1000;
            }
            return j + ((long) i);
        }
        String strMo67443 = mo6744();
        if (strMo67443.isEmpty() || "null".equals(strMo67443)) {
            this.f9541 = true;
            return 0L;
        }
        if (!"0000-00-00T00:00:00".equals(strMo67443) && !"0001-01-01T00:00:00+08:00".equals(strMo67443)) {
            if (strMo67443.startsWith("/Date(") && strMo67443.endsWith(")/")) {
                String strM721 = AbstractC0900.m721(2, 6, strMo67443);
                int iIndexOf = strM721.indexOf(43);
                if (iIndexOf == -1) {
                    iIndexOf = strM721.indexOf(45);
                }
                if (iIndexOf != -1) {
                    strM721 = strM721.substring(0, iIndexOf);
                }
                return Long.parseLong(strM721);
            }
            if (AbstractC3682.m6248(strMo67443)) {
                return Long.parseLong(strMo67443);
            }
            C1123.m1410(mo6730("format null not support, input ".concat(strMo67443)));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰, reason: contains not printable characters */
    public abstract long mo6765();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲, reason: contains not printable characters */
    public abstract LocalTime mo6766();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public abstract LocalTime mo6767();

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
    public long[] mo6768() {
        if (!mo6693()) {
            if (mo6701()) {
                long[] jArrCopyOf = new long[8];
                int i = 0;
                while (!mo6702()) {
                    if (mo6725()) {
                        C1123.m1410(mo6730("input end"));
                        return null;
                    }
                    if (i == jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, jArrCopyOf.length << 1);
                    }
                    jArrCopyOf[i] = mo6769();
                    i++;
                }
                return i == jArrCopyOf.length ? jArrCopyOf : Arrays.copyOf(jArrCopyOf, i);
            }
            if (!mo6739()) {
                C1123.m1410(mo6730("TODO"));
                return null;
            }
            String strMo6744 = mo6744();
            if (!strMo6744.isEmpty()) {
                throw m6719("not support input ".concat(strMo6744));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public abstract long mo6769();

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public abstract Long mo6770();

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        if (r10 >= 0) goto L60;
     */
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m6771() {
        mo6755();
        byte b = this.f9529;
        C3776 c3776 = this.f9546;
        switch (b) {
            case 1:
            case 9:
            case 10:
                if (this.f9537 == 0 && this.f9536 == 0) {
                    boolean z = this.f9530;
                    int i = this.f9535;
                    if (z) {
                        if (i != Integer.MIN_VALUE) {
                            if (i >= 0) {
                                return -i;
                            }
                        }
                        return i;
                    }
                }
                Number numberM6663 = m6663();
                if (!(numberM6663 instanceof Long)) {
                    if (!(numberM6663 instanceof BigInteger)) {
                        return numberM6663.intValue();
                    }
                    BigInteger bigInteger = (BigInteger) numberM6663;
                    if ((c3776.f9665 & JSONReader$Feature.NonErrorOnNumberOverflow.mask) != 0) {
                        return bigInteger.intValue();
                    }
                    try {
                        return bigInteger.intValueExact();
                    } catch (ArithmeticException unused) {
                        throw this.m6698();
                    }
                }
                long jLongValue = numberM6663.longValue();
                if (jLongValue >= -2147483648L && jLongValue <= 2147483647L) {
                    return (int) jLongValue;
                }
                C1123.m1410(mo6730("integer overflow " + jLongValue));
                return 0;
            case 2:
                return m6663().intValue();
            case 3:
                String str = this.f9533;
                if (AbstractC3682.m6248(str) || str.lastIndexOf(44) == str.length() - 4) {
                    return AbstractC3700.m6469(str);
                }
                throw m6719("parseInt error, value : ".concat(str));
            case 4:
                return this.f9531 ? 1 : 0;
            case 5:
                if ((c3776.f9665 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C1123.m1410(mo6730("int value not support input null"));
                    return 0;
                }
                return 0;
            case 6:
                Object obj = ((Map) this.f9532).get("val");
                Number number = obj instanceof Number ? (Number) obj : null;
                if (number != null) {
                    return number.intValue();
                }
                return 0;
            case 7:
                return m6798((List) this.f9532);
            case 8:
                try {
                    return m6718().intValueExact();
                } catch (ArithmeticException unused2) {
                    throw this.m6698();
                }
            case 11:
            case 12:
            case 13:
                long jLongValue2 = m6663().longValue();
                if ((jLongValue2 >= -2147483648L && jLongValue2 <= 2147483647L) || (c3776.f9665 & JSONReader$Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return (int) jLongValue2;
                }
                C1123.m1410(mo6730("integer overflow " + jLongValue2));
                return 0;
            default:
                C1123.m1404(this.f9529, "TODO : ");
                return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public abstract int mo6772();

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public abstract Integer mo6773();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
    public abstract LocalDateTime mo6774();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
    public abstract LocalDateTime mo6775();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏, reason: contains not printable characters */
    public abstract LocalTime mo6776();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世, reason: contains not printable characters */
    public abstract LocalTime mo6777();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲, reason: contains not printable characters */
    public abstract LocalDateTime mo6778(int i);

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
    public LocalTime mo6779() {
        if (!mo6693()) {
            boolean zMo6741 = mo6741();
            C3776 c3776 = this.f9546;
            if (zMo6741) {
                return Instant.ofEpochMilli(mo6769()).atZone(c3776.m6969()).toLocalTime();
            }
            switch (mo6659()) {
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
                case 13:
                case 14:
                case 16:
                case 17:
                default:
                    String strMo6744 = mo6744();
                    if (!strMo6744.isEmpty() && !"null".equals(strMo6744)) {
                        if (AbstractC3682.m6248(strMo6744)) {
                            return Instant.ofEpochMilli(Long.parseLong(strMo6744)).atZone(c3776.m6969()).toLocalTime();
                        }
                        C1123.m1410("not support len : ".concat(strMo6744));
                    }
                    break;
                case 15:
                    return mo6760();
                case 18:
                    return mo6759();
                case 19:
                    return mo6775().toLocalTime();
                case 20:
                    return mo6774().toLocalTime();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
    public abstract LocalDateTime mo6780();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.time.LocalDateTime] */
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocalDateTime mo6781() {
        String strMo6744;
        boolean zMo6741 = mo6741();
        C3776 c3776 = this.f9546;
        if (zMo6741) {
            return Instant.ofEpochMilli(mo6769()).atZone(c3776.m6969()).toLocalDateTime();
        }
        if (this.f9525 && mo6696()) {
            mo6704(':');
            LocalDateTime localDateTimeMo6781 = mo6781();
            mo6712();
            this.f9525 = false;
            return localDateTimeMo6781;
        }
        c3776.getClass();
        int iMo6659 = mo6659();
        switch (iMo6659) {
            case 8:
                LocalDate localDateMo6788 = mo6788();
                if (localDateMo6788 != null) {
                    return LocalDateTime.of(localDateMo6788, LocalTime.MIN);
                }
                return null;
            case 9:
                LocalDate localDateMo6789 = mo6789();
                if (localDateMo6789 != null) {
                    return LocalDateTime.of(localDateMo6789, LocalTime.MIN);
                }
                return null;
            case 10:
                LocalDate localDateMo6790 = mo6790();
                if (localDateMo6790 != null) {
                    return LocalDateTime.of(localDateMo6790, LocalTime.MIN);
                }
                return null;
            case 11:
                LocalDate localDateMo6791 = mo6791();
                if (localDateMo6791 != null) {
                    return LocalDateTime.of(localDateMo6791, LocalTime.MIN);
                }
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                strMo6744 = mo6744();
                if (!strMo6744.isEmpty() || "null".equals(strMo6744)) {
                    this.f9541 = true;
                    return null;
                }
                if (AbstractC3682.m6248(strMo6744)) {
                    return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(strMo6744)), c3776.m6969());
                }
                if (!strMo6744.startsWith("/Date(") || !strMo6744.endsWith(")/")) {
                    if ("0000-00-00 00:00:00".equals(strMo6744)) {
                        this.f9541 = true;
                        return null;
                    }
                    C1123.m1410(mo6730("read LocalDateTime error ".concat(strMo6744)));
                    return null;
                }
                String strM721 = AbstractC0900.m721(2, 6, strMo6744);
                int iIndexOf = strM721.indexOf(43);
                if (iIndexOf == -1) {
                    iIndexOf = strM721.indexOf(45);
                }
                if (iIndexOf != -1) {
                    strM721 = strM721.substring(0, iIndexOf);
                }
                return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(strM721)), c3776.m6969());
            case 16:
                return mo6785();
            case 17:
                LocalDateTime localDateTimeMo6782 = mo6782();
                if (localDateTimeMo6782 != null) {
                    return localDateTimeMo6782;
                }
                strMo6744 = mo6744();
                if (strMo6744.isEmpty()) {
                    break;
                }
                this.f9541 = true;
                return null;
            case 18:
                LocalDateTime localDateTimeMo6783 = mo6783();
                if (localDateTimeMo6783 != null) {
                    return localDateTimeMo6783;
                }
                strMo6744 = mo6744();
                if (strMo6744.isEmpty()) {
                }
                this.f9541 = true;
                return null;
            case 19:
                LocalDateTime localDateTimeMo6775 = mo6775();
                if (localDateTimeMo6775 != null) {
                    return localDateTimeMo6775;
                }
                strMo6744 = mo6744();
                if (strMo6744.isEmpty()) {
                }
                this.f9541 = true;
                return null;
            case 20:
                LocalDateTime localDateTimeMo6774 = mo6774();
                if (localDateTimeMo6774 != null) {
                    return localDateTimeMo6774;
                }
                ZonedDateTime zonedDateTimeMo6802 = mo6802(iMo6659);
                if (zonedDateTimeMo6802 != null) {
                    return zonedDateTimeMo6802.toLocalDateTime();
                }
                strMo6744 = mo6744();
                if (strMo6744.isEmpty()) {
                }
                this.f9541 = true;
                return null;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                LocalDateTime localDateTimeMo6778 = mo6778(iMo6659);
                if (localDateTimeMo6778 != null) {
                    return localDateTimeMo6778;
                }
                ZonedDateTime zonedDateTimeMo68022 = mo6802(iMo6659);
                if (zonedDateTimeMo68022 != null) {
                    ZoneId zoneIdM6969 = c3776.m6969();
                    return !zonedDateTimeMo68022.getZone().equals(zoneIdM6969) ? zonedDateTimeMo68022.toInstant().atZone(zoneIdM6969).toLocalDateTime() : zonedDateTimeMo68022.toLocalDateTime();
                }
                strMo6744 = mo6744();
                if (strMo6744.isEmpty()) {
                }
                this.f9541 = true;
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
    public abstract LocalDateTime mo6782();

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
    public abstract LocalDateTime mo6783();

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
    public abstract LocalDateTime mo6784();

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
    public abstract LocalDateTime mo6785();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocalDate mo6786() {
        LocalDateTime localDateTimeMo6775;
        if (!mo6693()) {
            boolean zMo6741 = mo6741();
            C3776 c3776 = this.f9546;
            if (zMo6741) {
                long jMo6769 = mo6769();
                c3776.getClass();
                return Instant.ofEpochMilli(jMo6769).atZone(c3776.m6969()).toLocalDate();
            }
            c3776.getClass();
            int iMo6659 = mo6659();
            if (iMo6659 == 19) {
                localDateTimeMo6775 = mo6775();
            } else if (iMo6659 != 20) {
                switch (iMo6659) {
                    case 8:
                        LocalDate localDateMo6788 = mo6788();
                        localDateTimeMo6775 = localDateMo6788 != null ? LocalDateTime.of(localDateMo6788, LocalTime.MIN) : null;
                        break;
                    case 9:
                        LocalDate localDateMo6789 = mo6789();
                        if (localDateMo6789 != null) {
                            localDateTimeMo6775 = LocalDateTime.of(localDateMo6789, LocalTime.MIN);
                            break;
                        }
                        break;
                    case 10:
                        LocalDate localDateMo6790 = mo6790();
                        if (localDateMo6790 != null) {
                            localDateTimeMo6775 = LocalDateTime.of(localDateMo6790, LocalTime.MIN);
                            break;
                        }
                        break;
                    case 11:
                        LocalDate localDateMo6791 = mo6791();
                        if (localDateMo6791 != null) {
                            localDateTimeMo6775 = LocalDateTime.of(localDateMo6791, LocalTime.MIN);
                            break;
                        }
                        break;
                    default:
                        if (iMo6659 > 20) {
                            localDateTimeMo6775 = mo6778(iMo6659);
                            break;
                        }
                        break;
                }
            } else {
                localDateTimeMo6775 = mo6774();
            }
            if (localDateTimeMo6775 != null) {
                return localDateTimeMo6775.toLocalDate();
            }
            String strMo6744 = mo6744();
            if (!strMo6744.isEmpty() && !"null".equals(strMo6744)) {
                if (AbstractC3682.m6248(strMo6744)) {
                    return Instant.ofEpochMilli(Long.parseLong(strMo6744)).atZone(c3776.m6969()).toLocalDate();
                }
                C1123.m1410("not support input : ".concat(strMo6744));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
    public final long m6787() {
        mo6755();
        byte b = this.f9529;
        C3776 c3776 = this.f9546;
        switch (b) {
            case 1:
            case 9:
            case 10:
                if (this.f9537 == 0 && this.f9536 == 0) {
                    boolean z = this.f9530;
                    int i = this.f9535;
                    if (z) {
                        if (i == Integer.MIN_VALUE) {
                            return i;
                        }
                        if (i >= 0) {
                            return -i;
                        }
                    } else if (i >= 0) {
                        return i;
                    }
                }
                Number numberM6663 = m6663();
                if (!(numberM6663 instanceof BigInteger)) {
                    return numberM6663.longValue();
                }
                BigInteger bigInteger = (BigInteger) numberM6663;
                if ((c3776.f9665 & JSONReader$Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return bigInteger.longValue();
                }
                try {
                    return bigInteger.longValueExact();
                } catch (ArithmeticException unused) {
                    throw m6698();
                }
            case 2:
            case 11:
            case 12:
            case 13:
                return m6663().longValue();
            case 3:
                return m6797(this.f9533);
            case 4:
                return this.f9531 ? 1L : 0L;
            case 5:
                if ((c3776.f9665 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C1123.m1410(mo6730("long value not support input null"));
                    return 0L;
                }
            case 6:
                Map map = (Map) this.f9532;
                if (map.get("val") instanceof Number) {
                    return ((Number) r1).intValue();
                }
                throw m6719("parseLong error, value : " + map);
            case 7:
                return m6798((List) this.f9532);
            case 8:
                try {
                    return m6718().longValueExact();
                } catch (ArithmeticException unused2) {
                    throw m6698();
                }
            default:
                C1123.m1404(this.f9529, "TODO : ");
                return 0L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
    public abstract LocalDate mo6788();

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
    public abstract LocalDate mo6789();

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
    public abstract LocalDate mo6790();

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
    public abstract LocalDate mo6791();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世兰子哲, reason: contains not printable characters */
    public int mo6792() {
        if (mo6701()) {
            return Integer.MAX_VALUE;
        }
        C1123.m1410(mo6730("illegal input, expect '[', but " + this.f9538));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲兰子, reason: contains not printable characters */
    public abstract void mo6793();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰, reason: contains not printable characters */
    public abstract void mo6794();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲, reason: contains not printable characters */
    public abstract void mo6795();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世子哲兰, reason: contains not printable characters */
    public void mo6796(C1804 c1804) {
        this.f9539 = c1804.f3101;
        this.f9538 = (char) c1804.f3100;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲世子兰, reason: contains not printable characters */
    public final long m6797(String str) {
        if (AbstractC3682.m6248(str) || str.lastIndexOf(44) == str.length() - 4) {
            return AbstractC3700.m6465(str);
        }
        if (str.length() > 10 && str.length() < 40) {
            try {
                return AbstractC3699.m6455(str, (ZoneId) this.f9546.f9664);
            } catch (JSONException | NullPointerException | DateTimeException unused) {
            }
        }
        throw this.m6719("parseLong error, value : ".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲子兰世, reason: contains not printable characters */
    public final int m6798(List list) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        throw m6719("parseLong error, field : value " + list);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏子世兰哲, reason: contains not printable characters */
    public long mo6799() {
        return mo6804();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏子世哲兰, reason: contains not printable characters */
    public final String m6800() {
        char c = this.f9538;
        if (c != '+' && c != '-') {
            if (c == '[') {
                List listMo6685 = mo6685();
                if (listMo6685.size() == 1) {
                    Object obj = listMo6685.get(0);
                    if (obj == null) {
                        return null;
                    }
                    if ((this.f9546.f9665 & JSONReader$Feature.DisableStringArrayUnwrapping.mask) == 0 && (obj instanceof String)) {
                        return obj.toString();
                    }
                }
                AbstractC3730 abstractC3730M6617 = AbstractC3730.m6617();
                abstractC3730M6617.m6645(listMo6685);
                abstractC3730M6617.mo6558(listMo6685);
                return abstractC3730M6617.toString();
            }
            if (c != 'f') {
                if (c == 'n') {
                    mo6762();
                    return null;
                }
                if (c != 't') {
                    if (c == '{') {
                        Map mapMo6754 = mo6754();
                        AbstractC3730 abstractC3730M66172 = AbstractC3730.m6617();
                        abstractC3730M66172.m6645(mapMo6754);
                        abstractC3730M66172.mo6556(mapMo6754);
                        return abstractC3730M66172.toString();
                    }
                    switch (c) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        default:
                            C1123.m1410(mo6730("illegal input : " + this.f9538));
                            return null;
                    }
                }
            }
            boolean zMo6668 = mo6668();
            this.f9531 = zMo6668;
            return zMo6668 ? "true" : "false";
        }
        mo6755();
        return m6663().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ZonedDateTime mo6801() {
        LocalDateTime localDateTimeOf;
        boolean zMo6741 = mo6741();
        C3776 c3776 = this.f9546;
        if (zMo6741) {
            long jMo6769 = mo6769();
            c3776.getClass();
            return Instant.ofEpochMilli(jMo6769).atZone(c3776.m6969());
        }
        if (mo6739()) {
            c3776.getClass();
            int iMo6659 = mo6659();
            switch (iMo6659) {
                case 8:
                    LocalDate localDateMo6788 = mo6788();
                    localDateTimeOf = localDateMo6788 == null ? null : LocalDateTime.of(localDateMo6788, LocalTime.MIN);
                    if (localDateTimeOf == null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, c3776.m6969(), null);
                    }
                    String strMo6744 = mo6744();
                    if (!strMo6744.isEmpty() && !"null".equals(strMo6744)) {
                        return AbstractC3682.m6248(strMo6744) ? Instant.ofEpochMilli(Long.parseLong(strMo6744)).atZone(c3776.m6969()) : ZonedDateTime.parse(strMo6744);
                    }
                    break;
                case 9:
                    LocalDate localDateMo6789 = mo6789();
                    if (localDateMo6789 != null) {
                        localDateTimeOf = LocalDateTime.of(localDateMo6789, LocalTime.MIN);
                    }
                    if (localDateTimeOf == null) {
                    }
                    break;
                case 10:
                    LocalDate localDateMo6790 = mo6790();
                    if (localDateMo6790 != null) {
                        localDateTimeOf = LocalDateTime.of(localDateMo6790, LocalTime.MIN);
                    }
                    if (localDateTimeOf == null) {
                    }
                    break;
                case 11:
                    localDateTimeOf = LocalDateTime.of(mo6791(), LocalTime.MIN);
                    if (localDateTimeOf == null) {
                    }
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    ZonedDateTime zonedDateTimeMo6802 = mo6802(iMo6659);
                    if (zonedDateTimeMo6802 != null) {
                        return zonedDateTimeMo6802;
                    }
                    if (localDateTimeOf == null) {
                    }
                    break;
                case 16:
                    localDateTimeOf = mo6785();
                    if (localDateTimeOf == null) {
                    }
                    break;
                case 17:
                    localDateTimeOf = mo6782();
                    if (localDateTimeOf == null) {
                    }
                    break;
                case 18:
                    localDateTimeOf = mo6783();
                    if (localDateTimeOf == null) {
                    }
                    break;
                case 19:
                    localDateTimeOf = mo6775();
                    if (localDateTimeOf == null) {
                    }
                    break;
                case 20:
                    localDateTimeOf = mo6774();
                    if (localDateTimeOf == null) {
                    }
                    break;
            }
        } else if (!mo6693()) {
            C1123.m1402(this.f9538, "TODO : ");
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世, reason: contains not printable characters */
    public abstract ZonedDateTime mo6802(int i);

    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰, reason: contains not printable characters */
    public abstract UUID mo6803();

    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世, reason: contains not printable characters */
    public abstract long mo6804();
}
