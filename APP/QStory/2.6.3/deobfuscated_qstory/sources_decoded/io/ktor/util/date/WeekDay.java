package io.ktor.util.date;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p243.C8145;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/util/date/WeekDay;", "", "", "value", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "飘花落叶言楪兰哲世苏子/飘花落叶言子楪世兰哲苏", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeekDay {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ WeekDay[] $VALUES;
    public static final C8145 Companion;
    private final String value;
    public static final WeekDay MONDAY = new WeekDay("MONDAY", 0, "Mon");
    public static final WeekDay TUESDAY = new WeekDay("TUESDAY", 1, "Tue");
    public static final WeekDay WEDNESDAY = new WeekDay("WEDNESDAY", 2, "Wed");
    public static final WeekDay THURSDAY = new WeekDay("THURSDAY", 3, "Thu");
    public static final WeekDay FRIDAY = new WeekDay("FRIDAY", 4, "Fri");
    public static final WeekDay SATURDAY = new WeekDay("SATURDAY", 5, "Sat");
    public static final WeekDay SUNDAY = new WeekDay("SUNDAY", 6, "Sun");

    private static final /* synthetic */ WeekDay[] $values() {
        return new WeekDay[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    }

    static {
        WeekDay[] weekDayArr$values = $values();
        $VALUES = weekDayArr$values;
        $ENTRIES = AbstractC4364.m8866(weekDayArr$values);
        Companion = new C8145();
    }

    private WeekDay(String str, int i, String str2) {
        this.value = str2;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static WeekDay valueOf(String str) {
        return (WeekDay) Enum.valueOf(WeekDay.class, str);
    }

    public static WeekDay[] values() {
        return (WeekDay[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
