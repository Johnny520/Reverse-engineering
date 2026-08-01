package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(Object obj) {
        super(2, obj, C4857.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }

    @Override // p052.InterfaceC6554
    public final Boolean invoke(AbstractC4882 abstractC4882, AbstractC4882 abstractC48822) {
        abstractC4882.getClass();
        abstractC48822.getClass();
        ((C4857) this.receiver).getClass();
        InterfaceC4856.f14138.getClass();
        C4855 c4855 = C4863.f14149;
        return Boolean.valueOf(c4855.m9598(abstractC4882, abstractC48822) && !c4855.m9598(abstractC48822, abstractC4882));
    }
}
