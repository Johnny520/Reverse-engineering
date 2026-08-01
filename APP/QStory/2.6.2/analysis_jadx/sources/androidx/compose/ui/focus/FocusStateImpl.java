package androidx.compose.ui.focus;

import io.ktor.util.C4210;
import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "", "isFocused", "()Z", "getHasFocus", "hasFocus", "isCaptured", "Active", "ActiveParent", "Captured", "Inactive", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FocusStateImpl implements InterfaceC1456 {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ FocusStateImpl[] $VALUES;
    public static final FocusStateImpl Active = new FocusStateImpl("Active", 0);
    public static final FocusStateImpl ActiveParent = new FocusStateImpl("ActiveParent", 1);
    public static final FocusStateImpl Captured = new FocusStateImpl("Captured", 2);
    public static final FocusStateImpl Inactive = new FocusStateImpl("Inactive", 3);

    private static final /* synthetic */ FocusStateImpl[] $values() {
        return new FocusStateImpl[]{Active, ActiveParent, Captured, Inactive};
    }

    static {
        FocusStateImpl[] focusStateImplArr$values = $values();
        $VALUES = focusStateImplArr$values;
        $ENTRIES = AbstractC4363.m8876(focusStateImplArr$values);
    }

    private FocusStateImpl(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) $VALUES.clone();
    }

    @Override // androidx.compose.ui.focus.InterfaceC1456
    public boolean getHasFocus() {
        int i = AbstractC1455.f4154[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        C4210.m8621();
        return false;
    }

    public boolean isCaptured() {
        int i = AbstractC1455.f4154[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4) {
            return false;
        }
        C4210.m8621();
        return false;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1456
    public boolean isFocused() {
        int i = AbstractC1455.f4154[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        C4210.m8621();
        return false;
    }
}
