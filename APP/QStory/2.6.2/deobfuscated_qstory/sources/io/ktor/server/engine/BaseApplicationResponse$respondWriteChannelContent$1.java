package io.ktor.server.engine;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.BaseApplicationResponse", f = "BaseApplicationResponse.kt", l = {173, 177}, m = "respondWriteChannelContent$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BaseApplicationResponse$respondWriteChannelContent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4107 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$respondWriteChannelContent$1(AbstractC4107 abstractC4107, InterfaceC4356<? super BaseApplicationResponse$respondWriteChannelContent$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = abstractC4107;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4107.m8521(this.this$0, null, this);
    }
}
