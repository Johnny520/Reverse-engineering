package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.InterfaceC1863;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p108.C7314;
import p108.InterfaceC7316;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.CombinedClickableNode$handleDownEvent$1", f = "Clickable.kt", l = {1273}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CombinedClickableNode$handleDownEvent$1 extends SuspendLambda implements InterfaceC6553 {
    int label;
    final /* synthetic */ C1027 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$handleDownEvent$1(C1027 c1027, InterfaceC4356<? super CombinedClickableNode$handleDownEvent$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c1027;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CombinedClickableNode$handleDownEvent$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CombinedClickableNode$handleDownEvent$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            long jMo3270 = ((InterfaceC1863) AbstractC1785.m3346(this.this$0, AbstractC1902.f5575)).mo3270();
            this.label = 1;
            if (AbstractC5398.m10495(jMo3270, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        InterfaceC6542 interfaceC6542 = this.this$0.f3020;
        if (interfaceC6542 != null) {
            interfaceC6542.invoke();
        }
        C1027 c1027 = this.this$0;
        if (c1027.f3008) {
            ((C7314) ((InterfaceC7316) AbstractC1785.m3346(c1027, AbstractC1902.f5590))).m12482(0);
        }
        C1027 c10272 = this.this$0;
        c10272.f3019 = true;
        C5416 c5416 = c10272.f3003;
        if (c5416 != null) {
            c5416.mo10252(null);
        }
        C1027 c10273 = this.this$0;
        c10273.f3003 = null;
        c10273.f3004 = null;
        return C5175.f14739;
    }
}
