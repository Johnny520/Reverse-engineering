package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.reader.C3574;
import java.lang.reflect.Type;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3669 extends C3574 {
    @Override // com.alibaba.fastjson2.reader.C3574, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        long epochMilli;
        ChronoZonedDateTime<LocalDate> chronoZonedDateTimeMo6801;
        boolean zMo6741 = abstractC3732.mo6741();
        boolean z = this.f23414;
        if (zMo6741) {
            long jMo6769 = abstractC3732.mo6769();
            if (z) {
                jMo6769 *= 1000;
            }
            return new Time(jMo6769);
        }
        LocalTime localTimeOf = null;
        if (!abstractC3732.mo6679()) {
            if (this.f23412 || this.f23413) {
                return new Time(abstractC3732.m6764());
            }
            if (z) {
                return new Time(abstractC3732.mo6770().longValue() * 1000);
            }
            if (this.f23415 != null) {
                abstractC3732.m6667();
                DateTimeFormatter dateTimeFormatterM14427 = m14427();
                if (dateTimeFormatterM14427 != null) {
                    String strMo6744 = abstractC3732.mo6744();
                    if (!strMo6744.isEmpty()) {
                        chronoZonedDateTimeMo6801 = (!this.f23421 ? LocalDateTime.of(LocalDate.parse(strMo6744, dateTimeFormatterM14427), LocalTime.MIN) : !this.f23411 ? LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6744, dateTimeFormatterM14427)) : LocalDateTime.parse(strMo6744, dateTimeFormatterM14427)).atZone(abstractC3732.f9546.m6969());
                    }
                } else {
                    chronoZonedDateTimeMo6801 = abstractC3732.mo6801();
                }
                epochMilli = chronoZonedDateTimeMo6801.toInstant().toEpochMilli();
                return new Time(epochMilli);
            }
            String strMo67442 = abstractC3732.mo6744();
            if ("0000-00-00".equals(strMo67442) || "0000-00-00 00:00:00".equals(strMo67442)) {
                epochMilli = 0;
            } else if (strMo67442.length() == 9 && strMo67442.charAt(8) == 'Z') {
                char cCharAt = strMo67442.charAt(0);
                char cCharAt2 = strMo67442.charAt(1);
                char cCharAt3 = strMo67442.charAt(2);
                char cCharAt4 = strMo67442.charAt(3);
                char cCharAt5 = strMo67442.charAt(4);
                char cCharAt6 = strMo67442.charAt(5);
                char cCharAt7 = strMo67442.charAt(6);
                char cCharAt8 = strMo67442.charAt(7);
                ZoneId zoneId = AbstractC3699.f9372;
                if (cCharAt3 == ':' && cCharAt6 == ':' && cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    int i = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '9') {
                        int i2 = (cCharAt5 - '0') + ((cCharAt4 - '0') * 10);
                        if (cCharAt7 >= '0' && cCharAt7 <= '9' && cCharAt8 >= '0' && cCharAt8 <= '9') {
                            localTimeOf = LocalTime.of(i, i2, (cCharAt8 - '0') + ((cCharAt7 - '0') * 10));
                        }
                    }
                }
                epochMilli = LocalDateTime.of(AbstractC3699.f9368, localTimeOf).atZone(AbstractC3699.f9372).toInstant().toEpochMilli();
            } else if (!strMo67442.isEmpty() && !"null".equals(strMo67442)) {
                return Time.valueOf(strMo67442);
            }
            return new Time(epochMilli);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3574, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return mo6023(abstractC3732, type, obj, j);
    }
}
