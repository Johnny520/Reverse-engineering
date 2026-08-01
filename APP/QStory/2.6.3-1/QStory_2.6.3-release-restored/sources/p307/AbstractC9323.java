package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3727;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3670;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3666;
import com.alibaba.fastjson2.util.C3668;
import com.alibaba.fastjson2.util.C3671;
import com.alibaba.fastjson2.util.C3672;
import com.android.p002dx.p005io.Opcodes;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Function;
import lin.xposed.hook.javaplugin.C6385;
import p160.C8376;
import p295.InterfaceC9196;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9323 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f23937 = AtomicReferenceFieldUpdater.newUpdater(AbstractC9323.class, InterfaceC9352.class, "飘花落叶言子世哲苏兰楪");

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public Object f23938;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f23939;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean f23940;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public volatile InterfaceC9352 f23941;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public transient C3727 f23942;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final char[] f23943;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final byte[] f23944;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f23945;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean f23946;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f23947;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Method f23948;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final boolean f23949;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean f23950;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean f23951;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C3727 f23952;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f23953;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final byte[] f23954;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f23955;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f23956;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final DecimalFormat f23957;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Field f23958;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f23959;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Locale f23960;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f23961;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Class f23962;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f23963;

    public AbstractC9323(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method) {
        if ("string".equals(str2) && cls != String.class) {
            j |= JSONWriter$Feature.WriteNonStringValueAsString.mask;
        }
        this.f23963 = str;
        this.f23955 = i;
        this.f23959 = str2;
        this.f23960 = locale;
        this.f23945 = AbstractC3693.m6334(str);
        this.f23956 = j;
        Class cls2 = AbstractC3700.f9396;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType == List.class && actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
                type = AbstractC3700.f9391;
            }
        }
        this.f23961 = type;
        this.f23962 = cls;
        this.f23953 = cls != null && (Serializable.class.isAssignableFrom(cls) || !Modifier.isFinal(cls.getModifiers()));
        this.f23958 = field;
        this.f23948 = method;
        this.f23946 = cls.isPrimitive();
        this.f23954 = InterfaceC3745.m6915(str);
        this.f23957 = (str2 == null || !(cls == Float.TYPE || cls == float[].class || cls == Float.class || cls == Float[].class || cls == Double.TYPE || cls == double[].class || cls == Double.class || cls == Double[].class || cls == BigDecimal.class || cls == BigDecimal[].class)) ? null : new DecimalFormat(str2);
        this.f23947 = field != null ? AbstractC3687.f9266.objectFieldOffset(field) : -1L;
        this.f23951 = "symbol".equals(str2);
        this.f23950 = "trim".equals(str2);
        this.f23949 = (1125899906842624L & j) != 0;
        this.f23940 = (JSONWriter$Feature.ReferenceDetection.mask & j) != 0;
        this.f23939 = (j & 2305843009213693952L) != 0;
        this.f23952 = new C3727(C3727.f9488, str);
        int length = str.length();
        int i2 = length + 3;
        int i3 = i2;
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < 1 || cCharAt > 127) {
                i3 = cCharAt > 2047 ? i3 + 2 : i3 + 1;
            }
        }
        byte[] bArr = new byte[i3];
        bArr[0] = 34;
        int i5 = 1;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                bArr[i5] = (byte) cCharAt2;
                i5++;
            } else if (cCharAt2 > 2047) {
                bArr[i5] = (byte) (((cCharAt2 >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i5 += 3;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                int i8 = i5 + 1;
                bArr[i5] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i5 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            }
        }
        bArr[i5] = 34;
        bArr[i5 + 1] = 58;
        this.f23944 = bArr;
        char[] cArr = new char[i2];
        cArr[0] = '\"';
        str.getChars(0, str.length(), cArr, 1);
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
        this.f23943 = cArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC9352 m14635(Type type, Class cls, String str, Locale locale, Class cls2) {
        if (Map.class.isAssignableFrom(cls2)) {
            return cls.isAssignableFrom(cls2) ? C9291.m14581(type, str, cls2) : C9291.m14582(cls2);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? C9302.f23851 : new C9302(str, locale);
        }
        Object obj = null;
        if (ZonedDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? C9281.f23738 : new C9281(str, locale, null);
        }
        if (OffsetDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? C9290.f23769 : new C9290(str, locale);
        }
        int i = 0;
        if (LocalDateTime.class.isAssignableFrom(cls2)) {
            InterfaceC9352 interfaceC9352M14665 = AbstractC3766.f9639.m14665(LocalDateTime.class, LocalDateTime.class, false);
            return (interfaceC9352M14665 == null || interfaceC9352M14665 == C9289.f23768) ? (str == null || str.isEmpty()) ? C9289.f23768 : new C9289(str, locale) : interfaceC9352M14665;
        }
        if (LocalDate.class.isAssignableFrom(cls2)) {
            InterfaceC9352 interfaceC9352M146652 = AbstractC3766.f9639.m14665(LocalDate.class, LocalDate.class, false);
            return (interfaceC9352M146652 == null || interfaceC9352M146652 == C9293.f23792) ? str == null ? C9293.f23792 : new C9293(str, locale) : interfaceC9352M146652;
        }
        if (LocalTime.class.isAssignableFrom(cls2)) {
            InterfaceC9352 interfaceC9352M146653 = AbstractC3766.f9639.m14665(LocalTime.class, LocalTime.class, false);
            return (interfaceC9352M146653 == null || interfaceC9352M146653 == C9288.f23767) ? (str == null || str.isEmpty()) ? C9288.f23767 : new C9288(str, locale) : interfaceC9352M146653;
        }
        if (Instant.class == cls2) {
            return (str == null || str.isEmpty()) ? C9287.f23766 : new C9287(str, locale);
        }
        if (BigDecimal.class == cls2) {
            return (str == null || str.isEmpty()) ? C9315.f23905 : new C9315(new DecimalFormat(str), i, obj);
        }
        if (BigDecimal[].class == cls2) {
            return (str == null || str.isEmpty()) ? new C9348(BigDecimal.class, null) : new C9348(BigDecimal.class, new DecimalFormat(str));
        }
        if (Optional.class == cls2) {
            return str == null ? C9279.f23734 : new C9279(str, locale);
        }
        String name = cls2.getName();
        if (name.equals("org.joda.time.LocalDate")) {
            int i2 = AbstractC3670.f9175;
            return new C3671(cls2, str);
        }
        if (name.equals("java.sql.Date")) {
            return new C9305(str, locale);
        }
        if (name.equals("java.sql.Time")) {
            return str == null ? C3668.f9166 : new C3668(str, null);
        }
        if (name.equals("java.sql.Timestamp")) {
            return new C3666(str, null);
        }
        if (!name.equals("org.joda.time.LocalDateTime")) {
            return null;
        }
        int i3 = AbstractC3670.f9175;
        return new C3672(cls2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        int i;
        AbstractC9323 abstractC9323 = (AbstractC9323) obj;
        int i2 = abstractC9323.f23955;
        Field field = abstractC9323.f23958;
        String str = abstractC9323.f23963;
        Method method = abstractC9323.f23948;
        int i3 = this.f23955;
        if (i3 < i2) {
            return -1;
        }
        if (i3 > i2) {
            return 1;
        }
        String str2 = this.f23963;
        int iCompareTo = str2.compareTo(str);
        if (iCompareTo == 0) {
            Field field2 = this.f23958;
            Method method2 = this.f23948;
            Member member = field2;
            if (method2 != null) {
                if (field2 != null) {
                    boolean zIsPublic = Modifier.isPublic(field2.getModifiers());
                    member = field2;
                    if (!zIsPublic) {
                        member = method2;
                    }
                }
            }
            if (method != null && (field == 0 || !Modifier.isPublic(field.getModifiers()))) {
                field = method;
            }
            if (member != null && field != 0) {
                Class<?> declaringClass = field.getDeclaringClass();
                Class<?> declaringClass2 = member.getDeclaringClass();
                if (declaringClass2 != declaringClass) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        return 1;
                    }
                    if (declaringClass.isAssignableFrom(declaringClass2)) {
                        return -1;
                    }
                }
                InterfaceC9196 interfaceC9196 = member instanceof Field ? (InterfaceC9196) ((Field) member).getAnnotation(InterfaceC9196.class) : member instanceof Method ? (InterfaceC9196) ((Method) member).getAnnotation(InterfaceC9196.class) : null;
                InterfaceC9196 interfaceC91962 = field instanceof Field ? (InterfaceC9196) field.getAnnotation(InterfaceC9196.class) : member instanceof Method ? (InterfaceC9196) ((Method) field).getAnnotation(InterfaceC9196.class) : null;
                if (interfaceC9196 != null && interfaceC91962 == null) {
                    return -1;
                }
                if (interfaceC9196 == null && interfaceC91962 != null) {
                    return 1;
                }
            }
            if ((member instanceof Field) && (field instanceof Method) && ((Field) member).getType() == ((Method) field).getReturnType()) {
                return -1;
            }
            boolean z = member instanceof Method;
            if (z && (field instanceof Field) && ((Method) member).getReturnType() == field.getType()) {
                return 1;
            }
            Class cls = abstractC9323.f23962;
            Class<?> cls2 = this.f23962;
            if (cls2 != cls && cls2 != null && cls != null) {
                if (cls2.isAssignableFrom(cls)) {
                    return 1;
                }
                if (cls.isAssignableFrom(cls2)) {
                    return -1;
                }
            }
            Class cls3 = Boolean.TYPE;
            if (cls2 == cls3 && cls != cls3) {
                return 1;
            }
            if (cls2 == Boolean.class && cls == Boolean.class && z && (field instanceof Method)) {
                String name = ((Method) member).getName();
                String name2 = ((Method) field).getName();
                i = -1;
                if (name.startsWith("is") && name2.startsWith("get")) {
                    return 1;
                }
                if (name.startsWith("get") && name2.startsWith("is")) {
                    return -1;
                }
            } else {
                i = -1;
            }
            if (z && (field instanceof Method)) {
                String name3 = ((Method) member).getName();
                String name4 = ((Method) field).getName();
                if (!name3.equals(name4)) {
                    String strM6365 = AbstractC3698.m6365(name3, null);
                    String strM63652 = AbstractC3698.m6365(name4, null);
                    if (str2.equals(strM6365) && !str.equals(strM63652)) {
                        return 1;
                    }
                    if (str2.equals(strM63652) && !str.equals(strM6365)) {
                        return i;
                    }
                }
            }
            if (cls2.isPrimitive() && !cls.isPrimitive()) {
                return i;
            }
            if (!cls2.isPrimitive() && cls.isPrimitive()) {
                return 1;
            }
            if (cls2.getName().startsWith("java.") && !cls.getName().startsWith("java.")) {
                return i;
            }
            if (!cls2.getName().startsWith("java.") && cls.getName().startsWith("java.")) {
                return 1;
            }
            if (method2 != null && method == null) {
                return i;
            }
            if (method2 == null && method != null) {
                return 1;
            }
        }
        return iCompareTo;
    }

    public final String toString() {
        return this.f23963;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        DecimalFormat decimalFormat = this.f23957;
        return cls == Float[].class ? decimalFormat != null ? new C9348(Float.class, decimalFormat) : C9348.f24035 : cls == Double[].class ? decimalFormat != null ? new C9348(Double.class, decimalFormat) : C9348.f24036 : cls == BigDecimal[].class ? decimalFormat != null ? new C9348(BigDecimal.class, decimalFormat) : C9348.f24037 : abstractC3730.m6637(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Class mo14569() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC9352 mo14561() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo14559() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo14554(Object obj) {
        String str = this.f23963;
        if (obj == null) {
            C3775.m6964(str, "field.get error, ");
            return null;
        }
        Field field = this.f23958;
        if (field == null) {
            C6385.m11441();
            return null;
        }
        try {
            long j = this.f23947;
            return (j == -1 || this.f23946) ? field.get(obj) : AbstractC3687.f9266.getObject(obj, j);
        } catch (IllegalAccessException e) {
            e = e;
            C8376.m13334("field.get error, ", str, e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C8376.m13334("field.get error, ", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m14636(AbstractC3730 abstractC3730) {
        long jM6638 = abstractC3730.m6638(this.f23956);
        long j = JSONWriter$Feature.WriteNulls.mask;
        JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.NullAsDefaultValue;
        long j2 = j | jSONWriter$Feature.mask;
        JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.WriteNullNumberAsZero;
        if (((j2 | jSONWriter$Feature2.mask) & jM6638) == 0) {
            return false;
        }
        m14637(abstractC3730);
        if ((jSONWriter$Feature.mask & jM6638) != 0) {
            abstractC3730.mo6543(0.0f);
            return true;
        }
        if ((jM6638 & jSONWriter$Feature2.mask) != 0) {
            abstractC3730.mo6533(0);
            return true;
        }
        abstractC3730.mo6527();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14637(AbstractC3730 abstractC3730) {
        if (abstractC3730.f9516) {
            abstractC3730.mo6593(this.f23945, this.f23954);
            return;
        }
        if (!abstractC3730.f9515 && (abstractC3730.f9523.f9498 & JSONWriter$Feature.UnquoteFieldName.mask) == 0) {
            if (abstractC3730.f9521) {
                abstractC3730.mo6534(this.f23944);
                return;
            } else if (abstractC3730.f9522) {
                abstractC3730.mo6526(this.f23943);
                return;
            }
        }
        abstractC3730.mo6591(this.f23963);
        abstractC3730.mo6539();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m14638(AbstractC3730 abstractC3730) {
        long j = abstractC3730.f9523.f9498 | this.f23956;
        long j2 = JSONWriter$Feature.WriteNulls.mask;
        JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.NullAsDefaultValue;
        long j3 = j2 | jSONWriter$Feature.mask;
        JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.WriteNullNumberAsZero;
        if (((j3 | jSONWriter$Feature2.mask) & j) == 0) {
            return false;
        }
        m14637(abstractC3730);
        if ((j & (jSONWriter$Feature2.mask | jSONWriter$Feature.mask)) != 0) {
            abstractC3730.mo6533(0);
            return true;
        }
        abstractC3730.mo6527();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract void mo14557(AbstractC3730 abstractC3730, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo14563() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14639(AbstractC3730 abstractC3730, long j) {
        long j2;
        if (abstractC3730.f9516) {
            abstractC3730.mo6592(j);
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        if (((AbstractC9331) this).f23970) {
            abstractC3730.mo6523(j);
            return;
        }
        ZoneId zoneIdM6585 = c3728.m6585();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        long epochSecond = instantOfEpochMilli.getEpochSecond() + ((long) zoneIdM6585.getRules().getOffset(instantOfEpochMilli).getTotalSeconds());
        long jFloorDiv = Math.floorDiv(epochSecond, 86400L);
        int iFloorMod = (int) Math.floorMod(epochSecond, 86400L);
        long j3 = 719468 + jFloorDiv;
        if (j3 < 0) {
            long j4 = ((jFloorDiv + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        int iCheckValidIntValue = ChronoField.YEAR.checkValidIntValue(j5 + j2 + ((long) (i2 / 10)));
        long j7 = iFloorMod;
        ChronoField.SECOND_OF_DAY.checkValidValue(j7);
        int i5 = (int) (j7 / 3600);
        long j8 = j7 - ((long) (i5 * 3600));
        int i6 = (int) (j8 / 60);
        abstractC3730.mo6537(iCheckValidIntValue, i3, i4, i5, i6, (int) (j8 - ((long) (i6 * 60))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract boolean mo14558(AbstractC3730 abstractC3730, Object obj);
}
