package io.modelcontextprotocol.kotlin.sdk.shared;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol", f = "Protocol.kt", l = {Opcodes.REM_INT_LIT16, 229, 232, 243}, m = "onRequest")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class Protocol$onRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4307 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$onRequest$1(AbstractC4307 abstractC4307, InterfaceC4357<? super Protocol$onRequest$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC4307;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4307.m8735(this.this$0, null, this);
    }
}
