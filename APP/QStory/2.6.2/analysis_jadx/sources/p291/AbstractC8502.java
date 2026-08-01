package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2893;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2836;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.C2832;
import com.alibaba.fastjson2.util.C2834;
import com.alibaba.fastjson2.util.C2837;
import com.alibaba.fastjson2.util.C2838;
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
import lin.xposed.hook.javaplugin.C5553;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8502 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f23601 = AtomicReferenceFieldUpdater.newUpdater(AbstractC8502.class, InterfaceC8531.class, "飘花落叶言子世哲苏兰楪");

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public Object f23602;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f23603;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean f23604;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public volatile InterfaceC8531 f23605;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public transient C2893 f23606;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final char[] f23607;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final byte[] f23608;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f23609;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean f23610;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f23611;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Method f23612;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final boolean f23613;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean f23614;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean f23615;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C2893 f23616;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f23617;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final byte[] f23618;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f23619;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f23620;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final DecimalFormat f23621;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Field f23622;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f23623;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Locale f23624;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f23625;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Class f23626;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f23627;

    public AbstractC8502(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method) {
        if ("string".equals(str2) && cls != String.class) {
            j |= JSONWriter$Feature.WriteNonStringValueAsString.mask;
        }
        this.f23627 = str;
        this.f23619 = i;
        this.f23623 = str2;
        this.f23624 = locale;
        this.f23609 = AbstractC2859.m5729(str);
        this.f23620 = j;
        Class cls2 = AbstractC2866.f9049;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType == List.class && actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
                type = AbstractC2866.f9044;
            }
        }
        this.f23625 = type;
        this.f23626 = cls;
        this.f23617 = cls != null && (Serializable.class.isAssignableFrom(cls) || !Modifier.isFinal(cls.getModifiers()));
        this.f23622 = field;
        this.f23612 = method;
        this.f23610 = cls.isPrimitive();
        this.f23618 = InterfaceC2911.m6297(str);
        this.f23621 = (str2 == null || !(cls == Float.TYPE || cls == float[].class || cls == Float.class || cls == Float[].class || cls == Double.TYPE || cls == double[].class || cls == Double.class || cls == Double[].class || cls == BigDecimal.class || cls == BigDecimal[].class)) ? null : new DecimalFormat(str2);
        this.f23611 = field != null ? AbstractC2853.f8919.objectFieldOffset(field) : -1L;
        this.f23615 = "symbol".equals(str2);
        this.f23614 = "trim".equals(str2);
        this.f23613 = (1125899906842624L & j) != 0;
        this.f23604 = (JSONWriter$Feature.ReferenceDetection.mask & j) != 0;
        this.f23603 = (j & 2305843009213693952L) != 0;
        this.f23616 = new C2893(C2893.f9141, str);
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
        this.f23608 = bArr;
        char[] cArr = new char[i2];
        cArr[0] = '\"';
        str.getChars(0, str.length(), cArr, 1);
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
        this.f23607 = cArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC8531 m14057(Type type, Class cls, String str, Locale locale, Class cls2) {
        if (Map.class.isAssignableFrom(cls2)) {
            return cls.isAssignableFrom(cls2) ? C8470.m14003(type, str, cls2) : C8470.m14004(cls2);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? C8481.f23515 : new C8481(str, locale);
        }
        Object obj = null;
        if (ZonedDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? C8460.f23402 : new C8460(str, locale, null);
        }
        if (OffsetDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? C8469.f23433 : new C8469(str, locale);
        }
        int i = 0;
        if (LocalDateTime.class.isAssignableFrom(cls2)) {
            InterfaceC8531 interfaceC8531M14087 = AbstractC2932.f9292.m14087(LocalDateTime.class, LocalDateTime.class, false);
            return (interfaceC8531M14087 == null || interfaceC8531M14087 == C8468.f23432) ? (str == null || str.isEmpty()) ? C8468.f23432 : new C8468(str, locale) : interfaceC8531M14087;
        }
        if (LocalDate.class.isAssignableFrom(cls2)) {
            InterfaceC8531 interfaceC8531M140872 = AbstractC2932.f9292.m14087(LocalDate.class, LocalDate.class, false);
            return (interfaceC8531M140872 == null || interfaceC8531M140872 == C8472.f23456) ? str == null ? C8472.f23456 : new C8472(str, locale) : interfaceC8531M140872;
        }
        if (LocalTime.class.isAssignableFrom(cls2)) {
            InterfaceC8531 interfaceC8531M140873 = AbstractC2932.f9292.m14087(LocalTime.class, LocalTime.class, false);
            return (interfaceC8531M140873 == null || interfaceC8531M140873 == C8467.f23431) ? (str == null || str.isEmpty()) ? C8467.f23431 : new C8467(str, locale) : interfaceC8531M140873;
        }
        if (Instant.class == cls2) {
            return (str == null || str.isEmpty()) ? C8466.f23430 : new C8466(str, locale);
        }
        if (BigDecimal.class == cls2) {
            return (str == null || str.isEmpty()) ? C8494.f23569 : new C8494(new DecimalFormat(str), i, obj);
        }
        if (BigDecimal[].class == cls2) {
            return (str == null || str.isEmpty()) ? new C8527(BigDecimal.class, null) : new C8527(BigDecimal.class, new DecimalFormat(str));
        }
        if (Optional.class == cls2) {
            return str == null ? C8458.f23398 : new C8458(str, locale);
        }
        String name = cls2.getName();
        if (name.equals("org.joda.time.LocalDate")) {
            int i2 = AbstractC2836.f8828;
            return new C2837(cls2, str);
        }
        if (name.equals("java.sql.Date")) {
            return new C8484(str, locale);
        }
        if (name.equals("java.sql.Time")) {
            return str == null ? C2834.f8819 : new C2834(str, null);
        }
        if (name.equals("java.sql.Timestamp")) {
            return new C2832(str, null);
        }
        if (!name.equals("org.joda.time.LocalDateTime")) {
            return null;
        }
        int i3 = AbstractC2836.f8828;
        return new C2838(cls2, str);
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
        throw new UnsupportedOperationException("Method not decompiled: p291.AbstractC8502.compareTo(java.lang.Object):int");
    }

    public final String toString() {
        return this.f23627;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        DecimalFormat decimalFormat = this.f23621;
        return cls == Float[].class ? decimalFormat != null ? new C8527(Float.class, decimalFormat) : C8527.f23699 : cls == Double[].class ? decimalFormat != null ? new C8527(Double.class, decimalFormat) : C8527.f23700 : cls == BigDecimal[].class ? decimalFormat != null ? new C8527(BigDecimal.class, decimalFormat) : C8527.f23701 : abstractC2896.m6031(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Class mo13991() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8531 mo13983() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo13981() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo13976(Object obj) {
        String str = this.f23627;
        if (obj == null) {
            C2941.m6346(str, "field.get error, ");
            return null;
        }
        Field field = this.f23622;
        if (field == null) {
            C5553.m10825();
            return null;
        }
        try {
            long j = this.f23611;
            return (j == -1 || this.f23610) ? field.get(obj) : AbstractC2853.f8919.getObject(obj, j);
        } catch (IllegalAccessException e) {
            e = e;
            C7546.m12746("field.get error, ", str, e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7546.m12746("field.get error, ", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m14058(AbstractC2896 abstractC2896) {
        long jM6032 = abstractC2896.m6032(this.f23620);
        long j = JSONWriter$Feature.WriteNulls.mask;
        JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.NullAsDefaultValue;
        long j2 = j | jSONWriter$Feature.mask;
        JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.WriteNullNumberAsZero;
        if (((j2 | jSONWriter$Feature2.mask) & jM6032) == 0) {
            return false;
        }
        m14059(abstractC2896);
        if ((jSONWriter$Feature.mask & jM6032) != 0) {
            abstractC2896.mo5938(0.0f);
            return true;
        }
        if ((jM6032 & jSONWriter$Feature2.mask) != 0) {
            abstractC2896.mo5928(0);
            return true;
        }
        abstractC2896.mo5922();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14059(AbstractC2896 abstractC2896) {
        if (abstractC2896.f9169) {
            abstractC2896.mo5988(this.f23609, this.f23618);
            return;
        }
        if (!abstractC2896.f9168 && (abstractC2896.f9176.f9151 & JSONWriter$Feature.UnquoteFieldName.mask) == 0) {
            if (abstractC2896.f9174) {
                abstractC2896.mo5929(this.f23608);
                return;
            } else if (abstractC2896.f9175) {
                abstractC2896.mo5921(this.f23607);
                return;
            }
        }
        abstractC2896.mo5986(this.f23627);
        abstractC2896.mo5934();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m14060(AbstractC2896 abstractC2896) {
        long j = abstractC2896.f9176.f9151 | this.f23620;
        long j2 = JSONWriter$Feature.WriteNulls.mask;
        JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.NullAsDefaultValue;
        long j3 = j2 | jSONWriter$Feature.mask;
        JSONWriter$Feature jSONWriter$Feature2 = JSONWriter$Feature.WriteNullNumberAsZero;
        if (((j3 | jSONWriter$Feature2.mask) & j) == 0) {
            return false;
        }
        m14059(abstractC2896);
        if ((j & (jSONWriter$Feature2.mask | jSONWriter$Feature.mask)) != 0) {
            abstractC2896.mo5928(0);
            return true;
        }
        abstractC2896.mo5922();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract void mo13979(AbstractC2896 abstractC2896, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo13985() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14061(AbstractC2896 abstractC2896, long j) {
        long j2;
        if (abstractC2896.f9169) {
            abstractC2896.mo5987(j);
            return;
        }
        C2894 c2894 = abstractC2896.f9176;
        if (((AbstractC8510) this).f23634) {
            abstractC2896.mo5918(j);
            return;
        }
        ZoneId zoneIdM5980 = c2894.m5980();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        long epochSecond = instantOfEpochMilli.getEpochSecond() + ((long) zoneIdM5980.getRules().getOffset(instantOfEpochMilli).getTotalSeconds());
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
        abstractC2896.mo5932(iCheckValidIntValue, i3, i4, i5, i6, (int) (j8 - ((long) (i6 * 60))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract boolean mo13980(AbstractC2896 abstractC2896, Object obj);
}
