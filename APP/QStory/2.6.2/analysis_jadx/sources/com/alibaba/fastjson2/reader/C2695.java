package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2695 extends AbstractC8363 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2695 f8169 = new C2695(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        DateTimeFormatter dateTimeFormatterM13852;
        if (abstractC2898.f9197) {
            return abstractC2898.mo6176();
        }
        C2942 c2942 = abstractC2898.f9199;
        boolean zMo6135 = abstractC2898.mo6135();
        boolean z = this.f23068;
        boolean z2 = this.f23069;
        boolean z3 = this.f23081;
        boolean z4 = this.f23070;
        if (zMo6135) {
            if (!z3 && !z2 && !z && !z4 && (dateTimeFormatterM13852 = m13852()) != null) {
                return LocalDateTime.parse(abstractC2898.mo6139(), dateTimeFormatterM13852);
            }
            long jMo6164 = abstractC2898.mo6164();
            if (z4) {
                jMo6164 *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(jMo6164), c2942.m6351());
        }
        if (abstractC2898.mo6073()) {
            return null;
        }
        if (this.f23071 == null || this.f23072 || this.f23073 || z3 || z) {
            return abstractC2898.mo6176();
        }
        String strMo6139 = abstractC2898.mo6139();
        if (strMo6139.isEmpty()) {
            return null;
        }
        if (!z2 && !z4) {
            c2942.getClass();
            DateTimeFormatter dateTimeFormatterM13851 = m13851();
            return !this.f23077 ? LocalDateTime.of(LocalDate.parse(strMo6139, dateTimeFormatterM13851), LocalTime.MIN) : !this.f23067 ? LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6139, dateTimeFormatterM13851)) : LocalDateTime.parse(strMo6139, dateTimeFormatterM13851);
        }
        long j2 = Long.parseLong(strMo6139);
        if (z4) {
            j2 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), c2942.m6351());
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return LocalDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return abstractC2898.mo6176();
    }
}
