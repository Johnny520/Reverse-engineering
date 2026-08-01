package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"androidx/lifecycle/Lifecycle$State", "", "Landroidx/lifecycle/Lifecycle$State;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "state", "", "isAtLeast", "(Landroidx/lifecycle/Lifecycle$State;)Z", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Lifecycle$State {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ Lifecycle$State[] $VALUES;
    public static final Lifecycle$State DESTROYED = new Lifecycle$State("DESTROYED", 0);
    public static final Lifecycle$State INITIALIZED = new Lifecycle$State("INITIALIZED", 1);
    public static final Lifecycle$State CREATED = new Lifecycle$State("CREATED", 2);
    public static final Lifecycle$State STARTED = new Lifecycle$State("STARTED", 3);
    public static final Lifecycle$State RESUMED = new Lifecycle$State("RESUMED", 4);

    private static final /* synthetic */ Lifecycle$State[] $values() {
        return new Lifecycle$State[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
    }

    static {
        Lifecycle$State[] lifecycle$StateArr$values = $values();
        $VALUES = lifecycle$StateArr$values;
        $ENTRIES = AbstractC4363.m8876(lifecycle$StateArr$values);
    }

    private Lifecycle$State(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static Lifecycle$State valueOf(String str) {
        return (Lifecycle$State) Enum.valueOf(Lifecycle$State.class, str);
    }

    public static Lifecycle$State[] values() {
        return (Lifecycle$State[]) $VALUES.clone();
    }

    public final boolean isAtLeast(Lifecycle$State state) {
        state.getClass();
        return compareTo(state) >= 0;
    }
}
