package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p278.AbstractC8364;
import p291.InterfaceC8523;
import p293.AbstractC8567;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2838 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Function f8831;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ToIntFunction f8832;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f8833;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ToIntFunction f8834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ToIntFunction f8835;

    public C2838(Class cls, String str) {
        super(str, null);
        try {
            Class<?> clsLoadClass = cls.getClassLoader().loadClass("org.joda.time.chrono.ISOChronology");
            this.f8833 = clsLoadClass.getMethod("withUTC", null).invoke(clsLoadClass.getMethod("getInstance", null).invoke(null, null), null);
            this.f8834 = AbstractC8567.m14144(cls.getMethod("getYear", null));
            this.f8835 = AbstractC8567.m14144(cls.getMethod("getMonthOfYear", null));
            this.f8832 = AbstractC8567.m14144(cls.getMethod("getDayOfMonth", null));
            this.f8831 = AbstractC8567.m14139(cls.getMethod("getChronology", null));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            C0276.m843("create LocalDateWriter error", e);
            throw null;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        int iApplyAsInt = this.f8834.applyAsInt(obj);
        int iApplyAsInt2 = this.f8835.applyAsInt(obj);
        int iApplyAsInt3 = this.f8832.applyAsInt(obj);
        Object objApply = this.f8831.apply(obj);
        if (abstractC2897.m6058(obj, type, j)) {
            abstractC2897.mo6042(AbstractC2867.m5943(obj.getClass()));
        }
        if (objApply == this.f8833 || objApply == null) {
            abstractC2897.mo5961(LocalDate.of(iApplyAsInt, iApplyAsInt2, iApplyAsInt3));
            return;
        }
        abstractC2897.mo5997();
        abstractC2897.mo6031("year");
        abstractC2897.mo5973(iApplyAsInt);
        abstractC2897.mo6031("month");
        abstractC2897.mo5973(iApplyAsInt2);
        abstractC2897.mo6031("day");
        abstractC2897.mo5973(iApplyAsInt3);
        abstractC2897.mo6031("chronology");
        abstractC2897.mo6037(objApply);
        abstractC2897.mo5994();
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        int iApplyAsInt = this.f8834.applyAsInt(obj);
        int iApplyAsInt2 = this.f8835.applyAsInt(obj);
        int iApplyAsInt3 = this.f8832.applyAsInt(obj);
        Object objApply = this.f8831.apply(obj);
        if (objApply == this.f8833 || objApply == null) {
            LocalDate localDateOf = LocalDate.of(iApplyAsInt, iApplyAsInt2, iApplyAsInt3);
            DateTimeFormatter dateTimeFormatterM13869 = m13869();
            if (dateTimeFormatterM13869 == null) {
                C2895 c2895 = abstractC2897.f9178;
                dateTimeFormatterM13869 = null;
            }
            if (dateTimeFormatterM13869 == null) {
                abstractC2897.mo5961(localDateOf);
                return;
            } else {
                abstractC2897.mo6017(dateTimeFormatterM13869.format(localDateOf));
                return;
            }
        }
        abstractC2897.mo5997();
        abstractC2897.mo6031("year");
        abstractC2897.mo5973(iApplyAsInt);
        abstractC2897.mo6031("month");
        abstractC2897.mo5973(iApplyAsInt2);
        abstractC2897.mo6031("day");
        abstractC2897.mo5973(iApplyAsInt3);
        abstractC2897.mo6031("chronology");
        abstractC2897.mo6037(objApply);
        abstractC2897.mo5994();
    }
}
