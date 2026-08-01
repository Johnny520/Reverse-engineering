package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3700;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3584 extends C3524 {
    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo6046(Object obj, float f) {
        mo6031(obj, Long.valueOf((long) f));
    }

    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo6047(Object obj, double d) {
        mo6031(obj, Long.valueOf((long) d));
    }

    @Override // com.alibaba.fastjson2.reader.C3524, com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        long jM6465 = AbstractC3700.m6465(obj2);
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(jM6465);
        }
        AbstractC3687.f9266.putLong(obj, this.f8770, jM6465);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        long jMo6769 = abstractC3732.mo6769();
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(jMo6769);
        }
        AbstractC3687.f9266.putLong(obj, this.f8770, jMo6769);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo6041(AbstractC3732 abstractC3732, Object obj) {
        mo6032(abstractC3732, obj);
    }
}
