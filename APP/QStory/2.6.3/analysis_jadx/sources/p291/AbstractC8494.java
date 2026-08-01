package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2837;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import com.alibaba.fastjson2.util.C2833;
import com.alibaba.fastjson2.util.C2835;
import com.alibaba.fastjson2.util.C2838;
import com.alibaba.fastjson2.util.C2839;
import com.android.dx.io.Opcodes;
import java.io.Serializable;
import java.lang.reflect.Field;
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
import lin.xposed.hook.javaplugin.C5554;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8494 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f23592 = AtomicReferenceFieldUpdater.newUpdater(AbstractC8494.class, InterfaceC8523.class, "飘花落叶言子世哲苏兰楪");

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public Object f23593;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f23594;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean f23595;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public volatile InterfaceC8523 f23596;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public transient C2894 f23597;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final char[] f23598;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final byte[] f23599;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f23600;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean f23601;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f23602;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Method f23603;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final boolean f23604;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean f23605;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean f23606;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C2894 f23607;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f23608;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final byte[] f23609;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f23610;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f23611;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final DecimalFormat f23612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Field f23613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f23614;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Locale f23615;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f23616;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Class f23617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f23618;

    public AbstractC8494(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method) {
        if ("string".equals(str2) && cls != String.class) {
            j |= JSONWriter$Feature.WriteNonStringValueAsString.mask;
        }
        this.f23618 = str;
        this.f23610 = i;
        this.f23614 = str2;
        this.f23615 = locale;
        this.f23600 = AbstractC2860.m5774(str);
        this.f23611 = j;
        Class cls2 = AbstractC2867.f9051;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType == List.class && actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
                type = AbstractC2867.f9046;
            }
        }
        this.f23616 = type;
        this.f23617 = cls;
        this.f23608 = cls != null && (Serializable.class.isAssignableFrom(cls) || !Modifier.isFinal(cls.getModifiers()));
        this.f23613 = field;
        this.f23603 = method;
        this.f23601 = cls.isPrimitive();
        this.f23609 = InterfaceC2912.m6355(str);
        this.f23612 = (str2 == null || !(cls == Float.TYPE || cls == float[].class || cls == Float.class || cls == Float[].class || cls == Double.TYPE || cls == double[].class || cls == Double.class || cls == Double[].class || cls == BigDecimal.class || cls == BigDecimal[].class)) ? null : new DecimalFormat(str2);
        this.f23602 = field != null ? AbstractC2854.f8921.objectFieldOffset(field) : -1L;
        this.f23606 = "symbol".equals(str2);
        this.f23605 = "trim".equals(str2);
        this.f23604 = (1125899906842624L & j) != 0;
        this.f23595 = (JSONWriter$Feature.ReferenceDetection.mask & j) != 0;
        this.f23594 = (j & 2305843009213693952L) != 0;
        this.f23607 = new C2894(C2894.f9143, str);
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
        this.f23599 = bArr;
        char[] cArr = new char[i2];
        cArr[0] = '\"';
        str.getChars(0, str.length(), cArr, 1);
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
        this.f23598 = cArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC8523 m14076(Type type, Class cls, String str, Locale locale, Class cls2) {
        if (Map.class.isAssignableFrom(cls2)) {
            return cls.isAssignableFrom(cls2) ? C8462.m14022(type, str, cls2) : C8462.m14023(cls2);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? C8473.f23506 : new C8473(str, locale);
        }
        Object obj = null;
        if (ZonedDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? C8452.f23393 : new C8452(str, locale, null);
        }
        if (OffsetDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? C8461.f23424 : new C8461(str, locale);
        }
        int i = 0;
        if (LocalDateTime.class.isAssignableFrom(cls2)) {
            InterfaceC8523 interfaceC8523M14106 = AbstractC2933.f9294.m14106(LocalDateTime.class, LocalDateTime.class, false);
            return (interfaceC8523M14106 == null || interfaceC8523M14106 == C8460.f23423) ? (str == null || str.isEmpty()) ? C8460.f23423 : new C8460(str, locale) : interfaceC8523M14106;
        }
        if (LocalDate.class.isAssignableFrom(cls2)) {
            InterfaceC8523 interfaceC8523M141062 = AbstractC2933.f9294.m14106(LocalDate.class, LocalDate.class, false);
            return (interfaceC8523M141062 == null || interfaceC8523M141062 == C8464.f23447) ? str == null ? C8464.f23447 : new C8464(str, locale) : interfaceC8523M141062;
        }
        if (LocalTime.class.isAssignableFrom(cls2)) {
            InterfaceC8523 interfaceC8523M141063 = AbstractC2933.f9294.m14106(LocalTime.class, LocalTime.class, false);
            return (interfaceC8523M141063 == null || interfaceC8523M141063 == C8459.f23422) ? (str == null || str.isEmpty()) ? C8459.f23422 : new C8459(str, locale) : interfaceC8523M141063;
        }
        if (Instant.class == cls2) {
            return (str == null || str.isEmpty()) ? C8458.f23421 : new C8458(str, locale);
        }
        if (BigDecimal.class == cls2) {
            return (str == null || str.isEmpty()) ? C8486.f23560 : new C8486(new DecimalFormat(str), i, obj);
        }
        if (BigDecimal[].class == cls2) {
            return (str == null || str.isEmpty()) ? new C8519(BigDecimal.class, null) : new C8519(BigDecimal.class, new DecimalFormat(str));
        }
        if (Optional.class == cls2) {
            return str == null ? C8450.f23389 : new C8450(str, locale);
        }
        String name = cls2.getName();
        if (name.equals("org.joda.time.LocalDate")) {
            int i2 = AbstractC2837.f8830;
            return new C2838(cls2, str);
        }
        if (name.equals("java.sql.Date")) {
            return new C8476(str, locale);
        }
        if (name.equals("java.sql.Time")) {
            return str == null ? C2835.f8821 : new C2835(str, null);
        }
        if (name.equals("java.sql.Timestamp")) {
            return new C2833(str, null);
        }
        if (!name.equals("org.joda.time.LocalDateTime")) {
            return null;
        }
        int i3 = AbstractC2837.f8830;
        return new C2839(cls2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.AbstractC8494.compareTo(java.lang.Object):int");
    }

    public final String toString() {
        return this.f23618;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC8523 mo13994(AbstractC2897 abstractC2897, Class cls) {
        DecimalFormat decimalFormat = this.f23612;
        return cls == Float[].class ? decimalFormat != null ? new C8519(Float.class, decimalFormat) : C8519.f23690 : cls == Double[].class ? decimalFormat != null ? new C8519(Double.class, decimalFormat) : C8519.f23691 : cls == BigDecimal[].class ? decimalFormat != null ? new C8519(BigDecimal.class, decimalFormat) : C8519.f23692 : abstractC2897.m6077(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Class mo14010() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8523 mo14002() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo14000() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo13995(Object obj) {
        String str = this.f23618;
        if (obj == null) {
            C2942.m6404(str, "field.get error, ");
            return null;
        }
        Field field = this.f23613;
        if (field == null) {
            C5554.m10882();
            return null;
        }
        try {
            long j = this.f23602;
            return (j == -1 || this.f23601) ? field.get(obj) : AbstractC2854.f8921.getObject(obj, j);
        } catch (IllegalAccessException e) {
            e = e;
            C7547.m12775("field.get error, ", str, e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7547.m12775("field.get error, ", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m14077(AbstractC2897 abstractC2897) {
        long jM6078 = abstractC2897.m6078(this.f23611);
        long j = JSONWriter$Feature.WriteNulls.mask;
        JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.NullAsDefaultValue;
        long j2 = j | jSONWriter$Feature.mask;
        JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.WriteNullNumberAsZero;
        if (((j2 | jSONWriter$Feature2.mask) & jM6078) == 0) {
            return false;
        }
        m14078(abstractC2897);
        if ((jSONWriter$Feature.mask & jM6078) != 0) {
            abstractC2897.mo5983(0.0f);
            return true;
        }
        if ((jM6078 & jSONWriter$Feature2.mask) != 0) {
            abstractC2897.mo5973(0);
            return true;
        }
        abstractC2897.mo5967();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14078(AbstractC2897 abstractC2897) {
        if (abstractC2897.f9171) {
            abstractC2897.mo6033(this.f23600, this.f23609);
            return;
        }
        if (!abstractC2897.f9170 && (abstractC2897.f9178.f9153 & JSONWriter$Feature.UnquoteFieldName.mask) == 0) {
            if (abstractC2897.f9176) {
                abstractC2897.mo5974(this.f23599);
                return;
            } else if (abstractC2897.f9177) {
                abstractC2897.mo5966(this.f23598);
                return;
            }
        }
        abstractC2897.mo6031(this.f23618);
        abstractC2897.mo5979();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m14079(AbstractC2897 abstractC2897) {
        long j = abstractC2897.f9178.f9153 | this.f23611;
        long j2 = JSONWriter$Feature.WriteNulls.mask;
        JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.NullAsDefaultValue;
        long j3 = j2 | jSONWriter$Feature.mask;
        JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.WriteNullNumberAsZero;
        if (((j3 | jSONWriter$Feature2.mask) & j) == 0) {
            return false;
        }
        m14078(abstractC2897);
        if ((j & (jSONWriter$Feature2.mask | jSONWriter$Feature.mask)) != 0) {
            abstractC2897.mo5973(0);
            return true;
        }
        abstractC2897.mo5967();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract void mo13998(AbstractC2897 abstractC2897, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo14004() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14080(AbstractC2897 abstractC2897, long j) {
        long j2;
        if (abstractC2897.f9171) {
            abstractC2897.mo6032(j);
            return;
        }
        C2895 c2895 = abstractC2897.f9178;
        if (((AbstractC8502) this).f23625) {
            abstractC2897.mo5963(j);
            return;
        }
        ZoneId zoneIdM6025 = c2895.m6025();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        long epochSecond = instantOfEpochMilli.getEpochSecond() + ((long) zoneIdM6025.getRules().getOffset(instantOfEpochMilli).getTotalSeconds());
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
        abstractC2897.mo5977(iCheckValidIntValue, i3, i4, i5, i6, (int) (j8 - ((long) (i6 * 60))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract boolean mo13999(AbstractC2897 abstractC2897, Object obj);
}
