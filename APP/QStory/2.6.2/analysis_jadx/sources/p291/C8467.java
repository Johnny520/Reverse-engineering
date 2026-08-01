package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8467 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8467 f23431 = new C8467(null, null);

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        abstractC2896.mo5931((LocalTime) obj);
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        C2894 c2894 = abstractC2896.f9176;
        LocalTime localTime = (LocalTime) obj;
        if (this.f23069) {
            abstractC2896.mo5918(LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime).atZone(c2894.m5980()).toInstant().toEpochMilli());
            return;
        }
        if (this.f23070) {
            abstractC2896.mo5928((int) (LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime).atZone(c2894.m5980()).toInstant().toEpochMilli() / 1000));
            return;
        }
        DateTimeFormatter dateTimeFormatterM13852 = m13852();
        if (dateTimeFormatterM13852 == null) {
            dateTimeFormatterM13852 = null;
        }
        if (dateTimeFormatterM13852 != null) {
            abstractC2896.mo5972(!this.f23067 ? dateTimeFormatterM13852.format(localTime) : dateTimeFormatterM13852.format(LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime)));
            return;
        }
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        if (localTime.getNano() == 0) {
            abstractC2896.mo5969(hour, minute, second);
        } else {
            abstractC2896.mo5931(localTime);
        }
    }
}
