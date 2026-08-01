package io.ktor.server.application;

import io.ktor.server.response.AbstractC4964;
import io.ktor.server.response.InterfaceC4966;
import io.ktor.util.C5041;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.application.OnCallRespondContext", m556f = "KtorCallContexts.kt", m557l = {85}, m558m = "transformBody")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class OnCallRespondContext$transformBody$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4893 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnCallRespondContext$transformBody$1(C4893 c4893, InterfaceC5189<? super OnCallRespondContext$transformBody$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4893;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        AbstractC5026 abstractC5026 = this.this$0.f12704;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
            AbstractC6017.m10769(obj);
            abstractC50262.mo9130(obj);
            return C6008.f15084;
        }
        AbstractC6017.m10769(obj);
        InterfaceC4966 interfaceC4966Mo9020 = ((InterfaceC4897) abstractC5026.f13009).mo9020();
        C5041 c5041 = AbstractC4964.f12873;
        interfaceC4966Mo9020.getClass();
        this.L$0 = abstractC5026;
        this.label = 1;
        throw null;
    }
}
