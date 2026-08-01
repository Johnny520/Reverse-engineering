package androidx.window.embedding;

import android.app.Activity;
import androidx.core.util.InterfaceC2188;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5196;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1", f = "ActivityEmbeddingController.kt", l = {174}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroidx/window/embedding/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class ActivityEmbeddingController$embeddedActivityWindowInfo$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC2577 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityEmbeddingController$embeddedActivityWindowInfo$1(AbstractC2577 abstractC2577, Activity activity, InterfaceC4357<? super ActivityEmbeddingController$embeddedActivityWindowInfo$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$activity = activity;
    }

    private static final C5176 invokeSuspend$lambda$1(AbstractC2577 abstractC2577, InterfaceC2188 interfaceC2188) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ActivityEmbeddingController$embeddedActivityWindowInfo$1 activityEmbeddingController$embeddedActivityWindowInfo$1 = new ActivityEmbeddingController$embeddedActivityWindowInfo$1(null, this.$activity, interfaceC4357);
        activityEmbeddingController$embeddedActivityWindowInfo$1.L$0 = obj;
        return activityEmbeddingController$embeddedActivityWindowInfo$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ActivityEmbeddingController$embeddedActivityWindowInfo$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
