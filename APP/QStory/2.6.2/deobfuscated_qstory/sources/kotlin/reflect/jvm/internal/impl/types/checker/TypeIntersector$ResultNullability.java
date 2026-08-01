package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.jvm.internal.AbstractC4384;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.C4875;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
abstract class TypeIntersector$ResultNullability {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ TypeIntersector$ResultNullability[] $VALUES;
    public static final TypeIntersector$ResultNullability START = new TypeIntersector$ResultNullability("START", 0) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.START
        {
            AbstractC4384 abstractC4384 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public TypeIntersector$ResultNullability combine(AbstractC4913 abstractC4913) {
            abstractC4913.getClass();
            return getResultNullability(abstractC4913);
        }
    };
    public static final TypeIntersector$ResultNullability ACCEPT_NULL = new TypeIntersector$ResultNullability("ACCEPT_NULL", 1) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.ACCEPT_NULL
        {
            AbstractC4384 abstractC4384 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public TypeIntersector$ResultNullability combine(AbstractC4913 abstractC4913) {
            abstractC4913.getClass();
            return getResultNullability(abstractC4913);
        }
    };
    public static final TypeIntersector$ResultNullability UNKNOWN = new TypeIntersector$ResultNullability("UNKNOWN", 2) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.UNKNOWN
        {
            AbstractC4384 abstractC4384 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public TypeIntersector$ResultNullability combine(AbstractC4913 abstractC4913) {
            abstractC4913.getClass();
            TypeIntersector$ResultNullability resultNullability = getResultNullability(abstractC4913);
            return resultNullability == TypeIntersector$ResultNullability.ACCEPT_NULL ? this : resultNullability;
        }
    };
    public static final TypeIntersector$ResultNullability NOT_NULL = new TypeIntersector$ResultNullability("NOT_NULL", 3) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.NOT_NULL
        {
            AbstractC4384 abstractC4384 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public NOT_NULL combine(AbstractC4913 abstractC4913) {
            abstractC4913.getClass();
            return this;
        }
    };

    private static final /* synthetic */ TypeIntersector$ResultNullability[] $values() {
        return new TypeIntersector$ResultNullability[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
    }

    static {
        TypeIntersector$ResultNullability[] typeIntersector$ResultNullabilityArr$values = $values();
        $VALUES = typeIntersector$ResultNullabilityArr$values;
        $ENTRIES = AbstractC4363.m8876(typeIntersector$ResultNullabilityArr$values);
    }

    public /* synthetic */ TypeIntersector$ResultNullability(String str, int i, AbstractC4384 abstractC4384) {
        this(str, i);
    }

    public static TypeIntersector$ResultNullability valueOf(String str) {
        return (TypeIntersector$ResultNullability) Enum.valueOf(TypeIntersector$ResultNullability.class, str);
    }

    public static TypeIntersector$ResultNullability[] values() {
        return (TypeIntersector$ResultNullability[]) $VALUES.clone();
    }

    public abstract TypeIntersector$ResultNullability combine(AbstractC4913 abstractC4913);

    public final TypeIntersector$ResultNullability getResultNullability(AbstractC4913 abstractC4913) {
        abstractC4913.getClass();
        return abstractC4913.mo9735() ? ACCEPT_NULL : AbstractC4892.m9831(C4857.f14136.m9638(), AbstractC4892.m9832(abstractC4913), C4875.f14178) ? NOT_NULL : UNKNOWN;
    }

    private TypeIntersector$ResultNullability(String str, int i) {
    }
}
