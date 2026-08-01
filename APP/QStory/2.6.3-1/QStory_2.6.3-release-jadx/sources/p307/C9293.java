package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9293 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9293 f23792 = new C9293(null, null);

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (this.f23415 != null) {
            mo6239(abstractC3730, obj, obj2, type, j);
        } else {
            abstractC3730.mo6521((LocalDate) obj);
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        LocalDate localDate = (LocalDate) obj;
        if (this.f23414) {
            abstractC3730.mo6523(LocalDateTime.of(localDate, LocalTime.MIN).atZone(c3728.m6585()).toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23413) {
            abstractC3730.mo6523(LocalDateTime.of(localDate, LocalTime.MIN).atZone(c3728.m6585()).toInstant().toEpochMilli());
            return;
        }
        if (this.f23416) {
            abstractC3730.mo6553(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            return;
        }
        if (this.f23417) {
            abstractC3730.mo6552(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            return;
        }
        if (this.f23425) {
            abstractC3730.mo6537(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 0, 0, 0);
            return;
        }
        DateTimeFormatter dateTimeFormatterM14428 = m14428();
        if (dateTimeFormatterM14428 == null) {
            dateTimeFormatterM14428 = null;
        }
        if (dateTimeFormatterM14428 == null) {
            abstractC3730.mo6552(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        } else {
            abstractC3730.mo6577(!this.f23421 ? dateTimeFormatterM14428.format(localDate) : dateTimeFormatterM14428.format(LocalDateTime.of(localDate, LocalTime.MIN)));
        }
    }
}
