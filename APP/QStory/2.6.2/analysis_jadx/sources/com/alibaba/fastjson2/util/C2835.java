package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.reader.C2740;
import java.lang.reflect.Type;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2835 extends C2740 {
    @Override // com.alibaba.fastjson2.reader.C2740, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        long epochMilli;
        ChronoZonedDateTime<LocalDate> chronoZonedDateTimeMo6196;
        boolean zMo6135 = abstractC2898.mo6135();
        boolean z = this.f23070;
        if (zMo6135) {
            long jMo6164 = abstractC2898.mo6164();
            if (z) {
                jMo6164 *= 1000;
            }
            return new Time(jMo6164);
        }
        LocalTime localTimeOf = null;
        if (!abstractC2898.mo6073()) {
            if (this.f23068 || this.f23069) {
                return new Time(abstractC2898.m6159());
            }
            if (z) {
                return new Time(abstractC2898.mo6165().longValue() * 1000);
            }
            if (this.f23071 != null) {
                abstractC2898.m6061();
                DateTimeFormatter dateTimeFormatterM13851 = m13851();
                if (dateTimeFormatterM13851 != null) {
                    String strMo6139 = abstractC2898.mo6139();
                    if (!strMo6139.isEmpty()) {
                        chronoZonedDateTimeMo6196 = (!this.f23077 ? LocalDateTime.of(LocalDate.parse(strMo6139, dateTimeFormatterM13851), LocalTime.MIN) : !this.f23067 ? LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6139, dateTimeFormatterM13851)) : LocalDateTime.parse(strMo6139, dateTimeFormatterM13851)).atZone(abstractC2898.f9199.m6351());
                    }
                } else {
                    chronoZonedDateTimeMo6196 = abstractC2898.mo6196();
                }
                epochMilli = chronoZonedDateTimeMo6196.toInstant().toEpochMilli();
                return new Time(epochMilli);
            }
            String strMo61392 = abstractC2898.mo6139();
            if ("0000-00-00".equals(strMo61392) || "0000-00-00 00:00:00".equals(strMo61392)) {
                epochMilli = 0;
            } else if (strMo61392.length() == 9 && strMo61392.charAt(8) == 'Z') {
                char cCharAt = strMo61392.charAt(0);
                char cCharAt2 = strMo61392.charAt(1);
                char cCharAt3 = strMo61392.charAt(2);
                char cCharAt4 = strMo61392.charAt(3);
                char cCharAt5 = strMo61392.charAt(4);
                char cCharAt6 = strMo61392.charAt(5);
                char cCharAt7 = strMo61392.charAt(6);
                char cCharAt8 = strMo61392.charAt(7);
                ZoneId zoneId = AbstractC2865.f9025;
                if (cCharAt3 == ':' && cCharAt6 == ':' && cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    int i = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '9') {
                        int i2 = (cCharAt5 - '0') + ((cCharAt4 - '0') * 10);
                        if (cCharAt7 >= '0' && cCharAt7 <= '9' && cCharAt8 >= '0' && cCharAt8 <= '9') {
                            localTimeOf = LocalTime.of(i, i2, (cCharAt8 - '0') + ((cCharAt7 - '0') * 10));
                        }
                    }
                }
                epochMilli = LocalDateTime.of(AbstractC2865.f9021, localTimeOf).atZone(AbstractC2865.f9025).toInstant().toEpochMilli();
            } else if (!strMo61392.isEmpty() && !"null".equals(strMo61392)) {
                return Time.valueOf(strMo61392);
            }
            return new Time(epochMilli);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2740, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return mo5418(abstractC2898, type, obj, j);
    }
}
