package top.suzhelan.plugin.sdk.online.presenter;

import android.util.Log;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import top.suzhelan.plugin.sdk.online.manager.AbstractC6634;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAsRead$1", m556f = "MessagePresenter.kt", m557l = {117}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class MessagePresenter$markAsRead$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ int $messageId;
    final /* synthetic */ InterfaceC7372 $onSuccess;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6636 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAsRead$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAsRead$1$1", m556f = "MessagePresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07921 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7372 $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07921(InterfaceC7372 interfaceC7372, InterfaceC5189<? super C07921> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onSuccess = interfaceC7372;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07921(this.$onSuccess, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07921) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onSuccess.invoke();
            AbstractC6634.m11773();
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePresenter$markAsRead$1(int i, C6636 c6636, InterfaceC7372 interfaceC7372, InterfaceC5189<? super MessagePresenter$markAsRead$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$messageId = i;
        this.this$0 = c6636;
        this.$onSuccess = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MessagePresenter$markAsRead$1(this.$messageId, this.this$0, this.$onSuccess, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MessagePresenter$markAsRead$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                QSResult qSResult = (QSResult) PluginClientKt.getApiService().markMessageRead(this.$messageId, PluginSdkConfig.getUSER_UIN()).execute().f16101;
                if (qSResult == null || qSResult.getStatus() != 200) {
                    this.this$0.getClass();
                    new Integer(Log.w("MessagePresenter", "Failed to mark message as read: " + (qSResult != null ? qSResult.getMessage() : null)));
                } else {
                    C8036 c8036 = AbstractC6227.f15375;
                    C8030 c8030 = AbstractC6197.f15305;
                    C07921 c07921 = new C07921(this.$onSuccess, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (AbstractC6231.m11029(c8030, c07921, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
        } catch (Exception e) {
            this.this$0.getClass();
            new Integer(Log.e("MessagePresenter", "Error marking message as read", e));
        }
        return C6008.f15084;
    }
}
