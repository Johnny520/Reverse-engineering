package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3528 extends AbstractC9193 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C3528 f8515 = new C3528(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.f9544) {
            return abstractC3732.mo6786();
        }
        C3776 c3776 = abstractC3732.f9546;
        if (abstractC3732.mo6679()) {
            return null;
        }
        if (this.f23415 == null || this.f23425 || this.f23412 || abstractC3732.mo6738()) {
            return abstractC3732.mo6786();
        }
        String strMo6744 = abstractC3732.mo6744();
        if (strMo6744.isEmpty() || "null".equals(strMo6744)) {
            return null;
        }
        boolean z = this.f23413;
        boolean z2 = this.f23414;
        if (!z && !z2) {
            c3776.getClass();
            DateTimeFormatter dateTimeFormatterM14427 = m14427();
            return !this.f23421 ? LocalDate.parse(strMo6744, dateTimeFormatterM14427) : !this.f23411 ? LocalDate.of(1970, 1, 1) : LocalDateTime.parse(strMo6744, dateTimeFormatterM14427).toLocalDate();
        }
        long j2 = Long.parseLong(strMo6744);
        if (z2) {
            j2 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), c3776.m6969()).toLocalDate();
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class mo6058() {
        return LocalDate.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return abstractC3732.mo6786();
    }
}
