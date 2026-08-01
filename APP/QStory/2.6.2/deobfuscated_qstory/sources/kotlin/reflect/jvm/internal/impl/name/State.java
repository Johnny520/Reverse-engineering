package kotlin.reflect.jvm.internal.impl.name;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final class State {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ State[] $VALUES;
    public static final State BEGINNING = new State("BEGINNING", 0);
    public static final State MIDDLE = new State("MIDDLE", 1);
    public static final State AFTER_DOT = new State("AFTER_DOT", 2);

    private static final /* synthetic */ State[] $values() {
        return new State[]{BEGINNING, MIDDLE, AFTER_DOT};
    }

    static {
        State[] stateArr$values = $values();
        $VALUES = stateArr$values;
        $ENTRIES = AbstractC4363.m8876(stateArr$values);
    }

    private State(String str, int i) {
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) $VALUES.clone();
    }
}
