package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"androidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction", "", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "ContinueTraversal", "SkipSubtreeAndContinueTraversal", "CancelTraversal", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TraversableNode$Companion$TraverseDescendantsAction {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ TraversableNode$Companion$TraverseDescendantsAction[] $VALUES;
    public static final TraversableNode$Companion$TraverseDescendantsAction ContinueTraversal = new TraversableNode$Companion$TraverseDescendantsAction("ContinueTraversal", 0);
    public static final TraversableNode$Companion$TraverseDescendantsAction SkipSubtreeAndContinueTraversal = new TraversableNode$Companion$TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
    public static final TraversableNode$Companion$TraverseDescendantsAction CancelTraversal = new TraversableNode$Companion$TraverseDescendantsAction("CancelTraversal", 2);

    private static final /* synthetic */ TraversableNode$Companion$TraverseDescendantsAction[] $values() {
        return new TraversableNode$Companion$TraverseDescendantsAction[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
    }

    static {
        TraversableNode$Companion$TraverseDescendantsAction[] traversableNode$Companion$TraverseDescendantsActionArr$values = $values();
        $VALUES = traversableNode$Companion$TraverseDescendantsActionArr$values;
        $ENTRIES = AbstractC4364.m8866(traversableNode$Companion$TraverseDescendantsActionArr$values);
    }

    private TraversableNode$Companion$TraverseDescendantsAction(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static TraversableNode$Companion$TraverseDescendantsAction valueOf(String str) {
        return (TraversableNode$Companion$TraverseDescendantsAction) Enum.valueOf(TraversableNode$Companion$TraverseDescendantsAction.class, str);
    }

    public static TraversableNode$Companion$TraverseDescendantsAction[] values() {
        return (TraversableNode$Companion$TraverseDescendantsAction[]) $VALUES.clone();
    }
}
