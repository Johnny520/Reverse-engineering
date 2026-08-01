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
public final class UnsignedType {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ UnsignedType[] $VALUES;
    private final C4687 arrayClassId;
    private final C4687 classId;
    private final C4690 typeName;
    public static final UnsignedType UBYTE = new UnsignedType("UBYTE", 0, AbstractC4683.m9315("kotlin/UByte", false));
    public static final UnsignedType USHORT = new UnsignedType("USHORT", 1, AbstractC4683.m9315("kotlin/UShort", false));
    public static final UnsignedType UINT = new UnsignedType("UINT", 2, AbstractC4683.m9315("kotlin/UInt", false));
    public static final UnsignedType ULONG = new UnsignedType("ULONG", 3, AbstractC4683.m9315("kotlin/ULong", false));

    private static final /* synthetic */ UnsignedType[] $values() {
        return new UnsignedType[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        UnsignedType[] unsignedTypeArr$values = $values();
        $VALUES = unsignedTypeArr$values;
        $ENTRIES = AbstractC4363.m8876(unsignedTypeArr$values);
    }

    private UnsignedType(String str, int i, C4687 c4687) {
        this.classId = c4687;
        C4690 c4690M9333 = c4687.m9333();
        this.typeName = c4690M9333;
        this.arrayClassId = new C4687(c4687.f13695, C4690.m9340(c4690M9333.m9345() + "Array"));
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) $VALUES.clone();
    }

    public final C4687 getArrayClassId() {
        return this.arrayClassId;
    }

    public final C4687 getClassId() {
        return this.classId;
    }

    public final C4690 getTypeName() {
        return this.typeName;
    }
}
