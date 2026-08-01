package io.ktor.network.tls;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", l = {Opcodes.USHR_INT_LIT8, 293}, m = "handleCertificatesAndKeys")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TLSClientHandshake$handleCertificatesAndKeys$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4041 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$handleCertificatesAndKeys$1(AbstractC4041 abstractC4041, InterfaceC4357<? super TLSClientHandshake$handleCertificatesAndKeys$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC4041;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8447(this);
    }
}
