package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC6200;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class BufferedChannel$onReceive$1 extends FunctionReferenceImpl implements InterfaceC7380 {
    public static final BufferedChannel$onReceive$1 INSTANCE = new BufferedChannel$onReceive$1();

    public BufferedChannel$onReceive$1() {
        super(3, C6022.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C6022) obj, (InterfaceC6200) obj2, obj3);
        return C6008.f15084;
    }

    public final void invoke(C6022 c6022, InterfaceC6200 interfaceC6200, Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = C6022.f15123;
        c6022.m10792(interfaceC6200);
    }
}
