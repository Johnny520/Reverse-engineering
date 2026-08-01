package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeVariance {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ TypeVariance[] $VALUES;
    private final String presentation;

    /* JADX INFO: renamed from: IN */
    public static final TypeVariance f309IN = new TypeVariance("IN", 0, "in");
    public static final TypeVariance OUT = new TypeVariance("OUT", 1, "out");
    public static final TypeVariance INV = new TypeVariance("INV", 2, "");

    private static final /* synthetic */ TypeVariance[] $values() {
        return new TypeVariance[]{f309IN, OUT, INV};
    }

    static {
        TypeVariance[] typeVarianceArr$values = $values();
        $VALUES = typeVarianceArr$values;
        $ENTRIES = AbstractC5196.m9425(typeVarianceArr$values);
    }

    private TypeVariance(String str, int i, String str2) {
        this.presentation = str2;
    }

    public static TypeVariance valueOf(String str) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, str);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
