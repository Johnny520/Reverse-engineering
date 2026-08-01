package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"androidx/compose/runtime/Recomposer$State", "", "Landroidx/compose/runtime/Recomposer$State;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Recomposer$State {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ Recomposer$State[] $VALUES;
    public static final Recomposer$State ShutDown = new Recomposer$State("ShutDown", 0);
    public static final Recomposer$State ShuttingDown = new Recomposer$State("ShuttingDown", 1);
    public static final Recomposer$State Inactive = new Recomposer$State("Inactive", 2);
    public static final Recomposer$State InactivePendingWork = new Recomposer$State("InactivePendingWork", 3);
    public static final Recomposer$State Idle = new Recomposer$State("Idle", 4);
    public static final Recomposer$State PendingWork = new Recomposer$State("PendingWork", 5);

    private static final /* synthetic */ Recomposer$State[] $values() {
        return new Recomposer$State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
    }

    static {
        Recomposer$State[] recomposer$StateArr$values = $values();
        $VALUES = recomposer$StateArr$values;
        $ENTRIES = AbstractC4364.m8866(recomposer$StateArr$values);
    }

    private Recomposer$State(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static Recomposer$State valueOf(String str) {
        return (Recomposer$State) Enum.valueOf(Recomposer$State.class, str);
    }

    public static Recomposer$State[] values() {
        return (Recomposer$State[]) $VALUES.clone();
    }
}
