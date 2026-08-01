package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0362;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$6$1$1", f = "ScrollBar.kt", l = {411}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$6$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1397 $displayedThumbLength$delegate;
    final /* synthetic */ float $startValue;
    final /* synthetic */ float $targetThumbLength;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$6$1$1(float f, float f2, InterfaceC1397 interfaceC1397, InterfaceC4356<? super ScrollBarKt$ScrollBar$6$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$startValue = f;
        this.$targetThumbLength = f2;
        this.$displayedThumbLength$delegate = interfaceC1397;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(InterfaceC1397 interfaceC1397, float f, float f2) {
        ((AbstractC1349) interfaceC1397).m2425(f);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ScrollBarKt$ScrollBar$6$1$1(this.$startValue, this.$targetThumbLength, this.$displayedThumbLength$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollBarKt$ScrollBar$6$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            float f = this.$startValue;
            float f2 = this.$targetThumbLength;
            C0362 c0362M1012 = AbstractC0330.m1012(150, 6, null);
            C5999 c5999 = new C5999(this.$displayedThumbLength$delegate, 2);
            this.label = 1;
            if (AbstractC0330.m1023(f, f2, c0362M1012, c5999, this, 4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
