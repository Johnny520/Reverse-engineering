package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"androidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop", "", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Yes", "No", "NotInitialized", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop[] $VALUES;
    public static final IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop Yes = new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop("Yes", 0);
    public static final IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop No = new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop("No", 1);
    public static final IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop NotInitialized = new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop("NotInitialized", 2);

    private static final /* synthetic */ IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop[] $values() {
        return new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop[]{Yes, No, NotInitialized};
    }

    static {
        IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop[] indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlopArr$values = $values();
        $VALUES = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlopArr$values;
        $ENTRIES = AbstractC4364.m8866(indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlopArr$values);
    }

    private IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop valueOf(String str) {
        return (IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop) Enum.valueOf(IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.class, str);
    }

    public static IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop[] values() {
        return (IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop[]) $VALUES.clone();
    }
}
