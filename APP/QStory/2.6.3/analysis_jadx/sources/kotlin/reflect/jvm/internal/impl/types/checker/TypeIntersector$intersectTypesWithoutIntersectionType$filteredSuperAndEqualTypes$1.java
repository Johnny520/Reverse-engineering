package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(Object obj) {
        super(2, obj, C4855.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }

    @Override // p052.InterfaceC6554
    public final Boolean invoke(AbstractC4882 abstractC4882, AbstractC4882 abstractC48822) {
        abstractC4882.getClass();
        abstractC48822.getClass();
        return Boolean.valueOf(((C4855) this.receiver).m9599(abstractC4882, abstractC48822));
    }
}
