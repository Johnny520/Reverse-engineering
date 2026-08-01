package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import p291.InterfaceC8523;
import p293.AbstractC8567;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2858 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public byte[] f8959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f8962;

    public C2858(Class cls) {
        String strM5943 = AbstractC2867.m5943(cls);
        this.f8962 = strM5943;
        this.f8961 = AbstractC2860.m5774(strM5943);
        try {
            this.f8960 = AbstractC8567.m14139(cls.getMethod("asMap", null));
        } catch (NoSuchMethodException e) {
            C0276.m843("create Guava AsMapWriter error", e);
            throw null;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (abstractC2897.m6058(obj, type, j)) {
            if (this.f8959 == null) {
                this.f8959 = InterfaceC2912.m6355(this.f8962);
            }
            abstractC2897.mo6043(this.f8961, this.f8959);
        }
        abstractC2897.mo5996((Map) this.f8960.apply(obj));
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        abstractC2897.mo5996((Map) this.f8960.apply(obj));
    }
}
