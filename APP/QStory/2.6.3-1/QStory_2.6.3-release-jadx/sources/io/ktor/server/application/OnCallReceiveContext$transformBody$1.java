package io.ktor.server.application;

import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p075.C7686;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.application.OnCallReceiveContext", m556f = "KtorCallContexts.kt", m557l = {64}, m558m = "transformBody")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class OnCallReceiveContext$transformBody$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4894 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnCallReceiveContext$transformBody$1(C4894 c4894, InterfaceC5189<? super OnCallReceiveContext$transformBody$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4894;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5919 interfaceC5919M9471;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        AbstractC5026 abstractC5026 = this.this$0.f12705;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C6008 c6008 = C6008.f15084;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
            AbstractC6017.m10769(obj);
            abstractC50262.mo9130(obj);
            return c6008;
        }
        AbstractC6017.m10769(obj);
        Object objMo9126 = abstractC5026.mo9126();
        if ((objMo9126 instanceof InterfaceC5084 ? (InterfaceC5084) objMo9126 : null) != null) {
            C7686 c7686M9029 = AbstractC4898.m9029((InterfaceC4897) abstractC5026.f13009);
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(InterfaceC5084.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(InterfaceC5084.class);
            } catch (Throwable unused) {
                interfaceC5919M9471 = null;
            }
            if (!c7686M9029.equals(new C7686(interfaceC5925Mo9476, interfaceC5919M9471))) {
                this.L$0 = abstractC5026;
                this.label = 1;
                throw null;
            }
        }
        return c6008;
    }
}
