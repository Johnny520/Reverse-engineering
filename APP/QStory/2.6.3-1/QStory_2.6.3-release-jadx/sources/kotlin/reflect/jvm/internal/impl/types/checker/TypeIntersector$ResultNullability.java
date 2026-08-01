package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.AbstractC5217;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.C5708;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
abstract class TypeIntersector$ResultNullability {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ TypeIntersector$ResultNullability[] $VALUES;
    public static final TypeIntersector$ResultNullability START = new TypeIntersector$ResultNullability("START", 0) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.START
        {
            AbstractC5217 abstractC5217 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public TypeIntersector$ResultNullability combine(AbstractC5746 abstractC5746) {
            abstractC5746.getClass();
            return getResultNullability(abstractC5746);
        }
    };
    public static final TypeIntersector$ResultNullability ACCEPT_NULL = new TypeIntersector$ResultNullability("ACCEPT_NULL", 1) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.ACCEPT_NULL
        {
            AbstractC5217 abstractC5217 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public TypeIntersector$ResultNullability combine(AbstractC5746 abstractC5746) {
            abstractC5746.getClass();
            return getResultNullability(abstractC5746);
        }
    };
    public static final TypeIntersector$ResultNullability UNKNOWN = new TypeIntersector$ResultNullability("UNKNOWN", 2) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.UNKNOWN
        {
            AbstractC5217 abstractC5217 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public TypeIntersector$ResultNullability combine(AbstractC5746 abstractC5746) {
            abstractC5746.getClass();
            TypeIntersector$ResultNullability resultNullability = getResultNullability(abstractC5746);
            return resultNullability == TypeIntersector$ResultNullability.ACCEPT_NULL ? this : resultNullability;
        }
    };
    public static final TypeIntersector$ResultNullability NOT_NULL = new TypeIntersector$ResultNullability("NOT_NULL", 3) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.NOT_NULL
        {
            AbstractC5217 abstractC5217 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public NOT_NULL combine(AbstractC5746 abstractC5746) {
            abstractC5746.getClass();
            return this;
        }
    };

    private static final /* synthetic */ TypeIntersector$ResultNullability[] $values() {
        return new TypeIntersector$ResultNullability[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
    }

    static {
        TypeIntersector$ResultNullability[] typeIntersector$ResultNullabilityArr$values = $values();
        $VALUES = typeIntersector$ResultNullabilityArr$values;
        $ENTRIES = AbstractC5196.m9425(typeIntersector$ResultNullabilityArr$values);
    }

    public /* synthetic */ TypeIntersector$ResultNullability(String str, int i, AbstractC5217 abstractC5217) {
        this(str, i);
    }

    public static TypeIntersector$ResultNullability valueOf(String str) {
        return (TypeIntersector$ResultNullability) Enum.valueOf(TypeIntersector$ResultNullability.class, str);
    }

    public static TypeIntersector$ResultNullability[] values() {
        return (TypeIntersector$ResultNullability[]) $VALUES.clone();
    }

    public abstract TypeIntersector$ResultNullability combine(AbstractC5746 abstractC5746);

    public final TypeIntersector$ResultNullability getResultNullability(AbstractC5746 abstractC5746) {
        abstractC5746.getClass();
        return abstractC5746.mo10284() ? ACCEPT_NULL : AbstractC5725.m10384(C5690.f14485.m10187(), AbstractC5725.m10385(abstractC5746), C5708.f14527) ? NOT_NULL : UNKNOWN;
    }

    private TypeIntersector$ResultNullability(String str, int i) {
    }
}
