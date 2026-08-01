package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2896;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p291.InterfaceC8531;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2830 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8811;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ToIntFunction f8813;

    public C2830(Class cls) {
        try {
            this.f8813 = AbstractC8575.m14125(cls.getMethod("getMinimumDaysInFirstWeek", null));
            Method method = cls.getMethod("getZone", null);
            this.f8812 = AbstractC8575.m14120(method);
            this.f8811 = AbstractC8575.m14120(method.getReturnType().getMethod("getID", null));
        } catch (NoSuchMethodException e) {
            C0276.m842("getMethod error", e);
            throw null;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        String str = (String) this.f8811.apply(this.f8812.apply(obj));
        int iApplyAsInt = this.f8813.applyAsInt(obj);
        abstractC2896.mo5952();
        if (iApplyAsInt != 4) {
            abstractC2896.mo5986("minimumDaysInFirstWeek");
            abstractC2896.mo5928(iApplyAsInt);
        }
        abstractC2896.mo5986("zoneId");
        abstractC2896.mo5972(str);
        abstractC2896.mo5949();
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        String str = (String) this.f8811.apply(this.f8812.apply(obj));
        int iApplyAsInt = this.f8813.applyAsInt(obj);
        abstractC2896.mo5952();
        abstractC2896.mo5986("minimumDaysInFirstWeek");
        abstractC2896.mo5928(iApplyAsInt);
        abstractC2896.mo5986("zoneId");
        abstractC2896.mo5972(str);
        abstractC2896.mo5949();
    }
}
