package io.ktor.util.cio;

import io.ktor.utils.io.AbstractC4243;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.util.cio.ReadersKt", f = "Readers.kt", l = {17}, m = "toByteArray")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ReadersKt$toByteArray$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ReadersKt$toByteArray$1(InterfaceC4356<? super ReadersKt$toByteArray$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.label = 1;
            obj = AbstractC4243.m8679(null, 0L, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return AbstractC5477.m10627((InterfaceC5480) obj);
    }
}
