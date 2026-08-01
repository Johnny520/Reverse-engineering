package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$onReceiveOrNull$2 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final BufferedChannel$onReceiveOrNull$2 INSTANCE = new BufferedChannel$onReceiveOrNull$2();

    public BufferedChannel$onReceiveOrNull$2() {
        super(3, C5190.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C5190 c5190, Object obj, Object obj2) throws Throwable {
        AtomicLongFieldUpdater atomicLongFieldUpdater = C5190.f14778;
        c5190.getClass();
        if (obj2 != AbstractC5189.f14763) {
            return obj2;
        }
        if (c5190.m10252() == null) {
            return null;
        }
        throw c5190.m10253();
    }
}
