package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import kotlin.jvm.internal.AbstractC4385;
import net.bytebuddy.description.method.MethodDescription;
import p112.C7328;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0004H ¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "", "containsInclusive-Uv8p0NA", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;J)Z", "containsInclusive", "position", "bounds", "", "compare-3MmeM6k$foundation", "(JL飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;)I", "compare", "start", "end", "isSelected-2x9bVx0$foundation", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;JJ)Z", "isSelected", "Vertical", "Horizontal", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SelectionMode {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ SelectionMode[] $VALUES;
    public static final SelectionMode Vertical = new SelectionMode("Vertical", 0) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        {
            AbstractC4385 abstractC4385 = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation */
        public int mo1735compare3MmeM6k$foundation(long position, C7328 bounds) {
            if (AbstractC0895.m1809(bounds, position)) {
                return 0;
            }
            int i = (int) (4294967295L & position);
            if (Float.intBitsToFloat(i) < bounds.f19539) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (position >> 32)) >= bounds.f19540 || Float.intBitsToFloat(i) >= bounds.f19537) ? 1 : -1;
        }
    };
    public static final SelectionMode Horizontal = new SelectionMode("Horizontal", 1) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        {
            AbstractC4385 abstractC4385 = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation */
        public int mo1735compare3MmeM6k$foundation(long position, C7328 bounds) {
            if (AbstractC0895.m1809(bounds, position)) {
                return 0;
            }
            int i = (int) (position >> 32);
            if (Float.intBitsToFloat(i) < bounds.f19540) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (position & 4294967295L)) >= bounds.f19539 || Float.intBitsToFloat(i) >= bounds.f19538) ? 1 : -1;
        }
    };

    private static final /* synthetic */ SelectionMode[] $values() {
        return new SelectionMode[]{Vertical, Horizontal};
    }

    static {
        SelectionMode[] selectionModeArr$values = $values();
        $VALUES = selectionModeArr$values;
        $ENTRIES = AbstractC4364.m8866(selectionModeArr$values);
    }

    public /* synthetic */ SelectionMode(String str, int i, AbstractC4385 abstractC4385) {
        this(str, i);
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m1734containsInclusiveUv8p0NA(C7328 c7328, long j) {
        float f = c7328.f19540;
        float f2 = c7328.f19538;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = c7328.f19539;
        float f4 = c7328.f19537;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: compare-3MmeM6k$foundation, reason: not valid java name */
    public abstract int mo1735compare3MmeM6k$foundation(long position, C7328 bounds);

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation, reason: not valid java name */
    public final boolean m1736isSelected2x9bVx0$foundation(C7328 bounds, long start, long end) {
        if (m1734containsInclusiveUv8p0NA(bounds, start) || m1734containsInclusiveUv8p0NA(bounds, end)) {
            return true;
        }
        return (mo1735compare3MmeM6k$foundation(start, bounds) > 0) ^ (mo1735compare3MmeM6k$foundation(end, bounds) > 0);
    }

    private SelectionMode(String str, int i) {
    }
}
