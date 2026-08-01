package top.suzhelan.plugin.sdk.online.presenter;

import android.util.Log;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.internal.AbstractC5364;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p093.C7200;
import p095.C7206;
import top.suzhelan.plugin.sdk.online.manager.AbstractC5803;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAsRead$1", f = "MessagePresenter.kt", l = {117}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MessagePresenter$markAsRead$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ int $messageId;
    final /* synthetic */ InterfaceC6542 $onSuccess;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C5805 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAsRead$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAsRead$1$1", f = "MessagePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6542 $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6542 interfaceC6542, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onSuccess = interfaceC6542;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$onSuccess, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.$onSuccess.invoke();
            AbstractC5803.m11157();
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePresenter$markAsRead$1(int i, C5805 c5805, InterfaceC6542 interfaceC6542, InterfaceC4356<? super MessagePresenter$markAsRead$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$messageId = i;
        this.this$0 = c5805;
        this.$onSuccess = interfaceC6542;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new MessagePresenter$markAsRead$1(this.$messageId, this.this$0, this.$onSuccess, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MessagePresenter$markAsRead$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                QSResult qSResult = (QSResult) PluginClientKt.getApiService().markMessageRead(this.$messageId, PluginSdkConfig.getUSER_UIN()).execute().f15756;
                if (qSResult == null || qSResult.getStatus() != 200) {
                    this.this$0.getClass();
                    new Integer(Log.w("MessagePresenter", "Failed to mark message as read: " + (qSResult != null ? qSResult.getMessage() : null)));
                } else {
                    C7206 c7206 = AbstractC5394.f15030;
                    C7200 c7200 = AbstractC5364.f14960;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onSuccess, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (AbstractC5398.m10466(c7200, anonymousClass1, this) == coroutineSingletons) {
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
        } catch (Exception e) {
            this.this$0.getClass();
            new Integer(Log.e("MessagePresenter", "Error marking message as read", e));
        }
        return C5175.f14739;
    }
}
