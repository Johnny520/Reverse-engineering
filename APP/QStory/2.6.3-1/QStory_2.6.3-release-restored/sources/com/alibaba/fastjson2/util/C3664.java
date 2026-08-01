package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3730;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p307.InterfaceC9352;
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3664 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f9158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f9159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ToIntFunction f9160;

    public C3664(Class cls) {
        try {
            this.f9160 = AbstractC9396.m14703(cls.getMethod("getMinimumDaysInFirstWeek", null));
            Method method = cls.getMethod("getZone", null);
            this.f9159 = AbstractC9396.m14698(method);
            this.f9158 = AbstractC9396.m14698(method.getReturnType().getMethod("getID", null));
        } catch (NoSuchMethodException e) {
            C1123.m1403("getMethod error", e);
            throw null;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        String str = (String) this.f9158.apply(this.f9159.apply(obj));
        int iApplyAsInt = this.f9160.applyAsInt(obj);
        abstractC3730.mo6557();
        if (iApplyAsInt != 4) {
            abstractC3730.mo6591("minimumDaysInFirstWeek");
            abstractC3730.mo6533(iApplyAsInt);
        }
        abstractC3730.mo6591("zoneId");
        abstractC3730.mo6577(str);
        abstractC3730.mo6554();
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        String str = (String) this.f9158.apply(this.f9159.apply(obj));
        int iApplyAsInt = this.f9160.applyAsInt(obj);
        abstractC3730.mo6557();
        abstractC3730.mo6591("minimumDaysInFirstWeek");
        abstractC3730.mo6533(iApplyAsInt);
        abstractC3730.mo6591("zoneId");
        abstractC3730.mo6577(str);
        abstractC3730.mo6554();
    }
}
