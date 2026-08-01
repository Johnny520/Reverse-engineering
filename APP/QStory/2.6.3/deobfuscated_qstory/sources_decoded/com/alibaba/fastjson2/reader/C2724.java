package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import p278.AbstractC8364;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2724 extends AbstractC8364 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2724 f8292 = new C2724(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        DateTimeFormatter dateTimeFormatterM13869;
        boolean zMo6179 = abstractC2899.mo6179();
        C2943 c2943 = abstractC2899.f9201;
        boolean z = this.f23069;
        if (!zMo6179) {
            if (abstractC2899.mo6119()) {
                return null;
            }
            long jMo6209 = abstractC2899.mo6209();
            if (z) {
                jMo6209 *= 1000;
            } else {
                c2943.getClass();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jMo6209);
            return calendar;
        }
        if (this.f23070 != null && (dateTimeFormatterM13869 = m13869()) != null) {
            String strMo6184 = abstractC2899.mo6184();
            if (strMo6184.isEmpty()) {
                return null;
            }
            long epochMilli = ZonedDateTime.of(LocalDateTime.parse(strMo6184, dateTimeFormatterM13869), c2943.m6409()).toInstant().toEpochMilli();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(epochMilli);
            return calendar2;
        }
        long jM6204 = abstractC2899.m6204();
        if (jM6204 == 0 && abstractC2899.f9196) {
            return null;
        }
        if (z) {
            jM6204 *= 1000;
        }
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(jM6204);
        return calendar3;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return Calendar.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        boolean zMo6181 = abstractC2899.mo6181();
        boolean z = this.f23069;
        if (zMo6181) {
            long jMo6209 = abstractC2899.mo6209();
            if (z) {
                jMo6209 *= 1000;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jMo6209);
            return calendar;
        }
        if (abstractC2899.mo6119()) {
            return null;
        }
        long jM6204 = abstractC2899.m6204();
        if (z) {
            jM6204 *= 1000;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM6204);
        return calendar2;
    }
}
