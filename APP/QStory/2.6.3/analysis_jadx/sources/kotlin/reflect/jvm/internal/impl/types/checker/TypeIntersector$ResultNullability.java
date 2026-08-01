package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import kotlin.jvm.internal.AbstractC4385;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4876;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
abstract class TypeIntersector$ResultNullability {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ TypeIntersector$ResultNullability[] $VALUES;
    public static final TypeIntersector$ResultNullability START = new TypeIntersector$ResultNullability("START", 0) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.START
        {
            AbstractC4385 abstractC4385 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public TypeIntersector$ResultNullability combine(AbstractC4914 abstractC4914) {
            abstractC4914.getClass();
            return getResultNullability(abstractC4914);
        }
    };
    public static final TypeIntersector$ResultNullability ACCEPT_NULL = new TypeIntersector$ResultNullability("ACCEPT_NULL", 1) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.ACCEPT_NULL
        {
            AbstractC4385 abstractC4385 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public TypeIntersector$ResultNullability combine(AbstractC4914 abstractC4914) {
            abstractC4914.getClass();
            return getResultNullability(abstractC4914);
        }
    };
    public static final TypeIntersector$ResultNullability UNKNOWN = new TypeIntersector$ResultNullability("UNKNOWN", 2) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.UNKNOWN
        {
            AbstractC4385 abstractC4385 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public TypeIntersector$ResultNullability combine(AbstractC4914 abstractC4914) {
            abstractC4914.getClass();
            TypeIntersector$ResultNullability resultNullability = getResultNullability(abstractC4914);
            return resultNullability == TypeIntersector$ResultNullability.ACCEPT_NULL ? this : resultNullability;
        }
    };
    public static final TypeIntersector$ResultNullability NOT_NULL = new TypeIntersector$ResultNullability("NOT_NULL", 3) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability.NOT_NULL
        {
            AbstractC4385 abstractC4385 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability
        public NOT_NULL combine(AbstractC4914 abstractC4914) {
            abstractC4914.getClass();
            return this;
        }
    };

    private static final /* synthetic */ TypeIntersector$ResultNullability[] $values() {
        return new TypeIntersector$ResultNullability[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
    }

    static {
        TypeIntersector$ResultNullability[] typeIntersector$ResultNullabilityArr$values = $values();
        $VALUES = typeIntersector$ResultNullabilityArr$values;
        $ENTRIES = AbstractC4364.m8866(typeIntersector$ResultNullabilityArr$values);
    }

    public /* synthetic */ TypeIntersector$ResultNullability(String str, int i, AbstractC4385 abstractC4385) {
        this(str, i);
    }

    public static TypeIntersector$ResultNullability valueOf(String str) {
        return (TypeIntersector$ResultNullability) Enum.valueOf(TypeIntersector$ResultNullability.class, str);
    }

    public static TypeIntersector$ResultNullability[] values() {
        return (TypeIntersector$ResultNullability[]) $VALUES.clone();
    }

    public abstract TypeIntersector$ResultNullability combine(AbstractC4914 abstractC4914);

    public final TypeIntersector$ResultNullability getResultNullability(AbstractC4914 abstractC4914) {
        abstractC4914.getClass();
        return abstractC4914.mo9725() ? ACCEPT_NULL : AbstractC4893.m9825(C4858.f14140.m9628(), AbstractC4893.m9826(abstractC4914), C4876.f14182) ? NOT_NULL : UNKNOWN;
    }

    private TypeIntersector$ResultNullability(String str, int i) {
    }
}
