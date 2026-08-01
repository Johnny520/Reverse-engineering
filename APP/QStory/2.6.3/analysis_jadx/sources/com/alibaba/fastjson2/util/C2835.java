package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import p278.AbstractC8364;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2835 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2835 f8821 = new C2835(null, null);

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        C2895 c2895 = abstractC2897.f9178;
        if (this.f23069) {
            abstractC2897.mo5963(((Date) obj).getTime() / 1000);
            return;
        }
        if (this.f23068) {
            abstractC2897.mo5963(((Date) obj).getTime());
            return;
        }
        if (this.f23067) {
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(((Date) obj).getTime()), c2895.m6025());
            abstractC2897.mo5978(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), 0, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
            return;
        }
        String str = this.f23070;
        DateTimeFormatter dateTimeFormatterM13869 = (str == null || str.contains("dd")) ? null : m13869();
        if (dateTimeFormatterM13869 == null) {
            abstractC2897.mo6017(obj.toString());
        } else {
            abstractC2897.mo6017(dateTimeFormatterM13869.format(ZonedDateTime.ofInstant(Instant.ofEpochMilli(((Date) obj).getTime()), c2895.m6025())));
        }
    }
}
