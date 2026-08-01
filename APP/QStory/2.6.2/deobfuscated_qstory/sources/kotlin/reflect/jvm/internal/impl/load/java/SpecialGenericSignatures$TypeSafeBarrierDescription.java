package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.jvm.internal.AbstractC4384;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class SpecialGenericSignatures$TypeSafeBarrierDescription {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ SpecialGenericSignatures$TypeSafeBarrierDescription[] $VALUES;
    private final Object defaultValue;
    public static final SpecialGenericSignatures$TypeSafeBarrierDescription NULL = new SpecialGenericSignatures$TypeSafeBarrierDescription("NULL", 0, null);
    public static final SpecialGenericSignatures$TypeSafeBarrierDescription INDEX = new SpecialGenericSignatures$TypeSafeBarrierDescription("INDEX", 1, -1);
    public static final SpecialGenericSignatures$TypeSafeBarrierDescription FALSE = new SpecialGenericSignatures$TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
    public static final SpecialGenericSignatures$TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new SpecialGenericSignatures$TypeSafeBarrierDescription("MAP_GET_OR_DEFAULT", 3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT
        {
            AbstractC4384 abstractC4384 = null;
        }
    };

    private static final /* synthetic */ SpecialGenericSignatures$TypeSafeBarrierDescription[] $values() {
        return new SpecialGenericSignatures$TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
    }

    static {
        SpecialGenericSignatures$TypeSafeBarrierDescription[] specialGenericSignatures$TypeSafeBarrierDescriptionArr$values = $values();
        $VALUES = specialGenericSignatures$TypeSafeBarrierDescriptionArr$values;
        $ENTRIES = AbstractC4363.m8876(specialGenericSignatures$TypeSafeBarrierDescriptionArr$values);
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

    public /* synthetic */ SpecialGenericSignatures$TypeSafeBarrierDescription(String str, int i, Object obj, AbstractC4384 abstractC4384) {
        this(str, i, obj);
    }
}
