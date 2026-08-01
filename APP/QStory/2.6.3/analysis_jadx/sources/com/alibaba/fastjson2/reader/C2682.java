package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Method;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2682 extends AbstractC2758 {
    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void mo5475(Object obj) {
        mo5477(obj, null);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo5476(Object obj, Date date) {
        mo5477(obj, ZonedDateTime.ofInstant(date.toInstant(), AbstractC2866.f9027));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo5477(Object obj, ZonedDateTime zonedDateTime) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(zonedDateTime);
        }
        if (zonedDateTime != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8422) == 0) {
            String str = this.f8428;
            if (obj == null) {
                C0276.m850(AbstractC0053.m158("set ", str, " error, object is null"));
                return;
            }
            Method method = this.f8427;
            if (method != null) {
                try {
                    method.invoke(obj, zonedDateTime);
                    return;
                } catch (Exception e) {
                    C0276.m843(AbstractC0053.m158("set ", str, " error"), e);
                    return;
                }
            }
            long j = this.f8425;
            if (j != -1) {
                AbstractC2854.f8921.putObject(obj, j, zonedDateTime);
                return;
            }
            try {
                this.f8424.set(obj, zonedDateTime);
            } catch (Exception e2) {
                C0276.m843(AbstractC0053.m158("set ", str, " error"), e2);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo5478(Object obj, LocalDateTime localDateTime) {
        mo5477(obj, ZonedDateTime.of(localDateTime, AbstractC2866.f9027));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo5479(Object obj, Instant instant) {
        mo5477(obj, ZonedDateTime.ofInstant(instant, AbstractC2866.f9027));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5480(Object obj, long j) {
        mo5477(obj, ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), AbstractC2866.f9027));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        mo5477(obj, (ZonedDateTime) this.f8407.mo5463(abstractC2899, this.f8423, this.f8428, this.f8422));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void mo5481(AbstractC2899 abstractC2899, Object obj) {
        mo5477(obj, abstractC2899.mo6241());
    }
}
