package androidx.compose.foundation.gestures;

import com.alibaba.fastjson2.C2941;
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
@InterfaceC6861(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", l = {257}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 1, 0})
final class Draggable2DNode$drag$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0465 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Draggable2DNode$drag$2(InterfaceC6553 interfaceC6553, AbstractC0465 abstractC0465, InterfaceC4356<? super Draggable2DNode$drag$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$forEachDelta = interfaceC6553;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(InterfaceC0474 interfaceC0474, AbstractC0465 abstractC0465, C0480 c0480) {
        long j = c0480.f1446;
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        Draggable2DNode$drag$2 draggable2DNode$drag$2 = new Draggable2DNode$drag$2(this.$forEachDelta, null, interfaceC4356);
        draggable2DNode$drag$2.L$0 = obj;
        return draggable2DNode$drag$2;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC0474) null, (InterfaceC4356<? super C5175>) obj2);
        }
        C2941.m6336();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            InterfaceC6553 interfaceC6553 = this.$forEachDelta;
            C0520 c0520 = new C0520(i2);
            this.label = 1;
            if (interfaceC6553.invoke(c0520, this) == coroutineSingletons) {
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

    public final Object invoke(InterfaceC0474 interfaceC0474, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((Draggable2DNode$drag$2) create(interfaceC0474, interfaceC4356)).invokeSuspend(C5175.f14739);
    }
}
