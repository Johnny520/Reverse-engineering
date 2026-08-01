package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2896;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p278.AbstractC8363;
import p291.InterfaceC8531;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2838 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f8834;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ToIntFunction f8835;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Method f8836;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ToIntFunction f8837;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Function f8838;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ToIntFunction f8839;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ToIntFunction f8840;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Method f8841;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Method f8842;

    public C2838(Class cls, String str) {
        super(str, null);
        try {
            Class<?> clsLoadClass = cls.getClassLoader().loadClass("org.joda.time.chrono.ISOChronology");
            this.f8834 = clsLoadClass.getMethod("withUTC", null).invoke(clsLoadClass.getMethod("getInstance", null).invoke(null, null), null);
            this.f8841 = cls.getMethod("getYear", null);
            this.f8842 = cls.getMethod("getMonthOfYear", null);
            this.f8836 = cls.getMethod("getDayOfMonth", null);
            this.f8835 = AbstractC8575.m14125(cls.getMethod("getHourOfDay", null));
            this.f8839 = AbstractC8575.m14125(cls.getMethod("getMinuteOfHour", null));
            this.f8840 = AbstractC8575.m14125(cls.getMethod("getSecondOfMinute", null));
            this.f8837 = AbstractC8575.m14125(cls.getMethod("getMillisOfSecond", null));
            this.f8838 = AbstractC8575.m14120(cls.getMethod("getChronology", null));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            C0276.m842("create LocalDateWriter error", e);
            throw null;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        try {
            int iIntValue = ((Integer) this.f8841.invoke(obj, null)).intValue();
            int iIntValue2 = ((Integer) this.f8842.invoke(obj, null)).intValue();
            int iIntValue3 = ((Integer) this.f8836.invoke(obj, null)).intValue();
            int iApplyAsInt = this.f8835.applyAsInt(obj);
            int iApplyAsInt2 = this.f8839.applyAsInt(obj);
            int iApplyAsInt3 = this.f8840.applyAsInt(obj);
            int iApplyAsInt4 = this.f8837.applyAsInt(obj);
            Object objApply = this.f8838.apply(obj);
            if (abstractC2896.m6043(obj, type, j)) {
                abstractC2896.mo5997(AbstractC2866.m5898(obj.getClass()));
            }
            if (objApply != this.f8834 && objApply != null) {
                abstractC2896.mo5952();
                abstractC2896.mo5986("year");
                abstractC2896.mo5928(iIntValue);
                abstractC2896.mo5986("month");
                abstractC2896.mo5928(iIntValue2);
                abstractC2896.mo5986("day");
                abstractC2896.mo5928(iIntValue3);
                abstractC2896.mo5986("hour");
                abstractC2896.mo5928(iApplyAsInt);
                abstractC2896.mo5986("minute");
                abstractC2896.mo5928(iApplyAsInt2);
                abstractC2896.mo5986("second");
                abstractC2896.mo5928(iApplyAsInt3);
                abstractC2896.mo5986("millis");
                abstractC2896.mo5928(iApplyAsInt4);
                abstractC2896.mo5986("chronology");
                abstractC2896.mo5992(objApply);
                abstractC2896.mo5949();
                return;
            }
            abstractC2896.mo5930(LocalDateTime.of(iIntValue, iIntValue2, iIntValue3, iApplyAsInt, iApplyAsInt2, iApplyAsInt3, iApplyAsInt4 * 1000000));
        } catch (IllegalAccessException | InvocationTargetException e) {
            C0276.m842("write LocalDateWriter error", e);
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        try {
            DateTimeFormatter dateTimeFormatter = null;
            int iIntValue = ((Integer) this.f8841.invoke(obj, null)).intValue();
            int iIntValue2 = ((Integer) this.f8842.invoke(obj, null)).intValue();
            int iIntValue3 = ((Integer) this.f8836.invoke(obj, null)).intValue();
            int iApplyAsInt = this.f8835.applyAsInt(obj);
            int iApplyAsInt2 = this.f8839.applyAsInt(obj);
            int iApplyAsInt3 = this.f8840.applyAsInt(obj);
            int iApplyAsInt4 = this.f8837.applyAsInt(obj);
            Object objApply = this.f8838.apply(obj);
            if (abstractC2896.m6043(obj, type, j)) {
                abstractC2896.mo5997(AbstractC2866.m5898(obj.getClass()));
            }
            if (objApply != this.f8834 && objApply != null) {
                abstractC2896.mo5952();
                abstractC2896.mo5986("year");
                abstractC2896.mo5928(iIntValue);
                abstractC2896.mo5986("month");
                abstractC2896.mo5928(iIntValue2);
                abstractC2896.mo5986("day");
                abstractC2896.mo5928(iIntValue3);
                abstractC2896.mo5986("hour");
                abstractC2896.mo5928(iApplyAsInt);
                abstractC2896.mo5986("minute");
                abstractC2896.mo5928(iApplyAsInt2);
                abstractC2896.mo5986("second");
                abstractC2896.mo5928(iApplyAsInt3);
                abstractC2896.mo5986("millis");
                abstractC2896.mo5928(iApplyAsInt4);
                abstractC2896.mo5986("chronology");
                abstractC2896.mo5992(objApply);
                abstractC2896.mo5949();
                return;
            }
            LocalDateTime localDateTimeOf = LocalDateTime.of(iIntValue, iIntValue2, iIntValue3, iApplyAsInt, iApplyAsInt2, iApplyAsInt3, iApplyAsInt4 * 1000000);
            DateTimeFormatter dateTimeFormatterM13852 = m13852();
            if (dateTimeFormatterM13852 != null) {
                dateTimeFormatter = dateTimeFormatterM13852;
            }
            if (dateTimeFormatter == null) {
                abstractC2896.mo5930(localDateTimeOf);
            } else {
                abstractC2896.mo5972(dateTimeFormatter.format(localDateTimeOf));
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            C0276.m842("write LocalDateWriter error", e);
        }
    }
}
