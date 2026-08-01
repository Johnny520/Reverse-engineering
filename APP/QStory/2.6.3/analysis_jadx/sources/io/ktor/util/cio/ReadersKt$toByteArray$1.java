package io.ktor.util.cio;

import io.ktor.utils.io.AbstractC4244;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.util.cio.ReadersKt", f = "Readers.kt", l = {17}, m = "toByteArray")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ReadersKt$toByteArray$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ReadersKt$toByteArray$1(InterfaceC4357<? super ReadersKt$toByteArray$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.label = 1;
            obj = AbstractC4244.m8669(null, 0L, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return AbstractC5478.m10631((InterfaceC5481) obj);
    }
}
