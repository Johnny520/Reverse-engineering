package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3730;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p294.AbstractC9193;
import p307.InterfaceC9352;
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3672 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Object f9181;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ToIntFunction f9182;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Method f9183;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ToIntFunction f9184;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Function f9185;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ToIntFunction f9186;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ToIntFunction f9187;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Method f9188;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Method f9189;

    public C3672(Class cls, String str) {
        super(str, null);
        try {
            Class<?> clsLoadClass = cls.getClassLoader().loadClass("org.joda.time.chrono.ISOChronology");
            this.f9181 = clsLoadClass.getMethod("withUTC", null).invoke(clsLoadClass.getMethod("getInstance", null).invoke(null, null), null);
            this.f9188 = cls.getMethod("getYear", null);
            this.f9189 = cls.getMethod("getMonthOfYear", null);
            this.f9183 = cls.getMethod("getDayOfMonth", null);
            this.f9182 = AbstractC9396.m14703(cls.getMethod("getHourOfDay", null));
            this.f9186 = AbstractC9396.m14703(cls.getMethod("getMinuteOfHour", null));
            this.f9187 = AbstractC9396.m14703(cls.getMethod("getSecondOfMinute", null));
            this.f9184 = AbstractC9396.m14703(cls.getMethod("getMillisOfSecond", null));
            this.f9185 = AbstractC9396.m14698(cls.getMethod("getChronology", null));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            C1123.m1403("create LocalDateWriter error", e);
            throw null;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        try {
            int iIntValue = ((Integer) this.f9188.invoke(obj, null)).intValue();
            int iIntValue2 = ((Integer) this.f9189.invoke(obj, null)).intValue();
            int iIntValue3 = ((Integer) this.f9183.invoke(obj, null)).intValue();
            int iApplyAsInt = this.f9182.applyAsInt(obj);
            int iApplyAsInt2 = this.f9186.applyAsInt(obj);
            int iApplyAsInt3 = this.f9187.applyAsInt(obj);
            int iApplyAsInt4 = this.f9184.applyAsInt(obj);
            Object objApply = this.f9185.apply(obj);
            if (abstractC3730.m6618(obj, type, j)) {
                abstractC3730.mo6602(AbstractC3700.m6503(obj.getClass()));
            }
            if (objApply != this.f9181 && objApply != null) {
                abstractC3730.mo6557();
                abstractC3730.mo6591("year");
                abstractC3730.mo6533(iIntValue);
                abstractC3730.mo6591("month");
                abstractC3730.mo6533(iIntValue2);
                abstractC3730.mo6591("day");
                abstractC3730.mo6533(iIntValue3);
                abstractC3730.mo6591("hour");
                abstractC3730.mo6533(iApplyAsInt);
                abstractC3730.mo6591("minute");
                abstractC3730.mo6533(iApplyAsInt2);
                abstractC3730.mo6591("second");
                abstractC3730.mo6533(iApplyAsInt3);
                abstractC3730.mo6591("millis");
                abstractC3730.mo6533(iApplyAsInt4);
                abstractC3730.mo6591("chronology");
                abstractC3730.mo6597(objApply);
                abstractC3730.mo6554();
                return;
            }
            abstractC3730.mo6535(LocalDateTime.of(iIntValue, iIntValue2, iIntValue3, iApplyAsInt, iApplyAsInt2, iApplyAsInt3, iApplyAsInt4 * 1000000));
        } catch (IllegalAccessException | InvocationTargetException e) {
            C1123.m1403("write LocalDateWriter error", e);
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        try {
            DateTimeFormatter dateTimeFormatter = null;
            int iIntValue = ((Integer) this.f9188.invoke(obj, null)).intValue();
            int iIntValue2 = ((Integer) this.f9189.invoke(obj, null)).intValue();
            int iIntValue3 = ((Integer) this.f9183.invoke(obj, null)).intValue();
            int iApplyAsInt = this.f9182.applyAsInt(obj);
            int iApplyAsInt2 = this.f9186.applyAsInt(obj);
            int iApplyAsInt3 = this.f9187.applyAsInt(obj);
            int iApplyAsInt4 = this.f9184.applyAsInt(obj);
            Object objApply = this.f9185.apply(obj);
            if (abstractC3730.m6618(obj, type, j)) {
                abstractC3730.mo6602(AbstractC3700.m6503(obj.getClass()));
            }
            if (objApply != this.f9181 && objApply != null) {
                abstractC3730.mo6557();
                abstractC3730.mo6591("year");
                abstractC3730.mo6533(iIntValue);
                abstractC3730.mo6591("month");
                abstractC3730.mo6533(iIntValue2);
                abstractC3730.mo6591("day");
                abstractC3730.mo6533(iIntValue3);
                abstractC3730.mo6591("hour");
                abstractC3730.mo6533(iApplyAsInt);
                abstractC3730.mo6591("minute");
                abstractC3730.mo6533(iApplyAsInt2);
                abstractC3730.mo6591("second");
                abstractC3730.mo6533(iApplyAsInt3);
                abstractC3730.mo6591("millis");
                abstractC3730.mo6533(iApplyAsInt4);
                abstractC3730.mo6591("chronology");
                abstractC3730.mo6597(objApply);
                abstractC3730.mo6554();
                return;
            }
            LocalDateTime localDateTimeOf = LocalDateTime.of(iIntValue, iIntValue2, iIntValue3, iApplyAsInt, iApplyAsInt2, iApplyAsInt3, iApplyAsInt4 * 1000000);
            DateTimeFormatter dateTimeFormatterM14428 = m14428();
            if (dateTimeFormatterM14428 != null) {
                dateTimeFormatter = dateTimeFormatterM14428;
            }
            if (dateTimeFormatter == null) {
                abstractC3730.mo6535(localDateTimeOf);
            } else {
                abstractC3730.mo6577(dateTimeFormatter.format(localDateTimeOf));
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            C1123.m1403("write LocalDateWriter error", e);
        }
    }
}
