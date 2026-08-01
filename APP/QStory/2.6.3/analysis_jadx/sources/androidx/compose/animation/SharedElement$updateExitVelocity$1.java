package androidx.compose.animation;

import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0331;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import p205.C7902;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.SharedElement$updateExitVelocity$1", f = "SharedElement.kt", l = {94}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class SharedElement$updateExitVelocity$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ AbstractC0442 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedElement$updateExitVelocity$1(AbstractC0442 abstractC0442, long j, InterfaceC4357<? super SharedElement$updateExitVelocity$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC0442;
        this.$velocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new SharedElement$updateExitVelocity$1(this.this$0, this.$velocity, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SharedElement$updateExitVelocity$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            this.this$0.getClass();
            return C5176.f14739;
        }
        AbstractC5185.m10210(obj);
        this.this$0.getClass();
        C7329 c7329 = new C7329(0L);
        C0299 c0299 = AbstractC0445.f1403;
        long j = this.$velocity;
        float fM13351 = C7902.m13351(j);
        float fM13350 = C7902.m13350(j);
        C7329 c73292 = new C7329((((long) Float.floatToRawIntBits(fM13351)) << 32) | (((long) Float.floatToRawIntBits(fM13350)) & 4294967295L));
        this.label = 1;
        C0331.m1029(null, c7329, c0299, c73292, null, this, 8);
        throw null;
    }
}
