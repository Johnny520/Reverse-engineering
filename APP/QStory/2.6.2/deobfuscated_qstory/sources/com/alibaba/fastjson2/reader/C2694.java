package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2694 extends AbstractC8363 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2694 f8168 = new C2694(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.f9197) {
            return abstractC2898.mo6181();
        }
        C2942 c2942 = abstractC2898.f9199;
        if (abstractC2898.mo6073()) {
            return null;
        }
        if (this.f23071 == null || this.f23081 || this.f23068 || abstractC2898.mo6132()) {
            return abstractC2898.mo6181();
        }
        String strMo6139 = abstractC2898.mo6139();
        if (strMo6139.isEmpty() || "null".equals(strMo6139)) {
            return null;
        }
        boolean z = this.f23069;
        boolean z2 = this.f23070;
        if (!z && !z2) {
            c2942.getClass();
            DateTimeFormatter dateTimeFormatterM13851 = m13851();
            return !this.f23077 ? LocalDate.parse(strMo6139, dateTimeFormatterM13851) : !this.f23067 ? LocalDate.of(1970, 1, 1) : LocalDateTime.parse(strMo6139, dateTimeFormatterM13851).toLocalDate();
        }
        long j2 = Long.parseLong(strMo6139);
        if (z2) {
            j2 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), c2942.m6351()).toLocalDate();
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class mo5453() {
        return LocalDate.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return abstractC2898.mo6181();
    }
}
