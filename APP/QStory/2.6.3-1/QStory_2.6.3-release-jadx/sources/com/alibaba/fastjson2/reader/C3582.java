package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3699;
import java.lang.reflect.Method;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3582 extends AbstractC3591 {
    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo6035(Object obj) {
        mo6039(obj, null);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo6036(Object obj, Date date) {
        mo6039(obj, date.toInstant());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo6037(Object obj, ZonedDateTime zonedDateTime) {
        mo6039(obj, zonedDateTime.toInstant());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo6038(Object obj, LocalDateTime localDateTime) {
        mo6039(obj, localDateTime.toInstant(AbstractC3699.f9372.getRules().getOffset(localDateTime)));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo6039(Object obj, Instant instant) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(instant);
        }
        String str = this.f8773;
        if (obj == null) {
            C1123.m1410(AbstractC0900.m718("set ", str, " error, object is null"));
            return;
        }
        if (instant != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8767) == 0) {
            Method method = this.f8772;
            if (method != null) {
                try {
                    method.invoke(obj, instant);
                    return;
                } catch (Exception e) {
                    C1123.m1403(AbstractC0900.m718("set ", str, " error"), e);
                    return;
                }
            }
            long j = this.f8770;
            if (j != -1) {
                AbstractC3687.f9266.putObject(obj, j, instant);
                return;
            }
            try {
                this.f8769.set(obj, instant);
            } catch (Exception e2) {
                C1123.m1403(AbstractC0900.m718("set ", str, " error"), e2);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6040(Object obj, long j) {
        mo6039(obj, Instant.ofEpochMilli(j));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        mo6039(obj, (Instant) this.f8752.mo6023(abstractC3732, this.f8768, this.f8773, this.f8767));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo6041(AbstractC3732 abstractC3732, Object obj) {
        mo6039(obj, abstractC3732.mo6678());
    }
}
