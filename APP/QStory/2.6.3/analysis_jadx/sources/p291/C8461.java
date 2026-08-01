package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8461 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8461 f23424 = new C8461(null, null);

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        C2895 c2895 = abstractC2897.f9178;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.f23069) {
            abstractC2897.mo5963(offsetDateTime.toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23068) {
            abstractC2897.mo5963(offsetDateTime.toInstant().toEpochMilli());
            return;
        }
        int year = offsetDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.f23067) {
                abstractC2897.mo5978(year, offsetDateTime.getMonthValue(), offsetDateTime.getDayOfMonth(), offsetDateTime.getHour(), offsetDateTime.getMinute(), offsetDateTime.getSecond(), offsetDateTime.getNano() / 1000000, offsetDateTime.getOffset().getTotalSeconds(), true);
                return;
            } else if (this.f23080) {
                abstractC2897.mo5977(year, offsetDateTime.getMonthValue(), offsetDateTime.getDayOfMonth(), offsetDateTime.getHour(), offsetDateTime.getMinute(), offsetDateTime.getSecond());
                return;
            } else if (this.f23078) {
                abstractC2897.mo5981(year, offsetDateTime.getMonthValue(), offsetDateTime.getDayOfMonth(), offsetDateTime.getHour(), offsetDateTime.getMinute(), offsetDateTime.getSecond());
                return;
            }
        }
        DateTimeFormatter dateTimeFormatterM13869 = m13869();
        if (dateTimeFormatterM13869 == null) {
            dateTimeFormatterM13869 = null;
        }
        if (dateTimeFormatterM13869 == null) {
            abstractC2897.mo5969(offsetDateTime);
        } else {
            abstractC2897.mo6017(dateTimeFormatterM13869.format(offsetDateTime));
        }
    }
}
