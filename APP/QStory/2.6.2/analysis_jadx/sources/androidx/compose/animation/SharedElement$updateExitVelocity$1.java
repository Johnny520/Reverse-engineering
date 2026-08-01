package androidx.compose.animation;

import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0331;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import p205.C7901;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.animation.SharedElement$updateExitVelocity$1", f = "SharedElement.kt", l = {94}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class SharedElement$updateExitVelocity$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ AbstractC0442 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedElement$updateExitVelocity$1(AbstractC0442 abstractC0442, long j, InterfaceC4356<? super SharedElement$updateExitVelocity$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC0442;
        this.$velocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new SharedElement$updateExitVelocity$1(this.this$0, this.$velocity, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SharedElement$updateExitVelocity$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.this$0.getClass();
            return C5175.f14739;
        }
        AbstractC5184.m10206(obj);
        this.this$0.getClass();
        C7328 c7328 = new C7328(0L);
        C0299 c0299 = AbstractC0445.f1403;
        long j = this.$velocity;
        float fM13323 = C7901.m13323(j);
        float fM13322 = C7901.m13322(j);
        C7328 c73282 = new C7328((((long) Float.floatToRawIntBits(fM13323)) << 32) | (((long) Float.floatToRawIntBits(fM13322)) & 4294967295L));
        this.label = 1;
        C0331.m1028(null, c7328, c0299, c73282, null, this, 8);
        throw null;
    }
}
