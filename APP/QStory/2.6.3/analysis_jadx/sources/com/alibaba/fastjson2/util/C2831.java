package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2897;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p291.InterfaceC8523;
import p293.AbstractC8567;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2831 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ToIntFunction f8815;

    public C2831(Class cls) {
        try {
            this.f8815 = AbstractC8567.m14144(cls.getMethod("getMinimumDaysInFirstWeek", null));
            Method method = cls.getMethod("getZone", null);
            this.f8814 = AbstractC8567.m14139(method);
            this.f8813 = AbstractC8567.m14139(method.getReturnType().getMethod("getID", null));
        } catch (NoSuchMethodException e) {
            C0276.m843("getMethod error", e);
            throw null;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        String str = (String) this.f8813.apply(this.f8814.apply(obj));
        int iApplyAsInt = this.f8815.applyAsInt(obj);
        abstractC2897.mo5997();
        if (iApplyAsInt != 4) {
            abstractC2897.mo6031("minimumDaysInFirstWeek");
            abstractC2897.mo5973(iApplyAsInt);
        }
        abstractC2897.mo6031("zoneId");
        abstractC2897.mo6017(str);
        abstractC2897.mo5994();
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        String str = (String) this.f8813.apply(this.f8814.apply(obj));
        int iApplyAsInt = this.f8815.applyAsInt(obj);
        abstractC2897.mo5997();
        abstractC2897.mo6031("minimumDaysInFirstWeek");
        abstractC2897.mo5973(iApplyAsInt);
        abstractC2897.mo6031("zoneId");
        abstractC2897.mo6017(str);
        abstractC2897.mo5994();
    }
}
