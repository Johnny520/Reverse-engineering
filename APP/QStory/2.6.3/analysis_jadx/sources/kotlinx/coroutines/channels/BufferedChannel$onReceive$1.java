package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC5368;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$onReceive$1 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final BufferedChannel$onReceive$1 INSTANCE = new BufferedChannel$onReceive$1();

    public BufferedChannel$onReceive$1() {
        super(3, C5190.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C5190) obj, (InterfaceC5368) obj2, obj3);
        return C5176.f14739;
    }

    public final void invoke(C5190 c5190, InterfaceC5368 interfaceC5368, Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = C5190.f14778;
        c5190.m10233(interfaceC5368);
    }
}
