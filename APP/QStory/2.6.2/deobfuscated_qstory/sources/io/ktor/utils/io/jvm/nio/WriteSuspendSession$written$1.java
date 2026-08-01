package io.ktor.utils.io.jvm.nio;

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
@InterfaceC6861(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", f = "WriteSuspendSession.kt", l = {30, 32}, m = "written")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WriteSuspendSession$written$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4224 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteSuspendSession$written$1(AbstractC4224 abstractC4224, InterfaceC4356<? super WriteSuspendSession$written$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = abstractC4224;
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
            AbstractC5184.m10206(obj2);
            throw null;
        }
        if (i2 == 1) {
            AbstractC4224 abstractC4224 = (AbstractC4224) this.L$0;
            AbstractC5184.m10206(obj2);
            abstractC4224.getClass();
            throw null;
        }
        if (i2 == 2) {
            AbstractC5184.m10206(obj2);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
