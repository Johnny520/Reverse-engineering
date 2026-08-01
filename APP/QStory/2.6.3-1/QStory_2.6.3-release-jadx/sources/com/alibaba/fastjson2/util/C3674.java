package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.Map;
import java.util.function.LongFunction;
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3674 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LongFunction f9196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f9197;

    public C3674(Class cls) {
        this.f9197 = cls;
        try {
            this.f9196 = AbstractC9396.m14697(cls.getConstructor(Long.TYPE));
        } catch (NoSuchMethodException e) {
            C1123.m1403("create joda instant reader error", e);
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!abstractC3732.mo6693()) {
            boolean zMo6741 = abstractC3732.mo6741();
            LongFunction longFunction = this.f9196;
            if (zMo6741) {
                return longFunction.apply(abstractC3732.mo6769());
            }
            if (!abstractC3732.mo6739()) {
                if (abstractC3732.mo6737()) {
                    return mo6067(abstractC3732.mo6754(), j);
                }
                C1123.m1410(abstractC3732.mo6730("not support"));
                return null;
            }
            Instant instantMo6678 = abstractC3732.mo6678();
            if (instantMo6678 != null) {
                return longFunction.apply(instantMo6678.toEpochMilli());
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return this.f9197;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return mo6023(abstractC3732, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo6067(Map map, long j) {
        Long l = (Long) map.get("millis");
        LongFunction longFunction = this.f9196;
        if (l != null) {
            return longFunction.apply(l.longValue());
        }
        Number number = (Number) map.get("epochSecond");
        if (number != null) {
            return longFunction.apply(number.longValue() * 1000);
        }
        C1123.m1410("create joda instant error");
        return null;
    }
}
