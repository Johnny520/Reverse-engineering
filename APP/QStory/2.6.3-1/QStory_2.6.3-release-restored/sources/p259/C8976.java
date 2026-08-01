package p259;

import androidx.activity.AbstractC0900;
import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p103.C7938;
import p105.InterfaceC8010;
import p105.InterfaceC8013;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世苏子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C8976 implements Comparable<C8976> {
    public static final C8977 Companion = new C8977();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final InterfaceC8013[] f22808;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f22809;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final WeekDay f22810;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f22811;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final long f22812;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f22813;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Month f22814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f22815;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f22816;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f22817;

    static {
        WeekDay[] weekDayArrValues = WeekDay.values();
        weekDayArrValues.getClass();
        C7938 c7938 = new C7938("io.ktor.util.date.WeekDay", weekDayArrValues);
        Month[] monthArrValues = Month.values();
        monthArrValues.getClass();
        f22808 = new InterfaceC8013[]{null, null, null, c7938, null, null, new C7938("io.ktor.util.date.Month", monthArrValues), null, null};
        AbstractC8979.m14159(0L);
    }

    public /* synthetic */ C8976(int i, int i2, int i3, int i4, WeekDay weekDay, int i5, int i6, Month month, int i7, long j) {
        if (511 != (i & 511)) {
            AbstractC7973.m12979(i, 511, C8978.f22818.getDescriptor());
            throw null;
        }
        this.f22817 = i2;
        this.f22815 = i3;
        this.f22816 = i4;
        this.f22810 = weekDay;
        this.f22809 = i5;
        this.f22813 = i6;
        this.f22814 = month;
        this.f22811 = i7;
        this.f22812 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C8976 c8976) {
        C8976 c89762 = c8976;
        c89762.getClass();
        return AbstractC5227.m9463(this.f22812, c89762.f22812);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8976)) {
            return false;
        }
        C8976 c8976 = (C8976) obj;
        return this.f22817 == c8976.f22817 && this.f22815 == c8976.f22815 && this.f22816 == c8976.f22816 && this.f22810 == c8976.f22810 && this.f22809 == c8976.f22809 && this.f22813 == c8976.f22813 && this.f22814 == c8976.f22814 && this.f22811 == c8976.f22811 && this.f22812 == c8976.f22812;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22812) + AbstractC0900.m704(this.f22811, (this.f22814.hashCode() + AbstractC0900.m704(this.f22813, AbstractC0900.m704(this.f22809, (this.f22810.hashCode() + AbstractC0900.m704(this.f22816, AbstractC0900.m704(this.f22815, Integer.hashCode(this.f22817) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.f22817 + ", minutes=" + this.f22815 + ", hours=" + this.f22816 + ", dayOfWeek=" + this.f22810 + ", dayOfMonth=" + this.f22809 + ", dayOfYear=" + this.f22813 + ", month=" + this.f22814 + ", year=" + this.f22811 + ", timestamp=" + this.f22812 + ')';
    }

    public C8976(int i, int i2, int i3, WeekDay weekDay, int i4, int i5, Month month, int i6, long j) {
        weekDay.getClass();
        month.getClass();
        this.f22817 = i;
        this.f22815 = i2;
        this.f22816 = i3;
        this.f22810 = weekDay;
        this.f22809 = i4;
        this.f22813 = i5;
        this.f22814 = month;
        this.f22811 = i6;
        this.f22812 = j;
    }
}
