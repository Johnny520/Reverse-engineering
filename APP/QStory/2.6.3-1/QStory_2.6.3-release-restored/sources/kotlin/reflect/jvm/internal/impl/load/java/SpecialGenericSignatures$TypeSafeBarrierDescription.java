package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.AbstractC5217;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class SpecialGenericSignatures$TypeSafeBarrierDescription {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ SpecialGenericSignatures$TypeSafeBarrierDescription[] $VALUES;
    private final Object defaultValue;
    public static final SpecialGenericSignatures$TypeSafeBarrierDescription NULL = new SpecialGenericSignatures$TypeSafeBarrierDescription("NULL", 0, null);
    public static final SpecialGenericSignatures$TypeSafeBarrierDescription INDEX = new SpecialGenericSignatures$TypeSafeBarrierDescription("INDEX", 1, -1);
    public static final SpecialGenericSignatures$TypeSafeBarrierDescription FALSE = new SpecialGenericSignatures$TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
    public static final SpecialGenericSignatures$TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new SpecialGenericSignatures$TypeSafeBarrierDescription("MAP_GET_OR_DEFAULT", 3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT
        {
            AbstractC5217 abstractC5217 = null;
        }
    };

    private static final /* synthetic */ SpecialGenericSignatures$TypeSafeBarrierDescription[] $values() {
        return new SpecialGenericSignatures$TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
    }

    static {
        SpecialGenericSignatures$TypeSafeBarrierDescription[] specialGenericSignatures$TypeSafeBarrierDescriptionArr$values = $values();
        $VALUES = specialGenericSignatures$TypeSafeBarrierDescriptionArr$values;
        $ENTRIES = AbstractC5196.m9425(specialGenericSignatures$TypeSafeBarrierDescriptionArr$values);
    }

    private SpecialGenericSignatures$TypeSafeBarrierDescription(String str, int i, Object obj) {
        this.defaultValue = obj;
    }

    public static SpecialGenericSignatures$TypeSafeBarrierDescription valueOf(String str) {
        return (SpecialGenericSignatures$TypeSafeBarrierDescription) Enum.valueOf(SpecialGenericSignatures$TypeSafeBarrierDescription.class, str);
    }

    public static SpecialGenericSignatures$TypeSafeBarrierDescription[] values() {
        return (SpecialGenericSignatures$TypeSafeBarrierDescription[]) $VALUES.clone();
    }

    public /* synthetic */ SpecialGenericSignatures$TypeSafeBarrierDescription(String str, int i, Object obj, AbstractC5217 abstractC5217) {
        this(str, i, obj);
    }
}
