package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.reader.C2741;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2834 extends C2741 {
    @Override // com.alibaba.fastjson2.reader.C2741, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        boolean zMo6181 = abstractC2899.mo6181();
        C2943 c2943 = abstractC2899.f9201;
        if (zMo6181) {
            long jMo6209 = abstractC2899.mo6209();
            if (this.f23069) {
                jMo6209 *= 1000;
            }
            return new Timestamp(jMo6209);
        }
        if (abstractC2899.mo6151()) {
            return null;
        }
        if (this.f23070 == null || this.f23067 || this.f23068) {
            LocalDateTime localDateTimeMo6221 = abstractC2899.mo6221();
            if (localDateTimeMo6221 != null) {
                return Timestamp.valueOf(localDateTimeMo6221);
            }
            if (abstractC2899.f9196) {
                return null;
            }
            long jM6204 = abstractC2899.m6204();
            if (jM6204 == 0 && abstractC2899.f9196) {
                return null;
            }
            return new Timestamp(jM6204);
        }
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184.isEmpty()) {
            return null;
        }
        DateTimeFormatter dateTimeFormatterM13869 = m13869();
        Instant instant = !this.f23076 ? LocalDateTime.of(LocalDate.parse(strMo6184, dateTimeFormatterM13869), LocalTime.MIN).atZone(c2943.m6409()).toInstant() : LocalDateTime.parse(strMo6184, dateTimeFormatterM13869).atZone(c2943.m6409()).toInstant();
        long epochMilli = instant.toEpochMilli();
        int nano = instant.getNano();
        Timestamp timestamp = new Timestamp(epochMilli);
        if (nano != 0) {
            timestamp.setNanos(nano);
        }
        return timestamp;
    }

    @Override // com.alibaba.fastjson2.reader.C2741, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6181()) {
            long jMo6209 = abstractC2899.mo6209();
            if (this.f23069) {
                jMo6209 *= 1000;
            }
            return new Timestamp(jMo6209);
        }
        if (abstractC2899.mo6119()) {
            return null;
        }
        if (abstractC2899.mo6183() != -88) {
            return mo5463(abstractC2899, type, obj, j);
        }
        Instant instant = abstractC2899.mo6221().atZone(abstractC2899.f9201.m6409()).toInstant();
        long epochMilli = instant.toEpochMilli();
        int nano = instant.getNano();
        Timestamp timestamp = new Timestamp(epochMilli);
        if (nano != 0) {
            timestamp.setNanos(nano);
        }
        return timestamp;
    }
}
