package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4346;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p049.AbstractC6525;
import p049.C6533;
import p049.C6534;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveType {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ PrimitiveType[] $VALUES;
    public static final PrimitiveType BOOLEAN = new PrimitiveType("BOOLEAN", 0, "Boolean");
    public static final PrimitiveType BYTE;
    public static final PrimitiveType CHAR;
    public static final C6534 Companion;
    public static final PrimitiveType DOUBLE;
    public static final PrimitiveType FLOAT;
    public static final PrimitiveType INT;
    public static final PrimitiveType LONG;
    public static final Set<PrimitiveType> NUMBER_TYPES;
    public static final PrimitiveType SHORT;
    private final InterfaceC5183 arrayTypeFqName$delegate;
    private final C4690 arrayTypeName;
    private final InterfaceC5183 typeFqName$delegate;
    private final C4690 typeName;

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
        $ENTRIES = AbstractC4363.m8876(primitiveTypeArr$values);
        Companion = new C6534();
        NUMBER_TYPES = AbstractC4346.m8852(new PrimitiveType[]{primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7});
    }

    private PrimitiveType(String str, int i, String str2) {
        this.typeName = C4690.m9340(str2);
        this.arrayTypeName = C4690.m9340(str2.concat("Array"));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = AbstractC5186.m10211(lazyThreadSafetyMode, new C6533(this, 0));
        this.arrayTypeFqName$delegate = AbstractC5186.m10211(lazyThreadSafetyMode, new C6533(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4686 arrayTypeFqName_delegate$lambda$0(PrimitiveType primitiveType) {
        return AbstractC6525.f17857.m9331(primitiveType.arrayTypeName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4686 typeFqName_delegate$lambda$0(PrimitiveType primitiveType) {
        return AbstractC6525.f17857.m9331(primitiveType.typeName);
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    public final C4686 getArrayTypeFqName() {
        return (C4686) this.arrayTypeFqName$delegate.getValue();
    }

    public final C4690 getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final C4686 getTypeFqName() {
        return (C4686) this.typeFqName$delegate.getValue();
    }

    public final C4690 getTypeName() {
        return this.typeName;
    }
}
