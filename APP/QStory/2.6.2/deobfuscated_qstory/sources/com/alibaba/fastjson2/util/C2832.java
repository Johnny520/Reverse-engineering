package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2832 extends AbstractC8363 implements InterfaceC8531 {
    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        Timestamp timestamp = (Timestamp) obj;
        if (this.f23071 != null) {
            mo5634(abstractC2896, obj, obj2, type, j);
        } else {
            abstractC2896.mo5930(timestamp.toLocalDateTime());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.time.LocalDateTime] */
    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        C2894 c2894 = abstractC2896.f9176;
        Timestamp timestamp = (Timestamp) obj;
        if (this.f23070) {
            abstractC2896.mo5918(timestamp.getTime() / 1000);
            return;
        }
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(timestamp.toInstant(), c2894.m5980());
        int totalSeconds = zonedDateTimeOfInstant.getOffset().getTotalSeconds();
        if (this.f23068 && zonedDateTimeOfInstant.getNano() % 1000000 == 0) {
            abstractC2896.mo5933(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, totalSeconds, true);
            return;
        }
        DateTimeFormatter dateTimeFormatterM13852 = m13852();
        if (dateTimeFormatterM13852 == null) {
            dateTimeFormatterM13852 = null;
        }
        if (dateTimeFormatterM13852 != null) {
            abstractC2896.mo5972(dateTimeFormatterM13852.format(zonedDateTimeOfInstant));
            return;
        }
        if (this.f23069) {
            abstractC2896.mo5918(timestamp.getTime());
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
            abstractC2896.mo5933(year, monthValue, dayOfMonth, hour, minute, second, nanos / 1000000, totalSeconds, false);
        } else {
            abstractC2896.mo5930(zonedDateTimeOfInstant.toLocalDateTime());
        }
    }
}
