package io.ktor.util.date;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;
import p243.C8145;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/util/date/Month;", "", "", "value", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "飘花落叶言楪兰哲世苏子/飘花落叶言子楪世兰苏哲", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Month {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ Month[] $VALUES;
    public static final C8145 Companion;
    private final String value;
    public static final Month JANUARY = new Month("JANUARY", 0, "Jan");
    public static final Month FEBRUARY = new Month("FEBRUARY", 1, "Feb");
    public static final Month MARCH = new Month("MARCH", 2, "Mar");
    public static final Month APRIL = new Month("APRIL", 3, "Apr");
    public static final Month MAY = new Month("MAY", 4, "May");
    public static final Month JUNE = new Month("JUNE", 5, "Jun");
    public static final Month JULY = new Month("JULY", 6, "Jul");
    public static final Month AUGUST = new Month("AUGUST", 7, "Aug");
    public static final Month SEPTEMBER = new Month("SEPTEMBER", 8, "Sep");
    public static final Month OCTOBER = new Month("OCTOBER", 9, "Oct");
    public static final Month NOVEMBER = new Month("NOVEMBER", 10, "Nov");
    public static final Month DECEMBER = new Month("DECEMBER", 11, "Dec");

    private static final /* synthetic */ Month[] $values() {
        return new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    static {
        Month[] monthArr$values = $values();
        $VALUES = monthArr$values;
        $ENTRIES = AbstractC4363.m8876(monthArr$values);
        Companion = new C8145();
    }

    private Month(String str, int i, String str2) {
        this.value = str2;
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
