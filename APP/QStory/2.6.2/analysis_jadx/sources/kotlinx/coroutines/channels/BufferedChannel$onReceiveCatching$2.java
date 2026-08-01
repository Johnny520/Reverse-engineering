package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class BufferedChannel$onReceiveCatching$2 extends FunctionReferenceImpl implements InterfaceC6550 {
    public static final BufferedChannel$onReceiveCatching$2 INSTANCE = new BufferedChannel$onReceiveCatching$2();

    public BufferedChannel$onReceiveCatching$2() {
        super(3, C5189.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C5189 c5189, Object obj, Object obj2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = C5189.f14778;
        c5189.getClass();
        if (obj2 == AbstractC5188.f14763) {
            obj2 = new C5208(c5189.m10249());
        }
        return new C5201(obj2);
    }
}
