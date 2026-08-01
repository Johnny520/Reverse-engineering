package io.ktor.client.plugins;

import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.SetupRequestContext$install$1", f = "HttpRequestLifecycle.kt", l = {40}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class SetupRequestContext$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6551 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: io.ktor.client.plugins.SetupRequestContext$install$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements InterfaceC6558 {
        public AnonymousClass1(Object obj) {
            super(1, obj, AbstractC4194.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
        }

        @Override // p052.InterfaceC6558
        public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
            return SetupRequestContext$install$1.invokeSuspend$proceed((AbstractC4194) this.receiver, interfaceC4357);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupRequestContext$install$1(InterfaceC6551 interfaceC6551, InterfaceC4357<? super SetupRequestContext$install$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$handler = interfaceC6551;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$proceed(AbstractC4194 abstractC4194, InterfaceC4357 interfaceC4357) {
        Object objMo8566 = abstractC4194.mo8566(interfaceC4357);
        return objMo8566 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8566 : C5176.f14739;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        SetupRequestContext$install$1 setupRequestContext$install$1 = new SetupRequestContext$install$1(this.$handler, interfaceC4357);
        setupRequestContext$install$1.L$0 = abstractC4194;
        return setupRequestContext$install$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
            InterfaceC6551 interfaceC6551 = this.$handler;
            Object obj2 = abstractC4194.f12664;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(abstractC4194);
            this.label = 1;
            if (interfaceC6551.invoke(obj2, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
