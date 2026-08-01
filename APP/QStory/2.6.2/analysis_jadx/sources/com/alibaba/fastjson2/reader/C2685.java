package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2865;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2685 extends AbstractC2757 {
    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo5430(Object obj) {
        mo5433(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo5431(Object obj, Date date) {
        mo5433(obj, date.toInstant().atZone(AbstractC2865.f9025).toLocalDateTime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo5432(Object obj, ZonedDateTime zonedDateTime) {
        mo5433(obj, zonedDateTime.toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo5433(Object obj, LocalDateTime localDateTime) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(localDateTime);
        }
        String str = this.f8426;
        if (obj == null) {
            C0276.m849(AbstractC0053.m156("set ", str, " error, object is null"));
            return;
        }
        if (localDateTime != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8420) == 0) {
            long j = this.f8423;
            if (j != -1) {
                AbstractC2853.f8919.putObject(obj, j, localDateTime);
                return;
            }
            try {
                this.f8422.set(obj, localDateTime);
            } catch (Exception e) {
                C0276.m842(AbstractC0053.m156("set ", str, " error"), e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo5434(Object obj, Instant instant) {
        mo5433(obj, instant.atZone(AbstractC2865.f9025).toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo5425(Class cls) {
        Class cls2 = this.f8427;
        return cls2 == Instant.class || cls2 == Long.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5435(Object obj, long j) {
        mo5433(obj, Instant.ofEpochMilli(j).atZone(AbstractC2865.f9025).toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        boolean z = abstractC2898.f9197;
        InterfaceC2787 interfaceC2787 = this.f8405;
        Type type = this.f8421;
        mo5433(obj, z ? (LocalDateTime) interfaceC2787.mo5422(abstractC2898, type, this.f8426, this.f8420) : (LocalDateTime) interfaceC2787.mo5418(abstractC2898, type, this.f8426, this.f8420));
    }
}
