package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m151d2 = {"Landroidx/compose/material3/internal/SwipeEdge;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Left", "Right", "None", "material3"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class SwipeEdge {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ SwipeEdge[] $VALUES;
    public static final SwipeEdge Left = new SwipeEdge("Left", 0);
    public static final SwipeEdge Right = new SwipeEdge("Right", 1);
    public static final SwipeEdge None = new SwipeEdge("None", 2);

    private static final /* synthetic */ SwipeEdge[] $values() {
        return new SwipeEdge[]{Left, Right, None};
    }

    static {
        SwipeEdge[] swipeEdgeArr$values = $values();
        $VALUES = swipeEdgeArr$values;
        $ENTRIES = AbstractC5196.m9425(swipeEdgeArr$values);
    }

    private SwipeEdge(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static SwipeEdge valueOf(String str) {
        return (SwipeEdge) Enum.valueOf(SwipeEdge.class, str);
    }

    public static SwipeEdge[] values() {
        return (SwipeEdge[]) $VALUES.clone();
    }
}
