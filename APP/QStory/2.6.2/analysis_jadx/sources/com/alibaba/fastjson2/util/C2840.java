package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.Map;
import java.util.function.LongFunction;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2840 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LongFunction f8849;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8850;

    public C2840(Class cls) {
        this.f8850 = cls;
        try {
            this.f8849 = AbstractC8575.m14119(cls.getConstructor(Long.TYPE));
        } catch (NoSuchMethodException e) {
            C0276.m842("create joda instant reader error", e);
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!abstractC2898.mo6087()) {
            boolean zMo6135 = abstractC2898.mo6135();
            LongFunction longFunction = this.f8849;
            if (zMo6135) {
                return longFunction.apply(abstractC2898.mo6164());
            }
            if (!abstractC2898.mo6133()) {
                if (abstractC2898.mo6131()) {
                    return mo5462(abstractC2898.mo6149(), j);
                }
                C0276.m849(abstractC2898.mo6124("not support"));
                return null;
            }
            Instant instantMo6072 = abstractC2898.mo6072();
            if (instantMo6072 != null) {
                return longFunction.apply(instantMo6072.toEpochMilli());
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return this.f8850;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return mo5418(abstractC2898, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5462(Map map, long j) {
        Long l = (Long) map.get("millis");
        LongFunction longFunction = this.f8849;
        if (l != null) {
            return longFunction.apply(l.longValue());
        }
        Number number = (Number) map.get("epochSecond");
        if (number != null) {
            return longFunction.apply(number.longValue() * 1000);
        }
        C0276.m849("create joda instant error");
        return null;
    }
}
