package androidx.compose.foundation.gestures;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.Scrollable2DNode$drag$2$1", f = "Scrollable2D.kt", l = {196}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class Scrollable2DNode$drag$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DNode$drag$2$1(InterfaceC6553 interfaceC6553, InterfaceC4356<? super Scrollable2DNode$drag$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$forEachDelta = interfaceC6553;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(InterfaceC0557 interfaceC0557, C0480 c0480) {
        ((C0515) interfaceC0557).m1279(1, c0480.f1446);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        Scrollable2DNode$drag$2$1 scrollable2DNode$drag$2$1 = new Scrollable2DNode$drag$2$1(this.$forEachDelta, interfaceC4356);
        scrollable2DNode$drag$2$1.L$0 = obj;
        return scrollable2DNode$drag$2$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((Scrollable2DNode$drag$2$1) create(interfaceC0557, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC0557 interfaceC0557 = (InterfaceC0557) this.L$0;
            InterfaceC6553 interfaceC6553 = this.$forEachDelta;
            C0510 c0510 = new C0510(interfaceC0557, 0);
            this.label = 1;
            if (interfaceC6553.invoke(c0510, this) == coroutineSingletons) {
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
