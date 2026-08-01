package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9290 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9290 f23769 = new C9290(null, null);

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.f23414) {
            abstractC3730.mo6523(offsetDateTime.toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23413) {
            abstractC3730.mo6523(offsetDateTime.toInstant().toEpochMilli());
            return;
        }
        int year = offsetDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.f23412) {
                abstractC3730.mo6538(year, offsetDateTime.getMonthValue(), offsetDateTime.getDayOfMonth(), offsetDateTime.getHour(), offsetDateTime.getMinute(), offsetDateTime.getSecond(), offsetDateTime.getNano() / 1000000, offsetDateTime.getOffset().getTotalSeconds(), true);
                return;
            } else if (this.f23425) {
                abstractC3730.mo6537(year, offsetDateTime.getMonthValue(), offsetDateTime.getDayOfMonth(), offsetDateTime.getHour(), offsetDateTime.getMinute(), offsetDateTime.getSecond());
                return;
            } else if (this.f23423) {
                abstractC3730.mo6541(year, offsetDateTime.getMonthValue(), offsetDateTime.getDayOfMonth(), offsetDateTime.getHour(), offsetDateTime.getMinute(), offsetDateTime.getSecond());
                return;
            }
        }
        DateTimeFormatter dateTimeFormatterM14428 = m14428();
        if (dateTimeFormatterM14428 == null) {
            dateTimeFormatterM14428 = null;
        }
        if (dateTimeFormatterM14428 == null) {
            abstractC3730.mo6529(offsetDateTime);
        } else {
            abstractC3730.mo6577(dateTimeFormatterM14428.format(offsetDateTime));
        }
    }
}
