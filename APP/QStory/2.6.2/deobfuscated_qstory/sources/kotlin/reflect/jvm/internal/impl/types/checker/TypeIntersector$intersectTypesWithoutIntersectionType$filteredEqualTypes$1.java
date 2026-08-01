package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(Object obj) {
        super(2, obj, C4856.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }

    @Override // p052.InterfaceC6553
    public final Boolean invoke(AbstractC4881 abstractC4881, AbstractC4881 abstractC48812) {
        abstractC4881.getClass();
        abstractC48812.getClass();
        ((C4856) this.receiver).getClass();
        InterfaceC4855.f14134.getClass();
        C4854 c4854 = C4862.f14145;
        return Boolean.valueOf(c4854.m9608(abstractC4881, abstractC48812) && !c4854.m9608(abstractC48812, abstractC4881));
    }
}
