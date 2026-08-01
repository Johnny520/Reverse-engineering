package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/style/ResolvedTextDirection;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Ltr", "Rtl", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResolvedTextDirection {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ResolvedTextDirection[] $VALUES;
    public static final ResolvedTextDirection Ltr = new ResolvedTextDirection("Ltr", 0);
    public static final ResolvedTextDirection Rtl = new ResolvedTextDirection("Rtl", 1);

    private static final /* synthetic */ ResolvedTextDirection[] $values() {
        return new ResolvedTextDirection[]{Ltr, Rtl};
    }

    static {
        ResolvedTextDirection[] resolvedTextDirectionArr$values = $values();
        $VALUES = resolvedTextDirectionArr$values;
        $ENTRIES = AbstractC4363.m8876(resolvedTextDirectionArr$values);
    }

    private ResolvedTextDirection(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static ResolvedTextDirection valueOf(String str) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, str);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) $VALUES.clone();
    }
}
