package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.util.C2849;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.function.Function;
import p278.AbstractC8363;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8460 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8460 f23402 = new C8460(null, null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Function f23403;

    public C8460(String str, Locale locale, C2849 c2849) {
        super(str, locale);
        this.f23403 = c2849;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23403;
        abstractC2896.mo5956(function != null ? (ZonedDateTime) function.apply(obj) : (ZonedDateTime) obj);
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        Function function = this.f23403;
        ZonedDateTime zonedDateTime = function != null ? (ZonedDateTime) function.apply(obj) : (ZonedDateTime) obj;
        C2894 c2894 = abstractC2896.f9176;
        if (this.f23070) {
            abstractC2896.mo5918(zonedDateTime.toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23069) {
            abstractC2896.mo5918(zonedDateTime.toInstant().toEpochMilli());
            return;
        }
        int year = zonedDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.f23068) {
                abstractC2896.mo5933(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond(), zonedDateTime.getNano() / 1000000, zonedDateTime.getOffset().getTotalSeconds(), true);
                return;
            } else if (this.f23081) {
                abstractC2896.mo5932(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond());
                return;
            } else if (this.f23079) {
                abstractC2896.mo5936(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond());
                return;
            }
        }
        DateTimeFormatter dateTimeFormatterM13852 = m13852();
        if (dateTimeFormatterM13852 == null) {
            dateTimeFormatterM13852 = null;
        }
        if (dateTimeFormatterM13852 == null) {
            abstractC2896.mo5956(zonedDateTime);
        } else {
            abstractC2896.mo5972(dateTimeFormatterM13852.format(zonedDateTime));
        }
    }
}
