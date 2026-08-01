package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2866;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2750 extends C2690 {
    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo5441(Object obj, float f) {
        mo5426(obj, Long.valueOf((long) f));
    }

    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo5442(Object obj, double d) {
        mo5426(obj, Long.valueOf((long) d));
    }

    @Override // com.alibaba.fastjson2.reader.C2690, com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        long jM5860 = AbstractC2866.m5860(obj2);
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(jM5860);
        }
        AbstractC2853.f8919.putLong(obj, this.f8423, jM5860);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        long jMo6164 = abstractC2898.mo6164();
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5598(jMo6164);
        }
        AbstractC2853.f8919.putLong(obj, this.f8423, jMo6164);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo5436(AbstractC2898 abstractC2898, Object obj) {
        mo5427(abstractC2898, obj);
    }
}
