package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3699;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3519 extends AbstractC3591 {
    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo6035(Object obj) {
        mo6038(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo6036(Object obj, Date date) {
        mo6038(obj, date.toInstant().atZone(AbstractC3699.f9372).toLocalDateTime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo6037(Object obj, ZonedDateTime zonedDateTime) {
        mo6038(obj, zonedDateTime.toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo6038(Object obj, LocalDateTime localDateTime) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(localDateTime);
        }
        String str = this.f8773;
        if (obj == null) {
            C1123.m1410(AbstractC0900.m718("set ", str, " error, object is null"));
            return;
        }
        if (localDateTime != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8767) == 0) {
            long j = this.f8770;
            if (j != -1) {
                AbstractC3687.f9266.putObject(obj, j, localDateTime);
                return;
            }
            try {
                this.f8769.set(obj, localDateTime);
            } catch (Exception e) {
                C1123.m1403(AbstractC0900.m718("set ", str, " error"), e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo6039(Object obj, Instant instant) {
        mo6038(obj, instant.atZone(AbstractC3699.f9372).toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo6030(Class cls) {
        Class cls2 = this.f8774;
        return cls2 == Instant.class || cls2 == Long.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6040(Object obj, long j) {
        mo6038(obj, Instant.ofEpochMilli(j).atZone(AbstractC3699.f9372).toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        boolean z = abstractC3732.f9544;
        InterfaceC3621 interfaceC3621 = this.f8752;
        Type type = this.f8768;
        mo6038(obj, z ? (LocalDateTime) interfaceC3621.mo6027(abstractC3732, type, this.f8773, this.f8767) : (LocalDateTime) interfaceC3621.mo6023(abstractC3732, type, this.f8773, this.f8767));
    }
}
