package io.modelcontextprotocol.kotlin.sdk.shared;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol", f = "Protocol.kt", l = {Opcodes.REM_INT_LIT16, 229, 232, 243}, m = "onRequest")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class Protocol$onRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4306 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$onRequest$1(AbstractC4306 abstractC4306, InterfaceC4356<? super Protocol$onRequest$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = abstractC4306;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4306.m8745(this.this$0, null, this);
    }
}
