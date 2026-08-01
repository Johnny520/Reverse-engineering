package io.ktor.client.plugins.api;

import io.ktor.client.call.C3867;
import io.ktor.client.statement.C3944;
import io.ktor.http.content.C3991;
import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lin.xposed.hook.javaplugin.C5553;
import p052.InterfaceC6544;
import p052.InterfaceC6550;
import p059.C6856;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", l = {104, 111}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class TransformResponseBodyHook$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6544 $handler;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformResponseBodyHook$install$1(InterfaceC6544 interfaceC6544, InterfaceC4356<? super TransformResponseBodyHook$install$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$handler = interfaceC6544;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, C3944 c3944, InterfaceC4356<? super C5175> interfaceC4356) {
        TransformResponseBodyHook$install$1 transformResponseBodyHook$install$1 = new TransformResponseBodyHook$install$1(this.$handler, interfaceC4356);
        transformResponseBodyHook$install$1.L$0 = abstractC4193;
        return transformResponseBodyHook$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
            C3944 c3944 = (C3944) abstractC4193.mo8577();
            C6856 c6856 = c3944.f12154;
            if (c3944.f12153 instanceof InterfaceC4251) {
                ((C3867) abstractC4193.f12660).m8263();
                throw null;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    AbstractC5184.m10206(obj);
                    return c5175;
                }
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C6856 c68562 = (C6856) this.L$1;
            AbstractC4193 abstractC41932 = (AbstractC4193) this.L$0;
            AbstractC5184.m10206(obj);
            if (obj != null) {
                if (!(obj instanceof C3991) && !c68562.f18303.isInstance(obj)) {
                    C5553.m10830("transformResponseBody returned ", obj, " but expected value of type ", c68562);
                    return null;
                }
                C3944 c39442 = new C3944(c68562, obj);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (abstractC41932.mo8580(c39442, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return c5175;
    }
}
