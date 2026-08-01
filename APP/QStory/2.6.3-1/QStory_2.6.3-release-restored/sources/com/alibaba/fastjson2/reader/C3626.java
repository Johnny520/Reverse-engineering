package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.util.C3683;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3626 extends AbstractC9193 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3626 f8980 = new C3626(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C3683 f8981;

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        ZonedDateTime zonedDateTimeMo6801;
        C3776 c3776 = abstractC3732.f9546;
        boolean zMo6741 = abstractC3732.mo6741();
        boolean z = this.f23414;
        if (zMo6741) {
            long jMo6769 = abstractC3732.mo6769();
            if (z) {
                jMo6769 *= 1000;
            }
            zonedDateTimeMo6801 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(jMo6769), c3776.m6969());
        } else if (abstractC3732.mo6679()) {
            zonedDateTimeMo6801 = null;
        } else if (this.f23415 == null || this.f23425 || this.f23412) {
            zonedDateTimeMo6801 = abstractC3732.mo6801();
        } else {
            String strMo6744 = abstractC3732.mo6744();
            if (this.f23413 || z) {
                long j2 = Long.parseLong(strMo6744);
                if (z) {
                    j2 *= 1000;
                }
                zonedDateTimeMo6801 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j2), c3776.m6969());
            } else {
                abstractC3732.m6667();
                DateTimeFormatter dateTimeFormatterM14427 = m14427();
                zonedDateTimeMo6801 = !this.f23421 ? ZonedDateTime.of(LocalDate.parse(strMo6744, dateTimeFormatterM14427), LocalTime.MIN, c3776.m6969()) : !this.f23411 ? ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6744, dateTimeFormatterM14427), c3776.m6969()) : ZonedDateTime.of(LocalDateTime.parse(strMo6744, dateTimeFormatterM14427), c3776.m6969());
            }
        }
        C3683 c3683 = this.f8981;
        return (c3683 == null || zonedDateTimeMo6801 == null) ? zonedDateTimeMo6801 : c3683.apply(zonedDateTimeMo6801);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return ZonedDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        ZonedDateTime zonedDateTimeMo6801 = abstractC3732.mo6801();
        C3683 c3683 = this.f8981;
        return (c3683 == null || zonedDateTimeMo6801 == null) ? zonedDateTimeMo6801 : c3683.apply(zonedDateTimeMo6801);
    }
}
