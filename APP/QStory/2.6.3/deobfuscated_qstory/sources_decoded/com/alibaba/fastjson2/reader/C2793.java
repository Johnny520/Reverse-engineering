package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.util.C2850;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2793 extends AbstractC8364 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2793 f8635 = new C2793(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2850 f8636;

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        ZonedDateTime zonedDateTimeMo6241;
        C2943 c2943 = abstractC2899.f9201;
        boolean zMo6181 = abstractC2899.mo6181();
        boolean z = this.f23069;
        if (zMo6181) {
            long jMo6209 = abstractC2899.mo6209();
            if (z) {
                jMo6209 *= 1000;
            }
            zonedDateTimeMo6241 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(jMo6209), c2943.m6409());
        } else if (abstractC2899.mo6119()) {
            zonedDateTimeMo6241 = null;
        } else if (this.f23070 == null || this.f23080 || this.f23067) {
            zonedDateTimeMo6241 = abstractC2899.mo6241();
        } else {
            String strMo6184 = abstractC2899.mo6184();
            if (this.f23068 || z) {
                long j2 = Long.parseLong(strMo6184);
                if (z) {
                    j2 *= 1000;
                }
                zonedDateTimeMo6241 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j2), c2943.m6409());
            } else {
                abstractC2899.m6107();
                DateTimeFormatter dateTimeFormatterM13868 = m13868();
                zonedDateTimeMo6241 = !this.f23076 ? ZonedDateTime.of(LocalDate.parse(strMo6184, dateTimeFormatterM13868), LocalTime.MIN, c2943.m6409()) : !this.f23066 ? ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6184, dateTimeFormatterM13868), c2943.m6409()) : ZonedDateTime.of(LocalDateTime.parse(strMo6184, dateTimeFormatterM13868), c2943.m6409());
            }
        }
        C2850 c2850 = this.f8636;
        return (c2850 == null || zonedDateTimeMo6241 == null) ? zonedDateTimeMo6241 : c2850.apply(zonedDateTimeMo6241);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return ZonedDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        ZonedDateTime zonedDateTimeMo6241 = abstractC2899.mo6241();
        C2850 c2850 = this.f8636;
        return (c2850 == null || zonedDateTimeMo6241 == null) ? zonedDateTimeMo6241 : c2850.apply(zonedDateTimeMo6241);
    }
}
