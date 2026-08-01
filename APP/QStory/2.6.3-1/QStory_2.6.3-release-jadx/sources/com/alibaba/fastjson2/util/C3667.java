package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.reader.C3574;
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
public final class C3667 extends C3574 {
    @Override // com.alibaba.fastjson2.reader.C3574, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        boolean zMo6741 = abstractC3732.mo6741();
        C3776 c3776 = abstractC3732.f9546;
        if (zMo6741) {
            long jMo6769 = abstractC3732.mo6769();
            if (this.f23414) {
                jMo6769 *= 1000;
            }
            return new Timestamp(jMo6769);
        }
        if (abstractC3732.mo6711()) {
            return null;
        }
        if (this.f23415 == null || this.f23412 || this.f23413) {
            LocalDateTime localDateTimeMo6781 = abstractC3732.mo6781();
            if (localDateTimeMo6781 != null) {
                return Timestamp.valueOf(localDateTimeMo6781);
            }
            if (abstractC3732.f9541) {
                return null;
            }
            long jM6764 = abstractC3732.m6764();
            if (jM6764 == 0 && abstractC3732.f9541) {
                return null;
            }
            return new Timestamp(jM6764);
        }
        String strMo6744 = abstractC3732.mo6744();
        if (strMo6744.isEmpty()) {
            return null;
        }
        DateTimeFormatter dateTimeFormatterM14428 = m14428();
        Instant instant = !this.f23421 ? LocalDateTime.of(LocalDate.parse(strMo6744, dateTimeFormatterM14428), LocalTime.MIN).atZone(c3776.m6969()).toInstant() : LocalDateTime.parse(strMo6744, dateTimeFormatterM14428).atZone(c3776.m6969()).toInstant();
        long epochMilli = instant.toEpochMilli();
        int nano = instant.getNano();
        Timestamp timestamp = new Timestamp(epochMilli);
        if (nano != 0) {
            timestamp.setNanos(nano);
        }
        return timestamp;
    }

    @Override // com.alibaba.fastjson2.reader.C3574, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6741()) {
            long jMo6769 = abstractC3732.mo6769();
            if (this.f23414) {
                jMo6769 *= 1000;
            }
            return new Timestamp(jMo6769);
        }
        if (abstractC3732.mo6679()) {
            return null;
        }
        if (abstractC3732.mo6743() != -88) {
            return mo6023(abstractC3732, type, obj, j);
        }
        Instant instant = abstractC3732.mo6781().atZone(abstractC3732.f9546.m6969()).toInstant();
        long epochMilli = instant.toEpochMilli();
        int nano = instant.getNano();
        Timestamp timestamp = new Timestamp(epochMilli);
        if (nano != 0) {
            timestamp.setNanos(nano);
        }
        return timestamp;
    }
}
