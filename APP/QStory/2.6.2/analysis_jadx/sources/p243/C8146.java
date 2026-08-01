package p243;

import androidx.activity.AbstractC0053;
import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p087.C7108;
import p089.InterfaceC7180;
import p089.InterfaceC7183;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世苏子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C8146 implements Comparable<C8146> {
    public static final C8147 Companion = new C8147();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final InterfaceC7183[] f22465;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f22466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final WeekDay f22467;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f22468;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final long f22469;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f22470;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Month f22471;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f22472;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f22473;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f22474;

    static {
        WeekDay[] weekDayArrValues = WeekDay.values();
        weekDayArrValues.getClass();
        C7108 c7108 = new C7108("io.ktor.util.date.WeekDay", weekDayArrValues);
        Month[] monthArrValues = Month.values();
        monthArrValues.getClass();
        f22465 = new InterfaceC7183[]{null, null, null, c7108, null, null, new C7108("io.ktor.util.date.Month", monthArrValues), null, null};
        AbstractC8149.m13571(0L);
    }

    public /* synthetic */ C8146(int i, int i2, int i3, int i4, WeekDay weekDay, int i5, int i6, Month month, int i7, long j) {
        if (511 != (i & 511)) {
            AbstractC7143.m12393(i, 511, C8148.f22475.getDescriptor());
            throw null;
        }
        this.f22474 = i2;
        this.f22472 = i3;
        this.f22473 = i4;
        this.f22467 = weekDay;
        this.f22466 = i5;
        this.f22470 = i6;
        this.f22471 = month;
        this.f22468 = i7;
        this.f22469 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C8146 c8146) {
        C8146 c81462 = c8146;
        c81462.getClass();
        return AbstractC4394.m8914(this.f22469, c81462.f22469);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8146)) {
            return false;
        }
        C8146 c8146 = (C8146) obj;
        return this.f22474 == c8146.f22474 && this.f22472 == c8146.f22472 && this.f22473 == c8146.f22473 && this.f22467 == c8146.f22467 && this.f22466 == c8146.f22466 && this.f22470 == c8146.f22470 && this.f22471 == c8146.f22471 && this.f22468 == c8146.f22468 && this.f22469 == c8146.f22469;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22469) + AbstractC0053.m143(this.f22468, (this.f22471.hashCode() + AbstractC0053.m143(this.f22470, AbstractC0053.m143(this.f22466, (this.f22467.hashCode() + AbstractC0053.m143(this.f22473, AbstractC0053.m143(this.f22472, Integer.hashCode(this.f22474) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.f22474 + ", minutes=" + this.f22472 + ", hours=" + this.f22473 + ", dayOfWeek=" + this.f22467 + ", dayOfMonth=" + this.f22466 + ", dayOfYear=" + this.f22470 + ", month=" + this.f22471 + ", year=" + this.f22468 + ", timestamp=" + this.f22469 + ')';
    }

    public C8146(int i, int i2, int i3, WeekDay weekDay, int i4, int i5, Month month, int i6, long j) {
        weekDay.getClass();
        month.getClass();
        this.f22474 = i;
        this.f22472 = i2;
        this.f22473 = i3;
        this.f22467 = weekDay;
        this.f22466 = i4;
        this.f22470 = i5;
        this.f22471 = month;
        this.f22468 = i6;
        this.f22469 = j;
    }
}
