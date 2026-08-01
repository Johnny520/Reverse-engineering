package androidx.compose.foundation.gestures;

import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6861(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1", f = "NonTouchScrollingLogic.kt", l = {76}, m = "invokeSuspend", v = 1)
public final class NonTouchScrollingLogicKt$busyReceive$2$job$1 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    int label;

    public NonTouchScrollingLogicKt$busyReceive$2$job$1(InterfaceC4356<? super NonTouchScrollingLogicKt$busyReceive$2$job$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(long j) {
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        NonTouchScrollingLogicKt$busyReceive$2$job$1 nonTouchScrollingLogicKt$busyReceive$2$job$1 = new NonTouchScrollingLogicKt$busyReceive$2$job$1(interfaceC4356);
        nonTouchScrollingLogicKt$busyReceive$2$job$1.L$0 = obj;
        return nonTouchScrollingLogicKt$busyReceive$2$job$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((NonTouchScrollingLogicKt$busyReceive$2$job$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5400 interfaceC5400;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            interfaceC5400 = (InterfaceC5400) this.L$0;
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5400 = (InterfaceC5400) this.L$0;
            AbstractC5184.m10206(obj);
        }
        while (AbstractC5398.m10490(interfaceC5400.mo2420())) {
            C0520 c0520 = new C0520(3);
            this.L$0 = interfaceC5400;
            this.label = 1;
            if (AbstractC1367.m2482(getContext()).mo2295(c0520, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C5175.f14739;
    }
}
