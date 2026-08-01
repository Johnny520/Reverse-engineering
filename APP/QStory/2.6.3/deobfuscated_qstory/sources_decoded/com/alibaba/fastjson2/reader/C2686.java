package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2686 extends AbstractC2758 {
    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo5475(Object obj) {
        mo5478(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo5476(Object obj, Date date) {
        mo5478(obj, date.toInstant().atZone(AbstractC2866.f9027).toLocalDateTime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo5477(Object obj, ZonedDateTime zonedDateTime) {
        mo5478(obj, zonedDateTime.toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo5478(Object obj, LocalDateTime localDateTime) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(localDateTime);
        }
        String str = this.f8428;
        if (obj == null) {
            C0276.m850(AbstractC0053.m158("set ", str, " error, object is null"));
            return;
        }
        if (localDateTime != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8422) == 0) {
            long j = this.f8425;
            if (j != -1) {
                AbstractC2854.f8921.putObject(obj, j, localDateTime);
                return;
            }
            try {
                this.f8424.set(obj, localDateTime);
            } catch (Exception e) {
                C0276.m843(AbstractC0053.m158("set ", str, " error"), e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo5479(Object obj, Instant instant) {
        mo5478(obj, instant.atZone(AbstractC2866.f9027).toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo5470(Class cls) {
        Class cls2 = this.f8429;
        return cls2 == Instant.class || cls2 == Long.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5480(Object obj, long j) {
        mo5478(obj, Instant.ofEpochMilli(j).atZone(AbstractC2866.f9027).toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        boolean z = abstractC2899.f9199;
        InterfaceC2788 interfaceC2788 = this.f8407;
        Type type = this.f8423;
        mo5478(obj, z ? (LocalDateTime) interfaceC2788.mo5467(abstractC2899, type, this.f8428, this.f8422) : (LocalDateTime) interfaceC2788.mo5463(abstractC2899, type, this.f8428, this.f8422));
    }
}
