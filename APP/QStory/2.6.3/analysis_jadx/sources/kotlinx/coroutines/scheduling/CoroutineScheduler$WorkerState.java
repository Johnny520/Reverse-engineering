package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"kotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState", "", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoroutineScheduler$WorkerState {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ CoroutineScheduler$WorkerState[] $VALUES;
    public static final CoroutineScheduler$WorkerState CPU_ACQUIRED = new CoroutineScheduler$WorkerState("CPU_ACQUIRED", 0);
    public static final CoroutineScheduler$WorkerState BLOCKING = new CoroutineScheduler$WorkerState("BLOCKING", 1);
    public static final CoroutineScheduler$WorkerState PARKING = new CoroutineScheduler$WorkerState("PARKING", 2);
    public static final CoroutineScheduler$WorkerState DORMANT = new CoroutineScheduler$WorkerState("DORMANT", 3);
    public static final CoroutineScheduler$WorkerState TERMINATED = new CoroutineScheduler$WorkerState("TERMINATED", 4);

    private static final /* synthetic */ CoroutineScheduler$WorkerState[] $values() {
        return new CoroutineScheduler$WorkerState[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
    }

    static {
        CoroutineScheduler$WorkerState[] coroutineScheduler$WorkerStateArr$values = $values();
        $VALUES = coroutineScheduler$WorkerStateArr$values;
        $ENTRIES = AbstractC4364.m8866(coroutineScheduler$WorkerStateArr$values);
    }

    private CoroutineScheduler$WorkerState(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static CoroutineScheduler$WorkerState valueOf(String str) {
        return (CoroutineScheduler$WorkerState) Enum.valueOf(CoroutineScheduler$WorkerState.class, str);
    }

    public static CoroutineScheduler$WorkerState[] values() {
        return (CoroutineScheduler$WorkerState[]) $VALUES.clone();
    }
}
