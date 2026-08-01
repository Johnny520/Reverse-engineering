package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\bB\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u00020\u0003X\u0080\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m151d2 = {"Lkotlin/time/DurationUnit;", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class DurationUnit {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ DurationUnit[] $VALUES;
    private final TimeUnit timeUnit;
    public static final DurationUnit NANOSECONDS = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final DurationUnit MICROSECONDS = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final DurationUnit MILLISECONDS = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final DurationUnit SECONDS = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);
    public static final DurationUnit MINUTES = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);
    public static final DurationUnit HOURS = new DurationUnit("HOURS", 5, TimeUnit.HOURS);
    public static final DurationUnit DAYS = new DurationUnit("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ DurationUnit[] $values() {
        return new DurationUnit[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        DurationUnit[] durationUnitArr$values = $values();
        $VALUES = durationUnitArr$values;
        $ENTRIES = AbstractC5196.m9425(durationUnitArr$values);
    }

    private DurationUnit(String str, int i, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getTimeUnit$kotlin_stdlib, reason: from getter */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }
}
