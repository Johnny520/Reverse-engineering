package kotlinx.coroutines.sync;

import io.ktor.util.C5043;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements InterfaceC7380 {
    public static final MutexImpl$onLock$2 INSTANCE = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, C6212.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C6212 c6212, Object obj, Object obj2) {
        c6212.getClass();
        if (!AbstractC5227.m9466(obj2, AbstractC6211.f15334)) {
            return c6212;
        }
        C5043.m9151(obj, "This mutex is already locked by the specified owner: ");
        return null;
    }
}
