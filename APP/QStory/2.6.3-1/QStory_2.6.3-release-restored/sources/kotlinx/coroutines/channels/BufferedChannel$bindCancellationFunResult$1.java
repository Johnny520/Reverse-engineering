package kotlinx.coroutines.channels;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class BufferedChannel$bindCancellationFunResult$1 extends FunctionReferenceImpl implements InterfaceC7380 {
    public BufferedChannel$bindCancellationFunResult$1(Object obj) {
        super(3, obj, C6022.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m10776invoke5_sEAP8((Throwable) obj, ((C6034) obj2).f15136, (InterfaceC5192) obj3);
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: invoke-5_sEAP8, reason: not valid java name */
    public final void m10776invoke5_sEAP8(Throwable th, Object obj, InterfaceC5192 interfaceC5192) {
        ((C6022) this.receiver).getClass();
        throw null;
    }
}
