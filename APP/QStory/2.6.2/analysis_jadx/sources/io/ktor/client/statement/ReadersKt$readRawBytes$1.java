package io.ktor.client.statement;

import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.io.AbstractC5477;
import kotlinx.io.InterfaceC5480;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", l = {30}, m = "readRawBytes")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ReadersKt$readRawBytes$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ReadersKt$readRawBytes$1(InterfaceC4356<? super ReadersKt$readRawBytes$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ReadersKt$readRawBytes$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(obj2);
            throw null;
        }
        if (i2 == 1) {
            AbstractC5184.m10206(obj2);
            return AbstractC5477.m10627((InterfaceC5480) obj2);
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
