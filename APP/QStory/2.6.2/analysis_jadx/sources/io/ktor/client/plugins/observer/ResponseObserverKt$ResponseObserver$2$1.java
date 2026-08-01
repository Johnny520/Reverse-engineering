package io.ktor.client.plugins.observer;

import com.alibaba.fastjson2.C2941;
import io.ktor.client.plugins.api.AbstractC3886;
import io.ktor.client.statement.AbstractC3945;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", f = "ResponseObserver.kt", l = {63, 72}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/observer/飘花落叶言子楪世苏哲兰;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/client/plugins/observer/飘花落叶言子楪世苏哲兰;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class ResponseObserverKt$ResponseObserver$2$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6557 $filter;
    final /* synthetic */ InterfaceC6553 $responseHandler;
    final /* synthetic */ AbstractC3886 $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", f = "ResponseObserver.kt", l = {64, 68}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6553 $responseHandler;
        final /* synthetic */ AbstractC3945 $sideResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3945 abstractC3945, InterfaceC6553 interfaceC6553, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$sideResponse = abstractC3945;
            this.$responseHandler = interfaceC6553;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sideResponse, this.$responseHandler, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5175 c5175 = C5175.f14739;
            try {
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
                    InterfaceC6553 interfaceC6553 = this.$responseHandler;
                    this.L$0 = interfaceC5400;
                    this.label = 1;
                    if (interfaceC6553.invoke(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            AbstractC5184.m10206(obj);
                            Result.m8755constructorimpl(new Long(((Number) obj).longValue()));
                            return c5175;
                        } catch (Throwable th) {
                            Result.m8755constructorimpl(new Result.Failure(th));
                            return c5175;
                        }
                    }
                    AbstractC5184.m10206(obj);
                }
                Result.m8755constructorimpl(c5175);
                throw null;
            } catch (Throwable th2) {
                Result.m8755constructorimpl(new Result.Failure(th2));
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseObserverKt$ResponseObserver$2$1(InterfaceC6557 interfaceC6557, AbstractC3886 abstractC3886, InterfaceC6553 interfaceC6553, InterfaceC4356<? super ResponseObserverKt$ResponseObserver$2$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$filter = interfaceC6557;
        this.$responseHandler = interfaceC6553;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C3900 c3900, AbstractC3945 abstractC3945, InterfaceC4356<? super C5175> interfaceC4356) {
        ResponseObserverKt$ResponseObserver$2$1 responseObserverKt$ResponseObserver$2$1 = new ResponseObserverKt$ResponseObserver$2$1(this.$filter, null, this.$responseHandler, interfaceC4356);
        responseObserverKt$ResponseObserver$2$1.L$0 = c3900;
        responseObserverKt$ResponseObserver$2$1.L$1 = abstractC3945;
        return responseObserverKt$ResponseObserver$2$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.L$1 != null) {
                C2941.m6336();
                return null;
            }
            this.$filter.getClass();
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5184.m10206(obj);
                return C5175.f14739;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$3;
        if (this.L$2 != null) {
            C2941.m6336();
            return null;
        }
        if (this.L$1 != null) {
            C2941.m6336();
            return null;
        }
        C3900 c3900 = (C3900) this.L$0;
        AbstractC5184.m10206(obj);
        AbstractC5398.m10473(interfaceC5400, (InterfaceC4359) obj, null, new AnonymousClass1(null, this.$responseHandler, null), 2);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        c3900.f12097.mo8580(null, this);
        throw null;
    }
}
