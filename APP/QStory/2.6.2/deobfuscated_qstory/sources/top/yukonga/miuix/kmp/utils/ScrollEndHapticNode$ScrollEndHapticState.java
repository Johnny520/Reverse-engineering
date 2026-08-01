package top.yukonga.miuix.kmp.utils;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"top/yukonga/miuix/kmp/utils/ScrollEndHapticNode$ScrollEndHapticState", "", "Ltop/yukonga/miuix/kmp/utils/ScrollEndHapticNode$ScrollEndHapticState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Idle", "TopBoundaryHit", "BottomBoundaryHit", "miuix"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class ScrollEndHapticNode$ScrollEndHapticState {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ScrollEndHapticNode$ScrollEndHapticState[] $VALUES;
    public static final ScrollEndHapticNode$ScrollEndHapticState Idle = new ScrollEndHapticNode$ScrollEndHapticState("Idle", 0);
    public static final ScrollEndHapticNode$ScrollEndHapticState TopBoundaryHit = new ScrollEndHapticNode$ScrollEndHapticState("TopBoundaryHit", 1);
    public static final ScrollEndHapticNode$ScrollEndHapticState BottomBoundaryHit = new ScrollEndHapticNode$ScrollEndHapticState("BottomBoundaryHit", 2);

    private static final /* synthetic */ ScrollEndHapticNode$ScrollEndHapticState[] $values() {
        return new ScrollEndHapticNode$ScrollEndHapticState[]{Idle, TopBoundaryHit, BottomBoundaryHit};
    }

    static {
        ScrollEndHapticNode$ScrollEndHapticState[] scrollEndHapticNode$ScrollEndHapticStateArr$values = $values();
        $VALUES = scrollEndHapticNode$ScrollEndHapticStateArr$values;
        $ENTRIES = AbstractC4363.m8876(scrollEndHapticNode$ScrollEndHapticStateArr$values);
    }

    private ScrollEndHapticNode$ScrollEndHapticState(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static ScrollEndHapticNode$ScrollEndHapticState valueOf(String str) {
        return (ScrollEndHapticNode$ScrollEndHapticState) Enum.valueOf(ScrollEndHapticNode$ScrollEndHapticState.class, str);
    }

    public static ScrollEndHapticNode$ScrollEndHapticState[] values() {
        return (ScrollEndHapticNode$ScrollEndHapticState[]) $VALUES.clone();
    }
}
