package io.ktor.network.tls;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.TLSClientHandshake", m556f = "TLSClientHandshake.kt", m557l = {Opcodes.MUL_INT_LIT16}, m558m = "receiveServerHello")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class TLSClientHandshake$receiveServerHello$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4873 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$receiveServerHello$1(AbstractC4873 abstractC4873, InterfaceC5189<? super TLSClientHandshake$receiveServerHello$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC4873;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m9008(this);
    }
}
