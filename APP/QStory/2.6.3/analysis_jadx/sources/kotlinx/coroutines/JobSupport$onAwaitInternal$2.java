package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, C5460.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C5460 c5460, Object obj, Object obj2) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5460.f15112;
        c5460.getClass();
        if (obj2 instanceof C5430) {
            throw ((C5430) obj2).f15075;
        }
        return obj2;
    }
}
