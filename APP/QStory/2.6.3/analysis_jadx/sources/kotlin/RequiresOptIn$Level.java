package kotlin;

import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"kotlin/RequiresOptIn$Level", "", "Lkotlin/RequiresOptIn$Level;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "WARNING", "ERROR", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RequiresOptIn$Level {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ RequiresOptIn$Level[] $VALUES;
    public static final RequiresOptIn$Level WARNING = new RequiresOptIn$Level("WARNING", 0);
    public static final RequiresOptIn$Level ERROR = new RequiresOptIn$Level("ERROR", 1);

    private static final /* synthetic */ RequiresOptIn$Level[] $values() {
        return new RequiresOptIn$Level[]{WARNING, ERROR};
    }

    static {
        RequiresOptIn$Level[] requiresOptIn$LevelArr$values = $values();
        $VALUES = requiresOptIn$LevelArr$values;
        $ENTRIES = AbstractC4364.m8866(requiresOptIn$LevelArr$values);
    }

    private RequiresOptIn$Level(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static RequiresOptIn$Level valueOf(String str) {
        return (RequiresOptIn$Level) Enum.valueOf(RequiresOptIn$Level.class, str);
    }

    public static RequiresOptIn$Level[] values() {
        return (RequiresOptIn$Level[]) $VALUES.clone();
    }
}
