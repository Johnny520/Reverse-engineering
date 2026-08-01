package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import p294.AbstractC9193;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3668 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C3668 f9166 = new C3668(null, null);

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        if (this.f23414) {
            abstractC3730.mo6523(((Date) obj).getTime() / 1000);
            return;
        }
        if (this.f23413) {
            abstractC3730.mo6523(((Date) obj).getTime());
            return;
        }
        if (this.f23412) {
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(((Date) obj).getTime()), c3728.m6585());
            abstractC3730.mo6538(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), 0, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
            return;
        }
        String str = this.f23415;
        DateTimeFormatter dateTimeFormatterM14428 = (str == null || str.contains("dd")) ? null : m14428();
        if (dateTimeFormatterM14428 == null) {
            abstractC3730.mo6577(obj.toString());
        } else {
            abstractC3730.mo6577(dateTimeFormatterM14428.format(ZonedDateTime.ofInstant(Instant.ofEpochMilli(((Date) obj).getTime()), c3728.m6585())));
        }
    }
}
