package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4684;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedArrayType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ UnsignedArrayType[] $VALUES;
    private final C4688 classId;
    private final C4691 typeName;
    public static final UnsignedArrayType UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, AbstractC4684.m9305("kotlin/UByteArray", false));
    public static final UnsignedArrayType USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, AbstractC4684.m9305("kotlin/UShortArray", false));
    public static final UnsignedArrayType UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, AbstractC4684.m9305("kotlin/UIntArray", false));
    public static final UnsignedArrayType ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, AbstractC4684.m9305("kotlin/ULongArray", false));

    private static final /* synthetic */ UnsignedArrayType[] $values() {
        return new UnsignedArrayType[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        UnsignedArrayType[] unsignedArrayTypeArr$values = $values();
        $VALUES = unsignedArrayTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(unsignedArrayTypeArr$values);
    }

    private UnsignedArrayType(String str, int i, C4688 c4688) {
        this.classId = c4688;
        this.typeName = c4688.m9323();
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) $VALUES.clone();
    }

    public final C4691 getTypeName() {
        return this.typeName;
    }
}
