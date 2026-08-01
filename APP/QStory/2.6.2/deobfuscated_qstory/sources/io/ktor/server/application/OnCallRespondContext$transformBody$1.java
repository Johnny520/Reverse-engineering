package io.ktor.server.application;

import io.ktor.server.response.AbstractC4131;
import io.ktor.server.response.InterfaceC4133;
import io.ktor.util.C4208;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.application.OnCallRespondContext", f = "KtorCallContexts.kt", l = {85}, m = "transformBody")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class OnCallRespondContext$transformBody$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4060 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnCallRespondContext$transformBody$1(C4060 c4060, InterfaceC4356<? super OnCallRespondContext$transformBody$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4060;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        AbstractC4193 abstractC4193 = this.this$0.f12355;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 != 0) {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4193 abstractC41932 = (AbstractC4193) this.L$0;
            AbstractC5184.m10206(obj);
            abstractC41932.mo8581(obj);
            return C5175.f14739;
        }
        AbstractC5184.m10206(obj);
        InterfaceC4133 interfaceC4133Mo8471 = ((InterfaceC4064) abstractC4193.f12660).mo8471();
        C4208 c4208 = AbstractC4131.f12524;
        interfaceC4133Mo8471.getClass();
        this.L$0 = abstractC4193;
        this.label = 1;
        throw null;
    }
}
