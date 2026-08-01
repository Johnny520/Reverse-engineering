package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3666 extends AbstractC9193 implements InterfaceC9352 {
    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        Timestamp timestamp = (Timestamp) obj;
        if (this.f23415 != null) {
            mo6239(abstractC3730, obj, obj2, type, j);
        } else {
            abstractC3730.mo6535(timestamp.toLocalDateTime());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.time.LocalDateTime] */
    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        Timestamp timestamp = (Timestamp) obj;
        if (this.f23414) {
            abstractC3730.mo6523(timestamp.getTime() / 1000);
            return;
        }
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(timestamp.toInstant(), c3728.m6585());
        int totalSeconds = zonedDateTimeOfInstant.getOffset().getTotalSeconds();
        if (this.f23412 && zonedDateTimeOfInstant.getNano() % 1000000 == 0) {
            abstractC3730.mo6538(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, totalSeconds, true);
            return;
        }
        DateTimeFormatter dateTimeFormatterM14428 = m14428();
        if (dateTimeFormatterM14428 == null) {
            dateTimeFormatterM14428 = null;
        }
        if (dateTimeFormatterM14428 != null) {
            abstractC3730.mo6577(dateTimeFormatterM14428.format(zonedDateTimeOfInstant));
            return;
        }
        if (this.f23413) {
            abstractC3730.mo6523(timestamp.getTime());
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
            abstractC3730.mo6538(year, monthValue, dayOfMonth, hour, minute, second, nanos / 1000000, totalSeconds, false);
        } else {
            abstractC3730.mo6535(zonedDateTimeOfInstant.toLocalDateTime());
        }
    }
}
