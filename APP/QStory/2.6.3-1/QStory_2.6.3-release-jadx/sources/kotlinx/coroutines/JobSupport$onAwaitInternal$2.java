package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements InterfaceC7380 {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, C6292.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C6292 c6292, Object obj, Object obj2) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6292.f15457;
        c6292.getClass();
        if (obj2 instanceof C6262) {
            throw ((C6262) obj2).f15420;
        }
        return obj2;
    }
}
