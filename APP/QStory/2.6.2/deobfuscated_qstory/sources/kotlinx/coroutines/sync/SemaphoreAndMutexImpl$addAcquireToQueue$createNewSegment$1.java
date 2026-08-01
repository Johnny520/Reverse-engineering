package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public static final SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 INSTANCE = new SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1();

    public SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, AbstractC5383.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (C5385) obj2);
    }

    public final C5385 invoke(long j, C5385 c5385) {
        int i = AbstractC5383.f15003;
        return new C5385(j, c5385, 0);
    }
}
