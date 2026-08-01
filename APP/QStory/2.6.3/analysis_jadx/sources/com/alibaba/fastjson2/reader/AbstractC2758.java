package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2758 extends AbstractC2762 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f8406;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final InterfaceC2788 f8407;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8408;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC2758(java.lang.String r2, java.lang.reflect.Type r3, java.lang.Class r4, int r5, long r6, java.lang.String r8, java.util.Locale r9, java.lang.Object r10, com.alibaba.fastjson2.schema.JSONSchema r11, java.lang.reflect.Method r12, java.lang.reflect.Field r13, com.alibaba.fastjson2.reader.InterfaceC2788 r14) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            r1.f8407 = r14
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
            r1.f8406 = r2
            r1.f8408 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.AbstractC2758.<init>(java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.util.Locale, java.lang.Object, com.alibaba.fastjson2.schema.JSONSchema, java.lang.reflect.Method, java.lang.reflect.Field, com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract void mo5475(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract void mo5476(Object obj, Date date);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract void mo5477(Object obj, ZonedDateTime zonedDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract void mo5478(Object obj, LocalDateTime localDateTime);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract void mo5479(Object obj, Instant instant);

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo5470(Class cls) {
        return cls == Date.class || cls == String.class;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        if (obj2 == null) {
            mo5475(obj);
            return;
        }
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (str.isEmpty() || "null".equals(str)) {
                mo5475(obj);
                return;
            }
            boolean z = this.f8406;
            String str2 = this.f8426;
            if ((str2 == null || z || this.f8408) && AbstractC2849.m5688(str)) {
                long j = Long.parseLong(str);
                if (z) {
                    j *= 1000;
                }
                mo5480(obj, j);
                return;
            }
            obj2 = AbstractC2866.m5872(str, str2, AbstractC2866.f9027);
        }
        if (obj2 instanceof Date) {
            mo5476(obj, (Date) obj2);
            return;
        }
        if (obj2 instanceof Instant) {
            mo5479(obj, (Instant) obj2);
            return;
        }
        if (obj2 instanceof Long) {
            mo5480(obj, ((Long) obj2).longValue());
            return;
        }
        if (obj2 instanceof LocalDateTime) {
            mo5478(obj, (LocalDateTime) obj2);
        } else if (obj2 instanceof ZonedDateTime) {
            mo5477(obj, (ZonedDateTime) obj2);
        } else {
            C0276.m850(AbstractC2442.m4581(obj2, new StringBuilder("not support value ")));
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        return this.f8407.mo5463(abstractC2899, this.f8423, this.f8428, this.f8422);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC2788 mo5495(AbstractC2899 abstractC2899) {
        return this.f8407;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC2788 mo5496(C2943 c2943) {
        return this.f8407;
    }
}
