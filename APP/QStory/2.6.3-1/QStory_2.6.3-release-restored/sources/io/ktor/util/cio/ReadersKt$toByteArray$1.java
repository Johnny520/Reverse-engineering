package io.ktor.util.cio;

import io.ktor.utils.p007io.AbstractC5076;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.InterfaceC6313;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.cio.ReadersKt", m556f = "Readers.kt", m557l = {17}, m558m = "toByteArray")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ReadersKt$toByteArray$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ReadersKt$toByteArray$1(InterfaceC5189<? super ReadersKt$toByteArray$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.label = 1;
            obj = AbstractC5076.m9228(null, 0L, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return AbstractC6310.m11190((InterfaceC6313) obj);
    }
}
