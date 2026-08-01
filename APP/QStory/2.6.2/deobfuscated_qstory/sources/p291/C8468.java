package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import p278.AbstractC8363;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8468 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8468 f23432 = new C8468(null, null);

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (this.f23071 != null) {
            mo5634(abstractC2896, obj, obj2, type, j);
        } else {
            abstractC2896.mo5930((LocalDateTime) obj);
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        C2894 c2894 = abstractC2896.f9176;
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (this.f23070) {
            abstractC2896.mo5918(localDateTime.atZone(c2894.m5980()).toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23069) {
            abstractC2896.mo5918(localDateTime.atZone(c2894.m5980()).toInstant().toEpochMilli());
            return;
        }
        int year = localDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.f23068) {
                abstractC2896.mo5933(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano() / 1000000, c2894.m5980().getRules().getOffset(localDateTime).getTotalSeconds(), true);
                return;
            }
            if (this.f23081) {
                abstractC2896.mo5932(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
                return;
            }
            if (this.f23079) {
                abstractC2896.mo5936(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
                return;
            } else if (this.f23072) {
                abstractC2896.mo5948(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
                return;
            } else if (this.f23073) {
                abstractC2896.mo5947(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
                return;
            }
        }
        DateTimeFormatter dateTimeFormatterM13852 = m13852();
        if (dateTimeFormatterM13852 == null) {
            dateTimeFormatterM13852 = null;
        }
        if (dateTimeFormatterM13852 == null) {
            abstractC2896.mo5930(localDateTime);
        } else {
            abstractC2896.mo5972(this.f23074 ? new SimpleDateFormat(this.f23071).format(new Date(localDateTime.toInstant(c2894.m5980().getRules().getOffset(localDateTime)).toEpochMilli())) : this.f23080 != null ? dateTimeFormatterM13852.format(ZonedDateTime.of(localDateTime, c2894.m5980())) : dateTimeFormatterM13852.format(localDateTime));
        }
    }
}
