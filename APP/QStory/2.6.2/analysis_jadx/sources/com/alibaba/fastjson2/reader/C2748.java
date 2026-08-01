package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2865;
import java.lang.reflect.Method;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2748 extends AbstractC2757 {
    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo5430(Object obj) {
        mo5434(obj, null);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo5431(Object obj, Date date) {
        mo5434(obj, date.toInstant());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo5432(Object obj, ZonedDateTime zonedDateTime) {
        mo5434(obj, zonedDateTime.toInstant());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo5433(Object obj, LocalDateTime localDateTime) {
        mo5434(obj, localDateTime.toInstant(AbstractC2865.f9025.getRules().getOffset(localDateTime)));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo5434(Object obj, Instant instant) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(instant);
        }
        String str = this.f8426;
        if (obj == null) {
            C0276.m849(AbstractC0053.m156("set ", str, " error, object is null"));
            return;
        }
        if (instant != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8420) == 0) {
            Method method = this.f8425;
            if (method != null) {
                try {
                    method.invoke(obj, instant);
                    return;
                } catch (Exception e) {
                    C0276.m842(AbstractC0053.m156("set ", str, " error"), e);
                    return;
                }
            }
            long j = this.f8423;
            if (j != -1) {
                AbstractC2853.f8919.putObject(obj, j, instant);
                return;
            }
            try {
                this.f8422.set(obj, instant);
            } catch (Exception e2) {
                C0276.m842(AbstractC0053.m156("set ", str, " error"), e2);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5435(Object obj, long j) {
        mo5434(obj, Instant.ofEpochMilli(j));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        mo5434(obj, (Instant) this.f8405.mo5418(abstractC2898, this.f8421, this.f8426, this.f8420));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo5436(AbstractC2898 abstractC2898, Object obj) {
        mo5434(obj, abstractC2898.mo6072());
    }
}
