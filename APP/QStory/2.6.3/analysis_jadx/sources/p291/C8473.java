package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import p278.AbstractC8364;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8473 extends AbstractC8364 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8473 f23506 = new C8473(null, null);

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
        } else {
            abstractC2897.mo6032(((Calendar) obj).getTimeInMillis());
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
        long timeInMillis = ((Calendar) obj).getTimeInMillis();
        if (this.f23069) {
            abstractC2897.mo5963(timeInMillis / 1000);
            return;
        }
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(timeInMillis), c2895.m6025());
        int totalSeconds = zonedDateTimeOfInstant.getOffset().getTotalSeconds();
        int year = zonedDateTimeOfInstant.getYear();
        String str = this.f23070;
        if (year >= 0 && year <= 9999) {
            if ((str == null ? null : str) == null) {
                int monthValue = zonedDateTimeOfInstant.getMonthValue();
                int dayOfMonth = zonedDateTimeOfInstant.getDayOfMonth();
                int hour = zonedDateTimeOfInstant.getHour();
                int minute = zonedDateTimeOfInstant.getMinute();
                int second = zonedDateTimeOfInstant.getSecond();
                int nano = zonedDateTimeOfInstant.getNano();
                if (nano == 0) {
                    abstractC2897.mo5977(year, monthValue, dayOfMonth, hour, minute, second);
                    return;
                } else {
                    abstractC2897.mo5978(year, monthValue, dayOfMonth, hour, minute, second, nano / 1000000, totalSeconds, false);
                    return;
                }
            }
        }
        DateTimeFormatter dateTimeFormatterM13869 = str != null ? m13869() : null;
        if (dateTimeFormatterM13869 == null) {
            abstractC2897.mo6001(zonedDateTimeOfInstant);
        } else {
            abstractC2897.mo6017(dateTimeFormatterM13869.format(zonedDateTimeOfInstant));
        }
    }
}
