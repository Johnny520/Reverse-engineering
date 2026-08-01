package p243;

import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final TimeZone f22474 = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8147 m13599(Calendar calendar, Long l) {
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        int i = calendar.get(16) + calendar.get(15);
        int i2 = calendar.get(13);
        int i3 = calendar.get(12);
        int i4 = calendar.get(11);
        int i5 = (calendar.get(7) + 5) % 7;
        WeekDay.Companion.getClass();
        WeekDay weekDay = (WeekDay) WeekDay.getEntries().get(i5);
        int i6 = calendar.get(5);
        int i7 = calendar.get(6);
        C8146 c8146 = Month.Companion;
        int i8 = calendar.get(2);
        c8146.getClass();
        return new C8147(i2, i3, i4, weekDay, i6, i7, (Month) Month.getEntries().get(i8), calendar.get(1), calendar.getTimeInMillis() + ((long) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8147 m13600(Long l) {
        Calendar calendar = Calendar.getInstance(f22474, Locale.ROOT);
        calendar.getClass();
        return m13599(calendar, l);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8147 m13601(int i, int i2, int i3, int i4, Month month, int i5) {
        month.getClass();
        Calendar calendar = Calendar.getInstance(f22474, Locale.ROOT);
        calendar.getClass();
        calendar.set(1, i5);
        calendar.set(2, month.ordinal());
        calendar.set(5, i4);
        calendar.set(11, i3);
        calendar.set(12, i2);
        calendar.set(13, i);
        calendar.set(14, 0);
        return m13599(calendar, null);
    }
}
