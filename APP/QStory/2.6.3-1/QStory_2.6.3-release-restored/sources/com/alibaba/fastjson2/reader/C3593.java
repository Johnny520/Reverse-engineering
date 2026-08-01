package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3700;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3593 extends C3524 {
    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo6050(Object obj, boolean z) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(Boolean.valueOf(z));
        }
        long j = this.f8770;
        if (j != -1) {
            AbstractC3687.f9266.putBoolean(obj, j, z);
            return;
        }
        try {
            this.f8769.setBoolean(obj, z);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3524
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo6052(Object obj, int i) {
        mo6050(obj, AbstractC3700.m6470(Integer.valueOf(i)));
    }

    @Override // com.alibaba.fastjson2.reader.C3524, com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        if (obj2 == null) {
            if ((JSONReader$Feature.IgnoreSetNullValue.mask & this.f8767) != 0) {
                return;
            }
            mo6050(obj, false);
        } else if (obj2 instanceof Boolean) {
            mo6050(obj, ((Boolean) obj2).booleanValue());
        } else {
            C3775.m6957("set ", this.f8773, " error, type not support ", obj2.getClass());
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        boolean zMo6668 = abstractC3732.mo6668();
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(Boolean.valueOf(zMo6668));
        }
        try {
            this.f8769.setBoolean(obj, zMo6668);
        } catch (Exception e) {
            C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), this.f8773, " error", abstractC3732), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        return abstractC3732.mo6672();
    }
}
