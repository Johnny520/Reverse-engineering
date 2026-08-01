package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2865;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2757 extends AbstractC2761 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f8404;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final InterfaceC2787 f8405;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8406;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC2757(java.lang.String r2, java.lang.reflect.Type r3, java.lang.Class r4, int r5, long r6, java.lang.String r8, java.util.Locale r9, java.lang.Object r10, com.alibaba.fastjson2.schema.JSONSchema r11, java.lang.reflect.Method r12, java.lang.reflect.Field r13, com.alibaba.fastjson2.reader.InterfaceC2787 r14) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            r1.f8405 = r14
            r2 = 0
            if (r8 == 0) goto L1e
            java.lang.String r3 = "millis"
            boolean r3 = r8.equals(r3)
            r4 = 1
            if (r3 != 0) goto L1f
            java.lang.String r3 = "unixtime"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L1a
            goto L1e
        L1a:
            r0 = r4
            r4 = r2
            r2 = r0
            goto L1f
        L1e:
            r4 = r2
        L1f:
            r1.f8404 = r2
            r1.f8406 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.AbstractC2757.<init>(java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.util.Locale, java.lang.Object, com.alibaba.fastjson2.schema.JSONSchema, java.lang.reflect.Method, java.lang.reflect.Field, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract void mo5430(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract void mo5431(Object obj, Date date);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract void mo5432(Object obj, ZonedDateTime zonedDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract void mo5433(Object obj, LocalDateTime localDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract void mo5434(Object obj, Instant instant);

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo5425(Class cls) {
        return cls == Date.class || cls == String.class;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        if (obj2 == null) {
            mo5430(obj);
            return;
        }
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (str.isEmpty() || "null".equals(str)) {
                mo5430(obj);
                return;
            }
            boolean z = this.f8404;
            String str2 = this.f8424;
            if ((str2 == null || z || this.f8406) && AbstractC2848.m5643(str)) {
                long j = Long.parseLong(str);
                if (z) {
                    j *= 1000;
                }
                mo5435(obj, j);
                return;
            }
            obj2 = AbstractC2865.m5827(str, str2, AbstractC2865.f9025);
        }
        if (obj2 instanceof Date) {
            mo5431(obj, (Date) obj2);
            return;
        }
        if (obj2 instanceof Instant) {
            mo5434(obj, (Instant) obj2);
            return;
        }
        if (obj2 instanceof Long) {
            mo5435(obj, ((Long) obj2).longValue());
            return;
        }
        if (obj2 instanceof LocalDateTime) {
            mo5433(obj, (LocalDateTime) obj2);
        } else if (obj2 instanceof ZonedDateTime) {
            mo5432(obj, (ZonedDateTime) obj2);
        } else {
            C0276.m849(AbstractC2442.m4571(obj2, new StringBuilder("not support value ")));
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        return this.f8405.mo5418(abstractC2898, this.f8421, this.f8426, this.f8420);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC2787 mo5450(AbstractC2898 abstractC2898) {
        return this.f8405;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC2787 mo5451(C2942 c2942) {
        return this.f8405;
    }
}
