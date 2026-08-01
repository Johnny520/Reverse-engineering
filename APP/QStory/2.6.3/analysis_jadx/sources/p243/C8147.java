package p243;

import androidx.activity.AbstractC0053;
import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7109;
import p089.InterfaceC7181;
import p089.InterfaceC7184;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世苏子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C8147 implements Comparable<C8147> {
    public static final C8148 Companion = new C8148();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final InterfaceC7184[] f22463;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f22464;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final WeekDay f22465;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f22466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final long f22467;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f22468;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Month f22469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f22470;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f22471;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f22472;

    static {
        WeekDay[] weekDayArrValues = WeekDay.values();
        weekDayArrValues.getClass();
        C7109 c7109 = new C7109("io.ktor.util.date.WeekDay", weekDayArrValues);
        Month[] monthArrValues = Month.values();
        monthArrValues.getClass();
        f22463 = new InterfaceC7184[]{null, null, null, c7109, null, null, new C7109("io.ktor.util.date.Month", monthArrValues), null, null};
        AbstractC8150.m13600(0L);
    }

    public /* synthetic */ C8147(int i, int i2, int i3, int i4, WeekDay weekDay, int i5, int i6, Month month, int i7, long j) {
        if (511 != (i & 511)) {
            AbstractC7144.m12420(i, 511, C8149.f22473.getDescriptor());
            throw null;
        }
        this.f22472 = i2;
        this.f22470 = i3;
        this.f22471 = i4;
        this.f22465 = weekDay;
        this.f22464 = i5;
        this.f22468 = i6;
        this.f22469 = month;
        this.f22466 = i7;
        this.f22467 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C8147 c8147) {
        C8147 c81472 = c8147;
        c81472.getClass();
        return AbstractC4395.m8904(this.f22467, c81472.f22467);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8147)) {
            return false;
        }
        C8147 c8147 = (C8147) obj;
        return this.f22472 == c8147.f22472 && this.f22470 == c8147.f22470 && this.f22471 == c8147.f22471 && this.f22465 == c8147.f22465 && this.f22464 == c8147.f22464 && this.f22468 == c8147.f22468 && this.f22469 == c8147.f22469 && this.f22466 == c8147.f22466 && this.f22467 == c8147.f22467;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22467) + AbstractC0053.m144(this.f22466, (this.f22469.hashCode() + AbstractC0053.m144(this.f22468, AbstractC0053.m144(this.f22464, (this.f22465.hashCode() + AbstractC0053.m144(this.f22471, AbstractC0053.m144(this.f22470, Integer.hashCode(this.f22472) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.f22472 + ", minutes=" + this.f22470 + ", hours=" + this.f22471 + ", dayOfWeek=" + this.f22465 + ", dayOfMonth=" + this.f22464 + ", dayOfYear=" + this.f22468 + ", month=" + this.f22469 + ", year=" + this.f22466 + ", timestamp=" + this.f22467 + ')';
    }

    public C8147(int i, int i2, int i3, WeekDay weekDay, int i4, int i5, Month month, int i6, long j) {
        weekDay.getClass();
        month.getClass();
        this.f22472 = i;
        this.f22470 = i2;
        this.f22471 = i3;
        this.f22465 = weekDay;
        this.f22464 = i4;
        this.f22468 = i5;
        this.f22469 = month;
        this.f22466 = i6;
        this.f22467 = j;
    }
}
