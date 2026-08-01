package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import p278.AbstractC8364;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8460 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8460 f23423 = new C8460(null, null);

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (this.f23070 != null) {
            mo5679(abstractC2897, obj, obj2, type, j);
        } else {
            abstractC2897.mo5975((LocalDateTime) obj);
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        C2895 c2895 = abstractC2897.f9178;
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (this.f23069) {
            abstractC2897.mo5963(localDateTime.atZone(c2895.m6025()).toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23068) {
            abstractC2897.mo5963(localDateTime.atZone(c2895.m6025()).toInstant().toEpochMilli());
            return;
        }
        int year = localDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.f23067) {
                abstractC2897.mo5978(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano() / 1000000, c2895.m6025().getRules().getOffset(localDateTime).getTotalSeconds(), true);
                return;
            }
            if (this.f23080) {
                abstractC2897.mo5977(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
                return;
            }
            if (this.f23078) {
                abstractC2897.mo5981(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
                return;
            } else if (this.f23071) {
                abstractC2897.mo5993(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
                return;
            } else if (this.f23072) {
                abstractC2897.mo5992(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
                return;
            }
        }
        DateTimeFormatter dateTimeFormatterM13869 = m13869();
        if (dateTimeFormatterM13869 == null) {
            dateTimeFormatterM13869 = null;
        }
        if (dateTimeFormatterM13869 == null) {
            abstractC2897.mo5975(localDateTime);
        } else {
            abstractC2897.mo6017(this.f23073 ? new SimpleDateFormat(this.f23070).format(new Date(localDateTime.toInstant(c2895.m6025().getRules().getOffset(localDateTime)).toEpochMilli())) : this.f23079 != null ? dateTimeFormatterM13869.format(ZonedDateTime.of(localDateTime, c2895.m6025())) : dateTimeFormatterM13869.format(localDateTime));
        }
    }
}
