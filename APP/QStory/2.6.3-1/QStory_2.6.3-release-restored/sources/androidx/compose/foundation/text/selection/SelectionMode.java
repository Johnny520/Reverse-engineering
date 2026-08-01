package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.AbstractC5217;
import net.bytebuddy.description.method.MethodDescription;
import p128.C8157;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0004H ¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m151d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "", "containsInclusive-Uv8p0NA", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;J)Z", "containsInclusive", "position", "bounds", "", "compare-3MmeM6k$foundation", "(JL飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;)I", "compare", "start", "end", "isSelected-2x9bVx0$foundation", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;JJ)Z", "isSelected", "Vertical", "Horizontal", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public abstract class SelectionMode {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ SelectionMode[] $VALUES;
    public static final SelectionMode Vertical = new SelectionMode("Vertical", 0) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        {
            AbstractC5217 abstractC5217 = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation */
        public int mo2295compare3MmeM6k$foundation(long position, C8157 bounds) {
            if (AbstractC1733.m2369(bounds, position)) {
                return 0;
            }
            int i = (int) (4294967295L & position);
            if (Float.intBitsToFloat(i) < bounds.f19884) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (position >> 32)) >= bounds.f19885 || Float.intBitsToFloat(i) >= bounds.f19882) ? 1 : -1;
        }
    };
    public static final SelectionMode Horizontal = new SelectionMode("Horizontal", 1) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        {
            AbstractC5217 abstractC5217 = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation */
        public int mo2295compare3MmeM6k$foundation(long position, C8157 bounds) {
            if (AbstractC1733.m2369(bounds, position)) {
                return 0;
            }
            int i = (int) (position >> 32);
            if (Float.intBitsToFloat(i) < bounds.f19885) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (position & 4294967295L)) >= bounds.f19884 || Float.intBitsToFloat(i) >= bounds.f19883) ? 1 : -1;
        }
    };

    private static final /* synthetic */ SelectionMode[] $values() {
        return new SelectionMode[]{Vertical, Horizontal};
    }

    static {
        SelectionMode[] selectionModeArr$values = $values();
        $VALUES = selectionModeArr$values;
        $ENTRIES = AbstractC5196.m9425(selectionModeArr$values);
    }

    public /* synthetic */ SelectionMode(String str, int i, AbstractC5217 abstractC5217) {
        this(str, i);
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m2294containsInclusiveUv8p0NA(C8157 c8157, long j) {
        float f = c8157.f19885;
        float f2 = c8157.f19883;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = c8157.f19884;
        float f4 = c8157.f19882;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: compare-3MmeM6k$foundation, reason: not valid java name */
    public abstract int mo2295compare3MmeM6k$foundation(long position, C8157 bounds);

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation, reason: not valid java name */
    public final boolean m2296isSelected2x9bVx0$foundation(C8157 bounds, long start, long end) {
        if (m2294containsInclusiveUv8p0NA(bounds, start) || m2294containsInclusiveUv8p0NA(bounds, end)) {
            return true;
        }
        return (mo2295compare3MmeM6k$foundation(start, bounds) > 0) ^ (mo2295compare3MmeM6k$foundation(end, bounds) > 0);
    }

    private SelectionMode(String str, int i) {
    }
}
