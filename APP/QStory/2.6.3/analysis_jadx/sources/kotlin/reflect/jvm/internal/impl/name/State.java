package kotlin.reflect.jvm.internal.impl.name;

import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final class State {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
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
        $ENTRIES = AbstractC4364.m8866(stateArr$values);
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
