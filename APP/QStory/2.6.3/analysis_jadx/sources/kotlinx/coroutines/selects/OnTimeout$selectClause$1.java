package kotlinx.coroutines.selects;

import androidx.appcompat.app.RunnableC0099;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements InterfaceC6551 {
    public static final OnTimeout$selectClause$1 INSTANCE = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, C5373.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(C5373 c5373, InterfaceC5368 interfaceC5368, Object obj) {
        long j = c5373.f14986;
        if (j <= 0) {
            interfaceC5368.mo10411(C5176.f14739);
            return;
        }
        RunnableC0099 runnableC0099 = new RunnableC0099(interfaceC5368, 5, c5373);
        interfaceC5368.getClass();
        C5369 c5369 = (C5369) interfaceC5368;
        InterfaceC4360 interfaceC4360 = c5369.f14970;
        c5369.f14969 = AbstractC5399.m10500(interfaceC4360).mo10340(j, runnableC0099, interfaceC4360);
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C5373) obj, (InterfaceC5368) obj2, obj3);
        return C5176.f14739;
    }
}
