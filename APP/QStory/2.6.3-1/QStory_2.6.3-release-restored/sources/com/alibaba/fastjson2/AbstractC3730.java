package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.io.Closeable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p025.AbstractC7012;
import p307.AbstractC9323;
import p307.C9368;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3730 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final /* synthetic */ int f9506 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final byte f9509;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public String f9510;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C3727 f9511;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public IdentityHashMap f9512;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public Object f9513;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f9514;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f9515;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f9516;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f9517;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f9518;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final char f9519;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f9520;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f9521;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f9522;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3728 f9523;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final long f9508 = JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final long f9507 = (JSONWriter$Feature.ReferenceDetection.mask | JSONWriter$Feature.NotWriteEmptyArray.mask) | JSONWriter$Feature.NotWriteDefaultValue.mask;

    public AbstractC3730(C3728 c3728, boolean z, Charset charset) {
        this.f9523 = c3728;
        this.f9516 = z;
        this.f9521 = !z && charset == StandardCharsets.UTF_8;
        this.f9522 = !z && charset == StandardCharsets.UTF_16;
        boolean z2 = (z || (c3728.f9498 & JSONWriter$Feature.UseSingleQuotes.mask) == 0) ? false : true;
        this.f9515 = z2;
        this.f9519 = z2 ? '\'' : '\"';
        long j = c3728.f9498;
        this.f9520 = (JSONWriter$Feature.LargeObject.mask & j) != 0 ? 1073741824 : 67108864;
        if ((JSONWriter$Feature.PrettyFormatWith4Space.mask & j) != 0) {
            this.f9509 = (byte) 4;
            return;
        }
        if ((JSONWriter$Feature.PrettyFormatWith2Space.mask & j) != 0) {
            this.f9509 = (byte) 2;
        } else if ((j & JSONWriter$Feature.PrettyFormat.mask) != 0) {
            this.f9509 = (byte) 1;
        } else {
            this.f9509 = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m6611(BigInteger bigInteger, long j) {
        if ((256 & j) != 0) {
            return true;
        }
        if ((j & 32) != 0) {
            return bigInteger.compareTo(AbstractC3700.f9390) < 0 || bigInteger.compareTo(AbstractC3700.f9389) > 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m6612(BigDecimal bigDecimal, long j) {
        if ((256 & j) != 0) {
            return true;
        }
        if ((j & 32) != 0) {
            Class cls = AbstractC3700.f9396;
            if (bigDecimal.precision() >= 16) {
                BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
                boolean z = bigIntegerUnscaledValue.compareTo(AbstractC3700.f9390) >= 0 && bigIntegerUnscaledValue.compareTo(AbstractC3700.f9389) <= 0;
                if (!z && bigDecimal.scale() != 0) {
                    z = bigDecimal.compareTo(BigDecimal.valueOf(bigDecimal.doubleValue())) == 0;
                }
                if (!z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m6613(long j, long j2) {
        if ((17179869440L & j2) != 0) {
            return true;
        }
        if ((j2 & 32) == 0) {
            return false;
        }
        Class cls = AbstractC3700.f9396;
        return j < -9007199254740991L || j > 9007199254740991L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static IllegalArgumentException m6614(int i) {
        return new IllegalArgumentException(AbstractC7012.m12147(i, "Only 4 digits numbers are supported. Provided: "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static AbstractC3730 m6615(JSONWriter$Feature... jSONWriter$FeatureArr) {
        String str = AbstractC3766.f9634;
        C3728 c3728 = new C3728(AbstractC3766.f9639, jSONWriter$FeatureArr);
        return AbstractC3687.f9263 == 8 ? (AbstractC3687.f9262 == null || AbstractC3687.f9274 || AbstractC3687.f9277) ? new C3726(c3728) : new C3742(c3728) : (c3728.f9498 & JSONWriter$Feature.OptimizedForAscii.mask) != 0 ? new C3739(c3728) : (AbstractC3687.f9262 == null || AbstractC3687.f9271 == null || AbstractC3687.f9272 == null) ? new C3725(c3728) : new C3743(c3728);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static AbstractC3730 m6616(C3728 c3728) {
        return AbstractC3687.f9263 == 8 ? (AbstractC3687.f9262 == null || AbstractC3687.f9274 || AbstractC3687.f9277) ? new C3726(c3728) : new C3742(c3728) : (c3728.f9498 & JSONWriter$Feature.OptimizedForAscii.mask) != 0 ? new C3739(c3728) : (AbstractC3687.f9262 == null || AbstractC3687.f9271 == null || AbstractC3687.f9272 == null) ? new C3725(c3728) : new C3743(c3728);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static AbstractC3730 m6617() {
        C3728 c3728 = new C3728(AbstractC3766.f9639);
        if (AbstractC3687.f9263 == 8) {
            return (AbstractC3687.f9262 == null || AbstractC3687.f9274 || AbstractC3687.f9277) ? new C3726(c3728) : new C3742(c3728);
        }
        long j = JSONWriter$Feature.OptimizedForAscii.mask;
        return 0 != 0 ? new C3739(c3728) : (AbstractC3687.f9262 == null || AbstractC3687.f9271 == null || AbstractC3687.f9272 == null) ? new C3725(c3728) : new C3743(c3728);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m6618(Object obj, Type type, long j) {
        Class<?> cls;
        long j2 = j | this.f9523.f9498;
        if ((JSONWriter$Feature.WriteClassName.mask & j2) == 0 || obj == null) {
            return false;
        }
        Class<?> cls2 = obj.getClass();
        if (type instanceof Class) {
            cls = (Class) type;
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            cls = rawType instanceof Class ? (Class) rawType : null;
        }
        if (cls2 == cls) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0) {
            if (cls2 == HashMap.class) {
                if (cls == null || cls == Object.class || cls == Map.class || cls == AbstractMap.class) {
                    return false;
                }
            } else if (cls2 == ArrayList.class) {
                return false;
            }
        }
        return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9513;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if ((r2.isArray() ? r2.getComponentType().equals(r10) : false) != false) goto L41;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m6619(Object obj, Type type) {
        Class<?> cls;
        long j = this.f9523.f9498;
        if ((JSONWriter$Feature.WriteClassName.mask & j) != 0 && obj != null) {
            Class<?> cls2 = obj.getClass();
            if (type instanceof Class) {
                cls = (Class) type;
            } else {
                if (type instanceof GenericArrayType) {
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    if (genericComponentType instanceof ParameterizedType) {
                        genericComponentType = ((ParameterizedType) genericComponentType).getRawType();
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    if (rawType instanceof Class) {
                        cls = (Class) rawType;
                    }
                }
                cls = null;
            }
            if (cls2 != cls && (((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j) == 0 || (cls2 != HashMap.class && cls2 != ArrayList.class)) && ((j & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9513))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean m6620(Object obj, long j) {
        Class<?> cls;
        long j2 = j | this.f9523.f9498;
        if ((JSONWriter$Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j2) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9513;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean m6621(Object obj) {
        Class<?> cls;
        long j = this.f9523.f9498;
        if ((JSONWriter$Feature.WriteClassName.mask & j) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j) == 0 || obj == null || !((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return (j & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9513;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean m6622(Class cls, Object obj) {
        Class<?> cls2;
        long j = this.f9523.f9498;
        if ((JSONWriter$Feature.WriteClassName.mask & j) == 0 || obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j) == 0 || !(cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return (j & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9513;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean m6623(long j, Class cls, Object obj) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.f9523.f9498;
        if ((JSONWriter$Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0) {
            if (cls2 == HashMap.class) {
                if (cls == null || cls == Object.class || cls == Map.class || cls == AbstractMap.class) {
                    return false;
                }
            } else if (cls2 == ArrayList.class) {
                return false;
            }
        }
        return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9513;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean m6624(long j, Class cls, Object obj) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.f9523.f9498;
        if ((JSONWriter$Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((JSONWriter$Feature.NotWriteHashMapArrayListClassName.mask & j2) == 0 || cls2 != HashMap.class) {
            return (j2 & JSONWriter$Feature.NotWriteRootClassName.mask) == 0 || obj != this.f9513;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public abstract void mo6520(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪 */
    public abstract void mo6521(LocalDate localDate);

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏 */
    public abstract void mo6522(Long l);

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    public abstract void mo6523(long j);

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪 */
    public abstract void mo6524(byte b);

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲 */
    public abstract void mo6525(long[] jArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void m6625() {
        if ((this.f9523.f9498 & 16777280) != 0) {
            mo6533(0);
        } else {
            mo6527();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public final void m6626(Class cls) {
        if ((this.f9523.f9498 & 64) == 0) {
            mo6527();
        } else if (cls == Character.class) {
            mo6577("\u0000");
        } else {
            mo6571('{', '}');
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏 */
    public abstract void mo6526(char[] cArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世 */
    public abstract void mo6527();

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪 */
    public abstract void mo6528(OffsetTime offsetTime);

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public abstract void mo6529(OffsetDateTime offsetDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏 */
    public abstract void mo6530(short s);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public void mo6589(Instant instant) {
        if (instant == null) {
            mo6527();
        } else {
            mo6577(DateTimeFormatter.ISO_INSTANT.format(instant));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏 */
    public abstract void mo6531(Integer num);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世 */
    public abstract void mo6532(int[] iArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲 */
    public void mo6590(short[] sArr) {
        if (sArr == null) {
            mo6599();
            return;
        }
        mo6559();
        for (int i = 0; i < sArr.length; i++) {
            if (i != 0) {
                mo6542();
            }
            mo6530(sArr[i]);
        }
        mo6555();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世 */
    public abstract void mo6533(int i);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪 */
    public void mo6591(String str) {
        boolean z = false;
        if (this.f9517) {
            this.f9517 = false;
        } else {
            mo6542();
        }
        boolean z2 = (this.f9523.f9498 & JSONWriter$Feature.UnquoteFieldName.mask) != 0;
        if (!z2 || (str.indexOf(this.f9519) < 0 && str.indexOf(92) < 0)) {
            z = z2;
        }
        if (z) {
            mo6569(str);
        } else {
            mo6577(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public void mo6592(long j) {
        mo6523(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    public abstract void mo6534(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世 */
    public void mo6593(long j, byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲 */
    public abstract void mo6535(LocalDateTime localDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世 */
    public abstract void mo6536(LocalTime localTime);

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public abstract void mo6537(int i, int i2, int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public abstract void mo6538(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public abstract void mo6539();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public abstract void mo6540(char c);

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public abstract void mo6541(int i, int i2, int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public abstract void mo6542();

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public abstract void mo6543(float f);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m6627(float f, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.f9516) {
            mo6543(f);
        } else if (Float.isNaN(f) || Float.isInfinite(f)) {
            mo6527();
        } else {
            mo6569(decimalFormat.format(f));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public abstract void mo6544(double[] dArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public void mo6594(Enum r7) {
        if (r7 == null) {
            mo6527();
            return;
        }
        long j = this.f9523.f9498;
        if ((JSONWriter$Feature.WriteEnumUsingToString.mask & j) != 0) {
            mo6577(r7.toString());
        } else if ((j & JSONWriter$Feature.WriteEnumsUsingName.mask) != 0) {
            mo6577(r7.name());
        } else {
            mo6533(r7.ordinal());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪 */
    public abstract void mo6545(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public abstract void mo6546(float[] fArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public abstract void mo6547(BigInteger bigInteger, long j);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public abstract void mo6548(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public void mo6595(boolean[] zArr) {
        if (zArr == null) {
            mo6599();
            return;
        }
        mo6559();
        for (int i = 0; i < zArr.length; i++) {
            if (i != 0) {
                mo6542();
            }
            mo6549(zArr[i]);
        }
        mo6555();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final void m6628() {
        if ((this.f9523.f9498 & (JSONWriter$Feature.WriteNullBooleanAsFalse.mask | 64)) != 0) {
            mo6549(false);
        } else {
            mo6527();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public void mo6596(byte[] bArr) {
        if (bArr == null) {
            mo6599();
            return;
        }
        if ((this.f9523.f9498 & JSONWriter$Feature.WriteByteArrayAsBase64.mask) != 0) {
            mo6548(bArr);
            return;
        }
        mo6559();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                mo6542();
            }
            mo6533(bArr[i]);
        }
        mo6555();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public abstract void mo6549(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final void m6629() {
        long j = this.f9523.f9498;
        if ((64 & j) != 0) {
            mo6551(0.0d);
        } else if ((j & 16777216) != 0) {
            mo6533(0);
        } else {
            mo6527();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public abstract void mo6550(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final void m6630(double d, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.f9516) {
            mo6551(d);
        } else if (Double.isNaN(d) || Double.isInfinite(d)) {
            mo6527();
        } else {
            mo6569(decimalFormat.format(d));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public abstract void mo6551(double d);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract void mo6552(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public abstract void mo6553(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo6554();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo6555();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6631(JSONWriter$Feature jSONWriter$Feature, boolean z) {
        C3728 c3728 = this.f9523;
        long j = c3728.f9498;
        if (z) {
            c3728.f9498 = jSONWriter$Feature.mask | j;
        } else {
            c3728.f9498 = (~jSONWriter$Feature.mask) & j;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m6632() {
        long j = this.f9523.f9498;
        return (JSONWriter$Feature.ReferenceDetection.mask & j) != 0 && (j & 144115188075855872L) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m6633(Object obj) {
        long j = this.f9523.f9498;
        return ((JSONWriter$Feature.ReferenceDetection.mask & j) == 0 || (j & 144115188075855872L) != 0 || obj == null || C9368.m14664(obj.getClass())) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m6634(long j) {
        return (this.f9523.f9498 & j) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m6635() {
        return (this.f9523.f9498 & JSONWriter$Feature.IgnoreErrorGetter.mask) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m6636(JSONWriter$Feature jSONWriter$Feature) {
        return (jSONWriter$Feature.mask & this.f9523.f9498) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC9352 m6637(Class cls) {
        C3728 c3728 = this.f9523;
        return c3728.f9499.m14665(cls, cls, (c3728.f9498 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m6638(long j) {
        return this.f9523.f9498 | j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m6639() {
        return (this.f9523.f9498 & JSONWriter$Feature.BeanToArray.mask) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC9352 m6640(Class cls, Type type) {
        C3728 c3728 = this.f9523;
        return c3728.f9499.m14665(type, cls, (c3728.f9498 & JSONWriter$Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final String m6641(int i, Object obj) {
        if (m6633(obj)) {
            return m6646(i, obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m6642(Object obj) {
        C3727 c3727 = this.f9511;
        if (c3727 == null || (this.f9523.f9498 & 131072) == 0 || obj == Collections.EMPTY_LIST || obj == Collections.EMPTY_SET) {
            return;
        }
        this.f9511 = c3727.f9494;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m6643(Object obj) {
        if (m6633(obj)) {
            m6642(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void m6644() {
        throw new JSONException("level too large : " + this.f9518);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public void mo6597(Object obj) {
        if (obj == null) {
            mo6527();
        } else {
            Class<?> cls = obj.getClass();
            this.f9523.m6586(cls, cls).mo6239(this, obj, null, null, 0L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public void mo6556(Map map) {
        if (map == null) {
            mo6527();
            return;
        }
        if (map.isEmpty()) {
            mo6571('{', '}');
            return;
        }
        C3728 c3728 = this.f9523;
        if ((c3728.f9498 & f9507) != 0) {
            c3728.m6587(map.getClass()).mo6239(this, map, null, null, 0L);
            return;
        }
        mo6557();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (c3728.f9498 & JSONWriter$Feature.WriteMapNullValue.mask) != 0) {
                if (!z) {
                    mo6542();
                }
                Object key = entry.getKey();
                if (key instanceof String) {
                    mo6577((String) key);
                } else {
                    mo6597(key);
                }
                mo6539();
                if (value == null) {
                    mo6527();
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == String.class) {
                        mo6577((String) value);
                    } else if (cls == Integer.class) {
                        mo6531((Integer) value);
                    } else if (cls == Long.class) {
                        mo6522((Long) value);
                    } else if (cls == Boolean.class) {
                        mo6549(((Boolean) value).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        mo6550((BigDecimal) value, 0L, null);
                    } else if (cls == JSONArray.class) {
                        mo6558((JSONArray) value);
                    } else if (cls == JSONObject.class) {
                        mo6556((JSONObject) value);
                    } else {
                        c3728.m6586(cls, cls).mo6239(this, value, null, null, 0L);
                    }
                }
                z = false;
            }
        }
        mo6554();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public void mo6598(long j) {
        mo6569((j & 4194368) != 0 ? "[]" : "null");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public void mo6599() {
        mo6598(this.f9523.f9498);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public abstract void mo6557();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public abstract void mo6558(List list);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void m6645(Object obj) {
        this.f9513 = obj;
        this.f9511 = C3727.f9488;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final String m6646(int i, Object obj) {
        C3727 c3727;
        C3727 c37272;
        C3727 c37273;
        C3727 c37274 = this.f9511;
        if (c37274 == null) {
            return null;
        }
        if (i == 0) {
            c3727 = c37274.f9490;
            if (c3727 == null) {
                c3727 = new C3727(c37274, i);
                c37274.f9490 = c3727;
            }
        } else if (i == 1) {
            c3727 = c37274.f9489;
            if (c3727 == null) {
                c3727 = new C3727(c37274, i);
                c37274.f9489 = c3727;
            }
        } else {
            c3727 = new C3727(c37274, i);
        }
        this.f9511 = c3727;
        if (obj == this.f9513) {
            c37273 = C3727.f9488;
        } else {
            IdentityHashMap identityHashMap = this.f9512;
            if (identityHashMap == null || (c37272 = (C3727) identityHashMap.get(obj)) == null) {
                if (this.f9512 == null) {
                    this.f9512 = new IdentityHashMap(8);
                }
                this.f9512.put(obj, this.f9511);
                return null;
            }
            c37273 = c37272;
        }
        return c37273.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public void mo6600(int i) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public abstract void mo6559();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final String m6647(Object obj, String str) {
        C3727 c3727;
        C3727 c37272;
        if (!m6633(obj)) {
            return null;
        }
        this.f9511 = new C3727(this.f9511, str);
        if (obj == this.f9513) {
            c37272 = C3727.f9488;
        } else {
            IdentityHashMap identityHashMap = this.f9512;
            if (identityHashMap == null || (c3727 = (C3727) identityHashMap.get(obj)) == null) {
                if (this.f9512 == null) {
                    this.f9512 = new IdentityHashMap(8);
                }
                this.f9512.put(obj, this.f9511);
                return null;
            }
            c37272 = c3727;
        }
        return c37272.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final String m6648(AbstractC9323 abstractC9323, Object obj) {
        C3727 c3727;
        IdentityHashMap identityHashMap;
        if (!m6633(obj)) {
            return null;
        }
        C3727 c37272 = this.f9511;
        C3727 c37273 = C3727.f9488;
        if (c37272 == c37273) {
            c3727 = abstractC9323.f23952;
        } else {
            String str = abstractC9323.f23963;
            C3727 c37274 = abstractC9323.f23942;
            if (c37274 == null) {
                c37274 = new C3727(c37272, str);
                abstractC9323.f23942 = c37274;
            } else if (c37274.f9494 != c37272) {
                c3727 = new C3727(c37272, str);
            }
            c3727 = c37274;
        }
        this.f9511 = c3727;
        if (obj == this.f9513 || ((identityHashMap = this.f9512) != null && (c37273 = (C3727) identityHashMap.get(obj)) != null)) {
            return c37273.toString();
        }
        if (this.f9512 == null) {
            this.f9512 = new IdentityHashMap(8);
        }
        this.f9512.put(obj, this.f9511);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final int m6649(int i, int i2) {
        int i3 = i2 + (i2 >> 1);
        if (i3 - i < 0) {
            i3 = i;
        }
        int i4 = this.f9520;
        if (i3 <= i4) {
            return i3;
        }
        if (i < i4) {
            return i4;
        }
        throw new JSONLargeObjectException(AbstractC7012.m12150(i, i4, "Maximum array size exceeded. Try enabling LargeObject feature instead. Requested size: ", ", max size: "));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public abstract void mo6561(ZonedDateTime zonedDateTime);

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    public abstract void mo6562(UUID uuid);

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲 */
    public void mo6602(String str) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰 */
    public void mo6603(long j, byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏 */
    public abstract void mo6568(byte[] bArr);

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public abstract void mo6569(String str);

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏 */
    public void mo6570(int i, char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰 */
    public void mo6571(char c, char c2) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public abstract void mo6572(char c);

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public void mo6605(byte b) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏 */
    public void mo6606(short[] sArr) {
        if (sArr == null) {
            mo6599();
            return;
        }
        mo6559();
        for (int i = 0; i < sArr.length; i++) {
            if (i != 0) {
                mo6542();
            }
            mo6578(sArr[i]);
        }
        mo6555();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public void mo6573(String[] strArr) {
        if (strArr == null) {
            mo6599();
            return;
        }
        mo6559();
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                mo6542();
            }
            mo6577(strArr[i]);
        }
        mo6555();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏 */
    public void mo6607(String str) {
        mo6577(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    public abstract void mo6574(int i, int i2, int i3);

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public abstract void mo6575(int i, char[] cArr);

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世 */
    public void mo6608() {
        long j = this.f9523.f9498;
        mo6569((8388672 & j) != 0 ? (j & 1048576) != 0 ? "''" : "\"\"" : "null");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public void mo6576(List list) {
        mo6559();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                mo6542();
            }
            mo6577((String) list.get(i));
        }
        mo6555();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public abstract void mo6577(String str);

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏 */
    public void mo6609(byte[] bArr) {
        mo6559();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                mo6542();
            }
            mo6583(bArr[i]);
        }
        mo6555();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世 */
    public void mo6610(long[] jArr) {
        if (jArr == null) {
            mo6599();
            return;
        }
        mo6559();
        for (int i = 0; i < jArr.length; i++) {
            if (i != 0) {
                mo6542();
            }
            mo6582(jArr[i]);
        }
        mo6555();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public abstract void mo6578(short s);

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public abstract void mo6579(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
    public final boolean m6650(int i, Object obj) {
        String strM6641 = m6641(i, obj);
        if (strM6641 == null) {
            return false;
        }
        mo6580(strM6641);
        m6643(obj);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰 */
    public abstract void mo6580(String str);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public abstract void mo6581(int i, char[] cArr);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public abstract void mo6582(long j);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public abstract void mo6583(byte b);

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public abstract void mo6584(int i);
}
