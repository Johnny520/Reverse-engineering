package kotlinx.coroutines.sync;

import io.ktor.util.C4211;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final MutexImpl$onLock$2 INSTANCE = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, C5380.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C5380 c5380, Object obj, Object obj2) {
        c5380.getClass();
        if (!AbstractC4395.m8907(obj2, AbstractC5379.f14989)) {
            return c5380;
        }
        C4211.m8592(obj, "This mutex is already locked by the specified owner: ");
        return null;
    }
}
