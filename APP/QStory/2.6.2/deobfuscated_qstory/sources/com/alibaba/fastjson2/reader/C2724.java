package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import p278.AbstractC8363;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2724 extends AbstractC8363 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2724 f8291 = new C2724(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        C2942 c2942 = abstractC2898.f9199;
        boolean zMo6135 = abstractC2898.mo6135();
        boolean z = this.f23070;
        if (zMo6135) {
            c2942.getClass();
            long jMo6164 = abstractC2898.mo6164();
            if (z) {
                jMo6164 *= 1000;
            }
            return Instant.ofEpochMilli(jMo6164);
        }
        if (abstractC2898.mo6073()) {
            return null;
        }
        if (this.f23071 == null || this.f23081 || this.f23068 || abstractC2898.mo6131()) {
            return abstractC2898.mo6072();
        }
        String strMo6139 = abstractC2898.mo6139();
        if (strMo6139.isEmpty()) {
            return null;
        }
        if (!this.f23069 && !z) {
            abstractC2898.m6061();
            DateTimeFormatter dateTimeFormatterM13851 = m13851();
            return !this.f23077 ? ZonedDateTime.of(LocalDate.parse(strMo6139, dateTimeFormatterM13851), LocalTime.MIN, c2942.m6351()).toInstant() : !this.f23067 ? ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6139, dateTimeFormatterM13851), c2942.m6351()).toInstant() : ZonedDateTime.of(LocalDateTime.parse(strMo6139, dateTimeFormatterM13851), c2942.m6351()).toInstant();
        }
        long j2 = Long.parseLong(strMo6139);
        if (z) {
            j2 *= 1000;
        }
        return Instant.ofEpochMilli(j2);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return Instant.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return abstractC2898.mo6072();
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5462(Map map, long j) {
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
        C0276.m849("can not create instant.");
        return null;
    }
}
