package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2866;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2753 extends C2690 {
    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo5441(Object obj, float f) {
        mo5426(obj, Integer.valueOf((int) f));
    }

    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo5442(Object obj, double d) {
        mo5426(obj, Integer.valueOf((int) d));
    }

    @Override // com.alibaba.fastjson2.reader.C2690, com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        int iM5864 = AbstractC2866.m5864(obj2);
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(iM5864);
        }
        AbstractC2853.f8919.putInt(obj, this.f8423, iM5864);
    }

    @Override // com.alibaba.fastjson2.reader.C2690, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5435(Object obj, long j) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(j);
        }
        AbstractC2853.f8919.putInt(obj, this.f8423, (int) j);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        int iMo6167 = abstractC2898.mo6167();
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(iMo6167);
        }
        AbstractC2853.f8919.putInt(obj, this.f8423, iMo6167);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo5436(AbstractC2898 abstractC2898, Object obj) {
        mo5447(obj, abstractC2898.mo6167());
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        return Integer.valueOf(abstractC2898.mo6167());
    }
}
