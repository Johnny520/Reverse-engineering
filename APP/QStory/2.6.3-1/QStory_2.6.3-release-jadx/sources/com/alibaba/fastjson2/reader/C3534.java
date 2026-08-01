package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3534 extends AbstractC9193 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C3534 f8546 = new C3534(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        C3776 c3776 = abstractC3732.f9546;
        boolean zMo6741 = abstractC3732.mo6741();
        boolean z = this.f23414;
        if (zMo6741) {
            long jMo6769 = abstractC3732.mo6769();
            if (z) {
                jMo6769 *= 1000;
            } else {
                c3776.getClass();
            }
            Instant instantOfEpochMilli = Instant.ofEpochMilli(jMo6769);
            ZoneId zoneIdM6969 = c3776.m6969();
            return OffsetDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli, zoneIdM6969), zoneIdM6969.getRules().getOffset(instantOfEpochMilli));
        }
        if (abstractC3732.mo6679()) {
            return null;
        }
        if (this.f23415 == null || this.f23425 || this.f23412) {
            return abstractC3732.mo6751();
        }
        String strMo6744 = abstractC3732.mo6744();
        ZoneId zoneIdM69692 = c3776.m6969();
        if (this.f23413 || z) {
            long j2 = Long.parseLong(strMo6744);
            if (z) {
                j2 *= 1000;
            }
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(j2);
            return OffsetDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli2, zoneIdM69692), zoneIdM69692.getRules().getOffset(instantOfEpochMilli2));
        }
        abstractC3732.m6667();
        DateTimeFormatter dateTimeFormatterM14427 = m14427();
        if (!this.f23421) {
            LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.parse(strMo6744, dateTimeFormatterM14427), LocalTime.MIN);
            return OffsetDateTime.of(localDateTimeOf, zoneIdM69692.getRules().getOffset(localDateTimeOf));
        }
        if (!this.f23411) {
            return ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6744, dateTimeFormatterM14427), zoneIdM69692).toOffsetDateTime();
        }
        LocalDateTime localDateTime = LocalDateTime.parse(strMo6744, dateTimeFormatterM14427);
        return OffsetDateTime.of(localDateTime, zoneIdM69692.getRules().getOffset(localDateTime));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return OffsetDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return mo6023(abstractC3732, type, obj, j);
    }
}
