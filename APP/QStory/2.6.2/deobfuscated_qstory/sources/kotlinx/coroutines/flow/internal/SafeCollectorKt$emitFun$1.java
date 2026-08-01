package kotlinx.coroutines.flow.internal;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.InterfaceC5317;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements InterfaceC6550 {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, InterfaceC5317.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(InterfaceC5317 interfaceC5317, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        return interfaceC5317.emit(obj, interfaceC4356);
    }
}
