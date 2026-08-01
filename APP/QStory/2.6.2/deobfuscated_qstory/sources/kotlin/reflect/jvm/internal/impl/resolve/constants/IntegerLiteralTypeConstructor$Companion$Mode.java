package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final class IntegerLiteralTypeConstructor$Companion$Mode {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ IntegerLiteralTypeConstructor$Companion$Mode[] $VALUES;
    public static final IntegerLiteralTypeConstructor$Companion$Mode COMMON_SUPER_TYPE = new IntegerLiteralTypeConstructor$Companion$Mode("COMMON_SUPER_TYPE", 0);
    public static final IntegerLiteralTypeConstructor$Companion$Mode INTERSECTION_TYPE = new IntegerLiteralTypeConstructor$Companion$Mode("INTERSECTION_TYPE", 1);

    private static final /* synthetic */ IntegerLiteralTypeConstructor$Companion$Mode[] $values() {
        return new IntegerLiteralTypeConstructor$Companion$Mode[]{COMMON_SUPER_TYPE, INTERSECTION_TYPE};
    }

    static {
        IntegerLiteralTypeConstructor$Companion$Mode[] integerLiteralTypeConstructor$Companion$ModeArr$values = $values();
        $VALUES = integerLiteralTypeConstructor$Companion$ModeArr$values;
        $ENTRIES = AbstractC4363.m8876(integerLiteralTypeConstructor$Companion$ModeArr$values);
    }

    private IntegerLiteralTypeConstructor$Companion$Mode(String str, int i) {
    }

    public static IntegerLiteralTypeConstructor$Companion$Mode valueOf(String str) {
        return (IntegerLiteralTypeConstructor$Companion$Mode) Enum.valueOf(IntegerLiteralTypeConstructor$Companion$Mode.class, str);
    }

    public static IntegerLiteralTypeConstructor$Companion$Mode[] values() {
        return (IntegerLiteralTypeConstructor$Companion$Mode[]) $VALUES.clone();
    }
}
