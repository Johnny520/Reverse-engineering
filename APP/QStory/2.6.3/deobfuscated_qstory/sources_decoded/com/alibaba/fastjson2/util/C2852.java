package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.reader.C2741;
import java.lang.reflect.Type;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2852 extends C2741 {
    @Override // com.alibaba.fastjson2.reader.C2741, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        boolean zMo6181 = abstractC2899.mo6181();
        C2943 c2943 = abstractC2899.f9201;
        boolean z = this.f23069;
        if (zMo6181) {
            long jMo6209 = abstractC2899.mo6209();
            if (z) {
                jMo6209 *= 1000;
            }
            return new Date(jMo6209);
        }
        if (abstractC2899.mo6119()) {
            return null;
        }
        if (z && abstractC2899.mo6179()) {
            return new Date(Long.parseLong(abstractC2899.mo6184()) * 1000);
        }
        if (this.f23070 != null && !this.f23067 && !this.f23068) {
            String strMo6184 = abstractC2899.mo6184();
            if (strMo6184.isEmpty()) {
                return null;
            }
            DateTimeFormatter dateTimeFormatterM13869 = m13869();
            return new Date((!this.f23076 ? LocalDateTime.of(LocalDate.parse(strMo6184, dateTimeFormatterM13869), LocalTime.MIN).atZone(c2943.m6409()).toInstant() : LocalDateTime.parse(strMo6184, dateTimeFormatterM13869).atZone(c2943.m6409()).toInstant()).toEpochMilli());
        }
        LocalDateTime localDateTimeMo6221 = abstractC2899.mo6221();
        if (localDateTimeMo6221 != null) {
            return Date.valueOf(localDateTimeMo6221.toLocalDate());
        }
        if (abstractC2899.f9196) {
            return null;
        }
        long jM6204 = abstractC2899.m6204();
        if (jM6204 == 0 && abstractC2899.f9196) {
            return null;
        }
        return new Date(jM6204);
    }

    @Override // com.alibaba.fastjson2.reader.C2741, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return mo5463(abstractC2899, type, obj, j);
    }
}
