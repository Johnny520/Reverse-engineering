package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8364;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8464 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8464 f23447 = new C8464(null, null);

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (this.f23070 != null) {
            mo5679(abstractC2897, obj, obj2, type, j);
        } else {
            abstractC2897.mo5961((LocalDate) obj);
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
        LocalDate localDate = (LocalDate) obj;
        if (this.f23069) {
            abstractC2897.mo5963(LocalDateTime.of(localDate, LocalTime.MIN).atZone(c2895.m6025()).toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23068) {
            abstractC2897.mo5963(LocalDateTime.of(localDate, LocalTime.MIN).atZone(c2895.m6025()).toInstant().toEpochMilli());
            return;
        }
        if (this.f23071) {
            abstractC2897.mo5993(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            return;
        }
        if (this.f23072) {
            abstractC2897.mo5992(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            return;
        }
        if (this.f23080) {
            abstractC2897.mo5977(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 0, 0, 0);
            return;
        }
        DateTimeFormatter dateTimeFormatterM13869 = m13869();
        if (dateTimeFormatterM13869 == null) {
            dateTimeFormatterM13869 = null;
        }
        if (dateTimeFormatterM13869 == null) {
            abstractC2897.mo5992(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        } else {
            abstractC2897.mo6017(!this.f23076 ? dateTimeFormatterM13869.format(localDate) : dateTimeFormatterM13869.format(LocalDateTime.of(localDate, LocalTime.MIN)));
        }
    }
}
