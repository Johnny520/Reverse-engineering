package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import p294.AbstractC9193;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3557 extends AbstractC9193 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C3557 f8637 = new C3557(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        DateTimeFormatter dateTimeFormatterM14428;
        boolean zMo6739 = abstractC3732.mo6739();
        C3776 c3776 = abstractC3732.f9546;
        boolean z = this.f23414;
        if (!zMo6739) {
            if (abstractC3732.mo6679()) {
                return null;
            }
            long jMo6769 = abstractC3732.mo6769();
            if (z) {
                jMo6769 *= 1000;
            } else {
                c3776.getClass();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jMo6769);
            return calendar;
        }
        if (this.f23415 != null && (dateTimeFormatterM14428 = m14428()) != null) {
            String strMo6744 = abstractC3732.mo6744();
            if (strMo6744.isEmpty()) {
                return null;
            }
            long epochMilli = ZonedDateTime.of(LocalDateTime.parse(strMo6744, dateTimeFormatterM14428), c3776.m6969()).toInstant().toEpochMilli();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(epochMilli);
            return calendar2;
        }
        long jM6764 = abstractC3732.m6764();
        if (jM6764 == 0 && abstractC3732.f9541) {
            return null;
        }
        if (z) {
            jM6764 *= 1000;
        }
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(jM6764);
        return calendar3;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return Calendar.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        boolean zMo6741 = abstractC3732.mo6741();
        boolean z = this.f23414;
        if (zMo6741) {
            long jMo6769 = abstractC3732.mo6769();
            if (z) {
                jMo6769 *= 1000;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jMo6769);
            return calendar;
        }
        if (abstractC3732.mo6679()) {
            return null;
        }
        long jM6764 = abstractC3732.m6764();
        if (z) {
            jM6764 *= 1000;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM6764);
        return calendar2;
    }
}
