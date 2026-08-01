package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C0390x702eebb8 extends FunctionReferenceImpl implements InterfaceC7383 {
    public C0390x702eebb8(Object obj) {
        super(2, obj, C5689.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }

    @Override // p068.InterfaceC7383
    public final Boolean invoke(AbstractC5714 abstractC5714, AbstractC5714 abstractC57142) {
        abstractC5714.getClass();
        abstractC57142.getClass();
        ((C5689) this.receiver).getClass();
        InterfaceC5688.f14483.getClass();
        C5687 c5687 = C5695.f14494;
        return Boolean.valueOf(c5687.m10157(abstractC5714, abstractC57142) && !c5687.m10157(abstractC57142, abstractC5714));
    }
}
