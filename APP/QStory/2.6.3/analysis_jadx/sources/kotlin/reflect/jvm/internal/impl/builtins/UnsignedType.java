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
public final class UnsignedType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ UnsignedType[] $VALUES;
    private final C4688 arrayClassId;
    private final C4688 classId;
    private final C4691 typeName;
    public static final UnsignedType UBYTE = new UnsignedType("UBYTE", 0, AbstractC4684.m9305("kotlin/UByte", false));
    public static final UnsignedType USHORT = new UnsignedType("USHORT", 1, AbstractC4684.m9305("kotlin/UShort", false));
    public static final UnsignedType UINT = new UnsignedType("UINT", 2, AbstractC4684.m9305("kotlin/UInt", false));
    public static final UnsignedType ULONG = new UnsignedType("ULONG", 3, AbstractC4684.m9305("kotlin/ULong", false));

    private static final /* synthetic */ UnsignedType[] $values() {
        return new UnsignedType[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        UnsignedType[] unsignedTypeArr$values = $values();
        $VALUES = unsignedTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(unsignedTypeArr$values);
    }

    private UnsignedType(String str, int i, C4688 c4688) {
        this.classId = c4688;
        C4691 c4691M9323 = c4688.m9323();
        this.typeName = c4691M9323;
        this.arrayClassId = new C4688(c4688.f13699, C4691.m9330(c4691M9323.m9335() + "Array"));
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) $VALUES.clone();
    }

    public final C4688 getArrayClassId() {
        return this.arrayClassId;
    }

    public final C4688 getClassId() {
        return this.classId;
    }

    public final C4691 getTypeName() {
        return this.typeName;
    }
}
