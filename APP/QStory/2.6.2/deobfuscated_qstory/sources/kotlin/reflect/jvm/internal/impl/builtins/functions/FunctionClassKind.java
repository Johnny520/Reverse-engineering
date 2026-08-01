package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import p045.C6463;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class FunctionClassKind {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ FunctionClassKind[] $VALUES;
    public static final C6463 Companion;
    public static final FunctionClassKind Function = new FunctionClassKind("Function", 0);
    public static final FunctionClassKind SuspendFunction = new FunctionClassKind("SuspendFunction", 1);
    public static final FunctionClassKind KFunction = new FunctionClassKind("KFunction", 2);
    public static final FunctionClassKind KSuspendFunction = new FunctionClassKind("KSuspendFunction", 3);
    public static final FunctionClassKind UNKNOWN = new FunctionClassKind("UNKNOWN", 4);

    private static final /* synthetic */ FunctionClassKind[] $values() {
        return new FunctionClassKind[]{Function, SuspendFunction, KFunction, KSuspendFunction, UNKNOWN};
    }

    static {
        FunctionClassKind[] functionClassKindArr$values = $values();
        $VALUES = functionClassKindArr$values;
        $ENTRIES = AbstractC4363.m8876(functionClassKindArr$values);
        Companion = new C6463();
    }

    private FunctionClassKind(String str, int i) {
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }
}
