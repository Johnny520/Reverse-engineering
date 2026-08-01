package kotlin.io.path;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "CONTINUE", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CopyActionResult {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ CopyActionResult[] $VALUES;
    public static final CopyActionResult CONTINUE = new CopyActionResult("CONTINUE", 0);
    public static final CopyActionResult SKIP_SUBTREE = new CopyActionResult("SKIP_SUBTREE", 1);
    public static final CopyActionResult TERMINATE = new CopyActionResult("TERMINATE", 2);

    private static final /* synthetic */ CopyActionResult[] $values() {
        return new CopyActionResult[]{CONTINUE, SKIP_SUBTREE, TERMINATE};
    }

    static {
        CopyActionResult[] copyActionResultArr$values = $values();
        $VALUES = copyActionResultArr$values;
        $ENTRIES = AbstractC4363.m8876(copyActionResultArr$values);
    }

    private CopyActionResult(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static CopyActionResult valueOf(String str) {
        return (CopyActionResult) Enum.valueOf(CopyActionResult.class, str);
    }

    public static CopyActionResult[] values() {
        return (CopyActionResult[]) $VALUES.clone();
    }
}
