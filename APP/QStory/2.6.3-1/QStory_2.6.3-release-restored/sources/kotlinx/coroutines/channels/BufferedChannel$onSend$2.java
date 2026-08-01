package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class BufferedChannel$onSend$2 extends FunctionReferenceImpl implements InterfaceC7380 {
    public static final BufferedChannel$onSend$2 INSTANCE = new BufferedChannel$onSend$2();

    public BufferedChannel$onSend$2() {
        super(3, C6022.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C6022 c6022, Object obj, Object obj2) throws Throwable {
        AtomicLongFieldUpdater atomicLongFieldUpdater = C6022.f15123;
        c6022.getClass();
        if (obj2 != AbstractC6021.f15108) {
            return c6022;
        }
        throw c6022.m10805();
    }
}
