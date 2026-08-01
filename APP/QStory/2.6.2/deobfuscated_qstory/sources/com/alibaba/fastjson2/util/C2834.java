package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import p278.AbstractC8363;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2834 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2834 f8819 = new C2834(null, null);

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        C2894 c2894 = abstractC2896.f9176;
        if (this.f23070) {
            abstractC2896.mo5918(((Date) obj).getTime() / 1000);
            return;
        }
        if (this.f23069) {
            abstractC2896.mo5918(((Date) obj).getTime());
            return;
        }
        if (this.f23068) {
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(((Date) obj).getTime()), c2894.m5980());
            abstractC2896.mo5933(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), 0, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
            return;
        }
        String str = this.f23071;
        DateTimeFormatter dateTimeFormatterM13852 = (str == null || str.contains("dd")) ? null : m13852();
        if (dateTimeFormatterM13852 == null) {
            abstractC2896.mo5972(obj.toString());
        } else {
            abstractC2896.mo5972(dateTimeFormatterM13852.format(ZonedDateTime.ofInstant(Instant.ofEpochMilli(((Date) obj).getTime()), c2894.m5980())));
        }
    }
}
