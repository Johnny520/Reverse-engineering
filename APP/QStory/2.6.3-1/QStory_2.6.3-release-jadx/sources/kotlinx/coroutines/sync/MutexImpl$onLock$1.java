package kotlinx.coroutines.sync;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.InterfaceC6200;
import kotlinx.coroutines.selects.InterfaceC6207;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements InterfaceC7380 {
    public static final MutexImpl$onLock$1 INSTANCE = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, C6212.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(C6212 c6212, InterfaceC6200 interfaceC6200, Object obj) {
        int andDecrement;
        if (obj == null) {
            c6212.getClass();
        } else if (c6212.m10988(obj) == 1) {
            interfaceC6200.mo10970(AbstractC6211.f15334);
            return;
        }
        interfaceC6200.getClass();
        C6213 c6213 = new C6213(c6212, (InterfaceC6207) interfaceC6200, obj);
        do {
            c6212.getClass();
            do {
                andDecrement = C6217.f15349.getAndDecrement(c6212);
            } while (andDecrement > 1);
            if (andDecrement > 0) {
                c6213.mo10970(C6008.f15084);
                return;
            }
        } while (!c6212.m10998(c6213));
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C6212) obj, (InterfaceC6200) obj2, obj3);
        return C6008.f15084;
    }
}
