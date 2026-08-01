package androidx.compose.foundation.gestures;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p205.C7901;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {921}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C0502 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(C0502 c0502, Ref$LongRef ref$LongRef, long j, InterfaceC4356<? super ScrollingLogic$doFlingAnimation$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0502;
        this.$result = ref$LongRef;
        this.$available = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, interfaceC4356);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollingLogic$doFlingAnimation$2) create(interfaceC0557, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0502 c0502;
        Ref$LongRef ref$LongRef;
        long j;
        C0502 c05022;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC0557 interfaceC0557 = (InterfaceC0557) this.L$0;
            c0502 = this.this$0;
            C0512 c0512 = new C0512(c0502, interfaceC0557);
            Ref$LongRef ref$LongRef2 = this.$result;
            long j2 = this.$available;
            InterfaceC0560 interfaceC0560 = c0502.f1489;
            long j3 = ref$LongRef2.element;
            float fM1254 = c0502.m1254(c0502.f1488 == Orientation.Horizontal ? C7901.m13323(j2) : C7901.m13322(j2));
            this.L$0 = c0502;
            this.L$1 = c0502;
            this.L$2 = ref$LongRef2;
            this.J$0 = j3;
            this.label = 1;
            C0526 c0526 = (C0526) interfaceC0560;
            Object objM10466 = AbstractC5398.m10466(c0526.f1546, new DefaultFlingBehavior$performFling$2(fM1254, c0526, c0512, null), this);
            if (objM10466 == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$LongRef = ref$LongRef2;
            j = j3;
            obj = objM10466;
            c05022 = c0502;
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$2;
            c0502 = (C0502) this.L$1;
            c05022 = (C0502) this.L$0;
            AbstractC5184.m10206(obj);
        }
        float fM12542 = c05022.m1254(((Number) obj).floatValue());
        ref$LongRef.element = c0502.f1488 == Orientation.Horizontal ? C7901.m13324(j, fM12542, 0.0f, 2) : C7901.m13324(j, 0.0f, fM12542, 1);
        return C5175.f14739;
    }
}
