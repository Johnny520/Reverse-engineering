package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2700 extends AbstractC8363 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2700 f8199 = new C2700(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        C2942 c2942 = abstractC2898.f9199;
        boolean zMo6135 = abstractC2898.mo6135();
        boolean z = this.f23070;
        if (zMo6135) {
            long jMo6164 = abstractC2898.mo6164();
            if (z) {
                jMo6164 *= 1000;
            } else {
                c2942.getClass();
            }
            Instant instantOfEpochMilli = Instant.ofEpochMilli(jMo6164);
            ZoneId zoneIdM6351 = c2942.m6351();
            return OffsetDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli, zoneIdM6351), zoneIdM6351.getRules().getOffset(instantOfEpochMilli));
        }
        if (abstractC2898.mo6073()) {
            return null;
        }
        if (this.f23071 == null || this.f23081 || this.f23068) {
            return abstractC2898.mo6146();
        }
        String strMo6139 = abstractC2898.mo6139();
        ZoneId zoneIdM63512 = c2942.m6351();
        if (this.f23069 || z) {
            long j2 = Long.parseLong(strMo6139);
            if (z) {
                j2 *= 1000;
            }
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(j2);
            return OffsetDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli2, zoneIdM63512), zoneIdM63512.getRules().getOffset(instantOfEpochMilli2));
        }
        abstractC2898.m6061();
        DateTimeFormatter dateTimeFormatterM13851 = m13851();
        if (!this.f23077) {
            LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.parse(strMo6139, dateTimeFormatterM13851), LocalTime.MIN);
            return OffsetDateTime.of(localDateTimeOf, zoneIdM63512.getRules().getOffset(localDateTimeOf));
        }
        if (!this.f23067) {
            return ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6139, dateTimeFormatterM13851), zoneIdM63512).toOffsetDateTime();
        }
        LocalDateTime localDateTime = LocalDateTime.parse(strMo6139, dateTimeFormatterM13851);
        return OffsetDateTime.of(localDateTime, zoneIdM63512.getRules().getOffset(localDateTime));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return OffsetDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return mo5418(abstractC2898, type, obj, j);
    }
}
