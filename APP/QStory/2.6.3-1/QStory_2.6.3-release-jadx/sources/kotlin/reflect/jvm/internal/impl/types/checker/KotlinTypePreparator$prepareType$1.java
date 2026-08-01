package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import p068.InterfaceC7387;
import p113.InterfaceC8049;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj, C5682.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
    }

    @Override // p068.InterfaceC7387
    public final AbstractC5746 invoke(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return ((C5682) this.receiver).mo10148(interfaceC8049);
    }
}
