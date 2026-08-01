package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2717 extends AbstractC8364 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2717 f8279 = new C2717(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        C2943 c2943 = abstractC2899.f9201;
        if (abstractC2899.mo6119()) {
            return null;
        }
        boolean zMo6181 = abstractC2899.mo6181();
        boolean z = this.f23069;
        if (zMo6181) {
            long jMo6209 = abstractC2899.mo6209();
            if (z) {
                jMo6209 *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(jMo6209), c2943.m6409()).toLocalTime();
        }
        if (this.f23070 == null || abstractC2899.mo6178()) {
            return abstractC2899.mo6219();
        }
        if (this.f23080 || this.f23067) {
            return abstractC2899.mo6221().toLocalTime();
        }
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184.isEmpty()) {
            return null;
        }
        if (!this.f23068 && !z) {
            c2943.getClass();
            DateTimeFormatter dateTimeFormatterM13868 = m13868();
            return this.f23066 ? LocalDateTime.parse(strMo6184, dateTimeFormatterM13868).toLocalTime() : LocalTime.parse(strMo6184, dateTimeFormatterM13868);
        }
        long j2 = Long.parseLong(strMo6184);
        if (z) {
            j2 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), c2943.m6409()).toLocalTime();
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return LocalTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return abstractC2899.mo6219();
    }
}
