package io.ktor.client.plugins;

import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.SetupRequestContext$install$1", f = "HttpRequestLifecycle.kt", l = {40}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class SetupRequestContext$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6550 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: io.ktor.client.plugins.SetupRequestContext$install$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements InterfaceC6557 {
        public AnonymousClass1(Object obj) {
            super(1, obj, AbstractC4193.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
        }

        @Override // p052.InterfaceC6557
        public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
            return SetupRequestContext$install$1.invokeSuspend$proceed((AbstractC4193) this.receiver, interfaceC4356);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupRequestContext$install$1(InterfaceC6550 interfaceC6550, InterfaceC4356<? super SetupRequestContext$install$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$handler = interfaceC6550;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$proceed(AbstractC4193 abstractC4193, InterfaceC4356 interfaceC4356) {
        Object objMo8576 = abstractC4193.mo8576(interfaceC4356);
        return objMo8576 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8576 : C5175.f14739;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        SetupRequestContext$install$1 setupRequestContext$install$1 = new SetupRequestContext$install$1(this.$handler, interfaceC4356);
        setupRequestContext$install$1.L$0 = abstractC4193;
        return setupRequestContext$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
            InterfaceC6550 interfaceC6550 = this.$handler;
            Object obj2 = abstractC4193.f12660;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(abstractC4193);
            this.label = 1;
            if (interfaceC6550.invoke(obj2, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
