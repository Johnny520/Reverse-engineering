package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0362;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$6$1$1", f = "ScrollBar.kt", l = {411}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$6$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1397 $displayedThumbLength$delegate;
    final /* synthetic */ float $startValue;
    final /* synthetic */ float $targetThumbLength;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$6$1$1(float f, float f2, InterfaceC1397 interfaceC1397, InterfaceC4357<? super ScrollBarKt$ScrollBar$6$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$startValue = f;
        this.$targetThumbLength = f2;
        this.$displayedThumbLength$delegate = interfaceC1397;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(InterfaceC1397 interfaceC1397, float f, float f2) {
        ((AbstractC1349) interfaceC1397).m2435(f);
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ScrollBarKt$ScrollBar$6$1$1(this.$startValue, this.$targetThumbLength, this.$displayedThumbLength$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ScrollBarKt$ScrollBar$6$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            float f = this.$startValue;
            float f2 = this.$targetThumbLength;
            C0362 c0362M1013 = AbstractC0330.m1013(150, 6, null);
            C6005 c6005 = new C6005(this.$displayedThumbLength$delegate, 2);
            this.label = 1;
            if (AbstractC0330.m1024(f, f2, c0362M1013, c6005, this, 4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
