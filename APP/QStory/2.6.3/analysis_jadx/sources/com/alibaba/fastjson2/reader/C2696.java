package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2696 extends AbstractC8364 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2696 f8171 = new C2696(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        DateTimeFormatter dateTimeFormatterM13869;
        if (abstractC2899.f9199) {
            return abstractC2899.mo6221();
        }
        C2943 c2943 = abstractC2899.f9201;
        boolean zMo6181 = abstractC2899.mo6181();
        boolean z = this.f23067;
        boolean z2 = this.f23068;
        boolean z3 = this.f23080;
        boolean z4 = this.f23069;
        if (zMo6181) {
            if (!z3 && !z2 && !z && !z4 && (dateTimeFormatterM13869 = m13869()) != null) {
                return LocalDateTime.parse(abstractC2899.mo6184(), dateTimeFormatterM13869);
            }
            long jMo6209 = abstractC2899.mo6209();
            if (z4) {
                jMo6209 *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(jMo6209), c2943.m6409());
        }
        if (abstractC2899.mo6119()) {
            return null;
        }
        if (this.f23070 == null || this.f23071 || this.f23072 || z3 || z) {
            return abstractC2899.mo6221();
        }
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184.isEmpty()) {
            return null;
        }
        if (!z2 && !z4) {
            c2943.getClass();
            DateTimeFormatter dateTimeFormatterM13868 = m13868();
            return !this.f23076 ? LocalDateTime.of(LocalDate.parse(strMo6184, dateTimeFormatterM13868), LocalTime.MIN) : !this.f23066 ? LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(strMo6184, dateTimeFormatterM13868)) : LocalDateTime.parse(strMo6184, dateTimeFormatterM13868);
        }
        long j2 = Long.parseLong(strMo6184);
        if (z4) {
            j2 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), c2943.m6409());
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return LocalDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return abstractC2899.mo6221();
    }
}
