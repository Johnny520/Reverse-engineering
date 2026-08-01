package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m151d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class CoroutineSingletons {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ CoroutineSingletons[] $VALUES;
    public static final CoroutineSingletons COROUTINE_SUSPENDED = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
    public static final CoroutineSingletons UNDECIDED = new CoroutineSingletons("UNDECIDED", 1);
    public static final CoroutineSingletons RESUMED = new CoroutineSingletons("RESUMED", 2);

    private static final /* synthetic */ CoroutineSingletons[] $values() {
        return new CoroutineSingletons[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    static {
        CoroutineSingletons[] coroutineSingletonsArr$values = $values();
        $VALUES = coroutineSingletonsArr$values;
        $ENTRIES = AbstractC5196.m9425(coroutineSingletonsArr$values);
    }

    private CoroutineSingletons(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) $VALUES.clone();
    }
}
