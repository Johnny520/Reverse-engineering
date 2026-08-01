package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2833 extends AbstractC8364 implements InterfaceC8523 {
    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        Timestamp timestamp = (Timestamp) obj;
        if (this.f23070 != null) {
            mo5679(abstractC2897, obj, obj2, type, j);
        } else {
            abstractC2897.mo5975(timestamp.toLocalDateTime());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.time.LocalDateTime] */
    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        C2895 c2895 = abstractC2897.f9178;
        Timestamp timestamp = (Timestamp) obj;
        if (this.f23069) {
            abstractC2897.mo5963(timestamp.getTime() / 1000);
            return;
        }
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(timestamp.toInstant(), c2895.m6025());
        int totalSeconds = zonedDateTimeOfInstant.getOffset().getTotalSeconds();
        if (this.f23067 && zonedDateTimeOfInstant.getNano() % 1000000 == 0) {
            abstractC2897.mo5978(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, totalSeconds, true);
            return;
        }
        DateTimeFormatter dateTimeFormatterM13869 = m13869();
        if (dateTimeFormatterM13869 == null) {
            dateTimeFormatterM13869 = null;
        }
        if (dateTimeFormatterM13869 != null) {
            abstractC2897.mo6017(dateTimeFormatterM13869.format(zonedDateTimeOfInstant));
            return;
        }
        if (this.f23068) {
            abstractC2897.mo5963(timestamp.getTime());
            return;
        }
        int nanos = timestamp.getNanos();
        int year = zonedDateTimeOfInstant.getYear();
        int monthValue = zonedDateTimeOfInstant.getMonthValue();
        int dayOfMonth = zonedDateTimeOfInstant.getDayOfMonth();
        int hour = zonedDateTimeOfInstant.getHour();
        int minute = zonedDateTimeOfInstant.getMinute();
        int second = zonedDateTimeOfInstant.getSecond();
        if (nanos % 1000000 == 0) {
            abstractC2897.mo5978(year, monthValue, dayOfMonth, hour, minute, second, nanos / 1000000, totalSeconds, false);
        } else {
            abstractC2897.mo5975(zonedDateTimeOfInstant.toLocalDateTime());
        }
    }
}
