package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC6200;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements InterfaceC7380 {
    public static final JobSupport$onAwaitInternal$1 INSTANCE = new JobSupport$onAwaitInternal$1();

    public JobSupport$onAwaitInternal$1() {
        super(3, C6292.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(C6292 c6292, InterfaceC6200 interfaceC6200, Object obj) {
        Object objM11140;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6292.f15457;
        do {
            objM11140 = c6292.m11140();
            if (!(objM11140 instanceof InterfaceC6302)) {
                if (!(objM11140 instanceof C6262)) {
                    objM11140 = AbstractC6231.m11039(objM11140);
                }
                interfaceC6200.mo10970(objM11140);
                return;
            }
        } while (c6292.m11133(objM11140) < 0);
        interfaceC6200.mo10972(AbstractC6231.m11056(c6292, new C6297(c6292, interfaceC6200)));
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C6292) obj, (InterfaceC6200) obj2, obj3);
        return C6008.f15084;
    }
}
