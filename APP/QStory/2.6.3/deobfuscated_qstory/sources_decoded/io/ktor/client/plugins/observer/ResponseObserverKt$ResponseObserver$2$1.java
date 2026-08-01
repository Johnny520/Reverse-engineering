package io.ktor.client.plugins.observer;

import com.alibaba.fastjson2.C2942;
import io.ktor.client.plugins.api.AbstractC3887;
import io.ktor.client.statement.AbstractC3946;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", f = "ResponseObserver.kt", l = {63, 72}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/observer/飘花落叶言子楪世苏哲兰;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/client/plugins/observer/飘花落叶言子楪世苏哲兰;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class ResponseObserverKt$ResponseObserver$2$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6558 $filter;
    final /* synthetic */ InterfaceC6554 $responseHandler;
    final /* synthetic */ AbstractC3887 $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", f = "ResponseObserver.kt", l = {64, 68}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6554 $responseHandler;
        final /* synthetic */ AbstractC3946 $sideResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3946 abstractC3946, InterfaceC6554 interfaceC6554, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$sideResponse = abstractC3946;
            this.$responseHandler = interfaceC6554;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sideResponse, this.$responseHandler, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5176 c5176 = C5176.f14739;
            try {
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
                    InterfaceC6554 interfaceC6554 = this.$responseHandler;
                    this.L$0 = interfaceC5401;
                    this.label = 1;
                    if (interfaceC6554.invoke(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            AbstractC5185.m10210(obj);
                            Result.m8745constructorimpl(new Long(((Number) obj).longValue()));
                            return c5176;
                        } catch (Throwable th) {
                            Result.m8745constructorimpl(new Result.Failure(th));
                            return c5176;
                        }
                    }
                    AbstractC5185.m10210(obj);
                }
                Result.m8745constructorimpl(c5176);
                throw null;
            } catch (Throwable th2) {
                Result.m8745constructorimpl(new Result.Failure(th2));
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseObserverKt$ResponseObserver$2$1(InterfaceC6558 interfaceC6558, AbstractC3887 abstractC3887, InterfaceC6554 interfaceC6554, InterfaceC4357<? super ResponseObserverKt$ResponseObserver$2$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$filter = interfaceC6558;
        this.$responseHandler = interfaceC6554;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C3901 c3901, AbstractC3946 abstractC3946, InterfaceC4357<? super C5176> interfaceC4357) {
        ResponseObserverKt$ResponseObserver$2$1 responseObserverKt$ResponseObserver$2$1 = new ResponseObserverKt$ResponseObserver$2$1(this.$filter, null, this.$responseHandler, interfaceC4357);
        responseObserverKt$ResponseObserver$2$1.L$0 = c3901;
        responseObserverKt$ResponseObserver$2$1.L$1 = abstractC3946;
        return responseObserverKt$ResponseObserver$2$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (this.L$1 != null) {
                C2942.m6394();
                return null;
            }
            this.$filter.getClass();
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5185.m10210(obj);
                return C5176.f14739;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$3;
        if (this.L$2 != null) {
            C2942.m6394();
            return null;
        }
        if (this.L$1 != null) {
            C2942.m6394();
            return null;
        }
        C3901 c3901 = (C3901) this.L$0;
        AbstractC5185.m10210(obj);
        AbstractC5399.m10477(interfaceC5401, (InterfaceC4360) obj, null, new AnonymousClass1(null, this.$responseHandler, null), 2);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        c3901.f12102.mo8570(null, this);
        throw null;
    }
}
