package io.ktor.network.tls;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.TLSClientHandshake", m556f = "TLSClientHandshake.kt", m557l = {Opcodes.USHR_INT_LIT8, 293}, m558m = "handleCertificatesAndKeys")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class TLSClientHandshake$handleCertificatesAndKeys$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4873 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$handleCertificatesAndKeys$1(AbstractC4873 abstractC4873, InterfaceC5189<? super TLSClientHandshake$handleCertificatesAndKeys$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC4873;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m9006(this);
    }
}
