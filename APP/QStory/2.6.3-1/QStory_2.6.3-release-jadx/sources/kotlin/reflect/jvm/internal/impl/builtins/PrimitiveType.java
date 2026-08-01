package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5179;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p065.AbstractC7355;
import p065.C7363;
import p065.C7364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveType {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ PrimitiveType[] $VALUES;
    public static final PrimitiveType BOOLEAN = new PrimitiveType("BOOLEAN", 0, "Boolean");
    public static final PrimitiveType BYTE;
    public static final PrimitiveType CHAR;
    public static final C7364 Companion;
    public static final PrimitiveType DOUBLE;
    public static final PrimitiveType FLOAT;
    public static final PrimitiveType INT;
    public static final PrimitiveType LONG;
    public static final Set<PrimitiveType> NUMBER_TYPES;
    public static final PrimitiveType SHORT;
    private final InterfaceC6016 arrayTypeFqName$delegate;
    private final C5523 arrayTypeName;
    private final InterfaceC6016 typeFqName$delegate;
    private final C5523 typeName;

    private static final /* synthetic */ PrimitiveType[] $values() {
        return new PrimitiveType[]{BOOLEAN, CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE};
    }

    static {
        PrimitiveType primitiveType = new PrimitiveType("CHAR", 1, "Char");
        CHAR = primitiveType;
        PrimitiveType primitiveType2 = new PrimitiveType("BYTE", 2, "Byte");
        BYTE = primitiveType2;
        PrimitiveType primitiveType3 = new PrimitiveType("SHORT", 3, "Short");
        SHORT = primitiveType3;
        PrimitiveType primitiveType4 = new PrimitiveType("INT", 4, "Int");
        INT = primitiveType4;
        PrimitiveType primitiveType5 = new PrimitiveType("FLOAT", 5, "Float");
        FLOAT = primitiveType5;
        PrimitiveType primitiveType6 = new PrimitiveType("LONG", 6, "Long");
        LONG = primitiveType6;
        PrimitiveType primitiveType7 = new PrimitiveType("DOUBLE", 7, "Double");
        DOUBLE = primitiveType7;
        PrimitiveType[] primitiveTypeArr$values = $values();
        $VALUES = primitiveTypeArr$values;
        $ENTRIES = AbstractC5196.m9425(primitiveTypeArr$values);
        Companion = new C7364();
        NUMBER_TYPES = AbstractC5179.m9404(new PrimitiveType[]{primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7});
    }

    private PrimitiveType(String str, int i, String str2) {
        this.typeName = C5523.m9889(str2);
        this.arrayTypeName = C5523.m9889(str2.concat("Array"));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = AbstractC6019.m10774(lazyThreadSafetyMode, new C7363(this, 0));
        this.arrayTypeFqName$delegate = AbstractC6019.m10774(lazyThreadSafetyMode, new C7363(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5519 arrayTypeFqName_delegate$lambda$0(PrimitiveType primitiveType) {
        return AbstractC7355.f18198.m9880(primitiveType.arrayTypeName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5519 typeFqName_delegate$lambda$0(PrimitiveType primitiveType) {
        return AbstractC7355.f18198.m9880(primitiveType.typeName);
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    public final C5519 getArrayTypeFqName() {
        return (C5519) this.arrayTypeFqName$delegate.getValue();
    }

    public final C5523 getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final C5519 getTypeFqName() {
        return (C5519) this.typeFqName$delegate.getValue();
    }

    public final C5523 getTypeName() {
        return this.typeName;
    }
}
