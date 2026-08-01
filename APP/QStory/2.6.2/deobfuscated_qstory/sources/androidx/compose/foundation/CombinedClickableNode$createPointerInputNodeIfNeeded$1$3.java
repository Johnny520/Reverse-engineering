package androidx.compose.foundation;

import androidx.compose.foundation.gestures.InterfaceC0552;
import androidx.compose.foundation.interaction.InterfaceC0580;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", l = {1132}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class CombinedClickableNode$createPointerInputNodeIfNeeded$1$3 extends SuspendLambda implements InterfaceC6550 {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1027 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$createPointerInputNodeIfNeeded$1$3(C1027 c1027, InterfaceC4356<? super CombinedClickableNode$createPointerInputNodeIfNeeded$1$3> interfaceC4356) {
        super(3, interfaceC4356);
        this.this$0 = c1027;
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m1129invoked4ec7I((InterfaceC0552) obj, ((C7328) obj2).f19546, (InterfaceC4356) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m1129invoked4ec7I(InterfaceC0552 interfaceC0552, long j, InterfaceC4356<? super C5175> interfaceC4356) {
        CombinedClickableNode$createPointerInputNodeIfNeeded$1$3 combinedClickableNode$createPointerInputNodeIfNeeded$1$3 = new CombinedClickableNode$createPointerInputNodeIfNeeded$1$3(this.this$0, interfaceC4356);
        combinedClickableNode$createPointerInputNodeIfNeeded$1$3.L$0 = interfaceC0552;
        combinedClickableNode$createPointerInputNodeIfNeeded$1$3.J$0 = j;
        return combinedClickableNode$createPointerInputNodeIfNeeded$1$3.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM10503;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC0552 interfaceC0552 = (InterfaceC0552) this.L$0;
            long j = this.J$0;
            C1027 c1027 = this.this$0;
            if (c1027.f3121) {
                this.label = 1;
                InterfaceC0580 interfaceC0580 = c1027.f3128;
                if (interfaceC0580 == null || (objM10503 = AbstractC5398.m10503(new AbstractClickableNode$handlePressInteraction$2$1(interfaceC0552, j, interfaceC0580, c1027, null), this)) != coroutineSingletons) {
                    objM10503 = c5175;
                }
                if (objM10503 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return c5175;
    }
}
