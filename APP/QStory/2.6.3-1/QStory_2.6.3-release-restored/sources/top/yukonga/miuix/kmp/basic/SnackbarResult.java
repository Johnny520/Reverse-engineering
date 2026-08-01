package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m151d2 = {"Ltop/yukonga/miuix/kmp/basic/SnackbarResult;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Dismissed", "ActionPerformed", "miuix"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class SnackbarResult {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ SnackbarResult[] $VALUES;
    public static final SnackbarResult Dismissed = new SnackbarResult("Dismissed", 0);
    public static final SnackbarResult ActionPerformed = new SnackbarResult("ActionPerformed", 1);

    private static final /* synthetic */ SnackbarResult[] $values() {
        return new SnackbarResult[]{Dismissed, ActionPerformed};
    }

    static {
        SnackbarResult[] snackbarResultArr$values = $values();
        $VALUES = snackbarResultArr$values;
        $ENTRIES = AbstractC5196.m9425(snackbarResultArr$values);
    }

    private SnackbarResult(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) $VALUES.clone();
    }
}
