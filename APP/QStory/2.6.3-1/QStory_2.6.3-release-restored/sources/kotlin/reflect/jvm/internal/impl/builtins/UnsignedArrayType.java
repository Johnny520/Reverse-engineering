package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5516;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedArrayType {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ UnsignedArrayType[] $VALUES;
    private final C5520 classId;
    private final C5523 typeName;
    public static final UnsignedArrayType UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, AbstractC5516.m9864("kotlin/UByteArray", false));
    public static final UnsignedArrayType USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, AbstractC5516.m9864("kotlin/UShortArray", false));
    public static final UnsignedArrayType UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, AbstractC5516.m9864("kotlin/UIntArray", false));
    public static final UnsignedArrayType ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, AbstractC5516.m9864("kotlin/ULongArray", false));

    private static final /* synthetic */ UnsignedArrayType[] $values() {
        return new UnsignedArrayType[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        UnsignedArrayType[] unsignedArrayTypeArr$values = $values();
        $VALUES = unsignedArrayTypeArr$values;
        $ENTRIES = AbstractC5196.m9425(unsignedArrayTypeArr$values);
    }

    private UnsignedArrayType(String str, int i, C5520 c5520) {
        this.classId = c5520;
        this.typeName = c5520.m9882();
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) $VALUES.clone();
    }

    public final C5523 getTypeName() {
        return this.typeName;
    }
}
