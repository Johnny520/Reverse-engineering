package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeCheckerState$LowerCapturedTypePolicy {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
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
        $ENTRIES = AbstractC4363.m8876(typeCheckerState$LowerCapturedTypePolicyArr$values);
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
