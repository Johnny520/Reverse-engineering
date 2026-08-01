package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC5368;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final JobSupport$onJoin$1 INSTANCE = new JobSupport$onJoin$1();

    public JobSupport$onJoin$1() {
        super(3, C5460.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(C5460 c5460, InterfaceC5368 interfaceC5368, Object obj) {
        Object objM10581;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5460.f15112;
        do {
            objM10581 = c5460.m10581();
            if (!(objM10581 instanceof InterfaceC5470)) {
                interfaceC5368.mo10411(C5176.f14739);
                return;
            }
        } while (c5460.m10574(objM10581) < 0);
        interfaceC5368.mo10413(AbstractC5399.m10497(c5460, new C5461(c5460, interfaceC5368)));
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C5460) obj, (InterfaceC5368) obj2, obj3);
        return C5176.f14739;
    }
}
