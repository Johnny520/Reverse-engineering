package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2866;
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
public final class C2757 extends AbstractC2758 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final BiConsumer f8405;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2757(int i, long j, JSONSchema jSONSchema, Class cls, Object obj, String str, String str2, Field field, Method method, Type type, Locale locale, BiConsumer biConsumer) {
        C2741 c2741;
        Locale locale2;
        if (str2 == null) {
            c2741 = C2741.f8378;
            locale2 = locale;
        } else {
            locale2 = locale;
            c2741 = new C2741(str2, locale2);
        }
        super(str, type, cls, i, j, str2, locale2, obj, jSONSchema, method, field, c2741);
        this.f8405 = biConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo5475(Object obj) {
        mo5476(obj, null);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo5476(Object obj, Date date) {
        BiConsumer biConsumer = this.f8405;
        if (biConsumer != null) {
            biConsumer.accept(obj, date);
            return;
        }
        String str = this.f8428;
        if (obj == null) {
            C0276.m850(AbstractC0053.m158("set ", str, " error, object is null"));
            return;
        }
        Method method = this.f8427;
        if (method != null) {
            try {
                method.invoke(obj, date);
                return;
            } catch (Exception e) {
                C0276.m843(AbstractC0053.m158("set ", str, " error"), e);
                return;
            }
        }
        long j = this.f8425;
        if (j != -1) {
            AbstractC2854.f8921.putObject(obj, j, date);
            return;
        }
        try {
            this.f8424.set(obj, date);
        } catch (Exception e2) {
            C0276.m843(AbstractC0053.m158("set ", str, " error"), e2);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo5477(Object obj, ZonedDateTime zonedDateTime) {
        mo5476(obj, new Date(zonedDateTime.toInstant().toEpochMilli()));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo5478(Object obj, LocalDateTime localDateTime) {
        mo5476(obj, Date.from(localDateTime.toInstant(AbstractC2866.f9027.getRules().getOffset(localDateTime))));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2758
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo5479(Object obj, Instant instant) {
        mo5476(obj, Date.from(instant));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5480(Object obj, long j) {
        mo5476(obj, new Date(j));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) throws Exception {
        Date date;
        try {
            date = (Date) this.f8407.mo5463(abstractC2899, this.f8423, this.f8428, this.f8422);
        } catch (Exception e) {
            if ((JSONReader$Feature.NullOnError.mask & this.f8422) == 0) {
                throw e;
            }
            date = null;
        }
        mo5476(obj, date);
    }
}
