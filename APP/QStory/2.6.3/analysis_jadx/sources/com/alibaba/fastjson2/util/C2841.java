package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.Map;
import java.util.function.LongFunction;
import p293.AbstractC8567;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2841 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LongFunction f8851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8852;

    public C2841(Class cls) {
        this.f8852 = cls;
        try {
            this.f8851 = AbstractC8567.m14138(cls.getConstructor(Long.TYPE));
        } catch (NoSuchMethodException e) {
            C0276.m843("create joda instant reader error", e);
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (!abstractC2899.mo6133()) {
            boolean zMo6181 = abstractC2899.mo6181();
            LongFunction longFunction = this.f8851;
            if (zMo6181) {
                return longFunction.apply(abstractC2899.mo6209());
            }
            if (!abstractC2899.mo6179()) {
                if (abstractC2899.mo6177()) {
                    return mo5507(abstractC2899.mo6194(), j);
                }
                C0276.m850(abstractC2899.mo6170("not support"));
                return null;
            }
            Instant instantMo6118 = abstractC2899.mo6118();
            if (instantMo6118 != null) {
                return longFunction.apply(instantMo6118.toEpochMilli());
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return this.f8852;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return mo5463(abstractC2899, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5507(Map map, long j) {
        Long l = (Long) map.get("millis");
        LongFunction longFunction = this.f8851;
        if (l != null) {
            return longFunction.apply(l.longValue());
        }
        Number number = (Number) map.get("epochSecond");
        if (number != null) {
            return longFunction.apply(number.longValue() * 1000);
        }
        C0276.m850("create joda instant error");
        return null;
    }
}
