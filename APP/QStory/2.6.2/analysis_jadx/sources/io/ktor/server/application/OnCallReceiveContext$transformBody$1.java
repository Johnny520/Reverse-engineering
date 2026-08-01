package io.ktor.server.application;

import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p059.C6856;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.application.OnCallReceiveContext", f = "KtorCallContexts.kt", l = {64}, m = "transformBody")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class OnCallReceiveContext$transformBody$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4061 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnCallReceiveContext$transformBody$1(C4061 c4061, InterfaceC4356<? super OnCallReceiveContext$transformBody$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4061;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5086 interfaceC5086M8922;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        AbstractC4193 abstractC4193 = this.this$0.f12356;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5175 c5175 = C5175.f14739;
        if (i2 != 0) {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4193 abstractC41932 = (AbstractC4193) this.L$0;
            AbstractC5184.m10206(obj);
            abstractC41932.mo8581(obj);
            return c5175;
        }
        AbstractC5184.m10206(obj);
        Object objMo8577 = abstractC4193.mo8577();
        if ((objMo8577 instanceof InterfaceC4251 ? (InterfaceC4251) objMo8577 : null) != null) {
            C6856 c6856M8480 = AbstractC4065.m8480((InterfaceC4064) abstractC4193.f12660);
            InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(InterfaceC4251.class);
            try {
                interfaceC5086M8922 = AbstractC4395.m8922(InterfaceC4251.class);
            } catch (Throwable unused) {
                interfaceC5086M8922 = null;
            }
            if (!c6856M8480.equals(new C6856(interfaceC5092Mo8927, interfaceC5086M8922))) {
                this.L$0 = abstractC4193;
                this.label = 1;
                throw null;
            }
        }
        return c5175;
    }
}
