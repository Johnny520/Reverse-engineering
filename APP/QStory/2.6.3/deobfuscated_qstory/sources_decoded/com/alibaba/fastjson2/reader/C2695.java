package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2695 extends AbstractC8364 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2695 f8170 = new C2695(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.f9199) {
            return abstractC2899.mo6226();
        }
        C2943 c2943 = abstractC2899.f9201;
        if (abstractC2899.mo6119()) {
            return null;
        }
        if (this.f23070 == null || this.f23080 || this.f23067 || abstractC2899.mo6178()) {
            return abstractC2899.mo6226();
        }
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184.isEmpty() || "null".equals(strMo6184)) {
            return null;
        }
        boolean z = this.f23068;
        boolean z2 = this.f23069;
        if (!z && !z2) {
            c2943.getClass();
            DateTimeFormatter dateTimeFormatterM13868 = m13868();
            return !this.f23076 ? LocalDate.parse(strMo6184, dateTimeFormatterM13868) : !this.f23066 ? LocalDate.of(1970, 1, 1) : LocalDateTime.parse(strMo6184, dateTimeFormatterM13868).toLocalDate();
        }
        long j2 = Long.parseLong(strMo6184);
        if (z2) {
            j2 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), c2943.m6409()).toLocalDate();
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class mo5498() {
        return LocalDate.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return abstractC2899.mo6226();
    }
}
