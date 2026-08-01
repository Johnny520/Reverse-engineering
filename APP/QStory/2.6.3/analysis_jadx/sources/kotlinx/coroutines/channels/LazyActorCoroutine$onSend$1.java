package kotlinx.coroutines.channels;

import androidx.core.view.C2242;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC5368;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class LazyActorCoroutine$onSend$1 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final LazyActorCoroutine$onSend$1 INSTANCE = new LazyActorCoroutine$onSend$1();

    public LazyActorCoroutine$onSend$1() {
        super(3, AbstractC5203.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(AbstractC5203 abstractC5203, InterfaceC5368 interfaceC5368, Object obj) {
        int i = AbstractC5203.f14792;
        abstractC5203.mo10274();
        C5190 c5190 = abstractC5203.f14798;
        c5190.getClass();
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        bufferedChannel$onSend$1.getClass();
        AbstractC4388.m8888(3, bufferedChannel$onSend$1);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        bufferedChannel$onSend$2.getClass();
        AbstractC4388.m8888(3, bufferedChannel$onSend$2);
        ((InterfaceC6551) new C2242(c5190, bufferedChannel$onSend$1, bufferedChannel$onSend$2).f6537).invoke(abstractC5203, interfaceC5368, obj);
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AbstractC5203) obj, (InterfaceC5368) obj2, obj3);
        return C5176.f14739;
    }
}
