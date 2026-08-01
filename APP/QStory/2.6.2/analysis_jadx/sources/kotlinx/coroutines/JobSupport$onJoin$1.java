package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC5367;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements InterfaceC6550 {
    public static final JobSupport$onJoin$1 INSTANCE = new JobSupport$onJoin$1();

    public JobSupport$onJoin$1() {
        super(3, C5459.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(C5459 c5459, InterfaceC5367 interfaceC5367, Object obj) {
        Object objM10578;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5459.f15112;
        do {
            objM10578 = c5459.m10578();
            if (!(objM10578 instanceof InterfaceC5469)) {
                interfaceC5367.mo10407(C5175.f14739);
                return;
            }
        } while (c5459.m10571(objM10578) < 0);
        interfaceC5367.mo10409(AbstractC5398.m10493(c5459, new C5460(c5459, interfaceC5367)));
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C5459) obj, (InterfaceC5367) obj2, obj3);
        return C5175.f14739;
    }
}
