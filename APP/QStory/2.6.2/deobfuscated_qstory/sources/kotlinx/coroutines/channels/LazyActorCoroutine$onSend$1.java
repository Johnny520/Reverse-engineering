package kotlinx.coroutines.channels;

import androidx.core.view.C2242;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC5367;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class LazyActorCoroutine$onSend$1 extends FunctionReferenceImpl implements InterfaceC6550 {
    public static final LazyActorCoroutine$onSend$1 INSTANCE = new LazyActorCoroutine$onSend$1();

    public LazyActorCoroutine$onSend$1() {
        super(3, AbstractC5202.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(AbstractC5202 abstractC5202, InterfaceC5367 interfaceC5367, Object obj) {
        int i = AbstractC5202.f14792;
        abstractC5202.mo10270();
        C5189 c5189 = abstractC5202.f14798;
        c5189.getClass();
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        bufferedChannel$onSend$1.getClass();
        AbstractC4387.m8898(3, bufferedChannel$onSend$1);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        bufferedChannel$onSend$2.getClass();
        AbstractC4387.m8898(3, bufferedChannel$onSend$2);
        ((InterfaceC6550) new C2242(c5189, bufferedChannel$onSend$1, bufferedChannel$onSend$2).f6536).invoke(abstractC5202, interfaceC5367, obj);
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AbstractC5202) obj, (InterfaceC5367) obj2, obj3);
        return C5175.f14739;
    }
}
