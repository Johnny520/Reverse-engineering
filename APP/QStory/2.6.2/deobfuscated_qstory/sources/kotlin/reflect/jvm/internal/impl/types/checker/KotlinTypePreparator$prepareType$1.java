package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import p052.InterfaceC6557;
import p097.InterfaceC7219;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj, C4849.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
    }

    @Override // p052.InterfaceC6557
    public final AbstractC4913 invoke(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return ((C4849) this.receiver).mo9599(interfaceC7219);
    }
}
