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
public final class UnsignedType {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ UnsignedType[] $VALUES;
    private final C5520 arrayClassId;
    private final C5520 classId;
    private final C5523 typeName;
    public static final UnsignedType UBYTE = new UnsignedType("UBYTE", 0, AbstractC5516.m9864("kotlin/UByte", false));
    public static final UnsignedType USHORT = new UnsignedType("USHORT", 1, AbstractC5516.m9864("kotlin/UShort", false));
    public static final UnsignedType UINT = new UnsignedType("UINT", 2, AbstractC5516.m9864("kotlin/UInt", false));
    public static final UnsignedType ULONG = new UnsignedType("ULONG", 3, AbstractC5516.m9864("kotlin/ULong", false));

    private static final /* synthetic */ UnsignedType[] $values() {
        return new UnsignedType[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        UnsignedType[] unsignedTypeArr$values = $values();
        $VALUES = unsignedTypeArr$values;
        $ENTRIES = AbstractC5196.m9425(unsignedTypeArr$values);
    }

    private UnsignedType(String str, int i, C5520 c5520) {
        this.classId = c5520;
        C5523 c5523M9882 = c5520.m9882();
        this.typeName = c5523M9882;
        this.arrayClassId = new C5520(c5520.f14044, C5523.m9889(c5523M9882.m9894() + "Array"));
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) $VALUES.clone();
    }

    public final C5520 getArrayClassId() {
        return this.arrayClassId;
    }

    public final C5520 getClassId() {
        return this.classId;
    }

    public final C5523 getTypeName() {
        return this.typeName;
    }
}
