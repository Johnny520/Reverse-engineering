package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$bindCancellationFun$2 extends FunctionReferenceImpl implements InterfaceC6551 {
    public BufferedChannel$bindCancellationFun$2(Object obj) {
        super(3, obj, C5190.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Throwable) obj, obj2, (InterfaceC4360) obj3);
        return C5176.f14739;
    }

    public final void invoke(Throwable th, Object obj, InterfaceC4360 interfaceC4360) {
        ((C5190) this.receiver).getClass();
        throw null;
    }
}
