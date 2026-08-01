package kotlinx.coroutines.sync;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC5368;
import kotlinx.coroutines.selects.InterfaceC5375;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final MutexImpl$onLock$1 INSTANCE = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, C5380.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(C5380 c5380, InterfaceC5368 interfaceC5368, Object obj) {
        int andDecrement;
        if (obj == null) {
            c5380.getClass();
        } else if (c5380.m10429(obj) == 1) {
            interfaceC5368.mo10411(AbstractC5379.f14989);
            return;
        }
        interfaceC5368.getClass();
        C5381 c5381 = new C5381(c5380, (InterfaceC5375) interfaceC5368, obj);
        do {
            c5380.getClass();
            do {
                andDecrement = C5385.f15004.getAndDecrement(c5380);
            } while (andDecrement > 1);
            if (andDecrement > 0) {
                c5381.mo10411(C5176.f14739);
                return;
            }
        } while (!c5380.m10439(c5381));
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C5380) obj, (InterfaceC5368) obj2, obj3);
        return C5176.f14739;
    }
}
