package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4683;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedArrayType {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ UnsignedArrayType[] $VALUES;
    private final C4687 classId;
    private final C4690 typeName;
    public static final UnsignedArrayType UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, AbstractC4683.m9315("kotlin/UByteArray", false));
    public static final UnsignedArrayType USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, AbstractC4683.m9315("kotlin/UShortArray", false));
    public static final UnsignedArrayType UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, AbstractC4683.m9315("kotlin/UIntArray", false));
    public static final UnsignedArrayType ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, AbstractC4683.m9315("kotlin/ULongArray", false));

    private static final /* synthetic */ UnsignedArrayType[] $values() {
        return new UnsignedArrayType[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        UnsignedArrayType[] unsignedArrayTypeArr$values = $values();
        $VALUES = unsignedArrayTypeArr$values;
        $ENTRIES = AbstractC4363.m8876(unsignedArrayTypeArr$values);
    }

    private UnsignedArrayType(String str, int i, C4687 c4687) {
        this.classId = c4687;
        this.typeName = c4687.m9333();
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) $VALUES.clone();
    }

    public final C4690 getTypeName() {
        return this.typeName;
    }
}
