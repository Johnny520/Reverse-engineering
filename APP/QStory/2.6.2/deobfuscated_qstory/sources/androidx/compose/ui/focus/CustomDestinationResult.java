package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "None", "Cancelled", "Redirected", "RedirectCancelled", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomDestinationResult {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ CustomDestinationResult[] $VALUES;
    public static final CustomDestinationResult None = new CustomDestinationResult("None", 0);
    public static final CustomDestinationResult Cancelled = new CustomDestinationResult("Cancelled", 1);
    public static final CustomDestinationResult Redirected = new CustomDestinationResult("Redirected", 2);
    public static final CustomDestinationResult RedirectCancelled = new CustomDestinationResult("RedirectCancelled", 3);

    private static final /* synthetic */ CustomDestinationResult[] $values() {
        return new CustomDestinationResult[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    static {
        CustomDestinationResult[] customDestinationResultArr$values = $values();
        $VALUES = customDestinationResultArr$values;
        $ENTRIES = AbstractC4363.m8876(customDestinationResultArr$values);
    }

    private CustomDestinationResult(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) $VALUES.clone();
    }
}
