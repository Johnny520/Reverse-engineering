package kotlinx.coroutines.channels;

import androidx.core.view.C3075;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC6200;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class LazyActorCoroutine$onSend$1 extends FunctionReferenceImpl implements InterfaceC7380 {
    public static final LazyActorCoroutine$onSend$1 INSTANCE = new LazyActorCoroutine$onSend$1();

    public LazyActorCoroutine$onSend$1() {
        super(3, AbstractC6035.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(AbstractC6035 abstractC6035, InterfaceC6200 interfaceC6200, Object obj) {
        int i = AbstractC6035.f15137;
        abstractC6035.mo10833();
        C6022 c6022 = abstractC6035.f15143;
        c6022.getClass();
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        bufferedChannel$onSend$1.getClass();
        AbstractC5220.m9447(3, bufferedChannel$onSend$1);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        bufferedChannel$onSend$2.getClass();
        AbstractC5220.m9447(3, bufferedChannel$onSend$2);
        ((InterfaceC7380) new C3075(c6022, bufferedChannel$onSend$1, bufferedChannel$onSend$2).f6882).invoke(abstractC6035, interfaceC6200, obj);
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AbstractC6035) obj, (InterfaceC6200) obj2, obj3);
        return C6008.f15084;
    }
}
