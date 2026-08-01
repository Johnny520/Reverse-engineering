package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.util.C3683;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.function.Function;
import p294.AbstractC9193;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9281 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C9281 f23738 = new C9281(null, null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Function f23739;

    public C9281(String str, Locale locale, C3683 c3683) {
        super(str, locale);
        this.f23739 = c3683;
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        Function function = this.f23739;
        abstractC3730.mo6561(function != null ? (ZonedDateTime) function.apply(obj) : (ZonedDateTime) obj);
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        Function function = this.f23739;
        ZonedDateTime zonedDateTime = function != null ? (ZonedDateTime) function.apply(obj) : (ZonedDateTime) obj;
        C3728 c3728 = abstractC3730.f9523;
        if (this.f23414) {
            abstractC3730.mo6523(zonedDateTime.toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23413) {
            abstractC3730.mo6523(zonedDateTime.toInstant().toEpochMilli());
            return;
        }
        int year = zonedDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.f23412) {
                abstractC3730.mo6538(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond(), zonedDateTime.getNano() / 1000000, zonedDateTime.getOffset().getTotalSeconds(), true);
                return;
            } else if (this.f23425) {
                abstractC3730.mo6537(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond());
                return;
            } else if (this.f23423) {
                abstractC3730.mo6541(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond());
                return;
            }
        }
        DateTimeFormatter dateTimeFormatterM14428 = m14428();
        if (dateTimeFormatterM14428 == null) {
            dateTimeFormatterM14428 = null;
        }
        if (dateTimeFormatterM14428 == null) {
            abstractC3730.mo6561(zonedDateTime);
        } else {
            abstractC3730.mo6577(dateTimeFormatterM14428.format(zonedDateTime));
        }
    }
}
