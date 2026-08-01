package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC5368;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$onSend$1 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final BufferedChannel$onSend$1 INSTANCE = new BufferedChannel$onSend$1();

    public BufferedChannel$onSend$1() {
        super(3, C5190.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C5190) obj, (InterfaceC5368) obj2, obj3);
        return C5176.f14739;
    }

    public final void invoke(C5190 c5190, InterfaceC5368 interfaceC5368, Object obj) {
        c5190.mo10232(interfaceC5368, obj);
    }
}
