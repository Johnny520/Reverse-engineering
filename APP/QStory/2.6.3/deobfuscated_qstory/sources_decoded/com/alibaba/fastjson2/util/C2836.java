package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.reader.C2741;
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
public final class C2836 extends C2741 {
    @Override // com.alibaba.fastjson2.reader.C2741, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        long epochMilli;
        ChronoZonedDateTime<LocalDate> chronoZonedDateTimeMo6241;
        boolean zMo6181 = abstractC2899.mo6181();
        boolean z = this.f23069;
        if (zMo6181) {
            long jMo6209 = abstractC2899.mo6209();
            if (z) {
                jMo6209 *= 1000;
            }
            return new Time(jMo6209);
        }
        LocalTime localTimeOf = null;
        if (!abstractC2899.mo6119()) {
            if (this.f23067 || this.f23068) {
                return new Time(abstractC2899.m6204());
            }
            if (z) {
                return new Time(abstractC2899.mo6210().longValue() * 1000);
            }
            if (this.f23070 != null) {
                abstractC2899.m6107();
                DateTimeFormatter dateTimeFormatterM13868 = m13868();
                if (dateTimeFormatterM13868 != null) {
                    String strMo6184 = abstractC2899.mo6184();
                    if (!strMo6184.isEmpty()) {
                        chronoZonedDateTimeMo6241 = (!this.f23076 ? LocalDateTime.of(LocalDate.parse(strMo6184, dateTimeFormatterM13868), LocalTime.MIN) : !this.f23066 ? LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6184, dateTimeFormatterM13868)) : LocalDateTime.parse(strMo6184, dateTimeFormatterM13868)).atZone(abstractC2899.f9201.m6409());
                    }
                } else {
                    chronoZonedDateTimeMo6241 = abstractC2899.mo6241();
                }
                epochMilli = chronoZonedDateTimeMo6241.toInstant().toEpochMilli();
                return new Time(epochMilli);
            }
            String strMo61842 = abstractC2899.mo6184();
            if ("0000-00-00".equals(strMo61842) || "0000-00-00 00:00:00".equals(strMo61842)) {
                epochMilli = 0;
            } else if (strMo61842.length() == 9 && strMo61842.charAt(8) == 'Z') {
                char cCharAt = strMo61842.charAt(0);
                char cCharAt2 = strMo61842.charAt(1);
                char cCharAt3 = strMo61842.charAt(2);
                char cCharAt4 = strMo61842.charAt(3);
                char cCharAt5 = strMo61842.charAt(4);
                char cCharAt6 = strMo61842.charAt(5);
                char cCharAt7 = strMo61842.charAt(6);
                char cCharAt8 = strMo61842.charAt(7);
                ZoneId zoneId = AbstractC2866.f9027;
                if (cCharAt3 == ':' && cCharAt6 == ':' && cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    int i = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '9') {
                        int i2 = (cCharAt5 - '0') + ((cCharAt4 - '0') * 10);
                        if (cCharAt7 >= '0' && cCharAt7 <= '9' && cCharAt8 >= '0' && cCharAt8 <= '9') {
                            localTimeOf = LocalTime.of(i, i2, (cCharAt8 - '0') + ((cCharAt7 - '0') * 10));
                        }
                    }
                }
                epochMilli = LocalDateTime.of(AbstractC2866.f9023, localTimeOf).atZone(AbstractC2866.f9027).toInstant().toEpochMilli();
            } else if (!strMo61842.isEmpty() && !"null".equals(strMo61842)) {
                return Time.valueOf(strMo61842);
            }
            return new Time(epochMilli);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2741, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return mo5463(abstractC2899, type, obj, j);
    }
}
