package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2867;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2751 extends C2691 {
    @Override // com.alibaba.fastjson2.reader.C2691
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo5486(Object obj, float f) {
        mo5471(obj, Long.valueOf((long) f));
    }

    @Override // com.alibaba.fastjson2.reader.C2691
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo5487(Object obj, double d) {
        mo5471(obj, Long.valueOf((long) d));
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        long jM5905 = AbstractC2867.m5905(obj2);
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5643(jM5905);
        }
        AbstractC2854.f8921.putLong(obj, this.f8425, jM5905);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        long jMo6209 = abstractC2899.mo6209();
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5643(jMo6209);
        }
        AbstractC2854.f8921.putLong(obj, this.f8425, jMo6209);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo5481(AbstractC2899 abstractC2899, Object obj) {
        mo5472(abstractC2899, obj);
    }
}
