package kotlinx.coroutines.flow;

import androidx.compose.animation.C1258;
import java.util.NoSuchElementException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6273;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m556f = "Share.kt", m557l = {337}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6273 $result;
    final /* synthetic */ InterfaceC6151 $upstream;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(InterfaceC6151 interfaceC6151, InterfaceC6273 interfaceC6273, InterfaceC5189<? super FlowKt__ShareKt$launchSharingDeferred$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$upstream = interfaceC6151;
        this.$result = interfaceC6273;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, interfaceC5189);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                InterfaceC6151 interfaceC6151 = this.$upstream;
                C1258 c1258 = new C1258(ref$ObjectRef2, interfaceC6233, this.$result, 3);
                this.L$0 = null;
                this.L$1 = ref$ObjectRef2;
                this.label = 1;
                if (interfaceC6151.mo9012(c1258, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                AbstractC6017.m10769(obj);
            }
            if (ref$ObjectRef.element == 0) {
                ((C6270) this.$result).m11147(Result.m9303boximpl(Result.m9304constructorimpl(new Result.Failure(new NoSuchElementException("Flow is empty")))));
            }
            return C6008.f15084;
        } catch (Throwable th) {
            ((C6270) this.$result).m11088(th);
            throw th;
        }
    }
}
