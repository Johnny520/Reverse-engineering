package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C0391xc97d8c34 extends FunctionReferenceImpl implements InterfaceC7383 {
    public C0391xc97d8c34(Object obj) {
        super(2, obj, C5687.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }

    @Override // p068.InterfaceC7383
    public final Boolean invoke(AbstractC5714 abstractC5714, AbstractC5714 abstractC57142) {
        abstractC5714.getClass();
        abstractC57142.getClass();
        return Boolean.valueOf(((C5687) this.receiver).m10158(abstractC5714, abstractC57142));
    }
}
