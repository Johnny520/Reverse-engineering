package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2701 extends AbstractC8364 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2701 f8201 = new C2701(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        C2943 c2943 = abstractC2899.f9201;
        boolean zMo6181 = abstractC2899.mo6181();
        boolean z = this.f23069;
        if (zMo6181) {
            long jMo6209 = abstractC2899.mo6209();
            if (z) {
                jMo6209 *= 1000;
            } else {
                c2943.getClass();
            }
            Instant instantOfEpochMilli = Instant.ofEpochMilli(jMo6209);
            ZoneId zoneIdM6409 = c2943.m6409();
            return OffsetDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli, zoneIdM6409), zoneIdM6409.getRules().getOffset(instantOfEpochMilli));
        }
        if (abstractC2899.mo6119()) {
            return null;
        }
        if (this.f23070 == null || this.f23080 || this.f23067) {
            return abstractC2899.mo6191();
        }
        String strMo6184 = abstractC2899.mo6184();
        ZoneId zoneIdM64092 = c2943.m6409();
        if (this.f23068 || z) {
            long j2 = Long.parseLong(strMo6184);
            if (z) {
                j2 *= 1000;
            }
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(j2);
            return OffsetDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli2, zoneIdM64092), zoneIdM64092.getRules().getOffset(instantOfEpochMilli2));
        }
        abstractC2899.m6107();
        DateTimeFormatter dateTimeFormatterM13868 = m13868();
        if (!this.f23076) {
            LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.parse(strMo6184, dateTimeFormatterM13868), LocalTime.MIN);
            return OffsetDateTime.of(localDateTimeOf, zoneIdM64092.getRules().getOffset(localDateTimeOf));
        }
        if (!this.f23066) {
            return ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6184, dateTimeFormatterM13868), zoneIdM64092).toOffsetDateTime();
        }
        LocalDateTime localDateTime = LocalDateTime.parse(strMo6184, dateTimeFormatterM13868);
        return OffsetDateTime.of(localDateTime, zoneIdM64092.getRules().getOffset(localDateTime));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return OffsetDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return mo5463(abstractC2899, type, obj, j);
    }
}
