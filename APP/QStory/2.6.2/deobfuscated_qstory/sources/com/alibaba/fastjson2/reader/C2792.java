package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.util.C2849;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2792 extends AbstractC8363 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2792 f8633 = new C2792(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2849 f8634;

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        ZonedDateTime zonedDateTimeMo6196;
        C2942 c2942 = abstractC2898.f9199;
        boolean zMo6135 = abstractC2898.mo6135();
        boolean z = this.f23070;
        if (zMo6135) {
            long jMo6164 = abstractC2898.mo6164();
            if (z) {
                jMo6164 *= 1000;
            }
            zonedDateTimeMo6196 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(jMo6164), c2942.m6351());
        } else if (abstractC2898.mo6073()) {
            zonedDateTimeMo6196 = null;
        } else if (this.f23071 == null || this.f23081 || this.f23068) {
            zonedDateTimeMo6196 = abstractC2898.mo6196();
        } else {
            String strMo6139 = abstractC2898.mo6139();
            if (this.f23069 || z) {
                long j2 = Long.parseLong(strMo6139);
                if (z) {
                    j2 *= 1000;
                }
                zonedDateTimeMo6196 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j2), c2942.m6351());
            } else {
                abstractC2898.m6061();
                DateTimeFormatter dateTimeFormatterM13851 = m13851();
                zonedDateTimeMo6196 = !this.f23077 ? ZonedDateTime.of(LocalDate.parse(strMo6139, dateTimeFormatterM13851), LocalTime.MIN, c2942.m6351()) : !this.f23067 ? ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6139, dateTimeFormatterM13851), c2942.m6351()) : ZonedDateTime.of(LocalDateTime.parse(strMo6139, dateTimeFormatterM13851), c2942.m6351());
            }
        }
        C2849 c2849 = this.f8634;
        return (c2849 == null || zonedDateTimeMo6196 == null) ? zonedDateTimeMo6196 : c2849.apply(zonedDateTimeMo6196);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return ZonedDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        ZonedDateTime zonedDateTimeMo6196 = abstractC2898.mo6196();
        C2849 c2849 = this.f8634;
        return (c2849 == null || zonedDateTimeMo6196 == null) ? zonedDateTimeMo6196 : c2849.apply(zonedDateTimeMo6196);
    }
}
