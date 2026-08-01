package io.ktor.network.tls;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", l = {Opcodes.USHR_INT_LIT8, 293}, m = "handleCertificatesAndKeys")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TLSClientHandshake$handleCertificatesAndKeys$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4040 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$handleCertificatesAndKeys$1(AbstractC4040 abstractC4040, InterfaceC4356<? super TLSClientHandshake$handleCertificatesAndKeys$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = abstractC4040;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8457(this);
    }
}
