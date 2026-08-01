package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements InterfaceC6550 {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, C5459.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C5459 c5459, Object obj, Object obj2) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5459.f15112;
        c5459.getClass();
        if (obj2 instanceof C5429) {
            throw ((C5429) obj2).f15075;
        }
        return obj2;
    }
}
