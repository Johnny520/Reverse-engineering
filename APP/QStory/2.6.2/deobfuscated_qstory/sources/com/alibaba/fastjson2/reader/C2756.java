package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2865;
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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2756 extends AbstractC2757 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final BiConsumer f8403;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2756(int i, long j, JSONSchema jSONSchema, Class cls, Object obj, String str, String str2, Field field, Method method, Type type, Locale locale, BiConsumer biConsumer) {
        C2740 c2740;
        Locale locale2;
        if (str2 == null) {
            c2740 = C2740.f8376;
            locale2 = locale;
        } else {
            locale2 = locale;
            c2740 = new C2740(str2, locale2);
        }
        super(str, type, cls, i, j, str2, locale2, obj, jSONSchema, method, field, c2740);
        this.f8403 = biConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo5430(Object obj) {
        mo5431(obj, null);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo5431(Object obj, Date date) {
        BiConsumer biConsumer = this.f8403;
        if (biConsumer != null) {
            biConsumer.accept(obj, date);
            return;
        }
        String str = this.f8426;
        if (obj == null) {
            C0276.m849(AbstractC0053.m156("set ", str, " error, object is null"));
            return;
        }
        Method method = this.f8425;
        if (method != null) {
            try {
                method.invoke(obj, date);
                return;
            } catch (Exception e) {
                C0276.m842(AbstractC0053.m156("set ", str, " error"), e);
                return;
            }
        }
        long j = this.f8423;
        if (j != -1) {
            AbstractC2853.f8919.putObject(obj, j, date);
            return;
        }
        try {
            this.f8422.set(obj, date);
        } catch (Exception e2) {
            C0276.m842(AbstractC0053.m156("set ", str, " error"), e2);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo5432(Object obj, ZonedDateTime zonedDateTime) {
        mo5431(obj, new Date(zonedDateTime.toInstant().toEpochMilli()));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo5433(Object obj, LocalDateTime localDateTime) {
        mo5431(obj, Date.from(localDateTime.toInstant(AbstractC2865.f9025.getRules().getOffset(localDateTime))));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2757
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo5434(Object obj, Instant instant) {
        mo5431(obj, Date.from(instant));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5435(Object obj, long j) {
        mo5431(obj, new Date(j));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) throws Exception {
        Date date;
        try {
            date = (Date) this.f8405.mo5418(abstractC2898, this.f8421, this.f8426, this.f8420);
        } catch (Exception e) {
            if ((JSONReader$Feature.NullOnError.mask & this.f8420) == 0) {
                throw e;
            }
            date = null;
        }
        mo5431(obj, date);
    }
}
