package kotlinx.coroutines.selects;

import androidx.appcompat.app.RunnableC0099;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements InterfaceC6550 {
    public static final OnTimeout$selectClause$1 INSTANCE = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, C5372.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void invoke(C5372 c5372, InterfaceC5367 interfaceC5367, Object obj) {
        long j = c5372.f14986;
        if (j <= 0) {
            interfaceC5367.mo10407(C5175.f14739);
            return;
        }
        RunnableC0099 runnableC0099 = new RunnableC0099(interfaceC5367, 5, c5372);
        interfaceC5367.getClass();
        C5368 c5368 = (C5368) interfaceC5367;
        InterfaceC4359 interfaceC4359 = c5368.f14970;
        c5368.f14969 = AbstractC5398.m10496(interfaceC4359).mo10336(j, runnableC0099, interfaceC4359);
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C5372) obj, (InterfaceC5367) obj2, obj3);
        return C5175.f14739;
    }
}
