package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m151d2 = {"androidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop", "", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Yes", "No", "NotInitialized", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class EnumC0041xecab5e0c {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ EnumC0041xecab5e0c[] $VALUES;
    public static final EnumC0041xecab5e0c Yes = new EnumC0041xecab5e0c("Yes", 0);

    /* JADX INFO: renamed from: No */
    public static final EnumC0041xecab5e0c f3No = new EnumC0041xecab5e0c("No", 1);
    public static final EnumC0041xecab5e0c NotInitialized = new EnumC0041xecab5e0c("NotInitialized", 2);

    private static final /* synthetic */ EnumC0041xecab5e0c[] $values() {
        return new EnumC0041xecab5e0c[]{Yes, f3No, NotInitialized};
    }

    static {
        EnumC0041xecab5e0c[] enumC0041xecab5e0cArr$values = $values();
        $VALUES = enumC0041xecab5e0cArr$values;
        $ENTRIES = AbstractC5196.m9425(enumC0041xecab5e0cArr$values);
    }

    private EnumC0041xecab5e0c(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static EnumC0041xecab5e0c valueOf(String str) {
        return (EnumC0041xecab5e0c) Enum.valueOf(EnumC0041xecab5e0c.class, str);
    }

    public static EnumC0041xecab5e0c[] values() {
        return (EnumC0041xecab5e0c[]) $VALUES.clone();
    }
}
