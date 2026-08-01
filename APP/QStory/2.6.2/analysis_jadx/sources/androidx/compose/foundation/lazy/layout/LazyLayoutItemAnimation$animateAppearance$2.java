package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.ui.graphics.layer.C1516;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C1516 $layer;
    final /* synthetic */ boolean $shouldResetValue;
    final /* synthetic */ InterfaceC0311 $spec;
    int label;
    final /* synthetic */ AbstractC0716 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z, AbstractC0716 abstractC0716, InterfaceC0311 interfaceC0311, C1516 c1516, InterfaceC4356<? super LazyLayoutItemAnimation$animateAppearance$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$shouldResetValue = z;
        this.this$0 = abstractC0716;
        this.$spec = interfaceC0311;
        this.$layer = c1516;
    }

    private static final C5175 invokeSuspend$lambda$0(C1516 c1516, AbstractC0716 abstractC0716, C0331 c0331) {
        c1516.m2782(((Number) c0331.m1032()).floatValue());
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.$shouldResetValue) {
                throw null;
            }
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        throw null;
    }
}
