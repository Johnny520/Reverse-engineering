package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.TransformableStateKt$panBy$3", f = "TransformableState.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, k = 3, mv = {2, 1, 0})
final class TransformableStateKt$panBy$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $centroid;
    final /* synthetic */ long $offset;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$panBy$3(long j, long j2, InterfaceC4356<? super TransformableStateKt$panBy$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.$centroid = j;
        this.$offset = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        TransformableStateKt$panBy$3 transformableStateKt$panBy$3 = new TransformableStateKt$panBy$3(this.$centroid, this.$offset, interfaceC4356);
        transformableStateKt$panBy$3.L$0 = obj;
        return transformableStateKt$panBy$3;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC0493) null, (InterfaceC4356<? super C5175>) obj2);
        }
        C2941.m6336();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        throw AbstractC0053.m158(this.L$0);
    }

    public final Object invoke(InterfaceC0493 interfaceC0493, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TransformableStateKt$panBy$3) create(interfaceC0493, interfaceC4356)).invokeSuspend(C5175.f14739);
    }
}
