package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3529 extends AbstractC9193 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C3529 f8516 = new C3529(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        DateTimeFormatter dateTimeFormatterM14428;
        if (abstractC3732.f9544) {
            return abstractC3732.mo6781();
        }
        C3776 c3776 = abstractC3732.f9546;
        boolean zMo6741 = abstractC3732.mo6741();
        boolean z = this.f23412;
        boolean z2 = this.f23413;
        boolean z3 = this.f23425;
        boolean z4 = this.f23414;
        if (zMo6741) {
            if (!z3 && !z2 && !z && !z4 && (dateTimeFormatterM14428 = m14428()) != null) {
                return LocalDateTime.parse(abstractC3732.mo6744(), dateTimeFormatterM14428);
            }
            long jMo6769 = abstractC3732.mo6769();
            if (z4) {
                jMo6769 *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(jMo6769), c3776.m6969());
        }
        if (abstractC3732.mo6679()) {
            return null;
        }
        if (this.f23415 == null || this.f23416 || this.f23417 || z3 || z) {
            return abstractC3732.mo6781();
        }
        String strMo6744 = abstractC3732.mo6744();
        if (strMo6744.isEmpty()) {
            return null;
        }
        if (!z2 && !z4) {
            c3776.getClass();
            DateTimeFormatter dateTimeFormatterM14427 = m14427();
            return !this.f23421 ? LocalDateTime.of(LocalDate.parse(strMo6744, dateTimeFormatterM14427), LocalTime.MIN) : !this.f23411 ? LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6744, dateTimeFormatterM14427)) : LocalDateTime.parse(strMo6744, dateTimeFormatterM14427);
        }
        long j2 = Long.parseLong(strMo6744);
        if (z4) {
            j2 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), c3776.m6969());
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return LocalDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return abstractC3732.mo6781();
    }
}
