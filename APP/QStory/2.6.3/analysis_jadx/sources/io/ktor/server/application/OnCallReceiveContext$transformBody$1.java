package io.ktor.server.application;

import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p059.C6857;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.application.OnCallReceiveContext", f = "KtorCallContexts.kt", l = {64}, m = "transformBody")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class OnCallReceiveContext$transformBody$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4062 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnCallReceiveContext$transformBody$1(C4062 c4062, InterfaceC4357<? super OnCallReceiveContext$transformBody$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4062;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5087 interfaceC5087M8912;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        AbstractC4194 abstractC4194 = this.this$0.f12360;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5176 c5176 = C5176.f14739;
        if (i2 != 0) {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4194 abstractC41942 = (AbstractC4194) this.L$0;
            AbstractC5185.m10210(obj);
            abstractC41942.mo8571(obj);
            return c5176;
        }
        AbstractC5185.m10210(obj);
        Object objMo8567 = abstractC4194.mo8567();
        if ((objMo8567 instanceof InterfaceC4252 ? (InterfaceC4252) objMo8567 : null) != null) {
            C6857 c6857M8470 = AbstractC4066.m8470((InterfaceC4065) abstractC4194.f12664);
            InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(InterfaceC4252.class);
            try {
                interfaceC5087M8912 = AbstractC4396.m8912(InterfaceC4252.class);
            } catch (Throwable unused) {
                interfaceC5087M8912 = null;
            }
            if (!c6857M8470.equals(new C6857(interfaceC5093Mo8917, interfaceC5087M8912))) {
                this.L$0 = abstractC4194;
                this.label = 1;
                throw null;
            }
        }
        return c5176;
    }
}
