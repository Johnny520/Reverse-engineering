package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import p294.AbstractC9193;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9289 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9289 f23768 = new C9289(null, null);

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (this.f23415 != null) {
            mo6239(abstractC3730, obj, obj2, type, j);
        } else {
            abstractC3730.mo6535((LocalDateTime) obj);
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
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (this.f23414) {
            abstractC3730.mo6523(localDateTime.atZone(c3728.m6585()).toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.f23413) {
            abstractC3730.mo6523(localDateTime.atZone(c3728.m6585()).toInstant().toEpochMilli());
            return;
        }
        int year = localDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.f23412) {
                abstractC3730.mo6538(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano() / 1000000, c3728.m6585().getRules().getOffset(localDateTime).getTotalSeconds(), true);
                return;
            }
            if (this.f23425) {
                abstractC3730.mo6537(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
                return;
            }
            if (this.f23423) {
                abstractC3730.mo6541(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
                return;
            } else if (this.f23416) {
                abstractC3730.mo6553(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
                return;
            } else if (this.f23417) {
                abstractC3730.mo6552(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
                return;
            }
        }
        DateTimeFormatter dateTimeFormatterM14428 = m14428();
        if (dateTimeFormatterM14428 == null) {
            dateTimeFormatterM14428 = null;
        }
        if (dateTimeFormatterM14428 == null) {
            abstractC3730.mo6535(localDateTime);
        } else {
            abstractC3730.mo6577(this.f23418 ? new SimpleDateFormat(this.f23415).format(new Date(localDateTime.toInstant(c3728.m6585().getRules().getOffset(localDateTime)).toEpochMilli())) : this.f23424 != null ? dateTimeFormatterM14428.format(ZonedDateTime.of(localDateTime, c3728.m6585())) : dateTimeFormatterM14428.format(localDateTime));
        }
    }
}
