package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9288 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9288 f23767 = new C9288(null, null);

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        abstractC3730.mo6536((LocalTime) obj);
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        LocalTime localTime = (LocalTime) obj;
        if (this.f23413) {
            abstractC3730.mo6523(LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime).atZone(c3728.m6585()).toInstant().toEpochMilli());
            return;
        }
        if (this.f23414) {
            abstractC3730.mo6533((int) (LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime).atZone(c3728.m6585()).toInstant().toEpochMilli() / 1000));
            return;
        }
        DateTimeFormatter dateTimeFormatterM14428 = m14428();
        if (dateTimeFormatterM14428 == null) {
            dateTimeFormatterM14428 = null;
        }
        if (dateTimeFormatterM14428 != null) {
            abstractC3730.mo6577(!this.f23411 ? dateTimeFormatterM14428.format(localTime) : dateTimeFormatterM14428.format(LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime)));
            return;
        }
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        if (localTime.getNano() == 0) {
            abstractC3730.mo6574(hour, minute, second);
        } else {
            abstractC3730.mo6536(localTime);
        }
    }
}
