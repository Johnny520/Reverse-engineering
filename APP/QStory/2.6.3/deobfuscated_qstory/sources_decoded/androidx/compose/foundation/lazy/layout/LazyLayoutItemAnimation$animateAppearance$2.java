package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.ui.graphics.layer.C1516;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C1516 $layer;
    final /* synthetic */ boolean $shouldResetValue;
    final /* synthetic */ InterfaceC0311 $spec;
    int label;
    final /* synthetic */ AbstractC0716 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z, AbstractC0716 abstractC0716, InterfaceC0311 interfaceC0311, C1516 c1516, InterfaceC4357<? super LazyLayoutItemAnimation$animateAppearance$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$shouldResetValue = z;
        this.this$0 = abstractC0716;
        this.$spec = interfaceC0311;
        this.$layer = c1516;
    }

    private static final C5176 invokeSuspend$lambda$0(C1516 c1516, AbstractC0716 abstractC0716, C0331 c0331) {
        c1516.m2792(((Number) c0331.m1033()).floatValue());
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (this.$shouldResetValue) {
                throw null;
            }
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        throw null;
    }
}
