package io.ktor.utils.io.jvm.nio;

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
@InterfaceC6862(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", f = "WriteSuspendSession.kt", l = {30, 32}, m = "written")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WriteSuspendSession$written$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4225 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteSuspendSession$written$1(AbstractC4225 abstractC4225, InterfaceC4357<? super WriteSuspendSession$written$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC4225;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        this.this$0.getClass();
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            throw null;
        }
        if (i2 == 1) {
            AbstractC4225 abstractC4225 = (AbstractC4225) this.L$0;
            AbstractC5185.m10210(obj2);
            abstractC4225.getClass();
            throw null;
        }
        if (i2 == 2) {
            AbstractC5185.m10210(obj2);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
