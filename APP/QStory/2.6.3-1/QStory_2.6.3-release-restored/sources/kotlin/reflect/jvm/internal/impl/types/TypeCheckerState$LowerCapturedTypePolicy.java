package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeCheckerState$LowerCapturedTypePolicy {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ TypeCheckerState$LowerCapturedTypePolicy[] $VALUES;
    public static final TypeCheckerState$LowerCapturedTypePolicy CHECK_ONLY_LOWER = new TypeCheckerState$LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0);
    public static final TypeCheckerState$LowerCapturedTypePolicy CHECK_SUBTYPE_AND_LOWER = new TypeCheckerState$LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1);
    public static final TypeCheckerState$LowerCapturedTypePolicy SKIP_LOWER = new TypeCheckerState$LowerCapturedTypePolicy("SKIP_LOWER", 2);

    private static final /* synthetic */ TypeCheckerState$LowerCapturedTypePolicy[] $values() {
        return new TypeCheckerState$LowerCapturedTypePolicy[]{CHECK_ONLY_LOWER, CHECK_SUBTYPE_AND_LOWER, SKIP_LOWER};
    }

    static {
        TypeCheckerState$LowerCapturedTypePolicy[] typeCheckerState$LowerCapturedTypePolicyArr$values = $values();
        $VALUES = typeCheckerState$LowerCapturedTypePolicyArr$values;
        $ENTRIES = AbstractC5196.m9425(typeCheckerState$LowerCapturedTypePolicyArr$values);
    }

    private TypeCheckerState$LowerCapturedTypePolicy(String str, int i) {
    }

    public static TypeCheckerState$LowerCapturedTypePolicy valueOf(String str) {
        return (TypeCheckerState$LowerCapturedTypePolicy) Enum.valueOf(TypeCheckerState$LowerCapturedTypePolicy.class, str);
    }

    public static TypeCheckerState$LowerCapturedTypePolicy[] values() {
        return (TypeCheckerState$LowerCapturedTypePolicy[]) $VALUES.clone();
    }
}
