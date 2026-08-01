package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8472 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8472 f23456 = new C8472(null, null);

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (this.f23071 != null) {
            mo5634(abstractC2896, obj, obj2, type, j);
        } else {
            abstractC2896.mo5916((LocalDate) obj);
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
        LocalDate localDate = (LocalDate) obj;
        if (this.f23070) {
            abstractC2896.mo5918(LocalDateTime.of(localDate, LocalTime.MIN).atZone(c2894.m5980()).toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23069) {
            abstractC2896.mo5918(LocalDateTime.of(localDate, LocalTime.MIN).atZone(c2894.m5980()).toInstant().toEpochMilli());
            return;
        }
        if (this.f23072) {
            abstractC2896.mo5948(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            return;
        }
        if (this.f23073) {
            abstractC2896.mo5947(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            return;
        }
        if (this.f23081) {
            abstractC2896.mo5932(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 0, 0, 0);
            return;
        }
        DateTimeFormatter dateTimeFormatterM13852 = m13852();
        if (dateTimeFormatterM13852 == null) {
            dateTimeFormatterM13852 = null;
        }
        if (dateTimeFormatterM13852 == null) {
            abstractC2896.mo5947(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        } else {
            abstractC2896.mo5972(!this.f23077 ? dateTimeFormatterM13852.format(localDate) : dateTimeFormatterM13852.format(LocalDateTime.of(localDate, LocalTime.MIN)));
        }
    }
}
