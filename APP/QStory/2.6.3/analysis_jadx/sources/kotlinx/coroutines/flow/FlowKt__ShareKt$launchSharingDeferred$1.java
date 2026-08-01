package kotlinx.coroutines.flow;

import androidx.compose.animation.C0412;
import java.util.NoSuchElementException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C5438;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5441;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5441 $result;
    final /* synthetic */ InterfaceC5319 $upstream;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(InterfaceC5319 interfaceC5319, InterfaceC5441 interfaceC5441, InterfaceC4357<? super FlowKt__ShareKt$launchSharingDeferred$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$upstream = interfaceC5319;
        this.$result = interfaceC5441;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, interfaceC4357);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                InterfaceC5319 interfaceC5319 = this.$upstream;
                C0412 c0412 = new C0412(ref$ObjectRef2, interfaceC5401, this.$result, 3);
                this.L$0 = null;
                this.L$1 = ref$ObjectRef2;
                this.label = 1;
                if (interfaceC5319.mo8453(c0412, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                AbstractC5185.m10210(obj);
            }
            if (ref$ObjectRef.element == 0) {
                ((C5438) this.$result).m10588(Result.m8744boximpl(Result.m8745constructorimpl(new Result.Failure(new NoSuchElementException("Flow is empty")))));
            }
            return C5176.f14739;
        } catch (Throwable th) {
            ((C5438) this.$result).m10529(th);
            throw th;
        }
    }
}
