package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2896;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Function;
import p291.InterfaceC8531;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2841 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f8852;

    public C2841(Class cls) {
        try {
            Method method = cls.getMethod("getZone", null);
            this.f8852 = AbstractC8575.m14120(method);
            this.f8851 = AbstractC8575.m14120(method.getReturnType().getMethod("getID", null));
        } catch (NoSuchMethodException e) {
            C0276.m842("getMethod error", e);
            throw null;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        String str = (String) this.f8851.apply(this.f8852.apply(obj));
        abstractC2896.mo5952();
        abstractC2896.mo5986("zoneId");
        abstractC2896.mo5972(str);
        abstractC2896.mo5949();
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        String str = (String) this.f8851.apply(this.f8852.apply(obj));
        abstractC2896.mo5952();
        abstractC2896.mo5986("zoneId");
        abstractC2896.mo5972(str);
        abstractC2896.mo5949();
    }
}
