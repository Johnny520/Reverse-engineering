package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2897;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p278.AbstractC8364;
import p291.InterfaceC8523;
import p293.AbstractC8567;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2839 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f8836;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ToIntFunction f8837;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Method f8838;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ToIntFunction f8839;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Function f8840;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ToIntFunction f8841;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ToIntFunction f8842;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Method f8843;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Method f8844;

    public C2839(Class cls, String str) {
        super(str, null);
        try {
            Class<?> clsLoadClass = cls.getClassLoader().loadClass("org.joda.time.chrono.ISOChronology");
            this.f8836 = clsLoadClass.getMethod("withUTC", null).invoke(clsLoadClass.getMethod("getInstance", null).invoke(null, null), null);
            this.f8843 = cls.getMethod("getYear", null);
            this.f8844 = cls.getMethod("getMonthOfYear", null);
            this.f8838 = cls.getMethod("getDayOfMonth", null);
            this.f8837 = AbstractC8567.m14144(cls.getMethod("getHourOfDay", null));
            this.f8841 = AbstractC8567.m14144(cls.getMethod("getMinuteOfHour", null));
            this.f8842 = AbstractC8567.m14144(cls.getMethod("getSecondOfMinute", null));
            this.f8839 = AbstractC8567.m14144(cls.getMethod("getMillisOfSecond", null));
            this.f8840 = AbstractC8567.m14139(cls.getMethod("getChronology", null));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            C0276.m843("create LocalDateWriter error", e);
            throw null;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        try {
            int iIntValue = ((Integer) this.f8843.invoke(obj, null)).intValue();
            int iIntValue2 = ((Integer) this.f8844.invoke(obj, null)).intValue();
            int iIntValue3 = ((Integer) this.f8838.invoke(obj, null)).intValue();
            int iApplyAsInt = this.f8837.applyAsInt(obj);
            int iApplyAsInt2 = this.f8841.applyAsInt(obj);
            int iApplyAsInt3 = this.f8842.applyAsInt(obj);
            int iApplyAsInt4 = this.f8839.applyAsInt(obj);
            Object objApply = this.f8840.apply(obj);
            if (abstractC2897.m6058(obj, type, j)) {
                abstractC2897.mo6042(AbstractC2867.m5943(obj.getClass()));
            }
            if (objApply != this.f8836 && objApply != null) {
                abstractC2897.mo5997();
                abstractC2897.mo6031("year");
                abstractC2897.mo5973(iIntValue);
                abstractC2897.mo6031("month");
                abstractC2897.mo5973(iIntValue2);
                abstractC2897.mo6031("day");
                abstractC2897.mo5973(iIntValue3);
                abstractC2897.mo6031("hour");
                abstractC2897.mo5973(iApplyAsInt);
                abstractC2897.mo6031("minute");
                abstractC2897.mo5973(iApplyAsInt2);
                abstractC2897.mo6031("second");
                abstractC2897.mo5973(iApplyAsInt3);
                abstractC2897.mo6031("millis");
                abstractC2897.mo5973(iApplyAsInt4);
                abstractC2897.mo6031("chronology");
                abstractC2897.mo6037(objApply);
                abstractC2897.mo5994();
                return;
            }
            abstractC2897.mo5975(LocalDateTime.of(iIntValue, iIntValue2, iIntValue3, iApplyAsInt, iApplyAsInt2, iApplyAsInt3, iApplyAsInt4 * 1000000));
        } catch (IllegalAccessException | InvocationTargetException e) {
            C0276.m843("write LocalDateWriter error", e);
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        try {
            DateTimeFormatter dateTimeFormatter = null;
            int iIntValue = ((Integer) this.f8843.invoke(obj, null)).intValue();
            int iIntValue2 = ((Integer) this.f8844.invoke(obj, null)).intValue();
            int iIntValue3 = ((Integer) this.f8838.invoke(obj, null)).intValue();
            int iApplyAsInt = this.f8837.applyAsInt(obj);
            int iApplyAsInt2 = this.f8841.applyAsInt(obj);
            int iApplyAsInt3 = this.f8842.applyAsInt(obj);
            int iApplyAsInt4 = this.f8839.applyAsInt(obj);
            Object objApply = this.f8840.apply(obj);
            if (abstractC2897.m6058(obj, type, j)) {
                abstractC2897.mo6042(AbstractC2867.m5943(obj.getClass()));
            }
            if (objApply != this.f8836 && objApply != null) {
                abstractC2897.mo5997();
                abstractC2897.mo6031("year");
                abstractC2897.mo5973(iIntValue);
                abstractC2897.mo6031("month");
                abstractC2897.mo5973(iIntValue2);
                abstractC2897.mo6031("day");
                abstractC2897.mo5973(iIntValue3);
                abstractC2897.mo6031("hour");
                abstractC2897.mo5973(iApplyAsInt);
                abstractC2897.mo6031("minute");
                abstractC2897.mo5973(iApplyAsInt2);
                abstractC2897.mo6031("second");
                abstractC2897.mo5973(iApplyAsInt3);
                abstractC2897.mo6031("millis");
                abstractC2897.mo5973(iApplyAsInt4);
                abstractC2897.mo6031("chronology");
                abstractC2897.mo6037(objApply);
                abstractC2897.mo5994();
                return;
            }
            LocalDateTime localDateTimeOf = LocalDateTime.of(iIntValue, iIntValue2, iIntValue3, iApplyAsInt, iApplyAsInt2, iApplyAsInt3, iApplyAsInt4 * 1000000);
            DateTimeFormatter dateTimeFormatterM13869 = m13869();
            if (dateTimeFormatterM13869 != null) {
                dateTimeFormatter = dateTimeFormatterM13869;
            }
            if (dateTimeFormatter == null) {
                abstractC2897.mo5975(localDateTimeOf);
            } else {
                abstractC2897.mo6017(dateTimeFormatter.format(localDateTimeOf));
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            C0276.m843("write LocalDateWriter error", e);
        }
    }
}
