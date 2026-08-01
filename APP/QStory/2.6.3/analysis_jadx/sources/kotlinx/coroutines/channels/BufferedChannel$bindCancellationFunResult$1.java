package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$bindCancellationFunResult$1 extends FunctionReferenceImpl implements InterfaceC6551 {
    public BufferedChannel$bindCancellationFunResult$1(Object obj) {
        super(3, obj, C5190.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m10217invoke5_sEAP8((Throwable) obj, ((C5202) obj2).f14791, (InterfaceC4360) obj3);
        return C5176.f14739;
    }

    /* JADX INFO: renamed from: invoke-5_sEAP8, reason: not valid java name */
    public final void m10217invoke5_sEAP8(Throwable th, Object obj, InterfaceC4360 interfaceC4360) {
        ((C5190) this.receiver).getClass();
        throw null;
    }
}
