package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8459 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8459 f23422 = new C8459(null, null);

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        abstractC2897.mo5976((LocalTime) obj);
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        C2895 c2895 = abstractC2897.f9178;
        LocalTime localTime = (LocalTime) obj;
        if (this.f23068) {
            abstractC2897.mo5963(LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime).atZone(c2895.m6025()).toInstant().toEpochMilli());
            return;
        }
        if (this.f23069) {
            abstractC2897.mo5973((int) (LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime).atZone(c2895.m6025()).toInstant().toEpochMilli() / 1000));
            return;
        }
        DateTimeFormatter dateTimeFormatterM13869 = m13869();
        if (dateTimeFormatterM13869 == null) {
            dateTimeFormatterM13869 = null;
        }
        if (dateTimeFormatterM13869 != null) {
            abstractC2897.mo6017(!this.f23066 ? dateTimeFormatterM13869.format(localTime) : dateTimeFormatterM13869.format(LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime)));
            return;
        }
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        if (localTime.getNano() == 0) {
            abstractC2897.mo6014(hour, minute, second);
        } else {
            abstractC2897.mo5976(localTime);
        }
    }
}
