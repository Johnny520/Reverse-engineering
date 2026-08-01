package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"androidx/compose/ui/node/LayoutNode$LayoutState", "", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutNode$LayoutState {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ LayoutNode$LayoutState[] $VALUES;
    public static final LayoutNode$LayoutState Measuring = new LayoutNode$LayoutState("Measuring", 0);
    public static final LayoutNode$LayoutState LookaheadMeasuring = new LayoutNode$LayoutState("LookaheadMeasuring", 1);
    public static final LayoutNode$LayoutState LayingOut = new LayoutNode$LayoutState("LayingOut", 2);
    public static final LayoutNode$LayoutState LookaheadLayingOut = new LayoutNode$LayoutState("LookaheadLayingOut", 3);
    public static final LayoutNode$LayoutState Idle = new LayoutNode$LayoutState("Idle", 4);

    private static final /* synthetic */ LayoutNode$LayoutState[] $values() {
        return new LayoutNode$LayoutState[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
    }

    static {
        LayoutNode$LayoutState[] layoutNode$LayoutStateArr$values = $values();
        $VALUES = layoutNode$LayoutStateArr$values;
        $ENTRIES = AbstractC4364.m8866(layoutNode$LayoutStateArr$values);
    }

    private LayoutNode$LayoutState(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static LayoutNode$LayoutState valueOf(String str) {
        return (LayoutNode$LayoutState) Enum.valueOf(LayoutNode$LayoutState.class, str);
    }

    public static LayoutNode$LayoutState[] values() {
        return (LayoutNode$LayoutState[]) $VALUES.clone();
    }
}
