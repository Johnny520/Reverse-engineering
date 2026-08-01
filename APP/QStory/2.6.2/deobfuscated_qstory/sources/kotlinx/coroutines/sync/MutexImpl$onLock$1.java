package kotlinx.coroutines.sync;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC5367;
import kotlinx.coroutines.selects.InterfaceC5374;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements InterfaceC6550 {
    public static final MutexImpl$onLock$1 INSTANCE = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, C5379.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(C5379 c5379, InterfaceC5367 interfaceC5367, Object obj) {
        int andDecrement;
        if (obj == null) {
            c5379.getClass();
        } else if (c5379.m10425(obj) == 1) {
            interfaceC5367.mo10407(AbstractC5378.f14989);
            return;
        }
        interfaceC5367.getClass();
        C5380 c5380 = new C5380(c5379, (InterfaceC5374) interfaceC5367, obj);
        do {
            c5379.getClass();
            do {
                andDecrement = C5384.f15004.getAndDecrement(c5379);
            } while (andDecrement > 1);
            if (andDecrement > 0) {
                c5380.mo10407(C5175.f14739);
                return;
            }
        } while (!c5379.m10435(c5380));
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C5379) obj, (InterfaceC5367) obj2, obj3);
        return C5175.f14739;
    }
}
