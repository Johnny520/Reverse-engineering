package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3700;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3587 extends C3524 {
    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo6046(Object obj, float f) {
        mo6031(obj, Integer.valueOf((int) f));
    }

    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo6047(Object obj, double d) {
        mo6031(obj, Integer.valueOf((int) d));
    }

    @Override // com.alibaba.fastjson2.reader.C3524, com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        int iM6469 = AbstractC3700.m6469(obj2);
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(iM6469);
        }
        AbstractC3687.f9266.putInt(obj, this.f8770, iM6469);
    }

    @Override // com.alibaba.fastjson2.reader.C3524, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6040(Object obj, long j) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(j);
        }
        AbstractC3687.f9266.putInt(obj, this.f8770, (int) j);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        int iMo6772 = abstractC3732.mo6772();
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6203(iMo6772);
        }
        AbstractC3687.f9266.putInt(obj, this.f8770, iMo6772);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo6041(AbstractC3732 abstractC3732, Object obj) {
        mo6052(obj, abstractC3732.mo6772());
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        return Integer.valueOf(abstractC3732.mo6772());
    }
}
