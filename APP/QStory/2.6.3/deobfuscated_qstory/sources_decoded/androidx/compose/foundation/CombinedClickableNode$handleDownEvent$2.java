package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.InterfaceC1863;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p108.C7315;
import p108.InterfaceC7317;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.CombinedClickableNode$handleDownEvent$2", f = "Clickable.kt", l = {1318}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CombinedClickableNode$handleDownEvent$2 extends SuspendLambda implements InterfaceC6554 {
    int label;
    final /* synthetic */ C1027 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$handleDownEvent$2(C1027 c1027, InterfaceC4357<? super CombinedClickableNode$handleDownEvent$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c1027;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new CombinedClickableNode$handleDownEvent$2(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CombinedClickableNode$handleDownEvent$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            long jMo3280 = ((InterfaceC1863) AbstractC1785.m3356(this.this$0, AbstractC1902.f5576)).mo3280();
            this.label = 1;
            if (AbstractC5399.m10499(jMo3280, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        InterfaceC6543 interfaceC6543 = this.this$0.f3021;
        if (interfaceC6543 != null) {
            interfaceC6543.invoke();
        }
        C1027 c1027 = this.this$0;
        if (c1027.f3009) {
            ((C7315) ((InterfaceC7317) AbstractC1785.m3356(c1027, AbstractC1902.f5591))).m12509(0);
        }
        C1027 c10272 = this.this$0;
        c10272.f3011 = true;
        C5417 c5417 = c10272.f3013;
        if (c5417 != null) {
            c5417.mo10256(null);
        }
        C1027 c10273 = this.this$0;
        c10273.f3013 = null;
        c10273.f3017 = null;
        return C5176.f14739;
    }
}
