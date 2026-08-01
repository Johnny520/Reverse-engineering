package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import p278.AbstractC8363;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8481 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8481 f23515 = new C8481(null, null);

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
        } else {
            abstractC2896.mo5987(((Calendar) obj).getTimeInMillis());
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
        long timeInMillis = ((Calendar) obj).getTimeInMillis();
        if (this.f23070) {
            abstractC2896.mo5918(timeInMillis / 1000);
            return;
        }
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(timeInMillis), c2894.m5980());
        int totalSeconds = zonedDateTimeOfInstant.getOffset().getTotalSeconds();
        int year = zonedDateTimeOfInstant.getYear();
        String str = this.f23071;
        if (year >= 0 && year <= 9999) {
            if ((str == null ? null : str) == null) {
                int monthValue = zonedDateTimeOfInstant.getMonthValue();
                int dayOfMonth = zonedDateTimeOfInstant.getDayOfMonth();
                int hour = zonedDateTimeOfInstant.getHour();
                int minute = zonedDateTimeOfInstant.getMinute();
                int second = zonedDateTimeOfInstant.getSecond();
                int nano = zonedDateTimeOfInstant.getNano();
                if (nano == 0) {
                    abstractC2896.mo5932(year, monthValue, dayOfMonth, hour, minute, second);
                    return;
                } else {
                    abstractC2896.mo5933(year, monthValue, dayOfMonth, hour, minute, second, nano / 1000000, totalSeconds, false);
                    return;
                }
            }
        }
        DateTimeFormatter dateTimeFormatterM13852 = str != null ? m13852() : null;
        if (dateTimeFormatterM13852 == null) {
            abstractC2896.mo5956(zonedDateTimeOfInstant);
        } else {
            abstractC2896.mo5972(dateTimeFormatterM13852.format(zonedDateTimeOfInstant));
        }
    }
}
