package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p294.AbstractC9193;
import p307.InterfaceC9352;
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3671 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Function f9176;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ToIntFunction f9177;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f9178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ToIntFunction f9179;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ToIntFunction f9180;

    public C3671(Class cls, String str) {
        super(str, null);
        try {
            Class<?> clsLoadClass = cls.getClassLoader().loadClass("org.joda.time.chrono.ISOChronology");
            this.f9178 = clsLoadClass.getMethod("withUTC", null).invoke(clsLoadClass.getMethod("getInstance", null).invoke(null, null), null);
            this.f9179 = AbstractC9396.m14703(cls.getMethod("getYear", null));
            this.f9180 = AbstractC9396.m14703(cls.getMethod("getMonthOfYear", null));
            this.f9177 = AbstractC9396.m14703(cls.getMethod("getDayOfMonth", null));
            this.f9176 = AbstractC9396.m14698(cls.getMethod("getChronology", null));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            C1123.m1403("create LocalDateWriter error", e);
            throw null;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        int iApplyAsInt = this.f9179.applyAsInt(obj);
        int iApplyAsInt2 = this.f9180.applyAsInt(obj);
        int iApplyAsInt3 = this.f9177.applyAsInt(obj);
        Object objApply = this.f9176.apply(obj);
        if (abstractC3730.m6618(obj, type, j)) {
            abstractC3730.mo6602(AbstractC3700.m6503(obj.getClass()));
        }
        if (objApply == this.f9178 || objApply == null) {
            abstractC3730.mo6521(LocalDate.of(iApplyAsInt, iApplyAsInt2, iApplyAsInt3));
            return;
        }
        abstractC3730.mo6557();
        abstractC3730.mo6591("year");
        abstractC3730.mo6533(iApplyAsInt);
        abstractC3730.mo6591("month");
        abstractC3730.mo6533(iApplyAsInt2);
        abstractC3730.mo6591("day");
        abstractC3730.mo6533(iApplyAsInt3);
        abstractC3730.mo6591("chronology");
        abstractC3730.mo6597(objApply);
        abstractC3730.mo6554();
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        int iApplyAsInt = this.f9179.applyAsInt(obj);
        int iApplyAsInt2 = this.f9180.applyAsInt(obj);
        int iApplyAsInt3 = this.f9177.applyAsInt(obj);
        Object objApply = this.f9176.apply(obj);
        if (objApply == this.f9178 || objApply == null) {
            LocalDate localDateOf = LocalDate.of(iApplyAsInt, iApplyAsInt2, iApplyAsInt3);
            DateTimeFormatter dateTimeFormatterM14428 = m14428();
            if (dateTimeFormatterM14428 == null) {
                C3728 c3728 = abstractC3730.f9523;
                dateTimeFormatterM14428 = null;
            }
            if (dateTimeFormatterM14428 == null) {
                abstractC3730.mo6521(localDateOf);
                return;
            } else {
                abstractC3730.mo6577(dateTimeFormatterM14428.format(localDateOf));
                return;
            }
        }
        abstractC3730.mo6557();
        abstractC3730.mo6591("year");
        abstractC3730.mo6533(iApplyAsInt);
        abstractC3730.mo6591("month");
        abstractC3730.mo6533(iApplyAsInt2);
        abstractC3730.mo6591("day");
        abstractC3730.mo6533(iApplyAsInt3);
        abstractC3730.mo6591("chronology");
        abstractC3730.mo6597(objApply);
        abstractC3730.mo6554();
    }
}
