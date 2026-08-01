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
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import p401.C9898;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2", m556f = "MessagePresenter.kt", m557l = {84, 88, 94}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class MessagePresenter$getMessages$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $onError;
    final /* synthetic */ InterfaceC7387 $onSuccess;
    final /* synthetic */ int $page;
    final /* synthetic */ int $pageSize;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6636 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$1", m556f = "MessagePresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07861 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ QSResult<C9898> $body;
        final /* synthetic */ InterfaceC7387 $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07861(InterfaceC7387 interfaceC7387, QSResult<C9898> qSResult, InterfaceC5189<? super C07861> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onSuccess = interfaceC7387;
            this.$body = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07861(this.$onSuccess, this.$body, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07861) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onSuccess.invoke(this.$body.getData());
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$2", m556f = "MessagePresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07872 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ QSResult<C9898> $body;
        final /* synthetic */ InterfaceC7387 $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07872(InterfaceC7387 interfaceC7387, QSResult<C9898> qSResult, InterfaceC5189<? super C07872> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onError = interfaceC7387;
            this.$body = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07872(this.$onError, this.$body, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07872) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
            InterfaceC7387 interfaceC7387 = this.$onError;
            QSResult<C9898> qSResult = this.$body;
            if (qSResult == null || (message = qSResult.getMessage()) == null) {
                message = "获取消息失败";
            }
            interfaceC7387.invoke(message);
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$3", m556f = "MessagePresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07883 extends SuspendLambda implements InterfaceC7383 {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ Exception f336$e;
        final /* synthetic */ InterfaceC7387 $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07883(InterfaceC7387 interfaceC7387, Exception exc, InterfaceC5189<? super C07883> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onError = interfaceC7387;
            this.f336$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07883(this.$onError, this.f336$e, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07883) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            InterfaceC7387 interfaceC7387 = this.$onError;
            String message = this.f336$e.getMessage();
            if (message == null) {
                message = "网络错误";
            }
            interfaceC7387.invoke(message);
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePresenter$getMessages$2(int i, int i2, C6636 c6636, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC5189<? super MessagePresenter$getMessages$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$page = i;
        this.$pageSize = i2;
        this.this$0 = c6636;
        this.$onSuccess = interfaceC7387;
        this.$onError = interfaceC73872;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MessagePresenter$getMessages$2(this.$page, this.$pageSize, this.this$0, this.$onSuccess, this.$onError, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MessagePresenter$getMessages$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r1, r3, r8) != r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
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
            Log.e("MessagePresenter", "Error getting messages", e);
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C07883 c07883 = new C07883(this.$onError, e, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        if (i == 0) {
            AbstractC6017.m10769(obj);
            QSResult qSResult = (QSResult) PluginClientKt.getApiService().getMessages(PluginSdkConfig.getUSER_UIN(), this.$page, this.$pageSize).execute().f16101;
            if (qSResult == null || qSResult.getStatus() != 200 || qSResult.getData() == null) {
                C8036 c80362 = AbstractC6227.f15375;
                C8030 c80302 = AbstractC6197.f15305;
                C07872 c07872 = new C07872(this.$onError, qSResult, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                Object objM11029 = AbstractC6231.m11029(c80302, c07872, this);
                this = objM11029;
            } else {
                C8036 c80363 = AbstractC6227.f15375;
                C8030 c80303 = AbstractC6197.f15305;
                C07861 c07861 = new C07861(this.$onSuccess, qSResult, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objM110292 = AbstractC6231.m11029(c80303, c07861, this);
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
