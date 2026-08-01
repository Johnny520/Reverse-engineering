package io.ktor.server.engine;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.BaseApplicationResponse", f = "BaseApplicationResponse.kt", l = {173, 177}, m = "respondWriteChannelContent$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BaseApplicationResponse$respondWriteChannelContent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4108 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$respondWriteChannelContent$1(AbstractC4108 abstractC4108, InterfaceC4357<? super BaseApplicationResponse$respondWriteChannelContent$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC4108;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4108.m8510(this.this$0, null, this);
    }
}
