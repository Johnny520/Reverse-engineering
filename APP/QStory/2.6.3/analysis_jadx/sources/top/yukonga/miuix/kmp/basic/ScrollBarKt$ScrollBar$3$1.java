package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.C5245;
import kotlinx.coroutines.flow.C5284;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$3$1", f = "ScrollBar.kt", l = {303}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$3$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6006 $adapter;
    final /* synthetic */ InterfaceC5401 $coroutineScope;
    final /* synthetic */ InterfaceC1395 $hideJob$delegate;
    final /* synthetic */ boolean $isHighlighted;
    final /* synthetic */ InterfaceC1397 $opacity$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$3$1(InterfaceC6006 interfaceC6006, boolean z, InterfaceC5401 interfaceC5401, InterfaceC1397 interfaceC1397, InterfaceC1395 interfaceC1395, InterfaceC4357<? super ScrollBarKt$ScrollBar$3$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$isHighlighted = z;
        this.$coroutineScope = interfaceC5401;
        this.$opacity$delegate = interfaceC1397;
        this.$hideJob$delegate = interfaceC1395;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ScrollBarKt$ScrollBar$3$1(null, this.$isHighlighted, this.$coroutineScope, this.$opacity$delegate, this.$hideJob$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ScrollBarKt$ScrollBar$3$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C5284 c5284M2470 = AbstractC1367.m2470(new C6004(0));
            C5995 c5995 = new C5995(this.$isHighlighted, this.$coroutineScope, this.$opacity$delegate, this.$hideJob$delegate);
            this.label = 1;
            Object objMo8453 = c5284M2470.mo8453(new C5245(new Ref$IntRef(), c5995), this);
            if (objMo8453 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objMo8453 = c5176;
            }
            if (objMo8453 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return c5176;
    }
}
