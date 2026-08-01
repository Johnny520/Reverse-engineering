package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.reader.C2740;
import java.lang.reflect.Type;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2851 extends C2740 {
    @Override // com.alibaba.fastjson2.reader.C2740, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        boolean zMo6135 = abstractC2898.mo6135();
        C2942 c2942 = abstractC2898.f9199;
        boolean z = this.f23070;
        if (zMo6135) {
            long jMo6164 = abstractC2898.mo6164();
            if (z) {
                jMo6164 *= 1000;
            }
            return new Date(jMo6164);
        }
        if (abstractC2898.mo6073()) {
            return null;
        }
        if (z && abstractC2898.mo6133()) {
            return new Date(Long.parseLong(abstractC2898.mo6139()) * 1000);
        }
        if (this.f23071 != null && !this.f23068 && !this.f23069) {
            String strMo6139 = abstractC2898.mo6139();
            if (strMo6139.isEmpty()) {
                return null;
            }
            DateTimeFormatter dateTimeFormatterM13852 = m13852();
            return new Date((!this.f23077 ? LocalDateTime.of(LocalDate.parse(strMo6139, dateTimeFormatterM13852), LocalTime.MIN).atZone(c2942.m6351()).toInstant() : LocalDateTime.parse(strMo6139, dateTimeFormatterM13852).atZone(c2942.m6351()).toInstant()).toEpochMilli());
        }
        LocalDateTime localDateTimeMo6176 = abstractC2898.mo6176();
        if (localDateTimeMo6176 != null) {
            return Date.valueOf(localDateTimeMo6176.toLocalDate());
        }
        if (abstractC2898.f9194) {
            return null;
        }
        long jM6159 = abstractC2898.m6159();
        if (jM6159 == 0 && abstractC2898.f9194) {
            return null;
        }
        return new Date(jM6159);
    }

    @Override // com.alibaba.fastjson2.reader.C2740, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return mo5418(abstractC2898, type, obj, j);
    }
}
