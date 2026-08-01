package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import p278.AbstractC8363;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2723 extends AbstractC8363 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2723 f8290 = new C2723(null, null);

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        DateTimeFormatter dateTimeFormatterM13852;
        boolean zMo6133 = abstractC2898.mo6133();
        C2942 c2942 = abstractC2898.f9199;
        boolean z = this.f23070;
        if (!zMo6133) {
            if (abstractC2898.mo6073()) {
                return null;
            }
            long jMo6164 = abstractC2898.mo6164();
            if (z) {
                jMo6164 *= 1000;
            } else {
                c2942.getClass();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jMo6164);
            return calendar;
        }
        if (this.f23071 != null && (dateTimeFormatterM13852 = m13852()) != null) {
            String strMo6139 = abstractC2898.mo6139();
            if (strMo6139.isEmpty()) {
                return null;
            }
            long epochMilli = ZonedDateTime.of(LocalDateTime.parse(strMo6139, dateTimeFormatterM13852), c2942.m6351()).toInstant().toEpochMilli();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(epochMilli);
            return calendar2;
        }
        long jM6159 = abstractC2898.m6159();
        if (jM6159 == 0 && abstractC2898.f9194) {
            return null;
        }
        if (z) {
            jM6159 *= 1000;
        }
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(jM6159);
        return calendar3;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return Calendar.class;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        boolean zMo6135 = abstractC2898.mo6135();
        boolean z = this.f23070;
        if (zMo6135) {
            long jMo6164 = abstractC2898.mo6164();
            if (z) {
                jMo6164 *= 1000;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jMo6164);
            return calendar;
        }
        if (abstractC2898.mo6073()) {
            return null;
        }
        long jM6159 = abstractC2898.m6159();
        if (z) {
            jM6159 *= 1000;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM6159);
        return calendar2;
    }
}
