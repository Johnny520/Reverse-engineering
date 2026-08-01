package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3699;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3590 extends AbstractC3591 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final BiConsumer f8750;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3590(int i, long j, JSONSchema jSONSchema, Class cls, Object obj, String str, String str2, Field field, Method method, Type type, Locale locale, BiConsumer biConsumer) {
        C3574 c3574;
        Locale locale2;
        if (str2 == null) {
            c3574 = C3574.f8723;
            locale2 = locale;
        } else {
            locale2 = locale;
            c3574 = new C3574(str2, locale2);
        }
        super(str, type, cls, i, j, str2, locale2, obj, jSONSchema, method, field, c3574);
        this.f8750 = biConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo6035(Object obj) {
        mo6036(obj, null);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo6036(Object obj, Date date) {
        BiConsumer biConsumer = this.f8750;
        if (biConsumer != null) {
            biConsumer.accept(obj, date);
            return;
        }
        String str = this.f8773;
        if (obj == null) {
            C1123.m1410(AbstractC0900.m718("set ", str, " error, object is null"));
            return;
        }
        Method method = this.f8772;
        if (method != null) {
            try {
                method.invoke(obj, date);
                return;
            } catch (Exception e) {
                C1123.m1403(AbstractC0900.m718("set ", str, " error"), e);
                return;
            }
        }
        long j = this.f8770;
        if (j != -1) {
            AbstractC3687.f9266.putObject(obj, j, date);
            return;
        }
        try {
            this.f8769.set(obj, date);
        } catch (Exception e2) {
            C1123.m1403(AbstractC0900.m718("set ", str, " error"), e2);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo6037(Object obj, ZonedDateTime zonedDateTime) {
        mo6036(obj, new Date(zonedDateTime.toInstant().toEpochMilli()));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo6038(Object obj, LocalDateTime localDateTime) {
        mo6036(obj, Date.from(localDateTime.toInstant(AbstractC3699.f9372.getRules().getOffset(localDateTime))));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3591
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo6039(Object obj, Instant instant) {
        mo6036(obj, Date.from(instant));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6040(Object obj, long j) {
        mo6036(obj, new Date(j));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) throws Exception {
        Date date;
        try {
            date = (Date) this.f8752.mo6023(abstractC3732, this.f8768, this.f8773, this.f8767);
        } catch (Exception e) {
            if ((JSONReader$Feature.NullOnError.mask & this.f8767) == 0) {
                throw e;
            }
            date = null;
        }
        mo6036(obj, date);
    }
}
