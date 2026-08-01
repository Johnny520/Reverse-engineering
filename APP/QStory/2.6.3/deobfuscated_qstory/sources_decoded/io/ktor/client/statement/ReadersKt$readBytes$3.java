package io.ktor.client.statement;

import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.io.AbstractC5478;
import kotlinx.io.InterfaceC5481;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", l = {45}, m = "readBytes")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ReadersKt$readBytes$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ReadersKt$readBytes$3(InterfaceC4357<? super ReadersKt$readBytes$3> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ReadersKt$readBytes$3(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            throw null;
        }
        if (i2 == 1) {
            AbstractC5185.m10210(obj2);
            return AbstractC5478.m10631((InterfaceC5481) obj2);
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
