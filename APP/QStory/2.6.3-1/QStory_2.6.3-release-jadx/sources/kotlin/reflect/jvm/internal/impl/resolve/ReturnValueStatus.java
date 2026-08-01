package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import p082.C7707;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ReturnValueStatus {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ReturnValueStatus[] $VALUES;
    public static final C7707 Companion;
    public static final ReturnValueStatus MustUse = new ReturnValueStatus("MustUse", 0);
    public static final ReturnValueStatus ExplicitlyIgnorable = new ReturnValueStatus("ExplicitlyIgnorable", 1);
    public static final ReturnValueStatus Unspecified = new ReturnValueStatus("Unspecified", 2);

    private static final /* synthetic */ ReturnValueStatus[] $values() {
        return new ReturnValueStatus[]{MustUse, ExplicitlyIgnorable, Unspecified};
    }

    static {
        ReturnValueStatus[] returnValueStatusArr$values = $values();
        $VALUES = returnValueStatusArr$values;
        $ENTRIES = AbstractC5196.m9425(returnValueStatusArr$values);
        Companion = new C7707();
    }

    private ReturnValueStatus(String str, int i) {
    }

    public static ReturnValueStatus valueOf(String str) {
        return (ReturnValueStatus) Enum.valueOf(ReturnValueStatus.class, str);
    }

    public static ReturnValueStatus[] values() {
        return (ReturnValueStatus[]) $VALUES.clone();
    }
}
