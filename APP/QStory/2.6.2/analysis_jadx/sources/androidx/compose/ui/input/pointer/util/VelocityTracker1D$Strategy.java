package androidx.compose.ui.input.pointer.util;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VelocityTracker1D$Strategy {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ VelocityTracker1D$Strategy[] $VALUES;
    public static final VelocityTracker1D$Strategy Lsq2 = new VelocityTracker1D$Strategy("Lsq2", 0);
    public static final VelocityTracker1D$Strategy Impulse = new VelocityTracker1D$Strategy("Impulse", 1);

    private static final /* synthetic */ VelocityTracker1D$Strategy[] $values() {
        return new VelocityTracker1D$Strategy[]{Lsq2, Impulse};
    }

    static {
        VelocityTracker1D$Strategy[] velocityTracker1D$StrategyArr$values = $values();
        $VALUES = velocityTracker1D$StrategyArr$values;
        $ENTRIES = AbstractC4363.m8876(velocityTracker1D$StrategyArr$values);
    }

    private VelocityTracker1D$Strategy(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static VelocityTracker1D$Strategy valueOf(String str) {
        return (VelocityTracker1D$Strategy) Enum.valueOf(VelocityTracker1D$Strategy.class, str);
    }

    public static VelocityTracker1D$Strategy[] values() {
        return (VelocityTracker1D$Strategy[]) $VALUES.clone();
    }
}
