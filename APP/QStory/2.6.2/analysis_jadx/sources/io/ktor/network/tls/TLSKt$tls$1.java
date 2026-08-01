package io.ktor.network.tls;

import io.ktor.network.sockets.InterfaceC4021;
import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import java.io.IOException;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.tls.TLSKt", f = "TLS.kt", l = {31}, m = "tls")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TLSKt$tls$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public TLSKt$tls$1(InterfaceC4356<? super TLSKt$tls$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC4246 interfaceC4246 = (InterfaceC4246) this.L$2;
        InterfaceC4251 interfaceC4251 = (InterfaceC4251) this.L$1;
        InterfaceC4021 interfaceC4021 = (InterfaceC4021) this.L$0;
        try {
            AbstractC5184.m10206(obj);
            return (InterfaceC4021) obj;
        } catch (Throwable th) {
            interfaceC4251.mo8655(th);
            AbstractC4245.m8702(interfaceC4246, th);
            interfaceC4021.close();
            throw th;
        }
    }
}
