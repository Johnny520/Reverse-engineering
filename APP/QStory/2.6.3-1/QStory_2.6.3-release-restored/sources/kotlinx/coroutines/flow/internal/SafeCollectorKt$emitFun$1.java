package kotlinx.coroutines.flow.internal;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements InterfaceC7380 {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, InterfaceC6150.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(InterfaceC6150 interfaceC6150, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        return interfaceC6150.emit(obj, interfaceC5189);
    }
}
