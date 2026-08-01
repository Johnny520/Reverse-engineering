package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.util.C2850;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.function.Function;
import p278.AbstractC8364;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8452 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8452 f23393 = new C8452(null, null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Function f23394;

    public C8452(String str, Locale locale, C2850 c2850) {
        super(str, locale);
        this.f23394 = c2850;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23394;
        abstractC2897.mo6001(function != null ? (ZonedDateTime) function.apply(obj) : (ZonedDateTime) obj);
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        Function function = this.f23394;
        ZonedDateTime zonedDateTime = function != null ? (ZonedDateTime) function.apply(obj) : (ZonedDateTime) obj;
        C2895 c2895 = abstractC2897.f9178;
        if (this.f23069) {
            abstractC2897.mo5963(zonedDateTime.toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23068) {
            abstractC2897.mo5963(zonedDateTime.toInstant().toEpochMilli());
            return;
        }
        int year = zonedDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.f23067) {
                abstractC2897.mo5978(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond(), zonedDateTime.getNano() / 1000000, zonedDateTime.getOffset().getTotalSeconds(), true);
                return;
            } else if (this.f23080) {
                abstractC2897.mo5977(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond());
                return;
            } else if (this.f23078) {
                abstractC2897.mo5981(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond());
                return;
            }
        }
        DateTimeFormatter dateTimeFormatterM13869 = m13869();
        if (dateTimeFormatterM13869 == null) {
            dateTimeFormatterM13869 = null;
        }
        if (dateTimeFormatterM13869 == null) {
            abstractC2897.mo6001(zonedDateTime);
        } else {
            abstractC2897.mo6017(dateTimeFormatterM13869.format(zonedDateTime));
        }
    }
}
