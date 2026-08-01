package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2716 extends AbstractC8363 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2716 f8277 = new C2716(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        C2942 c2942 = abstractC2898.f9199;
        if (abstractC2898.mo6073()) {
            return null;
        }
        boolean zMo6135 = abstractC2898.mo6135();
        boolean z = this.f23070;
        if (zMo6135) {
            long jMo6164 = abstractC2898.mo6164();
            if (z) {
                jMo6164 *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(jMo6164), c2942.m6351()).toLocalTime();
        }
        if (this.f23071 == null || abstractC2898.mo6132()) {
            return abstractC2898.mo6174();
        }
        if (this.f23081 || this.f23068) {
            return abstractC2898.mo6176().toLocalTime();
        }
        String strMo6139 = abstractC2898.mo6139();
        if (strMo6139.isEmpty()) {
            return null;
        }
        if (!this.f23069 && !z) {
            c2942.getClass();
            DateTimeFormatter dateTimeFormatterM13851 = m13851();
            return this.f23067 ? LocalDateTime.parse(strMo6139, dateTimeFormatterM13851).toLocalTime() : LocalTime.parse(strMo6139, dateTimeFormatterM13851);
        }
        long j2 = Long.parseLong(strMo6139);
        if (z) {
            j2 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), c2942.m6351()).toLocalTime();
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return LocalTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return abstractC2898.mo6174();
    }
}
