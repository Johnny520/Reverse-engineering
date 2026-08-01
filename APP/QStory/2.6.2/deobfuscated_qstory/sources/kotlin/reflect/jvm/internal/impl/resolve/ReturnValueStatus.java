package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import p066.C6877;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ReturnValueStatus {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ReturnValueStatus[] $VALUES;
    public static final C6877 Companion;
    public static final ReturnValueStatus MustUse = new ReturnValueStatus("MustUse", 0);
    public static final ReturnValueStatus ExplicitlyIgnorable = new ReturnValueStatus("ExplicitlyIgnorable", 1);
    public static final ReturnValueStatus Unspecified = new ReturnValueStatus("Unspecified", 2);

    private static final /* synthetic */ ReturnValueStatus[] $values() {
        return new ReturnValueStatus[]{MustUse, ExplicitlyIgnorable, Unspecified};
    }

    static {
        ReturnValueStatus[] returnValueStatusArr$values = $values();
        $VALUES = returnValueStatusArr$values;
        $ENTRIES = AbstractC4363.m8876(returnValueStatusArr$values);
        Companion = new C6877();
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
