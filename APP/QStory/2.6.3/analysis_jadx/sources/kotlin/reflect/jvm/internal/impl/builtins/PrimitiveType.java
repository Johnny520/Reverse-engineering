package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4347;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p049.AbstractC6526;
import p049.C6534;
import p049.C6535;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ PrimitiveType[] $VALUES;
    public static final PrimitiveType BOOLEAN = new PrimitiveType("BOOLEAN", 0, "Boolean");
    public static final PrimitiveType BYTE;
    public static final PrimitiveType CHAR;
    public static final C6535 Companion;
    public static final PrimitiveType DOUBLE;
    public static final PrimitiveType FLOAT;
    public static final PrimitiveType INT;
    public static final PrimitiveType LONG;
    public static final Set<PrimitiveType> NUMBER_TYPES;
    public static final PrimitiveType SHORT;
    private final InterfaceC5184 arrayTypeFqName$delegate;
    private final C4691 arrayTypeName;
    private final InterfaceC5184 typeFqName$delegate;
    private final C4691 typeName;

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
        $ENTRIES = AbstractC4364.m8866(primitiveTypeArr$values);
        Companion = new C6535();
        NUMBER_TYPES = AbstractC4347.m8845(new PrimitiveType[]{primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7});
    }

    private PrimitiveType(String str, int i, String str2) {
        this.typeName = C4691.m9330(str2);
        this.arrayTypeName = C4691.m9330(str2.concat("Array"));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = AbstractC5187.m10215(lazyThreadSafetyMode, new C6534(this, 0));
        this.arrayTypeFqName$delegate = AbstractC5187.m10215(lazyThreadSafetyMode, new C6534(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4687 arrayTypeFqName_delegate$lambda$0(PrimitiveType primitiveType) {
        return AbstractC6526.f17853.m9321(primitiveType.arrayTypeName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4687 typeFqName_delegate$lambda$0(PrimitiveType primitiveType) {
        return AbstractC6526.f17853.m9321(primitiveType.typeName);
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    public final C4687 getArrayTypeFqName() {
        return (C4687) this.arrayTypeFqName$delegate.getValue();
    }

    public final C4691 getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final C4687 getTypeFqName() {
        return (C4687) this.typeFqName$delegate.getValue();
    }

    public final C4691 getTypeName() {
        return this.typeName;
    }
}
