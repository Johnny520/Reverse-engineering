package io.ktor.server.application;

import io.ktor.server.response.AbstractC4132;
import io.ktor.server.response.InterfaceC4134;
import io.ktor.util.C4209;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.application.OnCallRespondContext", f = "KtorCallContexts.kt", l = {85}, m = "transformBody")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class OnCallRespondContext$transformBody$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4061 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnCallRespondContext$transformBody$1(C4061 c4061, InterfaceC4357<? super OnCallRespondContext$transformBody$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4061;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        AbstractC4194 abstractC4194 = this.this$0.f12359;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 != 0) {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4194 abstractC41942 = (AbstractC4194) this.L$0;
            AbstractC5185.m10210(obj);
            abstractC41942.mo8571(obj);
            return C5176.f14739;
        }
        AbstractC5185.m10210(obj);
        InterfaceC4134 interfaceC4134Mo8461 = ((InterfaceC4065) abstractC4194.f12664).mo8461();
        C4209 c4209 = AbstractC4132.f12528;
        interfaceC4134Mo8461.getClass();
        this.L$0 = abstractC4194;
        this.label = 1;
        throw null;
    }
}
