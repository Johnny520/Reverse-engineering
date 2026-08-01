package top.suzhelan.plugin.sdk.online.presenter;

import android.util.Log;
import java.util.Map;
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
import p402.C9904;
import top.suzhelan.plugin.sdk.online.manager.AbstractC6634;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1", m556f = "MessagePresenter.kt", m557l = {145, 151, 157}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class MessagePresenter$markAllAsRead$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $onSuccess;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6636 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$1", m556f = "MessagePresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07891 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7372 $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07891(InterfaceC7372 interfaceC7372, InterfaceC5189<? super C07891> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onSuccess = interfaceC7372;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07891(this.$onSuccess, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07891) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$2", m556f = "MessagePresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07902 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ QSResult<Map<String, Boolean>> $body;
        int label;
        final /* synthetic */ C6636 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07902(C6636 c6636, QSResult<Map<String, Boolean>> qSResult, InterfaceC5189<? super C07902> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c6636;
            this.$body = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07902(this.this$0, this.$body, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07902) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String message;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C9904 c9904 = this.this$0.f16268;
            QSResult<Map<String, Boolean>> qSResult = this.$body;
            if (qSResult == null || (message = qSResult.getMessage()) == null) {
                message = "操作失败";
            }
            c9904.m15212(message);
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$3", m556f = "MessagePresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07913 extends SuspendLambda implements InterfaceC7383 {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ Exception f337$e;
        int label;
        final /* synthetic */ C6636 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07913(C6636 c6636, Exception exc, InterfaceC5189<? super C07913> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c6636;
            this.f337$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07913(this.this$0, this.f337$e, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07913) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C9904 c9904 = this.this$0.f16268;
            String message = this.f337$e.getMessage();
            if (message == null) {
                message = "网络错误";
            }
            c9904.m15212(message);
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePresenter$markAllAsRead$1(C6636 c6636, InterfaceC7372 interfaceC7372, InterfaceC5189<? super MessagePresenter$markAllAsRead$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6636;
        this.$onSuccess = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MessagePresenter$markAllAsRead$1(this.this$0, this.$onSuccess, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MessagePresenter$markAllAsRead$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r7 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r1, r3, r7) != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            this.this$0.getClass();
            Log.e("MessagePresenter", "Error marking all messages as read", e);
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C07913 c07913 = new C07913(this.this$0, e, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        if (i == 0) {
            AbstractC6017.m10769(obj);
            QSResult qSResult = (QSResult) PluginClientKt.getApiService().markAllMessagesRead(PluginSdkConfig.getUSER_UIN()).execute().f16101;
            if (qSResult == null || qSResult.getStatus() != 200) {
                C8036 c80362 = AbstractC6227.f15375;
                C8030 c80302 = AbstractC6197.f15305;
                C07902 c07902 = new C07902(this.this$0, qSResult, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                Object objM11029 = AbstractC6231.m11029(c80302, c07902, this);
                this = objM11029;
            } else {
                C8036 c80363 = AbstractC6227.f15375;
                C8030 c80303 = AbstractC6197.f15305;
                C07891 c07891 = new C07891(this.$onSuccess, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objM110292 = AbstractC6231.m11029(c80303, c07891, this);
                this = objM110292;
                if (objM110292 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C6008.f15084;
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        AbstractC6017.m10769(obj);
        this = this;
        return C6008.f15084;
    }
}
