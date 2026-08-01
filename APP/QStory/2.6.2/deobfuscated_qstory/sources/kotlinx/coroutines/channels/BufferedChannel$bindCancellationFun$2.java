package kotlinx.coroutines.channels;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$bindCancellationFun$2 extends FunctionReferenceImpl implements InterfaceC6550 {
    public BufferedChannel$bindCancellationFun$2(Object obj) {
        super(3, obj, C5189.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Throwable) obj, obj2, (InterfaceC4359) obj3);
        return C5175.f14739;
    }

    public final void invoke(Throwable th, Object obj, InterfaceC4359 interfaceC4359) {
        ((C5189) this.receiver).getClass();
        throw null;
    }
}
