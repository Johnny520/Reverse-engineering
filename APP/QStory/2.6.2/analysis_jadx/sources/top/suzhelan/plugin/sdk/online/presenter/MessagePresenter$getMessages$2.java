package top.suzhelan.plugin.sdk.online.presenter;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p388.C9102;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2", f = "MessagePresenter.kt", l = {84, 88, 94}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MessagePresenter$getMessages$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $onError;
    final /* synthetic */ InterfaceC6557 $onSuccess;
    final /* synthetic */ int $page;
    final /* synthetic */ int $pageSize;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C5805 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$1", f = "MessagePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ QSResult<C9102> $body;
        final /* synthetic */ InterfaceC6557 $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6557 interfaceC6557, QSResult<C9102> qSResult, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onSuccess = interfaceC6557;
            this.$body = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$onSuccess, this.$body, interfaceC4356);
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
            this.$onSuccess.invoke(this.$body.getData());
            return C5175.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$2", f = "MessagePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ QSResult<C9102> $body;
        final /* synthetic */ InterfaceC6557 $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC6557 interfaceC6557, QSResult<C9102> qSResult, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onError = interfaceC6557;
            this.$body = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.$onError, this.$body, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String message;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            InterfaceC6557 interfaceC6557 = this.$onError;
            QSResult<C9102> qSResult = this.$body;
            if (qSResult == null || (message = qSResult.getMessage()) == null) {
                message = "获取消息失败";
            }
            interfaceC6557.invoke(message);
            return C5175.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$3", f = "MessagePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ Exception $e;
        final /* synthetic */ InterfaceC6557 $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterfaceC6557 interfaceC6557, Exception exc, InterfaceC4356<? super AnonymousClass3> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onError = interfaceC6557;
            this.$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass3(this.$onError, this.$e, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            InterfaceC6557 interfaceC6557 = this.$onError;
            String message = this.$e.getMessage();
            if (message == null) {
                message = "网络错误";
            }
            interfaceC6557.invoke(message);
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagePresenter$getMessages$2(int i, int i2, C5805 c5805, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, InterfaceC4356<? super MessagePresenter$getMessages$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$page = i;
        this.$pageSize = i2;
        this.this$0 = c5805;
        this.$onSuccess = interfaceC6557;
        this.$onError = interfaceC65572;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new MessagePresenter$getMessages$2(this.$page, this.$pageSize, this.this$0, this.$onSuccess, this.$onError, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MessagePresenter$getMessages$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10466(r1, r3, r8) != r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r8 = r8.L$0
            java.lang.Exception r8 = (java.lang.Exception) r8
            kotlin.AbstractC5184.m10206(r9)
            goto Lad
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r5
        L1f:
            java.lang.Object r1 = r8.L$1
            top.suzhelan.plugin.sdk.online.net.QSResult r1 = (top.suzhelan.plugin.sdk.online.net.QSResult) r1
            java.lang.Object r1 = r8.L$0
            retrofit2.飘花落叶言子世兰楪哲苏 r1 = (retrofit2.C5754) r1
            kotlin.AbstractC5184.m10206(r9)     // Catch: java.lang.Exception -> L2c
            goto Lad
        L2c:
            r9 = move-exception
            goto L89
        L2e:
            kotlin.AbstractC5184.m10206(r9)
            top.suzhelan.plugin.sdk.online.net.ApiService r9 = top.suzhelan.plugin.sdk.online.net.PluginClientKt.getApiService()     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = top.suzhelan.plugin.sdk.online.net.PluginSdkConfig.getUSER_UIN()     // Catch: java.lang.Exception -> L2c
            int r6 = r8.$page     // Catch: java.lang.Exception -> L2c
            int r7 = r8.$pageSize     // Catch: java.lang.Exception -> L2c
            retrofit2.飘花落叶言子楪世兰苏哲 r9 = r9.getMessages(r1, r6, r7)     // Catch: java.lang.Exception -> L2c
            retrofit2.飘花落叶言子世兰楪哲苏 r9 = r9.execute()     // Catch: java.lang.Exception -> L2c
            java.lang.Object r9 = r9.f15756     // Catch: java.lang.Exception -> L2c
            top.suzhelan.plugin.sdk.online.net.QSResult r9 = (top.suzhelan.plugin.sdk.online.net.QSResult) r9     // Catch: java.lang.Exception -> L2c
            if (r9 == 0) goto L71
            int r1 = r9.getStatus()     // Catch: java.lang.Exception -> L2c
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 != r6) goto L71
            java.lang.Object r1 = r9.getData()     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L71
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5394.f15030     // Catch: java.lang.Exception -> L2c
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5364.f14960     // Catch: java.lang.Exception -> L2c
            top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$1 r3 = new top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$1     // Catch: java.lang.Exception -> L2c
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r6 = r8.$onSuccess     // Catch: java.lang.Exception -> L2c
            r3.<init>(r6, r9, r5)     // Catch: java.lang.Exception -> L2c
            r8.L$0 = r5     // Catch: java.lang.Exception -> L2c
            r8.L$1 = r5     // Catch: java.lang.Exception -> L2c
            r8.label = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = kotlinx.coroutines.AbstractC5398.m10466(r1, r3, r8)     // Catch: java.lang.Exception -> L2c
            if (r8 != r0) goto Lad
            goto Lac
        L71:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5394.f15030     // Catch: java.lang.Exception -> L2c
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5364.f14960     // Catch: java.lang.Exception -> L2c
            top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$2 r4 = new top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$2     // Catch: java.lang.Exception -> L2c
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r6 = r8.$onError     // Catch: java.lang.Exception -> L2c
            r4.<init>(r6, r9, r5)     // Catch: java.lang.Exception -> L2c
            r8.L$0 = r5     // Catch: java.lang.Exception -> L2c
            r8.L$1 = r5     // Catch: java.lang.Exception -> L2c
            r8.label = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = kotlinx.coroutines.AbstractC5398.m10466(r1, r4, r8)     // Catch: java.lang.Exception -> L2c
            if (r8 != r0) goto Lad
            goto Lac
        L89:
            top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲苏兰 r1 = r8.this$0
            r1.getClass()
            java.lang.String r1 = "MessagePresenter"
            java.lang.String r3 = "Error getting messages"
            android.util.Log.e(r1, r3, r9)
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r1 = kotlinx.coroutines.AbstractC5394.f15030
            飘花落叶言世苏哲子楪兰.飘花落叶言子楪世哲兰苏 r1 = kotlinx.coroutines.internal.AbstractC5364.f14960
            top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$3 r3 = new top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2$3
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r4 = r8.$onError
            r3.<init>(r4, r9, r5)
            r8.L$0 = r5
            r8.L$1 = r5
            r8.label = r2
            java.lang.Object r8 = kotlinx.coroutines.AbstractC5398.m10466(r1, r3, r8)
            if (r8 != r0) goto Lad
        Lac:
            return r0
        Lad:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.plugin.sdk.online.presenter.MessagePresenter$getMessages$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
