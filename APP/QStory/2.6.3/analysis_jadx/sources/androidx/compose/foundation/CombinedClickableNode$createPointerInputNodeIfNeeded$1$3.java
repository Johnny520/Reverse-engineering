package androidx.compose.foundation;

import androidx.compose.foundation.gestures.InterfaceC0552;
import androidx.compose.foundation.interaction.InterfaceC0580;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", l = {1132}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class CombinedClickableNode$createPointerInputNodeIfNeeded$1$3 extends SuspendLambda implements InterfaceC6551 {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1027 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$createPointerInputNodeIfNeeded$1$3(C1027 c1027, InterfaceC4357<? super CombinedClickableNode$createPointerInputNodeIfNeeded$1$3> interfaceC4357) {
        super(3, interfaceC4357);
        this.this$0 = c1027;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m1130invoked4ec7I((InterfaceC0552) obj, ((C7329) obj2).f19541, (InterfaceC4357) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m1130invoked4ec7I(InterfaceC0552 interfaceC0552, long j, InterfaceC4357<? super C5176> interfaceC4357) {
        CombinedClickableNode$createPointerInputNodeIfNeeded$1$3 combinedClickableNode$createPointerInputNodeIfNeeded$1$3 = new CombinedClickableNode$createPointerInputNodeIfNeeded$1$3(this.this$0, interfaceC4357);
        combinedClickableNode$createPointerInputNodeIfNeeded$1$3.L$0 = interfaceC0552;
        combinedClickableNode$createPointerInputNodeIfNeeded$1$3.J$0 = j;
        return combinedClickableNode$createPointerInputNodeIfNeeded$1$3.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM10507;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC0552 interfaceC0552 = (InterfaceC0552) this.L$0;
            long j = this.J$0;
            C1027 c1027 = this.this$0;
            if (c1027.f3122) {
                this.label = 1;
                InterfaceC0580 interfaceC0580 = c1027.f3129;
                if (interfaceC0580 == null || (objM10507 = AbstractC5399.m10507(new AbstractClickableNode$handlePressInteraction$2$1(interfaceC0552, j, interfaceC0580, c1027, null), this)) != coroutineSingletons) {
                    objM10507 = c5176;
                }
                if (objM10507 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return c5176;
    }
}
