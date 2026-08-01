package top.suzhelan.plugin.sdk.online.presenter;

import java.util.Map;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p386.C9075;
import top.suzhelan.plugin.sdk.online.manager.AbstractC5804;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1", f = "MessagePresenter.kt", l = {145, 151, 157}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MessagePresenter$markAllAsRead$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6543 $onSuccess;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C5806 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$1", f = "MessagePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6543 $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6543 interfaceC6543, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$onSuccess = interfaceC6543;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$onSuccess, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            this.$onSuccess.invoke();
            AbstractC5804.m11214();
            return C5176.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$2", f = "MessagePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ QSResult<Map<String, Boolean>> $body;
        int label;
        final /* synthetic */ C5806 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C5806 c5806, QSResult<Map<String, Boolean>> qSResult, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.this$0 = c5806;
            this.$body = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(this.this$0, this.$body, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String message;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            C9075 c9075 = this.this$0.f15923;
            QSResult<Map<String, Boolean>> qSResult = this.$body;
            if (qSResult == null || (message = qSResult.getMessage()) == null) {
                message = "操作失败";
            }
            c9075.m14653(message);
            return C5176.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$3", f = "MessagePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ Exception $e;
        int label;
        final /* synthetic */ C5806 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C5806 c5806, Exception exc, InterfaceC4357<? super AnonymousClass3> interfaceC4357) {
            super(2, interfaceC4357);
            this.this$0 = c5806;
            this.$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass3(this.this$0, this.$e, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            C9075 c9075 = this.this$0.f15923;
            String message = this.$e.getMessage();
            if (message == null) {
                message = "网络错误";
            }
            c9075.m14653(message);
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePresenter$markAllAsRead$1(C5806 c5806, InterfaceC6543 interfaceC6543, InterfaceC4357<? super MessagePresenter$markAllAsRead$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c5806;
        this.$onSuccess = interfaceC6543;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new MessagePresenter$markAllAsRead$1(this.this$0, this.$onSuccess, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MessagePresenter$markAllAsRead$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r7 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (kotlinx.coroutines.AbstractC5399.m10470(r1, r3, r7) != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r7 = r7.L$0
            java.lang.Exception r7 = (java.lang.Exception) r7
            kotlin.AbstractC5185.m10210(r8)
            goto La3
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r5
        L1f:
            java.lang.Object r1 = r7.L$1
            top.suzhelan.plugin.sdk.online.net.QSResult r1 = (top.suzhelan.plugin.sdk.online.net.QSResult) r1
            java.lang.Object r1 = r7.L$0
            retrofit2.飘花落叶言子世兰楪哲苏 r1 = (retrofit2.C5755) r1
            kotlin.AbstractC5185.m10210(r8)     // Catch: java.lang.Exception -> L2c
            goto La3
        L2c:
            r8 = move-exception
            goto L7f
        L2e:
            kotlin.AbstractC5185.m10210(r8)
            top.suzhelan.plugin.sdk.online.net.ApiService r8 = top.suzhelan.plugin.sdk.online.net.PluginClientKt.getApiService()     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = top.suzhelan.plugin.sdk.online.net.PluginSdkConfig.getUSER_UIN()     // Catch: java.lang.Exception -> L2c
            retrofit2.飘花落叶言子楪世兰苏哲 r8 = r8.markAllMessagesRead(r1)     // Catch: java.lang.Exception -> L2c
            retrofit2.飘花落叶言子世兰楪哲苏 r8 = r8.execute()     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = r8.f15756     // Catch: java.lang.Exception -> L2c
            top.suzhelan.plugin.sdk.online.net.QSResult r8 = (top.suzhelan.plugin.sdk.online.net.QSResult) r8     // Catch: java.lang.Exception -> L2c
            if (r8 == 0) goto L67
            int r1 = r8.getStatus()     // Catch: java.lang.Exception -> L2c
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 != r6) goto L67
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r8 = kotlinx.coroutines.AbstractC5395.f15030     // Catch: java.lang.Exception -> L2c
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r8 = kotlinx.coroutines.internal.AbstractC5365.f14960     // Catch: java.lang.Exception -> L2c
            top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$1 r1 = new top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$1     // Catch: java.lang.Exception -> L2c
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r3 = r7.$onSuccess     // Catch: java.lang.Exception -> L2c
            r1.<init>(r3, r5)     // Catch: java.lang.Exception -> L2c
            r7.L$0 = r5     // Catch: java.lang.Exception -> L2c
            r7.L$1 = r5     // Catch: java.lang.Exception -> L2c
            r7.label = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = kotlinx.coroutines.AbstractC5399.m10470(r8, r1, r7)     // Catch: java.lang.Exception -> L2c
            if (r7 != r0) goto La3
            goto La2
        L67:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5395.f15030     // Catch: java.lang.Exception -> L2c
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5365.f14960     // Catch: java.lang.Exception -> L2c
            top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$2 r4 = new top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$2     // Catch: java.lang.Exception -> L2c
            top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲苏兰 r6 = r7.this$0     // Catch: java.lang.Exception -> L2c
            r4.<init>(r6, r8, r5)     // Catch: java.lang.Exception -> L2c
            r7.L$0 = r5     // Catch: java.lang.Exception -> L2c
            r7.L$1 = r5     // Catch: java.lang.Exception -> L2c
            r7.label = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = kotlinx.coroutines.AbstractC5399.m10470(r1, r4, r7)     // Catch: java.lang.Exception -> L2c
            if (r7 != r0) goto La3
            goto La2
        L7f:
            top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲苏兰 r1 = r7.this$0
            r1.getClass()
            java.lang.String r1 = "MessagePresenter"
            java.lang.String r3 = "Error marking all messages as read"
            android.util.Log.e(r1, r3, r8)
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5395.f15030
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5365.f14960
            top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$3 r3 = new top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1$3
            top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲苏兰 r4 = r7.this$0
            r3.<init>(r4, r8, r5)
            r7.L$0 = r5
            r7.L$1 = r5
            r7.label = r2
            java.lang.Object r7 = kotlinx.coroutines.AbstractC5399.m10470(r1, r3, r7)
            if (r7 != r0) goto La3
        La2:
            return r0
        La3:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$markAllAsRead$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
