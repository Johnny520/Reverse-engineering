package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import p052.InterfaceC6558;
import p097.InterfaceC7220;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj, C4850.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
    }

    @Override // p052.InterfaceC6558
    public final AbstractC4914 invoke(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return ((C4850) this.receiver).mo9589(interfaceC7220);
    }
}
