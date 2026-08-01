package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import p291.InterfaceC8531;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2857 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public byte[] f8957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f8960;

    public C2857(Class cls) {
        String strM5898 = AbstractC2866.m5898(cls);
        this.f8960 = strM5898;
        this.f8959 = AbstractC2859.m5729(strM5898);
        try {
            this.f8958 = AbstractC8575.m14120(cls.getMethod("asMap", null));
        } catch (NoSuchMethodException e) {
            C0276.m842("create Guava AsMapWriter error", e);
            throw null;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.m6043(obj, type, j)) {
            if (this.f8957 == null) {
                this.f8957 = InterfaceC2911.m6297(this.f8960);
            }
            abstractC2896.mo5998(this.f8959, this.f8957);
        }
        abstractC2896.mo5951((Map) this.f8958.apply(obj));
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        abstractC2896.mo5951((Map) this.f8958.apply(obj));
    }
}
