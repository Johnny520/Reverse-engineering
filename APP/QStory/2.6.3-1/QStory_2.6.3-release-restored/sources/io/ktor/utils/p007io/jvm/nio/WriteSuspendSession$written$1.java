package io.ktor.utils.p007io.jvm.nio;

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
@InterfaceC7691(m555c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", m556f = "WriteSuspendSession.kt", m557l = {30, 32}, m558m = "written")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class WriteSuspendSession$written$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5057 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteSuspendSession$written$1(AbstractC5057 abstractC5057, InterfaceC5189<? super WriteSuspendSession$written$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC5057;
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
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i2 == 1) {
            AbstractC5057 abstractC5057 = (AbstractC5057) this.L$0;
            AbstractC6017.m10769(obj2);
            abstractC5057.getClass();
            throw null;
        }
        if (i2 == 2) {
            AbstractC6017.m10769(obj2);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
