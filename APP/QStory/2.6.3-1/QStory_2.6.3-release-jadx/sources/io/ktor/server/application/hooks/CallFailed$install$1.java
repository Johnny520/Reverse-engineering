package io.ktor.server.application.hooks;

import io.ktor.server.application.InterfaceC4897;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.application.hooks.CallFailed$install$1", m556f = "CommonHooks.kt", m557l = {44, 48}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CallFailed$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7380 $handler;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: io.ktor.server.application.hooks.CallFailed$install$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.server.application.hooks.CallFailed$install$1$1", m556f = "CommonHooks.kt", m557l = {45}, m558m = "invokeSuspend")
    public static final class C03641 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ AbstractC5026 $$this$intercept;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03641(AbstractC5026 abstractC5026, InterfaceC5189<? super C03641> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$intercept = abstractC5026;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C03641(this.$$this$intercept, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03641) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                AbstractC5026 abstractC5026 = this.$$this$intercept;
                this.label = 1;
                if (abstractC5026.mo9125(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallFailed$install$1(InterfaceC7380 interfaceC7380, InterfaceC5189<? super CallFailed$install$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$handler = interfaceC7380;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, C6008 c6008, InterfaceC5189<? super C6008> interfaceC5189) {
        CallFailed$install$1 callFailed$install$1 = new CallFailed$install$1(this.$handler, interfaceC5189);
        callFailed$install$1.L$0 = abstractC5026;
        return callFailed$install$1.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11066(r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC5026 abstractC5026;
        InterfaceC7380 interfaceC7380;
        InterfaceC4897 interfaceC4897;
        AbstractC5026 abstractC50262;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            abstractC5026 = (AbstractC5026) this.L$0;
            try {
                C03641 c03641 = new C03641(abstractC5026, null);
                this.L$0 = abstractC5026;
                this.label = 1;
            } catch (Throwable th2) {
                th = th2;
                interfaceC7380 = this.$handler;
                interfaceC4897 = (InterfaceC4897) abstractC5026.f13009;
                this.L$0 = abstractC5026;
                this.L$1 = th;
                this.label = 2;
                if (interfaceC7380.invoke(interfaceC4897, th, this) != coroutineSingletons) {
                    abstractC50262 = abstractC5026;
                    th = th;
                    if (!((InterfaceC4897) abstractC50262.f13009).mo9020().mo957()) {
                    }
                    return C6008.f15084;
                }
                return coroutineSingletons;
            }
        } else if (i == 1) {
            AbstractC5026 abstractC50263 = (AbstractC5026) this.L$0;
            try {
                AbstractC6017.m10769(obj);
            } catch (Throwable th3) {
                th = th3;
                abstractC5026 = abstractC50263;
                interfaceC7380 = this.$handler;
                interfaceC4897 = (InterfaceC4897) abstractC5026.f13009;
                this.L$0 = abstractC5026;
                this.L$1 = th;
                this.label = 2;
                if (interfaceC7380.invoke(interfaceC4897, th, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            th = (Throwable) this.L$1;
            abstractC50262 = (AbstractC5026) this.L$0;
            AbstractC6017.m10769(obj);
            if (!((InterfaceC4897) abstractC50262.f13009).mo9020().mo957()) {
                throw th;
            }
        }
        return C6008.f15084;
    }
}
