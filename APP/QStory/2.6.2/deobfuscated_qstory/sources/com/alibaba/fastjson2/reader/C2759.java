package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2866;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2759 extends C2690 {
    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo5445(Object obj, boolean z) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(Boolean.valueOf(z));
        }
        long j = this.f8423;
        if (j != -1) {
            AbstractC2853.f8919.putBoolean(obj, j, z);
            return;
        }
        try {
            this.f8422.setBoolean(obj, z);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2690
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo5447(Object obj, int i) {
        mo5445(obj, AbstractC2866.m5865(Integer.valueOf(i)));
    }

    @Override // com.alibaba.fastjson2.reader.C2690, com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        if (obj2 == null) {
            if ((JSONReader$Feature.IgnoreSetNullValue.mask & this.f8420) != 0) {
                return;
            }
            mo5445(obj, false);
        } else if (obj2 instanceof Boolean) {
            mo5445(obj, ((Boolean) obj2).booleanValue());
        } else {
            C2941.m6339("set ", this.f8426, " error, type not support ", obj2.getClass());
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        boolean zMo6062 = abstractC2898.mo6062();
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(Boolean.valueOf(zMo6062));
        }
        try {
            this.f8422.setBoolean(obj, zMo6062);
        } catch (Exception e) {
            C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), this.f8426, " error", abstractC2898), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        return abstractC2898.mo6066();
    }
}
