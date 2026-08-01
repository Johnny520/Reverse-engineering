package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m151d2 = {"Lkotlinx/serialization/json/ClassDiscriminatorMode;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "NONE", "ALL_JSON_OBJECTS", "POLYMORPHIC", "kotlinx-serialization-json"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class ClassDiscriminatorMode {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ClassDiscriminatorMode[] $VALUES;
    public static final ClassDiscriminatorMode NONE = new ClassDiscriminatorMode("NONE", 0);
    public static final ClassDiscriminatorMode ALL_JSON_OBJECTS = new ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
    public static final ClassDiscriminatorMode POLYMORPHIC = new ClassDiscriminatorMode("POLYMORPHIC", 2);

    private static final /* synthetic */ ClassDiscriminatorMode[] $values() {
        return new ClassDiscriminatorMode[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    static {
        ClassDiscriminatorMode[] classDiscriminatorModeArr$values = $values();
        $VALUES = classDiscriminatorModeArr$values;
        $ENTRIES = AbstractC5196.m9425(classDiscriminatorModeArr$values);
    }

    private ClassDiscriminatorMode(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static ClassDiscriminatorMode valueOf(String str) {
        return (ClassDiscriminatorMode) Enum.valueOf(ClassDiscriminatorMode.class, str);
    }

    public static ClassDiscriminatorMode[] values() {
        return (ClassDiscriminatorMode[]) $VALUES.clone();
    }
}
