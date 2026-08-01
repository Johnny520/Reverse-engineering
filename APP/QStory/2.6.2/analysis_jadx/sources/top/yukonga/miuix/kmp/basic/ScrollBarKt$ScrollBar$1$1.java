package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p053.AbstractC6560;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$1$1", f = "ScrollBar.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1398 $containerSize$delegate;
    final /* synthetic */ AbstractC5988 $sliderAdapter;
    final /* synthetic */ float $totalTrackPaddingPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$1$1(AbstractC5988 abstractC5988, float f, InterfaceC1398 interfaceC1398, InterfaceC4356<? super ScrollBarKt$ScrollBar$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$totalTrackPaddingPx = f;
        this.$containerSize$delegate = interfaceC1398;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ScrollBarKt$ScrollBar$1$1(null, this.$totalTrackPaddingPx, this.$containerSize$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollBarKt$ScrollBar$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        ((AbstractC1346) this.$containerSize$delegate).m2422();
        AbstractC6560.m12006(this.$totalTrackPaddingPx);
        throw null;
    }
}
