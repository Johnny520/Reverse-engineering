package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p278.AbstractC8363;
import p291.InterfaceC8531;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2837 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Function f8829;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ToIntFunction f8830;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f8831;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ToIntFunction f8832;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ToIntFunction f8833;

    public C2837(Class cls, String str) {
        super(str, null);
        try {
            Class<?> clsLoadClass = cls.getClassLoader().loadClass("org.joda.time.chrono.ISOChronology");
            this.f8831 = clsLoadClass.getMethod("withUTC", null).invoke(clsLoadClass.getMethod("getInstance", null).invoke(null, null), null);
            this.f8832 = AbstractC8575.m14125(cls.getMethod("getYear", null));
            this.f8833 = AbstractC8575.m14125(cls.getMethod("getMonthOfYear", null));
            this.f8830 = AbstractC8575.m14125(cls.getMethod("getDayOfMonth", null));
            this.f8829 = AbstractC8575.m14120(cls.getMethod("getChronology", null));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            C0276.m842("create LocalDateWriter error", e);
            throw null;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        int iApplyAsInt = this.f8832.applyAsInt(obj);
        int iApplyAsInt2 = this.f8833.applyAsInt(obj);
        int iApplyAsInt3 = this.f8830.applyAsInt(obj);
        Object objApply = this.f8829.apply(obj);
        if (abstractC2896.m6043(obj, type, j)) {
            abstractC2896.mo5997(AbstractC2866.m5898(obj.getClass()));
        }
        if (objApply == this.f8831 || objApply == null) {
            abstractC2896.mo5916(LocalDate.of(iApplyAsInt, iApplyAsInt2, iApplyAsInt3));
            return;
        }
        abstractC2896.mo5952();
        abstractC2896.mo5986("year");
        abstractC2896.mo5928(iApplyAsInt);
        abstractC2896.mo5986("month");
        abstractC2896.mo5928(iApplyAsInt2);
        abstractC2896.mo5986("day");
        abstractC2896.mo5928(iApplyAsInt3);
        abstractC2896.mo5986("chronology");
        abstractC2896.mo5992(objApply);
        abstractC2896.mo5949();
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        int iApplyAsInt = this.f8832.applyAsInt(obj);
        int iApplyAsInt2 = this.f8833.applyAsInt(obj);
        int iApplyAsInt3 = this.f8830.applyAsInt(obj);
        Object objApply = this.f8829.apply(obj);
        if (objApply == this.f8831 || objApply == null) {
            LocalDate localDateOf = LocalDate.of(iApplyAsInt, iApplyAsInt2, iApplyAsInt3);
            DateTimeFormatter dateTimeFormatterM13852 = m13852();
            if (dateTimeFormatterM13852 == null) {
                C2894 c2894 = abstractC2896.f9176;
                dateTimeFormatterM13852 = null;
            }
            if (dateTimeFormatterM13852 == null) {
                abstractC2896.mo5916(localDateOf);
                return;
            } else {
                abstractC2896.mo5972(dateTimeFormatterM13852.format(localDateOf));
                return;
            }
        }
        abstractC2896.mo5952();
        abstractC2896.mo5986("year");
        abstractC2896.mo5928(iApplyAsInt);
        abstractC2896.mo5986("month");
        abstractC2896.mo5928(iApplyAsInt2);
        abstractC2896.mo5986("day");
        abstractC2896.mo5928(iApplyAsInt3);
        abstractC2896.mo5986("chronology");
        abstractC2896.mo5992(objApply);
        abstractC2896.mo5949();
    }
}
