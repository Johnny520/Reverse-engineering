package kotlinx.coroutines.sync;

import io.ktor.util.C4210;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements InterfaceC6550 {
    public static final MutexImpl$onLock$2 INSTANCE = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, C5379.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C5379 c5379, Object obj, Object obj2) {
        c5379.getClass();
        if (!AbstractC4394.m8917(obj2, AbstractC5378.f14989)) {
            return c5379;
        }
        C4210.m8602(obj, "This mutex is already locked by the specified owner: ");
        return null;
    }
}
