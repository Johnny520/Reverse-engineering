package io.ktor.client.plugins.observer;

import com.alibaba.fastjson2.C3775;
import io.ktor.client.plugins.api.AbstractC4719;
import io.ktor.client.statement.AbstractC4778;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", m556f = "ResponseObserver.kt", m557l = {63, 72}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/client/plugins/observer/飘花落叶言子楪世苏哲兰;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/client/plugins/observer/飘花落叶言子楪世苏哲兰;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ResponseObserverKt$ResponseObserver$2$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7387 $filter;
    final /* synthetic */ InterfaceC7383 $responseHandler;
    final /* synthetic */ AbstractC4719 $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", m556f = "ResponseObserver.kt", m557l = {64, 68}, m558m = "invokeSuspend")
    public static final class C03621 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $responseHandler;
        final /* synthetic */ AbstractC4778 $sideResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03621(AbstractC4778 abstractC4778, InterfaceC7383 interfaceC7383, InterfaceC5189<? super C03621> interfaceC5189) {
            super(2, interfaceC5189);
            this.$sideResponse = abstractC4778;
            this.$responseHandler = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C03621 c03621 = new C03621(this.$sideResponse, this.$responseHandler, interfaceC5189);
            c03621.L$0 = obj;
            return c03621;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03621) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C6008 c6008 = C6008.f15084;
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
                    InterfaceC7383 interfaceC7383 = this.$responseHandler;
                    this.L$0 = interfaceC6233;
                    this.label = 1;
                    if (interfaceC7383.invoke(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            AbstractC6017.m10769(obj);
                            Result.m9304constructorimpl(new Long(((Number) obj).longValue()));
                            return c6008;
                        } catch (Throwable th) {
                            Result.m9304constructorimpl(new Result.Failure(th));
                            return c6008;
                        }
                    }
                    AbstractC6017.m10769(obj);
                }
                Result.m9304constructorimpl(c6008);
                throw null;
            } catch (Throwable th2) {
                Result.m9304constructorimpl(new Result.Failure(th2));
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseObserverKt$ResponseObserver$2$1(InterfaceC7387 interfaceC7387, AbstractC4719 abstractC4719, InterfaceC7383 interfaceC7383, InterfaceC5189<? super ResponseObserverKt$ResponseObserver$2$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$filter = interfaceC7387;
        this.$responseHandler = interfaceC7383;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C4733 c4733, AbstractC4778 abstractC4778, InterfaceC5189<? super C6008> interfaceC5189) {
        ResponseObserverKt$ResponseObserver$2$1 responseObserverKt$ResponseObserver$2$1 = new ResponseObserverKt$ResponseObserver$2$1(this.$filter, null, this.$responseHandler, interfaceC5189);
        responseObserverKt$ResponseObserver$2$1.L$0 = c4733;
        responseObserverKt$ResponseObserver$2$1.L$1 = abstractC4778;
        return responseObserverKt$ResponseObserver$2$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (this.L$1 != null) {
                C3775.m6954();
                return null;
            }
            this.$filter.getClass();
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$3;
        if (this.L$2 != null) {
            C3775.m6954();
            return null;
        }
        if (this.L$1 != null) {
            C3775.m6954();
            return null;
        }
        C4733 c4733 = (C4733) this.L$0;
        AbstractC6017.m10769(obj);
        AbstractC6231.m11036(interfaceC6233, (InterfaceC5192) obj, null, new C03621(null, this.$responseHandler, null), 2);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        c4733.f12447.mo9129(null, this);
        throw null;
    }
}
