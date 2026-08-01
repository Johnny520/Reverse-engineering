package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import p278.AbstractC8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2725 extends AbstractC8364 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2725 f8293 = new C2725(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        C2943 c2943 = abstractC2899.f9201;
        boolean zMo6181 = abstractC2899.mo6181();
        boolean z = this.f23069;
        if (zMo6181) {
            c2943.getClass();
            long jMo6209 = abstractC2899.mo6209();
            if (z) {
                jMo6209 *= 1000;
            }
            return Instant.ofEpochMilli(jMo6209);
        }
        if (abstractC2899.mo6119()) {
            return null;
        }
        if (this.f23070 == null || this.f23080 || this.f23067 || abstractC2899.mo6177()) {
            return abstractC2899.mo6118();
        }
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184.isEmpty()) {
            return null;
        }
        if (!this.f23068 && !z) {
            abstractC2899.m6107();
            DateTimeFormatter dateTimeFormatterM13868 = m13868();
            return !this.f23076 ? ZonedDateTime.of(LocalDate.parse(strMo6184, dateTimeFormatterM13868), LocalTime.MIN, c2943.m6409()).toInstant() : !this.f23066 ? ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6184, dateTimeFormatterM13868), c2943.m6409()).toInstant() : ZonedDateTime.of(LocalDateTime.parse(strMo6184, dateTimeFormatterM13868), c2943.m6409()).toInstant();
        }
        long j2 = Long.parseLong(strMo6184);
        if (z) {
            j2 *= 1000;
        }
        return Instant.ofEpochMilli(j2);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return Instant.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return abstractC2899.mo6118();
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5507(Map map, long j) {
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
        C0276.m850("can not create instant.");
        return null;
    }
}
