package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import p294.AbstractC9193;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9302 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9302 f23851 = new C9302(null, null);

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
        } else {
            abstractC3730.mo6592(((Calendar) obj).getTimeInMillis());
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
        long timeInMillis = ((Calendar) obj).getTimeInMillis();
        if (this.f23414) {
            abstractC3730.mo6523(timeInMillis / 1000);
            return;
        }
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(timeInMillis), c3728.m6585());
        int totalSeconds = zonedDateTimeOfInstant.getOffset().getTotalSeconds();
        int year = zonedDateTimeOfInstant.getYear();
        String str = this.f23415;
        if (year >= 0 && year <= 9999) {
            if ((str == null ? null : str) == null) {
                int monthValue = zonedDateTimeOfInstant.getMonthValue();
                int dayOfMonth = zonedDateTimeOfInstant.getDayOfMonth();
                int hour = zonedDateTimeOfInstant.getHour();
                int minute = zonedDateTimeOfInstant.getMinute();
                int second = zonedDateTimeOfInstant.getSecond();
                int nano = zonedDateTimeOfInstant.getNano();
                if (nano == 0) {
                    abstractC3730.mo6537(year, monthValue, dayOfMonth, hour, minute, second);
                    return;
                } else {
                    abstractC3730.mo6538(year, monthValue, dayOfMonth, hour, minute, second, nano / 1000000, totalSeconds, false);
                    return;
                }
            }
        }
        DateTimeFormatter dateTimeFormatterM14428 = str != null ? m14428() : null;
        if (dateTimeFormatterM14428 == null) {
            abstractC3730.mo6561(zonedDateTimeOfInstant);
        } else {
            abstractC3730.mo6577(dateTimeFormatterM14428.format(zonedDateTimeOfInstant));
        }
    }
}
