package io.ktor.network.tls;

import io.ktor.network.sockets.InterfaceC4022;
import io.ktor.utils.io.AbstractC4246;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import java.io.IOException;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.tls.TLSKt", f = "TLS.kt", l = {31}, m = "tls")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TLSKt$tls$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public TLSKt$tls$1(InterfaceC4357<? super TLSKt$tls$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC4247 interfaceC4247 = (InterfaceC4247) this.L$2;
        InterfaceC4252 interfaceC4252 = (InterfaceC4252) this.L$1;
        InterfaceC4022 interfaceC4022 = (InterfaceC4022) this.L$0;
        try {
            AbstractC5185.m10210(obj);
            return (InterfaceC4022) obj;
        } catch (Throwable th) {
            interfaceC4252.mo8645(th);
            AbstractC4246.m8692(interfaceC4247, th);
            interfaceC4022.close();
            throw th;
        }
    }
}
