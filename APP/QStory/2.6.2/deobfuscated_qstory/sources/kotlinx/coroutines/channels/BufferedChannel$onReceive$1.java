package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC5367;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$onReceive$1 extends FunctionReferenceImpl implements InterfaceC6550 {
    public static final BufferedChannel$onReceive$1 INSTANCE = new BufferedChannel$onReceive$1();

    public BufferedChannel$onReceive$1() {
        super(3, C5189.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C5189) obj, (InterfaceC5367) obj2, obj3);
        return C5175.f14739;
    }

    public final void invoke(C5189 c5189, InterfaceC5367 interfaceC5367, Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = C5189.f14778;
        c5189.m10229(interfaceC5367);
    }
}
