package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2867;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2760 extends C2691 {
    @Override // com.alibaba.fastjson2.reader.C2691
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo5490(Object obj, boolean z) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(Boolean.valueOf(z));
        }
        long j = this.f8425;
        if (j != -1) {
            AbstractC2854.f8921.putBoolean(obj, j, z);
            return;
        }
        try {
            this.f8424.setBoolean(obj, z);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo5492(Object obj, int i) {
        mo5490(obj, AbstractC2867.m5910(Integer.valueOf(i)));
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        if (obj2 == null) {
            if ((JSONReader$Feature.IgnoreSetNullValue.mask & this.f8422) != 0) {
                return;
            }
            mo5490(obj, false);
        } else if (obj2 instanceof Boolean) {
            mo5490(obj, ((Boolean) obj2).booleanValue());
        } else {
            C2942.m6397("set ", this.f8428, " error, type not support ", obj2.getClass());
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        boolean zMo6108 = abstractC2899.mo6108();
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(Boolean.valueOf(zMo6108));
        }
        try {
            this.f8424.setBoolean(obj, zMo6108);
        } catch (Exception e) {
            C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), this.f8428, " error", abstractC2899), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        return abstractC2899.mo6112();
    }
}
