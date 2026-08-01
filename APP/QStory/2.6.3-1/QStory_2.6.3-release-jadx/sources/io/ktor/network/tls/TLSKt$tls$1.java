package io.ktor.network.tls;

import io.ktor.network.sockets.InterfaceC4854;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.IOException;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.TLSKt", m556f = "TLS.kt", m557l = {31}, m558m = "tls")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class TLSKt$tls$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public TLSKt$tls$1(InterfaceC5189<? super TLSKt$tls$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC5079 interfaceC5079 = (InterfaceC5079) this.L$2;
        InterfaceC5084 interfaceC5084 = (InterfaceC5084) this.L$1;
        InterfaceC4854 interfaceC4854 = (InterfaceC4854) this.L$0;
        try {
            AbstractC6017.m10769(obj);
            return (InterfaceC4854) obj;
        } catch (Throwable th) {
            interfaceC5084.mo9204(th);
            AbstractC5078.m9251(interfaceC5079, th);
            interfaceC4854.close();
            throw th;
        }
    }
}
