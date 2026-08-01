package kotlinx.coroutines.flow;

import androidx.compose.animation.C0412;
import java.util.NoSuchElementException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C5437;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5440;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5440 $result;
    final /* synthetic */ InterfaceC5318 $upstream;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(InterfaceC5318 interfaceC5318, InterfaceC5440 interfaceC5440, InterfaceC4356<? super FlowKt__ShareKt$launchSharingDeferred$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$upstream = interfaceC5318;
        this.$result = interfaceC5440;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, interfaceC4356);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                InterfaceC5318 interfaceC5318 = this.$upstream;
                C0412 c0412 = new C0412(ref$ObjectRef2, interfaceC5400, this.$result, 3);
                this.L$0 = null;
                this.L$1 = ref$ObjectRef2;
                this.label = 1;
                if (interfaceC5318.mo8463(c0412, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                AbstractC5184.m10206(obj);
            }
            if (ref$ObjectRef.element == 0) {
                ((C5437) this.$result).m10585(Result.m8754boximpl(Result.m8755constructorimpl(new Result.Failure(new NoSuchElementException("Flow is empty")))));
            }
            return C5175.f14739;
        } catch (Throwable th) {
            ((C5437) this.$result).m10525(th);
            throw th;
        }
    }
}
