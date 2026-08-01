package kotlinx.coroutines.selects;

import androidx.appcompat.app.RunnableC0946;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements InterfaceC7380 {
    public static final OnTimeout$selectClause$1 INSTANCE = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, C6205.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(C6205 c6205, InterfaceC6200 interfaceC6200, Object obj) {
        long j = c6205.f15331;
        if (j <= 0) {
            interfaceC6200.mo10970(C6008.f15084);
            return;
        }
        RunnableC0946 runnableC0946 = new RunnableC0946(interfaceC6200, 5, c6205);
        interfaceC6200.getClass();
        C6201 c6201 = (C6201) interfaceC6200;
        InterfaceC5192 interfaceC5192 = c6201.f15315;
        c6201.f15314 = AbstractC6231.m11059(interfaceC5192).mo10899(j, runnableC0946, interfaceC5192);
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C6205) obj, (InterfaceC6200) obj2, obj3);
        return C6008.f15084;
    }
}
