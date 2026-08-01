package kotlinx.coroutines.flow.internal;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, InterfaceC5318.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(InterfaceC5318 interfaceC5318, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        return interfaceC5318.emit(obj, interfaceC4357);
    }
}
