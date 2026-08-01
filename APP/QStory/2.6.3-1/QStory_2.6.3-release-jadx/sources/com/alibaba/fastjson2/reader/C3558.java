package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import p294.AbstractC9193;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3558 extends AbstractC9193 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C3558 f8638 = new C3558(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        C3776 c3776 = abstractC3732.f9546;
        boolean zMo6741 = abstractC3732.mo6741();
        boolean z = this.f23414;
        if (zMo6741) {
            c3776.getClass();
            long jMo6769 = abstractC3732.mo6769();
            if (z) {
                jMo6769 *= 1000;
            }
            return Instant.ofEpochMilli(jMo6769);
        }
        if (abstractC3732.mo6679()) {
            return null;
        }
        if (this.f23415 == null || this.f23425 || this.f23412 || abstractC3732.mo6737()) {
            return abstractC3732.mo6678();
        }
        String strMo6744 = abstractC3732.mo6744();
        if (strMo6744.isEmpty()) {
            return null;
        }
        if (!this.f23413 && !z) {
            abstractC3732.m6667();
            DateTimeFormatter dateTimeFormatterM14427 = m14427();
            return !this.f23421 ? ZonedDateTime.of(LocalDate.parse(strMo6744, dateTimeFormatterM14427), LocalTime.MIN, c3776.m6969()).toInstant() : !this.f23411 ? ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6744, dateTimeFormatterM14427), c3776.m6969()).toInstant() : ZonedDateTime.of(LocalDateTime.parse(strMo6744, dateTimeFormatterM14427), c3776.m6969()).toInstant();
        }
        long j2 = Long.parseLong(strMo6744);
        if (z) {
            j2 *= 1000;
        }
        return Instant.ofEpochMilli(j2);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return Instant.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return abstractC3732.mo6678();
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo6067(Map map, long j) {
        Number number = (Number) map.get("nano");
        Number number2 = (Number) map.get("epochSecond");
        if (number != null && number2 != null) {
            return Instant.ofEpochSecond(number2.longValue(), number.longValue());
        }
        if (number2 != null) {
            return Instant.ofEpochSecond(number2.longValue());
        }
        Number number3 = (Number) map.get("epochMilli");
        if (number3 != null) {
            return Instant.ofEpochMilli(number3.longValue());
        }
        C1123.m1410("can not create instant.");
        return null;
    }
}
